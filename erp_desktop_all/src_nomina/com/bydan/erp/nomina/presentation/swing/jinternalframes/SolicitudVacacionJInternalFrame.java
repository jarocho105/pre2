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
import com.bydan.erp.nomina.util.SolicitudVacacionConstantesFunciones;

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
public class SolicitudVacacionJInternalFrame extends SolicitudVacacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSolicitudVacacion;
	
	protected JMenuBar jmenuBarSolicitudVacacion;
	
	protected JMenu jmenuSolicitudVacacion;
	protected JMenu jmenuDatosSolicitudVacacion;
	protected JMenu jmenuArchivoSolicitudVacacion;
	protected JMenu jmenuAccionesSolicitudVacacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSolicitudVacacion;	
	protected GridBagConstraints gridBagConstraintsSolicitudVacacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SolicitudVacacionDetalleFormJInternalFrame jInternalFrameDetalleFormSolicitudVacacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSolicitudVacacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSolicitudVacacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadojefeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadojefe="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstadoSolicitudNomiBeanSwingJInternalFrame estadosolicitudnomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadosolicitudnomi="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public SolicitudVacacionSessionBean solicitudvacacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadojefeSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	public FormatoSessionBean formatoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<SolicitudVacacion> solicitudvacacions;		
	public List<SolicitudVacacion> solicitudvacacionsEliminados;	
	public List<SolicitudVacacion> solicitudvacacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySolicitudVacacion;		
	protected JButton jButtonAbrirOrderBySolicitudVacacion;
	
	
	//protected JPanel jPanelOrderBySolicitudVacacion;
	//public JScrollPane jScrollPanelOrderBySolicitudVacacion;	
	//protected JButton jButtonCerrarOrderBySolicitudVacacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SolicitudVacacionLogic solicitudvacacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSolicitudVacacion;
	public JScrollPane jScrollPanelDatosEdicionSolicitudVacacion;
	public JScrollPane jScrollPanelDatosGeneralSolicitudVacacion;
    
	
	
	//public JScrollPane jScrollPanelDatosSolicitudVacacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSolicitudVacacion;
	//public JScrollPane jScrollPanelImportacionSolicitudVacacion;
	
	
	
	protected JPanel jPanelAccionesSolicitudVacacion;
	
    protected JPanel jPanelPaginacionSolicitudVacacion;
    protected JPanel jPanelParametrosReportesSolicitudVacacion;
	protected JPanel jPanelParametrosReportesAccionesSolicitudVacacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1SolicitudVacacion;
	protected JPanel jPanelParametrosAuxiliar2SolicitudVacacion;
	protected JPanel jPanelParametrosAuxiliar3SolicitudVacacion;
	protected JPanel jPanelParametrosAuxiliar4SolicitudVacacion;
	//protected JPanel jPanelParametrosAuxiliar5SolicitudVacacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoSolicitudVacacion;
	//protected JPanel jPanelImportacionSolicitudVacacion;
	
	
	public JTable jTableDatosSolicitudVacacion;
	
	
	
	//public JTable jTableDatosSolicitudVacacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSolicitudVacacion;
	protected JButton jButtonDuplicarSolicitudVacacion;
	protected JButton jButtonCopiarSolicitudVacacion;
	protected JButton jButtonVerFormSolicitudVacacion;
	protected JButton jButtonNuevoRelacionesSolicitudVacacion;
	protected JButton jButtonModificarSolicitudVacacion;
	
    protected JButton jButtonGuardarCambiosTablaSolicitudVacacion;
	protected JButton jButtonCerrarSolicitudVacacion;
	
	
	protected JButton jButtonRecargarInformacionSolicitudVacacion;
	protected JButton jButtonProcesarInformacionSolicitudVacacion;
	
	
	protected JButton jButtonAnterioresSolicitudVacacion;
	protected JButton jButtonSiguientesSolicitudVacacion;
	protected JButton jButtonNuevoGuardarCambiosSolicitudVacacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSolicitudVacacion;
	//protected JButton jButtonCerrarReporteDinamicoSolicitudVacacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoSolicitudVacacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionSolicitudVacacion;
	//protected JButton jButtonGenerarImportacionSolicitudVacacion;
	//protected JButton jButtonCerrarImportacionSolicitudVacacion;
	//protected JFileChooser jFileChooserImportacionSolicitudVacacion;
	//protected File fileImportacionSolicitudVacacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSolicitudVacacion;
	protected JButton jButtonDuplicarToolBarSolicitudVacacion;
	protected JButton jButtonNuevoRelacionesToolBarSolicitudVacacion;
	
	
	public JButton jButtonGuardarCambiosToolBarSolicitudVacacion;
	protected JButton jButtonCopiarToolBarSolicitudVacacion;
	protected JButton jButtonVerFormToolBarSolicitudVacacion;
	public JButton jButtonGuardarCambiosTablaToolBarSolicitudVacacion;
	protected JButton jButtonMostrarOcultarTablaToolBarSolicitudVacacion;
	protected JButton jButtonCerrarToolBarSolicitudVacacion;
	
	protected JButton jButtonRecargarInformacionToolBarSolicitudVacacion;
	protected JButton jButtonProcesarInformacionToolBarSolicitudVacacion;
	protected JButton jButtonAnterioresToolBarSolicitudVacacion;
	protected JButton jButtonSiguientesToolBarSolicitudVacacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarSolicitudVacacion;
	protected JButton jButtonAbrirOrderByToolBarSolicitudVacacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSolicitudVacacion;
	protected JMenuItem jMenuItemDuplicarSolicitudVacacion;
	protected JMenuItem jMenuItemNuevoRelacionesSolicitudVacacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSolicitudVacacion;
	protected JMenuItem jMenuItemCopiarSolicitudVacacion;
	protected JMenuItem jMenuItemVerFormSolicitudVacacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaSolicitudVacacion;
	protected JMenuItem jMenuItemCerrarSolicitudVacacion;
	protected JMenuItem jMenuItemDetalleCerrarSolicitudVacacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySolicitudVacacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarSolicitudVacacion;
	
	protected JMenuItem jMenuItemRecargarInformacionSolicitudVacacion;
	protected JMenuItem jMenuItemProcesarInformacionSolicitudVacacion;
	protected JMenuItem jMenuItemAnterioresSolicitudVacacion;
	protected JMenuItem jMenuItemSiguientesSolicitudVacacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSolicitudVacacion;
	protected JMenuItem jMenuItemAbrirOrderBySolicitudVacacion;
	protected JMenuItem jMenuItemMostrarOcultarSolicitudVacacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSolicitudVacacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSolicitudVacacion;
	protected JCheckBox jCheckBoxSeleccionadosSolicitudVacacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSolicitudVacacion;
	protected JCheckBox jCheckBoxConGraficoReporteSolicitudVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSolicitudVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSolicitudVacacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSolicitudVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSolicitudVacacion;
	protected JTextField jTextFieldValorCampoGeneralSolicitudVacacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSolicitudVacacion;
	//public JList<Reporte> jListColumnasSelectReporteSolicitudVacacion;
	//public JScrollPane jScrollColumnasSelectReporteSolicitudVacacion;
	
	//public JLabel jLabelRelacionesSelectReporteSolicitudVacacion;
	//public JList<Reporte> jListRelacionesSelectReporteSolicitudVacacion;
	//public JScrollPane jScrollRelacionesSelectReporteSolicitudVacacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSolicitudVacacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSolicitudVacacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSolicitudVacacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoSolicitudVacacion;
	
		
	//public JLabel jLabelArchivoImportacionSolicitudVacacion;	
	//public JLabel jLabelPathArchivoImportacionSolicitudVacacion;
	//protected JTextField jTextFieldPathArchivoImportacionSolicitudVacacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSolicitudVacacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSolicitudVacacion;
	
	//public JLabel jLabelColumnaCategoriaValorSolicitudVacacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSolicitudVacacion;
	
	//public JLabel jLabelColumnasValoresGraficoSolicitudVacacion;
	//public JList<Reporte> jListColumnasValoresGraficoSolicitudVacacion;
	//public JScrollPane jScrollColumnasValoresGraficoSolicitudVacacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSolicitudVacacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSolicitudVacacion;
	public JPanel jPanelFK_IdEmpleadoSolicitudVacacion;
	public JButton jButtonFK_IdEmpleadoSolicitudVacacion;
	public JPanel jPanelFK_IdEmpleadoJefeSolicitudVacacion;
	public JButton jButtonFK_IdEmpleadoJefeSolicitudVacacion;
	public JPanel jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion;
	public JButton jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion;
	public JPanel jPanelFK_IdEstructuraSolicitudVacacion;
	public JButton jButtonFK_IdEstructuraSolicitudVacacion;
	public JPanel jPanelFK_IdFormatoSolicitudVacacion;
	public JButton jButtonFK_IdFormatoSolicitudVacacion;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoSolicitudVacacion;
	public JLabel jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion;
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoSolicitudVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion;
	public JLabel jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion;
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion;
	public JLabel jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion;
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraSolicitudVacacion;
	public JLabel jLabelid_estructuraFK_IdEstructuraSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion;
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraSolicitudVacacionArbol= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoSolicitudVacacion;
	public JLabel jLabelid_formatoFK_IdFormatoSolicitudVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoSolicitudVacacion;
	public JButton jButtonid_formatoFK_IdFormatoSolicitudVacacion= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoSolicitudVacacionUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoSolicitudVacacionBusqueda= new JButtonMe();

	
	
	
	
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
	public SolicitudVacacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SolicitudVacacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSolicitudVacacion)	{
		this.jButtonRecargarInformacionSolicitudVacacion = jButtonRecargarInformacionSolicitudVacacion;
	}
	
	public JButton getjButtonProcesarInformacionSolicitudVacacion() {
		return this.jButtonProcesarInformacionSolicitudVacacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSolicitudVacacion)	{
		this.jButtonProcesarInformacionSolicitudVacacion = jButtonProcesarInformacionSolicitudVacacion;
	}
	
	
	public JButton getjButtonRecargarInformacionSolicitudVacacion() {
		return this.jButtonRecargarInformacionSolicitudVacacion;
	}
	
	
	public List<SolicitudVacacion> getsolicitudvacacions() {
		return this.solicitudvacacions;
	}

	public void setsolicitudvacacions(List<SolicitudVacacion> solicitudvacacions) {
		this.solicitudvacacions = solicitudvacacions;
	}
	
	public List<SolicitudVacacion> getsolicitudvacacionsAux() {
		return this.solicitudvacacionsAux;
	}

	public void setsolicitudvacacionsAux(List<SolicitudVacacion> solicitudvacacionsAux) {
		this.solicitudvacacionsAux = solicitudvacacionsAux;
	}
	
	public List<SolicitudVacacion> getsolicitudvacacionsEliminados() {
		return this.solicitudvacacionsEliminados;
	}

	public void setSolicitudVacacionsEliminados(List<SolicitudVacacion> solicitudvacacionsEliminados) {
		this.solicitudvacacionsEliminados = solicitudvacacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSolicitudVacacion() {
		return jComboBoxTiposSeleccionarSolicitudVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSolicitudVacacion(
			JComboBox jComboBoxTiposSeleccionarSolicitudVacacion) {
		this.jComboBoxTiposSeleccionarSolicitudVacacion = jComboBoxTiposSeleccionarSolicitudVacacion;
	}
	
	public void setBorderResaltarTiposSeleccionarSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSolicitudVacacion() {
		return jTextFieldValorCampoGeneralSolicitudVacacion;
	}

	public void setjTextFieldValorCampoGeneralSolicitudVacacion(
			JTextField jTextFieldValorCampoGeneralSolicitudVacacion) {
		this.jTextFieldValorCampoGeneralSolicitudVacacion = jTextFieldValorCampoGeneralSolicitudVacacion;
	}

	public void setBorderResaltarValorCampoGeneralSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSolicitudVacacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSolicitudVacacion() {
		return this.jCheckBoxSeleccionarTodosSolicitudVacacion;
	}

	public void setjCheckBoxSeleccionarTodosSolicitudVacacion(
			JCheckBox jCheckBoxSeleccionarTodosSolicitudVacacion) {
		this.jCheckBoxSeleccionarTodosSolicitudVacacion = jCheckBoxSeleccionarTodosSolicitudVacacion;
	}

	public void setBorderResaltarSeleccionarTodosSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSolicitudVacacion() {
		return this.jCheckBoxSeleccionadosSolicitudVacacion;
	}

	public void setjCheckBoxSeleccionadosSolicitudVacacion(
			JCheckBox jCheckBoxSeleccionadosSolicitudVacacion) {
		this.jCheckBoxSeleccionadosSolicitudVacacion = jCheckBoxSeleccionadosSolicitudVacacion;
	}
	
	public void setBorderResaltarSeleccionadosSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSolicitudVacacion() {
		return this.jComboBoxTiposArchivosReportesSolicitudVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSolicitudVacacion(
			JComboBox jComboBoxTiposArchivosReportesSolicitudVacacion) {
		this.jComboBoxTiposArchivosReportesSolicitudVacacion = jComboBoxTiposArchivosReportesSolicitudVacacion;
	}

	public void setBorderResaltarTiposArchivosReportesSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSolicitudVacacion() {
		return this.jComboBoxTiposReportesSolicitudVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSolicitudVacacion(
			JComboBox jComboBoxTiposReportesSolicitudVacacion) {
		this.jComboBoxTiposReportesSolicitudVacacion = jComboBoxTiposReportesSolicitudVacacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSolicitudVacacion() {
	//	return jComboBoxTiposReportesDinamicoSolicitudVacacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSolicitudVacacion(
	//		JComboBox jComboBoxTiposReportesDinamicoSolicitudVacacion) {
	//	this.jComboBoxTiposReportesDinamicoSolicitudVacacion = jComboBoxTiposReportesDinamicoSolicitudVacacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSolicitudVacacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSolicitudVacacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion = jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion;
	//}
	
	public void setBorderResaltarTiposReportesSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSolicitudVacacion() {
		return this.jComboBoxTiposGraficosReportesSolicitudVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSolicitudVacacion(
			JComboBox jComboBoxTiposGraficosReportesSolicitudVacacion) {
		this.jComboBoxTiposGraficosReportesSolicitudVacacion = jComboBoxTiposGraficosReportesSolicitudVacacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSolicitudVacacion() {
		return this.jComboBoxTiposPaginacionSolicitudVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSolicitudVacacion(
			JComboBox jComboBoxTiposPaginacionSolicitudVacacion) {
		this.jComboBoxTiposPaginacionSolicitudVacacion = jComboBoxTiposPaginacionSolicitudVacacion;
	}
	
	public void setBorderResaltarTiposPaginacionSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSolicitudVacacion() {
		return this.jComboBoxTiposRelacionesSolicitudVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSolicitudVacacion() {
		return this.jComboBoxTiposAccionesSolicitudVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSolicitudVacacion(
			JComboBox jComboBoxTiposRelacionesSolicitudVacacion) {
		this.jComboBoxTiposRelacionesSolicitudVacacion = jComboBoxTiposRelacionesSolicitudVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSolicitudVacacion(
			JComboBox jComboBoxTiposAccionesSolicitudVacacion) {
		this.jComboBoxTiposAccionesSolicitudVacacion = jComboBoxTiposAccionesSolicitudVacacion;
	}
	
	public void setBorderResaltarTiposRelacionesSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSolicitudVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSolicitudVacacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSolicitudVacacion() {
	//	return jCheckBoxConGraficoDinamicoSolicitudVacacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoSolicitudVacacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoSolicitudVacacion) {
	//	this.jCheckBoxConGraficoDinamicoSolicitudVacacion = jCheckBoxConGraficoDinamicoSolicitudVacacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSolicitudVacacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSolicitudVacacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSolicitudVacacion .setBorder(borderResaltar);		
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
		this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		
		this.solicitudvacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.solicitudvacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.solicitudvacacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SolicitudVacacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Vacacion MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
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
		
		SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("SolicitudVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSolicitudVacacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"nuevo","nuevo","Nuevo"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"duplicar","duplicar","Duplicar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"copiar","copiar","Copiar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"ver_form","ver_form","Ver"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"recargar","recargar","Recargar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSolicitudVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSolicitudVacacion,this.jTtoolBarSolicitudVacacion,
							"cerrar","cerrar","Salir"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSolicitudVacacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSolicitudVacacion;
			
				this.jButtonProcesarInformacionToolBarSolicitudVacacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSolicitudVacacion;
				
		//protected JButton jButtonModificarToolBarSolicitudVacacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSolicitudVacacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSolicitudVacacion=new JMenuMe("General");
		this.jmenuArchivoSolicitudVacacion=new JMenuMe("Archivo");
		this.jmenuAccionesSolicitudVacacion=new JMenuMe("Acciones");
		this.jmenuDatosSolicitudVacacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSolicitudVacacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSolicitudVacacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSolicitudVacacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSolicitudVacacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSolicitudVacacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSolicitudVacacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSolicitudVacacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSolicitudVacacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSolicitudVacacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSolicitudVacacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSolicitudVacacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSolicitudVacacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSolicitudVacacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSolicitudVacacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSolicitudVacacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSolicitudVacacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSolicitudVacacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSolicitudVacacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSolicitudVacacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSolicitudVacacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSolicitudVacacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSolicitudVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSolicitudVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSolicitudVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSolicitudVacacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSolicitudVacacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSolicitudVacacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSolicitudVacacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSolicitudVacacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSolicitudVacacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSolicitudVacacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSolicitudVacacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSolicitudVacacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSolicitudVacacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSolicitudVacacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSolicitudVacacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySolicitudVacacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySolicitudVacacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySolicitudVacacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSolicitudVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSolicitudVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSolicitudVacacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySolicitudVacacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySolicitudVacacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySolicitudVacacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSolicitudVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSolicitudVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSolicitudVacacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSolicitudVacacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSolicitudVacacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSolicitudVacacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSolicitudVacacion.add(this.jMenuItemCerrarSolicitudVacacion);
			
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemNuevoSolicitudVacacion);
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemNuevoGuardarCambiosSolicitudVacacion);
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemNuevoRelacionesSolicitudVacacion);
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemGuardarCambiosTablaSolicitudVacacion);		
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemDuplicarSolicitudVacacion);		
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemCopiarSolicitudVacacion);		
			this.jmenuAccionesSolicitudVacacion.add(this.jMenuItemVerFormSolicitudVacacion);		
			
			this.jmenuDatosSolicitudVacacion.add(this.jMenuItemRecargarInformacionSolicitudVacacion);				
			this.jmenuDatosSolicitudVacacion.add(this.jMenuItemAnterioresSolicitudVacacion);				
			this.jmenuDatosSolicitudVacacion.add(this.jMenuItemSiguientesSolicitudVacacion);				
			this.jmenuDatosSolicitudVacacion.add(this.jMenuItemAbrirOrderBySolicitudVacacion);				
			this.jmenuDatosSolicitudVacacion.add(this.jMenuItemMostrarOcultarSolicitudVacacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSolicitudVacacion.add(this.jMenuItemGuardarCambiosSolicitudVacacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSolicitudVacacion.add(this.jmenuArchivoSolicitudVacacion);		
			this.jmenuBarSolicitudVacacion.add(this.jmenuAccionesSolicitudVacacion);		
			this.jmenuBarSolicitudVacacion.add(this.jmenuDatosSolicitudVacacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSolicitudVacacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSolicitudVacacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoSolicitudVacacion.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoSolicitudVacacion= new JButtonMe();
		this.jButtonFK_IdEmpleadoSolicitudVacacion.setText("Buscar");
		this.jButtonFK_IdEmpleadoSolicitudVacacion.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoSolicitudVacacion,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoJefeSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoJefeSolicitudVacacion.setToolTipText("Buscar Por Empleado Jefe ");
		this.jButtonFK_IdEmpleadoJefeSolicitudVacacion= new JButtonMe();
		this.jButtonFK_IdEmpleadoJefeSolicitudVacacion.setText("Buscar");
		this.jButtonFK_IdEmpleadoJefeSolicitudVacacion.setToolTipText("Buscar Por Empleado Jefe ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoJefeSolicitudVacacion,"buscar_button","Buscar Por Empleado Jefe ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoJefeSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion = new JLabelMe();
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setText("Empleado Jefe :");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setToolTipText("Empleado Jefe");
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion= new JButtonMe();
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion.setText("Buscar");
		this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion.setToolTipText("Buscar Por Estado Solicitud Nomi ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion,"buscar_button","Buscar Por Estado Solicitud Nomi ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion = new JLabelMe();
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setText("Estado Solicitud Nomi :");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setToolTipText("Estado Solicitud Nomi");
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSolicitudVacacion.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraSolicitudVacacion= new JButtonMe();
		this.jButtonFK_IdEstructuraSolicitudVacacion.setText("Buscar");
		this.jButtonFK_IdEstructuraSolicitudVacacion.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSolicitudVacacion,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoSolicitudVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoSolicitudVacacion.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoSolicitudVacacion= new JButtonMe();
		this.jButtonFK_IdFormatoSolicitudVacacion.setText("Buscar");
		this.jButtonFK_IdFormatoSolicitudVacacion.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoSolicitudVacacion,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoSolicitudVacacion = new JLabelMe();
		jLabelid_formatoFK_IdFormatoSolicitudVacacion.setText("Formato :");
		jLabelid_formatoFK_IdFormatoSolicitudVacacion.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoSolicitudVacacion= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSolicitudVacacion=new JTabbedPane();


		this.jTabbedPaneBusquedasSolicitudVacacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudVacacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSolicitudVacacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSolicitudVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleSolicitudVacacion = new SolicitudVacacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Solicitud Vacacion DATOS");
			this.jInternalFrameDetalleFormSolicitudVacacion = new SolicitudVacacionDetalleFormJInternalFrame(jDesktopPane,this.solicitudvacacionSessionBean.getConGuardarRelaciones(),this.solicitudvacacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSolicitudVacacion = null;//new SolicitudVacacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSolicitudVacacion= new GridBagLayout();
		
		
		this.jTableDatosSolicitudVacacion = new JTableMe();      
		
		String sToolTipSolicitudVacacion="";
		sToolTipSolicitudVacacion=SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSolicitudVacacion+="(Nomina.SolicitudVacacion)";
		}
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipSolicitudVacacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSolicitudVacacion.setToolTipText(sToolTipSolicitudVacacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSolicitudVacacion);
		this.jTableDatosSolicitudVacacion.setAutoCreateRowSorter(true);
		this.jTableDatosSolicitudVacacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSolicitudVacacion.setRowSelectionAllowed(true);
		this.jTableDatosSolicitudVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSolicitudVacacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSolicitudVacacion = new JButtonMe();
		this.jButtonDuplicarSolicitudVacacion = new JButtonMe();
		this.jButtonCopiarSolicitudVacacion = new JButtonMe();
		this.jButtonVerFormSolicitudVacacion = new JButtonMe();
		this.jButtonNuevoRelacionesSolicitudVacacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion = new JButtonMe();
		this.jButtonCerrarSolicitudVacacion = new JButtonMe();
		
		this.jScrollPanelDatosSolicitudVacacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralSolicitudVacacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Vacacion";
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosSolicitudVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSolicitudVacacion.setToolTipText("Acciones");
        this.jPanelAccionesSolicitudVacacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSolicitudVacacion=new ReporteDinamicoJInternalFrame(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSolicitudVacacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSolicitudVacacion=new ImportacionJInternalFrame(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSolicitudVacacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySolicitudVacacion = new JButtonMe();
		
		this.jButtonAbrirOrderBySolicitudVacacion.setText("Orden");
		this.jButtonAbrirOrderBySolicitudVacacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudVacacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudVacacion,false,this);
			
			//this.cargarOrderBySolicitudVacacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySolicitudVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySolicitudVacacion,true,this);
			
			//this.cargarOrderBySolicitudVacacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSolicitudVacacion.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudVacacion.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosSolicitudVacacion.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosSolicitudVacacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudVacacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSolicitudVacacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSolicitudVacacion.setText("Nuevo");
		this.jButtonDuplicarSolicitudVacacion.setText("Duplicar");
		this.jButtonCopiarSolicitudVacacion.setText("Copiar");
		this.jButtonVerFormSolicitudVacacion.setText("Ver");
		this.jButtonNuevoRelacionesSolicitudVacacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.setText("Guardar");
		this.jButtonCerrarSolicitudVacacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSolicitudVacacion,"nuevo_button","Nuevo",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSolicitudVacacion,"duplicar_button","Duplicar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSolicitudVacacion,"copiar_button","Copiar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSolicitudVacacion,"ver_form","Ver",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSolicitudVacacion,"nuevorelaciones_button","Nuevo Rel",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSolicitudVacacion,"guardarcambiostabla_button","Guardar",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSolicitudVacacion,"cerrar_button","Salir",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSolicitudVacacion.setToolTipText("Nuevo"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSolicitudVacacion.setToolTipText("Duplicar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSolicitudVacacion.setToolTipText("Copiar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSolicitudVacacion.setToolTipText("Ver"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSolicitudVacacion.setToolTipText("Nuevo Rel"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.setToolTipText("Guardar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSolicitudVacacion.setToolTipText("Salir"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSolicitudVacacion";
		inputMap = this.jButtonNuevoSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSolicitudVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSolicitudVacacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarSolicitudVacacion";
		inputMap = this.jButtonDuplicarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSolicitudVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSolicitudVacacion"));
		
		//COPIAR
		sMapKey = "CopiarSolicitudVacacion";
		inputMap = this.jButtonCopiarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSolicitudVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSolicitudVacacion"));
		
		//VEr FORM
		sMapKey = "VerFormSolicitudVacacion";
		inputMap = this.jButtonVerFormSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSolicitudVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSolicitudVacacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSolicitudVacacion";
		inputMap = this.jButtonNuevoRelacionesSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSolicitudVacacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSolicitudVacacion";
		inputMap = this.jButtonModificarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSolicitudVacacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSolicitudVacacion";
		inputMap = this.jButtonCerrarSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSolicitudVacacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSolicitudVacacion";
		inputMap = this.jButtonGuardarCambiosTablaSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSolicitudVacacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1SolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2SolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3SolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4SolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5SolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSolicitudVacacion.setName("jPanelParametrosReportesSolicitudVacacion"); 
		
		this.jPanelParametrosReportesAccionesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSolicitudVacacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSolicitudVacacion.setName("jPanelParametrosReportesAccionesSolicitudVacacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSolicitudVacacion = new JButtonMe();
		this.jButtonRecargarInformacionSolicitudVacacion.setText("Recargar");
		this.jButtonRecargarInformacionSolicitudVacacion.setToolTipText("Recargar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSolicitudVacacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSolicitudVacacion = new JButtonMe();
		this.jButtonProcesarInformacionSolicitudVacacion.setText("Procesar");
		this.jButtonProcesarInformacionSolicitudVacacion.setToolTipText("Procesar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSolicitudVacacion.setVisible(false);
			
		this.jButtonProcesarInformacionSolicitudVacacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudVacacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSolicitudVacacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudVacacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSolicitudVacacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudVacacion.setText("TIPO");       
		this.jComboBoxTiposReportesSolicitudVacacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSolicitudVacacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSolicitudVacacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSolicitudVacacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionSolicitudVacacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSolicitudVacacion.setText("Accion");
		this.jComboBoxTiposRelacionesSolicitudVacacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSolicitudVacacion.setText("Accion");
		this.jComboBoxTiposAccionesSolicitudVacacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSolicitudVacacion.setText("Accion");
		this.jComboBoxTiposSeleccionarSolicitudVacacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSolicitudVacacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSolicitudVacacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudVacacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSolicitudVacacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSolicitudVacacion = new JLabelMe();
		
		this.jLabelAccionesSolicitudVacacion.setText("Acciones");		
		this.jLabelAccionesSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSolicitudVacacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSolicitudVacacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSolicitudVacacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSolicitudVacacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSolicitudVacacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSolicitudVacacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSolicitudVacacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteSolicitudVacacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSolicitudVacacion = new JButtonMe();
		//this.jButtonAnterioresSolicitudVacacion.setText("<<");
        this.jButtonAnterioresSolicitudVacacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSolicitudVacacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSolicitudVacacion = new JButtonMe();
		//this.jButtonSiguientesSolicitudVacacion.setText(">>");
        this.jButtonSiguientesSolicitudVacacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSolicitudVacacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSolicitudVacacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSolicitudVacacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosSolicitudVacacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSolicitudVacacion,"nuevoguardarcambios_button","Nue",this.solicitudvacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSolicitudVacacion";
		inputMap = this.jButtonNuevoGuardarCambiosSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSolicitudVacacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSolicitudVacacion";
		inputMap = this.jButtonRecargarInformacionSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSolicitudVacacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSolicitudVacacion";
		inputMap = this.jButtonSiguientesSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSolicitudVacacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSolicitudVacacion";
		inputMap = this.jButtonAnterioresSolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSolicitudVacacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSolicitudVacacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSolicitudVacacion.setMinimumSize(new Dimension(this.getWidth(),SolicitudVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudVacacion.setMaximumSize(new Dimension(this.getWidth(),SolicitudVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSolicitudVacacion.setPreferredSize(new Dimension(this.getWidth(),SolicitudVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SolicitudVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSolicitudVacacion = new GridBagLayout();

			this.jPanelPaginacionSolicitudVacacion.setLayout(gridaBagLayoutPaginacionSolicitudVacacion);						
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 0;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonAnterioresSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					
						
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudVacacion.gridy = 0;
			
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonNuevoGuardarCambiosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
						
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSolicitudVacacion.gridy = 0;
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonSiguientesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 1;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonNuevoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
						
			
			
			if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
				this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSolicitudVacacion.gridy = 1;
				this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionSolicitudVacacion.add(this.jButtonGuardarCambiosTablaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			}
			
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 1;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonDuplicarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 1;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonCopiarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 1;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonVerFormSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 1;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSolicitudVacacion.add(this.jButtonCerrarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		
		this.jButtonRecargarInformacionSolicitudVacacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudVacacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSolicitudVacacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSolicitudVacacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudVacacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSolicitudVacacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSolicitudVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSolicitudVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSolicitudVacacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudVacacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSolicitudVacacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSolicitudVacacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudVacacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSolicitudVacacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSolicitudVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSolicitudVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSolicitudVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSolicitudVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSolicitudVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSolicitudVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSolicitudVacacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudVacacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSolicitudVacacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSolicitudVacacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudVacacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSolicitudVacacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSolicitudVacacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudVacacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSolicitudVacacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSolicitudVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSolicitudVacacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1SolicitudVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2SolicitudVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3SolicitudVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4SolicitudVacacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSolicitudVacacion.setLayout(gridaBagParametrosReportesSolicitudVacacion);
			this.jPanelParametrosReportesAccionesSolicitudVacacion.setLayout(gridaBagParametrosReportesAccionesSolicitudVacacion);
			
			
			this.jPanelParametrosAuxiliar1SolicitudVacacion.setLayout(gridaBagParametrosAuxiliar1SolicitudVacacion);
			this.jPanelParametrosAuxiliar2SolicitudVacacion.setLayout(gridaBagParametrosAuxiliar2SolicitudVacacion);
			this.jPanelParametrosAuxiliar3SolicitudVacacion.setLayout(gridaBagParametrosAuxiliar3SolicitudVacacion);
			this.jPanelParametrosAuxiliar4SolicitudVacacion.setLayout(gridaBagParametrosAuxiliar4SolicitudVacacion);
			//this.jPanelParametrosAuxiliar5SolicitudVacacion.setLayout(gridaBagParametrosAuxiliar2SolicitudVacacion);			
			
			
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jButtonRecargarInformacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudVacacion.add(this.jComboBoxTiposPaginacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudVacacion.add(this.jCheckBoxConAltoMaximoTablaSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1SolicitudVacacion.add(this.jComboBoxTiposArchivosReportesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jPanelParametrosAuxiliar1SolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4SolicitudVacacion.add(this.jComboBoxTiposReportesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);																		
			
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4SolicitudVacacion.add(this.jComboBoxTiposGraficosReportesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jPanelParametrosAuxiliar4SolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jComboBoxTiposReportesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jCheckBoxGenerarReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jPanelParametrosAuxiliar2SolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jLabelAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
				this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSolicitudVacacion.add(this.jButtonAbrirOrderBySolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jComboBoxTiposSeleccionarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			
			
			/*
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jCheckBoxSeleccionarTodosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jCheckBoxConGraficoReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudVacacion.add(this.jCheckBoxSeleccionarTodosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);															
				
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudVacacion.add(this.jCheckBoxSeleccionadosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);															
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSolicitudVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3SolicitudVacacion.add(this.jCheckBoxConGraficoReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jPanelParametrosAuxiliar3SolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jComboBoxTiposAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
	
				
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSolicitudVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSolicitudVacacion.add(this.jTextFieldValorCampoGeneralSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSolicitudVacacion = new GridBagLayout();

			this.jScrollPanelDatosSolicitudVacacion.setLayout(gridaBagLayoutDatosSolicitudVacacion);
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = 0;
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;
			
			this.jScrollPanelDatosSolicitudVacacion.add(this.jTableDatosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSolicitudVacacion.setViewportView(this.jTableDatosSolicitudVacacion);
		this.jTableDatosSolicitudVacacion.setFillsViewportHeight(true);
		this.jTableDatosSolicitudVacacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSolicitudVacacion= new GridBagLayout();
		this.jPanelAccionesSolicitudVacacion.setLayout(gridaBagLayoutAccionesSolicitudVacacion);
		
		
		/*	
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = 0;
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
			
		this.jPanelAccionesSolicitudVacacion.add(this.jButtonNuevoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoSolicitudVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoSolicitudVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoSolicitudVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoSolicitudVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoSolicitudVacacion.setLayout(gridaBagLayoutFK_IdEmpleadoSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 0;
		jPanelFK_IdEmpleadoSolicitudVacacion.add(jLabelid_empleadoFK_IdEmpleadoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 1;
		jPanelFK_IdEmpleadoSolicitudVacacion.add(jComboBoxid_empleadoFK_IdEmpleadoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 1;
		gridBagConstraintsSolicitudVacacion.gridx =1;
		jPanelFK_IdEmpleadoSolicitudVacacion.add(jButtonFK_IdEmpleadoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		jTabbedPaneBusquedasSolicitudVacacion.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoSolicitudVacacion);
		jTabbedPaneBusquedasSolicitudVacacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoJefeSolicitudVacacion.setLayout(gridaBagLayoutFK_IdEmpleadoJefeSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 0;
		jPanelFK_IdEmpleadoJefeSolicitudVacacion.add(jLabelid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 1;
		jPanelFK_IdEmpleadoJefeSolicitudVacacion.add(jComboBoxid_empleado_jefeFK_IdEmpleadoJefeSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 1;
		gridBagConstraintsSolicitudVacacion.gridx =1;
		jPanelFK_IdEmpleadoJefeSolicitudVacacion.add(jButtonFK_IdEmpleadoJefeSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		jTabbedPaneBusquedasSolicitudVacacion.addTab("2.-Por Empleado Jefe ", jPanelFK_IdEmpleadoJefeSolicitudVacacion);
		jTabbedPaneBusquedasSolicitudVacacion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion.setLayout(gridaBagLayoutFK_IdEstadoSolicitudNomiSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 0;
		jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion.add(jLabelid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion.add(jComboBoxid_estado_solicitud_nomiFK_IdEstadoSolicitudNomiSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 1;
		gridBagConstraintsSolicitudVacacion.gridx =1;
		jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion.add(jButtonFK_IdEstadoSolicitudNomiSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		jTabbedPaneBusquedasSolicitudVacacion.addTab("3.-Por Estado Solicitud Nomi ", jPanelFK_IdEstadoSolicitudNomiSolicitudVacacion);
		jTabbedPaneBusquedasSolicitudVacacion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSolicitudVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSolicitudVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSolicitudVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSolicitudVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSolicitudVacacion.setLayout(gridaBagLayoutFK_IdEstructuraSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 0;
		jPanelFK_IdEstructuraSolicitudVacacion.add(jLabelid_estructuraFK_IdEstructuraSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 1;
		jPanelFK_IdEstructuraSolicitudVacacion.add(jComboBoxid_estructuraFK_IdEstructuraSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 1;
		gridBagConstraintsSolicitudVacacion.gridx =1;
		jPanelFK_IdEstructuraSolicitudVacacion.add(jButtonFK_IdEstructuraSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		jTabbedPaneBusquedasSolicitudVacacion.addTab("4.-Por Estructura ", jPanelFK_IdEstructuraSolicitudVacacion);
		jTabbedPaneBusquedasSolicitudVacacion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFormatoSolicitudVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoSolicitudVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoSolicitudVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoSolicitudVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoSolicitudVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoSolicitudVacacion.setLayout(gridaBagLayoutFK_IdFormatoSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 0;
		jPanelFK_IdFormatoSolicitudVacacion.add(jLabelid_formatoFK_IdFormatoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 0;
		gridBagConstraintsSolicitudVacacion.gridx = 1;
		jPanelFK_IdFormatoSolicitudVacacion.add(jComboBoxid_formatoFK_IdFormatoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSolicitudVacacion.gridy = 1;
		gridBagConstraintsSolicitudVacacion.gridx =1;
		jPanelFK_IdFormatoSolicitudVacacion.add(jButtonFK_IdFormatoSolicitudVacacion, gridBagConstraintsSolicitudVacacion);

		jTabbedPaneBusquedasSolicitudVacacion.addTab("5.-Por Formato ", jPanelFK_IdFormatoSolicitudVacacion);
		jTabbedPaneBusquedasSolicitudVacacion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSolicitudVacacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSolicitudVacacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();						
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;		
			//this.gridBagConstraintsSolicitudVacacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSolicitudVacacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;		
		//this.gridBagConstraintsSolicitudVacacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSolicitudVacacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSolicitudVacacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSolicitudVacacion.gridx = 0;		
			this.gridBagConstraintsSolicitudVacacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSolicitudVacacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);								
		
		
		/*
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		*/		
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSolicitudVacacion.gridx =0;
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSolicitudVacacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
				
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(SolicitudVacacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSolicitudVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSolicitudVacacion = new GridBagLayout();
			this.jPanelBusquedasParametrosSolicitudVacacion.setLayout(gridaBagLayoutBusquedasParametrosSolicitudVacacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSolicitudVacacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSolicitudVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSolicitudVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
			
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSolicitudVacacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSolicitudVacacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSolicitudVacacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSolicitudVacacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSolicitudVacacion.setName("jPanelReporteDinamicoSolicitudVacacion"); 
		
		this.jPanelReporteDinamicoSolicitudVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSolicitudVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSolicitudVacacion.setLayout(gridaBagLayoutReporteDinamicoSolicitudVacacion);
		
		
		this.jInternalFrameReporteDinamicoSolicitudVacacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSolicitudVacacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudVacacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSolicitudVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSolicitudVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSolicitudVacacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSolicitudVacacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSolicitudVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSolicitudVacacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoSolicitudVacacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoSolicitudVacacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSolicitudVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSolicitudVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSolicitudVacacion = new JLabelMe();

		this.jLabelColumnasSelectReporteSolicitudVacacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelColumnasSelectReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSolicitudVacacion = new JList<Reporte>();
		this.jListColumnasSelectReporteSolicitudVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSolicitudVacacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSolicitudVacacion=new JScrollPane(this.jListColumnasSelectReporteSolicitudVacacion);
			
			this.jScrollColumnasSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSolicitudVacacion.add(this.jListColumnasSelectReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jScrollColumnasSelectReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSolicitudVacacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteSolicitudVacacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSolicitudVacacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteSolicitudVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSolicitudVacacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSolicitudVacacion=new JScrollPane(this.jListRelacionesSelectReporteSolicitudVacacion);
			
			this.jScrollRelacionesSelectReporteSolicitudVacacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudVacacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSolicitudVacacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoSolicitudVacacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoSolicitudVacacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSolicitudVacacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSolicitudVacacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSolicitudVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSolicitudVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoSolicitudVacacion = new JLabelMe();

		this.jLabelConGraficoDinamicoSolicitudVacacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelConGraficoDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoSolicitudVacacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoSolicitudVacacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoSolicitudVacacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoSolicitudVacacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudVacacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoSolicitudVacacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jCheckBoxConGraficoDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoSolicitudVacacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoSolicitudVacacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelColumnaCategoriaGraficoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorSolicitudVacacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorSolicitudVacacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelColumnaCategoriaValorSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorSolicitudVacacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorSolicitudVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorSolicitudVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorSolicitudVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jComboBoxColumnaCategoriaValorSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoSolicitudVacacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoSolicitudVacacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelColumnasValoresGraficoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoSolicitudVacacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoSolicitudVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoSolicitudVacacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoSolicitudVacacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudVacacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoSolicitudVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoSolicitudVacacion=new JScrollPane(this.jListColumnasValoresGraficoSolicitudVacacion);
			
			this.jScrollColumnasValoresGraficoSolicitudVacacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudVacacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoSolicitudVacacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoSolicitudVacacion.add(this.jListColumnasSelectReporteSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jScrollColumnasValoresGraficoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelTiposGraficosReportesDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoSolicitudVacacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jComboBoxTiposGraficosReportesDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelGenerarExcelReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion.setToolTipText("Generar EXCEL"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		//this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSolicitudVacacion.add(this.jButtonGenerarExcelReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jComboBoxTiposReportesDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jLabelTiposArchivoReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jComboBoxTiposArchivosReportesDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSolicitudVacacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSolicitudVacacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSolicitudVacacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSolicitudVacacion.setToolTipText("Generar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jButtonGenerarReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSolicitudVacacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSolicitudVacacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSolicitudVacacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSolicitudVacacion.setToolTipText("Cancelar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSolicitudVacacion.add(this.jButtonCerrarReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSolicitudVacacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSolicitudVacacion= new JScrollPane(jPanelReporteDinamicoSolicitudVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSolicitudVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSolicitudVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSolicitudVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSolicitudVacacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSolicitudVacacion);
		this.jInternalFrameReporteDinamicoSolicitudVacacion.getContentPane().add(this.jScrollPanelReporteDinamicoSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSolicitudVacacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSolicitudVacacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSolicitudVacacion.setName("jPanelImportacionSolicitudVacacion"); 
		
		this.jPanelImportacionSolicitudVacacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudVacacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSolicitudVacacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSolicitudVacacion.setLayout(gridaBagLayoutImportacionSolicitudVacacion);
		
		
		this.jInternalFrameImportacionSolicitudVacacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSolicitudVacacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSolicitudVacacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSolicitudVacacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSolicitudVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudVacacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSolicitudVacacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudVacacion.setResizable(true);
	    this.jInternalFrameImportacionSolicitudVacacion.setClosable(true);
	    this.jInternalFrameImportacionSolicitudVacacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSolicitudVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSolicitudVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSolicitudVacacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSolicitudVacacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSolicitudVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSolicitudVacacion.setResizable(true);
	    this.jInternalFrameImportacionSolicitudVacacion.setClosable(true);
	    this.jInternalFrameImportacionSolicitudVacacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSolicitudVacacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudVacacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSolicitudVacacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSolicitudVacacion = new JLabelMe();

		this.jLabelArchivoImportacionSolicitudVacacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudVacacion.add(this.jLabelArchivoImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSolicitudVacacion = new JFileChooser();		
		this.jFileChooserImportacionSolicitudVacacion.setToolTipText("ESCOGER ARCHIVO"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSolicitudVacacion = new JButtonMe();
		this.jButtonAbrirImportacionSolicitudVacacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSolicitudVacacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSolicitudVacacion.setToolTipText("Generar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudVacacion.add(this.jButtonAbrirImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSolicitudVacacion = new JLabelMe();

		this.jLabelPathArchivoImportacionSolicitudVacacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSolicitudVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSolicitudVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSolicitudVacacion.add(this.jLabelPathArchivoImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSolicitudVacacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSolicitudVacacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudVacacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSolicitudVacacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudVacacion.add(this.jTextFieldPathArchivoImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSolicitudVacacion = new JButtonMe();
		this.jButtonGenerarImportacionSolicitudVacacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSolicitudVacacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSolicitudVacacion.setToolTipText("Generar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudVacacion.add(this.jButtonGenerarImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSolicitudVacacion = new JButtonMe();
		this.jButtonCerrarImportacionSolicitudVacacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSolicitudVacacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSolicitudVacacion.setToolTipText("Cancelar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSolicitudVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsSolicitudVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSolicitudVacacion.add(this.jButtonCerrarImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSolicitudVacacion = new GridBagLayout();
		
		this.jScrollPanelImportacionSolicitudVacacion= new JScrollPane(jPanelImportacionSolicitudVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
		this.gridBagConstraintsSolicitudVacacion.gridy =iPosYImportacion;
		this.gridBagConstraintsSolicitudVacacion.gridx =iPosXImportacion;
		this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSolicitudVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSolicitudVacacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSolicitudVacacion);
		this.jInternalFrameImportacionSolicitudVacacion.getContentPane().add(this.jScrollPanelImportacionSolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySolicitudVacacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySolicitudVacacion = new JButtonMe();
			this.jButtonAbrirOrderBySolicitudVacacion.setText("Orden");
			this.jButtonAbrirOrderBySolicitudVacacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySolicitudVacacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySolicitudVacacion";
			inputMap = this.jButtonAbrirOrderBySolicitudVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySolicitudVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySolicitudVacacion"));
		
		
			GridBagLayout gridaBagLayoutOrderBySolicitudVacacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySolicitudVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySolicitudVacacion.setName("jPanelOrderBySolicitudVacacion"); 
			
			this.jPanelOrderBySolicitudVacacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudVacacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySolicitudVacacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySolicitudVacacion.setLayout(gridaBagLayoutOrderBySolicitudVacacion);
			
			
			this.jTableDatosSolicitudVacacionOrderBy = new JTableMe();        
			this.jTableDatosSolicitudVacacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSolicitudVacacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSolicitudVacacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSolicitudVacacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSolicitudVacacionOrderBy.setViewportView(this.jTableDatosSolicitudVacacionOrderBy);
			this.jTableDatosSolicitudVacacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSolicitudVacacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySolicitudVacacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySolicitudVacacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySolicitudVacacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSolicitudVacacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySolicitudVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySolicitudVacacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySolicitudVacacion.setTitle("Orden");
			this.jInternalFrameOrderBySolicitudVacacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySolicitudVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySolicitudVacacion.setResizable(true);
			this.jInternalFrameOrderBySolicitudVacacion.setClosable(true);
			this.jInternalFrameOrderBySolicitudVacacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySolicitudVacacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudVacacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySolicitudVacacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySolicitudVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Vacaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSolicitudVacacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSolicitudVacacion.ipady =150;
				
			this.jPanelOrderBySolicitudVacacion.add(jScrollPanelDatosSolicitudVacacionOrderBy, this.gridBagConstraintsSolicitudVacacion);//this.jTableDatosSolicitudVacacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySolicitudVacacion = new JButtonMe();
			this.jButtonCerrarOrderBySolicitudVacacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySolicitudVacacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySolicitudVacacion.setToolTipText("Cancelar"+" "+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySolicitudVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSolicitudVacacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSolicitudVacacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySolicitudVacacion.add(this.jButtonCerrarOrderBySolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSolicitudVacacion = new GridBagLayout();
			
			this.jScrollPanelOrderBySolicitudVacacion= new JScrollPane(jPanelOrderBySolicitudVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSolicitudVacacion = new GridBagConstraints();
			this.gridBagConstraintsSolicitudVacacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsSolicitudVacacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsSolicitudVacacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySolicitudVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySolicitudVacacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSolicitudVacacion);
			
			this.jInternalFrameOrderBySolicitudVacacion.getContentPane().add(this.jScrollPanelOrderBySolicitudVacacion, this.gridBagConstraintsSolicitudVacacion);			
		
		} else {
			this.jButtonAbrirOrderBySolicitudVacacion = new JButtonMe();
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
			&& this.solicitudvacacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSolicitudVacacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSolicitudVacacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSolicitudVacacion.getRowHeight();//SolicitudVacacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.isSelected()) {
					iHeightTable=SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSolicitudVacacion.isSelected()) {
					iHeightTable=SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SolicitudVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSolicitudVacacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudVacacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSolicitudVacacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSolicitudVacacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudVacacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSolicitudVacacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySolicitudVacacion!=null && this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy()!=null) {
			//if(!this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySolicitudVacacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySolicitudVacacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySolicitudVacacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySolicitudVacacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSolicitudVacacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudVacacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSolicitudVacacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=solicitudvacacionLogic.getSolicitudVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=solicitudvacacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<SolicitudVacacion> TraerSolicitudVacacionBeans(List<SolicitudVacacion> solicitudvacacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(SolicitudVacacion solicitudvacacion:solicitudvacacions) {
					
				if(!(SolicitudVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SolicitudVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					solicitudvacacion.setsDetalleGeneralEntityReporte(SolicitudVacacionConstantesFunciones.getSolicitudVacacionDescripcion(solicitudvacacion));
										
						
					
						
					
				} else  {
							
					//solicitudvacacion.setsDetalleGeneralEntityReporte(solicitudvacacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//solicitudvacacionbeans.add(solicitudvacacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return solicitudvacacions;
    }
	//PARA REPORTES FIN
}
