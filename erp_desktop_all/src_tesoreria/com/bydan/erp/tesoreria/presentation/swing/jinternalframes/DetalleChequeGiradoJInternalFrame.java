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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.DetalleChequeGiradoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class DetalleChequeGiradoJInternalFrame extends DetalleChequeGiradoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleChequeGirado;
	
	protected JMenuBar jmenuBarDetalleChequeGirado;
	
	protected JMenu jmenuDetalleChequeGirado;
	protected JMenu jmenuDatosDetalleChequeGirado;
	protected JMenu jmenuArchivoDetalleChequeGirado;
	protected JMenu jmenuAccionesDetalleChequeGirado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleChequeGirado;	
	protected GridBagConstraints gridBagConstraintsDetalleChequeGirado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleChequeGiradoDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleChequeGirado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleChequeGirado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleChequeGirado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleChequeGiradoSessionBean detallechequegiradoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleChequeGirado> detallechequegirados;		
	public List<DetalleChequeGirado> detallechequegiradosEliminados;	
	public List<DetalleChequeGirado> detallechequegiradosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleChequeGirado;		
	protected JButton jButtonAbrirOrderByDetalleChequeGirado;
	
	
	//protected JPanel jPanelOrderByDetalleChequeGirado;
	//public JScrollPane jScrollPanelOrderByDetalleChequeGirado;	
	//protected JButton jButtonCerrarOrderByDetalleChequeGirado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleChequeGiradoLogic detallechequegiradoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleChequeGirado;
	public JScrollPane jScrollPanelDatosEdicionDetalleChequeGirado;
	public JScrollPane jScrollPanelDatosGeneralDetalleChequeGirado;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleChequeGiradoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleChequeGirado;
	//public JScrollPane jScrollPanelImportacionDetalleChequeGirado;
	
	
	
	protected JPanel jPanelAccionesDetalleChequeGirado;
	
    protected JPanel jPanelPaginacionDetalleChequeGirado;
    protected JPanel jPanelParametrosReportesDetalleChequeGirado;
	protected JPanel jPanelParametrosReportesAccionesDetalleChequeGirado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleChequeGirado;
	protected JPanel jPanelParametrosAuxiliar2DetalleChequeGirado;
	protected JPanel jPanelParametrosAuxiliar3DetalleChequeGirado;
	protected JPanel jPanelParametrosAuxiliar4DetalleChequeGirado;
	//protected JPanel jPanelParametrosAuxiliar5DetalleChequeGirado;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleChequeGirado;
	//protected JPanel jPanelImportacionDetalleChequeGirado;
	
	
	public JTable jTableDatosDetalleChequeGirado;
	
	
	
	//public JTable jTableDatosDetalleChequeGiradoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleChequeGirado;
	protected JButton jButtonDuplicarDetalleChequeGirado;
	protected JButton jButtonCopiarDetalleChequeGirado;
	protected JButton jButtonVerFormDetalleChequeGirado;
	protected JButton jButtonNuevoRelacionesDetalleChequeGirado;
	protected JButton jButtonModificarDetalleChequeGirado;
	
    protected JButton jButtonGuardarCambiosTablaDetalleChequeGirado;
	protected JButton jButtonCerrarDetalleChequeGirado;
	
	
	protected JButton jButtonRecargarInformacionDetalleChequeGirado;
	protected JButton jButtonProcesarInformacionDetalleChequeGirado;
	
	
	protected JButton jButtonAnterioresDetalleChequeGirado;
	protected JButton jButtonSiguientesDetalleChequeGirado;
	protected JButton jButtonNuevoGuardarCambiosDetalleChequeGirado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleChequeGirado;
	//protected JButton jButtonCerrarReporteDinamicoDetalleChequeGirado;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleChequeGirado;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleChequeGirado;
	//protected JButton jButtonGenerarImportacionDetalleChequeGirado;
	//protected JButton jButtonCerrarImportacionDetalleChequeGirado;
	//protected JFileChooser jFileChooserImportacionDetalleChequeGirado;
	//protected File fileImportacionDetalleChequeGirado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleChequeGirado;
	protected JButton jButtonDuplicarToolBarDetalleChequeGirado;
	protected JButton jButtonNuevoRelacionesToolBarDetalleChequeGirado;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleChequeGirado;
	protected JButton jButtonCopiarToolBarDetalleChequeGirado;
	protected JButton jButtonVerFormToolBarDetalleChequeGirado;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleChequeGirado;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleChequeGirado;
	protected JButton jButtonCerrarToolBarDetalleChequeGirado;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleChequeGirado;
	protected JButton jButtonProcesarInformacionToolBarDetalleChequeGirado;
	protected JButton jButtonAnterioresToolBarDetalleChequeGirado;
	protected JButton jButtonSiguientesToolBarDetalleChequeGirado;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado;
	protected JButton jButtonAbrirOrderByToolBarDetalleChequeGirado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleChequeGirado;
	protected JMenuItem jMenuItemDuplicarDetalleChequeGirado;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleChequeGirado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleChequeGirado;
	protected JMenuItem jMenuItemCopiarDetalleChequeGirado;
	protected JMenuItem jMenuItemVerFormDetalleChequeGirado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleChequeGirado;
	protected JMenuItem jMenuItemCerrarDetalleChequeGirado;
	protected JMenuItem jMenuItemDetalleCerrarDetalleChequeGirado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleChequeGirado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleChequeGirado;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleChequeGirado;
	protected JMenuItem jMenuItemProcesarInformacionDetalleChequeGirado;
	protected JMenuItem jMenuItemAnterioresDetalleChequeGirado;
	protected JMenuItem jMenuItemSiguientesDetalleChequeGirado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleChequeGirado;
	protected JMenuItem jMenuItemAbrirOrderByDetalleChequeGirado;
	protected JMenuItem jMenuItemMostrarOcultarDetalleChequeGirado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleChequeGirado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleChequeGirado;
	protected JCheckBox jCheckBoxSeleccionadosDetalleChequeGirado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleChequeGirado;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleChequeGirado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleChequeGirado;
	protected JTextField jTextFieldValorCampoGeneralDetalleChequeGirado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleChequeGirado;
	//public JList<Reporte> jListColumnasSelectReporteDetalleChequeGirado;
	//public JScrollPane jScrollColumnasSelectReporteDetalleChequeGirado;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleChequeGirado;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleChequeGirado;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleChequeGirado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleChequeGirado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleChequeGirado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleChequeGirado;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleChequeGirado;
	
		
	//public JLabel jLabelArchivoImportacionDetalleChequeGirado;	
	//public JLabel jLabelPathArchivoImportacionDetalleChequeGirado;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleChequeGirado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleChequeGirado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleChequeGirado;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleChequeGirado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleChequeGirado;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleChequeGirado;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleChequeGirado;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleChequeGirado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleChequeGirado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleChequeGirado;
	public JPanel jPanelFK_IdAsientoContableDetalleChequeGirado;
	public JButton jButtonFK_IdAsientoContableDetalleChequeGirado;
	public JPanel jPanelFK_IdCuentaBancoDetalleChequeGirado;
	public JButton jButtonFK_IdCuentaBancoDetalleChequeGirado;
	public JPanel jPanelFK_IdEmpleadoDetalleChequeGirado;
	public JButton jButtonFK_IdEmpleadoDetalleChequeGirado;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleChequeGiradoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado;
	
	public JPanel jPanelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado;
	public JLabel jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado;
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGiradoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoDetalleChequeGirado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado;
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleChequeGirado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleChequeGiradoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoDetalleChequeGiradoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado;
	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleChequeGiradoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleChequeGiradoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleChequeGirado)	{
		this.jButtonRecargarInformacionDetalleChequeGirado = jButtonRecargarInformacionDetalleChequeGirado;
	}
	
	public JButton getjButtonProcesarInformacionDetalleChequeGirado() {
		return this.jButtonProcesarInformacionDetalleChequeGirado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleChequeGirado)	{
		this.jButtonProcesarInformacionDetalleChequeGirado = jButtonProcesarInformacionDetalleChequeGirado;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleChequeGirado() {
		return this.jButtonRecargarInformacionDetalleChequeGirado;
	}
	
	
	public List<DetalleChequeGirado> getdetallechequegirados() {
		return this.detallechequegirados;
	}

	public void setdetallechequegirados(List<DetalleChequeGirado> detallechequegirados) {
		this.detallechequegirados = detallechequegirados;
	}
	
	public List<DetalleChequeGirado> getdetallechequegiradosAux() {
		return this.detallechequegiradosAux;
	}

	public void setdetallechequegiradosAux(List<DetalleChequeGirado> detallechequegiradosAux) {
		this.detallechequegiradosAux = detallechequegiradosAux;
	}
	
	public List<DetalleChequeGirado> getdetallechequegiradosEliminados() {
		return this.detallechequegiradosEliminados;
	}

	public void setDetalleChequeGiradosEliminados(List<DetalleChequeGirado> detallechequegiradosEliminados) {
		this.detallechequegiradosEliminados = detallechequegiradosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleChequeGirado() {
		return jComboBoxTiposSeleccionarDetalleChequeGirado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleChequeGirado(
			JComboBox jComboBoxTiposSeleccionarDetalleChequeGirado) {
		this.jComboBoxTiposSeleccionarDetalleChequeGirado = jComboBoxTiposSeleccionarDetalleChequeGirado;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleChequeGirado() {
		return jTextFieldValorCampoGeneralDetalleChequeGirado;
	}

	public void setjTextFieldValorCampoGeneralDetalleChequeGirado(
			JTextField jTextFieldValorCampoGeneralDetalleChequeGirado) {
		this.jTextFieldValorCampoGeneralDetalleChequeGirado = jTextFieldValorCampoGeneralDetalleChequeGirado;
	}

	public void setBorderResaltarValorCampoGeneralDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleChequeGirado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleChequeGirado() {
		return this.jCheckBoxSeleccionarTodosDetalleChequeGirado;
	}

	public void setjCheckBoxSeleccionarTodosDetalleChequeGirado(
			JCheckBox jCheckBoxSeleccionarTodosDetalleChequeGirado) {
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado = jCheckBoxSeleccionarTodosDetalleChequeGirado;
	}

	public void setBorderResaltarSeleccionarTodosDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleChequeGirado() {
		return this.jCheckBoxSeleccionadosDetalleChequeGirado;
	}

	public void setjCheckBoxSeleccionadosDetalleChequeGirado(
			JCheckBox jCheckBoxSeleccionadosDetalleChequeGirado) {
		this.jCheckBoxSeleccionadosDetalleChequeGirado = jCheckBoxSeleccionadosDetalleChequeGirado;
	}
	
	public void setBorderResaltarSeleccionadosDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleChequeGirado() {
		return this.jComboBoxTiposArchivosReportesDetalleChequeGirado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleChequeGirado(
			JComboBox jComboBoxTiposArchivosReportesDetalleChequeGirado) {
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado = jComboBoxTiposArchivosReportesDetalleChequeGirado;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleChequeGirado() {
		return this.jComboBoxTiposReportesDetalleChequeGirado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleChequeGirado(
			JComboBox jComboBoxTiposReportesDetalleChequeGirado) {
		this.jComboBoxTiposReportesDetalleChequeGirado = jComboBoxTiposReportesDetalleChequeGirado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleChequeGirado() {
	//	return jComboBoxTiposReportesDinamicoDetalleChequeGirado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleChequeGirado(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleChequeGirado) {
	//	this.jComboBoxTiposReportesDinamicoDetalleChequeGirado = jComboBoxTiposReportesDinamicoDetalleChequeGirado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado = jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado;
	//}
	
	public void setBorderResaltarTiposReportesDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleChequeGirado() {
		return this.jComboBoxTiposGraficosReportesDetalleChequeGirado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleChequeGirado(
			JComboBox jComboBoxTiposGraficosReportesDetalleChequeGirado) {
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado = jComboBoxTiposGraficosReportesDetalleChequeGirado;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleChequeGirado() {
		return this.jComboBoxTiposPaginacionDetalleChequeGirado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleChequeGirado(
			JComboBox jComboBoxTiposPaginacionDetalleChequeGirado) {
		this.jComboBoxTiposPaginacionDetalleChequeGirado = jComboBoxTiposPaginacionDetalleChequeGirado;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleChequeGirado() {
		return this.jComboBoxTiposRelacionesDetalleChequeGirado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleChequeGirado() {
		return this.jComboBoxTiposAccionesDetalleChequeGirado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleChequeGirado(
			JComboBox jComboBoxTiposRelacionesDetalleChequeGirado) {
		this.jComboBoxTiposRelacionesDetalleChequeGirado = jComboBoxTiposRelacionesDetalleChequeGirado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleChequeGirado(
			JComboBox jComboBoxTiposAccionesDetalleChequeGirado) {
		this.jComboBoxTiposAccionesDetalleChequeGirado = jComboBoxTiposAccionesDetalleChequeGirado;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleChequeGirado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleChequeGirado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleChequeGirado() {
	//	return jCheckBoxConGraficoDinamicoDetalleChequeGirado;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleChequeGirado(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleChequeGirado) {
	//	this.jCheckBoxConGraficoDinamicoDetalleChequeGirado = jCheckBoxConGraficoDinamicoDetalleChequeGirado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleChequeGirado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleChequeGirado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleChequeGirado .setBorder(borderResaltar);		
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
		this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		
		this.detallechequegiradoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallechequegiradoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallechequegiradoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleChequeGiradoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cheque Girado MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleChequeGiradoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleChequeGirado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleChequeGirado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"nuevo","nuevo","Nuevo"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"duplicar","duplicar","Duplicar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"copiar","copiar","Copiar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"ver_form","ver_form","Ver"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"recargar","recargar","Recargar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleChequeGirado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,
							"cerrar","cerrar","Salir"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleChequeGirado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleChequeGirado;
			
				this.jButtonProcesarInformacionToolBarDetalleChequeGirado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleChequeGirado;
				
		//protected JButton jButtonModificarToolBarDetalleChequeGirado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleChequeGirado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleChequeGirado=new JMenuMe("General");
		this.jmenuArchivoDetalleChequeGirado=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleChequeGirado=new JMenuMe("Acciones");
		this.jmenuDatosDetalleChequeGirado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleChequeGirado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleChequeGirado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleChequeGirado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleChequeGirado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleChequeGirado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleChequeGirado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleChequeGirado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleChequeGirado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleChequeGirado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleChequeGirado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleChequeGirado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleChequeGirado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleChequeGirado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleChequeGirado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleChequeGirado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleChequeGirado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleChequeGirado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleChequeGirado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleChequeGirado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleChequeGirado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleChequeGirado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleChequeGirado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleChequeGirado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleChequeGirado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleChequeGirado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleChequeGirado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleChequeGirado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleChequeGirado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleChequeGirado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleChequeGirado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleChequeGirado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleChequeGirado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleChequeGirado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleChequeGirado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleChequeGirado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleChequeGirado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleChequeGirado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleChequeGirado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleChequeGirado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleChequeGirado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleChequeGirado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleChequeGirado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleChequeGirado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleChequeGirado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleChequeGirado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleChequeGirado.add(this.jMenuItemCerrarDetalleChequeGirado);
			
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemNuevoDetalleChequeGirado);
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado);
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemNuevoRelacionesDetalleChequeGirado);
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemGuardarCambiosTablaDetalleChequeGirado);		
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemDuplicarDetalleChequeGirado);		
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemCopiarDetalleChequeGirado);		
			this.jmenuAccionesDetalleChequeGirado.add(this.jMenuItemVerFormDetalleChequeGirado);		
			
			this.jmenuDatosDetalleChequeGirado.add(this.jMenuItemRecargarInformacionDetalleChequeGirado);				
			this.jmenuDatosDetalleChequeGirado.add(this.jMenuItemAnterioresDetalleChequeGirado);				
			this.jmenuDatosDetalleChequeGirado.add(this.jMenuItemSiguientesDetalleChequeGirado);				
			this.jmenuDatosDetalleChequeGirado.add(this.jMenuItemAbrirOrderByDetalleChequeGirado);				
			this.jmenuDatosDetalleChequeGirado.add(this.jMenuItemMostrarOcultarDetalleChequeGirado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleChequeGirado.add(this.jMenuItemGuardarCambiosDetalleChequeGirado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleChequeGirado.add(this.jmenuArchivoDetalleChequeGirado);		
			this.jmenuBarDetalleChequeGirado.add(this.jmenuAccionesDetalleChequeGirado);		
			this.jmenuBarDetalleChequeGirado.add(this.jmenuDatosDetalleChequeGirado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleChequeGirado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleChequeGirado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleChequeGirado.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetalleChequeGirado= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleChequeGirado.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleChequeGirado.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleChequeGirado,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.setFocusable(false);

		this.jPanelFK_IdCuentaBancoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaBancoDetalleChequeGirado.setToolTipText("Buscar Por Cuenta Banco ");
		this.jButtonFK_IdCuentaBancoDetalleChequeGirado= new JButtonMe();
		this.jButtonFK_IdCuentaBancoDetalleChequeGirado.setText("Buscar");
		this.jButtonFK_IdCuentaBancoDetalleChequeGirado.setToolTipText("Buscar Por Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaBancoDetalleChequeGirado,"buscar_button","Buscar Por Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaBancoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado = new JLabelMe();
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setText("Cuenta Banco :");
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setToolTipText("Cuenta Banco");
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoDetalleChequeGirado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoDetalleChequeGirado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoDetalleChequeGirado= new JButtonMe();
		this.jButtonFK_IdEmpleadoDetalleChequeGirado.setText("Buscar");
		this.jButtonFK_IdEmpleadoDetalleChequeGirado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoDetalleChequeGirado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.setFocusable(false);


		this.jTabbedPaneBusquedasDetalleChequeGirado=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleChequeGirado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleChequeGirado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleChequeGirado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleChequeGirado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleChequeGirado = new DetalleChequeGiradoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Cheque Girado DATOS");
			this.jInternalFrameDetalleFormDetalleChequeGirado = new DetalleChequeGiradoDetalleFormJInternalFrame(jDesktopPane,this.detallechequegiradoSessionBean.getConGuardarRelaciones(),this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleChequeGirado = null;//new DetalleChequeGiradoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleChequeGirado= new GridBagLayout();
		
		
		this.jTableDatosDetalleChequeGirado = new JTableMe();      
		
		String sToolTipDetalleChequeGirado="";
		sToolTipDetalleChequeGirado=DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleChequeGirado+="(Tesoreria.DetalleChequeGirado)";
		}
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleChequeGirado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleChequeGirado.setToolTipText(sToolTipDetalleChequeGirado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleChequeGirado);
		this.jTableDatosDetalleChequeGirado.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleChequeGirado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleChequeGirado.setRowSelectionAllowed(true);
		this.jTableDatosDetalleChequeGirado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleChequeGirado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleChequeGirado = new JButtonMe();
		this.jButtonDuplicarDetalleChequeGirado = new JButtonMe();
		this.jButtonCopiarDetalleChequeGirado = new JButtonMe();
		this.jButtonVerFormDetalleChequeGirado = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleChequeGirado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado = new JButtonMe();
		this.jButtonCerrarDetalleChequeGirado = new JButtonMe();
		
		this.jScrollPanelDatosDetalleChequeGirado = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleChequeGirado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cheque Girado";
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleChequeGirado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleChequeGirado.setToolTipText("Acciones");
        this.jPanelAccionesDetalleChequeGirado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleChequeGirado=new ReporteDinamicoJInternalFrame(DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleChequeGirado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleChequeGirado=new ImportacionJInternalFrame(DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleChequeGirado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleChequeGirado = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleChequeGirado.setText("Orden");
		this.jButtonAbrirOrderByDetalleChequeGirado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleChequeGirado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleChequeGirado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleChequeGirado,false,this);
			
			//this.cargarOrderByDetalleChequeGirado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleChequeGirado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleChequeGirado,true,this);
			
			//this.cargarOrderByDetalleChequeGirado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleChequeGirado.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleChequeGirado.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosDetalleChequeGirado.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosDetalleChequeGirado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleChequeGirado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleChequeGirado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleChequeGirado.setText("Nuevo");
		this.jButtonDuplicarDetalleChequeGirado.setText("Duplicar");
		this.jButtonCopiarDetalleChequeGirado.setText("Copiar");
		this.jButtonVerFormDetalleChequeGirado.setText("Ver");
		this.jButtonNuevoRelacionesDetalleChequeGirado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.setText("Guardar");
		this.jButtonCerrarDetalleChequeGirado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleChequeGirado,"nuevo_button","Nuevo",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleChequeGirado,"duplicar_button","Duplicar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleChequeGirado,"copiar_button","Copiar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleChequeGirado,"ver_form","Ver",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleChequeGirado,"nuevorelaciones_button","Nuevo Rel",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleChequeGirado,"guardarcambiostabla_button","Guardar",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleChequeGirado,"cerrar_button","Salir",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleChequeGirado.setToolTipText("Nuevo"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleChequeGirado.setToolTipText("Duplicar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleChequeGirado.setToolTipText("Copiar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleChequeGirado.setToolTipText("Ver"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleChequeGirado.setToolTipText("Nuevo Rel"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.setToolTipText("Guardar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleChequeGirado.setToolTipText("Salir"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleChequeGirado";
		inputMap = this.jButtonNuevoDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleChequeGirado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleChequeGirado"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleChequeGirado";
		inputMap = this.jButtonDuplicarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleChequeGirado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleChequeGirado"));
		
		//COPIAR
		sMapKey = "CopiarDetalleChequeGirado";
		inputMap = this.jButtonCopiarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleChequeGirado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleChequeGirado"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleChequeGirado";
		inputMap = this.jButtonVerFormDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleChequeGirado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleChequeGirado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleChequeGirado";
		inputMap = this.jButtonNuevoRelacionesDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleChequeGirado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleChequeGirado";
		inputMap = this.jButtonModificarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleChequeGirado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleChequeGirado";
		inputMap = this.jButtonCerrarDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleChequeGirado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleChequeGirado";
		inputMap = this.jButtonGuardarCambiosTablaDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleChequeGirado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleChequeGirado.setName("jPanelParametrosReportesDetalleChequeGirado"); 
		
		this.jPanelParametrosReportesAccionesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleChequeGirado.setName("jPanelParametrosReportesAccionesDetalleChequeGirado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleChequeGirado = new JButtonMe();
		this.jButtonRecargarInformacionDetalleChequeGirado.setText("Recargar");
		this.jButtonRecargarInformacionDetalleChequeGirado.setToolTipText("Recargar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleChequeGirado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleChequeGirado = new JButtonMe();
		this.jButtonProcesarInformacionDetalleChequeGirado.setText("Procesar");
		this.jButtonProcesarInformacionDetalleChequeGirado.setToolTipText("Procesar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleChequeGirado.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleChequeGirado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleChequeGirado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleChequeGirado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleChequeGirado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleChequeGirado.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleChequeGirado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleChequeGirado.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleChequeGirado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleChequeGirado.setText("Accion");
		this.jComboBoxTiposAccionesDetalleChequeGirado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleChequeGirado.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleChequeGirado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleChequeGirado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleChequeGirado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleChequeGirado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleChequeGirado = new JLabelMe();
		
		this.jLabelAccionesDetalleChequeGirado.setText("Acciones");		
		this.jLabelAccionesDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleChequeGirado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleChequeGirado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleChequeGirado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleChequeGirado.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleChequeGirado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleChequeGirado = new JButtonMe();
		//this.jButtonAnterioresDetalleChequeGirado.setText("<<");
        this.jButtonAnterioresDetalleChequeGirado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleChequeGirado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleChequeGirado = new JButtonMe();
		//this.jButtonSiguientesDetalleChequeGirado.setText(">>");
        this.jButtonSiguientesDetalleChequeGirado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleChequeGirado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleChequeGirado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleChequeGirado.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleChequeGirado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleChequeGirado,"nuevoguardarcambios_button","Nue",this.detallechequegiradoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleChequeGirado";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleChequeGirado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleChequeGirado";
		inputMap = this.jButtonRecargarInformacionDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleChequeGirado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleChequeGirado";
		inputMap = this.jButtonSiguientesDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleChequeGirado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleChequeGirado";
		inputMap = this.jButtonAnterioresDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleChequeGirado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleChequeGirado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleChequeGirado.setMinimumSize(new Dimension(this.getWidth(),DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleChequeGirado.setMaximumSize(new Dimension(this.getWidth(),DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleChequeGirado.setPreferredSize(new Dimension(this.getWidth(),DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleChequeGiradoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleChequeGirado = new GridBagLayout();

			this.jPanelPaginacionDetalleChequeGirado.setLayout(gridaBagLayoutPaginacionDetalleChequeGirado);						
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonAnterioresDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					
						
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
			
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonNuevoGuardarCambiosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
						
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonSiguientesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonNuevoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
						
			
			
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
				this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
				this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonGuardarCambiosTablaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			}
			
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonDuplicarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonCopiarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonVerFormDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 1;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleChequeGirado.add(this.jButtonCerrarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		
		this.jButtonRecargarInformacionDetalleChequeGirado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleChequeGirado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleChequeGirado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleChequeGirado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleChequeGirado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleChequeGirado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleChequeGirado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleChequeGirado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleChequeGirado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleChequeGirado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleChequeGirado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleChequeGirado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleChequeGirado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleChequeGirado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleChequeGirado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleChequeGirado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleChequeGirado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleChequeGirado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleChequeGirado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleChequeGirado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleChequeGirado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleChequeGirado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleChequeGirado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleChequeGirado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleChequeGirado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleChequeGirado.setLayout(gridaBagParametrosReportesDetalleChequeGirado);
			this.jPanelParametrosReportesAccionesDetalleChequeGirado.setLayout(gridaBagParametrosReportesAccionesDetalleChequeGirado);
			
			
			this.jPanelParametrosAuxiliar1DetalleChequeGirado.setLayout(gridaBagParametrosAuxiliar1DetalleChequeGirado);
			this.jPanelParametrosAuxiliar2DetalleChequeGirado.setLayout(gridaBagParametrosAuxiliar2DetalleChequeGirado);
			this.jPanelParametrosAuxiliar3DetalleChequeGirado.setLayout(gridaBagParametrosAuxiliar3DetalleChequeGirado);
			this.jPanelParametrosAuxiliar4DetalleChequeGirado.setLayout(gridaBagParametrosAuxiliar4DetalleChequeGirado);
			//this.jPanelParametrosAuxiliar5DetalleChequeGirado.setLayout(gridaBagParametrosAuxiliar2DetalleChequeGirado);			
			
			
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jButtonRecargarInformacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleChequeGirado.add(this.jComboBoxTiposPaginacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleChequeGirado.add(this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleChequeGirado.add(this.jComboBoxTiposArchivosReportesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jPanelParametrosAuxiliar1DetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleChequeGirado.add(this.jComboBoxTiposReportesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);																		
			
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleChequeGirado.add(this.jComboBoxTiposGraficosReportesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jPanelParametrosAuxiliar4DetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jComboBoxTiposReportesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jCheckBoxGenerarReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jPanelParametrosAuxiliar2DetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jLabelAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
				this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleChequeGirado.add(this.jButtonAbrirOrderByDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jComboBoxTiposSeleccionarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			
			
			/*
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jCheckBoxSeleccionarTodosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jCheckBoxConGraficoReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleChequeGirado.add(this.jCheckBoxSeleccionarTodosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);															
				
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleChequeGirado.add(this.jCheckBoxSeleccionadosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);															
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleChequeGirado.add(this.jCheckBoxConGraficoReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jPanelParametrosAuxiliar3DetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jComboBoxTiposAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
	
				
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleChequeGirado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleChequeGirado.add(this.jTextFieldValorCampoGeneralDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleChequeGirado = new GridBagLayout();

			this.jScrollPanelDatosDetalleChequeGirado.setLayout(gridaBagLayoutDatosDetalleChequeGirado);
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
			
			this.jScrollPanelDatosDetalleChequeGirado.add(this.jTableDatosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleChequeGirado.setViewportView(this.jTableDatosDetalleChequeGirado);
		this.jTableDatosDetalleChequeGirado.setFillsViewportHeight(true);
		this.jTableDatosDetalleChequeGirado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleChequeGirado= new GridBagLayout();
		this.jPanelAccionesDetalleChequeGirado.setLayout(gridaBagLayoutAccionesDetalleChequeGirado);
		
		
		/*	
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = 0;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
			
		this.jPanelAccionesDetalleChequeGirado.add(this.jButtonNuevoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleChequeGirado.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 0;
		jPanelFK_IdAsientoContableDetalleChequeGirado.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 1;
		jPanelFK_IdAsientoContableDetalleChequeGirado.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);


		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 0;
		jPanelFK_IdAsientoContableDetalleChequeGirado.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 1;
		gridBagConstraintsDetalleChequeGirado.gridx =1;
		jPanelFK_IdAsientoContableDetalleChequeGirado.add(jButtonFK_IdAsientoContableDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		jTabbedPaneBusquedasDetalleChequeGirado.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetalleChequeGirado);
		jTabbedPaneBusquedasDetalleChequeGirado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaBancoDetalleChequeGirado.setLayout(gridaBagLayoutFK_IdCuentaBancoDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 0;
		jPanelFK_IdCuentaBancoDetalleChequeGirado.add(jLabelid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 1;
		jPanelFK_IdCuentaBancoDetalleChequeGirado.add(jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 1;
		gridBagConstraintsDetalleChequeGirado.gridx =1;
		jPanelFK_IdCuentaBancoDetalleChequeGirado.add(jButtonFK_IdCuentaBancoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		jTabbedPaneBusquedasDetalleChequeGirado.addTab("2.-Por Cuenta Banco ", jPanelFK_IdCuentaBancoDetalleChequeGirado);
		jTabbedPaneBusquedasDetalleChequeGirado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoDetalleChequeGirado.setLayout(gridaBagLayoutFK_IdEmpleadoDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 0;
		jPanelFK_IdEmpleadoDetalleChequeGirado.add(jLabelid_empleadoFK_IdEmpleadoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 1;
		jPanelFK_IdEmpleadoDetalleChequeGirado.add(jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);


		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleChequeGirado.gridy = 0;
		gridBagConstraintsDetalleChequeGirado.gridx = 0;
		jPanelFK_IdEmpleadoDetalleChequeGirado.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleChequeGirado.gridy = 1;
		gridBagConstraintsDetalleChequeGirado.gridx =1;
		jPanelFK_IdEmpleadoDetalleChequeGirado.add(jButtonFK_IdEmpleadoDetalleChequeGirado, gridBagConstraintsDetalleChequeGirado);

		jTabbedPaneBusquedasDetalleChequeGirado.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoDetalleChequeGirado);
		jTabbedPaneBusquedasDetalleChequeGirado.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleChequeGirado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleChequeGirado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();						
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;		
			//this.gridBagConstraintsDetalleChequeGirado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleChequeGirado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;		
		//this.gridBagConstraintsDetalleChequeGirado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleChequeGirado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleChequeGirado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleChequeGirado.gridx = 0;		
			this.gridBagConstraintsDetalleChequeGirado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleChequeGirado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);								
		
		
		/*
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		*/		
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleChequeGirado.gridx =0;
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleChequeGirado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
				
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleChequeGirado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleChequeGirado = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleChequeGirado.setLayout(gridaBagLayoutBusquedasParametrosDetalleChequeGirado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleChequeGirado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleChequeGirado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
			
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleChequeGirado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleChequeGirado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleChequeGirado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleChequeGirado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleChequeGirado.setName("jPanelReporteDinamicoDetalleChequeGirado"); 
		
		this.jPanelReporteDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleChequeGirado.setLayout(gridaBagLayoutReporteDinamicoDetalleChequeGirado);
		
		
		this.jInternalFrameReporteDinamicoDetalleChequeGirado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleChequeGirado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleChequeGirado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleChequeGirado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleChequeGirado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleChequeGirado.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleChequeGirado.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleChequeGirado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleChequeGirado = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleChequeGirado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelColumnasSelectReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleChequeGirado = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleChequeGirado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleChequeGirado=new JScrollPane(this.jListColumnasSelectReporteDetalleChequeGirado);
			
			this.jScrollColumnasSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jListColumnasSelectReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jScrollColumnasSelectReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleChequeGirado = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleChequeGirado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleChequeGirado = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleChequeGirado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleChequeGirado=new JScrollPane(this.jListRelacionesSelectReporteDetalleChequeGirado);
			
			this.jScrollRelacionesSelectReporteDetalleChequeGirado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleChequeGirado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleChequeGirado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDetalleChequeGirado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleChequeGirado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleChequeGirado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleChequeGirado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleChequeGirado = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleChequeGirado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelConGraficoDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleChequeGirado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleChequeGirado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleChequeGirado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jCheckBoxConGraficoDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleChequeGirado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleChequeGirado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelColumnaCategoriaGraficoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleChequeGirado = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleChequeGirado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelColumnaCategoriaValorDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleChequeGirado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleChequeGirado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jComboBoxColumnaCategoriaValorDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleChequeGirado = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleChequeGirado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelColumnasValoresGraficoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleChequeGirado = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleChequeGirado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleChequeGirado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleChequeGirado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleChequeGirado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleChequeGirado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleChequeGirado=new JScrollPane(this.jListColumnasValoresGraficoDetalleChequeGirado);
			
			this.jScrollColumnasValoresGraficoDetalleChequeGirado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleChequeGirado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleChequeGirado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jListColumnasSelectReporteDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jScrollColumnasValoresGraficoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelTiposGraficosReportesDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleChequeGirado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelGenerarExcelReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado.setToolTipText("Generar EXCEL"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		//this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jComboBoxTiposReportesDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jLabelTiposArchivoReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleChequeGirado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleChequeGirado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleChequeGirado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleChequeGirado.setToolTipText("Generar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jButtonGenerarReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleChequeGirado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleChequeGirado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleChequeGirado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleChequeGirado.setToolTipText("Cancelar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleChequeGirado.add(this.jButtonCerrarReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleChequeGirado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleChequeGirado= new JScrollPane(jPanelReporteDinamicoDetalleChequeGirado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleChequeGirado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleChequeGirado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleChequeGirado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleChequeGirado);
		this.jInternalFrameReporteDinamicoDetalleChequeGirado.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleChequeGirado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleChequeGirado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleChequeGirado.setName("jPanelImportacionDetalleChequeGirado"); 
		
		this.jPanelImportacionDetalleChequeGirado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleChequeGirado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleChequeGirado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleChequeGirado.setLayout(gridaBagLayoutImportacionDetalleChequeGirado);
		
		
		this.jInternalFrameImportacionDetalleChequeGirado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleChequeGirado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleChequeGirado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleChequeGirado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleChequeGirado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleChequeGirado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleChequeGirado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleChequeGirado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleChequeGirado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleChequeGirado.setResizable(true);
	    this.jInternalFrameImportacionDetalleChequeGirado.setClosable(true);
	    this.jInternalFrameImportacionDetalleChequeGirado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleChequeGirado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleChequeGirado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleChequeGirado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleChequeGirado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleChequeGirado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleChequeGirado.setResizable(true);
	    this.jInternalFrameImportacionDetalleChequeGirado.setClosable(true);
	    this.jInternalFrameImportacionDetalleChequeGirado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleChequeGirado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleChequeGirado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleChequeGirado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleChequeGirado = new JLabelMe();

		this.jLabelArchivoImportacionDetalleChequeGirado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleChequeGirado.add(this.jLabelArchivoImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleChequeGirado = new JFileChooser();		
		this.jFileChooserImportacionDetalleChequeGirado.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleChequeGirado = new JButtonMe();
		this.jButtonAbrirImportacionDetalleChequeGirado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleChequeGirado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleChequeGirado.setToolTipText("Generar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleChequeGirado.add(this.jButtonAbrirImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleChequeGirado = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleChequeGirado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleChequeGirado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleChequeGirado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleChequeGirado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleChequeGirado.add(this.jLabelPathArchivoImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleChequeGirado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleChequeGirado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleChequeGirado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleChequeGirado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleChequeGirado.add(this.jTextFieldPathArchivoImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleChequeGirado = new JButtonMe();
		this.jButtonGenerarImportacionDetalleChequeGirado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleChequeGirado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleChequeGirado.setToolTipText("Generar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleChequeGirado.add(this.jButtonGenerarImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleChequeGirado = new JButtonMe();
		this.jButtonCerrarImportacionDetalleChequeGirado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleChequeGirado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleChequeGirado.setToolTipText("Cancelar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleChequeGirado.add(this.jButtonCerrarImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleChequeGirado = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleChequeGirado= new JScrollPane(jPanelImportacionDetalleChequeGirado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
		this.gridBagConstraintsDetalleChequeGirado.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleChequeGirado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleChequeGirado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleChequeGirado);
		this.jInternalFrameImportacionDetalleChequeGirado.getContentPane().add(this.jScrollPanelImportacionDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleChequeGirado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleChequeGirado = new JButtonMe();
			this.jButtonAbrirOrderByDetalleChequeGirado.setText("Orden");
			this.jButtonAbrirOrderByDetalleChequeGirado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleChequeGirado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleChequeGirado";
			inputMap = this.jButtonAbrirOrderByDetalleChequeGirado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleChequeGirado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleChequeGirado"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleChequeGirado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleChequeGirado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleChequeGirado.setName("jPanelOrderByDetalleChequeGirado"); 
			
			this.jPanelOrderByDetalleChequeGirado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleChequeGirado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleChequeGirado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleChequeGirado.setLayout(gridaBagLayoutOrderByDetalleChequeGirado);
			
			
			this.jTableDatosDetalleChequeGiradoOrderBy = new JTableMe();        
			this.jTableDatosDetalleChequeGiradoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleChequeGiradoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleChequeGiradoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleChequeGiradoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleChequeGiradoOrderBy.setViewportView(this.jTableDatosDetalleChequeGiradoOrderBy);
			this.jTableDatosDetalleChequeGiradoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleChequeGiradoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleChequeGirado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleChequeGirado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleChequeGirado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleChequeGirado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleChequeGirado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleChequeGirado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleChequeGirado.setTitle("Orden");
			this.jInternalFrameOrderByDetalleChequeGirado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleChequeGirado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleChequeGirado.setResizable(true);
			this.jInternalFrameOrderByDetalleChequeGirado.setClosable(true);
			this.jInternalFrameOrderByDetalleChequeGirado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleChequeGirado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleChequeGirado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleChequeGirado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleChequeGirado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cheque Girados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleChequeGirado.ipady =150;
				
			this.jPanelOrderByDetalleChequeGirado.add(jScrollPanelDatosDetalleChequeGiradoOrderBy, this.gridBagConstraintsDetalleChequeGirado);//this.jTableDatosDetalleChequeGiradoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleChequeGirado = new JButtonMe();
			this.jButtonCerrarOrderByDetalleChequeGirado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleChequeGirado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleChequeGirado.setToolTipText("Cancelar"+" "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleChequeGirado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleChequeGirado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleChequeGirado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleChequeGirado.add(this.jButtonCerrarOrderByDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleChequeGirado = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleChequeGirado= new JScrollPane(jPanelOrderByDetalleChequeGirado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleChequeGirado = new GridBagConstraints();
			this.gridBagConstraintsDetalleChequeGirado.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleChequeGirado.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleChequeGirado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleChequeGirado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleChequeGirado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleChequeGirado);
			
			this.jInternalFrameOrderByDetalleChequeGirado.getContentPane().add(this.jScrollPanelOrderByDetalleChequeGirado, this.gridBagConstraintsDetalleChequeGirado);			
		
		} else {
			this.jButtonAbrirOrderByDetalleChequeGirado = new JButtonMe();
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
		int iWidthTableCalculado=0;//3130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detallechequegiradoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleChequeGirado.getRowHeight();//DetalleChequeGiradoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.isSelected()) {
					iHeightTable=DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleChequeGirado.isSelected()) {
					iHeightTable=DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleChequeGiradoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleChequeGirado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleChequeGirado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleChequeGirado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleChequeGirado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleChequeGirado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleChequeGirado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleChequeGirado!=null && this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy()!=null) {
			//if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleChequeGirado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleChequeGirado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleChequeGirado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleChequeGirado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleChequeGirado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleChequeGirado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detallechequegiradoLogic.getDetalleChequeGirados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallechequegirados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleChequeGirado> TraerDetalleChequeGiradoBeans(List<DetalleChequeGirado> detallechequegirados,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleChequeGirado detallechequegirado:detallechequegirados) {
					
				if(!(DetalleChequeGiradoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleChequeGiradoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallechequegirado.setsDetalleGeneralEntityReporte(DetalleChequeGiradoConstantesFunciones.getDetalleChequeGiradoDescripcion(detallechequegirado));
										
					detallechequegirado.setcon_descripcion(DetalleChequeGiradoConstantesFunciones.getconDescripcion(detallechequegirado));	
					
						
					
				} else  {
							
					//detallechequegirado.setsDetalleGeneralEntityReporte(detallechequegirado.getsDetalleGeneralEntityReporte());
										
				}
				
				//detallechequegiradobeans.add(detallechequegiradobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detallechequegirados;
    }
	//PARA REPORTES FIN
}
