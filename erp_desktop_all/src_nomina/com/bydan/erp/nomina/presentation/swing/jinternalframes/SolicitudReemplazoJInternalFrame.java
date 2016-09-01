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
import com.bydan.erp.nomina.util.SolicitudReemplazoConstantesFunciones;

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
public class SolicitudReemplazoJInternalFrame extends SolicitudReemplazoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSolicitudReemplazo;
	
	protected JMenuBar jmenuBarSolicitudReemplazo;
	
	protected JMenu jmenuSolicitudReemplazo;
	protected JMenu jmenuDatosSolicitudReemplazo;
	protected JMenu jmenuArchivoSolicitudReemplazo;
	protected JMenu jmenuAccionesSolicitudReemplazo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudReemplazo;	
	protected GridBagConstraints gridBagConstraintsSolicitudReemplazo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SolicitudReemplazoDetalleFormJInternalFrame jInternalFrameDetalleFormSolicitudReemplazo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSolicitudReemplazo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSolicitudReemplazo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoreemplazo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";
	
	public SolicitudReemplazoSessionBean solicitudreemplazoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadoreemplazoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SolicitudReemplazo> solicitudreemplazos;		
	public List<SolicitudReemplazo> solicitudreemplazosEliminados;	
	public List<SolicitudReemplazo> solicitudreemplazosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySolicitudReemplazo;		
	protected JButton jButtonAbrirOrderBySolicitudReemplazo;
	
	
	//protected JPanel jPanelOrderBySolicitudReemplazo;
	//public JScrollPane jScrollPanelOrderBySolicitudReemplazo;	
	//protected JButton jButtonCerrarOrderBySolicitudReemplazo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SolicitudReemplazoLogic solicitudreemplazoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSolicitudReemplazo;
	public JScrollPane jScrollPanelDatosEdicionSolicitudReemplazo;
	public JScrollPane jScrollPanelDatosGeneralSolicitudReemplazo;
    
	
	
	//public JScrollPane jScrollPanelDatosSolicitudReemplazoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSolicitudReemplazo;
	//public JScrollPane jScrollPanelImportacionSolicitudReemplazo;
	
	
	
	protected JPanel jPanelAccionesSolicitudReemplazo;
	
    protected JPanel jPanelPaginacionSolicitudReemplazo;
    protected JPanel jPanelParametrosReportesSolicitudReemplazo;
	protected JPanel jPanelParametrosReportesAccionesSolicitudReemplazo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SolicitudReemplazo;
	protected JPanel jPanelParametrosAuxiliar2SolicitudReemplazo;
	protected JPanel jPanelParametrosAuxiliar3SolicitudReemplazo;
	protected JPanel jPanelParametrosAuxiliar4SolicitudReemplazo;
	//protected JPanel jPanelParametrosAuxiliar5SolicitudReemplazo;
	
	
	
	//protected JPanel jPanelReporteDinamicoSolicitudReemplazo;
	//protected JPanel jPanelImportacionSolicitudReemplazo;
	
	
	public JTable jTableDatosSolicitudReemplazo;
	
	
	
	//public JTable jTableDatosSolicitudReemplazoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSolicitudReemplazo;
	protected JButton jButtonDuplicarSolicitudReemplazo;
	protected JButton jButtonCopiarSolicitudReemplazo;
	protected JButton jButtonVerFormSolicitudReemplazo;
	protected JButton jButtonNuevoRelacionesSolicitudReemplazo;
	protected JButton jButtonModificarSolicitudReemplazo;
	
    protected JButton jButtonGuardarCambiosTablaSolicitudReemplazo;
	protected JButton jButtonCerrarSolicitudReemplazo;
	
	
	protected JButton jButtonRecargarInformacionSolicitudReemplazo;
	protected JButton jButtonProcesarInformacionSolicitudReemplazo;
	
	
	protected JButton jButtonAnterioresSolicitudReemplazo;
	protected JButton jButtonSiguientesSolicitudReemplazo;
	protected JButton jButtonNuevoGuardarCambiosSolicitudReemplazo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSolicitudReemplazo;
	//protected JButton jButtonCerrarReporteDinamicoSolicitudReemplazo;
	//protected JButton jButtonGenerarExcelReporteDinamicoSolicitudReemplazo;	
	
	
	
	//protected JButton jButtonAbrirImportacionSolicitudReemplazo;
	//protected JButton jButtonGenerarImportacionSolicitudReemplazo;
	//protected JButton jButtonCerrarImportacionSolicitudReemplazo;
	//protected JFileChooser jFileChooserImportacionSolicitudReemplazo;
	//protected File fileImportacionSolicitudReemplazo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudReemplazo;
	protected JButton jButtonDuplicarToolBarSolicitudReemplazo;
	protected JButton jButtonNuevoRelacionesToolBarSolicitudReemplazo;
	
	
	public JButton jButtonGuardarCambiosToolBarSolicitudReemplazo;
	protected JButton jButtonCopiarToolBarSolicitudReemplazo;
	protected JButton jButtonVerFormToolBarSolicitudReemplazo;
	public JButton jButtonGuardarCambiosTablaToolBarSolicitudReemplazo;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudReemplazo;
	protected JButton jButtonCerrarToolBarSolicitudReemplazo;
	
	protected JButton jButtonRecargarInformacionToolBarSolicitudReemplazo;
	protected JButton jButtonProcesarInformacionToolBarSolicitudReemplazo;
	protected JButton jButtonAnterioresToolBarSolicitudReemplazo;
	protected JButton jButtonSiguientesToolBarSolicitudReemplazo;
	protected JButton jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo;
	protected JButton jButtonAbrirOrderByToolBarSolicitudReemplazo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudReemplazo;
	protected JMenuItem jMenuItemDuplicarSolicitudReemplazo;
	protected JMenuItem jMenuItemNuevoRelacionesSolicitudReemplazo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSolicitudReemplazo;
	protected JMenuItem jMenuItemCopiarSolicitudReemplazo;
	protected JMenuItem jMenuItemVerFormSolicitudReemplazo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudReemplazo;
	protected JMenuItem jMenuItemCerrarSolicitudReemplazo;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudReemplazo;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySolicitudReemplazo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudReemplazo;
	
	protected JMenuItem jMenuItemRecargarInformacionSolicitudReemplazo;
	protected JMenuItem jMenuItemProcesarInformacionSolicitudReemplazo;
	protected JMenuItem jMenuItemAnterioresSolicitudReemplazo;
	protected JMenuItem jMenuItemSiguientesSolicitudReemplazo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudReemplazo;
	protected JMenuItem jMenuItemAbrirOrderBySolicitudReemplazo;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudReemplazo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudReemplazo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSolicitudReemplazo;
	protected JCheckBox jCheckBoxSeleccionadosSolicitudReemplazo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSolicitudReemplazo;
	protected JCheckBox jCheckBoxConGraficoReporteSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSolicitudReemplazo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSolicitudReemplazo;
	protected JTextField jTextFieldValorCampoGeneralSolicitudReemplazo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSolicitudReemplazo;
	//public JList<Reporte> jListColumnasSelectReporteSolicitudReemplazo;
	//public JScrollPane jScrollColumnasSelectReporteSolicitudReemplazo;
	
	//public JLabel jLabelRelacionesSelectReporteSolicitudReemplazo;
	//public JList<Reporte> jListRelacionesSelectReporteSolicitudReemplazo;
	//public JScrollPane jScrollRelacionesSelectReporteSolicitudReemplazo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSolicitudReemplazo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSolicitudReemplazo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSolicitudReemplazo;
	//public JLabel jLabelTiposArchivoReporteDinamicoSolicitudReemplazo;
	
		
	//public JLabel jLabelArchivoImportacionSolicitudReemplazo;	
	//public JLabel jLabelPathArchivoImportacionSolicitudReemplazo;
	//protected JTextField jTextFieldPathArchivoImportacionSolicitudReemplazo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSolicitudReemplazo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSolicitudReemplazo;
	
	//public JLabel jLabelColumnaCategoriaValorSolicitudReemplazo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSolicitudReemplazo;
	
	//public JLabel jLabelColumnasValoresGraficoSolicitudReemplazo;
	//public JList<Reporte> jListColumnasValoresGraficoSolicitudReemplazo;
	//public JScrollPane jScrollColumnasValoresGraficoSolicitudReemplazo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSolicitudReemplazo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSolicitudReemplazo;
	public JPanel jPanelFK_IdEmpleadoSolicitudReemplazo;
	public JButton jButtonFK_IdEmpleadoSolicitudReemplazo;
	public JPanel jPanelFK_IdEmpleadoJefeSolicitudReemplazo;
	public JButton jButtonFK_IdEmpleadoJefeSolicitudReemplazo;
	public JPanel jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo;
	public JButton jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo;
	public JPanel jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo;
	public JButton jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo;
	public JPanel jPanelFK_IdEstructuraSolicitudReemplazo;
	public JButton jButtonFK_IdEstructuraSolicitudReemplazo;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoSolicitudReemplazo;
	public JLabel jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo;
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudReemplazoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo;
	public JLabel jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo;
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo;
	public JLabel jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo;
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo;
	public JLabel jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo;
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraSolicitudReemplazo;
	public JLabel jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo;
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudReemplazo= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudReemplazoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudReemplazoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudReemplazoArbol= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public SolicitudReemplazoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudReemplazoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSolicitudReemplazo)	{
		this.jButtonRecargarInformacionSolicitudReemplazo = jButtonRecargarInformacionSolicitudReemplazo;
	}
	
	public JButton getjButtonProcesarInformacionSolicitudReemplazo() {
		return this.jButtonProcesarInformacionSolicitudReemplazo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudReemplazo)	{
		this.jButtonProcesarInformacionSolicitudReemplazo = jButtonProcesarInformacionSolicitudReemplazo;
	}
	
	
	public JButton getjButtonRecargarInformacionSolicitudReemplazo() {
		return this.jButtonRecargarInformacionSolicitudReemplazo;
	}
	
	
	public List<SolicitudReemplazo> getsolicitudreemplazos() {
		return this.solicitudreemplazos;
	}

	public void setsolicitudreemplazos(List<SolicitudReemplazo> solicitudreemplazos) {
		this.solicitudreemplazos = solicitudreemplazos;
	}
	
	public List<SolicitudReemplazo> getsolicitudreemplazosAux() {
		return this.solicitudreemplazosAux;
	}

	public void setsolicitudreemplazosAux(List<SolicitudReemplazo> solicitudreemplazosAux) {
		this.solicitudreemplazosAux = solicitudreemplazosAux;
	}
	
	public List<SolicitudReemplazo> getsolicitudreemplazosEliminados() {
		return this.solicitudreemplazosEliminados;
	}

	public void setSolicitudReemplazosEliminados(List<SolicitudReemplazo> solicitudreemplazosEliminados) {
		this.solicitudreemplazosEliminados = solicitudreemplazosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSolicitudReemplazo() {
		return jComboBoxTiposSeleccionarSolicitudReemplazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSolicitudReemplazo(
			JComboBox jComboBoxTiposSeleccionarSolicitudReemplazo) {
		this.jComboBoxTiposSeleccionarSolicitudReemplazo = jComboBoxTiposSeleccionarSolicitudReemplazo;
	}
	
	public void setBorderResaltarTiposSeleccionarSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSolicitudReemplazo() {
		return jTextFieldValorCampoGeneralSolicitudReemplazo;
	}

	public void setjTextFieldValorCampoGeneralSolicitudReemplazo(
			JTextField jTextFieldValorCampoGeneralSolicitudReemplazo) {
		this.jTextFieldValorCampoGeneralSolicitudReemplazo = jTextFieldValorCampoGeneralSolicitudReemplazo;
	}

	public void setBorderResaltarValorCampoGeneralSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSolicitudReemplazo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSolicitudReemplazo() {
		return this.jCheckBoxSeleccionarTodosSolicitudReemplazo;
	}

	public void setjCheckBoxSeleccionarTodosSolicitudReemplazo(
			JCheckBox jCheckBoxSeleccionarTodosSolicitudReemplazo) {
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo = jCheckBoxSeleccionarTodosSolicitudReemplazo;
	}

	public void setBorderResaltarSeleccionarTodosSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSolicitudReemplazo() {
		return this.jCheckBoxSeleccionadosSolicitudReemplazo;
	}

	public void setjCheckBoxSeleccionadosSolicitudReemplazo(
			JCheckBox jCheckBoxSeleccionadosSolicitudReemplazo) {
		this.jCheckBoxSeleccionadosSolicitudReemplazo = jCheckBoxSeleccionadosSolicitudReemplazo;
	}
	
	public void setBorderResaltarSeleccionadosSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSolicitudReemplazo() {
		return this.jComboBoxTiposArchivosReportesSolicitudReemplazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSolicitudReemplazo(
			JComboBox jComboBoxTiposArchivosReportesSolicitudReemplazo) {
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo = jComboBoxTiposArchivosReportesSolicitudReemplazo;
	}

	public void setBorderResaltarTiposArchivosReportesSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSolicitudReemplazo() {
		return this.jComboBoxTiposReportesSolicitudReemplazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSolicitudReemplazo(
			JComboBox jComboBoxTiposReportesSolicitudReemplazo) {
		this.jComboBoxTiposReportesSolicitudReemplazo = jComboBoxTiposReportesSolicitudReemplazo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSolicitudReemplazo() {
	//	return jComboBoxTiposReportesDinamicoSolicitudReemplazo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSolicitudReemplazo(
	//		JComboBox jComboBoxTiposReportesDinamicoSolicitudReemplazo) {
	//	this.jComboBoxTiposReportesDinamicoSolicitudReemplazo = jComboBoxTiposReportesDinamicoSolicitudReemplazo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo() {
	//	return jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo = jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo;
	//}
	
	public void setBorderResaltarTiposReportesSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSolicitudReemplazo() {
		return this.jComboBoxTiposGraficosReportesSolicitudReemplazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSolicitudReemplazo(
			JComboBox jComboBoxTiposGraficosReportesSolicitudReemplazo) {
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo = jComboBoxTiposGraficosReportesSolicitudReemplazo;
	}
	
	public void setBorderResaltarTiposGraficosReportesSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSolicitudReemplazo() {
		return this.jComboBoxTiposPaginacionSolicitudReemplazo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSolicitudReemplazo(
			JComboBox jComboBoxTiposPaginacionSolicitudReemplazo) {
		this.jComboBoxTiposPaginacionSolicitudReemplazo = jComboBoxTiposPaginacionSolicitudReemplazo;
	}
	
	public void setBorderResaltarTiposPaginacionSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSolicitudReemplazo() {
		return this.jComboBoxTiposRelacionesSolicitudReemplazo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudReemplazo() {
		return this.jComboBoxTiposAccionesSolicitudReemplazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudReemplazo(
			JComboBox jComboBoxTiposRelacionesSolicitudReemplazo) {
		this.jComboBoxTiposRelacionesSolicitudReemplazo = jComboBoxTiposRelacionesSolicitudReemplazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudReemplazo(
			JComboBox jComboBoxTiposAccionesSolicitudReemplazo) {
		this.jComboBoxTiposAccionesSolicitudReemplazo = jComboBoxTiposAccionesSolicitudReemplazo;
	}
	
	public void setBorderResaltarTiposRelacionesSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSolicitudReemplazo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSolicitudReemplazo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSolicitudReemplazo() {
	//	return jCheckBoxConGraficoDinamicoSolicitudReemplazo;
	//}

	//public void setjCheckBoxConGraficoDinamicoSolicitudReemplazo(
	//		JCheckBox jCheckBoxConGraficoDinamicoSolicitudReemplazo) {
	//	this.jCheckBoxConGraficoDinamicoSolicitudReemplazo = jCheckBoxConGraficoDinamicoSolicitudReemplazo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSolicitudReemplazo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSolicitudReemplazo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSolicitudReemplazo .setBorder(borderResaltar);		
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
		this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		
		this.solicitudreemplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudreemplazoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudReemplazoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Reemplazo MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
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
		
		SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SolicitudReemplazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSolicitudReemplazo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"nuevo","nuevo","Nuevo"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"duplicar","duplicar","Duplicar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"copiar","copiar","Copiar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"ver_form","ver_form","Ver"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"recargar","recargar","Recargar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSolicitudReemplazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSolicitudReemplazo,this.jTtoolBarSolicitudReemplazo,
							"cerrar","cerrar","Salir"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSolicitudReemplazo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSolicitudReemplazo;
			
				this.jButtonProcesarInformacionToolBarSolicitudReemplazo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSolicitudReemplazo;
				
		//protected JButton jButtonModificarToolBarSolicitudReemplazo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSolicitudReemplazo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSolicitudReemplazo=new JMenuMe("General");
		this.jmenuArchivoSolicitudReemplazo=new JMenuMe("Archivo");
		this.jmenuAccionesSolicitudReemplazo=new JMenuMe("Acciones");
		this.jmenuDatosSolicitudReemplazo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudReemplazo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudReemplazo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudReemplazo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSolicitudReemplazo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSolicitudReemplazo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSolicitudReemplazo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSolicitudReemplazo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSolicitudReemplazo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSolicitudReemplazo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSolicitudReemplazo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudReemplazo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudReemplazo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSolicitudReemplazo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSolicitudReemplazo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSolicitudReemplazo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSolicitudReemplazo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSolicitudReemplazo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSolicitudReemplazo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSolicitudReemplazo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSolicitudReemplazo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSolicitudReemplazo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudReemplazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudReemplazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudReemplazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSolicitudReemplazo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSolicitudReemplazo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSolicitudReemplazo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSolicitudReemplazo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSolicitudReemplazo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSolicitudReemplazo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSolicitudReemplazo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSolicitudReemplazo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSolicitudReemplazo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSolicitudReemplazo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSolicitudReemplazo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSolicitudReemplazo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySolicitudReemplazo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySolicitudReemplazo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySolicitudReemplazo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudReemplazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudReemplazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudReemplazo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudReemplazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudReemplazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudReemplazo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSolicitudReemplazo.add(this.jMenuItemCerrarSolicitudReemplazo);
			
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemNuevoSolicitudReemplazo);
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemNuevoGuardarCambiosSolicitudReemplazo);
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemNuevoRelacionesSolicitudReemplazo);
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemGuardarCambiosTablaSolicitudReemplazo);		
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemDuplicarSolicitudReemplazo);		
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemCopiarSolicitudReemplazo);		
			this.jmenuAccionesSolicitudReemplazo.add(this.jMenuItemVerFormSolicitudReemplazo);		
			
			this.jmenuDatosSolicitudReemplazo.add(this.jMenuItemRecargarInformacionSolicitudReemplazo);				
			this.jmenuDatosSolicitudReemplazo.add(this.jMenuItemAnterioresSolicitudReemplazo);				
			this.jmenuDatosSolicitudReemplazo.add(this.jMenuItemSiguientesSolicitudReemplazo);				
			this.jmenuDatosSolicitudReemplazo.add(this.jMenuItemAbrirOrderBySolicitudReemplazo);				
			this.jmenuDatosSolicitudReemplazo.add(this.jMenuItemMostrarOcultarSolicitudReemplazo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSolicitudReemplazo.add(this.jMenuItemGuardarCambiosSolicitudReemplazo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSolicitudReemplazo.add(this.jmenuArchivoSolicitudReemplazo);		
			this.jmenuBarSolicitudReemplazo.add(this.jmenuAccionesSolicitudReemplazo);		
			this.jmenuBarSolicitudReemplazo.add(this.jmenuDatosSolicitudReemplazo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSolicitudReemplazo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSolicitudReemplazo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoSolicitudReemplazo.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoSolicitudReemplazo= new JButtonMe();
		this.jButtonFK_IdEmpleadoSolicitudReemplazo.setText("Buscar");
		this.jButtonFK_IdEmpleadoSolicitudReemplazo.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoSolicitudReemplazo,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoJefeSolicitudReemplazo.setToolTipText("Buscar Por Empleado Jefe ");
		this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo= new JButtonMe();
		this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo.setText("Buscar");
		this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo.setToolTipText("Buscar Por Empleado Jefe ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo,"buscar_button","Buscar Por Empleado Jefe ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoJefeSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo = new JLabelMe();
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setText("Empleado Jefe :");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setToolTipText("Empleado Jefe");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo.setToolTipText("Buscar Por Empleado Reemplazo ");
		this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo= new JButtonMe();
		this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo.setText("Buscar");
		this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo.setToolTipText("Buscar Por Empleado Reemplazo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo,"buscar_button","Buscar Por Empleado Reemplazo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo = new JLabelMe();
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setText("Empleado Reemplazo :");
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setToolTipText("Empleado Reemplazo");
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo= new JButtonMe();
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo.setText("Buscar");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo,"buscar_button","Buscar Por Estado Solicitud Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo = new JLabelMe();
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setText("Estado Solicitud Nomi :");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setToolTipText("Estado Solicitud Nomi");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSolicitudReemplazo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSolicitudReemplazo.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraSolicitudReemplazo= new JButtonMe();
		this.jButtonFK_IdEstructuraSolicitudReemplazo.setText("Buscar");
		this.jButtonFK_IdEstructuraSolicitudReemplazo.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSolicitudReemplazo,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSolicitudReemplazo=new JTabbedPane();


		this.jTabbedPaneBusquedasSolicitudReemplazo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudReemplazo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudReemplazo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSolicitudReemplazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSolicitudReemplazo = new SolicitudReemplazoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Solicitud Reemplazo DATOS");
			this.jInternalFrameDetalleFormSolicitudReemplazo = new SolicitudReemplazoDetalleFormJInternalFrame(jDesktopPane,this.solicitudreemplazoSessionBean.getConGuardarRelaciones(),this.solicitudreemplazoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSolicitudReemplazo = null;//new SolicitudReemplazoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudReemplazo= new GridBagLayout();
		
		
		this.jTableDatosSolicitudReemplazo = new JTableMe();      
		
		String sToolTipSolicitudReemplazo="";
		sToolTipSolicitudReemplazo=SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudReemplazo+="(Nomina.SolicitudReemplazo)";
		}
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudReemplazo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSolicitudReemplazo.setToolTipText(sToolTipSolicitudReemplazo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSolicitudReemplazo);
		this.jTableDatosSolicitudReemplazo.setAutoCreateRowSorter(true);
		this.jTableDatosSolicitudReemplazo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSolicitudReemplazo.setRowSelectionAllowed(true);
		this.jTableDatosSolicitudReemplazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSolicitudReemplazo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSolicitudReemplazo = new JButtonMe();
		this.jButtonDuplicarSolicitudReemplazo = new JButtonMe();
		this.jButtonCopiarSolicitudReemplazo = new JButtonMe();
		this.jButtonVerFormSolicitudReemplazo = new JButtonMe();
		this.jButtonNuevoRelacionesSolicitudReemplazo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo = new JButtonMe();
		this.jButtonCerrarSolicitudReemplazo = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudReemplazo = new JScrollPane();   
        this.jScrollPanelDatosGeneralSolicitudReemplazo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Reemplazo";
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudReemplazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudReemplazo.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudReemplazo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSolicitudReemplazo=new ReporteDinamicoJInternalFrame(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSolicitudReemplazo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSolicitudReemplazo=new ImportacionJInternalFrame(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSolicitudReemplazo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySolicitudReemplazo = new JButtonMe();
		
		this.jButtonAbrirOrderBySolicitudReemplazo.setText("Orden");
		this.jButtonAbrirOrderBySolicitudReemplazo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudReemplazo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudReemplazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudReemplazo,false,this);
			
			//this.cargarOrderBySolicitudReemplazo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudReemplazo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudReemplazo,true,this);
			
			//this.cargarOrderBySolicitudReemplazo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSolicitudReemplazo.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudReemplazo.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudReemplazo.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosSolicitudReemplazo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudReemplazo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudReemplazo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSolicitudReemplazo.setText("Nuevo");
		this.jButtonDuplicarSolicitudReemplazo.setText("Duplicar");
		this.jButtonCopiarSolicitudReemplazo.setText("Copiar");
		this.jButtonVerFormSolicitudReemplazo.setText("Ver");
		this.jButtonNuevoRelacionesSolicitudReemplazo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.setText("Guardar");
		this.jButtonCerrarSolicitudReemplazo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudReemplazo,"nuevo_button","Nuevo",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSolicitudReemplazo,"duplicar_button","Duplicar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSolicitudReemplazo,"copiar_button","Copiar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSolicitudReemplazo,"ver_form","Ver",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSolicitudReemplazo,"nuevorelaciones_button","Nuevo Rel",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudReemplazo,"guardarcambiostabla_button","Guardar",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudReemplazo,"cerrar_button","Salir",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSolicitudReemplazo.setToolTipText("Nuevo"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSolicitudReemplazo.setToolTipText("Duplicar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSolicitudReemplazo.setToolTipText("Copiar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSolicitudReemplazo.setToolTipText("Ver"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSolicitudReemplazo.setToolTipText("Nuevo Rel"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.setToolTipText("Guardar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudReemplazo.setToolTipText("Salir"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudReemplazo";
		inputMap = this.jButtonNuevoSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudReemplazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudReemplazo"));
		
		//DUPLICAR
		sMapKey = "DuplicarSolicitudReemplazo";
		inputMap = this.jButtonDuplicarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSolicitudReemplazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSolicitudReemplazo"));
		
		//COPIAR
		sMapKey = "CopiarSolicitudReemplazo";
		inputMap = this.jButtonCopiarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSolicitudReemplazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSolicitudReemplazo"));
		
		//VEr FORM
		sMapKey = "VerFormSolicitudReemplazo";
		inputMap = this.jButtonVerFormSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSolicitudReemplazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSolicitudReemplazo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSolicitudReemplazo";
		inputMap = this.jButtonNuevoRelacionesSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSolicitudReemplazo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSolicitudReemplazo";
		inputMap = this.jButtonModificarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSolicitudReemplazo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSolicitudReemplazo";
		inputMap = this.jButtonCerrarSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudReemplazo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudReemplazo";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudReemplazo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSolicitudReemplazo.setName("jPanelParametrosReportesSolicitudReemplazo"); 
		
		this.jPanelParametrosReportesAccionesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSolicitudReemplazo.setName("jPanelParametrosReportesAccionesSolicitudReemplazo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSolicitudReemplazo = new JButtonMe();
		this.jButtonRecargarInformacionSolicitudReemplazo.setText("Recargar");
		this.jButtonRecargarInformacionSolicitudReemplazo.setToolTipText("Recargar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSolicitudReemplazo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSolicitudReemplazo = new JButtonMe();
		this.jButtonProcesarInformacionSolicitudReemplazo.setText("Procesar");
		this.jButtonProcesarInformacionSolicitudReemplazo.setToolTipText("Procesar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSolicitudReemplazo.setVisible(false);
			
		this.jButtonProcesarInformacionSolicitudReemplazo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudReemplazo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudReemplazo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setText("TIPO");       
		this.jComboBoxTiposReportesSolicitudReemplazo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSolicitudReemplazo.setText("Paginacion");
		this.jComboBoxTiposPaginacionSolicitudReemplazo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSolicitudReemplazo.setText("Accion");
		this.jComboBoxTiposRelacionesSolicitudReemplazo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudReemplazo.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudReemplazo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSolicitudReemplazo.setText("Accion");
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSolicitudReemplazo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSolicitudReemplazo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudReemplazo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudReemplazo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSolicitudReemplazo = new JLabelMe();
		
		this.jLabelAccionesSolicitudReemplazo.setText("Acciones");		
		this.jLabelAccionesSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSolicitudReemplazo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSolicitudReemplazo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSolicitudReemplazo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSolicitudReemplazo.setText("Graf.");
		this.jCheckBoxConGraficoReporteSolicitudReemplazo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSolicitudReemplazo = new JButtonMe();
		//this.jButtonAnterioresSolicitudReemplazo.setText("<<");
        this.jButtonAnterioresSolicitudReemplazo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSolicitudReemplazo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSolicitudReemplazo = new JButtonMe();
		//this.jButtonSiguientesSolicitudReemplazo.setText(">>");
        this.jButtonSiguientesSolicitudReemplazo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSolicitudReemplazo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSolicitudReemplazo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSolicitudReemplazo.setText("Nue");
        this.jButtonNuevoGuardarCambiosSolicitudReemplazo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSolicitudReemplazo,"nuevoguardarcambios_button","Nue",this.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSolicitudReemplazo";
		inputMap = this.jButtonNuevoGuardarCambiosSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSolicitudReemplazo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSolicitudReemplazo";
		inputMap = this.jButtonRecargarInformacionSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSolicitudReemplazo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSolicitudReemplazo";
		inputMap = this.jButtonSiguientesSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSolicitudReemplazo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSolicitudReemplazo";
		inputMap = this.jButtonAnterioresSolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSolicitudReemplazo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSolicitudReemplazo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSolicitudReemplazo.setMinimumSize(new Dimension(this.getWidth(),SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudReemplazo.setMaximumSize(new Dimension(this.getWidth(),SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudReemplazo.setPreferredSize(new Dimension(this.getWidth(),SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudReemplazoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSolicitudReemplazo = new GridBagLayout();

			this.jPanelPaginacionSolicitudReemplazo.setLayout(gridaBagLayoutPaginacionSolicitudReemplazo);						
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonAnterioresSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					
						
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
			
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonNuevoGuardarCambiosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
						
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonSiguientesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonNuevoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
						
			
			
			if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
				this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
				this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonGuardarCambiosTablaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			}
			
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonDuplicarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonCopiarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonVerFormSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 1;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSolicitudReemplazo.add(this.jButtonCerrarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		
		this.jButtonRecargarInformacionSolicitudReemplazo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudReemplazo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudReemplazo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudReemplazo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSolicitudReemplazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudReemplazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudReemplazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudReemplazo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSolicitudReemplazo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudReemplazo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudReemplazo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudReemplazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudReemplazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudReemplazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSolicitudReemplazo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudReemplazo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudReemplazo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudReemplazo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSolicitudReemplazo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudReemplazo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudReemplazo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSolicitudReemplazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSolicitudReemplazo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SolicitudReemplazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SolicitudReemplazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SolicitudReemplazo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SolicitudReemplazo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSolicitudReemplazo.setLayout(gridaBagParametrosReportesSolicitudReemplazo);
			this.jPanelParametrosReportesAccionesSolicitudReemplazo.setLayout(gridaBagParametrosReportesAccionesSolicitudReemplazo);
			
			
			this.jPanelParametrosAuxiliar1SolicitudReemplazo.setLayout(gridaBagParametrosAuxiliar1SolicitudReemplazo);
			this.jPanelParametrosAuxiliar2SolicitudReemplazo.setLayout(gridaBagParametrosAuxiliar2SolicitudReemplazo);
			this.jPanelParametrosAuxiliar3SolicitudReemplazo.setLayout(gridaBagParametrosAuxiliar3SolicitudReemplazo);
			this.jPanelParametrosAuxiliar4SolicitudReemplazo.setLayout(gridaBagParametrosAuxiliar4SolicitudReemplazo);
			//this.jPanelParametrosAuxiliar5SolicitudReemplazo.setLayout(gridaBagParametrosAuxiliar2SolicitudReemplazo);			
			
			
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jButtonRecargarInformacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudReemplazo.add(this.jComboBoxTiposPaginacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudReemplazo.add(this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudReemplazo.add(this.jComboBoxTiposArchivosReportesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jPanelParametrosAuxiliar1SolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SolicitudReemplazo.add(this.jComboBoxTiposReportesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);																		
			
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SolicitudReemplazo.add(this.jComboBoxTiposGraficosReportesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jPanelParametrosAuxiliar4SolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jComboBoxTiposReportesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jCheckBoxGenerarReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jPanelParametrosAuxiliar2SolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jLabelAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
				this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSolicitudReemplazo.add(this.jButtonAbrirOrderBySolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jComboBoxTiposSeleccionarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			
			
			/*
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jCheckBoxSeleccionarTodosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jCheckBoxConGraficoReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudReemplazo.add(this.jCheckBoxSeleccionarTodosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);															
				
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudReemplazo.add(this.jCheckBoxSeleccionadosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);															
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudReemplazo.add(this.jCheckBoxConGraficoReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jPanelParametrosAuxiliar3SolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jComboBoxTiposAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
	
				
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudReemplazo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudReemplazo.add(this.jTextFieldValorCampoGeneralSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSolicitudReemplazo = new GridBagLayout();

			this.jScrollPanelDatosSolicitudReemplazo.setLayout(gridaBagLayoutDatosSolicitudReemplazo);
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
			
			this.jScrollPanelDatosSolicitudReemplazo.add(this.jTableDatosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSolicitudReemplazo.setViewportView(this.jTableDatosSolicitudReemplazo);
		this.jTableDatosSolicitudReemplazo.setFillsViewportHeight(true);
		this.jTableDatosSolicitudReemplazo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSolicitudReemplazo= new GridBagLayout();
		this.jPanelAccionesSolicitudReemplazo.setLayout(gridaBagLayoutAccionesSolicitudReemplazo);
		
		
		/*	
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = 0;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
			
		this.jPanelAccionesSolicitudReemplazo.add(this.jButtonNuevoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoSolicitudReemplazo.setLayout(gridaBagLayoutFK_IdEmpleadoSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 0;
		jPanelFK_IdEmpleadoSolicitudReemplazo.add(jLabelid_empleadoFK_IdEmpleadoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 1;
		jPanelFK_IdEmpleadoSolicitudReemplazo.add(jComboBoxid_empleadoFK_IdEmpleadoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 1;
		gridBagConstraintsSolicitudReemplazo.gridx =1;
		jPanelFK_IdEmpleadoSolicitudReemplazo.add(jButtonFK_IdEmpleadoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		jTabbedPaneBusquedasSolicitudReemplazo.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoSolicitudReemplazo);
		jTabbedPaneBusquedasSolicitudReemplazo.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoJefeSolicitudReemplazo.setLayout(gridaBagLayoutFK_IdEmpleadoJefeSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 0;
		jPanelFK_IdEmpleadoJefeSolicitudReemplazo.add(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 1;
		jPanelFK_IdEmpleadoJefeSolicitudReemplazo.add(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 1;
		gridBagConstraintsSolicitudReemplazo.gridx =1;
		jPanelFK_IdEmpleadoJefeSolicitudReemplazo.add(jButtonFK_IdEmpleadoJefeSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		jTabbedPaneBusquedasSolicitudReemplazo.addTab("2.-Por Empleado Jefe ", jPanelFK_IdEmpleadoJefeSolicitudReemplazo);
		jTabbedPaneBusquedasSolicitudReemplazo.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo.setLayout(gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 0;
		jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo.add(jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 1;
		jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo.add(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 1;
		gridBagConstraintsSolicitudReemplazo.gridx =1;
		jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo.add(jButtonFK_IdEmpleadoReemplazoSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		jTabbedPaneBusquedasSolicitudReemplazo.addTab("3.-Por Empleado Reemplazo ", jPanelFK_IdEmpleadoReemplazoSolicitudReemplazo);
		jTabbedPaneBusquedasSolicitudReemplazo.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo.setLayout(gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 0;
		jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo.add(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo.add(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 1;
		gridBagConstraintsSolicitudReemplazo.gridx =1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo.add(jButtonFK_IdEstadoSolicitudNomiSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		jTabbedPaneBusquedasSolicitudReemplazo.addTab("4.-Por Estado Solicitud Nomi ", jPanelFK_IdEstadoSolicitudNomiSolicitudReemplazo);
		jTabbedPaneBusquedasSolicitudReemplazo.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSolicitudReemplazo= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSolicitudReemplazo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudReemplazo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudReemplazo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSolicitudReemplazo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSolicitudReemplazo.setLayout(gridaBagLayoutFK_IdEstructuraSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 0;
		jPanelFK_IdEstructuraSolicitudReemplazo.add(jLabelid_estructuraFK_IdEstructuraSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 0;
		gridBagConstraintsSolicitudReemplazo.gridx = 1;
		jPanelFK_IdEstructuraSolicitudReemplazo.add(jComboBoxid_estructuraFK_IdEstructuraSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudReemplazo.gridy = 1;
		gridBagConstraintsSolicitudReemplazo.gridx =1;
		jPanelFK_IdEstructuraSolicitudReemplazo.add(jButtonFK_IdEstructuraSolicitudReemplazo, gridBagConstraintsSolicitudReemplazo);

		jTabbedPaneBusquedasSolicitudReemplazo.addTab("5.-Por Estructura ", jPanelFK_IdEstructuraSolicitudReemplazo);
		jTabbedPaneBusquedasSolicitudReemplazo.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudReemplazo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudReemplazo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;		
			//this.gridBagConstraintsSolicitudReemplazo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudReemplazo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;		
		//this.gridBagConstraintsSolicitudReemplazo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSolicitudReemplazo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSolicitudReemplazo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudReemplazo.gridx = 0;		
			this.gridBagConstraintsSolicitudReemplazo.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSolicitudReemplazo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);								
		
		
		/*
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		*/		
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudReemplazo.gridx =0;
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudReemplazo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
				
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SolicitudReemplazoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSolicitudReemplazo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudReemplazo = new GridBagLayout();
			this.jPanelBusquedasParametrosSolicitudReemplazo.setLayout(gridaBagLayoutBusquedasParametrosSolicitudReemplazo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSolicitudReemplazo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudReemplazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
			
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudReemplazo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSolicitudReemplazo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSolicitudReemplazo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSolicitudReemplazo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSolicitudReemplazo.setName("jPanelReporteDinamicoSolicitudReemplazo"); 
		
		this.jPanelReporteDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSolicitudReemplazo.setLayout(gridaBagLayoutReporteDinamicoSolicitudReemplazo);
		
		
		this.jInternalFrameReporteDinamicoSolicitudReemplazo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSolicitudReemplazo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudReemplazo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSolicitudReemplazo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSolicitudReemplazo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSolicitudReemplazo.setResizable(true);
	    this.jInternalFrameReporteDinamicoSolicitudReemplazo.setClosable(true);
	    this.jInternalFrameReporteDinamicoSolicitudReemplazo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSolicitudReemplazo = new JLabelMe();

		this.jLabelColumnasSelectReporteSolicitudReemplazo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelColumnasSelectReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSolicitudReemplazo = new JList<Reporte>();
		this.jListColumnasSelectReporteSolicitudReemplazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSolicitudReemplazo=new JScrollPane(this.jListColumnasSelectReporteSolicitudReemplazo);
			
			this.jScrollColumnasSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jListColumnasSelectReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jScrollColumnasSelectReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSolicitudReemplazo = new JLabelMe();

		this.jLabelRelacionesSelectReporteSolicitudReemplazo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSolicitudReemplazo = new JList<Reporte>();
		this.jListRelacionesSelectReporteSolicitudReemplazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSolicitudReemplazo=new JScrollPane(this.jListRelacionesSelectReporteSolicitudReemplazo);
			
			this.jScrollRelacionesSelectReporteSolicitudReemplazo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudReemplazo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudReemplazo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSolicitudReemplazo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo = new JComboBoxMe();
		this.jListColumnasValoresGraficoSolicitudReemplazo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSolicitudReemplazo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSolicitudReemplazo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSolicitudReemplazo = new JLabelMe();

		this.jLabelConGraficoDinamicoSolicitudReemplazo.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelConGraficoDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSolicitudReemplazo = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSolicitudReemplazo.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSolicitudReemplazo.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jCheckBoxConGraficoDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSolicitudReemplazo = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSolicitudReemplazo.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelColumnaCategoriaGraficoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSolicitudReemplazo = new JLabelMe();

		this.jLabelColumnaCategoriaValorSolicitudReemplazo.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelColumnaCategoriaValorSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSolicitudReemplazo.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudReemplazo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jComboBoxColumnaCategoriaValorSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSolicitudReemplazo = new JLabelMe();

		this.jLabelColumnasValoresGraficoSolicitudReemplazo.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelColumnasValoresGraficoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSolicitudReemplazo = new JList<Reporte>();
		this.jListColumnasValoresGraficoSolicitudReemplazo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSolicitudReemplazo.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSolicitudReemplazo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudReemplazo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudReemplazo.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSolicitudReemplazo=new JScrollPane(this.jListColumnasValoresGraficoSolicitudReemplazo);
			
			this.jScrollColumnasValoresGraficoSolicitudReemplazo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudReemplazo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudReemplazo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jListColumnasSelectReporteSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jScrollColumnasValoresGraficoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelTiposGraficosReportesDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudReemplazo.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jComboBoxTiposGraficosReportesDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelGenerarExcelReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo.setToolTipText("Generar EXCEL"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jButtonGenerarExcelReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jComboBoxTiposReportesDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jLabelTiposArchivoReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jComboBoxTiposArchivosReportesDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSolicitudReemplazo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSolicitudReemplazo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSolicitudReemplazo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSolicitudReemplazo.setToolTipText("Generar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jButtonGenerarReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSolicitudReemplazo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSolicitudReemplazo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSolicitudReemplazo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSolicitudReemplazo.setToolTipText("Cancelar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudReemplazo.add(this.jButtonCerrarReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSolicitudReemplazo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSolicitudReemplazo= new JScrollPane(jPanelReporteDinamicoSolicitudReemplazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSolicitudReemplazo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudReemplazo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudReemplazo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSolicitudReemplazo);
		this.jInternalFrameReporteDinamicoSolicitudReemplazo.getContentPane().add(this.jScrollPanelReporteDinamicoSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSolicitudReemplazo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSolicitudReemplazo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSolicitudReemplazo.setName("jPanelImportacionSolicitudReemplazo"); 
		
		this.jPanelImportacionSolicitudReemplazo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudReemplazo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudReemplazo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSolicitudReemplazo.setLayout(gridaBagLayoutImportacionSolicitudReemplazo);
		
		
		this.jInternalFrameImportacionSolicitudReemplazo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSolicitudReemplazo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSolicitudReemplazo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudReemplazo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSolicitudReemplazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudReemplazo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudReemplazo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSolicitudReemplazo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudReemplazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudReemplazo.setResizable(true);
	    this.jInternalFrameImportacionSolicitudReemplazo.setClosable(true);
	    this.jInternalFrameImportacionSolicitudReemplazo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSolicitudReemplazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudReemplazo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudReemplazo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSolicitudReemplazo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudReemplazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudReemplazo.setResizable(true);
	    this.jInternalFrameImportacionSolicitudReemplazo.setClosable(true);
	    this.jInternalFrameImportacionSolicitudReemplazo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSolicitudReemplazo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudReemplazo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudReemplazo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSolicitudReemplazo = new JLabelMe();

		this.jLabelArchivoImportacionSolicitudReemplazo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudReemplazo.add(this.jLabelArchivoImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSolicitudReemplazo = new JFileChooser();		
		this.jFileChooserImportacionSolicitudReemplazo.setToolTipText("ESCOGER ARCHIVO"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSolicitudReemplazo = new JButtonMe();
		this.jButtonAbrirImportacionSolicitudReemplazo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSolicitudReemplazo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSolicitudReemplazo.setToolTipText("Generar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudReemplazo.add(this.jButtonAbrirImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSolicitudReemplazo = new JLabelMe();

		this.jLabelPathArchivoImportacionSolicitudReemplazo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSolicitudReemplazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudReemplazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudReemplazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudReemplazo.add(this.jLabelPathArchivoImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSolicitudReemplazo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSolicitudReemplazo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudReemplazo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudReemplazo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudReemplazo.add(this.jTextFieldPathArchivoImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSolicitudReemplazo = new JButtonMe();
		this.jButtonGenerarImportacionSolicitudReemplazo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSolicitudReemplazo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSolicitudReemplazo.setToolTipText("Generar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudReemplazo.add(this.jButtonGenerarImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSolicitudReemplazo = new JButtonMe();
		this.jButtonCerrarImportacionSolicitudReemplazo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSolicitudReemplazo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSolicitudReemplazo.setToolTipText("Cancelar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudReemplazo.add(this.jButtonCerrarImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSolicitudReemplazo = new GridBagLayout();
		
		this.jScrollPanelImportacionSolicitudReemplazo= new JScrollPane(jPanelImportacionSolicitudReemplazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
		this.gridBagConstraintsSolicitudReemplazo.gridy =iPosYImportacion;
		this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXImportacion;
		this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSolicitudReemplazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSolicitudReemplazo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSolicitudReemplazo);
		this.jInternalFrameImportacionSolicitudReemplazo.getContentPane().add(this.jScrollPanelImportacionSolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySolicitudReemplazo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySolicitudReemplazo = new JButtonMe();
			this.jButtonAbrirOrderBySolicitudReemplazo.setText("Orden");
			this.jButtonAbrirOrderBySolicitudReemplazo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudReemplazo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySolicitudReemplazo";
			inputMap = this.jButtonAbrirOrderBySolicitudReemplazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySolicitudReemplazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySolicitudReemplazo"));
		
		
			GridBagLayout gridaBagLayoutOrderBySolicitudReemplazo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySolicitudReemplazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySolicitudReemplazo.setName("jPanelOrderBySolicitudReemplazo"); 
			
			this.jPanelOrderBySolicitudReemplazo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudReemplazo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudReemplazo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySolicitudReemplazo.setLayout(gridaBagLayoutOrderBySolicitudReemplazo);
			
			
			this.jTableDatosSolicitudReemplazoOrderBy = new JTableMe();        
			this.jTableDatosSolicitudReemplazoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSolicitudReemplazoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSolicitudReemplazoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSolicitudReemplazoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSolicitudReemplazoOrderBy.setViewportView(this.jTableDatosSolicitudReemplazoOrderBy);
			this.jTableDatosSolicitudReemplazoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSolicitudReemplazoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySolicitudReemplazo= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySolicitudReemplazo= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySolicitudReemplazo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSolicitudReemplazo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySolicitudReemplazo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySolicitudReemplazo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySolicitudReemplazo.setTitle("Orden");
			this.jInternalFrameOrderBySolicitudReemplazo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySolicitudReemplazo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySolicitudReemplazo.setResizable(true);
			this.jInternalFrameOrderBySolicitudReemplazo.setClosable(true);
			this.jInternalFrameOrderBySolicitudReemplazo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySolicitudReemplazo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudReemplazo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudReemplazo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySolicitudReemplazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Reemplazos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSolicitudReemplazo.ipady =150;
				
			this.jPanelOrderBySolicitudReemplazo.add(jScrollPanelDatosSolicitudReemplazoOrderBy, this.gridBagConstraintsSolicitudReemplazo);//this.jTableDatosSolicitudReemplazoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySolicitudReemplazo = new JButtonMe();
			this.jButtonCerrarOrderBySolicitudReemplazo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySolicitudReemplazo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySolicitudReemplazo.setToolTipText("Cancelar"+" "+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySolicitudReemplazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudReemplazo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSolicitudReemplazo.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySolicitudReemplazo.add(this.jButtonCerrarOrderBySolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSolicitudReemplazo = new GridBagLayout();
			
			this.jScrollPanelOrderBySolicitudReemplazo= new JScrollPane(jPanelOrderBySolicitudReemplazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSolicitudReemplazo = new GridBagConstraints();
			this.gridBagConstraintsSolicitudReemplazo.gridy =iPosYOrderBy;
			this.gridBagConstraintsSolicitudReemplazo.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudReemplazo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySolicitudReemplazo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySolicitudReemplazo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSolicitudReemplazo);
			
			this.jInternalFrameOrderBySolicitudReemplazo.getContentPane().add(this.jScrollPanelOrderBySolicitudReemplazo, this.gridBagConstraintsSolicitudReemplazo);			
		
		} else {
			this.jButtonAbrirOrderBySolicitudReemplazo = new JButtonMe();
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
		int iWidthTableCalculado=0;//2930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.solicitudreemplazoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSolicitudReemplazo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSolicitudReemplazo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSolicitudReemplazo.getRowHeight();//SolicitudReemplazoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.isSelected()) {
					iHeightTable=SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudReemplazo.isSelected()) {
					iHeightTable=SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudReemplazoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSolicitudReemplazo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudReemplazo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudReemplazo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSolicitudReemplazo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudReemplazo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudReemplazo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySolicitudReemplazo!=null && this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy()!=null) {
			//if(!this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySolicitudReemplazo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySolicitudReemplazo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySolicitudReemplazo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySolicitudReemplazo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSolicitudReemplazo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudReemplazo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudReemplazo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=solicitudreemplazoLogic.getSolicitudReemplazos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudreemplazos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SolicitudReemplazo> TraerSolicitudReemplazoBeans(List<SolicitudReemplazo> solicitudreemplazos,ArrayList<Classe> classes)throws Exception {
		try {
			for(SolicitudReemplazo solicitudreemplazo:solicitudreemplazos) {
					
				if(!(SolicitudReemplazoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SolicitudReemplazoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					solicitudreemplazo.setsDetalleGeneralEntityReporte(SolicitudReemplazoConstantesFunciones.getSolicitudReemplazoDescripcion(solicitudreemplazo));
										
						
					
						
					
				} else  {
							
					//solicitudreemplazo.setsDetalleGeneralEntityReporte(solicitudreemplazo.getsDetalleGeneralEntityReporte());
										
				}
				
				//solicitudreemplazobeans.add(solicitudreemplazobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return solicitudreemplazos;
    }
	//PARA REPORTES FIN
}
