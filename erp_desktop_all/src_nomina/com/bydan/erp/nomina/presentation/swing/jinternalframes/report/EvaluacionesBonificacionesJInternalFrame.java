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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.EvaluacionesBonificacionesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class EvaluacionesBonificacionesJInternalFrame extends EvaluacionesBonificacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionesBonificaciones;
	
	protected JMenuBar jmenuBarEvaluacionesBonificaciones;
	
	protected JMenu jmenuEvaluacionesBonificaciones;
	protected JMenu jmenuDatosEvaluacionesBonificaciones;
	protected JMenu jmenuArchivoEvaluacionesBonificaciones;
	protected JMenu jmenuAccionesEvaluacionesBonificaciones;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionesBonificaciones;	
	protected GridBagConstraints gridBagConstraintsEvaluacionesBonificaciones;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionesBonificacionesDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionesBonificaciones;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionesBonificaciones;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionesBonificaciones;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoCalificacionEmpleadoBeanSwingJInternalFrame tipocalificacionempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocalificacionempleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public EvaluacionesBonificacionesSessionBean evaluacionesbonificacionesSessionBean;
		
	
	
	public TipoCalificacionEmpleadoSessionBean tipocalificacionempleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionesBonificaciones> evaluacionesbonificacioness;		
	public List<EvaluacionesBonificaciones> evaluacionesbonificacionessEliminados;	
	public List<EvaluacionesBonificaciones> evaluacionesbonificacionessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionesBonificaciones;		
	protected JButton jButtonAbrirOrderByEvaluacionesBonificaciones;
	
	
	//protected JPanel jPanelOrderByEvaluacionesBonificaciones;
	//public JScrollPane jScrollPanelOrderByEvaluacionesBonificaciones;	
	//protected JButton jButtonCerrarOrderByEvaluacionesBonificaciones;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionesBonificacionesLogic evaluacionesbonificacionesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionesBonificaciones;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionesBonificaciones;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionesBonificaciones;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionesBonificacionesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionesBonificaciones;
	//public JScrollPane jScrollPanelImportacionEvaluacionesBonificaciones;
	
	
	
	protected JPanel jPanelAccionesEvaluacionesBonificaciones;
	
    protected JPanel jPanelPaginacionEvaluacionesBonificaciones;
    protected JPanel jPanelParametrosReportesEvaluacionesBonificaciones;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionesBonificaciones;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionesBonificaciones;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionesBonificaciones;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionesBonificaciones;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionesBonificaciones;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionesBonificaciones;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionesBonificaciones;
	//protected JPanel jPanelImportacionEvaluacionesBonificaciones;
	
	
	public JTable jTableDatosEvaluacionesBonificaciones;
	
	
	
	//public JTable jTableDatosEvaluacionesBonificacionesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionesBonificaciones;
	protected JButton jButtonDuplicarEvaluacionesBonificaciones;
	protected JButton jButtonCopiarEvaluacionesBonificaciones;
	protected JButton jButtonVerFormEvaluacionesBonificaciones;
	protected JButton jButtonNuevoRelacionesEvaluacionesBonificaciones;
	protected JButton jButtonModificarEvaluacionesBonificaciones;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionesBonificaciones;
	protected JButton jButtonCerrarEvaluacionesBonificaciones;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionesBonificaciones;
	protected JButton jButtonProcesarInformacionEvaluacionesBonificaciones;
	
	
	protected JButton jButtonAnterioresEvaluacionesBonificaciones;
	protected JButton jButtonSiguientesEvaluacionesBonificaciones;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionesBonificaciones;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionesBonificaciones;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionesBonificaciones;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionesBonificaciones;
	//protected JButton jButtonGenerarImportacionEvaluacionesBonificaciones;
	//protected JButton jButtonCerrarImportacionEvaluacionesBonificaciones;
	//protected JFileChooser jFileChooserImportacionEvaluacionesBonificaciones;
	//protected File fileImportacionEvaluacionesBonificaciones;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionesBonificaciones;
	protected JButton jButtonDuplicarToolBarEvaluacionesBonificaciones;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionesBonificaciones;
	protected JButton jButtonCopiarToolBarEvaluacionesBonificaciones;
	protected JButton jButtonVerFormToolBarEvaluacionesBonificaciones;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionesBonificaciones;
	protected JButton jButtonCerrarToolBarEvaluacionesBonificaciones;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionesBonificaciones;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionesBonificaciones;
	protected JButton jButtonAnterioresToolBarEvaluacionesBonificaciones;
	protected JButton jButtonSiguientesToolBarEvaluacionesBonificaciones;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionesBonificaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDuplicarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionesBonificaciones;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemCopiarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemVerFormEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemCerrarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemAnterioresEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemSiguientesEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionesBonificaciones;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionesBonificaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionesBonificaciones;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionesBonificaciones;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionesBonificaciones;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionesBonificaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionesBonificaciones;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionesBonificaciones;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionesBonificaciones;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionesBonificaciones;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionesBonificaciones;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionesBonificaciones;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionesBonificaciones;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionesBonificaciones;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionesBonificaciones;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionesBonificaciones;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionesBonificaciones;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionesBonificaciones;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionesBonificaciones;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionesBonificaciones;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionesBonificaciones;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionesBonificaciones;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionesBonificaciones;
	public JPanel jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JButton jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	
	public JPanel jPanelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JLabel jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JLabel jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JCheckBox jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JButton jButtonverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JLabel jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JButton jButtonid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesUpdate= new JButtonMe();
	public JButton jButtonid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JLabel jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JTextField jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones;
	public JButton jButtoncodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificacionesBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EvaluacionesBonificacionesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionesBonificacionesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionesBonificaciones)	{
		this.jButtonRecargarInformacionEvaluacionesBonificaciones = jButtonRecargarInformacionEvaluacionesBonificaciones;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionesBonificaciones() {
		return this.jButtonProcesarInformacionEvaluacionesBonificaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionesBonificaciones)	{
		this.jButtonProcesarInformacionEvaluacionesBonificaciones = jButtonProcesarInformacionEvaluacionesBonificaciones;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionesBonificaciones() {
		return this.jButtonRecargarInformacionEvaluacionesBonificaciones;
	}
	
	
	public List<EvaluacionesBonificaciones> getevaluacionesbonificacioness() {
		return this.evaluacionesbonificacioness;
	}

	public void setevaluacionesbonificacioness(List<EvaluacionesBonificaciones> evaluacionesbonificacioness) {
		this.evaluacionesbonificacioness = evaluacionesbonificacioness;
	}
	
	public List<EvaluacionesBonificaciones> getevaluacionesbonificacionessAux() {
		return this.evaluacionesbonificacionessAux;
	}

	public void setevaluacionesbonificacionessAux(List<EvaluacionesBonificaciones> evaluacionesbonificacionessAux) {
		this.evaluacionesbonificacionessAux = evaluacionesbonificacionessAux;
	}
	
	public List<EvaluacionesBonificaciones> getevaluacionesbonificacionessEliminados() {
		return this.evaluacionesbonificacionessEliminados;
	}

	public void setEvaluacionesBonificacionessEliminados(List<EvaluacionesBonificaciones> evaluacionesbonificacionessEliminados) {
		this.evaluacionesbonificacionessEliminados = evaluacionesbonificacionessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionesBonificaciones() {
		return jComboBoxTiposSeleccionarEvaluacionesBonificaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposSeleccionarEvaluacionesBonificaciones) {
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones = jComboBoxTiposSeleccionarEvaluacionesBonificaciones;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionesBonificaciones() {
		return jTextFieldValorCampoGeneralEvaluacionesBonificaciones;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionesBonificaciones(
			JTextField jTextFieldValorCampoGeneralEvaluacionesBonificaciones) {
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones = jTextFieldValorCampoGeneralEvaluacionesBonificaciones;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionesBonificaciones() {
		return this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionesBonificaciones(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionesBonificaciones) {
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones = jCheckBoxSeleccionarTodosEvaluacionesBonificaciones;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionesBonificaciones() {
		return this.jCheckBoxSeleccionadosEvaluacionesBonificaciones;
	}

	public void setjCheckBoxSeleccionadosEvaluacionesBonificaciones(
			JCheckBox jCheckBoxSeleccionadosEvaluacionesBonificaciones) {
		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones = jCheckBoxSeleccionadosEvaluacionesBonificaciones;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionesBonificaciones) {
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones = jComboBoxTiposArchivosReportesEvaluacionesBonificaciones;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposReportesEvaluacionesBonificaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposReportesEvaluacionesBonificaciones) {
		this.jComboBoxTiposReportesEvaluacionesBonificaciones = jComboBoxTiposReportesEvaluacionesBonificaciones;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionesBonificaciones() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionesBonificaciones(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones = jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones = jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionesBonificaciones) {
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones = jComboBoxTiposGraficosReportesEvaluacionesBonificaciones;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionesBonificaciones() {
		return this.jComboBoxTiposPaginacionEvaluacionesBonificaciones;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposPaginacionEvaluacionesBonificaciones) {
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones = jComboBoxTiposPaginacionEvaluacionesBonificaciones;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposRelacionesEvaluacionesBonificaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionesBonificaciones() {
		return this.jComboBoxTiposAccionesEvaluacionesBonificaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposRelacionesEvaluacionesBonificaciones) {
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones = jComboBoxTiposRelacionesEvaluacionesBonificaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionesBonificaciones(
			JComboBox jComboBoxTiposAccionesEvaluacionesBonificaciones) {
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones = jComboBoxTiposAccionesEvaluacionesBonificaciones;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionesBonificaciones() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionesBonificaciones() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionesBonificaciones(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones = jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionesBonificaciones() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionesBonificaciones.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones .setBorder(borderResaltar);		
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
		this.evaluacionesbonificacionesSessionBean=new EvaluacionesBonificacionesSessionBean();
		
		this.evaluacionesbonificacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionesbonificacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionesBonificacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionesBonificacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluaciones Bonificaciones MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionesBonificacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionesBonificaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionesBonificaciones= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"copiar","copiar","Copiar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"ver_form","ver_form","Ver"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"recargar","recargar","Buscar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionesBonificaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionesBonificaciones,this.jTtoolBarEvaluacionesBonificaciones,
							"cerrar","cerrar","Salir"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionesBonificaciones;
			
				this.jButtonProcesarInformacionToolBarEvaluacionesBonificaciones=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionesBonificaciones;
				
		//protected JButton jButtonModificarToolBarEvaluacionesBonificaciones;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionesBonificaciones=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionesBonificaciones=new JMenuMe("General");
		this.jmenuArchivoEvaluacionesBonificaciones=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionesBonificaciones=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionesBonificaciones=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionesBonificaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionesBonificaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionesBonificaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionesBonificaciones= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionesBonificaciones.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionesBonificaciones,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionesBonificaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionesBonificaciones= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionesBonificaciones.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionesBonificaciones,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionesBonificaciones= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionesBonificaciones.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionesBonificaciones,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionesBonificaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionesBonificaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionesBonificaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionesBonificaciones= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionesBonificaciones.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionesBonificaciones,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionesBonificaciones= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionesBonificaciones.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionesBonificaciones,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionesBonificaciones= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionesBonificaciones.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionesBonificaciones,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionesBonificaciones= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionesBonificaciones.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionesBonificaciones,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionesBonificaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionesBonificaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionesBonificaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionesBonificaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionesBonificaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionesBonificaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionesBonificaciones.add(this.jMenuItemCerrarEvaluacionesBonificaciones);
			
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemNuevoEvaluacionesBonificaciones);
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemNuevoGuardarCambiosEvaluacionesBonificaciones);
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemNuevoRelacionesEvaluacionesBonificaciones);
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemGuardarCambiosTablaEvaluacionesBonificaciones);		
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemDuplicarEvaluacionesBonificaciones);		
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemCopiarEvaluacionesBonificaciones);		
			this.jmenuAccionesEvaluacionesBonificaciones.add(this.jMenuItemVerFormEvaluacionesBonificaciones);		
			
			this.jmenuDatosEvaluacionesBonificaciones.add(this.jMenuItemRecargarInformacionEvaluacionesBonificaciones);				
			this.jmenuDatosEvaluacionesBonificaciones.add(this.jMenuItemAnterioresEvaluacionesBonificaciones);				
			this.jmenuDatosEvaluacionesBonificaciones.add(this.jMenuItemSiguientesEvaluacionesBonificaciones);				
			this.jmenuDatosEvaluacionesBonificaciones.add(this.jMenuItemAbrirOrderByEvaluacionesBonificaciones);				
			this.jmenuDatosEvaluacionesBonificaciones.add(this.jMenuItemMostrarOcultarEvaluacionesBonificaciones);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionesBonificaciones.add(this.jMenuItemGuardarCambiosEvaluacionesBonificaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionesBonificaciones.add(this.jmenuArchivoEvaluacionesBonificaciones);		
			this.jmenuBarEvaluacionesBonificaciones.add(this.jmenuAccionesEvaluacionesBonificaciones);		
			this.jmenuBarEvaluacionesBonificaciones.add(this.jmenuDatosEvaluacionesBonificaciones);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionesBonificaciones);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionesBonificaciones() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");
		this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JButtonMe();
		this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,"buscar_button","Buscar Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones = new JLabelMe();
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setText("Tipo Calificacion Empleado :");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Tipo Calificacion Empleado");
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones = new JLabelMe();
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setText("Verificado :");
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Verificado");
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JCheckBoxMe();
		jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones = new JLabelMe();
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setText("Estructura :");
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Estructura");
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JComboBoxMe();
		jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones = new JLabelMe();
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setText("Codigo :");
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setToolTipText("Codigo");
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new JTextFieldMe();
		jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEvaluacionesBonificaciones=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionesBonificaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEvaluacionesBonificaciones = new EvaluacionesBonificacionesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluaciones Bonificaciones DATOS");
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones = new EvaluacionesBonificacionesDetalleFormJInternalFrame(jDesktopPane,this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones(),this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionesBonificaciones = null;//new EvaluacionesBonificacionesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionesBonificaciones= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionesBonificaciones = new JTableMe();      
		
		String sToolTipEvaluacionesBonificaciones="";
		sToolTipEvaluacionesBonificaciones=EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionesBonificaciones+="(Nomina.EvaluacionesBonificaciones)";
		}
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionesBonificaciones+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionesBonificaciones.setToolTipText(sToolTipEvaluacionesBonificaciones);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionesBonificaciones);
		this.jTableDatosEvaluacionesBonificaciones.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionesBonificaciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionesBonificaciones.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionesBonificaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionesBonificaciones,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonDuplicarEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonCopiarEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonVerFormEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonCerrarEvaluacionesBonificaciones = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionesBonificaciones = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionesBonificaciones = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluaciones Bonificaciones";
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionesBonificaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionesBonificaciones.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionesBonificaciones.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones=new ReporteDinamicoJInternalFrame(EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionesBonificaciones();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionesBonificaciones=new ImportacionJInternalFrame(EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionesBonificaciones();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionesBonificaciones = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionesBonificaciones.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionesBonificaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesBonificaciones,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesBonificaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesBonificaciones,false,this);
			
			//this.cargarOrderByEvaluacionesBonificaciones(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionesBonificaciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionesBonificaciones,true,this);
			
			//this.cargarOrderByEvaluacionesBonificaciones(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionesBonificaciones.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosEvaluacionesBonificaciones.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosEvaluacionesBonificaciones.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosEvaluacionesBonificaciones.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesBonificaciones.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionesBonificaciones.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionesBonificaciones.setText("Nuevo");
		this.jButtonDuplicarEvaluacionesBonificaciones.setText("Duplicar");
		this.jButtonCopiarEvaluacionesBonificaciones.setText("Copiar");
		this.jButtonVerFormEvaluacionesBonificaciones.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setText("Guardar");
		this.jButtonCerrarEvaluacionesBonificaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionesBonificaciones,"nuevo_button","Nuevo",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionesBonificaciones,"duplicar_button","Duplicar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionesBonificaciones,"copiar_button","Copiar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionesBonificaciones,"ver_form","Ver",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionesBonificaciones,"nuevorelaciones_button","Nuevo Rel",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones,"guardarcambiostabla_button","Guardar",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionesBonificaciones,"cerrar_button","Salir",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionesBonificaciones.setToolTipText("Nuevo"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionesBonificaciones.setToolTipText("Duplicar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionesBonificaciones.setToolTipText("Copiar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionesBonificaciones.setToolTipText("Ver"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.setToolTipText("Nuevo Rel"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.setToolTipText("Guardar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionesBonificaciones.setToolTipText("Salir"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionesBonificaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionesBonificaciones"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionesBonificaciones";
		inputMap = this.jButtonDuplicarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionesBonificaciones"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionesBonificaciones";
		inputMap = this.jButtonCopiarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionesBonificaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionesBonificaciones"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionesBonificaciones";
		inputMap = this.jButtonVerFormEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionesBonificaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionesBonificaciones"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoRelacionesEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionesBonificaciones"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionesBonificaciones";
		inputMap = this.jButtonModificarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionesBonificaciones"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionesBonificaciones";
		inputMap = this.jButtonCerrarEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionesBonificaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionesBonificaciones";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionesBonificaciones"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionesBonificaciones.setName("jPanelParametrosReportesEvaluacionesBonificaciones"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones.setName("jPanelParametrosReportesAccionesEvaluacionesBonificaciones"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setText("Buscar");
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setToolTipText("Buscar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionesBonificaciones,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setVisible(false);
		
		
		this.jButtonProcesarInformacionEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setToolTipText("Procesar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionesBonificaciones.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionesBonificaciones = new JLabelMe();
		
		this.jLabelAccionesEvaluacionesBonificaciones.setText("Acciones");		
		this.jLabelAccionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionesBonificaciones = new JButtonMe();
		//this.jButtonAnterioresEvaluacionesBonificaciones.setText("<<");
        this.jButtonAnterioresEvaluacionesBonificaciones.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionesBonificaciones,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionesBonificaciones = new JButtonMe();
		//this.jButtonSiguientesEvaluacionesBonificaciones.setText(">>");
        this.jButtonSiguientesEvaluacionesBonificaciones.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionesBonificaciones,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones,"nuevoguardarcambios_button","Nue",this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionesBonificaciones";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionesBonificaciones"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionesBonificaciones";
		inputMap = this.jButtonRecargarInformacionEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionesBonificaciones"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionesBonificaciones";
		inputMap = this.jButtonSiguientesEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionesBonificaciones"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionesBonificaciones";
		inputMap = this.jButtonAnterioresEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionesBonificaciones"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionesBonificaciones();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(this.getWidth(),EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(this.getWidth(),EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(this.getWidth(),EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionesBonificacionesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionesBonificaciones = new GridBagLayout();

			this.jPanelPaginacionEvaluacionesBonificaciones.setLayout(gridaBagLayoutPaginacionEvaluacionesBonificaciones);						
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonAnterioresEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					
						
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
			
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonNuevoGuardarCambiosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
						
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonSiguientesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonNuevoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
						
			
			
			if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
				this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonGuardarCambiosTablaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			}
			
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonDuplicarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonCopiarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonVerFormEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionesBonificaciones.add(this.jButtonCerrarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionesBonificaciones.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionesBonificaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionesBonificaciones = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionesBonificaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionesBonificaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionesBonificaciones = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionesBonificaciones = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.setLayout(gridaBagParametrosReportesEvaluacionesBonificaciones);
			this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones.setLayout(gridaBagParametrosReportesAccionesEvaluacionesBonificaciones);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones.setLayout(gridaBagParametrosAuxiliar1EvaluacionesBonificaciones);
			this.jPanelParametrosAuxiliar2EvaluacionesBonificaciones.setLayout(gridaBagParametrosAuxiliar2EvaluacionesBonificaciones);
			this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones.setLayout(gridaBagParametrosAuxiliar3EvaluacionesBonificaciones);
			this.jPanelParametrosAuxiliar4EvaluacionesBonificaciones.setLayout(gridaBagParametrosAuxiliar4EvaluacionesBonificaciones);
			//this.jPanelParametrosAuxiliar5EvaluacionesBonificaciones.setLayout(gridaBagParametrosAuxiliar2EvaluacionesBonificaciones);			
			
			
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jButtonRecargarInformacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones.add(this.jComboBoxTiposPaginacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones.add(this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones.add(this.jComboBoxTiposArchivosReportesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jPanelParametrosAuxiliar1EvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionesBonificaciones.add(this.jComboBoxTiposReportesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);																		
			
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EvaluacionesBonificaciones.add(this.jComboBoxTiposGraficosReportesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jPanelParametrosAuxiliar4EvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jComboBoxTiposReportesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jCheckBoxGenerarReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jPanelParametrosAuxiliar2EvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jLabelAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jButtonAbrirOrderByEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jComboBoxTiposSeleccionarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
			
			
			/*
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones.add(this.jCheckBoxSeleccionarTodosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);															
				
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones.add(this.jCheckBoxSeleccionadosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);															
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones.add(this.jCheckBoxConGraficoReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jPanelParametrosAuxiliar3EvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionesBonificaciones.add(this.jComboBoxTiposAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionesBonificaciones = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionesBonificaciones.setLayout(gridaBagLayoutDatosEvaluacionesBonificaciones);
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionesBonificaciones.add(this.jTableDatosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionesBonificaciones.setViewportView(this.jTableDatosEvaluacionesBonificaciones);
		this.jTableDatosEvaluacionesBonificaciones.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionesBonificaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionesBonificaciones= new GridBagLayout();
		this.jPanelAccionesEvaluacionesBonificaciones.setLayout(gridaBagLayoutAccionesEvaluacionesBonificaciones);
		
		
		/*	
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
			
		this.jPanelAccionesEvaluacionesBonificaciones.add(this.jButtonNuevoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones= new GridBagLayout();
		gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.setLayout(gridaBagLayoutBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jLabelid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 0;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jComboBoxid_tipo_calificacion_empleadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);


		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jLabelverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 1;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jCheckBoxverificadoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);


		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 2;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jLabelid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 2;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jComboBoxid_estructuraBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);


		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 3;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jLabelcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 3;
		gridBagConstraintsEvaluacionesBonificaciones.gridx = 1;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jTextFieldcodigoBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionesBonificaciones.gridy = 4;
		gridBagConstraintsEvaluacionesBonificaciones.gridx =1;
		jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones.add(jButtonBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones, gridBagConstraintsEvaluacionesBonificaciones);

		jTabbedPaneBusquedasEvaluacionesBonificaciones.addTab("1.-Por Tipo Calificacion Empleado Por Verificado Por Estructura Por Codigo ", jPanelBusquedaEvaluacionesBonificacionesEvaluacionesBonificaciones);
		jTabbedPaneBusquedasEvaluacionesBonificaciones.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionesBonificaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionesBonificaciones);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;		
			//this.gridBagConstraintsEvaluacionesBonificaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;		
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;		
			this.gridBagConstraintsEvaluacionesBonificaciones.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionesBonificaciones.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);								
		
		
		/*
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/		
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =0;
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionesBonificaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
				
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EvaluacionesBonificacionesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionesBonificaciones= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionesBonificaciones = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionesBonificaciones.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionesBonificaciones);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
			
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionesBonificaciones;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionesBonificaciones() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionesBonificaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setName("jPanelReporteDinamicoEvaluacionesBonificaciones"); 
		
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.setLayout(gridaBagLayoutReporteDinamicoEvaluacionesBonificaciones);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesBonificaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionesBonificaciones.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelColumnasSelectReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionesBonificaciones = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionesBonificaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionesBonificaciones=new JScrollPane(this.jListColumnasSelectReporteEvaluacionesBonificaciones);
			
			this.jScrollColumnasSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jListColumnasSelectReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jScrollColumnasSelectReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionesBonificaciones.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionesBonificaciones = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionesBonificaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionesBonificaciones=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionesBonificaciones);
			
			this.jScrollRelacionesSelectReporteEvaluacionesBonificaciones.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesBonificaciones.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionesBonificaciones.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionesBonificaciones = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelConGraficoDinamicoEvaluacionesBonificaciones.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelConGraficoDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jCheckBoxConGraficoDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelColumnaCategoriaGraficoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelColumnaCategoriaValorEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jComboBoxColumnaCategoriaValorEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelColumnasValoresGraficoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEvaluacionesBonificaciones = new JList<Reporte>();
		this.jListColumnasValoresGraficoEvaluacionesBonificaciones.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEvaluacionesBonificaciones.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones=new JScrollPane(this.jListColumnasValoresGraficoEvaluacionesBonificaciones);
			
			this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jListColumnasSelectReporteEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jScrollColumnasValoresGraficoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelTiposGraficosReportesDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEvaluacionesBonificaciones.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jComboBoxTiposGraficosReportesDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones.setToolTipText("Generar EXCEL"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jComboBoxTiposReportesDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones.setToolTipText("Generar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jButtonGenerarReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones.setToolTipText("Cancelar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionesBonificaciones.add(this.jButtonCerrarReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionesBonificaciones = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones= new JScrollPane(jPanelReporteDinamicoEvaluacionesBonificaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionesBonificaciones);
		this.jInternalFrameReporteDinamicoEvaluacionesBonificaciones.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionesBonificaciones() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionesBonificaciones = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionesBonificaciones.setName("jPanelImportacionEvaluacionesBonificaciones"); 
		
		this.jPanelImportacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionesBonificaciones.setLayout(gridaBagLayoutImportacionEvaluacionesBonificaciones);
		
		
		this.jInternalFrameImportacionEvaluacionesBonificaciones= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionesBonificaciones= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionesBonificaciones = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionesBonificaciones= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionesBonificaciones.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionesBonificaciones.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jLabelArchivoImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionesBonificaciones = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionesBonificaciones.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionesBonificaciones.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionesBonificaciones,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionesBonificaciones.setToolTipText("Generar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jButtonAbrirImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionesBonificaciones = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionesBonificaciones.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jLabelPathArchivoImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionesBonificaciones=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionesBonificaciones.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesBonificaciones.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionesBonificaciones.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jTextFieldPathArchivoImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionesBonificaciones.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionesBonificaciones,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionesBonificaciones.setToolTipText("Generar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jButtonGenerarImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionesBonificaciones = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionesBonificaciones.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionesBonificaciones,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionesBonificaciones.setToolTipText("Cancelar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionesBonificaciones.add(this.jButtonCerrarImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionesBonificaciones = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionesBonificaciones= new JScrollPane(jPanelImportacionEvaluacionesBonificaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionesBonificaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionesBonificaciones.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionesBonificaciones);
		this.jInternalFrameImportacionEvaluacionesBonificaciones.getContentPane().add(this.jScrollPanelImportacionEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionesBonificaciones(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionesBonificaciones = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionesBonificaciones.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionesBonificaciones.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionesBonificaciones,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionesBonificaciones";
			inputMap = this.jButtonAbrirOrderByEvaluacionesBonificaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionesBonificaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionesBonificaciones"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionesBonificaciones = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionesBonificaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionesBonificaciones.setName("jPanelOrderByEvaluacionesBonificaciones"); 
			
			this.jPanelOrderByEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionesBonificaciones.setLayout(gridaBagLayoutOrderByEvaluacionesBonificaciones);
			
			
			this.jTableDatosEvaluacionesBonificacionesOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionesBonificacionesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionesBonificacionesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionesBonificacionesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionesBonificacionesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionesBonificacionesOrderBy.setViewportView(this.jTableDatosEvaluacionesBonificacionesOrderBy);
			this.jTableDatosEvaluacionesBonificacionesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionesBonificacionesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionesBonificaciones= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionesBonificaciones= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionesBonificaciones = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionesBonificaciones= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setResizable(true);
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setClosable(true);
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionesBonificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluaciones Bonificacioneses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionesBonificaciones.ipady =150;
				
			this.jPanelOrderByEvaluacionesBonificaciones.add(jScrollPanelDatosEvaluacionesBonificacionesOrderBy, this.gridBagConstraintsEvaluacionesBonificaciones);//this.jTableDatosEvaluacionesBonificacionesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionesBonificaciones = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionesBonificaciones.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionesBonificaciones,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionesBonificaciones.setToolTipText("Cancelar"+" "+EvaluacionesBonificacionesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionesBonificaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionesBonificaciones.add(this.jButtonCerrarOrderByEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionesBonificaciones = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionesBonificaciones= new JScrollPane(jPanelOrderByEvaluacionesBonificaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionesBonificaciones = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionesBonificaciones.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionesBonificaciones.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionesBonificaciones.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionesBonificaciones.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionesBonificaciones);
			
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getContentPane().add(this.jScrollPanelOrderByEvaluacionesBonificaciones, this.gridBagConstraintsEvaluacionesBonificaciones);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionesBonificaciones = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.evaluacionesbonificacionesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionesBonificaciones.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosEvaluacionesBonificaciones.getRowHeight();//EvaluacionesBonificacionesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.isSelected()) {
					iHeightTable=EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionesBonificaciones.isSelected()) {
					iHeightTable=EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionesBonificacionesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionesBonificaciones!=null && this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionesbonificacionesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionesBonificaciones.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionesBonificaciones.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesBonificaciones.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionesBonificaciones.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=evaluacionesbonificacionesLogic.getEvaluacionesBonificacioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionesbonificacioness.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionesBonificaciones> TraerEvaluacionesBonificacionesBeans(List<EvaluacionesBonificaciones> evaluacionesbonificacioness,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionesBonificaciones evaluacionesbonificaciones:evaluacionesbonificacioness) {
					
				if(!(EvaluacionesBonificacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionesBonificacionesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionesbonificaciones.setsDetalleGeneralEntityReporte(EvaluacionesBonificacionesConstantesFunciones.getEvaluacionesBonificacionesDescripcion(evaluacionesbonificaciones));
										
						
					
						
					
				} else  {
							
					//evaluacionesbonificaciones.setsDetalleGeneralEntityReporte(evaluacionesbonificaciones.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionesbonificacionesbeans.add(evaluacionesbonificacionesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionesbonificacioness;
    }
	//PARA REPORTES FIN
}
