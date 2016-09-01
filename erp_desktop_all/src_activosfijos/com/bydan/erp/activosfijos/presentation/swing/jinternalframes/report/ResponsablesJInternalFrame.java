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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ResponsablesConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ResponsablesJInternalFrame extends ResponsablesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResponsables;
	
	protected JMenuBar jmenuBarResponsables;
	
	protected JMenu jmenuResponsables;
	protected JMenu jmenuDatosResponsables;
	protected JMenu jmenuArchivoResponsables;
	protected JMenu jmenuAccionesResponsables;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsables;	
	protected GridBagConstraints gridBagConstraintsResponsables;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResponsablesDetalleFormJInternalFrame jInternalFrameDetalleFormResponsables;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResponsables;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResponsables;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ResponsablesSessionBean responsablesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Responsables> responsabless;		
	public List<Responsables> responsablessEliminados;	
	public List<Responsables> responsablessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResponsables;		
	protected JButton jButtonAbrirOrderByResponsables;
	
	
	//protected JPanel jPanelOrderByResponsables;
	//public JScrollPane jScrollPanelOrderByResponsables;	
	//protected JButton jButtonCerrarOrderByResponsables;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResponsablesLogic responsablesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResponsables;
	public JScrollPane jScrollPanelDatosEdicionResponsables;
	public JScrollPane jScrollPanelDatosGeneralResponsables;
    
	
	
	//public JScrollPane jScrollPanelDatosResponsablesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResponsables;
	//public JScrollPane jScrollPanelImportacionResponsables;
	
	
	
	protected JPanel jPanelAccionesResponsables;
	
    protected JPanel jPanelPaginacionResponsables;
    protected JPanel jPanelParametrosReportesResponsables;
	protected JPanel jPanelParametrosReportesAccionesResponsables;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Responsables;
	protected JPanel jPanelParametrosAuxiliar2Responsables;
	protected JPanel jPanelParametrosAuxiliar3Responsables;
	protected JPanel jPanelParametrosAuxiliar4Responsables;
	//protected JPanel jPanelParametrosAuxiliar5Responsables;
	
	
	
	//protected JPanel jPanelReporteDinamicoResponsables;
	//protected JPanel jPanelImportacionResponsables;
	
	
	public JTable jTableDatosResponsables;
	
	
	
	//public JTable jTableDatosResponsablesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResponsables;
	protected JButton jButtonDuplicarResponsables;
	protected JButton jButtonCopiarResponsables;
	protected JButton jButtonVerFormResponsables;
	protected JButton jButtonNuevoRelacionesResponsables;
	protected JButton jButtonModificarResponsables;
	
    protected JButton jButtonGuardarCambiosTablaResponsables;
	protected JButton jButtonCerrarResponsables;
	
	
	protected JButton jButtonRecargarInformacionResponsables;
	protected JButton jButtonProcesarInformacionResponsables;
	
	
	protected JButton jButtonAnterioresResponsables;
	protected JButton jButtonSiguientesResponsables;
	protected JButton jButtonNuevoGuardarCambiosResponsables;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResponsables;
	//protected JButton jButtonCerrarReporteDinamicoResponsables;
	//protected JButton jButtonGenerarExcelReporteDinamicoResponsables;	
	
	
	
	//protected JButton jButtonAbrirImportacionResponsables;
	//protected JButton jButtonGenerarImportacionResponsables;
	//protected JButton jButtonCerrarImportacionResponsables;
	//protected JFileChooser jFileChooserImportacionResponsables;
	//protected File fileImportacionResponsables;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsables;
	protected JButton jButtonDuplicarToolBarResponsables;
	protected JButton jButtonNuevoRelacionesToolBarResponsables;
	
	
	public JButton jButtonGuardarCambiosToolBarResponsables;
	protected JButton jButtonCopiarToolBarResponsables;
	protected JButton jButtonVerFormToolBarResponsables;
	public JButton jButtonGuardarCambiosTablaToolBarResponsables;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsables;
	protected JButton jButtonCerrarToolBarResponsables;
	
	protected JButton jButtonRecargarInformacionToolBarResponsables;
	protected JButton jButtonProcesarInformacionToolBarResponsables;
	protected JButton jButtonAnterioresToolBarResponsables;
	protected JButton jButtonSiguientesToolBarResponsables;
	protected JButton jButtonNuevoGuardarCambiosToolBarResponsables;
	protected JButton jButtonAbrirOrderByToolBarResponsables;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsables;
	protected JMenuItem jMenuItemDuplicarResponsables;
	protected JMenuItem jMenuItemNuevoRelacionesResponsables;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResponsables;
	protected JMenuItem jMenuItemCopiarResponsables;
	protected JMenuItem jMenuItemVerFormResponsables;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsables;
	protected JMenuItem jMenuItemCerrarResponsables;
	protected JMenuItem jMenuItemDetalleCerrarResponsables;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResponsables;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsables;
	
	protected JMenuItem jMenuItemRecargarInformacionResponsables;
	protected JMenuItem jMenuItemProcesarInformacionResponsables;
	protected JMenuItem jMenuItemAnterioresResponsables;
	protected JMenuItem jMenuItemSiguientesResponsables;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsables;
	protected JMenuItem jMenuItemAbrirOrderByResponsables;
	protected JMenuItem jMenuItemMostrarOcultarResponsables;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsables;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResponsables;
	protected JCheckBox jCheckBoxSeleccionadosResponsables;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResponsables;
	protected JCheckBox jCheckBoxConGraficoReporteResponsables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResponsables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResponsables;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResponsables;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResponsables;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResponsables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResponsables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsables;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResponsables;
	protected JTextField jTextFieldValorCampoGeneralResponsables;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResponsables;
	//public JList<Reporte> jListColumnasSelectReporteResponsables;
	//public JScrollPane jScrollColumnasSelectReporteResponsables;
	
	//public JLabel jLabelRelacionesSelectReporteResponsables;
	//public JList<Reporte> jListRelacionesSelectReporteResponsables;
	//public JScrollPane jScrollRelacionesSelectReporteResponsables;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResponsables;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResponsables;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResponsables;
	//public JLabel jLabelTiposArchivoReporteDinamicoResponsables;
	
		
	//public JLabel jLabelArchivoImportacionResponsables;	
	//public JLabel jLabelPathArchivoImportacionResponsables;
	//protected JTextField jTextFieldPathArchivoImportacionResponsables;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResponsables;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResponsables;
	
	//public JLabel jLabelColumnaCategoriaValorResponsables;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResponsables;
	
	//public JLabel jLabelColumnasValoresGraficoResponsables;
	//public JList<Reporte> jListColumnasValoresGraficoResponsables;
	//public JScrollPane jScrollColumnasValoresGraficoResponsables;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResponsables;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResponsables;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResponsables;
	public JPanel jPanelBusquedaResponsablesResponsables;
	public JButton jButtonBusquedaResponsablesResponsables;
	
	public JPanel jPanelIdIdBusquedaResponsablesResponsables;
	public JLabel jLabelidBusquedaResponsablesResponsables;
	public JTextFieldMe jLabelidResponsablesBusquedaResponsables;
	public JButton jButtonidBusquedaResponsablesResponsablesBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ResponsablesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsablesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResponsables)	{
		this.jButtonRecargarInformacionResponsables = jButtonRecargarInformacionResponsables;
	}
	
	public JButton getjButtonProcesarInformacionResponsables() {
		return this.jButtonProcesarInformacionResponsables;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsables)	{
		this.jButtonProcesarInformacionResponsables = jButtonProcesarInformacionResponsables;
	}
	
	
	public JButton getjButtonRecargarInformacionResponsables() {
		return this.jButtonRecargarInformacionResponsables;
	}
	
	
	public List<Responsables> getresponsabless() {
		return this.responsabless;
	}

	public void setresponsabless(List<Responsables> responsabless) {
		this.responsabless = responsabless;
	}
	
	public List<Responsables> getresponsablessAux() {
		return this.responsablessAux;
	}

	public void setresponsablessAux(List<Responsables> responsablessAux) {
		this.responsablessAux = responsablessAux;
	}
	
	public List<Responsables> getresponsablessEliminados() {
		return this.responsablessEliminados;
	}

	public void setResponsablessEliminados(List<Responsables> responsablessEliminados) {
		this.responsablessEliminados = responsablessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResponsables() {
		return jComboBoxTiposSeleccionarResponsables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResponsables(
			JComboBox jComboBoxTiposSeleccionarResponsables) {
		this.jComboBoxTiposSeleccionarResponsables = jComboBoxTiposSeleccionarResponsables;
	}
	
	public void setBorderResaltarTiposSeleccionarResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResponsables .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResponsables() {
		return jTextFieldValorCampoGeneralResponsables;
	}

	public void setjTextFieldValorCampoGeneralResponsables(
			JTextField jTextFieldValorCampoGeneralResponsables) {
		this.jTextFieldValorCampoGeneralResponsables = jTextFieldValorCampoGeneralResponsables;
	}

	public void setBorderResaltarValorCampoGeneralResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResponsables .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResponsables() {
		return this.jCheckBoxSeleccionarTodosResponsables;
	}

	public void setjCheckBoxSeleccionarTodosResponsables(
			JCheckBox jCheckBoxSeleccionarTodosResponsables) {
		this.jCheckBoxSeleccionarTodosResponsables = jCheckBoxSeleccionarTodosResponsables;
	}

	public void setBorderResaltarSeleccionarTodosResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResponsables .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResponsables() {
		return this.jCheckBoxSeleccionadosResponsables;
	}

	public void setjCheckBoxSeleccionadosResponsables(
			JCheckBox jCheckBoxSeleccionadosResponsables) {
		this.jCheckBoxSeleccionadosResponsables = jCheckBoxSeleccionadosResponsables;
	}
	
	public void setBorderResaltarSeleccionadosResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResponsables .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResponsables() {
		return this.jComboBoxTiposArchivosReportesResponsables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResponsables(
			JComboBox jComboBoxTiposArchivosReportesResponsables) {
		this.jComboBoxTiposArchivosReportesResponsables = jComboBoxTiposArchivosReportesResponsables;
	}

	public void setBorderResaltarTiposArchivosReportesResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResponsables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResponsables() {
		return this.jComboBoxTiposReportesResponsables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResponsables(
			JComboBox jComboBoxTiposReportesResponsables) {
		this.jComboBoxTiposReportesResponsables = jComboBoxTiposReportesResponsables;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResponsables() {
	//	return jComboBoxTiposReportesDinamicoResponsables;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResponsables(
	//		JComboBox jComboBoxTiposReportesDinamicoResponsables) {
	//	this.jComboBoxTiposReportesDinamicoResponsables = jComboBoxTiposReportesDinamicoResponsables;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResponsables() {
	//	return jComboBoxTiposArchivosReportesDinamicoResponsables;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResponsables(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResponsables) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResponsables = jComboBoxTiposArchivosReportesDinamicoResponsables;
	//}
	
	public void setBorderResaltarTiposReportesResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResponsables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResponsables() {
		return this.jComboBoxTiposGraficosReportesResponsables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResponsables(
			JComboBox jComboBoxTiposGraficosReportesResponsables) {
		this.jComboBoxTiposGraficosReportesResponsables = jComboBoxTiposGraficosReportesResponsables;
	}
	
	public void setBorderResaltarTiposGraficosReportesResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResponsables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResponsables() {
		return this.jComboBoxTiposPaginacionResponsables;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResponsables(
			JComboBox jComboBoxTiposPaginacionResponsables) {
		this.jComboBoxTiposPaginacionResponsables = jComboBoxTiposPaginacionResponsables;
	}
	
	public void setBorderResaltarTiposPaginacionResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResponsables .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResponsables() {
		return this.jComboBoxTiposRelacionesResponsables;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsables() {
		return this.jComboBoxTiposAccionesResponsables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsables(
			JComboBox jComboBoxTiposRelacionesResponsables) {
		this.jComboBoxTiposRelacionesResponsables = jComboBoxTiposRelacionesResponsables;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsables(
			JComboBox jComboBoxTiposAccionesResponsables) {
		this.jComboBoxTiposAccionesResponsables = jComboBoxTiposAccionesResponsables;
	}
	
	public void setBorderResaltarTiposRelacionesResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResponsables .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResponsables() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResponsables.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResponsables .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResponsables() {
	//	return jCheckBoxConGraficoDinamicoResponsables;
	//}

	//public void setjCheckBoxConGraficoDinamicoResponsables(
	//		JCheckBox jCheckBoxConGraficoDinamicoResponsables) {
	//	this.jCheckBoxConGraficoDinamicoResponsables = jCheckBoxConGraficoDinamicoResponsables;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResponsables() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResponsables.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResponsables .setBorder(borderResaltar);		
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
		this.responsablesSessionBean=new ResponsablesSessionBean();
		
		this.responsablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsablesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsablesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsablesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsables MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
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
		
		ResponsablesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Responsables No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResponsables= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResponsables,this.jTtoolBarResponsables,
							"nuevo","nuevo","Nuevo"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResponsables,this.jTtoolBarResponsables,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResponsables,this.jTtoolBarResponsables,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResponsables,this.jTtoolBarResponsables,
							"duplicar","duplicar","Duplicar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResponsables,this.jTtoolBarResponsables,
							"copiar","copiar","Copiar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResponsables,this.jTtoolBarResponsables,
							"ver_form","ver_form","Ver"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsables,this.jTtoolBarResponsables,
							"recargar","recargar","Buscar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsables,this.jTtoolBarResponsables,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResponsables,this.jTtoolBarResponsables,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResponsables,this.jTtoolBarResponsables,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResponsables,this.jTtoolBarResponsables,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResponsables,this.jTtoolBarResponsables,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResponsables=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResponsables,this.jTtoolBarResponsables,
							"cerrar","cerrar","Salir"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResponsables=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResponsables;
			
				this.jButtonProcesarInformacionToolBarResponsables=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResponsables;
				
		//protected JButton jButtonModificarToolBarResponsables;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResponsables=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResponsables=new JMenuMe("General");
		this.jmenuArchivoResponsables=new JMenuMe("Archivo");
		this.jmenuAccionesResponsables=new JMenuMe("Acciones");
		this.jmenuDatosResponsables=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsables= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsables.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsables,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResponsables= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResponsables.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResponsables,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResponsables= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResponsables.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResponsables,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResponsables= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsables.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsables,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResponsables= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResponsables.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResponsables,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResponsables= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResponsables.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResponsables,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResponsables= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResponsables.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResponsables,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsables= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsables.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsables,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResponsables= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResponsables.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResponsables,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResponsables= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResponsables.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResponsables,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResponsables= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResponsables.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResponsables,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResponsables= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResponsables.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResponsables,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResponsables= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResponsables.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResponsables,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsables,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResponsables= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResponsables.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResponsables,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsables= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsables.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsables,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResponsables= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResponsables.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResponsables,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResponsables.add(this.jMenuItemCerrarResponsables);
			
			this.jmenuAccionesResponsables.add(this.jMenuItemNuevoResponsables);
			this.jmenuAccionesResponsables.add(this.jMenuItemNuevoGuardarCambiosResponsables);
			this.jmenuAccionesResponsables.add(this.jMenuItemNuevoRelacionesResponsables);
			this.jmenuAccionesResponsables.add(this.jMenuItemGuardarCambiosTablaResponsables);		
			this.jmenuAccionesResponsables.add(this.jMenuItemDuplicarResponsables);		
			this.jmenuAccionesResponsables.add(this.jMenuItemCopiarResponsables);		
			this.jmenuAccionesResponsables.add(this.jMenuItemVerFormResponsables);		
			
			this.jmenuDatosResponsables.add(this.jMenuItemRecargarInformacionResponsables);				
			this.jmenuDatosResponsables.add(this.jMenuItemAnterioresResponsables);				
			this.jmenuDatosResponsables.add(this.jMenuItemSiguientesResponsables);				
			this.jmenuDatosResponsables.add(this.jMenuItemAbrirOrderByResponsables);				
			this.jmenuDatosResponsables.add(this.jMenuItemMostrarOcultarResponsables);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResponsables.add(this.jMenuItemGuardarCambiosResponsables);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResponsables.add(this.jmenuArchivoResponsables);		
			this.jmenuBarResponsables.add(this.jmenuAccionesResponsables);		
			this.jmenuBarResponsables.add(this.jmenuDatosResponsables);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResponsables);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResponsables() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaResponsablesResponsables=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaResponsablesResponsables.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaResponsablesResponsables= new JButtonMe();
		this.jButtonBusquedaResponsablesResponsables.setText("Buscar");
		this.jButtonBusquedaResponsablesResponsables.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaResponsablesResponsables,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaResponsablesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaResponsablesResponsables = new JLabelMe();
		jLabelidBusquedaResponsablesResponsables.setText("Id :");
		jLabelidBusquedaResponsablesResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaResponsablesResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaResponsablesResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaResponsablesResponsables,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidResponsablesBusquedaResponsables= new JTextFieldMe();
		jLabelidResponsablesBusquedaResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsablesBusquedaResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsablesBusquedaResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidResponsablesBusquedaResponsables.setVisible(false);




		this.jTabbedPaneBusquedasResponsables=new JTabbedPane();


		this.jTabbedPaneBusquedasResponsables.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasResponsables.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasResponsables.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResponsables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResponsables,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResponsables = new ResponsablesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Responsables DATOS");
			this.jInternalFrameDetalleFormResponsables = new ResponsablesDetalleFormJInternalFrame(jDesktopPane,this.responsablesSessionBean.getConGuardarRelaciones(),this.responsablesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResponsables = null;//new ResponsablesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsables= new GridBagLayout();
		
		
		this.jTableDatosResponsables = new JTableMe();      
		
		String sToolTipResponsables="";
		sToolTipResponsables=ResponsablesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsables+="(ActivosFijos.Responsables)";
		}
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsables+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResponsables.setToolTipText(sToolTipResponsables);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResponsables);
		this.jTableDatosResponsables.setAutoCreateRowSorter(true);
		this.jTableDatosResponsables.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResponsables.setRowSelectionAllowed(true);
		this.jTableDatosResponsables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResponsables,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResponsables = new JButtonMe();
		this.jButtonDuplicarResponsables = new JButtonMe();
		this.jButtonCopiarResponsables = new JButtonMe();
		this.jButtonVerFormResponsables = new JButtonMe();
		this.jButtonNuevoRelacionesResponsables = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResponsables = new JButtonMe();
		this.jButtonCerrarResponsables = new JButtonMe();
		
		this.jScrollPanelDatosResponsables = new JScrollPane();   
        this.jScrollPanelDatosGeneralResponsables = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Responsables";
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsables.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsables.setToolTipText("Acciones");
        this.jPanelAccionesResponsables.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsables, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResponsables=new ReporteDinamicoJInternalFrame(ResponsablesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResponsables();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResponsables=new ImportacionJInternalFrame(ResponsablesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResponsables();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResponsables = new JButtonMe();
		
		this.jButtonAbrirOrderByResponsables.setText("Orden");
		this.jButtonAbrirOrderByResponsables.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsables,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsables,false,this);
			
			//this.cargarOrderByResponsables(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResponsables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsables,true,this);
			
			//this.cargarOrderByResponsables(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResponsables.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosResponsables.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosResponsables.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosResponsables.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsables.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResponsables.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResponsables.setText("Nuevo");
		this.jButtonDuplicarResponsables.setText("Duplicar");
		this.jButtonCopiarResponsables.setText("Copiar");
		this.jButtonVerFormResponsables.setText("Ver");
		this.jButtonNuevoRelacionesResponsables.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResponsables.setText("Guardar");
		this.jButtonCerrarResponsables.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsables,"nuevo_button","Nuevo",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResponsables,"duplicar_button","Duplicar",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResponsables,"copiar_button","Copiar",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResponsables,"ver_form","Ver",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResponsables,"nuevorelaciones_button","Nuevo Rel",this.responsablesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsables,"guardarcambiostabla_button","Guardar",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsables,"cerrar_button","Salir",this.responsablesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResponsables.setToolTipText("Nuevo"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResponsables.setToolTipText("Duplicar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResponsables.setToolTipText("Copiar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResponsables.setToolTipText("Ver"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResponsables.setToolTipText("Nuevo Rel"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResponsables.setToolTipText("Guardar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsables.setToolTipText("Salir"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsables";
		inputMap = this.jButtonNuevoResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsables"));
		
		//DUPLICAR
		sMapKey = "DuplicarResponsables";
		inputMap = this.jButtonDuplicarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResponsables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResponsables"));
		
		//COPIAR
		sMapKey = "CopiarResponsables";
		inputMap = this.jButtonCopiarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResponsables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResponsables"));
		
		//VEr FORM
		sMapKey = "VerFormResponsables";
		inputMap = this.jButtonVerFormResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResponsables.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResponsables"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResponsables";
		inputMap = this.jButtonNuevoRelacionesResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResponsables"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResponsables";
		inputMap = this.jButtonModificarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResponsables"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResponsables";
		inputMap = this.jButtonCerrarResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsables"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsables";
		inputMap = this.jButtonGuardarCambiosTablaResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsables"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Responsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Responsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Responsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Responsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Responsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResponsables.setName("jPanelParametrosReportesResponsables"); 
		
		this.jPanelParametrosReportesAccionesResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResponsables.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResponsables.setName("jPanelParametrosReportesAccionesResponsables"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResponsables, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResponsables = new JButtonMe();
		this.jButtonRecargarInformacionResponsables.setText("Buscar");
		this.jButtonRecargarInformacionResponsables.setToolTipText("Buscar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResponsables,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionResponsables.setVisible(false);
		
		
		this.jButtonProcesarInformacionResponsables = new JButtonMe();
		this.jButtonProcesarInformacionResponsables.setText("Procesar");
		this.jButtonProcesarInformacionResponsables.setToolTipText("Procesar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResponsables.setVisible(false);
			
		this.jButtonProcesarInformacionResponsables.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsables.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResponsables.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsables.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResponsables.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsables.setText("TIPO");       
		this.jComboBoxTiposReportesResponsables.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResponsables.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResponsables.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResponsables = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResponsables.setText("Paginacion");
		this.jComboBoxTiposPaginacionResponsables.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResponsables.setText("Accion");
		this.jComboBoxTiposRelacionesResponsables.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResponsables = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsables.setText("Accion");
		this.jComboBoxTiposAccionesResponsables.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResponsables = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResponsables.setText("Accion");
		this.jComboBoxTiposSeleccionarResponsables.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResponsables=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResponsables.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsables.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResponsables.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResponsables = new JLabelMe();
		
		this.jLabelAccionesResponsables.setText("Acciones");		
		this.jLabelAccionesResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResponsables = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResponsables.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResponsables.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResponsables = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResponsables.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResponsables.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResponsables = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResponsables.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResponsables.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResponsables = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResponsables.setText("Graf.");
		this.jCheckBoxConGraficoReporteResponsables.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResponsables = new JButtonMe();
		//this.jButtonAnterioresResponsables.setText("<<");
        this.jButtonAnterioresResponsables.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResponsables,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResponsables = new JButtonMe();
		//this.jButtonSiguientesResponsables.setText(">>");
        this.jButtonSiguientesResponsables.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResponsables,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResponsables = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResponsables.setText("Nue");
        this.jButtonNuevoGuardarCambiosResponsables.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResponsables,"nuevoguardarcambios_button","Nue",this.responsablesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResponsables";
		inputMap = this.jButtonNuevoGuardarCambiosResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResponsables"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResponsables";
		inputMap = this.jButtonRecargarInformacionResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResponsables"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResponsables";
		inputMap = this.jButtonSiguientesResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResponsables"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResponsables";
		inputMap = this.jButtonAnterioresResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResponsables"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResponsables();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResponsables.setMinimumSize(new Dimension(this.getWidth(),ResponsablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsablesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsables.setMaximumSize(new Dimension(this.getWidth(),ResponsablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsablesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResponsables.setPreferredSize(new Dimension(this.getWidth(),ResponsablesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResponsablesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResponsables = new GridBagLayout();

			this.jPanelPaginacionResponsables.setLayout(gridaBagLayoutPaginacionResponsables);						
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 0;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResponsables.add(this.jButtonAnterioresResponsables, this.gridBagConstraintsResponsables);
					
						
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsables.gridy = 0;
			
			this.jPanelPaginacionResponsables.add(this.jButtonNuevoGuardarCambiosResponsables, this.gridBagConstraintsResponsables);
						
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResponsables.gridy = 0;
			this.jPanelPaginacionResponsables.add(this.jButtonSiguientesResponsables, this.gridBagConstraintsResponsables);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 1;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsables.add(this.jButtonNuevoResponsables, this.gridBagConstraintsResponsables);
						
			
			
			if(!this.responsablesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResponsables = new GridBagConstraints();
				this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResponsables.gridy = 1;
				this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResponsables.add(this.jButtonGuardarCambiosTablaResponsables, this.gridBagConstraintsResponsables);
			}
			
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 1;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsables.add(this.jButtonDuplicarResponsables, this.gridBagConstraintsResponsables);
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 1;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsables.add(this.jButtonCopiarResponsables, this.gridBagConstraintsResponsables);
		
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 1;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResponsables.add(this.jButtonVerFormResponsables, this.gridBagConstraintsResponsables);
		
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 1;
			this.gridBagConstraintsResponsables.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResponsables.add(this.jButtonCerrarResponsables, this.gridBagConstraintsResponsables);
		
		
		
		this.jButtonRecargarInformacionResponsables.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsables.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResponsables.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResponsables, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResponsables.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsables.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResponsables.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResponsables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResponsables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResponsables.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsables.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResponsables.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResponsables.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsables.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResponsables.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResponsables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResponsables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResponsables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResponsables.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsables.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResponsables.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResponsables.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsables.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResponsables.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResponsables.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsables.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResponsables.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResponsables, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResponsables.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsables.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResponsables.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResponsables.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsables.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResponsables.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResponsables = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResponsables = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Responsables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Responsables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Responsables = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Responsables = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResponsables.setLayout(gridaBagParametrosReportesResponsables);
			this.jPanelParametrosReportesAccionesResponsables.setLayout(gridaBagParametrosReportesAccionesResponsables);
			
			
			this.jPanelParametrosAuxiliar1Responsables.setLayout(gridaBagParametrosAuxiliar1Responsables);
			this.jPanelParametrosAuxiliar2Responsables.setLayout(gridaBagParametrosAuxiliar2Responsables);
			this.jPanelParametrosAuxiliar3Responsables.setLayout(gridaBagParametrosAuxiliar3Responsables);
			this.jPanelParametrosAuxiliar4Responsables.setLayout(gridaBagParametrosAuxiliar4Responsables);
			//this.jPanelParametrosAuxiliar5Responsables.setLayout(gridaBagParametrosAuxiliar2Responsables);			
			
			
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsables.add(this.jButtonRecargarInformacionResponsables, this.gridBagConstraintsResponsables);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsables.add(this.jComboBoxTiposPaginacionResponsables, this.gridBagConstraintsResponsables);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsables.add(this.jCheckBoxConAltoMaximoTablaResponsables, this.gridBagConstraintsResponsables);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Responsables.add(this.jComboBoxTiposArchivosReportesResponsables, this.gridBagConstraintsResponsables);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsables.add(this.jPanelParametrosAuxiliar1Responsables, this.gridBagConstraintsResponsables);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Responsables.add(this.jComboBoxTiposReportesResponsables, this.gridBagConstraintsResponsables);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsables.add(this.jPanelParametrosAuxiliar4Responsables, this.gridBagConstraintsResponsables);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsables.add(this.jComboBoxTiposReportesResponsables, this.gridBagConstraintsResponsables);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsables.add(this.jCheckBoxGenerarReporteResponsables, this.gridBagConstraintsResponsables);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsables.add(this.jPanelParametrosAuxiliar2Responsables, this.gridBagConstraintsResponsables);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsables.add(this.jLabelAccionesResponsables, this.gridBagConstraintsResponsables);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResponsables = new GridBagConstraints();
				this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResponsables.add(this.jButtonAbrirOrderByResponsables, this.gridBagConstraintsResponsables);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsables.add(this.jComboBoxTiposSeleccionarResponsables, this.gridBagConstraintsResponsables);			
			
			
			/*
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResponsables.add(this.jCheckBoxSeleccionarTodosResponsables, this.gridBagConstraintsResponsables);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Responsables.add(this.jCheckBoxSeleccionarTodosResponsables, this.gridBagConstraintsResponsables);															
				
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResponsables.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Responsables.add(this.jCheckBoxSeleccionadosResponsables, this.gridBagConstraintsResponsables);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResponsables.add(this.jPanelParametrosAuxiliar3Responsables, this.gridBagConstraintsResponsables);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResponsables.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResponsables.add(this.jComboBoxTiposAccionesResponsables, this.gridBagConstraintsResponsables);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResponsables = new GridBagLayout();

			this.jScrollPanelDatosResponsables.setLayout(gridaBagLayoutDatosResponsables);
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = 0;
			this.gridBagConstraintsResponsables.gridx = 0;
			
			this.jScrollPanelDatosResponsables.add(this.jTableDatosResponsables, this.gridBagConstraintsResponsables);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResponsables.setViewportView(this.jTableDatosResponsables);
		this.jTableDatosResponsables.setFillsViewportHeight(true);
		this.jTableDatosResponsables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResponsables= new GridBagLayout();
		this.jPanelAccionesResponsables.setLayout(gridaBagLayoutAccionesResponsables);
		
		
		/*	
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = 0;
		this.gridBagConstraintsResponsables.gridx = 0;
			
		this.jPanelAccionesResponsables.add(this.jButtonNuevoResponsables, this.gridBagConstraintsResponsables);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaResponsablesResponsables= new GridBagLayout();
		gridaBagLayoutBusquedaResponsablesResponsables.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaResponsablesResponsables.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaResponsablesResponsables.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaResponsablesResponsables.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaResponsablesResponsables.setLayout(gridaBagLayoutBusquedaResponsablesResponsables);

		gridBagConstraintsResponsables = new GridBagConstraints();
		gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsables.gridy = 0;
		gridBagConstraintsResponsables.gridx = 0;
		jPanelBusquedaResponsablesResponsables.add(jLabelidBusquedaResponsablesResponsables, gridBagConstraintsResponsables);

		gridBagConstraintsResponsables = new GridBagConstraints();
		gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsables.gridy = 0;
		gridBagConstraintsResponsables.gridx = 1;
		jPanelBusquedaResponsablesResponsables.add(jLabelidResponsablesBusquedaResponsables, gridBagConstraintsResponsables);

		gridBagConstraintsResponsables = new GridBagConstraints();
		gridBagConstraintsResponsables.anchor = GridBagConstraints.WEST;
		gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsResponsables.gridy = 1;
		gridBagConstraintsResponsables.gridx =1;
		jPanelBusquedaResponsablesResponsables.add(jButtonBusquedaResponsablesResponsables, gridBagConstraintsResponsables);

		jTabbedPaneBusquedasResponsables.addTab("1.-Por  ", jPanelBusquedaResponsablesResponsables);
		jTabbedPaneBusquedasResponsables.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsables = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsables);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsables = new GridBagConstraints();						
			this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsables.gridx = 0;		
			//this.gridBagConstraintsResponsables.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsables.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResponsables, this.gridBagConstraintsResponsables);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResponsables.gridx = 0;		
		//this.gridBagConstraintsResponsables.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResponsables.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResponsables);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsables.gridx = 0;		
			this.gridBagConstraintsResponsables.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsResponsables.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasResponsables, this.gridBagConstraintsResponsables);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResponsables, this.gridBagConstraintsResponsables);								
		
		
		/*
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResponsables, this.gridBagConstraintsResponsables);
		*/		
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsables.gridx =0;
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsables.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsables, this.gridBagConstraintsResponsables);
				
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResponsables, this.gridBagConstraintsResponsables);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResponsables= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsables = new GridBagLayout();
			this.jPanelBusquedasParametrosResponsables.setLayout(gridaBagLayoutBusquedasParametrosResponsables);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResponsables=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsables.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsables.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsables.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsables, this.gridBagConstraintsResponsables);
			
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsables, this.gridBagConstraintsResponsables);
		
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsables.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsables, this.gridBagConstraintsResponsables);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResponsables;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResponsables() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResponsables = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResponsables.setName("jPanelReporteDinamicoResponsables"); 
		
		this.jPanelReporteDinamicoResponsables.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsables.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResponsables.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResponsables.setLayout(gridaBagLayoutReporteDinamicoResponsables);
		
		
		this.jInternalFrameReporteDinamicoResponsables= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResponsables = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsables= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResponsables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResponsables.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResponsables.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResponsables.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResponsables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResponsables.setResizable(true);
	    this.jInternalFrameReporteDinamicoResponsables.setClosable(true);
	    this.jInternalFrameReporteDinamicoResponsables.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResponsables.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsables.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResponsables.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResponsables = new JLabelMe();

		this.jLabelColumnasSelectReporteResponsables.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResponsables.add(this.jLabelColumnasSelectReporteResponsables, this.gridBagConstraintsResponsables);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResponsables = new JList<Reporte>();
		this.jListColumnasSelectReporteResponsables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResponsables.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResponsables.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsables.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResponsables.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResponsables=new JScrollPane(this.jListColumnasSelectReporteResponsables);
			
			this.jScrollColumnasSelectReporteResponsables.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsables.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResponsables.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResponsables.add(this.jListColumnasSelectReporteResponsables, this.gridBagConstraintsResponsables);
		this.jPanelReporteDinamicoResponsables.add(this.jScrollColumnasSelectReporteResponsables, this.gridBagConstraintsResponsables);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResponsables = new JLabelMe();

		this.jLabelRelacionesSelectReporteResponsables.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResponsables = new JList<Reporte>();
		this.jListRelacionesSelectReporteResponsables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResponsables.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResponsables.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsables.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResponsables.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResponsables=new JScrollPane(this.jListRelacionesSelectReporteResponsables);
			
			this.jScrollRelacionesSelectReporteResponsables.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsables.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResponsables.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoResponsables = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResponsables = new JComboBoxMe();
		this.jListColumnasValoresGraficoResponsables = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResponsables = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResponsables.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResponsables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResponsables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResponsables = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResponsables.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResponsables.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsables.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResponsables.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResponsables = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResponsables.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsables.add(this.jLabelGenerarExcelReporteDinamicoResponsables, this.gridBagConstraintsResponsables);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResponsables = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResponsables.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResponsables,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResponsables.setToolTipText("Generar EXCEL"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResponsables = new GridBagConstraints();
		//this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResponsables.add(this.jButtonGenerarExcelReporteDinamicoResponsables, this.gridBagConstraintsResponsables);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsables.add(this.jComboBoxTiposReportesDinamicoResponsables, this.gridBagConstraintsResponsables);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResponsables = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResponsables.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResponsables.add(this.jLabelTiposArchivoReporteDinamicoResponsables, this.gridBagConstraintsResponsables);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsables.add(this.jComboBoxTiposArchivosReportesDinamicoResponsables, this.gridBagConstraintsResponsables);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResponsables = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResponsables.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResponsables,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResponsables.setToolTipText("Generar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsables.add(this.jButtonGenerarReporteDinamicoResponsables, this.gridBagConstraintsResponsables);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResponsables = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResponsables.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResponsables,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResponsables.setToolTipText("Cancelar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResponsables.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResponsables.add(this.jButtonCerrarReporteDinamicoResponsables, this.gridBagConstraintsResponsables);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResponsables = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResponsables= new JScrollPane(jPanelReporteDinamicoResponsables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResponsables.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsables.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResponsables.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResponsables.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResponsables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResponsables.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResponsables);
		this.jInternalFrameReporteDinamicoResponsables.getContentPane().add(this.jScrollPanelReporteDinamicoResponsables, this.gridBagConstraintsResponsables);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResponsables() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResponsables = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResponsables.setName("jPanelImportacionResponsables"); 
		
		this.jPanelImportacionResponsables.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsables.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResponsables.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResponsables.setLayout(gridaBagLayoutImportacionResponsables);
		
		
		this.jInternalFrameImportacionResponsables= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResponsables= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResponsables = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResponsables= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResponsables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsables.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsables.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResponsables.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsables.setResizable(true);
	    this.jInternalFrameImportacionResponsables.setClosable(true);
	    this.jInternalFrameImportacionResponsables.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResponsables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResponsables.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResponsables.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResponsables.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResponsables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResponsables.setResizable(true);
	    this.jInternalFrameImportacionResponsables.setClosable(true);
	    this.jInternalFrameImportacionResponsables.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResponsables.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsables.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResponsables.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResponsables = new JLabelMe();

		this.jLabelArchivoImportacionResponsables.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsables.add(this.jLabelArchivoImportacionResponsables, this.gridBagConstraintsResponsables);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResponsables = new JFileChooser();		
		this.jFileChooserImportacionResponsables.setToolTipText("ESCOGER ARCHIVO"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResponsables = new JButtonMe();
		this.jButtonAbrirImportacionResponsables.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResponsables,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResponsables.setToolTipText("Generar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsables.add(this.jButtonAbrirImportacionResponsables, this.gridBagConstraintsResponsables);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResponsables = new JLabelMe();

		this.jLabelPathArchivoImportacionResponsables.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResponsables.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsables.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResponsables.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;		
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResponsables.add(this.jLabelPathArchivoImportacionResponsables, this.gridBagConstraintsResponsables);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResponsables=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResponsables.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsables.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResponsables.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsables.add(this.jTextFieldPathArchivoImportacionResponsables, this.gridBagConstraintsResponsables);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResponsables = new JButtonMe();
		this.jButtonGenerarImportacionResponsables.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResponsables,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResponsables.setToolTipText("Generar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsables.add(this.jButtonGenerarImportacionResponsables, this.gridBagConstraintsResponsables);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResponsables = new JButtonMe();
		this.jButtonCerrarImportacionResponsables.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResponsables,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResponsables.setToolTipText("Cancelar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsables.gridy = iPosYImportacion;
		this.gridBagConstraintsResponsables.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResponsables.add(this.jButtonCerrarImportacionResponsables, this.gridBagConstraintsResponsables);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResponsables = new GridBagLayout();
		
		this.jScrollPanelImportacionResponsables= new JScrollPane(jPanelImportacionResponsables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResponsables = new GridBagConstraints();
		this.gridBagConstraintsResponsables.gridy =iPosYImportacion;
		this.gridBagConstraintsResponsables.gridx =iPosXImportacion;
		this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResponsables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResponsables.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResponsables);
		this.jInternalFrameImportacionResponsables.getContentPane().add(this.jScrollPanelImportacionResponsables, this.gridBagConstraintsResponsables);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResponsables(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResponsables = new JButtonMe();
			this.jButtonAbrirOrderByResponsables.setText("Orden");
			this.jButtonAbrirOrderByResponsables.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResponsables,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResponsables";
			inputMap = this.jButtonAbrirOrderByResponsables.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResponsables.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResponsables"));
		
		
			GridBagLayout gridaBagLayoutOrderByResponsables = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResponsables = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResponsables.setName("jPanelOrderByResponsables"); 
			
			this.jPanelOrderByResponsables.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsables.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResponsables.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResponsables.setLayout(gridaBagLayoutOrderByResponsables);
			
			
			this.jTableDatosResponsablesOrderBy = new JTableMe();        
			this.jTableDatosResponsablesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResponsablesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResponsablesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResponsablesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResponsablesOrderBy.setViewportView(this.jTableDatosResponsablesOrderBy);
			this.jTableDatosResponsablesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResponsablesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResponsables= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResponsables= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResponsables = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResponsables= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResponsables.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResponsables.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResponsables.setTitle("Orden");
			this.jInternalFrameOrderByResponsables.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResponsables.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResponsables.setResizable(true);
			this.jInternalFrameOrderByResponsables.setClosable(true);
			this.jInternalFrameOrderByResponsables.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResponsables.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsables.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResponsables.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResponsables.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsableses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResponsables.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResponsables.ipady =150;
				
			this.jPanelOrderByResponsables.add(jScrollPanelDatosResponsablesOrderBy, this.gridBagConstraintsResponsables);//this.jTableDatosResponsablesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResponsables = new JButtonMe();
			this.jButtonCerrarOrderByResponsables.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResponsables,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResponsables.setToolTipText("Cancelar"+" "+ResponsablesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResponsables, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsables.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResponsables.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResponsables.add(this.jButtonCerrarOrderByResponsables, this.gridBagConstraintsResponsables);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResponsables = new GridBagLayout();
			
			this.jScrollPanelOrderByResponsables= new JScrollPane(jPanelOrderByResponsables,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResponsables = new GridBagConstraints();
			this.gridBagConstraintsResponsables.gridy =iPosYOrderBy;
			this.gridBagConstraintsResponsables.gridx =iPosXOrderBy;
			this.gridBagConstraintsResponsables.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResponsables.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResponsables.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResponsables);
			
			this.jInternalFrameOrderByResponsables.getContentPane().add(this.jScrollPanelOrderByResponsables, this.gridBagConstraintsResponsables);			
		
		} else {
			this.jButtonAbrirOrderByResponsables = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.responsablesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResponsables.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResponsables.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResponsables.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosResponsables.getRowHeight();//ResponsablesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResponsablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsables.isSelected()) {
					iHeightTable=ResponsablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResponsablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResponsables.isSelected()) {
					iHeightTable=ResponsablesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResponsablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResponsablesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResponsables.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsables.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResponsables.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResponsables.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsables.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResponsables.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResponsables!=null && this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy()!=null) {
			//if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResponsables.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResponsables.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResponsables.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResponsables.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsables.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResponsables.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=responsablesLogic.getResponsabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsabless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Responsables> TraerResponsablesBeans(List<Responsables> responsabless,ArrayList<Classe> classes)throws Exception {
		try {
			for(Responsables responsables:responsabless) {
					
				if(!(ResponsablesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResponsablesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					responsables.setsDetalleGeneralEntityReporte(ResponsablesConstantesFunciones.getResponsablesDescripcion(responsables));
										
						
					
						
					
				} else  {
							
					//responsables.setsDetalleGeneralEntityReporte(responsables.getsDetalleGeneralEntityReporte());
										
				}
				
				//responsablesbeans.add(responsablesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return responsabless;
    }
	//PARA REPORTES FIN
}
