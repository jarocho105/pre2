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
import com.bydan.erp.nomina.util.SolicitudHoraExtraConstantesFunciones;

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
public class SolicitudHoraExtraJInternalFrame extends SolicitudHoraExtraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSolicitudHoraExtra;
	
	protected JMenuBar jmenuBarSolicitudHoraExtra;
	
	protected JMenu jmenuSolicitudHoraExtra;
	protected JMenu jmenuDatosSolicitudHoraExtra;
	protected JMenu jmenuArchivoSolicitudHoraExtra;
	protected JMenu jmenuAccionesSolicitudHoraExtra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudHoraExtra;	
	protected GridBagConstraints gridBagConstraintsSolicitudHoraExtra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SolicitudHoraExtraDetalleFormJInternalFrame jInternalFrameDetalleFormSolicitudHoraExtra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSolicitudHoraExtra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSolicitudHoraExtra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";

	protected EmpleadoBeanSwingJInternalFrame empleadoreemplazoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoreemplazo="";
	
	public SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	public EmpleadoSessionBean empleadoreemplazoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SolicitudHoraExtra> solicitudhoraextras;		
	public List<SolicitudHoraExtra> solicitudhoraextrasEliminados;	
	public List<SolicitudHoraExtra> solicitudhoraextrasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySolicitudHoraExtra;		
	protected JButton jButtonAbrirOrderBySolicitudHoraExtra;
	
	
	//protected JPanel jPanelOrderBySolicitudHoraExtra;
	//public JScrollPane jScrollPanelOrderBySolicitudHoraExtra;	
	//protected JButton jButtonCerrarOrderBySolicitudHoraExtra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SolicitudHoraExtraLogic solicitudhoraextraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSolicitudHoraExtra;
	public JScrollPane jScrollPanelDatosEdicionSolicitudHoraExtra;
	public JScrollPane jScrollPanelDatosGeneralSolicitudHoraExtra;
    
	
	
	//public JScrollPane jScrollPanelDatosSolicitudHoraExtraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSolicitudHoraExtra;
	//public JScrollPane jScrollPanelImportacionSolicitudHoraExtra;
	
	
	
	protected JPanel jPanelAccionesSolicitudHoraExtra;
	
    protected JPanel jPanelPaginacionSolicitudHoraExtra;
    protected JPanel jPanelParametrosReportesSolicitudHoraExtra;
	protected JPanel jPanelParametrosReportesAccionesSolicitudHoraExtra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SolicitudHoraExtra;
	protected JPanel jPanelParametrosAuxiliar2SolicitudHoraExtra;
	protected JPanel jPanelParametrosAuxiliar3SolicitudHoraExtra;
	protected JPanel jPanelParametrosAuxiliar4SolicitudHoraExtra;
	//protected JPanel jPanelParametrosAuxiliar5SolicitudHoraExtra;
	
	
	
	//protected JPanel jPanelReporteDinamicoSolicitudHoraExtra;
	//protected JPanel jPanelImportacionSolicitudHoraExtra;
	
	
	public JTable jTableDatosSolicitudHoraExtra;
	
	
	
	//public JTable jTableDatosSolicitudHoraExtraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSolicitudHoraExtra;
	protected JButton jButtonDuplicarSolicitudHoraExtra;
	protected JButton jButtonCopiarSolicitudHoraExtra;
	protected JButton jButtonVerFormSolicitudHoraExtra;
	protected JButton jButtonNuevoRelacionesSolicitudHoraExtra;
	protected JButton jButtonModificarSolicitudHoraExtra;
	
    protected JButton jButtonGuardarCambiosTablaSolicitudHoraExtra;
	protected JButton jButtonCerrarSolicitudHoraExtra;
	
	
	protected JButton jButtonRecargarInformacionSolicitudHoraExtra;
	protected JButton jButtonProcesarInformacionSolicitudHoraExtra;
	
	
	protected JButton jButtonAnterioresSolicitudHoraExtra;
	protected JButton jButtonSiguientesSolicitudHoraExtra;
	protected JButton jButtonNuevoGuardarCambiosSolicitudHoraExtra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSolicitudHoraExtra;
	//protected JButton jButtonCerrarReporteDinamicoSolicitudHoraExtra;
	//protected JButton jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra;	
	
	
	
	//protected JButton jButtonAbrirImportacionSolicitudHoraExtra;
	//protected JButton jButtonGenerarImportacionSolicitudHoraExtra;
	//protected JButton jButtonCerrarImportacionSolicitudHoraExtra;
	//protected JFileChooser jFileChooserImportacionSolicitudHoraExtra;
	//protected File fileImportacionSolicitudHoraExtra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudHoraExtra;
	protected JButton jButtonDuplicarToolBarSolicitudHoraExtra;
	protected JButton jButtonNuevoRelacionesToolBarSolicitudHoraExtra;
	
	
	public JButton jButtonGuardarCambiosToolBarSolicitudHoraExtra;
	protected JButton jButtonCopiarToolBarSolicitudHoraExtra;
	protected JButton jButtonVerFormToolBarSolicitudHoraExtra;
	public JButton jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudHoraExtra;
	protected JButton jButtonCerrarToolBarSolicitudHoraExtra;
	
	protected JButton jButtonRecargarInformacionToolBarSolicitudHoraExtra;
	protected JButton jButtonProcesarInformacionToolBarSolicitudHoraExtra;
	protected JButton jButtonAnterioresToolBarSolicitudHoraExtra;
	protected JButton jButtonSiguientesToolBarSolicitudHoraExtra;
	protected JButton jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra;
	protected JButton jButtonAbrirOrderByToolBarSolicitudHoraExtra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudHoraExtra;
	protected JMenuItem jMenuItemDuplicarSolicitudHoraExtra;
	protected JMenuItem jMenuItemNuevoRelacionesSolicitudHoraExtra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSolicitudHoraExtra;
	protected JMenuItem jMenuItemCopiarSolicitudHoraExtra;
	protected JMenuItem jMenuItemVerFormSolicitudHoraExtra;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudHoraExtra;
	protected JMenuItem jMenuItemCerrarSolicitudHoraExtra;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudHoraExtra;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySolicitudHoraExtra;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudHoraExtra;
	
	protected JMenuItem jMenuItemRecargarInformacionSolicitudHoraExtra;
	protected JMenuItem jMenuItemProcesarInformacionSolicitudHoraExtra;
	protected JMenuItem jMenuItemAnterioresSolicitudHoraExtra;
	protected JMenuItem jMenuItemSiguientesSolicitudHoraExtra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudHoraExtra;
	protected JMenuItem jMenuItemAbrirOrderBySolicitudHoraExtra;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudHoraExtra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudHoraExtra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSolicitudHoraExtra;
	protected JCheckBox jCheckBoxSeleccionadosSolicitudHoraExtra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSolicitudHoraExtra;
	protected JCheckBox jCheckBoxConGraficoReporteSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSolicitudHoraExtra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSolicitudHoraExtra;
	protected JTextField jTextFieldValorCampoGeneralSolicitudHoraExtra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSolicitudHoraExtra;
	//public JList<Reporte> jListColumnasSelectReporteSolicitudHoraExtra;
	//public JScrollPane jScrollColumnasSelectReporteSolicitudHoraExtra;
	
	//public JLabel jLabelRelacionesSelectReporteSolicitudHoraExtra;
	//public JList<Reporte> jListRelacionesSelectReporteSolicitudHoraExtra;
	//public JScrollPane jScrollRelacionesSelectReporteSolicitudHoraExtra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSolicitudHoraExtra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSolicitudHoraExtra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra;
	//public JLabel jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra;
	
		
	//public JLabel jLabelArchivoImportacionSolicitudHoraExtra;	
	//public JLabel jLabelPathArchivoImportacionSolicitudHoraExtra;
	//protected JTextField jTextFieldPathArchivoImportacionSolicitudHoraExtra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSolicitudHoraExtra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra;
	
	//public JLabel jLabelColumnaCategoriaValorSolicitudHoraExtra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSolicitudHoraExtra;
	
	//public JLabel jLabelColumnasValoresGraficoSolicitudHoraExtra;
	//public JList<Reporte> jListColumnasValoresGraficoSolicitudHoraExtra;
	//public JScrollPane jScrollColumnasValoresGraficoSolicitudHoraExtra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSolicitudHoraExtra;
	public JPanel jPanelFK_IdEmpleadoSolicitudHoraExtra;
	public JButton jButtonFK_IdEmpleadoSolicitudHoraExtra;
	public JPanel jPanelFK_IdEmpleadoJefeSolicitudHoraExtra;
	public JButton jButtonFK_IdEmpleadoJefeSolicitudHoraExtra;
	public JPanel jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra;
	public JButton jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra;
	public JPanel jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra;
	public JButton jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra;
	public JPanel jPanelFK_IdEstructuraSolicitudHoraExtra;
	public JButton jButtonFK_IdEstructuraSolicitudHoraExtra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoSolicitudHoraExtra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra;
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudHoraExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra;
	public JLabel jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra;
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra;
	public JLabel jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra;
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra;
	public JLabel jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra;
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraSolicitudHoraExtra;
	public JLabel jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra;
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudHoraExtra= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudHoraExtraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudHoraExtraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudHoraExtraArbol= new JButtonMe();

	
	
	
	
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
	public SolicitudHoraExtraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudHoraExtraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSolicitudHoraExtra)	{
		this.jButtonRecargarInformacionSolicitudHoraExtra = jButtonRecargarInformacionSolicitudHoraExtra;
	}
	
	public JButton getjButtonProcesarInformacionSolicitudHoraExtra() {
		return this.jButtonProcesarInformacionSolicitudHoraExtra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudHoraExtra)	{
		this.jButtonProcesarInformacionSolicitudHoraExtra = jButtonProcesarInformacionSolicitudHoraExtra;
	}
	
	
	public JButton getjButtonRecargarInformacionSolicitudHoraExtra() {
		return this.jButtonRecargarInformacionSolicitudHoraExtra;
	}
	
	
	public List<SolicitudHoraExtra> getsolicitudhoraextras() {
		return this.solicitudhoraextras;
	}

	public void setsolicitudhoraextras(List<SolicitudHoraExtra> solicitudhoraextras) {
		this.solicitudhoraextras = solicitudhoraextras;
	}
	
	public List<SolicitudHoraExtra> getsolicitudhoraextrasAux() {
		return this.solicitudhoraextrasAux;
	}

	public void setsolicitudhoraextrasAux(List<SolicitudHoraExtra> solicitudhoraextrasAux) {
		this.solicitudhoraextrasAux = solicitudhoraextrasAux;
	}
	
	public List<SolicitudHoraExtra> getsolicitudhoraextrasEliminados() {
		return this.solicitudhoraextrasEliminados;
	}

	public void setSolicitudHoraExtrasEliminados(List<SolicitudHoraExtra> solicitudhoraextrasEliminados) {
		this.solicitudhoraextrasEliminados = solicitudhoraextrasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSolicitudHoraExtra() {
		return jComboBoxTiposSeleccionarSolicitudHoraExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSolicitudHoraExtra(
			JComboBox jComboBoxTiposSeleccionarSolicitudHoraExtra) {
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra = jComboBoxTiposSeleccionarSolicitudHoraExtra;
	}
	
	public void setBorderResaltarTiposSeleccionarSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSolicitudHoraExtra() {
		return jTextFieldValorCampoGeneralSolicitudHoraExtra;
	}

	public void setjTextFieldValorCampoGeneralSolicitudHoraExtra(
			JTextField jTextFieldValorCampoGeneralSolicitudHoraExtra) {
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra = jTextFieldValorCampoGeneralSolicitudHoraExtra;
	}

	public void setBorderResaltarValorCampoGeneralSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSolicitudHoraExtra() {
		return this.jCheckBoxSeleccionarTodosSolicitudHoraExtra;
	}

	public void setjCheckBoxSeleccionarTodosSolicitudHoraExtra(
			JCheckBox jCheckBoxSeleccionarTodosSolicitudHoraExtra) {
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra = jCheckBoxSeleccionarTodosSolicitudHoraExtra;
	}

	public void setBorderResaltarSeleccionarTodosSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSolicitudHoraExtra() {
		return this.jCheckBoxSeleccionadosSolicitudHoraExtra;
	}

	public void setjCheckBoxSeleccionadosSolicitudHoraExtra(
			JCheckBox jCheckBoxSeleccionadosSolicitudHoraExtra) {
		this.jCheckBoxSeleccionadosSolicitudHoraExtra = jCheckBoxSeleccionadosSolicitudHoraExtra;
	}
	
	public void setBorderResaltarSeleccionadosSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSolicitudHoraExtra() {
		return this.jComboBoxTiposArchivosReportesSolicitudHoraExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSolicitudHoraExtra(
			JComboBox jComboBoxTiposArchivosReportesSolicitudHoraExtra) {
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra = jComboBoxTiposArchivosReportesSolicitudHoraExtra;
	}

	public void setBorderResaltarTiposArchivosReportesSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSolicitudHoraExtra() {
		return this.jComboBoxTiposReportesSolicitudHoraExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSolicitudHoraExtra(
			JComboBox jComboBoxTiposReportesSolicitudHoraExtra) {
		this.jComboBoxTiposReportesSolicitudHoraExtra = jComboBoxTiposReportesSolicitudHoraExtra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSolicitudHoraExtra() {
	//	return jComboBoxTiposReportesDinamicoSolicitudHoraExtra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSolicitudHoraExtra(
	//		JComboBox jComboBoxTiposReportesDinamicoSolicitudHoraExtra) {
	//	this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra = jComboBoxTiposReportesDinamicoSolicitudHoraExtra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra() {
	//	return jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra = jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra;
	//}
	
	public void setBorderResaltarTiposReportesSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSolicitudHoraExtra() {
		return this.jComboBoxTiposGraficosReportesSolicitudHoraExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSolicitudHoraExtra(
			JComboBox jComboBoxTiposGraficosReportesSolicitudHoraExtra) {
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra = jComboBoxTiposGraficosReportesSolicitudHoraExtra;
	}
	
	public void setBorderResaltarTiposGraficosReportesSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSolicitudHoraExtra() {
		return this.jComboBoxTiposPaginacionSolicitudHoraExtra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSolicitudHoraExtra(
			JComboBox jComboBoxTiposPaginacionSolicitudHoraExtra) {
		this.jComboBoxTiposPaginacionSolicitudHoraExtra = jComboBoxTiposPaginacionSolicitudHoraExtra;
	}
	
	public void setBorderResaltarTiposPaginacionSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSolicitudHoraExtra() {
		return this.jComboBoxTiposRelacionesSolicitudHoraExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudHoraExtra() {
		return this.jComboBoxTiposAccionesSolicitudHoraExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudHoraExtra(
			JComboBox jComboBoxTiposRelacionesSolicitudHoraExtra) {
		this.jComboBoxTiposRelacionesSolicitudHoraExtra = jComboBoxTiposRelacionesSolicitudHoraExtra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudHoraExtra(
			JComboBox jComboBoxTiposAccionesSolicitudHoraExtra) {
		this.jComboBoxTiposAccionesSolicitudHoraExtra = jComboBoxTiposAccionesSolicitudHoraExtra;
	}
	
	public void setBorderResaltarTiposRelacionesSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSolicitudHoraExtra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSolicitudHoraExtra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSolicitudHoraExtra() {
	//	return jCheckBoxConGraficoDinamicoSolicitudHoraExtra;
	//}

	//public void setjCheckBoxConGraficoDinamicoSolicitudHoraExtra(
	//		JCheckBox jCheckBoxConGraficoDinamicoSolicitudHoraExtra) {
	//	this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra = jCheckBoxConGraficoDinamicoSolicitudHoraExtra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSolicitudHoraExtra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSolicitudHoraExtra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra .setBorder(borderResaltar);		
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
		this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		
		this.solicitudhoraextraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudhoraextraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudHoraExtraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Hora Extra MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
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
		
		SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SolicitudHoraExtra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSolicitudHoraExtra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"nuevo","nuevo","Nuevo"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"duplicar","duplicar","Duplicar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"copiar","copiar","Copiar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"ver_form","ver_form","Ver"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"recargar","recargar","Recargar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSolicitudHoraExtra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSolicitudHoraExtra,this.jTtoolBarSolicitudHoraExtra,
							"cerrar","cerrar","Salir"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSolicitudHoraExtra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSolicitudHoraExtra;
			
				this.jButtonProcesarInformacionToolBarSolicitudHoraExtra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSolicitudHoraExtra;
				
		//protected JButton jButtonModificarToolBarSolicitudHoraExtra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSolicitudHoraExtra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSolicitudHoraExtra=new JMenuMe("General");
		this.jmenuArchivoSolicitudHoraExtra=new JMenuMe("Archivo");
		this.jmenuAccionesSolicitudHoraExtra=new JMenuMe("Acciones");
		this.jmenuDatosSolicitudHoraExtra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudHoraExtra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudHoraExtra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudHoraExtra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSolicitudHoraExtra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSolicitudHoraExtra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSolicitudHoraExtra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSolicitudHoraExtra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSolicitudHoraExtra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSolicitudHoraExtra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSolicitudHoraExtra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudHoraExtra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudHoraExtra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSolicitudHoraExtra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSolicitudHoraExtra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSolicitudHoraExtra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSolicitudHoraExtra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSolicitudHoraExtra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSolicitudHoraExtra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudHoraExtra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudHoraExtra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudHoraExtra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSolicitudHoraExtra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSolicitudHoraExtra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSolicitudHoraExtra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSolicitudHoraExtra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSolicitudHoraExtra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSolicitudHoraExtra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSolicitudHoraExtra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSolicitudHoraExtra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSolicitudHoraExtra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSolicitudHoraExtra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSolicitudHoraExtra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSolicitudHoraExtra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySolicitudHoraExtra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySolicitudHoraExtra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySolicitudHoraExtra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudHoraExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudHoraExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudHoraExtra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSolicitudHoraExtra.add(this.jMenuItemCerrarSolicitudHoraExtra);
			
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemNuevoSolicitudHoraExtra);
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemNuevoGuardarCambiosSolicitudHoraExtra);
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemNuevoRelacionesSolicitudHoraExtra);
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemGuardarCambiosTablaSolicitudHoraExtra);		
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemDuplicarSolicitudHoraExtra);		
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemCopiarSolicitudHoraExtra);		
			this.jmenuAccionesSolicitudHoraExtra.add(this.jMenuItemVerFormSolicitudHoraExtra);		
			
			this.jmenuDatosSolicitudHoraExtra.add(this.jMenuItemRecargarInformacionSolicitudHoraExtra);				
			this.jmenuDatosSolicitudHoraExtra.add(this.jMenuItemAnterioresSolicitudHoraExtra);				
			this.jmenuDatosSolicitudHoraExtra.add(this.jMenuItemSiguientesSolicitudHoraExtra);				
			this.jmenuDatosSolicitudHoraExtra.add(this.jMenuItemAbrirOrderBySolicitudHoraExtra);				
			this.jmenuDatosSolicitudHoraExtra.add(this.jMenuItemMostrarOcultarSolicitudHoraExtra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSolicitudHoraExtra.add(this.jMenuItemGuardarCambiosSolicitudHoraExtra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSolicitudHoraExtra.add(this.jmenuArchivoSolicitudHoraExtra);		
			this.jmenuBarSolicitudHoraExtra.add(this.jmenuAccionesSolicitudHoraExtra);		
			this.jmenuBarSolicitudHoraExtra.add(this.jmenuDatosSolicitudHoraExtra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSolicitudHoraExtra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSolicitudHoraExtra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoSolicitudHoraExtra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoSolicitudHoraExtra= new JButtonMe();
		this.jButtonFK_IdEmpleadoSolicitudHoraExtra.setText("Buscar");
		this.jButtonFK_IdEmpleadoSolicitudHoraExtra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoSolicitudHoraExtra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoJefeSolicitudHoraExtra.setToolTipText("Buscar Por Empleado Jefe ");
		this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra= new JButtonMe();
		this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra.setText("Buscar");
		this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra.setToolTipText("Buscar Por Empleado Jefe ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra,"buscar_button","Buscar Por Empleado Jefe ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoJefeSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra = new JLabelMe();
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setText("Empleado Jefe :");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setToolTipText("Empleado Jefe");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra.setToolTipText("Buscar Por Empleado Reemplazo ");
		this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra= new JButtonMe();
		this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra.setText("Buscar");
		this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra.setToolTipText("Buscar Por Empleado Reemplazo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra,"buscar_button","Buscar Por Empleado Reemplazo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra = new JLabelMe();
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setText("Empleado Reemplazo :");
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setToolTipText("Empleado Reemplazo");
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra= new JButtonMe();
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setText("Buscar");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra,"buscar_button","Buscar Por Estado Solicitud Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra = new JLabelMe();
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setText("Estado Solicitud Nomi :");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setToolTipText("Estado Solicitud Nomi");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSolicitudHoraExtra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSolicitudHoraExtra.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraSolicitudHoraExtra= new JButtonMe();
		this.jButtonFK_IdEstructuraSolicitudHoraExtra.setText("Buscar");
		this.jButtonFK_IdEstructuraSolicitudHoraExtra.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSolicitudHoraExtra,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSolicitudHoraExtra=new JTabbedPane();


		this.jTabbedPaneBusquedasSolicitudHoraExtra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudHoraExtra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudHoraExtra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSolicitudHoraExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSolicitudHoraExtra = new SolicitudHoraExtraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Solicitud Hora Extra DATOS");
			this.jInternalFrameDetalleFormSolicitudHoraExtra = new SolicitudHoraExtraDetalleFormJInternalFrame(jDesktopPane,this.solicitudhoraextraSessionBean.getConGuardarRelaciones(),this.solicitudhoraextraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSolicitudHoraExtra = null;//new SolicitudHoraExtraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudHoraExtra= new GridBagLayout();
		
		
		this.jTableDatosSolicitudHoraExtra = new JTableMe();      
		
		String sToolTipSolicitudHoraExtra="";
		sToolTipSolicitudHoraExtra=SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudHoraExtra+="(Nomina.SolicitudHoraExtra)";
		}
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudHoraExtra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSolicitudHoraExtra.setToolTipText(sToolTipSolicitudHoraExtra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSolicitudHoraExtra);
		this.jTableDatosSolicitudHoraExtra.setAutoCreateRowSorter(true);
		this.jTableDatosSolicitudHoraExtra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSolicitudHoraExtra.setRowSelectionAllowed(true);
		this.jTableDatosSolicitudHoraExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSolicitudHoraExtra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSolicitudHoraExtra = new JButtonMe();
		this.jButtonDuplicarSolicitudHoraExtra = new JButtonMe();
		this.jButtonCopiarSolicitudHoraExtra = new JButtonMe();
		this.jButtonVerFormSolicitudHoraExtra = new JButtonMe();
		this.jButtonNuevoRelacionesSolicitudHoraExtra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra = new JButtonMe();
		this.jButtonCerrarSolicitudHoraExtra = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudHoraExtra = new JScrollPane();   
        this.jScrollPanelDatosGeneralSolicitudHoraExtra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Hora Extra";
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudHoraExtra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudHoraExtra.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudHoraExtra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSolicitudHoraExtra=new ReporteDinamicoJInternalFrame(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSolicitudHoraExtra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSolicitudHoraExtra=new ImportacionJInternalFrame(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSolicitudHoraExtra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySolicitudHoraExtra = new JButtonMe();
		
		this.jButtonAbrirOrderBySolicitudHoraExtra.setText("Orden");
		this.jButtonAbrirOrderBySolicitudHoraExtra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudHoraExtra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudHoraExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudHoraExtra,false,this);
			
			//this.cargarOrderBySolicitudHoraExtra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudHoraExtra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudHoraExtra,true,this);
			
			//this.cargarOrderBySolicitudHoraExtra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSolicitudHoraExtra.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudHoraExtra.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudHoraExtra.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosSolicitudHoraExtra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudHoraExtra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudHoraExtra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSolicitudHoraExtra.setText("Nuevo");
		this.jButtonDuplicarSolicitudHoraExtra.setText("Duplicar");
		this.jButtonCopiarSolicitudHoraExtra.setText("Copiar");
		this.jButtonVerFormSolicitudHoraExtra.setText("Ver");
		this.jButtonNuevoRelacionesSolicitudHoraExtra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setText("Guardar");
		this.jButtonCerrarSolicitudHoraExtra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudHoraExtra,"nuevo_button","Nuevo",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSolicitudHoraExtra,"duplicar_button","Duplicar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSolicitudHoraExtra,"copiar_button","Copiar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSolicitudHoraExtra,"ver_form","Ver",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSolicitudHoraExtra,"nuevorelaciones_button","Nuevo Rel",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudHoraExtra,"guardarcambiostabla_button","Guardar",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudHoraExtra,"cerrar_button","Salir",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSolicitudHoraExtra.setToolTipText("Nuevo"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSolicitudHoraExtra.setToolTipText("Duplicar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSolicitudHoraExtra.setToolTipText("Copiar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSolicitudHoraExtra.setToolTipText("Ver"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSolicitudHoraExtra.setToolTipText("Nuevo Rel"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.setToolTipText("Guardar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudHoraExtra.setToolTipText("Salir"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudHoraExtra";
		inputMap = this.jButtonNuevoSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudHoraExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudHoraExtra"));
		
		//DUPLICAR
		sMapKey = "DuplicarSolicitudHoraExtra";
		inputMap = this.jButtonDuplicarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSolicitudHoraExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSolicitudHoraExtra"));
		
		//COPIAR
		sMapKey = "CopiarSolicitudHoraExtra";
		inputMap = this.jButtonCopiarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSolicitudHoraExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSolicitudHoraExtra"));
		
		//VEr FORM
		sMapKey = "VerFormSolicitudHoraExtra";
		inputMap = this.jButtonVerFormSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSolicitudHoraExtra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSolicitudHoraExtra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSolicitudHoraExtra";
		inputMap = this.jButtonNuevoRelacionesSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSolicitudHoraExtra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSolicitudHoraExtra";
		inputMap = this.jButtonModificarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSolicitudHoraExtra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSolicitudHoraExtra";
		inputMap = this.jButtonCerrarSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudHoraExtra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudHoraExtra";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudHoraExtra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSolicitudHoraExtra.setName("jPanelParametrosReportesSolicitudHoraExtra"); 
		
		this.jPanelParametrosReportesAccionesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSolicitudHoraExtra.setName("jPanelParametrosReportesAccionesSolicitudHoraExtra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSolicitudHoraExtra = new JButtonMe();
		this.jButtonRecargarInformacionSolicitudHoraExtra.setText("Recargar");
		this.jButtonRecargarInformacionSolicitudHoraExtra.setToolTipText("Recargar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSolicitudHoraExtra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSolicitudHoraExtra = new JButtonMe();
		this.jButtonProcesarInformacionSolicitudHoraExtra.setText("Procesar");
		this.jButtonProcesarInformacionSolicitudHoraExtra.setToolTipText("Procesar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSolicitudHoraExtra.setVisible(false);
			
		this.jButtonProcesarInformacionSolicitudHoraExtra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudHoraExtra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudHoraExtra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setText("TIPO");       
		this.jComboBoxTiposReportesSolicitudHoraExtra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSolicitudHoraExtra.setText("Paginacion");
		this.jComboBoxTiposPaginacionSolicitudHoraExtra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSolicitudHoraExtra.setText("Accion");
		this.jComboBoxTiposRelacionesSolicitudHoraExtra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudHoraExtra.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setText("Accion");
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudHoraExtra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSolicitudHoraExtra = new JLabelMe();
		
		this.jLabelAccionesSolicitudHoraExtra.setText("Acciones");		
		this.jLabelAccionesSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSolicitudHoraExtra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSolicitudHoraExtra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSolicitudHoraExtra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setText("Graf.");
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSolicitudHoraExtra = new JButtonMe();
		//this.jButtonAnterioresSolicitudHoraExtra.setText("<<");
        this.jButtonAnterioresSolicitudHoraExtra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSolicitudHoraExtra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSolicitudHoraExtra = new JButtonMe();
		//this.jButtonSiguientesSolicitudHoraExtra.setText(">>");
        this.jButtonSiguientesSolicitudHoraExtra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSolicitudHoraExtra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSolicitudHoraExtra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.setText("Nue");
        this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSolicitudHoraExtra,"nuevoguardarcambios_button","Nue",this.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSolicitudHoraExtra";
		inputMap = this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSolicitudHoraExtra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSolicitudHoraExtra";
		inputMap = this.jButtonRecargarInformacionSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSolicitudHoraExtra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSolicitudHoraExtra";
		inputMap = this.jButtonSiguientesSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSolicitudHoraExtra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSolicitudHoraExtra";
		inputMap = this.jButtonAnterioresSolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSolicitudHoraExtra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSolicitudHoraExtra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSolicitudHoraExtra.setMinimumSize(new Dimension(this.getWidth(),SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudHoraExtra.setMaximumSize(new Dimension(this.getWidth(),SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudHoraExtra.setPreferredSize(new Dimension(this.getWidth(),SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudHoraExtraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSolicitudHoraExtra = new GridBagLayout();

			this.jPanelPaginacionSolicitudHoraExtra.setLayout(gridaBagLayoutPaginacionSolicitudHoraExtra);						
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonAnterioresSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					
						
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
			
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonNuevoGuardarCambiosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
						
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonSiguientesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonNuevoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
						
			
			
			if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
				this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
				this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonGuardarCambiosTablaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			}
			
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonDuplicarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonCopiarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonVerFormSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 1;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSolicitudHoraExtra.add(this.jButtonCerrarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		
		this.jButtonRecargarInformacionSolicitudHoraExtra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudHoraExtra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudHoraExtra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudHoraExtra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSolicitudHoraExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudHoraExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudHoraExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudHoraExtra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSolicitudHoraExtra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudHoraExtra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudHoraExtra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudHoraExtra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudHoraExtra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSolicitudHoraExtra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudHoraExtra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudHoraExtra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSolicitudHoraExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSolicitudHoraExtra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SolicitudHoraExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SolicitudHoraExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SolicitudHoraExtra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SolicitudHoraExtra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSolicitudHoraExtra.setLayout(gridaBagParametrosReportesSolicitudHoraExtra);
			this.jPanelParametrosReportesAccionesSolicitudHoraExtra.setLayout(gridaBagParametrosReportesAccionesSolicitudHoraExtra);
			
			
			this.jPanelParametrosAuxiliar1SolicitudHoraExtra.setLayout(gridaBagParametrosAuxiliar1SolicitudHoraExtra);
			this.jPanelParametrosAuxiliar2SolicitudHoraExtra.setLayout(gridaBagParametrosAuxiliar2SolicitudHoraExtra);
			this.jPanelParametrosAuxiliar3SolicitudHoraExtra.setLayout(gridaBagParametrosAuxiliar3SolicitudHoraExtra);
			this.jPanelParametrosAuxiliar4SolicitudHoraExtra.setLayout(gridaBagParametrosAuxiliar4SolicitudHoraExtra);
			//this.jPanelParametrosAuxiliar5SolicitudHoraExtra.setLayout(gridaBagParametrosAuxiliar2SolicitudHoraExtra);			
			
			
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jButtonRecargarInformacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudHoraExtra.add(this.jComboBoxTiposPaginacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudHoraExtra.add(this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudHoraExtra.add(this.jComboBoxTiposArchivosReportesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jPanelParametrosAuxiliar1SolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SolicitudHoraExtra.add(this.jComboBoxTiposReportesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);																		
			
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SolicitudHoraExtra.add(this.jComboBoxTiposGraficosReportesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jPanelParametrosAuxiliar4SolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jComboBoxTiposReportesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jCheckBoxGenerarReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jPanelParametrosAuxiliar2SolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jLabelAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
				this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jButtonAbrirOrderBySolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jComboBoxTiposSeleccionarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			
			
			/*
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jCheckBoxSeleccionarTodosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jCheckBoxConGraficoReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudHoraExtra.add(this.jCheckBoxSeleccionarTodosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);															
				
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudHoraExtra.add(this.jCheckBoxSeleccionadosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);															
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudHoraExtra.add(this.jCheckBoxConGraficoReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jPanelParametrosAuxiliar3SolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jComboBoxTiposAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
	
				
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudHoraExtra.add(this.jTextFieldValorCampoGeneralSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSolicitudHoraExtra = new GridBagLayout();

			this.jScrollPanelDatosSolicitudHoraExtra.setLayout(gridaBagLayoutDatosSolicitudHoraExtra);
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
			
			this.jScrollPanelDatosSolicitudHoraExtra.add(this.jTableDatosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSolicitudHoraExtra.setViewportView(this.jTableDatosSolicitudHoraExtra);
		this.jTableDatosSolicitudHoraExtra.setFillsViewportHeight(true);
		this.jTableDatosSolicitudHoraExtra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSolicitudHoraExtra= new GridBagLayout();
		this.jPanelAccionesSolicitudHoraExtra.setLayout(gridaBagLayoutAccionesSolicitudHoraExtra);
		
		
		/*	
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
			
		this.jPanelAccionesSolicitudHoraExtra.add(this.jButtonNuevoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoSolicitudHoraExtra.setLayout(gridaBagLayoutFK_IdEmpleadoSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		jPanelFK_IdEmpleadoSolicitudHoraExtra.add(jLabelid_empleadoFK_IdEmpleadoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 1;
		jPanelFK_IdEmpleadoSolicitudHoraExtra.add(jComboBoxid_empleadoFK_IdEmpleadoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 1;
		gridBagConstraintsSolicitudHoraExtra.gridx =1;
		jPanelFK_IdEmpleadoSolicitudHoraExtra.add(jButtonFK_IdEmpleadoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		jTabbedPaneBusquedasSolicitudHoraExtra.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoSolicitudHoraExtra);
		jTabbedPaneBusquedasSolicitudHoraExtra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoJefeSolicitudHoraExtra.setLayout(gridaBagLayoutFK_IdEmpleadoJefeSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		jPanelFK_IdEmpleadoJefeSolicitudHoraExtra.add(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 1;
		jPanelFK_IdEmpleadoJefeSolicitudHoraExtra.add(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 1;
		gridBagConstraintsSolicitudHoraExtra.gridx =1;
		jPanelFK_IdEmpleadoJefeSolicitudHoraExtra.add(jButtonFK_IdEmpleadoJefeSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		jTabbedPaneBusquedasSolicitudHoraExtra.addTab("2.-Por Empleado Jefe ", jPanelFK_IdEmpleadoJefeSolicitudHoraExtra);
		jTabbedPaneBusquedasSolicitudHoraExtra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra.setLayout(gridaBagLayoutFK_IdEmpleadoReemplazoSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra.add(jLabelid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 1;
		jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra.add(jComboBoxid_empleado_reemplazoFK_IdEmpleadoReemplazoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 1;
		gridBagConstraintsSolicitudHoraExtra.gridx =1;
		jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra.add(jButtonFK_IdEmpleadoReemplazoSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		jTabbedPaneBusquedasSolicitudHoraExtra.addTab("3.-Por Empleado Reemplazo ", jPanelFK_IdEmpleadoReemplazoSolicitudHoraExtra);
		jTabbedPaneBusquedasSolicitudHoraExtra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra.setLayout(gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra.add(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra.add(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 1;
		gridBagConstraintsSolicitudHoraExtra.gridx =1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra.add(jButtonFK_IdEstadoSolicitudNomiSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		jTabbedPaneBusquedasSolicitudHoraExtra.addTab("4.-Por Estado Solicitud Nomi ", jPanelFK_IdEstadoSolicitudNomiSolicitudHoraExtra);
		jTabbedPaneBusquedasSolicitudHoraExtra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSolicitudHoraExtra.setLayout(gridaBagLayoutFK_IdEstructuraSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		jPanelFK_IdEstructuraSolicitudHoraExtra.add(jLabelid_estructuraFK_IdEstructuraSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 0;
		gridBagConstraintsSolicitudHoraExtra.gridx = 1;
		jPanelFK_IdEstructuraSolicitudHoraExtra.add(jComboBoxid_estructuraFK_IdEstructuraSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudHoraExtra.gridy = 1;
		gridBagConstraintsSolicitudHoraExtra.gridx =1;
		jPanelFK_IdEstructuraSolicitudHoraExtra.add(jButtonFK_IdEstructuraSolicitudHoraExtra, gridBagConstraintsSolicitudHoraExtra);

		jTabbedPaneBusquedasSolicitudHoraExtra.addTab("5.-Por Estructura ", jPanelFK_IdEstructuraSolicitudHoraExtra);
		jTabbedPaneBusquedasSolicitudHoraExtra.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudHoraExtra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudHoraExtra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;		
			//this.gridBagConstraintsSolicitudHoraExtra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudHoraExtra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;		
		//this.gridBagConstraintsSolicitudHoraExtra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSolicitudHoraExtra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSolicitudHoraExtra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;		
			this.gridBagConstraintsSolicitudHoraExtra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSolicitudHoraExtra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);								
		
		
		/*
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		*/		
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudHoraExtra.gridx =0;
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudHoraExtra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
				
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SolicitudHoraExtraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSolicitudHoraExtra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudHoraExtra = new GridBagLayout();
			this.jPanelBusquedasParametrosSolicitudHoraExtra.setLayout(gridaBagLayoutBusquedasParametrosSolicitudHoraExtra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSolicitudHoraExtra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
			
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSolicitudHoraExtra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSolicitudHoraExtra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSolicitudHoraExtra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSolicitudHoraExtra.setName("jPanelReporteDinamicoSolicitudHoraExtra"); 
		
		this.jPanelReporteDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSolicitudHoraExtra.setLayout(gridaBagLayoutReporteDinamicoSolicitudHoraExtra);
		
		
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudHoraExtra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setResizable(true);
	    this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setClosable(true);
	    this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSolicitudHoraExtra = new JLabelMe();

		this.jLabelColumnasSelectReporteSolicitudHoraExtra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelColumnasSelectReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSolicitudHoraExtra = new JList<Reporte>();
		this.jListColumnasSelectReporteSolicitudHoraExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSolicitudHoraExtra=new JScrollPane(this.jListColumnasSelectReporteSolicitudHoraExtra);
			
			this.jScrollColumnasSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jListColumnasSelectReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jScrollColumnasSelectReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSolicitudHoraExtra = new JLabelMe();

		this.jLabelRelacionesSelectReporteSolicitudHoraExtra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSolicitudHoraExtra = new JList<Reporte>();
		this.jListRelacionesSelectReporteSolicitudHoraExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSolicitudHoraExtra=new JScrollPane(this.jListRelacionesSelectReporteSolicitudHoraExtra);
			
			this.jScrollRelacionesSelectReporteSolicitudHoraExtra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudHoraExtra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudHoraExtra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra = new JComboBoxMe();
		this.jListColumnasValoresGraficoSolicitudHoraExtra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSolicitudHoraExtra = new JLabelMe();

		this.jLabelConGraficoDinamicoSolicitudHoraExtra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelConGraficoDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jCheckBoxConGraficoDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelColumnaCategoriaGraficoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSolicitudHoraExtra = new JLabelMe();

		this.jLabelColumnaCategoriaValorSolicitudHoraExtra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelColumnaCategoriaValorSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jComboBoxColumnaCategoriaValorSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSolicitudHoraExtra = new JLabelMe();

		this.jLabelColumnasValoresGraficoSolicitudHoraExtra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelColumnasValoresGraficoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSolicitudHoraExtra = new JList<Reporte>();
		this.jListColumnasValoresGraficoSolicitudHoraExtra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSolicitudHoraExtra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSolicitudHoraExtra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudHoraExtra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudHoraExtra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSolicitudHoraExtra=new JScrollPane(this.jListColumnasValoresGraficoSolicitudHoraExtra);
			
			this.jScrollColumnasValoresGraficoSolicitudHoraExtra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudHoraExtra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudHoraExtra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jListColumnasSelectReporteSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jScrollColumnasValoresGraficoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelTiposGraficosReportesDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudHoraExtra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jComboBoxTiposGraficosReportesDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelGenerarExcelReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra.setToolTipText("Generar EXCEL"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jButtonGenerarExcelReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jComboBoxTiposReportesDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jLabelTiposArchivoReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jComboBoxTiposArchivosReportesDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSolicitudHoraExtra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSolicitudHoraExtra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSolicitudHoraExtra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSolicitudHoraExtra.setToolTipText("Generar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jButtonGenerarReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSolicitudHoraExtra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSolicitudHoraExtra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSolicitudHoraExtra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSolicitudHoraExtra.setToolTipText("Cancelar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudHoraExtra.add(this.jButtonCerrarReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSolicitudHoraExtra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra= new JScrollPane(jPanelReporteDinamicoSolicitudHoraExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSolicitudHoraExtra);
		this.jInternalFrameReporteDinamicoSolicitudHoraExtra.getContentPane().add(this.jScrollPanelReporteDinamicoSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSolicitudHoraExtra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSolicitudHoraExtra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSolicitudHoraExtra.setName("jPanelImportacionSolicitudHoraExtra"); 
		
		this.jPanelImportacionSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSolicitudHoraExtra.setLayout(gridaBagLayoutImportacionSolicitudHoraExtra);
		
		
		this.jInternalFrameImportacionSolicitudHoraExtra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSolicitudHoraExtra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSolicitudHoraExtra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudHoraExtra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSolicitudHoraExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudHoraExtra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSolicitudHoraExtra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudHoraExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudHoraExtra.setResizable(true);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setClosable(true);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSolicitudHoraExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudHoraExtra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSolicitudHoraExtra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudHoraExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudHoraExtra.setResizable(true);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setClosable(true);
	    this.jInternalFrameImportacionSolicitudHoraExtra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSolicitudHoraExtra = new JLabelMe();

		this.jLabelArchivoImportacionSolicitudHoraExtra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudHoraExtra.add(this.jLabelArchivoImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSolicitudHoraExtra = new JFileChooser();		
		this.jFileChooserImportacionSolicitudHoraExtra.setToolTipText("ESCOGER ARCHIVO"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSolicitudHoraExtra = new JButtonMe();
		this.jButtonAbrirImportacionSolicitudHoraExtra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSolicitudHoraExtra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSolicitudHoraExtra.setToolTipText("Generar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudHoraExtra.add(this.jButtonAbrirImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSolicitudHoraExtra = new JLabelMe();

		this.jLabelPathArchivoImportacionSolicitudHoraExtra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSolicitudHoraExtra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudHoraExtra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudHoraExtra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudHoraExtra.add(this.jLabelPathArchivoImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSolicitudHoraExtra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSolicitudHoraExtra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudHoraExtra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudHoraExtra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudHoraExtra.add(this.jTextFieldPathArchivoImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSolicitudHoraExtra = new JButtonMe();
		this.jButtonGenerarImportacionSolicitudHoraExtra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSolicitudHoraExtra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSolicitudHoraExtra.setToolTipText("Generar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudHoraExtra.add(this.jButtonGenerarImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSolicitudHoraExtra = new JButtonMe();
		this.jButtonCerrarImportacionSolicitudHoraExtra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSolicitudHoraExtra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSolicitudHoraExtra.setToolTipText("Cancelar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudHoraExtra.add(this.jButtonCerrarImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSolicitudHoraExtra = new GridBagLayout();
		
		this.jScrollPanelImportacionSolicitudHoraExtra= new JScrollPane(jPanelImportacionSolicitudHoraExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
		this.gridBagConstraintsSolicitudHoraExtra.gridy =iPosYImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXImportacion;
		this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSolicitudHoraExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSolicitudHoraExtra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSolicitudHoraExtra);
		this.jInternalFrameImportacionSolicitudHoraExtra.getContentPane().add(this.jScrollPanelImportacionSolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySolicitudHoraExtra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySolicitudHoraExtra = new JButtonMe();
			this.jButtonAbrirOrderBySolicitudHoraExtra.setText("Orden");
			this.jButtonAbrirOrderBySolicitudHoraExtra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudHoraExtra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySolicitudHoraExtra";
			inputMap = this.jButtonAbrirOrderBySolicitudHoraExtra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySolicitudHoraExtra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySolicitudHoraExtra"));
		
		
			GridBagLayout gridaBagLayoutOrderBySolicitudHoraExtra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySolicitudHoraExtra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySolicitudHoraExtra.setName("jPanelOrderBySolicitudHoraExtra"); 
			
			this.jPanelOrderBySolicitudHoraExtra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudHoraExtra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudHoraExtra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySolicitudHoraExtra.setLayout(gridaBagLayoutOrderBySolicitudHoraExtra);
			
			
			this.jTableDatosSolicitudHoraExtraOrderBy = new JTableMe();        
			this.jTableDatosSolicitudHoraExtraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSolicitudHoraExtraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSolicitudHoraExtraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSolicitudHoraExtraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSolicitudHoraExtraOrderBy.setViewportView(this.jTableDatosSolicitudHoraExtraOrderBy);
			this.jTableDatosSolicitudHoraExtraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSolicitudHoraExtraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySolicitudHoraExtra= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySolicitudHoraExtra= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySolicitudHoraExtra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSolicitudHoraExtra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySolicitudHoraExtra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySolicitudHoraExtra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySolicitudHoraExtra.setTitle("Orden");
			this.jInternalFrameOrderBySolicitudHoraExtra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySolicitudHoraExtra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySolicitudHoraExtra.setResizable(true);
			this.jInternalFrameOrderBySolicitudHoraExtra.setClosable(true);
			this.jInternalFrameOrderBySolicitudHoraExtra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySolicitudHoraExtra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudHoraExtra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudHoraExtra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySolicitudHoraExtra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Hora Extras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSolicitudHoraExtra.ipady =150;
				
			this.jPanelOrderBySolicitudHoraExtra.add(jScrollPanelDatosSolicitudHoraExtraOrderBy, this.gridBagConstraintsSolicitudHoraExtra);//this.jTableDatosSolicitudHoraExtraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySolicitudHoraExtra = new JButtonMe();
			this.jButtonCerrarOrderBySolicitudHoraExtra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySolicitudHoraExtra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySolicitudHoraExtra.setToolTipText("Cancelar"+" "+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySolicitudHoraExtra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudHoraExtra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSolicitudHoraExtra.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySolicitudHoraExtra.add(this.jButtonCerrarOrderBySolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSolicitudHoraExtra = new GridBagLayout();
			
			this.jScrollPanelOrderBySolicitudHoraExtra= new JScrollPane(jPanelOrderBySolicitudHoraExtra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSolicitudHoraExtra = new GridBagConstraints();
			this.gridBagConstraintsSolicitudHoraExtra.gridy =iPosYOrderBy;
			this.gridBagConstraintsSolicitudHoraExtra.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudHoraExtra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySolicitudHoraExtra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySolicitudHoraExtra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSolicitudHoraExtra);
			
			this.jInternalFrameOrderBySolicitudHoraExtra.getContentPane().add(this.jScrollPanelOrderBySolicitudHoraExtra, this.gridBagConstraintsSolicitudHoraExtra);			
		
		} else {
			this.jButtonAbrirOrderBySolicitudHoraExtra = new JButtonMe();
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
			&& this.solicitudhoraextraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSolicitudHoraExtra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSolicitudHoraExtra.getRowHeight();//SolicitudHoraExtraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.isSelected()) {
					iHeightTable=SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudHoraExtra.isSelected()) {
					iHeightTable=SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudHoraExtraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySolicitudHoraExtra!=null && this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy()!=null) {
			//if(!this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySolicitudHoraExtra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySolicitudHoraExtra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySolicitudHoraExtra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySolicitudHoraExtra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSolicitudHoraExtra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudHoraExtra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudHoraExtra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=solicitudhoraextraLogic.getSolicitudHoraExtras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudhoraextras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SolicitudHoraExtra> TraerSolicitudHoraExtraBeans(List<SolicitudHoraExtra> solicitudhoraextras,ArrayList<Classe> classes)throws Exception {
		try {
			for(SolicitudHoraExtra solicitudhoraextra:solicitudhoraextras) {
					
				if(!(SolicitudHoraExtraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SolicitudHoraExtraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					solicitudhoraextra.setsDetalleGeneralEntityReporte(SolicitudHoraExtraConstantesFunciones.getSolicitudHoraExtraDescripcion(solicitudhoraextra));
										
						
					
						
					
				} else  {
							
					//solicitudhoraextra.setsDetalleGeneralEntityReporte(solicitudhoraextra.getsDetalleGeneralEntityReporte());
										
				}
				
				//solicitudhoraextrabeans.add(solicitudhoraextrabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return solicitudhoraextras;
    }
	//PARA REPORTES FIN
}
