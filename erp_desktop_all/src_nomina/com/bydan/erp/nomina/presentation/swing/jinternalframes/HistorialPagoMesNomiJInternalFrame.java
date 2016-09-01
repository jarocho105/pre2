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
import com.bydan.erp.nomina.util.HistorialPagoMesNomiConstantesFunciones;

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
public class HistorialPagoMesNomiJInternalFrame extends HistorialPagoMesNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarHistorialPagoMesNomi;
	
	protected JMenuBar jmenuBarHistorialPagoMesNomi;
	
	protected JMenu jmenuHistorialPagoMesNomi;
	protected JMenu jmenuDatosHistorialPagoMesNomi;
	protected JMenu jmenuArchivoHistorialPagoMesNomi;
	protected JMenu jmenuAccionesHistorialPagoMesNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialPagoMesNomi;	
	protected GridBagConstraints gridBagConstraintsHistorialPagoMesNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public HistorialPagoMesNomiDetalleFormJInternalFrame jInternalFrameDetalleFormHistorialPagoMesNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoHistorialPagoMesNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionHistorialPagoMesNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<HistorialPagoMesNomi> historialpagomesnomis;		
	public List<HistorialPagoMesNomi> historialpagomesnomisEliminados;	
	public List<HistorialPagoMesNomi> historialpagomesnomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByHistorialPagoMesNomi;		
	protected JButton jButtonAbrirOrderByHistorialPagoMesNomi;
	
	
	//protected JPanel jPanelOrderByHistorialPagoMesNomi;
	//public JScrollPane jScrollPanelOrderByHistorialPagoMesNomi;	
	//protected JButton jButtonCerrarOrderByHistorialPagoMesNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public HistorialPagoMesNomiLogic historialpagomesnomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosHistorialPagoMesNomi;
	public JScrollPane jScrollPanelDatosEdicionHistorialPagoMesNomi;
	public JScrollPane jScrollPanelDatosGeneralHistorialPagoMesNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosHistorialPagoMesNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoHistorialPagoMesNomi;
	//public JScrollPane jScrollPanelImportacionHistorialPagoMesNomi;
	
	
	
	protected JPanel jPanelAccionesHistorialPagoMesNomi;
	
    protected JPanel jPanelPaginacionHistorialPagoMesNomi;
    protected JPanel jPanelParametrosReportesHistorialPagoMesNomi;
	protected JPanel jPanelParametrosReportesAccionesHistorialPagoMesNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1HistorialPagoMesNomi;
	protected JPanel jPanelParametrosAuxiliar2HistorialPagoMesNomi;
	protected JPanel jPanelParametrosAuxiliar3HistorialPagoMesNomi;
	protected JPanel jPanelParametrosAuxiliar4HistorialPagoMesNomi;
	//protected JPanel jPanelParametrosAuxiliar5HistorialPagoMesNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoHistorialPagoMesNomi;
	//protected JPanel jPanelImportacionHistorialPagoMesNomi;
	
	
	public JTable jTableDatosHistorialPagoMesNomi;
	
	
	
	//public JTable jTableDatosHistorialPagoMesNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoHistorialPagoMesNomi;
	protected JButton jButtonDuplicarHistorialPagoMesNomi;
	protected JButton jButtonCopiarHistorialPagoMesNomi;
	protected JButton jButtonVerFormHistorialPagoMesNomi;
	protected JButton jButtonNuevoRelacionesHistorialPagoMesNomi;
	protected JButton jButtonModificarHistorialPagoMesNomi;
	
    protected JButton jButtonGuardarCambiosTablaHistorialPagoMesNomi;
	protected JButton jButtonCerrarHistorialPagoMesNomi;
	
	
	protected JButton jButtonRecargarInformacionHistorialPagoMesNomi;
	protected JButton jButtonProcesarInformacionHistorialPagoMesNomi;
	
	
	protected JButton jButtonAnterioresHistorialPagoMesNomi;
	protected JButton jButtonSiguientesHistorialPagoMesNomi;
	protected JButton jButtonNuevoGuardarCambiosHistorialPagoMesNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoHistorialPagoMesNomi;
	//protected JButton jButtonCerrarReporteDinamicoHistorialPagoMesNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionHistorialPagoMesNomi;
	//protected JButton jButtonGenerarImportacionHistorialPagoMesNomi;
	//protected JButton jButtonCerrarImportacionHistorialPagoMesNomi;
	//protected JFileChooser jFileChooserImportacionHistorialPagoMesNomi;
	//protected File fileImportacionHistorialPagoMesNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialPagoMesNomi;
	protected JButton jButtonDuplicarToolBarHistorialPagoMesNomi;
	protected JButton jButtonNuevoRelacionesToolBarHistorialPagoMesNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarHistorialPagoMesNomi;
	protected JButton jButtonCopiarToolBarHistorialPagoMesNomi;
	protected JButton jButtonVerFormToolBarHistorialPagoMesNomi;
	public JButton jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialPagoMesNomi;
	protected JButton jButtonCerrarToolBarHistorialPagoMesNomi;
	
	protected JButton jButtonRecargarInformacionToolBarHistorialPagoMesNomi;
	protected JButton jButtonProcesarInformacionToolBarHistorialPagoMesNomi;
	protected JButton jButtonAnterioresToolBarHistorialPagoMesNomi;
	protected JButton jButtonSiguientesToolBarHistorialPagoMesNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi;
	protected JButton jButtonAbrirOrderByToolBarHistorialPagoMesNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDuplicarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemNuevoRelacionesHistorialPagoMesNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosHistorialPagoMesNomi;
	protected JMenuItem jMenuItemCopiarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemVerFormHistorialPagoMesNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialPagoMesNomi;
	protected JMenuItem jMenuItemCerrarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDetalleCerrarHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialPagoMesNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionHistorialPagoMesNomi;
	protected JMenuItem jMenuItemProcesarInformacionHistorialPagoMesNomi;
	protected JMenuItem jMenuItemAnterioresHistorialPagoMesNomi;
	protected JMenuItem jMenuItemSiguientesHistorialPagoMesNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi;
	protected JMenuItem jMenuItemAbrirOrderByHistorialPagoMesNomi;
	protected JMenuItem jMenuItemMostrarOcultarHistorialPagoMesNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialPagoMesNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosHistorialPagoMesNomi;
	protected JCheckBox jCheckBoxSeleccionadosHistorialPagoMesNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi;
	protected JCheckBox jCheckBoxConGraficoReporteHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesHistorialPagoMesNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarHistorialPagoMesNomi;
	protected JTextField jTextFieldValorCampoGeneralHistorialPagoMesNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteHistorialPagoMesNomi;
	//public JList<Reporte> jListColumnasSelectReporteHistorialPagoMesNomi;
	//public JScrollPane jScrollColumnasSelectReporteHistorialPagoMesNomi;
	
	//public JLabel jLabelRelacionesSelectReporteHistorialPagoMesNomi;
	//public JList<Reporte> jListRelacionesSelectReporteHistorialPagoMesNomi;
	//public JScrollPane jScrollRelacionesSelectReporteHistorialPagoMesNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoHistorialPagoMesNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoHistorialPagoMesNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi;
	
		
	//public JLabel jLabelArchivoImportacionHistorialPagoMesNomi;	
	//public JLabel jLabelPathArchivoImportacionHistorialPagoMesNomi;
	//protected JTextField jTextFieldPathArchivoImportacionHistorialPagoMesNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoHistorialPagoMesNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi;
	
	//public JLabel jLabelColumnaCategoriaValorHistorialPagoMesNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorHistorialPagoMesNomi;
	
	//public JLabel jLabelColumnasValoresGraficoHistorialPagoMesNomi;
	//public JList<Reporte> jListColumnasValoresGraficoHistorialPagoMesNomi;
	//public JScrollPane jScrollColumnasValoresGraficoHistorialPagoMesNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasHistorialPagoMesNomi;
	public JPanel jPanelFK_IdAnioHistorialPagoMesNomi;
	public JButton jButtonFK_IdAnioHistorialPagoMesNomi;
	public JPanel jPanelFK_IdEmpleadoHistorialPagoMesNomi;
	public JButton jButtonFK_IdEmpleadoHistorialPagoMesNomi;
	public JPanel jPanelFK_IdMesHistorialPagoMesNomi;
	public JButton jButtonFK_IdMesHistorialPagoMesNomi;
	public JPanel jPanelFK_IdRubroEmpleaHistorialPagoMesNomi;
	public JButton jButtonFK_IdRubroEmpleaHistorialPagoMesNomi;
	
	public JPanel jPanelid_anioFK_IdAnioHistorialPagoMesNomi;
	public JLabel jLabelid_anioFK_IdAnioHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi;
	public JButton jButtonid_anioFK_IdAnioHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_anioFK_IdAnioHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi;
	public JLabel jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi;
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesFK_IdMesHistorialPagoMesNomi;
	public JLabel jLabelid_mesFK_IdMesHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFK_IdMesHistorialPagoMesNomi;
	public JButton jButtonid_mesFK_IdMesHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_mesFK_IdMesHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi;
	public JLabel jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi;
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomiUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomiBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public HistorialPagoMesNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialPagoMesNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionHistorialPagoMesNomi)	{
		this.jButtonRecargarInformacionHistorialPagoMesNomi = jButtonRecargarInformacionHistorialPagoMesNomi;
	}
	
	public JButton getjButtonProcesarInformacionHistorialPagoMesNomi() {
		return this.jButtonProcesarInformacionHistorialPagoMesNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialPagoMesNomi)	{
		this.jButtonProcesarInformacionHistorialPagoMesNomi = jButtonProcesarInformacionHistorialPagoMesNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionHistorialPagoMesNomi() {
		return this.jButtonRecargarInformacionHistorialPagoMesNomi;
	}
	
	
	public List<HistorialPagoMesNomi> gethistorialpagomesnomis() {
		return this.historialpagomesnomis;
	}

	public void sethistorialpagomesnomis(List<HistorialPagoMesNomi> historialpagomesnomis) {
		this.historialpagomesnomis = historialpagomesnomis;
	}
	
	public List<HistorialPagoMesNomi> gethistorialpagomesnomisAux() {
		return this.historialpagomesnomisAux;
	}

	public void sethistorialpagomesnomisAux(List<HistorialPagoMesNomi> historialpagomesnomisAux) {
		this.historialpagomesnomisAux = historialpagomesnomisAux;
	}
	
	public List<HistorialPagoMesNomi> gethistorialpagomesnomisEliminados() {
		return this.historialpagomesnomisEliminados;
	}

	public void setHistorialPagoMesNomisEliminados(List<HistorialPagoMesNomi> historialpagomesnomisEliminados) {
		this.historialpagomesnomisEliminados = historialpagomesnomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarHistorialPagoMesNomi() {
		return jComboBoxTiposSeleccionarHistorialPagoMesNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarHistorialPagoMesNomi(
			JComboBox jComboBoxTiposSeleccionarHistorialPagoMesNomi) {
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi = jComboBoxTiposSeleccionarHistorialPagoMesNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralHistorialPagoMesNomi() {
		return jTextFieldValorCampoGeneralHistorialPagoMesNomi;
	}

	public void setjTextFieldValorCampoGeneralHistorialPagoMesNomi(
			JTextField jTextFieldValorCampoGeneralHistorialPagoMesNomi) {
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi = jTextFieldValorCampoGeneralHistorialPagoMesNomi;
	}

	public void setBorderResaltarValorCampoGeneralHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosHistorialPagoMesNomi() {
		return this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi;
	}

	public void setjCheckBoxSeleccionarTodosHistorialPagoMesNomi(
			JCheckBox jCheckBoxSeleccionarTodosHistorialPagoMesNomi) {
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi = jCheckBoxSeleccionarTodosHistorialPagoMesNomi;
	}

	public void setBorderResaltarSeleccionarTodosHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosHistorialPagoMesNomi() {
		return this.jCheckBoxSeleccionadosHistorialPagoMesNomi;
	}

	public void setjCheckBoxSeleccionadosHistorialPagoMesNomi(
			JCheckBox jCheckBoxSeleccionadosHistorialPagoMesNomi) {
		this.jCheckBoxSeleccionadosHistorialPagoMesNomi = jCheckBoxSeleccionadosHistorialPagoMesNomi;
	}
	
	public void setBorderResaltarSeleccionadosHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesHistorialPagoMesNomi() {
		return this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposArchivosReportesHistorialPagoMesNomi) {
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi = jComboBoxTiposArchivosReportesHistorialPagoMesNomi;
	}

	public void setBorderResaltarTiposArchivosReportesHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesHistorialPagoMesNomi() {
		return this.jComboBoxTiposReportesHistorialPagoMesNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposReportesHistorialPagoMesNomi) {
		this.jComboBoxTiposReportesHistorialPagoMesNomi = jComboBoxTiposReportesHistorialPagoMesNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoHistorialPagoMesNomi() {
	//	return jComboBoxTiposReportesDinamicoHistorialPagoMesNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoHistorialPagoMesNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoHistorialPagoMesNomi) {
	//	this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi = jComboBoxTiposReportesDinamicoHistorialPagoMesNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi = jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi;
	//}
	
	public void setBorderResaltarTiposReportesHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesHistorialPagoMesNomi() {
		return this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposGraficosReportesHistorialPagoMesNomi) {
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi = jComboBoxTiposGraficosReportesHistorialPagoMesNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionHistorialPagoMesNomi() {
		return this.jComboBoxTiposPaginacionHistorialPagoMesNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionHistorialPagoMesNomi(
			JComboBox jComboBoxTiposPaginacionHistorialPagoMesNomi) {
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi = jComboBoxTiposPaginacionHistorialPagoMesNomi;
	}
	
	public void setBorderResaltarTiposPaginacionHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesHistorialPagoMesNomi() {
		return this.jComboBoxTiposRelacionesHistorialPagoMesNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialPagoMesNomi() {
		return this.jComboBoxTiposAccionesHistorialPagoMesNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposRelacionesHistorialPagoMesNomi) {
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi = jComboBoxTiposRelacionesHistorialPagoMesNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialPagoMesNomi(
			JComboBox jComboBoxTiposAccionesHistorialPagoMesNomi) {
		this.jComboBoxTiposAccionesHistorialPagoMesNomi = jComboBoxTiposAccionesHistorialPagoMesNomi;
	}
	
	public void setBorderResaltarTiposRelacionesHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesHistorialPagoMesNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesHistorialPagoMesNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoHistorialPagoMesNomi() {
	//	return jCheckBoxConGraficoDinamicoHistorialPagoMesNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoHistorialPagoMesNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoHistorialPagoMesNomi) {
	//	this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi = jCheckBoxConGraficoDinamicoHistorialPagoMesNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoHistorialPagoMesNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarHistorialPagoMesNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi .setBorder(borderResaltar);		
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
		this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		
		this.historialpagomesnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialpagomesnomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialPagoMesNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Pago Mes Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
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
		
		HistorialPagoMesNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("HistorialPagoMesNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarHistorialPagoMesNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"nuevo","nuevo","Nuevo"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"duplicar","duplicar","Duplicar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"copiar","copiar","Copiar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"ver_form","ver_form","Ver"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"recargar","recargar","Recargar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarHistorialPagoMesNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,
							"cerrar","cerrar","Salir"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarHistorialPagoMesNomi;
			
				this.jButtonProcesarInformacionToolBarHistorialPagoMesNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarHistorialPagoMesNomi;
				
		//protected JButton jButtonModificarToolBarHistorialPagoMesNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarHistorialPagoMesNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuHistorialPagoMesNomi=new JMenuMe("General");
		this.jmenuArchivoHistorialPagoMesNomi=new JMenuMe("Archivo");
		this.jmenuAccionesHistorialPagoMesNomi=new JMenuMe("Acciones");
		this.jmenuDatosHistorialPagoMesNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialPagoMesNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialPagoMesNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialPagoMesNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarHistorialPagoMesNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarHistorialPagoMesNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarHistorialPagoMesNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesHistorialPagoMesNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesHistorialPagoMesNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesHistorialPagoMesNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialPagoMesNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarHistorialPagoMesNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarHistorialPagoMesNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarHistorialPagoMesNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormHistorialPagoMesNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormHistorialPagoMesNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormHistorialPagoMesNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialPagoMesNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialPagoMesNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialPagoMesNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionHistorialPagoMesNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionHistorialPagoMesNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionHistorialPagoMesNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionHistorialPagoMesNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionHistorialPagoMesNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionHistorialPagoMesNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresHistorialPagoMesNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresHistorialPagoMesNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresHistorialPagoMesNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesHistorialPagoMesNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesHistorialPagoMesNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesHistorialPagoMesNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByHistorialPagoMesNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByHistorialPagoMesNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByHistorialPagoMesNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialPagoMesNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialPagoMesNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialPagoMesNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoHistorialPagoMesNomi.add(this.jMenuItemCerrarHistorialPagoMesNomi);
			
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemNuevoHistorialPagoMesNomi);
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi);
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemNuevoRelacionesHistorialPagoMesNomi);
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi);		
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemDuplicarHistorialPagoMesNomi);		
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemCopiarHistorialPagoMesNomi);		
			this.jmenuAccionesHistorialPagoMesNomi.add(this.jMenuItemVerFormHistorialPagoMesNomi);		
			
			this.jmenuDatosHistorialPagoMesNomi.add(this.jMenuItemRecargarInformacionHistorialPagoMesNomi);				
			this.jmenuDatosHistorialPagoMesNomi.add(this.jMenuItemAnterioresHistorialPagoMesNomi);				
			this.jmenuDatosHistorialPagoMesNomi.add(this.jMenuItemSiguientesHistorialPagoMesNomi);				
			this.jmenuDatosHistorialPagoMesNomi.add(this.jMenuItemAbrirOrderByHistorialPagoMesNomi);				
			this.jmenuDatosHistorialPagoMesNomi.add(this.jMenuItemMostrarOcultarHistorialPagoMesNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesHistorialPagoMesNomi.add(this.jMenuItemGuardarCambiosHistorialPagoMesNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarHistorialPagoMesNomi.add(this.jmenuArchivoHistorialPagoMesNomi);		
			this.jmenuBarHistorialPagoMesNomi.add(this.jmenuAccionesHistorialPagoMesNomi);		
			this.jmenuBarHistorialPagoMesNomi.add(this.jmenuDatosHistorialPagoMesNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarHistorialPagoMesNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasHistorialPagoMesNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAnioHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAnioHistorialPagoMesNomi.setToolTipText("Buscar Por Anio ");
		this.jButtonFK_IdAnioHistorialPagoMesNomi= new JButtonMe();
		this.jButtonFK_IdAnioHistorialPagoMesNomi.setText("Buscar");
		this.jButtonFK_IdAnioHistorialPagoMesNomi.setToolTipText("Buscar Por Anio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAnioHistorialPagoMesNomi,"buscar_button","Buscar Por Anio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAnioHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi = new JLabelMe();
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi.setText("Anio :");
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi.setToolTipText("Anio");
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioFK_IdAnioHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioFK_IdAnioHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoHistorialPagoMesNomi.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoHistorialPagoMesNomi= new JButtonMe();
		this.jButtonFK_IdEmpleadoHistorialPagoMesNomi.setText("Buscar");
		this.jButtonFK_IdEmpleadoHistorialPagoMesNomi.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoHistorialPagoMesNomi,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesHistorialPagoMesNomi.setToolTipText("Buscar Por Mes ");
		this.jButtonFK_IdMesHistorialPagoMesNomi= new JButtonMe();
		this.jButtonFK_IdMesHistorialPagoMesNomi.setText("Buscar");
		this.jButtonFK_IdMesHistorialPagoMesNomi.setToolTipText("Buscar Por Mes ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesHistorialPagoMesNomi,"buscar_button","Buscar Por Mes ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesFK_IdMesHistorialPagoMesNomi = new JLabelMe();
		jLabelid_mesFK_IdMesHistorialPagoMesNomi.setText("Mes :");
		jLabelid_mesFK_IdMesHistorialPagoMesNomi.setToolTipText("Mes");
		jLabelid_mesFK_IdMesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesFK_IdMesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesFK_IdMesHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesFK_IdMesHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFK_IdMesHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi.setToolTipText("Buscar Por Rubro Emplea ");
		this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi= new JButtonMe();
		this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi.setText("Buscar");
		this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi.setToolTipText("Buscar Por Rubro Emplea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi,"buscar_button","Buscar Por Rubro Emplea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi = new JLabelMe();
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setText("Rubro Emplea :");
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setToolTipText("Rubro Emplea");
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi= new JComboBoxMe();
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasHistorialPagoMesNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasHistorialPagoMesNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialPagoMesNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasHistorialPagoMesNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasHistorialPagoMesNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleHistorialPagoMesNomi = new HistorialPagoMesNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Historial Pago Mes Nomi DATOS");
			this.jInternalFrameDetalleFormHistorialPagoMesNomi = new HistorialPagoMesNomiDetalleFormJInternalFrame(jDesktopPane,this.historialpagomesnomiSessionBean.getConGuardarRelaciones(),this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi = null;//new HistorialPagoMesNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialPagoMesNomi= new GridBagLayout();
		
		
		this.jTableDatosHistorialPagoMesNomi = new JTableMe();      
		
		String sToolTipHistorialPagoMesNomi="";
		sToolTipHistorialPagoMesNomi=HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialPagoMesNomi+="(Nomina.HistorialPagoMesNomi)";
		}
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialPagoMesNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosHistorialPagoMesNomi.setToolTipText(sToolTipHistorialPagoMesNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosHistorialPagoMesNomi);
		this.jTableDatosHistorialPagoMesNomi.setAutoCreateRowSorter(true);
		this.jTableDatosHistorialPagoMesNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosHistorialPagoMesNomi.setRowSelectionAllowed(true);
		this.jTableDatosHistorialPagoMesNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosHistorialPagoMesNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoHistorialPagoMesNomi = new JButtonMe();
		this.jButtonDuplicarHistorialPagoMesNomi = new JButtonMe();
		this.jButtonCopiarHistorialPagoMesNomi = new JButtonMe();
		this.jButtonVerFormHistorialPagoMesNomi = new JButtonMe();
		this.jButtonNuevoRelacionesHistorialPagoMesNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi = new JButtonMe();
		this.jButtonCerrarHistorialPagoMesNomi = new JButtonMe();
		
		this.jScrollPanelDatosHistorialPagoMesNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralHistorialPagoMesNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Pago Mes Nomi";
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialPagoMesNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialPagoMesNomi.setToolTipText("Acciones");
        this.jPanelAccionesHistorialPagoMesNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoHistorialPagoMesNomi=new ReporteDinamicoJInternalFrame(HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoHistorialPagoMesNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionHistorialPagoMesNomi=new ImportacionJInternalFrame(HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionHistorialPagoMesNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByHistorialPagoMesNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByHistorialPagoMesNomi.setText("Orden");
		this.jButtonAbrirOrderByHistorialPagoMesNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialPagoMesNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialPagoMesNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoMesNomi,false,this);
			
			//this.cargarOrderByHistorialPagoMesNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByHistorialPagoMesNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoMesNomi,true,this);
			
			//this.cargarOrderByHistorialPagoMesNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosHistorialPagoMesNomi.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosHistorialPagoMesNomi.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosHistorialPagoMesNomi.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosHistorialPagoMesNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialPagoMesNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosHistorialPagoMesNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoHistorialPagoMesNomi.setText("Nuevo");
		this.jButtonDuplicarHistorialPagoMesNomi.setText("Duplicar");
		this.jButtonCopiarHistorialPagoMesNomi.setText("Copiar");
		this.jButtonVerFormHistorialPagoMesNomi.setText("Ver");
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setText("Guardar");
		this.jButtonCerrarHistorialPagoMesNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialPagoMesNomi,"nuevo_button","Nuevo",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarHistorialPagoMesNomi,"duplicar_button","Duplicar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarHistorialPagoMesNomi,"copiar_button","Copiar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormHistorialPagoMesNomi,"ver_form","Ver",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesHistorialPagoMesNomi,"nuevorelaciones_button","Nuevo Rel",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialPagoMesNomi,"guardarcambiostabla_button","Guardar",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialPagoMesNomi,"cerrar_button","Salir",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoHistorialPagoMesNomi.setToolTipText("Nuevo"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarHistorialPagoMesNomi.setToolTipText("Duplicar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarHistorialPagoMesNomi.setToolTipText("Copiar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormHistorialPagoMesNomi.setToolTipText("Ver"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.setToolTipText("Nuevo Rel"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setToolTipText("Guardar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialPagoMesNomi.setToolTipText("Salir"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialPagoMesNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialPagoMesNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarHistorialPagoMesNomi";
		inputMap = this.jButtonDuplicarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarHistorialPagoMesNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarHistorialPagoMesNomi"));
		
		//COPIAR
		sMapKey = "CopiarHistorialPagoMesNomi";
		inputMap = this.jButtonCopiarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarHistorialPagoMesNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarHistorialPagoMesNomi"));
		
		//VEr FORM
		sMapKey = "VerFormHistorialPagoMesNomi";
		inputMap = this.jButtonVerFormHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormHistorialPagoMesNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormHistorialPagoMesNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoRelacionesHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesHistorialPagoMesNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarHistorialPagoMesNomi";
		inputMap = this.jButtonModificarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarHistorialPagoMesNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarHistorialPagoMesNomi";
		inputMap = this.jButtonCerrarHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialPagoMesNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialPagoMesNomi";
		inputMap = this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialPagoMesNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1HistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2HistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3HistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4HistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5HistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesHistorialPagoMesNomi.setName("jPanelParametrosReportesHistorialPagoMesNomi"); 
		
		this.jPanelParametrosReportesAccionesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesHistorialPagoMesNomi.setName("jPanelParametrosReportesAccionesHistorialPagoMesNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionHistorialPagoMesNomi = new JButtonMe();
		this.jButtonRecargarInformacionHistorialPagoMesNomi.setText("Recargar");
		this.jButtonRecargarInformacionHistorialPagoMesNomi.setToolTipText("Recargar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionHistorialPagoMesNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionHistorialPagoMesNomi = new JButtonMe();
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setText("Procesar");
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setToolTipText("Procesar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setVisible(false);
			
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionHistorialPagoMesNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setText("TIPO");       
		this.jComboBoxTiposReportesHistorialPagoMesNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesHistorialPagoMesNomi.setText("Accion");
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setText("Accion");
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesHistorialPagoMesNomi = new JLabelMe();
		
		this.jLabelAccionesHistorialPagoMesNomi.setText("Acciones");		
		this.jLabelAccionesHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosHistorialPagoMesNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresHistorialPagoMesNomi = new JButtonMe();
		//this.jButtonAnterioresHistorialPagoMesNomi.setText("<<");
        this.jButtonAnterioresHistorialPagoMesNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresHistorialPagoMesNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesHistorialPagoMesNomi = new JButtonMe();
		//this.jButtonSiguientesHistorialPagoMesNomi.setText(">>");
        this.jButtonSiguientesHistorialPagoMesNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesHistorialPagoMesNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi,"nuevoguardarcambios_button","Nue",this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosHistorialPagoMesNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionHistorialPagoMesNomi";
		inputMap = this.jButtonRecargarInformacionHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionHistorialPagoMesNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesHistorialPagoMesNomi";
		inputMap = this.jButtonSiguientesHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesHistorialPagoMesNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresHistorialPagoMesNomi";
		inputMap = this.jButtonAnterioresHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresHistorialPagoMesNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasHistorialPagoMesNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesHistorialPagoMesNomi.setMinimumSize(new Dimension(this.getWidth(),HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialPagoMesNomi.setMaximumSize(new Dimension(this.getWidth(),HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesHistorialPagoMesNomi.setPreferredSize(new Dimension(this.getWidth(),HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(HistorialPagoMesNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionHistorialPagoMesNomi = new GridBagLayout();

			this.jPanelPaginacionHistorialPagoMesNomi.setLayout(gridaBagLayoutPaginacionHistorialPagoMesNomi);						
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonAnterioresHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					
						
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
			
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
						
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonSiguientesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonNuevoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
						
			
			
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
				this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonGuardarCambiosTablaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			}
			
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonDuplicarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonCopiarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonVerFormHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionHistorialPagoMesNomi.add(this.jButtonCerrarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		
		this.jButtonRecargarInformacionHistorialPagoMesNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialPagoMesNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionHistorialPagoMesNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesHistorialPagoMesNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialPagoMesNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesHistorialPagoMesNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesHistorialPagoMesNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesHistorialPagoMesNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1HistorialPagoMesNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2HistorialPagoMesNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3HistorialPagoMesNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4HistorialPagoMesNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.setLayout(gridaBagParametrosReportesHistorialPagoMesNomi);
			this.jPanelParametrosReportesAccionesHistorialPagoMesNomi.setLayout(gridaBagParametrosReportesAccionesHistorialPagoMesNomi);
			
			
			this.jPanelParametrosAuxiliar1HistorialPagoMesNomi.setLayout(gridaBagParametrosAuxiliar1HistorialPagoMesNomi);
			this.jPanelParametrosAuxiliar2HistorialPagoMesNomi.setLayout(gridaBagParametrosAuxiliar2HistorialPagoMesNomi);
			this.jPanelParametrosAuxiliar3HistorialPagoMesNomi.setLayout(gridaBagParametrosAuxiliar3HistorialPagoMesNomi);
			this.jPanelParametrosAuxiliar4HistorialPagoMesNomi.setLayout(gridaBagParametrosAuxiliar4HistorialPagoMesNomi);
			//this.jPanelParametrosAuxiliar5HistorialPagoMesNomi.setLayout(gridaBagParametrosAuxiliar2HistorialPagoMesNomi);			
			
			
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jButtonRecargarInformacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoMesNomi.add(this.jComboBoxTiposPaginacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoMesNomi.add(this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1HistorialPagoMesNomi.add(this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jPanelParametrosAuxiliar1HistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4HistorialPagoMesNomi.add(this.jComboBoxTiposReportesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);																		
			
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4HistorialPagoMesNomi.add(this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jPanelParametrosAuxiliar4HistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jComboBoxTiposReportesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jCheckBoxGenerarReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jPanelParametrosAuxiliar2HistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jLabelAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
				this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jButtonAbrirOrderByHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jComboBoxTiposSeleccionarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			
			
			/*
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jCheckBoxConGraficoReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoMesNomi.add(this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);															
				
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoMesNomi.add(this.jCheckBoxSeleccionadosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);															
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3HistorialPagoMesNomi.add(this.jCheckBoxConGraficoReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jPanelParametrosAuxiliar3HistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jComboBoxTiposAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
	
				
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesHistorialPagoMesNomi.add(this.jTextFieldValorCampoGeneralHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosHistorialPagoMesNomi = new GridBagLayout();

			this.jScrollPanelDatosHistorialPagoMesNomi.setLayout(gridaBagLayoutDatosHistorialPagoMesNomi);
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
			
			this.jScrollPanelDatosHistorialPagoMesNomi.add(this.jTableDatosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosHistorialPagoMesNomi.setViewportView(this.jTableDatosHistorialPagoMesNomi);
		this.jTableDatosHistorialPagoMesNomi.setFillsViewportHeight(true);
		this.jTableDatosHistorialPagoMesNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesHistorialPagoMesNomi= new GridBagLayout();
		this.jPanelAccionesHistorialPagoMesNomi.setLayout(gridaBagLayoutAccionesHistorialPagoMesNomi);
		
		
		/*	
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
			
		this.jPanelAccionesHistorialPagoMesNomi.add(this.jButtonNuevoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAnioHistorialPagoMesNomi= new GridBagLayout();
		gridaBagLayoutFK_IdAnioHistorialPagoMesNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAnioHistorialPagoMesNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAnioHistorialPagoMesNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAnioHistorialPagoMesNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAnioHistorialPagoMesNomi.setLayout(gridaBagLayoutFK_IdAnioHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		jPanelFK_IdAnioHistorialPagoMesNomi.add(jLabelid_anioFK_IdAnioHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
		jPanelFK_IdAnioHistorialPagoMesNomi.add(jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
		gridBagConstraintsHistorialPagoMesNomi.gridx =1;
		jPanelFK_IdAnioHistorialPagoMesNomi.add(jButtonFK_IdAnioHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		jTabbedPaneBusquedasHistorialPagoMesNomi.addTab("1.-Por Anio ", jPanelFK_IdAnioHistorialPagoMesNomi);
		jTabbedPaneBusquedasHistorialPagoMesNomi.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoHistorialPagoMesNomi.setLayout(gridaBagLayoutFK_IdEmpleadoHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		jPanelFK_IdEmpleadoHistorialPagoMesNomi.add(jLabelid_empleadoFK_IdEmpleadoHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
		jPanelFK_IdEmpleadoHistorialPagoMesNomi.add(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
		gridBagConstraintsHistorialPagoMesNomi.gridx =1;
		jPanelFK_IdEmpleadoHistorialPagoMesNomi.add(jButtonFK_IdEmpleadoHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		jTabbedPaneBusquedasHistorialPagoMesNomi.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoHistorialPagoMesNomi);
		jTabbedPaneBusquedasHistorialPagoMesNomi.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdMesHistorialPagoMesNomi= new GridBagLayout();
		gridaBagLayoutFK_IdMesHistorialPagoMesNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesHistorialPagoMesNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesHistorialPagoMesNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesHistorialPagoMesNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesHistorialPagoMesNomi.setLayout(gridaBagLayoutFK_IdMesHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		jPanelFK_IdMesHistorialPagoMesNomi.add(jLabelid_mesFK_IdMesHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
		jPanelFK_IdMesHistorialPagoMesNomi.add(jComboBoxid_mesFK_IdMesHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
		gridBagConstraintsHistorialPagoMesNomi.gridx =1;
		jPanelFK_IdMesHistorialPagoMesNomi.add(jButtonFK_IdMesHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		jTabbedPaneBusquedasHistorialPagoMesNomi.addTab("3.-Por Mes ", jPanelFK_IdMesHistorialPagoMesNomi);
		jTabbedPaneBusquedasHistorialPagoMesNomi.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi= new GridBagLayout();
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRubroEmpleaHistorialPagoMesNomi.setLayout(gridaBagLayoutFK_IdRubroEmpleaHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		jPanelFK_IdRubroEmpleaHistorialPagoMesNomi.add(jLabelid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 0;
		gridBagConstraintsHistorialPagoMesNomi.gridx = 1;
		jPanelFK_IdRubroEmpleaHistorialPagoMesNomi.add(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsHistorialPagoMesNomi.gridy = 1;
		gridBagConstraintsHistorialPagoMesNomi.gridx =1;
		jPanelFK_IdRubroEmpleaHistorialPagoMesNomi.add(jButtonFK_IdRubroEmpleaHistorialPagoMesNomi, gridBagConstraintsHistorialPagoMesNomi);

		jTabbedPaneBusquedasHistorialPagoMesNomi.addTab("4.-Por Rubro Emplea ", jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);
		jTabbedPaneBusquedasHistorialPagoMesNomi.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialPagoMesNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialPagoMesNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();						
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;		
			//this.gridBagConstraintsHistorialPagoMesNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;		
		//this.gridBagConstraintsHistorialPagoMesNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsHistorialPagoMesNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;		
			this.gridBagConstraintsHistorialPagoMesNomi.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsHistorialPagoMesNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);								
		
		
		/*
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		*/		
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =0;
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialPagoMesNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
				
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosHistorialPagoMesNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialPagoMesNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosHistorialPagoMesNomi.setLayout(gridaBagLayoutBusquedasParametrosHistorialPagoMesNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
			
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralHistorialPagoMesNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoHistorialPagoMesNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoHistorialPagoMesNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setName("jPanelReporteDinamicoHistorialPagoMesNomi"); 
		
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoHistorialPagoMesNomi.setLayout(gridaBagLayoutReporteDinamicoHistorialPagoMesNomi);
		
		
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialPagoMesNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteHistorialPagoMesNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteHistorialPagoMesNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelColumnasSelectReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteHistorialPagoMesNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteHistorialPagoMesNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteHistorialPagoMesNomi=new JScrollPane(this.jListColumnasSelectReporteHistorialPagoMesNomi);
			
			this.jScrollColumnasSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jListColumnasSelectReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jScrollColumnasSelectReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteHistorialPagoMesNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteHistorialPagoMesNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteHistorialPagoMesNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteHistorialPagoMesNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteHistorialPagoMesNomi=new JScrollPane(this.jListRelacionesSelectReporteHistorialPagoMesNomi);
			
			this.jScrollRelacionesSelectReporteHistorialPagoMesNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialPagoMesNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteHistorialPagoMesNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoHistorialPagoMesNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoHistorialPagoMesNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelConGraficoDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jCheckBoxConGraficoDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelColumnaCategoriaGraficoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorHistorialPagoMesNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorHistorialPagoMesNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelColumnaCategoriaValorHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jComboBoxColumnaCategoriaValorHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoHistorialPagoMesNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelColumnasValoresGraficoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoHistorialPagoMesNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoHistorialPagoMesNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoHistorialPagoMesNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoHistorialPagoMesNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialPagoMesNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoHistorialPagoMesNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoHistorialPagoMesNomi=new JScrollPane(this.jListColumnasValoresGraficoHistorialPagoMesNomi);
			
			this.jScrollColumnasValoresGraficoHistorialPagoMesNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialPagoMesNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoHistorialPagoMesNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jListColumnasSelectReporteHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jScrollColumnasValoresGraficoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelTiposGraficosReportesDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoHistorialPagoMesNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jComboBoxTiposGraficosReportesDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelGenerarExcelReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi.setToolTipText("Generar EXCEL"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		//this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jComboBoxTiposReportesDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jLabelTiposArchivoReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jComboBoxTiposArchivosReportesDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi.setToolTipText("Generar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi.setToolTipText("Cancelar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoHistorialPagoMesNomi.add(this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalHistorialPagoMesNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi= new JScrollPane(jPanelReporteDinamicoHistorialPagoMesNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalHistorialPagoMesNomi);
		this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getContentPane().add(this.jScrollPanelReporteDinamicoHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionHistorialPagoMesNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionHistorialPagoMesNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionHistorialPagoMesNomi.setName("jPanelImportacionHistorialPagoMesNomi"); 
		
		this.jPanelImportacionHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionHistorialPagoMesNomi.setLayout(gridaBagLayoutImportacionHistorialPagoMesNomi);
		
		
		this.jInternalFrameImportacionHistorialPagoMesNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionHistorialPagoMesNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionHistorialPagoMesNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteHistorialPagoMesNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionHistorialPagoMesNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialPagoMesNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialPagoMesNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setResizable(true);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setClosable(true);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionHistorialPagoMesNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionHistorialPagoMesNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionHistorialPagoMesNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setResizable(true);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setClosable(true);
	    this.jInternalFrameImportacionHistorialPagoMesNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionHistorialPagoMesNomi = new JLabelMe();

		this.jLabelArchivoImportacionHistorialPagoMesNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jLabelArchivoImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionHistorialPagoMesNomi = new JFileChooser();		
		this.jFileChooserImportacionHistorialPagoMesNomi.setToolTipText("ESCOGER ARCHIVO"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionHistorialPagoMesNomi = new JButtonMe();
		this.jButtonAbrirImportacionHistorialPagoMesNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionHistorialPagoMesNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionHistorialPagoMesNomi.setToolTipText("Generar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jButtonAbrirImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionHistorialPagoMesNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionHistorialPagoMesNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionHistorialPagoMesNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialPagoMesNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionHistorialPagoMesNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jLabelPathArchivoImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionHistorialPagoMesNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionHistorialPagoMesNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialPagoMesNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionHistorialPagoMesNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jTextFieldPathArchivoImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionHistorialPagoMesNomi = new JButtonMe();
		this.jButtonGenerarImportacionHistorialPagoMesNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionHistorialPagoMesNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionHistorialPagoMesNomi.setToolTipText("Generar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jButtonGenerarImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionHistorialPagoMesNomi = new JButtonMe();
		this.jButtonCerrarImportacionHistorialPagoMesNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionHistorialPagoMesNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionHistorialPagoMesNomi.setToolTipText("Cancelar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionHistorialPagoMesNomi.add(this.jButtonCerrarImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalHistorialPagoMesNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionHistorialPagoMesNomi= new JScrollPane(jPanelImportacionHistorialPagoMesNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
		this.gridBagConstraintsHistorialPagoMesNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionHistorialPagoMesNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionHistorialPagoMesNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalHistorialPagoMesNomi);
		this.jInternalFrameImportacionHistorialPagoMesNomi.getContentPane().add(this.jScrollPanelImportacionHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByHistorialPagoMesNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByHistorialPagoMesNomi = new JButtonMe();
			this.jButtonAbrirOrderByHistorialPagoMesNomi.setText("Orden");
			this.jButtonAbrirOrderByHistorialPagoMesNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByHistorialPagoMesNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByHistorialPagoMesNomi";
			inputMap = this.jButtonAbrirOrderByHistorialPagoMesNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByHistorialPagoMesNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByHistorialPagoMesNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByHistorialPagoMesNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByHistorialPagoMesNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByHistorialPagoMesNomi.setName("jPanelOrderByHistorialPagoMesNomi"); 
			
			this.jPanelOrderByHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByHistorialPagoMesNomi.setLayout(gridaBagLayoutOrderByHistorialPagoMesNomi);
			
			
			this.jTableDatosHistorialPagoMesNomiOrderBy = new JTableMe();        
			this.jTableDatosHistorialPagoMesNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosHistorialPagoMesNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosHistorialPagoMesNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosHistorialPagoMesNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosHistorialPagoMesNomiOrderBy.setViewportView(this.jTableDatosHistorialPagoMesNomiOrderBy);
			this.jTableDatosHistorialPagoMesNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosHistorialPagoMesNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByHistorialPagoMesNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByHistorialPagoMesNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByHistorialPagoMesNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteHistorialPagoMesNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByHistorialPagoMesNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByHistorialPagoMesNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByHistorialPagoMesNomi.setTitle("Orden");
			this.jInternalFrameOrderByHistorialPagoMesNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByHistorialPagoMesNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByHistorialPagoMesNomi.setResizable(true);
			this.jInternalFrameOrderByHistorialPagoMesNomi.setClosable(true);
			this.jInternalFrameOrderByHistorialPagoMesNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByHistorialPagoMesNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Pago Mes Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsHistorialPagoMesNomi.ipady =150;
				
			this.jPanelOrderByHistorialPagoMesNomi.add(jScrollPanelDatosHistorialPagoMesNomiOrderBy, this.gridBagConstraintsHistorialPagoMesNomi);//this.jTableDatosHistorialPagoMesNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByHistorialPagoMesNomi = new JButtonMe();
			this.jButtonCerrarOrderByHistorialPagoMesNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByHistorialPagoMesNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByHistorialPagoMesNomi.setToolTipText("Cancelar"+" "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByHistorialPagoMesNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialPagoMesNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByHistorialPagoMesNomi.add(this.jButtonCerrarOrderByHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalHistorialPagoMesNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByHistorialPagoMesNomi= new JScrollPane(jPanelOrderByHistorialPagoMesNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsHistorialPagoMesNomi = new GridBagConstraints();
			this.gridBagConstraintsHistorialPagoMesNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsHistorialPagoMesNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsHistorialPagoMesNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByHistorialPagoMesNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByHistorialPagoMesNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalHistorialPagoMesNomi);
			
			this.jInternalFrameOrderByHistorialPagoMesNomi.getContentPane().add(this.jScrollPanelOrderByHistorialPagoMesNomi, this.gridBagConstraintsHistorialPagoMesNomi);			
		
		} else {
			this.jButtonAbrirOrderByHistorialPagoMesNomi = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.historialpagomesnomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosHistorialPagoMesNomi.getRowHeight();//HistorialPagoMesNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.isSelected()) {
					iHeightTable=HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaHistorialPagoMesNomi.isSelected()) {
					iHeightTable=HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=HistorialPagoMesNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByHistorialPagoMesNomi!=null && this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByHistorialPagoMesNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosHistorialPagoMesNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialPagoMesNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosHistorialPagoMesNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=historialpagomesnomiLogic.getHistorialPagoMesNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagomesnomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<HistorialPagoMesNomi> TraerHistorialPagoMesNomiBeans(List<HistorialPagoMesNomi> historialpagomesnomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomis) {
					
				if(!(HistorialPagoMesNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || HistorialPagoMesNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					historialpagomesnomi.setsDetalleGeneralEntityReporte(HistorialPagoMesNomiConstantesFunciones.getHistorialPagoMesNomiDescripcion(historialpagomesnomi));
										
						
					
						
					
				} else  {
							
					//historialpagomesnomi.setsDetalleGeneralEntityReporte(historialpagomesnomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//historialpagomesnomibeans.add(historialpagomesnomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return historialpagomesnomis;
    }
	//PARA REPORTES FIN
}
