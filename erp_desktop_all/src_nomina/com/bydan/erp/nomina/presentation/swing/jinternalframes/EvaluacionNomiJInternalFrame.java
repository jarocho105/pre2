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
import com.bydan.erp.nomina.util.EvaluacionNomiConstantesFunciones;

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
public class EvaluacionNomiJInternalFrame extends EvaluacionNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEvaluacionNomi;
	
	protected JMenuBar jmenuBarEvaluacionNomi;
	
	protected JMenu jmenuEvaluacionNomi;
	protected JMenu jmenuDatosEvaluacionNomi;
	protected JMenu jmenuArchivoEvaluacionNomi;
	protected JMenu jmenuAccionesEvaluacionNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEvaluacionNomi;	
	protected GridBagConstraints gridBagConstraintsEvaluacionNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EvaluacionNomiDetalleFormJInternalFrame jInternalFrameDetalleFormEvaluacionNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEvaluacionNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEvaluacionNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoevaluadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoevaluador="";

	protected FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonomi="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";
	
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoevaluadorSessionBean;
	public FormatoNomiSessionBean formatonomiSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EvaluacionNomi> evaluacionnomis;		
	public List<EvaluacionNomi> evaluacionnomisEliminados;	
	public List<EvaluacionNomi> evaluacionnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEvaluacionNomi;		
	protected JButton jButtonAbrirOrderByEvaluacionNomi;
	
	
	//protected JPanel jPanelOrderByEvaluacionNomi;
	//public JScrollPane jScrollPanelOrderByEvaluacionNomi;	
	//protected JButton jButtonCerrarOrderByEvaluacionNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EvaluacionNomiLogic evaluacionnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEvaluacionNomi;
	public JScrollPane jScrollPanelDatosEdicionEvaluacionNomi;
	public JScrollPane jScrollPanelDatosGeneralEvaluacionNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosEvaluacionNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEvaluacionNomi;
	//public JScrollPane jScrollPanelImportacionEvaluacionNomi;
	
	
	
	protected JPanel jPanelAccionesEvaluacionNomi;
	
    protected JPanel jPanelPaginacionEvaluacionNomi;
    protected JPanel jPanelParametrosReportesEvaluacionNomi;
	protected JPanel jPanelParametrosReportesAccionesEvaluacionNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar2EvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar3EvaluacionNomi;
	protected JPanel jPanelParametrosAuxiliar4EvaluacionNomi;
	//protected JPanel jPanelParametrosAuxiliar5EvaluacionNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoEvaluacionNomi;
	//protected JPanel jPanelImportacionEvaluacionNomi;
	
	
	public JTable jTableDatosEvaluacionNomi;
	
	
	
	//public JTable jTableDatosEvaluacionNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEvaluacionNomi;
	protected JButton jButtonDuplicarEvaluacionNomi;
	protected JButton jButtonCopiarEvaluacionNomi;
	protected JButton jButtonVerFormEvaluacionNomi;
	protected JButton jButtonNuevoRelacionesEvaluacionNomi;
	protected JButton jButtonModificarEvaluacionNomi;
	
    protected JButton jButtonGuardarCambiosTablaEvaluacionNomi;
	protected JButton jButtonCerrarEvaluacionNomi;
	
	
	protected JButton jButtonRecargarInformacionEvaluacionNomi;
	protected JButton jButtonProcesarInformacionEvaluacionNomi;
	
	
	protected JButton jButtonAnterioresEvaluacionNomi;
	protected JButton jButtonSiguientesEvaluacionNomi;
	protected JButton jButtonNuevoGuardarCambiosEvaluacionNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEvaluacionNomi;
	//protected JButton jButtonCerrarReporteDinamicoEvaluacionNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoEvaluacionNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionEvaluacionNomi;
	//protected JButton jButtonGenerarImportacionEvaluacionNomi;
	//protected JButton jButtonCerrarImportacionEvaluacionNomi;
	//protected JFileChooser jFileChooserImportacionEvaluacionNomi;
	//protected File fileImportacionEvaluacionNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEvaluacionNomi;
	protected JButton jButtonDuplicarToolBarEvaluacionNomi;
	protected JButton jButtonNuevoRelacionesToolBarEvaluacionNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarEvaluacionNomi;
	protected JButton jButtonCopiarToolBarEvaluacionNomi;
	protected JButton jButtonVerFormToolBarEvaluacionNomi;
	public JButton jButtonGuardarCambiosTablaToolBarEvaluacionNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEvaluacionNomi;
	protected JButton jButtonCerrarToolBarEvaluacionNomi;
	
	protected JButton jButtonRecargarInformacionToolBarEvaluacionNomi;
	protected JButton jButtonProcesarInformacionToolBarEvaluacionNomi;
	protected JButton jButtonAnterioresToolBarEvaluacionNomi;
	protected JButton jButtonSiguientesToolBarEvaluacionNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarEvaluacionNomi;
	protected JButton jButtonAbrirOrderByToolBarEvaluacionNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEvaluacionNomi;
	protected JMenuItem jMenuItemDuplicarEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoRelacionesEvaluacionNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEvaluacionNomi;
	protected JMenuItem jMenuItemCopiarEvaluacionNomi;
	protected JMenuItem jMenuItemVerFormEvaluacionNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEvaluacionNomi;
	protected JMenuItem jMenuItemCerrarEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleCerrarEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEvaluacionNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEvaluacionNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionEvaluacionNomi;
	protected JMenuItem jMenuItemProcesarInformacionEvaluacionNomi;
	protected JMenuItem jMenuItemAnterioresEvaluacionNomi;
	protected JMenuItem jMenuItemSiguientesEvaluacionNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEvaluacionNomi;
	protected JMenuItem jMenuItemAbrirOrderByEvaluacionNomi;
	protected JMenuItem jMenuItemMostrarOcultarEvaluacionNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEvaluacionNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEvaluacionNomi;
	protected JCheckBox jCheckBoxSeleccionadosEvaluacionNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEvaluacionNomi;
	protected JCheckBox jCheckBoxConGraficoReporteEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEvaluacionNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEvaluacionNomi;
	protected JTextField jTextFieldValorCampoGeneralEvaluacionNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEvaluacionNomi;
	//public JList<Reporte> jListColumnasSelectReporteEvaluacionNomi;
	//public JScrollPane jScrollColumnasSelectReporteEvaluacionNomi;
	
	//public JLabel jLabelRelacionesSelectReporteEvaluacionNomi;
	//public JList<Reporte> jListRelacionesSelectReporteEvaluacionNomi;
	//public JScrollPane jScrollRelacionesSelectReporteEvaluacionNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEvaluacionNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEvaluacionNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEvaluacionNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoEvaluacionNomi;
	
		
	//public JLabel jLabelArchivoImportacionEvaluacionNomi;	
	//public JLabel jLabelPathArchivoImportacionEvaluacionNomi;
	//protected JTextField jTextFieldPathArchivoImportacionEvaluacionNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEvaluacionNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEvaluacionNomi;
	
	//public JLabel jLabelColumnaCategoriaValorEvaluacionNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEvaluacionNomi;
	
	//public JLabel jLabelColumnasValoresGraficoEvaluacionNomi;
	//public JList<Reporte> jListColumnasValoresGraficoEvaluacionNomi;
	//public JScrollPane jScrollColumnasValoresGraficoEvaluacionNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEvaluacionNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEvaluacionNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEvaluacionNomi;
	public JPanel jPanelFK_IdEmpleadoEvaluacionNomi;
	public JButton jButtonFK_IdEmpleadoEvaluacionNomi;
	public JPanel jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi;
	public JButton jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi;
	public JPanel jPanelFK_IdEstructuraEvaluacionNomi;
	public JButton jButtonFK_IdEstructuraEvaluacionNomi;
	public JPanel jPanelFK_IdFormatoNomiEvaluacionNomi;
	public JButton jButtonFK_IdFormatoNomiEvaluacionNomi;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEvaluacionNomi;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi;
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi;
	public JLabel jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi;
	public JButton jButtonid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEvaluacionNomi;
	public JLabel jLabelid_estructuraFK_IdEstructuraEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi;
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEvaluacionNomiArbol= new JButtonMe();

	
	public JPanel jPanelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi;
	public JLabel jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi;
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiEvaluacionNomi= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiEvaluacionNomiUpdate= new JButtonMe();
	public JButton jButtonid_formato_nomiFK_IdFormatoNomiEvaluacionNomiBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EvaluacionNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EvaluacionNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEvaluacionNomi)	{
		this.jButtonRecargarInformacionEvaluacionNomi = jButtonRecargarInformacionEvaluacionNomi;
	}
	
	public JButton getjButtonProcesarInformacionEvaluacionNomi() {
		return this.jButtonProcesarInformacionEvaluacionNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEvaluacionNomi)	{
		this.jButtonProcesarInformacionEvaluacionNomi = jButtonProcesarInformacionEvaluacionNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionEvaluacionNomi() {
		return this.jButtonRecargarInformacionEvaluacionNomi;
	}
	
	
	public List<EvaluacionNomi> getevaluacionnomis() {
		return this.evaluacionnomis;
	}

	public void setevaluacionnomis(List<EvaluacionNomi> evaluacionnomis) {
		this.evaluacionnomis = evaluacionnomis;
	}
	
	public List<EvaluacionNomi> getevaluacionnomisAux() {
		return this.evaluacionnomisAux;
	}

	public void setevaluacionnomisAux(List<EvaluacionNomi> evaluacionnomisAux) {
		this.evaluacionnomisAux = evaluacionnomisAux;
	}
	
	public List<EvaluacionNomi> getevaluacionnomisEliminados() {
		return this.evaluacionnomisEliminados;
	}

	public void setEvaluacionNomisEliminados(List<EvaluacionNomi> evaluacionnomisEliminados) {
		this.evaluacionnomisEliminados = evaluacionnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEvaluacionNomi() {
		return jComboBoxTiposSeleccionarEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEvaluacionNomi(
			JComboBox jComboBoxTiposSeleccionarEvaluacionNomi) {
		this.jComboBoxTiposSeleccionarEvaluacionNomi = jComboBoxTiposSeleccionarEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEvaluacionNomi() {
		return jTextFieldValorCampoGeneralEvaluacionNomi;
	}

	public void setjTextFieldValorCampoGeneralEvaluacionNomi(
			JTextField jTextFieldValorCampoGeneralEvaluacionNomi) {
		this.jTextFieldValorCampoGeneralEvaluacionNomi = jTextFieldValorCampoGeneralEvaluacionNomi;
	}

	public void setBorderResaltarValorCampoGeneralEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEvaluacionNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEvaluacionNomi() {
		return this.jCheckBoxSeleccionarTodosEvaluacionNomi;
	}

	public void setjCheckBoxSeleccionarTodosEvaluacionNomi(
			JCheckBox jCheckBoxSeleccionarTodosEvaluacionNomi) {
		this.jCheckBoxSeleccionarTodosEvaluacionNomi = jCheckBoxSeleccionarTodosEvaluacionNomi;
	}

	public void setBorderResaltarSeleccionarTodosEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEvaluacionNomi() {
		return this.jCheckBoxSeleccionadosEvaluacionNomi;
	}

	public void setjCheckBoxSeleccionadosEvaluacionNomi(
			JCheckBox jCheckBoxSeleccionadosEvaluacionNomi) {
		this.jCheckBoxSeleccionadosEvaluacionNomi = jCheckBoxSeleccionadosEvaluacionNomi;
	}
	
	public void setBorderResaltarSeleccionadosEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEvaluacionNomi() {
		return this.jComboBoxTiposArchivosReportesEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEvaluacionNomi(
			JComboBox jComboBoxTiposArchivosReportesEvaluacionNomi) {
		this.jComboBoxTiposArchivosReportesEvaluacionNomi = jComboBoxTiposArchivosReportesEvaluacionNomi;
	}

	public void setBorderResaltarTiposArchivosReportesEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEvaluacionNomi() {
		return this.jComboBoxTiposReportesEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEvaluacionNomi(
			JComboBox jComboBoxTiposReportesEvaluacionNomi) {
		this.jComboBoxTiposReportesEvaluacionNomi = jComboBoxTiposReportesEvaluacionNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEvaluacionNomi() {
	//	return jComboBoxTiposReportesDinamicoEvaluacionNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEvaluacionNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoEvaluacionNomi) {
	//	this.jComboBoxTiposReportesDinamicoEvaluacionNomi = jComboBoxTiposReportesDinamicoEvaluacionNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEvaluacionNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEvaluacionNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi = jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi;
	//}
	
	public void setBorderResaltarTiposReportesEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEvaluacionNomi() {
		return this.jComboBoxTiposGraficosReportesEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEvaluacionNomi(
			JComboBox jComboBoxTiposGraficosReportesEvaluacionNomi) {
		this.jComboBoxTiposGraficosReportesEvaluacionNomi = jComboBoxTiposGraficosReportesEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEvaluacionNomi() {
		return this.jComboBoxTiposPaginacionEvaluacionNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEvaluacionNomi(
			JComboBox jComboBoxTiposPaginacionEvaluacionNomi) {
		this.jComboBoxTiposPaginacionEvaluacionNomi = jComboBoxTiposPaginacionEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposPaginacionEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEvaluacionNomi() {
		return this.jComboBoxTiposRelacionesEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEvaluacionNomi() {
		return this.jComboBoxTiposAccionesEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEvaluacionNomi(
			JComboBox jComboBoxTiposRelacionesEvaluacionNomi) {
		this.jComboBoxTiposRelacionesEvaluacionNomi = jComboBoxTiposRelacionesEvaluacionNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEvaluacionNomi(
			JComboBox jComboBoxTiposAccionesEvaluacionNomi) {
		this.jComboBoxTiposAccionesEvaluacionNomi = jComboBoxTiposAccionesEvaluacionNomi;
	}
	
	public void setBorderResaltarTiposRelacionesEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEvaluacionNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEvaluacionNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEvaluacionNomi() {
	//	return jCheckBoxConGraficoDinamicoEvaluacionNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoEvaluacionNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoEvaluacionNomi) {
	//	this.jCheckBoxConGraficoDinamicoEvaluacionNomi = jCheckBoxConGraficoDinamicoEvaluacionNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEvaluacionNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEvaluacionNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEvaluacionNomi .setBorder(borderResaltar);		
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
		this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		
		this.evaluacionnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.evaluacionnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EvaluacionNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Evaluacion Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EvaluacionNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEvaluacionNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"nuevo","nuevo","Nuevo"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"duplicar","duplicar","Duplicar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"copiar","copiar","Copiar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"ver_form","ver_form","Ver"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"recargar","recargar","Recargar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEvaluacionNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEvaluacionNomi,this.jTtoolBarEvaluacionNomi,
							"cerrar","cerrar","Salir"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEvaluacionNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEvaluacionNomi;
			
				this.jButtonProcesarInformacionToolBarEvaluacionNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEvaluacionNomi;
				
		//protected JButton jButtonModificarToolBarEvaluacionNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEvaluacionNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEvaluacionNomi=new JMenuMe("General");
		this.jmenuArchivoEvaluacionNomi=new JMenuMe("Archivo");
		this.jmenuAccionesEvaluacionNomi=new JMenuMe("Acciones");
		this.jmenuDatosEvaluacionNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEvaluacionNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEvaluacionNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEvaluacionNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEvaluacionNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEvaluacionNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEvaluacionNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEvaluacionNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEvaluacionNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEvaluacionNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEvaluacionNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEvaluacionNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEvaluacionNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEvaluacionNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEvaluacionNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEvaluacionNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEvaluacionNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEvaluacionNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEvaluacionNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEvaluacionNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEvaluacionNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEvaluacionNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEvaluacionNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEvaluacionNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEvaluacionNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEvaluacionNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEvaluacionNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEvaluacionNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEvaluacionNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEvaluacionNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEvaluacionNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEvaluacionNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEvaluacionNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEvaluacionNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEvaluacionNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEvaluacionNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEvaluacionNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEvaluacionNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEvaluacionNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEvaluacionNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEvaluacionNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEvaluacionNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEvaluacionNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEvaluacionNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEvaluacionNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEvaluacionNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEvaluacionNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEvaluacionNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEvaluacionNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEvaluacionNomi.add(this.jMenuItemCerrarEvaluacionNomi);
			
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemNuevoEvaluacionNomi);
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemNuevoGuardarCambiosEvaluacionNomi);
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemNuevoRelacionesEvaluacionNomi);
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemGuardarCambiosTablaEvaluacionNomi);		
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemDuplicarEvaluacionNomi);		
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemCopiarEvaluacionNomi);		
			this.jmenuAccionesEvaluacionNomi.add(this.jMenuItemVerFormEvaluacionNomi);		
			
			this.jmenuDatosEvaluacionNomi.add(this.jMenuItemRecargarInformacionEvaluacionNomi);				
			this.jmenuDatosEvaluacionNomi.add(this.jMenuItemAnterioresEvaluacionNomi);				
			this.jmenuDatosEvaluacionNomi.add(this.jMenuItemSiguientesEvaluacionNomi);				
			this.jmenuDatosEvaluacionNomi.add(this.jMenuItemAbrirOrderByEvaluacionNomi);				
			this.jmenuDatosEvaluacionNomi.add(this.jMenuItemMostrarOcultarEvaluacionNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEvaluacionNomi.add(this.jMenuItemGuardarCambiosEvaluacionNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEvaluacionNomi.add(this.jmenuArchivoEvaluacionNomi);		
			this.jmenuBarEvaluacionNomi.add(this.jmenuAccionesEvaluacionNomi);		
			this.jmenuBarEvaluacionNomi.add(this.jmenuDatosEvaluacionNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEvaluacionNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEvaluacionNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEvaluacionNomi.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoEvaluacionNomi.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEvaluacionNomi,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi.setToolTipText("Buscar Por Empleado Evaluador ");
		this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi.setToolTipText("Buscar Por Empleado Evaluador ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi,"buscar_button","Buscar Por Empleado Evaluador ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi = new JLabelMe();
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setText("Empleado Evaluador :");
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setToolTipText("Empleado Evaluador");
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEvaluacionNomi.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdEstructuraEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdEstructuraEvaluacionNomi.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEvaluacionNomi,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoNomiEvaluacionNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoNomiEvaluacionNomi.setToolTipText("Buscar Por Formato Nomi ");
		this.jButtonFK_IdFormatoNomiEvaluacionNomi= new JButtonMe();
		this.jButtonFK_IdFormatoNomiEvaluacionNomi.setText("Buscar");
		this.jButtonFK_IdFormatoNomiEvaluacionNomi.setToolTipText("Buscar Por Formato Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoNomiEvaluacionNomi,"buscar_button","Buscar Por Formato Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoNomiEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi = new JLabelMe();
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setText("Formato Nomi :");
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setToolTipText("Formato Nomi");
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi= new JComboBoxMe();
		jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEvaluacionNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasEvaluacionNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEvaluacionNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEvaluacionNomi = new EvaluacionNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Evaluacion Nomi DATOS");
			this.jInternalFrameDetalleFormEvaluacionNomi = new EvaluacionNomiDetalleFormJInternalFrame(jDesktopPane,this.evaluacionnomiSessionBean.getConGuardarRelaciones(),this.evaluacionnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEvaluacionNomi = null;//new EvaluacionNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEvaluacionNomi= new GridBagLayout();
		
		
		this.jTableDatosEvaluacionNomi = new JTableMe();      
		
		String sToolTipEvaluacionNomi="";
		sToolTipEvaluacionNomi=EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEvaluacionNomi+="(Nomina.EvaluacionNomi)";
		}
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEvaluacionNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEvaluacionNomi.setToolTipText(sToolTipEvaluacionNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEvaluacionNomi);
		this.jTableDatosEvaluacionNomi.setAutoCreateRowSorter(true);
		this.jTableDatosEvaluacionNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEvaluacionNomi.setRowSelectionAllowed(true);
		this.jTableDatosEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEvaluacionNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEvaluacionNomi = new JButtonMe();
		this.jButtonDuplicarEvaluacionNomi = new JButtonMe();
		this.jButtonCopiarEvaluacionNomi = new JButtonMe();
		this.jButtonVerFormEvaluacionNomi = new JButtonMe();
		this.jButtonNuevoRelacionesEvaluacionNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarEvaluacionNomi = new JButtonMe();
		
		this.jScrollPanelDatosEvaluacionNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralEvaluacionNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Evaluacion Nomi";
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosEvaluacionNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEvaluacionNomi.setToolTipText("Acciones");
        this.jPanelAccionesEvaluacionNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEvaluacionNomi=new ReporteDinamicoJInternalFrame(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEvaluacionNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEvaluacionNomi=new ImportacionJInternalFrame(EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEvaluacionNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEvaluacionNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByEvaluacionNomi.setText("Orden");
		this.jButtonAbrirOrderByEvaluacionNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionNomi,false,this);
			
			//this.cargarOrderByEvaluacionNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEvaluacionNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionNomi,true,this);
			
			//this.cargarOrderByEvaluacionNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEvaluacionNomi.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosEvaluacionNomi.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosEvaluacionNomi.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosEvaluacionNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEvaluacionNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEvaluacionNomi.setText("Nuevo");
		this.jButtonDuplicarEvaluacionNomi.setText("Duplicar");
		this.jButtonCopiarEvaluacionNomi.setText("Copiar");
		this.jButtonVerFormEvaluacionNomi.setText("Ver");
		this.jButtonNuevoRelacionesEvaluacionNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.setText("Guardar");
		this.jButtonCerrarEvaluacionNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEvaluacionNomi,"nuevo_button","Nuevo",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEvaluacionNomi,"duplicar_button","Duplicar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEvaluacionNomi,"copiar_button","Copiar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEvaluacionNomi,"ver_form","Ver",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEvaluacionNomi,"nuevorelaciones_button","Nuevo Rel",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEvaluacionNomi,"guardarcambiostabla_button","Guardar",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEvaluacionNomi,"cerrar_button","Salir",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEvaluacionNomi.setToolTipText("Nuevo"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEvaluacionNomi.setToolTipText("Duplicar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEvaluacionNomi.setToolTipText("Copiar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEvaluacionNomi.setToolTipText("Ver"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEvaluacionNomi.setToolTipText("Nuevo Rel"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.setToolTipText("Guardar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEvaluacionNomi.setToolTipText("Salir"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEvaluacionNomi";
		inputMap = this.jButtonNuevoEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEvaluacionNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarEvaluacionNomi";
		inputMap = this.jButtonDuplicarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEvaluacionNomi"));
		
		//COPIAR
		sMapKey = "CopiarEvaluacionNomi";
		inputMap = this.jButtonCopiarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEvaluacionNomi"));
		
		//VEr FORM
		sMapKey = "VerFormEvaluacionNomi";
		inputMap = this.jButtonVerFormEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEvaluacionNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEvaluacionNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEvaluacionNomi";
		inputMap = this.jButtonNuevoRelacionesEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEvaluacionNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEvaluacionNomi";
		inputMap = this.jButtonModificarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEvaluacionNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEvaluacionNomi";
		inputMap = this.jButtonCerrarEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEvaluacionNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEvaluacionNomi";
		inputMap = this.jButtonGuardarCambiosTablaEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEvaluacionNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEvaluacionNomi.setName("jPanelParametrosReportesEvaluacionNomi"); 
		
		this.jPanelParametrosReportesAccionesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEvaluacionNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEvaluacionNomi.setName("jPanelParametrosReportesAccionesEvaluacionNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEvaluacionNomi = new JButtonMe();
		this.jButtonRecargarInformacionEvaluacionNomi.setText("Recargar");
		this.jButtonRecargarInformacionEvaluacionNomi.setToolTipText("Recargar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEvaluacionNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEvaluacionNomi = new JButtonMe();
		this.jButtonProcesarInformacionEvaluacionNomi.setText("Procesar");
		this.jButtonProcesarInformacionEvaluacionNomi.setToolTipText("Procesar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEvaluacionNomi.setVisible(false);
			
		this.jButtonProcesarInformacionEvaluacionNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEvaluacionNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEvaluacionNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposReportesEvaluacionNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEvaluacionNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEvaluacionNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEvaluacionNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionEvaluacionNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposRelacionesEvaluacionNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposAccionesEvaluacionNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEvaluacionNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEvaluacionNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarEvaluacionNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEvaluacionNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEvaluacionNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEvaluacionNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEvaluacionNomi = new JLabelMe();
		
		this.jLabelAccionesEvaluacionNomi.setText("Acciones");		
		this.jLabelAccionesEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEvaluacionNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEvaluacionNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEvaluacionNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEvaluacionNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEvaluacionNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEvaluacionNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEvaluacionNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEvaluacionNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteEvaluacionNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEvaluacionNomi = new JButtonMe();
		//this.jButtonAnterioresEvaluacionNomi.setText("<<");
        this.jButtonAnterioresEvaluacionNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEvaluacionNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEvaluacionNomi = new JButtonMe();
		//this.jButtonSiguientesEvaluacionNomi.setText(">>");
        this.jButtonSiguientesEvaluacionNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEvaluacionNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEvaluacionNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEvaluacionNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosEvaluacionNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEvaluacionNomi,"nuevoguardarcambios_button","Nue",this.evaluacionnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEvaluacionNomi";
		inputMap = this.jButtonNuevoGuardarCambiosEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEvaluacionNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEvaluacionNomi";
		inputMap = this.jButtonRecargarInformacionEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEvaluacionNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEvaluacionNomi";
		inputMap = this.jButtonSiguientesEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEvaluacionNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEvaluacionNomi";
		inputMap = this.jButtonAnterioresEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEvaluacionNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEvaluacionNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEvaluacionNomi.setMinimumSize(new Dimension(this.getWidth(),EvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionNomi.setMaximumSize(new Dimension(this.getWidth(),EvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEvaluacionNomi.setPreferredSize(new Dimension(this.getWidth(),EvaluacionNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EvaluacionNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEvaluacionNomi = new GridBagLayout();

			this.jPanelPaginacionEvaluacionNomi.setLayout(gridaBagLayoutPaginacionEvaluacionNomi);						
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 0;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonAnterioresEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					
						
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionNomi.gridy = 0;
			
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonNuevoGuardarCambiosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
						
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEvaluacionNomi.gridy = 0;
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonSiguientesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonNuevoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionNomi.gridy = 1;
				this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEvaluacionNomi.add(this.jButtonNuevoRelacionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			}
			
			
			if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEvaluacionNomi.gridy = 1;
				this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEvaluacionNomi.add(this.jButtonGuardarCambiosTablaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			}
			
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonDuplicarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonCopiarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonVerFormEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 1;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEvaluacionNomi.add(this.jButtonCerrarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
		
		
		this.jButtonRecargarInformacionEvaluacionNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEvaluacionNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEvaluacionNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEvaluacionNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEvaluacionNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEvaluacionNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEvaluacionNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEvaluacionNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEvaluacionNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEvaluacionNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEvaluacionNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEvaluacionNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEvaluacionNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEvaluacionNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEvaluacionNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEvaluacionNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEvaluacionNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EvaluacionNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EvaluacionNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEvaluacionNomi.setLayout(gridaBagParametrosReportesEvaluacionNomi);
			this.jPanelParametrosReportesAccionesEvaluacionNomi.setLayout(gridaBagParametrosReportesAccionesEvaluacionNomi);
			
			
			this.jPanelParametrosAuxiliar1EvaluacionNomi.setLayout(gridaBagParametrosAuxiliar1EvaluacionNomi);
			this.jPanelParametrosAuxiliar2EvaluacionNomi.setLayout(gridaBagParametrosAuxiliar2EvaluacionNomi);
			this.jPanelParametrosAuxiliar3EvaluacionNomi.setLayout(gridaBagParametrosAuxiliar3EvaluacionNomi);
			this.jPanelParametrosAuxiliar4EvaluacionNomi.setLayout(gridaBagParametrosAuxiliar4EvaluacionNomi);
			//this.jPanelParametrosAuxiliar5EvaluacionNomi.setLayout(gridaBagParametrosAuxiliar2EvaluacionNomi);			
			
			
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jButtonRecargarInformacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionNomi.add(this.jComboBoxTiposPaginacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionNomi.add(this.jCheckBoxConAltoMaximoTablaEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EvaluacionNomi.add(this.jComboBoxTiposArchivosReportesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jPanelParametrosAuxiliar1EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EvaluacionNomi.add(this.jComboBoxTiposReportesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jPanelParametrosAuxiliar4EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jComboBoxTiposReportesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jCheckBoxGenerarReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jPanelParametrosAuxiliar2EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jLabelAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
				this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEvaluacionNomi.add(this.jButtonAbrirOrderByEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jComboBoxTiposSeleccionarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			
			
			/*
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jCheckBoxSeleccionarTodosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionNomi.add(this.jCheckBoxSeleccionarTodosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);															
				
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEvaluacionNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EvaluacionNomi.add(this.jCheckBoxSeleccionadosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jPanelParametrosAuxiliar3EvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jComboBoxTiposRelacionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
				
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jComboBoxTiposAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
	
				
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEvaluacionNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEvaluacionNomi.add(this.jTextFieldValorCampoGeneralEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEvaluacionNomi = new GridBagLayout();

			this.jScrollPanelDatosEvaluacionNomi.setLayout(gridaBagLayoutDatosEvaluacionNomi);
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = 0;
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;
			
			this.jScrollPanelDatosEvaluacionNomi.add(this.jTableDatosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEvaluacionNomi.setViewportView(this.jTableDatosEvaluacionNomi);
		this.jTableDatosEvaluacionNomi.setFillsViewportHeight(true);
		this.jTableDatosEvaluacionNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEvaluacionNomi= new GridBagLayout();
		this.jPanelAccionesEvaluacionNomi.setLayout(gridaBagLayoutAccionesEvaluacionNomi);
		
		
		/*	
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = 0;
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
			
		this.jPanelAccionesEvaluacionNomi.add(this.jButtonNuevoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEvaluacionNomi.setLayout(gridaBagLayoutFK_IdEmpleadoEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 0;
		jPanelFK_IdEmpleadoEvaluacionNomi.add(jLabelid_empleadoFK_IdEmpleadoEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 1;
		jPanelFK_IdEmpleadoEvaluacionNomi.add(jComboBoxid_empleadoFK_IdEmpleadoEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 1;
		gridBagConstraintsEvaluacionNomi.gridx =1;
		jPanelFK_IdEmpleadoEvaluacionNomi.add(jButtonFK_IdEmpleadoEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		jTabbedPaneBusquedasEvaluacionNomi.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoEvaluacionNomi);
		jTabbedPaneBusquedasEvaluacionNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi.setLayout(gridaBagLayoutFK_IdEmpleadoEvaluadorEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 0;
		jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi.add(jLabelid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 1;
		jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi.add(jComboBoxid_empleado_evaluadorFK_IdEmpleadoEvaluadorEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 1;
		gridBagConstraintsEvaluacionNomi.gridx =1;
		jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi.add(jButtonFK_IdEmpleadoEvaluadorEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		jTabbedPaneBusquedasEvaluacionNomi.addTab("2.-Por Empleado Evaluador ", jPanelFK_IdEmpleadoEvaluadorEvaluacionNomi);
		jTabbedPaneBusquedasEvaluacionNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEvaluacionNomi.setLayout(gridaBagLayoutFK_IdEstructuraEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 0;
		jPanelFK_IdEstructuraEvaluacionNomi.add(jLabelid_estructuraFK_IdEstructuraEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 1;
		jPanelFK_IdEstructuraEvaluacionNomi.add(jComboBoxid_estructuraFK_IdEstructuraEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 1;
		gridBagConstraintsEvaluacionNomi.gridx =1;
		jPanelFK_IdEstructuraEvaluacionNomi.add(jButtonFK_IdEstructuraEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		jTabbedPaneBusquedasEvaluacionNomi.addTab("3.-Por Estructura ", jPanelFK_IdEstructuraEvaluacionNomi);
		jTabbedPaneBusquedasEvaluacionNomi.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoNomiEvaluacionNomi.setLayout(gridaBagLayoutFK_IdFormatoNomiEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 0;
		jPanelFK_IdFormatoNomiEvaluacionNomi.add(jLabelid_formato_nomiFK_IdFormatoNomiEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 0;
		gridBagConstraintsEvaluacionNomi.gridx = 1;
		jPanelFK_IdFormatoNomiEvaluacionNomi.add(jComboBoxid_formato_nomiFK_IdFormatoNomiEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEvaluacionNomi.gridy = 1;
		gridBagConstraintsEvaluacionNomi.gridx =1;
		jPanelFK_IdFormatoNomiEvaluacionNomi.add(jButtonFK_IdFormatoNomiEvaluacionNomi, gridBagConstraintsEvaluacionNomi);

		jTabbedPaneBusquedasEvaluacionNomi.addTab("4.-Por Formato Nomi ", jPanelFK_IdFormatoNomiEvaluacionNomi);
		jTabbedPaneBusquedasEvaluacionNomi.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEvaluacionNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEvaluacionNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();						
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;		
			//this.gridBagConstraintsEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEvaluacionNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;		
		//this.gridBagConstraintsEvaluacionNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEvaluacionNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEvaluacionNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEvaluacionNomi.gridx = 0;		
			this.gridBagConstraintsEvaluacionNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEvaluacionNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);								
		
		
		/*
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		*/		
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEvaluacionNomi.gridx =0;
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEvaluacionNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
				
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EvaluacionNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEvaluacionNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEvaluacionNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosEvaluacionNomi.setLayout(gridaBagLayoutBusquedasParametrosEvaluacionNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEvaluacionNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEvaluacionNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEvaluacionNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
			
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEvaluacionNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEvaluacionNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEvaluacionNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEvaluacionNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEvaluacionNomi.setName("jPanelReporteDinamicoEvaluacionNomi"); 
		
		this.jPanelReporteDinamicoEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEvaluacionNomi.setLayout(gridaBagLayoutReporteDinamicoEvaluacionNomi);
		
		
		this.jInternalFrameReporteDinamicoEvaluacionNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEvaluacionNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEvaluacionNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEvaluacionNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEvaluacionNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoEvaluacionNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEvaluacionNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteEvaluacionNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jLabelColumnasSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEvaluacionNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEvaluacionNomi=new JScrollPane(this.jListColumnasSelectReporteEvaluacionNomi);
			
			this.jScrollColumnasSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionNomi.add(this.jListColumnasSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jScrollColumnasSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEvaluacionNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteEvaluacionNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jLabelRelacionesSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEvaluacionNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteEvaluacionNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEvaluacionNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEvaluacionNomi=new JScrollPane(this.jListRelacionesSelectReporteEvaluacionNomi);
			
			this.jScrollRelacionesSelectReporteEvaluacionNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEvaluacionNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEvaluacionNomi.add(this.jListRelacionesSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jScrollRelacionesSelectReporteEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEvaluacionNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEvaluacionNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoEvaluacionNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEvaluacionNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEvaluacionNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jLabelGenerarExcelReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi.setToolTipText("Generar EXCEL"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		//this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEvaluacionNomi.add(this.jButtonGenerarExcelReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jComboBoxTiposReportesDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jLabelTiposArchivoReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jComboBoxTiposArchivosReportesDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEvaluacionNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEvaluacionNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEvaluacionNomi.setToolTipText("Generar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jButtonGenerarReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEvaluacionNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEvaluacionNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEvaluacionNomi.setToolTipText("Cancelar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEvaluacionNomi.add(this.jButtonCerrarReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEvaluacionNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEvaluacionNomi= new JScrollPane(jPanelReporteDinamicoEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEvaluacionNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEvaluacionNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEvaluacionNomi);
		this.jInternalFrameReporteDinamicoEvaluacionNomi.getContentPane().add(this.jScrollPanelReporteDinamicoEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEvaluacionNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEvaluacionNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEvaluacionNomi.setName("jPanelImportacionEvaluacionNomi"); 
		
		this.jPanelImportacionEvaluacionNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEvaluacionNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEvaluacionNomi.setLayout(gridaBagLayoutImportacionEvaluacionNomi);
		
		
		this.jInternalFrameImportacionEvaluacionNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEvaluacionNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEvaluacionNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEvaluacionNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEvaluacionNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionNomi.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionNomi.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEvaluacionNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEvaluacionNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEvaluacionNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEvaluacionNomi.setResizable(true);
	    this.jInternalFrameImportacionEvaluacionNomi.setClosable(true);
	    this.jInternalFrameImportacionEvaluacionNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEvaluacionNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEvaluacionNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEvaluacionNomi = new JLabelMe();

		this.jLabelArchivoImportacionEvaluacionNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionNomi.add(this.jLabelArchivoImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEvaluacionNomi = new JFileChooser();		
		this.jFileChooserImportacionEvaluacionNomi.setToolTipText("ESCOGER ARCHIVO"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEvaluacionNomi = new JButtonMe();
		this.jButtonAbrirImportacionEvaluacionNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEvaluacionNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEvaluacionNomi.setToolTipText("Generar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionNomi.add(this.jButtonAbrirImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEvaluacionNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionEvaluacionNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEvaluacionNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEvaluacionNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEvaluacionNomi.add(this.jLabelPathArchivoImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEvaluacionNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEvaluacionNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEvaluacionNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionNomi.add(this.jTextFieldPathArchivoImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEvaluacionNomi = new JButtonMe();
		this.jButtonGenerarImportacionEvaluacionNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEvaluacionNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEvaluacionNomi.setToolTipText("Generar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionNomi.add(this.jButtonGenerarImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEvaluacionNomi = new JButtonMe();
		this.jButtonCerrarImportacionEvaluacionNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEvaluacionNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEvaluacionNomi.setToolTipText("Cancelar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEvaluacionNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsEvaluacionNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEvaluacionNomi.add(this.jButtonCerrarImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEvaluacionNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionEvaluacionNomi= new JScrollPane(jPanelImportacionEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
		this.gridBagConstraintsEvaluacionNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsEvaluacionNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEvaluacionNomi);
		this.jInternalFrameImportacionEvaluacionNomi.getContentPane().add(this.jScrollPanelImportacionEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEvaluacionNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEvaluacionNomi = new JButtonMe();
			this.jButtonAbrirOrderByEvaluacionNomi.setText("Orden");
			this.jButtonAbrirOrderByEvaluacionNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEvaluacionNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEvaluacionNomi";
			inputMap = this.jButtonAbrirOrderByEvaluacionNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEvaluacionNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEvaluacionNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByEvaluacionNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEvaluacionNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEvaluacionNomi.setName("jPanelOrderByEvaluacionNomi"); 
			
			this.jPanelOrderByEvaluacionNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEvaluacionNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEvaluacionNomi.setLayout(gridaBagLayoutOrderByEvaluacionNomi);
			
			
			this.jTableDatosEvaluacionNomiOrderBy = new JTableMe();        
			this.jTableDatosEvaluacionNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEvaluacionNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEvaluacionNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEvaluacionNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEvaluacionNomiOrderBy.setViewportView(this.jTableDatosEvaluacionNomiOrderBy);
			this.jTableDatosEvaluacionNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEvaluacionNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEvaluacionNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEvaluacionNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEvaluacionNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEvaluacionNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEvaluacionNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEvaluacionNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEvaluacionNomi.setTitle("Orden");
			this.jInternalFrameOrderByEvaluacionNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEvaluacionNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEvaluacionNomi.setResizable(true);
			this.jInternalFrameOrderByEvaluacionNomi.setClosable(true);
			this.jInternalFrameOrderByEvaluacionNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEvaluacionNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEvaluacionNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEvaluacionNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Evaluacion Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEvaluacionNomi.ipady =150;
				
			this.jPanelOrderByEvaluacionNomi.add(jScrollPanelDatosEvaluacionNomiOrderBy, this.gridBagConstraintsEvaluacionNomi);//this.jTableDatosEvaluacionNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEvaluacionNomi = new JButtonMe();
			this.jButtonCerrarOrderByEvaluacionNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEvaluacionNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEvaluacionNomi.setToolTipText("Cancelar"+" "+EvaluacionNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEvaluacionNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEvaluacionNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEvaluacionNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEvaluacionNomi.add(this.jButtonCerrarOrderByEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEvaluacionNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByEvaluacionNomi= new JScrollPane(jPanelOrderByEvaluacionNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEvaluacionNomi = new GridBagConstraints();
			this.gridBagConstraintsEvaluacionNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsEvaluacionNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsEvaluacionNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEvaluacionNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEvaluacionNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEvaluacionNomi);
			
			this.jInternalFrameOrderByEvaluacionNomi.getContentPane().add(this.jScrollPanelOrderByEvaluacionNomi, this.gridBagConstraintsEvaluacionNomi);			
		
		} else {
			this.jButtonAbrirOrderByEvaluacionNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.evaluacionnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEvaluacionNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEvaluacionNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEvaluacionNomi.getRowHeight();//EvaluacionNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.isSelected()) {
					iHeightTable=EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEvaluacionNomi.isSelected()) {
					iHeightTable=EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EvaluacionNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEvaluacionNomi!=null && this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEvaluacionNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEvaluacionNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEvaluacionNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEvaluacionNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEvaluacionNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEvaluacionNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=evaluacionnomiLogic.getEvaluacionNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EvaluacionNomi> TraerEvaluacionNomiBeans(List<EvaluacionNomi> evaluacionnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(EvaluacionNomi evaluacionnomi:evaluacionnomis) {
					
				if(!(EvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EvaluacionNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					evaluacionnomi.setsDetalleGeneralEntityReporte(EvaluacionNomiConstantesFunciones.getEvaluacionNomiDescripcion(evaluacionnomi));
										
						
					
					

					if(evaluacionnomi.getDetalleEvaluacionNomis()!=null && Funciones.existeClass(classes,DetalleEvaluacionNomi.class)) {
						try{evaluacionnomi.setdetalleevaluacionnomisDescripcionReporte(new JRBeanCollectionDataSource(DetalleEvaluacionNomiJInternalFrame.TraerDetalleEvaluacionNomiBeans(evaluacionnomi.getDetalleEvaluacionNomis(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//evaluacionnomi.setsDetalleGeneralEntityReporte(evaluacionnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//evaluacionnomibeans.add(evaluacionnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return evaluacionnomis;
    }
	//PARA REPORTES FIN
}
