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
import com.bydan.erp.activosfijos.util.report.ListadoActivosFijosConstantesFunciones;

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
public class ListadoActivosFijosJInternalFrame extends ListadoActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadoActivosFijos;
	
	protected JMenuBar jmenuBarListadoActivosFijos;
	
	protected JMenu jmenuListadoActivosFijos;
	protected JMenu jmenuDatosListadoActivosFijos;
	protected JMenu jmenuArchivoListadoActivosFijos;
	protected JMenu jmenuAccionesListadoActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoActivosFijos;	
	protected GridBagConstraints gridBagConstraintsListadoActivosFijos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadoActivosFijosDetalleFormJInternalFrame jInternalFrameDetalleFormListadoActivosFijos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadoActivosFijos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadoActivosFijos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoActivosFijosSessionBean listadoactivosfijosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadoActivosFijos> listadoactivosfijoss;		
	public List<ListadoActivosFijos> listadoactivosfijossEliminados;	
	public List<ListadoActivosFijos> listadoactivosfijossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadoActivosFijos;		
	protected JButton jButtonAbrirOrderByListadoActivosFijos;
	
	
	//protected JPanel jPanelOrderByListadoActivosFijos;
	//public JScrollPane jScrollPanelOrderByListadoActivosFijos;	
	//protected JButton jButtonCerrarOrderByListadoActivosFijos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadoActivosFijosLogic listadoactivosfijosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadoActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionListadoActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralListadoActivosFijos;
    
	
	
	//public JScrollPane jScrollPanelDatosListadoActivosFijosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadoActivosFijos;
	//public JScrollPane jScrollPanelImportacionListadoActivosFijos;
	
	
	
	protected JPanel jPanelAccionesListadoActivosFijos;
	
    protected JPanel jPanelPaginacionListadoActivosFijos;
    protected JPanel jPanelParametrosReportesListadoActivosFijos;
	protected JPanel jPanelParametrosReportesAccionesListadoActivosFijos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadoActivosFijos;
	protected JPanel jPanelParametrosAuxiliar2ListadoActivosFijos;
	protected JPanel jPanelParametrosAuxiliar3ListadoActivosFijos;
	protected JPanel jPanelParametrosAuxiliar4ListadoActivosFijos;
	//protected JPanel jPanelParametrosAuxiliar5ListadoActivosFijos;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadoActivosFijos;
	//protected JPanel jPanelImportacionListadoActivosFijos;
	
	
	public JTable jTableDatosListadoActivosFijos;
	
	
	
	//public JTable jTableDatosListadoActivosFijosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadoActivosFijos;
	protected JButton jButtonDuplicarListadoActivosFijos;
	protected JButton jButtonCopiarListadoActivosFijos;
	protected JButton jButtonVerFormListadoActivosFijos;
	protected JButton jButtonNuevoRelacionesListadoActivosFijos;
	protected JButton jButtonModificarListadoActivosFijos;
	
    protected JButton jButtonGuardarCambiosTablaListadoActivosFijos;
	protected JButton jButtonCerrarListadoActivosFijos;
	
	
	protected JButton jButtonRecargarInformacionListadoActivosFijos;
	protected JButton jButtonProcesarInformacionListadoActivosFijos;
	
	
	protected JButton jButtonAnterioresListadoActivosFijos;
	protected JButton jButtonSiguientesListadoActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosListadoActivosFijos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadoActivosFijos;
	//protected JButton jButtonCerrarReporteDinamicoListadoActivosFijos;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadoActivosFijos;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadoActivosFijos;
	//protected JButton jButtonGenerarImportacionListadoActivosFijos;
	//protected JButton jButtonCerrarImportacionListadoActivosFijos;
	//protected JFileChooser jFileChooserImportacionListadoActivosFijos;
	//protected File fileImportacionListadoActivosFijos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoActivosFijos;
	protected JButton jButtonDuplicarToolBarListadoActivosFijos;
	protected JButton jButtonNuevoRelacionesToolBarListadoActivosFijos;
	
	
	public JButton jButtonGuardarCambiosToolBarListadoActivosFijos;
	protected JButton jButtonCopiarToolBarListadoActivosFijos;
	protected JButton jButtonVerFormToolBarListadoActivosFijos;
	public JButton jButtonGuardarCambiosTablaToolBarListadoActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoActivosFijos;
	protected JButton jButtonCerrarToolBarListadoActivosFijos;
	
	protected JButton jButtonRecargarInformacionToolBarListadoActivosFijos;
	protected JButton jButtonProcesarInformacionToolBarListadoActivosFijos;
	protected JButton jButtonAnterioresToolBarListadoActivosFijos;
	protected JButton jButtonSiguientesToolBarListadoActivosFijos;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadoActivosFijos;
	protected JButton jButtonAbrirOrderByToolBarListadoActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoActivosFijos;
	protected JMenuItem jMenuItemDuplicarListadoActivosFijos;
	protected JMenuItem jMenuItemNuevoRelacionesListadoActivosFijos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadoActivosFijos;
	protected JMenuItem jMenuItemCopiarListadoActivosFijos;
	protected JMenuItem jMenuItemVerFormListadoActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoActivosFijos;
	protected JMenuItem jMenuItemCerrarListadoActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarListadoActivosFijos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadoActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoActivosFijos;
	
	protected JMenuItem jMenuItemRecargarInformacionListadoActivosFijos;
	protected JMenuItem jMenuItemProcesarInformacionListadoActivosFijos;
	protected JMenuItem jMenuItemAnterioresListadoActivosFijos;
	protected JMenuItem jMenuItemSiguientesListadoActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoActivosFijos;
	protected JMenuItem jMenuItemAbrirOrderByListadoActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarListadoActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoActivosFijos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadoActivosFijos;
	protected JCheckBox jCheckBoxSeleccionadosListadoActivosFijos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadoActivosFijos;
	protected JCheckBox jCheckBoxConGraficoReporteListadoActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadoActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadoActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadoActivosFijos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadoActivosFijos;
	protected JTextField jTextFieldValorCampoGeneralListadoActivosFijos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadoActivosFijos;
	//public JList<Reporte> jListColumnasSelectReporteListadoActivosFijos;
	//public JScrollPane jScrollColumnasSelectReporteListadoActivosFijos;
	
	//public JLabel jLabelRelacionesSelectReporteListadoActivosFijos;
	//public JList<Reporte> jListRelacionesSelectReporteListadoActivosFijos;
	//public JScrollPane jScrollRelacionesSelectReporteListadoActivosFijos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadoActivosFijos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadoActivosFijos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadoActivosFijos;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadoActivosFijos;
	
		
	//public JLabel jLabelArchivoImportacionListadoActivosFijos;	
	//public JLabel jLabelPathArchivoImportacionListadoActivosFijos;
	//protected JTextField jTextFieldPathArchivoImportacionListadoActivosFijos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadoActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadoActivosFijos;
	
	//public JLabel jLabelColumnaCategoriaValorListadoActivosFijos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadoActivosFijos;
	
	//public JLabel jLabelColumnasValoresGraficoListadoActivosFijos;
	//public JList<Reporte> jListColumnasValoresGraficoListadoActivosFijos;
	//public JScrollPane jScrollColumnasValoresGraficoListadoActivosFijos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadoActivosFijos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadoActivosFijos;
	public JPanel jPanelBusquedaListadoActivosFijosListadoActivosFijos;
	public JButton jButtonBusquedaListadoActivosFijosListadoActivosFijos;
	
	public JPanel jPanelIdIdBusquedaListadoActivosFijosListadoActivosFijos;
	public JLabel jLabelidBusquedaListadoActivosFijosListadoActivosFijos;
	public JTextFieldMe jLabelidListadoActivosFijosBusquedaListadoActivosFijos;
	public JButton jButtonidBusquedaListadoActivosFijosListadoActivosFijosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadoActivosFijosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoActivosFijosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadoActivosFijos)	{
		this.jButtonRecargarInformacionListadoActivosFijos = jButtonRecargarInformacionListadoActivosFijos;
	}
	
	public JButton getjButtonProcesarInformacionListadoActivosFijos() {
		return this.jButtonProcesarInformacionListadoActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoActivosFijos)	{
		this.jButtonProcesarInformacionListadoActivosFijos = jButtonProcesarInformacionListadoActivosFijos;
	}
	
	
	public JButton getjButtonRecargarInformacionListadoActivosFijos() {
		return this.jButtonRecargarInformacionListadoActivosFijos;
	}
	
	
	public List<ListadoActivosFijos> getlistadoactivosfijoss() {
		return this.listadoactivosfijoss;
	}

	public void setlistadoactivosfijoss(List<ListadoActivosFijos> listadoactivosfijoss) {
		this.listadoactivosfijoss = listadoactivosfijoss;
	}
	
	public List<ListadoActivosFijos> getlistadoactivosfijossAux() {
		return this.listadoactivosfijossAux;
	}

	public void setlistadoactivosfijossAux(List<ListadoActivosFijos> listadoactivosfijossAux) {
		this.listadoactivosfijossAux = listadoactivosfijossAux;
	}
	
	public List<ListadoActivosFijos> getlistadoactivosfijossEliminados() {
		return this.listadoactivosfijossEliminados;
	}

	public void setListadoActivosFijossEliminados(List<ListadoActivosFijos> listadoactivosfijossEliminados) {
		this.listadoactivosfijossEliminados = listadoactivosfijossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadoActivosFijos() {
		return jComboBoxTiposSeleccionarListadoActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadoActivosFijos(
			JComboBox jComboBoxTiposSeleccionarListadoActivosFijos) {
		this.jComboBoxTiposSeleccionarListadoActivosFijos = jComboBoxTiposSeleccionarListadoActivosFijos;
	}
	
	public void setBorderResaltarTiposSeleccionarListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadoActivosFijos() {
		return jTextFieldValorCampoGeneralListadoActivosFijos;
	}

	public void setjTextFieldValorCampoGeneralListadoActivosFijos(
			JTextField jTextFieldValorCampoGeneralListadoActivosFijos) {
		this.jTextFieldValorCampoGeneralListadoActivosFijos = jTextFieldValorCampoGeneralListadoActivosFijos;
	}

	public void setBorderResaltarValorCampoGeneralListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadoActivosFijos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadoActivosFijos() {
		return this.jCheckBoxSeleccionarTodosListadoActivosFijos;
	}

	public void setjCheckBoxSeleccionarTodosListadoActivosFijos(
			JCheckBox jCheckBoxSeleccionarTodosListadoActivosFijos) {
		this.jCheckBoxSeleccionarTodosListadoActivosFijos = jCheckBoxSeleccionarTodosListadoActivosFijos;
	}

	public void setBorderResaltarSeleccionarTodosListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadoActivosFijos() {
		return this.jCheckBoxSeleccionadosListadoActivosFijos;
	}

	public void setjCheckBoxSeleccionadosListadoActivosFijos(
			JCheckBox jCheckBoxSeleccionadosListadoActivosFijos) {
		this.jCheckBoxSeleccionadosListadoActivosFijos = jCheckBoxSeleccionadosListadoActivosFijos;
	}
	
	public void setBorderResaltarSeleccionadosListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadoActivosFijos() {
		return this.jComboBoxTiposArchivosReportesListadoActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadoActivosFijos(
			JComboBox jComboBoxTiposArchivosReportesListadoActivosFijos) {
		this.jComboBoxTiposArchivosReportesListadoActivosFijos = jComboBoxTiposArchivosReportesListadoActivosFijos;
	}

	public void setBorderResaltarTiposArchivosReportesListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadoActivosFijos() {
		return this.jComboBoxTiposReportesListadoActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadoActivosFijos(
			JComboBox jComboBoxTiposReportesListadoActivosFijos) {
		this.jComboBoxTiposReportesListadoActivosFijos = jComboBoxTiposReportesListadoActivosFijos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadoActivosFijos() {
	//	return jComboBoxTiposReportesDinamicoListadoActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadoActivosFijos(
	//		JComboBox jComboBoxTiposReportesDinamicoListadoActivosFijos) {
	//	this.jComboBoxTiposReportesDinamicoListadoActivosFijos = jComboBoxTiposReportesDinamicoListadoActivosFijos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadoActivosFijos() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadoActivosFijos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos = jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos;
	//}
	
	public void setBorderResaltarTiposReportesListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadoActivosFijos() {
		return this.jComboBoxTiposGraficosReportesListadoActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadoActivosFijos(
			JComboBox jComboBoxTiposGraficosReportesListadoActivosFijos) {
		this.jComboBoxTiposGraficosReportesListadoActivosFijos = jComboBoxTiposGraficosReportesListadoActivosFijos;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadoActivosFijos() {
		return this.jComboBoxTiposPaginacionListadoActivosFijos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadoActivosFijos(
			JComboBox jComboBoxTiposPaginacionListadoActivosFijos) {
		this.jComboBoxTiposPaginacionListadoActivosFijos = jComboBoxTiposPaginacionListadoActivosFijos;
	}
	
	public void setBorderResaltarTiposPaginacionListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadoActivosFijos() {
		return this.jComboBoxTiposRelacionesListadoActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoActivosFijos() {
		return this.jComboBoxTiposAccionesListadoActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoActivosFijos(
			JComboBox jComboBoxTiposRelacionesListadoActivosFijos) {
		this.jComboBoxTiposRelacionesListadoActivosFijos = jComboBoxTiposRelacionesListadoActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoActivosFijos(
			JComboBox jComboBoxTiposAccionesListadoActivosFijos) {
		this.jComboBoxTiposAccionesListadoActivosFijos = jComboBoxTiposAccionesListadoActivosFijos;
	}
	
	public void setBorderResaltarTiposRelacionesListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadoActivosFijos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadoActivosFijos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadoActivosFijos() {
	//	return jCheckBoxConGraficoDinamicoListadoActivosFijos;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadoActivosFijos(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadoActivosFijos) {
	//	this.jCheckBoxConGraficoDinamicoListadoActivosFijos = jCheckBoxConGraficoDinamicoListadoActivosFijos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadoActivosFijos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadoActivosFijos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadoActivosFijos .setBorder(borderResaltar);		
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
		this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
		
		this.listadoactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoactivosfijosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadoActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadoActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadoActivosFijos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"nuevo","nuevo","Nuevo"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"duplicar","duplicar","Duplicar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"copiar","copiar","Copiar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"ver_form","ver_form","Ver"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"recargar","recargar","Buscar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadoActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadoActivosFijos,this.jTtoolBarListadoActivosFijos,
							"cerrar","cerrar","Salir"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadoActivosFijos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadoActivosFijos;
			
				this.jButtonProcesarInformacionToolBarListadoActivosFijos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadoActivosFijos;
				
		//protected JButton jButtonModificarToolBarListadoActivosFijos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadoActivosFijos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadoActivosFijos=new JMenuMe("General");
		this.jmenuArchivoListadoActivosFijos=new JMenuMe("Archivo");
		this.jmenuAccionesListadoActivosFijos=new JMenuMe("Acciones");
		this.jmenuDatosListadoActivosFijos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadoActivosFijos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadoActivosFijos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadoActivosFijos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadoActivosFijos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadoActivosFijos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadoActivosFijos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadoActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadoActivosFijos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadoActivosFijos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadoActivosFijos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadoActivosFijos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadoActivosFijos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadoActivosFijos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadoActivosFijos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadoActivosFijos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadoActivosFijos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadoActivosFijos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadoActivosFijos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadoActivosFijos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadoActivosFijos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadoActivosFijos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadoActivosFijos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadoActivosFijos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadoActivosFijos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadoActivosFijos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadoActivosFijos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadoActivosFijos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadoActivosFijos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadoActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadoActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadoActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadoActivosFijos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadoActivosFijos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadoActivosFijos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadoActivosFijos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadoActivosFijos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadoActivosFijos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadoActivosFijos.add(this.jMenuItemCerrarListadoActivosFijos);
			
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemNuevoListadoActivosFijos);
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemNuevoGuardarCambiosListadoActivosFijos);
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemNuevoRelacionesListadoActivosFijos);
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemGuardarCambiosTablaListadoActivosFijos);		
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemDuplicarListadoActivosFijos);		
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemCopiarListadoActivosFijos);		
			this.jmenuAccionesListadoActivosFijos.add(this.jMenuItemVerFormListadoActivosFijos);		
			
			this.jmenuDatosListadoActivosFijos.add(this.jMenuItemRecargarInformacionListadoActivosFijos);				
			this.jmenuDatosListadoActivosFijos.add(this.jMenuItemAnterioresListadoActivosFijos);				
			this.jmenuDatosListadoActivosFijos.add(this.jMenuItemSiguientesListadoActivosFijos);				
			this.jmenuDatosListadoActivosFijos.add(this.jMenuItemAbrirOrderByListadoActivosFijos);				
			this.jmenuDatosListadoActivosFijos.add(this.jMenuItemMostrarOcultarListadoActivosFijos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadoActivosFijos.add(this.jMenuItemGuardarCambiosListadoActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadoActivosFijos.add(this.jmenuArchivoListadoActivosFijos);		
			this.jmenuBarListadoActivosFijos.add(this.jmenuAccionesListadoActivosFijos);		
			this.jmenuBarListadoActivosFijos.add(this.jmenuDatosListadoActivosFijos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadoActivosFijos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadoActivosFijos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadoActivosFijosListadoActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadoActivosFijosListadoActivosFijos.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaListadoActivosFijosListadoActivosFijos= new JButtonMe();
		this.jButtonBusquedaListadoActivosFijosListadoActivosFijos.setText("Buscar");
		this.jButtonBusquedaListadoActivosFijosListadoActivosFijos.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadoActivosFijosListadoActivosFijos,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadoActivosFijosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaListadoActivosFijosListadoActivosFijos = new JLabelMe();
		jLabelidBusquedaListadoActivosFijosListadoActivosFijos.setText("Id :");
		jLabelidBusquedaListadoActivosFijosListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadoActivosFijosListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadoActivosFijosListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaListadoActivosFijosListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidListadoActivosFijosBusquedaListadoActivosFijos= new JTextFieldMe();
		jLabelidListadoActivosFijosBusquedaListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoActivosFijosBusquedaListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoActivosFijosBusquedaListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidListadoActivosFijosBusquedaListadoActivosFijos.setVisible(false);




		this.jTabbedPaneBusquedasListadoActivosFijos=new JTabbedPane();


		this.jTabbedPaneBusquedasListadoActivosFijos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadoActivosFijos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadoActivosFijos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadoActivosFijos = new ListadoActivosFijosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listado Activos Fijos DATOS");
			this.jInternalFrameDetalleFormListadoActivosFijos = new ListadoActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.listadoactivosfijosSessionBean.getConGuardarRelaciones(),this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadoActivosFijos = null;//new ListadoActivosFijosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoActivosFijos= new GridBagLayout();
		
		
		this.jTableDatosListadoActivosFijos = new JTableMe();      
		
		String sToolTipListadoActivosFijos="";
		sToolTipListadoActivosFijos=ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoActivosFijos+="(ActivosFijos.ListadoActivosFijos)";
		}
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoActivosFijos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadoActivosFijos.setToolTipText(sToolTipListadoActivosFijos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadoActivosFijos);
		this.jTableDatosListadoActivosFijos.setAutoCreateRowSorter(true);
		this.jTableDatosListadoActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadoActivosFijos.setRowSelectionAllowed(true);
		this.jTableDatosListadoActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadoActivosFijos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadoActivosFijos = new JButtonMe();
		this.jButtonDuplicarListadoActivosFijos = new JButtonMe();
		this.jButtonCopiarListadoActivosFijos = new JButtonMe();
		this.jButtonVerFormListadoActivosFijos = new JButtonMe();
		this.jButtonNuevoRelacionesListadoActivosFijos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos = new JButtonMe();
		this.jButtonCerrarListadoActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosListadoActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadoActivosFijos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Activos Fijos";
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesListadoActivosFijos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadoActivosFijos=new ReporteDinamicoJInternalFrame(ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadoActivosFijos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadoActivosFijos=new ImportacionJInternalFrame(ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadoActivosFijos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadoActivosFijos = new JButtonMe();
		
		this.jButtonAbrirOrderByListadoActivosFijos.setText("Orden");
		this.jButtonAbrirOrderByListadoActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoActivosFijos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoActivosFijos,false,this);
			
			//this.cargarOrderByListadoActivosFijos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoActivosFijos,true,this);
			
			//this.cargarOrderByListadoActivosFijos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadoActivosFijos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosListadoActivosFijos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosListadoActivosFijos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosListadoActivosFijos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoActivosFijos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoActivosFijos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadoActivosFijos.setText("Nuevo");
		this.jButtonDuplicarListadoActivosFijos.setText("Duplicar");
		this.jButtonCopiarListadoActivosFijos.setText("Copiar");
		this.jButtonVerFormListadoActivosFijos.setText("Ver");
		this.jButtonNuevoRelacionesListadoActivosFijos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.setText("Guardar");
		this.jButtonCerrarListadoActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoActivosFijos,"nuevo_button","Nuevo",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadoActivosFijos,"duplicar_button","Duplicar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadoActivosFijos,"copiar_button","Copiar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadoActivosFijos,"ver_form","Ver",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadoActivosFijos,"nuevorelaciones_button","Nuevo Rel",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoActivosFijos,"guardarcambiostabla_button","Guardar",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoActivosFijos,"cerrar_button","Salir",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadoActivosFijos.setToolTipText("Nuevo"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadoActivosFijos.setToolTipText("Duplicar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadoActivosFijos.setToolTipText("Copiar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadoActivosFijos.setToolTipText("Ver"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadoActivosFijos.setToolTipText("Nuevo Rel"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.setToolTipText("Guardar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoActivosFijos.setToolTipText("Salir"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoActivosFijos";
		inputMap = this.jButtonNuevoListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoActivosFijos"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadoActivosFijos";
		inputMap = this.jButtonDuplicarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadoActivosFijos"));
		
		//COPIAR
		sMapKey = "CopiarListadoActivosFijos";
		inputMap = this.jButtonCopiarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadoActivosFijos"));
		
		//VEr FORM
		sMapKey = "VerFormListadoActivosFijos";
		inputMap = this.jButtonVerFormListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadoActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadoActivosFijos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadoActivosFijos";
		inputMap = this.jButtonNuevoRelacionesListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadoActivosFijos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadoActivosFijos";
		inputMap = this.jButtonModificarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadoActivosFijos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadoActivosFijos";
		inputMap = this.jButtonCerrarListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoActivosFijos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadoActivosFijos.setName("jPanelParametrosReportesListadoActivosFijos"); 
		
		this.jPanelParametrosReportesAccionesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadoActivosFijos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadoActivosFijos.setName("jPanelParametrosReportesAccionesListadoActivosFijos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadoActivosFijos = new JButtonMe();
		this.jButtonRecargarInformacionListadoActivosFijos.setText("Buscar");
		this.jButtonRecargarInformacionListadoActivosFijos.setToolTipText("Buscar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadoActivosFijos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadoActivosFijos.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadoActivosFijos = new JButtonMe();
		this.jButtonProcesarInformacionListadoActivosFijos.setText("Procesar");
		this.jButtonProcesarInformacionListadoActivosFijos.setToolTipText("Procesar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadoActivosFijos.setVisible(false);
			
		this.jButtonProcesarInformacionListadoActivosFijos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoActivosFijos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoActivosFijos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoActivosFijos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadoActivosFijos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoActivosFijos.setText("TIPO");       
		this.jComboBoxTiposReportesListadoActivosFijos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoActivosFijos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadoActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadoActivosFijos.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadoActivosFijos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadoActivosFijos.setText("Accion");
		this.jComboBoxTiposRelacionesListadoActivosFijos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesListadoActivosFijos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadoActivosFijos.setText("Accion");
		this.jComboBoxTiposSeleccionarListadoActivosFijos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadoActivosFijos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadoActivosFijos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoActivosFijos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoActivosFijos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadoActivosFijos = new JLabelMe();
		
		this.jLabelAccionesListadoActivosFijos.setText("Acciones");		
		this.jLabelAccionesListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadoActivosFijos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadoActivosFijos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadoActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadoActivosFijos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadoActivosFijos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadoActivosFijos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadoActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadoActivosFijos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadoActivosFijos = new JButtonMe();
		//this.jButtonAnterioresListadoActivosFijos.setText("<<");
        this.jButtonAnterioresListadoActivosFijos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadoActivosFijos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadoActivosFijos = new JButtonMe();
		//this.jButtonSiguientesListadoActivosFijos.setText(">>");
        this.jButtonSiguientesListadoActivosFijos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadoActivosFijos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadoActivosFijos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadoActivosFijos.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadoActivosFijos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadoActivosFijos,"nuevoguardarcambios_button","Nue",this.listadoactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadoActivosFijos";
		inputMap = this.jButtonNuevoGuardarCambiosListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadoActivosFijos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadoActivosFijos";
		inputMap = this.jButtonRecargarInformacionListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadoActivosFijos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadoActivosFijos";
		inputMap = this.jButtonSiguientesListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadoActivosFijos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadoActivosFijos";
		inputMap = this.jButtonAnterioresListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadoActivosFijos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadoActivosFijos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadoActivosFijos.setMinimumSize(new Dimension(this.getWidth(),ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoActivosFijos.setMaximumSize(new Dimension(this.getWidth(),ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoActivosFijos.setPreferredSize(new Dimension(this.getWidth(),ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoActivosFijosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadoActivosFijos = new GridBagLayout();

			this.jPanelPaginacionListadoActivosFijos.setLayout(gridaBagLayoutPaginacionListadoActivosFijos);						
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 0;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonAnterioresListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					
						
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoActivosFijos.gridy = 0;
			
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonNuevoGuardarCambiosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
						
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoActivosFijos.gridy = 0;
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonSiguientesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 1;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonNuevoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
						
			
			
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadoActivosFijos.gridy = 1;
				this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadoActivosFijos.add(this.jButtonGuardarCambiosTablaListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			}
			
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 1;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonDuplicarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 1;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonCopiarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 1;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonVerFormListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 1;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadoActivosFijos.add(this.jButtonCerrarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		
		this.jButtonRecargarInformacionListadoActivosFijos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoActivosFijos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoActivosFijos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadoActivosFijos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoActivosFijos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoActivosFijos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadoActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadoActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadoActivosFijos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoActivosFijos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoActivosFijos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadoActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadoActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadoActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadoActivosFijos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoActivosFijos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoActivosFijos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadoActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadoActivosFijos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoActivosFijos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoActivosFijos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadoActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadoActivosFijos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadoActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadoActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadoActivosFijos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadoActivosFijos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadoActivosFijos.setLayout(gridaBagParametrosReportesListadoActivosFijos);
			this.jPanelParametrosReportesAccionesListadoActivosFijos.setLayout(gridaBagParametrosReportesAccionesListadoActivosFijos);
			
			
			this.jPanelParametrosAuxiliar1ListadoActivosFijos.setLayout(gridaBagParametrosAuxiliar1ListadoActivosFijos);
			this.jPanelParametrosAuxiliar2ListadoActivosFijos.setLayout(gridaBagParametrosAuxiliar2ListadoActivosFijos);
			this.jPanelParametrosAuxiliar3ListadoActivosFijos.setLayout(gridaBagParametrosAuxiliar3ListadoActivosFijos);
			this.jPanelParametrosAuxiliar4ListadoActivosFijos.setLayout(gridaBagParametrosAuxiliar4ListadoActivosFijos);
			//this.jPanelParametrosAuxiliar5ListadoActivosFijos.setLayout(gridaBagParametrosAuxiliar2ListadoActivosFijos);			
			
			
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jButtonRecargarInformacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoActivosFijos.add(this.jComboBoxTiposPaginacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoActivosFijos.add(this.jCheckBoxConAltoMaximoTablaListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoActivosFijos.add(this.jComboBoxTiposArchivosReportesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jPanelParametrosAuxiliar1ListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadoActivosFijos.add(this.jComboBoxTiposReportesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);																		
			
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ListadoActivosFijos.add(this.jComboBoxTiposGraficosReportesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jPanelParametrosAuxiliar4ListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jComboBoxTiposReportesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jCheckBoxGenerarReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jPanelParametrosAuxiliar2ListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jLabelAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadoActivosFijos.add(this.jButtonAbrirOrderByListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jComboBoxTiposSeleccionarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
			
			
			/*
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jCheckBoxSeleccionarTodosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jCheckBoxConGraficoReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoActivosFijos.add(this.jCheckBoxSeleccionarTodosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);															
				
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoActivosFijos.add(this.jCheckBoxSeleccionadosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);															
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoActivosFijos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoActivosFijos.add(this.jCheckBoxConGraficoReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jPanelParametrosAuxiliar3ListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoActivosFijos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoActivosFijos.add(this.jComboBoxTiposAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadoActivosFijos = new GridBagLayout();

			this.jScrollPanelDatosListadoActivosFijos.setLayout(gridaBagLayoutDatosListadoActivosFijos);
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = 0;
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;
			
			this.jScrollPanelDatosListadoActivosFijos.add(this.jTableDatosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadoActivosFijos.setViewportView(this.jTableDatosListadoActivosFijos);
		this.jTableDatosListadoActivosFijos.setFillsViewportHeight(true);
		this.jTableDatosListadoActivosFijos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadoActivosFijos= new GridBagLayout();
		this.jPanelAccionesListadoActivosFijos.setLayout(gridaBagLayoutAccionesListadoActivosFijos);
		
		
		/*	
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = 0;
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
			
		this.jPanelAccionesListadoActivosFijos.add(this.jButtonNuevoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos= new GridBagLayout();
		gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadoActivosFijosListadoActivosFijos.setLayout(gridaBagLayoutBusquedaListadoActivosFijosListadoActivosFijos);

		gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoActivosFijos.gridy = 0;
		gridBagConstraintsListadoActivosFijos.gridx = 0;
		jPanelBusquedaListadoActivosFijosListadoActivosFijos.add(jLabelidBusquedaListadoActivosFijosListadoActivosFijos, gridBagConstraintsListadoActivosFijos);

		gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoActivosFijos.gridy = 0;
		gridBagConstraintsListadoActivosFijos.gridx = 1;
		jPanelBusquedaListadoActivosFijosListadoActivosFijos.add(jLabelidListadoActivosFijosBusquedaListadoActivosFijos, gridBagConstraintsListadoActivosFijos);

		gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoActivosFijos.gridy = 1;
		gridBagConstraintsListadoActivosFijos.gridx =1;
		jPanelBusquedaListadoActivosFijosListadoActivosFijos.add(jButtonBusquedaListadoActivosFijosListadoActivosFijos, gridBagConstraintsListadoActivosFijos);

		jTabbedPaneBusquedasListadoActivosFijos.addTab("1.-Por  ", jPanelBusquedaListadoActivosFijosListadoActivosFijos);
		jTabbedPaneBusquedasListadoActivosFijos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoActivosFijos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;		
			//this.gridBagConstraintsListadoActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoActivosFijos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;		
		//this.gridBagConstraintsListadoActivosFijos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadoActivosFijos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadoActivosFijos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoActivosFijos.gridx = 0;		
			this.gridBagConstraintsListadoActivosFijos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadoActivosFijos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);								
		
		
		/*
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		*/		
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoActivosFijos.gridx =0;
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
				
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadoActivosFijos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoActivosFijos = new GridBagLayout();
			this.jPanelBusquedasParametrosListadoActivosFijos.setLayout(gridaBagLayoutBusquedasParametrosListadoActivosFijos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadoActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
			
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadoActivosFijos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadoActivosFijos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadoActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadoActivosFijos.setName("jPanelReporteDinamicoListadoActivosFijos"); 
		
		this.jPanelReporteDinamicoListadoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadoActivosFijos.setLayout(gridaBagLayoutReporteDinamicoListadoActivosFijos);
		
		
		this.jInternalFrameReporteDinamicoListadoActivosFijos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadoActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadoActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadoActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadoActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadoActivosFijos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadoActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadoActivosFijos.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadoActivosFijos.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadoActivosFijos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadoActivosFijos = new JLabelMe();

		this.jLabelColumnasSelectReporteListadoActivosFijos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelColumnasSelectReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadoActivosFijos = new JList<Reporte>();
		this.jListColumnasSelectReporteListadoActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadoActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadoActivosFijos=new JScrollPane(this.jListColumnasSelectReporteListadoActivosFijos);
			
			this.jScrollColumnasSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadoActivosFijos.add(this.jListColumnasSelectReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jScrollColumnasSelectReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadoActivosFijos = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadoActivosFijos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadoActivosFijos = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadoActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadoActivosFijos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadoActivosFijos=new JScrollPane(this.jListRelacionesSelectReporteListadoActivosFijos);
			
			this.jScrollRelacionesSelectReporteListadoActivosFijos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoActivosFijos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoActivosFijos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadoActivosFijos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadoActivosFijos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadoActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadoActivosFijos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadoActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoListadoActivosFijos = new JLabelMe();

		this.jLabelConGraficoDinamicoListadoActivosFijos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelConGraficoDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoListadoActivosFijos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoListadoActivosFijos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoListadoActivosFijos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoListadoActivosFijos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadoActivosFijos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadoActivosFijos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jCheckBoxConGraficoDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoListadoActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoListadoActivosFijos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelColumnaCategoriaGraficoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorListadoActivosFijos = new JLabelMe();

		this.jLabelColumnaCategoriaValorListadoActivosFijos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelColumnaCategoriaValorListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorListadoActivosFijos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorListadoActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorListadoActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadoActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadoActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jComboBoxColumnaCategoriaValorListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoListadoActivosFijos = new JLabelMe();

		this.jLabelColumnasValoresGraficoListadoActivosFijos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelColumnasValoresGraficoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoListadoActivosFijos = new JList<Reporte>();
		this.jListColumnasValoresGraficoListadoActivosFijos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoListadoActivosFijos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoListadoActivosFijos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadoActivosFijos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadoActivosFijos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoListadoActivosFijos=new JScrollPane(this.jListColumnasValoresGraficoListadoActivosFijos);
			
			this.jScrollColumnasValoresGraficoListadoActivosFijos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadoActivosFijos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadoActivosFijos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoListadoActivosFijos.add(this.jListColumnasSelectReporteListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jScrollColumnasValoresGraficoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelTiposGraficosReportesDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadoActivosFijos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jComboBoxTiposGraficosReportesDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelGenerarExcelReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos.setToolTipText("Generar EXCEL"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadoActivosFijos.add(this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jComboBoxTiposReportesDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jLabelTiposArchivoReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jComboBoxTiposArchivosReportesDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadoActivosFijos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadoActivosFijos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadoActivosFijos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadoActivosFijos.setToolTipText("Generar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jButtonGenerarReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadoActivosFijos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadoActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadoActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadoActivosFijos.setToolTipText("Cancelar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoActivosFijos.add(this.jButtonCerrarReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadoActivosFijos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadoActivosFijos= new JScrollPane(jPanelReporteDinamicoListadoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadoActivosFijos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoActivosFijos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoActivosFijos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadoActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadoActivosFijos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadoActivosFijos);
		this.jInternalFrameReporteDinamicoListadoActivosFijos.getContentPane().add(this.jScrollPanelReporteDinamicoListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadoActivosFijos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadoActivosFijos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadoActivosFijos.setName("jPanelImportacionListadoActivosFijos"); 
		
		this.jPanelImportacionListadoActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadoActivosFijos.setLayout(gridaBagLayoutImportacionListadoActivosFijos);
		
		
		this.jInternalFrameImportacionListadoActivosFijos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadoActivosFijos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadoActivosFijos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoActivosFijos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadoActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoActivosFijos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadoActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionListadoActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionListadoActivosFijos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadoActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoActivosFijos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoActivosFijos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadoActivosFijos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoActivosFijos.setResizable(true);
	    this.jInternalFrameImportacionListadoActivosFijos.setClosable(true);
	    this.jInternalFrameImportacionListadoActivosFijos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadoActivosFijos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoActivosFijos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoActivosFijos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadoActivosFijos = new JLabelMe();

		this.jLabelArchivoImportacionListadoActivosFijos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoActivosFijos.add(this.jLabelArchivoImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadoActivosFijos = new JFileChooser();		
		this.jFileChooserImportacionListadoActivosFijos.setToolTipText("ESCOGER ARCHIVO"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadoActivosFijos = new JButtonMe();
		this.jButtonAbrirImportacionListadoActivosFijos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadoActivosFijos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadoActivosFijos.setToolTipText("Generar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoActivosFijos.add(this.jButtonAbrirImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadoActivosFijos = new JLabelMe();

		this.jLabelPathArchivoImportacionListadoActivosFijos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadoActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoActivosFijos.add(this.jLabelPathArchivoImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadoActivosFijos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadoActivosFijos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoActivosFijos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoActivosFijos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoActivosFijos.add(this.jTextFieldPathArchivoImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadoActivosFijos = new JButtonMe();
		this.jButtonGenerarImportacionListadoActivosFijos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadoActivosFijos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadoActivosFijos.setToolTipText("Generar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoActivosFijos.add(this.jButtonGenerarImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadoActivosFijos = new JButtonMe();
		this.jButtonCerrarImportacionListadoActivosFijos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadoActivosFijos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadoActivosFijos.setToolTipText("Cancelar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoActivosFijos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoActivosFijos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoActivosFijos.add(this.jButtonCerrarImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadoActivosFijos = new GridBagLayout();
		
		this.jScrollPanelImportacionListadoActivosFijos= new JScrollPane(jPanelImportacionListadoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsListadoActivosFijos.gridy =iPosYImportacion;
		this.gridBagConstraintsListadoActivosFijos.gridx =iPosXImportacion;
		this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadoActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadoActivosFijos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadoActivosFijos);
		this.jInternalFrameImportacionListadoActivosFijos.getContentPane().add(this.jScrollPanelImportacionListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadoActivosFijos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadoActivosFijos = new JButtonMe();
			this.jButtonAbrirOrderByListadoActivosFijos.setText("Orden");
			this.jButtonAbrirOrderByListadoActivosFijos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoActivosFijos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadoActivosFijos";
			inputMap = this.jButtonAbrirOrderByListadoActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadoActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadoActivosFijos"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadoActivosFijos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadoActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadoActivosFijos.setName("jPanelOrderByListadoActivosFijos"); 
			
			this.jPanelOrderByListadoActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadoActivosFijos.setLayout(gridaBagLayoutOrderByListadoActivosFijos);
			
			
			this.jTableDatosListadoActivosFijosOrderBy = new JTableMe();        
			this.jTableDatosListadoActivosFijosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadoActivosFijosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadoActivosFijosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadoActivosFijosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadoActivosFijosOrderBy.setViewportView(this.jTableDatosListadoActivosFijosOrderBy);
			this.jTableDatosListadoActivosFijosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadoActivosFijosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadoActivosFijos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadoActivosFijos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadoActivosFijos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadoActivosFijos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadoActivosFijos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadoActivosFijos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadoActivosFijos.setTitle("Orden");
			this.jInternalFrameOrderByListadoActivosFijos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadoActivosFijos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadoActivosFijos.setResizable(true);
			this.jInternalFrameOrderByListadoActivosFijos.setClosable(true);
			this.jInternalFrameOrderByListadoActivosFijos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadoActivosFijos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoActivosFijos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoActivosFijos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadoActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Activos Fijoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadoActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadoActivosFijos.ipady =150;
				
			this.jPanelOrderByListadoActivosFijos.add(jScrollPanelDatosListadoActivosFijosOrderBy, this.gridBagConstraintsListadoActivosFijos);//this.jTableDatosListadoActivosFijosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadoActivosFijos = new JButtonMe();
			this.jButtonCerrarOrderByListadoActivosFijos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadoActivosFijos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadoActivosFijos.setToolTipText("Cancelar"+" "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadoActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoActivosFijos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadoActivosFijos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadoActivosFijos.add(this.jButtonCerrarOrderByListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadoActivosFijos = new GridBagLayout();
			
			this.jScrollPanelOrderByListadoActivosFijos= new JScrollPane(jPanelOrderByListadoActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadoActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsListadoActivosFijos.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadoActivosFijos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoActivosFijos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadoActivosFijos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadoActivosFijos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadoActivosFijos);
			
			this.jInternalFrameOrderByListadoActivosFijos.getContentPane().add(this.jScrollPanelOrderByListadoActivosFijos, this.gridBagConstraintsListadoActivosFijos);			
		
		} else {
			this.jButtonAbrirOrderByListadoActivosFijos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2230
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadoactivosfijosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadoActivosFijos.getRowHeight();//ListadoActivosFijosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.isSelected()) {
					iHeightTable=ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoActivosFijos.isSelected()) {
					iHeightTable=ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoActivosFijosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadoActivosFijos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoActivosFijos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoActivosFijos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadoActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadoActivosFijos!=null && this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy()!=null) {
			//if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadoActivosFijos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadoActivosFijos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadoActivosFijos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadoActivosFijos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoActivosFijos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoActivosFijos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadoactivosfijosLogic.getListadoActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoactivosfijoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadoActivosFijos> TraerListadoActivosFijosBeans(List<ListadoActivosFijos> listadoactivosfijoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijoss) {
					
				if(!(ListadoActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadoActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadoactivosfijos.setsDetalleGeneralEntityReporte(ListadoActivosFijosConstantesFunciones.getListadoActivosFijosDescripcion(listadoactivosfijos));
										
						
					
						
					
				} else  {
							
					//listadoactivosfijos.setsDetalleGeneralEntityReporte(listadoactivosfijos.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadoactivosfijosbeans.add(listadoactivosfijosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadoactivosfijoss;
    }
	//PARA REPORTES FIN
}
