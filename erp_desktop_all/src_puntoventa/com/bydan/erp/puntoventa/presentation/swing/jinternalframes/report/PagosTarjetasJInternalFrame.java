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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.PagosTarjetasConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class PagosTarjetasJInternalFrame extends PagosTarjetasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPagosTarjetas;
	
	protected JMenuBar jmenuBarPagosTarjetas;
	
	protected JMenu jmenuPagosTarjetas;
	protected JMenu jmenuDatosPagosTarjetas;
	protected JMenu jmenuArchivoPagosTarjetas;
	protected JMenu jmenuAccionesPagosTarjetas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosTarjetas;	
	protected GridBagConstraints gridBagConstraintsPagosTarjetas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PagosTarjetasDetalleFormJInternalFrame jInternalFrameDetalleFormPagosTarjetas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPagosTarjetas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPagosTarjetas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosTarjetasSessionBean pagostarjetasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PagosTarjetas> pagostarjetass;		
	public List<PagosTarjetas> pagostarjetassEliminados;	
	public List<PagosTarjetas> pagostarjetassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPagosTarjetas;		
	protected JButton jButtonAbrirOrderByPagosTarjetas;
	
	
	//protected JPanel jPanelOrderByPagosTarjetas;
	//public JScrollPane jScrollPanelOrderByPagosTarjetas;	
	//protected JButton jButtonCerrarOrderByPagosTarjetas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PagosTarjetasLogic pagostarjetasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPagosTarjetas;
	public JScrollPane jScrollPanelDatosEdicionPagosTarjetas;
	public JScrollPane jScrollPanelDatosGeneralPagosTarjetas;
    
	
	
	//public JScrollPane jScrollPanelDatosPagosTarjetasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPagosTarjetas;
	//public JScrollPane jScrollPanelImportacionPagosTarjetas;
	
	
	
	protected JPanel jPanelAccionesPagosTarjetas;
	
    protected JPanel jPanelPaginacionPagosTarjetas;
    protected JPanel jPanelParametrosReportesPagosTarjetas;
	protected JPanel jPanelParametrosReportesAccionesPagosTarjetas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PagosTarjetas;
	protected JPanel jPanelParametrosAuxiliar2PagosTarjetas;
	protected JPanel jPanelParametrosAuxiliar3PagosTarjetas;
	protected JPanel jPanelParametrosAuxiliar4PagosTarjetas;
	//protected JPanel jPanelParametrosAuxiliar5PagosTarjetas;
	
	
	
	//protected JPanel jPanelReporteDinamicoPagosTarjetas;
	//protected JPanel jPanelImportacionPagosTarjetas;
	
	
	public JTable jTableDatosPagosTarjetas;
	
	
	
	//public JTable jTableDatosPagosTarjetasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPagosTarjetas;
	protected JButton jButtonDuplicarPagosTarjetas;
	protected JButton jButtonCopiarPagosTarjetas;
	protected JButton jButtonVerFormPagosTarjetas;
	protected JButton jButtonNuevoRelacionesPagosTarjetas;
	protected JButton jButtonModificarPagosTarjetas;
	
    protected JButton jButtonGuardarCambiosTablaPagosTarjetas;
	protected JButton jButtonCerrarPagosTarjetas;
	
	
	protected JButton jButtonRecargarInformacionPagosTarjetas;
	protected JButton jButtonProcesarInformacionPagosTarjetas;
	
	
	protected JButton jButtonAnterioresPagosTarjetas;
	protected JButton jButtonSiguientesPagosTarjetas;
	protected JButton jButtonNuevoGuardarCambiosPagosTarjetas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPagosTarjetas;
	//protected JButton jButtonCerrarReporteDinamicoPagosTarjetas;
	//protected JButton jButtonGenerarExcelReporteDinamicoPagosTarjetas;	
	
	
	
	//protected JButton jButtonAbrirImportacionPagosTarjetas;
	//protected JButton jButtonGenerarImportacionPagosTarjetas;
	//protected JButton jButtonCerrarImportacionPagosTarjetas;
	//protected JFileChooser jFileChooserImportacionPagosTarjetas;
	//protected File fileImportacionPagosTarjetas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosTarjetas;
	protected JButton jButtonDuplicarToolBarPagosTarjetas;
	protected JButton jButtonNuevoRelacionesToolBarPagosTarjetas;
	
	
	public JButton jButtonGuardarCambiosToolBarPagosTarjetas;
	protected JButton jButtonCopiarToolBarPagosTarjetas;
	protected JButton jButtonVerFormToolBarPagosTarjetas;
	public JButton jButtonGuardarCambiosTablaToolBarPagosTarjetas;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosTarjetas;
	protected JButton jButtonCerrarToolBarPagosTarjetas;
	
	protected JButton jButtonRecargarInformacionToolBarPagosTarjetas;
	protected JButton jButtonProcesarInformacionToolBarPagosTarjetas;
	protected JButton jButtonAnterioresToolBarPagosTarjetas;
	protected JButton jButtonSiguientesToolBarPagosTarjetas;
	protected JButton jButtonNuevoGuardarCambiosToolBarPagosTarjetas;
	protected JButton jButtonAbrirOrderByToolBarPagosTarjetas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosTarjetas;
	protected JMenuItem jMenuItemDuplicarPagosTarjetas;
	protected JMenuItem jMenuItemNuevoRelacionesPagosTarjetas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPagosTarjetas;
	protected JMenuItem jMenuItemCopiarPagosTarjetas;
	protected JMenuItem jMenuItemVerFormPagosTarjetas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosTarjetas;
	protected JMenuItem jMenuItemCerrarPagosTarjetas;
	protected JMenuItem jMenuItemDetalleCerrarPagosTarjetas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPagosTarjetas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosTarjetas;
	
	protected JMenuItem jMenuItemRecargarInformacionPagosTarjetas;
	protected JMenuItem jMenuItemProcesarInformacionPagosTarjetas;
	protected JMenuItem jMenuItemAnterioresPagosTarjetas;
	protected JMenuItem jMenuItemSiguientesPagosTarjetas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosTarjetas;
	protected JMenuItem jMenuItemAbrirOrderByPagosTarjetas;
	protected JMenuItem jMenuItemMostrarOcultarPagosTarjetas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosTarjetas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPagosTarjetas;
	protected JCheckBox jCheckBoxSeleccionadosPagosTarjetas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPagosTarjetas;
	protected JCheckBox jCheckBoxConGraficoReportePagosTarjetas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPagosTarjetas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPagosTarjetas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPagosTarjetas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPagosTarjetas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPagosTarjetas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPagosTarjetas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosTarjetas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosTarjetas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPagosTarjetas;
	protected JTextField jTextFieldValorCampoGeneralPagosTarjetas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePagosTarjetas;
	//public JList<Reporte> jListColumnasSelectReportePagosTarjetas;
	//public JScrollPane jScrollColumnasSelectReportePagosTarjetas;
	
	//public JLabel jLabelRelacionesSelectReportePagosTarjetas;
	//public JList<Reporte> jListRelacionesSelectReportePagosTarjetas;
	//public JScrollPane jScrollRelacionesSelectReportePagosTarjetas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPagosTarjetas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPagosTarjetas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPagosTarjetas;
	//public JLabel jLabelTiposArchivoReporteDinamicoPagosTarjetas;
	
		
	//public JLabel jLabelArchivoImportacionPagosTarjetas;	
	//public JLabel jLabelPathArchivoImportacionPagosTarjetas;
	//protected JTextField jTextFieldPathArchivoImportacionPagosTarjetas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPagosTarjetas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPagosTarjetas;
	
	//public JLabel jLabelColumnaCategoriaValorPagosTarjetas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPagosTarjetas;
	
	//public JLabel jLabelColumnasValoresGraficoPagosTarjetas;
	//public JList<Reporte> jListColumnasValoresGraficoPagosTarjetas;
	//public JScrollPane jScrollColumnasValoresGraficoPagosTarjetas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPagosTarjetas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPagosTarjetas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPagosTarjetas;
	public JPanel jPanelBusquedaPagosTarjetasPagosTarjetas;
	public JButton jButtonBusquedaPagosTarjetasPagosTarjetas;
	
	public JPanel jPanelfecha_hastaBusquedaPagosTarjetasPagosTarjetas;
	public JLabel jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas;

	public JDateChooser jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas;
	public JButton jButtonfecha_hastaBusquedaPagosTarjetasPagosTarjetasBusqueda= new JButtonMe();

	
	
	
	
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
	public PagosTarjetasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPagosTarjetas)	{
		this.jButtonRecargarInformacionPagosTarjetas = jButtonRecargarInformacionPagosTarjetas;
	}
	
	public JButton getjButtonProcesarInformacionPagosTarjetas() {
		return this.jButtonProcesarInformacionPagosTarjetas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosTarjetas)	{
		this.jButtonProcesarInformacionPagosTarjetas = jButtonProcesarInformacionPagosTarjetas;
	}
	
	
	public JButton getjButtonRecargarInformacionPagosTarjetas() {
		return this.jButtonRecargarInformacionPagosTarjetas;
	}
	
	
	public List<PagosTarjetas> getpagostarjetass() {
		return this.pagostarjetass;
	}

	public void setpagostarjetass(List<PagosTarjetas> pagostarjetass) {
		this.pagostarjetass = pagostarjetass;
	}
	
	public List<PagosTarjetas> getpagostarjetassAux() {
		return this.pagostarjetassAux;
	}

	public void setpagostarjetassAux(List<PagosTarjetas> pagostarjetassAux) {
		this.pagostarjetassAux = pagostarjetassAux;
	}
	
	public List<PagosTarjetas> getpagostarjetassEliminados() {
		return this.pagostarjetassEliminados;
	}

	public void setPagosTarjetassEliminados(List<PagosTarjetas> pagostarjetassEliminados) {
		this.pagostarjetassEliminados = pagostarjetassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPagosTarjetas() {
		return jComboBoxTiposSeleccionarPagosTarjetas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPagosTarjetas(
			JComboBox jComboBoxTiposSeleccionarPagosTarjetas) {
		this.jComboBoxTiposSeleccionarPagosTarjetas = jComboBoxTiposSeleccionarPagosTarjetas;
	}
	
	public void setBorderResaltarTiposSeleccionarPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPagosTarjetas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPagosTarjetas() {
		return jTextFieldValorCampoGeneralPagosTarjetas;
	}

	public void setjTextFieldValorCampoGeneralPagosTarjetas(
			JTextField jTextFieldValorCampoGeneralPagosTarjetas) {
		this.jTextFieldValorCampoGeneralPagosTarjetas = jTextFieldValorCampoGeneralPagosTarjetas;
	}

	public void setBorderResaltarValorCampoGeneralPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPagosTarjetas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPagosTarjetas() {
		return this.jCheckBoxSeleccionarTodosPagosTarjetas;
	}

	public void setjCheckBoxSeleccionarTodosPagosTarjetas(
			JCheckBox jCheckBoxSeleccionarTodosPagosTarjetas) {
		this.jCheckBoxSeleccionarTodosPagosTarjetas = jCheckBoxSeleccionarTodosPagosTarjetas;
	}

	public void setBorderResaltarSeleccionarTodosPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPagosTarjetas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPagosTarjetas() {
		return this.jCheckBoxSeleccionadosPagosTarjetas;
	}

	public void setjCheckBoxSeleccionadosPagosTarjetas(
			JCheckBox jCheckBoxSeleccionadosPagosTarjetas) {
		this.jCheckBoxSeleccionadosPagosTarjetas = jCheckBoxSeleccionadosPagosTarjetas;
	}
	
	public void setBorderResaltarSeleccionadosPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPagosTarjetas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPagosTarjetas() {
		return this.jComboBoxTiposArchivosReportesPagosTarjetas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPagosTarjetas(
			JComboBox jComboBoxTiposArchivosReportesPagosTarjetas) {
		this.jComboBoxTiposArchivosReportesPagosTarjetas = jComboBoxTiposArchivosReportesPagosTarjetas;
	}

	public void setBorderResaltarTiposArchivosReportesPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPagosTarjetas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPagosTarjetas() {
		return this.jComboBoxTiposReportesPagosTarjetas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPagosTarjetas(
			JComboBox jComboBoxTiposReportesPagosTarjetas) {
		this.jComboBoxTiposReportesPagosTarjetas = jComboBoxTiposReportesPagosTarjetas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPagosTarjetas() {
	//	return jComboBoxTiposReportesDinamicoPagosTarjetas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPagosTarjetas(
	//		JComboBox jComboBoxTiposReportesDinamicoPagosTarjetas) {
	//	this.jComboBoxTiposReportesDinamicoPagosTarjetas = jComboBoxTiposReportesDinamicoPagosTarjetas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPagosTarjetas() {
	//	return jComboBoxTiposArchivosReportesDinamicoPagosTarjetas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPagosTarjetas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPagosTarjetas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas = jComboBoxTiposArchivosReportesDinamicoPagosTarjetas;
	//}
	
	public void setBorderResaltarTiposReportesPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPagosTarjetas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPagosTarjetas() {
		return this.jComboBoxTiposGraficosReportesPagosTarjetas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPagosTarjetas(
			JComboBox jComboBoxTiposGraficosReportesPagosTarjetas) {
		this.jComboBoxTiposGraficosReportesPagosTarjetas = jComboBoxTiposGraficosReportesPagosTarjetas;
	}
	
	public void setBorderResaltarTiposGraficosReportesPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPagosTarjetas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPagosTarjetas() {
		return this.jComboBoxTiposPaginacionPagosTarjetas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPagosTarjetas(
			JComboBox jComboBoxTiposPaginacionPagosTarjetas) {
		this.jComboBoxTiposPaginacionPagosTarjetas = jComboBoxTiposPaginacionPagosTarjetas;
	}
	
	public void setBorderResaltarTiposPaginacionPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPagosTarjetas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPagosTarjetas() {
		return this.jComboBoxTiposRelacionesPagosTarjetas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosTarjetas() {
		return this.jComboBoxTiposAccionesPagosTarjetas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosTarjetas(
			JComboBox jComboBoxTiposRelacionesPagosTarjetas) {
		this.jComboBoxTiposRelacionesPagosTarjetas = jComboBoxTiposRelacionesPagosTarjetas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosTarjetas(
			JComboBox jComboBoxTiposAccionesPagosTarjetas) {
		this.jComboBoxTiposAccionesPagosTarjetas = jComboBoxTiposAccionesPagosTarjetas;
	}
	
	public void setBorderResaltarTiposRelacionesPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPagosTarjetas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPagosTarjetas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPagosTarjetas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPagosTarjetas() {
	//	return jCheckBoxConGraficoDinamicoPagosTarjetas;
	//}

	//public void setjCheckBoxConGraficoDinamicoPagosTarjetas(
	//		JCheckBox jCheckBoxConGraficoDinamicoPagosTarjetas) {
	//	this.jCheckBoxConGraficoDinamicoPagosTarjetas = jCheckBoxConGraficoDinamicoPagosTarjetas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPagosTarjetas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPagosTarjetas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPagosTarjetas .setBorder(borderResaltar);		
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
		this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
		
		this.pagostarjetasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagostarjetasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagostarjetasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosTarjetasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Tarjetas MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
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
		
		PagosTarjetasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPagosTarjetas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"nuevo","nuevo","Nuevo"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"duplicar","duplicar","Duplicar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"copiar","copiar","Copiar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"ver_form","ver_form","Ver"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"recargar","recargar","Buscar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPagosTarjetas,this.jTtoolBarPagosTarjetas,
							"cerrar","cerrar","Salir"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPagosTarjetas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPagosTarjetas;
			
				this.jButtonProcesarInformacionToolBarPagosTarjetas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPagosTarjetas;
				
		//protected JButton jButtonModificarToolBarPagosTarjetas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPagosTarjetas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPagosTarjetas=new JMenuMe("General");
		this.jmenuArchivoPagosTarjetas=new JMenuMe("Archivo");
		this.jmenuAccionesPagosTarjetas=new JMenuMe("Acciones");
		this.jmenuDatosPagosTarjetas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosTarjetas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosTarjetas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosTarjetas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPagosTarjetas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPagosTarjetas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPagosTarjetas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPagosTarjetas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPagosTarjetas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPagosTarjetas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPagosTarjetas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosTarjetas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosTarjetas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPagosTarjetas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPagosTarjetas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPagosTarjetas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPagosTarjetas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPagosTarjetas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPagosTarjetas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPagosTarjetas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPagosTarjetas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPagosTarjetas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosTarjetas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosTarjetas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosTarjetas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPagosTarjetas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPagosTarjetas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPagosTarjetas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPagosTarjetas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPagosTarjetas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPagosTarjetas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPagosTarjetas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPagosTarjetas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPagosTarjetas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPagosTarjetas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPagosTarjetas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPagosTarjetas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPagosTarjetas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPagosTarjetas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPagosTarjetas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosTarjetas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosTarjetas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosTarjetas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPagosTarjetas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPagosTarjetas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPagosTarjetas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosTarjetas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosTarjetas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosTarjetas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPagosTarjetas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPagosTarjetas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPagosTarjetas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPagosTarjetas.add(this.jMenuItemCerrarPagosTarjetas);
			
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemNuevoPagosTarjetas);
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemNuevoGuardarCambiosPagosTarjetas);
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemNuevoRelacionesPagosTarjetas);
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemGuardarCambiosTablaPagosTarjetas);		
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemDuplicarPagosTarjetas);		
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemCopiarPagosTarjetas);		
			this.jmenuAccionesPagosTarjetas.add(this.jMenuItemVerFormPagosTarjetas);		
			
			this.jmenuDatosPagosTarjetas.add(this.jMenuItemRecargarInformacionPagosTarjetas);				
			this.jmenuDatosPagosTarjetas.add(this.jMenuItemAnterioresPagosTarjetas);				
			this.jmenuDatosPagosTarjetas.add(this.jMenuItemSiguientesPagosTarjetas);				
			this.jmenuDatosPagosTarjetas.add(this.jMenuItemAbrirOrderByPagosTarjetas);				
			this.jmenuDatosPagosTarjetas.add(this.jMenuItemMostrarOcultarPagosTarjetas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPagosTarjetas.add(this.jMenuItemGuardarCambiosPagosTarjetas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPagosTarjetas.add(this.jmenuArchivoPagosTarjetas);		
			this.jmenuBarPagosTarjetas.add(this.jmenuAccionesPagosTarjetas);		
			this.jmenuBarPagosTarjetas.add(this.jmenuDatosPagosTarjetas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPagosTarjetas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPagosTarjetas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPagosTarjetasPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPagosTarjetasPagosTarjetas.setToolTipText("Buscar Por Fecha Hasta ");
		this.jButtonBusquedaPagosTarjetasPagosTarjetas= new JButtonMe();
		this.jButtonBusquedaPagosTarjetasPagosTarjetas.setText("Buscar");
		this.jButtonBusquedaPagosTarjetasPagosTarjetas.setToolTipText("Buscar Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPagosTarjetasPagosTarjetas,"buscar_button","Buscar Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPagosTarjetasPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas = new JLabelMe();
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas= new JDateChooser();
		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setDate(new Date());
		jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasPagosTarjetas=new JTabbedPane();


		this.jTabbedPaneBusquedasPagosTarjetas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosTarjetas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasPagosTarjetas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPagosTarjetas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPagosTarjetas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePagosTarjetas = new PagosTarjetasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pagos Tarjetas DATOS");
			this.jInternalFrameDetalleFormPagosTarjetas = new PagosTarjetasDetalleFormJInternalFrame(jDesktopPane,this.pagostarjetasSessionBean.getConGuardarRelaciones(),this.pagostarjetasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPagosTarjetas = null;//new PagosTarjetasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosTarjetas= new GridBagLayout();
		
		
		this.jTableDatosPagosTarjetas = new JTableMe();      
		
		String sToolTipPagosTarjetas="";
		sToolTipPagosTarjetas=PagosTarjetasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosTarjetas+="(PuntoVenta.PagosTarjetas)";
		}
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosTarjetas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPagosTarjetas.setToolTipText(sToolTipPagosTarjetas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPagosTarjetas);
		this.jTableDatosPagosTarjetas.setAutoCreateRowSorter(true);
		this.jTableDatosPagosTarjetas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPagosTarjetas.setRowSelectionAllowed(true);
		this.jTableDatosPagosTarjetas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPagosTarjetas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPagosTarjetas = new JButtonMe();
		this.jButtonDuplicarPagosTarjetas = new JButtonMe();
		this.jButtonCopiarPagosTarjetas = new JButtonMe();
		this.jButtonVerFormPagosTarjetas = new JButtonMe();
		this.jButtonNuevoRelacionesPagosTarjetas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPagosTarjetas = new JButtonMe();
		this.jButtonCerrarPagosTarjetas = new JButtonMe();
		
		this.jScrollPanelDatosPagosTarjetas = new JScrollPane();   
        this.jScrollPanelDatosGeneralPagosTarjetas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Tarjetas";
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosTarjetas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosTarjetas.setToolTipText("Acciones");
        this.jPanelAccionesPagosTarjetas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPagosTarjetas=new ReporteDinamicoJInternalFrame(PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPagosTarjetas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPagosTarjetas=new ImportacionJInternalFrame(PagosTarjetasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPagosTarjetas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPagosTarjetas = new JButtonMe();
		
		this.jButtonAbrirOrderByPagosTarjetas.setText("Orden");
		this.jButtonAbrirOrderByPagosTarjetas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosTarjetas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosTarjetas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosTarjetas,false,this);
			
			//this.cargarOrderByPagosTarjetas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagosTarjetas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosTarjetas,true,this);
			
			//this.cargarOrderByPagosTarjetas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPagosTarjetas.setMinimumSize(new Dimension(400,50));//1830
		this.jTableDatosPagosTarjetas.setMaximumSize(new Dimension(400,50));//1830
		this.jTableDatosPagosTarjetas.setPreferredSize(new Dimension(400,50));//1830
		
		this.jScrollPanelDatosPagosTarjetas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosTarjetas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagosTarjetas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPagosTarjetas.setText("Nuevo");
		this.jButtonDuplicarPagosTarjetas.setText("Duplicar");
		this.jButtonCopiarPagosTarjetas.setText("Copiar");
		this.jButtonVerFormPagosTarjetas.setText("Ver");
		this.jButtonNuevoRelacionesPagosTarjetas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.setText("Guardar");
		this.jButtonCerrarPagosTarjetas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosTarjetas,"nuevo_button","Nuevo",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPagosTarjetas,"duplicar_button","Duplicar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPagosTarjetas,"copiar_button","Copiar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPagosTarjetas,"ver_form","Ver",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPagosTarjetas,"nuevorelaciones_button","Nuevo Rel",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosTarjetas,"guardarcambiostabla_button","Guardar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosTarjetas,"cerrar_button","Salir",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPagosTarjetas.setToolTipText("Nuevo"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPagosTarjetas.setToolTipText("Duplicar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPagosTarjetas.setToolTipText("Copiar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPagosTarjetas.setToolTipText("Ver"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPagosTarjetas.setToolTipText("Nuevo Rel"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.setToolTipText("Guardar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosTarjetas.setToolTipText("Salir"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosTarjetas";
		inputMap = this.jButtonNuevoPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosTarjetas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosTarjetas"));
		
		//DUPLICAR
		sMapKey = "DuplicarPagosTarjetas";
		inputMap = this.jButtonDuplicarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPagosTarjetas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPagosTarjetas"));
		
		//COPIAR
		sMapKey = "CopiarPagosTarjetas";
		inputMap = this.jButtonCopiarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPagosTarjetas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPagosTarjetas"));
		
		//VEr FORM
		sMapKey = "VerFormPagosTarjetas";
		inputMap = this.jButtonVerFormPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPagosTarjetas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPagosTarjetas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPagosTarjetas";
		inputMap = this.jButtonNuevoRelacionesPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPagosTarjetas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPagosTarjetas";
		inputMap = this.jButtonModificarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPagosTarjetas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPagosTarjetas";
		inputMap = this.jButtonCerrarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosTarjetas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosTarjetas";
		inputMap = this.jButtonGuardarCambiosTablaPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosTarjetas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPagosTarjetas.setName("jPanelParametrosReportesPagosTarjetas"); 
		
		this.jPanelParametrosReportesAccionesPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPagosTarjetas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPagosTarjetas.setName("jPanelParametrosReportesAccionesPagosTarjetas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPagosTarjetas = new JButtonMe();
		this.jButtonRecargarInformacionPagosTarjetas.setText("Buscar");
		this.jButtonRecargarInformacionPagosTarjetas.setToolTipText("Buscar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPagosTarjetas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionPagosTarjetas.setVisible(false);
		
		
		this.jButtonProcesarInformacionPagosTarjetas = new JButtonMe();
		this.jButtonProcesarInformacionPagosTarjetas.setText("Procesar");
		this.jButtonProcesarInformacionPagosTarjetas.setToolTipText("Procesar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPagosTarjetas.setVisible(false);
			
		this.jButtonProcesarInformacionPagosTarjetas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosTarjetas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagosTarjetas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosTarjetas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPagosTarjetas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosTarjetas.setText("TIPO");       
		this.jComboBoxTiposReportesPagosTarjetas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagosTarjetas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPagosTarjetas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPagosTarjetas.setText("Paginacion");
		this.jComboBoxTiposPaginacionPagosTarjetas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPagosTarjetas.setText("Accion");
		this.jComboBoxTiposRelacionesPagosTarjetas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosTarjetas.setText("Accion");
		this.jComboBoxTiposAccionesPagosTarjetas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPagosTarjetas.setText("Accion");
		this.jComboBoxTiposSeleccionarPagosTarjetas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPagosTarjetas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPagosTarjetas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosTarjetas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagosTarjetas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPagosTarjetas = new JLabelMe();
		
		this.jLabelAccionesPagosTarjetas.setText("Acciones");		
		this.jLabelAccionesPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPagosTarjetas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPagosTarjetas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPagosTarjetas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPagosTarjetas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPagosTarjetas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPagosTarjetas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPagosTarjetas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPagosTarjetas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePagosTarjetas.setText("Graf.");
		this.jCheckBoxConGraficoReportePagosTarjetas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPagosTarjetas = new JButtonMe();
		//this.jButtonAnterioresPagosTarjetas.setText("<<");
        this.jButtonAnterioresPagosTarjetas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPagosTarjetas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPagosTarjetas = new JButtonMe();
		//this.jButtonSiguientesPagosTarjetas.setText(">>");
        this.jButtonSiguientesPagosTarjetas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPagosTarjetas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPagosTarjetas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPagosTarjetas.setText("Nue");
        this.jButtonNuevoGuardarCambiosPagosTarjetas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPagosTarjetas,"nuevoguardarcambios_button","Nue",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPagosTarjetas";
		inputMap = this.jButtonNuevoGuardarCambiosPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPagosTarjetas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPagosTarjetas";
		inputMap = this.jButtonRecargarInformacionPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPagosTarjetas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPagosTarjetas";
		inputMap = this.jButtonSiguientesPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPagosTarjetas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPagosTarjetas";
		inputMap = this.jButtonAnterioresPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPagosTarjetas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPagosTarjetas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPagosTarjetas.setMinimumSize(new Dimension(this.getWidth(),PagosTarjetasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosTarjetasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosTarjetas.setMaximumSize(new Dimension(this.getWidth(),PagosTarjetasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosTarjetasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagosTarjetas.setPreferredSize(new Dimension(this.getWidth(),PagosTarjetasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagosTarjetasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPagosTarjetas = new GridBagLayout();

			this.jPanelPaginacionPagosTarjetas.setLayout(gridaBagLayoutPaginacionPagosTarjetas);						
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 0;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonAnterioresPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					
						
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosTarjetas.gridy = 0;
			
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonNuevoGuardarCambiosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
						
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagosTarjetas.gridy = 0;
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonSiguientesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 1;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonNuevoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
						
			
			
			if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
				this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPagosTarjetas.gridy = 1;
				this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPagosTarjetas.add(this.jButtonGuardarCambiosTablaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			}
			
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 1;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonDuplicarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 1;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonCopiarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 1;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonVerFormPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 1;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPagosTarjetas.add(this.jButtonCerrarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		
		this.jButtonRecargarInformacionPagosTarjetas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosTarjetas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagosTarjetas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPagosTarjetas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosTarjetas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagosTarjetas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPagosTarjetas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosTarjetas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagosTarjetas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPagosTarjetas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosTarjetas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagosTarjetas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPagosTarjetas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosTarjetas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagosTarjetas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPagosTarjetas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosTarjetas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagosTarjetas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPagosTarjetas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosTarjetas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosTarjetas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPagosTarjetas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosTarjetas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagosTarjetas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPagosTarjetas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosTarjetas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagosTarjetas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePagosTarjetas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosTarjetas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagosTarjetas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPagosTarjetas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosTarjetas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagosTarjetas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPagosTarjetas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosTarjetas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagosTarjetas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPagosTarjetas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPagosTarjetas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PagosTarjetas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PagosTarjetas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PagosTarjetas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PagosTarjetas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPagosTarjetas.setLayout(gridaBagParametrosReportesPagosTarjetas);
			this.jPanelParametrosReportesAccionesPagosTarjetas.setLayout(gridaBagParametrosReportesAccionesPagosTarjetas);
			
			
			this.jPanelParametrosAuxiliar1PagosTarjetas.setLayout(gridaBagParametrosAuxiliar1PagosTarjetas);
			this.jPanelParametrosAuxiliar2PagosTarjetas.setLayout(gridaBagParametrosAuxiliar2PagosTarjetas);
			this.jPanelParametrosAuxiliar3PagosTarjetas.setLayout(gridaBagParametrosAuxiliar3PagosTarjetas);
			this.jPanelParametrosAuxiliar4PagosTarjetas.setLayout(gridaBagParametrosAuxiliar4PagosTarjetas);
			//this.jPanelParametrosAuxiliar5PagosTarjetas.setLayout(gridaBagParametrosAuxiliar2PagosTarjetas);			
			
			
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosTarjetas.add(this.jButtonRecargarInformacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosTarjetas.add(this.jComboBoxTiposPaginacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosTarjetas.add(this.jCheckBoxConAltoMaximoTablaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagosTarjetas.add(this.jComboBoxTiposArchivosReportesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosTarjetas.add(this.jPanelParametrosAuxiliar1PagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PagosTarjetas.add(this.jComboBoxTiposReportesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);																		
			
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PagosTarjetas.add(this.jComboBoxTiposGraficosReportesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosTarjetas.add(this.jPanelParametrosAuxiliar4PagosTarjetas, this.gridBagConstraintsPagosTarjetas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosTarjetas.add(this.jComboBoxTiposReportesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosTarjetas.add(this.jCheckBoxGenerarReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosTarjetas.add(this.jPanelParametrosAuxiliar2PagosTarjetas, this.gridBagConstraintsPagosTarjetas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosTarjetas.add(this.jLabelAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
				this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPagosTarjetas.add(this.jButtonAbrirOrderByPagosTarjetas, this.gridBagConstraintsPagosTarjetas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosTarjetas.add(this.jComboBoxTiposSeleccionarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
			
			
			/*
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosTarjetas.add(this.jCheckBoxSeleccionarTodosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagosTarjetas.add(this.jCheckBoxConGraficoReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosTarjetas.add(this.jCheckBoxSeleccionarTodosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);															
				
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosTarjetas.add(this.jCheckBoxSeleccionadosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);															
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagosTarjetas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagosTarjetas.add(this.jCheckBoxConGraficoReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagosTarjetas.add(this.jPanelParametrosAuxiliar3PagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagosTarjetas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagosTarjetas.add(this.jComboBoxTiposAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPagosTarjetas = new GridBagLayout();

			this.jScrollPanelDatosPagosTarjetas.setLayout(gridaBagLayoutDatosPagosTarjetas);
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = 0;
			this.gridBagConstraintsPagosTarjetas.gridx = 0;
			
			this.jScrollPanelDatosPagosTarjetas.add(this.jTableDatosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPagosTarjetas.setViewportView(this.jTableDatosPagosTarjetas);
		this.jTableDatosPagosTarjetas.setFillsViewportHeight(true);
		this.jTableDatosPagosTarjetas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagosTarjetas= new GridBagLayout();
		this.jPanelAccionesPagosTarjetas.setLayout(gridaBagLayoutAccionesPagosTarjetas);
		
		
		/*	
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
			
		this.jPanelAccionesPagosTarjetas.add(this.jButtonNuevoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas= new GridBagLayout();
		gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPagosTarjetasPagosTarjetas.setLayout(gridaBagLayoutBusquedaPagosTarjetasPagosTarjetas);

		gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosTarjetas.gridy = 0;
		gridBagConstraintsPagosTarjetas.gridx = 0;
		jPanelBusquedaPagosTarjetasPagosTarjetas.add(jLabelfecha_hastaBusquedaPagosTarjetasPagosTarjetas, gridBagConstraintsPagosTarjetas);

		gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosTarjetas.gridy = 0;
		gridBagConstraintsPagosTarjetas.gridx = 1;
		jPanelBusquedaPagosTarjetasPagosTarjetas.add(jDateChooserfecha_hastaBusquedaPagosTarjetasPagosTarjetas, gridBagConstraintsPagosTarjetas);

		gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagosTarjetas.gridy = 1;
		gridBagConstraintsPagosTarjetas.gridx =1;
		jPanelBusquedaPagosTarjetasPagosTarjetas.add(jButtonBusquedaPagosTarjetasPagosTarjetas, gridBagConstraintsPagosTarjetas);

		jTabbedPaneBusquedasPagosTarjetas.addTab("1.-Por Fecha Hasta ", jPanelBusquedaPagosTarjetasPagosTarjetas);
		jTabbedPaneBusquedasPagosTarjetas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosTarjetas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosTarjetas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();						
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosTarjetas.gridx = 0;		
			//this.gridBagConstraintsPagosTarjetas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosTarjetas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPagosTarjetas.gridx = 0;		
		//this.gridBagConstraintsPagosTarjetas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPagosTarjetas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPagosTarjetas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosTarjetas.gridx = 0;		
			this.gridBagConstraintsPagosTarjetas.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPagosTarjetas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPagosTarjetas, this.gridBagConstraintsPagosTarjetas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);								
		
		
		/*
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		*/		
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosTarjetas.gridx =0;
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosTarjetas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
				
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPagosTarjetas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosTarjetas = new GridBagLayout();
			this.jPanelBusquedasParametrosPagosTarjetas.setLayout(gridaBagLayoutBusquedasParametrosPagosTarjetas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPagosTarjetas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosTarjetas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosTarjetas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosTarjetas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPagosTarjetas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPagosTarjetas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPagosTarjetas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPagosTarjetas.setName("jPanelReporteDinamicoPagosTarjetas"); 
		
		this.jPanelReporteDinamicoPagosTarjetas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosTarjetas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagosTarjetas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPagosTarjetas.setLayout(gridaBagLayoutReporteDinamicoPagosTarjetas);
		
		
		this.jInternalFrameReporteDinamicoPagosTarjetas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPagosTarjetas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosTarjetas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPagosTarjetas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPagosTarjetas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPagosTarjetas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPagosTarjetas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPagosTarjetas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPagosTarjetas.setResizable(true);
	    this.jInternalFrameReporteDinamicoPagosTarjetas.setClosable(true);
	    this.jInternalFrameReporteDinamicoPagosTarjetas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPagosTarjetas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosTarjetas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagosTarjetas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePagosTarjetas = new JLabelMe();

		this.jLabelColumnasSelectReportePagosTarjetas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelColumnasSelectReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePagosTarjetas = new JList<Reporte>();
		this.jListColumnasSelectReportePagosTarjetas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePagosTarjetas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePagosTarjetas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosTarjetas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagosTarjetas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePagosTarjetas=new JScrollPane(this.jListColumnasSelectReportePagosTarjetas);
			
			this.jScrollColumnasSelectReportePagosTarjetas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosTarjetas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagosTarjetas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPagosTarjetas.add(this.jListColumnasSelectReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jScrollColumnasSelectReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePagosTarjetas = new JLabelMe();

		this.jLabelRelacionesSelectReportePagosTarjetas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePagosTarjetas = new JList<Reporte>();
		this.jListRelacionesSelectReportePagosTarjetas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePagosTarjetas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePagosTarjetas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosTarjetas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagosTarjetas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePagosTarjetas=new JScrollPane(this.jListRelacionesSelectReportePagosTarjetas);
			
			this.jScrollRelacionesSelectReportePagosTarjetas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosTarjetas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagosTarjetas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPagosTarjetas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPagosTarjetas = new JComboBoxMe();
		this.jListColumnasValoresGraficoPagosTarjetas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPagosTarjetas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPagosTarjetas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPagosTarjetas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosTarjetas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagosTarjetas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPagosTarjetas = new JLabelMe();

		this.jLabelConGraficoDinamicoPagosTarjetas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelConGraficoDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPagosTarjetas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPagosTarjetas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPagosTarjetas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosTarjetas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagosTarjetas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jCheckBoxConGraficoDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPagosTarjetas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPagosTarjetas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelColumnaCategoriaGraficoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jComboBoxColumnaCategoriaGraficoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPagosTarjetas = new JLabelMe();

		this.jLabelColumnaCategoriaValorPagosTarjetas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelColumnaCategoriaValorPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPagosTarjetas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPagosTarjetas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPagosTarjetas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosTarjetas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagosTarjetas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jComboBoxColumnaCategoriaValorPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPagosTarjetas = new JLabelMe();

		this.jLabelColumnasValoresGraficoPagosTarjetas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelColumnasValoresGraficoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPagosTarjetas = new JList<Reporte>();
		this.jListColumnasValoresGraficoPagosTarjetas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPagosTarjetas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPagosTarjetas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosTarjetas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagosTarjetas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPagosTarjetas=new JScrollPane(this.jListColumnasValoresGraficoPagosTarjetas);
			
			this.jScrollColumnasValoresGraficoPagosTarjetas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosTarjetas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagosTarjetas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPagosTarjetas.add(this.jListColumnasSelectReportePagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jScrollColumnasValoresGraficoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPagosTarjetas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPagosTarjetas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelTiposGraficosReportesDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagosTarjetas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jComboBoxTiposGraficosReportesDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPagosTarjetas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPagosTarjetas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelGenerarExcelReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPagosTarjetas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPagosTarjetas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPagosTarjetas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPagosTarjetas.setToolTipText("Generar EXCEL"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPagosTarjetas.add(this.jButtonGenerarExcelReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jComboBoxTiposReportesDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPagosTarjetas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPagosTarjetas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jLabelTiposArchivoReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jComboBoxTiposArchivosReportesDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPagosTarjetas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPagosTarjetas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPagosTarjetas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPagosTarjetas.setToolTipText("Generar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jButtonGenerarReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPagosTarjetas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPagosTarjetas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPagosTarjetas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPagosTarjetas.setToolTipText("Cancelar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagosTarjetas.add(this.jButtonCerrarReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPagosTarjetas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPagosTarjetas= new JScrollPane(jPanelReporteDinamicoPagosTarjetas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPagosTarjetas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosTarjetas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagosTarjetas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPagosTarjetas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPagosTarjetas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPagosTarjetas);
		this.jInternalFrameReporteDinamicoPagosTarjetas.getContentPane().add(this.jScrollPanelReporteDinamicoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPagosTarjetas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPagosTarjetas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPagosTarjetas.setName("jPanelImportacionPagosTarjetas"); 
		
		this.jPanelImportacionPagosTarjetas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosTarjetas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagosTarjetas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPagosTarjetas.setLayout(gridaBagLayoutImportacionPagosTarjetas);
		
		
		this.jInternalFrameImportacionPagosTarjetas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPagosTarjetas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPagosTarjetas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagosTarjetas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPagosTarjetas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosTarjetas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosTarjetas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPagosTarjetas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosTarjetas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosTarjetas.setResizable(true);
	    this.jInternalFrameImportacionPagosTarjetas.setClosable(true);
	    this.jInternalFrameImportacionPagosTarjetas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPagosTarjetas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagosTarjetas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagosTarjetas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPagosTarjetas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagosTarjetas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagosTarjetas.setResizable(true);
	    this.jInternalFrameImportacionPagosTarjetas.setClosable(true);
	    this.jInternalFrameImportacionPagosTarjetas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPagosTarjetas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosTarjetas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagosTarjetas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPagosTarjetas = new JLabelMe();

		this.jLabelArchivoImportacionPagosTarjetas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosTarjetas.add(this.jLabelArchivoImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPagosTarjetas = new JFileChooser();		
		this.jFileChooserImportacionPagosTarjetas.setToolTipText("ESCOGER ARCHIVO"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPagosTarjetas = new JButtonMe();
		this.jButtonAbrirImportacionPagosTarjetas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPagosTarjetas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPagosTarjetas.setToolTipText("Generar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosTarjetas.add(this.jButtonAbrirImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPagosTarjetas = new JLabelMe();

		this.jLabelPathArchivoImportacionPagosTarjetas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagosTarjetas.add(this.jLabelPathArchivoImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPagosTarjetas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPagosTarjetas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosTarjetas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagosTarjetas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosTarjetas.add(this.jTextFieldPathArchivoImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPagosTarjetas = new JButtonMe();
		this.jButtonGenerarImportacionPagosTarjetas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPagosTarjetas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPagosTarjetas.setToolTipText("Generar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosTarjetas.add(this.jButtonGenerarImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPagosTarjetas = new JButtonMe();
		this.jButtonCerrarImportacionPagosTarjetas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPagosTarjetas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPagosTarjetas.setToolTipText("Cancelar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = iPosYImportacion;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagosTarjetas.add(this.jButtonCerrarImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPagosTarjetas = new GridBagLayout();
		
		this.jScrollPanelImportacionPagosTarjetas= new JScrollPane(jPanelImportacionPagosTarjetas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iPosYImportacion;
		this.gridBagConstraintsPagosTarjetas.gridx =iPosXImportacion;
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPagosTarjetas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPagosTarjetas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPagosTarjetas);
		this.jInternalFrameImportacionPagosTarjetas.getContentPane().add(this.jScrollPanelImportacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPagosTarjetas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPagosTarjetas = new JButtonMe();
			this.jButtonAbrirOrderByPagosTarjetas.setText("Orden");
			this.jButtonAbrirOrderByPagosTarjetas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagosTarjetas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPagosTarjetas";
			inputMap = this.jButtonAbrirOrderByPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPagosTarjetas"));
		
		
			GridBagLayout gridaBagLayoutOrderByPagosTarjetas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPagosTarjetas.setName("jPanelOrderByPagosTarjetas"); 
			
			this.jPanelOrderByPagosTarjetas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosTarjetas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagosTarjetas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPagosTarjetas.setLayout(gridaBagLayoutOrderByPagosTarjetas);
			
			
			this.jTableDatosPagosTarjetasOrderBy = new JTableMe();        
			this.jTableDatosPagosTarjetasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPagosTarjetasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPagosTarjetasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPagosTarjetasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPagosTarjetasOrderBy.setViewportView(this.jTableDatosPagosTarjetasOrderBy);
			this.jTableDatosPagosTarjetasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPagosTarjetasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPagosTarjetas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPagosTarjetas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPagosTarjetas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePagosTarjetas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPagosTarjetas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPagosTarjetas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPagosTarjetas.setTitle("Orden");
			this.jInternalFrameOrderByPagosTarjetas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPagosTarjetas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPagosTarjetas.setResizable(true);
			this.jInternalFrameOrderByPagosTarjetas.setClosable(true);
			this.jInternalFrameOrderByPagosTarjetas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPagosTarjetas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosTarjetas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagosTarjetas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPagosTarjetas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPagosTarjetas.ipady =150;
				
			this.jPanelOrderByPagosTarjetas.add(jScrollPanelDatosPagosTarjetasOrderBy, this.gridBagConstraintsPagosTarjetas);//this.jTableDatosPagosTarjetasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPagosTarjetas = new JButtonMe();
			this.jButtonCerrarOrderByPagosTarjetas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPagosTarjetas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPagosTarjetas.setToolTipText("Cancelar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPagosTarjetas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPagosTarjetas.add(this.jButtonCerrarOrderByPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPagosTarjetas = new GridBagLayout();
			
			this.jScrollPanelOrderByPagosTarjetas= new JScrollPane(jPanelOrderByPagosTarjetas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy =iPosYOrderBy;
			this.gridBagConstraintsPagosTarjetas.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPagosTarjetas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPagosTarjetas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPagosTarjetas);
			
			this.jInternalFrameOrderByPagosTarjetas.getContentPane().add(this.jScrollPanelOrderByPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
		
		} else {
			this.jButtonAbrirOrderByPagosTarjetas = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.pagostarjetasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPagosTarjetas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPagosTarjetas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosPagosTarjetas.getRowHeight();//PagosTarjetasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosTarjetas.isSelected()) {
					iHeightTable=PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagosTarjetas.isSelected()) {
					iHeightTable=PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagosTarjetasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPagosTarjetas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosTarjetas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagosTarjetas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPagosTarjetas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosTarjetas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagosTarjetas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPagosTarjetas!=null && this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy()!=null) {
			//if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPagosTarjetas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPagosTarjetas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPagosTarjetas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPagosTarjetas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPagosTarjetas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosTarjetas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagosTarjetas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=pagostarjetasLogic.getPagosTarjetass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagostarjetass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PagosTarjetas> TraerPagosTarjetasBeans(List<PagosTarjetas> pagostarjetass,ArrayList<Classe> classes)throws Exception {
		try {
			for(PagosTarjetas pagostarjetas:pagostarjetass) {
					
				if(!(PagosTarjetasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PagosTarjetasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pagostarjetas.setsDetalleGeneralEntityReporte(PagosTarjetasConstantesFunciones.getPagosTarjetasDescripcion(pagostarjetas));
										
						
					
						
					
				} else  {
							
					//pagostarjetas.setsDetalleGeneralEntityReporte(pagostarjetas.getsDetalleGeneralEntityReporte());
										
				}
				
				//pagostarjetasbeans.add(pagostarjetasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pagostarjetass;
    }
	//PARA REPORTES FIN
}
