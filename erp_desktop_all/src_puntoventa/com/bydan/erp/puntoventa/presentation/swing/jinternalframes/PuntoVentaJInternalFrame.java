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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PuntoVentaJInternalFrame extends PuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPuntoVenta;
	
	protected JMenuBar jmenuBarPuntoVenta;
	
	protected JMenu jmenuPuntoVenta;
	protected JMenu jmenuDatosPuntoVenta;
	protected JMenu jmenuArchivoPuntoVenta;
	protected JMenu jmenuAccionesPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PuntoVentaSessionBean puntoventaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<PuntoVenta> puntoventas;		
	public List<PuntoVenta> puntoventasEliminados;	
	public List<PuntoVenta> puntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPuntoVenta;		
	protected JButton jButtonAbrirOrderByPuntoVenta;
	
	
	//protected JPanel jPanelOrderByPuntoVenta;
	//public JScrollPane jScrollPanelOrderByPuntoVenta;	
	//protected JButton jButtonCerrarOrderByPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PuntoVentaLogic puntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesPuntoVenta;
	
    protected JPanel jPanelPaginacionPuntoVenta;
    protected JPanel jPanelParametrosReportesPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesPuntoVenta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2PuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3PuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4PuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5PuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoPuntoVenta;
	//protected JPanel jPanelImportacionPuntoVenta;
	
	
	public JTable jTableDatosPuntoVenta;
	
	
	
	//public JTable jTableDatosPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPuntoVenta;
	protected JButton jButtonDuplicarPuntoVenta;
	protected JButton jButtonCopiarPuntoVenta;
	protected JButton jButtonVerFormPuntoVenta;
	protected JButton jButtonNuevoRelacionesPuntoVenta;
	protected JButton jButtonModificarPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaPuntoVenta;
	protected JButton jButtonCerrarPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionPuntoVenta;
	protected JButton jButtonProcesarInformacionPuntoVenta;
	
	
	protected JButton jButtonAnterioresPuntoVenta;
	protected JButton jButtonSiguientesPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionPuntoVenta;
	//protected JButton jButtonGenerarImportacionPuntoVenta;
	//protected JButton jButtonCerrarImportacionPuntoVenta;
	//protected JFileChooser jFileChooserImportacionPuntoVenta;
	//protected File fileImportacionPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuntoVenta;
	protected JButton jButtonDuplicarToolBarPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarPuntoVenta;
	protected JButton jButtonCopiarToolBarPuntoVenta;
	protected JButton jButtonVerFormToolBarPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPuntoVenta;
	protected JButton jButtonCerrarToolBarPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarPuntoVenta;
	protected JButton jButtonAnterioresToolBarPuntoVenta;
	protected JButton jButtonSiguientesToolBarPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPuntoVenta;
	protected JMenuItem jMenuItemCopiarPuntoVenta;
	protected JMenuItem jMenuItemVerFormPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuntoVenta;
	protected JMenuItem jMenuItemCerrarPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionPuntoVenta;
	protected JMenuItem jMenuItemAnterioresPuntoVenta;
	protected JMenuItem jMenuItemSiguientesPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReportePuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePuntoVenta;
	//public JList<Reporte> jListColumnasSelectReportePuntoVenta;
	//public JScrollPane jScrollColumnasSelectReportePuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReportePuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReportePuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReportePuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPuntoVenta;	
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPuntoVenta)	{
		this.jButtonRecargarInformacionPuntoVenta = jButtonRecargarInformacionPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionPuntoVenta() {
		return this.jButtonProcesarInformacionPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuntoVenta)	{
		this.jButtonProcesarInformacionPuntoVenta = jButtonProcesarInformacionPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionPuntoVenta() {
		return this.jButtonRecargarInformacionPuntoVenta;
	}
	
	
	public List<PuntoVenta> getpuntoventas() {
		return this.puntoventas;
	}

	public void setpuntoventas(List<PuntoVenta> puntoventas) {
		this.puntoventas = puntoventas;
	}
	
	public List<PuntoVenta> getpuntoventasAux() {
		return this.puntoventasAux;
	}

	public void setpuntoventasAux(List<PuntoVenta> puntoventasAux) {
		this.puntoventasAux = puntoventasAux;
	}
	
	public List<PuntoVenta> getpuntoventasEliminados() {
		return this.puntoventasEliminados;
	}

	public void setPuntoVentasEliminados(List<PuntoVenta> puntoventasEliminados) {
		this.puntoventasEliminados = puntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPuntoVenta() {
		return jComboBoxTiposSeleccionarPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarPuntoVenta) {
		this.jComboBoxTiposSeleccionarPuntoVenta = jComboBoxTiposSeleccionarPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPuntoVenta() {
		return jTextFieldValorCampoGeneralPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralPuntoVenta(
			JTextField jTextFieldValorCampoGeneralPuntoVenta) {
		this.jTextFieldValorCampoGeneralPuntoVenta = jTextFieldValorCampoGeneralPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosPuntoVenta) {
		this.jCheckBoxSeleccionarTodosPuntoVenta = jCheckBoxSeleccionarTodosPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPuntoVenta() {
		return this.jCheckBoxSeleccionadosPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosPuntoVenta) {
		this.jCheckBoxSeleccionadosPuntoVenta = jCheckBoxSeleccionadosPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesPuntoVenta) {
		this.jComboBoxTiposArchivosReportesPuntoVenta = jComboBoxTiposArchivosReportesPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPuntoVenta() {
		return this.jComboBoxTiposReportesPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPuntoVenta(
			JComboBox jComboBoxTiposReportesPuntoVenta) {
		this.jComboBoxTiposReportesPuntoVenta = jComboBoxTiposReportesPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoPuntoVenta = jComboBoxTiposReportesDinamicoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesPuntoVenta) {
		this.jComboBoxTiposGraficosReportesPuntoVenta = jComboBoxTiposGraficosReportesPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPuntoVenta() {
		return this.jComboBoxTiposPaginacionPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPuntoVenta(
			JComboBox jComboBoxTiposPaginacionPuntoVenta) {
		this.jComboBoxTiposPaginacionPuntoVenta = jComboBoxTiposPaginacionPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPuntoVenta() {
		return this.jComboBoxTiposRelacionesPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuntoVenta() {
		return this.jComboBoxTiposAccionesPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuntoVenta(
			JComboBox jComboBoxTiposRelacionesPuntoVenta) {
		this.jComboBoxTiposRelacionesPuntoVenta = jComboBoxTiposRelacionesPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuntoVenta(
			JComboBox jComboBoxTiposAccionesPuntoVenta) {
		this.jComboBoxTiposAccionesPuntoVenta = jComboBoxTiposAccionesPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoPuntoVenta = jCheckBoxConGraficoDinamicoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPuntoVenta .setBorder(borderResaltar);		
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
		this.puntoventaSessionBean=new PuntoVentaSessionBean();
		
		this.puntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		PuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"copiar","copiar","Copiar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"ver_form","ver_form","Ver"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"recargar","recargar","Recargar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPuntoVenta,this.jTtoolBarPuntoVenta,
							"cerrar","cerrar","Salir"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPuntoVenta;
				
		//protected JButton jButtonModificarToolBarPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPuntoVenta.add(this.jMenuItemCerrarPuntoVenta);
			
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemNuevoPuntoVenta);
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosPuntoVenta);
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemNuevoRelacionesPuntoVenta);
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemGuardarCambiosTablaPuntoVenta);		
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemDuplicarPuntoVenta);		
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemCopiarPuntoVenta);		
			this.jmenuAccionesPuntoVenta.add(this.jMenuItemVerFormPuntoVenta);		
			
			this.jmenuDatosPuntoVenta.add(this.jMenuItemRecargarInformacionPuntoVenta);				
			this.jmenuDatosPuntoVenta.add(this.jMenuItemAnterioresPuntoVenta);				
			this.jmenuDatosPuntoVenta.add(this.jMenuItemSiguientesPuntoVenta);				
			this.jmenuDatosPuntoVenta.add(this.jMenuItemAbrirOrderByPuntoVenta);				
			this.jmenuDatosPuntoVenta.add(this.jMenuItemMostrarOcultarPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPuntoVenta.add(this.jMenuItemGuardarCambiosPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPuntoVenta.add(this.jmenuArchivoPuntoVenta);		
			this.jmenuBarPuntoVenta.add(this.jmenuAccionesPuntoVenta);		
			this.jmenuBarPuntoVenta.add(this.jmenuDatosPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPuntoVenta() {
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
			//this.jInternalFrameDetallePuntoVenta = new PuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Punto Venta DATOS");
			this.jInternalFrameDetalleFormPuntoVenta = new PuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.puntoventaSessionBean.getConGuardarRelaciones(),this.puntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPuntoVenta = null;//new PuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosPuntoVenta = new JTableMe();      
		
		String sToolTipPuntoVenta="";
		sToolTipPuntoVenta=PuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuntoVenta+="(PuntoVenta.PuntoVenta)";
		}
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPuntoVenta.setToolTipText(sToolTipPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPuntoVenta);
		this.jTableDatosPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarPuntoVenta = new JButtonMe();
		this.jButtonCopiarPuntoVenta = new JButtonMe();
		this.jButtonVerFormPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPuntoVenta = new JButtonMe();
		this.jButtonCerrarPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Punto Venta";
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPuntoVenta=new ReporteDinamicoJInternalFrame(PuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPuntoVenta=new ImportacionJInternalFrame(PuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntoVenta,false,this);
			
			//this.cargarOrderByPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntoVenta,true,this);
			
			//this.cargarOrderByPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPuntoVenta.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosPuntoVenta.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosPuntoVenta.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarPuntoVenta.setText("Duplicar");
		this.jButtonCopiarPuntoVenta.setText("Copiar");
		this.jButtonVerFormPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPuntoVenta.setText("Guardar");
		this.jButtonCerrarPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuntoVenta,"nuevo_button","Nuevo",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPuntoVenta,"duplicar_button","Duplicar",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPuntoVenta,"copiar_button","Copiar",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPuntoVenta,"ver_form","Ver",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.puntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuntoVenta,"guardarcambiostabla_button","Guardar",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuntoVenta,"cerrar_button","Salir",this.puntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPuntoVenta.setToolTipText("Nuevo"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPuntoVenta.setToolTipText("Duplicar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPuntoVenta.setToolTipText("Copiar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPuntoVenta.setToolTipText("Ver"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPuntoVenta.setToolTipText("Nuevo Rel"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPuntoVenta.setToolTipText("Guardar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuntoVenta.setToolTipText("Salir"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuntoVenta";
		inputMap = this.jButtonNuevoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarPuntoVenta";
		inputMap = this.jButtonDuplicarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarPuntoVenta";
		inputMap = this.jButtonCopiarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormPuntoVenta";
		inputMap = this.jButtonVerFormPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPuntoVenta";
		inputMap = this.jButtonModificarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPuntoVenta";
		inputMap = this.jButtonCerrarPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPuntoVenta.setName("jPanelParametrosReportesPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPuntoVenta.setName("jPanelParametrosReportesAccionesPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionPuntoVenta.setToolTipText("Recargar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionPuntoVenta.setToolTipText("Procesar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesPuntoVenta.setText("Acciones");		
		this.jLabelAccionesPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReportePuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresPuntoVenta.setText("<<");
        this.jButtonAnterioresPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesPuntoVenta.setText(">>");
        this.jButtonSiguientesPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPuntoVenta,"nuevoguardarcambios_button","Nue",this.puntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPuntoVenta";
		inputMap = this.jButtonRecargarInformacionPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPuntoVenta";
		inputMap = this.jButtonSiguientesPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPuntoVenta";
		inputMap = this.jButtonAnterioresPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),PuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),PuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),PuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionPuntoVenta.setLayout(gridaBagLayoutPaginacionPuntoVenta);						
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 0;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPuntoVenta.add(this.jButtonAnterioresPuntoVenta, this.gridBagConstraintsPuntoVenta);
					
						
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuntoVenta.gridy = 0;
			
			this.jPanelPaginacionPuntoVenta.add(this.jButtonNuevoGuardarCambiosPuntoVenta, this.gridBagConstraintsPuntoVenta);
						
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPuntoVenta.gridy = 0;
			this.jPanelPaginacionPuntoVenta.add(this.jButtonSiguientesPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 1;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntoVenta.add(this.jButtonNuevoPuntoVenta, this.gridBagConstraintsPuntoVenta);
						
			
			
			if(!this.puntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPuntoVenta.gridy = 1;
				this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPuntoVenta.add(this.jButtonGuardarCambiosTablaPuntoVenta, this.gridBagConstraintsPuntoVenta);
			}
			
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 1;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntoVenta.add(this.jButtonDuplicarPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 1;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntoVenta.add(this.jButtonCopiarPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 1;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPuntoVenta.add(this.jButtonVerFormPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 1;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPuntoVenta.add(this.jButtonCerrarPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPuntoVenta.setLayout(gridaBagParametrosReportesPuntoVenta);
			this.jPanelParametrosReportesAccionesPuntoVenta.setLayout(gridaBagParametrosReportesAccionesPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1PuntoVenta.setLayout(gridaBagParametrosAuxiliar1PuntoVenta);
			this.jPanelParametrosAuxiliar2PuntoVenta.setLayout(gridaBagParametrosAuxiliar2PuntoVenta);
			this.jPanelParametrosAuxiliar3PuntoVenta.setLayout(gridaBagParametrosAuxiliar3PuntoVenta);
			this.jPanelParametrosAuxiliar4PuntoVenta.setLayout(gridaBagParametrosAuxiliar4PuntoVenta);
			//this.jPanelParametrosAuxiliar5PuntoVenta.setLayout(gridaBagParametrosAuxiliar2PuntoVenta);			
			
			
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntoVenta.add(this.jButtonRecargarInformacionPuntoVenta, this.gridBagConstraintsPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntoVenta.add(this.jComboBoxTiposPaginacionPuntoVenta, this.gridBagConstraintsPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntoVenta.add(this.jCheckBoxConAltoMaximoTablaPuntoVenta, this.gridBagConstraintsPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PuntoVenta.add(this.jComboBoxTiposArchivosReportesPuntoVenta, this.gridBagConstraintsPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntoVenta.add(this.jPanelParametrosAuxiliar1PuntoVenta, this.gridBagConstraintsPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PuntoVenta.add(this.jComboBoxTiposReportesPuntoVenta, this.gridBagConstraintsPuntoVenta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntoVenta.add(this.jPanelParametrosAuxiliar4PuntoVenta, this.gridBagConstraintsPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntoVenta.add(this.jComboBoxTiposReportesPuntoVenta, this.gridBagConstraintsPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntoVenta.add(this.jCheckBoxGenerarReportePuntoVenta, this.gridBagConstraintsPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntoVenta.add(this.jPanelParametrosAuxiliar2PuntoVenta, this.gridBagConstraintsPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntoVenta.add(this.jLabelAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntoVenta.add(this.jComboBoxTiposSeleccionarPuntoVenta, this.gridBagConstraintsPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPuntoVenta.add(this.jCheckBoxSeleccionarTodosPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PuntoVenta.add(this.jCheckBoxSeleccionarTodosPuntoVenta, this.gridBagConstraintsPuntoVenta);															
				
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PuntoVenta.add(this.jCheckBoxSeleccionadosPuntoVenta, this.gridBagConstraintsPuntoVenta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPuntoVenta.add(this.jPanelParametrosAuxiliar3PuntoVenta, this.gridBagConstraintsPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntoVenta.add(this.jComboBoxTiposAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
	
				
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPuntoVenta.add(this.jTextFieldValorCampoGeneralPuntoVenta, this.gridBagConstraintsPuntoVenta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosPuntoVenta.setLayout(gridaBagLayoutDatosPuntoVenta);
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = 0;
			this.gridBagConstraintsPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosPuntoVenta.add(this.jTableDatosPuntoVenta, this.gridBagConstraintsPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPuntoVenta.setViewportView(this.jTableDatosPuntoVenta);
		this.jTableDatosPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPuntoVenta= new GridBagLayout();
		this.jPanelAccionesPuntoVenta.setLayout(gridaBagLayoutAccionesPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = 0;
		this.gridBagConstraintsPuntoVenta.gridx = 0;
			
		this.jPanelAccionesPuntoVenta.add(this.jButtonNuevoPuntoVenta, this.gridBagConstraintsPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPuntoVenta, this.gridBagConstraintsPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPuntoVenta, this.gridBagConstraintsPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
		*/		
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuntoVenta.gridx =0;
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuntoVenta, this.gridBagConstraintsPuntoVenta);
				
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPuntoVenta, this.gridBagConstraintsPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuntoVenta, this.gridBagConstraintsPuntoVenta);
			
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuntoVenta, this.gridBagConstraintsPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPuntoVenta.setName("jPanelReporteDinamicoPuntoVenta"); 
		
		this.jPanelReporteDinamicoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReportePuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPuntoVenta.add(this.jLabelColumnasSelectReportePuntoVenta, this.gridBagConstraintsPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReportePuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePuntoVenta=new JScrollPane(this.jListColumnasSelectReportePuntoVenta);
			
			this.jScrollColumnasSelectReportePuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPuntoVenta.add(this.jListColumnasSelectReportePuntoVenta, this.gridBagConstraintsPuntoVenta);
		this.jPanelReporteDinamicoPuntoVenta.add(this.jScrollColumnasSelectReportePuntoVenta, this.gridBagConstraintsPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReportePuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReportePuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePuntoVenta=new JScrollPane(this.jListRelacionesSelectReportePuntoVenta);
			
			this.jScrollRelacionesSelectReportePuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPuntoVenta.setToolTipText("Generar EXCEL"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPuntoVenta.setToolTipText("Generar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntoVenta.add(this.jButtonGenerarReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPuntoVenta.setToolTipText("Cancelar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPuntoVenta.add(this.jButtonCerrarReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPuntoVenta= new JScrollPane(jPanelReporteDinamicoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPuntoVenta);
		this.jInternalFrameReporteDinamicoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoPuntoVenta, this.gridBagConstraintsPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPuntoVenta.setName("jPanelImportacionPuntoVenta"); 
		
		this.jPanelImportacionPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPuntoVenta.setLayout(gridaBagLayoutImportacionPuntoVenta);
		
		
		this.jInternalFrameImportacionPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuntoVenta.add(this.jLabelArchivoImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPuntoVenta.setToolTipText("Generar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntoVenta.add(this.jButtonAbrirImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPuntoVenta.add(this.jLabelPathArchivoImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntoVenta.add(this.jTextFieldPathArchivoImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPuntoVenta.setToolTipText("Generar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntoVenta.add(this.jButtonGenerarImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPuntoVenta.setToolTipText("Cancelar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPuntoVenta.add(this.jButtonCerrarImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionPuntoVenta= new JScrollPane(jPanelImportacionPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPuntoVenta);
		this.jInternalFrameImportacionPuntoVenta.getContentPane().add(this.jScrollPanelImportacionPuntoVenta, this.gridBagConstraintsPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPuntoVenta";
			inputMap = this.jButtonAbrirOrderByPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPuntoVenta.setName("jPanelOrderByPuntoVenta"); 
			
			this.jPanelOrderByPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPuntoVenta.setLayout(gridaBagLayoutOrderByPuntoVenta);
			
			
			this.jTableDatosPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPuntoVentaOrderBy.setViewportView(this.jTableDatosPuntoVentaOrderBy);
			this.jTableDatosPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPuntoVenta.ipady =150;
				
			this.jPanelOrderByPuntoVenta.add(jScrollPanelDatosPuntoVentaOrderBy, this.gridBagConstraintsPuntoVenta);//this.jTableDatosPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPuntoVenta.setToolTipText("Cancelar"+" "+PuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPuntoVenta.add(this.jButtonCerrarOrderByPuntoVenta, this.gridBagConstraintsPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByPuntoVenta= new JScrollPane(jPanelOrderByPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPuntoVenta);
			
			this.jInternalFrameOrderByPuntoVenta.getContentPane().add(this.jScrollPanelOrderByPuntoVenta, this.gridBagConstraintsPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.puntoventaSessionBean.getConGuardarRelaciones()
			) {
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
		int iCountColumns=this.jTableDatosPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPuntoVenta.getRowHeight();//PuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuntoVenta.isSelected()) {
					iHeightTable=PuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPuntoVenta.isSelected()) {
					iHeightTable=PuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPuntoVenta!=null && this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.puntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=puntoventaLogic.getPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntoventas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PuntoVenta> TraerPuntoVentaBeans(List<PuntoVenta> puntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PuntoVenta puntoventa:puntoventas) {
					
				if(!(PuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					puntoventa.setsDetalleGeneralEntityReporte(PuntoVentaConstantesFunciones.getPuntoVentaDescripcion(puntoventa));
										
						
					
						
					
				} else  {
							
					//puntoventa.setsDetalleGeneralEntityReporte(puntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//puntoventabeans.add(puntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return puntoventas;
    }
	//PARA REPORTES FIN
}
