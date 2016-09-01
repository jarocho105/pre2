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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.ListadoClientesConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class ListadoClientesJInternalFrame extends ListadoClientesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadoClientes;
	
	protected JMenuBar jmenuBarListadoClientes;
	
	protected JMenu jmenuListadoClientes;
	protected JMenu jmenuDatosListadoClientes;
	protected JMenu jmenuArchivoListadoClientes;
	protected JMenu jmenuAccionesListadoClientes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoClientes;	
	protected GridBagConstraints gridBagConstraintsListadoClientes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadoClientesDetalleFormJInternalFrame jInternalFrameDetalleFormListadoClientes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadoClientes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadoClientes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoClientesSessionBean listadoclientesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadoClientes> listadoclientess;		
	public List<ListadoClientes> listadoclientessEliminados;	
	public List<ListadoClientes> listadoclientessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadoClientes;		
	protected JButton jButtonAbrirOrderByListadoClientes;
	
	
	//protected JPanel jPanelOrderByListadoClientes;
	//public JScrollPane jScrollPanelOrderByListadoClientes;	
	//protected JButton jButtonCerrarOrderByListadoClientes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadoClientesLogic listadoclientesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadoClientes;
	public JScrollPane jScrollPanelDatosEdicionListadoClientes;
	public JScrollPane jScrollPanelDatosGeneralListadoClientes;
    
	
	
	//public JScrollPane jScrollPanelDatosListadoClientesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadoClientes;
	//public JScrollPane jScrollPanelImportacionListadoClientes;
	
	
	
	protected JPanel jPanelAccionesListadoClientes;
	
    protected JPanel jPanelPaginacionListadoClientes;
    protected JPanel jPanelParametrosReportesListadoClientes;
	protected JPanel jPanelParametrosReportesAccionesListadoClientes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadoClientes;
	protected JPanel jPanelParametrosAuxiliar2ListadoClientes;
	protected JPanel jPanelParametrosAuxiliar3ListadoClientes;
	protected JPanel jPanelParametrosAuxiliar4ListadoClientes;
	//protected JPanel jPanelParametrosAuxiliar5ListadoClientes;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadoClientes;
	//protected JPanel jPanelImportacionListadoClientes;
	
	
	public JTable jTableDatosListadoClientes;
	
	
	
	//public JTable jTableDatosListadoClientesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadoClientes;
	protected JButton jButtonDuplicarListadoClientes;
	protected JButton jButtonCopiarListadoClientes;
	protected JButton jButtonVerFormListadoClientes;
	protected JButton jButtonNuevoRelacionesListadoClientes;
	protected JButton jButtonModificarListadoClientes;
	
    protected JButton jButtonGuardarCambiosTablaListadoClientes;
	protected JButton jButtonCerrarListadoClientes;
	
	
	protected JButton jButtonRecargarInformacionListadoClientes;
	protected JButton jButtonProcesarInformacionListadoClientes;
	
	
	protected JButton jButtonAnterioresListadoClientes;
	protected JButton jButtonSiguientesListadoClientes;
	protected JButton jButtonNuevoGuardarCambiosListadoClientes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadoClientes;
	//protected JButton jButtonCerrarReporteDinamicoListadoClientes;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadoClientes;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadoClientes;
	//protected JButton jButtonGenerarImportacionListadoClientes;
	//protected JButton jButtonCerrarImportacionListadoClientes;
	//protected JFileChooser jFileChooserImportacionListadoClientes;
	//protected File fileImportacionListadoClientes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoClientes;
	protected JButton jButtonDuplicarToolBarListadoClientes;
	protected JButton jButtonNuevoRelacionesToolBarListadoClientes;
	
	
	public JButton jButtonGuardarCambiosToolBarListadoClientes;
	protected JButton jButtonCopiarToolBarListadoClientes;
	protected JButton jButtonVerFormToolBarListadoClientes;
	public JButton jButtonGuardarCambiosTablaToolBarListadoClientes;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoClientes;
	protected JButton jButtonCerrarToolBarListadoClientes;
	
	protected JButton jButtonRecargarInformacionToolBarListadoClientes;
	protected JButton jButtonProcesarInformacionToolBarListadoClientes;
	protected JButton jButtonAnterioresToolBarListadoClientes;
	protected JButton jButtonSiguientesToolBarListadoClientes;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadoClientes;
	protected JButton jButtonAbrirOrderByToolBarListadoClientes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoClientes;
	protected JMenuItem jMenuItemDuplicarListadoClientes;
	protected JMenuItem jMenuItemNuevoRelacionesListadoClientes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadoClientes;
	protected JMenuItem jMenuItemCopiarListadoClientes;
	protected JMenuItem jMenuItemVerFormListadoClientes;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoClientes;
	protected JMenuItem jMenuItemCerrarListadoClientes;
	protected JMenuItem jMenuItemDetalleCerrarListadoClientes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadoClientes;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoClientes;
	
	protected JMenuItem jMenuItemRecargarInformacionListadoClientes;
	protected JMenuItem jMenuItemProcesarInformacionListadoClientes;
	protected JMenuItem jMenuItemAnterioresListadoClientes;
	protected JMenuItem jMenuItemSiguientesListadoClientes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoClientes;
	protected JMenuItem jMenuItemAbrirOrderByListadoClientes;
	protected JMenuItem jMenuItemMostrarOcultarListadoClientes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoClientes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadoClientes;
	protected JCheckBox jCheckBoxSeleccionadosListadoClientes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadoClientes;
	protected JCheckBox jCheckBoxConGraficoReporteListadoClientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadoClientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadoClientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadoClientes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadoClientes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadoClientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadoClientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoClientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoClientes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadoClientes;
	protected JTextField jTextFieldValorCampoGeneralListadoClientes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadoClientes;
	//public JList<Reporte> jListColumnasSelectReporteListadoClientes;
	//public JScrollPane jScrollColumnasSelectReporteListadoClientes;
	
	//public JLabel jLabelRelacionesSelectReporteListadoClientes;
	//public JList<Reporte> jListRelacionesSelectReporteListadoClientes;
	//public JScrollPane jScrollRelacionesSelectReporteListadoClientes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadoClientes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadoClientes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadoClientes;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadoClientes;
	
		
	//public JLabel jLabelArchivoImportacionListadoClientes;	
	//public JLabel jLabelPathArchivoImportacionListadoClientes;
	//protected JTextField jTextFieldPathArchivoImportacionListadoClientes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadoClientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadoClientes;
	
	//public JLabel jLabelColumnaCategoriaValorListadoClientes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadoClientes;
	
	//public JLabel jLabelColumnasValoresGraficoListadoClientes;
	//public JList<Reporte> jListColumnasValoresGraficoListadoClientes;
	//public JScrollPane jScrollColumnasValoresGraficoListadoClientes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadoClientes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadoClientes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadoClientes;
	public JPanel jPanelBusquedaListadoClientesListadoClientes;
	public JButton jButtonBusquedaListadoClientesListadoClientes;
	
	public JPanel jPanelIdIdBusquedaListadoClientesListadoClientes;
	public JLabel jLabelidBusquedaListadoClientesListadoClientes;
	public JTextFieldMe jLabelidListadoClientesBusquedaListadoClientes;
	public JButton jButtonidBusquedaListadoClientesListadoClientesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=1474;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ListadoClientesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoClientesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadoClientes)	{
		this.jButtonRecargarInformacionListadoClientes = jButtonRecargarInformacionListadoClientes;
	}
	
	public JButton getjButtonProcesarInformacionListadoClientes() {
		return this.jButtonProcesarInformacionListadoClientes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoClientes)	{
		this.jButtonProcesarInformacionListadoClientes = jButtonProcesarInformacionListadoClientes;
	}
	
	
	public JButton getjButtonRecargarInformacionListadoClientes() {
		return this.jButtonRecargarInformacionListadoClientes;
	}
	
	
	public List<ListadoClientes> getlistadoclientess() {
		return this.listadoclientess;
	}

	public void setlistadoclientess(List<ListadoClientes> listadoclientess) {
		this.listadoclientess = listadoclientess;
	}
	
	public List<ListadoClientes> getlistadoclientessAux() {
		return this.listadoclientessAux;
	}

	public void setlistadoclientessAux(List<ListadoClientes> listadoclientessAux) {
		this.listadoclientessAux = listadoclientessAux;
	}
	
	public List<ListadoClientes> getlistadoclientessEliminados() {
		return this.listadoclientessEliminados;
	}

	public void setListadoClientessEliminados(List<ListadoClientes> listadoclientessEliminados) {
		this.listadoclientessEliminados = listadoclientessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadoClientes() {
		return jComboBoxTiposSeleccionarListadoClientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadoClientes(
			JComboBox jComboBoxTiposSeleccionarListadoClientes) {
		this.jComboBoxTiposSeleccionarListadoClientes = jComboBoxTiposSeleccionarListadoClientes;
	}
	
	public void setBorderResaltarTiposSeleccionarListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadoClientes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadoClientes() {
		return jTextFieldValorCampoGeneralListadoClientes;
	}

	public void setjTextFieldValorCampoGeneralListadoClientes(
			JTextField jTextFieldValorCampoGeneralListadoClientes) {
		this.jTextFieldValorCampoGeneralListadoClientes = jTextFieldValorCampoGeneralListadoClientes;
	}

	public void setBorderResaltarValorCampoGeneralListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadoClientes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadoClientes() {
		return this.jCheckBoxSeleccionarTodosListadoClientes;
	}

	public void setjCheckBoxSeleccionarTodosListadoClientes(
			JCheckBox jCheckBoxSeleccionarTodosListadoClientes) {
		this.jCheckBoxSeleccionarTodosListadoClientes = jCheckBoxSeleccionarTodosListadoClientes;
	}

	public void setBorderResaltarSeleccionarTodosListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadoClientes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadoClientes() {
		return this.jCheckBoxSeleccionadosListadoClientes;
	}

	public void setjCheckBoxSeleccionadosListadoClientes(
			JCheckBox jCheckBoxSeleccionadosListadoClientes) {
		this.jCheckBoxSeleccionadosListadoClientes = jCheckBoxSeleccionadosListadoClientes;
	}
	
	public void setBorderResaltarSeleccionadosListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadoClientes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadoClientes() {
		return this.jComboBoxTiposArchivosReportesListadoClientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadoClientes(
			JComboBox jComboBoxTiposArchivosReportesListadoClientes) {
		this.jComboBoxTiposArchivosReportesListadoClientes = jComboBoxTiposArchivosReportesListadoClientes;
	}

	public void setBorderResaltarTiposArchivosReportesListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadoClientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadoClientes() {
		return this.jComboBoxTiposReportesListadoClientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadoClientes(
			JComboBox jComboBoxTiposReportesListadoClientes) {
		this.jComboBoxTiposReportesListadoClientes = jComboBoxTiposReportesListadoClientes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadoClientes() {
	//	return jComboBoxTiposReportesDinamicoListadoClientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadoClientes(
	//		JComboBox jComboBoxTiposReportesDinamicoListadoClientes) {
	//	this.jComboBoxTiposReportesDinamicoListadoClientes = jComboBoxTiposReportesDinamicoListadoClientes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadoClientes() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadoClientes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadoClientes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadoClientes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadoClientes = jComboBoxTiposArchivosReportesDinamicoListadoClientes;
	//}
	
	public void setBorderResaltarTiposReportesListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadoClientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadoClientes() {
		return this.jComboBoxTiposGraficosReportesListadoClientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadoClientes(
			JComboBox jComboBoxTiposGraficosReportesListadoClientes) {
		this.jComboBoxTiposGraficosReportesListadoClientes = jComboBoxTiposGraficosReportesListadoClientes;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadoClientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadoClientes() {
		return this.jComboBoxTiposPaginacionListadoClientes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadoClientes(
			JComboBox jComboBoxTiposPaginacionListadoClientes) {
		this.jComboBoxTiposPaginacionListadoClientes = jComboBoxTiposPaginacionListadoClientes;
	}
	
	public void setBorderResaltarTiposPaginacionListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadoClientes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadoClientes() {
		return this.jComboBoxTiposRelacionesListadoClientes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoClientes() {
		return this.jComboBoxTiposAccionesListadoClientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoClientes(
			JComboBox jComboBoxTiposRelacionesListadoClientes) {
		this.jComboBoxTiposRelacionesListadoClientes = jComboBoxTiposRelacionesListadoClientes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoClientes(
			JComboBox jComboBoxTiposAccionesListadoClientes) {
		this.jComboBoxTiposAccionesListadoClientes = jComboBoxTiposAccionesListadoClientes;
	}
	
	public void setBorderResaltarTiposRelacionesListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadoClientes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadoClientes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoClientes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadoClientes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadoClientes() {
	//	return jCheckBoxConGraficoDinamicoListadoClientes;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadoClientes(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadoClientes) {
	//	this.jCheckBoxConGraficoDinamicoListadoClientes = jCheckBoxConGraficoDinamicoListadoClientes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadoClientes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadoClientes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadoClientes .setBorder(borderResaltar);		
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
		this.listadoclientesSessionBean=new ListadoClientesSessionBean();
		
		this.listadoclientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoclientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadoclientesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoClientesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoClientesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Clientes MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadoClientesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadoClientes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadoClientes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"nuevo","nuevo","Nuevo"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"duplicar","duplicar","Duplicar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"copiar","copiar","Copiar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"ver_form","ver_form","Ver"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"recargar","recargar","Buscar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadoClientes,this.jTtoolBarListadoClientes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadoClientes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadoClientes,this.jTtoolBarListadoClientes,
							"cerrar","cerrar","Salir"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadoClientes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadoClientes;
			
				this.jButtonProcesarInformacionToolBarListadoClientes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadoClientes;
				
		//protected JButton jButtonModificarToolBarListadoClientes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadoClientes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadoClientes=new JMenuMe("General");
		this.jmenuArchivoListadoClientes=new JMenuMe("Archivo");
		this.jmenuAccionesListadoClientes=new JMenuMe("Acciones");
		this.jmenuDatosListadoClientes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoClientes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoClientes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoClientes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadoClientes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadoClientes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadoClientes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadoClientes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadoClientes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadoClientes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadoClientes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoClientes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoClientes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadoClientes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadoClientes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadoClientes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadoClientes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadoClientes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadoClientes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadoClientes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadoClientes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadoClientes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoClientes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoClientes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoClientes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadoClientes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadoClientes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadoClientes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadoClientes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadoClientes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadoClientes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadoClientes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadoClientes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadoClientes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadoClientes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadoClientes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadoClientes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadoClientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadoClientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadoClientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoClientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoClientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoClientes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadoClientes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadoClientes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadoClientes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoClientes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoClientes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoClientes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadoClientes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadoClientes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadoClientes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadoClientes.add(this.jMenuItemCerrarListadoClientes);
			
			this.jmenuAccionesListadoClientes.add(this.jMenuItemNuevoListadoClientes);
			this.jmenuAccionesListadoClientes.add(this.jMenuItemNuevoGuardarCambiosListadoClientes);
			this.jmenuAccionesListadoClientes.add(this.jMenuItemNuevoRelacionesListadoClientes);
			this.jmenuAccionesListadoClientes.add(this.jMenuItemGuardarCambiosTablaListadoClientes);		
			this.jmenuAccionesListadoClientes.add(this.jMenuItemDuplicarListadoClientes);		
			this.jmenuAccionesListadoClientes.add(this.jMenuItemCopiarListadoClientes);		
			this.jmenuAccionesListadoClientes.add(this.jMenuItemVerFormListadoClientes);		
			
			this.jmenuDatosListadoClientes.add(this.jMenuItemRecargarInformacionListadoClientes);				
			this.jmenuDatosListadoClientes.add(this.jMenuItemAnterioresListadoClientes);				
			this.jmenuDatosListadoClientes.add(this.jMenuItemSiguientesListadoClientes);				
			this.jmenuDatosListadoClientes.add(this.jMenuItemAbrirOrderByListadoClientes);				
			this.jmenuDatosListadoClientes.add(this.jMenuItemMostrarOcultarListadoClientes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadoClientes.add(this.jMenuItemGuardarCambiosListadoClientes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadoClientes.add(this.jmenuArchivoListadoClientes);		
			this.jmenuBarListadoClientes.add(this.jmenuAccionesListadoClientes);		
			this.jmenuBarListadoClientes.add(this.jmenuDatosListadoClientes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadoClientes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadoClientes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadoClientesListadoClientes=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadoClientesListadoClientes.setToolTipText("Buscar Por  ");
		this.jButtonBusquedaListadoClientesListadoClientes= new JButtonMe();
		this.jButtonBusquedaListadoClientesListadoClientes.setText("Buscar");
		this.jButtonBusquedaListadoClientesListadoClientes.setToolTipText("Buscar Por  ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadoClientesListadoClientes,"buscar_button","Buscar Por  ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadoClientesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaListadoClientesListadoClientes = new JLabelMe();
		jLabelidBusquedaListadoClientesListadoClientes.setText("Id :");
		jLabelidBusquedaListadoClientesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadoClientesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaListadoClientesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-4),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaListadoClientesListadoClientes,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidListadoClientesBusquedaListadoClientes= new JTextFieldMe();
		jLabelidListadoClientesBusquedaListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoClientesBusquedaListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidListadoClientesBusquedaListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));


		//SE OCULTA CAMPO ID AUXILIAR PARA REPORTE
		jLabelidListadoClientesBusquedaListadoClientes.setVisible(false);




		this.jTabbedPaneBusquedasListadoClientes=new JTabbedPane();


		this.jTabbedPaneBusquedasListadoClientes.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadoClientes.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasListadoClientes.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadoClientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadoClientes,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadoClientes = new ListadoClientesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listado Clientes DATOS");
			this.jInternalFrameDetalleFormListadoClientes = new ListadoClientesDetalleFormJInternalFrame(jDesktopPane,this.listadoclientesSessionBean.getConGuardarRelaciones(),this.listadoclientesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadoClientes = null;//new ListadoClientesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoClientes= new GridBagLayout();
		
		
		this.jTableDatosListadoClientes = new JTableMe();      
		
		String sToolTipListadoClientes="";
		sToolTipListadoClientes=ListadoClientesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoClientes+="(Cartera.ListadoClientes)";
		}
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoClientes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadoClientes.setToolTipText(sToolTipListadoClientes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadoClientes);
		this.jTableDatosListadoClientes.setAutoCreateRowSorter(true);
		this.jTableDatosListadoClientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadoClientes.setRowSelectionAllowed(true);
		this.jTableDatosListadoClientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadoClientes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadoClientes = new JButtonMe();
		this.jButtonDuplicarListadoClientes = new JButtonMe();
		this.jButtonCopiarListadoClientes = new JButtonMe();
		this.jButtonVerFormListadoClientes = new JButtonMe();
		this.jButtonNuevoRelacionesListadoClientes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadoClientes = new JButtonMe();
		this.jButtonCerrarListadoClientes = new JButtonMe();
		
		this.jScrollPanelDatosListadoClientes = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadoClientes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Clientes";
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoClientes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoClientes.setToolTipText("Acciones");
        this.jPanelAccionesListadoClientes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadoClientes=new ReporteDinamicoJInternalFrame(ListadoClientesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadoClientes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadoClientes=new ImportacionJInternalFrame(ListadoClientesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadoClientes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadoClientes = new JButtonMe();
		
		this.jButtonAbrirOrderByListadoClientes.setText("Orden");
		this.jButtonAbrirOrderByListadoClientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoClientes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoClientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoClientes,false,this);
			
			//this.cargarOrderByListadoClientes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoClientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoClientes,true,this);
			
			//this.cargarOrderByListadoClientes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadoClientes.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosListadoClientes.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosListadoClientes.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosListadoClientes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoClientes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoClientes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadoClientes.setText("Nuevo");
		this.jButtonDuplicarListadoClientes.setText("Duplicar");
		this.jButtonCopiarListadoClientes.setText("Copiar");
		this.jButtonVerFormListadoClientes.setText("Ver");
		this.jButtonNuevoRelacionesListadoClientes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadoClientes.setText("Guardar");
		this.jButtonCerrarListadoClientes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoClientes,"nuevo_button","Nuevo",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadoClientes,"duplicar_button","Duplicar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadoClientes,"copiar_button","Copiar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadoClientes,"ver_form","Ver",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadoClientes,"nuevorelaciones_button","Nuevo Rel",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoClientes,"guardarcambiostabla_button","Guardar",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoClientes,"cerrar_button","Salir",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadoClientes.setToolTipText("Nuevo"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadoClientes.setToolTipText("Duplicar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadoClientes.setToolTipText("Copiar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadoClientes.setToolTipText("Ver"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadoClientes.setToolTipText("Nuevo Rel"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadoClientes.setToolTipText("Guardar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoClientes.setToolTipText("Salir"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoClientes";
		inputMap = this.jButtonNuevoListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoClientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoClientes"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadoClientes";
		inputMap = this.jButtonDuplicarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadoClientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadoClientes"));
		
		//COPIAR
		sMapKey = "CopiarListadoClientes";
		inputMap = this.jButtonCopiarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadoClientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadoClientes"));
		
		//VEr FORM
		sMapKey = "VerFormListadoClientes";
		inputMap = this.jButtonVerFormListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadoClientes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadoClientes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadoClientes";
		inputMap = this.jButtonNuevoRelacionesListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadoClientes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadoClientes";
		inputMap = this.jButtonModificarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadoClientes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadoClientes";
		inputMap = this.jButtonCerrarListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoClientes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoClientes";
		inputMap = this.jButtonGuardarCambiosTablaListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoClientes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadoClientes.setName("jPanelParametrosReportesListadoClientes"); 
		
		this.jPanelParametrosReportesAccionesListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadoClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadoClientes.setName("jPanelParametrosReportesAccionesListadoClientes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadoClientes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadoClientes = new JButtonMe();
		this.jButtonRecargarInformacionListadoClientes.setText("Buscar");
		this.jButtonRecargarInformacionListadoClientes.setToolTipText("Buscar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadoClientes,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadoClientes.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadoClientes = new JButtonMe();
		this.jButtonProcesarInformacionListadoClientes.setText("Procesar");
		this.jButtonProcesarInformacionListadoClientes.setToolTipText("Procesar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadoClientes.setVisible(false);
			
		this.jButtonProcesarInformacionListadoClientes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoClientes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoClientes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoClientes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadoClientes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoClientes.setText("TIPO");       
		this.jComboBoxTiposReportesListadoClientes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoClientes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadoClientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadoClientes.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadoClientes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadoClientes.setText("Accion");
		this.jComboBoxTiposRelacionesListadoClientes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoClientes.setText("Accion");
		this.jComboBoxTiposAccionesListadoClientes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadoClientes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadoClientes.setText("Accion");
		this.jComboBoxTiposSeleccionarListadoClientes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadoClientes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadoClientes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoClientes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoClientes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadoClientes = new JLabelMe();
		
		this.jLabelAccionesListadoClientes.setText("Acciones");		
		this.jLabelAccionesListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadoClientes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadoClientes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadoClientes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadoClientes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadoClientes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadoClientes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadoClientes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadoClientes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadoClientes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadoClientes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadoClientes.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadoClientes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadoClientes = new JButtonMe();
		//this.jButtonAnterioresListadoClientes.setText("<<");
        this.jButtonAnterioresListadoClientes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadoClientes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadoClientes = new JButtonMe();
		//this.jButtonSiguientesListadoClientes.setText(">>");
        this.jButtonSiguientesListadoClientes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadoClientes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadoClientes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadoClientes.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadoClientes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadoClientes,"nuevoguardarcambios_button","Nue",this.listadoclientesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadoClientes";
		inputMap = this.jButtonNuevoGuardarCambiosListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadoClientes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadoClientes";
		inputMap = this.jButtonRecargarInformacionListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadoClientes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadoClientes";
		inputMap = this.jButtonSiguientesListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadoClientes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadoClientes";
		inputMap = this.jButtonAnterioresListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadoClientes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadoClientes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadoClientes.setMinimumSize(new Dimension(this.getWidth(),ListadoClientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoClientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoClientes.setMaximumSize(new Dimension(this.getWidth(),ListadoClientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoClientesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoClientes.setPreferredSize(new Dimension(this.getWidth(),ListadoClientesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoClientesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadoClientes = new GridBagLayout();

			this.jPanelPaginacionListadoClientes.setLayout(gridaBagLayoutPaginacionListadoClientes);						
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 0;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadoClientes.add(this.jButtonAnterioresListadoClientes, this.gridBagConstraintsListadoClientes);
					
						
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoClientes.gridy = 0;
			
			this.jPanelPaginacionListadoClientes.add(this.jButtonNuevoGuardarCambiosListadoClientes, this.gridBagConstraintsListadoClientes);
						
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoClientes.gridy = 0;
			this.jPanelPaginacionListadoClientes.add(this.jButtonSiguientesListadoClientes, this.gridBagConstraintsListadoClientes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 1;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoClientes.add(this.jButtonNuevoListadoClientes, this.gridBagConstraintsListadoClientes);
						
			
			
			if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadoClientes = new GridBagConstraints();
				this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadoClientes.gridy = 1;
				this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadoClientes.add(this.jButtonGuardarCambiosTablaListadoClientes, this.gridBagConstraintsListadoClientes);
			}
			
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 1;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoClientes.add(this.jButtonDuplicarListadoClientes, this.gridBagConstraintsListadoClientes);
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 1;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoClientes.add(this.jButtonCopiarListadoClientes, this.gridBagConstraintsListadoClientes);
		
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 1;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoClientes.add(this.jButtonVerFormListadoClientes, this.gridBagConstraintsListadoClientes);
		
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 1;
			this.gridBagConstraintsListadoClientes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadoClientes.add(this.jButtonCerrarListadoClientes, this.gridBagConstraintsListadoClientes);
		
		
		
		this.jButtonRecargarInformacionListadoClientes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoClientes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoClientes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadoClientes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoClientes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoClientes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadoClientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoClientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoClientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadoClientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoClientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoClientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadoClientes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoClientes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoClientes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadoClientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoClientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoClientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadoClientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoClientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoClientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadoClientes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoClientes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoClientes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadoClientes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoClientes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoClientes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadoClientes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoClientes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoClientes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadoClientes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoClientes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoClientes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadoClientes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoClientes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoClientes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadoClientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadoClientes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadoClientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadoClientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadoClientes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadoClientes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadoClientes.setLayout(gridaBagParametrosReportesListadoClientes);
			this.jPanelParametrosReportesAccionesListadoClientes.setLayout(gridaBagParametrosReportesAccionesListadoClientes);
			
			
			this.jPanelParametrosAuxiliar1ListadoClientes.setLayout(gridaBagParametrosAuxiliar1ListadoClientes);
			this.jPanelParametrosAuxiliar2ListadoClientes.setLayout(gridaBagParametrosAuxiliar2ListadoClientes);
			this.jPanelParametrosAuxiliar3ListadoClientes.setLayout(gridaBagParametrosAuxiliar3ListadoClientes);
			this.jPanelParametrosAuxiliar4ListadoClientes.setLayout(gridaBagParametrosAuxiliar4ListadoClientes);
			//this.jPanelParametrosAuxiliar5ListadoClientes.setLayout(gridaBagParametrosAuxiliar2ListadoClientes);			
			
			
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoClientes.add(this.jButtonRecargarInformacionListadoClientes, this.gridBagConstraintsListadoClientes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoClientes.add(this.jComboBoxTiposPaginacionListadoClientes, this.gridBagConstraintsListadoClientes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoClientes.add(this.jCheckBoxConAltoMaximoTablaListadoClientes, this.gridBagConstraintsListadoClientes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoClientes.add(this.jComboBoxTiposArchivosReportesListadoClientes, this.gridBagConstraintsListadoClientes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoClientes.add(this.jPanelParametrosAuxiliar1ListadoClientes, this.gridBagConstraintsListadoClientes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadoClientes.add(this.jComboBoxTiposReportesListadoClientes, this.gridBagConstraintsListadoClientes);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoClientes.add(this.jPanelParametrosAuxiliar4ListadoClientes, this.gridBagConstraintsListadoClientes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoClientes.add(this.jComboBoxTiposReportesListadoClientes, this.gridBagConstraintsListadoClientes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoClientes.add(this.jCheckBoxGenerarReporteListadoClientes, this.gridBagConstraintsListadoClientes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoClientes.add(this.jPanelParametrosAuxiliar2ListadoClientes, this.gridBagConstraintsListadoClientes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoClientes.add(this.jLabelAccionesListadoClientes, this.gridBagConstraintsListadoClientes);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadoClientes = new GridBagConstraints();
				this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadoClientes.add(this.jButtonAbrirOrderByListadoClientes, this.gridBagConstraintsListadoClientes);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoClientes.add(this.jComboBoxTiposSeleccionarListadoClientes, this.gridBagConstraintsListadoClientes);			
			
			
			/*
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoClientes.add(this.jCheckBoxSeleccionarTodosListadoClientes, this.gridBagConstraintsListadoClientes);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoClientes.add(this.jCheckBoxSeleccionarTodosListadoClientes, this.gridBagConstraintsListadoClientes);															
				
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoClientes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoClientes.add(this.jCheckBoxSeleccionadosListadoClientes, this.gridBagConstraintsListadoClientes);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoClientes.add(this.jPanelParametrosAuxiliar3ListadoClientes, this.gridBagConstraintsListadoClientes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoClientes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoClientes.add(this.jComboBoxTiposAccionesListadoClientes, this.gridBagConstraintsListadoClientes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadoClientes = new GridBagLayout();

			this.jScrollPanelDatosListadoClientes.setLayout(gridaBagLayoutDatosListadoClientes);
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = 0;
			this.gridBagConstraintsListadoClientes.gridx = 0;
			
			this.jScrollPanelDatosListadoClientes.add(this.jTableDatosListadoClientes, this.gridBagConstraintsListadoClientes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadoClientes.setViewportView(this.jTableDatosListadoClientes);
		this.jTableDatosListadoClientes.setFillsViewportHeight(true);
		this.jTableDatosListadoClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadoClientes= new GridBagLayout();
		this.jPanelAccionesListadoClientes.setLayout(gridaBagLayoutAccionesListadoClientes);
		
		
		/*	
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = 0;
		this.gridBagConstraintsListadoClientes.gridx = 0;
			
		this.jPanelAccionesListadoClientes.add(this.jButtonNuevoListadoClientes, this.gridBagConstraintsListadoClientes);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadoClientesListadoClientes= new GridBagLayout();
		gridaBagLayoutBusquedaListadoClientesListadoClientes.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadoClientesListadoClientes.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadoClientesListadoClientes.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadoClientesListadoClientes.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadoClientesListadoClientes.setLayout(gridaBagLayoutBusquedaListadoClientesListadoClientes);

		gridBagConstraintsListadoClientes = new GridBagConstraints();
		gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoClientes.gridy = 0;
		gridBagConstraintsListadoClientes.gridx = 0;
		jPanelBusquedaListadoClientesListadoClientes.add(jLabelidBusquedaListadoClientesListadoClientes, gridBagConstraintsListadoClientes);

		gridBagConstraintsListadoClientes = new GridBagConstraints();
		gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoClientes.gridy = 0;
		gridBagConstraintsListadoClientes.gridx = 1;
		jPanelBusquedaListadoClientesListadoClientes.add(jLabelidListadoClientesBusquedaListadoClientes, gridBagConstraintsListadoClientes);

		gridBagConstraintsListadoClientes = new GridBagConstraints();
		gridBagConstraintsListadoClientes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoClientes.gridy = 1;
		gridBagConstraintsListadoClientes.gridx =1;
		jPanelBusquedaListadoClientesListadoClientes.add(jButtonBusquedaListadoClientesListadoClientes, gridBagConstraintsListadoClientes);

		jTabbedPaneBusquedasListadoClientes.addTab("1.-Por  ", jPanelBusquedaListadoClientesListadoClientes);
		jTabbedPaneBusquedasListadoClientes.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoClientes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoClientes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadoclientesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();						
			this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoClientes.gridx = 0;		
			//this.gridBagConstraintsListadoClientes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoClientes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadoClientes, this.gridBagConstraintsListadoClientes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadoClientes.gridx = 0;		
		//this.gridBagConstraintsListadoClientes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadoClientes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadoClientes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoClientes.gridx = 0;		
			this.gridBagConstraintsListadoClientes.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadoClientes.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadoClientes, this.gridBagConstraintsListadoClientes);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadoClientes, this.gridBagConstraintsListadoClientes);								
		
		
		/*
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadoClientes, this.gridBagConstraintsListadoClientes);
		*/		
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoClientes.gridx =0;
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoClientes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoClientes, this.gridBagConstraintsListadoClientes);
				
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadoClientes, this.gridBagConstraintsListadoClientes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadoClientesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadoClientes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoClientes = new GridBagLayout();
			this.jPanelBusquedasParametrosListadoClientes.setLayout(gridaBagLayoutBusquedasParametrosListadoClientes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadoClientes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoClientes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoClientes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoClientes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoClientes, this.gridBagConstraintsListadoClientes);
			
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoClientes, this.gridBagConstraintsListadoClientes);
		
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoClientes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoClientes, this.gridBagConstraintsListadoClientes);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadoClientes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadoClientes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadoClientes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadoClientes.setName("jPanelReporteDinamicoListadoClientes"); 
		
		this.jPanelReporteDinamicoListadoClientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoClientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoClientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadoClientes.setLayout(gridaBagLayoutReporteDinamicoListadoClientes);
		
		
		this.jInternalFrameReporteDinamicoListadoClientes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadoClientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoClientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadoClientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadoClientes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadoClientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadoClientes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadoClientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadoClientes.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadoClientes.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadoClientes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadoClientes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoClientes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoClientes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadoClientes = new JLabelMe();

		this.jLabelColumnasSelectReporteListadoClientes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoClientes.add(this.jLabelColumnasSelectReporteListadoClientes, this.gridBagConstraintsListadoClientes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadoClientes = new JList<Reporte>();
		this.jListColumnasSelectReporteListadoClientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadoClientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadoClientes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoClientes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoClientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadoClientes=new JScrollPane(this.jListColumnasSelectReporteListadoClientes);
			
			this.jScrollColumnasSelectReporteListadoClientes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoClientes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoClientes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadoClientes.add(this.jListColumnasSelectReporteListadoClientes, this.gridBagConstraintsListadoClientes);
		this.jPanelReporteDinamicoListadoClientes.add(this.jScrollColumnasSelectReporteListadoClientes, this.gridBagConstraintsListadoClientes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadoClientes = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadoClientes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadoClientes = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadoClientes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadoClientes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadoClientes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoClientes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoClientes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadoClientes=new JScrollPane(this.jListRelacionesSelectReporteListadoClientes);
			
			this.jScrollRelacionesSelectReporteListadoClientes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoClientes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoClientes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadoClientes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadoClientes = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadoClientes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadoClientes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadoClientes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadoClientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoClientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoClientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadoClientes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadoClientes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadoClientes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoClientes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoClientes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadoClientes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadoClientes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoClientes.add(this.jLabelGenerarExcelReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadoClientes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadoClientes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadoClientes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadoClientes.setToolTipText("Generar EXCEL"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		//this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadoClientes.add(this.jButtonGenerarExcelReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoClientes.add(this.jComboBoxTiposReportesDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadoClientes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadoClientes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoClientes.add(this.jLabelTiposArchivoReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoClientes.add(this.jComboBoxTiposArchivosReportesDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadoClientes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadoClientes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadoClientes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadoClientes.setToolTipText("Generar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoClientes.add(this.jButtonGenerarReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadoClientes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadoClientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadoClientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadoClientes.setToolTipText("Cancelar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoClientes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoClientes.add(this.jButtonCerrarReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadoClientes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadoClientes= new JScrollPane(jPanelReporteDinamicoListadoClientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadoClientes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoClientes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoClientes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadoClientes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadoClientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadoClientes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadoClientes);
		this.jInternalFrameReporteDinamicoListadoClientes.getContentPane().add(this.jScrollPanelReporteDinamicoListadoClientes, this.gridBagConstraintsListadoClientes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadoClientes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadoClientes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadoClientes.setName("jPanelImportacionListadoClientes"); 
		
		this.jPanelImportacionListadoClientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoClientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoClientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadoClientes.setLayout(gridaBagLayoutImportacionListadoClientes);
		
		
		this.jInternalFrameImportacionListadoClientes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadoClientes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadoClientes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoClientes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadoClientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoClientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoClientes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadoClientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoClientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoClientes.setResizable(true);
	    this.jInternalFrameImportacionListadoClientes.setClosable(true);
	    this.jInternalFrameImportacionListadoClientes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadoClientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoClientes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoClientes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadoClientes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoClientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoClientes.setResizable(true);
	    this.jInternalFrameImportacionListadoClientes.setClosable(true);
	    this.jInternalFrameImportacionListadoClientes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadoClientes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoClientes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoClientes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadoClientes = new JLabelMe();

		this.jLabelArchivoImportacionListadoClientes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoClientes.add(this.jLabelArchivoImportacionListadoClientes, this.gridBagConstraintsListadoClientes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadoClientes = new JFileChooser();		
		this.jFileChooserImportacionListadoClientes.setToolTipText("ESCOGER ARCHIVO"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadoClientes = new JButtonMe();
		this.jButtonAbrirImportacionListadoClientes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadoClientes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadoClientes.setToolTipText("Generar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoClientes.add(this.jButtonAbrirImportacionListadoClientes, this.gridBagConstraintsListadoClientes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadoClientes = new JLabelMe();

		this.jLabelPathArchivoImportacionListadoClientes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadoClientes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoClientes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoClientes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoClientes.add(this.jLabelPathArchivoImportacionListadoClientes, this.gridBagConstraintsListadoClientes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadoClientes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadoClientes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoClientes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoClientes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoClientes.add(this.jTextFieldPathArchivoImportacionListadoClientes, this.gridBagConstraintsListadoClientes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadoClientes = new JButtonMe();
		this.jButtonGenerarImportacionListadoClientes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadoClientes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadoClientes.setToolTipText("Generar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoClientes.add(this.jButtonGenerarImportacionListadoClientes, this.gridBagConstraintsListadoClientes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadoClientes = new JButtonMe();
		this.jButtonCerrarImportacionListadoClientes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadoClientes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadoClientes.setToolTipText("Cancelar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoClientes.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoClientes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoClientes.add(this.jButtonCerrarImportacionListadoClientes, this.gridBagConstraintsListadoClientes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadoClientes = new GridBagLayout();
		
		this.jScrollPanelImportacionListadoClientes= new JScrollPane(jPanelImportacionListadoClientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadoClientes = new GridBagConstraints();
		this.gridBagConstraintsListadoClientes.gridy =iPosYImportacion;
		this.gridBagConstraintsListadoClientes.gridx =iPosXImportacion;
		this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadoClientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadoClientes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadoClientes);
		this.jInternalFrameImportacionListadoClientes.getContentPane().add(this.jScrollPanelImportacionListadoClientes, this.gridBagConstraintsListadoClientes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadoClientes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadoClientes = new JButtonMe();
			this.jButtonAbrirOrderByListadoClientes.setText("Orden");
			this.jButtonAbrirOrderByListadoClientes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoClientes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadoClientes";
			inputMap = this.jButtonAbrirOrderByListadoClientes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadoClientes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadoClientes"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadoClientes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadoClientes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadoClientes.setName("jPanelOrderByListadoClientes"); 
			
			this.jPanelOrderByListadoClientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoClientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoClientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadoClientes.setLayout(gridaBagLayoutOrderByListadoClientes);
			
			
			this.jTableDatosListadoClientesOrderBy = new JTableMe();        
			this.jTableDatosListadoClientesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadoClientesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadoClientesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadoClientesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadoClientesOrderBy.setViewportView(this.jTableDatosListadoClientesOrderBy);
			this.jTableDatosListadoClientesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadoClientesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadoClientes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadoClientes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadoClientes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadoClientes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadoClientes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadoClientes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadoClientes.setTitle("Orden");
			this.jInternalFrameOrderByListadoClientes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadoClientes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadoClientes.setResizable(true);
			this.jInternalFrameOrderByListadoClientes.setClosable(true);
			this.jInternalFrameOrderByListadoClientes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadoClientes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoClientes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoClientes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadoClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Clienteses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadoClientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadoClientes.ipady =150;
				
			this.jPanelOrderByListadoClientes.add(jScrollPanelDatosListadoClientesOrderBy, this.gridBagConstraintsListadoClientes);//this.jTableDatosListadoClientesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadoClientes = new JButtonMe();
			this.jButtonCerrarOrderByListadoClientes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadoClientes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadoClientes.setToolTipText("Cancelar"+" "+ListadoClientesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadoClientes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoClientes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadoClientes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadoClientes.add(this.jButtonCerrarOrderByListadoClientes, this.gridBagConstraintsListadoClientes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadoClientes = new GridBagLayout();
			
			this.jScrollPanelOrderByListadoClientes= new JScrollPane(jPanelOrderByListadoClientes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadoClientes = new GridBagConstraints();
			this.gridBagConstraintsListadoClientes.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadoClientes.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoClientes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadoClientes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadoClientes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadoClientes);
			
			this.jInternalFrameOrderByListadoClientes.getContentPane().add(this.jScrollPanelOrderByListadoClientes, this.gridBagConstraintsListadoClientes);			
		
		} else {
			this.jButtonAbrirOrderByListadoClientes = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadoclientesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadoClientes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadoClientes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadoClientes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadoClientes.getRowHeight();//ListadoClientesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadoClientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoClientes.isSelected()) {
					iHeightTable=ListadoClientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoClientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoClientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadoClientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoClientes.isSelected()) {
					iHeightTable=ListadoClientesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoClientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoClientesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadoClientes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoClientes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoClientes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadoClientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoClientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoClientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadoClientes!=null && this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy()!=null) {
			//if(!this.listadoclientesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadoClientes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadoClientes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadoClientes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadoClientes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadoClientes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoClientes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoClientes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadoclientesLogic.getListadoClientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoclientess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadoClientes> TraerListadoClientesBeans(List<ListadoClientes> listadoclientess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadoClientes listadoclientes:listadoclientess) {
					
				if(!(ListadoClientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadoClientesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadoclientes.setsDetalleGeneralEntityReporte(ListadoClientesConstantesFunciones.getListadoClientesDescripcion(listadoclientes));
										
						
					
						
					
				} else  {
							
					//listadoclientes.setsDetalleGeneralEntityReporte(listadoclientes.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadoclientesbeans.add(listadoclientesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadoclientess;
    }
	//PARA REPORTES FIN
}
