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
import com.bydan.erp.cartera.util.report.ListadoMovimientosConstantesFunciones;

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
public class ListadoMovimientosJInternalFrame extends ListadoMovimientosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarListadoMovimientos;
	
	protected JMenuBar jmenuBarListadoMovimientos;
	
	protected JMenu jmenuListadoMovimientos;
	protected JMenu jmenuDatosListadoMovimientos;
	protected JMenu jmenuArchivoListadoMovimientos;
	protected JMenu jmenuAccionesListadoMovimientos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutListadoMovimientos;	
	protected GridBagConstraints gridBagConstraintsListadoMovimientos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ListadoMovimientosDetalleFormJInternalFrame jInternalFrameDetalleFormListadoMovimientos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoListadoMovimientos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionListadoMovimientos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ListadoMovimientosSessionBean listadomovimientosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ListadoMovimientos> listadomovimientoss;		
	public List<ListadoMovimientos> listadomovimientossEliminados;	
	public List<ListadoMovimientos> listadomovimientossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByListadoMovimientos;		
	protected JButton jButtonAbrirOrderByListadoMovimientos;
	
	
	//protected JPanel jPanelOrderByListadoMovimientos;
	//public JScrollPane jScrollPanelOrderByListadoMovimientos;	
	//protected JButton jButtonCerrarOrderByListadoMovimientos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ListadoMovimientosLogic listadomovimientosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosListadoMovimientos;
	public JScrollPane jScrollPanelDatosEdicionListadoMovimientos;
	public JScrollPane jScrollPanelDatosGeneralListadoMovimientos;
    
	
	
	//public JScrollPane jScrollPanelDatosListadoMovimientosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoListadoMovimientos;
	//public JScrollPane jScrollPanelImportacionListadoMovimientos;
	
	
	
	protected JPanel jPanelAccionesListadoMovimientos;
	
    protected JPanel jPanelPaginacionListadoMovimientos;
    protected JPanel jPanelParametrosReportesListadoMovimientos;
	protected JPanel jPanelParametrosReportesAccionesListadoMovimientos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ListadoMovimientos;
	protected JPanel jPanelParametrosAuxiliar2ListadoMovimientos;
	protected JPanel jPanelParametrosAuxiliar3ListadoMovimientos;
	protected JPanel jPanelParametrosAuxiliar4ListadoMovimientos;
	//protected JPanel jPanelParametrosAuxiliar5ListadoMovimientos;
	
	
	
	//protected JPanel jPanelReporteDinamicoListadoMovimientos;
	//protected JPanel jPanelImportacionListadoMovimientos;
	
	
	public JTable jTableDatosListadoMovimientos;
	
	
	
	//public JTable jTableDatosListadoMovimientosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoListadoMovimientos;
	protected JButton jButtonDuplicarListadoMovimientos;
	protected JButton jButtonCopiarListadoMovimientos;
	protected JButton jButtonVerFormListadoMovimientos;
	protected JButton jButtonNuevoRelacionesListadoMovimientos;
	protected JButton jButtonModificarListadoMovimientos;
	
    protected JButton jButtonGuardarCambiosTablaListadoMovimientos;
	protected JButton jButtonCerrarListadoMovimientos;
	
	
	protected JButton jButtonRecargarInformacionListadoMovimientos;
	protected JButton jButtonProcesarInformacionListadoMovimientos;
	
	
	protected JButton jButtonAnterioresListadoMovimientos;
	protected JButton jButtonSiguientesListadoMovimientos;
	protected JButton jButtonNuevoGuardarCambiosListadoMovimientos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoListadoMovimientos;
	//protected JButton jButtonCerrarReporteDinamicoListadoMovimientos;
	//protected JButton jButtonGenerarExcelReporteDinamicoListadoMovimientos;	
	
	
	
	//protected JButton jButtonAbrirImportacionListadoMovimientos;
	//protected JButton jButtonGenerarImportacionListadoMovimientos;
	//protected JButton jButtonCerrarImportacionListadoMovimientos;
	//protected JFileChooser jFileChooserImportacionListadoMovimientos;
	//protected File fileImportacionListadoMovimientos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarListadoMovimientos;
	protected JButton jButtonDuplicarToolBarListadoMovimientos;
	protected JButton jButtonNuevoRelacionesToolBarListadoMovimientos;
	
	
	public JButton jButtonGuardarCambiosToolBarListadoMovimientos;
	protected JButton jButtonCopiarToolBarListadoMovimientos;
	protected JButton jButtonVerFormToolBarListadoMovimientos;
	public JButton jButtonGuardarCambiosTablaToolBarListadoMovimientos;
	protected JButton jButtonMostrarOcultarTablaToolBarListadoMovimientos;
	protected JButton jButtonCerrarToolBarListadoMovimientos;
	
	protected JButton jButtonRecargarInformacionToolBarListadoMovimientos;
	protected JButton jButtonProcesarInformacionToolBarListadoMovimientos;
	protected JButton jButtonAnterioresToolBarListadoMovimientos;
	protected JButton jButtonSiguientesToolBarListadoMovimientos;
	protected JButton jButtonNuevoGuardarCambiosToolBarListadoMovimientos;
	protected JButton jButtonAbrirOrderByToolBarListadoMovimientos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoListadoMovimientos;
	protected JMenuItem jMenuItemDuplicarListadoMovimientos;
	protected JMenuItem jMenuItemNuevoRelacionesListadoMovimientos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosListadoMovimientos;
	protected JMenuItem jMenuItemCopiarListadoMovimientos;
	protected JMenuItem jMenuItemVerFormListadoMovimientos;
	protected JMenuItem jMenuItemGuardarCambiosTablaListadoMovimientos;
	protected JMenuItem jMenuItemCerrarListadoMovimientos;
	protected JMenuItem jMenuItemDetalleCerrarListadoMovimientos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByListadoMovimientos;
	protected JMenuItem jMenuItemDetalleMostarOcultarListadoMovimientos;
	
	protected JMenuItem jMenuItemRecargarInformacionListadoMovimientos;
	protected JMenuItem jMenuItemProcesarInformacionListadoMovimientos;
	protected JMenuItem jMenuItemAnterioresListadoMovimientos;
	protected JMenuItem jMenuItemSiguientesListadoMovimientos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosListadoMovimientos;
	protected JMenuItem jMenuItemAbrirOrderByListadoMovimientos;
	protected JMenuItem jMenuItemMostrarOcultarListadoMovimientos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesListadoMovimientos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosListadoMovimientos;
	protected JCheckBox jCheckBoxSeleccionadosListadoMovimientos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaListadoMovimientos;
	protected JCheckBox jCheckBoxConGraficoReporteListadoMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesListadoMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesListadoMovimientos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoListadoMovimientos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoListadoMovimientos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesListadoMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionListadoMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesListadoMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesListadoMovimientos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarListadoMovimientos;
	protected JTextField jTextFieldValorCampoGeneralListadoMovimientos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteListadoMovimientos;
	//public JList<Reporte> jListColumnasSelectReporteListadoMovimientos;
	//public JScrollPane jScrollColumnasSelectReporteListadoMovimientos;
	
	//public JLabel jLabelRelacionesSelectReporteListadoMovimientos;
	//public JList<Reporte> jListRelacionesSelectReporteListadoMovimientos;
	//public JScrollPane jScrollRelacionesSelectReporteListadoMovimientos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoListadoMovimientos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoListadoMovimientos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoListadoMovimientos;
	//public JLabel jLabelTiposArchivoReporteDinamicoListadoMovimientos;
	
		
	//public JLabel jLabelArchivoImportacionListadoMovimientos;	
	//public JLabel jLabelPathArchivoImportacionListadoMovimientos;
	//protected JTextField jTextFieldPathArchivoImportacionListadoMovimientos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoListadoMovimientos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoListadoMovimientos;
	
	//public JLabel jLabelColumnaCategoriaValorListadoMovimientos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorListadoMovimientos;
	
	//public JLabel jLabelColumnasValoresGraficoListadoMovimientos;
	//public JList<Reporte> jListColumnasValoresGraficoListadoMovimientos;
	//public JScrollPane jScrollColumnasValoresGraficoListadoMovimientos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoListadoMovimientos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoListadoMovimientos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasListadoMovimientos;
	public JPanel jPanelBusquedaListadoMovimientosListadoMovimientos;
	public JButton jButtonBusquedaListadoMovimientosListadoMovimientos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos;
	public JLabel jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos;
	public JButton jButtonfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos;
	public JLabel jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos;
	public JButton jButtonfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientosBusqueda= new JButtonMe();

	
	
	
	
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
	public ListadoMovimientosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ListadoMovimientosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionListadoMovimientos)	{
		this.jButtonRecargarInformacionListadoMovimientos = jButtonRecargarInformacionListadoMovimientos;
	}
	
	public JButton getjButtonProcesarInformacionListadoMovimientos() {
		return this.jButtonProcesarInformacionListadoMovimientos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionListadoMovimientos)	{
		this.jButtonProcesarInformacionListadoMovimientos = jButtonProcesarInformacionListadoMovimientos;
	}
	
	
	public JButton getjButtonRecargarInformacionListadoMovimientos() {
		return this.jButtonRecargarInformacionListadoMovimientos;
	}
	
	
	public List<ListadoMovimientos> getlistadomovimientoss() {
		return this.listadomovimientoss;
	}

	public void setlistadomovimientoss(List<ListadoMovimientos> listadomovimientoss) {
		this.listadomovimientoss = listadomovimientoss;
	}
	
	public List<ListadoMovimientos> getlistadomovimientossAux() {
		return this.listadomovimientossAux;
	}

	public void setlistadomovimientossAux(List<ListadoMovimientos> listadomovimientossAux) {
		this.listadomovimientossAux = listadomovimientossAux;
	}
	
	public List<ListadoMovimientos> getlistadomovimientossEliminados() {
		return this.listadomovimientossEliminados;
	}

	public void setListadoMovimientossEliminados(List<ListadoMovimientos> listadomovimientossEliminados) {
		this.listadomovimientossEliminados = listadomovimientossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarListadoMovimientos() {
		return jComboBoxTiposSeleccionarListadoMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarListadoMovimientos(
			JComboBox jComboBoxTiposSeleccionarListadoMovimientos) {
		this.jComboBoxTiposSeleccionarListadoMovimientos = jComboBoxTiposSeleccionarListadoMovimientos;
	}
	
	public void setBorderResaltarTiposSeleccionarListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarListadoMovimientos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralListadoMovimientos() {
		return jTextFieldValorCampoGeneralListadoMovimientos;
	}

	public void setjTextFieldValorCampoGeneralListadoMovimientos(
			JTextField jTextFieldValorCampoGeneralListadoMovimientos) {
		this.jTextFieldValorCampoGeneralListadoMovimientos = jTextFieldValorCampoGeneralListadoMovimientos;
	}

	public void setBorderResaltarValorCampoGeneralListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralListadoMovimientos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosListadoMovimientos() {
		return this.jCheckBoxSeleccionarTodosListadoMovimientos;
	}

	public void setjCheckBoxSeleccionarTodosListadoMovimientos(
			JCheckBox jCheckBoxSeleccionarTodosListadoMovimientos) {
		this.jCheckBoxSeleccionarTodosListadoMovimientos = jCheckBoxSeleccionarTodosListadoMovimientos;
	}

	public void setBorderResaltarSeleccionarTodosListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosListadoMovimientos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosListadoMovimientos() {
		return this.jCheckBoxSeleccionadosListadoMovimientos;
	}

	public void setjCheckBoxSeleccionadosListadoMovimientos(
			JCheckBox jCheckBoxSeleccionadosListadoMovimientos) {
		this.jCheckBoxSeleccionadosListadoMovimientos = jCheckBoxSeleccionadosListadoMovimientos;
	}
	
	public void setBorderResaltarSeleccionadosListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosListadoMovimientos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesListadoMovimientos() {
		return this.jComboBoxTiposArchivosReportesListadoMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesListadoMovimientos(
			JComboBox jComboBoxTiposArchivosReportesListadoMovimientos) {
		this.jComboBoxTiposArchivosReportesListadoMovimientos = jComboBoxTiposArchivosReportesListadoMovimientos;
	}

	public void setBorderResaltarTiposArchivosReportesListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesListadoMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesListadoMovimientos() {
		return this.jComboBoxTiposReportesListadoMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesListadoMovimientos(
			JComboBox jComboBoxTiposReportesListadoMovimientos) {
		this.jComboBoxTiposReportesListadoMovimientos = jComboBoxTiposReportesListadoMovimientos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoListadoMovimientos() {
	//	return jComboBoxTiposReportesDinamicoListadoMovimientos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoListadoMovimientos(
	//		JComboBox jComboBoxTiposReportesDinamicoListadoMovimientos) {
	//	this.jComboBoxTiposReportesDinamicoListadoMovimientos = jComboBoxTiposReportesDinamicoListadoMovimientos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoListadoMovimientos() {
	//	return jComboBoxTiposArchivosReportesDinamicoListadoMovimientos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoListadoMovimientos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoListadoMovimientos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos = jComboBoxTiposArchivosReportesDinamicoListadoMovimientos;
	//}
	
	public void setBorderResaltarTiposReportesListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesListadoMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesListadoMovimientos() {
		return this.jComboBoxTiposGraficosReportesListadoMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesListadoMovimientos(
			JComboBox jComboBoxTiposGraficosReportesListadoMovimientos) {
		this.jComboBoxTiposGraficosReportesListadoMovimientos = jComboBoxTiposGraficosReportesListadoMovimientos;
	}
	
	public void setBorderResaltarTiposGraficosReportesListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesListadoMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionListadoMovimientos() {
		return this.jComboBoxTiposPaginacionListadoMovimientos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionListadoMovimientos(
			JComboBox jComboBoxTiposPaginacionListadoMovimientos) {
		this.jComboBoxTiposPaginacionListadoMovimientos = jComboBoxTiposPaginacionListadoMovimientos;
	}
	
	public void setBorderResaltarTiposPaginacionListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionListadoMovimientos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesListadoMovimientos() {
		return this.jComboBoxTiposRelacionesListadoMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesListadoMovimientos() {
		return this.jComboBoxTiposAccionesListadoMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesListadoMovimientos(
			JComboBox jComboBoxTiposRelacionesListadoMovimientos) {
		this.jComboBoxTiposRelacionesListadoMovimientos = jComboBoxTiposRelacionesListadoMovimientos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesListadoMovimientos(
			JComboBox jComboBoxTiposAccionesListadoMovimientos) {
		this.jComboBoxTiposAccionesListadoMovimientos = jComboBoxTiposAccionesListadoMovimientos;
	}
	
	public void setBorderResaltarTiposRelacionesListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesListadoMovimientos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesListadoMovimientos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesListadoMovimientos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoListadoMovimientos() {
	//	return jCheckBoxConGraficoDinamicoListadoMovimientos;
	//}

	//public void setjCheckBoxConGraficoDinamicoListadoMovimientos(
	//		JCheckBox jCheckBoxConGraficoDinamicoListadoMovimientos) {
	//	this.jCheckBoxConGraficoDinamicoListadoMovimientos = jCheckBoxConGraficoDinamicoListadoMovimientos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoListadoMovimientos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarListadoMovimientos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoListadoMovimientos .setBorder(borderResaltar);		
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
		this.listadomovimientosSessionBean=new ListadoMovimientosSessionBean();
		
		this.listadomovimientosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadomovimientosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.listadomovimientosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ListadoMovimientosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ListadoMovimientosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Listado Movimientos MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
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
		
		ListadoMovimientosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ListadoMovimientos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarListadoMovimientos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"nuevo","nuevo","Nuevo"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"duplicar","duplicar","Duplicar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"copiar","copiar","Copiar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"ver_form","ver_form","Ver"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"recargar","recargar","Buscar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarListadoMovimientos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarListadoMovimientos,this.jTtoolBarListadoMovimientos,
							"cerrar","cerrar","Salir"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarListadoMovimientos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarListadoMovimientos;
			
				this.jButtonProcesarInformacionToolBarListadoMovimientos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarListadoMovimientos;
				
		//protected JButton jButtonModificarToolBarListadoMovimientos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarListadoMovimientos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuListadoMovimientos=new JMenuMe("General");
		this.jmenuArchivoListadoMovimientos=new JMenuMe("Archivo");
		this.jmenuAccionesListadoMovimientos=new JMenuMe("Acciones");
		this.jmenuDatosListadoMovimientos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoListadoMovimientos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoListadoMovimientos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoListadoMovimientos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarListadoMovimientos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarListadoMovimientos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarListadoMovimientos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesListadoMovimientos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesListadoMovimientos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesListadoMovimientos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosListadoMovimientos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosListadoMovimientos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosListadoMovimientos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarListadoMovimientos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarListadoMovimientos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarListadoMovimientos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormListadoMovimientos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormListadoMovimientos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormListadoMovimientos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaListadoMovimientos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaListadoMovimientos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaListadoMovimientos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarListadoMovimientos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarListadoMovimientos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarListadoMovimientos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionListadoMovimientos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionListadoMovimientos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionListadoMovimientos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionListadoMovimientos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionListadoMovimientos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionListadoMovimientos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresListadoMovimientos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresListadoMovimientos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresListadoMovimientos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesListadoMovimientos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesListadoMovimientos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesListadoMovimientos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByListadoMovimientos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByListadoMovimientos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByListadoMovimientos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarListadoMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarListadoMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarListadoMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByListadoMovimientos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByListadoMovimientos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByListadoMovimientos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarListadoMovimientos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarListadoMovimientos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarListadoMovimientos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosListadoMovimientos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosListadoMovimientos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosListadoMovimientos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoListadoMovimientos.add(this.jMenuItemCerrarListadoMovimientos);
			
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemNuevoListadoMovimientos);
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemNuevoGuardarCambiosListadoMovimientos);
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemNuevoRelacionesListadoMovimientos);
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemGuardarCambiosTablaListadoMovimientos);		
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemDuplicarListadoMovimientos);		
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemCopiarListadoMovimientos);		
			this.jmenuAccionesListadoMovimientos.add(this.jMenuItemVerFormListadoMovimientos);		
			
			this.jmenuDatosListadoMovimientos.add(this.jMenuItemRecargarInformacionListadoMovimientos);				
			this.jmenuDatosListadoMovimientos.add(this.jMenuItemAnterioresListadoMovimientos);				
			this.jmenuDatosListadoMovimientos.add(this.jMenuItemSiguientesListadoMovimientos);				
			this.jmenuDatosListadoMovimientos.add(this.jMenuItemAbrirOrderByListadoMovimientos);				
			this.jmenuDatosListadoMovimientos.add(this.jMenuItemMostrarOcultarListadoMovimientos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesListadoMovimientos.add(this.jMenuItemGuardarCambiosListadoMovimientos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarListadoMovimientos.add(this.jmenuArchivoListadoMovimientos);		
			this.jmenuBarListadoMovimientos.add(this.jmenuAccionesListadoMovimientos);		
			this.jmenuBarListadoMovimientos.add(this.jmenuDatosListadoMovimientos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarListadoMovimientos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasListadoMovimientos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaListadoMovimientosListadoMovimientos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaListadoMovimientosListadoMovimientos.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		this.jButtonBusquedaListadoMovimientosListadoMovimientos= new JButtonMe();
		this.jButtonBusquedaListadoMovimientosListadoMovimientos.setText("Buscar");
		this.jButtonBusquedaListadoMovimientosListadoMovimientos.setToolTipText("Buscar Por Fecha Desde Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaListadoMovimientosListadoMovimientos,"buscar_button","Buscar Por Fecha Desde Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaListadoMovimientosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setText("Fecha Desde :");
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setToolTipText("Fecha Desde");
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setText("Fecha Hasta :");
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setToolTipText("Fecha Hasta");
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasListadoMovimientos=new JTabbedPane();


		this.jTabbedPaneBusquedasListadoMovimientos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasListadoMovimientos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasListadoMovimientos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasListadoMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleListadoMovimientos = new ListadoMovimientosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Listado Movimientos DATOS");
			this.jInternalFrameDetalleFormListadoMovimientos = new ListadoMovimientosDetalleFormJInternalFrame(jDesktopPane,this.listadomovimientosSessionBean.getConGuardarRelaciones(),this.listadomovimientosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormListadoMovimientos = null;//new ListadoMovimientosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutListadoMovimientos= new GridBagLayout();
		
		
		this.jTableDatosListadoMovimientos = new JTableMe();      
		
		String sToolTipListadoMovimientos="";
		sToolTipListadoMovimientos=ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipListadoMovimientos+="(Cartera.ListadoMovimientos)";
		}
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			sToolTipListadoMovimientos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosListadoMovimientos.setToolTipText(sToolTipListadoMovimientos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosListadoMovimientos);
		this.jTableDatosListadoMovimientos.setAutoCreateRowSorter(true);
		this.jTableDatosListadoMovimientos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosListadoMovimientos.setRowSelectionAllowed(true);
		this.jTableDatosListadoMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosListadoMovimientos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoListadoMovimientos = new JButtonMe();
		this.jButtonDuplicarListadoMovimientos = new JButtonMe();
		this.jButtonCopiarListadoMovimientos = new JButtonMe();
		this.jButtonVerFormListadoMovimientos = new JButtonMe();
		this.jButtonNuevoRelacionesListadoMovimientos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaListadoMovimientos = new JButtonMe();
		this.jButtonCerrarListadoMovimientos = new JButtonMe();
		
		this.jScrollPanelDatosListadoMovimientos = new JScrollPane();   
        this.jScrollPanelDatosGeneralListadoMovimientos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Listado Movimientos";
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses" + this.sPath));
		} else {
			this.jScrollPanelDatosListadoMovimientos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesListadoMovimientos.setToolTipText("Acciones");
        this.jPanelAccionesListadoMovimientos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoListadoMovimientos=new ReporteDinamicoJInternalFrame(ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoListadoMovimientos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionListadoMovimientos=new ImportacionJInternalFrame(ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionListadoMovimientos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByListadoMovimientos = new JButtonMe();
		
		this.jButtonAbrirOrderByListadoMovimientos.setText("Orden");
		this.jButtonAbrirOrderByListadoMovimientos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoMovimientos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoMovimientos,false,this);
			
			//this.cargarOrderByListadoMovimientos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByListadoMovimientos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoMovimientos,true,this);
			
			//this.cargarOrderByListadoMovimientos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosListadoMovimientos.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosListadoMovimientos.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosListadoMovimientos.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosListadoMovimientos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoMovimientos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosListadoMovimientos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoListadoMovimientos.setText("Nuevo");
		this.jButtonDuplicarListadoMovimientos.setText("Duplicar");
		this.jButtonCopiarListadoMovimientos.setText("Copiar");
		this.jButtonVerFormListadoMovimientos.setText("Ver");
		this.jButtonNuevoRelacionesListadoMovimientos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.setText("Guardar");
		this.jButtonCerrarListadoMovimientos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoListadoMovimientos,"nuevo_button","Nuevo",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarListadoMovimientos,"duplicar_button","Duplicar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarListadoMovimientos,"copiar_button","Copiar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormListadoMovimientos,"ver_form","Ver",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesListadoMovimientos,"nuevorelaciones_button","Nuevo Rel",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaListadoMovimientos,"guardarcambiostabla_button","Guardar",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarListadoMovimientos,"cerrar_button","Salir",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoListadoMovimientos.setToolTipText("Nuevo"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarListadoMovimientos.setToolTipText("Duplicar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarListadoMovimientos.setToolTipText("Copiar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormListadoMovimientos.setToolTipText("Ver"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesListadoMovimientos.setToolTipText("Nuevo Rel"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.setToolTipText("Guardar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarListadoMovimientos.setToolTipText("Salir"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoListadoMovimientos";
		inputMap = this.jButtonNuevoListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoListadoMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoListadoMovimientos"));
		
		//DUPLICAR
		sMapKey = "DuplicarListadoMovimientos";
		inputMap = this.jButtonDuplicarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarListadoMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarListadoMovimientos"));
		
		//COPIAR
		sMapKey = "CopiarListadoMovimientos";
		inputMap = this.jButtonCopiarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarListadoMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarListadoMovimientos"));
		
		//VEr FORM
		sMapKey = "VerFormListadoMovimientos";
		inputMap = this.jButtonVerFormListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormListadoMovimientos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormListadoMovimientos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesListadoMovimientos";
		inputMap = this.jButtonNuevoRelacionesListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesListadoMovimientos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarListadoMovimientos";
		inputMap = this.jButtonModificarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarListadoMovimientos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarListadoMovimientos";
		inputMap = this.jButtonCerrarListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarListadoMovimientos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaListadoMovimientos";
		inputMap = this.jButtonGuardarCambiosTablaListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaListadoMovimientos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesListadoMovimientos.setName("jPanelParametrosReportesListadoMovimientos"); 
		
		this.jPanelParametrosReportesAccionesListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesListadoMovimientos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesListadoMovimientos.setName("jPanelParametrosReportesAccionesListadoMovimientos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionListadoMovimientos = new JButtonMe();
		this.jButtonRecargarInformacionListadoMovimientos.setText("Buscar");
		this.jButtonRecargarInformacionListadoMovimientos.setToolTipText("Buscar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionListadoMovimientos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionListadoMovimientos.setVisible(false);
		
		
		this.jButtonProcesarInformacionListadoMovimientos = new JButtonMe();
		this.jButtonProcesarInformacionListadoMovimientos.setText("Procesar");
		this.jButtonProcesarInformacionListadoMovimientos.setToolTipText("Procesar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionListadoMovimientos.setVisible(false);
			
		this.jButtonProcesarInformacionListadoMovimientos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoMovimientos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionListadoMovimientos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoMovimientos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesListadoMovimientos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoMovimientos.setText("TIPO");       
		this.jComboBoxTiposReportesListadoMovimientos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesListadoMovimientos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesListadoMovimientos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionListadoMovimientos.setText("Paginacion");
		this.jComboBoxTiposPaginacionListadoMovimientos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesListadoMovimientos.setText("Accion");
		this.jComboBoxTiposRelacionesListadoMovimientos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesListadoMovimientos.setText("Accion");
		this.jComboBoxTiposAccionesListadoMovimientos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarListadoMovimientos.setText("Accion");
		this.jComboBoxTiposSeleccionarListadoMovimientos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralListadoMovimientos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralListadoMovimientos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoMovimientos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralListadoMovimientos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesListadoMovimientos = new JLabelMe();
		
		this.jLabelAccionesListadoMovimientos.setText("Acciones");		
		this.jLabelAccionesListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosListadoMovimientos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosListadoMovimientos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosListadoMovimientos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosListadoMovimientos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosListadoMovimientos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaListadoMovimientos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaListadoMovimientos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaListadoMovimientos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteListadoMovimientos.setText("Graf.");
		this.jCheckBoxConGraficoReporteListadoMovimientos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresListadoMovimientos = new JButtonMe();
		//this.jButtonAnterioresListadoMovimientos.setText("<<");
        this.jButtonAnterioresListadoMovimientos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresListadoMovimientos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesListadoMovimientos = new JButtonMe();
		//this.jButtonSiguientesListadoMovimientos.setText(">>");
        this.jButtonSiguientesListadoMovimientos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesListadoMovimientos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosListadoMovimientos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosListadoMovimientos.setText("Nue");
        this.jButtonNuevoGuardarCambiosListadoMovimientos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosListadoMovimientos,"nuevoguardarcambios_button","Nue",this.listadomovimientosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosListadoMovimientos";
		inputMap = this.jButtonNuevoGuardarCambiosListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosListadoMovimientos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionListadoMovimientos";
		inputMap = this.jButtonRecargarInformacionListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionListadoMovimientos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesListadoMovimientos";
		inputMap = this.jButtonSiguientesListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesListadoMovimientos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresListadoMovimientos";
		inputMap = this.jButtonAnterioresListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresListadoMovimientos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasListadoMovimientos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesListadoMovimientos.setMinimumSize(new Dimension(this.getWidth(),ListadoMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoMovimientos.setMaximumSize(new Dimension(this.getWidth(),ListadoMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesListadoMovimientos.setPreferredSize(new Dimension(this.getWidth(),ListadoMovimientosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ListadoMovimientosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionListadoMovimientos = new GridBagLayout();

			this.jPanelPaginacionListadoMovimientos.setLayout(gridaBagLayoutPaginacionListadoMovimientos);						
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 0;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonAnterioresListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					
						
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoMovimientos.gridy = 0;
			
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonNuevoGuardarCambiosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
						
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsListadoMovimientos.gridy = 0;
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonSiguientesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 1;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonNuevoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
						
			
			
			if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
				this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsListadoMovimientos.gridy = 1;
				this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionListadoMovimientos.add(this.jButtonGuardarCambiosTablaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			}
			
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 1;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonDuplicarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 1;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonCopiarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 1;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonVerFormListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 1;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionListadoMovimientos.add(this.jButtonCerrarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		
		this.jButtonRecargarInformacionListadoMovimientos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoMovimientos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionListadoMovimientos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesListadoMovimientos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoMovimientos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesListadoMovimientos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesListadoMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesListadoMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesListadoMovimientos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoMovimientos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesListadoMovimientos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionListadoMovimientos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoMovimientos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionListadoMovimientos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesListadoMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesListadoMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesListadoMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesListadoMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarListadoMovimientos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoMovimientos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarListadoMovimientos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaListadoMovimientos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoMovimientos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaListadoMovimientos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteListadoMovimientos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoMovimientos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteListadoMovimientos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosListadoMovimientos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoMovimientos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosListadoMovimientos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosListadoMovimientos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoMovimientos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosListadoMovimientos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesListadoMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesListadoMovimientos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ListadoMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ListadoMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ListadoMovimientos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ListadoMovimientos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesListadoMovimientos.setLayout(gridaBagParametrosReportesListadoMovimientos);
			this.jPanelParametrosReportesAccionesListadoMovimientos.setLayout(gridaBagParametrosReportesAccionesListadoMovimientos);
			
			
			this.jPanelParametrosAuxiliar1ListadoMovimientos.setLayout(gridaBagParametrosAuxiliar1ListadoMovimientos);
			this.jPanelParametrosAuxiliar2ListadoMovimientos.setLayout(gridaBagParametrosAuxiliar2ListadoMovimientos);
			this.jPanelParametrosAuxiliar3ListadoMovimientos.setLayout(gridaBagParametrosAuxiliar3ListadoMovimientos);
			this.jPanelParametrosAuxiliar4ListadoMovimientos.setLayout(gridaBagParametrosAuxiliar4ListadoMovimientos);
			//this.jPanelParametrosAuxiliar5ListadoMovimientos.setLayout(gridaBagParametrosAuxiliar2ListadoMovimientos);			
			
			
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoMovimientos.add(this.jButtonRecargarInformacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoMovimientos.add(this.jComboBoxTiposPaginacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoMovimientos.add(this.jCheckBoxConAltoMaximoTablaListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ListadoMovimientos.add(this.jComboBoxTiposArchivosReportesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoMovimientos.add(this.jPanelParametrosAuxiliar1ListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ListadoMovimientos.add(this.jComboBoxTiposReportesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);																		
			
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ListadoMovimientos.add(this.jComboBoxTiposGraficosReportesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoMovimientos.add(this.jPanelParametrosAuxiliar4ListadoMovimientos, this.gridBagConstraintsListadoMovimientos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoMovimientos.add(this.jComboBoxTiposReportesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoMovimientos.add(this.jCheckBoxGenerarReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoMovimientos.add(this.jPanelParametrosAuxiliar2ListadoMovimientos, this.gridBagConstraintsListadoMovimientos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoMovimientos.add(this.jLabelAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
				this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesListadoMovimientos.add(this.jButtonAbrirOrderByListadoMovimientos, this.gridBagConstraintsListadoMovimientos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoMovimientos.add(this.jComboBoxTiposSeleccionarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
			
			
			/*
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoMovimientos.add(this.jCheckBoxSeleccionarTodosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesListadoMovimientos.add(this.jCheckBoxConGraficoReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoMovimientos.add(this.jCheckBoxSeleccionarTodosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);															
				
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoMovimientos.add(this.jCheckBoxSeleccionadosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);															
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsListadoMovimientos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ListadoMovimientos.add(this.jCheckBoxConGraficoReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesListadoMovimientos.add(this.jPanelParametrosAuxiliar3ListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsListadoMovimientos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesListadoMovimientos.add(this.jComboBoxTiposAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosListadoMovimientos = new GridBagLayout();

			this.jScrollPanelDatosListadoMovimientos.setLayout(gridaBagLayoutDatosListadoMovimientos);
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = 0;
			this.gridBagConstraintsListadoMovimientos.gridx = 0;
			
			this.jScrollPanelDatosListadoMovimientos.add(this.jTableDatosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosListadoMovimientos.setViewportView(this.jTableDatosListadoMovimientos);
		this.jTableDatosListadoMovimientos.setFillsViewportHeight(true);
		this.jTableDatosListadoMovimientos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesListadoMovimientos= new GridBagLayout();
		this.jPanelAccionesListadoMovimientos.setLayout(gridaBagLayoutAccionesListadoMovimientos);
		
		
		/*	
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = 0;
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
			
		this.jPanelAccionesListadoMovimientos.add(this.jButtonNuevoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos= new GridBagLayout();
		gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaListadoMovimientosListadoMovimientos.setLayout(gridaBagLayoutBusquedaListadoMovimientosListadoMovimientos);

		gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoMovimientos.gridy = 0;
		gridBagConstraintsListadoMovimientos.gridx = 0;
		jPanelBusquedaListadoMovimientosListadoMovimientos.add(jLabelfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos, gridBagConstraintsListadoMovimientos);

		gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoMovimientos.gridy = 0;
		gridBagConstraintsListadoMovimientos.gridx = 1;
		jPanelBusquedaListadoMovimientosListadoMovimientos.add(jDateChooserfecha_emision_desdeBusquedaListadoMovimientosListadoMovimientos, gridBagConstraintsListadoMovimientos);


		gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoMovimientos.gridy = 1;
		gridBagConstraintsListadoMovimientos.gridx = 0;
		jPanelBusquedaListadoMovimientosListadoMovimientos.add(jLabelfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos, gridBagConstraintsListadoMovimientos);

		gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoMovimientos.gridy = 1;
		gridBagConstraintsListadoMovimientos.gridx = 1;
		jPanelBusquedaListadoMovimientosListadoMovimientos.add(jDateChooserfecha_emision_hastaBusquedaListadoMovimientosListadoMovimientos, gridBagConstraintsListadoMovimientos);

		gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsListadoMovimientos.gridy = 2;
		gridBagConstraintsListadoMovimientos.gridx =1;
		jPanelBusquedaListadoMovimientosListadoMovimientos.add(jButtonBusquedaListadoMovimientosListadoMovimientos, gridBagConstraintsListadoMovimientos);

		jTabbedPaneBusquedasListadoMovimientos.addTab("1.-Por Fecha Desde Por Fecha Hasta ", jPanelBusquedaListadoMovimientosListadoMovimientos);
		jTabbedPaneBusquedasListadoMovimientos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutListadoMovimientos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutListadoMovimientos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();						
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoMovimientos.gridx = 0;		
			//this.gridBagConstraintsListadoMovimientos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsListadoMovimientos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarListadoMovimientos, this.gridBagConstraintsListadoMovimientos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsListadoMovimientos.gridx = 0;		
		//this.gridBagConstraintsListadoMovimientos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsListadoMovimientos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsListadoMovimientos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsListadoMovimientos.gridx = 0;		
			this.gridBagConstraintsListadoMovimientos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsListadoMovimientos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasListadoMovimientos, this.gridBagConstraintsListadoMovimientos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);								
		
		
		/*
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		*/		
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsListadoMovimientos.gridx =0;
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsListadoMovimientos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
				
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ListadoMovimientosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosListadoMovimientos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosListadoMovimientos = new GridBagLayout();
			this.jPanelBusquedasParametrosListadoMovimientos.setLayout(gridaBagLayoutBusquedasParametrosListadoMovimientos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralListadoMovimientos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralListadoMovimientos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoMovimientos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralListadoMovimientos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
			
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsListadoMovimientos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralListadoMovimientos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoListadoMovimientos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoListadoMovimientos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoListadoMovimientos.setName("jPanelReporteDinamicoListadoMovimientos"); 
		
		this.jPanelReporteDinamicoListadoMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoListadoMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoListadoMovimientos.setLayout(gridaBagLayoutReporteDinamicoListadoMovimientos);
		
		
		this.jInternalFrameReporteDinamicoListadoMovimientos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoListadoMovimientos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoMovimientos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoListadoMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoListadoMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoListadoMovimientos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoListadoMovimientos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoListadoMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoListadoMovimientos.setResizable(true);
	    this.jInternalFrameReporteDinamicoListadoMovimientos.setClosable(true);
	    this.jInternalFrameReporteDinamicoListadoMovimientos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoListadoMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoListadoMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteListadoMovimientos = new JLabelMe();

		this.jLabelColumnasSelectReporteListadoMovimientos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelColumnasSelectReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteListadoMovimientos = new JList<Reporte>();
		this.jListColumnasSelectReporteListadoMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteListadoMovimientos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteListadoMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteListadoMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteListadoMovimientos=new JScrollPane(this.jListColumnasSelectReporteListadoMovimientos);
			
			this.jScrollColumnasSelectReporteListadoMovimientos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoMovimientos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteListadoMovimientos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoListadoMovimientos.add(this.jListColumnasSelectReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jScrollColumnasSelectReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteListadoMovimientos = new JLabelMe();

		this.jLabelRelacionesSelectReporteListadoMovimientos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteListadoMovimientos = new JList<Reporte>();
		this.jListRelacionesSelectReporteListadoMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteListadoMovimientos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteListadoMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteListadoMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteListadoMovimientos=new JScrollPane(this.jListRelacionesSelectReporteListadoMovimientos);
			
			this.jScrollRelacionesSelectReporteListadoMovimientos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoMovimientos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteListadoMovimientos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoListadoMovimientos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoListadoMovimientos = new JComboBoxMe();
		this.jListColumnasValoresGraficoListadoMovimientos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoListadoMovimientos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoListadoMovimientos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoListadoMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoListadoMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoListadoMovimientos = new JLabelMe();

		this.jLabelConGraficoDinamicoListadoMovimientos.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelConGraficoDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoListadoMovimientos = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoListadoMovimientos.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoListadoMovimientos.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoListadoMovimientos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadoMovimientos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoListadoMovimientos.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jCheckBoxConGraficoDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoListadoMovimientos = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoListadoMovimientos.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelColumnaCategoriaGraficoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jComboBoxColumnaCategoriaGraficoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorListadoMovimientos = new JLabelMe();

		this.jLabelColumnaCategoriaValorListadoMovimientos.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelColumnaCategoriaValorListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorListadoMovimientos.setText("Accion");
        this.jComboBoxColumnaCategoriaValorListadoMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorListadoMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadoMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorListadoMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jComboBoxColumnaCategoriaValorListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoListadoMovimientos = new JLabelMe();

		this.jLabelColumnasValoresGraficoListadoMovimientos.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelColumnasValoresGraficoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoListadoMovimientos = new JList<Reporte>();
		this.jListColumnasValoresGraficoListadoMovimientos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoListadoMovimientos.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoListadoMovimientos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadoMovimientos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoListadoMovimientos.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoListadoMovimientos=new JScrollPane(this.jListColumnasValoresGraficoListadoMovimientos);
			
			this.jScrollColumnasValoresGraficoListadoMovimientos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadoMovimientos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoListadoMovimientos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoListadoMovimientos.add(this.jListColumnasSelectReporteListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jScrollColumnasValoresGraficoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoListadoMovimientos = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoListadoMovimientos.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelTiposGraficosReportesDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoListadoMovimientos.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jComboBoxTiposGraficosReportesDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoListadoMovimientos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoListadoMovimientos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelGenerarExcelReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoListadoMovimientos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoListadoMovimientos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoListadoMovimientos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoListadoMovimientos.setToolTipText("Generar EXCEL"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		//this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoListadoMovimientos.add(this.jButtonGenerarExcelReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jComboBoxTiposReportesDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoListadoMovimientos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoListadoMovimientos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jLabelTiposArchivoReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jComboBoxTiposArchivosReportesDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoListadoMovimientos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoListadoMovimientos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoListadoMovimientos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoListadoMovimientos.setToolTipText("Generar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jButtonGenerarReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoListadoMovimientos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoListadoMovimientos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoListadoMovimientos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoListadoMovimientos.setToolTipText("Cancelar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoListadoMovimientos.add(this.jButtonCerrarReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalListadoMovimientos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoListadoMovimientos= new JScrollPane(jPanelReporteDinamicoListadoMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoListadoMovimientos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoMovimientos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoListadoMovimientos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoListadoMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoListadoMovimientos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalListadoMovimientos);
		this.jInternalFrameReporteDinamicoListadoMovimientos.getContentPane().add(this.jScrollPanelReporteDinamicoListadoMovimientos, this.gridBagConstraintsListadoMovimientos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionListadoMovimientos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionListadoMovimientos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionListadoMovimientos.setName("jPanelImportacionListadoMovimientos"); 
		
		this.jPanelImportacionListadoMovimientos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoMovimientos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionListadoMovimientos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionListadoMovimientos.setLayout(gridaBagLayoutImportacionListadoMovimientos);
		
		
		this.jInternalFrameImportacionListadoMovimientos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionListadoMovimientos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionListadoMovimientos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteListadoMovimientos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionListadoMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoMovimientos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionListadoMovimientos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoMovimientos.setResizable(true);
	    this.jInternalFrameImportacionListadoMovimientos.setClosable(true);
	    this.jInternalFrameImportacionListadoMovimientos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionListadoMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionListadoMovimientos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionListadoMovimientos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionListadoMovimientos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionListadoMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionListadoMovimientos.setResizable(true);
	    this.jInternalFrameImportacionListadoMovimientos.setClosable(true);
	    this.jInternalFrameImportacionListadoMovimientos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionListadoMovimientos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoMovimientos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionListadoMovimientos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionListadoMovimientos = new JLabelMe();

		this.jLabelArchivoImportacionListadoMovimientos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoMovimientos.add(this.jLabelArchivoImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionListadoMovimientos = new JFileChooser();		
		this.jFileChooserImportacionListadoMovimientos.setToolTipText("ESCOGER ARCHIVO"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionListadoMovimientos = new JButtonMe();
		this.jButtonAbrirImportacionListadoMovimientos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionListadoMovimientos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionListadoMovimientos.setToolTipText("Generar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoMovimientos.add(this.jButtonAbrirImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionListadoMovimientos = new JLabelMe();

		this.jLabelPathArchivoImportacionListadoMovimientos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionListadoMovimientos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoMovimientos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionListadoMovimientos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;		
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionListadoMovimientos.add(this.jLabelPathArchivoImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionListadoMovimientos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionListadoMovimientos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoMovimientos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionListadoMovimientos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoMovimientos.add(this.jTextFieldPathArchivoImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionListadoMovimientos = new JButtonMe();
		this.jButtonGenerarImportacionListadoMovimientos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionListadoMovimientos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionListadoMovimientos.setToolTipText("Generar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoMovimientos.add(this.jButtonGenerarImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionListadoMovimientos = new JButtonMe();
		this.jButtonCerrarImportacionListadoMovimientos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionListadoMovimientos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionListadoMovimientos.setToolTipText("Cancelar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsListadoMovimientos.gridy = iPosYImportacion;
		this.gridBagConstraintsListadoMovimientos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionListadoMovimientos.add(this.jButtonCerrarImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalListadoMovimientos = new GridBagLayout();
		
		this.jScrollPanelImportacionListadoMovimientos= new JScrollPane(jPanelImportacionListadoMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
		this.gridBagConstraintsListadoMovimientos.gridy =iPosYImportacion;
		this.gridBagConstraintsListadoMovimientos.gridx =iPosXImportacion;
		this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionListadoMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionListadoMovimientos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalListadoMovimientos);
		this.jInternalFrameImportacionListadoMovimientos.getContentPane().add(this.jScrollPanelImportacionListadoMovimientos, this.gridBagConstraintsListadoMovimientos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByListadoMovimientos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByListadoMovimientos = new JButtonMe();
			this.jButtonAbrirOrderByListadoMovimientos.setText("Orden");
			this.jButtonAbrirOrderByListadoMovimientos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByListadoMovimientos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByListadoMovimientos";
			inputMap = this.jButtonAbrirOrderByListadoMovimientos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByListadoMovimientos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByListadoMovimientos"));
		
		
			GridBagLayout gridaBagLayoutOrderByListadoMovimientos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByListadoMovimientos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByListadoMovimientos.setName("jPanelOrderByListadoMovimientos"); 
			
			this.jPanelOrderByListadoMovimientos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoMovimientos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByListadoMovimientos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByListadoMovimientos.setLayout(gridaBagLayoutOrderByListadoMovimientos);
			
			
			this.jTableDatosListadoMovimientosOrderBy = new JTableMe();        
			this.jTableDatosListadoMovimientosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosListadoMovimientosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosListadoMovimientosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosListadoMovimientosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosListadoMovimientosOrderBy.setViewportView(this.jTableDatosListadoMovimientosOrderBy);
			this.jTableDatosListadoMovimientosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosListadoMovimientosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByListadoMovimientos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByListadoMovimientos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByListadoMovimientos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteListadoMovimientos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByListadoMovimientos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByListadoMovimientos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByListadoMovimientos.setTitle("Orden");
			this.jInternalFrameOrderByListadoMovimientos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByListadoMovimientos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByListadoMovimientos.setResizable(true);
			this.jInternalFrameOrderByListadoMovimientos.setClosable(true);
			this.jInternalFrameOrderByListadoMovimientos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByListadoMovimientos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoMovimientos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByListadoMovimientos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByListadoMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Listado Movimientoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsListadoMovimientos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsListadoMovimientos.ipady =150;
				
			this.jPanelOrderByListadoMovimientos.add(jScrollPanelDatosListadoMovimientosOrderBy, this.gridBagConstraintsListadoMovimientos);//this.jTableDatosListadoMovimientosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByListadoMovimientos = new JButtonMe();
			this.jButtonCerrarOrderByListadoMovimientos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByListadoMovimientos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByListadoMovimientos.setToolTipText("Cancelar"+" "+ListadoMovimientosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByListadoMovimientos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsListadoMovimientos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsListadoMovimientos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByListadoMovimientos.add(this.jButtonCerrarOrderByListadoMovimientos, this.gridBagConstraintsListadoMovimientos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalListadoMovimientos = new GridBagLayout();
			
			this.jScrollPanelOrderByListadoMovimientos= new JScrollPane(jPanelOrderByListadoMovimientos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsListadoMovimientos = new GridBagConstraints();
			this.gridBagConstraintsListadoMovimientos.gridy =iPosYOrderBy;
			this.gridBagConstraintsListadoMovimientos.gridx =iPosXOrderBy;
			this.gridBagConstraintsListadoMovimientos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByListadoMovimientos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByListadoMovimientos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalListadoMovimientos);
			
			this.jInternalFrameOrderByListadoMovimientos.getContentPane().add(this.jScrollPanelOrderByListadoMovimientos, this.gridBagConstraintsListadoMovimientos);			
		
		} else {
			this.jButtonAbrirOrderByListadoMovimientos = new JButtonMe();
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
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.listadomovimientosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosListadoMovimientos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosListadoMovimientos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosListadoMovimientos.getRowHeight();//ListadoMovimientosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoMovimientos.isSelected()) {
					iHeightTable=ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaListadoMovimientos.isSelected()) {
					iHeightTable=ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ListadoMovimientosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosListadoMovimientos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoMovimientos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosListadoMovimientos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosListadoMovimientos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoMovimientos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosListadoMovimientos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByListadoMovimientos!=null && this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy()!=null) {
			//if(!this.listadomovimientosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByListadoMovimientos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByListadoMovimientos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByListadoMovimientos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByListadoMovimientos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosListadoMovimientos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoMovimientos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosListadoMovimientos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=listadomovimientosLogic.getListadoMovimientoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadomovimientoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ListadoMovimientos> TraerListadoMovimientosBeans(List<ListadoMovimientos> listadomovimientoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(ListadoMovimientos listadomovimientos:listadomovimientoss) {
					
				if(!(ListadoMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ListadoMovimientosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					listadomovimientos.setsDetalleGeneralEntityReporte(ListadoMovimientosConstantesFunciones.getListadoMovimientosDescripcion(listadomovimientos));
										
						
					
						
					
				} else  {
							
					//listadomovimientos.setsDetalleGeneralEntityReporte(listadomovimientos.getsDetalleGeneralEntityReporte());
										
				}
				
				//listadomovimientosbeans.add(listadomovimientosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return listadomovimientoss;
    }
	//PARA REPORTES FIN
}
