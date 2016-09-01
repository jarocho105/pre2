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
import com.bydan.erp.activosfijos.util.report.ConsolidadosResumenConstantesFunciones;

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
public class ConsolidadosResumenJInternalFrame extends ConsolidadosResumenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsolidadosResumen;
	
	protected JMenuBar jmenuBarConsolidadosResumen;
	
	protected JMenu jmenuConsolidadosResumen;
	protected JMenu jmenuDatosConsolidadosResumen;
	protected JMenu jmenuArchivoConsolidadosResumen;
	protected JMenu jmenuAccionesConsolidadosResumen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsolidadosResumen;	
	protected GridBagConstraints gridBagConstraintsConsolidadosResumen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsolidadosResumenDetalleFormJInternalFrame jInternalFrameDetalleFormConsolidadosResumen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsolidadosResumen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsolidadosResumen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsolidadosResumenSessionBean consolidadosresumenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConsolidadosResumen> consolidadosresumens;		
	public List<ConsolidadosResumen> consolidadosresumensEliminados;	
	public List<ConsolidadosResumen> consolidadosresumensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsolidadosResumen;		
	protected JButton jButtonAbrirOrderByConsolidadosResumen;
	
	
	//protected JPanel jPanelOrderByConsolidadosResumen;
	//public JScrollPane jScrollPanelOrderByConsolidadosResumen;	
	//protected JButton jButtonCerrarOrderByConsolidadosResumen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsolidadosResumenLogic consolidadosresumenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsolidadosResumen;
	public JScrollPane jScrollPanelDatosEdicionConsolidadosResumen;
	public JScrollPane jScrollPanelDatosGeneralConsolidadosResumen;
    
	
	
	//public JScrollPane jScrollPanelDatosConsolidadosResumenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsolidadosResumen;
	//public JScrollPane jScrollPanelImportacionConsolidadosResumen;
	
	
	
	protected JPanel jPanelAccionesConsolidadosResumen;
	
    protected JPanel jPanelPaginacionConsolidadosResumen;
    protected JPanel jPanelParametrosReportesConsolidadosResumen;
	protected JPanel jPanelParametrosReportesAccionesConsolidadosResumen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConsolidadosResumen;
	protected JPanel jPanelParametrosAuxiliar2ConsolidadosResumen;
	protected JPanel jPanelParametrosAuxiliar3ConsolidadosResumen;
	protected JPanel jPanelParametrosAuxiliar4ConsolidadosResumen;
	//protected JPanel jPanelParametrosAuxiliar5ConsolidadosResumen;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsolidadosResumen;
	//protected JPanel jPanelImportacionConsolidadosResumen;
	
	
	public JTable jTableDatosConsolidadosResumen;
	
	
	
	//public JTable jTableDatosConsolidadosResumenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsolidadosResumen;
	protected JButton jButtonDuplicarConsolidadosResumen;
	protected JButton jButtonCopiarConsolidadosResumen;
	protected JButton jButtonVerFormConsolidadosResumen;
	protected JButton jButtonNuevoRelacionesConsolidadosResumen;
	protected JButton jButtonModificarConsolidadosResumen;
	
    protected JButton jButtonGuardarCambiosTablaConsolidadosResumen;
	protected JButton jButtonCerrarConsolidadosResumen;
	
	
	protected JButton jButtonRecargarInformacionConsolidadosResumen;
	protected JButton jButtonProcesarInformacionConsolidadosResumen;
	
	
	protected JButton jButtonAnterioresConsolidadosResumen;
	protected JButton jButtonSiguientesConsolidadosResumen;
	protected JButton jButtonNuevoGuardarCambiosConsolidadosResumen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsolidadosResumen;
	//protected JButton jButtonCerrarReporteDinamicoConsolidadosResumen;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsolidadosResumen;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsolidadosResumen;
	//protected JButton jButtonGenerarImportacionConsolidadosResumen;
	//protected JButton jButtonCerrarImportacionConsolidadosResumen;
	//protected JFileChooser jFileChooserImportacionConsolidadosResumen;
	//protected File fileImportacionConsolidadosResumen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsolidadosResumen;
	protected JButton jButtonDuplicarToolBarConsolidadosResumen;
	protected JButton jButtonNuevoRelacionesToolBarConsolidadosResumen;
	
	
	public JButton jButtonGuardarCambiosToolBarConsolidadosResumen;
	protected JButton jButtonCopiarToolBarConsolidadosResumen;
	protected JButton jButtonVerFormToolBarConsolidadosResumen;
	public JButton jButtonGuardarCambiosTablaToolBarConsolidadosResumen;
	protected JButton jButtonMostrarOcultarTablaToolBarConsolidadosResumen;
	protected JButton jButtonCerrarToolBarConsolidadosResumen;
	
	protected JButton jButtonRecargarInformacionToolBarConsolidadosResumen;
	protected JButton jButtonProcesarInformacionToolBarConsolidadosResumen;
	protected JButton jButtonAnterioresToolBarConsolidadosResumen;
	protected JButton jButtonSiguientesToolBarConsolidadosResumen;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsolidadosResumen;
	protected JButton jButtonAbrirOrderByToolBarConsolidadosResumen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsolidadosResumen;
	protected JMenuItem jMenuItemDuplicarConsolidadosResumen;
	protected JMenuItem jMenuItemNuevoRelacionesConsolidadosResumen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsolidadosResumen;
	protected JMenuItem jMenuItemCopiarConsolidadosResumen;
	protected JMenuItem jMenuItemVerFormConsolidadosResumen;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsolidadosResumen;
	protected JMenuItem jMenuItemCerrarConsolidadosResumen;
	protected JMenuItem jMenuItemDetalleCerrarConsolidadosResumen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsolidadosResumen;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsolidadosResumen;
	
	protected JMenuItem jMenuItemRecargarInformacionConsolidadosResumen;
	protected JMenuItem jMenuItemProcesarInformacionConsolidadosResumen;
	protected JMenuItem jMenuItemAnterioresConsolidadosResumen;
	protected JMenuItem jMenuItemSiguientesConsolidadosResumen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsolidadosResumen;
	protected JMenuItem jMenuItemAbrirOrderByConsolidadosResumen;
	protected JMenuItem jMenuItemMostrarOcultarConsolidadosResumen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsolidadosResumen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsolidadosResumen;
	protected JCheckBox jCheckBoxSeleccionadosConsolidadosResumen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsolidadosResumen;
	protected JCheckBox jCheckBoxConGraficoReporteConsolidadosResumen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsolidadosResumen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsolidadosResumen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsolidadosResumen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsolidadosResumen;
	protected JTextField jTextFieldValorCampoGeneralConsolidadosResumen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsolidadosResumen;
	//public JList<Reporte> jListColumnasSelectReporteConsolidadosResumen;
	//public JScrollPane jScrollColumnasSelectReporteConsolidadosResumen;
	
	//public JLabel jLabelRelacionesSelectReporteConsolidadosResumen;
	//public JList<Reporte> jListRelacionesSelectReporteConsolidadosResumen;
	//public JScrollPane jScrollRelacionesSelectReporteConsolidadosResumen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsolidadosResumen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsolidadosResumen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsolidadosResumen;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsolidadosResumen;
	
		
	//public JLabel jLabelArchivoImportacionConsolidadosResumen;	
	//public JLabel jLabelPathArchivoImportacionConsolidadosResumen;
	//protected JTextField jTextFieldPathArchivoImportacionConsolidadosResumen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsolidadosResumen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsolidadosResumen;
	
	//public JLabel jLabelColumnaCategoriaValorConsolidadosResumen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsolidadosResumen;
	
	//public JLabel jLabelColumnasValoresGraficoConsolidadosResumen;
	//public JList<Reporte> jListColumnasValoresGraficoConsolidadosResumen;
	//public JScrollPane jScrollColumnasValoresGraficoConsolidadosResumen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsolidadosResumen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsolidadosResumen;
	public JPanel jPanelBusquedaConsolidadosResumenConsolidadosResumen;
	public JButton jButtonBusquedaConsolidadosResumenConsolidadosResumen;
	
	public JPanel jPanelIdIdBusquedaConsolidadosResumenConsolidadosResumen;
	public JLabel jLabelidBusquedaConsolidadosResumenConsolidadosResumen;
	public JTextFieldMe jLabelidConsolidadosResumenBusquedaConsolidadosResumen;
	public JButton jButtonidBusquedaConsolidadosResumenConsolidadosResumenBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsolidadosResumenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsolidadosResumen)	{
		this.jButtonRecargarInformacionConsolidadosResumen = jButtonRecargarInformacionConsolidadosResumen;
	}
	
	public JButton getjButtonProcesarInformacionConsolidadosResumen() {
		return this.jButtonProcesarInformacionConsolidadosResumen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsolidadosResumen)	{
		this.jButtonProcesarInformacionConsolidadosResumen = jButtonProcesarInformacionConsolidadosResumen;
	}
	
	
	public JButton getjButtonRecargarInformacionConsolidadosResumen() {
		return this.jButtonRecargarInformacionConsolidadosResumen;
	}
	
	
	public List<ConsolidadosResumen> getconsolidadosresumens() {
		return this.consolidadosresumens;
	}

	public void setconsolidadosresumens(List<ConsolidadosResumen> consolidadosresumens) {
		this.consolidadosresumens = consolidadosresumens;
	}
	
	public List<ConsolidadosResumen> getconsolidadosresumensAux() {
		return this.consolidadosresumensAux;
	}

	public void setconsolidadosresumensAux(List<ConsolidadosResumen> consolidadosresumensAux) {
		this.consolidadosresumensAux = consolidadosresumensAux;
	}
	
	public List<ConsolidadosResumen> getconsolidadosresumensEliminados() {
		return this.consolidadosresumensEliminados;
	}

	public void setConsolidadosResumensEliminados(List<ConsolidadosResumen> consolidadosresumensEliminados) {
		this.consolidadosresumensEliminados = consolidadosresumensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsolidadosResumen() {
		return jComboBoxTiposSeleccionarConsolidadosResumen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsolidadosResumen(
			JComboBox jComboBoxTiposSeleccionarConsolidadosResumen) {
		this.jComboBoxTiposSeleccionarConsolidadosResumen = jComboBoxTiposSeleccionarConsolidadosResumen;
	}
	
	public void setBorderResaltarTiposSeleccionarConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsolidadosResumen() {
		return jTextFieldValorCampoGeneralConsolidadosResumen;
	}

	public void setjTextFieldValorCampoGeneralConsolidadosResumen(
			JTextField jTextFieldValorCampoGeneralConsolidadosResumen) {
		this.jTextFieldValorCampoGeneralConsolidadosResumen = jTextFieldValorCampoGeneralConsolidadosResumen;
	}

	public void setBorderResaltarValorCampoGeneralConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsolidadosResumen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsolidadosResumen() {
		return this.jCheckBoxSeleccionarTodosConsolidadosResumen;
	}

	public void setjCheckBoxSeleccionarTodosConsolidadosResumen(
			JCheckBox jCheckBoxSeleccionarTodosConsolidadosResumen) {
		this.jCheckBoxSeleccionarTodosConsolidadosResumen = jCheckBoxSeleccionarTodosConsolidadosResumen;
	}

	public void setBorderResaltarSeleccionarTodosConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsolidadosResumen() {
		return this.jCheckBoxSeleccionadosConsolidadosResumen;
	}

	public void setjCheckBoxSeleccionadosConsolidadosResumen(
			JCheckBox jCheckBoxSeleccionadosConsolidadosResumen) {
		this.jCheckBoxSeleccionadosConsolidadosResumen = jCheckBoxSeleccionadosConsolidadosResumen;
	}
	
	public void setBorderResaltarSeleccionadosConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsolidadosResumen() {
		return this.jComboBoxTiposArchivosReportesConsolidadosResumen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsolidadosResumen(
			JComboBox jComboBoxTiposArchivosReportesConsolidadosResumen) {
		this.jComboBoxTiposArchivosReportesConsolidadosResumen = jComboBoxTiposArchivosReportesConsolidadosResumen;
	}

	public void setBorderResaltarTiposArchivosReportesConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsolidadosResumen() {
		return this.jComboBoxTiposReportesConsolidadosResumen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsolidadosResumen(
			JComboBox jComboBoxTiposReportesConsolidadosResumen) {
		this.jComboBoxTiposReportesConsolidadosResumen = jComboBoxTiposReportesConsolidadosResumen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsolidadosResumen() {
	//	return jComboBoxTiposReportesDinamicoConsolidadosResumen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsolidadosResumen(
	//		JComboBox jComboBoxTiposReportesDinamicoConsolidadosResumen) {
	//	this.jComboBoxTiposReportesDinamicoConsolidadosResumen = jComboBoxTiposReportesDinamicoConsolidadosResumen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsolidadosResumen() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsolidadosResumen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen = jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen;
	//}
	
	public void setBorderResaltarTiposReportesConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsolidadosResumen() {
		return this.jComboBoxTiposGraficosReportesConsolidadosResumen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsolidadosResumen(
			JComboBox jComboBoxTiposGraficosReportesConsolidadosResumen) {
		this.jComboBoxTiposGraficosReportesConsolidadosResumen = jComboBoxTiposGraficosReportesConsolidadosResumen;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsolidadosResumen() {
		return this.jComboBoxTiposPaginacionConsolidadosResumen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsolidadosResumen(
			JComboBox jComboBoxTiposPaginacionConsolidadosResumen) {
		this.jComboBoxTiposPaginacionConsolidadosResumen = jComboBoxTiposPaginacionConsolidadosResumen;
	}
	
	public void setBorderResaltarTiposPaginacionConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsolidadosResumen() {
		return this.jComboBoxTiposRelacionesConsolidadosResumen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsolidadosResumen() {
		return this.jComboBoxTiposAccionesConsolidadosResumen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsolidadosResumen(
			JComboBox jComboBoxTiposRelacionesConsolidadosResumen) {
		this.jComboBoxTiposRelacionesConsolidadosResumen = jComboBoxTiposRelacionesConsolidadosResumen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsolidadosResumen(
			JComboBox jComboBoxTiposAccionesConsolidadosResumen) {
		this.jComboBoxTiposAccionesConsolidadosResumen = jComboBoxTiposAccionesConsolidadosResumen;
	}
	
	public void setBorderResaltarTiposRelacionesConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsolidadosResumen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsolidadosResumen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsolidadosResumen() {
	//	return jCheckBoxConGraficoDinamicoConsolidadosResumen;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsolidadosResumen(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsolidadosResumen) {
	//	this.jCheckBoxConGraficoDinamicoConsolidadosResumen = jCheckBoxConGraficoDinamicoConsolidadosResumen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsolidadosResumen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsolidadosResumen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsolidadosResumen .setBorder(borderResaltar);		
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
		this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
		
		this.consolidadosresumenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosresumenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consolidadosresumenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsolidadosResumenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consolidados Resumen MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsolidadosResumenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsolidadosResumen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"nuevo","nuevo","Nuevo"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"duplicar","duplicar","Duplicar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"copiar","copiar","Copiar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"ver_form","ver_form","Ver"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"recargar","recargar","Buscar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsolidadosResumen,this.jTtoolBarConsolidadosResumen,
							"cerrar","cerrar","Salir"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsolidadosResumen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsolidadosResumen;
			
				this.jButtonProcesarInformacionToolBarConsolidadosResumen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsolidadosResumen;
				
		//protected JButton jButtonModificarToolBarConsolidadosResumen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsolidadosResumen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsolidadosResumen=new JMenuMe("General");
		this.jmenuArchivoConsolidadosResumen=new JMenuMe("Archivo");
		this.jmenuAccionesConsolidadosResumen=new JMenuMe("Acciones");
		this.jmenuDatosConsolidadosResumen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsolidadosResumen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsolidadosResumen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsolidadosResumen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsolidadosResumen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsolidadosResumen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsolidadosResumen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsolidadosResumen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsolidadosResumen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsolidadosResumen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsolidadosResumen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsolidadosResumen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsolidadosResumen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsolidadosResumen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsolidadosResumen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsolidadosResumen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsolidadosResumen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsolidadosResumen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsolidadosResumen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsolidadosResumen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsolidadosResumen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsolidadosResumen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsolidadosResumen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsolidadosResumen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsolidadosResumen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsolidadosResumen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsolidadosResumen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsolidadosResumen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsolidadosResumen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsolidadosResumen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsolidadosResumen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsolidadosResumen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsolidadosResumen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsolidadosResumen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsolidadosResumen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsolidadosResumen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsolidadosResumen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsolidadosResumen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsolidadosResumen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsolidadosResumen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsolidadosResumen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsolidadosResumen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsolidadosResumen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsolidadosResumen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsolidadosResumen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsolidadosResumen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsolidadosResumen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsolidadosResumen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsolidadosResumen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsolidadosResumen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsolidadosResumen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsolidadosResumen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsolidadosResumen.add(this.jMenuItemCerrarConsolidadosResumen);
			
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemNuevoConsolidadosResumen);
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemNuevoGuardarCambiosConsolidadosResumen);
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemNuevoRelacionesConsolidadosResumen);
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemGuardarCambiosTablaConsolidadosResumen);		
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemDuplicarConsolidadosResumen);		
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemCopiarConsolidadosResumen);		
			this.jmenuAccionesConsolidadosResumen.add(this.jMenuItemVerFormConsolidadosResumen);		
			
			this.jmenuDatosConsolidadosResumen.add(this.jMenuItemRecargarInformacionConsolidadosResumen);				
			this.jmenuDatosConsolidadosResumen.add(this.jMenuItemAnterioresConsolidadosResumen);				
			this.jmenuDatosConsolidadosResumen.add(this.jMenuItemSiguientesConsolidadosResumen);				
			this.jmenuDatosConsolidadosResumen.add(this.jMenuItemAbrirOrderByConsolidadosResumen);				
			this.jmenuDatosConsolidadosResumen.add(this.jMenuItemMostrarOcultarConsolidadosResumen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsolidadosResumen.add(this.jMenuItemGuardarCambiosConsolidadosResumen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsolidadosResumen.add(this.jmenuArchivoConsolidadosResumen);		
			this.jmenuBarConsolidadosResumen.add(this.jmenuAccionesConsolidadosResumen);		
			this.jmenuBarConsolidadosResumen.add(this.jmenuDatosConsolidadosResumen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsolidadosResumen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsolidadosResumen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaConsolidadosResumenConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaConsolidadosResumenConsolidadosResumen.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaConsolidadosResumenConsolidadosResumen= new JButtonMe();
		this.jButtonBusquedaConsolidadosResumenConsolidadosResumen.setText("Buscar");
		this.jButtonBusquedaConsolidadosResumenConsolidadosResumen.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaConsolidadosResumenConsolidadosResumen,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaConsolidadosResumenConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaConsolidadosResumenConsolidadosResumen = new JLabelMe();
		jLabelidBusquedaConsolidadosResumenConsolidadosResumen.setText("Id :");
		jLabelidBusquedaConsolidadosResumenConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaConsolidadosResumenConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaConsolidadosResumenConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaConsolidadosResumenConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidConsolidadosResumenBusquedaConsolidadosResumen= new JTextFieldMe();
		jLabelidConsolidadosResumenBusquedaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosResumenBusquedaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosResumenBusquedaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidConsolidadosResumenBusquedaConsolidadosResumen.setVisible(false);




		this.jTabbedPaneBusquedasConsolidadosResumen=new JTabbedPane();


		this.jTabbedPaneBusquedasConsolidadosResumen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsolidadosResumen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasConsolidadosResumen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsolidadosResumen = new ConsolidadosResumenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consolidados Resumen DATOS");
			this.jInternalFrameDetalleFormConsolidadosResumen = new ConsolidadosResumenDetalleFormJInternalFrame(jDesktopPane,this.consolidadosresumenSessionBean.getConGuardarRelaciones(),this.consolidadosresumenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsolidadosResumen = null;//new ConsolidadosResumenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsolidadosResumen= new GridBagLayout();
		
		
		this.jTableDatosConsolidadosResumen = new JTableMe();      
		
		String sToolTipConsolidadosResumen="";
		sToolTipConsolidadosResumen=ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsolidadosResumen+="(ActivosFijos.ConsolidadosResumen)";
		}
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsolidadosResumen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsolidadosResumen.setToolTipText(sToolTipConsolidadosResumen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsolidadosResumen);
		this.jTableDatosConsolidadosResumen.setAutoCreateRowSorter(true);
		this.jTableDatosConsolidadosResumen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsolidadosResumen.setRowSelectionAllowed(true);
		this.jTableDatosConsolidadosResumen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsolidadosResumen = new JButtonMe();
		this.jButtonDuplicarConsolidadosResumen = new JButtonMe();
		this.jButtonCopiarConsolidadosResumen = new JButtonMe();
		this.jButtonVerFormConsolidadosResumen = new JButtonMe();
		this.jButtonNuevoRelacionesConsolidadosResumen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen = new JButtonMe();
		this.jButtonCerrarConsolidadosResumen = new JButtonMe();
		
		this.jScrollPanelDatosConsolidadosResumen = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsolidadosResumen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Consolidados Resumen";
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes" + this.sPath));
		} else {
			this.jScrollPanelDatosConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsolidadosResumen.setToolTipText("Acciones");
        this.jPanelAccionesConsolidadosResumen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConsolidadosResumen=new ReporteDinamicoJInternalFrame(ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsolidadosResumen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsolidadosResumen=new ImportacionJInternalFrame(ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsolidadosResumen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsolidadosResumen = new JButtonMe();
		
		this.jButtonAbrirOrderByConsolidadosResumen.setText("Orden");
		this.jButtonAbrirOrderByConsolidadosResumen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsolidadosResumen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsolidadosResumen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosResumen,false,this);
			
			//this.cargarOrderByConsolidadosResumen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsolidadosResumen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsolidadosResumen,true,this);
			
			//this.cargarOrderByConsolidadosResumen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsolidadosResumen.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosConsolidadosResumen.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosConsolidadosResumen.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosConsolidadosResumen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsolidadosResumen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsolidadosResumen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsolidadosResumen.setText("Nuevo");
		this.jButtonDuplicarConsolidadosResumen.setText("Duplicar");
		this.jButtonCopiarConsolidadosResumen.setText("Copiar");
		this.jButtonVerFormConsolidadosResumen.setText("Ver");
		this.jButtonNuevoRelacionesConsolidadosResumen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.setText("Guardar");
		this.jButtonCerrarConsolidadosResumen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsolidadosResumen,"nuevo_button","Nuevo",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsolidadosResumen,"duplicar_button","Duplicar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsolidadosResumen,"copiar_button","Copiar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsolidadosResumen,"ver_form","Ver",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsolidadosResumen,"nuevorelaciones_button","Nuevo Rel",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsolidadosResumen,"guardarcambiostabla_button","Guardar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsolidadosResumen,"cerrar_button","Salir",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsolidadosResumen.setToolTipText("Nuevo"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsolidadosResumen.setToolTipText("Duplicar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsolidadosResumen.setToolTipText("Copiar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsolidadosResumen.setToolTipText("Ver"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsolidadosResumen.setToolTipText("Nuevo Rel"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.setToolTipText("Guardar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsolidadosResumen.setToolTipText("Salir"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsolidadosResumen";
		inputMap = this.jButtonNuevoConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsolidadosResumen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsolidadosResumen"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsolidadosResumen";
		inputMap = this.jButtonDuplicarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsolidadosResumen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsolidadosResumen"));
		
		//COPIAR
		sMapKey = "CopiarConsolidadosResumen";
		inputMap = this.jButtonCopiarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsolidadosResumen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsolidadosResumen"));
		
		//VEr FORM
		sMapKey = "VerFormConsolidadosResumen";
		inputMap = this.jButtonVerFormConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsolidadosResumen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsolidadosResumen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsolidadosResumen";
		inputMap = this.jButtonNuevoRelacionesConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsolidadosResumen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsolidadosResumen";
		inputMap = this.jButtonModificarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsolidadosResumen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsolidadosResumen";
		inputMap = this.jButtonCerrarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsolidadosResumen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsolidadosResumen";
		inputMap = this.jButtonGuardarCambiosTablaConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsolidadosResumen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsolidadosResumen.setName("jPanelParametrosReportesConsolidadosResumen"); 
		
		this.jPanelParametrosReportesAccionesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsolidadosResumen.setName("jPanelParametrosReportesAccionesConsolidadosResumen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsolidadosResumen = new JButtonMe();
		this.jButtonRecargarInformacionConsolidadosResumen.setText("Buscar");
		this.jButtonRecargarInformacionConsolidadosResumen.setToolTipText("Buscar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsolidadosResumen,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionConsolidadosResumen.setVisible(false);
		
		
		this.jButtonProcesarInformacionConsolidadosResumen = new JButtonMe();
		this.jButtonProcesarInformacionConsolidadosResumen.setText("Procesar");
		this.jButtonProcesarInformacionConsolidadosResumen.setToolTipText("Procesar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsolidadosResumen.setVisible(false);
			
		this.jButtonProcesarInformacionConsolidadosResumen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsolidadosResumen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsolidadosResumen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosResumen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsolidadosResumen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosResumen.setText("TIPO");       
		this.jComboBoxTiposReportesConsolidadosResumen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsolidadosResumen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsolidadosResumen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsolidadosResumen.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsolidadosResumen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsolidadosResumen.setText("Accion");
		this.jComboBoxTiposRelacionesConsolidadosResumen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsolidadosResumen.setText("Accion");
		this.jComboBoxTiposAccionesConsolidadosResumen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsolidadosResumen.setText("Accion");
		this.jComboBoxTiposSeleccionarConsolidadosResumen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsolidadosResumen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsolidadosResumen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsolidadosResumen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsolidadosResumen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsolidadosResumen = new JLabelMe();
		
		this.jLabelAccionesConsolidadosResumen.setText("Acciones");		
		this.jLabelAccionesConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsolidadosResumen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsolidadosResumen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsolidadosResumen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsolidadosResumen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsolidadosResumen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsolidadosResumen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsolidadosResumen.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsolidadosResumen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsolidadosResumen = new JButtonMe();
		//this.jButtonAnterioresConsolidadosResumen.setText("<<");
        this.jButtonAnterioresConsolidadosResumen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsolidadosResumen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsolidadosResumen = new JButtonMe();
		//this.jButtonSiguientesConsolidadosResumen.setText(">>");
        this.jButtonSiguientesConsolidadosResumen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsolidadosResumen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsolidadosResumen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsolidadosResumen.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsolidadosResumen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsolidadosResumen,"nuevoguardarcambios_button","Nue",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsolidadosResumen";
		inputMap = this.jButtonNuevoGuardarCambiosConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsolidadosResumen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsolidadosResumen";
		inputMap = this.jButtonRecargarInformacionConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsolidadosResumen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsolidadosResumen";
		inputMap = this.jButtonSiguientesConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsolidadosResumen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsolidadosResumen";
		inputMap = this.jButtonAnterioresConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsolidadosResumen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsolidadosResumen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsolidadosResumen.setMinimumSize(new Dimension(this.getWidth(),ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsolidadosResumen.setMaximumSize(new Dimension(this.getWidth(),ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsolidadosResumen.setPreferredSize(new Dimension(this.getWidth(),ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsolidadosResumenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsolidadosResumen = new GridBagLayout();

			this.jPanelPaginacionConsolidadosResumen.setLayout(gridaBagLayoutPaginacionConsolidadosResumen);						
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 0;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonAnterioresConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					
						
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsolidadosResumen.gridy = 0;
			
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonNuevoGuardarCambiosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
						
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsolidadosResumen.gridy = 0;
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonSiguientesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 1;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonNuevoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
						
			
			
			if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsolidadosResumen.gridy = 1;
				this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConsolidadosResumen.add(this.jButtonGuardarCambiosTablaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			}
			
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 1;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonDuplicarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 1;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonCopiarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 1;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonVerFormConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 1;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsolidadosResumen.add(this.jButtonCerrarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		
		this.jButtonRecargarInformacionConsolidadosResumen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsolidadosResumen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsolidadosResumen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsolidadosResumen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsolidadosResumen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsolidadosResumen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsolidadosResumen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsolidadosResumen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsolidadosResumen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsolidadosResumen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsolidadosResumen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsolidadosResumen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsolidadosResumen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsolidadosResumen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsolidadosResumen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsolidadosResumen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsolidadosResumen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsolidadosResumen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsolidadosResumen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosResumen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosResumen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsolidadosResumen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsolidadosResumen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsolidadosResumen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsolidadosResumen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsolidadosResumen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsolidadosResumen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsolidadosResumen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsolidadosResumen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsolidadosResumen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsolidadosResumen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsolidadosResumen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsolidadosResumen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsolidadosResumen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsolidadosResumen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConsolidadosResumen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConsolidadosResumen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConsolidadosResumen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConsolidadosResumen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsolidadosResumen.setLayout(gridaBagParametrosReportesConsolidadosResumen);
			this.jPanelParametrosReportesAccionesConsolidadosResumen.setLayout(gridaBagParametrosReportesAccionesConsolidadosResumen);
			
			
			this.jPanelParametrosAuxiliar1ConsolidadosResumen.setLayout(gridaBagParametrosAuxiliar1ConsolidadosResumen);
			this.jPanelParametrosAuxiliar2ConsolidadosResumen.setLayout(gridaBagParametrosAuxiliar2ConsolidadosResumen);
			this.jPanelParametrosAuxiliar3ConsolidadosResumen.setLayout(gridaBagParametrosAuxiliar3ConsolidadosResumen);
			this.jPanelParametrosAuxiliar4ConsolidadosResumen.setLayout(gridaBagParametrosAuxiliar4ConsolidadosResumen);
			//this.jPanelParametrosAuxiliar5ConsolidadosResumen.setLayout(gridaBagParametrosAuxiliar2ConsolidadosResumen);			
			
			
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jButtonRecargarInformacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosResumen.add(this.jComboBoxTiposPaginacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosResumen.add(this.jCheckBoxConAltoMaximoTablaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConsolidadosResumen.add(this.jComboBoxTiposArchivosReportesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jPanelParametrosAuxiliar1ConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConsolidadosResumen.add(this.jComboBoxTiposReportesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);																		
			
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConsolidadosResumen.add(this.jComboBoxTiposGraficosReportesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jPanelParametrosAuxiliar4ConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jComboBoxTiposReportesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jCheckBoxGenerarReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jPanelParametrosAuxiliar2ConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jLabelAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsolidadosResumen.add(this.jButtonAbrirOrderByConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jComboBoxTiposSeleccionarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
			
			
			/*
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jCheckBoxSeleccionarTodosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jCheckBoxConGraficoReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosResumen.add(this.jCheckBoxSeleccionarTodosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);															
				
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosResumen.add(this.jCheckBoxSeleccionadosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);															
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsolidadosResumen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConsolidadosResumen.add(this.jCheckBoxConGraficoReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jPanelParametrosAuxiliar3ConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsolidadosResumen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsolidadosResumen.add(this.jComboBoxTiposAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsolidadosResumen = new GridBagLayout();

			this.jScrollPanelDatosConsolidadosResumen.setLayout(gridaBagLayoutDatosConsolidadosResumen);
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = 0;
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;
			
			this.jScrollPanelDatosConsolidadosResumen.add(this.jTableDatosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsolidadosResumen.setViewportView(this.jTableDatosConsolidadosResumen);
		this.jTableDatosConsolidadosResumen.setFillsViewportHeight(true);
		this.jTableDatosConsolidadosResumen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsolidadosResumen= new GridBagLayout();
		this.jPanelAccionesConsolidadosResumen.setLayout(gridaBagLayoutAccionesConsolidadosResumen);
		
		
		/*	
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
			
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonNuevoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen= new GridBagLayout();
		gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaConsolidadosResumenConsolidadosResumen.setLayout(gridaBagLayoutBusquedaConsolidadosResumenConsolidadosResumen);

		gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosResumen.gridy = 0;
		gridBagConstraintsConsolidadosResumen.gridx = 0;
		jPanelBusquedaConsolidadosResumenConsolidadosResumen.add(jLabelidBusquedaConsolidadosResumenConsolidadosResumen, gridBagConstraintsConsolidadosResumen);

		gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosResumen.gridy = 0;
		gridBagConstraintsConsolidadosResumen.gridx = 1;
		jPanelBusquedaConsolidadosResumenConsolidadosResumen.add(jLabelidConsolidadosResumenBusquedaConsolidadosResumen, gridBagConstraintsConsolidadosResumen);

		gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsolidadosResumen.gridy = 1;
		gridBagConstraintsConsolidadosResumen.gridx =1;
		jPanelBusquedaConsolidadosResumenConsolidadosResumen.add(jButtonBusquedaConsolidadosResumenConsolidadosResumen, gridBagConstraintsConsolidadosResumen);

		jTabbedPaneBusquedasConsolidadosResumen.addTab("1.-Por  ", jPanelBusquedaConsolidadosResumenConsolidadosResumen);
		jTabbedPaneBusquedasConsolidadosResumen.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsolidadosResumen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();						
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;		
			//this.gridBagConstraintsConsolidadosResumen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsolidadosResumen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;		
		//this.gridBagConstraintsConsolidadosResumen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsolidadosResumen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;		
			this.gridBagConstraintsConsolidadosResumen.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsolidadosResumen.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);								
		
		
		/*
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		*/		
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosResumen.gridx =0;
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsolidadosResumen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
				
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsolidadosResumen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsolidadosResumen = new GridBagLayout();
			this.jPanelBusquedasParametrosConsolidadosResumen.setLayout(gridaBagLayoutBusquedasParametrosConsolidadosResumen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsolidadosResumen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsolidadosResumen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosResumen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosResumen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsolidadosResumen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsolidadosResumen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsolidadosResumen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsolidadosResumen.setName("jPanelReporteDinamicoConsolidadosResumen"); 
		
		this.jPanelReporteDinamicoConsolidadosResumen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsolidadosResumen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsolidadosResumen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsolidadosResumen.setLayout(gridaBagLayoutReporteDinamicoConsolidadosResumen);
		
		
		this.jInternalFrameReporteDinamicoConsolidadosResumen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsolidadosResumen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsolidadosResumen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsolidadosResumen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsolidadosResumen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsolidadosResumen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsolidadosResumen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsolidadosResumen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsolidadosResumen.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsolidadosResumen.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsolidadosResumen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsolidadosResumen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsolidadosResumen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsolidadosResumen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsolidadosResumen = new JLabelMe();

		this.jLabelColumnasSelectReporteConsolidadosResumen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelColumnasSelectReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsolidadosResumen = new JList<Reporte>();
		this.jListColumnasSelectReporteConsolidadosResumen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsolidadosResumen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsolidadosResumen=new JScrollPane(this.jListColumnasSelectReporteConsolidadosResumen);
			
			this.jScrollColumnasSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsolidadosResumen.add(this.jListColumnasSelectReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jScrollColumnasSelectReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsolidadosResumen = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsolidadosResumen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsolidadosResumen = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsolidadosResumen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsolidadosResumen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsolidadosResumen=new JScrollPane(this.jListRelacionesSelectReporteConsolidadosResumen);
			
			this.jScrollRelacionesSelectReporteConsolidadosResumen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsolidadosResumen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsolidadosResumen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoConsolidadosResumen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsolidadosResumen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsolidadosResumen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsolidadosResumen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsolidadosResumen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsolidadosResumen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsolidadosResumen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConsolidadosResumen = new JLabelMe();

		this.jLabelConGraficoDinamicoConsolidadosResumen.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelConGraficoDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConsolidadosResumen.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConsolidadosResumen.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConsolidadosResumen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsolidadosResumen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsolidadosResumen.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jCheckBoxConGraficoDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConsolidadosResumen = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConsolidadosResumen.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelColumnaCategoriaGraficoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConsolidadosResumen = new JLabelMe();

		this.jLabelColumnaCategoriaValorConsolidadosResumen.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelColumnaCategoriaValorConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConsolidadosResumen.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConsolidadosResumen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConsolidadosResumen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsolidadosResumen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsolidadosResumen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jComboBoxColumnaCategoriaValorConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConsolidadosResumen = new JLabelMe();

		this.jLabelColumnasValoresGraficoConsolidadosResumen.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelColumnasValoresGraficoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConsolidadosResumen = new JList<Reporte>();
		this.jListColumnasValoresGraficoConsolidadosResumen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConsolidadosResumen.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConsolidadosResumen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsolidadosResumen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsolidadosResumen.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConsolidadosResumen=new JScrollPane(this.jListColumnasValoresGraficoConsolidadosResumen);
			
			this.jScrollColumnasValoresGraficoConsolidadosResumen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsolidadosResumen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsolidadosResumen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConsolidadosResumen.add(this.jListColumnasSelectReporteConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jScrollColumnasValoresGraficoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelTiposGraficosReportesDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsolidadosResumen.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jComboBoxTiposGraficosReportesDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelGenerarExcelReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen.setToolTipText("Generar EXCEL"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsolidadosResumen.add(this.jButtonGenerarExcelReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jComboBoxTiposReportesDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jLabelTiposArchivoReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jComboBoxTiposArchivosReportesDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsolidadosResumen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsolidadosResumen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsolidadosResumen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsolidadosResumen.setToolTipText("Generar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jButtonGenerarReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsolidadosResumen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsolidadosResumen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsolidadosResumen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsolidadosResumen.setToolTipText("Cancelar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsolidadosResumen.add(this.jButtonCerrarReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsolidadosResumen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsolidadosResumen= new JScrollPane(jPanelReporteDinamicoConsolidadosResumen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsolidadosResumen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsolidadosResumen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsolidadosResumen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsolidadosResumen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsolidadosResumen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsolidadosResumen);
		this.jInternalFrameReporteDinamicoConsolidadosResumen.getContentPane().add(this.jScrollPanelReporteDinamicoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsolidadosResumen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsolidadosResumen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsolidadosResumen.setName("jPanelImportacionConsolidadosResumen"); 
		
		this.jPanelImportacionConsolidadosResumen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsolidadosResumen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsolidadosResumen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsolidadosResumen.setLayout(gridaBagLayoutImportacionConsolidadosResumen);
		
		
		this.jInternalFrameImportacionConsolidadosResumen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsolidadosResumen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsolidadosResumen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsolidadosResumen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsolidadosResumen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsolidadosResumen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsolidadosResumen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsolidadosResumen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsolidadosResumen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsolidadosResumen.setResizable(true);
	    this.jInternalFrameImportacionConsolidadosResumen.setClosable(true);
	    this.jInternalFrameImportacionConsolidadosResumen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsolidadosResumen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsolidadosResumen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsolidadosResumen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsolidadosResumen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsolidadosResumen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsolidadosResumen.setResizable(true);
	    this.jInternalFrameImportacionConsolidadosResumen.setClosable(true);
	    this.jInternalFrameImportacionConsolidadosResumen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsolidadosResumen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsolidadosResumen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsolidadosResumen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsolidadosResumen = new JLabelMe();

		this.jLabelArchivoImportacionConsolidadosResumen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsolidadosResumen.add(this.jLabelArchivoImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsolidadosResumen = new JFileChooser();		
		this.jFileChooserImportacionConsolidadosResumen.setToolTipText("ESCOGER ARCHIVO"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsolidadosResumen = new JButtonMe();
		this.jButtonAbrirImportacionConsolidadosResumen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsolidadosResumen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsolidadosResumen.setToolTipText("Generar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosResumen.add(this.jButtonAbrirImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsolidadosResumen = new JLabelMe();

		this.jLabelPathArchivoImportacionConsolidadosResumen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsolidadosResumen.add(this.jLabelPathArchivoImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsolidadosResumen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsolidadosResumen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsolidadosResumen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsolidadosResumen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosResumen.add(this.jTextFieldPathArchivoImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsolidadosResumen = new JButtonMe();
		this.jButtonGenerarImportacionConsolidadosResumen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsolidadosResumen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsolidadosResumen.setToolTipText("Generar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosResumen.add(this.jButtonGenerarImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsolidadosResumen = new JButtonMe();
		this.jButtonCerrarImportacionConsolidadosResumen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsolidadosResumen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsolidadosResumen.setToolTipText("Cancelar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = iPosYImportacion;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsolidadosResumen.add(this.jButtonCerrarImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsolidadosResumen = new GridBagLayout();
		
		this.jScrollPanelImportacionConsolidadosResumen= new JScrollPane(jPanelImportacionConsolidadosResumen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iPosYImportacion;
		this.gridBagConstraintsConsolidadosResumen.gridx =iPosXImportacion;
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsolidadosResumen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsolidadosResumen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsolidadosResumen);
		this.jInternalFrameImportacionConsolidadosResumen.getContentPane().add(this.jScrollPanelImportacionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsolidadosResumen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsolidadosResumen = new JButtonMe();
			this.jButtonAbrirOrderByConsolidadosResumen.setText("Orden");
			this.jButtonAbrirOrderByConsolidadosResumen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsolidadosResumen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsolidadosResumen";
			inputMap = this.jButtonAbrirOrderByConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsolidadosResumen"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsolidadosResumen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsolidadosResumen.setName("jPanelOrderByConsolidadosResumen"); 
			
			this.jPanelOrderByConsolidadosResumen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsolidadosResumen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsolidadosResumen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsolidadosResumen.setLayout(gridaBagLayoutOrderByConsolidadosResumen);
			
			
			this.jTableDatosConsolidadosResumenOrderBy = new JTableMe();        
			this.jTableDatosConsolidadosResumenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsolidadosResumenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsolidadosResumenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsolidadosResumenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsolidadosResumenOrderBy.setViewportView(this.jTableDatosConsolidadosResumenOrderBy);
			this.jTableDatosConsolidadosResumenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsolidadosResumenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsolidadosResumen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsolidadosResumen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsolidadosResumen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsolidadosResumen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsolidadosResumen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsolidadosResumen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsolidadosResumen.setTitle("Orden");
			this.jInternalFrameOrderByConsolidadosResumen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsolidadosResumen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsolidadosResumen.setResizable(true);
			this.jInternalFrameOrderByConsolidadosResumen.setClosable(true);
			this.jInternalFrameOrderByConsolidadosResumen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsolidadosResumen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsolidadosResumen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsolidadosResumen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsolidadosResumen.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsolidadosResumen.ipady =150;
				
			this.jPanelOrderByConsolidadosResumen.add(jScrollPanelDatosConsolidadosResumenOrderBy, this.gridBagConstraintsConsolidadosResumen);//this.jTableDatosConsolidadosResumenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsolidadosResumen = new JButtonMe();
			this.jButtonCerrarOrderByConsolidadosResumen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsolidadosResumen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsolidadosResumen.setToolTipText("Cancelar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsolidadosResumen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsolidadosResumen.add(this.jButtonCerrarOrderByConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsolidadosResumen = new GridBagLayout();
			
			this.jScrollPanelOrderByConsolidadosResumen= new JScrollPane(jPanelOrderByConsolidadosResumen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsolidadosResumen.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsolidadosResumen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsolidadosResumen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsolidadosResumen);
			
			this.jInternalFrameOrderByConsolidadosResumen.getContentPane().add(this.jScrollPanelOrderByConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
		
		} else {
			this.jButtonAbrirOrderByConsolidadosResumen = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.consolidadosresumenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsolidadosResumen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsolidadosResumen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosConsolidadosResumen.getRowHeight();//ConsolidadosResumenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.isSelected()) {
					iHeightTable=ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsolidadosResumen.isSelected()) {
					iHeightTable=ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsolidadosResumenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsolidadosResumen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsolidadosResumen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsolidadosResumen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsolidadosResumen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsolidadosResumen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsolidadosResumen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsolidadosResumen!=null && this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy()!=null) {
			//if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsolidadosResumen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsolidadosResumen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsolidadosResumen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsolidadosResumen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsolidadosResumen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsolidadosResumen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsolidadosResumen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=consolidadosresumenLogic.getConsolidadosResumens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consolidadosresumens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConsolidadosResumen> TraerConsolidadosResumenBeans(List<ConsolidadosResumen> consolidadosresumens,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConsolidadosResumen consolidadosresumen:consolidadosresumens) {
					
				if(!(ConsolidadosResumenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsolidadosResumenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consolidadosresumen.setsDetalleGeneralEntityReporte(ConsolidadosResumenConstantesFunciones.getConsolidadosResumenDescripcion(consolidadosresumen));
										
						
					
						
					
				} else  {
							
					//consolidadosresumen.setsDetalleGeneralEntityReporte(consolidadosresumen.getsDetalleGeneralEntityReporte());
										
				}
				
				//consolidadosresumenbeans.add(consolidadosresumenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consolidadosresumens;
    }
	//PARA REPORTES FIN
}
