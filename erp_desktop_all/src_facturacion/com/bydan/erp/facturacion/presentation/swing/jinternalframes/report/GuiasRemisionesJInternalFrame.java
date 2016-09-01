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
import com.bydan.erp.facturacion.util.report.GuiasRemisionesConstantesFunciones;

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
public class GuiasRemisionesJInternalFrame extends GuiasRemisionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGuiasRemisiones;
	
	protected JMenuBar jmenuBarGuiasRemisiones;
	
	protected JMenu jmenuGuiasRemisiones;
	protected JMenu jmenuDatosGuiasRemisiones;
	protected JMenu jmenuArchivoGuiasRemisiones;
	protected JMenu jmenuAccionesGuiasRemisiones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuiasRemisiones;	
	protected GridBagConstraints gridBagConstraintsGuiasRemisiones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GuiasRemisionesDetalleFormJInternalFrame jInternalFrameDetalleFormGuiasRemisiones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGuiasRemisiones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGuiasRemisiones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GuiasRemisionesSessionBean guiasremisionesSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GuiasRemisiones> guiasremisioness;		
	public List<GuiasRemisiones> guiasremisionessEliminados;	
	public List<GuiasRemisiones> guiasremisionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGuiasRemisiones;		
	protected JButton jButtonAbrirOrderByGuiasRemisiones;
	
	
	//protected JPanel jPanelOrderByGuiasRemisiones;
	//public JScrollPane jScrollPanelOrderByGuiasRemisiones;	
	//protected JButton jButtonCerrarOrderByGuiasRemisiones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GuiasRemisionesLogic guiasremisionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGuiasRemisiones;
	public JScrollPane jScrollPanelDatosEdicionGuiasRemisiones;
	public JScrollPane jScrollPanelDatosGeneralGuiasRemisiones;
    
	
	
	//public JScrollPane jScrollPanelDatosGuiasRemisionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGuiasRemisiones;
	//public JScrollPane jScrollPanelImportacionGuiasRemisiones;
	
	
	
	protected JPanel jPanelAccionesGuiasRemisiones;
	
    protected JPanel jPanelPaginacionGuiasRemisiones;
    protected JPanel jPanelParametrosReportesGuiasRemisiones;
	protected JPanel jPanelParametrosReportesAccionesGuiasRemisiones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GuiasRemisiones;
	protected JPanel jPanelParametrosAuxiliar2GuiasRemisiones;
	protected JPanel jPanelParametrosAuxiliar3GuiasRemisiones;
	protected JPanel jPanelParametrosAuxiliar4GuiasRemisiones;
	//protected JPanel jPanelParametrosAuxiliar5GuiasRemisiones;
	
	
	
	//protected JPanel jPanelReporteDinamicoGuiasRemisiones;
	//protected JPanel jPanelImportacionGuiasRemisiones;
	
	
	public JTable jTableDatosGuiasRemisiones;
	
	
	
	//public JTable jTableDatosGuiasRemisionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGuiasRemisiones;
	protected JButton jButtonDuplicarGuiasRemisiones;
	protected JButton jButtonCopiarGuiasRemisiones;
	protected JButton jButtonVerFormGuiasRemisiones;
	protected JButton jButtonNuevoRelacionesGuiasRemisiones;
	protected JButton jButtonModificarGuiasRemisiones;
	
    protected JButton jButtonGuardarCambiosTablaGuiasRemisiones;
	protected JButton jButtonCerrarGuiasRemisiones;
	
	
	protected JButton jButtonRecargarInformacionGuiasRemisiones;
	protected JButton jButtonProcesarInformacionGuiasRemisiones;
	
	
	protected JButton jButtonAnterioresGuiasRemisiones;
	protected JButton jButtonSiguientesGuiasRemisiones;
	protected JButton jButtonNuevoGuardarCambiosGuiasRemisiones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGuiasRemisiones;
	//protected JButton jButtonCerrarReporteDinamicoGuiasRemisiones;
	//protected JButton jButtonGenerarExcelReporteDinamicoGuiasRemisiones;	
	
	
	
	//protected JButton jButtonAbrirImportacionGuiasRemisiones;
	//protected JButton jButtonGenerarImportacionGuiasRemisiones;
	//protected JButton jButtonCerrarImportacionGuiasRemisiones;
	//protected JFileChooser jFileChooserImportacionGuiasRemisiones;
	//protected File fileImportacionGuiasRemisiones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuiasRemisiones;
	protected JButton jButtonDuplicarToolBarGuiasRemisiones;
	protected JButton jButtonNuevoRelacionesToolBarGuiasRemisiones;
	
	
	public JButton jButtonGuardarCambiosToolBarGuiasRemisiones;
	protected JButton jButtonCopiarToolBarGuiasRemisiones;
	protected JButton jButtonVerFormToolBarGuiasRemisiones;
	public JButton jButtonGuardarCambiosTablaToolBarGuiasRemisiones;
	protected JButton jButtonMostrarOcultarTablaToolBarGuiasRemisiones;
	protected JButton jButtonCerrarToolBarGuiasRemisiones;
	
	protected JButton jButtonRecargarInformacionToolBarGuiasRemisiones;
	protected JButton jButtonProcesarInformacionToolBarGuiasRemisiones;
	protected JButton jButtonAnterioresToolBarGuiasRemisiones;
	protected JButton jButtonSiguientesToolBarGuiasRemisiones;
	protected JButton jButtonNuevoGuardarCambiosToolBarGuiasRemisiones;
	protected JButton jButtonAbrirOrderByToolBarGuiasRemisiones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuiasRemisiones;
	protected JMenuItem jMenuItemDuplicarGuiasRemisiones;
	protected JMenuItem jMenuItemNuevoRelacionesGuiasRemisiones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGuiasRemisiones;
	protected JMenuItem jMenuItemCopiarGuiasRemisiones;
	protected JMenuItem jMenuItemVerFormGuiasRemisiones;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuiasRemisiones;
	protected JMenuItem jMenuItemCerrarGuiasRemisiones;
	protected JMenuItem jMenuItemDetalleCerrarGuiasRemisiones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGuiasRemisiones;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuiasRemisiones;
	
	protected JMenuItem jMenuItemRecargarInformacionGuiasRemisiones;
	protected JMenuItem jMenuItemProcesarInformacionGuiasRemisiones;
	protected JMenuItem jMenuItemAnterioresGuiasRemisiones;
	protected JMenuItem jMenuItemSiguientesGuiasRemisiones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuiasRemisiones;
	protected JMenuItem jMenuItemAbrirOrderByGuiasRemisiones;
	protected JMenuItem jMenuItemMostrarOcultarGuiasRemisiones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuiasRemisiones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGuiasRemisiones;
	protected JCheckBox jCheckBoxSeleccionadosGuiasRemisiones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGuiasRemisiones;
	protected JCheckBox jCheckBoxConGraficoReporteGuiasRemisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGuiasRemisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGuiasRemisiones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGuiasRemisiones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGuiasRemisiones;
	protected JTextField jTextFieldValorCampoGeneralGuiasRemisiones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGuiasRemisiones;
	//public JList<Reporte> jListColumnasSelectReporteGuiasRemisiones;
	//public JScrollPane jScrollColumnasSelectReporteGuiasRemisiones;
	
	//public JLabel jLabelRelacionesSelectReporteGuiasRemisiones;
	//public JList<Reporte> jListRelacionesSelectReporteGuiasRemisiones;
	//public JScrollPane jScrollRelacionesSelectReporteGuiasRemisiones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGuiasRemisiones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGuiasRemisiones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGuiasRemisiones;
	//public JLabel jLabelTiposArchivoReporteDinamicoGuiasRemisiones;
	
		
	//public JLabel jLabelArchivoImportacionGuiasRemisiones;	
	//public JLabel jLabelPathArchivoImportacionGuiasRemisiones;
	//protected JTextField jTextFieldPathArchivoImportacionGuiasRemisiones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGuiasRemisiones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGuiasRemisiones;
	
	//public JLabel jLabelColumnaCategoriaValorGuiasRemisiones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGuiasRemisiones;
	
	//public JLabel jLabelColumnasValoresGraficoGuiasRemisiones;
	//public JList<Reporte> jListColumnasValoresGraficoGuiasRemisiones;
	//public JScrollPane jScrollColumnasValoresGraficoGuiasRemisiones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGuiasRemisiones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGuiasRemisiones;
	public JPanel jPanelBusquedaGuiasRemisionesGuiasRemisiones;
	public JButton jButtonBusquedaGuiasRemisionesGuiasRemisiones;
	
	public JPanel jPanelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones;
	public JLabel jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones;
	public JButton jButtonfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisionesBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones;
	public JLabel jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones;
	public JButton jButtonfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisionesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public GuiasRemisionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGuiasRemisiones)	{
		this.jButtonRecargarInformacionGuiasRemisiones = jButtonRecargarInformacionGuiasRemisiones;
	}
	
	public JButton getjButtonProcesarInformacionGuiasRemisiones() {
		return this.jButtonProcesarInformacionGuiasRemisiones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuiasRemisiones)	{
		this.jButtonProcesarInformacionGuiasRemisiones = jButtonProcesarInformacionGuiasRemisiones;
	}
	
	
	public JButton getjButtonRecargarInformacionGuiasRemisiones() {
		return this.jButtonRecargarInformacionGuiasRemisiones;
	}
	
	
	public List<GuiasRemisiones> getguiasremisioness() {
		return this.guiasremisioness;
	}

	public void setguiasremisioness(List<GuiasRemisiones> guiasremisioness) {
		this.guiasremisioness = guiasremisioness;
	}
	
	public List<GuiasRemisiones> getguiasremisionessAux() {
		return this.guiasremisionessAux;
	}

	public void setguiasremisionessAux(List<GuiasRemisiones> guiasremisionessAux) {
		this.guiasremisionessAux = guiasremisionessAux;
	}
	
	public List<GuiasRemisiones> getguiasremisionessEliminados() {
		return this.guiasremisionessEliminados;
	}

	public void setGuiasRemisionessEliminados(List<GuiasRemisiones> guiasremisionessEliminados) {
		this.guiasremisionessEliminados = guiasremisionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGuiasRemisiones() {
		return jComboBoxTiposSeleccionarGuiasRemisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGuiasRemisiones(
			JComboBox jComboBoxTiposSeleccionarGuiasRemisiones) {
		this.jComboBoxTiposSeleccionarGuiasRemisiones = jComboBoxTiposSeleccionarGuiasRemisiones;
	}
	
	public void setBorderResaltarTiposSeleccionarGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGuiasRemisiones() {
		return jTextFieldValorCampoGeneralGuiasRemisiones;
	}

	public void setjTextFieldValorCampoGeneralGuiasRemisiones(
			JTextField jTextFieldValorCampoGeneralGuiasRemisiones) {
		this.jTextFieldValorCampoGeneralGuiasRemisiones = jTextFieldValorCampoGeneralGuiasRemisiones;
	}

	public void setBorderResaltarValorCampoGeneralGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGuiasRemisiones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGuiasRemisiones() {
		return this.jCheckBoxSeleccionarTodosGuiasRemisiones;
	}

	public void setjCheckBoxSeleccionarTodosGuiasRemisiones(
			JCheckBox jCheckBoxSeleccionarTodosGuiasRemisiones) {
		this.jCheckBoxSeleccionarTodosGuiasRemisiones = jCheckBoxSeleccionarTodosGuiasRemisiones;
	}

	public void setBorderResaltarSeleccionarTodosGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGuiasRemisiones() {
		return this.jCheckBoxSeleccionadosGuiasRemisiones;
	}

	public void setjCheckBoxSeleccionadosGuiasRemisiones(
			JCheckBox jCheckBoxSeleccionadosGuiasRemisiones) {
		this.jCheckBoxSeleccionadosGuiasRemisiones = jCheckBoxSeleccionadosGuiasRemisiones;
	}
	
	public void setBorderResaltarSeleccionadosGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGuiasRemisiones() {
		return this.jComboBoxTiposArchivosReportesGuiasRemisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGuiasRemisiones(
			JComboBox jComboBoxTiposArchivosReportesGuiasRemisiones) {
		this.jComboBoxTiposArchivosReportesGuiasRemisiones = jComboBoxTiposArchivosReportesGuiasRemisiones;
	}

	public void setBorderResaltarTiposArchivosReportesGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGuiasRemisiones() {
		return this.jComboBoxTiposReportesGuiasRemisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGuiasRemisiones(
			JComboBox jComboBoxTiposReportesGuiasRemisiones) {
		this.jComboBoxTiposReportesGuiasRemisiones = jComboBoxTiposReportesGuiasRemisiones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGuiasRemisiones() {
	//	return jComboBoxTiposReportesDinamicoGuiasRemisiones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGuiasRemisiones(
	//		JComboBox jComboBoxTiposReportesDinamicoGuiasRemisiones) {
	//	this.jComboBoxTiposReportesDinamicoGuiasRemisiones = jComboBoxTiposReportesDinamicoGuiasRemisiones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGuiasRemisiones() {
	//	return jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGuiasRemisiones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones = jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones;
	//}
	
	public void setBorderResaltarTiposReportesGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGuiasRemisiones() {
		return this.jComboBoxTiposGraficosReportesGuiasRemisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGuiasRemisiones(
			JComboBox jComboBoxTiposGraficosReportesGuiasRemisiones) {
		this.jComboBoxTiposGraficosReportesGuiasRemisiones = jComboBoxTiposGraficosReportesGuiasRemisiones;
	}
	
	public void setBorderResaltarTiposGraficosReportesGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGuiasRemisiones() {
		return this.jComboBoxTiposPaginacionGuiasRemisiones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGuiasRemisiones(
			JComboBox jComboBoxTiposPaginacionGuiasRemisiones) {
		this.jComboBoxTiposPaginacionGuiasRemisiones = jComboBoxTiposPaginacionGuiasRemisiones;
	}
	
	public void setBorderResaltarTiposPaginacionGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGuiasRemisiones() {
		return this.jComboBoxTiposRelacionesGuiasRemisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuiasRemisiones() {
		return this.jComboBoxTiposAccionesGuiasRemisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuiasRemisiones(
			JComboBox jComboBoxTiposRelacionesGuiasRemisiones) {
		this.jComboBoxTiposRelacionesGuiasRemisiones = jComboBoxTiposRelacionesGuiasRemisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuiasRemisiones(
			JComboBox jComboBoxTiposAccionesGuiasRemisiones) {
		this.jComboBoxTiposAccionesGuiasRemisiones = jComboBoxTiposAccionesGuiasRemisiones;
	}
	
	public void setBorderResaltarTiposRelacionesGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGuiasRemisiones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGuiasRemisiones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGuiasRemisiones() {
	//	return jCheckBoxConGraficoDinamicoGuiasRemisiones;
	//}

	//public void setjCheckBoxConGraficoDinamicoGuiasRemisiones(
	//		JCheckBox jCheckBoxConGraficoDinamicoGuiasRemisiones) {
	//	this.jCheckBoxConGraficoDinamicoGuiasRemisiones = jCheckBoxConGraficoDinamicoGuiasRemisiones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGuiasRemisiones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGuiasRemisiones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGuiasRemisiones .setBorder(borderResaltar);		
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
		this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
		
		this.guiasremisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guiasremisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guiasremisionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuiasRemisionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guias Remisiones MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
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
		
		GuiasRemisionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGuiasRemisiones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"nuevo","nuevo","Nuevo"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"duplicar","duplicar","Duplicar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"copiar","copiar","Copiar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"ver_form","ver_form","Ver"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"recargar","recargar","Buscar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGuiasRemisiones,this.jTtoolBarGuiasRemisiones,
							"cerrar","cerrar","Salir"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGuiasRemisiones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGuiasRemisiones;
			
				this.jButtonProcesarInformacionToolBarGuiasRemisiones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGuiasRemisiones;
				
		//protected JButton jButtonModificarToolBarGuiasRemisiones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGuiasRemisiones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGuiasRemisiones=new JMenuMe("General");
		this.jmenuArchivoGuiasRemisiones=new JMenuMe("Archivo");
		this.jmenuAccionesGuiasRemisiones=new JMenuMe("Acciones");
		this.jmenuDatosGuiasRemisiones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuiasRemisiones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuiasRemisiones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuiasRemisiones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGuiasRemisiones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGuiasRemisiones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGuiasRemisiones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGuiasRemisiones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGuiasRemisiones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGuiasRemisiones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGuiasRemisiones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuiasRemisiones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuiasRemisiones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGuiasRemisiones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGuiasRemisiones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGuiasRemisiones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGuiasRemisiones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGuiasRemisiones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGuiasRemisiones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGuiasRemisiones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGuiasRemisiones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGuiasRemisiones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuiasRemisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuiasRemisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuiasRemisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGuiasRemisiones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGuiasRemisiones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGuiasRemisiones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGuiasRemisiones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGuiasRemisiones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGuiasRemisiones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGuiasRemisiones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGuiasRemisiones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGuiasRemisiones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGuiasRemisiones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGuiasRemisiones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGuiasRemisiones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGuiasRemisiones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGuiasRemisiones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGuiasRemisiones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuiasRemisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuiasRemisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuiasRemisiones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGuiasRemisiones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGuiasRemisiones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGuiasRemisiones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuiasRemisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuiasRemisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuiasRemisiones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGuiasRemisiones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGuiasRemisiones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGuiasRemisiones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGuiasRemisiones.add(this.jMenuItemCerrarGuiasRemisiones);
			
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemNuevoGuiasRemisiones);
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemNuevoGuardarCambiosGuiasRemisiones);
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemNuevoRelacionesGuiasRemisiones);
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemGuardarCambiosTablaGuiasRemisiones);		
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemDuplicarGuiasRemisiones);		
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemCopiarGuiasRemisiones);		
			this.jmenuAccionesGuiasRemisiones.add(this.jMenuItemVerFormGuiasRemisiones);		
			
			this.jmenuDatosGuiasRemisiones.add(this.jMenuItemRecargarInformacionGuiasRemisiones);				
			this.jmenuDatosGuiasRemisiones.add(this.jMenuItemAnterioresGuiasRemisiones);				
			this.jmenuDatosGuiasRemisiones.add(this.jMenuItemSiguientesGuiasRemisiones);				
			this.jmenuDatosGuiasRemisiones.add(this.jMenuItemAbrirOrderByGuiasRemisiones);				
			this.jmenuDatosGuiasRemisiones.add(this.jMenuItemMostrarOcultarGuiasRemisiones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGuiasRemisiones.add(this.jMenuItemGuardarCambiosGuiasRemisiones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGuiasRemisiones.add(this.jmenuArchivoGuiasRemisiones);		
			this.jmenuBarGuiasRemisiones.add(this.jmenuAccionesGuiasRemisiones);		
			this.jmenuBarGuiasRemisiones.add(this.jmenuDatosGuiasRemisiones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGuiasRemisiones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGuiasRemisiones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaGuiasRemisionesGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaGuiasRemisionesGuiasRemisiones.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaGuiasRemisionesGuiasRemisiones= new JButtonMe();
		this.jButtonBusquedaGuiasRemisionesGuiasRemisiones.setText("Buscar");
		this.jButtonBusquedaGuiasRemisionesGuiasRemisiones.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaGuiasRemisionesGuiasRemisiones,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaGuiasRemisionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasGuiasRemisiones=new JTabbedPane();


		this.jTabbedPaneBusquedasGuiasRemisiones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGuiasRemisiones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGuiasRemisiones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGuiasRemisiones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGuiasRemisiones = new GuiasRemisionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Guias Remisiones DATOS");
			this.jInternalFrameDetalleFormGuiasRemisiones = new GuiasRemisionesDetalleFormJInternalFrame(jDesktopPane,this.guiasremisionesSessionBean.getConGuardarRelaciones(),this.guiasremisionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGuiasRemisiones = null;//new GuiasRemisionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuiasRemisiones= new GridBagLayout();
		
		
		this.jTableDatosGuiasRemisiones = new JTableMe();      
		
		String sToolTipGuiasRemisiones="";
		sToolTipGuiasRemisiones=GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuiasRemisiones+="(Facturacion.GuiasRemisiones)";
		}
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuiasRemisiones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGuiasRemisiones.setToolTipText(sToolTipGuiasRemisiones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGuiasRemisiones);
		this.jTableDatosGuiasRemisiones.setAutoCreateRowSorter(true);
		this.jTableDatosGuiasRemisiones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGuiasRemisiones.setRowSelectionAllowed(true);
		this.jTableDatosGuiasRemisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGuiasRemisiones = new JButtonMe();
		this.jButtonDuplicarGuiasRemisiones = new JButtonMe();
		this.jButtonCopiarGuiasRemisiones = new JButtonMe();
		this.jButtonVerFormGuiasRemisiones = new JButtonMe();
		this.jButtonNuevoRelacionesGuiasRemisiones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones = new JButtonMe();
		this.jButtonCerrarGuiasRemisiones = new JButtonMe();
		
		this.jScrollPanelDatosGuiasRemisiones = new JScrollPane();   
        this.jScrollPanelDatosGeneralGuiasRemisiones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Guias Remisiones";
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosGuiasRemisiones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuiasRemisiones.setToolTipText("Acciones");
        this.jPanelAccionesGuiasRemisiones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGuiasRemisiones=new ReporteDinamicoJInternalFrame(GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGuiasRemisiones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGuiasRemisiones=new ImportacionJInternalFrame(GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGuiasRemisiones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGuiasRemisiones = new JButtonMe();
		
		this.jButtonAbrirOrderByGuiasRemisiones.setText("Orden");
		this.jButtonAbrirOrderByGuiasRemisiones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuiasRemisiones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuiasRemisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiasRemisiones,false,this);
			
			//this.cargarOrderByGuiasRemisiones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGuiasRemisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuiasRemisiones,true,this);
			
			//this.cargarOrderByGuiasRemisiones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGuiasRemisiones.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosGuiasRemisiones.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosGuiasRemisiones.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosGuiasRemisiones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuiasRemisiones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGuiasRemisiones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGuiasRemisiones.setText("Nuevo");
		this.jButtonDuplicarGuiasRemisiones.setText("Duplicar");
		this.jButtonCopiarGuiasRemisiones.setText("Copiar");
		this.jButtonVerFormGuiasRemisiones.setText("Ver");
		this.jButtonNuevoRelacionesGuiasRemisiones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.setText("Guardar");
		this.jButtonCerrarGuiasRemisiones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuiasRemisiones,"nuevo_button","Nuevo",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGuiasRemisiones,"duplicar_button","Duplicar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGuiasRemisiones,"copiar_button","Copiar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGuiasRemisiones,"ver_form","Ver",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGuiasRemisiones,"nuevorelaciones_button","Nuevo Rel",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuiasRemisiones,"guardarcambiostabla_button","Guardar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuiasRemisiones,"cerrar_button","Salir",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGuiasRemisiones.setToolTipText("Nuevo"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGuiasRemisiones.setToolTipText("Duplicar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGuiasRemisiones.setToolTipText("Copiar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGuiasRemisiones.setToolTipText("Ver"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGuiasRemisiones.setToolTipText("Nuevo Rel"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.setToolTipText("Guardar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuiasRemisiones.setToolTipText("Salir"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuiasRemisiones";
		inputMap = this.jButtonNuevoGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuiasRemisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuiasRemisiones"));
		
		//DUPLICAR
		sMapKey = "DuplicarGuiasRemisiones";
		inputMap = this.jButtonDuplicarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGuiasRemisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGuiasRemisiones"));
		
		//COPIAR
		sMapKey = "CopiarGuiasRemisiones";
		inputMap = this.jButtonCopiarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGuiasRemisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGuiasRemisiones"));
		
		//VEr FORM
		sMapKey = "VerFormGuiasRemisiones";
		inputMap = this.jButtonVerFormGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGuiasRemisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGuiasRemisiones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGuiasRemisiones";
		inputMap = this.jButtonNuevoRelacionesGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGuiasRemisiones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGuiasRemisiones";
		inputMap = this.jButtonModificarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGuiasRemisiones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGuiasRemisiones";
		inputMap = this.jButtonCerrarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuiasRemisiones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuiasRemisiones";
		inputMap = this.jButtonGuardarCambiosTablaGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuiasRemisiones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGuiasRemisiones.setName("jPanelParametrosReportesGuiasRemisiones"); 
		
		this.jPanelParametrosReportesAccionesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGuiasRemisiones.setName("jPanelParametrosReportesAccionesGuiasRemisiones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGuiasRemisiones = new JButtonMe();
		this.jButtonRecargarInformacionGuiasRemisiones.setText("Buscar");
		this.jButtonRecargarInformacionGuiasRemisiones.setToolTipText("Buscar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGuiasRemisiones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionGuiasRemisiones.setVisible(false);
		
		
		this.jButtonProcesarInformacionGuiasRemisiones = new JButtonMe();
		this.jButtonProcesarInformacionGuiasRemisiones.setText("Procesar");
		this.jButtonProcesarInformacionGuiasRemisiones.setToolTipText("Procesar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGuiasRemisiones.setVisible(false);
			
		this.jButtonProcesarInformacionGuiasRemisiones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuiasRemisiones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGuiasRemisiones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiasRemisiones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGuiasRemisiones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiasRemisiones.setText("TIPO");       
		this.jComboBoxTiposReportesGuiasRemisiones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGuiasRemisiones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGuiasRemisiones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGuiasRemisiones.setText("Paginacion");
		this.jComboBoxTiposPaginacionGuiasRemisiones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGuiasRemisiones.setText("Accion");
		this.jComboBoxTiposRelacionesGuiasRemisiones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuiasRemisiones.setText("Accion");
		this.jComboBoxTiposAccionesGuiasRemisiones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGuiasRemisiones.setText("Accion");
		this.jComboBoxTiposSeleccionarGuiasRemisiones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGuiasRemisiones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGuiasRemisiones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuiasRemisiones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGuiasRemisiones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGuiasRemisiones = new JLabelMe();
		
		this.jLabelAccionesGuiasRemisiones.setText("Acciones");		
		this.jLabelAccionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGuiasRemisiones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGuiasRemisiones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGuiasRemisiones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGuiasRemisiones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGuiasRemisiones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGuiasRemisiones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGuiasRemisiones.setText("Graf.");
		this.jCheckBoxConGraficoReporteGuiasRemisiones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGuiasRemisiones = new JButtonMe();
		//this.jButtonAnterioresGuiasRemisiones.setText("<<");
        this.jButtonAnterioresGuiasRemisiones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGuiasRemisiones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGuiasRemisiones = new JButtonMe();
		//this.jButtonSiguientesGuiasRemisiones.setText(">>");
        this.jButtonSiguientesGuiasRemisiones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGuiasRemisiones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGuiasRemisiones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGuiasRemisiones.setText("Nue");
        this.jButtonNuevoGuardarCambiosGuiasRemisiones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGuiasRemisiones,"nuevoguardarcambios_button","Nue",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGuiasRemisiones";
		inputMap = this.jButtonNuevoGuardarCambiosGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGuiasRemisiones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGuiasRemisiones";
		inputMap = this.jButtonRecargarInformacionGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGuiasRemisiones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGuiasRemisiones";
		inputMap = this.jButtonSiguientesGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGuiasRemisiones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGuiasRemisiones";
		inputMap = this.jButtonAnterioresGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGuiasRemisiones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGuiasRemisiones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGuiasRemisiones.setMinimumSize(new Dimension(this.getWidth(),GuiasRemisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiasRemisionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuiasRemisiones.setMaximumSize(new Dimension(this.getWidth(),GuiasRemisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiasRemisionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGuiasRemisiones.setPreferredSize(new Dimension(this.getWidth(),GuiasRemisionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GuiasRemisionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGuiasRemisiones = new GridBagLayout();

			this.jPanelPaginacionGuiasRemisiones.setLayout(gridaBagLayoutPaginacionGuiasRemisiones);						
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 0;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonAnterioresGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					
						
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGuiasRemisiones.gridy = 0;
			
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonNuevoGuardarCambiosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
						
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGuiasRemisiones.gridy = 0;
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonSiguientesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 1;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonNuevoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
						
			
			
			if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
				this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGuiasRemisiones.gridy = 1;
				this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGuiasRemisiones.add(this.jButtonGuardarCambiosTablaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			}
			
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 1;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonDuplicarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 1;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonCopiarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 1;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonVerFormGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 1;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGuiasRemisiones.add(this.jButtonCerrarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		
		this.jButtonRecargarInformacionGuiasRemisiones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuiasRemisiones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGuiasRemisiones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGuiasRemisiones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuiasRemisiones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGuiasRemisiones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGuiasRemisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuiasRemisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGuiasRemisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGuiasRemisiones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuiasRemisiones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGuiasRemisiones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGuiasRemisiones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuiasRemisiones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGuiasRemisiones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGuiasRemisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuiasRemisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGuiasRemisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGuiasRemisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiasRemisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiasRemisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGuiasRemisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuiasRemisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGuiasRemisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGuiasRemisiones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuiasRemisiones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGuiasRemisiones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGuiasRemisiones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuiasRemisiones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGuiasRemisiones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGuiasRemisiones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuiasRemisiones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGuiasRemisiones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGuiasRemisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGuiasRemisiones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GuiasRemisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GuiasRemisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GuiasRemisiones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GuiasRemisiones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGuiasRemisiones.setLayout(gridaBagParametrosReportesGuiasRemisiones);
			this.jPanelParametrosReportesAccionesGuiasRemisiones.setLayout(gridaBagParametrosReportesAccionesGuiasRemisiones);
			
			
			this.jPanelParametrosAuxiliar1GuiasRemisiones.setLayout(gridaBagParametrosAuxiliar1GuiasRemisiones);
			this.jPanelParametrosAuxiliar2GuiasRemisiones.setLayout(gridaBagParametrosAuxiliar2GuiasRemisiones);
			this.jPanelParametrosAuxiliar3GuiasRemisiones.setLayout(gridaBagParametrosAuxiliar3GuiasRemisiones);
			this.jPanelParametrosAuxiliar4GuiasRemisiones.setLayout(gridaBagParametrosAuxiliar4GuiasRemisiones);
			//this.jPanelParametrosAuxiliar5GuiasRemisiones.setLayout(gridaBagParametrosAuxiliar2GuiasRemisiones);			
			
			
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jButtonRecargarInformacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiasRemisiones.add(this.jComboBoxTiposPaginacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiasRemisiones.add(this.jCheckBoxConAltoMaximoTablaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GuiasRemisiones.add(this.jComboBoxTiposArchivosReportesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jPanelParametrosAuxiliar1GuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GuiasRemisiones.add(this.jComboBoxTiposReportesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);																		
			
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GuiasRemisiones.add(this.jComboBoxTiposGraficosReportesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jPanelParametrosAuxiliar4GuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jComboBoxTiposReportesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jCheckBoxGenerarReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jPanelParametrosAuxiliar2GuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jLabelAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
				this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGuiasRemisiones.add(this.jButtonAbrirOrderByGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jComboBoxTiposSeleccionarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
			
			
			/*
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jCheckBoxSeleccionarTodosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jCheckBoxConGraficoReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiasRemisiones.add(this.jCheckBoxSeleccionarTodosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);															
				
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiasRemisiones.add(this.jCheckBoxSeleccionadosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);															
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGuiasRemisiones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GuiasRemisiones.add(this.jCheckBoxConGraficoReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jPanelParametrosAuxiliar3GuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGuiasRemisiones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGuiasRemisiones.add(this.jComboBoxTiposAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGuiasRemisiones = new GridBagLayout();

			this.jScrollPanelDatosGuiasRemisiones.setLayout(gridaBagLayoutDatosGuiasRemisiones);
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = 0;
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;
			
			this.jScrollPanelDatosGuiasRemisiones.add(this.jTableDatosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGuiasRemisiones.setViewportView(this.jTableDatosGuiasRemisiones);
		this.jTableDatosGuiasRemisiones.setFillsViewportHeight(true);
		this.jTableDatosGuiasRemisiones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGuiasRemisiones= new GridBagLayout();
		this.jPanelAccionesGuiasRemisiones.setLayout(gridaBagLayoutAccionesGuiasRemisiones);
		
		
		/*	
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
			
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonNuevoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones= new GridBagLayout();
		gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.setLayout(gridaBagLayoutBusquedaGuiasRemisionesGuiasRemisiones);

		gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiasRemisiones.gridy = 0;
		gridBagConstraintsGuiasRemisiones.gridx = 0;
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.add(jLabelfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones, gridBagConstraintsGuiasRemisiones);

		gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiasRemisiones.gridy = 0;
		gridBagConstraintsGuiasRemisiones.gridx = 1;
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.add(jDateChooserfecha_emision_desdeBusquedaGuiasRemisionesGuiasRemisiones, gridBagConstraintsGuiasRemisiones);


		gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiasRemisiones.gridy = 1;
		gridBagConstraintsGuiasRemisiones.gridx = 0;
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.add(jLabelfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones, gridBagConstraintsGuiasRemisiones);

		gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiasRemisiones.gridy = 1;
		gridBagConstraintsGuiasRemisiones.gridx = 1;
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.add(jDateChooserfecha_emision_hastaBusquedaGuiasRemisionesGuiasRemisiones, gridBagConstraintsGuiasRemisiones);

		gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGuiasRemisiones.gridy = 2;
		gridBagConstraintsGuiasRemisiones.gridx =1;
		jPanelBusquedaGuiasRemisionesGuiasRemisiones.add(jButtonBusquedaGuiasRemisionesGuiasRemisiones, gridBagConstraintsGuiasRemisiones);

		jTabbedPaneBusquedasGuiasRemisiones.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaGuiasRemisionesGuiasRemisiones);
		jTabbedPaneBusquedasGuiasRemisiones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuiasRemisiones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();						
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;		
			//this.gridBagConstraintsGuiasRemisiones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuiasRemisiones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;		
		//this.gridBagConstraintsGuiasRemisiones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGuiasRemisiones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;		
			this.gridBagConstraintsGuiasRemisiones.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGuiasRemisiones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);								
		
		
		/*
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		*/		
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuiasRemisiones.gridx =0;
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuiasRemisiones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
				
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGuiasRemisiones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuiasRemisiones = new GridBagLayout();
			this.jPanelBusquedasParametrosGuiasRemisiones.setLayout(gridaBagLayoutBusquedasParametrosGuiasRemisiones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGuiasRemisiones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuiasRemisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiasRemisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiasRemisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGuiasRemisiones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGuiasRemisiones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGuiasRemisiones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGuiasRemisiones.setName("jPanelReporteDinamicoGuiasRemisiones"); 
		
		this.jPanelReporteDinamicoGuiasRemisiones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuiasRemisiones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGuiasRemisiones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGuiasRemisiones.setLayout(gridaBagLayoutReporteDinamicoGuiasRemisiones);
		
		
		this.jInternalFrameReporteDinamicoGuiasRemisiones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGuiasRemisiones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuiasRemisiones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGuiasRemisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGuiasRemisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGuiasRemisiones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGuiasRemisiones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGuiasRemisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGuiasRemisiones.setResizable(true);
	    this.jInternalFrameReporteDinamicoGuiasRemisiones.setClosable(true);
	    this.jInternalFrameReporteDinamicoGuiasRemisiones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGuiasRemisiones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuiasRemisiones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGuiasRemisiones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGuiasRemisiones = new JLabelMe();

		this.jLabelColumnasSelectReporteGuiasRemisiones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelColumnasSelectReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGuiasRemisiones = new JList<Reporte>();
		this.jListColumnasSelectReporteGuiasRemisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGuiasRemisiones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGuiasRemisiones=new JScrollPane(this.jListColumnasSelectReporteGuiasRemisiones);
			
			this.jScrollColumnasSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGuiasRemisiones.add(this.jListColumnasSelectReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jScrollColumnasSelectReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGuiasRemisiones = new JLabelMe();

		this.jLabelRelacionesSelectReporteGuiasRemisiones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGuiasRemisiones = new JList<Reporte>();
		this.jListRelacionesSelectReporteGuiasRemisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGuiasRemisiones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGuiasRemisiones=new JScrollPane(this.jListRelacionesSelectReporteGuiasRemisiones);
			
			this.jScrollRelacionesSelectReporteGuiasRemisiones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuiasRemisiones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGuiasRemisiones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGuiasRemisiones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones = new JComboBoxMe();
		this.jListColumnasValoresGraficoGuiasRemisiones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGuiasRemisiones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGuiasRemisiones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGuiasRemisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuiasRemisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGuiasRemisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGuiasRemisiones = new JLabelMe();

		this.jLabelConGraficoDinamicoGuiasRemisiones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelConGraficoDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGuiasRemisiones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGuiasRemisiones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGuiasRemisiones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuiasRemisiones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGuiasRemisiones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jCheckBoxConGraficoDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGuiasRemisiones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGuiasRemisiones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelColumnaCategoriaGraficoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGuiasRemisiones = new JLabelMe();

		this.jLabelColumnaCategoriaValorGuiasRemisiones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelColumnaCategoriaValorGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGuiasRemisiones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGuiasRemisiones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGuiasRemisiones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuiasRemisiones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGuiasRemisiones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jComboBoxColumnaCategoriaValorGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGuiasRemisiones = new JLabelMe();

		this.jLabelColumnasValoresGraficoGuiasRemisiones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelColumnasValoresGraficoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGuiasRemisiones = new JList<Reporte>();
		this.jListColumnasValoresGraficoGuiasRemisiones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGuiasRemisiones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGuiasRemisiones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuiasRemisiones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGuiasRemisiones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGuiasRemisiones=new JScrollPane(this.jListColumnasValoresGraficoGuiasRemisiones);
			
			this.jScrollColumnasValoresGraficoGuiasRemisiones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuiasRemisiones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGuiasRemisiones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGuiasRemisiones.add(this.jListColumnasSelectReporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jScrollColumnasValoresGraficoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelTiposGraficosReportesDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGuiasRemisiones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jComboBoxTiposGraficosReportesDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelGenerarExcelReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones.setToolTipText("Generar EXCEL"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGuiasRemisiones.add(this.jButtonGenerarExcelReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jComboBoxTiposReportesDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jLabelTiposArchivoReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jComboBoxTiposArchivosReportesDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGuiasRemisiones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGuiasRemisiones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGuiasRemisiones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGuiasRemisiones.setToolTipText("Generar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jButtonGenerarReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGuiasRemisiones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGuiasRemisiones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGuiasRemisiones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGuiasRemisiones.setToolTipText("Cancelar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGuiasRemisiones.add(this.jButtonCerrarReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGuiasRemisiones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGuiasRemisiones= new JScrollPane(jPanelReporteDinamicoGuiasRemisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGuiasRemisiones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuiasRemisiones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGuiasRemisiones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGuiasRemisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGuiasRemisiones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGuiasRemisiones);
		this.jInternalFrameReporteDinamicoGuiasRemisiones.getContentPane().add(this.jScrollPanelReporteDinamicoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGuiasRemisiones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGuiasRemisiones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGuiasRemisiones.setName("jPanelImportacionGuiasRemisiones"); 
		
		this.jPanelImportacionGuiasRemisiones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuiasRemisiones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGuiasRemisiones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGuiasRemisiones.setLayout(gridaBagLayoutImportacionGuiasRemisiones);
		
		
		this.jInternalFrameImportacionGuiasRemisiones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGuiasRemisiones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGuiasRemisiones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGuiasRemisiones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGuiasRemisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuiasRemisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuiasRemisiones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGuiasRemisiones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuiasRemisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuiasRemisiones.setResizable(true);
	    this.jInternalFrameImportacionGuiasRemisiones.setClosable(true);
	    this.jInternalFrameImportacionGuiasRemisiones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGuiasRemisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGuiasRemisiones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGuiasRemisiones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGuiasRemisiones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGuiasRemisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGuiasRemisiones.setResizable(true);
	    this.jInternalFrameImportacionGuiasRemisiones.setClosable(true);
	    this.jInternalFrameImportacionGuiasRemisiones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGuiasRemisiones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuiasRemisiones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGuiasRemisiones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGuiasRemisiones = new JLabelMe();

		this.jLabelArchivoImportacionGuiasRemisiones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuiasRemisiones.add(this.jLabelArchivoImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGuiasRemisiones = new JFileChooser();		
		this.jFileChooserImportacionGuiasRemisiones.setToolTipText("ESCOGER ARCHIVO"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGuiasRemisiones = new JButtonMe();
		this.jButtonAbrirImportacionGuiasRemisiones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGuiasRemisiones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGuiasRemisiones.setToolTipText("Generar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiasRemisiones.add(this.jButtonAbrirImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGuiasRemisiones = new JLabelMe();

		this.jLabelPathArchivoImportacionGuiasRemisiones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGuiasRemisiones.add(this.jLabelPathArchivoImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGuiasRemisiones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGuiasRemisiones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuiasRemisiones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGuiasRemisiones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiasRemisiones.add(this.jTextFieldPathArchivoImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGuiasRemisiones = new JButtonMe();
		this.jButtonGenerarImportacionGuiasRemisiones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGuiasRemisiones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGuiasRemisiones.setToolTipText("Generar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiasRemisiones.add(this.jButtonGenerarImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGuiasRemisiones = new JButtonMe();
		this.jButtonCerrarImportacionGuiasRemisiones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGuiasRemisiones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGuiasRemisiones.setToolTipText("Cancelar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = iPosYImportacion;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGuiasRemisiones.add(this.jButtonCerrarImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGuiasRemisiones = new GridBagLayout();
		
		this.jScrollPanelImportacionGuiasRemisiones= new JScrollPane(jPanelImportacionGuiasRemisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iPosYImportacion;
		this.gridBagConstraintsGuiasRemisiones.gridx =iPosXImportacion;
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGuiasRemisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGuiasRemisiones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGuiasRemisiones);
		this.jInternalFrameImportacionGuiasRemisiones.getContentPane().add(this.jScrollPanelImportacionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGuiasRemisiones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGuiasRemisiones = new JButtonMe();
			this.jButtonAbrirOrderByGuiasRemisiones.setText("Orden");
			this.jButtonAbrirOrderByGuiasRemisiones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGuiasRemisiones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGuiasRemisiones";
			inputMap = this.jButtonAbrirOrderByGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGuiasRemisiones"));
		
		
			GridBagLayout gridaBagLayoutOrderByGuiasRemisiones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGuiasRemisiones.setName("jPanelOrderByGuiasRemisiones"); 
			
			this.jPanelOrderByGuiasRemisiones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuiasRemisiones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGuiasRemisiones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGuiasRemisiones.setLayout(gridaBagLayoutOrderByGuiasRemisiones);
			
			
			this.jTableDatosGuiasRemisionesOrderBy = new JTableMe();        
			this.jTableDatosGuiasRemisionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGuiasRemisionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGuiasRemisionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGuiasRemisionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGuiasRemisionesOrderBy.setViewportView(this.jTableDatosGuiasRemisionesOrderBy);
			this.jTableDatosGuiasRemisionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGuiasRemisionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGuiasRemisiones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGuiasRemisiones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGuiasRemisiones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGuiasRemisiones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGuiasRemisiones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGuiasRemisiones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGuiasRemisiones.setTitle("Orden");
			this.jInternalFrameOrderByGuiasRemisiones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGuiasRemisiones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGuiasRemisiones.setResizable(true);
			this.jInternalFrameOrderByGuiasRemisiones.setClosable(true);
			this.jInternalFrameOrderByGuiasRemisiones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGuiasRemisiones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuiasRemisiones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGuiasRemisiones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGuiasRemisiones.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGuiasRemisiones.ipady =150;
				
			this.jPanelOrderByGuiasRemisiones.add(jScrollPanelDatosGuiasRemisionesOrderBy, this.gridBagConstraintsGuiasRemisiones);//this.jTableDatosGuiasRemisionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGuiasRemisiones = new JButtonMe();
			this.jButtonCerrarOrderByGuiasRemisiones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGuiasRemisiones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGuiasRemisiones.setToolTipText("Cancelar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGuiasRemisiones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGuiasRemisiones.add(this.jButtonCerrarOrderByGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGuiasRemisiones = new GridBagLayout();
			
			this.jScrollPanelOrderByGuiasRemisiones= new JScrollPane(jPanelOrderByGuiasRemisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy =iPosYOrderBy;
			this.gridBagConstraintsGuiasRemisiones.gridx =iPosXOrderBy;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGuiasRemisiones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGuiasRemisiones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGuiasRemisiones);
			
			this.jInternalFrameOrderByGuiasRemisiones.getContentPane().add(this.jScrollPanelOrderByGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
		
		} else {
			this.jButtonAbrirOrderByGuiasRemisiones = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.guiasremisionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGuiasRemisiones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGuiasRemisiones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosGuiasRemisiones.getRowHeight();//GuiasRemisionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.isSelected()) {
					iHeightTable=GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGuiasRemisiones.isSelected()) {
					iHeightTable=GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GuiasRemisionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGuiasRemisiones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuiasRemisiones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGuiasRemisiones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGuiasRemisiones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuiasRemisiones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGuiasRemisiones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGuiasRemisiones!=null && this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy()!=null) {
			//if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGuiasRemisiones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGuiasRemisiones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGuiasRemisiones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGuiasRemisiones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGuiasRemisiones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuiasRemisiones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGuiasRemisiones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=guiasremisionesLogic.getGuiasRemisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guiasremisioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GuiasRemisiones> TraerGuiasRemisionesBeans(List<GuiasRemisiones> guiasremisioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(GuiasRemisiones guiasremisiones:guiasremisioness) {
					
				if(!(GuiasRemisionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GuiasRemisionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					guiasremisiones.setsDetalleGeneralEntityReporte(GuiasRemisionesConstantesFunciones.getGuiasRemisionesDescripcion(guiasremisiones));
										
						
					
						
					
				} else  {
							
					//guiasremisiones.setsDetalleGeneralEntityReporte(guiasremisiones.getsDetalleGeneralEntityReporte());
										
				}
				
				//guiasremisionesbeans.add(guiasremisionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return guiasremisioness;
    }
	//PARA REPORTES FIN
}
