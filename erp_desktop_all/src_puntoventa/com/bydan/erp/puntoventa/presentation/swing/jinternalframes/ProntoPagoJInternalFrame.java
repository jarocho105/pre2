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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.puntoventa.util.ProntoPagoConstantesFunciones;

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
public class ProntoPagoJInternalFrame extends ProntoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProntoPago;
	
	protected JMenuBar jmenuBarProntoPago;
	
	protected JMenu jmenuProntoPago;
	protected JMenu jmenuDatosProntoPago;
	protected JMenu jmenuArchivoProntoPago;
	protected JMenu jmenuAccionesProntoPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProntoPago;	
	protected GridBagConstraints gridBagConstraintsProntoPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProntoPagoDetalleFormJInternalFrame jInternalFrameDetalleFormProntoPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProntoPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProntoPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ProntoPagoSessionBean prontopagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProntoPago> prontopagos;		
	public List<ProntoPago> prontopagosEliminados;	
	public List<ProntoPago> prontopagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProntoPago;		
	protected JButton jButtonAbrirOrderByProntoPago;
	
	
	//protected JPanel jPanelOrderByProntoPago;
	//public JScrollPane jScrollPanelOrderByProntoPago;	
	//protected JButton jButtonCerrarOrderByProntoPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProntoPagoLogic prontopagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProntoPago;
	public JScrollPane jScrollPanelDatosEdicionProntoPago;
	public JScrollPane jScrollPanelDatosGeneralProntoPago;
    
	
	
	//public JScrollPane jScrollPanelDatosProntoPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProntoPago;
	//public JScrollPane jScrollPanelImportacionProntoPago;
	
	
	
	protected JPanel jPanelAccionesProntoPago;
	
    protected JPanel jPanelPaginacionProntoPago;
    protected JPanel jPanelParametrosReportesProntoPago;
	protected JPanel jPanelParametrosReportesAccionesProntoPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProntoPago;
	protected JPanel jPanelParametrosAuxiliar2ProntoPago;
	protected JPanel jPanelParametrosAuxiliar3ProntoPago;
	protected JPanel jPanelParametrosAuxiliar4ProntoPago;
	//protected JPanel jPanelParametrosAuxiliar5ProntoPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoProntoPago;
	//protected JPanel jPanelImportacionProntoPago;
	
	
	public JTable jTableDatosProntoPago;
	
	
	
	//public JTable jTableDatosProntoPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProntoPago;
	protected JButton jButtonDuplicarProntoPago;
	protected JButton jButtonCopiarProntoPago;
	protected JButton jButtonVerFormProntoPago;
	protected JButton jButtonNuevoRelacionesProntoPago;
	protected JButton jButtonModificarProntoPago;
	
    protected JButton jButtonGuardarCambiosTablaProntoPago;
	protected JButton jButtonCerrarProntoPago;
	
	
	protected JButton jButtonRecargarInformacionProntoPago;
	protected JButton jButtonProcesarInformacionProntoPago;
	
	
	protected JButton jButtonAnterioresProntoPago;
	protected JButton jButtonSiguientesProntoPago;
	protected JButton jButtonNuevoGuardarCambiosProntoPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProntoPago;
	//protected JButton jButtonCerrarReporteDinamicoProntoPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoProntoPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionProntoPago;
	//protected JButton jButtonGenerarImportacionProntoPago;
	//protected JButton jButtonCerrarImportacionProntoPago;
	//protected JFileChooser jFileChooserImportacionProntoPago;
	//protected File fileImportacionProntoPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProntoPago;
	protected JButton jButtonDuplicarToolBarProntoPago;
	protected JButton jButtonNuevoRelacionesToolBarProntoPago;
	
	
	public JButton jButtonGuardarCambiosToolBarProntoPago;
	protected JButton jButtonCopiarToolBarProntoPago;
	protected JButton jButtonVerFormToolBarProntoPago;
	public JButton jButtonGuardarCambiosTablaToolBarProntoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarProntoPago;
	protected JButton jButtonCerrarToolBarProntoPago;
	
	protected JButton jButtonRecargarInformacionToolBarProntoPago;
	protected JButton jButtonProcesarInformacionToolBarProntoPago;
	protected JButton jButtonAnterioresToolBarProntoPago;
	protected JButton jButtonSiguientesToolBarProntoPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarProntoPago;
	protected JButton jButtonAbrirOrderByToolBarProntoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProntoPago;
	protected JMenuItem jMenuItemDuplicarProntoPago;
	protected JMenuItem jMenuItemNuevoRelacionesProntoPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProntoPago;
	protected JMenuItem jMenuItemCopiarProntoPago;
	protected JMenuItem jMenuItemVerFormProntoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaProntoPago;
	protected JMenuItem jMenuItemCerrarProntoPago;
	protected JMenuItem jMenuItemDetalleCerrarProntoPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProntoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarProntoPago;
	
	protected JMenuItem jMenuItemRecargarInformacionProntoPago;
	protected JMenuItem jMenuItemProcesarInformacionProntoPago;
	protected JMenuItem jMenuItemAnterioresProntoPago;
	protected JMenuItem jMenuItemSiguientesProntoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProntoPago;
	protected JMenuItem jMenuItemAbrirOrderByProntoPago;
	protected JMenuItem jMenuItemMostrarOcultarProntoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProntoPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProntoPago;
	protected JCheckBox jCheckBoxSeleccionadosProntoPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProntoPago;
	protected JCheckBox jCheckBoxConGraficoReporteProntoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProntoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProntoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProntoPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProntoPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProntoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProntoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProntoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProntoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProntoPago;
	protected JTextField jTextFieldValorCampoGeneralProntoPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProntoPago;
	//public JList<Reporte> jListColumnasSelectReporteProntoPago;
	//public JScrollPane jScrollColumnasSelectReporteProntoPago;
	
	//public JLabel jLabelRelacionesSelectReporteProntoPago;
	//public JList<Reporte> jListRelacionesSelectReporteProntoPago;
	//public JScrollPane jScrollRelacionesSelectReporteProntoPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProntoPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProntoPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProntoPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoProntoPago;
	
		
	//public JLabel jLabelArchivoImportacionProntoPago;	
	//public JLabel jLabelPathArchivoImportacionProntoPago;
	//protected JTextField jTextFieldPathArchivoImportacionProntoPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProntoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProntoPago;
	
	//public JLabel jLabelColumnaCategoriaValorProntoPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProntoPago;
	
	//public JLabel jLabelColumnasValoresGraficoProntoPago;
	//public JList<Reporte> jListColumnasValoresGraficoProntoPago;
	//public JScrollPane jScrollColumnasValoresGraficoProntoPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProntoPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProntoPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProntoPago;
	
	
	
	
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
	public ProntoPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProntoPago)	{
		this.jButtonRecargarInformacionProntoPago = jButtonRecargarInformacionProntoPago;
	}
	
	public JButton getjButtonProcesarInformacionProntoPago() {
		return this.jButtonProcesarInformacionProntoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProntoPago)	{
		this.jButtonProcesarInformacionProntoPago = jButtonProcesarInformacionProntoPago;
	}
	
	
	public JButton getjButtonRecargarInformacionProntoPago() {
		return this.jButtonRecargarInformacionProntoPago;
	}
	
	
	public List<ProntoPago> getprontopagos() {
		return this.prontopagos;
	}

	public void setprontopagos(List<ProntoPago> prontopagos) {
		this.prontopagos = prontopagos;
	}
	
	public List<ProntoPago> getprontopagosAux() {
		return this.prontopagosAux;
	}

	public void setprontopagosAux(List<ProntoPago> prontopagosAux) {
		this.prontopagosAux = prontopagosAux;
	}
	
	public List<ProntoPago> getprontopagosEliminados() {
		return this.prontopagosEliminados;
	}

	public void setProntoPagosEliminados(List<ProntoPago> prontopagosEliminados) {
		this.prontopagosEliminados = prontopagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProntoPago() {
		return jComboBoxTiposSeleccionarProntoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProntoPago(
			JComboBox jComboBoxTiposSeleccionarProntoPago) {
		this.jComboBoxTiposSeleccionarProntoPago = jComboBoxTiposSeleccionarProntoPago;
	}
	
	public void setBorderResaltarTiposSeleccionarProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProntoPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProntoPago() {
		return jTextFieldValorCampoGeneralProntoPago;
	}

	public void setjTextFieldValorCampoGeneralProntoPago(
			JTextField jTextFieldValorCampoGeneralProntoPago) {
		this.jTextFieldValorCampoGeneralProntoPago = jTextFieldValorCampoGeneralProntoPago;
	}

	public void setBorderResaltarValorCampoGeneralProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProntoPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProntoPago() {
		return this.jCheckBoxSeleccionarTodosProntoPago;
	}

	public void setjCheckBoxSeleccionarTodosProntoPago(
			JCheckBox jCheckBoxSeleccionarTodosProntoPago) {
		this.jCheckBoxSeleccionarTodosProntoPago = jCheckBoxSeleccionarTodosProntoPago;
	}

	public void setBorderResaltarSeleccionarTodosProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProntoPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProntoPago() {
		return this.jCheckBoxSeleccionadosProntoPago;
	}

	public void setjCheckBoxSeleccionadosProntoPago(
			JCheckBox jCheckBoxSeleccionadosProntoPago) {
		this.jCheckBoxSeleccionadosProntoPago = jCheckBoxSeleccionadosProntoPago;
	}
	
	public void setBorderResaltarSeleccionadosProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProntoPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProntoPago() {
		return this.jComboBoxTiposArchivosReportesProntoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProntoPago(
			JComboBox jComboBoxTiposArchivosReportesProntoPago) {
		this.jComboBoxTiposArchivosReportesProntoPago = jComboBoxTiposArchivosReportesProntoPago;
	}

	public void setBorderResaltarTiposArchivosReportesProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProntoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProntoPago() {
		return this.jComboBoxTiposReportesProntoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProntoPago(
			JComboBox jComboBoxTiposReportesProntoPago) {
		this.jComboBoxTiposReportesProntoPago = jComboBoxTiposReportesProntoPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProntoPago() {
	//	return jComboBoxTiposReportesDinamicoProntoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProntoPago(
	//		JComboBox jComboBoxTiposReportesDinamicoProntoPago) {
	//	this.jComboBoxTiposReportesDinamicoProntoPago = jComboBoxTiposReportesDinamicoProntoPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProntoPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoProntoPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProntoPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProntoPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProntoPago = jComboBoxTiposArchivosReportesDinamicoProntoPago;
	//}
	
	public void setBorderResaltarTiposReportesProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProntoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProntoPago() {
		return this.jComboBoxTiposGraficosReportesProntoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProntoPago(
			JComboBox jComboBoxTiposGraficosReportesProntoPago) {
		this.jComboBoxTiposGraficosReportesProntoPago = jComboBoxTiposGraficosReportesProntoPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProntoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProntoPago() {
		return this.jComboBoxTiposPaginacionProntoPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProntoPago(
			JComboBox jComboBoxTiposPaginacionProntoPago) {
		this.jComboBoxTiposPaginacionProntoPago = jComboBoxTiposPaginacionProntoPago;
	}
	
	public void setBorderResaltarTiposPaginacionProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProntoPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProntoPago() {
		return this.jComboBoxTiposRelacionesProntoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProntoPago() {
		return this.jComboBoxTiposAccionesProntoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProntoPago(
			JComboBox jComboBoxTiposRelacionesProntoPago) {
		this.jComboBoxTiposRelacionesProntoPago = jComboBoxTiposRelacionesProntoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProntoPago(
			JComboBox jComboBoxTiposAccionesProntoPago) {
		this.jComboBoxTiposAccionesProntoPago = jComboBoxTiposAccionesProntoPago;
	}
	
	public void setBorderResaltarTiposRelacionesProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProntoPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProntoPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProntoPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProntoPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProntoPago() {
	//	return jCheckBoxConGraficoDinamicoProntoPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoProntoPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoProntoPago) {
	//	this.jCheckBoxConGraficoDinamicoProntoPago = jCheckBoxConGraficoDinamicoProntoPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProntoPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProntoPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProntoPago .setBorder(borderResaltar);		
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
		this.prontopagoSessionBean=new ProntoPagoSessionBean();
		
		this.prontopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prontopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prontopagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProntoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pronto Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProntoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProntoPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProntoPago,this.jTtoolBarProntoPago,
							"nuevo","nuevo","Nuevo"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProntoPago,this.jTtoolBarProntoPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProntoPago,this.jTtoolBarProntoPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProntoPago,this.jTtoolBarProntoPago,
							"duplicar","duplicar","Duplicar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProntoPago,this.jTtoolBarProntoPago,
							"copiar","copiar","Copiar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProntoPago,this.jTtoolBarProntoPago,
							"ver_form","ver_form","Ver"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProntoPago,this.jTtoolBarProntoPago,
							"recargar","recargar","Recargar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProntoPago,this.jTtoolBarProntoPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProntoPago,this.jTtoolBarProntoPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProntoPago,this.jTtoolBarProntoPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProntoPago,this.jTtoolBarProntoPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProntoPago,this.jTtoolBarProntoPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProntoPago,this.jTtoolBarProntoPago,
							"cerrar","cerrar","Salir"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProntoPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProntoPago;
			
				this.jButtonProcesarInformacionToolBarProntoPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProntoPago;
				
		//protected JButton jButtonModificarToolBarProntoPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProntoPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProntoPago=new JMenuMe("General");
		this.jmenuArchivoProntoPago=new JMenuMe("Archivo");
		this.jmenuAccionesProntoPago=new JMenuMe("Acciones");
		this.jmenuDatosProntoPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProntoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProntoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProntoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProntoPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProntoPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProntoPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProntoPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProntoPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProntoPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProntoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProntoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProntoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProntoPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProntoPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProntoPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProntoPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProntoPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProntoPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProntoPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProntoPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProntoPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProntoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProntoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProntoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProntoPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProntoPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProntoPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProntoPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProntoPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProntoPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProntoPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProntoPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProntoPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProntoPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProntoPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProntoPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProntoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProntoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProntoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProntoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProntoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProntoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProntoPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProntoPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProntoPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProntoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProntoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProntoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProntoPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProntoPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProntoPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProntoPago.add(this.jMenuItemCerrarProntoPago);
			
			this.jmenuAccionesProntoPago.add(this.jMenuItemNuevoProntoPago);
			this.jmenuAccionesProntoPago.add(this.jMenuItemNuevoGuardarCambiosProntoPago);
			this.jmenuAccionesProntoPago.add(this.jMenuItemNuevoRelacionesProntoPago);
			this.jmenuAccionesProntoPago.add(this.jMenuItemGuardarCambiosTablaProntoPago);		
			this.jmenuAccionesProntoPago.add(this.jMenuItemDuplicarProntoPago);		
			this.jmenuAccionesProntoPago.add(this.jMenuItemCopiarProntoPago);		
			this.jmenuAccionesProntoPago.add(this.jMenuItemVerFormProntoPago);		
			
			this.jmenuDatosProntoPago.add(this.jMenuItemRecargarInformacionProntoPago);				
			this.jmenuDatosProntoPago.add(this.jMenuItemAnterioresProntoPago);				
			this.jmenuDatosProntoPago.add(this.jMenuItemSiguientesProntoPago);				
			this.jmenuDatosProntoPago.add(this.jMenuItemAbrirOrderByProntoPago);				
			this.jmenuDatosProntoPago.add(this.jMenuItemMostrarOcultarProntoPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProntoPago.add(this.jMenuItemGuardarCambiosProntoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProntoPago.add(this.jmenuArchivoProntoPago);		
			this.jmenuBarProntoPago.add(this.jmenuAccionesProntoPago);		
			this.jmenuBarProntoPago.add(this.jmenuDatosProntoPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProntoPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProntoPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasProntoPago=new JTabbedPane();


		this.jTabbedPaneBusquedasProntoPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProntoPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProntoPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProntoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProntoPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProntoPago = new ProntoPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pronto Pago DATOS");
			this.jInternalFrameDetalleFormProntoPago = new ProntoPagoDetalleFormJInternalFrame(jDesktopPane,this.prontopagoSessionBean.getConGuardarRelaciones(),this.prontopagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProntoPago = null;//new ProntoPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProntoPago= new GridBagLayout();
		
		
		this.jTableDatosProntoPago = new JTableMe();      
		
		String sToolTipProntoPago="";
		sToolTipProntoPago=ProntoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProntoPago+="(PuntoVenta.ProntoPago)";
		}
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProntoPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProntoPago.setToolTipText(sToolTipProntoPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProntoPago);
		this.jTableDatosProntoPago.setAutoCreateRowSorter(true);
		this.jTableDatosProntoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProntoPago.setRowSelectionAllowed(true);
		this.jTableDatosProntoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProntoPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProntoPago = new JButtonMe();
		this.jButtonDuplicarProntoPago = new JButtonMe();
		this.jButtonCopiarProntoPago = new JButtonMe();
		this.jButtonVerFormProntoPago = new JButtonMe();
		this.jButtonNuevoRelacionesProntoPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProntoPago = new JButtonMe();
		this.jButtonCerrarProntoPago = new JButtonMe();
		
		this.jScrollPanelDatosProntoPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralProntoPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pronto Pago";
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosProntoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProntoPago.setToolTipText("Acciones");
        this.jPanelAccionesProntoPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProntoPago=new ReporteDinamicoJInternalFrame(ProntoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProntoPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProntoPago=new ImportacionJInternalFrame(ProntoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProntoPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProntoPago = new JButtonMe();
		
		this.jButtonAbrirOrderByProntoPago.setText("Orden");
		this.jButtonAbrirOrderByProntoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProntoPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProntoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProntoPago,false,this);
			
			//this.cargarOrderByProntoPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProntoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProntoPago,true,this);
			
			//this.cargarOrderByProntoPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProntoPago.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosProntoPago.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosProntoPago.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosProntoPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProntoPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProntoPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProntoPago.setText("Nuevo");
		this.jButtonDuplicarProntoPago.setText("Duplicar");
		this.jButtonCopiarProntoPago.setText("Copiar");
		this.jButtonVerFormProntoPago.setText("Ver");
		this.jButtonNuevoRelacionesProntoPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProntoPago.setText("Guardar");
		this.jButtonCerrarProntoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProntoPago,"nuevo_button","Nuevo",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProntoPago,"duplicar_button","Duplicar",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProntoPago,"copiar_button","Copiar",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProntoPago,"ver_form","Ver",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProntoPago,"nuevorelaciones_button","Nuevo Rel",this.prontopagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProntoPago,"guardarcambiostabla_button","Guardar",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProntoPago,"cerrar_button","Salir",this.prontopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProntoPago.setToolTipText("Nuevo"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProntoPago.setToolTipText("Duplicar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProntoPago.setToolTipText("Copiar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProntoPago.setToolTipText("Ver"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProntoPago.setToolTipText("Nuevo Rel"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProntoPago.setToolTipText("Guardar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProntoPago.setToolTipText("Salir"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProntoPago";
		inputMap = this.jButtonNuevoProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProntoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProntoPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarProntoPago";
		inputMap = this.jButtonDuplicarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProntoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProntoPago"));
		
		//COPIAR
		sMapKey = "CopiarProntoPago";
		inputMap = this.jButtonCopiarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProntoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProntoPago"));
		
		//VEr FORM
		sMapKey = "VerFormProntoPago";
		inputMap = this.jButtonVerFormProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProntoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProntoPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProntoPago";
		inputMap = this.jButtonNuevoRelacionesProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProntoPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProntoPago";
		inputMap = this.jButtonModificarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProntoPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProntoPago";
		inputMap = this.jButtonCerrarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProntoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProntoPago";
		inputMap = this.jButtonGuardarCambiosTablaProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProntoPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProntoPago.setName("jPanelParametrosReportesProntoPago"); 
		
		this.jPanelParametrosReportesAccionesProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProntoPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProntoPago.setName("jPanelParametrosReportesAccionesProntoPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProntoPago = new JButtonMe();
		this.jButtonRecargarInformacionProntoPago.setText("Recargar");
		this.jButtonRecargarInformacionProntoPago.setToolTipText("Recargar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProntoPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProntoPago = new JButtonMe();
		this.jButtonProcesarInformacionProntoPago.setText("Procesar");
		this.jButtonProcesarInformacionProntoPago.setToolTipText("Procesar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProntoPago.setVisible(false);
			
		this.jButtonProcesarInformacionProntoPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProntoPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProntoPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProntoPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProntoPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProntoPago.setText("TIPO");       
		this.jComboBoxTiposReportesProntoPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProntoPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProntoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProntoPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionProntoPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProntoPago.setText("Accion");
		this.jComboBoxTiposRelacionesProntoPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProntoPago.setText("Accion");
		this.jComboBoxTiposAccionesProntoPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProntoPago.setText("Accion");
		this.jComboBoxTiposSeleccionarProntoPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProntoPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProntoPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProntoPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProntoPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProntoPago = new JLabelMe();
		
		this.jLabelAccionesProntoPago.setText("Acciones");		
		this.jLabelAccionesProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProntoPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProntoPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProntoPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProntoPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProntoPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProntoPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProntoPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProntoPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProntoPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProntoPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProntoPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteProntoPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProntoPago = new JButtonMe();
		//this.jButtonAnterioresProntoPago.setText("<<");
        this.jButtonAnterioresProntoPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProntoPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProntoPago = new JButtonMe();
		//this.jButtonSiguientesProntoPago.setText(">>");
        this.jButtonSiguientesProntoPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProntoPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProntoPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProntoPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosProntoPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProntoPago,"nuevoguardarcambios_button","Nue",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProntoPago";
		inputMap = this.jButtonNuevoGuardarCambiosProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProntoPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProntoPago";
		inputMap = this.jButtonRecargarInformacionProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProntoPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProntoPago";
		inputMap = this.jButtonSiguientesProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProntoPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProntoPago";
		inputMap = this.jButtonAnterioresProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProntoPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProntoPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProntoPago.setMinimumSize(new Dimension(this.getWidth(),ProntoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProntoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProntoPago.setMaximumSize(new Dimension(this.getWidth(),ProntoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProntoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProntoPago.setPreferredSize(new Dimension(this.getWidth(),ProntoPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProntoPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProntoPago = new GridBagLayout();

			this.jPanelPaginacionProntoPago.setLayout(gridaBagLayoutPaginacionProntoPago);						
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 0;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProntoPago.add(this.jButtonAnterioresProntoPago, this.gridBagConstraintsProntoPago);
					
						
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProntoPago.gridy = 0;
			
			this.jPanelPaginacionProntoPago.add(this.jButtonNuevoGuardarCambiosProntoPago, this.gridBagConstraintsProntoPago);
						
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProntoPago.gridy = 0;
			this.jPanelPaginacionProntoPago.add(this.jButtonSiguientesProntoPago, this.gridBagConstraintsProntoPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 1;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProntoPago.add(this.jButtonNuevoProntoPago, this.gridBagConstraintsProntoPago);
						
			
			
			if(!this.prontopagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProntoPago = new GridBagConstraints();
				this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProntoPago.gridy = 1;
				this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProntoPago.add(this.jButtonGuardarCambiosTablaProntoPago, this.gridBagConstraintsProntoPago);
			}
			
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 1;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProntoPago.add(this.jButtonDuplicarProntoPago, this.gridBagConstraintsProntoPago);
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 1;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProntoPago.add(this.jButtonCopiarProntoPago, this.gridBagConstraintsProntoPago);
		
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 1;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProntoPago.add(this.jButtonVerFormProntoPago, this.gridBagConstraintsProntoPago);
		
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 1;
			this.gridBagConstraintsProntoPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProntoPago.add(this.jButtonCerrarProntoPago, this.gridBagConstraintsProntoPago);
		
		
		
		this.jButtonRecargarInformacionProntoPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProntoPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProntoPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProntoPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProntoPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProntoPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProntoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProntoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProntoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProntoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProntoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProntoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProntoPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProntoPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProntoPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProntoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProntoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProntoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProntoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProntoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProntoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProntoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProntoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProntoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProntoPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProntoPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProntoPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProntoPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProntoPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProntoPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProntoPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProntoPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProntoPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProntoPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProntoPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProntoPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProntoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProntoPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProntoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProntoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProntoPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProntoPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProntoPago.setLayout(gridaBagParametrosReportesProntoPago);
			this.jPanelParametrosReportesAccionesProntoPago.setLayout(gridaBagParametrosReportesAccionesProntoPago);
			
			
			this.jPanelParametrosAuxiliar1ProntoPago.setLayout(gridaBagParametrosAuxiliar1ProntoPago);
			this.jPanelParametrosAuxiliar2ProntoPago.setLayout(gridaBagParametrosAuxiliar2ProntoPago);
			this.jPanelParametrosAuxiliar3ProntoPago.setLayout(gridaBagParametrosAuxiliar3ProntoPago);
			this.jPanelParametrosAuxiliar4ProntoPago.setLayout(gridaBagParametrosAuxiliar4ProntoPago);
			//this.jPanelParametrosAuxiliar5ProntoPago.setLayout(gridaBagParametrosAuxiliar2ProntoPago);			
			
			
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProntoPago.add(this.jButtonRecargarInformacionProntoPago, this.gridBagConstraintsProntoPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProntoPago.add(this.jComboBoxTiposPaginacionProntoPago, this.gridBagConstraintsProntoPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProntoPago.add(this.jCheckBoxConAltoMaximoTablaProntoPago, this.gridBagConstraintsProntoPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProntoPago.add(this.jComboBoxTiposArchivosReportesProntoPago, this.gridBagConstraintsProntoPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProntoPago.add(this.jPanelParametrosAuxiliar1ProntoPago, this.gridBagConstraintsProntoPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProntoPago.add(this.jComboBoxTiposReportesProntoPago, this.gridBagConstraintsProntoPago);																		
			
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProntoPago.add(this.jComboBoxTiposGraficosReportesProntoPago, this.gridBagConstraintsProntoPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProntoPago.add(this.jPanelParametrosAuxiliar4ProntoPago, this.gridBagConstraintsProntoPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProntoPago.add(this.jComboBoxTiposReportesProntoPago, this.gridBagConstraintsProntoPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProntoPago.add(this.jCheckBoxGenerarReporteProntoPago, this.gridBagConstraintsProntoPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProntoPago.add(this.jPanelParametrosAuxiliar2ProntoPago, this.gridBagConstraintsProntoPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProntoPago.add(this.jLabelAccionesProntoPago, this.gridBagConstraintsProntoPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProntoPago = new GridBagConstraints();
				this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProntoPago.add(this.jButtonAbrirOrderByProntoPago, this.gridBagConstraintsProntoPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProntoPago.add(this.jComboBoxTiposSeleccionarProntoPago, this.gridBagConstraintsProntoPago);			
			
			
			/*
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProntoPago.add(this.jCheckBoxSeleccionarTodosProntoPago, this.gridBagConstraintsProntoPago);
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProntoPago.add(this.jCheckBoxConGraficoReporteProntoPago, this.gridBagConstraintsProntoPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProntoPago.add(this.jCheckBoxSeleccionarTodosProntoPago, this.gridBagConstraintsProntoPago);															
				
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProntoPago.add(this.jCheckBoxSeleccionadosProntoPago, this.gridBagConstraintsProntoPago);															
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProntoPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProntoPago.add(this.jCheckBoxConGraficoReporteProntoPago, this.gridBagConstraintsProntoPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProntoPago.add(this.jPanelParametrosAuxiliar3ProntoPago, this.gridBagConstraintsProntoPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProntoPago.add(this.jComboBoxTiposAccionesProntoPago, this.gridBagConstraintsProntoPago);
	
				
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProntoPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProntoPago.add(this.jTextFieldValorCampoGeneralProntoPago, this.gridBagConstraintsProntoPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProntoPago = new GridBagLayout();

			this.jScrollPanelDatosProntoPago.setLayout(gridaBagLayoutDatosProntoPago);
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = 0;
			this.gridBagConstraintsProntoPago.gridx = 0;
			
			this.jScrollPanelDatosProntoPago.add(this.jTableDatosProntoPago, this.gridBagConstraintsProntoPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProntoPago.setViewportView(this.jTableDatosProntoPago);
		this.jTableDatosProntoPago.setFillsViewportHeight(true);
		this.jTableDatosProntoPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProntoPago= new GridBagLayout();
		this.jPanelAccionesProntoPago.setLayout(gridaBagLayoutAccionesProntoPago);
		
		
		/*	
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 0;
			
		this.jPanelAccionesProntoPago.add(this.jButtonNuevoProntoPago, this.gridBagConstraintsProntoPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProntoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProntoPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProntoPago = new GridBagConstraints();						
			this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProntoPago.gridx = 0;		
			//this.gridBagConstraintsProntoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProntoPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProntoPago, this.gridBagConstraintsProntoPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProntoPago.gridx = 0;		
		//this.gridBagConstraintsProntoPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProntoPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProntoPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProntoPago, this.gridBagConstraintsProntoPago);								
		
		
		/*
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProntoPago, this.gridBagConstraintsProntoPago);
		*/		
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProntoPago.gridx =0;
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProntoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProntoPago, this.gridBagConstraintsProntoPago);
				
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProntoPago, this.gridBagConstraintsProntoPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProntoPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProntoPago = new GridBagLayout();
			this.jPanelBusquedasParametrosProntoPago.setLayout(gridaBagLayoutBusquedasParametrosProntoPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProntoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProntoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProntoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProntoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProntoPago, this.gridBagConstraintsProntoPago);
			
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProntoPago, this.gridBagConstraintsProntoPago);
		
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProntoPago, this.gridBagConstraintsProntoPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProntoPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProntoPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProntoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProntoPago.setName("jPanelReporteDinamicoProntoPago"); 
		
		this.jPanelReporteDinamicoProntoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProntoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProntoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProntoPago.setLayout(gridaBagLayoutReporteDinamicoProntoPago);
		
		
		this.jInternalFrameReporteDinamicoProntoPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProntoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProntoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProntoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProntoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProntoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProntoPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProntoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProntoPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoProntoPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoProntoPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProntoPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProntoPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProntoPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProntoPago = new JLabelMe();

		this.jLabelColumnasSelectReporteProntoPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelColumnasSelectReporteProntoPago, this.gridBagConstraintsProntoPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProntoPago = new JList<Reporte>();
		this.jListColumnasSelectReporteProntoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProntoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProntoPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProntoPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProntoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProntoPago=new JScrollPane(this.jListColumnasSelectReporteProntoPago);
			
			this.jScrollColumnasSelectReporteProntoPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProntoPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProntoPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProntoPago.add(this.jListColumnasSelectReporteProntoPago, this.gridBagConstraintsProntoPago);
		this.jPanelReporteDinamicoProntoPago.add(this.jScrollColumnasSelectReporteProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProntoPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteProntoPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProntoPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteProntoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProntoPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProntoPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProntoPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProntoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProntoPago=new JScrollPane(this.jListRelacionesSelectReporteProntoPago);
			
			this.jScrollRelacionesSelectReporteProntoPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProntoPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProntoPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProntoPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProntoPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoProntoPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProntoPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProntoPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProntoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProntoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProntoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProntoPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProntoPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProntoPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProntoPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProntoPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProntoPago = new JLabelMe();

		this.jLabelConGraficoDinamicoProntoPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelConGraficoDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProntoPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProntoPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProntoPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProntoPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProntoPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProntoPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jCheckBoxConGraficoDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProntoPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProntoPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelColumnaCategoriaGraficoProntoPago, this.gridBagConstraintsProntoPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProntoPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProntoPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProntoPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProntoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProntoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProntoPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProntoPago.add(this.jComboBoxColumnaCategoriaGraficoProntoPago, this.gridBagConstraintsProntoPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProntoPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorProntoPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelColumnaCategoriaValorProntoPago, this.gridBagConstraintsProntoPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProntoPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProntoPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProntoPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProntoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProntoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProntoPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProntoPago.add(this.jComboBoxColumnaCategoriaValorProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProntoPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoProntoPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelColumnasValoresGraficoProntoPago, this.gridBagConstraintsProntoPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProntoPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoProntoPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProntoPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProntoPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProntoPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProntoPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProntoPago=new JScrollPane(this.jListColumnasValoresGraficoProntoPago);
			
			this.jScrollColumnasValoresGraficoProntoPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProntoPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProntoPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProntoPago.add(this.jListColumnasSelectReporteProntoPago, this.gridBagConstraintsProntoPago);
		this.jPanelReporteDinamicoProntoPago.add(this.jScrollColumnasValoresGraficoProntoPago, this.gridBagConstraintsProntoPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProntoPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProntoPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelTiposGraficosReportesDinamicoProntoPago, this.gridBagConstraintsProntoPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProntoPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProntoPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProntoPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProntoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProntoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProntoPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jComboBoxTiposGraficosReportesDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProntoPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProntoPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelGenerarExcelReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProntoPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProntoPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProntoPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProntoPago.setToolTipText("Generar EXCEL"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProntoPago.add(this.jButtonGenerarExcelReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProntoPago.add(this.jComboBoxTiposReportesDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProntoPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProntoPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProntoPago.add(this.jLabelTiposArchivoReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProntoPago.add(this.jComboBoxTiposArchivosReportesDinamicoProntoPago, this.gridBagConstraintsProntoPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProntoPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProntoPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProntoPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProntoPago.setToolTipText("Generar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProntoPago.add(this.jButtonGenerarReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProntoPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProntoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProntoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProntoPago.setToolTipText("Cancelar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProntoPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProntoPago.add(this.jButtonCerrarReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProntoPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProntoPago= new JScrollPane(jPanelReporteDinamicoProntoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProntoPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProntoPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProntoPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProntoPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProntoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProntoPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProntoPago);
		this.jInternalFrameReporteDinamicoProntoPago.getContentPane().add(this.jScrollPanelReporteDinamicoProntoPago, this.gridBagConstraintsProntoPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProntoPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProntoPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProntoPago.setName("jPanelImportacionProntoPago"); 
		
		this.jPanelImportacionProntoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProntoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProntoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProntoPago.setLayout(gridaBagLayoutImportacionProntoPago);
		
		
		this.jInternalFrameImportacionProntoPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProntoPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProntoPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProntoPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProntoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProntoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProntoPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProntoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProntoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProntoPago.setResizable(true);
	    this.jInternalFrameImportacionProntoPago.setClosable(true);
	    this.jInternalFrameImportacionProntoPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProntoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProntoPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProntoPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProntoPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProntoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProntoPago.setResizable(true);
	    this.jInternalFrameImportacionProntoPago.setClosable(true);
	    this.jInternalFrameImportacionProntoPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProntoPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProntoPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProntoPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProntoPago = new JLabelMe();

		this.jLabelArchivoImportacionProntoPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProntoPago.add(this.jLabelArchivoImportacionProntoPago, this.gridBagConstraintsProntoPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProntoPago = new JFileChooser();		
		this.jFileChooserImportacionProntoPago.setToolTipText("ESCOGER ARCHIVO"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProntoPago = new JButtonMe();
		this.jButtonAbrirImportacionProntoPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProntoPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProntoPago.setToolTipText("Generar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProntoPago.add(this.jButtonAbrirImportacionProntoPago, this.gridBagConstraintsProntoPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProntoPago = new JLabelMe();

		this.jLabelPathArchivoImportacionProntoPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProntoPago.add(this.jLabelPathArchivoImportacionProntoPago, this.gridBagConstraintsProntoPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProntoPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProntoPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProntoPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProntoPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProntoPago.add(this.jTextFieldPathArchivoImportacionProntoPago, this.gridBagConstraintsProntoPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProntoPago = new JButtonMe();
		this.jButtonGenerarImportacionProntoPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProntoPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProntoPago.setToolTipText("Generar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProntoPago.add(this.jButtonGenerarImportacionProntoPago, this.gridBagConstraintsProntoPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProntoPago = new JButtonMe();
		this.jButtonCerrarImportacionProntoPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProntoPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProntoPago.setToolTipText("Cancelar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = iPosYImportacion;
		this.gridBagConstraintsProntoPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProntoPago.add(this.jButtonCerrarImportacionProntoPago, this.gridBagConstraintsProntoPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProntoPago = new GridBagLayout();
		
		this.jScrollPanelImportacionProntoPago= new JScrollPane(jPanelImportacionProntoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iPosYImportacion;
		this.gridBagConstraintsProntoPago.gridx =iPosXImportacion;
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProntoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProntoPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProntoPago);
		this.jInternalFrameImportacionProntoPago.getContentPane().add(this.jScrollPanelImportacionProntoPago, this.gridBagConstraintsProntoPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProntoPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProntoPago = new JButtonMe();
			this.jButtonAbrirOrderByProntoPago.setText("Orden");
			this.jButtonAbrirOrderByProntoPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProntoPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProntoPago";
			inputMap = this.jButtonAbrirOrderByProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProntoPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByProntoPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProntoPago.setName("jPanelOrderByProntoPago"); 
			
			this.jPanelOrderByProntoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProntoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProntoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProntoPago.setLayout(gridaBagLayoutOrderByProntoPago);
			
			
			this.jTableDatosProntoPagoOrderBy = new JTableMe();        
			this.jTableDatosProntoPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProntoPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProntoPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProntoPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProntoPagoOrderBy.setViewportView(this.jTableDatosProntoPagoOrderBy);
			this.jTableDatosProntoPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProntoPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProntoPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProntoPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProntoPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProntoPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProntoPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProntoPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProntoPago.setTitle("Orden");
			this.jInternalFrameOrderByProntoPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProntoPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProntoPago.setResizable(true);
			this.jInternalFrameOrderByProntoPago.setClosable(true);
			this.jInternalFrameOrderByProntoPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProntoPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProntoPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProntoPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProntoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProntoPago.ipady =150;
				
			this.jPanelOrderByProntoPago.add(jScrollPanelDatosProntoPagoOrderBy, this.gridBagConstraintsProntoPago);//this.jTableDatosProntoPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProntoPago = new JButtonMe();
			this.jButtonCerrarOrderByProntoPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProntoPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProntoPago.setToolTipText("Cancelar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProntoPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProntoPago.add(this.jButtonCerrarOrderByProntoPago, this.gridBagConstraintsProntoPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProntoPago = new GridBagLayout();
			
			this.jScrollPanelOrderByProntoPago= new JScrollPane(jPanelOrderByProntoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsProntoPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProntoPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProntoPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProntoPago);
			
			this.jInternalFrameOrderByProntoPago.getContentPane().add(this.jScrollPanelOrderByProntoPago, this.gridBagConstraintsProntoPago);			
		
		} else {
			this.jButtonAbrirOrderByProntoPago = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.prontopagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProntoPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProntoPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProntoPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProntoPago.getRowHeight();//ProntoPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProntoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProntoPago.isSelected()) {
					iHeightTable=ProntoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProntoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProntoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProntoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProntoPago.isSelected()) {
					iHeightTable=ProntoPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProntoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProntoPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProntoPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProntoPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProntoPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProntoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProntoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProntoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProntoPago!=null && this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy()!=null) {
			//if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProntoPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProntoPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProntoPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProntoPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProntoPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProntoPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProntoPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=prontopagoLogic.getProntoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prontopagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProntoPago> TraerProntoPagoBeans(List<ProntoPago> prontopagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProntoPago prontopago:prontopagos) {
					
				if(!(ProntoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProntoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					prontopago.setsDetalleGeneralEntityReporte(ProntoPagoConstantesFunciones.getProntoPagoDescripcion(prontopago));
										
						
					
						
					
				} else  {
							
					//prontopago.setsDetalleGeneralEntityReporte(prontopago.getsDetalleGeneralEntityReporte());
										
				}
				
				//prontopagobeans.add(prontopagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return prontopagos;
    }
	//PARA REPORTES FIN
}
