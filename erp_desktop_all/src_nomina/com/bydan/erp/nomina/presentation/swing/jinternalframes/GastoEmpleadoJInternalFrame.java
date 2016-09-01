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
import com.bydan.erp.nomina.util.GastoEmpleadoConstantesFunciones;

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
public class GastoEmpleadoJInternalFrame extends GastoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGastoEmpleado;
	
	protected JMenuBar jmenuBarGastoEmpleado;
	
	protected JMenu jmenuGastoEmpleado;
	protected JMenu jmenuDatosGastoEmpleado;
	protected JMenu jmenuArchivoGastoEmpleado;
	protected JMenu jmenuAccionesGastoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGastoEmpleado;	
	protected GridBagConstraints gridBagConstraintsGastoEmpleado;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GastoEmpleadoDetalleFormJInternalFrame jInternalFrameDetalleFormGastoEmpleado;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGastoEmpleado;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGastoEmpleado;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EstadoGastoEmpleadoBeanSwingJInternalFrame estadogastoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadogastoempleado="";
	
	public GastoEmpleadoSessionBean gastoempleadoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GastoEmpleado> gastoempleados;		
	public List<GastoEmpleado> gastoempleadosEliminados;	
	public List<GastoEmpleado> gastoempleadosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGastoEmpleado;		
	protected JButton jButtonAbrirOrderByGastoEmpleado;
	
	
	//protected JPanel jPanelOrderByGastoEmpleado;
	//public JScrollPane jScrollPanelOrderByGastoEmpleado;	
	//protected JButton jButtonCerrarOrderByGastoEmpleado;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GastoEmpleadoLogic gastoempleadoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGastoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionGastoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralGastoEmpleado;
    
	
	
	//public JScrollPane jScrollPanelDatosGastoEmpleadoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGastoEmpleado;
	//public JScrollPane jScrollPanelImportacionGastoEmpleado;
	
	
	
	protected JPanel jPanelAccionesGastoEmpleado;
	
    protected JPanel jPanelPaginacionGastoEmpleado;
    protected JPanel jPanelParametrosReportesGastoEmpleado;
	protected JPanel jPanelParametrosReportesAccionesGastoEmpleado;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar2GastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar3GastoEmpleado;
	protected JPanel jPanelParametrosAuxiliar4GastoEmpleado;
	//protected JPanel jPanelParametrosAuxiliar5GastoEmpleado;
	
	
	
	//protected JPanel jPanelReporteDinamicoGastoEmpleado;
	//protected JPanel jPanelImportacionGastoEmpleado;
	
	
	public JTable jTableDatosGastoEmpleado;
	
	
	
	//public JTable jTableDatosGastoEmpleadoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGastoEmpleado;
	protected JButton jButtonDuplicarGastoEmpleado;
	protected JButton jButtonCopiarGastoEmpleado;
	protected JButton jButtonVerFormGastoEmpleado;
	protected JButton jButtonNuevoRelacionesGastoEmpleado;
	protected JButton jButtonModificarGastoEmpleado;
	
    protected JButton jButtonGuardarCambiosTablaGastoEmpleado;
	protected JButton jButtonCerrarGastoEmpleado;
	
	
	protected JButton jButtonRecargarInformacionGastoEmpleado;
	protected JButton jButtonProcesarInformacionGastoEmpleado;
	
	
	protected JButton jButtonAnterioresGastoEmpleado;
	protected JButton jButtonSiguientesGastoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosGastoEmpleado;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGastoEmpleado;
	//protected JButton jButtonCerrarReporteDinamicoGastoEmpleado;
	//protected JButton jButtonGenerarExcelReporteDinamicoGastoEmpleado;	
	
	
	
	//protected JButton jButtonAbrirImportacionGastoEmpleado;
	//protected JButton jButtonGenerarImportacionGastoEmpleado;
	//protected JButton jButtonCerrarImportacionGastoEmpleado;
	//protected JFileChooser jFileChooserImportacionGastoEmpleado;
	//protected File fileImportacionGastoEmpleado;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGastoEmpleado;
	protected JButton jButtonDuplicarToolBarGastoEmpleado;
	protected JButton jButtonNuevoRelacionesToolBarGastoEmpleado;
	
	
	public JButton jButtonGuardarCambiosToolBarGastoEmpleado;
	protected JButton jButtonCopiarToolBarGastoEmpleado;
	protected JButton jButtonVerFormToolBarGastoEmpleado;
	public JButton jButtonGuardarCambiosTablaToolBarGastoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarGastoEmpleado;
	protected JButton jButtonCerrarToolBarGastoEmpleado;
	
	protected JButton jButtonRecargarInformacionToolBarGastoEmpleado;
	protected JButton jButtonProcesarInformacionToolBarGastoEmpleado;
	protected JButton jButtonAnterioresToolBarGastoEmpleado;
	protected JButton jButtonSiguientesToolBarGastoEmpleado;
	protected JButton jButtonNuevoGuardarCambiosToolBarGastoEmpleado;
	protected JButton jButtonAbrirOrderByToolBarGastoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGastoEmpleado;
	protected JMenuItem jMenuItemDuplicarGastoEmpleado;
	protected JMenuItem jMenuItemNuevoRelacionesGastoEmpleado;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGastoEmpleado;
	protected JMenuItem jMenuItemCopiarGastoEmpleado;
	protected JMenuItem jMenuItemVerFormGastoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaGastoEmpleado;
	protected JMenuItem jMenuItemCerrarGastoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarGastoEmpleado;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGastoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarGastoEmpleado;
	
	protected JMenuItem jMenuItemRecargarInformacionGastoEmpleado;
	protected JMenuItem jMenuItemProcesarInformacionGastoEmpleado;
	protected JMenuItem jMenuItemAnterioresGastoEmpleado;
	protected JMenuItem jMenuItemSiguientesGastoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGastoEmpleado;
	protected JMenuItem jMenuItemAbrirOrderByGastoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarGastoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGastoEmpleado;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGastoEmpleado;
	protected JCheckBox jCheckBoxSeleccionadosGastoEmpleado;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGastoEmpleado;
	protected JCheckBox jCheckBoxConGraficoReporteGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGastoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGastoEmpleado;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGastoEmpleado;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGastoEmpleado;
	protected JTextField jTextFieldValorCampoGeneralGastoEmpleado;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGastoEmpleado;
	//public JList<Reporte> jListColumnasSelectReporteGastoEmpleado;
	//public JScrollPane jScrollColumnasSelectReporteGastoEmpleado;
	
	//public JLabel jLabelRelacionesSelectReporteGastoEmpleado;
	//public JList<Reporte> jListRelacionesSelectReporteGastoEmpleado;
	//public JScrollPane jScrollRelacionesSelectReporteGastoEmpleado;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGastoEmpleado;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGastoEmpleado;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGastoEmpleado;
	//public JLabel jLabelTiposArchivoReporteDinamicoGastoEmpleado;
	
		
	//public JLabel jLabelArchivoImportacionGastoEmpleado;	
	//public JLabel jLabelPathArchivoImportacionGastoEmpleado;
	//protected JTextField jTextFieldPathArchivoImportacionGastoEmpleado;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGastoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGastoEmpleado;
	
	//public JLabel jLabelColumnaCategoriaValorGastoEmpleado;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGastoEmpleado;
	
	//public JLabel jLabelColumnasValoresGraficoGastoEmpleado;
	//public JList<Reporte> jListColumnasValoresGraficoGastoEmpleado;
	//public JScrollPane jScrollColumnasValoresGraficoGastoEmpleado;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGastoEmpleado;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGastoEmpleado;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGastoEmpleado;
	public JPanel jPanelFK_IdAnioGastoEmpleado;
	public JButton jButtonFK_IdAnioGastoEmpleado;
	public JPanel jPanelFK_IdCiudadGastoEmpleado;
	public JButton jButtonFK_IdCiudadGastoEmpleado;
	public JPanel jPanelFK_IdEmpleadoGastoEmpleado;
	public JButton jButtonFK_IdEmpleadoGastoEmpleado;
	public JPanel jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado;
	public JButton jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado;
	public JPanel jPanelFK_IdMesGastoEmpleado;
	public JButton jButtonFK_IdMesGastoEmpleado;
	public JPanel jPanelFK_IdPaisGastoEmpleado;
	public JButton jButtonFK_IdPaisGastoEmpleado;
	
	public JPanel jPanelid_anioFK_IdAnioGastoEmpleado;
	public JLabel jLabelid_anioFK_IdAnioGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioGastoEmpleado;
	public JButton jButtonid_anioFK_IdAnioGastoEmpleado= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadFK_IdCiudadGastoEmpleado;
	public JLabel jLabelid_ciudadFK_IdCiudadGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadFK_IdCiudadGastoEmpleado;
	public JButton jButtonid_ciudadFK_IdCiudadGastoEmpleado= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadFK_IdCiudadGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoGastoEmpleado;
	public JLabel jLabelid_empleadoFK_IdEmpleadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado;
	public JButton jButtonid_empleadoFK_IdEmpleadoGastoEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado;
	public JLabel jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado;
	public JButton jButtonid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado= new JButtonMe();
	public JButton jButtonid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesGastoEmpleado;
	public JLabel jLabelid_mesFK_IdMesGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesGastoEmpleado;
	public JButton jButtonid_mesFK_IdMesGastoEmpleado= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesGastoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisGastoEmpleado;
	public JLabel jLabelid_paisFK_IdPaisGastoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisGastoEmpleado;
	public JButton jButtonid_paisFK_IdPaisGastoEmpleado= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisGastoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisGastoEmpleadoBusqueda= new JButtonMe();

	
	
	
	
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
	public GastoEmpleadoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GastoEmpleadoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGastoEmpleado)	{
		this.jButtonRecargarInformacionGastoEmpleado = jButtonRecargarInformacionGastoEmpleado;
	}
	
	public JButton getjButtonProcesarInformacionGastoEmpleado() {
		return this.jButtonProcesarInformacionGastoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGastoEmpleado)	{
		this.jButtonProcesarInformacionGastoEmpleado = jButtonProcesarInformacionGastoEmpleado;
	}
	
	
	public JButton getjButtonRecargarInformacionGastoEmpleado() {
		return this.jButtonRecargarInformacionGastoEmpleado;
	}
	
	
	public List<GastoEmpleado> getgastoempleados() {
		return this.gastoempleados;
	}

	public void setgastoempleados(List<GastoEmpleado> gastoempleados) {
		this.gastoempleados = gastoempleados;
	}
	
	public List<GastoEmpleado> getgastoempleadosAux() {
		return this.gastoempleadosAux;
	}

	public void setgastoempleadosAux(List<GastoEmpleado> gastoempleadosAux) {
		this.gastoempleadosAux = gastoempleadosAux;
	}
	
	public List<GastoEmpleado> getgastoempleadosEliminados() {
		return this.gastoempleadosEliminados;
	}

	public void setGastoEmpleadosEliminados(List<GastoEmpleado> gastoempleadosEliminados) {
		this.gastoempleadosEliminados = gastoempleadosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGastoEmpleado() {
		return jComboBoxTiposSeleccionarGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGastoEmpleado(
			JComboBox jComboBoxTiposSeleccionarGastoEmpleado) {
		this.jComboBoxTiposSeleccionarGastoEmpleado = jComboBoxTiposSeleccionarGastoEmpleado;
	}
	
	public void setBorderResaltarTiposSeleccionarGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGastoEmpleado() {
		return jTextFieldValorCampoGeneralGastoEmpleado;
	}

	public void setjTextFieldValorCampoGeneralGastoEmpleado(
			JTextField jTextFieldValorCampoGeneralGastoEmpleado) {
		this.jTextFieldValorCampoGeneralGastoEmpleado = jTextFieldValorCampoGeneralGastoEmpleado;
	}

	public void setBorderResaltarValorCampoGeneralGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGastoEmpleado .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGastoEmpleado() {
		return this.jCheckBoxSeleccionarTodosGastoEmpleado;
	}

	public void setjCheckBoxSeleccionarTodosGastoEmpleado(
			JCheckBox jCheckBoxSeleccionarTodosGastoEmpleado) {
		this.jCheckBoxSeleccionarTodosGastoEmpleado = jCheckBoxSeleccionarTodosGastoEmpleado;
	}

	public void setBorderResaltarSeleccionarTodosGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGastoEmpleado() {
		return this.jCheckBoxSeleccionadosGastoEmpleado;
	}

	public void setjCheckBoxSeleccionadosGastoEmpleado(
			JCheckBox jCheckBoxSeleccionadosGastoEmpleado) {
		this.jCheckBoxSeleccionadosGastoEmpleado = jCheckBoxSeleccionadosGastoEmpleado;
	}
	
	public void setBorderResaltarSeleccionadosGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGastoEmpleado .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGastoEmpleado() {
		return this.jComboBoxTiposArchivosReportesGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGastoEmpleado(
			JComboBox jComboBoxTiposArchivosReportesGastoEmpleado) {
		this.jComboBoxTiposArchivosReportesGastoEmpleado = jComboBoxTiposArchivosReportesGastoEmpleado;
	}

	public void setBorderResaltarTiposArchivosReportesGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGastoEmpleado() {
		return this.jComboBoxTiposReportesGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGastoEmpleado(
			JComboBox jComboBoxTiposReportesGastoEmpleado) {
		this.jComboBoxTiposReportesGastoEmpleado = jComboBoxTiposReportesGastoEmpleado;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGastoEmpleado() {
	//	return jComboBoxTiposReportesDinamicoGastoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGastoEmpleado(
	//		JComboBox jComboBoxTiposReportesDinamicoGastoEmpleado) {
	//	this.jComboBoxTiposReportesDinamicoGastoEmpleado = jComboBoxTiposReportesDinamicoGastoEmpleado;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGastoEmpleado() {
	//	return jComboBoxTiposArchivosReportesDinamicoGastoEmpleado;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGastoEmpleado(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGastoEmpleado) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado = jComboBoxTiposArchivosReportesDinamicoGastoEmpleado;
	//}
	
	public void setBorderResaltarTiposReportesGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGastoEmpleado() {
		return this.jComboBoxTiposGraficosReportesGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGastoEmpleado(
			JComboBox jComboBoxTiposGraficosReportesGastoEmpleado) {
		this.jComboBoxTiposGraficosReportesGastoEmpleado = jComboBoxTiposGraficosReportesGastoEmpleado;
	}
	
	public void setBorderResaltarTiposGraficosReportesGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGastoEmpleado() {
		return this.jComboBoxTiposPaginacionGastoEmpleado;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGastoEmpleado(
			JComboBox jComboBoxTiposPaginacionGastoEmpleado) {
		this.jComboBoxTiposPaginacionGastoEmpleado = jComboBoxTiposPaginacionGastoEmpleado;
	}
	
	public void setBorderResaltarTiposPaginacionGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGastoEmpleado .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGastoEmpleado() {
		return this.jComboBoxTiposRelacionesGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGastoEmpleado() {
		return this.jComboBoxTiposAccionesGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGastoEmpleado(
			JComboBox jComboBoxTiposRelacionesGastoEmpleado) {
		this.jComboBoxTiposRelacionesGastoEmpleado = jComboBoxTiposRelacionesGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGastoEmpleado(
			JComboBox jComboBoxTiposAccionesGastoEmpleado) {
		this.jComboBoxTiposAccionesGastoEmpleado = jComboBoxTiposAccionesGastoEmpleado;
	}
	
	public void setBorderResaltarTiposRelacionesGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGastoEmpleado .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGastoEmpleado() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGastoEmpleado .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGastoEmpleado() {
	//	return jCheckBoxConGraficoDinamicoGastoEmpleado;
	//}

	//public void setjCheckBoxConGraficoDinamicoGastoEmpleado(
	//		JCheckBox jCheckBoxConGraficoDinamicoGastoEmpleado) {
	//	this.jCheckBoxConGraficoDinamicoGastoEmpleado = jCheckBoxConGraficoDinamicoGastoEmpleado;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGastoEmpleado() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGastoEmpleado.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGastoEmpleado .setBorder(borderResaltar);		
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
		this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		
		this.gastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.gastoempleadoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GastoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Gasto Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
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
		
		GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGastoEmpleado= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"nuevo","nuevo","Nuevo"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"duplicar","duplicar","Duplicar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"copiar","copiar","Copiar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"ver_form","ver_form","Ver"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"recargar","recargar","Recargar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGastoEmpleado,this.jTtoolBarGastoEmpleado,
							"cerrar","cerrar","Salir"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGastoEmpleado=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGastoEmpleado;
			
				this.jButtonProcesarInformacionToolBarGastoEmpleado=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGastoEmpleado;
				
		//protected JButton jButtonModificarToolBarGastoEmpleado;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGastoEmpleado=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGastoEmpleado=new JMenuMe("General");
		this.jmenuArchivoGastoEmpleado=new JMenuMe("Archivo");
		this.jmenuAccionesGastoEmpleado=new JMenuMe("Acciones");
		this.jmenuDatosGastoEmpleado=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGastoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGastoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGastoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGastoEmpleado= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGastoEmpleado.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGastoEmpleado,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGastoEmpleado= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGastoEmpleado.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGastoEmpleado,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGastoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGastoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGastoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGastoEmpleado= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGastoEmpleado.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGastoEmpleado,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGastoEmpleado= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGastoEmpleado.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGastoEmpleado,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGastoEmpleado= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGastoEmpleado.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGastoEmpleado,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGastoEmpleado= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGastoEmpleado.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGastoEmpleado,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGastoEmpleado= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGastoEmpleado.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGastoEmpleado,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGastoEmpleado= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGastoEmpleado.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGastoEmpleado,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGastoEmpleado= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGastoEmpleado.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGastoEmpleado,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGastoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGastoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGastoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGastoEmpleado= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGastoEmpleado.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGastoEmpleado,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGastoEmpleado= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGastoEmpleado.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGastoEmpleado,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGastoEmpleado.add(this.jMenuItemCerrarGastoEmpleado);
			
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemNuevoGastoEmpleado);
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemNuevoGuardarCambiosGastoEmpleado);
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemNuevoRelacionesGastoEmpleado);
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemGuardarCambiosTablaGastoEmpleado);		
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemDuplicarGastoEmpleado);		
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemCopiarGastoEmpleado);		
			this.jmenuAccionesGastoEmpleado.add(this.jMenuItemVerFormGastoEmpleado);		
			
			this.jmenuDatosGastoEmpleado.add(this.jMenuItemRecargarInformacionGastoEmpleado);				
			this.jmenuDatosGastoEmpleado.add(this.jMenuItemAnterioresGastoEmpleado);				
			this.jmenuDatosGastoEmpleado.add(this.jMenuItemSiguientesGastoEmpleado);				
			this.jmenuDatosGastoEmpleado.add(this.jMenuItemAbrirOrderByGastoEmpleado);				
			this.jmenuDatosGastoEmpleado.add(this.jMenuItemMostrarOcultarGastoEmpleado);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGastoEmpleado.add(this.jMenuItemGuardarCambiosGastoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGastoEmpleado.add(this.jmenuArchivoGastoEmpleado);		
			this.jmenuBarGastoEmpleado.add(this.jmenuAccionesGastoEmpleado);		
			this.jmenuBarGastoEmpleado.add(this.jmenuDatosGastoEmpleado);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGastoEmpleado);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGastoEmpleado() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioGastoEmpleado.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdAnioGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdAnioGastoEmpleado.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioGastoEmpleado,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioGastoEmpleado = new JLabelMe();
		jLabelid_anioFK_IdAnioGastoEmpleado.setText("Anio :");
		jLabelid_anioFK_IdAnioGastoEmpleado.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioGastoEmpleado= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCiudadGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCiudadGastoEmpleado.setToolTipText("Buscar Por Ciudad ");
		this.jButtonFK_IdCiudadGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdCiudadGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdCiudadGastoEmpleado.setToolTipText("Buscar Por Ciudad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCiudadGastoEmpleado,"buscar_button","Buscar Por Ciudad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCiudadGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ciudadFK_IdCiudadGastoEmpleado = new JLabelMe();
		jLabelid_ciudadFK_IdCiudadGastoEmpleado.setText("Ciudad :");
		jLabelid_ciudadFK_IdCiudadGastoEmpleado.setToolTipText("Ciudad");
		jLabelid_ciudadFK_IdCiudadGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadFK_IdCiudadGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadFK_IdCiudadGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadFK_IdCiudadGastoEmpleado= new JComboBoxMe();
		jComboBoxid_ciudadFK_IdCiudadGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadFK_IdCiudadGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadFK_IdCiudadGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoGastoEmpleado.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdEmpleadoGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdEmpleadoGastoEmpleado.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoGastoEmpleado,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado.setToolTipText("Buscar Por Estado Gasto Empleado ");
		this.jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado.setToolTipText("Buscar Por Estado Gasto Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado,"buscar_button","Buscar Por Estado Gasto Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado = new JLabelMe();
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setText("Estado Gasto Empleado :");
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setToolTipText("Estado Gasto Empleado");
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado= new JComboBoxMe();
		jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesGastoEmpleado.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdMesGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdMesGastoEmpleado.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesGastoEmpleado,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesGastoEmpleado = new JLabelMe();
		jLabelid_mesFK_IdMesGastoEmpleado.setText("Mes :");
		jLabelid_mesFK_IdMesGastoEmpleado.setToolTipText("Mes");
		jLabelid_mesFK_IdMesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesGastoEmpleado= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisGastoEmpleado.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisGastoEmpleado= new JButtonMe();
		this.jButtonFK_IdPaisGastoEmpleado.setText("Buscar");
		this.jButtonFK_IdPaisGastoEmpleado.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisGastoEmpleado,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisGastoEmpleado = new JLabelMe();
		jLabelid_paisFK_IdPaisGastoEmpleado.setText("Pais :");
		jLabelid_paisFK_IdPaisGastoEmpleado.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisGastoEmpleado= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGastoEmpleado=new JTabbedPane();


		this.jTabbedPaneBusquedasGastoEmpleado.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGastoEmpleado.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGastoEmpleado.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGastoEmpleado = new GastoEmpleadoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Gasto Empleado DATOS");
			this.jInternalFrameDetalleFormGastoEmpleado = new GastoEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.gastoempleadoSessionBean.getConGuardarRelaciones(),this.gastoempleadoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGastoEmpleado = null;//new GastoEmpleadoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGastoEmpleado= new GridBagLayout();
		
		
		this.jTableDatosGastoEmpleado = new JTableMe();      
		
		String sToolTipGastoEmpleado="";
		sToolTipGastoEmpleado=GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGastoEmpleado+="(Nomina.GastoEmpleado)";
		}
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGastoEmpleado+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGastoEmpleado.setToolTipText(sToolTipGastoEmpleado);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGastoEmpleado);
		this.jTableDatosGastoEmpleado.setAutoCreateRowSorter(true);
		this.jTableDatosGastoEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGastoEmpleado.setRowSelectionAllowed(true);
		this.jTableDatosGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGastoEmpleado,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGastoEmpleado = new JButtonMe();
		this.jButtonDuplicarGastoEmpleado = new JButtonMe();
		this.jButtonCopiarGastoEmpleado = new JButtonMe();
		this.jButtonVerFormGastoEmpleado = new JButtonMe();
		this.jButtonNuevoRelacionesGastoEmpleado = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGastoEmpleado = new JButtonMe();
		this.jButtonCerrarGastoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosGastoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosGeneralGastoEmpleado = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Gasto Empleado";
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesGastoEmpleado.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGastoEmpleado=new ReporteDinamicoJInternalFrame(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGastoEmpleado();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGastoEmpleado=new ImportacionJInternalFrame(GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGastoEmpleado();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGastoEmpleado = new JButtonMe();
		
		this.jButtonAbrirOrderByGastoEmpleado.setText("Orden");
		this.jButtonAbrirOrderByGastoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoEmpleado,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoEmpleado,false,this);
			
			//this.cargarOrderByGastoEmpleado(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGastoEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoEmpleado,true,this);
			
			//this.cargarOrderByGastoEmpleado(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGastoEmpleado.setMinimumSize(new Dimension(400,50));//2330
		this.jTableDatosGastoEmpleado.setMaximumSize(new Dimension(400,50));//2330
		this.jTableDatosGastoEmpleado.setPreferredSize(new Dimension(400,50));//2330
		
		this.jScrollPanelDatosGastoEmpleado.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoEmpleado.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGastoEmpleado.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGastoEmpleado.setText("Nuevo");
		this.jButtonDuplicarGastoEmpleado.setText("Duplicar");
		this.jButtonCopiarGastoEmpleado.setText("Copiar");
		this.jButtonVerFormGastoEmpleado.setText("Ver");
		this.jButtonNuevoRelacionesGastoEmpleado.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGastoEmpleado.setText("Guardar");
		this.jButtonCerrarGastoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGastoEmpleado,"nuevo_button","Nuevo",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGastoEmpleado,"duplicar_button","Duplicar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGastoEmpleado,"copiar_button","Copiar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGastoEmpleado,"ver_form","Ver",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGastoEmpleado,"nuevorelaciones_button","Nuevo Rel",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGastoEmpleado,"guardarcambiostabla_button","Guardar",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGastoEmpleado,"cerrar_button","Salir",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGastoEmpleado.setToolTipText("Nuevo"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGastoEmpleado.setToolTipText("Duplicar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGastoEmpleado.setToolTipText("Copiar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGastoEmpleado.setToolTipText("Ver"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGastoEmpleado.setToolTipText("Nuevo Rel"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGastoEmpleado.setToolTipText("Guardar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGastoEmpleado.setToolTipText("Salir"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGastoEmpleado";
		inputMap = this.jButtonNuevoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGastoEmpleado"));
		
		//DUPLICAR
		sMapKey = "DuplicarGastoEmpleado";
		inputMap = this.jButtonDuplicarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGastoEmpleado"));
		
		//COPIAR
		sMapKey = "CopiarGastoEmpleado";
		inputMap = this.jButtonCopiarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGastoEmpleado"));
		
		//VEr FORM
		sMapKey = "VerFormGastoEmpleado";
		inputMap = this.jButtonVerFormGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGastoEmpleado"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGastoEmpleado";
		inputMap = this.jButtonNuevoRelacionesGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGastoEmpleado"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGastoEmpleado";
		inputMap = this.jButtonModificarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGastoEmpleado"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGastoEmpleado";
		inputMap = this.jButtonCerrarGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGastoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGastoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGastoEmpleado"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGastoEmpleado.setName("jPanelParametrosReportesGastoEmpleado"); 
		
		this.jPanelParametrosReportesAccionesGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGastoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGastoEmpleado.setName("jPanelParametrosReportesAccionesGastoEmpleado"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGastoEmpleado = new JButtonMe();
		this.jButtonRecargarInformacionGastoEmpleado.setText("Recargar");
		this.jButtonRecargarInformacionGastoEmpleado.setToolTipText("Recargar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGastoEmpleado,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGastoEmpleado = new JButtonMe();
		this.jButtonProcesarInformacionGastoEmpleado.setText("Procesar");
		this.jButtonProcesarInformacionGastoEmpleado.setToolTipText("Procesar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGastoEmpleado.setVisible(false);
			
		this.jButtonProcesarInformacionGastoEmpleado.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoEmpleado.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGastoEmpleado.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGastoEmpleado.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposReportesGastoEmpleado.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGastoEmpleado.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGastoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGastoEmpleado.setText("Paginacion");
		this.jComboBoxTiposPaginacionGastoEmpleado.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGastoEmpleado.setText("Accion");
		this.jComboBoxTiposRelacionesGastoEmpleado.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGastoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesGastoEmpleado.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGastoEmpleado.setText("Accion");
		this.jComboBoxTiposSeleccionarGastoEmpleado.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGastoEmpleado=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGastoEmpleado.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoEmpleado.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGastoEmpleado.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGastoEmpleado = new JLabelMe();
		
		this.jLabelAccionesGastoEmpleado.setText("Acciones");		
		this.jLabelAccionesGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGastoEmpleado.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGastoEmpleado.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGastoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGastoEmpleado.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGastoEmpleado.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGastoEmpleado = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGastoEmpleado.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGastoEmpleado.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGastoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoReporteGastoEmpleado.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGastoEmpleado = new JButtonMe();
		//this.jButtonAnterioresGastoEmpleado.setText("<<");
        this.jButtonAnterioresGastoEmpleado.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGastoEmpleado,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGastoEmpleado = new JButtonMe();
		//this.jButtonSiguientesGastoEmpleado.setText(">>");
        this.jButtonSiguientesGastoEmpleado.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGastoEmpleado,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGastoEmpleado = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGastoEmpleado.setText("Nue");
        this.jButtonNuevoGuardarCambiosGastoEmpleado.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGastoEmpleado,"nuevoguardarcambios_button","Nue",this.gastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGastoEmpleado";
		inputMap = this.jButtonNuevoGuardarCambiosGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGastoEmpleado"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGastoEmpleado";
		inputMap = this.jButtonRecargarInformacionGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGastoEmpleado"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGastoEmpleado";
		inputMap = this.jButtonSiguientesGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGastoEmpleado"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGastoEmpleado";
		inputMap = this.jButtonAnterioresGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGastoEmpleado"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGastoEmpleado();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGastoEmpleado.setMinimumSize(new Dimension(this.getWidth(),GastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoEmpleado.setMaximumSize(new Dimension(this.getWidth(),GastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGastoEmpleado.setPreferredSize(new Dimension(this.getWidth(),GastoEmpleadoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GastoEmpleadoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGastoEmpleado = new GridBagLayout();

			this.jPanelPaginacionGastoEmpleado.setLayout(gridaBagLayoutPaginacionGastoEmpleado);						
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 0;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonAnterioresGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					
						
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoEmpleado.gridy = 0;
			
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonNuevoGuardarCambiosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
						
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGastoEmpleado.gridy = 0;
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonSiguientesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 1;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonNuevoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
						
			
			
			if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGastoEmpleado.gridy = 1;
				this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGastoEmpleado.add(this.jButtonGuardarCambiosTablaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			}
			
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 1;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonDuplicarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 1;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonCopiarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 1;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonVerFormGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 1;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGastoEmpleado.add(this.jButtonCerrarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		
		this.jButtonRecargarInformacionGastoEmpleado.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoEmpleado.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGastoEmpleado.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGastoEmpleado.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoEmpleado.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGastoEmpleado.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGastoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGastoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGastoEmpleado.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoEmpleado.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGastoEmpleado.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGastoEmpleado.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoEmpleado.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGastoEmpleado.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGastoEmpleado.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoEmpleado.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGastoEmpleado.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGastoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGastoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGastoEmpleado.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoEmpleado.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGastoEmpleado.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGastoEmpleado = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GastoEmpleado = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GastoEmpleado = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGastoEmpleado.setLayout(gridaBagParametrosReportesGastoEmpleado);
			this.jPanelParametrosReportesAccionesGastoEmpleado.setLayout(gridaBagParametrosReportesAccionesGastoEmpleado);
			
			
			this.jPanelParametrosAuxiliar1GastoEmpleado.setLayout(gridaBagParametrosAuxiliar1GastoEmpleado);
			this.jPanelParametrosAuxiliar2GastoEmpleado.setLayout(gridaBagParametrosAuxiliar2GastoEmpleado);
			this.jPanelParametrosAuxiliar3GastoEmpleado.setLayout(gridaBagParametrosAuxiliar3GastoEmpleado);
			this.jPanelParametrosAuxiliar4GastoEmpleado.setLayout(gridaBagParametrosAuxiliar4GastoEmpleado);
			//this.jPanelParametrosAuxiliar5GastoEmpleado.setLayout(gridaBagParametrosAuxiliar2GastoEmpleado);			
			
			
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoEmpleado.add(this.jButtonRecargarInformacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoEmpleado.add(this.jComboBoxTiposPaginacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoEmpleado.add(this.jCheckBoxConAltoMaximoTablaGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GastoEmpleado.add(this.jComboBoxTiposArchivosReportesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoEmpleado.add(this.jPanelParametrosAuxiliar1GastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GastoEmpleado.add(this.jComboBoxTiposReportesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);																		
			
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4GastoEmpleado.add(this.jComboBoxTiposGraficosReportesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoEmpleado.add(this.jPanelParametrosAuxiliar4GastoEmpleado, this.gridBagConstraintsGastoEmpleado);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoEmpleado.add(this.jComboBoxTiposReportesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoEmpleado.add(this.jCheckBoxGenerarReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoEmpleado.add(this.jPanelParametrosAuxiliar2GastoEmpleado, this.gridBagConstraintsGastoEmpleado);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoEmpleado.add(this.jLabelAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGastoEmpleado.add(this.jButtonAbrirOrderByGastoEmpleado, this.gridBagConstraintsGastoEmpleado);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoEmpleado.add(this.jComboBoxTiposSeleccionarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			
			
			/*
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoEmpleado.add(this.jCheckBoxSeleccionarTodosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGastoEmpleado.add(this.jCheckBoxConGraficoReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoEmpleado.add(this.jCheckBoxSeleccionarTodosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);															
				
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoEmpleado.add(this.jCheckBoxSeleccionadosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);															
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGastoEmpleado.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GastoEmpleado.add(this.jCheckBoxConGraficoReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGastoEmpleado.add(this.jPanelParametrosAuxiliar3GastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoEmpleado.add(this.jComboBoxTiposAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
	
				
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGastoEmpleado.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGastoEmpleado.add(this.jTextFieldValorCampoGeneralGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGastoEmpleado = new GridBagLayout();

			this.jScrollPanelDatosGastoEmpleado.setLayout(gridaBagLayoutDatosGastoEmpleado);
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = 0;
			this.gridBagConstraintsGastoEmpleado.gridx = 0;
			
			this.jScrollPanelDatosGastoEmpleado.add(this.jTableDatosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGastoEmpleado.setViewportView(this.jTableDatosGastoEmpleado);
		this.jTableDatosGastoEmpleado.setFillsViewportHeight(true);
		this.jTableDatosGastoEmpleado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesGastoEmpleado.setLayout(gridaBagLayoutAccionesGastoEmpleado);
		
		
		/*	
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = 0;
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
			
		this.jPanelAccionesGastoEmpleado.add(this.jButtonNuevoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdAnioGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioGastoEmpleado.setLayout(gridaBagLayoutFK_IdAnioGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdAnioGastoEmpleado.add(jLabelid_anioFK_IdAnioGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdAnioGastoEmpleado.add(jComboBoxid_anioFK_IdAnioGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdAnioGastoEmpleado.add(jButtonFK_IdAnioGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("1.-Por Anio ", jPanelFK_IdAnioGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCiudadGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdCiudadGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCiudadGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCiudadGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCiudadGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCiudadGastoEmpleado.setLayout(gridaBagLayoutFK_IdCiudadGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdCiudadGastoEmpleado.add(jLabelid_ciudadFK_IdCiudadGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdCiudadGastoEmpleado.add(jComboBoxid_ciudadFK_IdCiudadGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdCiudadGastoEmpleado.add(jButtonFK_IdCiudadGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("2.-Por Ciudad ", jPanelFK_IdCiudadGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoGastoEmpleado.setLayout(gridaBagLayoutFK_IdEmpleadoGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdEmpleadoGastoEmpleado.add(jLabelid_empleadoFK_IdEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdEmpleadoGastoEmpleado.add(jComboBoxid_empleadoFK_IdEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdEmpleadoGastoEmpleado.add(jButtonFK_IdEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado.setLayout(gridaBagLayoutFK_IdEstadoGastoEmpleadoGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado.add(jLabelid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado.add(jComboBoxid_estado_gasto_empleadoFK_IdEstadoGastoEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado.add(jButtonFK_IdEstadoGastoEmpleadoGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("4.-Por Estado Gasto Empleado ", jPanelFK_IdEstadoGastoEmpleadoGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdMesGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdMesGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesGastoEmpleado.setLayout(gridaBagLayoutFK_IdMesGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdMesGastoEmpleado.add(jLabelid_mesFK_IdMesGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdMesGastoEmpleado.add(jComboBoxid_mesFK_IdMesGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdMesGastoEmpleado.add(jButtonFK_IdMesGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("5.-Por Mes ", jPanelFK_IdMesGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPaisGastoEmpleado= new GridBagLayout();
		gridaBagLayoutFK_IdPaisGastoEmpleado.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisGastoEmpleado.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisGastoEmpleado.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisGastoEmpleado.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisGastoEmpleado.setLayout(gridaBagLayoutFK_IdPaisGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 0;
		jPanelFK_IdPaisGastoEmpleado.add(jLabelid_paisFK_IdPaisGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 0;
		gridBagConstraintsGastoEmpleado.gridx = 1;
		jPanelFK_IdPaisGastoEmpleado.add(jComboBoxid_paisFK_IdPaisGastoEmpleado, gridBagConstraintsGastoEmpleado);

		gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGastoEmpleado.gridy = 1;
		gridBagConstraintsGastoEmpleado.gridx =1;
		jPanelFK_IdPaisGastoEmpleado.add(jButtonFK_IdPaisGastoEmpleado, gridBagConstraintsGastoEmpleado);

		jTabbedPaneBusquedasGastoEmpleado.addTab("6.-Por Pais ", jPanelFK_IdPaisGastoEmpleado);
		jTabbedPaneBusquedasGastoEmpleado.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGastoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGastoEmpleado);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoEmpleado.gridx = 0;		
			//this.gridBagConstraintsGastoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGastoEmpleado.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGastoEmpleado, this.gridBagConstraintsGastoEmpleado);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGastoEmpleado.gridx = 0;		
		//this.gridBagConstraintsGastoEmpleado.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGastoEmpleado.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGastoEmpleado);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGastoEmpleado.gridx = 0;		
			this.gridBagConstraintsGastoEmpleado.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGastoEmpleado.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGastoEmpleado, this.gridBagConstraintsGastoEmpleado);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);								
		
		
		/*
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		*/		
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGastoEmpleado.gridx =0;
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGastoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
				
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGastoEmpleado= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGastoEmpleado = new GridBagLayout();
			this.jPanelBusquedasParametrosGastoEmpleado.setLayout(gridaBagLayoutBusquedasParametrosGastoEmpleado);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGastoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
			
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGastoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGastoEmpleado;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGastoEmpleado() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGastoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGastoEmpleado.setName("jPanelReporteDinamicoGastoEmpleado"); 
		
		this.jPanelReporteDinamicoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGastoEmpleado.setLayout(gridaBagLayoutReporteDinamicoGastoEmpleado);
		
		
		this.jInternalFrameReporteDinamicoGastoEmpleado= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGastoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGastoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGastoEmpleado.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGastoEmpleado.setResizable(true);
	    this.jInternalFrameReporteDinamicoGastoEmpleado.setClosable(true);
	    this.jInternalFrameReporteDinamicoGastoEmpleado.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGastoEmpleado = new JLabelMe();

		this.jLabelColumnasSelectReporteGastoEmpleado.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelColumnasSelectReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGastoEmpleado = new JList<Reporte>();
		this.jListColumnasSelectReporteGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGastoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGastoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGastoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGastoEmpleado=new JScrollPane(this.jListColumnasSelectReporteGastoEmpleado);
			
			this.jScrollColumnasSelectReporteGastoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGastoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGastoEmpleado.add(this.jListColumnasSelectReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jScrollColumnasSelectReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGastoEmpleado = new JLabelMe();

		this.jLabelRelacionesSelectReporteGastoEmpleado.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGastoEmpleado = new JList<Reporte>();
		this.jListRelacionesSelectReporteGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGastoEmpleado.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGastoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGastoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGastoEmpleado=new JScrollPane(this.jListRelacionesSelectReporteGastoEmpleado);
			
			this.jScrollRelacionesSelectReporteGastoEmpleado.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoEmpleado.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGastoEmpleado.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGastoEmpleado = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGastoEmpleado = new JComboBoxMe();
		this.jListColumnasValoresGraficoGastoEmpleado = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGastoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGastoEmpleado.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoGastoEmpleado = new JLabelMe();

		this.jLabelConGraficoDinamicoGastoEmpleado.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelConGraficoDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoGastoEmpleado.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoGastoEmpleado.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoGastoEmpleado.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoEmpleado.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoGastoEmpleado.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jCheckBoxConGraficoDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoGastoEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoGastoEmpleado.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelColumnaCategoriaGraficoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jComboBoxColumnaCategoriaGraficoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorGastoEmpleado = new JLabelMe();

		this.jLabelColumnaCategoriaValorGastoEmpleado.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelColumnaCategoriaValorGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorGastoEmpleado.setText("Accion");
        this.jComboBoxColumnaCategoriaValorGastoEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorGastoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorGastoEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jComboBoxColumnaCategoriaValorGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoGastoEmpleado = new JLabelMe();

		this.jLabelColumnasValoresGraficoGastoEmpleado.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelColumnasValoresGraficoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoGastoEmpleado = new JList<Reporte>();
		this.jListColumnasValoresGraficoGastoEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoGastoEmpleado.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoGastoEmpleado.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoEmpleado.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoGastoEmpleado.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoGastoEmpleado=new JScrollPane(this.jListColumnasValoresGraficoGastoEmpleado);
			
			this.jScrollColumnasValoresGraficoGastoEmpleado.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoEmpleado.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoGastoEmpleado.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoGastoEmpleado.add(this.jListColumnasSelectReporteGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jScrollColumnasValoresGraficoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoGastoEmpleado = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoGastoEmpleado.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelTiposGraficosReportesDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoGastoEmpleado.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jComboBoxTiposGraficosReportesDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGastoEmpleado = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGastoEmpleado.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelGenerarExcelReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGastoEmpleado = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGastoEmpleado.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGastoEmpleado,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGastoEmpleado.setToolTipText("Generar EXCEL"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGastoEmpleado.add(this.jButtonGenerarExcelReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jComboBoxTiposReportesDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGastoEmpleado = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGastoEmpleado.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jLabelTiposArchivoReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jComboBoxTiposArchivosReportesDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGastoEmpleado = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGastoEmpleado.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGastoEmpleado,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGastoEmpleado.setToolTipText("Generar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jButtonGenerarReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGastoEmpleado = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGastoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGastoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGastoEmpleado.setToolTipText("Cancelar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGastoEmpleado.add(this.jButtonCerrarReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGastoEmpleado = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGastoEmpleado= new JScrollPane(jPanelReporteDinamicoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGastoEmpleado.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoEmpleado.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGastoEmpleado.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGastoEmpleado.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGastoEmpleado);
		this.jInternalFrameReporteDinamicoGastoEmpleado.getContentPane().add(this.jScrollPanelReporteDinamicoGastoEmpleado, this.gridBagConstraintsGastoEmpleado);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGastoEmpleado() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGastoEmpleado = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGastoEmpleado.setName("jPanelImportacionGastoEmpleado"); 
		
		this.jPanelImportacionGastoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGastoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGastoEmpleado.setLayout(gridaBagLayoutImportacionGastoEmpleado);
		
		
		this.jInternalFrameImportacionGastoEmpleado= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGastoEmpleado= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGastoEmpleado = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGastoEmpleado= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoEmpleado.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGastoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionGastoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionGastoEmpleado.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGastoEmpleado.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGastoEmpleado.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGastoEmpleado.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGastoEmpleado.setResizable(true);
	    this.jInternalFrameImportacionGastoEmpleado.setClosable(true);
	    this.jInternalFrameImportacionGastoEmpleado.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGastoEmpleado.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoEmpleado.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGastoEmpleado.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGastoEmpleado = new JLabelMe();

		this.jLabelArchivoImportacionGastoEmpleado.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoEmpleado.add(this.jLabelArchivoImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGastoEmpleado = new JFileChooser();		
		this.jFileChooserImportacionGastoEmpleado.setToolTipText("ESCOGER ARCHIVO"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGastoEmpleado = new JButtonMe();
		this.jButtonAbrirImportacionGastoEmpleado.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGastoEmpleado,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGastoEmpleado.setToolTipText("Generar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoEmpleado.add(this.jButtonAbrirImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGastoEmpleado = new JLabelMe();

		this.jLabelPathArchivoImportacionGastoEmpleado.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;		
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGastoEmpleado.add(this.jLabelPathArchivoImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGastoEmpleado=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGastoEmpleado.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoEmpleado.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGastoEmpleado.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoEmpleado.add(this.jTextFieldPathArchivoImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGastoEmpleado = new JButtonMe();
		this.jButtonGenerarImportacionGastoEmpleado.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGastoEmpleado,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGastoEmpleado.setToolTipText("Generar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoEmpleado.add(this.jButtonGenerarImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGastoEmpleado = new JButtonMe();
		this.jButtonCerrarImportacionGastoEmpleado.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGastoEmpleado,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGastoEmpleado.setToolTipText("Cancelar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGastoEmpleado.gridy = iPosYImportacion;
		this.gridBagConstraintsGastoEmpleado.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGastoEmpleado.add(this.jButtonCerrarImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGastoEmpleado = new GridBagLayout();
		
		this.jScrollPanelImportacionGastoEmpleado= new JScrollPane(jPanelImportacionGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsGastoEmpleado.gridy =iPosYImportacion;
		this.gridBagConstraintsGastoEmpleado.gridx =iPosXImportacion;
		this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGastoEmpleado.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGastoEmpleado);
		this.jInternalFrameImportacionGastoEmpleado.getContentPane().add(this.jScrollPanelImportacionGastoEmpleado, this.gridBagConstraintsGastoEmpleado);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGastoEmpleado(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGastoEmpleado = new JButtonMe();
			this.jButtonAbrirOrderByGastoEmpleado.setText("Orden");
			this.jButtonAbrirOrderByGastoEmpleado.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGastoEmpleado,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGastoEmpleado";
			inputMap = this.jButtonAbrirOrderByGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGastoEmpleado"));
		
		
			GridBagLayout gridaBagLayoutOrderByGastoEmpleado = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGastoEmpleado.setName("jPanelOrderByGastoEmpleado"); 
			
			this.jPanelOrderByGastoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGastoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGastoEmpleado.setLayout(gridaBagLayoutOrderByGastoEmpleado);
			
			
			this.jTableDatosGastoEmpleadoOrderBy = new JTableMe();        
			this.jTableDatosGastoEmpleadoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGastoEmpleadoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGastoEmpleadoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGastoEmpleadoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGastoEmpleadoOrderBy.setViewportView(this.jTableDatosGastoEmpleadoOrderBy);
			this.jTableDatosGastoEmpleadoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGastoEmpleadoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGastoEmpleado= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGastoEmpleado= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGastoEmpleado = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGastoEmpleado= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGastoEmpleado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGastoEmpleado.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGastoEmpleado.setTitle("Orden");
			this.jInternalFrameOrderByGastoEmpleado.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGastoEmpleado.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGastoEmpleado.setResizable(true);
			this.jInternalFrameOrderByGastoEmpleado.setClosable(true);
			this.jInternalFrameOrderByGastoEmpleado.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGastoEmpleado.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoEmpleado.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGastoEmpleado.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Gasto Empleados"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGastoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGastoEmpleado.ipady =150;
				
			this.jPanelOrderByGastoEmpleado.add(jScrollPanelDatosGastoEmpleadoOrderBy, this.gridBagConstraintsGastoEmpleado);//this.jTableDatosGastoEmpleadoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGastoEmpleado = new JButtonMe();
			this.jButtonCerrarOrderByGastoEmpleado.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGastoEmpleado,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGastoEmpleado.setToolTipText("Cancelar"+" "+GastoEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGastoEmpleado.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGastoEmpleado.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGastoEmpleado.add(this.jButtonCerrarOrderByGastoEmpleado, this.gridBagConstraintsGastoEmpleado);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGastoEmpleado = new GridBagLayout();
			
			this.jScrollPanelOrderByGastoEmpleado= new JScrollPane(jPanelOrderByGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsGastoEmpleado.gridy =iPosYOrderBy;
			this.gridBagConstraintsGastoEmpleado.gridx =iPosXOrderBy;
			this.gridBagConstraintsGastoEmpleado.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGastoEmpleado.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGastoEmpleado.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGastoEmpleado);
			
			this.jInternalFrameOrderByGastoEmpleado.getContentPane().add(this.jScrollPanelOrderByGastoEmpleado, this.gridBagConstraintsGastoEmpleado);			
		
		} else {
			this.jButtonAbrirOrderByGastoEmpleado = new JButtonMe();
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
		int iWidthTableCalculado=0;//4930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.gastoempleadoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGastoEmpleado.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGastoEmpleado.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGastoEmpleado.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGastoEmpleado.getRowHeight();//GastoEmpleadoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoEmpleado.isSelected()) {
					iHeightTable=GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGastoEmpleado.isSelected()) {
					iHeightTable=GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GastoEmpleadoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGastoEmpleado.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoEmpleado.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGastoEmpleado.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGastoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGastoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGastoEmpleado!=null && this.jInternalFrameOrderByGastoEmpleado.getjTableDatosOrderBy()!=null) {
			//if(!this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGastoEmpleado.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGastoEmpleado.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGastoEmpleado.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGastoEmpleado.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGastoEmpleado.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGastoEmpleado.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGastoEmpleado.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGastoEmpleado.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoEmpleado.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGastoEmpleado.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=gastoempleadoLogic.getGastoEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastoempleados.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GastoEmpleado> TraerGastoEmpleadoBeans(List<GastoEmpleado> gastoempleados,ArrayList<Classe> classes)throws Exception {
		try {
			for(GastoEmpleado gastoempleado:gastoempleados) {
					
				if(!(GastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GastoEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					gastoempleado.setsDetalleGeneralEntityReporte(GastoEmpleadoConstantesFunciones.getGastoEmpleadoDescripcion(gastoempleado));
										
						
					
						
					
				} else  {
							
					//gastoempleado.setsDetalleGeneralEntityReporte(gastoempleado.getsDetalleGeneralEntityReporte());
										
				}
				
				//gastoempleadobeans.add(gastoempleadobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return gastoempleados;
    }
	//PARA REPORTES FIN
}
