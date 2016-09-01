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
import com.bydan.erp.nomina.util.HistorialPagoNomiConstantesFunciones;

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
public class HistorialPagoNomiJInternalFrame extends HistorialPagoNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialPagoNomi;
	
	protected JMenuBar jmenuBarHistorialPagoNomi;
	
	protected JMenu jmenuHistorialPagoNomi;
	protected JMenu jmenuDatosHistorialPagoNomi;
	protected JMenu jmenuArchivoHistorialPagoNomi;
	protected JMenu jmenuAccionesHistorialPagoNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialPagoNomi;	
	protected GridBagConstraints gridBagConstraintsHistorialPagoNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialPagoNomiDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialPagoNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialPagoNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialPagoNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialPagoNomiSessionBean historialpagonomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialPagoNomi> historialpagonomis;		
	public List<HistorialPagoNomi> historialpagonomisEliminados;	
	public List<HistorialPagoNomi> historialpagonomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialPagoNomi;		
	protected JButton jButtonAbrirOrderByHistorialPagoNomi;
	
	
	//protected JPanel jPanelOrderByHistorialPagoNomi;
	//public JScrollPane jScrollPanelOrderByHistorialPagoNomi;	
	//protected JButton jButtonCerrarOrderByHistorialPagoNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialPagoNomiLogic historialpagonomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialPagoNomi;
	public JScrollPane jScrollPanelDatosEdicionHistorialPagoNomi;
	public JScrollPane jScrollPanelDatosGeneralHistorialPagoNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialPagoNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialPagoNomi;
	//public JScrollPane jScrollPanelImportacionHistorialPagoNomi;
	
	
	
	protected JPanel jPanelAccionesHistorialPagoNomi;
	
    protected JPanel jPanelPaginacionHistorialPagoNomi;
    protected JPanel jPanelParametrosReportesHistorialPagoNomi;
	protected JPanel jPanelParametrosReportesAccionesHistorialPagoNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialPagoNomi;
	protected JPanel jPanelParametrosAuxiliar2HistorialPagoNomi;
	protected JPanel jPanelParametrosAuxiliar3HistorialPagoNomi;
	protected JPanel jPanelParametrosAuxiliar4HistorialPagoNomi;
	//protected JPanel jPanelParametrosAuxiliar5HistorialPagoNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialPagoNomi;
	//protected JPanel jPanelImportacionHistorialPagoNomi;
	
	
	public JTable jTableDatosHistorialPagoNomi;
	
	
	
	//public JTable jTableDatosHistorialPagoNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialPagoNomi;
	protected JButton jButtonDuplicarHistorialPagoNomi;
	protected JButton jButtonCopiarHistorialPagoNomi;
	protected JButton jButtonVerFormHistorialPagoNomi;
	protected JButton jButtonNuevoRelacionesHistorialPagoNomi;
	protected JButton jButtonModificarHistorialPagoNomi;
	
    protected JButton jButtonGuardarCambiosTablaHistorialPagoNomi;
	protected JButton jButtonCerrarHistorialPagoNomi;
	
	
	protected JButton jButtonRecargarInformacionHistorialPagoNomi;
	protected JButton jButtonProcesarInformacionHistorialPagoNomi;
	
	
	protected JButton jButtonAnterioresHistorialPagoNomi;
	protected JButton jButtonSiguientesHistorialPagoNomi;
	protected JButton jButtonNuevoGuardarCambiosHistorialPagoNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialPagoNomi;
	//protected JButton jButtonCerrarReporteDinamicoHistorialPagoNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialPagoNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialPagoNomi;
	//protected JButton jButtonGenerarImportacionHistorialPagoNomi;
	//protected JButton jButtonCerrarImportacionHistorialPagoNomi;
	//protected JFileChooser jFileChooserImportacionHistorialPagoNomi;
	//protected File fileImportacionHistorialPagoNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialPagoNomi;
	protected JButton jButtonDuplicarToolBarHistorialPagoNomi;
	protected JButton jButtonNuevoRelacionesToolBarHistorialPagoNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialPagoNomi;
	protected JButton jButtonCopiarToolBarHistorialPagoNomi;
	protected JButton jButtonVerFormToolBarHistorialPagoNomi;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialPagoNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialPagoNomi;
	protected JButton jButtonCerrarToolBarHistorialPagoNomi;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialPagoNomi;
	protected JButton jButtonProcesarInformacionToolBarHistorialPagoNomi;
	protected JButton jButtonAnterioresToolBarHistorialPagoNomi;
	protected JButton jButtonSiguientesToolBarHistorialPagoNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi;
	protected JButton jButtonAbrirOrderByToolBarHistorialPagoNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialPagoNomi;
	protected JMenuItem jMenuItemDuplicarHistorialPagoNomi;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialPagoNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialPagoNomi;
	protected JMenuItem jMenuItemCopiarHistorialPagoNomi;
	protected JMenuItem jMenuItemVerFormHistorialPagoNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialPagoNomi;
	protected JMenuItem jMenuItemCerrarHistorialPagoNomi;
	protected JMenuItem jMenuItemDetalleCerrarHistorialPagoNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialPagoNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialPagoNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialPagoNomi;
	protected JMenuItem jMenuItemProcesarInformacionHistorialPagoNomi;
	protected JMenuItem jMenuItemAnterioresHistorialPagoNomi;
	protected JMenuItem jMenuItemSiguientesHistorialPagoNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialPagoNomi;
	protected JMenuItem jMenuItemAbrirOrderByHistorialPagoNomi;
	protected JMenuItem jMenuItemMostrarOcultarHistorialPagoNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialPagoNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialPagoNomi;
	protected JCheckBox jCheckBoxSeleccionadosHistorialPagoNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialPagoNomi;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialPagoNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialPagoNomi;
	protected JTextField jTextFieldValorCampoGeneralHistorialPagoNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialPagoNomi;
	//public JList<Reporte> jListColumnasSelectReporteHistorialPagoNomi;
	//public JScrollPane jScrollColumnasSelectReporteHistorialPagoNomi;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialPagoNomi;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialPagoNomi;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialPagoNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialPagoNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialPagoNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialPagoNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialPagoNomi;
	
		
	//public JLabel jLabelArchivoImportacionHistorialPagoNomi;	
	//public JLabel jLabelPathArchivoImportacionHistorialPagoNomi;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialPagoNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialPagoNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialPagoNomi;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialPagoNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialPagoNomi;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialPagoNomi;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialPagoNomi;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialPagoNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialPagoNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialPagoNomi;
	public JPanel jPanelFK_IdEmpleadoHistorialPagoNomi;
	public JButton jButtonFK_IdEmpleadoHistorialPagoNomi;
	public JPanel jPanelFK_IdEstructuraHistorialPagoNomi;
	public JButton jButtonFK_IdEstructuraHistorialPagoNomi;
	public JPanel jPanelFK_IdMesHistorialPagoNomi;
	public JButton jButtonFK_IdMesHistorialPagoNomi;
	public JPanel jPanelFK_IdRubroEmpleaHistorialPagoNomi;
	public JButton jButtonFK_IdRubroEmpleaHistorialPagoNomi;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoHistorialPagoNomi;
	public JLabel jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi;
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraFK_IdEstructuraHistorialPagoNomi;
	public JLabel jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi;
	public JButton jButtonid_estructuraFK_IdEstructuraHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraHistorialPagoNomiBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraFK_IdEstructuraHistorialPagoNomiArbol= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesHistorialPagoNomi;
	public JLabel jLabelid_mesFK_IdMesHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesHistorialPagoNomi;
	public JButton jButtonid_mesFK_IdMesHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesHistorialPagoNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomiUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomiBusqueda= new JButtonMe();

	
	
	
	
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
	public HistorialPagoNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialPagoNomi)	{
		this.jButtonRecargarInformacionHistorialPagoNomi = jButtonRecargarInformacionHistorialPagoNomi;
	}
	
	public JButton getjButtonProcesarInformacionHistorialPagoNomi() {
		return this.jButtonProcesarInformacionHistorialPagoNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialPagoNomi)	{
		this.jButtonProcesarInformacionHistorialPagoNomi = jButtonProcesarInformacionHistorialPagoNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialPagoNomi() {
		return this.jButtonRecargarInformacionHistorialPagoNomi;
	}
	
	
	public List<HistorialPagoNomi> gethistorialpagonomis() {
		return this.historialpagonomis;
	}

	public void sethistorialpagonomis(List<HistorialPagoNomi> historialpagonomis) {
		this.historialpagonomis = historialpagonomis;
	}
	
	public List<HistorialPagoNomi> gethistorialpagonomisAux() {
		return this.historialpagonomisAux;
	}

	public void sethistorialpagonomisAux(List<HistorialPagoNomi> historialpagonomisAux) {
		this.historialpagonomisAux = historialpagonomisAux;
	}
	
	public List<HistorialPagoNomi> gethistorialpagonomisEliminados() {
		return this.historialpagonomisEliminados;
	}

	public void setHistorialPagoNomisEliminados(List<HistorialPagoNomi> historialpagonomisEliminados) {
		this.historialpagonomisEliminados = historialpagonomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialPagoNomi() {
		return jComboBoxTiposSeleccionarHistorialPagoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialPagoNomi(
			JComboBox jComboBoxTiposSeleccionarHistorialPagoNomi) {
		this.jComboBoxTiposSeleccionarHistorialPagoNomi = jComboBoxTiposSeleccionarHistorialPagoNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialPagoNomi() {
		return jTextFieldValorCampoGeneralHistorialPagoNomi;
	}

	public void setjTextFieldValorCampoGeneralHistorialPagoNomi(
			JTextField jTextFieldValorCampoGeneralHistorialPagoNomi) {
		this.jTextFieldValorCampoGeneralHistorialPagoNomi = jTextFieldValorCampoGeneralHistorialPagoNomi;
	}

	public void setBorderResaltarValorCampoGeneralHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialPagoNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialPagoNomi() {
		return this.jCheckBoxSeleccionarTodosHistorialPagoNomi;
	}

	public void setjCheckBoxSeleccionarTodosHistorialPagoNomi(
			JCheckBox jCheckBoxSeleccionarTodosHistorialPagoNomi) {
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi = jCheckBoxSeleccionarTodosHistorialPagoNomi;
	}

	public void setBorderResaltarSeleccionarTodosHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialPagoNomi() {
		return this.jCheckBoxSeleccionadosHistorialPagoNomi;
	}

	public void setjCheckBoxSeleccionadosHistorialPagoNomi(
			JCheckBox jCheckBoxSeleccionadosHistorialPagoNomi) {
		this.jCheckBoxSeleccionadosHistorialPagoNomi = jCheckBoxSeleccionadosHistorialPagoNomi;
	}
	
	public void setBorderResaltarSeleccionadosHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialPagoNomi() {
		return this.jComboBoxTiposArchivosReportesHistorialPagoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialPagoNomi(
			JComboBox jComboBoxTiposArchivosReportesHistorialPagoNomi) {
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi = jComboBoxTiposArchivosReportesHistorialPagoNomi;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialPagoNomi() {
		return this.jComboBoxTiposReportesHistorialPagoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialPagoNomi(
			JComboBox jComboBoxTiposReportesHistorialPagoNomi) {
		this.jComboBoxTiposReportesHistorialPagoNomi = jComboBoxTiposReportesHistorialPagoNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialPagoNomi() {
	//	return jComboBoxTiposReportesDinamicoHistorialPagoNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialPagoNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialPagoNomi) {
	//	this.jComboBoxTiposReportesDinamicoHistorialPagoNomi = jComboBoxTiposReportesDinamicoHistorialPagoNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi = jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi;
	//}
	
	public void setBorderResaltarTiposReportesHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialPagoNomi() {
		return this.jComboBoxTiposGraficosReportesHistorialPagoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialPagoNomi(
			JComboBox jComboBoxTiposGraficosReportesHistorialPagoNomi) {
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi = jComboBoxTiposGraficosReportesHistorialPagoNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialPagoNomi() {
		return this.jComboBoxTiposPaginacionHistorialPagoNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialPagoNomi(
			JComboBox jComboBoxTiposPaginacionHistorialPagoNomi) {
		this.jComboBoxTiposPaginacionHistorialPagoNomi = jComboBoxTiposPaginacionHistorialPagoNomi;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialPagoNomi() {
		return this.jComboBoxTiposRelacionesHistorialPagoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialPagoNomi() {
		return this.jComboBoxTiposAccionesHistorialPagoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialPagoNomi(
			JComboBox jComboBoxTiposRelacionesHistorialPagoNomi) {
		this.jComboBoxTiposRelacionesHistorialPagoNomi = jComboBoxTiposRelacionesHistorialPagoNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialPagoNomi(
			JComboBox jComboBoxTiposAccionesHistorialPagoNomi) {
		this.jComboBoxTiposAccionesHistorialPagoNomi = jComboBoxTiposAccionesHistorialPagoNomi;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialPagoNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialPagoNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialPagoNomi() {
	//	return jCheckBoxConGraficoDinamicoHistorialPagoNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialPagoNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialPagoNomi) {
	//	this.jCheckBoxConGraficoDinamicoHistorialPagoNomi = jCheckBoxConGraficoDinamicoHistorialPagoNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialPagoNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialPagoNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialPagoNomi .setBorder(borderResaltar);		
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
		this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		
		this.historialpagonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialpagonomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialPagoNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Pago Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialPagoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialPagoNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialPagoNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"nuevo","nuevo","Nuevo"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"duplicar","duplicar","Duplicar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"copiar","copiar","Copiar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"ver_form","ver_form","Ver"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"recargar","recargar","Recargar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialPagoNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,
							"cerrar","cerrar","Salir"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialPagoNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialPagoNomi;
			
				this.jButtonProcesarInformacionToolBarHistorialPagoNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialPagoNomi;
				
		//protected JButton jButtonModificarToolBarHistorialPagoNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialPagoNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialPagoNomi=new JMenuMe("General");
		this.jmenuArchivoHistorialPagoNomi=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialPagoNomi=new JMenuMe("Acciones");
		this.jmenuDatosHistorialPagoNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialPagoNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialPagoNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialPagoNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialPagoNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialPagoNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialPagoNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialPagoNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialPagoNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialPagoNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialPagoNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialPagoNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialPagoNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialPagoNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialPagoNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialPagoNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialPagoNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialPagoNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialPagoNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialPagoNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialPagoNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialPagoNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialPagoNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialPagoNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialPagoNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialPagoNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialPagoNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialPagoNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialPagoNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialPagoNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialPagoNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialPagoNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialPagoNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialPagoNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialPagoNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialPagoNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialPagoNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialPagoNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialPagoNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialPagoNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialPagoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialPagoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialPagoNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialPagoNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialPagoNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialPagoNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialPagoNomi.add(this.jMenuItemCerrarHistorialPagoNomi);
			
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemNuevoHistorialPagoNomi);
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi);
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemNuevoRelacionesHistorialPagoNomi);
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemGuardarCambiosTablaHistorialPagoNomi);		
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemDuplicarHistorialPagoNomi);		
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemCopiarHistorialPagoNomi);		
			this.jmenuAccionesHistorialPagoNomi.add(this.jMenuItemVerFormHistorialPagoNomi);		
			
			this.jmenuDatosHistorialPagoNomi.add(this.jMenuItemRecargarInformacionHistorialPagoNomi);				
			this.jmenuDatosHistorialPagoNomi.add(this.jMenuItemAnterioresHistorialPagoNomi);				
			this.jmenuDatosHistorialPagoNomi.add(this.jMenuItemSiguientesHistorialPagoNomi);				
			this.jmenuDatosHistorialPagoNomi.add(this.jMenuItemAbrirOrderByHistorialPagoNomi);				
			this.jmenuDatosHistorialPagoNomi.add(this.jMenuItemMostrarOcultarHistorialPagoNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialPagoNomi.add(this.jMenuItemGuardarCambiosHistorialPagoNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialPagoNomi.add(this.jmenuArchivoHistorialPagoNomi);		
			this.jmenuBarHistorialPagoNomi.add(this.jmenuAccionesHistorialPagoNomi);		
			this.jmenuBarHistorialPagoNomi.add(this.jmenuDatosHistorialPagoNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialPagoNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialPagoNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdEmpleadoHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoHistorialPagoNomi.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoHistorialPagoNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoHistorialPagoNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoHistorialPagoNomi.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoHistorialPagoNomi,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstructuraHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstructuraHistorialPagoNomi.setToolTipText("Buscar Por Estructura ");
		this.jButtonFK_IdEstructuraHistorialPagoNomi= new JButtonMe();
		this.jButtonFK_IdEstructuraHistorialPagoNomi.setText("Buscar");
		this.jButtonFK_IdEstructuraHistorialPagoNomi.setToolTipText("Buscar Por Estructura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstructuraHistorialPagoNomi,"buscar_button","Buscar Por Estructura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstructuraHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi = new JLabelMe();
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi.setText("Estructura :");
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi.setToolTipText("Estructura");
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesHistorialPagoNomi.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesHistorialPagoNomi= new JButtonMe();
		this.jButtonFK_IdMesHistorialPagoNomi.setText("Buscar");
		this.jButtonFK_IdMesHistorialPagoNomi.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesHistorialPagoNomi,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesHistorialPagoNomi = new JLabelMe();
		jLabelid_mesFK_IdMesHistorialPagoNomi.setText("Mes :");
		jLabelid_mesFK_IdMesHistorialPagoNomi.setToolTipText("Mes");
		jLabelid_mesFK_IdMesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaHistorialPagoNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaHistorialPagoNomi.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaHistorialPagoNomi= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaHistorialPagoNomi.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaHistorialPagoNomi.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaHistorialPagoNomi,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHistorialPagoNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialPagoNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialPagoNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialPagoNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialPagoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialPagoNomi = new HistorialPagoNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Pago Nomi DATOS");
			this.jInternalFrameDetalleFormHistorialPagoNomi = new HistorialPagoNomiDetalleFormJInternalFrame(jDesktopPane,this.historialpagonomiSessionBean.getConGuardarRelaciones(),this.historialpagonomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialPagoNomi = null;//new HistorialPagoNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialPagoNomi= new GridBagLayout();
		
		
		this.jTableDatosHistorialPagoNomi = new JTableMe();      
		
		String sToolTipHistorialPagoNomi="";
		sToolTipHistorialPagoNomi=HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialPagoNomi+="(Nomina.HistorialPagoNomi)";
		}
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialPagoNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialPagoNomi.setToolTipText(sToolTipHistorialPagoNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialPagoNomi);
		this.jTableDatosHistorialPagoNomi.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialPagoNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialPagoNomi.setRowSelectionAllowed(true);
		this.jTableDatosHistorialPagoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialPagoNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialPagoNomi = new JButtonMe();
		this.jButtonDuplicarHistorialPagoNomi = new JButtonMe();
		this.jButtonCopiarHistorialPagoNomi = new JButtonMe();
		this.jButtonVerFormHistorialPagoNomi = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialPagoNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi = new JButtonMe();
		this.jButtonCerrarHistorialPagoNomi = new JButtonMe();
		
		this.jScrollPanelDatosHistorialPagoNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialPagoNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Pago Nomi";
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialPagoNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialPagoNomi.setToolTipText("Acciones");
        this.jPanelAccionesHistorialPagoNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialPagoNomi=new ReporteDinamicoJInternalFrame(HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialPagoNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialPagoNomi=new ImportacionJInternalFrame(HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialPagoNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialPagoNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialPagoNomi.setText("Orden");
		this.jButtonAbrirOrderByHistorialPagoNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialPagoNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialPagoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoNomi,false,this);
			
			//this.cargarOrderByHistorialPagoNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialPagoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoNomi,true,this);
			
			//this.cargarOrderByHistorialPagoNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialPagoNomi.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosHistorialPagoNomi.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosHistorialPagoNomi.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosHistorialPagoNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialPagoNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialPagoNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialPagoNomi.setText("Nuevo");
		this.jButtonDuplicarHistorialPagoNomi.setText("Duplicar");
		this.jButtonCopiarHistorialPagoNomi.setText("Copiar");
		this.jButtonVerFormHistorialPagoNomi.setText("Ver");
		this.jButtonNuevoRelacionesHistorialPagoNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.setText("Guardar");
		this.jButtonCerrarHistorialPagoNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialPagoNomi,"nuevo_button","Nuevo",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialPagoNomi,"duplicar_button","Duplicar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialPagoNomi,"copiar_button","Copiar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialPagoNomi,"ver_form","Ver",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialPagoNomi,"nuevorelaciones_button","Nuevo Rel",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialPagoNomi,"guardarcambiostabla_button","Guardar",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialPagoNomi,"cerrar_button","Salir",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialPagoNomi.setToolTipText("Nuevo"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialPagoNomi.setToolTipText("Duplicar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialPagoNomi.setToolTipText("Copiar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialPagoNomi.setToolTipText("Ver"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialPagoNomi.setToolTipText("Nuevo Rel"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.setToolTipText("Guardar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialPagoNomi.setToolTipText("Salir"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialPagoNomi";
		inputMap = this.jButtonNuevoHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialPagoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialPagoNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialPagoNomi";
		inputMap = this.jButtonDuplicarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialPagoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialPagoNomi"));
		
		//COPIAR
		sMapKey = "CopiarHistorialPagoNomi";
		inputMap = this.jButtonCopiarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialPagoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialPagoNomi"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialPagoNomi";
		inputMap = this.jButtonVerFormHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialPagoNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialPagoNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialPagoNomi";
		inputMap = this.jButtonNuevoRelacionesHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialPagoNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialPagoNomi";
		inputMap = this.jButtonModificarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialPagoNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialPagoNomi";
		inputMap = this.jButtonCerrarHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialPagoNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialPagoNomi";
		inputMap = this.jButtonGuardarCambiosTablaHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialPagoNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialPagoNomi.setName("jPanelParametrosReportesHistorialPagoNomi"); 
		
		this.jPanelParametrosReportesAccionesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialPagoNomi.setName("jPanelParametrosReportesAccionesHistorialPagoNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialPagoNomi = new JButtonMe();
		this.jButtonRecargarInformacionHistorialPagoNomi.setText("Recargar");
		this.jButtonRecargarInformacionHistorialPagoNomi.setToolTipText("Recargar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialPagoNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHistorialPagoNomi = new JButtonMe();
		this.jButtonProcesarInformacionHistorialPagoNomi.setText("Procesar");
		this.jButtonProcesarInformacionHistorialPagoNomi.setToolTipText("Procesar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialPagoNomi.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialPagoNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialPagoNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialPagoNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialPagoNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialPagoNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialPagoNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialPagoNomi.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialPagoNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialPagoNomi.setText("Accion");
		this.jComboBoxTiposAccionesHistorialPagoNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialPagoNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialPagoNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialPagoNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialPagoNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialPagoNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialPagoNomi = new JLabelMe();
		
		this.jLabelAccionesHistorialPagoNomi.setText("Acciones");		
		this.jLabelAccionesHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialPagoNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialPagoNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialPagoNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialPagoNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialPagoNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialPagoNomi = new JButtonMe();
		//this.jButtonAnterioresHistorialPagoNomi.setText("<<");
        this.jButtonAnterioresHistorialPagoNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialPagoNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialPagoNomi = new JButtonMe();
		//this.jButtonSiguientesHistorialPagoNomi.setText(">>");
        this.jButtonSiguientesHistorialPagoNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialPagoNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialPagoNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialPagoNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialPagoNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialPagoNomi,"nuevoguardarcambios_button","Nue",this.historialpagonomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialPagoNomi";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialPagoNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialPagoNomi";
		inputMap = this.jButtonRecargarInformacionHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialPagoNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialPagoNomi";
		inputMap = this.jButtonSiguientesHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialPagoNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialPagoNomi";
		inputMap = this.jButtonAnterioresHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialPagoNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialPagoNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialPagoNomi.setMinimumSize(new Dimension(this.getWidth(),HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialPagoNomi.setMaximumSize(new Dimension(this.getWidth(),HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialPagoNomi.setPreferredSize(new Dimension(this.getWidth(),HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialPagoNomi = new GridBagLayout();

			this.jPanelPaginacionHistorialPagoNomi.setLayout(gridaBagLayoutPaginacionHistorialPagoNomi);						
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonAnterioresHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					
						
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
			
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonNuevoGuardarCambiosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
						
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonSiguientesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonNuevoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
						
			
			
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
				this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonGuardarCambiosTablaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			}
			
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonDuplicarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonCopiarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonVerFormHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialPagoNomi.add(this.jButtonCerrarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		
		this.jButtonRecargarInformacionHistorialPagoNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialPagoNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialPagoNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialPagoNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialPagoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialPagoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialPagoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialPagoNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialPagoNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialPagoNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialPagoNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialPagoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialPagoNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialPagoNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialPagoNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialPagoNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialPagoNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialPagoNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialPagoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialPagoNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialPagoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialPagoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialPagoNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialPagoNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialPagoNomi.setLayout(gridaBagParametrosReportesHistorialPagoNomi);
			this.jPanelParametrosReportesAccionesHistorialPagoNomi.setLayout(gridaBagParametrosReportesAccionesHistorialPagoNomi);
			
			
			this.jPanelParametrosAuxiliar1HistorialPagoNomi.setLayout(gridaBagParametrosAuxiliar1HistorialPagoNomi);
			this.jPanelParametrosAuxiliar2HistorialPagoNomi.setLayout(gridaBagParametrosAuxiliar2HistorialPagoNomi);
			this.jPanelParametrosAuxiliar3HistorialPagoNomi.setLayout(gridaBagParametrosAuxiliar3HistorialPagoNomi);
			this.jPanelParametrosAuxiliar4HistorialPagoNomi.setLayout(gridaBagParametrosAuxiliar4HistorialPagoNomi);
			//this.jPanelParametrosAuxiliar5HistorialPagoNomi.setLayout(gridaBagParametrosAuxiliar2HistorialPagoNomi);			
			
			
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jButtonRecargarInformacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoNomi.add(this.jComboBoxTiposPaginacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoNomi.add(this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoNomi.add(this.jComboBoxTiposArchivosReportesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jPanelParametrosAuxiliar1HistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialPagoNomi.add(this.jComboBoxTiposReportesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);																		
			
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4HistorialPagoNomi.add(this.jComboBoxTiposGraficosReportesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jPanelParametrosAuxiliar4HistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jComboBoxTiposReportesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jCheckBoxGenerarReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jPanelParametrosAuxiliar2HistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jLabelAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialPagoNomi.add(this.jButtonAbrirOrderByHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jComboBoxTiposSeleccionarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			
			
			/*
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jCheckBoxSeleccionarTodosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jCheckBoxConGraficoReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoNomi.add(this.jCheckBoxSeleccionarTodosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);															
				
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoNomi.add(this.jCheckBoxSeleccionadosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);															
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoNomi.add(this.jCheckBoxConGraficoReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jPanelParametrosAuxiliar3HistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jComboBoxTiposAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
	
				
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoNomi.add(this.jTextFieldValorCampoGeneralHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialPagoNomi = new GridBagLayout();

			this.jScrollPanelDatosHistorialPagoNomi.setLayout(gridaBagLayoutDatosHistorialPagoNomi);
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
			
			this.jScrollPanelDatosHistorialPagoNomi.add(this.jTableDatosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialPagoNomi.setViewportView(this.jTableDatosHistorialPagoNomi);
		this.jTableDatosHistorialPagoNomi.setFillsViewportHeight(true);
		this.jTableDatosHistorialPagoNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialPagoNomi= new GridBagLayout();
		this.jPanelAccionesHistorialPagoNomi.setLayout(gridaBagLayoutAccionesHistorialPagoNomi);
		
		
		/*	
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
			
		this.jPanelAccionesHistorialPagoNomi.add(this.jButtonNuevoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoHistorialPagoNomi.setLayout(gridaBagLayoutFK_IdEmpleadoHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 0;
		jPanelFK_IdEmpleadoHistorialPagoNomi.add(jLabelid_empleadoFK_IdEmpleadoHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 1;
		jPanelFK_IdEmpleadoHistorialPagoNomi.add(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 1;
		gridBagConstraintsHistorialPagoNomi.gridx =1;
		jPanelFK_IdEmpleadoHistorialPagoNomi.add(jButtonFK_IdEmpleadoHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		jTabbedPaneBusquedasHistorialPagoNomi.addTab("1.-Por Empleado ", jPanelFK_IdEmpleadoHistorialPagoNomi);
		jTabbedPaneBusquedasHistorialPagoNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEstructuraHistorialPagoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEstructuraHistorialPagoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstructuraHistorialPagoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstructuraHistorialPagoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstructuraHistorialPagoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstructuraHistorialPagoNomi.setLayout(gridaBagLayoutFK_IdEstructuraHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 0;
		jPanelFK_IdEstructuraHistorialPagoNomi.add(jLabelid_estructuraFK_IdEstructuraHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 1;
		jPanelFK_IdEstructuraHistorialPagoNomi.add(jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 1;
		gridBagConstraintsHistorialPagoNomi.gridx =1;
		jPanelFK_IdEstructuraHistorialPagoNomi.add(jButtonFK_IdEstructuraHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		jTabbedPaneBusquedasHistorialPagoNomi.addTab("2.-Por Estructura ", jPanelFK_IdEstructuraHistorialPagoNomi);
		jTabbedPaneBusquedasHistorialPagoNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdMesHistorialPagoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdMesHistorialPagoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesHistorialPagoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesHistorialPagoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesHistorialPagoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesHistorialPagoNomi.setLayout(gridaBagLayoutFK_IdMesHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 0;
		jPanelFK_IdMesHistorialPagoNomi.add(jLabelid_mesFK_IdMesHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 1;
		jPanelFK_IdMesHistorialPagoNomi.add(jComboBoxid_mesFK_IdMesHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 1;
		gridBagConstraintsHistorialPagoNomi.gridx =1;
		jPanelFK_IdMesHistorialPagoNomi.add(jButtonFK_IdMesHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		jTabbedPaneBusquedasHistorialPagoNomi.addTab("3.-Por Mes ", jPanelFK_IdMesHistorialPagoNomi);
		jTabbedPaneBusquedasHistorialPagoNomi.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaHistorialPagoNomi.setLayout(gridaBagLayoutFK_IdRubroEmpleaHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 0;
		jPanelFK_IdRubroEmpleaHistorialPagoNomi.add(jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 0;
		gridBagConstraintsHistorialPagoNomi.gridx = 1;
		jPanelFK_IdRubroEmpleaHistorialPagoNomi.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoNomi.gridy = 1;
		gridBagConstraintsHistorialPagoNomi.gridx =1;
		jPanelFK_IdRubroEmpleaHistorialPagoNomi.add(jButtonFK_IdRubroEmpleaHistorialPagoNomi, gridBagConstraintsHistorialPagoNomi);

		jTabbedPaneBusquedasHistorialPagoNomi.addTab("4.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaHistorialPagoNomi);
		jTabbedPaneBusquedasHistorialPagoNomi.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialPagoNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialPagoNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();						
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;		
			//this.gridBagConstraintsHistorialPagoNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialPagoNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;		
		//this.gridBagConstraintsHistorialPagoNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialPagoNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialPagoNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoNomi.gridx = 0;		
			this.gridBagConstraintsHistorialPagoNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialPagoNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);								
		
		
		/*
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		*/		
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoNomi.gridx =0;
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialPagoNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
				
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialPagoNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialPagoNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialPagoNomi.setLayout(gridaBagLayoutBusquedasParametrosHistorialPagoNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialPagoNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
			
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialPagoNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialPagoNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialPagoNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialPagoNomi.setName("jPanelReporteDinamicoHistorialPagoNomi"); 
		
		this.jPanelReporteDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialPagoNomi.setLayout(gridaBagLayoutReporteDinamicoHistorialPagoNomi);
		
		
		this.jInternalFrameReporteDinamicoHistorialPagoNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialPagoNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialPagoNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialPagoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialPagoNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialPagoNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialPagoNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialPagoNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialPagoNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialPagoNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelColumnasSelectReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialPagoNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialPagoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialPagoNomi=new JScrollPane(this.jListColumnasSelectReporteHistorialPagoNomi);
			
			this.jScrollColumnasSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jListColumnasSelectReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jScrollColumnasSelectReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialPagoNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialPagoNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialPagoNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialPagoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialPagoNomi=new JScrollPane(this.jListRelacionesSelectReporteHistorialPagoNomi);
			
			this.jScrollRelacionesSelectReporteHistorialPagoNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialPagoNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialPagoNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialPagoNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialPagoNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialPagoNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialPagoNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoHistorialPagoNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoHistorialPagoNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelConGraficoDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoHistorialPagoNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoHistorialPagoNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoHistorialPagoNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jCheckBoxConGraficoDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoHistorialPagoNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoHistorialPagoNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelColumnaCategoriaGraficoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorHistorialPagoNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorHistorialPagoNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelColumnaCategoriaValorHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorHistorialPagoNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialPagoNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jComboBoxColumnaCategoriaValorHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoHistorialPagoNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoHistorialPagoNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelColumnasValoresGraficoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoHistorialPagoNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoHistorialPagoNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoHistorialPagoNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoHistorialPagoNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialPagoNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialPagoNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoHistorialPagoNomi=new JScrollPane(this.jListColumnasValoresGraficoHistorialPagoNomi);
			
			this.jScrollColumnasValoresGraficoHistorialPagoNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialPagoNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialPagoNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jListColumnasSelectReporteHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jScrollColumnasValoresGraficoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelTiposGraficosReportesDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialPagoNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelGenerarExcelReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi.setToolTipText("Generar EXCEL"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jComboBoxTiposReportesDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jLabelTiposArchivoReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialPagoNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialPagoNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialPagoNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialPagoNomi.setToolTipText("Generar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jButtonGenerarReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialPagoNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialPagoNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialPagoNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialPagoNomi.setToolTipText("Cancelar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoNomi.add(this.jButtonCerrarReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialPagoNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialPagoNomi= new JScrollPane(jPanelReporteDinamicoHistorialPagoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialPagoNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialPagoNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialPagoNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialPagoNomi);
		this.jInternalFrameReporteDinamicoHistorialPagoNomi.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialPagoNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialPagoNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialPagoNomi.setName("jPanelImportacionHistorialPagoNomi"); 
		
		this.jPanelImportacionHistorialPagoNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialPagoNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialPagoNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialPagoNomi.setLayout(gridaBagLayoutImportacionHistorialPagoNomi);
		
		
		this.jInternalFrameImportacionHistorialPagoNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialPagoNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialPagoNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialPagoNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialPagoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialPagoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialPagoNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialPagoNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialPagoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialPagoNomi.setResizable(true);
	    this.jInternalFrameImportacionHistorialPagoNomi.setClosable(true);
	    this.jInternalFrameImportacionHistorialPagoNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialPagoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialPagoNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialPagoNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialPagoNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialPagoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialPagoNomi.setResizable(true);
	    this.jInternalFrameImportacionHistorialPagoNomi.setClosable(true);
	    this.jInternalFrameImportacionHistorialPagoNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialPagoNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialPagoNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialPagoNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialPagoNomi = new JLabelMe();

		this.jLabelArchivoImportacionHistorialPagoNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialPagoNomi.add(this.jLabelArchivoImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialPagoNomi = new JFileChooser();		
		this.jFileChooserImportacionHistorialPagoNomi.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialPagoNomi = new JButtonMe();
		this.jButtonAbrirImportacionHistorialPagoNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialPagoNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialPagoNomi.setToolTipText("Generar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoNomi.add(this.jButtonAbrirImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialPagoNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialPagoNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialPagoNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialPagoNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialPagoNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialPagoNomi.add(this.jLabelPathArchivoImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialPagoNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialPagoNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialPagoNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialPagoNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoNomi.add(this.jTextFieldPathArchivoImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialPagoNomi = new JButtonMe();
		this.jButtonGenerarImportacionHistorialPagoNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialPagoNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialPagoNomi.setToolTipText("Generar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoNomi.add(this.jButtonGenerarImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialPagoNomi = new JButtonMe();
		this.jButtonCerrarImportacionHistorialPagoNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialPagoNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialPagoNomi.setToolTipText("Cancelar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoNomi.add(this.jButtonCerrarImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialPagoNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialPagoNomi= new JScrollPane(jPanelImportacionHistorialPagoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialPagoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialPagoNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialPagoNomi);
		this.jInternalFrameImportacionHistorialPagoNomi.getContentPane().add(this.jScrollPanelImportacionHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialPagoNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialPagoNomi = new JButtonMe();
			this.jButtonAbrirOrderByHistorialPagoNomi.setText("Orden");
			this.jButtonAbrirOrderByHistorialPagoNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialPagoNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialPagoNomi";
			inputMap = this.jButtonAbrirOrderByHistorialPagoNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialPagoNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialPagoNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialPagoNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialPagoNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialPagoNomi.setName("jPanelOrderByHistorialPagoNomi"); 
			
			this.jPanelOrderByHistorialPagoNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialPagoNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialPagoNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialPagoNomi.setLayout(gridaBagLayoutOrderByHistorialPagoNomi);
			
			
			this.jTableDatosHistorialPagoNomiOrderBy = new JTableMe();        
			this.jTableDatosHistorialPagoNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialPagoNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialPagoNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialPagoNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialPagoNomiOrderBy.setViewportView(this.jTableDatosHistorialPagoNomiOrderBy);
			this.jTableDatosHistorialPagoNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialPagoNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialPagoNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialPagoNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialPagoNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialPagoNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialPagoNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialPagoNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialPagoNomi.setTitle("Orden");
			this.jInternalFrameOrderByHistorialPagoNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialPagoNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialPagoNomi.setResizable(true);
			this.jInternalFrameOrderByHistorialPagoNomi.setClosable(true);
			this.jInternalFrameOrderByHistorialPagoNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialPagoNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialPagoNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialPagoNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialPagoNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialPagoNomi.ipady =150;
				
			this.jPanelOrderByHistorialPagoNomi.add(jScrollPanelDatosHistorialPagoNomiOrderBy, this.gridBagConstraintsHistorialPagoNomi);//this.jTableDatosHistorialPagoNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialPagoNomi = new JButtonMe();
			this.jButtonCerrarOrderByHistorialPagoNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialPagoNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialPagoNomi.setToolTipText("Cancelar"+" "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialPagoNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialPagoNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialPagoNomi.add(this.jButtonCerrarOrderByHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialPagoNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialPagoNomi= new JScrollPane(jPanelOrderByHistorialPagoNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialPagoNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialPagoNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialPagoNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialPagoNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialPagoNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialPagoNomi);
			
			this.jInternalFrameOrderByHistorialPagoNomi.getContentPane().add(this.jScrollPanelOrderByHistorialPagoNomi, this.gridBagConstraintsHistorialPagoNomi);			
		
		} else {
			this.jButtonAbrirOrderByHistorialPagoNomi = new JButtonMe();
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
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.historialpagonomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHistorialPagoNomi.getRowHeight();//HistorialPagoNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.isSelected()) {
					iHeightTable=HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialPagoNomi.isSelected()) {
					iHeightTable=HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialPagoNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialPagoNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialPagoNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialPagoNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialPagoNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialPagoNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialPagoNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialPagoNomi!=null && this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialPagoNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialPagoNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialPagoNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialPagoNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialPagoNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialPagoNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=historialpagonomiLogic.getHistorialPagoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagonomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialPagoNomi> TraerHistorialPagoNomiBeans(List<HistorialPagoNomi> historialpagonomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialPagoNomi historialpagonomi:historialpagonomis) {
					
				if(!(HistorialPagoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialPagoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialpagonomi.setsDetalleGeneralEntityReporte(HistorialPagoNomiConstantesFunciones.getHistorialPagoNomiDescripcion(historialpagonomi));
										
						
					
						
					
				} else  {
							
					//historialpagonomi.setsDetalleGeneralEntityReporte(historialpagonomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialpagonomibeans.add(historialpagonomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialpagonomis;
    }
	//PARA REPORTES FIN
}
