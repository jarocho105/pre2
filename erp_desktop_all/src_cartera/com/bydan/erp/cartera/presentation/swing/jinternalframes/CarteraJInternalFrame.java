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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.CarteraConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class CarteraJInternalFrame extends CarteraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCartera;
	
	protected JMenuBar jmenuBarCartera;
	
	protected JMenu jmenuCartera;
	protected JMenu jmenuDatosCartera;
	protected JMenu jmenuArchivoCartera;
	protected JMenu jmenuAccionesCartera;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCartera;	
	protected GridBagConstraints gridBagConstraintsCartera;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CarteraDetalleFormJInternalFrame jInternalFrameDetalleFormCartera;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCartera;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCartera;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CarteraSessionBean carteraSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Cartera> carteras;		
	public List<Cartera> carterasEliminados;	
	public List<Cartera> carterasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCartera;		
	protected JButton jButtonAbrirOrderByCartera;
	
	
	//protected JPanel jPanelOrderByCartera;
	//public JScrollPane jScrollPanelOrderByCartera;	
	//protected JButton jButtonCerrarOrderByCartera;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CarteraLogic carteraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCartera;
	public JScrollPane jScrollPanelDatosEdicionCartera;
	public JScrollPane jScrollPanelDatosGeneralCartera;
    
	
	
	//public JScrollPane jScrollPanelDatosCarteraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCartera;
	//public JScrollPane jScrollPanelImportacionCartera;
	
	
	
	protected JPanel jPanelAccionesCartera;
	
    protected JPanel jPanelPaginacionCartera;
    protected JPanel jPanelParametrosReportesCartera;
	protected JPanel jPanelParametrosReportesAccionesCartera;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Cartera;
	protected JPanel jPanelParametrosAuxiliar2Cartera;
	protected JPanel jPanelParametrosAuxiliar3Cartera;
	protected JPanel jPanelParametrosAuxiliar4Cartera;
	//protected JPanel jPanelParametrosAuxiliar5Cartera;
	
	
	
	//protected JPanel jPanelReporteDinamicoCartera;
	//protected JPanel jPanelImportacionCartera;
	
	
	public JTable jTableDatosCartera;
	
	
	
	//public JTable jTableDatosCarteraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCartera;
	protected JButton jButtonDuplicarCartera;
	protected JButton jButtonCopiarCartera;
	protected JButton jButtonVerFormCartera;
	protected JButton jButtonNuevoRelacionesCartera;
	protected JButton jButtonModificarCartera;
	
    protected JButton jButtonGuardarCambiosTablaCartera;
	protected JButton jButtonCerrarCartera;
	
	
	protected JButton jButtonRecargarInformacionCartera;
	protected JButton jButtonProcesarInformacionCartera;
	
	
	protected JButton jButtonAnterioresCartera;
	protected JButton jButtonSiguientesCartera;
	protected JButton jButtonNuevoGuardarCambiosCartera;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCartera;
	//protected JButton jButtonCerrarReporteDinamicoCartera;
	//protected JButton jButtonGenerarExcelReporteDinamicoCartera;	
	
	
	
	//protected JButton jButtonAbrirImportacionCartera;
	//protected JButton jButtonGenerarImportacionCartera;
	//protected JButton jButtonCerrarImportacionCartera;
	//protected JFileChooser jFileChooserImportacionCartera;
	//protected File fileImportacionCartera;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCartera;
	protected JButton jButtonDuplicarToolBarCartera;
	protected JButton jButtonNuevoRelacionesToolBarCartera;
	
	
	public JButton jButtonGuardarCambiosToolBarCartera;
	protected JButton jButtonCopiarToolBarCartera;
	protected JButton jButtonVerFormToolBarCartera;
	public JButton jButtonGuardarCambiosTablaToolBarCartera;
	protected JButton jButtonMostrarOcultarTablaToolBarCartera;
	protected JButton jButtonCerrarToolBarCartera;
	
	protected JButton jButtonRecargarInformacionToolBarCartera;
	protected JButton jButtonProcesarInformacionToolBarCartera;
	protected JButton jButtonAnterioresToolBarCartera;
	protected JButton jButtonSiguientesToolBarCartera;
	protected JButton jButtonNuevoGuardarCambiosToolBarCartera;
	protected JButton jButtonAbrirOrderByToolBarCartera;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCartera;
	protected JMenuItem jMenuItemDuplicarCartera;
	protected JMenuItem jMenuItemNuevoRelacionesCartera;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCartera;
	protected JMenuItem jMenuItemCopiarCartera;
	protected JMenuItem jMenuItemVerFormCartera;
	protected JMenuItem jMenuItemGuardarCambiosTablaCartera;
	protected JMenuItem jMenuItemCerrarCartera;
	protected JMenuItem jMenuItemDetalleCerrarCartera;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCartera;
	protected JMenuItem jMenuItemDetalleMostarOcultarCartera;
	
	protected JMenuItem jMenuItemRecargarInformacionCartera;
	protected JMenuItem jMenuItemProcesarInformacionCartera;
	protected JMenuItem jMenuItemAnterioresCartera;
	protected JMenuItem jMenuItemSiguientesCartera;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCartera;
	protected JMenuItem jMenuItemAbrirOrderByCartera;
	protected JMenuItem jMenuItemMostrarOcultarCartera;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCartera;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCartera;
	protected JCheckBox jCheckBoxSeleccionadosCartera;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCartera;
	protected JCheckBox jCheckBoxConGraficoReporteCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCartera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCartera;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCartera;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCartera;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCartera;
	protected JTextField jTextFieldValorCampoGeneralCartera;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCartera;
	//public JList<Reporte> jListColumnasSelectReporteCartera;
	//public JScrollPane jScrollColumnasSelectReporteCartera;
	
	//public JLabel jLabelRelacionesSelectReporteCartera;
	//public JList<Reporte> jListRelacionesSelectReporteCartera;
	//public JScrollPane jScrollRelacionesSelectReporteCartera;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCartera;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCartera;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCartera;
	//public JLabel jLabelTiposArchivoReporteDinamicoCartera;
	
		
	//public JLabel jLabelArchivoImportacionCartera;	
	//public JLabel jLabelPathArchivoImportacionCartera;
	//protected JTextField jTextFieldPathArchivoImportacionCartera;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCartera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCartera;
	
	//public JLabel jLabelColumnaCategoriaValorCartera;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCartera;
	
	//public JLabel jLabelColumnasValoresGraficoCartera;
	//public JList<Reporte> jListColumnasValoresGraficoCartera;
	//public JScrollPane jScrollColumnasValoresGraficoCartera;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCartera;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCartera;	
	
	
	
	
	
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
	public CarteraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CarteraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCartera)	{
		this.jButtonRecargarInformacionCartera = jButtonRecargarInformacionCartera;
	}
	
	public JButton getjButtonProcesarInformacionCartera() {
		return this.jButtonProcesarInformacionCartera;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCartera)	{
		this.jButtonProcesarInformacionCartera = jButtonProcesarInformacionCartera;
	}
	
	
	public JButton getjButtonRecargarInformacionCartera() {
		return this.jButtonRecargarInformacionCartera;
	}
	
	
	public List<Cartera> getcarteras() {
		return this.carteras;
	}

	public void setcarteras(List<Cartera> carteras) {
		this.carteras = carteras;
	}
	
	public List<Cartera> getcarterasAux() {
		return this.carterasAux;
	}

	public void setcarterasAux(List<Cartera> carterasAux) {
		this.carterasAux = carterasAux;
	}
	
	public List<Cartera> getcarterasEliminados() {
		return this.carterasEliminados;
	}

	public void setCarterasEliminados(List<Cartera> carterasEliminados) {
		this.carterasEliminados = carterasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCartera() {
		return jComboBoxTiposSeleccionarCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCartera(
			JComboBox jComboBoxTiposSeleccionarCartera) {
		this.jComboBoxTiposSeleccionarCartera = jComboBoxTiposSeleccionarCartera;
	}
	
	public void setBorderResaltarTiposSeleccionarCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCartera .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCartera() {
		return jTextFieldValorCampoGeneralCartera;
	}

	public void setjTextFieldValorCampoGeneralCartera(
			JTextField jTextFieldValorCampoGeneralCartera) {
		this.jTextFieldValorCampoGeneralCartera = jTextFieldValorCampoGeneralCartera;
	}

	public void setBorderResaltarValorCampoGeneralCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCartera .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCartera() {
		return this.jCheckBoxSeleccionarTodosCartera;
	}

	public void setjCheckBoxSeleccionarTodosCartera(
			JCheckBox jCheckBoxSeleccionarTodosCartera) {
		this.jCheckBoxSeleccionarTodosCartera = jCheckBoxSeleccionarTodosCartera;
	}

	public void setBorderResaltarSeleccionarTodosCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCartera .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCartera() {
		return this.jCheckBoxSeleccionadosCartera;
	}

	public void setjCheckBoxSeleccionadosCartera(
			JCheckBox jCheckBoxSeleccionadosCartera) {
		this.jCheckBoxSeleccionadosCartera = jCheckBoxSeleccionadosCartera;
	}
	
	public void setBorderResaltarSeleccionadosCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCartera .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCartera() {
		return this.jComboBoxTiposArchivosReportesCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCartera(
			JComboBox jComboBoxTiposArchivosReportesCartera) {
		this.jComboBoxTiposArchivosReportesCartera = jComboBoxTiposArchivosReportesCartera;
	}

	public void setBorderResaltarTiposArchivosReportesCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCartera() {
		return this.jComboBoxTiposReportesCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCartera(
			JComboBox jComboBoxTiposReportesCartera) {
		this.jComboBoxTiposReportesCartera = jComboBoxTiposReportesCartera;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCartera() {
	//	return jComboBoxTiposReportesDinamicoCartera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCartera(
	//		JComboBox jComboBoxTiposReportesDinamicoCartera) {
	//	this.jComboBoxTiposReportesDinamicoCartera = jComboBoxTiposReportesDinamicoCartera;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCartera() {
	//	return jComboBoxTiposArchivosReportesDinamicoCartera;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCartera(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCartera) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCartera = jComboBoxTiposArchivosReportesDinamicoCartera;
	//}
	
	public void setBorderResaltarTiposReportesCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCartera() {
		return this.jComboBoxTiposGraficosReportesCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCartera(
			JComboBox jComboBoxTiposGraficosReportesCartera) {
		this.jComboBoxTiposGraficosReportesCartera = jComboBoxTiposGraficosReportesCartera;
	}
	
	public void setBorderResaltarTiposGraficosReportesCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCartera() {
		return this.jComboBoxTiposPaginacionCartera;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCartera(
			JComboBox jComboBoxTiposPaginacionCartera) {
		this.jComboBoxTiposPaginacionCartera = jComboBoxTiposPaginacionCartera;
	}
	
	public void setBorderResaltarTiposPaginacionCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCartera .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCartera() {
		return this.jComboBoxTiposRelacionesCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCartera() {
		return this.jComboBoxTiposAccionesCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCartera(
			JComboBox jComboBoxTiposRelacionesCartera) {
		this.jComboBoxTiposRelacionesCartera = jComboBoxTiposRelacionesCartera;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCartera(
			JComboBox jComboBoxTiposAccionesCartera) {
		this.jComboBoxTiposAccionesCartera = jComboBoxTiposAccionesCartera;
	}
	
	public void setBorderResaltarTiposRelacionesCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCartera .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCartera() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCartera.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCartera .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCartera() {
	//	return jCheckBoxConGraficoDinamicoCartera;
	//}

	//public void setjCheckBoxConGraficoDinamicoCartera(
	//		JCheckBox jCheckBoxConGraficoDinamicoCartera) {
	//	this.jCheckBoxConGraficoDinamicoCartera = jCheckBoxConGraficoDinamicoCartera;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCartera() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCartera.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCartera .setBorder(borderResaltar);		
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
		this.carteraSessionBean=new CarteraSessionBean();
		
		this.carteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.carteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.carteraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CarteraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CarteraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CarteraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CarteraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cartera MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
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
		
		CarteraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Cartera No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCartera= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCartera,this.jTtoolBarCartera,
							"nuevo","nuevo","Nuevo"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCartera,this.jTtoolBarCartera,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCartera,this.jTtoolBarCartera,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCartera,this.jTtoolBarCartera,
							"duplicar","duplicar","Duplicar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCartera,this.jTtoolBarCartera,
							"copiar","copiar","Copiar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCartera,this.jTtoolBarCartera,
							"ver_form","ver_form","Ver"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCartera,this.jTtoolBarCartera,
							"recargar","recargar","Recargar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCartera,this.jTtoolBarCartera,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCartera,this.jTtoolBarCartera,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCartera,this.jTtoolBarCartera,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCartera,this.jTtoolBarCartera,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCartera,this.jTtoolBarCartera,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCartera=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCartera,this.jTtoolBarCartera,
							"cerrar","cerrar","Salir"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCartera=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCartera;
			
				this.jButtonProcesarInformacionToolBarCartera=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCartera;
				
		//protected JButton jButtonModificarToolBarCartera;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCartera=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCartera=new JMenuMe("General");
		this.jmenuArchivoCartera=new JMenuMe("Archivo");
		this.jmenuAccionesCartera=new JMenuMe("Acciones");
		this.jmenuDatosCartera=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCartera= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCartera.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCartera,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCartera= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCartera.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCartera,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCartera= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCartera.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCartera,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCartera= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCartera.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCartera,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCartera= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCartera.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCartera,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCartera= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCartera.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCartera,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCartera= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCartera.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCartera,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCartera= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCartera.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCartera,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCartera= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCartera.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCartera,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCartera= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCartera.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCartera,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCartera= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCartera.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCartera,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCartera= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCartera.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCartera,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCartera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCartera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCartera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCartera,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCartera= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCartera.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCartera,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCartera= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCartera.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCartera,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCartera= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCartera.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCartera,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCartera.add(this.jMenuItemCerrarCartera);
			
			this.jmenuAccionesCartera.add(this.jMenuItemNuevoCartera);
			this.jmenuAccionesCartera.add(this.jMenuItemNuevoGuardarCambiosCartera);
			this.jmenuAccionesCartera.add(this.jMenuItemNuevoRelacionesCartera);
			this.jmenuAccionesCartera.add(this.jMenuItemGuardarCambiosTablaCartera);		
			this.jmenuAccionesCartera.add(this.jMenuItemDuplicarCartera);		
			this.jmenuAccionesCartera.add(this.jMenuItemCopiarCartera);		
			this.jmenuAccionesCartera.add(this.jMenuItemVerFormCartera);		
			
			this.jmenuDatosCartera.add(this.jMenuItemRecargarInformacionCartera);				
			this.jmenuDatosCartera.add(this.jMenuItemAnterioresCartera);				
			this.jmenuDatosCartera.add(this.jMenuItemSiguientesCartera);				
			this.jmenuDatosCartera.add(this.jMenuItemAbrirOrderByCartera);				
			this.jmenuDatosCartera.add(this.jMenuItemMostrarOcultarCartera);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCartera.add(this.jMenuItemGuardarCambiosCartera);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCartera.add(this.jmenuArchivoCartera);		
			this.jmenuBarCartera.add(this.jmenuAccionesCartera);		
			this.jmenuBarCartera.add(this.jmenuDatosCartera);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCartera);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCartera() {
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
			//this.jInternalFrameDetalleCartera = new CarteraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cartera DATOS");
			this.jInternalFrameDetalleFormCartera = new CarteraDetalleFormJInternalFrame(jDesktopPane,this.carteraSessionBean.getConGuardarRelaciones(),this.carteraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCartera = null;//new CarteraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCartera= new GridBagLayout();
		
		
		this.jTableDatosCartera = new JTableMe();      
		
		String sToolTipCartera="";
		sToolTipCartera=CarteraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCartera+="(Cartera.Cartera)";
		}
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCartera+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCartera.setToolTipText(sToolTipCartera);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCartera);
		this.jTableDatosCartera.setAutoCreateRowSorter(true);
		this.jTableDatosCartera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCartera.setRowSelectionAllowed(true);
		this.jTableDatosCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCartera,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCartera = new JButtonMe();
		this.jButtonDuplicarCartera = new JButtonMe();
		this.jButtonCopiarCartera = new JButtonMe();
		this.jButtonVerFormCartera = new JButtonMe();
		this.jButtonNuevoRelacionesCartera = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCartera = new JButtonMe();
		this.jButtonCerrarCartera = new JButtonMe();
		
		this.jScrollPanelDatosCartera = new JScrollPane();   
        this.jScrollPanelDatosGeneralCartera = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cartera";
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras" + this.sPath));
		} else {
			this.jScrollPanelDatosCartera.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCartera.setToolTipText("Acciones");
        this.jPanelAccionesCartera.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCartera, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCartera, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCartera=new ReporteDinamicoJInternalFrame(CarteraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCartera();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCartera=new ImportacionJInternalFrame(CarteraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCartera();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCartera = new JButtonMe();
		
		this.jButtonAbrirOrderByCartera.setText("Orden");
		this.jButtonAbrirOrderByCartera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCartera,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCartera,false,this);
			
			//this.cargarOrderByCartera(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCartera,true,this);
			
			//this.cargarOrderByCartera(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCartera.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosCartera.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosCartera.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosCartera.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCartera.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCartera.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCartera.setText("Nuevo");
		this.jButtonDuplicarCartera.setText("Duplicar");
		this.jButtonCopiarCartera.setText("Copiar");
		this.jButtonVerFormCartera.setText("Ver");
		this.jButtonNuevoRelacionesCartera.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCartera.setText("Guardar");
		this.jButtonCerrarCartera.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCartera,"nuevo_button","Nuevo",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCartera,"duplicar_button","Duplicar",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCartera,"copiar_button","Copiar",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCartera,"ver_form","Ver",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCartera,"nuevorelaciones_button","Nuevo Rel",this.carteraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCartera,"guardarcambiostabla_button","Guardar",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCartera,"cerrar_button","Salir",this.carteraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCartera.setToolTipText("Nuevo"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCartera.setToolTipText("Duplicar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCartera.setToolTipText("Copiar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCartera.setToolTipText("Ver"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCartera.setToolTipText("Nuevo Rel"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCartera.setToolTipText("Guardar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCartera.setToolTipText("Salir"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCartera";
		inputMap = this.jButtonNuevoCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCartera"));
		
		//DUPLICAR
		sMapKey = "DuplicarCartera";
		inputMap = this.jButtonDuplicarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCartera"));
		
		//COPIAR
		sMapKey = "CopiarCartera";
		inputMap = this.jButtonCopiarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCartera"));
		
		//VEr FORM
		sMapKey = "VerFormCartera";
		inputMap = this.jButtonVerFormCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCartera.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCartera"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCartera";
		inputMap = this.jButtonNuevoRelacionesCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCartera"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCartera";
		inputMap = this.jButtonModificarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCartera"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCartera";
		inputMap = this.jButtonCerrarCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCartera"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCartera";
		inputMap = this.jButtonGuardarCambiosTablaCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCartera"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Cartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Cartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Cartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Cartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Cartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCartera.setName("jPanelParametrosReportesCartera"); 
		
		this.jPanelParametrosReportesAccionesCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCartera.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCartera.setName("jPanelParametrosReportesAccionesCartera"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCartera, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCartera, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCartera = new JButtonMe();
		this.jButtonRecargarInformacionCartera.setText("Recargar");
		this.jButtonRecargarInformacionCartera.setToolTipText("Recargar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCartera,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCartera = new JButtonMe();
		this.jButtonProcesarInformacionCartera.setText("Procesar");
		this.jButtonProcesarInformacionCartera.setToolTipText("Procesar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCartera.setVisible(false);
			
		this.jButtonProcesarInformacionCartera.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCartera.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCartera.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCartera.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCartera.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCartera.setText("TIPO");       
		this.jComboBoxTiposReportesCartera.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCartera = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCartera.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCartera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCartera = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCartera.setText("Paginacion");
		this.jComboBoxTiposPaginacionCartera.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCartera = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCartera.setText("Accion");
		this.jComboBoxTiposRelacionesCartera.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCartera = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCartera.setText("Accion");
		this.jComboBoxTiposAccionesCartera.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCartera = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCartera.setText("Accion");
		this.jComboBoxTiposSeleccionarCartera.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCartera=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCartera.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCartera.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCartera.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCartera = new JLabelMe();
		
		this.jLabelAccionesCartera.setText("Acciones");		
		this.jLabelAccionesCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCartera = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCartera.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCartera.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCartera = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCartera.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCartera.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCartera = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCartera.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCartera.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCartera = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCartera.setText("Graf.");
		this.jCheckBoxConGraficoReporteCartera.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCartera = new JButtonMe();
		//this.jButtonAnterioresCartera.setText("<<");
        this.jButtonAnterioresCartera.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCartera,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCartera = new JButtonMe();
		//this.jButtonSiguientesCartera.setText(">>");
        this.jButtonSiguientesCartera.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCartera,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCartera = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCartera.setText("Nue");
        this.jButtonNuevoGuardarCambiosCartera.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCartera,"nuevoguardarcambios_button","Nue",this.carteraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCartera, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCartera";
		inputMap = this.jButtonNuevoGuardarCambiosCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCartera"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCartera";
		inputMap = this.jButtonRecargarInformacionCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCartera"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCartera";
		inputMap = this.jButtonSiguientesCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCartera"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCartera";
		inputMap = this.jButtonAnterioresCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCartera"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCartera();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCartera.setMinimumSize(new Dimension(this.getWidth(),CarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CarteraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCartera.setMaximumSize(new Dimension(this.getWidth(),CarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CarteraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCartera.setPreferredSize(new Dimension(this.getWidth(),CarteraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CarteraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCartera = new GridBagLayout();

			this.jPanelPaginacionCartera.setLayout(gridaBagLayoutPaginacionCartera);						
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 0;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCartera.add(this.jButtonAnterioresCartera, this.gridBagConstraintsCartera);
					
						
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCartera.gridy = 0;
			
			this.jPanelPaginacionCartera.add(this.jButtonNuevoGuardarCambiosCartera, this.gridBagConstraintsCartera);
						
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCartera.gridy = 0;
			this.jPanelPaginacionCartera.add(this.jButtonSiguientesCartera, this.gridBagConstraintsCartera);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 1;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCartera.add(this.jButtonNuevoCartera, this.gridBagConstraintsCartera);
						
			
			
			if(!this.carteraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCartera = new GridBagConstraints();
				this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCartera.gridy = 1;
				this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCartera.add(this.jButtonGuardarCambiosTablaCartera, this.gridBagConstraintsCartera);
			}
			
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 1;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCartera.add(this.jButtonDuplicarCartera, this.gridBagConstraintsCartera);
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 1;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCartera.add(this.jButtonCopiarCartera, this.gridBagConstraintsCartera);
		
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 1;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCartera.add(this.jButtonVerFormCartera, this.gridBagConstraintsCartera);
		
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 1;
			this.gridBagConstraintsCartera.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCartera.add(this.jButtonCerrarCartera, this.gridBagConstraintsCartera);
		
		
		
		this.jButtonRecargarInformacionCartera.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCartera.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCartera.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCartera.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCartera.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCartera.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCartera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCartera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCartera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCartera.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCartera.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCartera.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCartera.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCartera.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCartera.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCartera.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCartera.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCartera.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCartera.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCartera.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCartera.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCartera, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCartera.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCartera.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCartera.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCartera.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCartera.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCartera.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCartera = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Cartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Cartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Cartera = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Cartera = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCartera.setLayout(gridaBagParametrosReportesCartera);
			this.jPanelParametrosReportesAccionesCartera.setLayout(gridaBagParametrosReportesAccionesCartera);
			
			
			this.jPanelParametrosAuxiliar1Cartera.setLayout(gridaBagParametrosAuxiliar1Cartera);
			this.jPanelParametrosAuxiliar2Cartera.setLayout(gridaBagParametrosAuxiliar2Cartera);
			this.jPanelParametrosAuxiliar3Cartera.setLayout(gridaBagParametrosAuxiliar3Cartera);
			this.jPanelParametrosAuxiliar4Cartera.setLayout(gridaBagParametrosAuxiliar4Cartera);
			//this.jPanelParametrosAuxiliar5Cartera.setLayout(gridaBagParametrosAuxiliar2Cartera);			
			
			
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCartera.add(this.jButtonRecargarInformacionCartera, this.gridBagConstraintsCartera);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cartera.add(this.jComboBoxTiposPaginacionCartera, this.gridBagConstraintsCartera);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cartera.add(this.jCheckBoxConAltoMaximoTablaCartera, this.gridBagConstraintsCartera);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Cartera.add(this.jComboBoxTiposArchivosReportesCartera, this.gridBagConstraintsCartera);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCartera.add(this.jPanelParametrosAuxiliar1Cartera, this.gridBagConstraintsCartera);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Cartera.add(this.jComboBoxTiposReportesCartera, this.gridBagConstraintsCartera);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCartera.add(this.jPanelParametrosAuxiliar4Cartera, this.gridBagConstraintsCartera);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCartera.add(this.jComboBoxTiposReportesCartera, this.gridBagConstraintsCartera);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCartera.add(this.jCheckBoxGenerarReporteCartera, this.gridBagConstraintsCartera);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCartera.add(this.jPanelParametrosAuxiliar2Cartera, this.gridBagConstraintsCartera);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCartera.add(this.jLabelAccionesCartera, this.gridBagConstraintsCartera);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCartera.add(this.jComboBoxTiposSeleccionarCartera, this.gridBagConstraintsCartera);			
			
			
			/*
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCartera.add(this.jCheckBoxSeleccionarTodosCartera, this.gridBagConstraintsCartera);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cartera.add(this.jCheckBoxSeleccionarTodosCartera, this.gridBagConstraintsCartera);															
				
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCartera.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Cartera.add(this.jCheckBoxSeleccionadosCartera, this.gridBagConstraintsCartera);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCartera.add(this.jPanelParametrosAuxiliar3Cartera, this.gridBagConstraintsCartera);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCartera.add(this.jComboBoxTiposAccionesCartera, this.gridBagConstraintsCartera);
	
				
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCartera.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCartera.add(this.jTextFieldValorCampoGeneralCartera, this.gridBagConstraintsCartera);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCartera = new GridBagLayout();

			this.jScrollPanelDatosCartera.setLayout(gridaBagLayoutDatosCartera);
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = 0;
			this.gridBagConstraintsCartera.gridx = 0;
			
			this.jScrollPanelDatosCartera.add(this.jTableDatosCartera, this.gridBagConstraintsCartera);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCartera.setViewportView(this.jTableDatosCartera);
		this.jTableDatosCartera.setFillsViewportHeight(true);
		this.jTableDatosCartera.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCartera= new GridBagLayout();
		this.jPanelAccionesCartera.setLayout(gridaBagLayoutAccionesCartera);
		
		
		/*	
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = 0;
		this.gridBagConstraintsCartera.gridx = 0;
			
		this.jPanelAccionesCartera.add(this.jButtonNuevoCartera, this.gridBagConstraintsCartera);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCartera = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCartera);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.carteraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCartera = new GridBagConstraints();						
			this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCartera.gridx = 0;		
			//this.gridBagConstraintsCartera.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCartera.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCartera, this.gridBagConstraintsCartera);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCartera.gridx = 0;		
		//this.gridBagConstraintsCartera.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCartera.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCartera);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCartera, this.gridBagConstraintsCartera);								
		
		
		/*
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCartera, this.gridBagConstraintsCartera);
		*/		
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCartera.gridx =0;
		this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCartera.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCartera, this.gridBagConstraintsCartera);
				
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCartera, this.gridBagConstraintsCartera);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CarteraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCartera= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCartera = new GridBagLayout();
			this.jPanelBusquedasParametrosCartera.setLayout(gridaBagLayoutBusquedasParametrosCartera);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCartera=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCartera.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCartera.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCartera.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCartera, this.gridBagConstraintsCartera);
			
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCartera, this.gridBagConstraintsCartera);
		
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCartera.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCartera, this.gridBagConstraintsCartera);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCartera;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCartera() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCartera = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCartera.setName("jPanelReporteDinamicoCartera"); 
		
		this.jPanelReporteDinamicoCartera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCartera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCartera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCartera.setLayout(gridaBagLayoutReporteDinamicoCartera);
		
		
		this.jInternalFrameReporteDinamicoCartera= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCartera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCartera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCartera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCartera.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCartera.setResizable(true);
	    this.jInternalFrameReporteDinamicoCartera.setClosable(true);
	    this.jInternalFrameReporteDinamicoCartera.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCartera.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCartera.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCartera.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCartera = new JLabelMe();

		this.jLabelColumnasSelectReporteCartera.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCartera.add(this.jLabelColumnasSelectReporteCartera, this.gridBagConstraintsCartera);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCartera = new JList<Reporte>();
		this.jListColumnasSelectReporteCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCartera.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCartera.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCartera.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCartera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCartera=new JScrollPane(this.jListColumnasSelectReporteCartera);
			
			this.jScrollColumnasSelectReporteCartera.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCartera.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCartera.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCartera.add(this.jListColumnasSelectReporteCartera, this.gridBagConstraintsCartera);
		this.jPanelReporteDinamicoCartera.add(this.jScrollColumnasSelectReporteCartera, this.gridBagConstraintsCartera);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCartera = new JLabelMe();

		this.jLabelRelacionesSelectReporteCartera.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCartera = new JList<Reporte>();
		this.jListRelacionesSelectReporteCartera.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCartera.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCartera.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCartera.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCartera.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCartera=new JScrollPane(this.jListRelacionesSelectReporteCartera);
			
			this.jScrollRelacionesSelectReporteCartera.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCartera.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCartera.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCartera = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCartera = new JComboBoxMe();
		this.jListColumnasValoresGraficoCartera = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCartera = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCartera.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCartera = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCartera.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCartera.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCartera.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCartera.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCartera = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCartera.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCartera.add(this.jLabelGenerarExcelReporteDinamicoCartera, this.gridBagConstraintsCartera);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCartera = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCartera.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCartera,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCartera.setToolTipText("Generar EXCEL"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCartera = new GridBagConstraints();
		//this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCartera.add(this.jButtonGenerarExcelReporteDinamicoCartera, this.gridBagConstraintsCartera);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCartera.add(this.jComboBoxTiposReportesDinamicoCartera, this.gridBagConstraintsCartera);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCartera = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCartera.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCartera.add(this.jLabelTiposArchivoReporteDinamicoCartera, this.gridBagConstraintsCartera);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCartera.add(this.jComboBoxTiposArchivosReportesDinamicoCartera, this.gridBagConstraintsCartera);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCartera = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCartera.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCartera,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCartera.setToolTipText("Generar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCartera.add(this.jButtonGenerarReporteDinamicoCartera, this.gridBagConstraintsCartera);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCartera = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCartera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCartera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCartera.setToolTipText("Cancelar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCartera.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCartera.add(this.jButtonCerrarReporteDinamicoCartera, this.gridBagConstraintsCartera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCartera = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCartera= new JScrollPane(jPanelReporteDinamicoCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCartera.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCartera.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCartera.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCartera.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCartera.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCartera);
		this.jInternalFrameReporteDinamicoCartera.getContentPane().add(this.jScrollPanelReporteDinamicoCartera, this.gridBagConstraintsCartera);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCartera() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCartera = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCartera.setName("jPanelImportacionCartera"); 
		
		this.jPanelImportacionCartera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCartera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCartera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCartera.setLayout(gridaBagLayoutImportacionCartera);
		
		
		this.jInternalFrameImportacionCartera= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCartera= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCartera = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCartera= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCartera.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCartera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCartera.setResizable(true);
	    this.jInternalFrameImportacionCartera.setClosable(true);
	    this.jInternalFrameImportacionCartera.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCartera.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCartera.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCartera.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCartera.setResizable(true);
	    this.jInternalFrameImportacionCartera.setClosable(true);
	    this.jInternalFrameImportacionCartera.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCartera.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCartera.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCartera.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCartera = new JLabelMe();

		this.jLabelArchivoImportacionCartera.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;		
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCartera.add(this.jLabelArchivoImportacionCartera, this.gridBagConstraintsCartera);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCartera = new JFileChooser();		
		this.jFileChooserImportacionCartera.setToolTipText("ESCOGER ARCHIVO"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCartera = new JButtonMe();
		this.jButtonAbrirImportacionCartera.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCartera,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCartera.setToolTipText("Generar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCartera.add(this.jButtonAbrirImportacionCartera, this.gridBagConstraintsCartera);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCartera = new JLabelMe();

		this.jLabelPathArchivoImportacionCartera.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCartera.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCartera.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCartera.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;		
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCartera.add(this.jLabelPathArchivoImportacionCartera, this.gridBagConstraintsCartera);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCartera=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCartera.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCartera.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCartera.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCartera.add(this.jTextFieldPathArchivoImportacionCartera, this.gridBagConstraintsCartera);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCartera = new JButtonMe();
		this.jButtonGenerarImportacionCartera.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCartera,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCartera.setToolTipText("Generar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCartera.add(this.jButtonGenerarImportacionCartera, this.gridBagConstraintsCartera);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCartera = new JButtonMe();
		this.jButtonCerrarImportacionCartera.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCartera,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCartera.setToolTipText("Cancelar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCartera.gridy = iPosYImportacion;
		this.gridBagConstraintsCartera.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCartera.add(this.jButtonCerrarImportacionCartera, this.gridBagConstraintsCartera);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCartera = new GridBagLayout();
		
		this.jScrollPanelImportacionCartera= new JScrollPane(jPanelImportacionCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCartera = new GridBagConstraints();
		this.gridBagConstraintsCartera.gridy =iPosYImportacion;
		this.gridBagConstraintsCartera.gridx =iPosXImportacion;
		this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCartera.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCartera);
		this.jInternalFrameImportacionCartera.getContentPane().add(this.jScrollPanelImportacionCartera, this.gridBagConstraintsCartera);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCartera(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCartera = new JButtonMe();
			this.jButtonAbrirOrderByCartera.setText("Orden");
			this.jButtonAbrirOrderByCartera.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCartera,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCartera";
			inputMap = this.jButtonAbrirOrderByCartera.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCartera.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCartera"));
		
		
			GridBagLayout gridaBagLayoutOrderByCartera = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCartera = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCartera.setName("jPanelOrderByCartera"); 
			
			this.jPanelOrderByCartera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCartera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCartera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCartera.setLayout(gridaBagLayoutOrderByCartera);
			
			
			this.jTableDatosCarteraOrderBy = new JTableMe();        
			this.jTableDatosCarteraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCarteraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCarteraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCarteraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCarteraOrderBy.setViewportView(this.jTableDatosCarteraOrderBy);
			this.jTableDatosCarteraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCarteraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCartera= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCartera= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCartera = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCartera= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCartera.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCartera.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCartera.setTitle("Orden");
			this.jInternalFrameOrderByCartera.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCartera.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCartera.setResizable(true);
			this.jInternalFrameOrderByCartera.setClosable(true);
			this.jInternalFrameOrderByCartera.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCartera.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCartera.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCartera.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCartera.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Carteras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCartera.gridx =iPosXOrderBy;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCartera.ipady =150;
				
			this.jPanelOrderByCartera.add(jScrollPanelDatosCarteraOrderBy, this.gridBagConstraintsCartera);//this.jTableDatosCarteraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCartera = new JButtonMe();
			this.jButtonCerrarOrderByCartera.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCartera,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCartera.setToolTipText("Cancelar"+" "+CarteraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCartera, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCartera.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCartera.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCartera.add(this.jButtonCerrarOrderByCartera, this.gridBagConstraintsCartera);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCartera = new GridBagLayout();
			
			this.jScrollPanelOrderByCartera= new JScrollPane(jPanelOrderByCartera,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCartera = new GridBagConstraints();
			this.gridBagConstraintsCartera.gridy =iPosYOrderBy;
			this.gridBagConstraintsCartera.gridx =iPosXOrderBy;
			this.gridBagConstraintsCartera.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCartera.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCartera.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCartera);
			
			this.jInternalFrameOrderByCartera.getContentPane().add(this.jScrollPanelOrderByCartera, this.gridBagConstraintsCartera);			
		
		} else {
			this.jButtonAbrirOrderByCartera = new JButtonMe();
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
			&& this.carteraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCartera.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCartera.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCartera.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCartera.getRowHeight();//CarteraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.carteraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCartera.isSelected()) {
					iHeightTable=CarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCartera.isSelected()) {
					iHeightTable=CarteraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CarteraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCartera.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCartera.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCartera.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCartera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCartera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCartera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCartera!=null && this.jInternalFrameOrderByCartera.getjTableDatosOrderBy()!=null) {
			//if(!this.carteraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCartera.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCartera.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCartera.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCartera.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCartera.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCartera.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCartera.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=carteraLogic.getCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=carteras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Cartera> TraerCarteraBeans(List<Cartera> carteras,ArrayList<Classe> classes)throws Exception {
		try {
			for(Cartera cartera:carteras) {
					
				if(!(CarteraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CarteraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cartera.setsDetalleGeneralEntityReporte(CarteraConstantesFunciones.getCarteraDescripcion(cartera));
										
						
					
						
					
				} else  {
							
					//cartera.setsDetalleGeneralEntityReporte(cartera.getsDetalleGeneralEntityReporte());
										
				}
				
				//carterabeans.add(carterabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return carteras;
    }
	//PARA REPORTES FIN
}
