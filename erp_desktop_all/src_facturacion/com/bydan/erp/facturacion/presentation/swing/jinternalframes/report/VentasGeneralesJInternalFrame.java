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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasGeneralesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasGeneralesJInternalFrame extends VentasGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarVentasGenerales;
	
	protected JMenuBar jmenuBarVentasGenerales;
	
	protected JMenu jmenuVentasGenerales;
	protected JMenu jmenuDatosVentasGenerales;
	protected JMenu jmenuArchivoVentasGenerales;
	protected JMenu jmenuAccionesVentasGenerales;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasGenerales;	
	protected GridBagConstraints gridBagConstraintsVentasGenerales;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public VentasGeneralesDetalleFormJInternalFrame jInternalFrameDetalleFormVentasGenerales;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoVentasGenerales;	
	protected ImportacionJInternalFrame jInternalFrameImportacionVentasGenerales;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VentasGeneralesSessionBean ventasgeneralesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<VentasGenerales> ventasgeneraless;		
	public List<VentasGenerales> ventasgeneralessEliminados;	
	public List<VentasGenerales> ventasgeneralessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByVentasGenerales;		
	protected JButton jButtonAbrirOrderByVentasGenerales;
	
	
	//protected JPanel jPanelOrderByVentasGenerales;
	//public JScrollPane jScrollPanelOrderByVentasGenerales;	
	//protected JButton jButtonCerrarOrderByVentasGenerales;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public VentasGeneralesLogic ventasgeneralesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosVentasGenerales;
	public JScrollPane jScrollPanelDatosEdicionVentasGenerales;
	public JScrollPane jScrollPanelDatosGeneralVentasGenerales;
    
	
	
	//public JScrollPane jScrollPanelDatosVentasGeneralesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoVentasGenerales;
	//public JScrollPane jScrollPanelImportacionVentasGenerales;
	
	
	
	protected JPanel jPanelAccionesVentasGenerales;
	
    protected JPanel jPanelPaginacionVentasGenerales;
    protected JPanel jPanelParametrosReportesVentasGenerales;
	protected JPanel jPanelParametrosReportesAccionesVentasGenerales;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1VentasGenerales;
	protected JPanel jPanelParametrosAuxiliar2VentasGenerales;
	protected JPanel jPanelParametrosAuxiliar3VentasGenerales;
	protected JPanel jPanelParametrosAuxiliar4VentasGenerales;
	//protected JPanel jPanelParametrosAuxiliar5VentasGenerales;
	
	
	
	//protected JPanel jPanelReporteDinamicoVentasGenerales;
	//protected JPanel jPanelImportacionVentasGenerales;
	
	
	public JTable jTableDatosVentasGenerales;
	
	
	
	//public JTable jTableDatosVentasGeneralesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoVentasGenerales;
	protected JButton jButtonDuplicarVentasGenerales;
	protected JButton jButtonCopiarVentasGenerales;
	protected JButton jButtonVerFormVentasGenerales;
	protected JButton jButtonNuevoRelacionesVentasGenerales;
	protected JButton jButtonModificarVentasGenerales;
	
    protected JButton jButtonGuardarCambiosTablaVentasGenerales;
	protected JButton jButtonCerrarVentasGenerales;
	
	
	protected JButton jButtonRecargarInformacionVentasGenerales;
	protected JButton jButtonProcesarInformacionVentasGenerales;
	
	
	protected JButton jButtonAnterioresVentasGenerales;
	protected JButton jButtonSiguientesVentasGenerales;
	protected JButton jButtonNuevoGuardarCambiosVentasGenerales;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoVentasGenerales;
	//protected JButton jButtonCerrarReporteDinamicoVentasGenerales;
	//protected JButton jButtonGenerarExcelReporteDinamicoVentasGenerales;	
	
	
	
	//protected JButton jButtonAbrirImportacionVentasGenerales;
	//protected JButton jButtonGenerarImportacionVentasGenerales;
	//protected JButton jButtonCerrarImportacionVentasGenerales;
	//protected JFileChooser jFileChooserImportacionVentasGenerales;
	//protected File fileImportacionVentasGenerales;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasGenerales;
	protected JButton jButtonDuplicarToolBarVentasGenerales;
	protected JButton jButtonNuevoRelacionesToolBarVentasGenerales;
	
	
	public JButton jButtonGuardarCambiosToolBarVentasGenerales;
	protected JButton jButtonCopiarToolBarVentasGenerales;
	protected JButton jButtonVerFormToolBarVentasGenerales;
	public JButton jButtonGuardarCambiosTablaToolBarVentasGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasGenerales;
	protected JButton jButtonCerrarToolBarVentasGenerales;
	
	protected JButton jButtonRecargarInformacionToolBarVentasGenerales;
	protected JButton jButtonProcesarInformacionToolBarVentasGenerales;
	protected JButton jButtonAnterioresToolBarVentasGenerales;
	protected JButton jButtonSiguientesToolBarVentasGenerales;
	protected JButton jButtonNuevoGuardarCambiosToolBarVentasGenerales;
	protected JButton jButtonAbrirOrderByToolBarVentasGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasGenerales;
	protected JMenuItem jMenuItemDuplicarVentasGenerales;
	protected JMenuItem jMenuItemNuevoRelacionesVentasGenerales;
	
	
	protected JMenuItem jMenuItemGuardarCambiosVentasGenerales;
	protected JMenuItem jMenuItemCopiarVentasGenerales;
	protected JMenuItem jMenuItemVerFormVentasGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasGenerales;
	protected JMenuItem jMenuItemCerrarVentasGenerales;
	protected JMenuItem jMenuItemDetalleCerrarVentasGenerales;
	protected JMenuItem jMenuItemDetalleAbrirOrderByVentasGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasGenerales;
	
	protected JMenuItem jMenuItemRecargarInformacionVentasGenerales;
	protected JMenuItem jMenuItemProcesarInformacionVentasGenerales;
	protected JMenuItem jMenuItemAnterioresVentasGenerales;
	protected JMenuItem jMenuItemSiguientesVentasGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasGenerales;
	protected JMenuItem jMenuItemAbrirOrderByVentasGenerales;
	protected JMenuItem jMenuItemMostrarOcultarVentasGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasGenerales;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosVentasGenerales;
	protected JCheckBox jCheckBoxSeleccionadosVentasGenerales;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaVentasGenerales;
	protected JCheckBox jCheckBoxConGraficoReporteVentasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesVentasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesVentasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoVentasGenerales;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoVentasGenerales;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesVentasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionVentasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarVentasGenerales;
	protected JTextField jTextFieldValorCampoGeneralVentasGenerales;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteVentasGenerales;
	//public JList<Reporte> jListColumnasSelectReporteVentasGenerales;
	//public JScrollPane jScrollColumnasSelectReporteVentasGenerales;
	
	//public JLabel jLabelRelacionesSelectReporteVentasGenerales;
	//public JList<Reporte> jListRelacionesSelectReporteVentasGenerales;
	//public JScrollPane jScrollRelacionesSelectReporteVentasGenerales;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoVentasGenerales;
	//protected JCheckBox jCheckBoxConGraficoDinamicoVentasGenerales;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoVentasGenerales;
	//public JLabel jLabelTiposArchivoReporteDinamicoVentasGenerales;
	
		
	//public JLabel jLabelArchivoImportacionVentasGenerales;	
	//public JLabel jLabelPathArchivoImportacionVentasGenerales;
	//protected JTextField jTextFieldPathArchivoImportacionVentasGenerales;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoVentasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoVentasGenerales;
	
	//public JLabel jLabelColumnaCategoriaValorVentasGenerales;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorVentasGenerales;
	
	//public JLabel jLabelColumnasValoresGraficoVentasGenerales;
	//public JList<Reporte> jListColumnasValoresGraficoVentasGenerales;
	//public JScrollPane jScrollColumnasValoresGraficoVentasGenerales;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoVentasGenerales;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoVentasGenerales;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasVentasGenerales;
	public JPanel jPanelBusquedaVentasGeneralesVentasGenerales;
	public JButton jButtonBusquedaVentasGeneralesVentasGenerales;
	
	public JPanel jPanelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales;
	public JLabel jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales;
	public JButton jButtonfecha_emision_desdeBusquedaVentasGeneralesVentasGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales;
	public JLabel jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales;
	public JButton jButtonfecha_emision_hastaBusquedaVentasGeneralesVentasGeneralesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public VentasGeneralesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasGeneralesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionVentasGenerales)	{
		this.jButtonRecargarInformacionVentasGenerales = jButtonRecargarInformacionVentasGenerales;
	}
	
	public JButton getjButtonProcesarInformacionVentasGenerales() {
		return this.jButtonProcesarInformacionVentasGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasGenerales)	{
		this.jButtonProcesarInformacionVentasGenerales = jButtonProcesarInformacionVentasGenerales;
	}
	
	
	public JButton getjButtonRecargarInformacionVentasGenerales() {
		return this.jButtonRecargarInformacionVentasGenerales;
	}
	
	
	public List<VentasGenerales> getventasgeneraless() {
		return this.ventasgeneraless;
	}

	public void setventasgeneraless(List<VentasGenerales> ventasgeneraless) {
		this.ventasgeneraless = ventasgeneraless;
	}
	
	public List<VentasGenerales> getventasgeneralessAux() {
		return this.ventasgeneralessAux;
	}

	public void setventasgeneralessAux(List<VentasGenerales> ventasgeneralessAux) {
		this.ventasgeneralessAux = ventasgeneralessAux;
	}
	
	public List<VentasGenerales> getventasgeneralessEliminados() {
		return this.ventasgeneralessEliminados;
	}

	public void setVentasGeneralessEliminados(List<VentasGenerales> ventasgeneralessEliminados) {
		this.ventasgeneralessEliminados = ventasgeneralessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarVentasGenerales() {
		return jComboBoxTiposSeleccionarVentasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarVentasGenerales(
			JComboBox jComboBoxTiposSeleccionarVentasGenerales) {
		this.jComboBoxTiposSeleccionarVentasGenerales = jComboBoxTiposSeleccionarVentasGenerales;
	}
	
	public void setBorderResaltarTiposSeleccionarVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarVentasGenerales .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralVentasGenerales() {
		return jTextFieldValorCampoGeneralVentasGenerales;
	}

	public void setjTextFieldValorCampoGeneralVentasGenerales(
			JTextField jTextFieldValorCampoGeneralVentasGenerales) {
		this.jTextFieldValorCampoGeneralVentasGenerales = jTextFieldValorCampoGeneralVentasGenerales;
	}

	public void setBorderResaltarValorCampoGeneralVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralVentasGenerales .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosVentasGenerales() {
		return this.jCheckBoxSeleccionarTodosVentasGenerales;
	}

	public void setjCheckBoxSeleccionarTodosVentasGenerales(
			JCheckBox jCheckBoxSeleccionarTodosVentasGenerales) {
		this.jCheckBoxSeleccionarTodosVentasGenerales = jCheckBoxSeleccionarTodosVentasGenerales;
	}

	public void setBorderResaltarSeleccionarTodosVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosVentasGenerales .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosVentasGenerales() {
		return this.jCheckBoxSeleccionadosVentasGenerales;
	}

	public void setjCheckBoxSeleccionadosVentasGenerales(
			JCheckBox jCheckBoxSeleccionadosVentasGenerales) {
		this.jCheckBoxSeleccionadosVentasGenerales = jCheckBoxSeleccionadosVentasGenerales;
	}
	
	public void setBorderResaltarSeleccionadosVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosVentasGenerales .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesVentasGenerales() {
		return this.jComboBoxTiposArchivosReportesVentasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesVentasGenerales(
			JComboBox jComboBoxTiposArchivosReportesVentasGenerales) {
		this.jComboBoxTiposArchivosReportesVentasGenerales = jComboBoxTiposArchivosReportesVentasGenerales;
	}

	public void setBorderResaltarTiposArchivosReportesVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesVentasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesVentasGenerales() {
		return this.jComboBoxTiposReportesVentasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesVentasGenerales(
			JComboBox jComboBoxTiposReportesVentasGenerales) {
		this.jComboBoxTiposReportesVentasGenerales = jComboBoxTiposReportesVentasGenerales;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoVentasGenerales() {
	//	return jComboBoxTiposReportesDinamicoVentasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoVentasGenerales(
	//		JComboBox jComboBoxTiposReportesDinamicoVentasGenerales) {
	//	this.jComboBoxTiposReportesDinamicoVentasGenerales = jComboBoxTiposReportesDinamicoVentasGenerales;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoVentasGenerales() {
	//	return jComboBoxTiposArchivosReportesDinamicoVentasGenerales;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoVentasGenerales(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoVentasGenerales) {
	//	this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales = jComboBoxTiposArchivosReportesDinamicoVentasGenerales;
	//}
	
	public void setBorderResaltarTiposReportesVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesVentasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesVentasGenerales() {
		return this.jComboBoxTiposGraficosReportesVentasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesVentasGenerales(
			JComboBox jComboBoxTiposGraficosReportesVentasGenerales) {
		this.jComboBoxTiposGraficosReportesVentasGenerales = jComboBoxTiposGraficosReportesVentasGenerales;
	}
	
	public void setBorderResaltarTiposGraficosReportesVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesVentasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionVentasGenerales() {
		return this.jComboBoxTiposPaginacionVentasGenerales;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionVentasGenerales(
			JComboBox jComboBoxTiposPaginacionVentasGenerales) {
		this.jComboBoxTiposPaginacionVentasGenerales = jComboBoxTiposPaginacionVentasGenerales;
	}
	
	public void setBorderResaltarTiposPaginacionVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionVentasGenerales .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesVentasGenerales() {
		return this.jComboBoxTiposRelacionesVentasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasGenerales() {
		return this.jComboBoxTiposAccionesVentasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasGenerales(
			JComboBox jComboBoxTiposRelacionesVentasGenerales) {
		this.jComboBoxTiposRelacionesVentasGenerales = jComboBoxTiposRelacionesVentasGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasGenerales(
			JComboBox jComboBoxTiposAccionesVentasGenerales) {
		this.jComboBoxTiposAccionesVentasGenerales = jComboBoxTiposAccionesVentasGenerales;
	}
	
	public void setBorderResaltarTiposRelacionesVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesVentasGenerales .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesVentasGenerales() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesVentasGenerales .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoVentasGenerales() {
	//	return jCheckBoxConGraficoDinamicoVentasGenerales;
	//}

	//public void setjCheckBoxConGraficoDinamicoVentasGenerales(
	//		JCheckBox jCheckBoxConGraficoDinamicoVentasGenerales) {
	//	this.jCheckBoxConGraficoDinamicoVentasGenerales = jCheckBoxConGraficoDinamicoVentasGenerales;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoVentasGenerales() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarVentasGenerales.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoVentasGenerales .setBorder(borderResaltar);		
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
		this.ventasgeneralesSessionBean=new VentasGeneralesSessionBean();
		
		this.ventasgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventasgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventasgeneralesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
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
		
		VentasGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("VentasGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarVentasGenerales= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"nuevo","nuevo","Nuevo"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"duplicar","duplicar","Duplicar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"copiar","copiar","Copiar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"ver_form","ver_form","Ver"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"recargar","recargar","Buscar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarVentasGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarVentasGenerales,this.jTtoolBarVentasGenerales,
							"cerrar","cerrar","Salir"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarVentasGenerales=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarVentasGenerales;
			
				this.jButtonProcesarInformacionToolBarVentasGenerales=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarVentasGenerales;
				
		//protected JButton jButtonModificarToolBarVentasGenerales;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarVentasGenerales=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuVentasGenerales=new JMenuMe("General");
		this.jmenuArchivoVentasGenerales=new JMenuMe("Archivo");
		this.jmenuAccionesVentasGenerales=new JMenuMe("Acciones");
		this.jmenuDatosVentasGenerales=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarVentasGenerales= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarVentasGenerales.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarVentasGenerales,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesVentasGenerales= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesVentasGenerales.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesVentasGenerales,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosVentasGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarVentasGenerales= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarVentasGenerales.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarVentasGenerales,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormVentasGenerales= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormVentasGenerales.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormVentasGenerales,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaVentasGenerales= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaVentasGenerales.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaVentasGenerales,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionVentasGenerales= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionVentasGenerales.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionVentasGenerales,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionVentasGenerales= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionVentasGenerales.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionVentasGenerales,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresVentasGenerales= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresVentasGenerales.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresVentasGenerales,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesVentasGenerales= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesVentasGenerales.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesVentasGenerales,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByVentasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByVentasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByVentasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByVentasGenerales= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByVentasGenerales.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByVentasGenerales,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosVentasGenerales= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosVentasGenerales.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosVentasGenerales,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoVentasGenerales.add(this.jMenuItemCerrarVentasGenerales);
			
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemNuevoVentasGenerales);
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemNuevoGuardarCambiosVentasGenerales);
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemNuevoRelacionesVentasGenerales);
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemGuardarCambiosTablaVentasGenerales);		
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemDuplicarVentasGenerales);		
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemCopiarVentasGenerales);		
			this.jmenuAccionesVentasGenerales.add(this.jMenuItemVerFormVentasGenerales);		
			
			this.jmenuDatosVentasGenerales.add(this.jMenuItemRecargarInformacionVentasGenerales);				
			this.jmenuDatosVentasGenerales.add(this.jMenuItemAnterioresVentasGenerales);				
			this.jmenuDatosVentasGenerales.add(this.jMenuItemSiguientesVentasGenerales);				
			this.jmenuDatosVentasGenerales.add(this.jMenuItemAbrirOrderByVentasGenerales);				
			this.jmenuDatosVentasGenerales.add(this.jMenuItemMostrarOcultarVentasGenerales);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesVentasGenerales.add(this.jMenuItemGuardarCambiosVentasGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarVentasGenerales.add(this.jmenuArchivoVentasGenerales);		
			this.jmenuBarVentasGenerales.add(this.jmenuAccionesVentasGenerales);		
			this.jmenuBarVentasGenerales.add(this.jmenuDatosVentasGenerales);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarVentasGenerales);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasVentasGenerales() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaVentasGeneralesVentasGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaVentasGeneralesVentasGenerales.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaVentasGeneralesVentasGenerales= new JButtonMe();
		this.jButtonBusquedaVentasGeneralesVentasGenerales.setText("Buscar");
		this.jButtonBusquedaVentasGeneralesVentasGenerales.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaVentasGeneralesVentasGenerales,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaVentasGeneralesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasVentasGenerales=new JTabbedPane();


		this.jTabbedPaneBusquedasVentasGenerales.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasGenerales.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasVentasGenerales.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasVentasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleVentasGenerales = new VentasGeneralesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ventas Generales DATOS");
			this.jInternalFrameDetalleFormVentasGenerales = new VentasGeneralesDetalleFormJInternalFrame(jDesktopPane,this.ventasgeneralesSessionBean.getConGuardarRelaciones(),this.ventasgeneralesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormVentasGenerales = null;//new VentasGeneralesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasGenerales= new GridBagLayout();
		
		
		this.jTableDatosVentasGenerales = new JTableMe();      
		
		String sToolTipVentasGenerales="";
		sToolTipVentasGenerales=VentasGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasGenerales+="(Facturacion.VentasGenerales)";
		}
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasGenerales+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosVentasGenerales.setToolTipText(sToolTipVentasGenerales);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosVentasGenerales);
		this.jTableDatosVentasGenerales.setAutoCreateRowSorter(true);
		this.jTableDatosVentasGenerales.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosVentasGenerales.setRowSelectionAllowed(true);
		this.jTableDatosVentasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosVentasGenerales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoVentasGenerales = new JButtonMe();
		this.jButtonDuplicarVentasGenerales = new JButtonMe();
		this.jButtonCopiarVentasGenerales = new JButtonMe();
		this.jButtonVerFormVentasGenerales = new JButtonMe();
		this.jButtonNuevoRelacionesVentasGenerales = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaVentasGenerales = new JButtonMe();
		this.jButtonCerrarVentasGenerales = new JButtonMe();
		
		this.jScrollPanelDatosVentasGenerales = new JScrollPane();   
        this.jScrollPanelDatosGeneralVentasGenerales = new JScrollPane();
		
				
		
		
		this.jPanelAccionesVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Generales";
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasGenerales.setToolTipText("Acciones");
        this.jPanelAccionesVentasGenerales.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoVentasGenerales=new ReporteDinamicoJInternalFrame(VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoVentasGenerales();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionVentasGenerales=new ImportacionJInternalFrame(VentasGeneralesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionVentasGenerales();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByVentasGenerales = new JButtonMe();
		
		this.jButtonAbrirOrderByVentasGenerales.setText("Orden");
		this.jButtonAbrirOrderByVentasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasGenerales,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasGenerales,false,this);
			
			//this.cargarOrderByVentasGenerales(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByVentasGenerales=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVentasGenerales,true,this);
			
			//this.cargarOrderByVentasGenerales(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosVentasGenerales.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosVentasGenerales.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosVentasGenerales.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosVentasGenerales.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasGenerales.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosVentasGenerales.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoVentasGenerales.setText("Nuevo");
		this.jButtonDuplicarVentasGenerales.setText("Duplicar");
		this.jButtonCopiarVentasGenerales.setText("Copiar");
		this.jButtonVerFormVentasGenerales.setText("Ver");
		this.jButtonNuevoRelacionesVentasGenerales.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaVentasGenerales.setText("Guardar");
		this.jButtonCerrarVentasGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasGenerales,"nuevo_button","Nuevo",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarVentasGenerales,"duplicar_button","Duplicar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarVentasGenerales,"copiar_button","Copiar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormVentasGenerales,"ver_form","Ver",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesVentasGenerales,"nuevorelaciones_button","Nuevo Rel",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasGenerales,"guardarcambiostabla_button","Guardar",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasGenerales,"cerrar_button","Salir",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoVentasGenerales.setToolTipText("Nuevo"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarVentasGenerales.setToolTipText("Duplicar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarVentasGenerales.setToolTipText("Copiar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormVentasGenerales.setToolTipText("Ver"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesVentasGenerales.setToolTipText("Nuevo Rel"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaVentasGenerales.setToolTipText("Guardar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasGenerales.setToolTipText("Salir"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasGenerales";
		inputMap = this.jButtonNuevoVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasGenerales"));
		
		//DUPLICAR
		sMapKey = "DuplicarVentasGenerales";
		inputMap = this.jButtonDuplicarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarVentasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarVentasGenerales"));
		
		//COPIAR
		sMapKey = "CopiarVentasGenerales";
		inputMap = this.jButtonCopiarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarVentasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarVentasGenerales"));
		
		//VEr FORM
		sMapKey = "VerFormVentasGenerales";
		inputMap = this.jButtonVerFormVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormVentasGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormVentasGenerales"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesVentasGenerales";
		inputMap = this.jButtonNuevoRelacionesVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesVentasGenerales"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarVentasGenerales";
		inputMap = this.jButtonModificarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarVentasGenerales"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarVentasGenerales";
		inputMap = this.jButtonCerrarVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasGenerales";
		inputMap = this.jButtonGuardarCambiosTablaVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasGenerales"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1VentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2VentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3VentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4VentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5VentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesVentasGenerales.setName("jPanelParametrosReportesVentasGenerales"); 
		
		this.jPanelParametrosReportesAccionesVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesVentasGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesVentasGenerales.setName("jPanelParametrosReportesAccionesVentasGenerales"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionVentasGenerales = new JButtonMe();
		this.jButtonRecargarInformacionVentasGenerales.setText("Buscar");
		this.jButtonRecargarInformacionVentasGenerales.setToolTipText("Buscar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionVentasGenerales,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionVentasGenerales.setVisible(false);
		
		
		this.jButtonProcesarInformacionVentasGenerales = new JButtonMe();
		this.jButtonProcesarInformacionVentasGenerales.setText("Procesar");
		this.jButtonProcesarInformacionVentasGenerales.setToolTipText("Procesar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionVentasGenerales.setVisible(false);
			
		this.jButtonProcesarInformacionVentasGenerales.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasGenerales.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionVentasGenerales.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasGenerales.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesVentasGenerales.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasGenerales.setText("TIPO");       
		this.jComboBoxTiposReportesVentasGenerales.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesVentasGenerales.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesVentasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionVentasGenerales.setText("Paginacion");
		this.jComboBoxTiposPaginacionVentasGenerales.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesVentasGenerales.setText("Accion");
		this.jComboBoxTiposRelacionesVentasGenerales.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasGenerales.setText("Accion");
		this.jComboBoxTiposAccionesVentasGenerales.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarVentasGenerales = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarVentasGenerales.setText("Accion");
		this.jComboBoxTiposSeleccionarVentasGenerales.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralVentasGenerales=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralVentasGenerales.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasGenerales.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralVentasGenerales.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesVentasGenerales = new JLabelMe();
		
		this.jLabelAccionesVentasGenerales.setText("Acciones");		
		this.jLabelAccionesVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosVentasGenerales.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosVentasGenerales.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosVentasGenerales = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosVentasGenerales.setText("Seleccionados");
		this.jCheckBoxSeleccionadosVentasGenerales.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaVentasGenerales = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaVentasGenerales.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaVentasGenerales.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteVentasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoReporteVentasGenerales.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresVentasGenerales = new JButtonMe();
		//this.jButtonAnterioresVentasGenerales.setText("<<");
        this.jButtonAnterioresVentasGenerales.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresVentasGenerales,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesVentasGenerales = new JButtonMe();
		//this.jButtonSiguientesVentasGenerales.setText(">>");
        this.jButtonSiguientesVentasGenerales.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesVentasGenerales,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosVentasGenerales = new JButtonMe();
		this.jButtonNuevoGuardarCambiosVentasGenerales.setText("Nue");
        this.jButtonNuevoGuardarCambiosVentasGenerales.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosVentasGenerales,"nuevoguardarcambios_button","Nue",this.ventasgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosVentasGenerales";
		inputMap = this.jButtonNuevoGuardarCambiosVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosVentasGenerales"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionVentasGenerales";
		inputMap = this.jButtonRecargarInformacionVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionVentasGenerales"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesVentasGenerales";
		inputMap = this.jButtonSiguientesVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesVentasGenerales"));
		
		//ANTERIORES		
		sMapKey = "AnterioresVentasGenerales";
		inputMap = this.jButtonAnterioresVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresVentasGenerales"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasVentasGenerales();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesVentasGenerales.setMinimumSize(new Dimension(this.getWidth(),VentasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasGenerales.setMaximumSize(new Dimension(this.getWidth(),VentasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesVentasGenerales.setPreferredSize(new Dimension(this.getWidth(),VentasGeneralesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(VentasGeneralesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionVentasGenerales = new GridBagLayout();

			this.jPanelPaginacionVentasGenerales.setLayout(gridaBagLayoutPaginacionVentasGenerales);						
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 0;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionVentasGenerales.add(this.jButtonAnterioresVentasGenerales, this.gridBagConstraintsVentasGenerales);
					
						
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasGenerales.gridy = 0;
			
			this.jPanelPaginacionVentasGenerales.add(this.jButtonNuevoGuardarCambiosVentasGenerales, this.gridBagConstraintsVentasGenerales);
						
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsVentasGenerales.gridy = 0;
			this.jPanelPaginacionVentasGenerales.add(this.jButtonSiguientesVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 1;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasGenerales.add(this.jButtonNuevoVentasGenerales, this.gridBagConstraintsVentasGenerales);
						
			
			
			if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
				this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsVentasGenerales.gridy = 1;
				this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionVentasGenerales.add(this.jButtonGuardarCambiosTablaVentasGenerales, this.gridBagConstraintsVentasGenerales);
			}
			
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 1;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasGenerales.add(this.jButtonDuplicarVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 1;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasGenerales.add(this.jButtonCopiarVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 1;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionVentasGenerales.add(this.jButtonVerFormVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 1;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionVentasGenerales.add(this.jButtonCerrarVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		
		this.jButtonRecargarInformacionVentasGenerales.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasGenerales.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionVentasGenerales.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesVentasGenerales.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasGenerales.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesVentasGenerales.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesVentasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesVentasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesVentasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesVentasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionVentasGenerales.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasGenerales.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionVentasGenerales.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesVentasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesVentasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesVentasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarVentasGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarVentasGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaVentasGenerales.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasGenerales.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaVentasGenerales.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteVentasGenerales.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasGenerales.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteVentasGenerales.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosVentasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosVentasGenerales.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosVentasGenerales.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasGenerales.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosVentasGenerales.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesVentasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesVentasGenerales = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1VentasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2VentasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3VentasGenerales = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4VentasGenerales = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesVentasGenerales.setLayout(gridaBagParametrosReportesVentasGenerales);
			this.jPanelParametrosReportesAccionesVentasGenerales.setLayout(gridaBagParametrosReportesAccionesVentasGenerales);
			
			
			this.jPanelParametrosAuxiliar1VentasGenerales.setLayout(gridaBagParametrosAuxiliar1VentasGenerales);
			this.jPanelParametrosAuxiliar2VentasGenerales.setLayout(gridaBagParametrosAuxiliar2VentasGenerales);
			this.jPanelParametrosAuxiliar3VentasGenerales.setLayout(gridaBagParametrosAuxiliar3VentasGenerales);
			this.jPanelParametrosAuxiliar4VentasGenerales.setLayout(gridaBagParametrosAuxiliar4VentasGenerales);
			//this.jPanelParametrosAuxiliar5VentasGenerales.setLayout(gridaBagParametrosAuxiliar2VentasGenerales);			
			
			
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasGenerales.add(this.jButtonRecargarInformacionVentasGenerales, this.gridBagConstraintsVentasGenerales);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasGenerales.add(this.jComboBoxTiposPaginacionVentasGenerales, this.gridBagConstraintsVentasGenerales);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasGenerales.add(this.jCheckBoxConAltoMaximoTablaVentasGenerales, this.gridBagConstraintsVentasGenerales);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1VentasGenerales.add(this.jComboBoxTiposArchivosReportesVentasGenerales, this.gridBagConstraintsVentasGenerales);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasGenerales.add(this.jPanelParametrosAuxiliar1VentasGenerales, this.gridBagConstraintsVentasGenerales);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4VentasGenerales.add(this.jComboBoxTiposReportesVentasGenerales, this.gridBagConstraintsVentasGenerales);																		
			
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4VentasGenerales.add(this.jComboBoxTiposGraficosReportesVentasGenerales, this.gridBagConstraintsVentasGenerales);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasGenerales.add(this.jPanelParametrosAuxiliar4VentasGenerales, this.gridBagConstraintsVentasGenerales);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasGenerales.add(this.jComboBoxTiposReportesVentasGenerales, this.gridBagConstraintsVentasGenerales);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasGenerales.add(this.jCheckBoxGenerarReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasGenerales.add(this.jPanelParametrosAuxiliar2VentasGenerales, this.gridBagConstraintsVentasGenerales);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasGenerales.add(this.jLabelAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
				this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesVentasGenerales.add(this.jButtonAbrirOrderByVentasGenerales, this.gridBagConstraintsVentasGenerales);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasGenerales.add(this.jComboBoxTiposSeleccionarVentasGenerales, this.gridBagConstraintsVentasGenerales);			
			
			
			/*
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasGenerales.add(this.jCheckBoxSeleccionarTodosVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesVentasGenerales.add(this.jCheckBoxConGraficoReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasGenerales.add(this.jCheckBoxSeleccionarTodosVentasGenerales, this.gridBagConstraintsVentasGenerales);															
				
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasGenerales.add(this.jCheckBoxSeleccionadosVentasGenerales, this.gridBagConstraintsVentasGenerales);															
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsVentasGenerales.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3VentasGenerales.add(this.jCheckBoxConGraficoReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesVentasGenerales.add(this.jPanelParametrosAuxiliar3VentasGenerales, this.gridBagConstraintsVentasGenerales);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsVentasGenerales.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesVentasGenerales.add(this.jComboBoxTiposAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosVentasGenerales = new GridBagLayout();

			this.jScrollPanelDatosVentasGenerales.setLayout(gridaBagLayoutDatosVentasGenerales);
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = 0;
			this.gridBagConstraintsVentasGenerales.gridx = 0;
			
			this.jScrollPanelDatosVentasGenerales.add(this.jTableDatosVentasGenerales, this.gridBagConstraintsVentasGenerales);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosVentasGenerales.setViewportView(this.jTableDatosVentasGenerales);
		this.jTableDatosVentasGenerales.setFillsViewportHeight(true);
		this.jTableDatosVentasGenerales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesVentasGenerales= new GridBagLayout();
		this.jPanelAccionesVentasGenerales.setLayout(gridaBagLayoutAccionesVentasGenerales);
		
		
		/*	
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = 0;
		this.gridBagConstraintsVentasGenerales.gridx = 0;
			
		this.jPanelAccionesVentasGenerales.add(this.jButtonNuevoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaVentasGeneralesVentasGenerales= new GridBagLayout();
		gridaBagLayoutBusquedaVentasGeneralesVentasGenerales.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaVentasGeneralesVentasGenerales.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaVentasGeneralesVentasGenerales.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaVentasGeneralesVentasGenerales.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaVentasGeneralesVentasGenerales.setLayout(gridaBagLayoutBusquedaVentasGeneralesVentasGenerales);

		gridBagConstraintsVentasGenerales = new GridBagConstraints();
		gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasGenerales.gridy = 0;
		gridBagConstraintsVentasGenerales.gridx = 0;
		jPanelBusquedaVentasGeneralesVentasGenerales.add(jLabelfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales, gridBagConstraintsVentasGenerales);

		gridBagConstraintsVentasGenerales = new GridBagConstraints();
		gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasGenerales.gridy = 0;
		gridBagConstraintsVentasGenerales.gridx = 1;
		jPanelBusquedaVentasGeneralesVentasGenerales.add(jDateChooserfecha_emision_desdeBusquedaVentasGeneralesVentasGenerales, gridBagConstraintsVentasGenerales);


		gridBagConstraintsVentasGenerales = new GridBagConstraints();
		gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasGenerales.gridy = 1;
		gridBagConstraintsVentasGenerales.gridx = 0;
		jPanelBusquedaVentasGeneralesVentasGenerales.add(jLabelfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales, gridBagConstraintsVentasGenerales);

		gridBagConstraintsVentasGenerales = new GridBagConstraints();
		gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasGenerales.gridy = 1;
		gridBagConstraintsVentasGenerales.gridx = 1;
		jPanelBusquedaVentasGeneralesVentasGenerales.add(jDateChooserfecha_emision_hastaBusquedaVentasGeneralesVentasGenerales, gridBagConstraintsVentasGenerales);

		gridBagConstraintsVentasGenerales = new GridBagConstraints();
		gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.WEST;
		gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsVentasGenerales.gridy = 2;
		gridBagConstraintsVentasGenerales.gridx =1;
		jPanelBusquedaVentasGeneralesVentasGenerales.add(jButtonBusquedaVentasGeneralesVentasGenerales, gridBagConstraintsVentasGenerales);

		jTabbedPaneBusquedasVentasGenerales.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaVentasGeneralesVentasGenerales);
		jTabbedPaneBusquedasVentasGenerales.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasGenerales);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();						
			this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasGenerales.gridx = 0;		
			//this.gridBagConstraintsVentasGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasGenerales.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarVentasGenerales, this.gridBagConstraintsVentasGenerales);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;
		this.gridBagConstraintsVentasGenerales.gridx = 0;		
		//this.gridBagConstraintsVentasGenerales.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsVentasGenerales.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsVentasGenerales);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasGenerales.gridx = 0;		
			this.gridBagConstraintsVentasGenerales.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsVentasGenerales.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasVentasGenerales, this.gridBagConstraintsVentasGenerales);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesVentasGenerales, this.gridBagConstraintsVentasGenerales);								
		
		
		/*
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
		*/		
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasGenerales.gridx =0;
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasGenerales, this.gridBagConstraintsVentasGenerales);
				
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionVentasGenerales, this.gridBagConstraintsVentasGenerales);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(VentasGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosVentasGenerales= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasGenerales = new GridBagLayout();
			this.jPanelBusquedasParametrosVentasGenerales.setLayout(gridaBagLayoutBusquedasParametrosVentasGenerales);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralVentasGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasGenerales, this.gridBagConstraintsVentasGenerales);
			
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasGenerales, this.gridBagConstraintsVentasGenerales);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralVentasGenerales;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoVentasGenerales() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoVentasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoVentasGenerales.setName("jPanelReporteDinamicoVentasGenerales"); 
		
		this.jPanelReporteDinamicoVentasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoVentasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoVentasGenerales.setLayout(gridaBagLayoutReporteDinamicoVentasGenerales);
		
		
		this.jInternalFrameReporteDinamicoVentasGenerales= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoVentasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoVentasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoVentasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoVentasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoVentasGenerales.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoVentasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoVentasGenerales.setResizable(true);
	    this.jInternalFrameReporteDinamicoVentasGenerales.setClosable(true);
	    this.jInternalFrameReporteDinamicoVentasGenerales.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoVentasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoVentasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteVentasGenerales = new JLabelMe();

		this.jLabelColumnasSelectReporteVentasGenerales.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelColumnasSelectReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteVentasGenerales = new JList<Reporte>();
		this.jListColumnasSelectReporteVentasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteVentasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteVentasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteVentasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteVentasGenerales=new JScrollPane(this.jListColumnasSelectReporteVentasGenerales);
			
			this.jScrollColumnasSelectReporteVentasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteVentasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoVentasGenerales.add(this.jListColumnasSelectReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
		this.jPanelReporteDinamicoVentasGenerales.add(this.jScrollColumnasSelectReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteVentasGenerales = new JLabelMe();

		this.jLabelRelacionesSelectReporteVentasGenerales.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteVentasGenerales = new JList<Reporte>();
		this.jListRelacionesSelectReporteVentasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteVentasGenerales.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteVentasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteVentasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteVentasGenerales=new JScrollPane(this.jListRelacionesSelectReporteVentasGenerales);
			
			this.jScrollRelacionesSelectReporteVentasGenerales.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasGenerales.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteVentasGenerales.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoVentasGenerales = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoVentasGenerales = new JComboBoxMe();
		this.jListColumnasValoresGraficoVentasGenerales = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoVentasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoVentasGenerales.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoVentasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoVentasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoVentasGenerales = new JLabelMe();

		this.jLabelConGraficoDinamicoVentasGenerales.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelConGraficoDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoVentasGenerales = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoVentasGenerales.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoVentasGenerales.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoVentasGenerales.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasGenerales.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoVentasGenerales.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jCheckBoxConGraficoDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoVentasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoVentasGenerales.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelColumnaCategoriaGraficoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoVentasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoVentasGenerales.add(this.jComboBoxColumnaCategoriaGraficoVentasGenerales, this.gridBagConstraintsVentasGenerales);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorVentasGenerales = new JLabelMe();

		this.jLabelColumnaCategoriaValorVentasGenerales.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelColumnaCategoriaValorVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorVentasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorVentasGenerales.setText("Accion");
        this.jComboBoxColumnaCategoriaValorVentasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorVentasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorVentasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoVentasGenerales.add(this.jComboBoxColumnaCategoriaValorVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoVentasGenerales = new JLabelMe();

		this.jLabelColumnasValoresGraficoVentasGenerales.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelColumnasValoresGraficoVentasGenerales, this.gridBagConstraintsVentasGenerales);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoVentasGenerales = new JList<Reporte>();
		this.jListColumnasValoresGraficoVentasGenerales.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoVentasGenerales.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoVentasGenerales.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasGenerales.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoVentasGenerales.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoVentasGenerales=new JScrollPane(this.jListColumnasValoresGraficoVentasGenerales);
			
			this.jScrollColumnasValoresGraficoVentasGenerales.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasGenerales.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoVentasGenerales.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoVentasGenerales.add(this.jListColumnasSelectReporteVentasGenerales, this.gridBagConstraintsVentasGenerales);
		this.jPanelReporteDinamicoVentasGenerales.add(this.jScrollColumnasValoresGraficoVentasGenerales, this.gridBagConstraintsVentasGenerales);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoVentasGenerales = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoVentasGenerales.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelTiposGraficosReportesDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoVentasGenerales.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jComboBoxTiposGraficosReportesDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoVentasGenerales = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoVentasGenerales.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelGenerarExcelReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoVentasGenerales = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoVentasGenerales.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoVentasGenerales,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoVentasGenerales.setToolTipText("Generar EXCEL"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		//this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoVentasGenerales.add(this.jButtonGenerarExcelReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasGenerales.add(this.jComboBoxTiposReportesDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoVentasGenerales = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoVentasGenerales.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoVentasGenerales.add(this.jLabelTiposArchivoReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasGenerales.add(this.jComboBoxTiposArchivosReportesDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoVentasGenerales = new JButtonMe();
		this.jButtonGenerarReporteDinamicoVentasGenerales.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoVentasGenerales,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoVentasGenerales.setToolTipText("Generar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasGenerales.add(this.jButtonGenerarReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoVentasGenerales = new JButtonMe();
		this.jButtonCerrarReporteDinamicoVentasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoVentasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoVentasGenerales.setToolTipText("Cancelar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoVentasGenerales.add(this.jButtonCerrarReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalVentasGenerales = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoVentasGenerales= new JScrollPane(jPanelReporteDinamicoVentasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoVentasGenerales.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasGenerales.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoVentasGenerales.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsVentasGenerales.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoVentasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoVentasGenerales.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalVentasGenerales);
		this.jInternalFrameReporteDinamicoVentasGenerales.getContentPane().add(this.jScrollPanelReporteDinamicoVentasGenerales, this.gridBagConstraintsVentasGenerales);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionVentasGenerales() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionVentasGenerales = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionVentasGenerales.setName("jPanelImportacionVentasGenerales"); 
		
		this.jPanelImportacionVentasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionVentasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionVentasGenerales.setLayout(gridaBagLayoutImportacionVentasGenerales);
		
		
		this.jInternalFrameImportacionVentasGenerales= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionVentasGenerales= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionVentasGenerales = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteVentasGenerales= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionVentasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasGenerales.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionVentasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasGenerales.setResizable(true);
	    this.jInternalFrameImportacionVentasGenerales.setClosable(true);
	    this.jInternalFrameImportacionVentasGenerales.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionVentasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionVentasGenerales.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionVentasGenerales.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionVentasGenerales.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionVentasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionVentasGenerales.setResizable(true);
	    this.jInternalFrameImportacionVentasGenerales.setClosable(true);
	    this.jInternalFrameImportacionVentasGenerales.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionVentasGenerales.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasGenerales.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionVentasGenerales.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionVentasGenerales = new JLabelMe();

		this.jLabelArchivoImportacionVentasGenerales.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasGenerales.add(this.jLabelArchivoImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionVentasGenerales = new JFileChooser();		
		this.jFileChooserImportacionVentasGenerales.setToolTipText("ESCOGER ARCHIVO"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionVentasGenerales = new JButtonMe();
		this.jButtonAbrirImportacionVentasGenerales.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionVentasGenerales,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionVentasGenerales.setToolTipText("Generar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasGenerales.add(this.jButtonAbrirImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionVentasGenerales = new JLabelMe();

		this.jLabelPathArchivoImportacionVentasGenerales.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionVentasGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionVentasGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;		
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
			
		this.jPanelImportacionVentasGenerales.add(this.jLabelPathArchivoImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionVentasGenerales=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionVentasGenerales.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasGenerales.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionVentasGenerales.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasGenerales.add(this.jTextFieldPathArchivoImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionVentasGenerales = new JButtonMe();
		this.jButtonGenerarImportacionVentasGenerales.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionVentasGenerales,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionVentasGenerales.setToolTipText("Generar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasGenerales.add(this.jButtonGenerarImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionVentasGenerales = new JButtonMe();
		this.jButtonCerrarImportacionVentasGenerales.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionVentasGenerales,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionVentasGenerales.setToolTipText("Cancelar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasGenerales.gridy = iPosYImportacion;
		this.gridBagConstraintsVentasGenerales.gridx = iPosXImportacion++;
							
		this.jPanelImportacionVentasGenerales.add(this.jButtonCerrarImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalVentasGenerales = new GridBagLayout();
		
		this.jScrollPanelImportacionVentasGenerales= new JScrollPane(jPanelImportacionVentasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
		this.gridBagConstraintsVentasGenerales.gridy =iPosYImportacion;
		this.gridBagConstraintsVentasGenerales.gridx =iPosXImportacion;
		this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionVentasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionVentasGenerales.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalVentasGenerales);
		this.jInternalFrameImportacionVentasGenerales.getContentPane().add(this.jScrollPanelImportacionVentasGenerales, this.gridBagConstraintsVentasGenerales);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByVentasGenerales(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByVentasGenerales = new JButtonMe();
			this.jButtonAbrirOrderByVentasGenerales.setText("Orden");
			this.jButtonAbrirOrderByVentasGenerales.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByVentasGenerales,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByVentasGenerales";
			inputMap = this.jButtonAbrirOrderByVentasGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByVentasGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByVentasGenerales"));
		
		
			GridBagLayout gridaBagLayoutOrderByVentasGenerales = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByVentasGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByVentasGenerales.setName("jPanelOrderByVentasGenerales"); 
			
			this.jPanelOrderByVentasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByVentasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByVentasGenerales.setLayout(gridaBagLayoutOrderByVentasGenerales);
			
			
			this.jTableDatosVentasGeneralesOrderBy = new JTableMe();        
			this.jTableDatosVentasGeneralesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosVentasGeneralesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosVentasGeneralesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosVentasGeneralesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosVentasGeneralesOrderBy.setViewportView(this.jTableDatosVentasGeneralesOrderBy);
			this.jTableDatosVentasGeneralesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosVentasGeneralesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByVentasGenerales= new OrderByJInternalFrame();
			this.jInternalFrameOrderByVentasGenerales= new OrderByJInternalFrame();
			this.jScrollPanelOrderByVentasGenerales = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteVentasGenerales= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByVentasGenerales.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByVentasGenerales.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByVentasGenerales.setTitle("Orden");
			this.jInternalFrameOrderByVentasGenerales.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByVentasGenerales.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByVentasGenerales.setResizable(true);
			this.jInternalFrameOrderByVentasGenerales.setClosable(true);
			this.jInternalFrameOrderByVentasGenerales.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByVentasGenerales.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasGenerales.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByVentasGenerales.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByVentasGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Generaleses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy =iPosYOrderBy++;
			this.gridBagConstraintsVentasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsVentasGenerales.ipady =150;
				
			this.jPanelOrderByVentasGenerales.add(jScrollPanelDatosVentasGeneralesOrderBy, this.gridBagConstraintsVentasGenerales);//this.jTableDatosVentasGeneralesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByVentasGenerales = new JButtonMe();
			this.jButtonCerrarOrderByVentasGenerales.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByVentasGenerales,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByVentasGenerales.setToolTipText("Cancelar"+" "+VentasGeneralesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByVentasGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasGenerales.gridy = iPosYOrderBy++;
			this.gridBagConstraintsVentasGenerales.gridx = iPosXOrderBy;
									
			this.jPanelOrderByVentasGenerales.add(this.jButtonCerrarOrderByVentasGenerales, this.gridBagConstraintsVentasGenerales);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalVentasGenerales = new GridBagLayout();
			
			this.jScrollPanelOrderByVentasGenerales= new JScrollPane(jPanelOrderByVentasGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsVentasGenerales = new GridBagConstraints();
			this.gridBagConstraintsVentasGenerales.gridy =iPosYOrderBy;
			this.gridBagConstraintsVentasGenerales.gridx =iPosXOrderBy;
			this.gridBagConstraintsVentasGenerales.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByVentasGenerales.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByVentasGenerales.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalVentasGenerales);
			
			this.jInternalFrameOrderByVentasGenerales.getContentPane().add(this.jScrollPanelOrderByVentasGenerales, this.gridBagConstraintsVentasGenerales);			
		
		} else {
			this.jButtonAbrirOrderByVentasGenerales = new JButtonMe();
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
		//	&& this.ventasgeneralesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosVentasGenerales.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosVentasGenerales.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosVentasGenerales.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosVentasGenerales.getRowHeight();//VentasGeneralesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasGenerales.isSelected()) {
					iHeightTable=VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaVentasGenerales.isSelected()) {
					iHeightTable=VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=VentasGeneralesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosVentasGenerales.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasGenerales.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosVentasGenerales.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosVentasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosVentasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByVentasGenerales!=null && this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy()!=null) {
			//if(!this.ventasgeneralesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByVentasGenerales.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByVentasGenerales.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByVentasGenerales.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByVentasGenerales.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosVentasGenerales.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasGenerales.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosVentasGenerales.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ventasgeneralesLogic.getVentasGeneraless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ventasgeneraless.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<VentasGenerales> TraerVentasGeneralesBeans(List<VentasGenerales> ventasgeneraless,ArrayList<Classe> classes)throws Exception {
		try {
			for(VentasGenerales ventasgenerales:ventasgeneraless) {
					
				if(!(VentasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || VentasGeneralesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ventasgenerales.setsDetalleGeneralEntityReporte(VentasGeneralesConstantesFunciones.getVentasGeneralesDescripcion(ventasgenerales));
										
						
					
						
					
				} else  {
							
					//ventasgenerales.setsDetalleGeneralEntityReporte(ventasgenerales.getsDetalleGeneralEntityReporte());
										
				}
				
				//ventasgeneralesbeans.add(ventasgeneralesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ventasgeneraless;
    }
	//PARA REPORTES FIN
}
