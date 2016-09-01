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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.FacturacionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class FacturacionJInternalFrame extends FacturacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFacturacion;
	
	protected JMenuBar jmenuBarFacturacion;
	
	protected JMenu jmenuFacturacion;
	protected JMenu jmenuDatosFacturacion;
	protected JMenu jmenuArchivoFacturacion;
	protected JMenu jmenuAccionesFacturacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturacion;	
	protected GridBagConstraints gridBagConstraintsFacturacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturacionDetalleFormJInternalFrame jInternalFrameDetalleFormFacturacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFacturacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFacturacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public FacturacionSessionBean facturacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Facturacion> facturacions;		
	public List<Facturacion> facturacionsEliminados;	
	public List<Facturacion> facturacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFacturacion;		
	protected JButton jButtonAbrirOrderByFacturacion;
	
	
	//protected JPanel jPanelOrderByFacturacion;
	//public JScrollPane jScrollPanelOrderByFacturacion;	
	//protected JButton jButtonCerrarOrderByFacturacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturacionLogic facturacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFacturacion;
	public JScrollPane jScrollPanelDatosEdicionFacturacion;
	public JScrollPane jScrollPanelDatosGeneralFacturacion;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFacturacion;
	//public JScrollPane jScrollPanelImportacionFacturacion;
	
	
	
	protected JPanel jPanelAccionesFacturacion;
	
    protected JPanel jPanelPaginacionFacturacion;
    protected JPanel jPanelParametrosReportesFacturacion;
	protected JPanel jPanelParametrosReportesAccionesFacturacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Facturacion;
	protected JPanel jPanelParametrosAuxiliar2Facturacion;
	protected JPanel jPanelParametrosAuxiliar3Facturacion;
	protected JPanel jPanelParametrosAuxiliar4Facturacion;
	//protected JPanel jPanelParametrosAuxiliar5Facturacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoFacturacion;
	//protected JPanel jPanelImportacionFacturacion;
	
	
	public JTable jTableDatosFacturacion;
	
	
	
	//public JTable jTableDatosFacturacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFacturacion;
	protected JButton jButtonDuplicarFacturacion;
	protected JButton jButtonCopiarFacturacion;
	protected JButton jButtonVerFormFacturacion;
	protected JButton jButtonNuevoRelacionesFacturacion;
	protected JButton jButtonModificarFacturacion;
	
    protected JButton jButtonGuardarCambiosTablaFacturacion;
	protected JButton jButtonCerrarFacturacion;
	
	
	protected JButton jButtonRecargarInformacionFacturacion;
	protected JButton jButtonProcesarInformacionFacturacion;
	
	
	protected JButton jButtonAnterioresFacturacion;
	protected JButton jButtonSiguientesFacturacion;
	protected JButton jButtonNuevoGuardarCambiosFacturacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFacturacion;
	//protected JButton jButtonCerrarReporteDinamicoFacturacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoFacturacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionFacturacion;
	//protected JButton jButtonGenerarImportacionFacturacion;
	//protected JButton jButtonCerrarImportacionFacturacion;
	//protected JFileChooser jFileChooserImportacionFacturacion;
	//protected File fileImportacionFacturacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturacion;
	protected JButton jButtonDuplicarToolBarFacturacion;
	protected JButton jButtonNuevoRelacionesToolBarFacturacion;
	
	
	public JButton jButtonGuardarCambiosToolBarFacturacion;
	protected JButton jButtonCopiarToolBarFacturacion;
	protected JButton jButtonVerFormToolBarFacturacion;
	public JButton jButtonGuardarCambiosTablaToolBarFacturacion;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturacion;
	protected JButton jButtonCerrarToolBarFacturacion;
	
	protected JButton jButtonRecargarInformacionToolBarFacturacion;
	protected JButton jButtonProcesarInformacionToolBarFacturacion;
	protected JButton jButtonAnterioresToolBarFacturacion;
	protected JButton jButtonSiguientesToolBarFacturacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarFacturacion;
	protected JButton jButtonAbrirOrderByToolBarFacturacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturacion;
	protected JMenuItem jMenuItemDuplicarFacturacion;
	protected JMenuItem jMenuItemNuevoRelacionesFacturacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFacturacion;
	protected JMenuItem jMenuItemCopiarFacturacion;
	protected JMenuItem jMenuItemVerFormFacturacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturacion;
	protected JMenuItem jMenuItemCerrarFacturacion;
	protected JMenuItem jMenuItemDetalleCerrarFacturacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFacturacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturacion;
	
	protected JMenuItem jMenuItemRecargarInformacionFacturacion;
	protected JMenuItem jMenuItemProcesarInformacionFacturacion;
	protected JMenuItem jMenuItemAnterioresFacturacion;
	protected JMenuItem jMenuItemSiguientesFacturacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturacion;
	protected JMenuItem jMenuItemAbrirOrderByFacturacion;
	protected JMenuItem jMenuItemMostrarOcultarFacturacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFacturacion;
	protected JCheckBox jCheckBoxSeleccionadosFacturacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFacturacion;
	protected JCheckBox jCheckBoxConGraficoReporteFacturacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFacturacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFacturacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFacturacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFacturacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFacturacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFacturacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFacturacion;
	protected JTextField jTextFieldValorCampoGeneralFacturacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFacturacion;
	//public JList<Reporte> jListColumnasSelectReporteFacturacion;
	//public JScrollPane jScrollColumnasSelectReporteFacturacion;
	
	//public JLabel jLabelRelacionesSelectReporteFacturacion;
	//public JList<Reporte> jListRelacionesSelectReporteFacturacion;
	//public JScrollPane jScrollRelacionesSelectReporteFacturacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFacturacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFacturacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFacturacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoFacturacion;
	
		
	//public JLabel jLabelArchivoImportacionFacturacion;	
	//public JLabel jLabelPathArchivoImportacionFacturacion;
	//protected JTextField jTextFieldPathArchivoImportacionFacturacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFacturacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFacturacion;
	
	//public JLabel jLabelColumnaCategoriaValorFacturacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFacturacion;
	
	//public JLabel jLabelColumnasValoresGraficoFacturacion;
	//public JList<Reporte> jListColumnasValoresGraficoFacturacion;
	//public JScrollPane jScrollColumnasValoresGraficoFacturacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFacturacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFacturacion;	
	
	
	
	
	
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
	public FacturacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFacturacion)	{
		this.jButtonRecargarInformacionFacturacion = jButtonRecargarInformacionFacturacion;
	}
	
	public JButton getjButtonProcesarInformacionFacturacion() {
		return this.jButtonProcesarInformacionFacturacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturacion)	{
		this.jButtonProcesarInformacionFacturacion = jButtonProcesarInformacionFacturacion;
	}
	
	
	public JButton getjButtonRecargarInformacionFacturacion() {
		return this.jButtonRecargarInformacionFacturacion;
	}
	
	
	public List<Facturacion> getfacturacions() {
		return this.facturacions;
	}

	public void setfacturacions(List<Facturacion> facturacions) {
		this.facturacions = facturacions;
	}
	
	public List<Facturacion> getfacturacionsAux() {
		return this.facturacionsAux;
	}

	public void setfacturacionsAux(List<Facturacion> facturacionsAux) {
		this.facturacionsAux = facturacionsAux;
	}
	
	public List<Facturacion> getfacturacionsEliminados() {
		return this.facturacionsEliminados;
	}

	public void setFacturacionsEliminados(List<Facturacion> facturacionsEliminados) {
		this.facturacionsEliminados = facturacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFacturacion() {
		return jComboBoxTiposSeleccionarFacturacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFacturacion(
			JComboBox jComboBoxTiposSeleccionarFacturacion) {
		this.jComboBoxTiposSeleccionarFacturacion = jComboBoxTiposSeleccionarFacturacion;
	}
	
	public void setBorderResaltarTiposSeleccionarFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFacturacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFacturacion() {
		return jTextFieldValorCampoGeneralFacturacion;
	}

	public void setjTextFieldValorCampoGeneralFacturacion(
			JTextField jTextFieldValorCampoGeneralFacturacion) {
		this.jTextFieldValorCampoGeneralFacturacion = jTextFieldValorCampoGeneralFacturacion;
	}

	public void setBorderResaltarValorCampoGeneralFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFacturacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFacturacion() {
		return this.jCheckBoxSeleccionarTodosFacturacion;
	}

	public void setjCheckBoxSeleccionarTodosFacturacion(
			JCheckBox jCheckBoxSeleccionarTodosFacturacion) {
		this.jCheckBoxSeleccionarTodosFacturacion = jCheckBoxSeleccionarTodosFacturacion;
	}

	public void setBorderResaltarSeleccionarTodosFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFacturacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFacturacion() {
		return this.jCheckBoxSeleccionadosFacturacion;
	}

	public void setjCheckBoxSeleccionadosFacturacion(
			JCheckBox jCheckBoxSeleccionadosFacturacion) {
		this.jCheckBoxSeleccionadosFacturacion = jCheckBoxSeleccionadosFacturacion;
	}
	
	public void setBorderResaltarSeleccionadosFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFacturacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFacturacion() {
		return this.jComboBoxTiposArchivosReportesFacturacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFacturacion(
			JComboBox jComboBoxTiposArchivosReportesFacturacion) {
		this.jComboBoxTiposArchivosReportesFacturacion = jComboBoxTiposArchivosReportesFacturacion;
	}

	public void setBorderResaltarTiposArchivosReportesFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFacturacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFacturacion() {
		return this.jComboBoxTiposReportesFacturacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFacturacion(
			JComboBox jComboBoxTiposReportesFacturacion) {
		this.jComboBoxTiposReportesFacturacion = jComboBoxTiposReportesFacturacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFacturacion() {
	//	return jComboBoxTiposReportesDinamicoFacturacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFacturacion(
	//		JComboBox jComboBoxTiposReportesDinamicoFacturacion) {
	//	this.jComboBoxTiposReportesDinamicoFacturacion = jComboBoxTiposReportesDinamicoFacturacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFacturacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoFacturacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFacturacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFacturacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFacturacion = jComboBoxTiposArchivosReportesDinamicoFacturacion;
	//}
	
	public void setBorderResaltarTiposReportesFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFacturacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFacturacion() {
		return this.jComboBoxTiposGraficosReportesFacturacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFacturacion(
			JComboBox jComboBoxTiposGraficosReportesFacturacion) {
		this.jComboBoxTiposGraficosReportesFacturacion = jComboBoxTiposGraficosReportesFacturacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFacturacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFacturacion() {
		return this.jComboBoxTiposPaginacionFacturacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFacturacion(
			JComboBox jComboBoxTiposPaginacionFacturacion) {
		this.jComboBoxTiposPaginacionFacturacion = jComboBoxTiposPaginacionFacturacion;
	}
	
	public void setBorderResaltarTiposPaginacionFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFacturacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFacturacion() {
		return this.jComboBoxTiposRelacionesFacturacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturacion() {
		return this.jComboBoxTiposAccionesFacturacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturacion(
			JComboBox jComboBoxTiposRelacionesFacturacion) {
		this.jComboBoxTiposRelacionesFacturacion = jComboBoxTiposRelacionesFacturacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturacion(
			JComboBox jComboBoxTiposAccionesFacturacion) {
		this.jComboBoxTiposAccionesFacturacion = jComboBoxTiposAccionesFacturacion;
	}
	
	public void setBorderResaltarTiposRelacionesFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFacturacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFacturacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFacturacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFacturacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFacturacion() {
	//	return jCheckBoxConGraficoDinamicoFacturacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoFacturacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoFacturacion) {
	//	this.jCheckBoxConGraficoDinamicoFacturacion = jCheckBoxConGraficoDinamicoFacturacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFacturacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFacturacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFacturacion .setBorder(borderResaltar);		
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
		this.facturacionSessionBean=new FacturacionSessionBean();
		
		this.facturacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFacturacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFacturacion,this.jTtoolBarFacturacion,
							"nuevo","nuevo","Nuevo"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFacturacion,this.jTtoolBarFacturacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFacturacion,this.jTtoolBarFacturacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFacturacion,this.jTtoolBarFacturacion,
							"duplicar","duplicar","Duplicar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFacturacion,this.jTtoolBarFacturacion,
							"copiar","copiar","Copiar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFacturacion,this.jTtoolBarFacturacion,
							"ver_form","ver_form","Ver"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacion,this.jTtoolBarFacturacion,
							"recargar","recargar","Recargar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacion,this.jTtoolBarFacturacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFacturacion,this.jTtoolBarFacturacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFacturacion,this.jTtoolBarFacturacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFacturacion,this.jTtoolBarFacturacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFacturacion,this.jTtoolBarFacturacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFacturacion,this.jTtoolBarFacturacion,
							"cerrar","cerrar","Salir"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFacturacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFacturacion;
			
				this.jButtonProcesarInformacionToolBarFacturacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFacturacion;
				
		//protected JButton jButtonModificarToolBarFacturacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFacturacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFacturacion=new JMenuMe("General");
		this.jmenuArchivoFacturacion=new JMenuMe("Archivo");
		this.jmenuAccionesFacturacion=new JMenuMe("Acciones");
		this.jmenuDatosFacturacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFacturacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFacturacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFacturacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFacturacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFacturacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFacturacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFacturacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFacturacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFacturacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFacturacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFacturacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFacturacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFacturacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFacturacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFacturacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFacturacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFacturacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFacturacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFacturacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFacturacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFacturacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFacturacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFacturacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFacturacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFacturacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFacturacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFacturacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFacturacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFacturacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFacturacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFacturacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFacturacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFacturacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFacturacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFacturacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFacturacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFacturacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFacturacion.add(this.jMenuItemCerrarFacturacion);
			
			this.jmenuAccionesFacturacion.add(this.jMenuItemNuevoFacturacion);
			this.jmenuAccionesFacturacion.add(this.jMenuItemNuevoGuardarCambiosFacturacion);
			this.jmenuAccionesFacturacion.add(this.jMenuItemNuevoRelacionesFacturacion);
			this.jmenuAccionesFacturacion.add(this.jMenuItemGuardarCambiosTablaFacturacion);		
			this.jmenuAccionesFacturacion.add(this.jMenuItemDuplicarFacturacion);		
			this.jmenuAccionesFacturacion.add(this.jMenuItemCopiarFacturacion);		
			this.jmenuAccionesFacturacion.add(this.jMenuItemVerFormFacturacion);		
			
			this.jmenuDatosFacturacion.add(this.jMenuItemRecargarInformacionFacturacion);				
			this.jmenuDatosFacturacion.add(this.jMenuItemAnterioresFacturacion);				
			this.jmenuDatosFacturacion.add(this.jMenuItemSiguientesFacturacion);				
			this.jmenuDatosFacturacion.add(this.jMenuItemAbrirOrderByFacturacion);				
			this.jmenuDatosFacturacion.add(this.jMenuItemMostrarOcultarFacturacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFacturacion.add(this.jMenuItemGuardarCambiosFacturacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFacturacion.add(this.jmenuArchivoFacturacion);		
			this.jmenuBarFacturacion.add(this.jmenuAccionesFacturacion);		
			this.jmenuBarFacturacion.add(this.jmenuDatosFacturacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFacturacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFacturacion() {
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
			//this.jInternalFrameDetalleFacturacion = new FacturacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Facturacion DATOS");
			this.jInternalFrameDetalleFormFacturacion = new FacturacionDetalleFormJInternalFrame(jDesktopPane,this.facturacionSessionBean.getConGuardarRelaciones(),this.facturacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFacturacion = null;//new FacturacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturacion= new GridBagLayout();
		
		
		this.jTableDatosFacturacion = new JTableMe();      
		
		String sToolTipFacturacion="";
		sToolTipFacturacion=FacturacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturacion+="(Facturacion.Facturacion)";
		}
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFacturacion.setToolTipText(sToolTipFacturacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFacturacion);
		this.jTableDatosFacturacion.setAutoCreateRowSorter(true);
		this.jTableDatosFacturacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFacturacion.setRowSelectionAllowed(true);
		this.jTableDatosFacturacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFacturacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFacturacion = new JButtonMe();
		this.jButtonDuplicarFacturacion = new JButtonMe();
		this.jButtonCopiarFacturacion = new JButtonMe();
		this.jButtonVerFormFacturacion = new JButtonMe();
		this.jButtonNuevoRelacionesFacturacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFacturacion = new JButtonMe();
		this.jButtonCerrarFacturacion = new JButtonMe();
		
		this.jScrollPanelDatosFacturacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralFacturacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Facturacion";
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturacion.setToolTipText("Acciones");
        this.jPanelAccionesFacturacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFacturacion=new ReporteDinamicoJInternalFrame(FacturacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFacturacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFacturacion=new ImportacionJInternalFrame(FacturacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFacturacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFacturacion = new JButtonMe();
		
		this.jButtonAbrirOrderByFacturacion.setText("Orden");
		this.jButtonAbrirOrderByFacturacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacion,false,this);
			
			//this.cargarOrderByFacturacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFacturacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFacturacion,true,this);
			
			//this.cargarOrderByFacturacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFacturacion.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosFacturacion.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosFacturacion.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosFacturacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFacturacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFacturacion.setText("Nuevo");
		this.jButtonDuplicarFacturacion.setText("Duplicar");
		this.jButtonCopiarFacturacion.setText("Copiar");
		this.jButtonVerFormFacturacion.setText("Ver");
		this.jButtonNuevoRelacionesFacturacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFacturacion.setText("Guardar");
		this.jButtonCerrarFacturacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturacion,"nuevo_button","Nuevo",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFacturacion,"duplicar_button","Duplicar",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFacturacion,"copiar_button","Copiar",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFacturacion,"ver_form","Ver",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFacturacion,"nuevorelaciones_button","Nuevo Rel",this.facturacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturacion,"guardarcambiostabla_button","Guardar",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturacion,"cerrar_button","Salir",this.facturacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFacturacion.setToolTipText("Nuevo"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFacturacion.setToolTipText("Duplicar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFacturacion.setToolTipText("Copiar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFacturacion.setToolTipText("Ver"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFacturacion.setToolTipText("Nuevo Rel"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFacturacion.setToolTipText("Guardar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturacion.setToolTipText("Salir"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturacion";
		inputMap = this.jButtonNuevoFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarFacturacion";
		inputMap = this.jButtonDuplicarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFacturacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFacturacion"));
		
		//COPIAR
		sMapKey = "CopiarFacturacion";
		inputMap = this.jButtonCopiarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFacturacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFacturacion"));
		
		//VEr FORM
		sMapKey = "VerFormFacturacion";
		inputMap = this.jButtonVerFormFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFacturacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFacturacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFacturacion";
		inputMap = this.jButtonNuevoRelacionesFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFacturacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFacturacion";
		inputMap = this.jButtonModificarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFacturacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFacturacion";
		inputMap = this.jButtonCerrarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturacion";
		inputMap = this.jButtonGuardarCambiosTablaFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Facturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Facturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Facturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Facturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Facturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFacturacion.setName("jPanelParametrosReportesFacturacion"); 
		
		this.jPanelParametrosReportesAccionesFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFacturacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFacturacion.setName("jPanelParametrosReportesAccionesFacturacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFacturacion = new JButtonMe();
		this.jButtonRecargarInformacionFacturacion.setText("Recargar");
		this.jButtonRecargarInformacionFacturacion.setToolTipText("Recargar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFacturacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFacturacion = new JButtonMe();
		this.jButtonProcesarInformacionFacturacion.setText("Procesar");
		this.jButtonProcesarInformacionFacturacion.setToolTipText("Procesar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFacturacion.setVisible(false);
			
		this.jButtonProcesarInformacionFacturacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFacturacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFacturacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacion.setText("TIPO");       
		this.jComboBoxTiposReportesFacturacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFacturacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFacturacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFacturacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionFacturacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFacturacion.setText("Accion");
		this.jComboBoxTiposRelacionesFacturacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturacion.setText("Accion");
		this.jComboBoxTiposAccionesFacturacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFacturacion.setText("Accion");
		this.jComboBoxTiposSeleccionarFacturacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFacturacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFacturacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFacturacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFacturacion = new JLabelMe();
		
		this.jLabelAccionesFacturacion.setText("Acciones");		
		this.jLabelAccionesFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFacturacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFacturacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFacturacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFacturacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFacturacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFacturacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFacturacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFacturacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFacturacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFacturacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFacturacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteFacturacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFacturacion = new JButtonMe();
		//this.jButtonAnterioresFacturacion.setText("<<");
        this.jButtonAnterioresFacturacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFacturacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFacturacion = new JButtonMe();
		//this.jButtonSiguientesFacturacion.setText(">>");
        this.jButtonSiguientesFacturacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFacturacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFacturacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFacturacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosFacturacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFacturacion,"nuevoguardarcambios_button","Nue",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFacturacion";
		inputMap = this.jButtonNuevoGuardarCambiosFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFacturacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFacturacion";
		inputMap = this.jButtonRecargarInformacionFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFacturacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFacturacion";
		inputMap = this.jButtonSiguientesFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFacturacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFacturacion";
		inputMap = this.jButtonAnterioresFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFacturacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFacturacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFacturacion.setMinimumSize(new Dimension(this.getWidth(),FacturacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturacion.setMaximumSize(new Dimension(this.getWidth(),FacturacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFacturacion.setPreferredSize(new Dimension(this.getWidth(),FacturacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFacturacion = new GridBagLayout();

			this.jPanelPaginacionFacturacion.setLayout(gridaBagLayoutPaginacionFacturacion);						
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 0;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFacturacion.add(this.jButtonAnterioresFacturacion, this.gridBagConstraintsFacturacion);
					
						
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturacion.gridy = 0;
			
			this.jPanelPaginacionFacturacion.add(this.jButtonNuevoGuardarCambiosFacturacion, this.gridBagConstraintsFacturacion);
						
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFacturacion.gridy = 0;
			this.jPanelPaginacionFacturacion.add(this.jButtonSiguientesFacturacion, this.gridBagConstraintsFacturacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 1;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacion.add(this.jButtonNuevoFacturacion, this.gridBagConstraintsFacturacion);
						
			
			
			if(!this.facturacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFacturacion = new GridBagConstraints();
				this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFacturacion.gridy = 1;
				this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFacturacion.add(this.jButtonGuardarCambiosTablaFacturacion, this.gridBagConstraintsFacturacion);
			}
			
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 1;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacion.add(this.jButtonDuplicarFacturacion, this.gridBagConstraintsFacturacion);
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 1;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacion.add(this.jButtonCopiarFacturacion, this.gridBagConstraintsFacturacion);
		
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 1;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFacturacion.add(this.jButtonVerFormFacturacion, this.gridBagConstraintsFacturacion);
		
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 1;
			this.gridBagConstraintsFacturacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFacturacion.add(this.jButtonCerrarFacturacion, this.gridBagConstraintsFacturacion);
		
		
		
		this.jButtonRecargarInformacionFacturacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFacturacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFacturacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFacturacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFacturacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFacturacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFacturacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFacturacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFacturacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFacturacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFacturacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFacturacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFacturacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFacturacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFacturacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFacturacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFacturacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFacturacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFacturacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFacturacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFacturacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFacturacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFacturacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFacturacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFacturacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Facturacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Facturacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Facturacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Facturacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFacturacion.setLayout(gridaBagParametrosReportesFacturacion);
			this.jPanelParametrosReportesAccionesFacturacion.setLayout(gridaBagParametrosReportesAccionesFacturacion);
			
			
			this.jPanelParametrosAuxiliar1Facturacion.setLayout(gridaBagParametrosAuxiliar1Facturacion);
			this.jPanelParametrosAuxiliar2Facturacion.setLayout(gridaBagParametrosAuxiliar2Facturacion);
			this.jPanelParametrosAuxiliar3Facturacion.setLayout(gridaBagParametrosAuxiliar3Facturacion);
			this.jPanelParametrosAuxiliar4Facturacion.setLayout(gridaBagParametrosAuxiliar4Facturacion);
			//this.jPanelParametrosAuxiliar5Facturacion.setLayout(gridaBagParametrosAuxiliar2Facturacion);			
			
			
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacion.add(this.jButtonRecargarInformacionFacturacion, this.gridBagConstraintsFacturacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Facturacion.add(this.jComboBoxTiposPaginacionFacturacion, this.gridBagConstraintsFacturacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Facturacion.add(this.jCheckBoxConAltoMaximoTablaFacturacion, this.gridBagConstraintsFacturacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Facturacion.add(this.jComboBoxTiposArchivosReportesFacturacion, this.gridBagConstraintsFacturacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacion.add(this.jPanelParametrosAuxiliar1Facturacion, this.gridBagConstraintsFacturacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Facturacion.add(this.jComboBoxTiposReportesFacturacion, this.gridBagConstraintsFacturacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacion.add(this.jPanelParametrosAuxiliar4Facturacion, this.gridBagConstraintsFacturacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacion.add(this.jComboBoxTiposReportesFacturacion, this.gridBagConstraintsFacturacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacion.add(this.jCheckBoxGenerarReporteFacturacion, this.gridBagConstraintsFacturacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacion.add(this.jPanelParametrosAuxiliar2Facturacion, this.gridBagConstraintsFacturacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacion.add(this.jLabelAccionesFacturacion, this.gridBagConstraintsFacturacion);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacion.add(this.jComboBoxTiposSeleccionarFacturacion, this.gridBagConstraintsFacturacion);			
			
			
			/*
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFacturacion.add(this.jCheckBoxSeleccionarTodosFacturacion, this.gridBagConstraintsFacturacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Facturacion.add(this.jCheckBoxSeleccionarTodosFacturacion, this.gridBagConstraintsFacturacion);															
				
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFacturacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Facturacion.add(this.jCheckBoxSeleccionadosFacturacion, this.gridBagConstraintsFacturacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFacturacion.add(this.jPanelParametrosAuxiliar3Facturacion, this.gridBagConstraintsFacturacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacion.add(this.jComboBoxTiposAccionesFacturacion, this.gridBagConstraintsFacturacion);
	
				
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFacturacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFacturacion.add(this.jTextFieldValorCampoGeneralFacturacion, this.gridBagConstraintsFacturacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFacturacion = new GridBagLayout();

			this.jScrollPanelDatosFacturacion.setLayout(gridaBagLayoutDatosFacturacion);
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = 0;
			this.gridBagConstraintsFacturacion.gridx = 0;
			
			this.jScrollPanelDatosFacturacion.add(this.jTableDatosFacturacion, this.gridBagConstraintsFacturacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFacturacion.setViewportView(this.jTableDatosFacturacion);
		this.jTableDatosFacturacion.setFillsViewportHeight(true);
		this.jTableDatosFacturacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFacturacion= new GridBagLayout();
		this.jPanelAccionesFacturacion.setLayout(gridaBagLayoutAccionesFacturacion);
		
		
		/*	
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = 0;
		this.gridBagConstraintsFacturacion.gridx = 0;
			
		this.jPanelAccionesFacturacion.add(this.jButtonNuevoFacturacion, this.gridBagConstraintsFacturacion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturacion = new GridBagConstraints();						
			this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturacion.gridx = 0;		
			//this.gridBagConstraintsFacturacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFacturacion, this.gridBagConstraintsFacturacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFacturacion.gridx = 0;		
		//this.gridBagConstraintsFacturacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFacturacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFacturacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFacturacion, this.gridBagConstraintsFacturacion);								
		
		
		/*
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFacturacion, this.gridBagConstraintsFacturacion);
		*/		
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturacion.gridx =0;
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturacion, this.gridBagConstraintsFacturacion);
				
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFacturacion, this.gridBagConstraintsFacturacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(FacturacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFacturacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturacion = new GridBagLayout();
			this.jPanelBusquedasParametrosFacturacion.setLayout(gridaBagLayoutBusquedasParametrosFacturacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFacturacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturacion, this.gridBagConstraintsFacturacion);
			
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturacion, this.gridBagConstraintsFacturacion);
		
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturacion, this.gridBagConstraintsFacturacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFacturacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFacturacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFacturacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFacturacion.setName("jPanelReporteDinamicoFacturacion"); 
		
		this.jPanelReporteDinamicoFacturacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFacturacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFacturacion.setLayout(gridaBagLayoutReporteDinamicoFacturacion);
		
		
		this.jInternalFrameReporteDinamicoFacturacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFacturacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFacturacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFacturacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFacturacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFacturacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFacturacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFacturacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoFacturacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoFacturacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFacturacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFacturacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFacturacion = new JLabelMe();

		this.jLabelColumnasSelectReporteFacturacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFacturacion.add(this.jLabelColumnasSelectReporteFacturacion, this.gridBagConstraintsFacturacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFacturacion = new JList<Reporte>();
		this.jListColumnasSelectReporteFacturacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFacturacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFacturacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFacturacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFacturacion=new JScrollPane(this.jListColumnasSelectReporteFacturacion);
			
			this.jScrollColumnasSelectReporteFacturacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFacturacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFacturacion.add(this.jListColumnasSelectReporteFacturacion, this.gridBagConstraintsFacturacion);
		this.jPanelReporteDinamicoFacturacion.add(this.jScrollColumnasSelectReporteFacturacion, this.gridBagConstraintsFacturacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFacturacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteFacturacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFacturacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteFacturacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFacturacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFacturacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFacturacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFacturacion=new JScrollPane(this.jListRelacionesSelectReporteFacturacion);
			
			this.jScrollRelacionesSelectReporteFacturacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFacturacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoFacturacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFacturacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoFacturacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFacturacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFacturacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFacturacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFacturacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFacturacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFacturacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFacturacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFacturacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFacturacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFacturacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacion.add(this.jLabelGenerarExcelReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFacturacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFacturacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFacturacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFacturacion.setToolTipText("Generar EXCEL"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFacturacion = new GridBagConstraints();
		//this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFacturacion.add(this.jButtonGenerarExcelReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacion.add(this.jComboBoxTiposReportesDinamicoFacturacion, this.gridBagConstraintsFacturacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFacturacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFacturacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFacturacion.add(this.jLabelTiposArchivoReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacion.add(this.jComboBoxTiposArchivosReportesDinamicoFacturacion, this.gridBagConstraintsFacturacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFacturacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFacturacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFacturacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFacturacion.setToolTipText("Generar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacion.add(this.jButtonGenerarReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFacturacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFacturacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFacturacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFacturacion.setToolTipText("Cancelar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFacturacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFacturacion.add(this.jButtonCerrarReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFacturacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFacturacion= new JScrollPane(jPanelReporteDinamicoFacturacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFacturacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFacturacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFacturacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFacturacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFacturacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFacturacion);
		this.jInternalFrameReporteDinamicoFacturacion.getContentPane().add(this.jScrollPanelReporteDinamicoFacturacion, this.gridBagConstraintsFacturacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFacturacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFacturacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFacturacion.setName("jPanelImportacionFacturacion"); 
		
		this.jPanelImportacionFacturacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFacturacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFacturacion.setLayout(gridaBagLayoutImportacionFacturacion);
		
		
		this.jInternalFrameImportacionFacturacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFacturacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFacturacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFacturacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFacturacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFacturacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturacion.setResizable(true);
	    this.jInternalFrameImportacionFacturacion.setClosable(true);
	    this.jInternalFrameImportacionFacturacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFacturacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFacturacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFacturacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFacturacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFacturacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFacturacion.setResizable(true);
	    this.jInternalFrameImportacionFacturacion.setClosable(true);
	    this.jInternalFrameImportacionFacturacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFacturacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFacturacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFacturacion = new JLabelMe();

		this.jLabelArchivoImportacionFacturacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturacion.add(this.jLabelArchivoImportacionFacturacion, this.gridBagConstraintsFacturacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFacturacion = new JFileChooser();		
		this.jFileChooserImportacionFacturacion.setToolTipText("ESCOGER ARCHIVO"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFacturacion = new JButtonMe();
		this.jButtonAbrirImportacionFacturacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFacturacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFacturacion.setToolTipText("Generar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacion.add(this.jButtonAbrirImportacionFacturacion, this.gridBagConstraintsFacturacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFacturacion = new JLabelMe();

		this.jLabelPathArchivoImportacionFacturacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFacturacion.add(this.jLabelPathArchivoImportacionFacturacion, this.gridBagConstraintsFacturacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFacturacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFacturacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFacturacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacion.add(this.jTextFieldPathArchivoImportacionFacturacion, this.gridBagConstraintsFacturacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFacturacion = new JButtonMe();
		this.jButtonGenerarImportacionFacturacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFacturacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFacturacion.setToolTipText("Generar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacion.add(this.jButtonGenerarImportacionFacturacion, this.gridBagConstraintsFacturacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFacturacion = new JButtonMe();
		this.jButtonCerrarImportacionFacturacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFacturacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFacturacion.setToolTipText("Cancelar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = iPosYImportacion;
		this.gridBagConstraintsFacturacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFacturacion.add(this.jButtonCerrarImportacionFacturacion, this.gridBagConstraintsFacturacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFacturacion = new GridBagLayout();
		
		this.jScrollPanelImportacionFacturacion= new JScrollPane(jPanelImportacionFacturacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iPosYImportacion;
		this.gridBagConstraintsFacturacion.gridx =iPosXImportacion;
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFacturacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFacturacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFacturacion);
		this.jInternalFrameImportacionFacturacion.getContentPane().add(this.jScrollPanelImportacionFacturacion, this.gridBagConstraintsFacturacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFacturacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFacturacion = new JButtonMe();
			this.jButtonAbrirOrderByFacturacion.setText("Orden");
			this.jButtonAbrirOrderByFacturacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFacturacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFacturacion";
			inputMap = this.jButtonAbrirOrderByFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFacturacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByFacturacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFacturacion.setName("jPanelOrderByFacturacion"); 
			
			this.jPanelOrderByFacturacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFacturacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFacturacion.setLayout(gridaBagLayoutOrderByFacturacion);
			
			
			this.jTableDatosFacturacionOrderBy = new JTableMe();        
			this.jTableDatosFacturacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturacionOrderBy.setViewportView(this.jTableDatosFacturacionOrderBy);
			this.jTableDatosFacturacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFacturacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFacturacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFacturacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFacturacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFacturacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFacturacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFacturacion.setTitle("Orden");
			this.jInternalFrameOrderByFacturacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFacturacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFacturacion.setResizable(true);
			this.jInternalFrameOrderByFacturacion.setClosable(true);
			this.jInternalFrameOrderByFacturacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFacturacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFacturacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFacturacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFacturacion.ipady =150;
				
			this.jPanelOrderByFacturacion.add(jScrollPanelDatosFacturacionOrderBy, this.gridBagConstraintsFacturacion);//this.jTableDatosFacturacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFacturacion = new JButtonMe();
			this.jButtonCerrarOrderByFacturacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFacturacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFacturacion.setToolTipText("Cancelar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFacturacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFacturacion.add(this.jButtonCerrarOrderByFacturacion, this.gridBagConstraintsFacturacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFacturacion = new GridBagLayout();
			
			this.jScrollPanelOrderByFacturacion= new JScrollPane(jPanelOrderByFacturacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsFacturacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFacturacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFacturacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFacturacion);
			
			this.jInternalFrameOrderByFacturacion.getContentPane().add(this.jScrollPanelOrderByFacturacion, this.gridBagConstraintsFacturacion);			
		
		} else {
			this.jButtonAbrirOrderByFacturacion = new JButtonMe();
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
			&& this.facturacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFacturacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFacturacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFacturacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFacturacion.getRowHeight();//FacturacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturacion.isSelected()) {
					iHeightTable=FacturacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFacturacion.isSelected()) {
					iHeightTable=FacturacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFacturacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFacturacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFacturacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFacturacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFacturacion!=null && this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy()!=null) {
			//if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFacturacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFacturacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFacturacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFacturacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFacturacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFacturacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturacionLogic.getFacturacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Facturacion> TraerFacturacionBeans(List<Facturacion> facturacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Facturacion facturacion:facturacions) {
					
				if(!(FacturacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					facturacion.setsDetalleGeneralEntityReporte(FacturacionConstantesFunciones.getFacturacionDescripcion(facturacion));
										
						
					
						
					
				} else  {
							
					//facturacion.setsDetalleGeneralEntityReporte(facturacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturacionbeans.add(facturacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturacions;
    }
	//PARA REPORTES FIN
}
