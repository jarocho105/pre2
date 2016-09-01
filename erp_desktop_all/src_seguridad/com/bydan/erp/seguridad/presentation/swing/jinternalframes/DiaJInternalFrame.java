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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.DiaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class DiaJInternalFrame extends DiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDia;
	
	protected JMenuBar jmenuBarDia;
	
	protected JMenu jmenuDia;
	protected JMenu jmenuDatosDia;
	protected JMenu jmenuArchivoDia;
	protected JMenu jmenuAccionesDia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDia;	
	protected GridBagConstraints gridBagConstraintsDia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DiaDetalleFormJInternalFrame jInternalFrameDetalleFormDia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public DiaSessionBean diaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Dia> dias;		
	public List<Dia> diasEliminados;	
	public List<Dia> diasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDia;		
	protected JButton jButtonAbrirOrderByDia;
	
	
	//protected JPanel jPanelOrderByDia;
	//public JScrollPane jScrollPanelOrderByDia;	
	//protected JButton jButtonCerrarOrderByDia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DiaLogic diaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDia;
	public JScrollPane jScrollPanelDatosEdicionDia;
	public JScrollPane jScrollPanelDatosGeneralDia;
    
	
	
	//public JScrollPane jScrollPanelDatosDiaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDia;
	//public JScrollPane jScrollPanelImportacionDia;
	
	
	
	protected JPanel jPanelAccionesDia;
	
    protected JPanel jPanelPaginacionDia;
    protected JPanel jPanelParametrosReportesDia;
	protected JPanel jPanelParametrosReportesAccionesDia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Dia;
	protected JPanel jPanelParametrosAuxiliar2Dia;
	protected JPanel jPanelParametrosAuxiliar3Dia;
	protected JPanel jPanelParametrosAuxiliar4Dia;
	//protected JPanel jPanelParametrosAuxiliar5Dia;
	
	
	
	//protected JPanel jPanelReporteDinamicoDia;
	//protected JPanel jPanelImportacionDia;
	
	
	public JTable jTableDatosDia;
	
	
	
	//public JTable jTableDatosDiaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDia;
	protected JButton jButtonDuplicarDia;
	protected JButton jButtonCopiarDia;
	protected JButton jButtonVerFormDia;
	protected JButton jButtonNuevoRelacionesDia;
	protected JButton jButtonModificarDia;
	
    protected JButton jButtonGuardarCambiosTablaDia;
	protected JButton jButtonCerrarDia;
	
	
	protected JButton jButtonRecargarInformacionDia;
	protected JButton jButtonProcesarInformacionDia;
	
	
	protected JButton jButtonAnterioresDia;
	protected JButton jButtonSiguientesDia;
	protected JButton jButtonNuevoGuardarCambiosDia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDia;
	//protected JButton jButtonCerrarReporteDinamicoDia;
	//protected JButton jButtonGenerarExcelReporteDinamicoDia;	
	
	
	
	//protected JButton jButtonAbrirImportacionDia;
	//protected JButton jButtonGenerarImportacionDia;
	//protected JButton jButtonCerrarImportacionDia;
	//protected JFileChooser jFileChooserImportacionDia;
	//protected File fileImportacionDia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDia;
	protected JButton jButtonDuplicarToolBarDia;
	protected JButton jButtonNuevoRelacionesToolBarDia;
	
	
	public JButton jButtonGuardarCambiosToolBarDia;
	protected JButton jButtonCopiarToolBarDia;
	protected JButton jButtonVerFormToolBarDia;
	public JButton jButtonGuardarCambiosTablaToolBarDia;
	protected JButton jButtonMostrarOcultarTablaToolBarDia;
	protected JButton jButtonCerrarToolBarDia;
	
	protected JButton jButtonRecargarInformacionToolBarDia;
	protected JButton jButtonProcesarInformacionToolBarDia;
	protected JButton jButtonAnterioresToolBarDia;
	protected JButton jButtonSiguientesToolBarDia;
	protected JButton jButtonNuevoGuardarCambiosToolBarDia;
	protected JButton jButtonAbrirOrderByToolBarDia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDia;
	protected JMenuItem jMenuItemDuplicarDia;
	protected JMenuItem jMenuItemNuevoRelacionesDia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDia;
	protected JMenuItem jMenuItemCopiarDia;
	protected JMenuItem jMenuItemVerFormDia;
	protected JMenuItem jMenuItemGuardarCambiosTablaDia;
	protected JMenuItem jMenuItemCerrarDia;
	protected JMenuItem jMenuItemDetalleCerrarDia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDia;
	protected JMenuItem jMenuItemDetalleMostarOcultarDia;
	
	protected JMenuItem jMenuItemRecargarInformacionDia;
	protected JMenuItem jMenuItemProcesarInformacionDia;
	protected JMenuItem jMenuItemAnterioresDia;
	protected JMenuItem jMenuItemSiguientesDia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDia;
	protected JMenuItem jMenuItemAbrirOrderByDia;
	protected JMenuItem jMenuItemMostrarOcultarDia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDia;
	protected JCheckBox jCheckBoxSeleccionadosDia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDia;
	protected JCheckBox jCheckBoxConGraficoReporteDia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDia;
	protected JTextField jTextFieldValorCampoGeneralDia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDia;
	//public JList<Reporte> jListColumnasSelectReporteDia;
	//public JScrollPane jScrollColumnasSelectReporteDia;
	
	//public JLabel jLabelRelacionesSelectReporteDia;
	//public JList<Reporte> jListRelacionesSelectReporteDia;
	//public JScrollPane jScrollRelacionesSelectReporteDia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDia;
	//public JLabel jLabelTiposArchivoReporteDinamicoDia;
	
		
	//public JLabel jLabelArchivoImportacionDia;	
	//public JLabel jLabelPathArchivoImportacionDia;
	//protected JTextField jTextFieldPathArchivoImportacionDia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDia;
	
	//public JLabel jLabelColumnaCategoriaValorDia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDia;
	
	//public JLabel jLabelColumnasValoresGraficoDia;
	//public JList<Reporte> jListColumnasValoresGraficoDia;
	//public JScrollPane jScrollColumnasValoresGraficoDia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDia;	
	
	
	
	
	
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
	public DiaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDia)	{
		this.jButtonRecargarInformacionDia = jButtonRecargarInformacionDia;
	}
	
	public JButton getjButtonProcesarInformacionDia() {
		return this.jButtonProcesarInformacionDia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDia)	{
		this.jButtonProcesarInformacionDia = jButtonProcesarInformacionDia;
	}
	
	
	public JButton getjButtonRecargarInformacionDia() {
		return this.jButtonRecargarInformacionDia;
	}
	
	
	public List<Dia> getdias() {
		return this.dias;
	}

	public void setdias(List<Dia> dias) {
		this.dias = dias;
	}
	
	public List<Dia> getdiasAux() {
		return this.diasAux;
	}

	public void setdiasAux(List<Dia> diasAux) {
		this.diasAux = diasAux;
	}
	
	public List<Dia> getdiasEliminados() {
		return this.diasEliminados;
	}

	public void setDiasEliminados(List<Dia> diasEliminados) {
		this.diasEliminados = diasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDia() {
		return jComboBoxTiposSeleccionarDia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDia(
			JComboBox jComboBoxTiposSeleccionarDia) {
		this.jComboBoxTiposSeleccionarDia = jComboBoxTiposSeleccionarDia;
	}
	
	public void setBorderResaltarTiposSeleccionarDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDia() {
		return jTextFieldValorCampoGeneralDia;
	}

	public void setjTextFieldValorCampoGeneralDia(
			JTextField jTextFieldValorCampoGeneralDia) {
		this.jTextFieldValorCampoGeneralDia = jTextFieldValorCampoGeneralDia;
	}

	public void setBorderResaltarValorCampoGeneralDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDia() {
		return this.jCheckBoxSeleccionarTodosDia;
	}

	public void setjCheckBoxSeleccionarTodosDia(
			JCheckBox jCheckBoxSeleccionarTodosDia) {
		this.jCheckBoxSeleccionarTodosDia = jCheckBoxSeleccionarTodosDia;
	}

	public void setBorderResaltarSeleccionarTodosDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDia() {
		return this.jCheckBoxSeleccionadosDia;
	}

	public void setjCheckBoxSeleccionadosDia(
			JCheckBox jCheckBoxSeleccionadosDia) {
		this.jCheckBoxSeleccionadosDia = jCheckBoxSeleccionadosDia;
	}
	
	public void setBorderResaltarSeleccionadosDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDia() {
		return this.jComboBoxTiposArchivosReportesDia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDia(
			JComboBox jComboBoxTiposArchivosReportesDia) {
		this.jComboBoxTiposArchivosReportesDia = jComboBoxTiposArchivosReportesDia;
	}

	public void setBorderResaltarTiposArchivosReportesDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDia() {
		return this.jComboBoxTiposReportesDia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDia(
			JComboBox jComboBoxTiposReportesDia) {
		this.jComboBoxTiposReportesDia = jComboBoxTiposReportesDia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDia() {
	//	return jComboBoxTiposReportesDinamicoDia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDia(
	//		JComboBox jComboBoxTiposReportesDinamicoDia) {
	//	this.jComboBoxTiposReportesDinamicoDia = jComboBoxTiposReportesDinamicoDia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDia() {
	//	return jComboBoxTiposArchivosReportesDinamicoDia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDia = jComboBoxTiposArchivosReportesDinamicoDia;
	//}
	
	public void setBorderResaltarTiposReportesDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDia() {
		return this.jComboBoxTiposGraficosReportesDia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDia(
			JComboBox jComboBoxTiposGraficosReportesDia) {
		this.jComboBoxTiposGraficosReportesDia = jComboBoxTiposGraficosReportesDia;
	}
	
	public void setBorderResaltarTiposGraficosReportesDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDia() {
		return this.jComboBoxTiposPaginacionDia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDia(
			JComboBox jComboBoxTiposPaginacionDia) {
		this.jComboBoxTiposPaginacionDia = jComboBoxTiposPaginacionDia;
	}
	
	public void setBorderResaltarTiposPaginacionDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDia() {
		return this.jComboBoxTiposRelacionesDia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDia() {
		return this.jComboBoxTiposAccionesDia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDia(
			JComboBox jComboBoxTiposRelacionesDia) {
		this.jComboBoxTiposRelacionesDia = jComboBoxTiposRelacionesDia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDia(
			JComboBox jComboBoxTiposAccionesDia) {
		this.jComboBoxTiposAccionesDia = jComboBoxTiposAccionesDia;
	}
	
	public void setBorderResaltarTiposRelacionesDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDia() {
	//	return jCheckBoxConGraficoDinamicoDia;
	//}

	//public void setjCheckBoxConGraficoDinamicoDia(
	//		JCheckBox jCheckBoxConGraficoDinamicoDia) {
	//	this.jCheckBoxConGraficoDinamicoDia = jCheckBoxConGraficoDinamicoDia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDia .setBorder(borderResaltar);		
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
		this.diaSessionBean=new DiaSessionBean();
		
		this.diaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DiaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
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
		
		DiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDia,this.jTtoolBarDia,
							"nuevo","nuevo","Nuevo"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDia,this.jTtoolBarDia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDia,this.jTtoolBarDia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDia,this.jTtoolBarDia,
							"duplicar","duplicar","Duplicar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDia,this.jTtoolBarDia,
							"copiar","copiar","Copiar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDia,this.jTtoolBarDia,
							"ver_form","ver_form","Ver"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDia,this.jTtoolBarDia,
							"recargar","recargar","Recargar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDia,this.jTtoolBarDia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDia,this.jTtoolBarDia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDia,this.jTtoolBarDia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDia,this.jTtoolBarDia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDia,this.jTtoolBarDia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDia,this.jTtoolBarDia,
							"cerrar","cerrar","Salir"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDia;
			
				this.jButtonProcesarInformacionToolBarDia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDia;
				
		//protected JButton jButtonModificarToolBarDia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDia=new JMenuMe("General");
		this.jmenuArchivoDia=new JMenuMe("Archivo");
		this.jmenuAccionesDia=new JMenuMe("Acciones");
		this.jmenuDatosDia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDia.add(this.jMenuItemCerrarDia);
			
			this.jmenuAccionesDia.add(this.jMenuItemNuevoDia);
			this.jmenuAccionesDia.add(this.jMenuItemNuevoGuardarCambiosDia);
			this.jmenuAccionesDia.add(this.jMenuItemNuevoRelacionesDia);
			this.jmenuAccionesDia.add(this.jMenuItemGuardarCambiosTablaDia);		
			this.jmenuAccionesDia.add(this.jMenuItemDuplicarDia);		
			this.jmenuAccionesDia.add(this.jMenuItemCopiarDia);		
			this.jmenuAccionesDia.add(this.jMenuItemVerFormDia);		
			
			this.jmenuDatosDia.add(this.jMenuItemRecargarInformacionDia);				
			this.jmenuDatosDia.add(this.jMenuItemAnterioresDia);				
			this.jmenuDatosDia.add(this.jMenuItemSiguientesDia);				
			this.jmenuDatosDia.add(this.jMenuItemAbrirOrderByDia);				
			this.jmenuDatosDia.add(this.jMenuItemMostrarOcultarDia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDia.add(this.jMenuItemGuardarCambiosDia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDia.add(this.jmenuArchivoDia);		
			this.jmenuBarDia.add(this.jmenuAccionesDia);		
			this.jmenuBarDia.add(this.jmenuDatosDia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDia() {
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
			//this.jInternalFrameDetalleDia = new DiaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Dia DATOS");
			this.jInternalFrameDetalleFormDia = new DiaDetalleFormJInternalFrame(jDesktopPane,this.diaSessionBean.getConGuardarRelaciones(),this.diaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDia = null;//new DiaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDia= new GridBagLayout();
		
		
		this.jTableDatosDia = new JTableMe();      
		
		String sToolTipDia="";
		sToolTipDia=DiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDia+="(Seguridad.Dia)";
		}
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDia.setToolTipText(sToolTipDia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDia);
		this.jTableDatosDia.setAutoCreateRowSorter(true);
		this.jTableDatosDia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDia.setRowSelectionAllowed(true);
		this.jTableDatosDia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDia = new JButtonMe();
		this.jButtonDuplicarDia = new JButtonMe();
		this.jButtonCopiarDia = new JButtonMe();
		this.jButtonVerFormDia = new JButtonMe();
		this.jButtonNuevoRelacionesDia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDia = new JButtonMe();
		this.jButtonCerrarDia = new JButtonMe();
		
		this.jScrollPanelDatosDia = new JScrollPane();   
        this.jScrollPanelDatosGeneralDia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Dia";
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias" + this.sPath));
		} else {
			this.jScrollPanelDatosDia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDia.setToolTipText("Acciones");
        this.jPanelAccionesDia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDia=new ReporteDinamicoJInternalFrame(DiaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDia=new ImportacionJInternalFrame(DiaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDia = new JButtonMe();
		
		this.jButtonAbrirOrderByDia.setText("Orden");
		this.jButtonAbrirOrderByDia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDia,false,this);
			
			//this.cargarOrderByDia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDia,true,this);
			
			//this.cargarOrderByDia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDia.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosDia.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosDia.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosDia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDia.setText("Nuevo");
		this.jButtonDuplicarDia.setText("Duplicar");
		this.jButtonCopiarDia.setText("Copiar");
		this.jButtonVerFormDia.setText("Ver");
		this.jButtonNuevoRelacionesDia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDia.setText("Guardar");
		this.jButtonCerrarDia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDia,"nuevo_button","Nuevo",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDia,"duplicar_button","Duplicar",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDia,"copiar_button","Copiar",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDia,"ver_form","Ver",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDia,"nuevorelaciones_button","Nuevo Rel",this.diaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDia,"guardarcambiostabla_button","Guardar",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDia,"cerrar_button","Salir",this.diaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDia.setToolTipText("Nuevo"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDia.setToolTipText("Duplicar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDia.setToolTipText("Copiar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDia.setToolTipText("Ver"+" "+DiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDia.setToolTipText("Nuevo Rel"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDia.setToolTipText("Guardar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDia.setToolTipText("Salir"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDia";
		inputMap = this.jButtonNuevoDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDia"));
		
		//DUPLICAR
		sMapKey = "DuplicarDia";
		inputMap = this.jButtonDuplicarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDia"));
		
		//COPIAR
		sMapKey = "CopiarDia";
		inputMap = this.jButtonCopiarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDia"));
		
		//VEr FORM
		sMapKey = "VerFormDia";
		inputMap = this.jButtonVerFormDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDia";
		inputMap = this.jButtonNuevoRelacionesDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDia";
		inputMap = this.jButtonModificarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDia";
		inputMap = this.jButtonCerrarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDia";
		inputMap = this.jButtonGuardarCambiosTablaDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Dia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Dia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Dia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Dia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Dia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDia.setName("jPanelParametrosReportesDia"); 
		
		this.jPanelParametrosReportesAccionesDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDia.setName("jPanelParametrosReportesAccionesDia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDia = new JButtonMe();
		this.jButtonRecargarInformacionDia.setText("Recargar");
		this.jButtonRecargarInformacionDia.setToolTipText("Recargar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDia = new JButtonMe();
		this.jButtonProcesarInformacionDia.setText("Procesar");
		this.jButtonProcesarInformacionDia.setToolTipText("Procesar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDia.setVisible(false);
			
		this.jButtonProcesarInformacionDia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDia.setText("TIPO");       
		this.jComboBoxTiposReportesDia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDia.setText("Paginacion");
		this.jComboBoxTiposPaginacionDia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDia.setText("Accion");
		this.jComboBoxTiposRelacionesDia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDia.setText("Accion");
		this.jComboBoxTiposAccionesDia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDia.setText("Accion");
		this.jComboBoxTiposSeleccionarDia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDia = new JLabelMe();
		
		this.jLabelAccionesDia.setText("Acciones");		
		this.jLabelAccionesDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDia.setText("Graf.");
		this.jCheckBoxConGraficoReporteDia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDia = new JButtonMe();
		//this.jButtonAnterioresDia.setText("<<");
        this.jButtonAnterioresDia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDia = new JButtonMe();
		//this.jButtonSiguientesDia.setText(">>");
        this.jButtonSiguientesDia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDia.setText("Nue");
        this.jButtonNuevoGuardarCambiosDia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDia,"nuevoguardarcambios_button","Nue",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDia";
		inputMap = this.jButtonNuevoGuardarCambiosDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDia";
		inputMap = this.jButtonRecargarInformacionDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDia";
		inputMap = this.jButtonSiguientesDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDia";
		inputMap = this.jButtonAnterioresDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDia.setMinimumSize(new Dimension(this.getWidth(),DiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDia.setMaximumSize(new Dimension(this.getWidth(),DiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDia.setPreferredSize(new Dimension(this.getWidth(),DiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDia = new GridBagLayout();

			this.jPanelPaginacionDia.setLayout(gridaBagLayoutPaginacionDia);						
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 0;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDia.add(this.jButtonAnterioresDia, this.gridBagConstraintsDia);
					
						
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDia.gridy = 0;
			
			this.jPanelPaginacionDia.add(this.jButtonNuevoGuardarCambiosDia, this.gridBagConstraintsDia);
						
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDia.gridy = 0;
			this.jPanelPaginacionDia.add(this.jButtonSiguientesDia, this.gridBagConstraintsDia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 1;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDia.add(this.jButtonNuevoDia, this.gridBagConstraintsDia);
						
			
			
			if(!this.diaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDia = new GridBagConstraints();
				this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDia.gridy = 1;
				this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDia.add(this.jButtonGuardarCambiosTablaDia, this.gridBagConstraintsDia);
			}
			
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 1;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDia.add(this.jButtonDuplicarDia, this.gridBagConstraintsDia);
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 1;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDia.add(this.jButtonCopiarDia, this.gridBagConstraintsDia);
		
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 1;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDia.add(this.jButtonVerFormDia, this.gridBagConstraintsDia);
		
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 1;
			this.gridBagConstraintsDia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDia.add(this.jButtonCerrarDia, this.gridBagConstraintsDia);
		
		
		
		this.jButtonRecargarInformacionDia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Dia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Dia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Dia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Dia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDia.setLayout(gridaBagParametrosReportesDia);
			this.jPanelParametrosReportesAccionesDia.setLayout(gridaBagParametrosReportesAccionesDia);
			
			
			this.jPanelParametrosAuxiliar1Dia.setLayout(gridaBagParametrosAuxiliar1Dia);
			this.jPanelParametrosAuxiliar2Dia.setLayout(gridaBagParametrosAuxiliar2Dia);
			this.jPanelParametrosAuxiliar3Dia.setLayout(gridaBagParametrosAuxiliar3Dia);
			this.jPanelParametrosAuxiliar4Dia.setLayout(gridaBagParametrosAuxiliar4Dia);
			//this.jPanelParametrosAuxiliar5Dia.setLayout(gridaBagParametrosAuxiliar2Dia);			
			
			
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDia.add(this.jButtonRecargarInformacionDia, this.gridBagConstraintsDia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Dia.add(this.jComboBoxTiposPaginacionDia, this.gridBagConstraintsDia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Dia.add(this.jCheckBoxConAltoMaximoTablaDia, this.gridBagConstraintsDia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Dia.add(this.jComboBoxTiposArchivosReportesDia, this.gridBagConstraintsDia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDia.add(this.jPanelParametrosAuxiliar1Dia, this.gridBagConstraintsDia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Dia.add(this.jComboBoxTiposReportesDia, this.gridBagConstraintsDia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDia.add(this.jPanelParametrosAuxiliar4Dia, this.gridBagConstraintsDia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDia.add(this.jComboBoxTiposReportesDia, this.gridBagConstraintsDia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDia.add(this.jCheckBoxGenerarReporteDia, this.gridBagConstraintsDia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDia.add(this.jPanelParametrosAuxiliar2Dia, this.gridBagConstraintsDia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDia.add(this.jLabelAccionesDia, this.gridBagConstraintsDia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDia = new GridBagConstraints();
				this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDia.add(this.jButtonAbrirOrderByDia, this.gridBagConstraintsDia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDia.add(this.jComboBoxTiposSeleccionarDia, this.gridBagConstraintsDia);			
			
			
			/*
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDia.add(this.jCheckBoxSeleccionarTodosDia, this.gridBagConstraintsDia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Dia.add(this.jCheckBoxSeleccionarTodosDia, this.gridBagConstraintsDia);															
				
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Dia.add(this.jCheckBoxSeleccionadosDia, this.gridBagConstraintsDia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDia.add(this.jPanelParametrosAuxiliar3Dia, this.gridBagConstraintsDia);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDia.add(this.jComboBoxTiposRelacionesDia, this.gridBagConstraintsDia);
				
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDia.add(this.jComboBoxTiposAccionesDia, this.gridBagConstraintsDia);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDia = new GridBagLayout();

			this.jScrollPanelDatosDia.setLayout(gridaBagLayoutDatosDia);
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = 0;
			this.gridBagConstraintsDia.gridx = 0;
			
			this.jScrollPanelDatosDia.add(this.jTableDatosDia, this.gridBagConstraintsDia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDia.setViewportView(this.jTableDatosDia);
		this.jTableDatosDia.setFillsViewportHeight(true);
		this.jTableDatosDia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDia= new GridBagLayout();
		this.jPanelAccionesDia.setLayout(gridaBagLayoutAccionesDia);
		
		
		/*	
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = 0;
		this.gridBagConstraintsDia.gridx = 0;
			
		this.jPanelAccionesDia.add(this.jButtonNuevoDia, this.gridBagConstraintsDia);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDia = new GridBagConstraints();						
			this.gridBagConstraintsDia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDia.gridx = 0;		
			//this.gridBagConstraintsDia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDia, this.gridBagConstraintsDia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDia.gridx = 0;		
		//this.gridBagConstraintsDia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDia, this.gridBagConstraintsDia);								
		
		
		/*
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDia, this.gridBagConstraintsDia);
		*/		
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDia.gridx =0;
		this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDia, this.gridBagConstraintsDia);
				
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDia, this.gridBagConstraintsDia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DiaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDia = new GridBagLayout();
			this.jPanelBusquedasParametrosDia.setLayout(gridaBagLayoutBusquedasParametrosDia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDia, this.gridBagConstraintsDia);
			
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDia, this.gridBagConstraintsDia);
		
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDia, this.gridBagConstraintsDia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDia.setName("jPanelReporteDinamicoDia"); 
		
		this.jPanelReporteDinamicoDia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDia.setLayout(gridaBagLayoutReporteDinamicoDia);
		
		
		this.jInternalFrameReporteDinamicoDia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDia.setResizable(true);
	    this.jInternalFrameReporteDinamicoDia.setClosable(true);
	    this.jInternalFrameReporteDinamicoDia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDia = new JLabelMe();

		this.jLabelColumnasSelectReporteDia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDia.add(this.jLabelColumnasSelectReporteDia, this.gridBagConstraintsDia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDia = new JList<Reporte>();
		this.jListColumnasSelectReporteDia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDia=new JScrollPane(this.jListColumnasSelectReporteDia);
			
			this.jScrollColumnasSelectReporteDia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDia.add(this.jListColumnasSelectReporteDia, this.gridBagConstraintsDia);
		this.jPanelReporteDinamicoDia.add(this.jScrollColumnasSelectReporteDia, this.gridBagConstraintsDia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDia = new JLabelMe();

		this.jLabelRelacionesSelectReporteDia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDia = new JList<Reporte>();
		this.jListRelacionesSelectReporteDia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDia=new JScrollPane(this.jListRelacionesSelectReporteDia);
			
			this.jScrollRelacionesSelectReporteDia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDia = new JComboBoxMe();
		this.jListColumnasValoresGraficoDia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDia.add(this.jLabelGenerarExcelReporteDinamicoDia, this.gridBagConstraintsDia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDia.setToolTipText("Generar EXCEL"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDia = new GridBagConstraints();
		//this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDia.add(this.jButtonGenerarExcelReporteDinamicoDia, this.gridBagConstraintsDia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDia.add(this.jComboBoxTiposReportesDinamicoDia, this.gridBagConstraintsDia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDia.add(this.jLabelTiposArchivoReporteDinamicoDia, this.gridBagConstraintsDia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDia.add(this.jComboBoxTiposArchivosReportesDinamicoDia, this.gridBagConstraintsDia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDia.setToolTipText("Generar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDia.add(this.jButtonGenerarReporteDinamicoDia, this.gridBagConstraintsDia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDia.setToolTipText("Cancelar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDia.add(this.jButtonCerrarReporteDinamicoDia, this.gridBagConstraintsDia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDia= new JScrollPane(jPanelReporteDinamicoDia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDia);
		this.jInternalFrameReporteDinamicoDia.getContentPane().add(this.jScrollPanelReporteDinamicoDia, this.gridBagConstraintsDia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDia.setName("jPanelImportacionDia"); 
		
		this.jPanelImportacionDia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDia.setLayout(gridaBagLayoutImportacionDia);
		
		
		this.jInternalFrameImportacionDia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDia.setResizable(true);
	    this.jInternalFrameImportacionDia.setClosable(true);
	    this.jInternalFrameImportacionDia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDia.setResizable(true);
	    this.jInternalFrameImportacionDia.setClosable(true);
	    this.jInternalFrameImportacionDia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDia = new JLabelMe();

		this.jLabelArchivoImportacionDia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;		
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDia.add(this.jLabelArchivoImportacionDia, this.gridBagConstraintsDia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDia = new JFileChooser();		
		this.jFileChooserImportacionDia.setToolTipText("ESCOGER ARCHIVO"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDia = new JButtonMe();
		this.jButtonAbrirImportacionDia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDia.setToolTipText("Generar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDia.add(this.jButtonAbrirImportacionDia, this.gridBagConstraintsDia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDia = new JLabelMe();

		this.jLabelPathArchivoImportacionDia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;		
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDia.add(this.jLabelPathArchivoImportacionDia, this.gridBagConstraintsDia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDia.add(this.jTextFieldPathArchivoImportacionDia, this.gridBagConstraintsDia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDia = new JButtonMe();
		this.jButtonGenerarImportacionDia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDia.setToolTipText("Generar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDia.add(this.jButtonGenerarImportacionDia, this.gridBagConstraintsDia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDia = new JButtonMe();
		this.jButtonCerrarImportacionDia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDia.setToolTipText("Cancelar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = iPosYImportacion;
		this.gridBagConstraintsDia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDia.add(this.jButtonCerrarImportacionDia, this.gridBagConstraintsDia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDia = new GridBagLayout();
		
		this.jScrollPanelImportacionDia= new JScrollPane(jPanelImportacionDia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iPosYImportacion;
		this.gridBagConstraintsDia.gridx =iPosXImportacion;
		this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDia);
		this.jInternalFrameImportacionDia.getContentPane().add(this.jScrollPanelImportacionDia, this.gridBagConstraintsDia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDia = new JButtonMe();
			this.jButtonAbrirOrderByDia.setText("Orden");
			this.jButtonAbrirOrderByDia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDia";
			inputMap = this.jButtonAbrirOrderByDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDia"));
		
		
			GridBagLayout gridaBagLayoutOrderByDia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDia.setName("jPanelOrderByDia"); 
			
			this.jPanelOrderByDia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDia.setLayout(gridaBagLayoutOrderByDia);
			
			
			this.jTableDatosDiaOrderBy = new JTableMe();        
			this.jTableDatosDiaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDiaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDiaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDiaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDiaOrderBy.setViewportView(this.jTableDatosDiaOrderBy);
			this.jTableDatosDiaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDiaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDia.setTitle("Orden");
			this.jInternalFrameOrderByDia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDia.setResizable(true);
			this.jInternalFrameOrderByDia.setClosable(true);
			this.jInternalFrameOrderByDia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDia.gridx =iPosXOrderBy;
			this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDia.ipady =150;
				
			this.jPanelOrderByDia.add(jScrollPanelDatosDiaOrderBy, this.gridBagConstraintsDia);//this.jTableDatosDiaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDia = new JButtonMe();
			this.jButtonCerrarOrderByDia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDia.setToolTipText("Cancelar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDia.add(this.jButtonCerrarOrderByDia, this.gridBagConstraintsDia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDia = new GridBagLayout();
			
			this.jScrollPanelOrderByDia= new JScrollPane(jPanelOrderByDia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy =iPosYOrderBy;
			this.gridBagConstraintsDia.gridx =iPosXOrderBy;
			this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDia);
			
			this.jInternalFrameOrderByDia.getContentPane().add(this.jScrollPanelOrderByDia, this.gridBagConstraintsDia);			
		
		} else {
			this.jButtonAbrirOrderByDia = new JButtonMe();
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
			&& this.diaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDia.getRowHeight();//DiaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDia.isSelected()) {
					iHeightTable=DiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDia.isSelected()) {
					iHeightTable=DiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDia!=null && this.jInternalFrameOrderByDia.getjTableDatosOrderBy()!=null) {
			//if(!this.diaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=diaLogic.getDias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=dias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Dia> TraerDiaBeans(List<Dia> dias,ArrayList<Classe> classes)throws Exception {
		try {
			for(Dia dia:dias) {
					
				if(!(DiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					dia.setsDetalleGeneralEntityReporte(DiaConstantesFunciones.getDiaDescripcion(dia));
										
						
					
						
					
				} else  {
							
					//dia.setsDetalleGeneralEntityReporte(dia.getsDetalleGeneralEntityReporte());
										
				}
				
				//diabeans.add(diabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return dias;
    }
	//PARA REPORTES FIN
}
