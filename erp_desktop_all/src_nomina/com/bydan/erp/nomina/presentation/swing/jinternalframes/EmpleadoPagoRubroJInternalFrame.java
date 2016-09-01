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
import com.bydan.erp.nomina.util.EmpleadoPagoRubroConstantesFunciones;

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
public class EmpleadoPagoRubroJInternalFrame extends EmpleadoPagoRubroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpleadoPagoRubro;
	
	protected JMenuBar jmenuBarEmpleadoPagoRubro;
	
	protected JMenu jmenuEmpleadoPagoRubro;
	protected JMenu jmenuDatosEmpleadoPagoRubro;
	protected JMenu jmenuArchivoEmpleadoPagoRubro;
	protected JMenu jmenuAccionesEmpleadoPagoRubro;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoPagoRubro;	
	protected GridBagConstraints gridBagConstraintsEmpleadoPagoRubro;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpleadoPagoRubroDetalleFormJInternalFrame jInternalFrameDetalleFormEmpleadoPagoRubro;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpleadoPagoRubro;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpleadoPagoRubro;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EmpleadoPagoRubro> empleadopagorubros;		
	public List<EmpleadoPagoRubro> empleadopagorubrosEliminados;	
	public List<EmpleadoPagoRubro> empleadopagorubrosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpleadoPagoRubro;		
	protected JButton jButtonAbrirOrderByEmpleadoPagoRubro;
	
	
	//protected JPanel jPanelOrderByEmpleadoPagoRubro;
	//public JScrollPane jScrollPanelOrderByEmpleadoPagoRubro;	
	//protected JButton jButtonCerrarOrderByEmpleadoPagoRubro;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpleadoPagoRubroLogic empleadopagorubroLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpleadoPagoRubro;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoPagoRubro;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoPagoRubro;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpleadoPagoRubroOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpleadoPagoRubro;
	//public JScrollPane jScrollPanelImportacionEmpleadoPagoRubro;
	
	
	
	protected JPanel jPanelAccionesEmpleadoPagoRubro;
	
    protected JPanel jPanelPaginacionEmpleadoPagoRubro;
    protected JPanel jPanelParametrosReportesEmpleadoPagoRubro;
	protected JPanel jPanelParametrosReportesAccionesEmpleadoPagoRubro;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EmpleadoPagoRubro;
	protected JPanel jPanelParametrosAuxiliar2EmpleadoPagoRubro;
	protected JPanel jPanelParametrosAuxiliar3EmpleadoPagoRubro;
	protected JPanel jPanelParametrosAuxiliar4EmpleadoPagoRubro;
	//protected JPanel jPanelParametrosAuxiliar5EmpleadoPagoRubro;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpleadoPagoRubro;
	//protected JPanel jPanelImportacionEmpleadoPagoRubro;
	
	
	public JTable jTableDatosEmpleadoPagoRubro;
	
	
	
	//public JTable jTableDatosEmpleadoPagoRubroOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpleadoPagoRubro;
	protected JButton jButtonDuplicarEmpleadoPagoRubro;
	protected JButton jButtonCopiarEmpleadoPagoRubro;
	protected JButton jButtonVerFormEmpleadoPagoRubro;
	protected JButton jButtonNuevoRelacionesEmpleadoPagoRubro;
	protected JButton jButtonModificarEmpleadoPagoRubro;
	
    protected JButton jButtonGuardarCambiosTablaEmpleadoPagoRubro;
	protected JButton jButtonCerrarEmpleadoPagoRubro;
	
	
	protected JButton jButtonRecargarInformacionEmpleadoPagoRubro;
	protected JButton jButtonProcesarInformacionEmpleadoPagoRubro;
	
	
	protected JButton jButtonAnterioresEmpleadoPagoRubro;
	protected JButton jButtonSiguientesEmpleadoPagoRubro;
	protected JButton jButtonNuevoGuardarCambiosEmpleadoPagoRubro;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpleadoPagoRubro;
	//protected JButton jButtonCerrarReporteDinamicoEmpleadoPagoRubro;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpleadoPagoRubro;
	//protected JButton jButtonGenerarImportacionEmpleadoPagoRubro;
	//protected JButton jButtonCerrarImportacionEmpleadoPagoRubro;
	//protected JFileChooser jFileChooserImportacionEmpleadoPagoRubro;
	//protected File fileImportacionEmpleadoPagoRubro;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoPagoRubro;
	protected JButton jButtonDuplicarToolBarEmpleadoPagoRubro;
	protected JButton jButtonNuevoRelacionesToolBarEmpleadoPagoRubro;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpleadoPagoRubro;
	protected JButton jButtonCopiarToolBarEmpleadoPagoRubro;
	protected JButton jButtonVerFormToolBarEmpleadoPagoRubro;
	public JButton jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoPagoRubro;
	protected JButton jButtonCerrarToolBarEmpleadoPagoRubro;
	
	protected JButton jButtonRecargarInformacionToolBarEmpleadoPagoRubro;
	protected JButton jButtonProcesarInformacionToolBarEmpleadoPagoRubro;
	protected JButton jButtonAnterioresToolBarEmpleadoPagoRubro;
	protected JButton jButtonSiguientesToolBarEmpleadoPagoRubro;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro;
	protected JButton jButtonAbrirOrderByToolBarEmpleadoPagoRubro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDuplicarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemNuevoRelacionesEmpleadoPagoRubro;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpleadoPagoRubro;
	protected JMenuItem jMenuItemCopiarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemVerFormEmpleadoPagoRubro;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoPagoRubro;
	protected JMenuItem jMenuItemCerrarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoPagoRubro;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpleadoPagoRubro;
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoPagoRubro;
	protected JMenuItem jMenuItemAnterioresEmpleadoPagoRubro;
	protected JMenuItem jMenuItemSiguientesEmpleadoPagoRubro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro;
	protected JMenuItem jMenuItemAbrirOrderByEmpleadoPagoRubro;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoPagoRubro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoPagoRubro;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpleadoPagoRubro;
	protected JCheckBox jCheckBoxSeleccionadosEmpleadoPagoRubro;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro;
	protected JCheckBox jCheckBoxConGraficoReporteEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpleadoPagoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpleadoPagoRubro;
	protected JTextField jTextFieldValorCampoGeneralEmpleadoPagoRubro;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpleadoPagoRubro;
	//public JList<Reporte> jListColumnasSelectReporteEmpleadoPagoRubro;
	//public JScrollPane jScrollColumnasSelectReporteEmpleadoPagoRubro;
	
	//public JLabel jLabelRelacionesSelectReporteEmpleadoPagoRubro;
	//public JList<Reporte> jListRelacionesSelectReporteEmpleadoPagoRubro;
	//public JScrollPane jScrollRelacionesSelectReporteEmpleadoPagoRubro;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpleadoPagoRubro;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpleadoPagoRubro;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro;
	
		
	//public JLabel jLabelArchivoImportacionEmpleadoPagoRubro;	
	//public JLabel jLabelPathArchivoImportacionEmpleadoPagoRubro;
	//protected JTextField jTextFieldPathArchivoImportacionEmpleadoPagoRubro;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpleadoPagoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro;
	
	//public JLabel jLabelColumnaCategoriaValorEmpleadoPagoRubro;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpleadoPagoRubro;
	
	//public JLabel jLabelColumnasValoresGraficoEmpleadoPagoRubro;
	//public JList<Reporte> jListColumnasValoresGraficoEmpleadoPagoRubro;
	//public JScrollPane jScrollColumnasValoresGraficoEmpleadoPagoRubro;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpleadoPagoRubro;
	public JPanel jPanelFK_IdAnioEmpleadoPagoRubro;
	public JButton jButtonFK_IdAnioEmpleadoPagoRubro;
	public JPanel jPanelFK_IdEmpleadoEmpleadoPagoRubro;
	public JButton jButtonFK_IdEmpleadoEmpleadoPagoRubro;
	public JPanel jPanelFK_IdEstructuraEmpleadoPagoRubro;
	public JButton jButtonFK_IdEstructuraEmpleadoPagoRubro;
	public JPanel jPanelFK_IdMesEmpleadoPagoRubro;
	public JButton jButtonFK_IdMesEmpleadoPagoRubro;
	public JPanel jPanelFK_IdRubroEmpleaEmpleadoPagoRubro;
	public JButton jButtonFK_IdRubroEmpleaEmpleadoPagoRubro;
	
	public JPanel jPanelid_anioFK_IdAnioEmpleadoPagoRubro;
	public JLabel jLabelid_anioFK_IdAnioEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro;
	public JButton jButtonid_anioFK_IdAnioEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro;
	public JLabel jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro;
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraEmpleadoPagoRubro;
	public JLabel jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro;
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoPagoRubroBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraEmpleadoPagoRubroArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesEmpleadoPagoRubro;
	public JLabel jLabelid_mesFK_IdMesEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesEmpleadoPagoRubro;
	public JButton jButtonid_mesFK_IdMesEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubroUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubroBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpleadoPagoRubroJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoPagoRubroJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpleadoPagoRubro)	{
		this.jButtonRecargarInformacionEmpleadoPagoRubro = jButtonRecargarInformacionEmpleadoPagoRubro;
	}
	
	public JButton getjButtonProcesarInformacionEmpleadoPagoRubro() {
		return this.jButtonProcesarInformacionEmpleadoPagoRubro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoPagoRubro)	{
		this.jButtonProcesarInformacionEmpleadoPagoRubro = jButtonProcesarInformacionEmpleadoPagoRubro;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpleadoPagoRubro() {
		return this.jButtonRecargarInformacionEmpleadoPagoRubro;
	}
	
	
	public List<EmpleadoPagoRubro> getempleadopagorubros() {
		return this.empleadopagorubros;
	}

	public void setempleadopagorubros(List<EmpleadoPagoRubro> empleadopagorubros) {
		this.empleadopagorubros = empleadopagorubros;
	}
	
	public List<EmpleadoPagoRubro> getempleadopagorubrosAux() {
		return this.empleadopagorubrosAux;
	}

	public void setempleadopagorubrosAux(List<EmpleadoPagoRubro> empleadopagorubrosAux) {
		this.empleadopagorubrosAux = empleadopagorubrosAux;
	}
	
	public List<EmpleadoPagoRubro> getempleadopagorubrosEliminados() {
		return this.empleadopagorubrosEliminados;
	}

	public void setEmpleadoPagoRubrosEliminados(List<EmpleadoPagoRubro> empleadopagorubrosEliminados) {
		this.empleadopagorubrosEliminados = empleadopagorubrosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpleadoPagoRubro() {
		return jComboBoxTiposSeleccionarEmpleadoPagoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpleadoPagoRubro(
			JComboBox jComboBoxTiposSeleccionarEmpleadoPagoRubro) {
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro = jComboBoxTiposSeleccionarEmpleadoPagoRubro;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpleadoPagoRubro() {
		return jTextFieldValorCampoGeneralEmpleadoPagoRubro;
	}

	public void setjTextFieldValorCampoGeneralEmpleadoPagoRubro(
			JTextField jTextFieldValorCampoGeneralEmpleadoPagoRubro) {
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro = jTextFieldValorCampoGeneralEmpleadoPagoRubro;
	}

	public void setBorderResaltarValorCampoGeneralEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpleadoPagoRubro() {
		return this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro;
	}

	public void setjCheckBoxSeleccionarTodosEmpleadoPagoRubro(
			JCheckBox jCheckBoxSeleccionarTodosEmpleadoPagoRubro) {
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro = jCheckBoxSeleccionarTodosEmpleadoPagoRubro;
	}

	public void setBorderResaltarSeleccionarTodosEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpleadoPagoRubro() {
		return this.jCheckBoxSeleccionadosEmpleadoPagoRubro;
	}

	public void setjCheckBoxSeleccionadosEmpleadoPagoRubro(
			JCheckBox jCheckBoxSeleccionadosEmpleadoPagoRubro) {
		this.jCheckBoxSeleccionadosEmpleadoPagoRubro = jCheckBoxSeleccionadosEmpleadoPagoRubro;
	}
	
	public void setBorderResaltarSeleccionadosEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpleadoPagoRubro() {
		return this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposArchivosReportesEmpleadoPagoRubro) {
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro = jComboBoxTiposArchivosReportesEmpleadoPagoRubro;
	}

	public void setBorderResaltarTiposArchivosReportesEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpleadoPagoRubro() {
		return this.jComboBoxTiposReportesEmpleadoPagoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposReportesEmpleadoPagoRubro) {
		this.jComboBoxTiposReportesEmpleadoPagoRubro = jComboBoxTiposReportesEmpleadoPagoRubro;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpleadoPagoRubro() {
	//	return jComboBoxTiposReportesDinamicoEmpleadoPagoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpleadoPagoRubro(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpleadoPagoRubro) {
	//	this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro = jComboBoxTiposReportesDinamicoEmpleadoPagoRubro;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro = jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro;
	//}
	
	public void setBorderResaltarTiposReportesEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpleadoPagoRubro() {
		return this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposGraficosReportesEmpleadoPagoRubro) {
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro = jComboBoxTiposGraficosReportesEmpleadoPagoRubro;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpleadoPagoRubro() {
		return this.jComboBoxTiposPaginacionEmpleadoPagoRubro;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpleadoPagoRubro(
			JComboBox jComboBoxTiposPaginacionEmpleadoPagoRubro) {
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro = jComboBoxTiposPaginacionEmpleadoPagoRubro;
	}
	
	public void setBorderResaltarTiposPaginacionEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpleadoPagoRubro() {
		return this.jComboBoxTiposRelacionesEmpleadoPagoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoPagoRubro() {
		return this.jComboBoxTiposAccionesEmpleadoPagoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposRelacionesEmpleadoPagoRubro) {
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro = jComboBoxTiposRelacionesEmpleadoPagoRubro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoPagoRubro(
			JComboBox jComboBoxTiposAccionesEmpleadoPagoRubro) {
		this.jComboBoxTiposAccionesEmpleadoPagoRubro = jComboBoxTiposAccionesEmpleadoPagoRubro;
	}
	
	public void setBorderResaltarTiposRelacionesEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpleadoPagoRubro() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpleadoPagoRubro .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpleadoPagoRubro() {
	//	return jCheckBoxConGraficoDinamicoEmpleadoPagoRubro;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpleadoPagoRubro(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpleadoPagoRubro) {
	//	this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro = jCheckBoxConGraficoDinamicoEmpleadoPagoRubro;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpleadoPagoRubro() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpleadoPagoRubro.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro .setBorder(borderResaltar);		
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
		this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		
		this.empleadopagorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadopagorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadopagorubroSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoPagoRubroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Pago Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpleadoPagoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EmpleadoPagoRubro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpleadoPagoRubro= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"nuevo","nuevo","Nuevo"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"duplicar","duplicar","Duplicar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"copiar","copiar","Copiar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"ver_form","ver_form","Ver"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"recargar","recargar","Recargar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpleadoPagoRubro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,
							"cerrar","cerrar","Salir"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpleadoPagoRubro;
			
				this.jButtonProcesarInformacionToolBarEmpleadoPagoRubro=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpleadoPagoRubro;
				
		//protected JButton jButtonModificarToolBarEmpleadoPagoRubro;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpleadoPagoRubro=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpleadoPagoRubro=new JMenuMe("General");
		this.jmenuArchivoEmpleadoPagoRubro=new JMenuMe("Archivo");
		this.jmenuAccionesEmpleadoPagoRubro=new JMenuMe("Acciones");
		this.jmenuDatosEmpleadoPagoRubro=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoPagoRubro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoPagoRubro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoPagoRubro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpleadoPagoRubro= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpleadoPagoRubro.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpleadoPagoRubro,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpleadoPagoRubro= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpleadoPagoRubro.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpleadoPagoRubro,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoPagoRubro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpleadoPagoRubro= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpleadoPagoRubro.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpleadoPagoRubro,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpleadoPagoRubro= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpleadoPagoRubro.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpleadoPagoRubro,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoPagoRubro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoPagoRubro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoPagoRubro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpleadoPagoRubro= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpleadoPagoRubro.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpleadoPagoRubro,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpleadoPagoRubro= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpleadoPagoRubro.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpleadoPagoRubro,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpleadoPagoRubro= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpleadoPagoRubro.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpleadoPagoRubro,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpleadoPagoRubro= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpleadoPagoRubro.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpleadoPagoRubro,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpleadoPagoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpleadoPagoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpleadoPagoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoPagoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoPagoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoPagoRubro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpleadoPagoRubro.add(this.jMenuItemCerrarEmpleadoPagoRubro);
			
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemNuevoEmpleadoPagoRubro);
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro);
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemNuevoRelacionesEmpleadoPagoRubro);
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro);		
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemDuplicarEmpleadoPagoRubro);		
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemCopiarEmpleadoPagoRubro);		
			this.jmenuAccionesEmpleadoPagoRubro.add(this.jMenuItemVerFormEmpleadoPagoRubro);		
			
			this.jmenuDatosEmpleadoPagoRubro.add(this.jMenuItemRecargarInformacionEmpleadoPagoRubro);				
			this.jmenuDatosEmpleadoPagoRubro.add(this.jMenuItemAnterioresEmpleadoPagoRubro);				
			this.jmenuDatosEmpleadoPagoRubro.add(this.jMenuItemSiguientesEmpleadoPagoRubro);				
			this.jmenuDatosEmpleadoPagoRubro.add(this.jMenuItemAbrirOrderByEmpleadoPagoRubro);				
			this.jmenuDatosEmpleadoPagoRubro.add(this.jMenuItemMostrarOcultarEmpleadoPagoRubro);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpleadoPagoRubro.add(this.jMenuItemGuardarCambiosEmpleadoPagoRubro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpleadoPagoRubro.add(this.jmenuArchivoEmpleadoPagoRubro);		
			this.jmenuBarEmpleadoPagoRubro.add(this.jmenuAccionesEmpleadoPagoRubro);		
			this.jmenuBarEmpleadoPagoRubro.add(this.jmenuDatosEmpleadoPagoRubro);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpleadoPagoRubro);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpleadoPagoRubro() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioEmpleadoPagoRubro.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioEmpleadoPagoRubro= new JButtonMe();
		this.jButtonFK_IdAnioEmpleadoPagoRubro.setText("Buscar");
		this.jButtonFK_IdAnioEmpleadoPagoRubro.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioEmpleadoPagoRubro,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro = new JLabelMe();
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro.setText("Anio :");
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoEmpleadoPagoRubro.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoEmpleadoPagoRubro= new JButtonMe();
		this.jButtonFK_IdEmpleadoEmpleadoPagoRubro.setText("Buscar");
		this.jButtonFK_IdEmpleadoEmpleadoPagoRubro.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoEmpleadoPagoRubro,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraEmpleadoPagoRubro.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraEmpleadoPagoRubro= new JButtonMe();
		this.jButtonFK_IdEstructuraEmpleadoPagoRubro.setText("Buscar");
		this.jButtonFK_IdEstructuraEmpleadoPagoRubro.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraEmpleadoPagoRubro,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesEmpleadoPagoRubro.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesEmpleadoPagoRubro= new JButtonMe();
		this.jButtonFK_IdMesEmpleadoPagoRubro.setText("Buscar");
		this.jButtonFK_IdMesEmpleadoPagoRubro.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesEmpleadoPagoRubro,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesEmpleadoPagoRubro = new JLabelMe();
		jLabelid_mesFK_IdMesEmpleadoPagoRubro.setText("Mes :");
		jLabelid_mesFK_IdMesEmpleadoPagoRubro.setToolTipText("Mes");
		jLabelid_mesFK_IdMesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEmpleadoPagoRubro=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpleadoPagoRubro.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoPagoRubro.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpleadoPagoRubro.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpleadoPagoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpleadoPagoRubro = new EmpleadoPagoRubroDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empleado Pago Rubro DATOS");
			this.jInternalFrameDetalleFormEmpleadoPagoRubro = new EmpleadoPagoRubroDetalleFormJInternalFrame(jDesktopPane,this.empleadopagorubroSessionBean.getConGuardarRelaciones(),this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro = null;//new EmpleadoPagoRubroDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoPagoRubro= new GridBagLayout();
		
		
		this.jTableDatosEmpleadoPagoRubro = new JTableMe();      
		
		String sToolTipEmpleadoPagoRubro="";
		sToolTipEmpleadoPagoRubro=EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoPagoRubro+="(Nomina.EmpleadoPagoRubro)";
		}
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoPagoRubro+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpleadoPagoRubro.setToolTipText(sToolTipEmpleadoPagoRubro);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpleadoPagoRubro);
		this.jTableDatosEmpleadoPagoRubro.setAutoCreateRowSorter(true);
		this.jTableDatosEmpleadoPagoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpleadoPagoRubro.setRowSelectionAllowed(true);
		this.jTableDatosEmpleadoPagoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpleadoPagoRubro,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpleadoPagoRubro = new JButtonMe();
		this.jButtonDuplicarEmpleadoPagoRubro = new JButtonMe();
		this.jButtonCopiarEmpleadoPagoRubro = new JButtonMe();
		this.jButtonVerFormEmpleadoPagoRubro = new JButtonMe();
		this.jButtonNuevoRelacionesEmpleadoPagoRubro = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro = new JButtonMe();
		this.jButtonCerrarEmpleadoPagoRubro = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoPagoRubro = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpleadoPagoRubro = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Pago Rubro";
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoPagoRubro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoPagoRubro.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoPagoRubro.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpleadoPagoRubro=new ReporteDinamicoJInternalFrame(EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpleadoPagoRubro();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpleadoPagoRubro=new ImportacionJInternalFrame(EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpleadoPagoRubro();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpleadoPagoRubro = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpleadoPagoRubro.setText("Orden");
		this.jButtonAbrirOrderByEmpleadoPagoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoPagoRubro,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoPagoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoPagoRubro,false,this);
			
			//this.cargarOrderByEmpleadoPagoRubro(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpleadoPagoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoPagoRubro,true,this);
			
			//this.cargarOrderByEmpleadoPagoRubro(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpleadoPagoRubro.setMinimumSize(new Dimension(400,50));//1030
		this.jTableDatosEmpleadoPagoRubro.setMaximumSize(new Dimension(400,50));//1030
		this.jTableDatosEmpleadoPagoRubro.setPreferredSize(new Dimension(400,50));//1030
		
		this.jScrollPanelDatosEmpleadoPagoRubro.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoPagoRubro.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpleadoPagoRubro.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpleadoPagoRubro.setText("Nuevo");
		this.jButtonDuplicarEmpleadoPagoRubro.setText("Duplicar");
		this.jButtonCopiarEmpleadoPagoRubro.setText("Copiar");
		this.jButtonVerFormEmpleadoPagoRubro.setText("Ver");
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setText("Guardar");
		this.jButtonCerrarEmpleadoPagoRubro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoPagoRubro,"nuevo_button","Nuevo",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpleadoPagoRubro,"duplicar_button","Duplicar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpleadoPagoRubro,"copiar_button","Copiar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpleadoPagoRubro,"ver_form","Ver",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpleadoPagoRubro,"nuevorelaciones_button","Nuevo Rel",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoPagoRubro,"guardarcambiostabla_button","Guardar",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoPagoRubro,"cerrar_button","Salir",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpleadoPagoRubro.setToolTipText("Nuevo"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpleadoPagoRubro.setToolTipText("Duplicar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpleadoPagoRubro.setToolTipText("Copiar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpleadoPagoRubro.setToolTipText("Ver"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.setToolTipText("Nuevo Rel"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setToolTipText("Guardar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoPagoRubro.setToolTipText("Salir"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoPagoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoPagoRubro"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpleadoPagoRubro";
		inputMap = this.jButtonDuplicarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpleadoPagoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpleadoPagoRubro"));
		
		//COPIAR
		sMapKey = "CopiarEmpleadoPagoRubro";
		inputMap = this.jButtonCopiarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpleadoPagoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpleadoPagoRubro"));
		
		//VEr FORM
		sMapKey = "VerFormEmpleadoPagoRubro";
		inputMap = this.jButtonVerFormEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpleadoPagoRubro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpleadoPagoRubro"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoRelacionesEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpleadoPagoRubro"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpleadoPagoRubro";
		inputMap = this.jButtonModificarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpleadoPagoRubro"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoPagoRubro";
		inputMap = this.jButtonCerrarEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoPagoRubro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoPagoRubro";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoPagoRubro"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpleadoPagoRubro.setName("jPanelParametrosReportesEmpleadoPagoRubro"); 
		
		this.jPanelParametrosReportesAccionesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpleadoPagoRubro.setName("jPanelParametrosReportesAccionesEmpleadoPagoRubro"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpleadoPagoRubro = new JButtonMe();
		this.jButtonRecargarInformacionEmpleadoPagoRubro.setText("Recargar");
		this.jButtonRecargarInformacionEmpleadoPagoRubro.setToolTipText("Recargar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpleadoPagoRubro,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpleadoPagoRubro = new JButtonMe();
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setText("Procesar");
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setToolTipText("Procesar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setVisible(false);
			
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpleadoPagoRubro.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setText("TIPO");       
		this.jComboBoxTiposReportesEmpleadoPagoRubro.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpleadoPagoRubro.setText("Accion");
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpleadoPagoRubro = new JLabelMe();
		
		this.jLabelAccionesEmpleadoPagoRubro.setText("Acciones");		
		this.jLabelAccionesEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpleadoPagoRubro = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpleadoPagoRubro = new JButtonMe();
		//this.jButtonAnterioresEmpleadoPagoRubro.setText("<<");
        this.jButtonAnterioresEmpleadoPagoRubro.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpleadoPagoRubro,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpleadoPagoRubro = new JButtonMe();
		//this.jButtonSiguientesEmpleadoPagoRubro.setText(">>");
        this.jButtonSiguientesEmpleadoPagoRubro.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpleadoPagoRubro,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro,"nuevoguardarcambios_button","Nue",this.empleadopagorubroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpleadoPagoRubro"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpleadoPagoRubro";
		inputMap = this.jButtonRecargarInformacionEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpleadoPagoRubro"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpleadoPagoRubro";
		inputMap = this.jButtonSiguientesEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpleadoPagoRubro"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpleadoPagoRubro";
		inputMap = this.jButtonAnterioresEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpleadoPagoRubro"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpleadoPagoRubro();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpleadoPagoRubro.setMinimumSize(new Dimension(this.getWidth(),EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoPagoRubro.setMaximumSize(new Dimension(this.getWidth(),EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpleadoPagoRubro.setPreferredSize(new Dimension(this.getWidth(),EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpleadoPagoRubroBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpleadoPagoRubro = new GridBagLayout();

			this.jPanelPaginacionEmpleadoPagoRubro.setLayout(gridaBagLayoutPaginacionEmpleadoPagoRubro);						
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonAnterioresEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					
						
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
			
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
						
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonSiguientesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonNuevoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
						
			
			
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
				this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonGuardarCambiosTablaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			}
			
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonDuplicarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonCopiarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonVerFormEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpleadoPagoRubro.add(this.jButtonCerrarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		
		this.jButtonRecargarInformacionEmpleadoPagoRubro.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoPagoRubro.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpleadoPagoRubro.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpleadoPagoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoPagoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpleadoPagoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpleadoPagoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpleadoPagoRubro = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EmpleadoPagoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EmpleadoPagoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EmpleadoPagoRubro = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EmpleadoPagoRubro = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.setLayout(gridaBagParametrosReportesEmpleadoPagoRubro);
			this.jPanelParametrosReportesAccionesEmpleadoPagoRubro.setLayout(gridaBagParametrosReportesAccionesEmpleadoPagoRubro);
			
			
			this.jPanelParametrosAuxiliar1EmpleadoPagoRubro.setLayout(gridaBagParametrosAuxiliar1EmpleadoPagoRubro);
			this.jPanelParametrosAuxiliar2EmpleadoPagoRubro.setLayout(gridaBagParametrosAuxiliar2EmpleadoPagoRubro);
			this.jPanelParametrosAuxiliar3EmpleadoPagoRubro.setLayout(gridaBagParametrosAuxiliar3EmpleadoPagoRubro);
			this.jPanelParametrosAuxiliar4EmpleadoPagoRubro.setLayout(gridaBagParametrosAuxiliar4EmpleadoPagoRubro);
			//this.jPanelParametrosAuxiliar5EmpleadoPagoRubro.setLayout(gridaBagParametrosAuxiliar2EmpleadoPagoRubro);			
			
			
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jButtonRecargarInformacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoPagoRubro.add(this.jComboBoxTiposPaginacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoPagoRubro.add(this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EmpleadoPagoRubro.add(this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jPanelParametrosAuxiliar1EmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EmpleadoPagoRubro.add(this.jComboBoxTiposReportesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);																		
			
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4EmpleadoPagoRubro.add(this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jPanelParametrosAuxiliar4EmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jComboBoxTiposReportesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jCheckBoxGenerarReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jPanelParametrosAuxiliar2EmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jLabelAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jButtonAbrirOrderByEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jComboBoxTiposSeleccionarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			
			
			/*
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jCheckBoxConGraficoReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoPagoRubro.add(this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);															
				
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoPagoRubro.add(this.jCheckBoxSeleccionadosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);															
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EmpleadoPagoRubro.add(this.jCheckBoxConGraficoReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jPanelParametrosAuxiliar3EmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jComboBoxTiposAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
	
				
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpleadoPagoRubro.add(this.jTextFieldValorCampoGeneralEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpleadoPagoRubro = new GridBagLayout();

			this.jScrollPanelDatosEmpleadoPagoRubro.setLayout(gridaBagLayoutDatosEmpleadoPagoRubro);
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
			
			this.jScrollPanelDatosEmpleadoPagoRubro.add(this.jTableDatosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpleadoPagoRubro.setViewportView(this.jTableDatosEmpleadoPagoRubro);
		this.jTableDatosEmpleadoPagoRubro.setFillsViewportHeight(true);
		this.jTableDatosEmpleadoPagoRubro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoPagoRubro= new GridBagLayout();
		this.jPanelAccionesEmpleadoPagoRubro.setLayout(gridaBagLayoutAccionesEmpleadoPagoRubro);
		
		
		/*	
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
			
		this.jPanelAccionesEmpleadoPagoRubro.add(this.jButtonNuevoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioEmpleadoPagoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdAnioEmpleadoPagoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioEmpleadoPagoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioEmpleadoPagoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioEmpleadoPagoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioEmpleadoPagoRubro.setLayout(gridaBagLayoutFK_IdAnioEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		jPanelFK_IdAnioEmpleadoPagoRubro.add(jLabelid_anioFK_IdAnioEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
		jPanelFK_IdAnioEmpleadoPagoRubro.add(jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
		gridBagConstraintsEmpleadoPagoRubro.gridx =1;
		jPanelFK_IdAnioEmpleadoPagoRubro.add(jButtonFK_IdAnioEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		jTabbedPaneBusquedasEmpleadoPagoRubro.addTab("1.-Por Anio ", jPanelFK_IdAnioEmpleadoPagoRubro);
		jTabbedPaneBusquedasEmpleadoPagoRubro.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoEmpleadoPagoRubro.setLayout(gridaBagLayoutFK_IdEmpleadoEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		jPanelFK_IdEmpleadoEmpleadoPagoRubro.add(jLabelid_empleadoFK_IdEmpleadoEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
		jPanelFK_IdEmpleadoEmpleadoPagoRubro.add(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
		gridBagConstraintsEmpleadoPagoRubro.gridx =1;
		jPanelFK_IdEmpleadoEmpleadoPagoRubro.add(jButtonFK_IdEmpleadoEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		jTabbedPaneBusquedasEmpleadoPagoRubro.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoEmpleadoPagoRubro);
		jTabbedPaneBusquedasEmpleadoPagoRubro.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraEmpleadoPagoRubro.setLayout(gridaBagLayoutFK_IdEstructuraEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		jPanelFK_IdEstructuraEmpleadoPagoRubro.add(jLabelid_estructuraFK_IdEstructuraEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
		jPanelFK_IdEstructuraEmpleadoPagoRubro.add(jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
		gridBagConstraintsEmpleadoPagoRubro.gridx =1;
		jPanelFK_IdEstructuraEmpleadoPagoRubro.add(jButtonFK_IdEstructuraEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		jTabbedPaneBusquedasEmpleadoPagoRubro.addTab("3.-Por Estructura ", jPanelFK_IdEstructuraEmpleadoPagoRubro);
		jTabbedPaneBusquedasEmpleadoPagoRubro.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdMesEmpleadoPagoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdMesEmpleadoPagoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesEmpleadoPagoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesEmpleadoPagoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesEmpleadoPagoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesEmpleadoPagoRubro.setLayout(gridaBagLayoutFK_IdMesEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		jPanelFK_IdMesEmpleadoPagoRubro.add(jLabelid_mesFK_IdMesEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
		jPanelFK_IdMesEmpleadoPagoRubro.add(jComboBoxid_mesFK_IdMesEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
		gridBagConstraintsEmpleadoPagoRubro.gridx =1;
		jPanelFK_IdMesEmpleadoPagoRubro.add(jButtonFK_IdMesEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		jTabbedPaneBusquedasEmpleadoPagoRubro.addTab("4.-Por Mes ", jPanelFK_IdMesEmpleadoPagoRubro);
		jTabbedPaneBusquedasEmpleadoPagoRubro.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaEmpleadoPagoRubro.setLayout(gridaBagLayoutFK_IdRubroEmpleaEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		jPanelFK_IdRubroEmpleaEmpleadoPagoRubro.add(jLabelid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 0;
		gridBagConstraintsEmpleadoPagoRubro.gridx = 1;
		jPanelFK_IdRubroEmpleaEmpleadoPagoRubro.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEmpleadoPagoRubro.gridy = 1;
		gridBagConstraintsEmpleadoPagoRubro.gridx =1;
		jPanelFK_IdRubroEmpleaEmpleadoPagoRubro.add(jButtonFK_IdRubroEmpleaEmpleadoPagoRubro, gridBagConstraintsEmpleadoPagoRubro);

		jTabbedPaneBusquedasEmpleadoPagoRubro.addTab("5.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);
		jTabbedPaneBusquedasEmpleadoPagoRubro.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoPagoRubro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoPagoRubro);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;		
			//this.gridBagConstraintsEmpleadoPagoRubro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;		
		//this.gridBagConstraintsEmpleadoPagoRubro.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpleadoPagoRubro);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;		
			this.gridBagConstraintsEmpleadoPagoRubro.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEmpleadoPagoRubro.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);								
		
		
		/*
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		*/		
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =0;
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoPagoRubro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
				
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpleadoPagoRubro= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoPagoRubro = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpleadoPagoRubro.setLayout(gridaBagLayoutBusquedasParametrosEmpleadoPagoRubro);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
			
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpleadoPagoRubro;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpleadoPagoRubro() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpleadoPagoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setName("jPanelReporteDinamicoEmpleadoPagoRubro"); 
		
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpleadoPagoRubro.setLayout(gridaBagLayoutReporteDinamicoEmpleadoPagoRubro);
		
		
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoPagoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpleadoPagoRubro = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpleadoPagoRubro.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelColumnasSelectReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpleadoPagoRubro = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpleadoPagoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpleadoPagoRubro=new JScrollPane(this.jListColumnasSelectReporteEmpleadoPagoRubro);
			
			this.jScrollColumnasSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jListColumnasSelectReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jScrollColumnasSelectReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpleadoPagoRubro = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpleadoPagoRubro.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpleadoPagoRubro = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpleadoPagoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpleadoPagoRubro=new JScrollPane(this.jListRelacionesSelectReporteEmpleadoPagoRubro);
			
			this.jScrollRelacionesSelectReporteEmpleadoPagoRubro.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoPagoRubro.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpleadoPagoRubro.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpleadoPagoRubro = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpleadoPagoRubro.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelConGraficoDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jCheckBoxConGraficoDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelColumnaCategoriaGraficoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpleadoPagoRubro = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpleadoPagoRubro.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelColumnaCategoriaValorEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jComboBoxColumnaCategoriaValorEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpleadoPagoRubro.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelColumnasValoresGraficoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpleadoPagoRubro = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpleadoPagoRubro.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpleadoPagoRubro.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpleadoPagoRubro.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoPagoRubro.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpleadoPagoRubro.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpleadoPagoRubro=new JScrollPane(this.jListColumnasValoresGraficoEmpleadoPagoRubro);
			
			this.jScrollColumnasValoresGraficoEmpleadoPagoRubro.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoPagoRubro.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpleadoPagoRubro.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jListColumnasSelectReporteEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jScrollColumnasValoresGraficoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelTiposGraficosReportesDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpleadoPagoRubro.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jComboBoxTiposGraficosReportesDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelGenerarExcelReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro.setToolTipText("Generar EXCEL"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jComboBoxTiposReportesDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jLabelTiposArchivoReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jComboBoxTiposArchivosReportesDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro.setToolTipText("Generar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro.setToolTipText("Cancelar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpleadoPagoRubro.add(this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpleadoPagoRubro = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro= new JScrollPane(jPanelReporteDinamicoEmpleadoPagoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpleadoPagoRubro);
		this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getContentPane().add(this.jScrollPanelReporteDinamicoEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpleadoPagoRubro() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpleadoPagoRubro = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpleadoPagoRubro.setName("jPanelImportacionEmpleadoPagoRubro"); 
		
		this.jPanelImportacionEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpleadoPagoRubro.setLayout(gridaBagLayoutImportacionEmpleadoPagoRubro);
		
		
		this.jInternalFrameImportacionEmpleadoPagoRubro= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpleadoPagoRubro= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpleadoPagoRubro = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpleadoPagoRubro= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpleadoPagoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoPagoRubro.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoPagoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpleadoPagoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpleadoPagoRubro.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpleadoPagoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setResizable(true);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setClosable(true);
	    this.jInternalFrameImportacionEmpleadoPagoRubro.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpleadoPagoRubro = new JLabelMe();

		this.jLabelArchivoImportacionEmpleadoPagoRubro.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jLabelArchivoImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpleadoPagoRubro = new JFileChooser();		
		this.jFileChooserImportacionEmpleadoPagoRubro.setToolTipText("ESCOGER ARCHIVO"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpleadoPagoRubro = new JButtonMe();
		this.jButtonAbrirImportacionEmpleadoPagoRubro.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpleadoPagoRubro,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpleadoPagoRubro.setToolTipText("Generar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jButtonAbrirImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpleadoPagoRubro = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpleadoPagoRubro.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpleadoPagoRubro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoPagoRubro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpleadoPagoRubro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jLabelPathArchivoImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpleadoPagoRubro=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpleadoPagoRubro.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoPagoRubro.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpleadoPagoRubro.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jTextFieldPathArchivoImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpleadoPagoRubro = new JButtonMe();
		this.jButtonGenerarImportacionEmpleadoPagoRubro.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpleadoPagoRubro,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpleadoPagoRubro.setToolTipText("Generar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jButtonGenerarImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpleadoPagoRubro = new JButtonMe();
		this.jButtonCerrarImportacionEmpleadoPagoRubro.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpleadoPagoRubro,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpleadoPagoRubro.setToolTipText("Cancelar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpleadoPagoRubro.add(this.jButtonCerrarImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpleadoPagoRubro = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpleadoPagoRubro= new JScrollPane(jPanelImportacionEmpleadoPagoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoPagoRubro.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpleadoPagoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpleadoPagoRubro.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpleadoPagoRubro);
		this.jInternalFrameImportacionEmpleadoPagoRubro.getContentPane().add(this.jScrollPanelImportacionEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpleadoPagoRubro(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpleadoPagoRubro = new JButtonMe();
			this.jButtonAbrirOrderByEmpleadoPagoRubro.setText("Orden");
			this.jButtonAbrirOrderByEmpleadoPagoRubro.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpleadoPagoRubro,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpleadoPagoRubro";
			inputMap = this.jButtonAbrirOrderByEmpleadoPagoRubro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpleadoPagoRubro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpleadoPagoRubro"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpleadoPagoRubro = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpleadoPagoRubro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpleadoPagoRubro.setName("jPanelOrderByEmpleadoPagoRubro"); 
			
			this.jPanelOrderByEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpleadoPagoRubro.setLayout(gridaBagLayoutOrderByEmpleadoPagoRubro);
			
			
			this.jTableDatosEmpleadoPagoRubroOrderBy = new JTableMe();        
			this.jTableDatosEmpleadoPagoRubroOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpleadoPagoRubroOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpleadoPagoRubroOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpleadoPagoRubroOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpleadoPagoRubroOrderBy.setViewportView(this.jTableDatosEmpleadoPagoRubroOrderBy);
			this.jTableDatosEmpleadoPagoRubroOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpleadoPagoRubroOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpleadoPagoRubro= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpleadoPagoRubro= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpleadoPagoRubro = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpleadoPagoRubro= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpleadoPagoRubro.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpleadoPagoRubro.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpleadoPagoRubro.setTitle("Orden");
			this.jInternalFrameOrderByEmpleadoPagoRubro.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpleadoPagoRubro.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpleadoPagoRubro.setResizable(true);
			this.jInternalFrameOrderByEmpleadoPagoRubro.setClosable(true);
			this.jInternalFrameOrderByEmpleadoPagoRubro.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpleadoPagoRubro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Pago Rubros"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpleadoPagoRubro.ipady =150;
				
			this.jPanelOrderByEmpleadoPagoRubro.add(jScrollPanelDatosEmpleadoPagoRubroOrderBy, this.gridBagConstraintsEmpleadoPagoRubro);//this.jTableDatosEmpleadoPagoRubroTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpleadoPagoRubro = new JButtonMe();
			this.jButtonCerrarOrderByEmpleadoPagoRubro.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpleadoPagoRubro,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpleadoPagoRubro.setToolTipText("Cancelar"+" "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpleadoPagoRubro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoPagoRubro.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpleadoPagoRubro.add(this.jButtonCerrarOrderByEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpleadoPagoRubro = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpleadoPagoRubro= new JScrollPane(jPanelOrderByEmpleadoPagoRubro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpleadoPagoRubro = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoPagoRubro.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpleadoPagoRubro.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpleadoPagoRubro.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpleadoPagoRubro.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpleadoPagoRubro.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpleadoPagoRubro);
			
			this.jInternalFrameOrderByEmpleadoPagoRubro.getContentPane().add(this.jScrollPanelOrderByEmpleadoPagoRubro, this.gridBagConstraintsEmpleadoPagoRubro);			
		
		} else {
			this.jButtonAbrirOrderByEmpleadoPagoRubro = new JButtonMe();
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
		int iWidthTableCalculado=0;//2030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empleadopagorubroSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpleadoPagoRubro.getRowHeight();//EmpleadoPagoRubroConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.isSelected()) {
					iHeightTable=EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpleadoPagoRubro.isSelected()) {
					iHeightTable=EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpleadoPagoRubroConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpleadoPagoRubro!=null && this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy()!=null) {
			//if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpleadoPagoRubro.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpleadoPagoRubro.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoPagoRubro.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpleadoPagoRubro.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empleadopagorubroLogic.getEmpleadoPagoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadopagorubros.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EmpleadoPagoRubro> TraerEmpleadoPagoRubroBeans(List<EmpleadoPagoRubro> empleadopagorubros,ArrayList<Classe> classes)throws Exception {
		try {
			for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubros) {
					
				if(!(EmpleadoPagoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpleadoPagoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empleadopagorubro.setsDetalleGeneralEntityReporte(EmpleadoPagoRubroConstantesFunciones.getEmpleadoPagoRubroDescripcion(empleadopagorubro));
										
						
					
						
					
				} else  {
							
					//empleadopagorubro.setsDetalleGeneralEntityReporte(empleadopagorubro.getsDetalleGeneralEntityReporte());
										
				}
				
				//empleadopagorubrobeans.add(empleadopagorubrobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empleadopagorubros;
    }
	//PARA REPORTES FIN
}
