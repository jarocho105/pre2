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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


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

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.CateTipoAfiliacionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CateTipoAfiliacionJInternalFrame extends CateTipoAfiliacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCateTipoAfiliacion;
	
	protected JMenuBar jmenuBarCateTipoAfiliacion;
	
	protected JMenu jmenuCateTipoAfiliacion;
	protected JMenu jmenuDatosCateTipoAfiliacion;
	protected JMenu jmenuArchivoCateTipoAfiliacion;
	protected JMenu jmenuAccionesCateTipoAfiliacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCateTipoAfiliacion;	
	protected GridBagConstraints gridBagConstraintsCateTipoAfiliacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CateTipoAfiliacionDetalleFormJInternalFrame jInternalFrameDetalleFormCateTipoAfiliacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCateTipoAfiliacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCateTipoAfiliacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<CateTipoAfiliacion> catetipoafiliacions;		
	public List<CateTipoAfiliacion> catetipoafiliacionsEliminados;	
	public List<CateTipoAfiliacion> catetipoafiliacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCateTipoAfiliacion;		
	protected JButton jButtonAbrirOrderByCateTipoAfiliacion;
	
	
	//protected JPanel jPanelOrderByCateTipoAfiliacion;
	//public JScrollPane jScrollPanelOrderByCateTipoAfiliacion;	
	//protected JButton jButtonCerrarOrderByCateTipoAfiliacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CateTipoAfiliacionLogic catetipoafiliacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCateTipoAfiliacion;
	public JScrollPane jScrollPanelDatosEdicionCateTipoAfiliacion;
	public JScrollPane jScrollPanelDatosGeneralCateTipoAfiliacion;
    
	
	
	//public JScrollPane jScrollPanelDatosCateTipoAfiliacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCateTipoAfiliacion;
	//public JScrollPane jScrollPanelImportacionCateTipoAfiliacion;
	
	
	
	protected JPanel jPanelAccionesCateTipoAfiliacion;
	
    protected JPanel jPanelPaginacionCateTipoAfiliacion;
    protected JPanel jPanelParametrosReportesCateTipoAfiliacion;
	protected JPanel jPanelParametrosReportesAccionesCateTipoAfiliacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CateTipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar2CateTipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar3CateTipoAfiliacion;
	protected JPanel jPanelParametrosAuxiliar4CateTipoAfiliacion;
	//protected JPanel jPanelParametrosAuxiliar5CateTipoAfiliacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoCateTipoAfiliacion;
	//protected JPanel jPanelImportacionCateTipoAfiliacion;
	
	
	public JTable jTableDatosCateTipoAfiliacion;
	
	
	
	//public JTable jTableDatosCateTipoAfiliacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCateTipoAfiliacion;
	protected JButton jButtonDuplicarCateTipoAfiliacion;
	protected JButton jButtonCopiarCateTipoAfiliacion;
	protected JButton jButtonVerFormCateTipoAfiliacion;
	protected JButton jButtonNuevoRelacionesCateTipoAfiliacion;
	protected JButton jButtonModificarCateTipoAfiliacion;
	
    protected JButton jButtonGuardarCambiosTablaCateTipoAfiliacion;
	protected JButton jButtonCerrarCateTipoAfiliacion;
	
	
	protected JButton jButtonRecargarInformacionCateTipoAfiliacion;
	protected JButton jButtonProcesarInformacionCateTipoAfiliacion;
	
	
	protected JButton jButtonAnterioresCateTipoAfiliacion;
	protected JButton jButtonSiguientesCateTipoAfiliacion;
	protected JButton jButtonNuevoGuardarCambiosCateTipoAfiliacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCateTipoAfiliacion;
	//protected JButton jButtonCerrarReporteDinamicoCateTipoAfiliacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionCateTipoAfiliacion;
	//protected JButton jButtonGenerarImportacionCateTipoAfiliacion;
	//protected JButton jButtonCerrarImportacionCateTipoAfiliacion;
	//protected JFileChooser jFileChooserImportacionCateTipoAfiliacion;
	//protected File fileImportacionCateTipoAfiliacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCateTipoAfiliacion;
	protected JButton jButtonDuplicarToolBarCateTipoAfiliacion;
	protected JButton jButtonNuevoRelacionesToolBarCateTipoAfiliacion;
	
	
	public JButton jButtonGuardarCambiosToolBarCateTipoAfiliacion;
	protected JButton jButtonCopiarToolBarCateTipoAfiliacion;
	protected JButton jButtonVerFormToolBarCateTipoAfiliacion;
	public JButton jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion;
	protected JButton jButtonMostrarOcultarTablaToolBarCateTipoAfiliacion;
	protected JButton jButtonCerrarToolBarCateTipoAfiliacion;
	
	protected JButton jButtonRecargarInformacionToolBarCateTipoAfiliacion;
	protected JButton jButtonProcesarInformacionToolBarCateTipoAfiliacion;
	protected JButton jButtonAnterioresToolBarCateTipoAfiliacion;
	protected JButton jButtonSiguientesToolBarCateTipoAfiliacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion;
	protected JButton jButtonAbrirOrderByToolBarCateTipoAfiliacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCateTipoAfiliacion;
	protected JMenuItem jMenuItemDuplicarCateTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoRelacionesCateTipoAfiliacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCateTipoAfiliacion;
	protected JMenuItem jMenuItemCopiarCateTipoAfiliacion;
	protected JMenuItem jMenuItemVerFormCateTipoAfiliacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaCateTipoAfiliacion;
	protected JMenuItem jMenuItemCerrarCateTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleCerrarCateTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCateTipoAfiliacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarCateTipoAfiliacion;
	
	protected JMenuItem jMenuItemRecargarInformacionCateTipoAfiliacion;
	protected JMenuItem jMenuItemProcesarInformacionCateTipoAfiliacion;
	protected JMenuItem jMenuItemAnterioresCateTipoAfiliacion;
	protected JMenuItem jMenuItemSiguientesCateTipoAfiliacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCateTipoAfiliacion;
	protected JMenuItem jMenuItemAbrirOrderByCateTipoAfiliacion;
	protected JMenuItem jMenuItemMostrarOcultarCateTipoAfiliacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCateTipoAfiliacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCateTipoAfiliacion;
	protected JCheckBox jCheckBoxSeleccionadosCateTipoAfiliacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCateTipoAfiliacion;
	protected JCheckBox jCheckBoxConGraficoReporteCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCateTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCateTipoAfiliacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCateTipoAfiliacion;
	protected JTextField jTextFieldValorCampoGeneralCateTipoAfiliacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCateTipoAfiliacion;
	//public JList<Reporte> jListColumnasSelectReporteCateTipoAfiliacion;
	//public JScrollPane jScrollColumnasSelectReporteCateTipoAfiliacion;
	
	//public JLabel jLabelRelacionesSelectReporteCateTipoAfiliacion;
	//public JList<Reporte> jListRelacionesSelectReporteCateTipoAfiliacion;
	//public JScrollPane jScrollRelacionesSelectReporteCateTipoAfiliacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCateTipoAfiliacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCateTipoAfiliacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion;
	
		
	//public JLabel jLabelArchivoImportacionCateTipoAfiliacion;	
	//public JLabel jLabelPathArchivoImportacionCateTipoAfiliacion;
	//protected JTextField jTextFieldPathArchivoImportacionCateTipoAfiliacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCateTipoAfiliacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCateTipoAfiliacion;
	
	//public JLabel jLabelColumnaCategoriaValorCateTipoAfiliacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCateTipoAfiliacion;
	
	//public JLabel jLabelColumnasValoresGraficoCateTipoAfiliacion;
	//public JList<Reporte> jListColumnasValoresGraficoCateTipoAfiliacion;
	//public JScrollPane jScrollColumnasValoresGraficoCateTipoAfiliacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCateTipoAfiliacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCateTipoAfiliacion;	
	
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CateTipoAfiliacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CateTipoAfiliacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCateTipoAfiliacion)	{
		this.jButtonRecargarInformacionCateTipoAfiliacion = jButtonRecargarInformacionCateTipoAfiliacion;
	}
	
	public JButton getjButtonProcesarInformacionCateTipoAfiliacion() {
		return this.jButtonProcesarInformacionCateTipoAfiliacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCateTipoAfiliacion)	{
		this.jButtonProcesarInformacionCateTipoAfiliacion = jButtonProcesarInformacionCateTipoAfiliacion;
	}
	
	
	public JButton getjButtonRecargarInformacionCateTipoAfiliacion() {
		return this.jButtonRecargarInformacionCateTipoAfiliacion;
	}
	
	
	public List<CateTipoAfiliacion> getcatetipoafiliacions() {
		return this.catetipoafiliacions;
	}

	public void setcatetipoafiliacions(List<CateTipoAfiliacion> catetipoafiliacions) {
		this.catetipoafiliacions = catetipoafiliacions;
	}
	
	public List<CateTipoAfiliacion> getcatetipoafiliacionsAux() {
		return this.catetipoafiliacionsAux;
	}

	public void setcatetipoafiliacionsAux(List<CateTipoAfiliacion> catetipoafiliacionsAux) {
		this.catetipoafiliacionsAux = catetipoafiliacionsAux;
	}
	
	public List<CateTipoAfiliacion> getcatetipoafiliacionsEliminados() {
		return this.catetipoafiliacionsEliminados;
	}

	public void setCateTipoAfiliacionsEliminados(List<CateTipoAfiliacion> catetipoafiliacionsEliminados) {
		this.catetipoafiliacionsEliminados = catetipoafiliacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCateTipoAfiliacion() {
		return jComboBoxTiposSeleccionarCateTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCateTipoAfiliacion(
			JComboBox jComboBoxTiposSeleccionarCateTipoAfiliacion) {
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion = jComboBoxTiposSeleccionarCateTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposSeleccionarCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCateTipoAfiliacion() {
		return jTextFieldValorCampoGeneralCateTipoAfiliacion;
	}

	public void setjTextFieldValorCampoGeneralCateTipoAfiliacion(
			JTextField jTextFieldValorCampoGeneralCateTipoAfiliacion) {
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion = jTextFieldValorCampoGeneralCateTipoAfiliacion;
	}

	public void setBorderResaltarValorCampoGeneralCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCateTipoAfiliacion() {
		return this.jCheckBoxSeleccionarTodosCateTipoAfiliacion;
	}

	public void setjCheckBoxSeleccionarTodosCateTipoAfiliacion(
			JCheckBox jCheckBoxSeleccionarTodosCateTipoAfiliacion) {
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion = jCheckBoxSeleccionarTodosCateTipoAfiliacion;
	}

	public void setBorderResaltarSeleccionarTodosCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCateTipoAfiliacion() {
		return this.jCheckBoxSeleccionadosCateTipoAfiliacion;
	}

	public void setjCheckBoxSeleccionadosCateTipoAfiliacion(
			JCheckBox jCheckBoxSeleccionadosCateTipoAfiliacion) {
		this.jCheckBoxSeleccionadosCateTipoAfiliacion = jCheckBoxSeleccionadosCateTipoAfiliacion;
	}
	
	public void setBorderResaltarSeleccionadosCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCateTipoAfiliacion() {
		return this.jComboBoxTiposArchivosReportesCateTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCateTipoAfiliacion(
			JComboBox jComboBoxTiposArchivosReportesCateTipoAfiliacion) {
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion = jComboBoxTiposArchivosReportesCateTipoAfiliacion;
	}

	public void setBorderResaltarTiposArchivosReportesCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCateTipoAfiliacion() {
		return this.jComboBoxTiposReportesCateTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCateTipoAfiliacion(
			JComboBox jComboBoxTiposReportesCateTipoAfiliacion) {
		this.jComboBoxTiposReportesCateTipoAfiliacion = jComboBoxTiposReportesCateTipoAfiliacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCateTipoAfiliacion() {
	//	return jComboBoxTiposReportesDinamicoCateTipoAfiliacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCateTipoAfiliacion(
	//		JComboBox jComboBoxTiposReportesDinamicoCateTipoAfiliacion) {
	//	this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion = jComboBoxTiposReportesDinamicoCateTipoAfiliacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion = jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion;
	//}
	
	public void setBorderResaltarTiposReportesCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCateTipoAfiliacion() {
		return this.jComboBoxTiposGraficosReportesCateTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCateTipoAfiliacion(
			JComboBox jComboBoxTiposGraficosReportesCateTipoAfiliacion) {
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion = jComboBoxTiposGraficosReportesCateTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCateTipoAfiliacion() {
		return this.jComboBoxTiposPaginacionCateTipoAfiliacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCateTipoAfiliacion(
			JComboBox jComboBoxTiposPaginacionCateTipoAfiliacion) {
		this.jComboBoxTiposPaginacionCateTipoAfiliacion = jComboBoxTiposPaginacionCateTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposPaginacionCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCateTipoAfiliacion() {
		return this.jComboBoxTiposRelacionesCateTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCateTipoAfiliacion() {
		return this.jComboBoxTiposAccionesCateTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCateTipoAfiliacion(
			JComboBox jComboBoxTiposRelacionesCateTipoAfiliacion) {
		this.jComboBoxTiposRelacionesCateTipoAfiliacion = jComboBoxTiposRelacionesCateTipoAfiliacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCateTipoAfiliacion(
			JComboBox jComboBoxTiposAccionesCateTipoAfiliacion) {
		this.jComboBoxTiposAccionesCateTipoAfiliacion = jComboBoxTiposAccionesCateTipoAfiliacion;
	}
	
	public void setBorderResaltarTiposRelacionesCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCateTipoAfiliacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCateTipoAfiliacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCateTipoAfiliacion() {
	//	return jCheckBoxConGraficoDinamicoCateTipoAfiliacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoCateTipoAfiliacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoCateTipoAfiliacion) {
	//	this.jCheckBoxConGraficoDinamicoCateTipoAfiliacion = jCheckBoxConGraficoDinamicoCateTipoAfiliacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCateTipoAfiliacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCateTipoAfiliacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCateTipoAfiliacion .setBorder(borderResaltar);		
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
		this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		
		this.catetipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.catetipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.catetipoafiliacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CateTipoAfiliacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CateTipoAfiliacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cate Tipo Afiliacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
		
		CateTipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CateTipoAfiliacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCateTipoAfiliacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"nuevo","nuevo","Nuevo"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"duplicar","duplicar","Duplicar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"copiar","copiar","Copiar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"ver_form","ver_form","Ver"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"recargar","recargar","Recargar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCateTipoAfiliacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,
							"cerrar","cerrar","Salir"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCateTipoAfiliacion;
			
				this.jButtonProcesarInformacionToolBarCateTipoAfiliacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCateTipoAfiliacion;
				
		//protected JButton jButtonModificarToolBarCateTipoAfiliacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCateTipoAfiliacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCateTipoAfiliacion=new JMenuMe("General");
		this.jmenuArchivoCateTipoAfiliacion=new JMenuMe("Archivo");
		this.jmenuAccionesCateTipoAfiliacion=new JMenuMe("Acciones");
		this.jmenuDatosCateTipoAfiliacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCateTipoAfiliacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCateTipoAfiliacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCateTipoAfiliacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCateTipoAfiliacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCateTipoAfiliacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCateTipoAfiliacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCateTipoAfiliacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCateTipoAfiliacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCateTipoAfiliacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCateTipoAfiliacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCateTipoAfiliacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCateTipoAfiliacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCateTipoAfiliacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCateTipoAfiliacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCateTipoAfiliacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCateTipoAfiliacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCateTipoAfiliacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCateTipoAfiliacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCateTipoAfiliacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCateTipoAfiliacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCateTipoAfiliacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCateTipoAfiliacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCateTipoAfiliacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCateTipoAfiliacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCateTipoAfiliacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCateTipoAfiliacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCateTipoAfiliacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCateTipoAfiliacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCateTipoAfiliacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCateTipoAfiliacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCateTipoAfiliacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCateTipoAfiliacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCateTipoAfiliacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCateTipoAfiliacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCateTipoAfiliacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCateTipoAfiliacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCateTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCateTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCateTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCateTipoAfiliacion.add(this.jMenuItemCerrarCateTipoAfiliacion);
			
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemNuevoCateTipoAfiliacion);
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion);
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemNuevoRelacionesCateTipoAfiliacion);
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion);		
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemDuplicarCateTipoAfiliacion);		
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemCopiarCateTipoAfiliacion);		
			this.jmenuAccionesCateTipoAfiliacion.add(this.jMenuItemVerFormCateTipoAfiliacion);		
			
			this.jmenuDatosCateTipoAfiliacion.add(this.jMenuItemRecargarInformacionCateTipoAfiliacion);				
			this.jmenuDatosCateTipoAfiliacion.add(this.jMenuItemAnterioresCateTipoAfiliacion);				
			this.jmenuDatosCateTipoAfiliacion.add(this.jMenuItemSiguientesCateTipoAfiliacion);				
			this.jmenuDatosCateTipoAfiliacion.add(this.jMenuItemAbrirOrderByCateTipoAfiliacion);				
			this.jmenuDatosCateTipoAfiliacion.add(this.jMenuItemMostrarOcultarCateTipoAfiliacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCateTipoAfiliacion.add(this.jMenuItemGuardarCambiosCateTipoAfiliacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCateTipoAfiliacion.add(this.jmenuArchivoCateTipoAfiliacion);		
			this.jmenuBarCateTipoAfiliacion.add(this.jmenuAccionesCateTipoAfiliacion);		
			this.jmenuBarCateTipoAfiliacion.add(this.jmenuDatosCateTipoAfiliacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCateTipoAfiliacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCateTipoAfiliacion() {
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
			//this.jInternalFrameDetalleCateTipoAfiliacion = new CateTipoAfiliacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cate Tipo Afiliacion DATOS");
			this.jInternalFrameDetalleFormCateTipoAfiliacion = new CateTipoAfiliacionDetalleFormJInternalFrame(jDesktopPane,this.catetipoafiliacionSessionBean.getConGuardarRelaciones(),this.catetipoafiliacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCateTipoAfiliacion = null;//new CateTipoAfiliacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCateTipoAfiliacion= new GridBagLayout();
		
		
		this.jTableDatosCateTipoAfiliacion = new JTableMe();      
		
		String sToolTipCateTipoAfiliacion="";
		sToolTipCateTipoAfiliacion=CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCateTipoAfiliacion+="(Nomina.CateTipoAfiliacion)";
		}
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipCateTipoAfiliacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCateTipoAfiliacion.setToolTipText(sToolTipCateTipoAfiliacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCateTipoAfiliacion);
		this.jTableDatosCateTipoAfiliacion.setAutoCreateRowSorter(true);
		this.jTableDatosCateTipoAfiliacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCateTipoAfiliacion.setRowSelectionAllowed(true);
		this.jTableDatosCateTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCateTipoAfiliacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCateTipoAfiliacion = new JButtonMe();
		this.jButtonDuplicarCateTipoAfiliacion = new JButtonMe();
		this.jButtonCopiarCateTipoAfiliacion = new JButtonMe();
		this.jButtonVerFormCateTipoAfiliacion = new JButtonMe();
		this.jButtonNuevoRelacionesCateTipoAfiliacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarCateTipoAfiliacion = new JButtonMe();
		
		this.jScrollPanelDatosCateTipoAfiliacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralCateTipoAfiliacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cate Tipo Afiliacion";
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosCateTipoAfiliacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCateTipoAfiliacion.setToolTipText("Acciones");
        this.jPanelAccionesCateTipoAfiliacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCateTipoAfiliacion=new ReporteDinamicoJInternalFrame(CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCateTipoAfiliacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCateTipoAfiliacion=new ImportacionJInternalFrame(CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCateTipoAfiliacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCateTipoAfiliacion = new JButtonMe();
		
		this.jButtonAbrirOrderByCateTipoAfiliacion.setText("Orden");
		this.jButtonAbrirOrderByCateTipoAfiliacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCateTipoAfiliacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCateTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCateTipoAfiliacion,false,this);
			
			//this.cargarOrderByCateTipoAfiliacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCateTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCateTipoAfiliacion,true,this);
			
			//this.cargarOrderByCateTipoAfiliacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCateTipoAfiliacion.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosCateTipoAfiliacion.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosCateTipoAfiliacion.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosCateTipoAfiliacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCateTipoAfiliacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCateTipoAfiliacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCateTipoAfiliacion.setText("Nuevo");
		this.jButtonDuplicarCateTipoAfiliacion.setText("Duplicar");
		this.jButtonCopiarCateTipoAfiliacion.setText("Copiar");
		this.jButtonVerFormCateTipoAfiliacion.setText("Ver");
		this.jButtonNuevoRelacionesCateTipoAfiliacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setText("Guardar");
		this.jButtonCerrarCateTipoAfiliacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCateTipoAfiliacion,"nuevo_button","Nuevo",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCateTipoAfiliacion,"duplicar_button","Duplicar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCateTipoAfiliacion,"copiar_button","Copiar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCateTipoAfiliacion,"ver_form","Ver",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCateTipoAfiliacion,"nuevorelaciones_button","Nuevo Rel",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCateTipoAfiliacion,"guardarcambiostabla_button","Guardar",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCateTipoAfiliacion,"cerrar_button","Salir",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCateTipoAfiliacion.setToolTipText("Nuevo"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCateTipoAfiliacion.setToolTipText("Duplicar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCateTipoAfiliacion.setToolTipText("Copiar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCateTipoAfiliacion.setToolTipText("Ver"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCateTipoAfiliacion.setToolTipText("Nuevo Rel"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setToolTipText("Guardar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCateTipoAfiliacion.setToolTipText("Salir"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCateTipoAfiliacion";
		inputMap = this.jButtonNuevoCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCateTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCateTipoAfiliacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarCateTipoAfiliacion";
		inputMap = this.jButtonDuplicarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCateTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCateTipoAfiliacion"));
		
		//COPIAR
		sMapKey = "CopiarCateTipoAfiliacion";
		inputMap = this.jButtonCopiarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCateTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCateTipoAfiliacion"));
		
		//VEr FORM
		sMapKey = "VerFormCateTipoAfiliacion";
		inputMap = this.jButtonVerFormCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCateTipoAfiliacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCateTipoAfiliacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCateTipoAfiliacion";
		inputMap = this.jButtonNuevoRelacionesCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCateTipoAfiliacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCateTipoAfiliacion";
		inputMap = this.jButtonModificarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCateTipoAfiliacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCateTipoAfiliacion";
		inputMap = this.jButtonCerrarCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCateTipoAfiliacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCateTipoAfiliacion";
		inputMap = this.jButtonGuardarCambiosTablaCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCateTipoAfiliacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCateTipoAfiliacion.setName("jPanelParametrosReportesCateTipoAfiliacion"); 
		
		this.jPanelParametrosReportesAccionesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCateTipoAfiliacion.setName("jPanelParametrosReportesAccionesCateTipoAfiliacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCateTipoAfiliacion = new JButtonMe();
		this.jButtonRecargarInformacionCateTipoAfiliacion.setText("Recargar");
		this.jButtonRecargarInformacionCateTipoAfiliacion.setToolTipText("Recargar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCateTipoAfiliacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCateTipoAfiliacion = new JButtonMe();
		this.jButtonProcesarInformacionCateTipoAfiliacion.setText("Procesar");
		this.jButtonProcesarInformacionCateTipoAfiliacion.setToolTipText("Procesar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCateTipoAfiliacion.setVisible(false);
			
		this.jButtonProcesarInformacionCateTipoAfiliacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCateTipoAfiliacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCateTipoAfiliacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposReportesCateTipoAfiliacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCateTipoAfiliacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionCateTipoAfiliacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCateTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposRelacionesCateTipoAfiliacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCateTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setText("Accion");
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCateTipoAfiliacion = new JLabelMe();
		
		this.jLabelAccionesCateTipoAfiliacion.setText("Acciones");		
		this.jLabelAccionesCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCateTipoAfiliacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCateTipoAfiliacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCateTipoAfiliacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCateTipoAfiliacion = new JButtonMe();
		//this.jButtonAnterioresCateTipoAfiliacion.setText("<<");
        this.jButtonAnterioresCateTipoAfiliacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCateTipoAfiliacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCateTipoAfiliacion = new JButtonMe();
		//this.jButtonSiguientesCateTipoAfiliacion.setText(">>");
        this.jButtonSiguientesCateTipoAfiliacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCateTipoAfiliacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCateTipoAfiliacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCateTipoAfiliacion,"nuevoguardarcambios_button","Nue",this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCateTipoAfiliacion";
		inputMap = this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCateTipoAfiliacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCateTipoAfiliacion";
		inputMap = this.jButtonRecargarInformacionCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCateTipoAfiliacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCateTipoAfiliacion";
		inputMap = this.jButtonSiguientesCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCateTipoAfiliacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCateTipoAfiliacion";
		inputMap = this.jButtonAnterioresCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCateTipoAfiliacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCateTipoAfiliacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCateTipoAfiliacion.setMinimumSize(new Dimension(this.getWidth(),CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCateTipoAfiliacion.setMaximumSize(new Dimension(this.getWidth(),CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCateTipoAfiliacion.setPreferredSize(new Dimension(this.getWidth(),CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CateTipoAfiliacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCateTipoAfiliacion = new GridBagLayout();

			this.jPanelPaginacionCateTipoAfiliacion.setLayout(gridaBagLayoutPaginacionCateTipoAfiliacion);						
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonAnterioresCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					
						
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
			
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonNuevoGuardarCambiosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
						
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonSiguientesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonNuevoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
				this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonNuevoRelacionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			}
			
			
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
				this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonGuardarCambiosTablaCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			}
			
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonDuplicarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonCopiarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonVerFormCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 1;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCateTipoAfiliacion.add(this.jButtonCerrarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
		
		
		this.jButtonRecargarInformacionCateTipoAfiliacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCateTipoAfiliacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCateTipoAfiliacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCateTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCateTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCateTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCateTipoAfiliacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCateTipoAfiliacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCateTipoAfiliacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCateTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCateTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCateTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCateTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCateTipoAfiliacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCateTipoAfiliacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCateTipoAfiliacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCateTipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCateTipoAfiliacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CateTipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CateTipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CateTipoAfiliacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CateTipoAfiliacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCateTipoAfiliacion.setLayout(gridaBagParametrosReportesCateTipoAfiliacion);
			this.jPanelParametrosReportesAccionesCateTipoAfiliacion.setLayout(gridaBagParametrosReportesAccionesCateTipoAfiliacion);
			
			
			this.jPanelParametrosAuxiliar1CateTipoAfiliacion.setLayout(gridaBagParametrosAuxiliar1CateTipoAfiliacion);
			this.jPanelParametrosAuxiliar2CateTipoAfiliacion.setLayout(gridaBagParametrosAuxiliar2CateTipoAfiliacion);
			this.jPanelParametrosAuxiliar3CateTipoAfiliacion.setLayout(gridaBagParametrosAuxiliar3CateTipoAfiliacion);
			this.jPanelParametrosAuxiliar4CateTipoAfiliacion.setLayout(gridaBagParametrosAuxiliar4CateTipoAfiliacion);
			//this.jPanelParametrosAuxiliar5CateTipoAfiliacion.setLayout(gridaBagParametrosAuxiliar2CateTipoAfiliacion);			
			
			
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jButtonRecargarInformacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CateTipoAfiliacion.add(this.jComboBoxTiposPaginacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CateTipoAfiliacion.add(this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CateTipoAfiliacion.add(this.jComboBoxTiposArchivosReportesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jPanelParametrosAuxiliar1CateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CateTipoAfiliacion.add(this.jComboBoxTiposReportesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jPanelParametrosAuxiliar4CateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jComboBoxTiposReportesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jCheckBoxGenerarReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jPanelParametrosAuxiliar2CateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jLabelAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
				this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jButtonAbrirOrderByCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jComboBoxTiposSeleccionarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			
			
			/*
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jCheckBoxSeleccionarTodosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CateTipoAfiliacion.add(this.jCheckBoxSeleccionarTodosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);															
				
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CateTipoAfiliacion.add(this.jCheckBoxSeleccionadosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jPanelParametrosAuxiliar3CateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jComboBoxTiposRelacionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
				
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jComboBoxTiposAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
	
				
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCateTipoAfiliacion.add(this.jTextFieldValorCampoGeneralCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCateTipoAfiliacion = new GridBagLayout();

			this.jScrollPanelDatosCateTipoAfiliacion.setLayout(gridaBagLayoutDatosCateTipoAfiliacion);
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
			
			this.jScrollPanelDatosCateTipoAfiliacion.add(this.jTableDatosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCateTipoAfiliacion.setViewportView(this.jTableDatosCateTipoAfiliacion);
		this.jTableDatosCateTipoAfiliacion.setFillsViewportHeight(true);
		this.jTableDatosCateTipoAfiliacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCateTipoAfiliacion= new GridBagLayout();
		this.jPanelAccionesCateTipoAfiliacion.setLayout(gridaBagLayoutAccionesCateTipoAfiliacion);
		
		
		/*	
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = 0;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
			
		this.jPanelAccionesCateTipoAfiliacion.add(this.jButtonNuevoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCateTipoAfiliacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCateTipoAfiliacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();						
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;		
			//this.gridBagConstraintsCateTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCateTipoAfiliacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;		
		//this.gridBagConstraintsCateTipoAfiliacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCateTipoAfiliacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCateTipoAfiliacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);								
		
		
		/*
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		*/		
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCateTipoAfiliacion.gridx =0;
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCateTipoAfiliacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
				
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCateTipoAfiliacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCateTipoAfiliacion = new GridBagLayout();
			this.jPanelBusquedasParametrosCateTipoAfiliacion.setLayout(gridaBagLayoutBusquedasParametrosCateTipoAfiliacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCateTipoAfiliacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
			
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCateTipoAfiliacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCateTipoAfiliacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCateTipoAfiliacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCateTipoAfiliacion.setName("jPanelReporteDinamicoCateTipoAfiliacion"); 
		
		this.jPanelReporteDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCateTipoAfiliacion.setLayout(gridaBagLayoutReporteDinamicoCateTipoAfiliacion);
		
		
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCateTipoAfiliacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCateTipoAfiliacion = new JLabelMe();

		this.jLabelColumnasSelectReporteCateTipoAfiliacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jLabelColumnasSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCateTipoAfiliacion = new JList<Reporte>();
		this.jListColumnasSelectReporteCateTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCateTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCateTipoAfiliacion=new JScrollPane(this.jListColumnasSelectReporteCateTipoAfiliacion);
			
			this.jScrollColumnasSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jListColumnasSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jScrollColumnasSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCateTipoAfiliacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteCateTipoAfiliacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jLabelRelacionesSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCateTipoAfiliacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteCateTipoAfiliacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCateTipoAfiliacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCateTipoAfiliacion=new JScrollPane(this.jListRelacionesSelectReporteCateTipoAfiliacion);
			
			this.jScrollRelacionesSelectReporteCateTipoAfiliacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCateTipoAfiliacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCateTipoAfiliacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jListRelacionesSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jScrollRelacionesSelectReporteCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCateTipoAfiliacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCateTipoAfiliacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoCateTipoAfiliacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jLabelGenerarExcelReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion.setToolTipText("Generar EXCEL"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		//this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jComboBoxTiposReportesDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jLabelTiposArchivoReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jComboBoxTiposArchivosReportesDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCateTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCateTipoAfiliacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCateTipoAfiliacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCateTipoAfiliacion.setToolTipText("Generar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jButtonGenerarReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCateTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCateTipoAfiliacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCateTipoAfiliacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCateTipoAfiliacion.setToolTipText("Cancelar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCateTipoAfiliacion.add(this.jButtonCerrarReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCateTipoAfiliacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion= new JScrollPane(jPanelReporteDinamicoCateTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCateTipoAfiliacion);
		this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getContentPane().add(this.jScrollPanelReporteDinamicoCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCateTipoAfiliacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCateTipoAfiliacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCateTipoAfiliacion.setName("jPanelImportacionCateTipoAfiliacion"); 
		
		this.jPanelImportacionCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCateTipoAfiliacion.setLayout(gridaBagLayoutImportacionCateTipoAfiliacion);
		
		
		this.jInternalFrameImportacionCateTipoAfiliacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCateTipoAfiliacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCateTipoAfiliacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCateTipoAfiliacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCateTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCateTipoAfiliacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCateTipoAfiliacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCateTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCateTipoAfiliacion.setResizable(true);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setClosable(true);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCateTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCateTipoAfiliacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCateTipoAfiliacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCateTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCateTipoAfiliacion.setResizable(true);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setClosable(true);
	    this.jInternalFrameImportacionCateTipoAfiliacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCateTipoAfiliacion = new JLabelMe();

		this.jLabelArchivoImportacionCateTipoAfiliacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCateTipoAfiliacion.add(this.jLabelArchivoImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCateTipoAfiliacion = new JFileChooser();		
		this.jFileChooserImportacionCateTipoAfiliacion.setToolTipText("ESCOGER ARCHIVO"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCateTipoAfiliacion = new JButtonMe();
		this.jButtonAbrirImportacionCateTipoAfiliacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCateTipoAfiliacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCateTipoAfiliacion.setToolTipText("Generar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCateTipoAfiliacion.add(this.jButtonAbrirImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCateTipoAfiliacion = new JLabelMe();

		this.jLabelPathArchivoImportacionCateTipoAfiliacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCateTipoAfiliacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCateTipoAfiliacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCateTipoAfiliacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCateTipoAfiliacion.add(this.jLabelPathArchivoImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCateTipoAfiliacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCateTipoAfiliacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCateTipoAfiliacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCateTipoAfiliacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCateTipoAfiliacion.add(this.jTextFieldPathArchivoImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCateTipoAfiliacion = new JButtonMe();
		this.jButtonGenerarImportacionCateTipoAfiliacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCateTipoAfiliacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCateTipoAfiliacion.setToolTipText("Generar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCateTipoAfiliacion.add(this.jButtonGenerarImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCateTipoAfiliacion = new JButtonMe();
		this.jButtonCerrarImportacionCateTipoAfiliacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCateTipoAfiliacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCateTipoAfiliacion.setToolTipText("Cancelar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCateTipoAfiliacion.add(this.jButtonCerrarImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCateTipoAfiliacion = new GridBagLayout();
		
		this.jScrollPanelImportacionCateTipoAfiliacion= new JScrollPane(jPanelImportacionCateTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
		this.gridBagConstraintsCateTipoAfiliacion.gridy =iPosYImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXImportacion;
		this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCateTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCateTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCateTipoAfiliacion);
		this.jInternalFrameImportacionCateTipoAfiliacion.getContentPane().add(this.jScrollPanelImportacionCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCateTipoAfiliacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCateTipoAfiliacion = new JButtonMe();
			this.jButtonAbrirOrderByCateTipoAfiliacion.setText("Orden");
			this.jButtonAbrirOrderByCateTipoAfiliacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCateTipoAfiliacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCateTipoAfiliacion";
			inputMap = this.jButtonAbrirOrderByCateTipoAfiliacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCateTipoAfiliacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCateTipoAfiliacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByCateTipoAfiliacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCateTipoAfiliacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCateTipoAfiliacion.setName("jPanelOrderByCateTipoAfiliacion"); 
			
			this.jPanelOrderByCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCateTipoAfiliacion.setLayout(gridaBagLayoutOrderByCateTipoAfiliacion);
			
			
			this.jTableDatosCateTipoAfiliacionOrderBy = new JTableMe();        
			this.jTableDatosCateTipoAfiliacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCateTipoAfiliacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCateTipoAfiliacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCateTipoAfiliacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCateTipoAfiliacionOrderBy.setViewportView(this.jTableDatosCateTipoAfiliacionOrderBy);
			this.jTableDatosCateTipoAfiliacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCateTipoAfiliacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCateTipoAfiliacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCateTipoAfiliacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCateTipoAfiliacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCateTipoAfiliacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCateTipoAfiliacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCateTipoAfiliacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCateTipoAfiliacion.setTitle("Orden");
			this.jInternalFrameOrderByCateTipoAfiliacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCateTipoAfiliacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCateTipoAfiliacion.setResizable(true);
			this.jInternalFrameOrderByCateTipoAfiliacion.setClosable(true);
			this.jInternalFrameOrderByCateTipoAfiliacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCateTipoAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cate Tipo Afiliaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCateTipoAfiliacion.ipady =150;
				
			this.jPanelOrderByCateTipoAfiliacion.add(jScrollPanelDatosCateTipoAfiliacionOrderBy, this.gridBagConstraintsCateTipoAfiliacion);//this.jTableDatosCateTipoAfiliacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCateTipoAfiliacion = new JButtonMe();
			this.jButtonCerrarOrderByCateTipoAfiliacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCateTipoAfiliacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCateTipoAfiliacion.setToolTipText("Cancelar"+" "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCateTipoAfiliacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCateTipoAfiliacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCateTipoAfiliacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCateTipoAfiliacion.add(this.jButtonCerrarOrderByCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCateTipoAfiliacion = new GridBagLayout();
			
			this.jScrollPanelOrderByCateTipoAfiliacion= new JScrollPane(jPanelOrderByCateTipoAfiliacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCateTipoAfiliacion = new GridBagConstraints();
			this.gridBagConstraintsCateTipoAfiliacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsCateTipoAfiliacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsCateTipoAfiliacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCateTipoAfiliacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCateTipoAfiliacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCateTipoAfiliacion);
			
			this.jInternalFrameOrderByCateTipoAfiliacion.getContentPane().add(this.jScrollPanelOrderByCateTipoAfiliacion, this.gridBagConstraintsCateTipoAfiliacion);			
		
		} else {
			this.jButtonAbrirOrderByCateTipoAfiliacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.catetipoafiliacionSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCateTipoAfiliacion.getRowHeight();//CateTipoAfiliacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.isSelected()) {
					iHeightTable=CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCateTipoAfiliacion.isSelected()) {
					iHeightTable=CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CateTipoAfiliacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCateTipoAfiliacion!=null && this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy()!=null) {
			//if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCateTipoAfiliacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCateTipoAfiliacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCateTipoAfiliacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCateTipoAfiliacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCateTipoAfiliacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCateTipoAfiliacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=catetipoafiliacionLogic.getCateTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=catetipoafiliacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CateTipoAfiliacion> TraerCateTipoAfiliacionBeans(List<CateTipoAfiliacion> catetipoafiliacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacions) {
					
				if(!(CateTipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CateTipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					catetipoafiliacion.setsDetalleGeneralEntityReporte(CateTipoAfiliacionConstantesFunciones.getCateTipoAfiliacionDescripcion(catetipoafiliacion));
										
					catetipoafiliacion.setes_defecto_descripcion(CateTipoAfiliacionConstantesFunciones.getes_defectoDescripcion(catetipoafiliacion));	
					
					

					if(catetipoafiliacion.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{catetipoafiliacion.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(catetipoafiliacion.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(catetipoafiliacion.getTipoAfiliacions()!=null && Funciones.existeClass(classes,TipoAfiliacion.class)) {
						try{catetipoafiliacion.settipoafiliacionsDescripcionReporte(new JRBeanCollectionDataSource(TipoAfiliacionJInternalFrame.TraerTipoAfiliacionBeans(catetipoafiliacion.getTipoAfiliacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//catetipoafiliacion.setsDetalleGeneralEntityReporte(catetipoafiliacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//catetipoafiliacionbeans.add(catetipoafiliacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return catetipoafiliacions;
    }
	//PARA REPORTES FIN
}
