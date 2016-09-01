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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.nomina.util.AsistenciaMensualConstantesFunciones;

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
public class AsistenciaMensualJInternalFrame extends AsistenciaMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAsistenciaMensual;
	
	protected JMenuBar jmenuBarAsistenciaMensual;
	
	protected JMenu jmenuAsistenciaMensual;
	protected JMenu jmenuDatosAsistenciaMensual;
	protected JMenu jmenuArchivoAsistenciaMensual;
	protected JMenu jmenuAccionesAsistenciaMensual;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsistenciaMensual;	
	protected GridBagConstraints gridBagConstraintsAsistenciaMensual;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AsistenciaMensualDetalleFormJInternalFrame jInternalFrameDetalleFormAsistenciaMensual;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAsistenciaMensual;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAsistenciaMensual;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public AsistenciaMensualSessionBean asistenciamensualSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AsistenciaMensual> asistenciamensuals;		
	public List<AsistenciaMensual> asistenciamensualsEliminados;	
	public List<AsistenciaMensual> asistenciamensualsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAsistenciaMensual;		
	protected JButton jButtonAbrirOrderByAsistenciaMensual;
	
	
	//protected JPanel jPanelOrderByAsistenciaMensual;
	//public JScrollPane jScrollPanelOrderByAsistenciaMensual;	
	//protected JButton jButtonCerrarOrderByAsistenciaMensual;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AsistenciaMensualLogic asistenciamensualLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAsistenciaMensual;
	public JScrollPane jScrollPanelDatosEdicionAsistenciaMensual;
	public JScrollPane jScrollPanelDatosGeneralAsistenciaMensual;
    
	
	
	//public JScrollPane jScrollPanelDatosAsistenciaMensualOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAsistenciaMensual;
	//public JScrollPane jScrollPanelImportacionAsistenciaMensual;
	
	
	
	protected JPanel jPanelAccionesAsistenciaMensual;
	
    protected JPanel jPanelPaginacionAsistenciaMensual;
    protected JPanel jPanelParametrosReportesAsistenciaMensual;
	protected JPanel jPanelParametrosReportesAccionesAsistenciaMensual;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AsistenciaMensual;
	protected JPanel jPanelParametrosAuxiliar2AsistenciaMensual;
	protected JPanel jPanelParametrosAuxiliar3AsistenciaMensual;
	protected JPanel jPanelParametrosAuxiliar4AsistenciaMensual;
	//protected JPanel jPanelParametrosAuxiliar5AsistenciaMensual;
	
	
	
	//protected JPanel jPanelReporteDinamicoAsistenciaMensual;
	//protected JPanel jPanelImportacionAsistenciaMensual;
	
	
	public JTable jTableDatosAsistenciaMensual;
	
	
	
	//public JTable jTableDatosAsistenciaMensualOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAsistenciaMensual;
	protected JButton jButtonDuplicarAsistenciaMensual;
	protected JButton jButtonCopiarAsistenciaMensual;
	protected JButton jButtonVerFormAsistenciaMensual;
	protected JButton jButtonNuevoRelacionesAsistenciaMensual;
	protected JButton jButtonModificarAsistenciaMensual;
	
    protected JButton jButtonGuardarCambiosTablaAsistenciaMensual;
	protected JButton jButtonCerrarAsistenciaMensual;
	
	
	protected JButton jButtonRecargarInformacionAsistenciaMensual;
	protected JButton jButtonProcesarInformacionAsistenciaMensual;
	
	
	protected JButton jButtonAnterioresAsistenciaMensual;
	protected JButton jButtonSiguientesAsistenciaMensual;
	protected JButton jButtonNuevoGuardarCambiosAsistenciaMensual;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAsistenciaMensual;
	//protected JButton jButtonCerrarReporteDinamicoAsistenciaMensual;
	//protected JButton jButtonGenerarExcelReporteDinamicoAsistenciaMensual;	
	
	
	
	//protected JButton jButtonAbrirImportacionAsistenciaMensual;
	//protected JButton jButtonGenerarImportacionAsistenciaMensual;
	//protected JButton jButtonCerrarImportacionAsistenciaMensual;
	//protected JFileChooser jFileChooserImportacionAsistenciaMensual;
	//protected File fileImportacionAsistenciaMensual;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsistenciaMensual;
	protected JButton jButtonDuplicarToolBarAsistenciaMensual;
	protected JButton jButtonNuevoRelacionesToolBarAsistenciaMensual;
	
	
	public JButton jButtonGuardarCambiosToolBarAsistenciaMensual;
	protected JButton jButtonCopiarToolBarAsistenciaMensual;
	protected JButton jButtonVerFormToolBarAsistenciaMensual;
	public JButton jButtonGuardarCambiosTablaToolBarAsistenciaMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarAsistenciaMensual;
	protected JButton jButtonCerrarToolBarAsistenciaMensual;
	
	protected JButton jButtonRecargarInformacionToolBarAsistenciaMensual;
	protected JButton jButtonProcesarInformacionToolBarAsistenciaMensual;
	protected JButton jButtonAnterioresToolBarAsistenciaMensual;
	protected JButton jButtonSiguientesToolBarAsistenciaMensual;
	protected JButton jButtonNuevoGuardarCambiosToolBarAsistenciaMensual;
	protected JButton jButtonAbrirOrderByToolBarAsistenciaMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsistenciaMensual;
	protected JMenuItem jMenuItemDuplicarAsistenciaMensual;
	protected JMenuItem jMenuItemNuevoRelacionesAsistenciaMensual;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAsistenciaMensual;
	protected JMenuItem jMenuItemCopiarAsistenciaMensual;
	protected JMenuItem jMenuItemVerFormAsistenciaMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsistenciaMensual;
	protected JMenuItem jMenuItemCerrarAsistenciaMensual;
	protected JMenuItem jMenuItemDetalleCerrarAsistenciaMensual;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAsistenciaMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsistenciaMensual;
	
	protected JMenuItem jMenuItemRecargarInformacionAsistenciaMensual;
	protected JMenuItem jMenuItemProcesarInformacionAsistenciaMensual;
	protected JMenuItem jMenuItemAnterioresAsistenciaMensual;
	protected JMenuItem jMenuItemSiguientesAsistenciaMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsistenciaMensual;
	protected JMenuItem jMenuItemAbrirOrderByAsistenciaMensual;
	protected JMenuItem jMenuItemMostrarOcultarAsistenciaMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsistenciaMensual;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAsistenciaMensual;
	protected JCheckBox jCheckBoxSeleccionadosAsistenciaMensual;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAsistenciaMensual;
	protected JCheckBox jCheckBoxConGraficoReporteAsistenciaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAsistenciaMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAsistenciaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAsistenciaMensual;
	protected JTextField jTextFieldValorCampoGeneralAsistenciaMensual;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAsistenciaMensual;
	//public JList<Reporte> jListColumnasSelectReporteAsistenciaMensual;
	//public JScrollPane jScrollColumnasSelectReporteAsistenciaMensual;
	
	//public JLabel jLabelRelacionesSelectReporteAsistenciaMensual;
	//public JList<Reporte> jListRelacionesSelectReporteAsistenciaMensual;
	//public JScrollPane jScrollRelacionesSelectReporteAsistenciaMensual;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAsistenciaMensual;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAsistenciaMensual;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAsistenciaMensual;
	//public JLabel jLabelTiposArchivoReporteDinamicoAsistenciaMensual;
	
		
	//public JLabel jLabelArchivoImportacionAsistenciaMensual;	
	//public JLabel jLabelPathArchivoImportacionAsistenciaMensual;
	//protected JTextField jTextFieldPathArchivoImportacionAsistenciaMensual;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAsistenciaMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAsistenciaMensual;
	
	//public JLabel jLabelColumnaCategoriaValorAsistenciaMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAsistenciaMensual;
	
	//public JLabel jLabelColumnasValoresGraficoAsistenciaMensual;
	//public JList<Reporte> jListColumnasValoresGraficoAsistenciaMensual;
	//public JScrollPane jScrollColumnasValoresGraficoAsistenciaMensual;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAsistenciaMensual;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAsistenciaMensual;
	public JPanel jPanelFK_IdAnioAsistenciaMensual;
	public JButton jButtonFK_IdAnioAsistenciaMensual;
	public JPanel jPanelFK_IdCargoAsistenciaMensual;
	public JButton jButtonFK_IdCargoAsistenciaMensual;
	public JPanel jPanelFK_IdEmpleadoAsistenciaMensual;
	public JButton jButtonFK_IdEmpleadoAsistenciaMensual;
	public JPanel jPanelFK_IdEstructuraAsistenciaMensual;
	public JButton jButtonFK_IdEstructuraAsistenciaMensual;
	public JPanel jPanelFK_IdMesAsistenciaMensual;
	public JButton jButtonFK_IdMesAsistenciaMensual;
	
	public JPanel jPanelid_anioFK_IdAnioAsistenciaMensual;
	public JLabel jLabelid_anioFK_IdAnioAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioAsistenciaMensual;
	public JButton jButtonid_anioFK_IdAnioAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioAsistenciaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cargoFK_IdCargoAsistenciaMensual;
	public JLabel jLabelid_cargoFK_IdCargoAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoFK_IdCargoAsistenciaMensual;
	public JButton jButtonid_cargoFK_IdCargoAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoAsistenciaMensualBusqueda= new JButtonMe();
	public JButton jButtonid_cargoFK_IdCargoAsistenciaMensualArbol= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoAsistenciaMensual;
	public JLabel jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual;
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoAsistenciaMensualBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual;
	
	public JPanel jPanelid_estructuraFK_IdEstructuraAsistenciaMensual;
	public JLabel jLabelid_estructuraFK_IdEstructuraAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual;
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaMensualBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraAsistenciaMensualArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesAsistenciaMensual;
	public JLabel jLabelid_mesFK_IdMesAsistenciaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesAsistenciaMensual;
	public JButton jButtonid_mesFK_IdMesAsistenciaMensual= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesAsistenciaMensualUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesAsistenciaMensualBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=447;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AsistenciaMensualJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsistenciaMensualJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAsistenciaMensual)	{
		this.jButtonRecargarInformacionAsistenciaMensual = jButtonRecargarInformacionAsistenciaMensual;
	}
	
	public JButton getjButtonProcesarInformacionAsistenciaMensual() {
		return this.jButtonProcesarInformacionAsistenciaMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsistenciaMensual)	{
		this.jButtonProcesarInformacionAsistenciaMensual = jButtonProcesarInformacionAsistenciaMensual;
	}
	
	
	public JButton getjButtonRecargarInformacionAsistenciaMensual() {
		return this.jButtonRecargarInformacionAsistenciaMensual;
	}
	
	
	public List<AsistenciaMensual> getasistenciamensuals() {
		return this.asistenciamensuals;
	}

	public void setasistenciamensuals(List<AsistenciaMensual> asistenciamensuals) {
		this.asistenciamensuals = asistenciamensuals;
	}
	
	public List<AsistenciaMensual> getasistenciamensualsAux() {
		return this.asistenciamensualsAux;
	}

	public void setasistenciamensualsAux(List<AsistenciaMensual> asistenciamensualsAux) {
		this.asistenciamensualsAux = asistenciamensualsAux;
	}
	
	public List<AsistenciaMensual> getasistenciamensualsEliminados() {
		return this.asistenciamensualsEliminados;
	}

	public void setAsistenciaMensualsEliminados(List<AsistenciaMensual> asistenciamensualsEliminados) {
		this.asistenciamensualsEliminados = asistenciamensualsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAsistenciaMensual() {
		return jComboBoxTiposSeleccionarAsistenciaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAsistenciaMensual(
			JComboBox jComboBoxTiposSeleccionarAsistenciaMensual) {
		this.jComboBoxTiposSeleccionarAsistenciaMensual = jComboBoxTiposSeleccionarAsistenciaMensual;
	}
	
	public void setBorderResaltarTiposSeleccionarAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAsistenciaMensual() {
		return jTextFieldValorCampoGeneralAsistenciaMensual;
	}

	public void setjTextFieldValorCampoGeneralAsistenciaMensual(
			JTextField jTextFieldValorCampoGeneralAsistenciaMensual) {
		this.jTextFieldValorCampoGeneralAsistenciaMensual = jTextFieldValorCampoGeneralAsistenciaMensual;
	}

	public void setBorderResaltarValorCampoGeneralAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAsistenciaMensual .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAsistenciaMensual() {
		return this.jCheckBoxSeleccionarTodosAsistenciaMensual;
	}

	public void setjCheckBoxSeleccionarTodosAsistenciaMensual(
			JCheckBox jCheckBoxSeleccionarTodosAsistenciaMensual) {
		this.jCheckBoxSeleccionarTodosAsistenciaMensual = jCheckBoxSeleccionarTodosAsistenciaMensual;
	}

	public void setBorderResaltarSeleccionarTodosAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAsistenciaMensual() {
		return this.jCheckBoxSeleccionadosAsistenciaMensual;
	}

	public void setjCheckBoxSeleccionadosAsistenciaMensual(
			JCheckBox jCheckBoxSeleccionadosAsistenciaMensual) {
		this.jCheckBoxSeleccionadosAsistenciaMensual = jCheckBoxSeleccionadosAsistenciaMensual;
	}
	
	public void setBorderResaltarSeleccionadosAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAsistenciaMensual() {
		return this.jComboBoxTiposArchivosReportesAsistenciaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAsistenciaMensual(
			JComboBox jComboBoxTiposArchivosReportesAsistenciaMensual) {
		this.jComboBoxTiposArchivosReportesAsistenciaMensual = jComboBoxTiposArchivosReportesAsistenciaMensual;
	}

	public void setBorderResaltarTiposArchivosReportesAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAsistenciaMensual() {
		return this.jComboBoxTiposReportesAsistenciaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAsistenciaMensual(
			JComboBox jComboBoxTiposReportesAsistenciaMensual) {
		this.jComboBoxTiposReportesAsistenciaMensual = jComboBoxTiposReportesAsistenciaMensual;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAsistenciaMensual() {
	//	return jComboBoxTiposReportesDinamicoAsistenciaMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAsistenciaMensual(
	//		JComboBox jComboBoxTiposReportesDinamicoAsistenciaMensual) {
	//	this.jComboBoxTiposReportesDinamicoAsistenciaMensual = jComboBoxTiposReportesDinamicoAsistenciaMensual;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAsistenciaMensual() {
	//	return jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAsistenciaMensual(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual = jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual;
	//}
	
	public void setBorderResaltarTiposReportesAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAsistenciaMensual() {
		return this.jComboBoxTiposGraficosReportesAsistenciaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAsistenciaMensual(
			JComboBox jComboBoxTiposGraficosReportesAsistenciaMensual) {
		this.jComboBoxTiposGraficosReportesAsistenciaMensual = jComboBoxTiposGraficosReportesAsistenciaMensual;
	}
	
	public void setBorderResaltarTiposGraficosReportesAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAsistenciaMensual() {
		return this.jComboBoxTiposPaginacionAsistenciaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAsistenciaMensual(
			JComboBox jComboBoxTiposPaginacionAsistenciaMensual) {
		this.jComboBoxTiposPaginacionAsistenciaMensual = jComboBoxTiposPaginacionAsistenciaMensual;
	}
	
	public void setBorderResaltarTiposPaginacionAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAsistenciaMensual() {
		return this.jComboBoxTiposRelacionesAsistenciaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsistenciaMensual() {
		return this.jComboBoxTiposAccionesAsistenciaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsistenciaMensual(
			JComboBox jComboBoxTiposRelacionesAsistenciaMensual) {
		this.jComboBoxTiposRelacionesAsistenciaMensual = jComboBoxTiposRelacionesAsistenciaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsistenciaMensual(
			JComboBox jComboBoxTiposAccionesAsistenciaMensual) {
		this.jComboBoxTiposAccionesAsistenciaMensual = jComboBoxTiposAccionesAsistenciaMensual;
	}
	
	public void setBorderResaltarTiposRelacionesAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAsistenciaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAsistenciaMensual .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAsistenciaMensual() {
	//	return jCheckBoxConGraficoDinamicoAsistenciaMensual;
	//}

	//public void setjCheckBoxConGraficoDinamicoAsistenciaMensual(
	//		JCheckBox jCheckBoxConGraficoDinamicoAsistenciaMensual) {
	//	this.jCheckBoxConGraficoDinamicoAsistenciaMensual = jCheckBoxConGraficoDinamicoAsistenciaMensual;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAsistenciaMensual() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAsistenciaMensual.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAsistenciaMensual .setBorder(borderResaltar);		
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
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		
		this.asistenciamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asistenciamensualSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsistenciaMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asistencia Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
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
		
		AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AsistenciaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAsistenciaMensual= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"nuevo","nuevo","Nuevo"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"duplicar","duplicar","Duplicar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"copiar","copiar","Copiar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"ver_form","ver_form","Ver"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"recargar","recargar","Recargar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAsistenciaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAsistenciaMensual,this.jTtoolBarAsistenciaMensual,
							"cerrar","cerrar","Salir"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAsistenciaMensual=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAsistenciaMensual;
			
				this.jButtonProcesarInformacionToolBarAsistenciaMensual=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAsistenciaMensual;
				
		//protected JButton jButtonModificarToolBarAsistenciaMensual;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAsistenciaMensual=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAsistenciaMensual=new JMenuMe("General");
		this.jmenuArchivoAsistenciaMensual=new JMenuMe("Archivo");
		this.jmenuAccionesAsistenciaMensual=new JMenuMe("Acciones");
		this.jmenuDatosAsistenciaMensual=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsistenciaMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsistenciaMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsistenciaMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAsistenciaMensual= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAsistenciaMensual.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAsistenciaMensual,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAsistenciaMensual= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAsistenciaMensual.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAsistenciaMensual,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAsistenciaMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsistenciaMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsistenciaMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAsistenciaMensual= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAsistenciaMensual.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAsistenciaMensual,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAsistenciaMensual= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAsistenciaMensual.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAsistenciaMensual,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAsistenciaMensual= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAsistenciaMensual.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAsistenciaMensual,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsistenciaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsistenciaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsistenciaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAsistenciaMensual= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAsistenciaMensual.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAsistenciaMensual,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAsistenciaMensual= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAsistenciaMensual.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAsistenciaMensual,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAsistenciaMensual= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAsistenciaMensual.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAsistenciaMensual,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAsistenciaMensual= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAsistenciaMensual.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAsistenciaMensual,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAsistenciaMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAsistenciaMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAsistenciaMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsistenciaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsistenciaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsistenciaMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAsistenciaMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAsistenciaMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAsistenciaMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsistenciaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsistenciaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsistenciaMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAsistenciaMensual= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAsistenciaMensual.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAsistenciaMensual,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAsistenciaMensual.add(this.jMenuItemCerrarAsistenciaMensual);
			
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemNuevoAsistenciaMensual);
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemNuevoGuardarCambiosAsistenciaMensual);
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemNuevoRelacionesAsistenciaMensual);
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemGuardarCambiosTablaAsistenciaMensual);		
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemDuplicarAsistenciaMensual);		
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemCopiarAsistenciaMensual);		
			this.jmenuAccionesAsistenciaMensual.add(this.jMenuItemVerFormAsistenciaMensual);		
			
			this.jmenuDatosAsistenciaMensual.add(this.jMenuItemRecargarInformacionAsistenciaMensual);				
			this.jmenuDatosAsistenciaMensual.add(this.jMenuItemAnterioresAsistenciaMensual);				
			this.jmenuDatosAsistenciaMensual.add(this.jMenuItemSiguientesAsistenciaMensual);				
			this.jmenuDatosAsistenciaMensual.add(this.jMenuItemAbrirOrderByAsistenciaMensual);				
			this.jmenuDatosAsistenciaMensual.add(this.jMenuItemMostrarOcultarAsistenciaMensual);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAsistenciaMensual.add(this.jMenuItemGuardarCambiosAsistenciaMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAsistenciaMensual.add(this.jmenuArchivoAsistenciaMensual);		
			this.jmenuBarAsistenciaMensual.add(this.jmenuAccionesAsistenciaMensual);		
			this.jmenuBarAsistenciaMensual.add(this.jmenuDatosAsistenciaMensual);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAsistenciaMensual);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAsistenciaMensual() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioAsistenciaMensual.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioAsistenciaMensual= new JButtonMe();
		this.jButtonFK_IdAnioAsistenciaMensual.setText("Buscar");
		this.jButtonFK_IdAnioAsistenciaMensual.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioAsistenciaMensual,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioAsistenciaMensual = new JLabelMe();
		jLabelid_anioFK_IdAnioAsistenciaMensual.setText("Anio :");
		jLabelid_anioFK_IdAnioAsistenciaMensual.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCargoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCargoAsistenciaMensual.setToolTipText("Buscar Por Cargo ");
		this.jButtonFK_IdCargoAsistenciaMensual= new JButtonMe();
		this.jButtonFK_IdCargoAsistenciaMensual.setText("Buscar");
		this.jButtonFK_IdCargoAsistenciaMensual.setToolTipText("Buscar Por Cargo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCargoAsistenciaMensual,"buscar_button","Buscar Por Cargo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCargoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cargoFK_IdCargoAsistenciaMensual = new JLabelMe();
		jLabelid_cargoFK_IdCargoAsistenciaMensual.setText("Cargo :");
		jLabelid_cargoFK_IdCargoAsistenciaMensual.setToolTipText("Cargo");
		jLabelid_cargoFK_IdCargoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cargoFK_IdCargoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cargoFK_IdCargoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cargoFK_IdCargoAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoFK_IdCargoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoFK_IdCargoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoAsistenciaMensual.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoAsistenciaMensual= new JButtonMe();
		this.jButtonFK_IdEmpleadoAsistenciaMensual.setText("Buscar");
		this.jButtonFK_IdEmpleadoAsistenciaMensual.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoAsistenciaMensual,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual.setFocusable(false);

		this.jPanelFK_IdEstructuraAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraAsistenciaMensual.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraAsistenciaMensual= new JButtonMe();
		this.jButtonFK_IdEstructuraAsistenciaMensual.setText("Buscar");
		this.jButtonFK_IdEstructuraAsistenciaMensual.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraAsistenciaMensual,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesAsistenciaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesAsistenciaMensual.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesAsistenciaMensual= new JButtonMe();
		this.jButtonFK_IdMesAsistenciaMensual.setText("Buscar");
		this.jButtonFK_IdMesAsistenciaMensual.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesAsistenciaMensual,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesAsistenciaMensual = new JLabelMe();
		jLabelid_mesFK_IdMesAsistenciaMensual.setText("Mes :");
		jLabelid_mesFK_IdMesAsistenciaMensual.setToolTipText("Mes");
		jLabelid_mesFK_IdMesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesAsistenciaMensual= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAsistenciaMensual=new JTabbedPane();


		this.jTabbedPaneBusquedasAsistenciaMensual.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaMensual.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAsistenciaMensual.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAsistenciaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAsistenciaMensual = new AsistenciaMensualDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Asistencia Mensual DATOS");
			this.jInternalFrameDetalleFormAsistenciaMensual = new AsistenciaMensualDetalleFormJInternalFrame(jDesktopPane,this.asistenciamensualSessionBean.getConGuardarRelaciones(),this.asistenciamensualSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAsistenciaMensual = null;//new AsistenciaMensualDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsistenciaMensual= new GridBagLayout();
		
		
		this.jTableDatosAsistenciaMensual = new JTableMe();      
		
		String sToolTipAsistenciaMensual="";
		sToolTipAsistenciaMensual=AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsistenciaMensual+="(Nomina.AsistenciaMensual)";
		}
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsistenciaMensual+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAsistenciaMensual.setToolTipText(sToolTipAsistenciaMensual);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAsistenciaMensual);
		this.jTableDatosAsistenciaMensual.setAutoCreateRowSorter(true);
		this.jTableDatosAsistenciaMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAsistenciaMensual.setRowSelectionAllowed(true);
		this.jTableDatosAsistenciaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAsistenciaMensual,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAsistenciaMensual = new JButtonMe();
		this.jButtonDuplicarAsistenciaMensual = new JButtonMe();
		this.jButtonCopiarAsistenciaMensual = new JButtonMe();
		this.jButtonVerFormAsistenciaMensual = new JButtonMe();
		this.jButtonNuevoRelacionesAsistenciaMensual = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual = new JButtonMe();
		this.jButtonCerrarAsistenciaMensual = new JButtonMe();
		
		this.jScrollPanelDatosAsistenciaMensual = new JScrollPane();   
        this.jScrollPanelDatosGeneralAsistenciaMensual = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Asistencia Mensual";
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosAsistenciaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsistenciaMensual.setToolTipText("Acciones");
        this.jPanelAccionesAsistenciaMensual.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAsistenciaMensual=new ReporteDinamicoJInternalFrame(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAsistenciaMensual();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAsistenciaMensual=new ImportacionJInternalFrame(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAsistenciaMensual();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAsistenciaMensual = new JButtonMe();
		
		this.jButtonAbrirOrderByAsistenciaMensual.setText("Orden");
		this.jButtonAbrirOrderByAsistenciaMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaMensual,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaMensual,false,this);
			
			//this.cargarOrderByAsistenciaMensual(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAsistenciaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaMensual,true,this);
			
			//this.cargarOrderByAsistenciaMensual(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAsistenciaMensual.setMinimumSize(new Dimension(400,50));//2430
		this.jTableDatosAsistenciaMensual.setMaximumSize(new Dimension(400,50));//2430
		this.jTableDatosAsistenciaMensual.setPreferredSize(new Dimension(400,50));//2430
		
		this.jScrollPanelDatosAsistenciaMensual.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaMensual.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAsistenciaMensual.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAsistenciaMensual.setText("Nuevo");
		this.jButtonDuplicarAsistenciaMensual.setText("Duplicar");
		this.jButtonCopiarAsistenciaMensual.setText("Copiar");
		this.jButtonVerFormAsistenciaMensual.setText("Ver");
		this.jButtonNuevoRelacionesAsistenciaMensual.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.setText("Guardar");
		this.jButtonCerrarAsistenciaMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsistenciaMensual,"nuevo_button","Nuevo",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAsistenciaMensual,"duplicar_button","Duplicar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAsistenciaMensual,"copiar_button","Copiar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAsistenciaMensual,"ver_form","Ver",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAsistenciaMensual,"nuevorelaciones_button","Nuevo Rel",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsistenciaMensual,"guardarcambiostabla_button","Guardar",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsistenciaMensual,"cerrar_button","Salir",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAsistenciaMensual.setToolTipText("Nuevo"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAsistenciaMensual.setToolTipText("Duplicar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAsistenciaMensual.setToolTipText("Copiar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAsistenciaMensual.setToolTipText("Ver"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAsistenciaMensual.setToolTipText("Nuevo Rel"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.setToolTipText("Guardar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsistenciaMensual.setToolTipText("Salir"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsistenciaMensual";
		inputMap = this.jButtonNuevoAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsistenciaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsistenciaMensual"));
		
		//DUPLICAR
		sMapKey = "DuplicarAsistenciaMensual";
		inputMap = this.jButtonDuplicarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAsistenciaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAsistenciaMensual"));
		
		//COPIAR
		sMapKey = "CopiarAsistenciaMensual";
		inputMap = this.jButtonCopiarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAsistenciaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAsistenciaMensual"));
		
		//VEr FORM
		sMapKey = "VerFormAsistenciaMensual";
		inputMap = this.jButtonVerFormAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAsistenciaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAsistenciaMensual"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAsistenciaMensual";
		inputMap = this.jButtonNuevoRelacionesAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAsistenciaMensual"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAsistenciaMensual";
		inputMap = this.jButtonModificarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAsistenciaMensual"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAsistenciaMensual";
		inputMap = this.jButtonCerrarAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsistenciaMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsistenciaMensual";
		inputMap = this.jButtonGuardarCambiosTablaAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsistenciaMensual"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAsistenciaMensual.setName("jPanelParametrosReportesAsistenciaMensual"); 
		
		this.jPanelParametrosReportesAccionesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAsistenciaMensual.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAsistenciaMensual.setName("jPanelParametrosReportesAccionesAsistenciaMensual"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAsistenciaMensual = new JButtonMe();
		this.jButtonRecargarInformacionAsistenciaMensual.setText("Recargar");
		this.jButtonRecargarInformacionAsistenciaMensual.setToolTipText("Recargar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAsistenciaMensual,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAsistenciaMensual = new JButtonMe();
		this.jButtonProcesarInformacionAsistenciaMensual.setText("Procesar");
		this.jButtonProcesarInformacionAsistenciaMensual.setToolTipText("Procesar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAsistenciaMensual.setVisible(false);
			
		this.jButtonProcesarInformacionAsistenciaMensual.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaMensual.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAsistenciaMensual.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaMensual.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAsistenciaMensual.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaMensual.setText("TIPO");       
		this.jComboBoxTiposReportesAsistenciaMensual.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAsistenciaMensual.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAsistenciaMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAsistenciaMensual.setText("Paginacion");
		this.jComboBoxTiposPaginacionAsistenciaMensual.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAsistenciaMensual.setText("Accion");
		this.jComboBoxTiposRelacionesAsistenciaMensual.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsistenciaMensual.setText("Accion");
		this.jComboBoxTiposAccionesAsistenciaMensual.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAsistenciaMensual.setText("Accion");
		this.jComboBoxTiposSeleccionarAsistenciaMensual.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAsistenciaMensual=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAsistenciaMensual.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaMensual.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAsistenciaMensual.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAsistenciaMensual = new JLabelMe();
		
		this.jLabelAccionesAsistenciaMensual.setText("Acciones");		
		this.jLabelAccionesAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAsistenciaMensual.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAsistenciaMensual.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAsistenciaMensual = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAsistenciaMensual.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAsistenciaMensual.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAsistenciaMensual = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAsistenciaMensual.setText("Graf.");
		this.jCheckBoxConGraficoReporteAsistenciaMensual.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAsistenciaMensual = new JButtonMe();
		//this.jButtonAnterioresAsistenciaMensual.setText("<<");
        this.jButtonAnterioresAsistenciaMensual.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAsistenciaMensual,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAsistenciaMensual = new JButtonMe();
		//this.jButtonSiguientesAsistenciaMensual.setText(">>");
        this.jButtonSiguientesAsistenciaMensual.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAsistenciaMensual,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAsistenciaMensual = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAsistenciaMensual.setText("Nue");
        this.jButtonNuevoGuardarCambiosAsistenciaMensual.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAsistenciaMensual,"nuevoguardarcambios_button","Nue",this.asistenciamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAsistenciaMensual";
		inputMap = this.jButtonNuevoGuardarCambiosAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAsistenciaMensual"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAsistenciaMensual";
		inputMap = this.jButtonRecargarInformacionAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAsistenciaMensual"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAsistenciaMensual";
		inputMap = this.jButtonSiguientesAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAsistenciaMensual"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAsistenciaMensual";
		inputMap = this.jButtonAnterioresAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAsistenciaMensual"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAsistenciaMensual();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAsistenciaMensual.setMinimumSize(new Dimension(this.getWidth(),AsistenciaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaMensual.setMaximumSize(new Dimension(this.getWidth(),AsistenciaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAsistenciaMensual.setPreferredSize(new Dimension(this.getWidth(),AsistenciaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AsistenciaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAsistenciaMensual = new GridBagLayout();

			this.jPanelPaginacionAsistenciaMensual.setLayout(gridaBagLayoutPaginacionAsistenciaMensual);						
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 0;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonAnterioresAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					
						
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaMensual.gridy = 0;
			
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonNuevoGuardarCambiosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
						
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAsistenciaMensual.gridy = 0;
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonSiguientesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 1;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonNuevoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
						
			
			
			if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAsistenciaMensual.gridy = 1;
				this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAsistenciaMensual.add(this.jButtonGuardarCambiosTablaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			}
			
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 1;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonDuplicarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 1;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonCopiarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 1;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonVerFormAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 1;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAsistenciaMensual.add(this.jButtonCerrarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		
		this.jButtonRecargarInformacionAsistenciaMensual.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaMensual.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAsistenciaMensual.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAsistenciaMensual.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaMensual.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAsistenciaMensual.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAsistenciaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAsistenciaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAsistenciaMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAsistenciaMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAsistenciaMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAsistenciaMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAsistenciaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAsistenciaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAsistenciaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsistenciaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAsistenciaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAsistenciaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAsistenciaMensual.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaMensual.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAsistenciaMensual.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAsistenciaMensual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaMensual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAsistenciaMensual.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAsistenciaMensual.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaMensual.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAsistenciaMensual.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAsistenciaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAsistenciaMensual = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AsistenciaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AsistenciaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AsistenciaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AsistenciaMensual = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAsistenciaMensual.setLayout(gridaBagParametrosReportesAsistenciaMensual);
			this.jPanelParametrosReportesAccionesAsistenciaMensual.setLayout(gridaBagParametrosReportesAccionesAsistenciaMensual);
			
			
			this.jPanelParametrosAuxiliar1AsistenciaMensual.setLayout(gridaBagParametrosAuxiliar1AsistenciaMensual);
			this.jPanelParametrosAuxiliar2AsistenciaMensual.setLayout(gridaBagParametrosAuxiliar2AsistenciaMensual);
			this.jPanelParametrosAuxiliar3AsistenciaMensual.setLayout(gridaBagParametrosAuxiliar3AsistenciaMensual);
			this.jPanelParametrosAuxiliar4AsistenciaMensual.setLayout(gridaBagParametrosAuxiliar4AsistenciaMensual);
			//this.jPanelParametrosAuxiliar5AsistenciaMensual.setLayout(gridaBagParametrosAuxiliar2AsistenciaMensual);			
			
			
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jButtonRecargarInformacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaMensual.add(this.jComboBoxTiposPaginacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaMensual.add(this.jCheckBoxConAltoMaximoTablaAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AsistenciaMensual.add(this.jComboBoxTiposArchivosReportesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jPanelParametrosAuxiliar1AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AsistenciaMensual.add(this.jComboBoxTiposReportesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);																		
			
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AsistenciaMensual.add(this.jComboBoxTiposGraficosReportesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jPanelParametrosAuxiliar4AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jComboBoxTiposReportesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jCheckBoxGenerarReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jPanelParametrosAuxiliar2AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jLabelAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
				this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAsistenciaMensual.add(this.jButtonAbrirOrderByAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jComboBoxTiposSeleccionarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			
			
			/*
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jCheckBoxSeleccionarTodosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jCheckBoxConGraficoReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaMensual.add(this.jCheckBoxSeleccionarTodosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);															
				
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaMensual.add(this.jCheckBoxSeleccionadosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);															
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAsistenciaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AsistenciaMensual.add(this.jCheckBoxConGraficoReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jPanelParametrosAuxiliar3AsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jComboBoxTiposAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
	
				
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAsistenciaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAsistenciaMensual.add(this.jTextFieldValorCampoGeneralAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAsistenciaMensual = new GridBagLayout();

			this.jScrollPanelDatosAsistenciaMensual.setLayout(gridaBagLayoutDatosAsistenciaMensual);
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = 0;
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;
			
			this.jScrollPanelDatosAsistenciaMensual.add(this.jTableDatosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAsistenciaMensual.setViewportView(this.jTableDatosAsistenciaMensual);
		this.jTableDatosAsistenciaMensual.setFillsViewportHeight(true);
		this.jTableDatosAsistenciaMensual.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAsistenciaMensual= new GridBagLayout();
		this.jPanelAccionesAsistenciaMensual.setLayout(gridaBagLayoutAccionesAsistenciaMensual);
		
		
		/*	
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = 0;
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
			
		this.jPanelAccionesAsistenciaMensual.add(this.jButtonNuevoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioAsistenciaMensual= new GridBagLayout();
		gridaBagLayoutFK_IdAnioAsistenciaMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioAsistenciaMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioAsistenciaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioAsistenciaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioAsistenciaMensual.setLayout(gridaBagLayoutFK_IdAnioAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdAnioAsistenciaMensual.add(jLabelid_anioFK_IdAnioAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 1;
		jPanelFK_IdAnioAsistenciaMensual.add(jComboBoxid_anioFK_IdAnioAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 1;
		gridBagConstraintsAsistenciaMensual.gridx =1;
		jPanelFK_IdAnioAsistenciaMensual.add(jButtonFK_IdAnioAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		jTabbedPaneBusquedasAsistenciaMensual.addTab("1.-Por Anio ", jPanelFK_IdAnioAsistenciaMensual);
		jTabbedPaneBusquedasAsistenciaMensual.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCargoAsistenciaMensual= new GridBagLayout();
		gridaBagLayoutFK_IdCargoAsistenciaMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCargoAsistenciaMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCargoAsistenciaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCargoAsistenciaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCargoAsistenciaMensual.setLayout(gridaBagLayoutFK_IdCargoAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdCargoAsistenciaMensual.add(jLabelid_cargoFK_IdCargoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 1;
		jPanelFK_IdCargoAsistenciaMensual.add(jComboBoxid_cargoFK_IdCargoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 1;
		gridBagConstraintsAsistenciaMensual.gridx =1;
		jPanelFK_IdCargoAsistenciaMensual.add(jButtonFK_IdCargoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		jTabbedPaneBusquedasAsistenciaMensual.addTab("2.-Por Cargo ", jPanelFK_IdCargoAsistenciaMensual);
		jTabbedPaneBusquedasAsistenciaMensual.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoAsistenciaMensual= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoAsistenciaMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoAsistenciaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoAsistenciaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoAsistenciaMensual.setLayout(gridaBagLayoutFK_IdEmpleadoAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdEmpleadoAsistenciaMensual.add(jLabelid_empleadoFK_IdEmpleadoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 1;
		jPanelFK_IdEmpleadoAsistenciaMensual.add(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);


		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.NONE;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdEmpleadoAsistenciaMensual.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 1;
		gridBagConstraintsAsistenciaMensual.gridx =1;
		jPanelFK_IdEmpleadoAsistenciaMensual.add(jButtonFK_IdEmpleadoAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		jTabbedPaneBusquedasAsistenciaMensual.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoAsistenciaMensual);
		jTabbedPaneBusquedasAsistenciaMensual.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstructuraAsistenciaMensual= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraAsistenciaMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraAsistenciaMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraAsistenciaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraAsistenciaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraAsistenciaMensual.setLayout(gridaBagLayoutFK_IdEstructuraAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdEstructuraAsistenciaMensual.add(jLabelid_estructuraFK_IdEstructuraAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 1;
		jPanelFK_IdEstructuraAsistenciaMensual.add(jComboBoxid_estructuraFK_IdEstructuraAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 1;
		gridBagConstraintsAsistenciaMensual.gridx =1;
		jPanelFK_IdEstructuraAsistenciaMensual.add(jButtonFK_IdEstructuraAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		jTabbedPaneBusquedasAsistenciaMensual.addTab("4.-Por Estructura ", jPanelFK_IdEstructuraAsistenciaMensual);
		jTabbedPaneBusquedasAsistenciaMensual.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdMesAsistenciaMensual= new GridBagLayout();
		gridaBagLayoutFK_IdMesAsistenciaMensual.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesAsistenciaMensual.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesAsistenciaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesAsistenciaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesAsistenciaMensual.setLayout(gridaBagLayoutFK_IdMesAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 0;
		jPanelFK_IdMesAsistenciaMensual.add(jLabelid_mesFK_IdMesAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 0;
		gridBagConstraintsAsistenciaMensual.gridx = 1;
		jPanelFK_IdMesAsistenciaMensual.add(jComboBoxid_mesFK_IdMesAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAsistenciaMensual.gridy = 1;
		gridBagConstraintsAsistenciaMensual.gridx =1;
		jPanelFK_IdMesAsistenciaMensual.add(jButtonFK_IdMesAsistenciaMensual, gridBagConstraintsAsistenciaMensual);

		jTabbedPaneBusquedasAsistenciaMensual.addTab("5.-Por Mes ", jPanelFK_IdMesAsistenciaMensual);
		jTabbedPaneBusquedasAsistenciaMensual.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsistenciaMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsistenciaMensual);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();						
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;		
			//this.gridBagConstraintsAsistenciaMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsistenciaMensual.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;		
		//this.gridBagConstraintsAsistenciaMensual.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAsistenciaMensual.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAsistenciaMensual);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsistenciaMensual.gridx = 0;		
			this.gridBagConstraintsAsistenciaMensual.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAsistenciaMensual.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);								
		
		
		/*
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		*/		
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsistenciaMensual.gridx =0;
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsistenciaMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
				
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AsistenciaMensualJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAsistenciaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsistenciaMensual = new GridBagLayout();
			this.jPanelBusquedasParametrosAsistenciaMensual.setLayout(gridaBagLayoutBusquedasParametrosAsistenciaMensual);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAsistenciaMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsistenciaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsistenciaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
			
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsistenciaMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAsistenciaMensual;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAsistenciaMensual() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAsistenciaMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAsistenciaMensual.setName("jPanelReporteDinamicoAsistenciaMensual"); 
		
		this.jPanelReporteDinamicoAsistenciaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAsistenciaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAsistenciaMensual.setLayout(gridaBagLayoutReporteDinamicoAsistenciaMensual);
		
		
		this.jInternalFrameReporteDinamicoAsistenciaMensual= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAsistenciaMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAsistenciaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAsistenciaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAsistenciaMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAsistenciaMensual.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAsistenciaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAsistenciaMensual.setResizable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaMensual.setClosable(true);
	    this.jInternalFrameReporteDinamicoAsistenciaMensual.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAsistenciaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAsistenciaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAsistenciaMensual = new JLabelMe();

		this.jLabelColumnasSelectReporteAsistenciaMensual.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelColumnasSelectReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAsistenciaMensual = new JList<Reporte>();
		this.jListColumnasSelectReporteAsistenciaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAsistenciaMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAsistenciaMensual=new JScrollPane(this.jListColumnasSelectReporteAsistenciaMensual);
			
			this.jScrollColumnasSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAsistenciaMensual.add(this.jListColumnasSelectReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jScrollColumnasSelectReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAsistenciaMensual = new JLabelMe();

		this.jLabelRelacionesSelectReporteAsistenciaMensual.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAsistenciaMensual = new JList<Reporte>();
		this.jListRelacionesSelectReporteAsistenciaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAsistenciaMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAsistenciaMensual=new JScrollPane(this.jListRelacionesSelectReporteAsistenciaMensual);
			
			this.jScrollRelacionesSelectReporteAsistenciaMensual.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaMensual.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAsistenciaMensual.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAsistenciaMensual = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual = new JComboBoxMe();
		this.jListColumnasValoresGraficoAsistenciaMensual = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAsistenciaMensual = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAsistenciaMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAsistenciaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAsistenciaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAsistenciaMensual = new JLabelMe();

		this.jLabelConGraficoDinamicoAsistenciaMensual.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelConGraficoDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAsistenciaMensual = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAsistenciaMensual.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAsistenciaMensual.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAsistenciaMensual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaMensual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAsistenciaMensual.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jCheckBoxConGraficoDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAsistenciaMensual = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAsistenciaMensual.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelColumnaCategoriaGraficoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAsistenciaMensual = new JLabelMe();

		this.jLabelColumnaCategoriaValorAsistenciaMensual.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelColumnaCategoriaValorAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAsistenciaMensual.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAsistenciaMensual.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAsistenciaMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAsistenciaMensual.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jComboBoxColumnaCategoriaValorAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAsistenciaMensual = new JLabelMe();

		this.jLabelColumnasValoresGraficoAsistenciaMensual.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelColumnasValoresGraficoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAsistenciaMensual = new JList<Reporte>();
		this.jListColumnasValoresGraficoAsistenciaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAsistenciaMensual.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAsistenciaMensual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaMensual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAsistenciaMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAsistenciaMensual=new JScrollPane(this.jListColumnasValoresGraficoAsistenciaMensual);
			
			this.jScrollColumnasValoresGraficoAsistenciaMensual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaMensual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAsistenciaMensual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAsistenciaMensual.add(this.jListColumnasSelectReporteAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jScrollColumnasValoresGraficoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelTiposGraficosReportesDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAsistenciaMensual.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jComboBoxTiposGraficosReportesDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelGenerarExcelReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual.setToolTipText("Generar EXCEL"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		//this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAsistenciaMensual.add(this.jButtonGenerarExcelReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jComboBoxTiposReportesDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jLabelTiposArchivoReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jComboBoxTiposArchivosReportesDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAsistenciaMensual = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAsistenciaMensual.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAsistenciaMensual,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAsistenciaMensual.setToolTipText("Generar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jButtonGenerarReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAsistenciaMensual = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAsistenciaMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAsistenciaMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAsistenciaMensual.setToolTipText("Cancelar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAsistenciaMensual.add(this.jButtonCerrarReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAsistenciaMensual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAsistenciaMensual= new JScrollPane(jPanelReporteDinamicoAsistenciaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAsistenciaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAsistenciaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAsistenciaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAsistenciaMensual.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAsistenciaMensual);
		this.jInternalFrameReporteDinamicoAsistenciaMensual.getContentPane().add(this.jScrollPanelReporteDinamicoAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAsistenciaMensual() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAsistenciaMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAsistenciaMensual.setName("jPanelImportacionAsistenciaMensual"); 
		
		this.jPanelImportacionAsistenciaMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAsistenciaMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAsistenciaMensual.setLayout(gridaBagLayoutImportacionAsistenciaMensual);
		
		
		this.jInternalFrameImportacionAsistenciaMensual= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAsistenciaMensual= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAsistenciaMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAsistenciaMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAsistenciaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAsistenciaMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaMensual.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaMensual.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaMensual.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAsistenciaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAsistenciaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAsistenciaMensual.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAsistenciaMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAsistenciaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAsistenciaMensual.setResizable(true);
	    this.jInternalFrameImportacionAsistenciaMensual.setClosable(true);
	    this.jInternalFrameImportacionAsistenciaMensual.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAsistenciaMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAsistenciaMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAsistenciaMensual = new JLabelMe();

		this.jLabelArchivoImportacionAsistenciaMensual.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaMensual.add(this.jLabelArchivoImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAsistenciaMensual = new JFileChooser();		
		this.jFileChooserImportacionAsistenciaMensual.setToolTipText("ESCOGER ARCHIVO"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAsistenciaMensual = new JButtonMe();
		this.jButtonAbrirImportacionAsistenciaMensual.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAsistenciaMensual,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAsistenciaMensual.setToolTipText("Generar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaMensual.add(this.jButtonAbrirImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAsistenciaMensual = new JLabelMe();

		this.jLabelPathArchivoImportacionAsistenciaMensual.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAsistenciaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAsistenciaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAsistenciaMensual.add(this.jLabelPathArchivoImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAsistenciaMensual=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAsistenciaMensual.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaMensual.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAsistenciaMensual.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaMensual.add(this.jTextFieldPathArchivoImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAsistenciaMensual = new JButtonMe();
		this.jButtonGenerarImportacionAsistenciaMensual.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAsistenciaMensual,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAsistenciaMensual.setToolTipText("Generar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaMensual.add(this.jButtonGenerarImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAsistenciaMensual = new JButtonMe();
		this.jButtonCerrarImportacionAsistenciaMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAsistenciaMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAsistenciaMensual.setToolTipText("Cancelar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsistenciaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsAsistenciaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAsistenciaMensual.add(this.jButtonCerrarImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAsistenciaMensual = new GridBagLayout();
		
		this.jScrollPanelImportacionAsistenciaMensual= new JScrollPane(jPanelImportacionAsistenciaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
		this.gridBagConstraintsAsistenciaMensual.gridy =iPosYImportacion;
		this.gridBagConstraintsAsistenciaMensual.gridx =iPosXImportacion;
		this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAsistenciaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAsistenciaMensual.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAsistenciaMensual);
		this.jInternalFrameImportacionAsistenciaMensual.getContentPane().add(this.jScrollPanelImportacionAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAsistenciaMensual(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAsistenciaMensual = new JButtonMe();
			this.jButtonAbrirOrderByAsistenciaMensual.setText("Orden");
			this.jButtonAbrirOrderByAsistenciaMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAsistenciaMensual,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAsistenciaMensual";
			inputMap = this.jButtonAbrirOrderByAsistenciaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAsistenciaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAsistenciaMensual"));
		
		
			GridBagLayout gridaBagLayoutOrderByAsistenciaMensual = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAsistenciaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAsistenciaMensual.setName("jPanelOrderByAsistenciaMensual"); 
			
			this.jPanelOrderByAsistenciaMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAsistenciaMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAsistenciaMensual.setLayout(gridaBagLayoutOrderByAsistenciaMensual);
			
			
			this.jTableDatosAsistenciaMensualOrderBy = new JTableMe();        
			this.jTableDatosAsistenciaMensualOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAsistenciaMensualOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAsistenciaMensualOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAsistenciaMensualOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAsistenciaMensualOrderBy.setViewportView(this.jTableDatosAsistenciaMensualOrderBy);
			this.jTableDatosAsistenciaMensualOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAsistenciaMensualOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAsistenciaMensual= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAsistenciaMensual= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAsistenciaMensual = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAsistenciaMensual= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAsistenciaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAsistenciaMensual.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAsistenciaMensual.setTitle("Orden");
			this.jInternalFrameOrderByAsistenciaMensual.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAsistenciaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAsistenciaMensual.setResizable(true);
			this.jInternalFrameOrderByAsistenciaMensual.setClosable(true);
			this.jInternalFrameOrderByAsistenciaMensual.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAsistenciaMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAsistenciaMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAsistenciaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asistencia Mensuales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAsistenciaMensual.ipady =150;
				
			this.jPanelOrderByAsistenciaMensual.add(jScrollPanelDatosAsistenciaMensualOrderBy, this.gridBagConstraintsAsistenciaMensual);//this.jTableDatosAsistenciaMensualTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAsistenciaMensual = new JButtonMe();
			this.jButtonCerrarOrderByAsistenciaMensual.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAsistenciaMensual,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAsistenciaMensual.setToolTipText("Cancelar"+" "+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAsistenciaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsistenciaMensual.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAsistenciaMensual.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAsistenciaMensual.add(this.jButtonCerrarOrderByAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAsistenciaMensual = new GridBagLayout();
			
			this.jScrollPanelOrderByAsistenciaMensual= new JScrollPane(jPanelOrderByAsistenciaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAsistenciaMensual = new GridBagConstraints();
			this.gridBagConstraintsAsistenciaMensual.gridy =iPosYOrderBy;
			this.gridBagConstraintsAsistenciaMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsAsistenciaMensual.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAsistenciaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAsistenciaMensual.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAsistenciaMensual);
			
			this.jInternalFrameOrderByAsistenciaMensual.getContentPane().add(this.jScrollPanelOrderByAsistenciaMensual, this.gridBagConstraintsAsistenciaMensual);			
		
		} else {
			this.jButtonAbrirOrderByAsistenciaMensual = new JButtonMe();
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
		int iWidthTableCalculado=0;//4830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.asistenciamensualSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAsistenciaMensual.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAsistenciaMensual.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAsistenciaMensual.getRowHeight();//AsistenciaMensualConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.isSelected()) {
					iHeightTable=AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAsistenciaMensual.isSelected()) {
					iHeightTable=AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AsistenciaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAsistenciaMensual.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaMensual.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAsistenciaMensual.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAsistenciaMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAsistenciaMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAsistenciaMensual!=null && this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy()!=null) {
			//if(!this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAsistenciaMensual.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAsistenciaMensual.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAsistenciaMensual.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAsistenciaMensual.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAsistenciaMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAsistenciaMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=asistenciamensualLogic.getAsistenciaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciamensuals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AsistenciaMensual> TraerAsistenciaMensualBeans(List<AsistenciaMensual> asistenciamensuals,ArrayList<Classe> classes)throws Exception {
		try {
			for(AsistenciaMensual asistenciamensual:asistenciamensuals) {
					
				if(!(AsistenciaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AsistenciaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					asistenciamensual.setsDetalleGeneralEntityReporte(AsistenciaMensualConstantesFunciones.getAsistenciaMensualDescripcion(asistenciamensual));
										
						
					
						
					
				} else  {
							
					//asistenciamensual.setsDetalleGeneralEntityReporte(asistenciamensual.getsDetalleGeneralEntityReporte());
										
				}
				
				//asistenciamensualbeans.add(asistenciamensualbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return asistenciamensuals;
    }
	//PARA REPORTES FIN
}
