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
import com.bydan.erp.nomina.util.PlaniVacacionConstantesFunciones;

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
public class PlaniVacacionJInternalFrame extends PlaniVacacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPlaniVacacion;
	
	protected JMenuBar jmenuBarPlaniVacacion;
	
	protected JMenu jmenuPlaniVacacion;
	protected JMenu jmenuDatosPlaniVacacion;
	protected JMenu jmenuArchivoPlaniVacacion;
	protected JMenu jmenuAccionesPlaniVacacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlaniVacacion;	
	protected GridBagConstraints gridBagConstraintsPlaniVacacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PlaniVacacionDetalleFormJInternalFrame jInternalFrameDetalleFormPlaniVacacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPlaniVacacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPlaniVacacion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";

	protected EstructuraBeanSwingJInternalFrame estructuracargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuracargo="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public PlaniVacacionSessionBean planivacacionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;
	public EstructuraSessionBean estructuracargoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PlaniVacacion> planivacacions;		
	public List<PlaniVacacion> planivacacionsEliminados;	
	public List<PlaniVacacion> planivacacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPlaniVacacion;		
	protected JButton jButtonAbrirOrderByPlaniVacacion;
	
	
	//protected JPanel jPanelOrderByPlaniVacacion;
	//public JScrollPane jScrollPanelOrderByPlaniVacacion;	
	//protected JButton jButtonCerrarOrderByPlaniVacacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PlaniVacacionLogic planivacacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPlaniVacacion;
	public JScrollPane jScrollPanelDatosEdicionPlaniVacacion;
	public JScrollPane jScrollPanelDatosGeneralPlaniVacacion;
    
	
	
	//public JScrollPane jScrollPanelDatosPlaniVacacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPlaniVacacion;
	//public JScrollPane jScrollPanelImportacionPlaniVacacion;
	
	
	
	protected JPanel jPanelAccionesPlaniVacacion;
	
    protected JPanel jPanelPaginacionPlaniVacacion;
    protected JPanel jPanelParametrosReportesPlaniVacacion;
	protected JPanel jPanelParametrosReportesAccionesPlaniVacacion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PlaniVacacion;
	protected JPanel jPanelParametrosAuxiliar2PlaniVacacion;
	protected JPanel jPanelParametrosAuxiliar3PlaniVacacion;
	protected JPanel jPanelParametrosAuxiliar4PlaniVacacion;
	//protected JPanel jPanelParametrosAuxiliar5PlaniVacacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoPlaniVacacion;
	//protected JPanel jPanelImportacionPlaniVacacion;
	
	
	public JTable jTableDatosPlaniVacacion;
	
	
	
	//public JTable jTableDatosPlaniVacacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPlaniVacacion;
	protected JButton jButtonDuplicarPlaniVacacion;
	protected JButton jButtonCopiarPlaniVacacion;
	protected JButton jButtonVerFormPlaniVacacion;
	protected JButton jButtonNuevoRelacionesPlaniVacacion;
	protected JButton jButtonModificarPlaniVacacion;
	
    protected JButton jButtonGuardarCambiosTablaPlaniVacacion;
	protected JButton jButtonCerrarPlaniVacacion;
	
	
	protected JButton jButtonRecargarInformacionPlaniVacacion;
	protected JButton jButtonProcesarInformacionPlaniVacacion;
	
	
	protected JButton jButtonAnterioresPlaniVacacion;
	protected JButton jButtonSiguientesPlaniVacacion;
	protected JButton jButtonNuevoGuardarCambiosPlaniVacacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPlaniVacacion;
	//protected JButton jButtonCerrarReporteDinamicoPlaniVacacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoPlaniVacacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionPlaniVacacion;
	//protected JButton jButtonGenerarImportacionPlaniVacacion;
	//protected JButton jButtonCerrarImportacionPlaniVacacion;
	//protected JFileChooser jFileChooserImportacionPlaniVacacion;
	//protected File fileImportacionPlaniVacacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlaniVacacion;
	protected JButton jButtonDuplicarToolBarPlaniVacacion;
	protected JButton jButtonNuevoRelacionesToolBarPlaniVacacion;
	
	
	public JButton jButtonGuardarCambiosToolBarPlaniVacacion;
	protected JButton jButtonCopiarToolBarPlaniVacacion;
	protected JButton jButtonVerFormToolBarPlaniVacacion;
	public JButton jButtonGuardarCambiosTablaToolBarPlaniVacacion;
	protected JButton jButtonMostrarOcultarTablaToolBarPlaniVacacion;
	protected JButton jButtonCerrarToolBarPlaniVacacion;
	
	protected JButton jButtonRecargarInformacionToolBarPlaniVacacion;
	protected JButton jButtonProcesarInformacionToolBarPlaniVacacion;
	protected JButton jButtonAnterioresToolBarPlaniVacacion;
	protected JButton jButtonSiguientesToolBarPlaniVacacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarPlaniVacacion;
	protected JButton jButtonAbrirOrderByToolBarPlaniVacacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlaniVacacion;
	protected JMenuItem jMenuItemDuplicarPlaniVacacion;
	protected JMenuItem jMenuItemNuevoRelacionesPlaniVacacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPlaniVacacion;
	protected JMenuItem jMenuItemCopiarPlaniVacacion;
	protected JMenuItem jMenuItemVerFormPlaniVacacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlaniVacacion;
	protected JMenuItem jMenuItemCerrarPlaniVacacion;
	protected JMenuItem jMenuItemDetalleCerrarPlaniVacacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPlaniVacacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlaniVacacion;
	
	protected JMenuItem jMenuItemRecargarInformacionPlaniVacacion;
	protected JMenuItem jMenuItemProcesarInformacionPlaniVacacion;
	protected JMenuItem jMenuItemAnterioresPlaniVacacion;
	protected JMenuItem jMenuItemSiguientesPlaniVacacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlaniVacacion;
	protected JMenuItem jMenuItemAbrirOrderByPlaniVacacion;
	protected JMenuItem jMenuItemMostrarOcultarPlaniVacacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlaniVacacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPlaniVacacion;
	protected JCheckBox jCheckBoxSeleccionadosPlaniVacacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPlaniVacacion;
	protected JCheckBox jCheckBoxConGraficoReportePlaniVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPlaniVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPlaniVacacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPlaniVacacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPlaniVacacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPlaniVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPlaniVacacion;
	protected JTextField jTextFieldValorCampoGeneralPlaniVacacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePlaniVacacion;
	//public JList<Reporte> jListColumnasSelectReportePlaniVacacion;
	//public JScrollPane jScrollColumnasSelectReportePlaniVacacion;
	
	//public JLabel jLabelRelacionesSelectReportePlaniVacacion;
	//public JList<Reporte> jListRelacionesSelectReportePlaniVacacion;
	//public JScrollPane jScrollRelacionesSelectReportePlaniVacacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPlaniVacacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPlaniVacacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPlaniVacacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoPlaniVacacion;
	
		
	//public JLabel jLabelArchivoImportacionPlaniVacacion;	
	//public JLabel jLabelPathArchivoImportacionPlaniVacacion;
	//protected JTextField jTextFieldPathArchivoImportacionPlaniVacacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPlaniVacacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPlaniVacacion;
	
	//public JLabel jLabelColumnaCategoriaValorPlaniVacacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPlaniVacacion;
	
	//public JLabel jLabelColumnasValoresGraficoPlaniVacacion;
	//public JList<Reporte> jListColumnasValoresGraficoPlaniVacacion;
	//public JScrollPane jScrollColumnasValoresGraficoPlaniVacacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPlaniVacacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPlaniVacacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPlaniVacacion;
	public JPanel jPanelFK_IdEmpleadoPlaniVacacion;
	public JButton jButtonFK_IdEmpleadoPlaniVacacion;
	public JPanel jPanelFK_IdEstructuraPlaniVacacion;
	public JButton jButtonFK_IdEstructuraPlaniVacacion;
	public JPanel jPanelFK_IdEstructuraCargoPlaniVacacion;
	public JButton jButtonFK_IdEstructuraCargoPlaniVacacion;
	public JPanel jPanelFK_IdEstructuraSeccionPlaniVacacion;
	public JButton jButtonFK_IdEstructuraSeccionPlaniVacacion;
	public JPanel jPanelFK_IdMesPlaniVacacion;
	public JButton jButtonFK_IdMesPlaniVacacion;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPlaniVacacion;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion;
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaniVacacion= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPlaniVacacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraPlaniVacacion;
	public JLabel jLabelid_estructuraFK_IdEstructuraPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion;
	public JButton jButtonid_estructuraFK_IdEstructuraPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraPlaniVacacionArbol= new JButtonMe();

	
	public JPanel jPanelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion;
	public JLabel jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion;
	public JButton jButtonid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructura_cargoFK_IdEstructuraCargoPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructura_cargoFK_IdEstructuraCargoPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_cargoFK_IdEstructuraCargoPlaniVacacionArbol= new JButtonMe();

	
	public JPanel jPanelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion;
	public JLabel jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion;
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacionBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacionArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesPlaniVacacion;
	public JLabel jLabelid_mesFK_IdMesPlaniVacacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesPlaniVacacion;
	public JButton jButtonid_mesFK_IdMesPlaniVacacion= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesPlaniVacacionUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesPlaniVacacionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
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
	public PlaniVacacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlaniVacacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPlaniVacacion)	{
		this.jButtonRecargarInformacionPlaniVacacion = jButtonRecargarInformacionPlaniVacacion;
	}
	
	public JButton getjButtonProcesarInformacionPlaniVacacion() {
		return this.jButtonProcesarInformacionPlaniVacacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlaniVacacion)	{
		this.jButtonProcesarInformacionPlaniVacacion = jButtonProcesarInformacionPlaniVacacion;
	}
	
	
	public JButton getjButtonRecargarInformacionPlaniVacacion() {
		return this.jButtonRecargarInformacionPlaniVacacion;
	}
	
	
	public List<PlaniVacacion> getplanivacacions() {
		return this.planivacacions;
	}

	public void setplanivacacions(List<PlaniVacacion> planivacacions) {
		this.planivacacions = planivacacions;
	}
	
	public List<PlaniVacacion> getplanivacacionsAux() {
		return this.planivacacionsAux;
	}

	public void setplanivacacionsAux(List<PlaniVacacion> planivacacionsAux) {
		this.planivacacionsAux = planivacacionsAux;
	}
	
	public List<PlaniVacacion> getplanivacacionsEliminados() {
		return this.planivacacionsEliminados;
	}

	public void setPlaniVacacionsEliminados(List<PlaniVacacion> planivacacionsEliminados) {
		this.planivacacionsEliminados = planivacacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPlaniVacacion() {
		return jComboBoxTiposSeleccionarPlaniVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPlaniVacacion(
			JComboBox jComboBoxTiposSeleccionarPlaniVacacion) {
		this.jComboBoxTiposSeleccionarPlaniVacacion = jComboBoxTiposSeleccionarPlaniVacacion;
	}
	
	public void setBorderResaltarTiposSeleccionarPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPlaniVacacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPlaniVacacion() {
		return jTextFieldValorCampoGeneralPlaniVacacion;
	}

	public void setjTextFieldValorCampoGeneralPlaniVacacion(
			JTextField jTextFieldValorCampoGeneralPlaniVacacion) {
		this.jTextFieldValorCampoGeneralPlaniVacacion = jTextFieldValorCampoGeneralPlaniVacacion;
	}

	public void setBorderResaltarValorCampoGeneralPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPlaniVacacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPlaniVacacion() {
		return this.jCheckBoxSeleccionarTodosPlaniVacacion;
	}

	public void setjCheckBoxSeleccionarTodosPlaniVacacion(
			JCheckBox jCheckBoxSeleccionarTodosPlaniVacacion) {
		this.jCheckBoxSeleccionarTodosPlaniVacacion = jCheckBoxSeleccionarTodosPlaniVacacion;
	}

	public void setBorderResaltarSeleccionarTodosPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPlaniVacacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPlaniVacacion() {
		return this.jCheckBoxSeleccionadosPlaniVacacion;
	}

	public void setjCheckBoxSeleccionadosPlaniVacacion(
			JCheckBox jCheckBoxSeleccionadosPlaniVacacion) {
		this.jCheckBoxSeleccionadosPlaniVacacion = jCheckBoxSeleccionadosPlaniVacacion;
	}
	
	public void setBorderResaltarSeleccionadosPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPlaniVacacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPlaniVacacion() {
		return this.jComboBoxTiposArchivosReportesPlaniVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPlaniVacacion(
			JComboBox jComboBoxTiposArchivosReportesPlaniVacacion) {
		this.jComboBoxTiposArchivosReportesPlaniVacacion = jComboBoxTiposArchivosReportesPlaniVacacion;
	}

	public void setBorderResaltarTiposArchivosReportesPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPlaniVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPlaniVacacion() {
		return this.jComboBoxTiposReportesPlaniVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPlaniVacacion(
			JComboBox jComboBoxTiposReportesPlaniVacacion) {
		this.jComboBoxTiposReportesPlaniVacacion = jComboBoxTiposReportesPlaniVacacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPlaniVacacion() {
	//	return jComboBoxTiposReportesDinamicoPlaniVacacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPlaniVacacion(
	//		JComboBox jComboBoxTiposReportesDinamicoPlaniVacacion) {
	//	this.jComboBoxTiposReportesDinamicoPlaniVacacion = jComboBoxTiposReportesDinamicoPlaniVacacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPlaniVacacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoPlaniVacacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPlaniVacacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPlaniVacacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion = jComboBoxTiposArchivosReportesDinamicoPlaniVacacion;
	//}
	
	public void setBorderResaltarTiposReportesPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPlaniVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPlaniVacacion() {
		return this.jComboBoxTiposGraficosReportesPlaniVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPlaniVacacion(
			JComboBox jComboBoxTiposGraficosReportesPlaniVacacion) {
		this.jComboBoxTiposGraficosReportesPlaniVacacion = jComboBoxTiposGraficosReportesPlaniVacacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPlaniVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPlaniVacacion() {
		return this.jComboBoxTiposPaginacionPlaniVacacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPlaniVacacion(
			JComboBox jComboBoxTiposPaginacionPlaniVacacion) {
		this.jComboBoxTiposPaginacionPlaniVacacion = jComboBoxTiposPaginacionPlaniVacacion;
	}
	
	public void setBorderResaltarTiposPaginacionPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPlaniVacacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPlaniVacacion() {
		return this.jComboBoxTiposRelacionesPlaniVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlaniVacacion() {
		return this.jComboBoxTiposAccionesPlaniVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlaniVacacion(
			JComboBox jComboBoxTiposRelacionesPlaniVacacion) {
		this.jComboBoxTiposRelacionesPlaniVacacion = jComboBoxTiposRelacionesPlaniVacacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlaniVacacion(
			JComboBox jComboBoxTiposAccionesPlaniVacacion) {
		this.jComboBoxTiposAccionesPlaniVacacion = jComboBoxTiposAccionesPlaniVacacion;
	}
	
	public void setBorderResaltarTiposRelacionesPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPlaniVacacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPlaniVacacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPlaniVacacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPlaniVacacion() {
	//	return jCheckBoxConGraficoDinamicoPlaniVacacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoPlaniVacacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoPlaniVacacion) {
	//	this.jCheckBoxConGraficoDinamicoPlaniVacacion = jCheckBoxConGraficoDinamicoPlaniVacacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPlaniVacacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPlaniVacacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPlaniVacacion .setBorder(borderResaltar);		
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
		this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		
		this.planivacacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planivacacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planivacacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlaniVacacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Plani Vacacion MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
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
		
		PlaniVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PlaniVacacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPlaniVacacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"nuevo","nuevo","Nuevo"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"duplicar","duplicar","Duplicar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"copiar","copiar","Copiar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"ver_form","ver_form","Ver"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"recargar","recargar","Recargar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPlaniVacacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPlaniVacacion,this.jTtoolBarPlaniVacacion,
							"cerrar","cerrar","Salir"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPlaniVacacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPlaniVacacion;
			
				this.jButtonProcesarInformacionToolBarPlaniVacacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPlaniVacacion;
				
		//protected JButton jButtonModificarToolBarPlaniVacacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPlaniVacacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPlaniVacacion=new JMenuMe("General");
		this.jmenuArchivoPlaniVacacion=new JMenuMe("Archivo");
		this.jmenuAccionesPlaniVacacion=new JMenuMe("Acciones");
		this.jmenuDatosPlaniVacacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlaniVacacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlaniVacacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlaniVacacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPlaniVacacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPlaniVacacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPlaniVacacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPlaniVacacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPlaniVacacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPlaniVacacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPlaniVacacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlaniVacacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlaniVacacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPlaniVacacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPlaniVacacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPlaniVacacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPlaniVacacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPlaniVacacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPlaniVacacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPlaniVacacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPlaniVacacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPlaniVacacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlaniVacacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlaniVacacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlaniVacacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPlaniVacacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPlaniVacacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPlaniVacacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPlaniVacacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPlaniVacacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPlaniVacacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPlaniVacacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPlaniVacacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPlaniVacacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPlaniVacacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPlaniVacacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPlaniVacacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPlaniVacacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPlaniVacacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPlaniVacacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlaniVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlaniVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlaniVacacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPlaniVacacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPlaniVacacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPlaniVacacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlaniVacacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlaniVacacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlaniVacacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPlaniVacacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPlaniVacacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPlaniVacacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPlaniVacacion.add(this.jMenuItemCerrarPlaniVacacion);
			
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemNuevoPlaniVacacion);
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemNuevoGuardarCambiosPlaniVacacion);
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemNuevoRelacionesPlaniVacacion);
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemGuardarCambiosTablaPlaniVacacion);		
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemDuplicarPlaniVacacion);		
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemCopiarPlaniVacacion);		
			this.jmenuAccionesPlaniVacacion.add(this.jMenuItemVerFormPlaniVacacion);		
			
			this.jmenuDatosPlaniVacacion.add(this.jMenuItemRecargarInformacionPlaniVacacion);				
			this.jmenuDatosPlaniVacacion.add(this.jMenuItemAnterioresPlaniVacacion);				
			this.jmenuDatosPlaniVacacion.add(this.jMenuItemSiguientesPlaniVacacion);				
			this.jmenuDatosPlaniVacacion.add(this.jMenuItemAbrirOrderByPlaniVacacion);				
			this.jmenuDatosPlaniVacacion.add(this.jMenuItemMostrarOcultarPlaniVacacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPlaniVacacion.add(this.jMenuItemGuardarCambiosPlaniVacacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPlaniVacacion.add(this.jmenuArchivoPlaniVacacion);		
			this.jmenuBarPlaniVacacion.add(this.jmenuAccionesPlaniVacacion);		
			this.jmenuBarPlaniVacacion.add(this.jmenuDatosPlaniVacacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPlaniVacacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPlaniVacacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPlaniVacacion.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPlaniVacacion= new JButtonMe();
		this.jButtonFK_IdEmpleadoPlaniVacacion.setText("Buscar");
		this.jButtonFK_IdEmpleadoPlaniVacacion.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPlaniVacacion,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraPlaniVacacion.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraPlaniVacacion= new JButtonMe();
		this.jButtonFK_IdEstructuraPlaniVacacion.setText("Buscar");
		this.jButtonFK_IdEstructuraPlaniVacacion.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraPlaniVacacion,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraCargoPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraCargoPlaniVacacion.setToolTipText("Buscar Por Estructura Cargo ");
		this.jButtonFK_IdEstructuraCargoPlaniVacacion= new JButtonMe();
		this.jButtonFK_IdEstructuraCargoPlaniVacacion.setText("Buscar");
		this.jButtonFK_IdEstructuraCargoPlaniVacacion.setToolTipText("Buscar Por Estructura Cargo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraCargoPlaniVacacion,"buscar_button","Buscar Por Estructura Cargo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraCargoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion = new JLabelMe();
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setText("Estructura Cargo :");
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setToolTipText("Estructura Cargo");
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraSeccionPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraSeccionPlaniVacacion.setToolTipText("Buscar Por Estructura Seccion ");
		this.jButtonFK_IdEstructuraSeccionPlaniVacacion= new JButtonMe();
		this.jButtonFK_IdEstructuraSeccionPlaniVacacion.setText("Buscar");
		this.jButtonFK_IdEstructuraSeccionPlaniVacacion.setToolTipText("Buscar Por Estructura Seccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraSeccionPlaniVacacion,"buscar_button","Buscar Por Estructura Seccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraSeccionPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion = new JLabelMe();
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setText("Estructura Seccion :");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setToolTipText("Estructura Seccion");
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion= new JComboBoxMe();
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesPlaniVacacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesPlaniVacacion.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesPlaniVacacion= new JButtonMe();
		this.jButtonFK_IdMesPlaniVacacion.setText("Buscar");
		this.jButtonFK_IdMesPlaniVacacion.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesPlaniVacacion,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesPlaniVacacion = new JLabelMe();
		jLabelid_mesFK_IdMesPlaniVacacion.setText("Mes :");
		jLabelid_mesFK_IdMesPlaniVacacion.setToolTipText("Mes");
		jLabelid_mesFK_IdMesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesPlaniVacacion= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPlaniVacacion=new JTabbedPane();


		this.jTabbedPaneBusquedasPlaniVacacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlaniVacacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPlaniVacacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPlaniVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePlaniVacacion = new PlaniVacacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Plani Vacacion DATOS");
			this.jInternalFrameDetalleFormPlaniVacacion = new PlaniVacacionDetalleFormJInternalFrame(jDesktopPane,this.planivacacionSessionBean.getConGuardarRelaciones(),this.planivacacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPlaniVacacion = null;//new PlaniVacacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlaniVacacion= new GridBagLayout();
		
		
		this.jTableDatosPlaniVacacion = new JTableMe();      
		
		String sToolTipPlaniVacacion="";
		sToolTipPlaniVacacion=PlaniVacacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlaniVacacion+="(Nomina.PlaniVacacion)";
		}
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlaniVacacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPlaniVacacion.setToolTipText(sToolTipPlaniVacacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPlaniVacacion);
		this.jTableDatosPlaniVacacion.setAutoCreateRowSorter(true);
		this.jTableDatosPlaniVacacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPlaniVacacion.setRowSelectionAllowed(true);
		this.jTableDatosPlaniVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPlaniVacacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPlaniVacacion = new JButtonMe();
		this.jButtonDuplicarPlaniVacacion = new JButtonMe();
		this.jButtonCopiarPlaniVacacion = new JButtonMe();
		this.jButtonVerFormPlaniVacacion = new JButtonMe();
		this.jButtonNuevoRelacionesPlaniVacacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPlaniVacacion = new JButtonMe();
		this.jButtonCerrarPlaniVacacion = new JButtonMe();
		
		this.jScrollPanelDatosPlaniVacacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralPlaniVacacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Plani Vacacion";
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosPlaniVacacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlaniVacacion.setToolTipText("Acciones");
        this.jPanelAccionesPlaniVacacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPlaniVacacion=new ReporteDinamicoJInternalFrame(PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPlaniVacacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPlaniVacacion=new ImportacionJInternalFrame(PlaniVacacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPlaniVacacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPlaniVacacion = new JButtonMe();
		
		this.jButtonAbrirOrderByPlaniVacacion.setText("Orden");
		this.jButtonAbrirOrderByPlaniVacacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaniVacacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaniVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaniVacacion,false,this);
			
			//this.cargarOrderByPlaniVacacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPlaniVacacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaniVacacion,true,this);
			
			//this.cargarOrderByPlaniVacacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPlaniVacacion.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosPlaniVacacion.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosPlaniVacacion.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosPlaniVacacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaniVacacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPlaniVacacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPlaniVacacion.setText("Nuevo");
		this.jButtonDuplicarPlaniVacacion.setText("Duplicar");
		this.jButtonCopiarPlaniVacacion.setText("Copiar");
		this.jButtonVerFormPlaniVacacion.setText("Ver");
		this.jButtonNuevoRelacionesPlaniVacacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.setText("Guardar");
		this.jButtonCerrarPlaniVacacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlaniVacacion,"nuevo_button","Nuevo",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPlaniVacacion,"duplicar_button","Duplicar",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPlaniVacacion,"copiar_button","Copiar",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPlaniVacacion,"ver_form","Ver",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPlaniVacacion,"nuevorelaciones_button","Nuevo Rel",this.planivacacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlaniVacacion,"guardarcambiostabla_button","Guardar",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlaniVacacion,"cerrar_button","Salir",this.planivacacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPlaniVacacion.setToolTipText("Nuevo"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPlaniVacacion.setToolTipText("Duplicar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPlaniVacacion.setToolTipText("Copiar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPlaniVacacion.setToolTipText("Ver"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPlaniVacacion.setToolTipText("Nuevo Rel"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.setToolTipText("Guardar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlaniVacacion.setToolTipText("Salir"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlaniVacacion";
		inputMap = this.jButtonNuevoPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlaniVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlaniVacacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarPlaniVacacion";
		inputMap = this.jButtonDuplicarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPlaniVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPlaniVacacion"));
		
		//COPIAR
		sMapKey = "CopiarPlaniVacacion";
		inputMap = this.jButtonCopiarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPlaniVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPlaniVacacion"));
		
		//VEr FORM
		sMapKey = "VerFormPlaniVacacion";
		inputMap = this.jButtonVerFormPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPlaniVacacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPlaniVacacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPlaniVacacion";
		inputMap = this.jButtonNuevoRelacionesPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPlaniVacacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPlaniVacacion";
		inputMap = this.jButtonModificarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPlaniVacacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPlaniVacacion";
		inputMap = this.jButtonCerrarPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlaniVacacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlaniVacacion";
		inputMap = this.jButtonGuardarCambiosTablaPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlaniVacacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPlaniVacacion.setName("jPanelParametrosReportesPlaniVacacion"); 
		
		this.jPanelParametrosReportesAccionesPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPlaniVacacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPlaniVacacion.setName("jPanelParametrosReportesAccionesPlaniVacacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPlaniVacacion = new JButtonMe();
		this.jButtonRecargarInformacionPlaniVacacion.setText("Recargar");
		this.jButtonRecargarInformacionPlaniVacacion.setToolTipText("Recargar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPlaniVacacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPlaniVacacion = new JButtonMe();
		this.jButtonProcesarInformacionPlaniVacacion.setText("Procesar");
		this.jButtonProcesarInformacionPlaniVacacion.setToolTipText("Procesar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPlaniVacacion.setVisible(false);
			
		this.jButtonProcesarInformacionPlaniVacacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaniVacacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPlaniVacacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaniVacacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPlaniVacacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaniVacacion.setText("TIPO");       
		this.jComboBoxTiposReportesPlaniVacacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPlaniVacacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPlaniVacacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPlaniVacacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionPlaniVacacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPlaniVacacion.setText("Accion");
		this.jComboBoxTiposRelacionesPlaniVacacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlaniVacacion.setText("Accion");
		this.jComboBoxTiposAccionesPlaniVacacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPlaniVacacion.setText("Accion");
		this.jComboBoxTiposSeleccionarPlaniVacacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPlaniVacacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPlaniVacacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaniVacacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPlaniVacacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPlaniVacacion = new JLabelMe();
		
		this.jLabelAccionesPlaniVacacion.setText("Acciones");		
		this.jLabelAccionesPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPlaniVacacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPlaniVacacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPlaniVacacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPlaniVacacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPlaniVacacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPlaniVacacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPlaniVacacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPlaniVacacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePlaniVacacion.setText("Graf.");
		this.jCheckBoxConGraficoReportePlaniVacacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPlaniVacacion = new JButtonMe();
		//this.jButtonAnterioresPlaniVacacion.setText("<<");
        this.jButtonAnterioresPlaniVacacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPlaniVacacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPlaniVacacion = new JButtonMe();
		//this.jButtonSiguientesPlaniVacacion.setText(">>");
        this.jButtonSiguientesPlaniVacacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPlaniVacacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPlaniVacacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPlaniVacacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosPlaniVacacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPlaniVacacion,"nuevoguardarcambios_button","Nue",this.planivacacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPlaniVacacion";
		inputMap = this.jButtonNuevoGuardarCambiosPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPlaniVacacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPlaniVacacion";
		inputMap = this.jButtonRecargarInformacionPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPlaniVacacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPlaniVacacion";
		inputMap = this.jButtonSiguientesPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPlaniVacacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPlaniVacacion";
		inputMap = this.jButtonAnterioresPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPlaniVacacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPlaniVacacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPlaniVacacion.setMinimumSize(new Dimension(this.getWidth(),PlaniVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaniVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaniVacacion.setMaximumSize(new Dimension(this.getWidth(),PlaniVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaniVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPlaniVacacion.setPreferredSize(new Dimension(this.getWidth(),PlaniVacacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PlaniVacacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPlaniVacacion = new GridBagLayout();

			this.jPanelPaginacionPlaniVacacion.setLayout(gridaBagLayoutPaginacionPlaniVacacion);						
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 0;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonAnterioresPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					
						
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaniVacacion.gridy = 0;
			
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonNuevoGuardarCambiosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
						
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPlaniVacacion.gridy = 0;
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonSiguientesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 1;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonNuevoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
						
			
			
			if(!this.planivacacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
				this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPlaniVacacion.gridy = 1;
				this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPlaniVacacion.add(this.jButtonGuardarCambiosTablaPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			}
			
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 1;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonDuplicarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 1;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonCopiarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 1;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonVerFormPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 1;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPlaniVacacion.add(this.jButtonCerrarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		
		this.jButtonRecargarInformacionPlaniVacacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaniVacacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPlaniVacacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPlaniVacacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaniVacacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPlaniVacacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPlaniVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaniVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPlaniVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPlaniVacacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaniVacacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPlaniVacacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPlaniVacacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaniVacacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPlaniVacacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPlaniVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaniVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPlaniVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPlaniVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaniVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlaniVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPlaniVacacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaniVacacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPlaniVacacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPlaniVacacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaniVacacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPlaniVacacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePlaniVacacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaniVacacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePlaniVacacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPlaniVacacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaniVacacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPlaniVacacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPlaniVacacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaniVacacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPlaniVacacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPlaniVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPlaniVacacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PlaniVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PlaniVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PlaniVacacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PlaniVacacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPlaniVacacion.setLayout(gridaBagParametrosReportesPlaniVacacion);
			this.jPanelParametrosReportesAccionesPlaniVacacion.setLayout(gridaBagParametrosReportesAccionesPlaniVacacion);
			
			
			this.jPanelParametrosAuxiliar1PlaniVacacion.setLayout(gridaBagParametrosAuxiliar1PlaniVacacion);
			this.jPanelParametrosAuxiliar2PlaniVacacion.setLayout(gridaBagParametrosAuxiliar2PlaniVacacion);
			this.jPanelParametrosAuxiliar3PlaniVacacion.setLayout(gridaBagParametrosAuxiliar3PlaniVacacion);
			this.jPanelParametrosAuxiliar4PlaniVacacion.setLayout(gridaBagParametrosAuxiliar4PlaniVacacion);
			//this.jPanelParametrosAuxiliar5PlaniVacacion.setLayout(gridaBagParametrosAuxiliar2PlaniVacacion);			
			
			
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaniVacacion.add(this.jButtonRecargarInformacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaniVacacion.add(this.jComboBoxTiposPaginacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaniVacacion.add(this.jCheckBoxConAltoMaximoTablaPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PlaniVacacion.add(this.jComboBoxTiposArchivosReportesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaniVacacion.add(this.jPanelParametrosAuxiliar1PlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PlaniVacacion.add(this.jComboBoxTiposReportesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);																		
			
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PlaniVacacion.add(this.jComboBoxTiposGraficosReportesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaniVacacion.add(this.jPanelParametrosAuxiliar4PlaniVacacion, this.gridBagConstraintsPlaniVacacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaniVacacion.add(this.jComboBoxTiposReportesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaniVacacion.add(this.jCheckBoxGenerarReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaniVacacion.add(this.jPanelParametrosAuxiliar2PlaniVacacion, this.gridBagConstraintsPlaniVacacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaniVacacion.add(this.jLabelAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
				this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPlaniVacacion.add(this.jButtonAbrirOrderByPlaniVacacion, this.gridBagConstraintsPlaniVacacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaniVacacion.add(this.jComboBoxTiposSeleccionarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			
			
			/*
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaniVacacion.add(this.jCheckBoxSeleccionarTodosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPlaniVacacion.add(this.jCheckBoxConGraficoReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaniVacacion.add(this.jCheckBoxSeleccionarTodosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);															
				
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaniVacacion.add(this.jCheckBoxSeleccionadosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);															
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPlaniVacacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PlaniVacacion.add(this.jCheckBoxConGraficoReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPlaniVacacion.add(this.jPanelParametrosAuxiliar3PlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaniVacacion.add(this.jComboBoxTiposAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
	
				
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPlaniVacacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPlaniVacacion.add(this.jTextFieldValorCampoGeneralPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPlaniVacacion = new GridBagLayout();

			this.jScrollPanelDatosPlaniVacacion.setLayout(gridaBagLayoutDatosPlaniVacacion);
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = 0;
			this.gridBagConstraintsPlaniVacacion.gridx = 0;
			
			this.jScrollPanelDatosPlaniVacacion.add(this.jTableDatosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPlaniVacacion.setViewportView(this.jTableDatosPlaniVacacion);
		this.jTableDatosPlaniVacacion.setFillsViewportHeight(true);
		this.jTableDatosPlaniVacacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPlaniVacacion= new GridBagLayout();
		this.jPanelAccionesPlaniVacacion.setLayout(gridaBagLayoutAccionesPlaniVacacion);
		
		
		/*	
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = 0;
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
			
		this.jPanelAccionesPlaniVacacion.add(this.jButtonNuevoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoPlaniVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPlaniVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPlaniVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPlaniVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPlaniVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPlaniVacacion.setLayout(gridaBagLayoutFK_IdEmpleadoPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 0;
		jPanelFK_IdEmpleadoPlaniVacacion.add(jLabelid_empleadoFK_IdEmpleadoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 1;
		jPanelFK_IdEmpleadoPlaniVacacion.add(jComboBoxid_empleadoFK_IdEmpleadoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 1;
		gridBagConstraintsPlaniVacacion.gridx =1;
		jPanelFK_IdEmpleadoPlaniVacacion.add(jButtonFK_IdEmpleadoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		jTabbedPaneBusquedasPlaniVacacion.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoPlaniVacacion);
		jTabbedPaneBusquedasPlaniVacacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraPlaniVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraPlaniVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraPlaniVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraPlaniVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraPlaniVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraPlaniVacacion.setLayout(gridaBagLayoutFK_IdEstructuraPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 0;
		jPanelFK_IdEstructuraPlaniVacacion.add(jLabelid_estructuraFK_IdEstructuraPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 1;
		jPanelFK_IdEstructuraPlaniVacacion.add(jComboBoxid_estructuraFK_IdEstructuraPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 1;
		gridBagConstraintsPlaniVacacion.gridx =1;
		jPanelFK_IdEstructuraPlaniVacacion.add(jButtonFK_IdEstructuraPlaniVacacion, gridBagConstraintsPlaniVacacion);

		jTabbedPaneBusquedasPlaniVacacion.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraPlaniVacacion);
		jTabbedPaneBusquedasPlaniVacacion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraCargoPlaniVacacion.setLayout(gridaBagLayoutFK_IdEstructuraCargoPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 0;
		jPanelFK_IdEstructuraCargoPlaniVacacion.add(jLabelid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 1;
		jPanelFK_IdEstructuraCargoPlaniVacacion.add(jComboBoxid_estructura_cargoFK_IdEstructuraCargoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 1;
		gridBagConstraintsPlaniVacacion.gridx =1;
		jPanelFK_IdEstructuraCargoPlaniVacacion.add(jButtonFK_IdEstructuraCargoPlaniVacacion, gridBagConstraintsPlaniVacacion);

		jTabbedPaneBusquedasPlaniVacacion.addTab("3.-Por Estructura Cargo ", jPanelFK_IdEstructuraCargoPlaniVacacion);
		jTabbedPaneBusquedasPlaniVacacion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraSeccionPlaniVacacion.setLayout(gridaBagLayoutFK_IdEstructuraSeccionPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 0;
		jPanelFK_IdEstructuraSeccionPlaniVacacion.add(jLabelid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 1;
		jPanelFK_IdEstructuraSeccionPlaniVacacion.add(jComboBoxid_estructura_seccionFK_IdEstructuraSeccionPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 1;
		gridBagConstraintsPlaniVacacion.gridx =1;
		jPanelFK_IdEstructuraSeccionPlaniVacacion.add(jButtonFK_IdEstructuraSeccionPlaniVacacion, gridBagConstraintsPlaniVacacion);

		jTabbedPaneBusquedasPlaniVacacion.addTab("4.-Por Estructura Seccion ", jPanelFK_IdEstructuraSeccionPlaniVacacion);
		jTabbedPaneBusquedasPlaniVacacion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdMesPlaniVacacion= new GridBagLayout();
		gridaBagLayoutFK_IdMesPlaniVacacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesPlaniVacacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesPlaniVacacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesPlaniVacacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesPlaniVacacion.setLayout(gridaBagLayoutFK_IdMesPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 0;
		jPanelFK_IdMesPlaniVacacion.add(jLabelid_mesFK_IdMesPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 0;
		gridBagConstraintsPlaniVacacion.gridx = 1;
		jPanelFK_IdMesPlaniVacacion.add(jComboBoxid_mesFK_IdMesPlaniVacacion, gridBagConstraintsPlaniVacacion);

		gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPlaniVacacion.gridy = 1;
		gridBagConstraintsPlaniVacacion.gridx =1;
		jPanelFK_IdMesPlaniVacacion.add(jButtonFK_IdMesPlaniVacacion, gridBagConstraintsPlaniVacacion);

		jTabbedPaneBusquedasPlaniVacacion.addTab("5.-Por Mes ", jPanelFK_IdMesPlaniVacacion);
		jTabbedPaneBusquedasPlaniVacacion.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlaniVacacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlaniVacacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planivacacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();						
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaniVacacion.gridx = 0;		
			//this.gridBagConstraintsPlaniVacacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlaniVacacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPlaniVacacion, this.gridBagConstraintsPlaniVacacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPlaniVacacion.gridx = 0;		
		//this.gridBagConstraintsPlaniVacacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPlaniVacacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPlaniVacacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlaniVacacion.gridx = 0;		
			this.gridBagConstraintsPlaniVacacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPlaniVacacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPlaniVacacion, this.gridBagConstraintsPlaniVacacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);								
		
		
		/*
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		*/		
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlaniVacacion.gridx =0;
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlaniVacacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
				
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PlaniVacacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPlaniVacacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlaniVacacion = new GridBagLayout();
			this.jPanelBusquedasParametrosPlaniVacacion.setLayout(gridaBagLayoutBusquedasParametrosPlaniVacacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPlaniVacacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlaniVacacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaniVacacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlaniVacacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
			
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlaniVacacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPlaniVacacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPlaniVacacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPlaniVacacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPlaniVacacion.setName("jPanelReporteDinamicoPlaniVacacion"); 
		
		this.jPanelReporteDinamicoPlaniVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaniVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPlaniVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPlaniVacacion.setLayout(gridaBagLayoutReporteDinamicoPlaniVacacion);
		
		
		this.jInternalFrameReporteDinamicoPlaniVacacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPlaniVacacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaniVacacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPlaniVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPlaniVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPlaniVacacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPlaniVacacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPlaniVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPlaniVacacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoPlaniVacacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoPlaniVacacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPlaniVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaniVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPlaniVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePlaniVacacion = new JLabelMe();

		this.jLabelColumnasSelectReportePlaniVacacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelColumnasSelectReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePlaniVacacion = new JList<Reporte>();
		this.jListColumnasSelectReportePlaniVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePlaniVacacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePlaniVacacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaniVacacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePlaniVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePlaniVacacion=new JScrollPane(this.jListColumnasSelectReportePlaniVacacion);
			
			this.jScrollColumnasSelectReportePlaniVacacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaniVacacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePlaniVacacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPlaniVacacion.add(this.jListColumnasSelectReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jScrollColumnasSelectReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePlaniVacacion = new JLabelMe();

		this.jLabelRelacionesSelectReportePlaniVacacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePlaniVacacion = new JList<Reporte>();
		this.jListRelacionesSelectReportePlaniVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePlaniVacacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePlaniVacacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaniVacacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePlaniVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePlaniVacacion=new JScrollPane(this.jListRelacionesSelectReportePlaniVacacion);
			
			this.jScrollRelacionesSelectReportePlaniVacacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaniVacacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePlaniVacacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPlaniVacacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPlaniVacacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoPlaniVacacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPlaniVacacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPlaniVacacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPlaniVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaniVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPlaniVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPlaniVacacion = new JLabelMe();

		this.jLabelConGraficoDinamicoPlaniVacacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelConGraficoDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPlaniVacacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPlaniVacacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPlaniVacacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPlaniVacacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPlaniVacacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPlaniVacacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jCheckBoxConGraficoDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPlaniVacacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPlaniVacacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelColumnaCategoriaGraficoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jComboBoxColumnaCategoriaGraficoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPlaniVacacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorPlaniVacacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelColumnaCategoriaValorPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPlaniVacacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPlaniVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPlaniVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPlaniVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPlaniVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jComboBoxColumnaCategoriaValorPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPlaniVacacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoPlaniVacacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelColumnasValoresGraficoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPlaniVacacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoPlaniVacacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPlaniVacacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPlaniVacacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPlaniVacacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPlaniVacacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPlaniVacacion=new JScrollPane(this.jListColumnasValoresGraficoPlaniVacacion);
			
			this.jScrollColumnasValoresGraficoPlaniVacacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPlaniVacacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPlaniVacacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPlaniVacacion.add(this.jListColumnasSelectReportePlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jScrollColumnasValoresGraficoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPlaniVacacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPlaniVacacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelTiposGraficosReportesDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPlaniVacacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jComboBoxTiposGraficosReportesDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPlaniVacacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPlaniVacacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelGenerarExcelReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPlaniVacacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPlaniVacacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPlaniVacacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPlaniVacacion.setToolTipText("Generar EXCEL"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		//this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPlaniVacacion.add(this.jButtonGenerarExcelReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jComboBoxTiposReportesDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPlaniVacacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPlaniVacacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jLabelTiposArchivoReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jComboBoxTiposArchivosReportesDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPlaniVacacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPlaniVacacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPlaniVacacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPlaniVacacion.setToolTipText("Generar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jButtonGenerarReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPlaniVacacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPlaniVacacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPlaniVacacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPlaniVacacion.setToolTipText("Cancelar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPlaniVacacion.add(this.jButtonCerrarReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPlaniVacacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPlaniVacacion= new JScrollPane(jPanelReporteDinamicoPlaniVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPlaniVacacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaniVacacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPlaniVacacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPlaniVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPlaniVacacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPlaniVacacion);
		this.jInternalFrameReporteDinamicoPlaniVacacion.getContentPane().add(this.jScrollPanelReporteDinamicoPlaniVacacion, this.gridBagConstraintsPlaniVacacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPlaniVacacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPlaniVacacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPlaniVacacion.setName("jPanelImportacionPlaniVacacion"); 
		
		this.jPanelImportacionPlaniVacacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaniVacacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPlaniVacacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPlaniVacacion.setLayout(gridaBagLayoutImportacionPlaniVacacion);
		
		
		this.jInternalFrameImportacionPlaniVacacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPlaniVacacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPlaniVacacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePlaniVacacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPlaniVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaniVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaniVacacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPlaniVacacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaniVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaniVacacion.setResizable(true);
	    this.jInternalFrameImportacionPlaniVacacion.setClosable(true);
	    this.jInternalFrameImportacionPlaniVacacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPlaniVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPlaniVacacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPlaniVacacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPlaniVacacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPlaniVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPlaniVacacion.setResizable(true);
	    this.jInternalFrameImportacionPlaniVacacion.setClosable(true);
	    this.jInternalFrameImportacionPlaniVacacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPlaniVacacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaniVacacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPlaniVacacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPlaniVacacion = new JLabelMe();

		this.jLabelArchivoImportacionPlaniVacacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaniVacacion.add(this.jLabelArchivoImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPlaniVacacion = new JFileChooser();		
		this.jFileChooserImportacionPlaniVacacion.setToolTipText("ESCOGER ARCHIVO"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPlaniVacacion = new JButtonMe();
		this.jButtonAbrirImportacionPlaniVacacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPlaniVacacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPlaniVacacion.setToolTipText("Generar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaniVacacion.add(this.jButtonAbrirImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPlaniVacacion = new JLabelMe();

		this.jLabelPathArchivoImportacionPlaniVacacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPlaniVacacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaniVacacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPlaniVacacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPlaniVacacion.add(this.jLabelPathArchivoImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPlaniVacacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPlaniVacacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaniVacacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPlaniVacacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaniVacacion.add(this.jTextFieldPathArchivoImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPlaniVacacion = new JButtonMe();
		this.jButtonGenerarImportacionPlaniVacacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPlaniVacacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPlaniVacacion.setToolTipText("Generar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaniVacacion.add(this.jButtonGenerarImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPlaniVacacion = new JButtonMe();
		this.jButtonCerrarImportacionPlaniVacacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPlaniVacacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPlaniVacacion.setToolTipText("Cancelar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlaniVacacion.gridy = iPosYImportacion;
		this.gridBagConstraintsPlaniVacacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPlaniVacacion.add(this.jButtonCerrarImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPlaniVacacion = new GridBagLayout();
		
		this.jScrollPanelImportacionPlaniVacacion= new JScrollPane(jPanelImportacionPlaniVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
		this.gridBagConstraintsPlaniVacacion.gridy =iPosYImportacion;
		this.gridBagConstraintsPlaniVacacion.gridx =iPosXImportacion;
		this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPlaniVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPlaniVacacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPlaniVacacion);
		this.jInternalFrameImportacionPlaniVacacion.getContentPane().add(this.jScrollPanelImportacionPlaniVacacion, this.gridBagConstraintsPlaniVacacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPlaniVacacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPlaniVacacion = new JButtonMe();
			this.jButtonAbrirOrderByPlaniVacacion.setText("Orden");
			this.jButtonAbrirOrderByPlaniVacacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPlaniVacacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPlaniVacacion";
			inputMap = this.jButtonAbrirOrderByPlaniVacacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPlaniVacacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPlaniVacacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByPlaniVacacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPlaniVacacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPlaniVacacion.setName("jPanelOrderByPlaniVacacion"); 
			
			this.jPanelOrderByPlaniVacacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaniVacacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPlaniVacacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPlaniVacacion.setLayout(gridaBagLayoutOrderByPlaniVacacion);
			
			
			this.jTableDatosPlaniVacacionOrderBy = new JTableMe();        
			this.jTableDatosPlaniVacacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPlaniVacacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPlaniVacacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPlaniVacacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPlaniVacacionOrderBy.setViewportView(this.jTableDatosPlaniVacacionOrderBy);
			this.jTableDatosPlaniVacacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPlaniVacacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPlaniVacacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPlaniVacacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPlaniVacacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePlaniVacacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPlaniVacacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPlaniVacacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPlaniVacacion.setTitle("Orden");
			this.jInternalFrameOrderByPlaniVacacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPlaniVacacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPlaniVacacion.setResizable(true);
			this.jInternalFrameOrderByPlaniVacacion.setClosable(true);
			this.jInternalFrameOrderByPlaniVacacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPlaniVacacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaniVacacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPlaniVacacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPlaniVacacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Plani Vacaciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPlaniVacacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPlaniVacacion.ipady =150;
				
			this.jPanelOrderByPlaniVacacion.add(jScrollPanelDatosPlaniVacacionOrderBy, this.gridBagConstraintsPlaniVacacion);//this.jTableDatosPlaniVacacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPlaniVacacion = new JButtonMe();
			this.jButtonCerrarOrderByPlaniVacacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPlaniVacacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPlaniVacacion.setToolTipText("Cancelar"+" "+PlaniVacacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPlaniVacacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlaniVacacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPlaniVacacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPlaniVacacion.add(this.jButtonCerrarOrderByPlaniVacacion, this.gridBagConstraintsPlaniVacacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPlaniVacacion = new GridBagLayout();
			
			this.jScrollPanelOrderByPlaniVacacion= new JScrollPane(jPanelOrderByPlaniVacacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPlaniVacacion = new GridBagConstraints();
			this.gridBagConstraintsPlaniVacacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsPlaniVacacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsPlaniVacacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPlaniVacacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPlaniVacacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPlaniVacacion);
			
			this.jInternalFrameOrderByPlaniVacacion.getContentPane().add(this.jScrollPanelOrderByPlaniVacacion, this.gridBagConstraintsPlaniVacacion);			
		
		} else {
			this.jButtonAbrirOrderByPlaniVacacion = new JButtonMe();
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
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.planivacacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPlaniVacacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPlaniVacacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPlaniVacacion.getRowHeight();//PlaniVacacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaniVacacion.isSelected()) {
					iHeightTable=PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPlaniVacacion.isSelected()) {
					iHeightTable=PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PlaniVacacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPlaniVacacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaniVacacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPlaniVacacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPlaniVacacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaniVacacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPlaniVacacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPlaniVacacion!=null && this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy()!=null) {
			//if(!this.planivacacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPlaniVacacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPlaniVacacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPlaniVacacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPlaniVacacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPlaniVacacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaniVacacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPlaniVacacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=planivacacionLogic.getPlaniVacacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planivacacions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PlaniVacacion> TraerPlaniVacacionBeans(List<PlaniVacacion> planivacacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(PlaniVacacion planivacacion:planivacacions) {
					
				if(!(PlaniVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PlaniVacacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					planivacacion.setsDetalleGeneralEntityReporte(PlaniVacacionConstantesFunciones.getPlaniVacacionDescripcion(planivacacion));
										
						
					
						
					
				} else  {
							
					//planivacacion.setsDetalleGeneralEntityReporte(planivacacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//planivacacionbeans.add(planivacacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return planivacacions;
    }
	//PARA REPORTES FIN
}
