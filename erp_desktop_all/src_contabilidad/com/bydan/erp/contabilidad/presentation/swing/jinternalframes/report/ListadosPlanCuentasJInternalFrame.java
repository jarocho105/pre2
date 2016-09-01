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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.ListadosPlanCuentasConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class ListadosPlanCuentasJInternalFrame extends ListadosPlanCuentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadosPlanCuentas;
	
	protected JMenuBar jmenuBarListadosPlanCuentas;
	
	protected JMenu jmenuListadosPlanCuentas;
	protected JMenu jmenuDatosListadosPlanCuentas;
	protected JMenu jmenuArchivoListadosPlanCuentas;
	protected JMenu jmenuAccionesListadosPlanCuentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadosPlanCuentas;	
	protected GridBagConstraints gridBagConstraintsListadosPlanCuentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadosPlanCuentasDetalleFormJInternalFrame jInternalFrameDetalleFormListadosPlanCuentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadosPlanCuentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadosPlanCuentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadosPlanCuentasSessionBean listadosplancuentasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadosPlanCuentas> listadosplancuentass;		
	public List<ListadosPlanCuentas> listadosplancuentassEliminados;	
	public List<ListadosPlanCuentas> listadosplancuentassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadosPlanCuentas;		
	protected JButton jButtonAbrirOrderByListadosPlanCuentas;
	
	
	//protected JPanel jPanelOrderByListadosPlanCuentas;
	//public JScrollPane jScrollPanelOrderByListadosPlanCuentas;	
	//protected JButton jButtonCerrarOrderByListadosPlanCuentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadosPlanCuentasLogic listadosplancuentasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadosPlanCuentas;
	public JScrollPane jScrollPanelDatosEdicionListadosPlanCuentas;
	public JScrollPane jScrollPanelDatosGeneralListadosPlanCuentas;
    
	
	
	//public JScrollPane jScrollPanelDatosListadosPlanCuentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadosPlanCuentas;
	//public JScrollPane jScrollPanelImportacionListadosPlanCuentas;
	
	
	
	protected JPanel jPanelAccionesListadosPlanCuentas;
	
    protected JPanel jPanelPaginacionListadosPlanCuentas;
    protected JPanel jPanelParametrosReportesListadosPlanCuentas;
	protected JPanel jPanelParametrosReportesAccionesListadosPlanCuentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadosPlanCuentas;
	protected JPanel jPanelParametrosAuxiliar2ListadosPlanCuentas;
	protected JPanel jPanelParametrosAuxiliar3ListadosPlanCuentas;
	protected JPanel jPanelParametrosAuxiliar4ListadosPlanCuentas;
	//protected JPanel jPanelParametrosAuxiliar5ListadosPlanCuentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadosPlanCuentas;
	//protected JPanel jPanelImportacionListadosPlanCuentas;
	
	
	public JTable jTableDatosListadosPlanCuentas;
	
	
	
	//public JTable jTableDatosListadosPlanCuentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadosPlanCuentas;
	protected JButton jButtonDuplicarListadosPlanCuentas;
	protected JButton jButtonCopiarListadosPlanCuentas;
	protected JButton jButtonVerFormListadosPlanCuentas;
	protected JButton jButtonNuevoRelacionesListadosPlanCuentas;
	protected JButton jButtonModificarListadosPlanCuentas;
	
    protected JButton jButtonGuardarCambiosTablaListadosPlanCuentas;
	protected JButton jButtonCerrarListadosPlanCuentas;
	
	
	protected JButton jButtonRecargarInformacionListadosPlanCuentas;
	protected JButton jButtonProcesarInformacionListadosPlanCuentas;
	
	
	protected JButton jButtonAnterioresListadosPlanCuentas;
	protected JButton jButtonSiguientesListadosPlanCuentas;
	protected JButton jButtonNuevoGuardarCambiosListadosPlanCuentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadosPlanCuentas;
	//protected JButton jButtonCerrarReporteDinamicoListadosPlanCuentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadosPlanCuentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadosPlanCuentas;
	//protected JButton jButtonGenerarImportacionListadosPlanCuentas;
	//protected JButton jButtonCerrarImportacionListadosPlanCuentas;
	//protected JFileChooser jFileChooserImportacionListadosPlanCuentas;
	//protected File fileImportacionListadosPlanCuentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadosPlanCuentas;
	protected JButton jButtonDuplicarToolBarListadosPlanCuentas;
	protected JButton jButtonNuevoRelacionesToolBarListadosPlanCuentas;
	
	
	public JButton jButtonGuardarCambiosToolBarListadosPlanCuentas;
	protected JButton jButtonCopiarToolBarListadosPlanCuentas;
	protected JButton jButtonVerFormToolBarListadosPlanCuentas;
	public JButton jButtonGuardarCambiosTablaToolBarListadosPlanCuentas;
	protected JButton jButtonMostrarOcultarTablaToolBarListadosPlanCuentas;
	protected JButton jButtonCerrarToolBarListadosPlanCuentas;
	
	protected JButton jButtonRecargarInformacionToolBarListadosPlanCuentas;
	protected JButton jButtonProcesarInformacionToolBarListadosPlanCuentas;
	protected JButton jButtonAnterioresToolBarListadosPlanCuentas;
	protected JButton jButtonSiguientesToolBarListadosPlanCuentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas;
	protected JButton jButtonAbrirOrderByToolBarListadosPlanCuentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadosPlanCuentas;
	protected JMenuItem jMenuItemDuplicarListadosPlanCuentas;
	protected JMenuItem jMenuItemNuevoRelacionesListadosPlanCuentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadosPlanCuentas;
	protected JMenuItem jMenuItemCopiarListadosPlanCuentas;
	protected JMenuItem jMenuItemVerFormListadosPlanCuentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadosPlanCuentas;
	protected JMenuItem jMenuItemCerrarListadosPlanCuentas;
	protected JMenuItem jMenuItemDetalleCerrarListadosPlanCuentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadosPlanCuentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadosPlanCuentas;
	
	protected JMenuItem jMenuItemRecargarInformacionListadosPlanCuentas;
	protected JMenuItem jMenuItemProcesarInformacionListadosPlanCuentas;
	protected JMenuItem jMenuItemAnterioresListadosPlanCuentas;
	protected JMenuItem jMenuItemSiguientesListadosPlanCuentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadosPlanCuentas;
	protected JMenuItem jMenuItemAbrirOrderByListadosPlanCuentas;
	protected JMenuItem jMenuItemMostrarOcultarListadosPlanCuentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadosPlanCuentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadosPlanCuentas;
	protected JCheckBox jCheckBoxSeleccionadosListadosPlanCuentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadosPlanCuentas;
	protected JCheckBox jCheckBoxConGraficoReporteListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadosPlanCuentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadosPlanCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadosPlanCuentas;
	protected JTextField jTextFieldValorCampoGeneralListadosPlanCuentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadosPlanCuentas;
	//public JList<Reporte> jListColumnasSelectReporteListadosPlanCuentas;
	//public JScrollPane jScrollColumnasSelectReporteListadosPlanCuentas;
	
	//public JLabel jLabelRelacionesSelectReporteListadosPlanCuentas;
	//public JList<Reporte> jListRelacionesSelectReporteListadosPlanCuentas;
	//public JScrollPane jScrollRelacionesSelectReporteListadosPlanCuentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadosPlanCuentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadosPlanCuentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadosPlanCuentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadosPlanCuentas;
	
		
	//public JLabel jLabelArchivoImportacionListadosPlanCuentas;	
	//public JLabel jLabelPathArchivoImportacionListadosPlanCuentas;
	//protected JTextField jTextFieldPathArchivoImportacionListadosPlanCuentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadosPlanCuentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadosPlanCuentas;
	
	//public JLabel jLabelColumnaCategoriaValorListadosPlanCuentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadosPlanCuentas;
	
	//public JLabel jLabelColumnasValoresGraficoListadosPlanCuentas;
	//public JList<Reporte> jListColumnasValoresGraficoListadosPlanCuentas;
	//public JScrollPane jScrollColumnasValoresGraficoListadosPlanCuentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadosPlanCuentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadosPlanCuentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadosPlanCuentas;
	public JPanel jPanelBusquedaListadosPlanCuentasListadosPlanCuentas;
	public JButton jButtonBusquedaListadosPlanCuentasListadosPlanCuentas;
	
	public JPanel jPanelIdIdBusquedaListadosPlanCuentasListadosPlanCuentas;
	public JLabel jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas;
	public JTextFieldMe jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas;
	public JButton jButtonidBusquedaListadosPlanCuentasListadosPlanCuentasBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadosPlanCuentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadosPlanCuentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadosPlanCuentas)	{
		this.jButtonRecargarInformacionListadosPlanCuentas = jButtonRecargarInformacionListadosPlanCuentas;
	}
	
	public JButton getjButtonProcesarInformacionListadosPlanCuentas() {
		return this.jButtonProcesarInformacionListadosPlanCuentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadosPlanCuentas)	{
		this.jButtonProcesarInformacionListadosPlanCuentas = jButtonProcesarInformacionListadosPlanCuentas;
	}
	
	
	public JButton getjButtonRecargarInformacionListadosPlanCuentas() {
		return this.jButtonRecargarInformacionListadosPlanCuentas;
	}
	
	
	public List<ListadosPlanCuentas> getlistadosplancuentass() {
		return this.listadosplancuentass;
	}

	public void setlistadosplancuentass(List<ListadosPlanCuentas> listadosplancuentass) {
		this.listadosplancuentass = listadosplancuentass;
	}
	
	public List<ListadosPlanCuentas> getlistadosplancuentassAux() {
		return this.listadosplancuentassAux;
	}

	public void setlistadosplancuentassAux(List<ListadosPlanCuentas> listadosplancuentassAux) {
		this.listadosplancuentassAux = listadosplancuentassAux;
	}
	
	public List<ListadosPlanCuentas> getlistadosplancuentassEliminados() {
		return this.listadosplancuentassEliminados;
	}

	public void setListadosPlanCuentassEliminados(List<ListadosPlanCuentas> listadosplancuentassEliminados) {
		this.listadosplancuentassEliminados = listadosplancuentassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadosPlanCuentas() {
		return jComboBoxTiposSeleccionarListadosPlanCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadosPlanCuentas(
			JComboBox jComboBoxTiposSeleccionarListadosPlanCuentas) {
		this.jComboBoxTiposSeleccionarListadosPlanCuentas = jComboBoxTiposSeleccionarListadosPlanCuentas;
	}
	
	public void setBorderResaltarTiposSeleccionarListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadosPlanCuentas() {
		return jTextFieldValorCampoGeneralListadosPlanCuentas;
	}

	public void setjTextFieldValorCampoGeneralListadosPlanCuentas(
			JTextField jTextFieldValorCampoGeneralListadosPlanCuentas) {
		this.jTextFieldValorCampoGeneralListadosPlanCuentas = jTextFieldValorCampoGeneralListadosPlanCuentas;
	}

	public void setBorderResaltarValorCampoGeneralListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadosPlanCuentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadosPlanCuentas() {
		return this.jCheckBoxSeleccionarTodosListadosPlanCuentas;
	}

	public void setjCheckBoxSeleccionarTodosListadosPlanCuentas(
			JCheckBox jCheckBoxSeleccionarTodosListadosPlanCuentas) {
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas = jCheckBoxSeleccionarTodosListadosPlanCuentas;
	}

	public void setBorderResaltarSeleccionarTodosListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadosPlanCuentas() {
		return this.jCheckBoxSeleccionadosListadosPlanCuentas;
	}

	public void setjCheckBoxSeleccionadosListadosPlanCuentas(
			JCheckBox jCheckBoxSeleccionadosListadosPlanCuentas) {
		this.jCheckBoxSeleccionadosListadosPlanCuentas = jCheckBoxSeleccionadosListadosPlanCuentas;
	}
	
	public void setBorderResaltarSeleccionadosListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadosPlanCuentas() {
		return this.jComboBoxTiposArchivosReportesListadosPlanCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadosPlanCuentas(
			JComboBox jComboBoxTiposArchivosReportesListadosPlanCuentas) {
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas = jComboBoxTiposArchivosReportesListadosPlanCuentas;
	}

	public void setBorderResaltarTiposArchivosReportesListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadosPlanCuentas() {
		return this.jComboBoxTiposReportesListadosPlanCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadosPlanCuentas(
			JComboBox jComboBoxTiposReportesListadosPlanCuentas) {
		this.jComboBoxTiposReportesListadosPlanCuentas = jComboBoxTiposReportesListadosPlanCuentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadosPlanCuentas() {
	//	return jComboBoxTiposReportesDinamicoListadosPlanCuentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadosPlanCuentas(
	//		JComboBox jComboBoxTiposReportesDinamicoListadosPlanCuentas) {
	//	this.jComboBoxTiposReportesDinamicoListadosPlanCuentas = jComboBoxTiposReportesDinamicoListadosPlanCuentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas = jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas;
	//}
	
	public void setBorderResaltarTiposReportesListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadosPlanCuentas() {
		return this.jComboBoxTiposGraficosReportesListadosPlanCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadosPlanCuentas(
			JComboBox jComboBoxTiposGraficosReportesListadosPlanCuentas) {
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas = jComboBoxTiposGraficosReportesListadosPlanCuentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadosPlanCuentas() {
		return this.jComboBoxTiposPaginacionListadosPlanCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadosPlanCuentas(
			JComboBox jComboBoxTiposPaginacionListadosPlanCuentas) {
		this.jComboBoxTiposPaginacionListadosPlanCuentas = jComboBoxTiposPaginacionListadosPlanCuentas;
	}
	
	public void setBorderResaltarTiposPaginacionListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadosPlanCuentas() {
		return this.jComboBoxTiposRelacionesListadosPlanCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadosPlanCuentas() {
		return this.jComboBoxTiposAccionesListadosPlanCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadosPlanCuentas(
			JComboBox jComboBoxTiposRelacionesListadosPlanCuentas) {
		this.jComboBoxTiposRelacionesListadosPlanCuentas = jComboBoxTiposRelacionesListadosPlanCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadosPlanCuentas(
			JComboBox jComboBoxTiposAccionesListadosPlanCuentas) {
		this.jComboBoxTiposAccionesListadosPlanCuentas = jComboBoxTiposAccionesListadosPlanCuentas;
	}
	
	public void setBorderResaltarTiposRelacionesListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadosPlanCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadosPlanCuentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadosPlanCuentas() {
	//	return jCheckBoxConGraficoDinamicoListadosPlanCuentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadosPlanCuentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadosPlanCuentas) {
	//	this.jCheckBoxConGraficoDinamicoListadosPlanCuentas = jCheckBoxConGraficoDinamicoListadosPlanCuentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadosPlanCuentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadosPlanCuentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadosPlanCuentas .setBorder(borderResaltar);		
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
		this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
		
		this.listadosplancuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosplancuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadosplancuentasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadosPlanCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadosPlanCuentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listados Plan Cuentas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadosPlanCuentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadosPlanCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadosPlanCuentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"nuevo","nuevo","Nuevo"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"duplicar","duplicar","Duplicar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"copiar","copiar","Copiar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"ver_form","ver_form","Ver"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"recargar","recargar","Buscar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadosPlanCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,
							"cerrar","cerrar","Salir"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadosPlanCuentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadosPlanCuentas;
			
				this.jButtonProcesarInformacionToolBarListadosPlanCuentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadosPlanCuentas;
				
		//protected JButton jButtonModificarToolBarListadosPlanCuentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadosPlanCuentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadosPlanCuentas=new JMenuMe("General");
		this.jmenuArchivoListadosPlanCuentas=new JMenuMe("Archivo");
		this.jmenuAccionesListadosPlanCuentas=new JMenuMe("Acciones");
		this.jmenuDatosListadosPlanCuentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadosPlanCuentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadosPlanCuentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadosPlanCuentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadosPlanCuentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadosPlanCuentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadosPlanCuentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadosPlanCuentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadosPlanCuentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadosPlanCuentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadosPlanCuentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadosPlanCuentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadosPlanCuentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadosPlanCuentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadosPlanCuentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadosPlanCuentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadosPlanCuentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadosPlanCuentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadosPlanCuentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadosPlanCuentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadosPlanCuentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadosPlanCuentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadosPlanCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadosPlanCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadosPlanCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadosPlanCuentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadosPlanCuentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadosPlanCuentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadosPlanCuentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadosPlanCuentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadosPlanCuentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadosPlanCuentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadosPlanCuentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadosPlanCuentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadosPlanCuentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadosPlanCuentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadosPlanCuentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadosPlanCuentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadosPlanCuentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadosPlanCuentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadosPlanCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadosPlanCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadosPlanCuentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadosPlanCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadosPlanCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadosPlanCuentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadosPlanCuentas.add(this.jMenuItemCerrarListadosPlanCuentas);
			
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemNuevoListadosPlanCuentas);
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas);
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemNuevoRelacionesListadosPlanCuentas);
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemGuardarCambiosTablaListadosPlanCuentas);		
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemDuplicarListadosPlanCuentas);		
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemCopiarListadosPlanCuentas);		
			this.jmenuAccionesListadosPlanCuentas.add(this.jMenuItemVerFormListadosPlanCuentas);		
			
			this.jmenuDatosListadosPlanCuentas.add(this.jMenuItemRecargarInformacionListadosPlanCuentas);				
			this.jmenuDatosListadosPlanCuentas.add(this.jMenuItemAnterioresListadosPlanCuentas);				
			this.jmenuDatosListadosPlanCuentas.add(this.jMenuItemSiguientesListadosPlanCuentas);				
			this.jmenuDatosListadosPlanCuentas.add(this.jMenuItemAbrirOrderByListadosPlanCuentas);				
			this.jmenuDatosListadosPlanCuentas.add(this.jMenuItemMostrarOcultarListadosPlanCuentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadosPlanCuentas.add(this.jMenuItemGuardarCambiosListadosPlanCuentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadosPlanCuentas.add(this.jmenuArchivoListadosPlanCuentas);		
			this.jmenuBarListadosPlanCuentas.add(this.jmenuAccionesListadosPlanCuentas);		
			this.jmenuBarListadosPlanCuentas.add(this.jmenuDatosListadosPlanCuentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadosPlanCuentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadosPlanCuentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas= new JButtonMe();
		this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas.setText("Buscar");
		this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas = new JLabelMe();
		jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas.setText("Id :");
		jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-9),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas= new JTextFieldMe();
		jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas.setVisible(false);




		this.jTabbedPaneBusquedasListadosPlanCuentas=new JTabbedPane();


		this.jTabbedPaneBusquedasListadosPlanCuentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosPlanCuentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadosPlanCuentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadosPlanCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadosPlanCuentas = new ListadosPlanCuentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listados Plan Cuentas DATOS");
			this.jInternalFrameDetalleFormListadosPlanCuentas = new ListadosPlanCuentasDetalleFormJInternalFrame(jDesktopPane,this.listadosplancuentasSessionBean.getConGuardarRelaciones(),this.listadosplancuentasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadosPlanCuentas = null;//new ListadosPlanCuentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadosPlanCuentas= new GridBagLayout();
		
		
		this.jTableDatosListadosPlanCuentas = new JTableMe();      
		
		String sToolTipListadosPlanCuentas="";
		sToolTipListadosPlanCuentas=ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadosPlanCuentas+="(Contabilidad.ListadosPlanCuentas)";
		}
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadosPlanCuentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadosPlanCuentas.setToolTipText(sToolTipListadosPlanCuentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadosPlanCuentas);
		this.jTableDatosListadosPlanCuentas.setAutoCreateRowSorter(true);
		this.jTableDatosListadosPlanCuentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadosPlanCuentas.setRowSelectionAllowed(true);
		this.jTableDatosListadosPlanCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadosPlanCuentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadosPlanCuentas = new JButtonMe();
		this.jButtonDuplicarListadosPlanCuentas = new JButtonMe();
		this.jButtonCopiarListadosPlanCuentas = new JButtonMe();
		this.jButtonVerFormListadosPlanCuentas = new JButtonMe();
		this.jButtonNuevoRelacionesListadosPlanCuentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas = new JButtonMe();
		this.jButtonCerrarListadosPlanCuentas = new JButtonMe();
		
		this.jScrollPanelDatosListadosPlanCuentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadosPlanCuentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listados Plan Cuentas";
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases" + this.sPath));
		} else {
			this.jScrollPanelDatosListadosPlanCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadosPlanCuentas.setToolTipText("Acciones");
        this.jPanelAccionesListadosPlanCuentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadosPlanCuentas=new ReporteDinamicoJInternalFrame(ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadosPlanCuentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadosPlanCuentas=new ImportacionJInternalFrame(ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadosPlanCuentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadosPlanCuentas = new JButtonMe();
		
		this.jButtonAbrirOrderByListadosPlanCuentas.setText("Orden");
		this.jButtonAbrirOrderByListadosPlanCuentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosPlanCuentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosPlanCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosPlanCuentas,false,this);
			
			//this.cargarOrderByListadosPlanCuentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadosPlanCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosPlanCuentas,true,this);
			
			//this.cargarOrderByListadosPlanCuentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadosPlanCuentas.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosListadosPlanCuentas.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosListadosPlanCuentas.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosListadosPlanCuentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosPlanCuentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadosPlanCuentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadosPlanCuentas.setText("Nuevo");
		this.jButtonDuplicarListadosPlanCuentas.setText("Duplicar");
		this.jButtonCopiarListadosPlanCuentas.setText("Copiar");
		this.jButtonVerFormListadosPlanCuentas.setText("Ver");
		this.jButtonNuevoRelacionesListadosPlanCuentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.setText("Guardar");
		this.jButtonCerrarListadosPlanCuentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadosPlanCuentas,"nuevo_button","Nuevo",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadosPlanCuentas,"duplicar_button","Duplicar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadosPlanCuentas,"copiar_button","Copiar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadosPlanCuentas,"ver_form","Ver",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadosPlanCuentas,"nuevorelaciones_button","Nuevo Rel",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadosPlanCuentas,"guardarcambiostabla_button","Guardar",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadosPlanCuentas,"cerrar_button","Salir",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadosPlanCuentas.setToolTipText("Nuevo"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadosPlanCuentas.setToolTipText("Duplicar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadosPlanCuentas.setToolTipText("Copiar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadosPlanCuentas.setToolTipText("Ver"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadosPlanCuentas.setToolTipText("Nuevo Rel"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.setToolTipText("Guardar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadosPlanCuentas.setToolTipText("Salir"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadosPlanCuentas";
		inputMap = this.jButtonNuevoListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadosPlanCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadosPlanCuentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadosPlanCuentas";
		inputMap = this.jButtonDuplicarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadosPlanCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadosPlanCuentas"));
		
		//COPIAR
		sMapKey = "CopiarListadosPlanCuentas";
		inputMap = this.jButtonCopiarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadosPlanCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadosPlanCuentas"));
		
		//VEr FORM
		sMapKey = "VerFormListadosPlanCuentas";
		inputMap = this.jButtonVerFormListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadosPlanCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadosPlanCuentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadosPlanCuentas";
		inputMap = this.jButtonNuevoRelacionesListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadosPlanCuentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadosPlanCuentas";
		inputMap = this.jButtonModificarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadosPlanCuentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadosPlanCuentas";
		inputMap = this.jButtonCerrarListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadosPlanCuentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadosPlanCuentas";
		inputMap = this.jButtonGuardarCambiosTablaListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadosPlanCuentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadosPlanCuentas.setName("jPanelParametrosReportesListadosPlanCuentas"); 
		
		this.jPanelParametrosReportesAccionesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadosPlanCuentas.setName("jPanelParametrosReportesAccionesListadosPlanCuentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadosPlanCuentas = new JButtonMe();
		this.jButtonRecargarInformacionListadosPlanCuentas.setText("Buscar");
		this.jButtonRecargarInformacionListadosPlanCuentas.setToolTipText("Buscar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadosPlanCuentas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadosPlanCuentas.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadosPlanCuentas = new JButtonMe();
		this.jButtonProcesarInformacionListadosPlanCuentas.setText("Procesar");
		this.jButtonProcesarInformacionListadosPlanCuentas.setToolTipText("Procesar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadosPlanCuentas.setVisible(false);
			
		this.jButtonProcesarInformacionListadosPlanCuentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosPlanCuentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadosPlanCuentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setText("TIPO");       
		this.jComboBoxTiposReportesListadosPlanCuentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadosPlanCuentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadosPlanCuentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadosPlanCuentas.setText("Accion");
		this.jComboBoxTiposRelacionesListadosPlanCuentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadosPlanCuentas.setText("Accion");
		this.jComboBoxTiposAccionesListadosPlanCuentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadosPlanCuentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadosPlanCuentas.setText("Accion");
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadosPlanCuentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadosPlanCuentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosPlanCuentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadosPlanCuentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadosPlanCuentas = new JLabelMe();
		
		this.jLabelAccionesListadosPlanCuentas.setText("Acciones");		
		this.jLabelAccionesListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadosPlanCuentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadosPlanCuentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadosPlanCuentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadosPlanCuentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadosPlanCuentas.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadosPlanCuentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadosPlanCuentas = new JButtonMe();
		//this.jButtonAnterioresListadosPlanCuentas.setText("<<");
        this.jButtonAnterioresListadosPlanCuentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadosPlanCuentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadosPlanCuentas = new JButtonMe();
		//this.jButtonSiguientesListadosPlanCuentas.setText(">>");
        this.jButtonSiguientesListadosPlanCuentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadosPlanCuentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadosPlanCuentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadosPlanCuentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadosPlanCuentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadosPlanCuentas,"nuevoguardarcambios_button","Nue",this.listadosplancuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadosPlanCuentas";
		inputMap = this.jButtonNuevoGuardarCambiosListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadosPlanCuentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadosPlanCuentas";
		inputMap = this.jButtonRecargarInformacionListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadosPlanCuentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadosPlanCuentas";
		inputMap = this.jButtonSiguientesListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadosPlanCuentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadosPlanCuentas";
		inputMap = this.jButtonAnterioresListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadosPlanCuentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadosPlanCuentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadosPlanCuentas.setMinimumSize(new Dimension(this.getWidth(),ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosPlanCuentas.setMaximumSize(new Dimension(this.getWidth(),ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadosPlanCuentas.setPreferredSize(new Dimension(this.getWidth(),ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadosPlanCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadosPlanCuentas = new GridBagLayout();

			this.jPanelPaginacionListadosPlanCuentas.setLayout(gridaBagLayoutPaginacionListadosPlanCuentas);						
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonAnterioresListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					
						
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
			
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonNuevoGuardarCambiosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
						
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonSiguientesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonNuevoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
						
			
			
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
				this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
				this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonGuardarCambiosTablaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			}
			
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonDuplicarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonCopiarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonVerFormListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 1;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadosPlanCuentas.add(this.jButtonCerrarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
		
		
		this.jButtonRecargarInformacionListadosPlanCuentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosPlanCuentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadosPlanCuentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadosPlanCuentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadosPlanCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosPlanCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadosPlanCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadosPlanCuentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadosPlanCuentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosPlanCuentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadosPlanCuentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadosPlanCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosPlanCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadosPlanCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadosPlanCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosPlanCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadosPlanCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadosPlanCuentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosPlanCuentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadosPlanCuentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadosPlanCuentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosPlanCuentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadosPlanCuentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadosPlanCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadosPlanCuentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadosPlanCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadosPlanCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadosPlanCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadosPlanCuentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadosPlanCuentas.setLayout(gridaBagParametrosReportesListadosPlanCuentas);
			this.jPanelParametrosReportesAccionesListadosPlanCuentas.setLayout(gridaBagParametrosReportesAccionesListadosPlanCuentas);
			
			
			this.jPanelParametrosAuxiliar1ListadosPlanCuentas.setLayout(gridaBagParametrosAuxiliar1ListadosPlanCuentas);
			this.jPanelParametrosAuxiliar2ListadosPlanCuentas.setLayout(gridaBagParametrosAuxiliar2ListadosPlanCuentas);
			this.jPanelParametrosAuxiliar3ListadosPlanCuentas.setLayout(gridaBagParametrosAuxiliar3ListadosPlanCuentas);
			this.jPanelParametrosAuxiliar4ListadosPlanCuentas.setLayout(gridaBagParametrosAuxiliar4ListadosPlanCuentas);
			//this.jPanelParametrosAuxiliar5ListadosPlanCuentas.setLayout(gridaBagParametrosAuxiliar2ListadosPlanCuentas);			
			
			
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jButtonRecargarInformacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosPlanCuentas.add(this.jComboBoxTiposPaginacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosPlanCuentas.add(this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadosPlanCuentas.add(this.jComboBoxTiposArchivosReportesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jPanelParametrosAuxiliar1ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadosPlanCuentas.add(this.jComboBoxTiposReportesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jPanelParametrosAuxiliar4ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jComboBoxTiposReportesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jCheckBoxGenerarReporteListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jPanelParametrosAuxiliar2ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jLabelAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
				this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadosPlanCuentas.add(this.jButtonAbrirOrderByListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jComboBoxTiposSeleccionarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
			
			
			/*
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jCheckBoxSeleccionarTodosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosPlanCuentas.add(this.jCheckBoxSeleccionarTodosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);															
				
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadosPlanCuentas.add(this.jCheckBoxSeleccionadosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jPanelParametrosAuxiliar3ListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadosPlanCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadosPlanCuentas.add(this.jComboBoxTiposAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadosPlanCuentas = new GridBagLayout();

			this.jScrollPanelDatosListadosPlanCuentas.setLayout(gridaBagLayoutDatosListadosPlanCuentas);
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
			
			this.jScrollPanelDatosListadosPlanCuentas.add(this.jTableDatosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadosPlanCuentas.setViewportView(this.jTableDatosListadosPlanCuentas);
		this.jTableDatosListadosPlanCuentas.setFillsViewportHeight(true);
		this.jTableDatosListadosPlanCuentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadosPlanCuentas= new GridBagLayout();
		this.jPanelAccionesListadosPlanCuentas.setLayout(gridaBagLayoutAccionesListadosPlanCuentas);
		
		
		/*	
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = 0;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
			
		this.jPanelAccionesListadosPlanCuentas.add(this.jButtonNuevoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas= new GridBagLayout();
		gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadosPlanCuentasListadosPlanCuentas.setLayout(gridaBagLayoutBusquedaListadosPlanCuentasListadosPlanCuentas);

		gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosPlanCuentas.gridy = 0;
		gridBagConstraintsListadosPlanCuentas.gridx = 0;
		jPanelBusquedaListadosPlanCuentasListadosPlanCuentas.add(jLabelidBusquedaListadosPlanCuentasListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);

		gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosPlanCuentas.gridy = 0;
		gridBagConstraintsListadosPlanCuentas.gridx = 1;
		jPanelBusquedaListadosPlanCuentasListadosPlanCuentas.add(jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);

		gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadosPlanCuentas.gridy = 1;
		gridBagConstraintsListadosPlanCuentas.gridx =1;
		jPanelBusquedaListadosPlanCuentasListadosPlanCuentas.add(jButtonBusquedaListadosPlanCuentasListadosPlanCuentas, gridBagConstraintsListadosPlanCuentas);

		jTabbedPaneBusquedasListadosPlanCuentas.addTab("1.-Por Id ", jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);
		jTabbedPaneBusquedasListadosPlanCuentas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadosPlanCuentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadosPlanCuentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();						
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;		
			//this.gridBagConstraintsListadosPlanCuentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadosPlanCuentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;		
		//this.gridBagConstraintsListadosPlanCuentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadosPlanCuentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadosPlanCuentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadosPlanCuentas.gridx = 0;		
			this.gridBagConstraintsListadosPlanCuentas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadosPlanCuentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);								
		
		
		/*
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		*/		
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadosPlanCuentas.gridx =0;
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadosPlanCuentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
				
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadosPlanCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadosPlanCuentas = new GridBagLayout();
			this.jPanelBusquedasParametrosListadosPlanCuentas.setLayout(gridaBagLayoutBusquedasParametrosListadosPlanCuentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadosPlanCuentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadosPlanCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
			
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadosPlanCuentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadosPlanCuentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadosPlanCuentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadosPlanCuentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadosPlanCuentas.setName("jPanelReporteDinamicoListadosPlanCuentas"); 
		
		this.jPanelReporteDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadosPlanCuentas.setLayout(gridaBagLayoutReporteDinamicoListadosPlanCuentas);
		
		
		this.jInternalFrameReporteDinamicoListadosPlanCuentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadosPlanCuentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosPlanCuentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadosPlanCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadosPlanCuentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadosPlanCuentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadosPlanCuentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadosPlanCuentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadosPlanCuentas = new JLabelMe();

		this.jLabelColumnasSelectReporteListadosPlanCuentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jLabelColumnasSelectReporteListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadosPlanCuentas = new JList<Reporte>();
		this.jListColumnasSelectReporteListadosPlanCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadosPlanCuentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadosPlanCuentas=new JScrollPane(this.jListColumnasSelectReporteListadosPlanCuentas);
			
			this.jScrollColumnasSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jListColumnasSelectReporteListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jScrollColumnasSelectReporteListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadosPlanCuentas = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadosPlanCuentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadosPlanCuentas = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadosPlanCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadosPlanCuentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadosPlanCuentas=new JScrollPane(this.jListRelacionesSelectReporteListadosPlanCuentas);
			
			this.jScrollRelacionesSelectReporteListadosPlanCuentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosPlanCuentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadosPlanCuentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadosPlanCuentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadosPlanCuentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadosPlanCuentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadosPlanCuentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadosPlanCuentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jLabelGenerarExcelReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas.setToolTipText("Generar EXCEL"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		//this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jComboBoxTiposReportesDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jLabelTiposArchivoReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jComboBoxTiposArchivosReportesDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadosPlanCuentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadosPlanCuentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadosPlanCuentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadosPlanCuentas.setToolTipText("Generar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jButtonGenerarReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadosPlanCuentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadosPlanCuentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadosPlanCuentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadosPlanCuentas.setToolTipText("Cancelar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadosPlanCuentas.add(this.jButtonCerrarReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadosPlanCuentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadosPlanCuentas= new JScrollPane(jPanelReporteDinamicoListadosPlanCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadosPlanCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosPlanCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadosPlanCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadosPlanCuentas);
		this.jInternalFrameReporteDinamicoListadosPlanCuentas.getContentPane().add(this.jScrollPanelReporteDinamicoListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadosPlanCuentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadosPlanCuentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadosPlanCuentas.setName("jPanelImportacionListadosPlanCuentas"); 
		
		this.jPanelImportacionListadosPlanCuentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosPlanCuentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadosPlanCuentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadosPlanCuentas.setLayout(gridaBagLayoutImportacionListadosPlanCuentas);
		
		
		this.jInternalFrameImportacionListadosPlanCuentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadosPlanCuentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadosPlanCuentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadosPlanCuentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadosPlanCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosPlanCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosPlanCuentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadosPlanCuentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosPlanCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosPlanCuentas.setResizable(true);
	    this.jInternalFrameImportacionListadosPlanCuentas.setClosable(true);
	    this.jInternalFrameImportacionListadosPlanCuentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadosPlanCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadosPlanCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadosPlanCuentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadosPlanCuentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadosPlanCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadosPlanCuentas.setResizable(true);
	    this.jInternalFrameImportacionListadosPlanCuentas.setClosable(true);
	    this.jInternalFrameImportacionListadosPlanCuentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadosPlanCuentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosPlanCuentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadosPlanCuentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadosPlanCuentas = new JLabelMe();

		this.jLabelArchivoImportacionListadosPlanCuentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosPlanCuentas.add(this.jLabelArchivoImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadosPlanCuentas = new JFileChooser();		
		this.jFileChooserImportacionListadosPlanCuentas.setToolTipText("ESCOGER ARCHIVO"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadosPlanCuentas = new JButtonMe();
		this.jButtonAbrirImportacionListadosPlanCuentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadosPlanCuentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadosPlanCuentas.setToolTipText("Generar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosPlanCuentas.add(this.jButtonAbrirImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadosPlanCuentas = new JLabelMe();

		this.jLabelPathArchivoImportacionListadosPlanCuentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadosPlanCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosPlanCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadosPlanCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadosPlanCuentas.add(this.jLabelPathArchivoImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadosPlanCuentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadosPlanCuentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosPlanCuentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadosPlanCuentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosPlanCuentas.add(this.jTextFieldPathArchivoImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadosPlanCuentas = new JButtonMe();
		this.jButtonGenerarImportacionListadosPlanCuentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadosPlanCuentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadosPlanCuentas.setToolTipText("Generar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosPlanCuentas.add(this.jButtonGenerarImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadosPlanCuentas = new JButtonMe();
		this.jButtonCerrarImportacionListadosPlanCuentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadosPlanCuentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadosPlanCuentas.setToolTipText("Cancelar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadosPlanCuentas.add(this.jButtonCerrarImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadosPlanCuentas = new GridBagLayout();
		
		this.jScrollPanelImportacionListadosPlanCuentas= new JScrollPane(jPanelImportacionListadosPlanCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
		this.gridBagConstraintsListadosPlanCuentas.gridy =iPosYImportacion;
		this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXImportacion;
		this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadosPlanCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadosPlanCuentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadosPlanCuentas);
		this.jInternalFrameImportacionListadosPlanCuentas.getContentPane().add(this.jScrollPanelImportacionListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadosPlanCuentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadosPlanCuentas = new JButtonMe();
			this.jButtonAbrirOrderByListadosPlanCuentas.setText("Orden");
			this.jButtonAbrirOrderByListadosPlanCuentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadosPlanCuentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadosPlanCuentas";
			inputMap = this.jButtonAbrirOrderByListadosPlanCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadosPlanCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadosPlanCuentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadosPlanCuentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadosPlanCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadosPlanCuentas.setName("jPanelOrderByListadosPlanCuentas"); 
			
			this.jPanelOrderByListadosPlanCuentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosPlanCuentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadosPlanCuentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadosPlanCuentas.setLayout(gridaBagLayoutOrderByListadosPlanCuentas);
			
			
			this.jTableDatosListadosPlanCuentasOrderBy = new JTableMe();        
			this.jTableDatosListadosPlanCuentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadosPlanCuentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadosPlanCuentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadosPlanCuentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadosPlanCuentasOrderBy.setViewportView(this.jTableDatosListadosPlanCuentasOrderBy);
			this.jTableDatosListadosPlanCuentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadosPlanCuentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadosPlanCuentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadosPlanCuentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadosPlanCuentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadosPlanCuentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadosPlanCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadosPlanCuentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadosPlanCuentas.setTitle("Orden");
			this.jInternalFrameOrderByListadosPlanCuentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadosPlanCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadosPlanCuentas.setResizable(true);
			this.jInternalFrameOrderByListadosPlanCuentas.setClosable(true);
			this.jInternalFrameOrderByListadosPlanCuentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadosPlanCuentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosPlanCuentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadosPlanCuentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadosPlanCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listados Plan Cuentases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadosPlanCuentas.ipady =150;
				
			this.jPanelOrderByListadosPlanCuentas.add(jScrollPanelDatosListadosPlanCuentasOrderBy, this.gridBagConstraintsListadosPlanCuentas);//this.jTableDatosListadosPlanCuentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadosPlanCuentas = new JButtonMe();
			this.jButtonCerrarOrderByListadosPlanCuentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadosPlanCuentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadosPlanCuentas.setToolTipText("Cancelar"+" "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadosPlanCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadosPlanCuentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadosPlanCuentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadosPlanCuentas.add(this.jButtonCerrarOrderByListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadosPlanCuentas = new GridBagLayout();
			
			this.jScrollPanelOrderByListadosPlanCuentas= new JScrollPane(jPanelOrderByListadosPlanCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadosPlanCuentas = new GridBagConstraints();
			this.gridBagConstraintsListadosPlanCuentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadosPlanCuentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadosPlanCuentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadosPlanCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadosPlanCuentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadosPlanCuentas);
			
			this.jInternalFrameOrderByListadosPlanCuentas.getContentPane().add(this.jScrollPanelOrderByListadosPlanCuentas, this.gridBagConstraintsListadosPlanCuentas);			
		
		} else {
			this.jButtonAbrirOrderByListadosPlanCuentas = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadosplancuentasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadosPlanCuentas.getRowHeight();//ListadosPlanCuentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.isSelected()) {
					iHeightTable=ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadosPlanCuentas.isSelected()) {
					iHeightTable=ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadosPlanCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadosPlanCuentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosPlanCuentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadosPlanCuentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadosPlanCuentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosPlanCuentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadosPlanCuentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadosPlanCuentas!=null && this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy()!=null) {
			//if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadosPlanCuentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadosPlanCuentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadosPlanCuentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadosPlanCuentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosPlanCuentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadosPlanCuentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadosplancuentasLogic.getListadosPlanCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosplancuentass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadosPlanCuentas> TraerListadosPlanCuentasBeans(List<ListadosPlanCuentas> listadosplancuentass,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadosPlanCuentas listadosplancuentas:listadosplancuentass) {
					
				if(!(ListadosPlanCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadosPlanCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadosplancuentas.setsDetalleGeneralEntityReporte(ListadosPlanCuentasConstantesFunciones.getListadosPlanCuentasDescripcion(listadosplancuentas));
										
					listadosplancuentas.setes_movimiento_descripcion(ListadosPlanCuentasConstantesFunciones.getes_movimientoDescripcion(listadosplancuentas));listadosplancuentas.setes_centro_costo_descripcion(ListadosPlanCuentasConstantesFunciones.getes_centro_costoDescripcion(listadosplancuentas));listadosplancuentas.setes_centro_actividad_descripcion(ListadosPlanCuentasConstantesFunciones.getes_centro_actividadDescripcion(listadosplancuentas));listadosplancuentas.setes_para_f52_descripcion(ListadosPlanCuentasConstantesFunciones.getes_para_f52Descripcion(listadosplancuentas));	
					
						
					
				} else  {
							
					//listadosplancuentas.setsDetalleGeneralEntityReporte(listadosplancuentas.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadosplancuentasbeans.add(listadosplancuentasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadosplancuentass;
    }
	//PARA REPORTES FIN
}
