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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.nomina.util.CierreRolMensualConstantesFunciones;

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
public class CierreRolMensualJInternalFrame extends CierreRolMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCierreRolMensual;
	
	protected JMenuBar jmenuBarCierreRolMensual;
	
	protected JMenu jmenuCierreRolMensual;
	protected JMenu jmenuDatosCierreRolMensual;
	protected JMenu jmenuArchivoCierreRolMensual;
	protected JMenu jmenuAccionesCierreRolMensual;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCierreRolMensual;	
	protected GridBagConstraints gridBagConstraintsCierreRolMensual;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CierreRolMensualDetalleFormJInternalFrame jInternalFrameDetalleFormCierreRolMensual;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCierreRolMensual;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCierreRolMensual;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoEmpleadoBeanSwingJInternalFrame estadoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoempleado="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public CierreRolMensualSessionBean cierrerolmensualSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CierreRolMensual> cierrerolmensuals;		
	public List<CierreRolMensual> cierrerolmensualsEliminados;	
	public List<CierreRolMensual> cierrerolmensualsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCierreRolMensual;		
	protected JButton jButtonAbrirOrderByCierreRolMensual;
	
	
	//protected JPanel jPanelOrderByCierreRolMensual;
	//public JScrollPane jScrollPanelOrderByCierreRolMensual;	
	//protected JButton jButtonCerrarOrderByCierreRolMensual;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CierreRolMensualLogic cierrerolmensualLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCierreRolMensual;
	public JScrollPane jScrollPanelDatosEdicionCierreRolMensual;
	public JScrollPane jScrollPanelDatosGeneralCierreRolMensual;
    
	
	
	//public JScrollPane jScrollPanelDatosCierreRolMensualOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCierreRolMensual;
	//public JScrollPane jScrollPanelImportacionCierreRolMensual;
	
	
	
	protected JPanel jPanelAccionesCierreRolMensual;
	
    protected JPanel jPanelPaginacionCierreRolMensual;
    protected JPanel jPanelParametrosReportesCierreRolMensual;
	protected JPanel jPanelParametrosReportesAccionesCierreRolMensual;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CierreRolMensual;
	protected JPanel jPanelParametrosAuxiliar2CierreRolMensual;
	protected JPanel jPanelParametrosAuxiliar3CierreRolMensual;
	protected JPanel jPanelParametrosAuxiliar4CierreRolMensual;
	//protected JPanel jPanelParametrosAuxiliar5CierreRolMensual;
	
	
	
	//protected JPanel jPanelReporteDinamicoCierreRolMensual;
	//protected JPanel jPanelImportacionCierreRolMensual;
	
	
	public JTable jTableDatosCierreRolMensual;
	
	
	
	//public JTable jTableDatosCierreRolMensualOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCierreRolMensual;
	protected JButton jButtonDuplicarCierreRolMensual;
	protected JButton jButtonCopiarCierreRolMensual;
	protected JButton jButtonVerFormCierreRolMensual;
	protected JButton jButtonNuevoRelacionesCierreRolMensual;
	protected JButton jButtonModificarCierreRolMensual;
	
    protected JButton jButtonGuardarCambiosTablaCierreRolMensual;
	protected JButton jButtonCerrarCierreRolMensual;
	
	
	protected JButton jButtonRecargarInformacionCierreRolMensual;
	protected JButton jButtonProcesarInformacionCierreRolMensual;
	
	
	protected JButton jButtonAnterioresCierreRolMensual;
	protected JButton jButtonSiguientesCierreRolMensual;
	protected JButton jButtonNuevoGuardarCambiosCierreRolMensual;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCierreRolMensual;
	//protected JButton jButtonCerrarReporteDinamicoCierreRolMensual;
	//protected JButton jButtonGenerarExcelReporteDinamicoCierreRolMensual;	
	
	
	
	//protected JButton jButtonAbrirImportacionCierreRolMensual;
	//protected JButton jButtonGenerarImportacionCierreRolMensual;
	//protected JButton jButtonCerrarImportacionCierreRolMensual;
	//protected JFileChooser jFileChooserImportacionCierreRolMensual;
	//protected File fileImportacionCierreRolMensual;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCierreRolMensual;
	protected JButton jButtonDuplicarToolBarCierreRolMensual;
	protected JButton jButtonNuevoRelacionesToolBarCierreRolMensual;
	
	
	public JButton jButtonGuardarCambiosToolBarCierreRolMensual;
	protected JButton jButtonCopiarToolBarCierreRolMensual;
	protected JButton jButtonVerFormToolBarCierreRolMensual;
	public JButton jButtonGuardarCambiosTablaToolBarCierreRolMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarCierreRolMensual;
	protected JButton jButtonCerrarToolBarCierreRolMensual;
	
	protected JButton jButtonRecargarInformacionToolBarCierreRolMensual;
	protected JButton jButtonProcesarInformacionToolBarCierreRolMensual;
	protected JButton jButtonAnterioresToolBarCierreRolMensual;
	protected JButton jButtonSiguientesToolBarCierreRolMensual;
	protected JButton jButtonNuevoGuardarCambiosToolBarCierreRolMensual;
	protected JButton jButtonAbrirOrderByToolBarCierreRolMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCierreRolMensual;
	protected JMenuItem jMenuItemDuplicarCierreRolMensual;
	protected JMenuItem jMenuItemNuevoRelacionesCierreRolMensual;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCierreRolMensual;
	protected JMenuItem jMenuItemCopiarCierreRolMensual;
	protected JMenuItem jMenuItemVerFormCierreRolMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaCierreRolMensual;
	protected JMenuItem jMenuItemCerrarCierreRolMensual;
	protected JMenuItem jMenuItemDetalleCerrarCierreRolMensual;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCierreRolMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarCierreRolMensual;
	
	protected JMenuItem jMenuItemRecargarInformacionCierreRolMensual;
	protected JMenuItem jMenuItemProcesarInformacionCierreRolMensual;
	protected JMenuItem jMenuItemAnterioresCierreRolMensual;
	protected JMenuItem jMenuItemSiguientesCierreRolMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCierreRolMensual;
	protected JMenuItem jMenuItemAbrirOrderByCierreRolMensual;
	protected JMenuItem jMenuItemMostrarOcultarCierreRolMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCierreRolMensual;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCierreRolMensual;
	protected JCheckBox jCheckBoxSeleccionadosCierreRolMensual;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCierreRolMensual;
	protected JCheckBox jCheckBoxConGraficoReporteCierreRolMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCierreRolMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCierreRolMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCierreRolMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCierreRolMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCierreRolMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCierreRolMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCierreRolMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCierreRolMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCierreRolMensual;
	protected JTextField jTextFieldValorCampoGeneralCierreRolMensual;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCierreRolMensual;
	//public JList<Reporte> jListColumnasSelectReporteCierreRolMensual;
	//public JScrollPane jScrollColumnasSelectReporteCierreRolMensual;
	
	//public JLabel jLabelRelacionesSelectReporteCierreRolMensual;
	//public JList<Reporte> jListRelacionesSelectReporteCierreRolMensual;
	//public JScrollPane jScrollRelacionesSelectReporteCierreRolMensual;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCierreRolMensual;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCierreRolMensual;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCierreRolMensual;
	//public JLabel jLabelTiposArchivoReporteDinamicoCierreRolMensual;
	
		
	//public JLabel jLabelArchivoImportacionCierreRolMensual;	
	//public JLabel jLabelPathArchivoImportacionCierreRolMensual;
	//protected JTextField jTextFieldPathArchivoImportacionCierreRolMensual;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCierreRolMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCierreRolMensual;
	
	//public JLabel jLabelColumnaCategoriaValorCierreRolMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCierreRolMensual;
	
	//public JLabel jLabelColumnasValoresGraficoCierreRolMensual;
	//public JList<Reporte> jListColumnasValoresGraficoCierreRolMensual;
	//public JScrollPane jScrollColumnasValoresGraficoCierreRolMensual;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCierreRolMensual;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCierreRolMensual;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCierreRolMensual;
	public JPanel jPanelFK_IdAsientoContableCierreRolMensual;
	public JButton jButtonFK_IdAsientoContableCierreRolMensual;
	public JPanel jPanelFK_IdCierreRolMensualCierreRolMensual;
	public JButton jButtonFK_IdCierreRolMensualCierreRolMensual;
	public JPanel jPanelFK_IdEmpleadoCierreRolMensual;
	public JButton jButtonFK_IdEmpleadoCierreRolMensual;
	public JPanel jPanelFK_IdEstadoEmpleadoCierreRolMensual;
	public JButton jButtonFK_IdEstadoEmpleadoCierreRolMensual;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableCierreRolMensual;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCierreRolMensual= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCierreRolMensualBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual;
	
	public JPanel jPanelid_estructuraFK_IdCierreRolMensualCierreRolMensual;
	public JLabel jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual;
	public JButton jButtonid_estructuraFK_IdCierreRolMensualCierreRolMensual= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdCierreRolMensualCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdCierreRolMensualCierreRolMensualBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdCierreRolMensualCierreRolMensualArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoCierreRolMensual;
	public JLabel jLabelid_empleadoFK_IdEmpleadoCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual;
	public JButton jButtonid_empleadoFK_IdEmpleadoCierreRolMensual= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCierreRolMensualBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual;
	
	public JPanel jPanelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual;
	public JLabel jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual;
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual= new JButtonMe();
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensualUpdate= new JButtonMe();
	public JButton jButtonid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensualBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CierreRolMensualJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreRolMensualJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCierreRolMensual)	{
		this.jButtonRecargarInformacionCierreRolMensual = jButtonRecargarInformacionCierreRolMensual;
	}
	
	public JButton getjButtonProcesarInformacionCierreRolMensual() {
		return this.jButtonProcesarInformacionCierreRolMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCierreRolMensual)	{
		this.jButtonProcesarInformacionCierreRolMensual = jButtonProcesarInformacionCierreRolMensual;
	}
	
	
	public JButton getjButtonRecargarInformacionCierreRolMensual() {
		return this.jButtonRecargarInformacionCierreRolMensual;
	}
	
	
	public List<CierreRolMensual> getcierrerolmensuals() {
		return this.cierrerolmensuals;
	}

	public void setcierrerolmensuals(List<CierreRolMensual> cierrerolmensuals) {
		this.cierrerolmensuals = cierrerolmensuals;
	}
	
	public List<CierreRolMensual> getcierrerolmensualsAux() {
		return this.cierrerolmensualsAux;
	}

	public void setcierrerolmensualsAux(List<CierreRolMensual> cierrerolmensualsAux) {
		this.cierrerolmensualsAux = cierrerolmensualsAux;
	}
	
	public List<CierreRolMensual> getcierrerolmensualsEliminados() {
		return this.cierrerolmensualsEliminados;
	}

	public void setCierreRolMensualsEliminados(List<CierreRolMensual> cierrerolmensualsEliminados) {
		this.cierrerolmensualsEliminados = cierrerolmensualsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCierreRolMensual() {
		return jComboBoxTiposSeleccionarCierreRolMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCierreRolMensual(
			JComboBox jComboBoxTiposSeleccionarCierreRolMensual) {
		this.jComboBoxTiposSeleccionarCierreRolMensual = jComboBoxTiposSeleccionarCierreRolMensual;
	}
	
	public void setBorderResaltarTiposSeleccionarCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCierreRolMensual .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCierreRolMensual() {
		return jTextFieldValorCampoGeneralCierreRolMensual;
	}

	public void setjTextFieldValorCampoGeneralCierreRolMensual(
			JTextField jTextFieldValorCampoGeneralCierreRolMensual) {
		this.jTextFieldValorCampoGeneralCierreRolMensual = jTextFieldValorCampoGeneralCierreRolMensual;
	}

	public void setBorderResaltarValorCampoGeneralCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCierreRolMensual .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCierreRolMensual() {
		return this.jCheckBoxSeleccionarTodosCierreRolMensual;
	}

	public void setjCheckBoxSeleccionarTodosCierreRolMensual(
			JCheckBox jCheckBoxSeleccionarTodosCierreRolMensual) {
		this.jCheckBoxSeleccionarTodosCierreRolMensual = jCheckBoxSeleccionarTodosCierreRolMensual;
	}

	public void setBorderResaltarSeleccionarTodosCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCierreRolMensual .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCierreRolMensual() {
		return this.jCheckBoxSeleccionadosCierreRolMensual;
	}

	public void setjCheckBoxSeleccionadosCierreRolMensual(
			JCheckBox jCheckBoxSeleccionadosCierreRolMensual) {
		this.jCheckBoxSeleccionadosCierreRolMensual = jCheckBoxSeleccionadosCierreRolMensual;
	}
	
	public void setBorderResaltarSeleccionadosCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCierreRolMensual .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCierreRolMensual() {
		return this.jComboBoxTiposArchivosReportesCierreRolMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCierreRolMensual(
			JComboBox jComboBoxTiposArchivosReportesCierreRolMensual) {
		this.jComboBoxTiposArchivosReportesCierreRolMensual = jComboBoxTiposArchivosReportesCierreRolMensual;
	}

	public void setBorderResaltarTiposArchivosReportesCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCierreRolMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCierreRolMensual() {
		return this.jComboBoxTiposReportesCierreRolMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCierreRolMensual(
			JComboBox jComboBoxTiposReportesCierreRolMensual) {
		this.jComboBoxTiposReportesCierreRolMensual = jComboBoxTiposReportesCierreRolMensual;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCierreRolMensual() {
	//	return jComboBoxTiposReportesDinamicoCierreRolMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCierreRolMensual(
	//		JComboBox jComboBoxTiposReportesDinamicoCierreRolMensual) {
	//	this.jComboBoxTiposReportesDinamicoCierreRolMensual = jComboBoxTiposReportesDinamicoCierreRolMensual;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCierreRolMensual() {
	//	return jComboBoxTiposArchivosReportesDinamicoCierreRolMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCierreRolMensual(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCierreRolMensual) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual = jComboBoxTiposArchivosReportesDinamicoCierreRolMensual;
	//}
	
	public void setBorderResaltarTiposReportesCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCierreRolMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCierreRolMensual() {
		return this.jComboBoxTiposGraficosReportesCierreRolMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCierreRolMensual(
			JComboBox jComboBoxTiposGraficosReportesCierreRolMensual) {
		this.jComboBoxTiposGraficosReportesCierreRolMensual = jComboBoxTiposGraficosReportesCierreRolMensual;
	}
	
	public void setBorderResaltarTiposGraficosReportesCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCierreRolMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCierreRolMensual() {
		return this.jComboBoxTiposPaginacionCierreRolMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCierreRolMensual(
			JComboBox jComboBoxTiposPaginacionCierreRolMensual) {
		this.jComboBoxTiposPaginacionCierreRolMensual = jComboBoxTiposPaginacionCierreRolMensual;
	}
	
	public void setBorderResaltarTiposPaginacionCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCierreRolMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCierreRolMensual() {
		return this.jComboBoxTiposRelacionesCierreRolMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCierreRolMensual() {
		return this.jComboBoxTiposAccionesCierreRolMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCierreRolMensual(
			JComboBox jComboBoxTiposRelacionesCierreRolMensual) {
		this.jComboBoxTiposRelacionesCierreRolMensual = jComboBoxTiposRelacionesCierreRolMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCierreRolMensual(
			JComboBox jComboBoxTiposAccionesCierreRolMensual) {
		this.jComboBoxTiposAccionesCierreRolMensual = jComboBoxTiposAccionesCierreRolMensual;
	}
	
	public void setBorderResaltarTiposRelacionesCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCierreRolMensual .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCierreRolMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCierreRolMensual .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCierreRolMensual() {
	//	return jCheckBoxConGraficoDinamicoCierreRolMensual;
	//}

	//public void setjCheckBoxConGraficoDinamicoCierreRolMensual(
	//		JCheckBox jCheckBoxConGraficoDinamicoCierreRolMensual) {
	//	this.jCheckBoxConGraficoDinamicoCierreRolMensual = jCheckBoxConGraficoDinamicoCierreRolMensual;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCierreRolMensual() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCierreRolMensual.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCierreRolMensual .setBorder(borderResaltar);		
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
		this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		
		this.cierrerolmensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrerolmensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cierrerolmensualSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CierreRolMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Rol Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
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
		
		CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CierreRolMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCierreRolMensual= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"nuevo","nuevo","Nuevo"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"duplicar","duplicar","Duplicar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"copiar","copiar","Copiar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"ver_form","ver_form","Ver"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"recargar","recargar","Recargar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCierreRolMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCierreRolMensual,this.jTtoolBarCierreRolMensual,
							"cerrar","cerrar","Salir"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCierreRolMensual=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCierreRolMensual;
			
				this.jButtonProcesarInformacionToolBarCierreRolMensual=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCierreRolMensual;
				
		//protected JButton jButtonModificarToolBarCierreRolMensual;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCierreRolMensual=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCierreRolMensual=new JMenuMe("General");
		this.jmenuArchivoCierreRolMensual=new JMenuMe("Archivo");
		this.jmenuAccionesCierreRolMensual=new JMenuMe("Acciones");
		this.jmenuDatosCierreRolMensual=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCierreRolMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCierreRolMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCierreRolMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCierreRolMensual= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCierreRolMensual.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCierreRolMensual,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCierreRolMensual= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCierreRolMensual.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCierreRolMensual,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCierreRolMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCierreRolMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCierreRolMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCierreRolMensual= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCierreRolMensual.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCierreRolMensual,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCierreRolMensual= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCierreRolMensual.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCierreRolMensual,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCierreRolMensual= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCierreRolMensual.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCierreRolMensual,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCierreRolMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCierreRolMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCierreRolMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCierreRolMensual= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCierreRolMensual.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCierreRolMensual,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCierreRolMensual= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCierreRolMensual.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCierreRolMensual,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCierreRolMensual= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCierreRolMensual.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCierreRolMensual,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCierreRolMensual= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCierreRolMensual.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCierreRolMensual,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCierreRolMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCierreRolMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCierreRolMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCierreRolMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCierreRolMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCierreRolMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCierreRolMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCierreRolMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCierreRolMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCierreRolMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCierreRolMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCierreRolMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCierreRolMensual= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCierreRolMensual.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCierreRolMensual,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCierreRolMensual.add(this.jMenuItemCerrarCierreRolMensual);
			
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemNuevoCierreRolMensual);
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemNuevoGuardarCambiosCierreRolMensual);
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemNuevoRelacionesCierreRolMensual);
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemGuardarCambiosTablaCierreRolMensual);		
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemDuplicarCierreRolMensual);		
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemCopiarCierreRolMensual);		
			this.jmenuAccionesCierreRolMensual.add(this.jMenuItemVerFormCierreRolMensual);		
			
			this.jmenuDatosCierreRolMensual.add(this.jMenuItemRecargarInformacionCierreRolMensual);				
			this.jmenuDatosCierreRolMensual.add(this.jMenuItemAnterioresCierreRolMensual);				
			this.jmenuDatosCierreRolMensual.add(this.jMenuItemSiguientesCierreRolMensual);				
			this.jmenuDatosCierreRolMensual.add(this.jMenuItemAbrirOrderByCierreRolMensual);				
			this.jmenuDatosCierreRolMensual.add(this.jMenuItemMostrarOcultarCierreRolMensual);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCierreRolMensual.add(this.jMenuItemGuardarCambiosCierreRolMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCierreRolMensual.add(this.jmenuArchivoCierreRolMensual);		
			this.jmenuBarCierreRolMensual.add(this.jmenuAccionesCierreRolMensual);		
			this.jmenuBarCierreRolMensual.add(this.jmenuDatosCierreRolMensual);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCierreRolMensual);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCierreRolMensual() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableCierreRolMensual.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableCierreRolMensual= new JButtonMe();
		this.jButtonFK_IdAsientoContableCierreRolMensual.setText("Buscar");
		this.jButtonFK_IdAsientoContableCierreRolMensual.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableCierreRolMensual,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual.setFocusable(false);

		this.jPanelFK_IdCierreRolMensualCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCierreRolMensualCierreRolMensual.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdCierreRolMensualCierreRolMensual= new JButtonMe();
		this.jButtonFK_IdCierreRolMensualCierreRolMensual.setText("Buscar");
		this.jButtonFK_IdCierreRolMensualCierreRolMensual.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCierreRolMensualCierreRolMensual,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCierreRolMensualCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual = new JLabelMe();
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual.setText("Estructura :");
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoCierreRolMensual.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoCierreRolMensual= new JButtonMe();
		this.jButtonFK_IdEmpleadoCierreRolMensual.setText("Buscar");
		this.jButtonFK_IdEmpleadoCierreRolMensual.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoCierreRolMensual,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual.setFocusable(false);

		this.jPanelFK_IdEstadoEmpleadoCierreRolMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoEmpleadoCierreRolMensual.setToolTipText("Buscar Por Estado Empleado ");
		this.jButtonFK_IdEstadoEmpleadoCierreRolMensual= new JButtonMe();
		this.jButtonFK_IdEstadoEmpleadoCierreRolMensual.setText("Buscar");
		this.jButtonFK_IdEstadoEmpleadoCierreRolMensual.setToolTipText("Buscar Por Estado Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoEmpleadoCierreRolMensual,"buscar_button","Buscar Por Estado Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoEmpleadoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual = new JLabelMe();
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setText("Estado Empleado :");
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setToolTipText("Estado Empleado");
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual= new JComboBoxMe();
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCierreRolMensual=new JTabbedPane();


		this.jTabbedPaneBusquedasCierreRolMensual.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCierreRolMensual.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCierreRolMensual.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCierreRolMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCierreRolMensual = new CierreRolMensualDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cierre Rol Mensual DATOS");
			this.jInternalFrameDetalleFormCierreRolMensual = new CierreRolMensualDetalleFormJInternalFrame(jDesktopPane,this.cierrerolmensualSessionBean.getConGuardarRelaciones(),this.cierrerolmensualSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCierreRolMensual = null;//new CierreRolMensualDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCierreRolMensual= new GridBagLayout();
		
		
		this.jTableDatosCierreRolMensual = new JTableMe();      
		
		String sToolTipCierreRolMensual="";
		sToolTipCierreRolMensual=CierreRolMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCierreRolMensual+="(Nomina.CierreRolMensual)";
		}
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipCierreRolMensual+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCierreRolMensual.setToolTipText(sToolTipCierreRolMensual);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCierreRolMensual);
		this.jTableDatosCierreRolMensual.setAutoCreateRowSorter(true);
		this.jTableDatosCierreRolMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCierreRolMensual.setRowSelectionAllowed(true);
		this.jTableDatosCierreRolMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCierreRolMensual,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCierreRolMensual = new JButtonMe();
		this.jButtonDuplicarCierreRolMensual = new JButtonMe();
		this.jButtonCopiarCierreRolMensual = new JButtonMe();
		this.jButtonVerFormCierreRolMensual = new JButtonMe();
		this.jButtonNuevoRelacionesCierreRolMensual = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCierreRolMensual = new JButtonMe();
		this.jButtonCerrarCierreRolMensual = new JButtonMe();
		
		this.jScrollPanelDatosCierreRolMensual = new JScrollPane();   
        this.jScrollPanelDatosGeneralCierreRolMensual = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Rol Mensual";
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosCierreRolMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCierreRolMensual.setToolTipText("Acciones");
        this.jPanelAccionesCierreRolMensual.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCierreRolMensual=new ReporteDinamicoJInternalFrame(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCierreRolMensual();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCierreRolMensual=new ImportacionJInternalFrame(CierreRolMensualConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCierreRolMensual();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCierreRolMensual = new JButtonMe();
		
		this.jButtonAbrirOrderByCierreRolMensual.setText("Orden");
		this.jButtonAbrirOrderByCierreRolMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCierreRolMensual,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCierreRolMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreRolMensual,false,this);
			
			//this.cargarOrderByCierreRolMensual(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCierreRolMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCierreRolMensual,true,this);
			
			//this.cargarOrderByCierreRolMensual(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCierreRolMensual.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosCierreRolMensual.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosCierreRolMensual.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosCierreRolMensual.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCierreRolMensual.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCierreRolMensual.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCierreRolMensual.setText("Nuevo");
		this.jButtonDuplicarCierreRolMensual.setText("Duplicar");
		this.jButtonCopiarCierreRolMensual.setText("Copiar");
		this.jButtonVerFormCierreRolMensual.setText("Ver");
		this.jButtonNuevoRelacionesCierreRolMensual.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.setText("Guardar");
		this.jButtonCerrarCierreRolMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCierreRolMensual,"nuevo_button","Nuevo",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCierreRolMensual,"duplicar_button","Duplicar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCierreRolMensual,"copiar_button","Copiar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCierreRolMensual,"ver_form","Ver",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCierreRolMensual,"nuevorelaciones_button","Nuevo Rel",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCierreRolMensual,"guardarcambiostabla_button","Guardar",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCierreRolMensual,"cerrar_button","Salir",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCierreRolMensual.setToolTipText("Nuevo"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCierreRolMensual.setToolTipText("Duplicar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCierreRolMensual.setToolTipText("Copiar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCierreRolMensual.setToolTipText("Ver"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCierreRolMensual.setToolTipText("Nuevo Rel"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.setToolTipText("Guardar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCierreRolMensual.setToolTipText("Salir"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCierreRolMensual";
		inputMap = this.jButtonNuevoCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCierreRolMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCierreRolMensual"));
		
		//DUPLICAR
		sMapKey = "DuplicarCierreRolMensual";
		inputMap = this.jButtonDuplicarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCierreRolMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCierreRolMensual"));
		
		//COPIAR
		sMapKey = "CopiarCierreRolMensual";
		inputMap = this.jButtonCopiarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCierreRolMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCierreRolMensual"));
		
		//VEr FORM
		sMapKey = "VerFormCierreRolMensual";
		inputMap = this.jButtonVerFormCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCierreRolMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCierreRolMensual"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCierreRolMensual";
		inputMap = this.jButtonNuevoRelacionesCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCierreRolMensual"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCierreRolMensual";
		inputMap = this.jButtonModificarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCierreRolMensual"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCierreRolMensual";
		inputMap = this.jButtonCerrarCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCierreRolMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCierreRolMensual";
		inputMap = this.jButtonGuardarCambiosTablaCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCierreRolMensual"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCierreRolMensual.setName("jPanelParametrosReportesCierreRolMensual"); 
		
		this.jPanelParametrosReportesAccionesCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCierreRolMensual.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCierreRolMensual.setName("jPanelParametrosReportesAccionesCierreRolMensual"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCierreRolMensual = new JButtonMe();
		this.jButtonRecargarInformacionCierreRolMensual.setText("Recargar");
		this.jButtonRecargarInformacionCierreRolMensual.setToolTipText("Recargar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCierreRolMensual,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCierreRolMensual = new JButtonMe();
		this.jButtonProcesarInformacionCierreRolMensual.setText("Procesar");
		this.jButtonProcesarInformacionCierreRolMensual.setToolTipText("Procesar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCierreRolMensual.setVisible(false);
			
		this.jButtonProcesarInformacionCierreRolMensual.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCierreRolMensual.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCierreRolMensual.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreRolMensual.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCierreRolMensual.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreRolMensual.setText("TIPO");       
		this.jComboBoxTiposReportesCierreRolMensual.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCierreRolMensual.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCierreRolMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCierreRolMensual.setText("Paginacion");
		this.jComboBoxTiposPaginacionCierreRolMensual.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCierreRolMensual.setText("Accion");
		this.jComboBoxTiposRelacionesCierreRolMensual.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCierreRolMensual.setText("Accion");
		this.jComboBoxTiposAccionesCierreRolMensual.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCierreRolMensual = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCierreRolMensual.setText("Accion");
		this.jComboBoxTiposSeleccionarCierreRolMensual.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCierreRolMensual=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCierreRolMensual.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCierreRolMensual.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCierreRolMensual.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCierreRolMensual = new JLabelMe();
		
		this.jLabelAccionesCierreRolMensual.setText("Acciones");		
		this.jLabelAccionesCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCierreRolMensual = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCierreRolMensual.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCierreRolMensual.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCierreRolMensual = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCierreRolMensual.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCierreRolMensual.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCierreRolMensual = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCierreRolMensual.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCierreRolMensual.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCierreRolMensual = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCierreRolMensual.setText("Graf.");
		this.jCheckBoxConGraficoReporteCierreRolMensual.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCierreRolMensual = new JButtonMe();
		//this.jButtonAnterioresCierreRolMensual.setText("<<");
        this.jButtonAnterioresCierreRolMensual.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCierreRolMensual,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCierreRolMensual = new JButtonMe();
		//this.jButtonSiguientesCierreRolMensual.setText(">>");
        this.jButtonSiguientesCierreRolMensual.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCierreRolMensual,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCierreRolMensual = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCierreRolMensual.setText("Nue");
        this.jButtonNuevoGuardarCambiosCierreRolMensual.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCierreRolMensual,"nuevoguardarcambios_button","Nue",this.cierrerolmensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCierreRolMensual";
		inputMap = this.jButtonNuevoGuardarCambiosCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCierreRolMensual"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCierreRolMensual";
		inputMap = this.jButtonRecargarInformacionCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCierreRolMensual"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCierreRolMensual";
		inputMap = this.jButtonSiguientesCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCierreRolMensual"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCierreRolMensual";
		inputMap = this.jButtonAnterioresCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCierreRolMensual"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCierreRolMensual();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCierreRolMensual.setMinimumSize(new Dimension(this.getWidth(),CierreRolMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreRolMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCierreRolMensual.setMaximumSize(new Dimension(this.getWidth(),CierreRolMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreRolMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCierreRolMensual.setPreferredSize(new Dimension(this.getWidth(),CierreRolMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CierreRolMensualBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCierreRolMensual = new GridBagLayout();

			this.jPanelPaginacionCierreRolMensual.setLayout(gridaBagLayoutPaginacionCierreRolMensual);						
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 0;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonAnterioresCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					
						
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCierreRolMensual.gridy = 0;
			
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonNuevoGuardarCambiosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
						
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCierreRolMensual.gridy = 0;
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonSiguientesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 1;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonNuevoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
						
			
			
			if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
				this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCierreRolMensual.gridy = 1;
				this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCierreRolMensual.add(this.jButtonGuardarCambiosTablaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			}
			
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 1;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonDuplicarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 1;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonCopiarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 1;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonVerFormCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 1;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCierreRolMensual.add(this.jButtonCerrarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
		
		
		this.jButtonRecargarInformacionCierreRolMensual.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCierreRolMensual.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCierreRolMensual.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCierreRolMensual.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCierreRolMensual.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCierreRolMensual.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCierreRolMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCierreRolMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCierreRolMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCierreRolMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCierreRolMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCierreRolMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCierreRolMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCierreRolMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCierreRolMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCierreRolMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCierreRolMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCierreRolMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCierreRolMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreRolMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreRolMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCierreRolMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCierreRolMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCierreRolMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCierreRolMensual.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCierreRolMensual.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCierreRolMensual.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCierreRolMensual.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCierreRolMensual.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCierreRolMensual.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCierreRolMensual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCierreRolMensual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCierreRolMensual.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCierreRolMensual.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCierreRolMensual.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCierreRolMensual.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCierreRolMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCierreRolMensual = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CierreRolMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CierreRolMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CierreRolMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CierreRolMensual = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCierreRolMensual.setLayout(gridaBagParametrosReportesCierreRolMensual);
			this.jPanelParametrosReportesAccionesCierreRolMensual.setLayout(gridaBagParametrosReportesAccionesCierreRolMensual);
			
			
			this.jPanelParametrosAuxiliar1CierreRolMensual.setLayout(gridaBagParametrosAuxiliar1CierreRolMensual);
			this.jPanelParametrosAuxiliar2CierreRolMensual.setLayout(gridaBagParametrosAuxiliar2CierreRolMensual);
			this.jPanelParametrosAuxiliar3CierreRolMensual.setLayout(gridaBagParametrosAuxiliar3CierreRolMensual);
			this.jPanelParametrosAuxiliar4CierreRolMensual.setLayout(gridaBagParametrosAuxiliar4CierreRolMensual);
			//this.jPanelParametrosAuxiliar5CierreRolMensual.setLayout(gridaBagParametrosAuxiliar2CierreRolMensual);			
			
			
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreRolMensual.add(this.jButtonRecargarInformacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreRolMensual.add(this.jComboBoxTiposPaginacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreRolMensual.add(this.jCheckBoxConAltoMaximoTablaCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CierreRolMensual.add(this.jComboBoxTiposArchivosReportesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreRolMensual.add(this.jPanelParametrosAuxiliar1CierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CierreRolMensual.add(this.jComboBoxTiposReportesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreRolMensual.add(this.jPanelParametrosAuxiliar4CierreRolMensual, this.gridBagConstraintsCierreRolMensual);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreRolMensual.add(this.jComboBoxTiposReportesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreRolMensual.add(this.jCheckBoxGenerarReporteCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreRolMensual.add(this.jPanelParametrosAuxiliar2CierreRolMensual, this.gridBagConstraintsCierreRolMensual);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreRolMensual.add(this.jLabelAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
				this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCierreRolMensual.add(this.jButtonAbrirOrderByCierreRolMensual, this.gridBagConstraintsCierreRolMensual);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreRolMensual.add(this.jComboBoxTiposSeleccionarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			
			
			/*
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCierreRolMensual.add(this.jCheckBoxSeleccionarTodosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CierreRolMensual.add(this.jCheckBoxSeleccionarTodosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);															
				
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCierreRolMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CierreRolMensual.add(this.jCheckBoxSeleccionadosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCierreRolMensual.add(this.jPanelParametrosAuxiliar3CierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreRolMensual.add(this.jComboBoxTiposAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
	
				
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCierreRolMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCierreRolMensual.add(this.jTextFieldValorCampoGeneralCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCierreRolMensual = new GridBagLayout();

			this.jScrollPanelDatosCierreRolMensual.setLayout(gridaBagLayoutDatosCierreRolMensual);
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = 0;
			this.gridBagConstraintsCierreRolMensual.gridx = 0;
			
			this.jScrollPanelDatosCierreRolMensual.add(this.jTableDatosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCierreRolMensual.setViewportView(this.jTableDatosCierreRolMensual);
		this.jTableDatosCierreRolMensual.setFillsViewportHeight(true);
		this.jTableDatosCierreRolMensual.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCierreRolMensual= new GridBagLayout();
		this.jPanelAccionesCierreRolMensual.setLayout(gridaBagLayoutAccionesCierreRolMensual);
		
		
		/*	
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = 0;
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
			
		this.jPanelAccionesCierreRolMensual.add(this.jButtonNuevoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableCierreRolMensual= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableCierreRolMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCierreRolMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCierreRolMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableCierreRolMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableCierreRolMensual.setLayout(gridaBagLayoutFK_IdAsientoContableCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdAsientoContableCierreRolMensual.add(jLabelid_asiento_contableFK_IdAsientoContableCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 1;
		jPanelFK_IdAsientoContableCierreRolMensual.add(jComboBoxid_asiento_contableFK_IdAsientoContableCierreRolMensual, gridBagConstraintsCierreRolMensual);


		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdAsientoContableCierreRolMensual.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 1;
		gridBagConstraintsCierreRolMensual.gridx =1;
		jPanelFK_IdAsientoContableCierreRolMensual.add(jButtonFK_IdAsientoContableCierreRolMensual, gridBagConstraintsCierreRolMensual);

		jTabbedPaneBusquedasCierreRolMensual.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableCierreRolMensual);
		jTabbedPaneBusquedasCierreRolMensual.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual= new GridBagLayout();
		gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCierreRolMensualCierreRolMensual.setLayout(gridaBagLayoutFK_IdCierreRolMensualCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdCierreRolMensualCierreRolMensual.add(jLabelid_estructuraFK_IdCierreRolMensualCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 1;
		jPanelFK_IdCierreRolMensualCierreRolMensual.add(jComboBoxid_estructuraFK_IdCierreRolMensualCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 1;
		gridBagConstraintsCierreRolMensual.gridx =1;
		jPanelFK_IdCierreRolMensualCierreRolMensual.add(jButtonFK_IdCierreRolMensualCierreRolMensual, gridBagConstraintsCierreRolMensual);

		jTabbedPaneBusquedasCierreRolMensual.addTab("2.-Por Estructura ", jPanelFK_IdCierreRolMensualCierreRolMensual);
		jTabbedPaneBusquedasCierreRolMensual.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoCierreRolMensual= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoCierreRolMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCierreRolMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCierreRolMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoCierreRolMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoCierreRolMensual.setLayout(gridaBagLayoutFK_IdEmpleadoCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdEmpleadoCierreRolMensual.add(jLabelid_empleadoFK_IdEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 1;
		jPanelFK_IdEmpleadoCierreRolMensual.add(jComboBoxid_empleadoFK_IdEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);


		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.NONE;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdEmpleadoCierreRolMensual.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 1;
		gridBagConstraintsCierreRolMensual.gridx =1;
		jPanelFK_IdEmpleadoCierreRolMensual.add(jButtonFK_IdEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		jTabbedPaneBusquedasCierreRolMensual.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoCierreRolMensual);
		jTabbedPaneBusquedasCierreRolMensual.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoEmpleadoCierreRolMensual.setLayout(gridaBagLayoutFK_IdEstadoEmpleadoCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 0;
		jPanelFK_IdEstadoEmpleadoCierreRolMensual.add(jLabelid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 0;
		gridBagConstraintsCierreRolMensual.gridx = 1;
		jPanelFK_IdEstadoEmpleadoCierreRolMensual.add(jComboBoxid_estado_empleadoFK_IdEstadoEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCierreRolMensual.gridy = 1;
		gridBagConstraintsCierreRolMensual.gridx =1;
		jPanelFK_IdEstadoEmpleadoCierreRolMensual.add(jButtonFK_IdEstadoEmpleadoCierreRolMensual, gridBagConstraintsCierreRolMensual);

		jTabbedPaneBusquedasCierreRolMensual.addTab("4.-Por Estado Empleado ", jPanelFK_IdEstadoEmpleadoCierreRolMensual);
		jTabbedPaneBusquedasCierreRolMensual.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCierreRolMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCierreRolMensual);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();						
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreRolMensual.gridx = 0;		
			//this.gridBagConstraintsCierreRolMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCierreRolMensual.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCierreRolMensual, this.gridBagConstraintsCierreRolMensual);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCierreRolMensual.gridx = 0;		
		//this.gridBagConstraintsCierreRolMensual.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCierreRolMensual.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCierreRolMensual);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreRolMensual.gridx = 0;		
			this.gridBagConstraintsCierreRolMensual.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCierreRolMensual.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCierreRolMensual, this.gridBagConstraintsCierreRolMensual);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);								
		
		
		/*
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		*/		
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCierreRolMensual.gridx =0;
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCierreRolMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
				
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CierreRolMensualJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCierreRolMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCierreRolMensual = new GridBagLayout();
			this.jPanelBusquedasParametrosCierreRolMensual.setLayout(gridaBagLayoutBusquedasParametrosCierreRolMensual);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCierreRolMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCierreRolMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreRolMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreRolMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
			
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCierreRolMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCierreRolMensual;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCierreRolMensual() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCierreRolMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCierreRolMensual.setName("jPanelReporteDinamicoCierreRolMensual"); 
		
		this.jPanelReporteDinamicoCierreRolMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCierreRolMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCierreRolMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCierreRolMensual.setLayout(gridaBagLayoutReporteDinamicoCierreRolMensual);
		
		
		this.jInternalFrameReporteDinamicoCierreRolMensual= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCierreRolMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCierreRolMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCierreRolMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCierreRolMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCierreRolMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCierreRolMensual.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCierreRolMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCierreRolMensual.setResizable(true);
	    this.jInternalFrameReporteDinamicoCierreRolMensual.setClosable(true);
	    this.jInternalFrameReporteDinamicoCierreRolMensual.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCierreRolMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCierreRolMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCierreRolMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCierreRolMensual = new JLabelMe();

		this.jLabelColumnasSelectReporteCierreRolMensual.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jLabelColumnasSelectReporteCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCierreRolMensual = new JList<Reporte>();
		this.jListColumnasSelectReporteCierreRolMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCierreRolMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCierreRolMensual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCierreRolMensual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCierreRolMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCierreRolMensual=new JScrollPane(this.jListColumnasSelectReporteCierreRolMensual);
			
			this.jScrollColumnasSelectReporteCierreRolMensual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCierreRolMensual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCierreRolMensual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCierreRolMensual.add(this.jListColumnasSelectReporteCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jScrollColumnasSelectReporteCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCierreRolMensual = new JLabelMe();

		this.jLabelRelacionesSelectReporteCierreRolMensual.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCierreRolMensual = new JList<Reporte>();
		this.jListRelacionesSelectReporteCierreRolMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCierreRolMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCierreRolMensual.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCierreRolMensual.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCierreRolMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCierreRolMensual=new JScrollPane(this.jListRelacionesSelectReporteCierreRolMensual);
			
			this.jScrollRelacionesSelectReporteCierreRolMensual.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCierreRolMensual.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCierreRolMensual.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCierreRolMensual = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCierreRolMensual = new JComboBoxMe();
		this.jListColumnasValoresGraficoCierreRolMensual = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCierreRolMensual = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCierreRolMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCierreRolMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCierreRolMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCierreRolMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCierreRolMensual = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCierreRolMensual.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jLabelGenerarExcelReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCierreRolMensual = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCierreRolMensual.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCierreRolMensual,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCierreRolMensual.setToolTipText("Generar EXCEL"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		//this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCierreRolMensual.add(this.jButtonGenerarExcelReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jComboBoxTiposReportesDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCierreRolMensual = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCierreRolMensual.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jLabelTiposArchivoReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jComboBoxTiposArchivosReportesDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCierreRolMensual = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCierreRolMensual.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCierreRolMensual,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCierreRolMensual.setToolTipText("Generar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jButtonGenerarReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCierreRolMensual = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCierreRolMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCierreRolMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCierreRolMensual.setToolTipText("Cancelar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCierreRolMensual.add(this.jButtonCerrarReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCierreRolMensual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCierreRolMensual= new JScrollPane(jPanelReporteDinamicoCierreRolMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCierreRolMensual.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCierreRolMensual.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCierreRolMensual.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCierreRolMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCierreRolMensual.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCierreRolMensual);
		this.jInternalFrameReporteDinamicoCierreRolMensual.getContentPane().add(this.jScrollPanelReporteDinamicoCierreRolMensual, this.gridBagConstraintsCierreRolMensual);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCierreRolMensual() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCierreRolMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCierreRolMensual.setName("jPanelImportacionCierreRolMensual"); 
		
		this.jPanelImportacionCierreRolMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCierreRolMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCierreRolMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCierreRolMensual.setLayout(gridaBagLayoutImportacionCierreRolMensual);
		
		
		this.jInternalFrameImportacionCierreRolMensual= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCierreRolMensual= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCierreRolMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCierreRolMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCierreRolMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCierreRolMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCierreRolMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCierreRolMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCierreRolMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCierreRolMensual.setResizable(true);
	    this.jInternalFrameImportacionCierreRolMensual.setClosable(true);
	    this.jInternalFrameImportacionCierreRolMensual.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCierreRolMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCierreRolMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCierreRolMensual.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCierreRolMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCierreRolMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCierreRolMensual.setResizable(true);
	    this.jInternalFrameImportacionCierreRolMensual.setClosable(true);
	    this.jInternalFrameImportacionCierreRolMensual.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCierreRolMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCierreRolMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCierreRolMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCierreRolMensual = new JLabelMe();

		this.jLabelArchivoImportacionCierreRolMensual.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCierreRolMensual.add(this.jLabelArchivoImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCierreRolMensual = new JFileChooser();		
		this.jFileChooserImportacionCierreRolMensual.setToolTipText("ESCOGER ARCHIVO"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCierreRolMensual = new JButtonMe();
		this.jButtonAbrirImportacionCierreRolMensual.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCierreRolMensual,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCierreRolMensual.setToolTipText("Generar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreRolMensual.add(this.jButtonAbrirImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCierreRolMensual = new JLabelMe();

		this.jLabelPathArchivoImportacionCierreRolMensual.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCierreRolMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCierreRolMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCierreRolMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCierreRolMensual.add(this.jLabelPathArchivoImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCierreRolMensual=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCierreRolMensual.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCierreRolMensual.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCierreRolMensual.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreRolMensual.add(this.jTextFieldPathArchivoImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCierreRolMensual = new JButtonMe();
		this.jButtonGenerarImportacionCierreRolMensual.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCierreRolMensual,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCierreRolMensual.setToolTipText("Generar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreRolMensual.add(this.jButtonGenerarImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCierreRolMensual = new JButtonMe();
		this.jButtonCerrarImportacionCierreRolMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCierreRolMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCierreRolMensual.setToolTipText("Cancelar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreRolMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsCierreRolMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCierreRolMensual.add(this.jButtonCerrarImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCierreRolMensual = new GridBagLayout();
		
		this.jScrollPanelImportacionCierreRolMensual= new JScrollPane(jPanelImportacionCierreRolMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
		this.gridBagConstraintsCierreRolMensual.gridy =iPosYImportacion;
		this.gridBagConstraintsCierreRolMensual.gridx =iPosXImportacion;
		this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCierreRolMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCierreRolMensual.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCierreRolMensual);
		this.jInternalFrameImportacionCierreRolMensual.getContentPane().add(this.jScrollPanelImportacionCierreRolMensual, this.gridBagConstraintsCierreRolMensual);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCierreRolMensual(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCierreRolMensual = new JButtonMe();
			this.jButtonAbrirOrderByCierreRolMensual.setText("Orden");
			this.jButtonAbrirOrderByCierreRolMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCierreRolMensual,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCierreRolMensual";
			inputMap = this.jButtonAbrirOrderByCierreRolMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCierreRolMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCierreRolMensual"));
		
		
			GridBagLayout gridaBagLayoutOrderByCierreRolMensual = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCierreRolMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCierreRolMensual.setName("jPanelOrderByCierreRolMensual"); 
			
			this.jPanelOrderByCierreRolMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCierreRolMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCierreRolMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCierreRolMensual.setLayout(gridaBagLayoutOrderByCierreRolMensual);
			
			
			this.jTableDatosCierreRolMensualOrderBy = new JTableMe();        
			this.jTableDatosCierreRolMensualOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCierreRolMensualOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCierreRolMensualOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCierreRolMensualOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCierreRolMensualOrderBy.setViewportView(this.jTableDatosCierreRolMensualOrderBy);
			this.jTableDatosCierreRolMensualOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCierreRolMensualOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCierreRolMensual= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCierreRolMensual= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCierreRolMensual = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCierreRolMensual= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCierreRolMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCierreRolMensual.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCierreRolMensual.setTitle("Orden");
			this.jInternalFrameOrderByCierreRolMensual.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCierreRolMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCierreRolMensual.setResizable(true);
			this.jInternalFrameOrderByCierreRolMensual.setClosable(true);
			this.jInternalFrameOrderByCierreRolMensual.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCierreRolMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCierreRolMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCierreRolMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCierreRolMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Rol Mensuales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCierreRolMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCierreRolMensual.ipady =150;
				
			this.jPanelOrderByCierreRolMensual.add(jScrollPanelDatosCierreRolMensualOrderBy, this.gridBagConstraintsCierreRolMensual);//this.jTableDatosCierreRolMensualTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCierreRolMensual = new JButtonMe();
			this.jButtonCerrarOrderByCierreRolMensual.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCierreRolMensual,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCierreRolMensual.setToolTipText("Cancelar"+" "+CierreRolMensualConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCierreRolMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreRolMensual.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCierreRolMensual.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCierreRolMensual.add(this.jButtonCerrarOrderByCierreRolMensual, this.gridBagConstraintsCierreRolMensual);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCierreRolMensual = new GridBagLayout();
			
			this.jScrollPanelOrderByCierreRolMensual= new JScrollPane(jPanelOrderByCierreRolMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCierreRolMensual = new GridBagConstraints();
			this.gridBagConstraintsCierreRolMensual.gridy =iPosYOrderBy;
			this.gridBagConstraintsCierreRolMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsCierreRolMensual.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCierreRolMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCierreRolMensual.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCierreRolMensual);
			
			this.jInternalFrameOrderByCierreRolMensual.getContentPane().add(this.jScrollPanelOrderByCierreRolMensual, this.gridBagConstraintsCierreRolMensual);			
		
		} else {
			this.jButtonAbrirOrderByCierreRolMensual = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cierrerolmensualSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCierreRolMensual.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCierreRolMensual.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCierreRolMensual.getRowHeight();//CierreRolMensualConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCierreRolMensual.isSelected()) {
					iHeightTable=CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCierreRolMensual.isSelected()) {
					iHeightTable=CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CierreRolMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCierreRolMensual.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCierreRolMensual.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCierreRolMensual.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCierreRolMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCierreRolMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCierreRolMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCierreRolMensual!=null && this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy()!=null) {
			//if(!this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCierreRolMensual.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCierreRolMensual.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCierreRolMensual.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCierreRolMensual.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCierreRolMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCierreRolMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCierreRolMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cierrerolmensualLogic.getCierreRolMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cierrerolmensuals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CierreRolMensual> TraerCierreRolMensualBeans(List<CierreRolMensual> cierrerolmensuals,ArrayList<Classe> classes)throws Exception {
		try {
			for(CierreRolMensual cierrerolmensual:cierrerolmensuals) {
					
				if(!(CierreRolMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CierreRolMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cierrerolmensual.setsDetalleGeneralEntityReporte(CierreRolMensualConstantesFunciones.getCierreRolMensualDescripcion(cierrerolmensual));
										
						
					
						
					
				} else  {
							
					//cierrerolmensual.setsDetalleGeneralEntityReporte(cierrerolmensual.getsDetalleGeneralEntityReporte());
										
				}
				
				//cierrerolmensualbeans.add(cierrerolmensualbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cierrerolmensuals;
    }
	//PARA REPORTES FIN
}
