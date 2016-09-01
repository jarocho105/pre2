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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.DiarioGeneralConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class DiarioGeneralJInternalFrame extends DiarioGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDiarioGeneral;
	
	protected JMenuBar jmenuBarDiarioGeneral;
	
	protected JMenu jmenuDiarioGeneral;
	protected JMenu jmenuDatosDiarioGeneral;
	protected JMenu jmenuArchivoDiarioGeneral;
	protected JMenu jmenuAccionesDiarioGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiarioGeneral;	
	protected GridBagConstraints gridBagConstraintsDiarioGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DiarioGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormDiarioGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDiarioGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDiarioGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public DiarioGeneralSessionBean diariogeneralSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DiarioGeneral> diariogenerals;		
	public List<DiarioGeneral> diariogeneralsEliminados;	
	public List<DiarioGeneral> diariogeneralsAux;
	
	protected TotalesJInternalFrame jInternalFrameTotalesDiarioGeneral;		
	protected JButton jButtonAbrirTotalesDiarioGeneral;		
	
	/*
	protected JPanel jPanelTotalesDiarioGeneral;
	public JScrollPane jScrollPanelTotalesDiarioGeneral;	
	protected JButton jButtonCerrarTotalesDiarioGeneral;
	*/
	
	public List<DiarioGeneral> diariogeneralsTotal= new ArrayList<DiarioGeneral>();
	public ArrayList<DatoGeneral> arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDiarioGeneral;		
	protected JButton jButtonAbrirOrderByDiarioGeneral;
	
	
	//protected JPanel jPanelOrderByDiarioGeneral;
	//public JScrollPane jScrollPanelOrderByDiarioGeneral;	
	//protected JButton jButtonCerrarOrderByDiarioGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DiarioGeneralLogic diariogeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDiarioGeneral;
	public JScrollPane jScrollPanelDatosEdicionDiarioGeneral;
	public JScrollPane jScrollPanelDatosGeneralDiarioGeneral;
    //public JScrollPane jScrollPanelDatosDiarioGeneralTotales;
	
	
	//public JScrollPane jScrollPanelDatosDiarioGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDiarioGeneral;
	//public JScrollPane jScrollPanelImportacionDiarioGeneral;
	
	
	
	protected JPanel jPanelAccionesDiarioGeneral;
	
    protected JPanel jPanelPaginacionDiarioGeneral;
    protected JPanel jPanelParametrosReportesDiarioGeneral;
	protected JPanel jPanelParametrosReportesAccionesDiarioGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DiarioGeneral;
	protected JPanel jPanelParametrosAuxiliar2DiarioGeneral;
	protected JPanel jPanelParametrosAuxiliar3DiarioGeneral;
	protected JPanel jPanelParametrosAuxiliar4DiarioGeneral;
	//protected JPanel jPanelParametrosAuxiliar5DiarioGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoDiarioGeneral;
	//protected JPanel jPanelImportacionDiarioGeneral;
	
	
	public JTable jTableDatosDiarioGeneral;
	//public JTable jTableDatosDiarioGeneralTotales;
	
	
	//public JTable jTableDatosDiarioGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDiarioGeneral;
	protected JButton jButtonDuplicarDiarioGeneral;
	protected JButton jButtonCopiarDiarioGeneral;
	protected JButton jButtonVerFormDiarioGeneral;
	protected JButton jButtonNuevoRelacionesDiarioGeneral;
	protected JButton jButtonModificarDiarioGeneral;
	
    protected JButton jButtonGuardarCambiosTablaDiarioGeneral;
	protected JButton jButtonCerrarDiarioGeneral;
	
	
	protected JButton jButtonRecargarInformacionDiarioGeneral;
	protected JButton jButtonProcesarInformacionDiarioGeneral;
	
	
	protected JButton jButtonAnterioresDiarioGeneral;
	protected JButton jButtonSiguientesDiarioGeneral;
	protected JButton jButtonNuevoGuardarCambiosDiarioGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDiarioGeneral;
	//protected JButton jButtonCerrarReporteDinamicoDiarioGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoDiarioGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionDiarioGeneral;
	//protected JButton jButtonGenerarImportacionDiarioGeneral;
	//protected JButton jButtonCerrarImportacionDiarioGeneral;
	//protected JFileChooser jFileChooserImportacionDiarioGeneral;
	//protected File fileImportacionDiarioGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiarioGeneral;
	protected JButton jButtonDuplicarToolBarDiarioGeneral;
	protected JButton jButtonNuevoRelacionesToolBarDiarioGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarDiarioGeneral;
	protected JButton jButtonCopiarToolBarDiarioGeneral;
	protected JButton jButtonVerFormToolBarDiarioGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarDiarioGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarDiarioGeneral;
	protected JButton jButtonCerrarToolBarDiarioGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarDiarioGeneral;
	protected JButton jButtonProcesarInformacionToolBarDiarioGeneral;
	protected JButton jButtonAnterioresToolBarDiarioGeneral;
	protected JButton jButtonSiguientesToolBarDiarioGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarDiarioGeneral;
	protected JButton jButtonAbrirOrderByToolBarDiarioGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiarioGeneral;
	protected JMenuItem jMenuItemDuplicarDiarioGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesDiarioGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDiarioGeneral;
	protected JMenuItem jMenuItemCopiarDiarioGeneral;
	protected JMenuItem jMenuItemVerFormDiarioGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiarioGeneral;
	protected JMenuItem jMenuItemCerrarDiarioGeneral;
	protected JMenuItem jMenuItemDetalleCerrarDiarioGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDiarioGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiarioGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionDiarioGeneral;
	protected JMenuItem jMenuItemProcesarInformacionDiarioGeneral;
	protected JMenuItem jMenuItemAnterioresDiarioGeneral;
	protected JMenuItem jMenuItemSiguientesDiarioGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiarioGeneral;
	protected JMenuItem jMenuItemAbrirOrderByDiarioGeneral;
	protected JMenuItem jMenuItemMostrarOcultarDiarioGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiarioGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDiarioGeneral;
	protected JCheckBox jCheckBoxSeleccionadosDiarioGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDiarioGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDiarioGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDiarioGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDiarioGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDiarioGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDiarioGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDiarioGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiarioGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiarioGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDiarioGeneral;
	protected JTextField jTextFieldValorCampoGeneralDiarioGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDiarioGeneral;
	//public JList<Reporte> jListColumnasSelectReporteDiarioGeneral;
	//public JScrollPane jScrollColumnasSelectReporteDiarioGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteDiarioGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteDiarioGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteDiarioGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDiarioGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDiarioGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDiarioGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoDiarioGeneral;
	
		
	//public JLabel jLabelArchivoImportacionDiarioGeneral;	
	//public JLabel jLabelPathArchivoImportacionDiarioGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionDiarioGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDiarioGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDiarioGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorDiarioGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDiarioGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoDiarioGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoDiarioGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoDiarioGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDiarioGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDiarioGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDiarioGeneral;
	public JPanel jPanelBusquedaReporteDiarioGeneral;
	public JButton jButtonBusquedaReporteDiarioGeneral;
	
	public JPanel jPanelid_ejercicioBusquedaReporteDiarioGeneral;
	public JLabel jLabelid_ejercicioBusquedaReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaReporteDiarioGeneral;
	public JButton jButtonid_ejercicioBusquedaReporteDiarioGeneral= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaReporteDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaReporteDiarioGeneral;
	public JLabel jLabelid_periodoBusquedaReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaReporteDiarioGeneral;
	public JButton jButtonid_periodoBusquedaReporteDiarioGeneral= new JButtonMe();
	public JButton jButtonid_periodoBusquedaReporteDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaReporteDiarioGeneral;
	public JLabel jLabelid_moduloBusquedaReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaReporteDiarioGeneral;
	public JButton jButtonid_moduloBusquedaReporteDiarioGeneral= new JButtonMe();
	public JButton jButtonid_moduloBusquedaReporteDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoBusquedaReporteDiarioGeneral;
	public JLabel jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral;
	public JButton jButtonid_tipo_movimientoBusquedaReporteDiarioGeneral= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaReporteDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_documentoBusquedaReporteDiarioGeneral;
	public JLabel jLabelid_tipo_documentoBusquedaReporteDiarioGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral;
	public JButton jButtonid_tipo_documentoBusquedaReporteDiarioGeneral= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaReporteDiarioGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_inicioBusquedaReporteDiarioGeneral;
	public JLabel jLabelfecha_inicioBusquedaReporteDiarioGeneral;
	//public JFormattedTextField jDateChooserfecha_inicioBusquedaReporteDiarioGeneral;

	public JDateChooser jDateChooserfecha_inicioBusquedaReporteDiarioGeneral;
	public JButton jButtonfecha_inicioBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_finBusquedaReporteDiarioGeneral;
	public JLabel jLabelfecha_finBusquedaReporteDiarioGeneral;
	//public JFormattedTextField jDateChooserfecha_finBusquedaReporteDiarioGeneral;

	public JDateChooser jDateChooserfecha_finBusquedaReporteDiarioGeneral;
	public JButton jButtonfecha_finBusquedaReporteDiarioGeneralBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=564;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DiarioGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiarioGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDiarioGeneral)	{
		this.jButtonRecargarInformacionDiarioGeneral = jButtonRecargarInformacionDiarioGeneral;
	}
	
	public JButton getjButtonProcesarInformacionDiarioGeneral() {
		return this.jButtonProcesarInformacionDiarioGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiarioGeneral)	{
		this.jButtonProcesarInformacionDiarioGeneral = jButtonProcesarInformacionDiarioGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionDiarioGeneral() {
		return this.jButtonRecargarInformacionDiarioGeneral;
	}
	
	
	public List<DiarioGeneral> getdiariogenerals() {
		return this.diariogenerals;
	}

	public void setdiariogenerals(List<DiarioGeneral> diariogenerals) {
		this.diariogenerals = diariogenerals;
	}
	
	public List<DiarioGeneral> getdiariogeneralsAux() {
		return this.diariogeneralsAux;
	}

	public void setdiariogeneralsAux(List<DiarioGeneral> diariogeneralsAux) {
		this.diariogeneralsAux = diariogeneralsAux;
	}
	
	public List<DiarioGeneral> getdiariogeneralsEliminados() {
		return this.diariogeneralsEliminados;
	}

	public void setDiarioGeneralsEliminados(List<DiarioGeneral> diariogeneralsEliminados) {
		this.diariogeneralsEliminados = diariogeneralsEliminados;
	}
	
	public List<DiarioGeneral> getdiariogeneralsTotal() {
		return this.diariogeneralsTotal;
	}

	public void setdiariogeneralsTotal(List<DiarioGeneral> diariogeneralsTotal) {
		this.diariogeneralsTotal = diariogeneralsTotal;
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDiarioGeneral() {
		return jComboBoxTiposSeleccionarDiarioGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDiarioGeneral(
			JComboBox jComboBoxTiposSeleccionarDiarioGeneral) {
		this.jComboBoxTiposSeleccionarDiarioGeneral = jComboBoxTiposSeleccionarDiarioGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDiarioGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDiarioGeneral() {
		return jTextFieldValorCampoGeneralDiarioGeneral;
	}

	public void setjTextFieldValorCampoGeneralDiarioGeneral(
			JTextField jTextFieldValorCampoGeneralDiarioGeneral) {
		this.jTextFieldValorCampoGeneralDiarioGeneral = jTextFieldValorCampoGeneralDiarioGeneral;
	}

	public void setBorderResaltarValorCampoGeneralDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDiarioGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDiarioGeneral() {
		return this.jCheckBoxSeleccionarTodosDiarioGeneral;
	}

	public void setjCheckBoxSeleccionarTodosDiarioGeneral(
			JCheckBox jCheckBoxSeleccionarTodosDiarioGeneral) {
		this.jCheckBoxSeleccionarTodosDiarioGeneral = jCheckBoxSeleccionarTodosDiarioGeneral;
	}

	public void setBorderResaltarSeleccionarTodosDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDiarioGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDiarioGeneral() {
		return this.jCheckBoxSeleccionadosDiarioGeneral;
	}

	public void setjCheckBoxSeleccionadosDiarioGeneral(
			JCheckBox jCheckBoxSeleccionadosDiarioGeneral) {
		this.jCheckBoxSeleccionadosDiarioGeneral = jCheckBoxSeleccionadosDiarioGeneral;
	}
	
	public void setBorderResaltarSeleccionadosDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDiarioGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDiarioGeneral() {
		return this.jComboBoxTiposArchivosReportesDiarioGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDiarioGeneral(
			JComboBox jComboBoxTiposArchivosReportesDiarioGeneral) {
		this.jComboBoxTiposArchivosReportesDiarioGeneral = jComboBoxTiposArchivosReportesDiarioGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDiarioGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDiarioGeneral() {
		return this.jComboBoxTiposReportesDiarioGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDiarioGeneral(
			JComboBox jComboBoxTiposReportesDiarioGeneral) {
		this.jComboBoxTiposReportesDiarioGeneral = jComboBoxTiposReportesDiarioGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDiarioGeneral() {
	//	return jComboBoxTiposReportesDinamicoDiarioGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDiarioGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoDiarioGeneral) {
	//	this.jComboBoxTiposReportesDinamicoDiarioGeneral = jComboBoxTiposReportesDinamicoDiarioGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDiarioGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoDiarioGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDiarioGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDiarioGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral = jComboBoxTiposArchivosReportesDinamicoDiarioGeneral;
	//}
	
	public void setBorderResaltarTiposReportesDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDiarioGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDiarioGeneral() {
		return this.jComboBoxTiposGraficosReportesDiarioGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDiarioGeneral(
			JComboBox jComboBoxTiposGraficosReportesDiarioGeneral) {
		this.jComboBoxTiposGraficosReportesDiarioGeneral = jComboBoxTiposGraficosReportesDiarioGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDiarioGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDiarioGeneral() {
		return this.jComboBoxTiposPaginacionDiarioGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDiarioGeneral(
			JComboBox jComboBoxTiposPaginacionDiarioGeneral) {
		this.jComboBoxTiposPaginacionDiarioGeneral = jComboBoxTiposPaginacionDiarioGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDiarioGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDiarioGeneral() {
		return this.jComboBoxTiposRelacionesDiarioGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiarioGeneral() {
		return this.jComboBoxTiposAccionesDiarioGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiarioGeneral(
			JComboBox jComboBoxTiposRelacionesDiarioGeneral) {
		this.jComboBoxTiposRelacionesDiarioGeneral = jComboBoxTiposRelacionesDiarioGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiarioGeneral(
			JComboBox jComboBoxTiposAccionesDiarioGeneral) {
		this.jComboBoxTiposAccionesDiarioGeneral = jComboBoxTiposAccionesDiarioGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDiarioGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDiarioGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDiarioGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDiarioGeneral() {
	//	return jCheckBoxConGraficoDinamicoDiarioGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoDiarioGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoDiarioGeneral) {
	//	this.jCheckBoxConGraficoDinamicoDiarioGeneral = jCheckBoxConGraficoDinamicoDiarioGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDiarioGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDiarioGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDiarioGeneral .setBorder(borderResaltar);		
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
		this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
		
		this.diariogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diariogeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiarioGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiarioGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diario General MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		DiarioGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DiarioGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDiarioGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"nuevo","nuevo","Nuevo"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"duplicar","duplicar","Duplicar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"copiar","copiar","Copiar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"ver_form","ver_form","Ver"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"recargar","recargar","Buscar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDiarioGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDiarioGeneral,this.jTtoolBarDiarioGeneral,
							"cerrar","cerrar","Salir"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDiarioGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDiarioGeneral;
			
				this.jButtonProcesarInformacionToolBarDiarioGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDiarioGeneral;
				
		//protected JButton jButtonModificarToolBarDiarioGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDiarioGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDiarioGeneral=new JMenuMe("General");
		this.jmenuArchivoDiarioGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesDiarioGeneral=new JMenuMe("Acciones");
		this.jmenuDatosDiarioGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiarioGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiarioGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiarioGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDiarioGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDiarioGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDiarioGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDiarioGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDiarioGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDiarioGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDiarioGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiarioGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiarioGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDiarioGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDiarioGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDiarioGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDiarioGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDiarioGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDiarioGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDiarioGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDiarioGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDiarioGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiarioGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiarioGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiarioGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDiarioGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDiarioGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDiarioGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDiarioGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDiarioGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDiarioGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDiarioGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDiarioGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDiarioGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDiarioGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDiarioGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDiarioGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDiarioGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDiarioGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDiarioGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiarioGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiarioGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiarioGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDiarioGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDiarioGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDiarioGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiarioGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiarioGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiarioGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDiarioGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDiarioGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDiarioGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDiarioGeneral.add(this.jMenuItemCerrarDiarioGeneral);
			
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemNuevoDiarioGeneral);
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemNuevoGuardarCambiosDiarioGeneral);
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemNuevoRelacionesDiarioGeneral);
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemGuardarCambiosTablaDiarioGeneral);		
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemDuplicarDiarioGeneral);		
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemCopiarDiarioGeneral);		
			this.jmenuAccionesDiarioGeneral.add(this.jMenuItemVerFormDiarioGeneral);		
			
			this.jmenuDatosDiarioGeneral.add(this.jMenuItemRecargarInformacionDiarioGeneral);				
			this.jmenuDatosDiarioGeneral.add(this.jMenuItemAnterioresDiarioGeneral);				
			this.jmenuDatosDiarioGeneral.add(this.jMenuItemSiguientesDiarioGeneral);				
			this.jmenuDatosDiarioGeneral.add(this.jMenuItemAbrirOrderByDiarioGeneral);				
			this.jmenuDatosDiarioGeneral.add(this.jMenuItemMostrarOcultarDiarioGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDiarioGeneral.add(this.jMenuItemGuardarCambiosDiarioGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDiarioGeneral.add(this.jmenuArchivoDiarioGeneral);		
			this.jmenuBarDiarioGeneral.add(this.jmenuAccionesDiarioGeneral);		
			this.jmenuBarDiarioGeneral.add(this.jmenuDatosDiarioGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDiarioGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDiarioGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaReporteDiarioGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaReporteDiarioGeneral.setToolTipText("Buscar Por Ejercicio Por Periodo Por Modulo Por Tipo Movimiento Base Por Tipo Documento Por Fecha Inicio Por Fecha Fin ");
		this.jButtonBusquedaReporteDiarioGeneral= new JButtonMe();
		this.jButtonBusquedaReporteDiarioGeneral.setText("Buscar");
		this.jButtonBusquedaReporteDiarioGeneral.setToolTipText("Buscar Por Ejercicio Por Periodo Por Modulo Por Tipo Movimiento Base Por Tipo Documento Por Fecha Inicio Por Fecha Fin ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaReporteDiarioGeneral,"buscar_button","Buscar Por Ejercicio Por Periodo Por Modulo Por Tipo Movimiento Base Por Tipo Documento Por Fecha Inicio Por Fecha Fin ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaReporteDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelid_ejercicioBusquedaReporteDiarioGeneral.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaReporteDiarioGeneral.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaReporteDiarioGeneral= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelid_periodoBusquedaReporteDiarioGeneral.setText("Periodo :");
		jLabelid_periodoBusquedaReporteDiarioGeneral.setToolTipText("Periodo");
		jLabelid_periodoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaReporteDiarioGeneral= new JComboBoxMe();
		jComboBoxid_periodoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_moduloBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelid_moduloBusquedaReporteDiarioGeneral.setText("Modulo :");
		jLabelid_moduloBusquedaReporteDiarioGeneral.setToolTipText("Modulo");
		jLabelid_moduloBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaReporteDiarioGeneral= new JComboBoxMe();
		jComboBoxid_moduloBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral.setText("Tipo Movimiento Base :");
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral.setToolTipText("Tipo Movimiento Base");
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral= new JComboBoxMe();
		jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral.setText("Tipo Documento :");
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral.setToolTipText("Tipo Documento");
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_documentoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral= new JComboBoxMe();
		jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_inicioBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelfecha_inicioBusquedaReporteDiarioGeneral.setText("Fecha Inicio :");
		jLabelfecha_inicioBusquedaReporteDiarioGeneral.setToolTipText("Fecha Inicio");
		jLabelfecha_inicioBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_inicioBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral= new JDateChooser();
		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setDate(new Date());
		jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_finBusquedaReporteDiarioGeneral = new JLabelMe();
		jLabelfecha_finBusquedaReporteDiarioGeneral.setText("Fecha Fin :");
		jLabelfecha_finBusquedaReporteDiarioGeneral.setToolTipText("Fecha Fin");
		jLabelfecha_finBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_finBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_finBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_finBusquedaReporteDiarioGeneral= new JDateChooser();
		jDateChooserfecha_finBusquedaReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finBusquedaReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finBusquedaReporteDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_finBusquedaReporteDiarioGeneral.setDate(new Date());
		jDateChooserfecha_finBusquedaReporteDiarioGeneral.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_finBusquedaReporteDiarioGeneral.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasDiarioGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasDiarioGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDiarioGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));
		this.jTabbedPaneBusquedasDiarioGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,150)));

		//this.jTabbedPaneBusquedasDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDiarioGeneral = new DiarioGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Diario General DATOS");
			this.jInternalFrameDetalleFormDiarioGeneral = new DiarioGeneralDetalleFormJInternalFrame(jDesktopPane,this.diariogeneralSessionBean.getConGuardarRelaciones(),this.diariogeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDiarioGeneral = null;//new DiarioGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiarioGeneral= new GridBagLayout();
		
		
		this.jTableDatosDiarioGeneral = new JTableMe();      
		
		String sToolTipDiarioGeneral="";
		sToolTipDiarioGeneral=DiarioGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiarioGeneral+="(Contabilidad.DiarioGeneral)";
		}
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiarioGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDiarioGeneral.setToolTipText(sToolTipDiarioGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDiarioGeneral);
		this.jTableDatosDiarioGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosDiarioGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDiarioGeneral.setRowSelectionAllowed(true);
		this.jTableDatosDiarioGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDiarioGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		//this.jTableDatosDiarioGeneralTotales = new JTableMe();        
		//this.jTableDatosDiarioGeneralTotales.setAutoCreateRowSorter(true);
		
		//FuncionesSwing.setBoldTable(jTableDatosDiarioGeneralTotales,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDiarioGeneral = new JButtonMe();
		this.jButtonDuplicarDiarioGeneral = new JButtonMe();
		this.jButtonCopiarDiarioGeneral = new JButtonMe();
		this.jButtonVerFormDiarioGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesDiarioGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDiarioGeneral = new JButtonMe();
		this.jButtonCerrarDiarioGeneral = new JButtonMe();
		
		this.jScrollPanelDatosDiarioGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralDiarioGeneral = new JScrollPane();
		
		//this.jScrollPanelDatosDiarioGeneralTotales = new JScrollPane();		
		
		
		this.jPanelAccionesDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Diario General";
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosDiarioGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDiarioGeneralTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
		
		
        this.jPanelAccionesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiarioGeneral.setToolTipText("Acciones");
        this.jPanelAccionesDiarioGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDiarioGeneral=new ReporteDinamicoJInternalFrame(DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDiarioGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDiarioGeneral=new ImportacionJInternalFrame(DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDiarioGeneral();
			
					
		}
		
		//TOTALES
		this.jButtonAbrirTotalesDiarioGeneral = new JButtonMe();
		
		this.jButtonAbrirTotalesDiarioGeneral.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDiarioGeneral,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
		//NO CARCAR INICIALMENTE
		//this.jInternalFrameTotalesDiarioGeneral=new TotalesJInternalFrame(this.jButtonAbrirTotalesDiarioGeneral,STIPO_TAMANIO_GENERAL,this);		
		
		//this.cargarTotalesDiarioGeneral();
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDiarioGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByDiarioGeneral.setText("Orden");
		this.jButtonAbrirOrderByDiarioGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiarioGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiarioGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiarioGeneral,false,this);
			
			//this.cargarOrderByDiarioGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDiarioGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiarioGeneral,true,this);
			
			//this.cargarOrderByDiarioGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDiarioGeneral.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosDiarioGeneral.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosDiarioGeneral.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosDiarioGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiarioGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDiarioGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDiarioGeneral.setText("Nuevo");
		this.jButtonDuplicarDiarioGeneral.setText("Duplicar");
		this.jButtonCopiarDiarioGeneral.setText("Copiar");
		this.jButtonVerFormDiarioGeneral.setText("Ver");
		this.jButtonNuevoRelacionesDiarioGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.setText("Guardar");
		this.jButtonCerrarDiarioGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiarioGeneral,"nuevo_button","Nuevo",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDiarioGeneral,"duplicar_button","Duplicar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDiarioGeneral,"copiar_button","Copiar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDiarioGeneral,"ver_form","Ver",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDiarioGeneral,"nuevorelaciones_button","Nuevo Rel",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiarioGeneral,"guardarcambiostabla_button","Guardar",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiarioGeneral,"cerrar_button","Salir",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDiarioGeneral.setToolTipText("Nuevo"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDiarioGeneral.setToolTipText("Duplicar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDiarioGeneral.setToolTipText("Copiar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDiarioGeneral.setToolTipText("Ver"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDiarioGeneral.setToolTipText("Nuevo Rel"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.setToolTipText("Guardar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiarioGeneral.setToolTipText("Salir"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiarioGeneral";
		inputMap = this.jButtonNuevoDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiarioGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiarioGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarDiarioGeneral";
		inputMap = this.jButtonDuplicarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDiarioGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDiarioGeneral"));
		
		//COPIAR
		sMapKey = "CopiarDiarioGeneral";
		inputMap = this.jButtonCopiarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDiarioGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDiarioGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormDiarioGeneral";
		inputMap = this.jButtonVerFormDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDiarioGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDiarioGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDiarioGeneral";
		inputMap = this.jButtonNuevoRelacionesDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDiarioGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDiarioGeneral";
		inputMap = this.jButtonModificarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDiarioGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDiarioGeneral";
		inputMap = this.jButtonCerrarDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiarioGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiarioGeneral";
		inputMap = this.jButtonGuardarCambiosTablaDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiarioGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDiarioGeneral.setName("jPanelParametrosReportesDiarioGeneral"); 
		
		this.jPanelParametrosReportesAccionesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDiarioGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDiarioGeneral.setName("jPanelParametrosReportesAccionesDiarioGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDiarioGeneral = new JButtonMe();
		this.jButtonRecargarInformacionDiarioGeneral.setText("Buscar");
		this.jButtonRecargarInformacionDiarioGeneral.setToolTipText("Buscar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDiarioGeneral,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionDiarioGeneral.setVisible(false);
		
		
		this.jButtonProcesarInformacionDiarioGeneral = new JButtonMe();
		this.jButtonProcesarInformacionDiarioGeneral.setText("Procesar");
		this.jButtonProcesarInformacionDiarioGeneral.setToolTipText("Procesar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDiarioGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionDiarioGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiarioGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDiarioGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiarioGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDiarioGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiarioGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesDiarioGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDiarioGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDiarioGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDiarioGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionDiarioGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDiarioGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesDiarioGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiarioGeneral.setText("Accion");
		this.jComboBoxTiposAccionesDiarioGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDiarioGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarDiarioGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDiarioGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDiarioGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiarioGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDiarioGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDiarioGeneral = new JLabelMe();
		
		this.jLabelAccionesDiarioGeneral.setText("Acciones");		
		this.jLabelAccionesDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDiarioGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDiarioGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDiarioGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDiarioGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDiarioGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDiarioGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDiarioGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDiarioGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDiarioGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteDiarioGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDiarioGeneral = new JButtonMe();
		//this.jButtonAnterioresDiarioGeneral.setText("<<");
        this.jButtonAnterioresDiarioGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDiarioGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDiarioGeneral = new JButtonMe();
		//this.jButtonSiguientesDiarioGeneral.setText(">>");
        this.jButtonSiguientesDiarioGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDiarioGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDiarioGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDiarioGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosDiarioGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDiarioGeneral,"nuevoguardarcambios_button","Nue",this.diariogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDiarioGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDiarioGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDiarioGeneral";
		inputMap = this.jButtonRecargarInformacionDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDiarioGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDiarioGeneral";
		inputMap = this.jButtonSiguientesDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDiarioGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDiarioGeneral";
		inputMap = this.jButtonAnterioresDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDiarioGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDiarioGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDiarioGeneral.setMinimumSize(new Dimension(this.getWidth(),DiarioGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiarioGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiarioGeneral.setMaximumSize(new Dimension(this.getWidth(),DiarioGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiarioGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDiarioGeneral.setPreferredSize(new Dimension(this.getWidth(),DiarioGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DiarioGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDiarioGeneral = new GridBagLayout();

			this.jPanelPaginacionDiarioGeneral.setLayout(gridaBagLayoutPaginacionDiarioGeneral);						
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 0;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonAnterioresDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
						
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiarioGeneral.gridy = 0;
			
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonNuevoGuardarCambiosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
						
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDiarioGeneral.gridy = 0;
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonSiguientesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 0;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonAbrirTotalesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);		
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 1;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonNuevoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
						
			
			
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
				this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDiarioGeneral.gridy = 1;
				this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDiarioGeneral.add(this.jButtonGuardarCambiosTablaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			}
			
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 1;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonDuplicarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 1;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonCopiarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 1;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonVerFormDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 1;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDiarioGeneral.add(this.jButtonCerrarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		
		this.jButtonRecargarInformacionDiarioGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiarioGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDiarioGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDiarioGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiarioGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDiarioGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDiarioGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiarioGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDiarioGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDiarioGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiarioGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDiarioGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDiarioGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiarioGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDiarioGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDiarioGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiarioGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDiarioGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDiarioGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiarioGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiarioGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDiarioGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiarioGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDiarioGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDiarioGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiarioGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDiarioGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDiarioGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiarioGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDiarioGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDiarioGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiarioGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDiarioGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDiarioGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiarioGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDiarioGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDiarioGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDiarioGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DiarioGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DiarioGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DiarioGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DiarioGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDiarioGeneral.setLayout(gridaBagParametrosReportesDiarioGeneral);
			this.jPanelParametrosReportesAccionesDiarioGeneral.setLayout(gridaBagParametrosReportesAccionesDiarioGeneral);
			
			
			this.jPanelParametrosAuxiliar1DiarioGeneral.setLayout(gridaBagParametrosAuxiliar1DiarioGeneral);
			this.jPanelParametrosAuxiliar2DiarioGeneral.setLayout(gridaBagParametrosAuxiliar2DiarioGeneral);
			this.jPanelParametrosAuxiliar3DiarioGeneral.setLayout(gridaBagParametrosAuxiliar3DiarioGeneral);
			this.jPanelParametrosAuxiliar4DiarioGeneral.setLayout(gridaBagParametrosAuxiliar4DiarioGeneral);
			//this.jPanelParametrosAuxiliar5DiarioGeneral.setLayout(gridaBagParametrosAuxiliar2DiarioGeneral);			
			
			
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiarioGeneral.add(this.jButtonRecargarInformacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiarioGeneral.add(this.jComboBoxTiposPaginacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiarioGeneral.add(this.jCheckBoxConAltoMaximoTablaDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DiarioGeneral.add(this.jComboBoxTiposArchivosReportesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiarioGeneral.add(this.jPanelParametrosAuxiliar1DiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DiarioGeneral.add(this.jComboBoxTiposReportesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);																		
			
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DiarioGeneral.add(this.jComboBoxTiposGraficosReportesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiarioGeneral.add(this.jPanelParametrosAuxiliar4DiarioGeneral, this.gridBagConstraintsDiarioGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiarioGeneral.add(this.jComboBoxTiposReportesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiarioGeneral.add(this.jCheckBoxGenerarReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiarioGeneral.add(this.jPanelParametrosAuxiliar2DiarioGeneral, this.gridBagConstraintsDiarioGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiarioGeneral.add(this.jLabelAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
				this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDiarioGeneral.add(this.jButtonAbrirOrderByDiarioGeneral, this.gridBagConstraintsDiarioGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiarioGeneral.add(this.jComboBoxTiposSeleccionarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
			
			
			/*
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiarioGeneral.add(this.jCheckBoxSeleccionarTodosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDiarioGeneral.add(this.jCheckBoxConGraficoReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiarioGeneral.add(this.jCheckBoxSeleccionarTodosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);															
				
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiarioGeneral.add(this.jCheckBoxSeleccionadosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);															
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDiarioGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DiarioGeneral.add(this.jCheckBoxConGraficoReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDiarioGeneral.add(this.jPanelParametrosAuxiliar3DiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDiarioGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDiarioGeneral.add(this.jComboBoxTiposAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDiarioGeneral = new GridBagLayout();

			this.jScrollPanelDatosDiarioGeneral.setLayout(gridaBagLayoutDatosDiarioGeneral);
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = 0;
			this.gridBagConstraintsDiarioGeneral.gridx = 0;
			
			this.jScrollPanelDatosDiarioGeneral.add(this.jTableDatosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDiarioGeneral.setViewportView(this.jTableDatosDiarioGeneral);
		this.jTableDatosDiarioGeneral.setFillsViewportHeight(true);
		this.jTableDatosDiarioGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//this.jScrollPanelDatosDiarioGeneralTotales.setViewportView(this.jTableDatosDiarioGeneralTotales);
		//this.jTableDatosDiarioGeneralTotales.setFillsViewportHeight(true);
		//this.jTableDatosDiarioGeneralTotales.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDiarioGeneral= new GridBagLayout();
		this.jPanelAccionesDiarioGeneral.setLayout(gridaBagLayoutAccionesDiarioGeneral);
		
		
		/*	
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = 0;
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
			
		this.jPanelAccionesDiarioGeneral.add(this.jButtonNuevoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaReporteDiarioGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaReporteDiarioGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaReporteDiarioGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaReporteDiarioGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaReporteDiarioGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaReporteDiarioGeneral.setLayout(gridaBagLayoutBusquedaReporteDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 0;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelid_ejercicioBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 0;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 1;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelid_periodoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 1;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jComboBoxid_periodoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 2;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelid_moduloBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 2;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jComboBoxid_moduloBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 3;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelid_tipo_movimientoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 3;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 4;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelid_tipo_documentoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 4;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 5;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelfecha_inicioBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 5;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jDateChooserfecha_inicioBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);


		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 6;
		gridBagConstraintsDiarioGeneral.gridx = 0;
		jPanelBusquedaReporteDiarioGeneral.add(jLabelfecha_finBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 6;
		gridBagConstraintsDiarioGeneral.gridx = 1;
		jPanelBusquedaReporteDiarioGeneral.add(jDateChooserfecha_finBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDiarioGeneral.gridy = 7;
		gridBagConstraintsDiarioGeneral.gridx =1;
		jPanelBusquedaReporteDiarioGeneral.add(jButtonBusquedaReporteDiarioGeneral, gridBagConstraintsDiarioGeneral);

		jTabbedPaneBusquedasDiarioGeneral.addTab("1.-Por Ejercicio Por Periodo Por Modulo Por Tipo Movimiento Base Por Tipo Documento Por Fecha Inicio Por Fecha Fin ", jPanelBusquedaReporteDiarioGeneral);
		jTabbedPaneBusquedasDiarioGeneral.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiarioGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiarioGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();						
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiarioGeneral.gridx = 0;		
			//this.gridBagConstraintsDiarioGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiarioGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDiarioGeneral, this.gridBagConstraintsDiarioGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDiarioGeneral.gridx = 0;		
		//this.gridBagConstraintsDiarioGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDiarioGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDiarioGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiarioGeneral.gridx = 0;		
			this.gridBagConstraintsDiarioGeneral.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDiarioGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDiarioGeneral, this.gridBagConstraintsDiarioGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);								
		
		
		/*
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		*/		
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiarioGeneral.gridx =0;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiarioGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
				
		//this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;
		//this.gridBagConstraintsDiarioGeneral.gridx =0;
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDiarioGeneral.ipady =150;
		
		//this.jContentPane.add(jScrollPanelDatosDiarioGeneralTotales/*this.jTableDatosDiarioGeneralTotales*/, this.gridBagConstraintsDiarioGeneral);				
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDiarioGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiarioGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosDiarioGeneral.setLayout(gridaBagLayoutBusquedasParametrosDiarioGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDiarioGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiarioGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiarioGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiarioGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
			
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiarioGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDiarioGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDiarioGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDiarioGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDiarioGeneral.setName("jPanelReporteDinamicoDiarioGeneral"); 
		
		this.jPanelReporteDinamicoDiarioGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiarioGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDiarioGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDiarioGeneral.setLayout(gridaBagLayoutReporteDinamicoDiarioGeneral);
		
		
		this.jInternalFrameReporteDinamicoDiarioGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDiarioGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiarioGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDiarioGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDiarioGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDiarioGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDiarioGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDiarioGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDiarioGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoDiarioGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoDiarioGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDiarioGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiarioGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDiarioGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDiarioGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteDiarioGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelColumnasSelectReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDiarioGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteDiarioGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDiarioGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDiarioGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiarioGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDiarioGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDiarioGeneral=new JScrollPane(this.jListColumnasSelectReporteDiarioGeneral);
			
			this.jScrollColumnasSelectReporteDiarioGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiarioGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDiarioGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDiarioGeneral.add(this.jListColumnasSelectReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jScrollColumnasSelectReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDiarioGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteDiarioGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDiarioGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteDiarioGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDiarioGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDiarioGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiarioGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDiarioGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDiarioGeneral=new JScrollPane(this.jListRelacionesSelectReporteDiarioGeneral);
			
			this.jScrollRelacionesSelectReporteDiarioGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiarioGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDiarioGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoDiarioGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDiarioGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoDiarioGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDiarioGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDiarioGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDiarioGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiarioGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDiarioGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDiarioGeneral = new JLabelMe();

		this.jLabelConGraficoDinamicoDiarioGeneral.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelConGraficoDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDiarioGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDiarioGeneral.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDiarioGeneral.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDiarioGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiarioGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDiarioGeneral.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jCheckBoxConGraficoDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDiarioGeneral = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDiarioGeneral.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelColumnaCategoriaGraficoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jComboBoxColumnaCategoriaGraficoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDiarioGeneral = new JLabelMe();

		this.jLabelColumnaCategoriaValorDiarioGeneral.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelColumnaCategoriaValorDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDiarioGeneral.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDiarioGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDiarioGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiarioGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDiarioGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jComboBoxColumnaCategoriaValorDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDiarioGeneral = new JLabelMe();

		this.jLabelColumnasValoresGraficoDiarioGeneral.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelColumnasValoresGraficoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDiarioGeneral = new JList<Reporte>();
		this.jListColumnasValoresGraficoDiarioGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDiarioGeneral.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDiarioGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiarioGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDiarioGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDiarioGeneral=new JScrollPane(this.jListColumnasValoresGraficoDiarioGeneral);
			
			this.jScrollColumnasValoresGraficoDiarioGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiarioGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDiarioGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDiarioGeneral.add(this.jListColumnasSelectReporteDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jScrollColumnasValoresGraficoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDiarioGeneral = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDiarioGeneral.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelTiposGraficosReportesDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDiarioGeneral.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jComboBoxTiposGraficosReportesDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDiarioGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDiarioGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelGenerarExcelReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDiarioGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDiarioGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDiarioGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDiarioGeneral.setToolTipText("Generar EXCEL"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		//this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDiarioGeneral.add(this.jButtonGenerarExcelReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jComboBoxTiposReportesDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDiarioGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDiarioGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jLabelTiposArchivoReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDiarioGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDiarioGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDiarioGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDiarioGeneral.setToolTipText("Generar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jButtonGenerarReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDiarioGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDiarioGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDiarioGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDiarioGeneral.setToolTipText("Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDiarioGeneral.add(this.jButtonCerrarReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDiarioGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDiarioGeneral= new JScrollPane(jPanelReporteDinamicoDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDiarioGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiarioGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDiarioGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDiarioGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDiarioGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDiarioGeneral);
		this.jInternalFrameReporteDinamicoDiarioGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoDiarioGeneral, this.gridBagConstraintsDiarioGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDiarioGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDiarioGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDiarioGeneral.setName("jPanelImportacionDiarioGeneral"); 
		
		this.jPanelImportacionDiarioGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiarioGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDiarioGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDiarioGeneral.setLayout(gridaBagLayoutImportacionDiarioGeneral);
		
		
		this.jInternalFrameImportacionDiarioGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDiarioGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDiarioGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiarioGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDiarioGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiarioGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiarioGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDiarioGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiarioGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiarioGeneral.setResizable(true);
	    this.jInternalFrameImportacionDiarioGeneral.setClosable(true);
	    this.jInternalFrameImportacionDiarioGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDiarioGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDiarioGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDiarioGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDiarioGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDiarioGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDiarioGeneral.setResizable(true);
	    this.jInternalFrameImportacionDiarioGeneral.setClosable(true);
	    this.jInternalFrameImportacionDiarioGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDiarioGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiarioGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDiarioGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDiarioGeneral = new JLabelMe();

		this.jLabelArchivoImportacionDiarioGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiarioGeneral.add(this.jLabelArchivoImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDiarioGeneral = new JFileChooser();		
		this.jFileChooserImportacionDiarioGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDiarioGeneral = new JButtonMe();
		this.jButtonAbrirImportacionDiarioGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDiarioGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDiarioGeneral.setToolTipText("Generar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiarioGeneral.add(this.jButtonAbrirImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDiarioGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionDiarioGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDiarioGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiarioGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDiarioGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDiarioGeneral.add(this.jLabelPathArchivoImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDiarioGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDiarioGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiarioGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDiarioGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiarioGeneral.add(this.jTextFieldPathArchivoImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDiarioGeneral = new JButtonMe();
		this.jButtonGenerarImportacionDiarioGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDiarioGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDiarioGeneral.setToolTipText("Generar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiarioGeneral.add(this.jButtonGenerarImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDiarioGeneral = new JButtonMe();
		this.jButtonCerrarImportacionDiarioGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDiarioGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDiarioGeneral.setToolTipText("Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDiarioGeneral.add(this.jButtonCerrarImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDiarioGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionDiarioGeneral= new JScrollPane(jPanelImportacionDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDiarioGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDiarioGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDiarioGeneral);
		this.jInternalFrameImportacionDiarioGeneral.getContentPane().add(this.jScrollPanelImportacionDiarioGeneral, this.gridBagConstraintsDiarioGeneral);						
	}
	*/
	
	
	
	/*
	public void cargarTotalesDiarioGeneral() throws Exception {
		int iWidthTotales=350;
		int iHeightTotales=250;//400;
				
		int iPosXTotales=0;
		int iPosYTotales=0;
		
		this.jButtonAbrirTotalesDiarioGeneral = new JButtonMe();
		this.jButtonAbrirTotalesDiarioGeneral.setText("Totales");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirTotalesDiarioGeneral,"orden_button","Totales");
		FuncionesSwing.setBoldButton(this.jButtonAbrirTotalesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		GridBagLayout gridaBagLayoutTotalesDiarioGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelTotalesDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelTotalesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelTotalesDiarioGeneral.setName("jPanelTotalesDiarioGeneral"); 
		
		this.jPanelTotalesDiarioGeneral.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDiarioGeneral.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jPanelTotalesDiarioGeneral.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldPanel(this.jPanelTotalesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jPanelTotalesDiarioGeneral.setLayout(gridaBagLayoutTotalesDiarioGeneral);
		
		
		this.jInternalFrameTotalesDiarioGeneral= new TotalesJInternalFrame();
		this.jInternalFrameTotalesDiarioGeneral= new TotalesJInternalFrame();
		this.jScrollPanelTotalesDiarioGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDiarioGeneral= new JScrollPane();
		
		//JINTERNAL FRAME Totales
		this.jInternalFrameTotalesDiarioGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameTotalesDiarioGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameTotalesDiarioGeneral.setTitle("Totales");
	    this.jInternalFrameTotalesDiarioGeneral.setSize(iWidthTotales+70,iHeightTotales+100);		
		this.jInternalFrameTotalesDiarioGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTotalesDiarioGeneral.setResizable(true);
	    this.jInternalFrameTotalesDiarioGeneral.setClosable(true);
	    this.jInternalFrameTotalesDiarioGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelTotalesDiarioGeneral.setMinimumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDiarioGeneral.setMaximumSize(new Dimension(iWidthTotales,iHeightTotales));
		this.jScrollPanelTotalesDiarioGeneral.setPreferredSize(new Dimension(iWidthTotales,iHeightTotales));
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelTotalesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jScrollPanelTotalesDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales"));			
					
		//DATOS TOTALES
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iPosYTotales++;
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXTotales;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
					//this.gridBagConstraintsDiarioGeneral.ipady =150;
		
		this.jPanelTotalesDiarioGeneral.add(jScrollPanelDatosDiarioGeneralTotales, this.gridBagConstraintsDiarioGeneral);//this.jTableDatosDiarioGeneralTotales
		
		//BOTON CERRAR
		this.jButtonCerrarTotalesDiarioGeneral = new JButtonMe();
		this.jButtonCerrarTotalesDiarioGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTotalesDiarioGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
		FuncionesSwing.setBoldButton(this.jButtonCerrarTotalesDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jButtonCerrarTotalesDiarioGeneral.setToolTipText("Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiarioGeneral.gridy = iPosYTotales++;
		this.gridBagConstraintsDiarioGeneral.gridx = iPosXTotales;
							
		this.jPanelTotalesDiarioGeneral.add(this.jButtonCerrarTotalesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutTotalesPrincipalDiarioGeneral = new GridBagLayout();
		
		this.jScrollPanelTotalesDiarioGeneral= new JScrollPane(jPanelTotalesDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXTotales=0;
		iPosYTotales=0;
		
		this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
		this.gridBagConstraintsDiarioGeneral.gridy =iPosYTotales;
		this.gridBagConstraintsDiarioGeneral.gridx =iPosXTotales;
		this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameTotalesDiarioGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameTotalesDiarioGeneral.getContentPane().setLayout(gridaBagLayoutTotalesPrincipalDiarioGeneral);
		this.jInternalFrameTotalesDiarioGeneral.getContentPane().add(this.jScrollPanelTotalesDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
	}
	*/
	
	
	
	/*
	public void cargarOrderByDiarioGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDiarioGeneral = new JButtonMe();
			this.jButtonAbrirOrderByDiarioGeneral.setText("Orden");
			this.jButtonAbrirOrderByDiarioGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDiarioGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDiarioGeneral";
			inputMap = this.jButtonAbrirOrderByDiarioGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDiarioGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDiarioGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByDiarioGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDiarioGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDiarioGeneral.setName("jPanelOrderByDiarioGeneral"); 
			
			this.jPanelOrderByDiarioGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiarioGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDiarioGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDiarioGeneral.setLayout(gridaBagLayoutOrderByDiarioGeneral);
			
			
			this.jTableDatosDiarioGeneralOrderBy = new JTableMe();        
			this.jTableDatosDiarioGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDiarioGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDiarioGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDiarioGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDiarioGeneralOrderBy.setViewportView(this.jTableDatosDiarioGeneralOrderBy);
			this.jTableDatosDiarioGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDiarioGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDiarioGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDiarioGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDiarioGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDiarioGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDiarioGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDiarioGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDiarioGeneral.setTitle("Orden");
			this.jInternalFrameOrderByDiarioGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDiarioGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDiarioGeneral.setResizable(true);
			this.jInternalFrameOrderByDiarioGeneral.setClosable(true);
			this.jInternalFrameOrderByDiarioGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDiarioGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiarioGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDiarioGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDiarioGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diario Generales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDiarioGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDiarioGeneral.ipady =150;
				
			this.jPanelOrderByDiarioGeneral.add(jScrollPanelDatosDiarioGeneralOrderBy, this.gridBagConstraintsDiarioGeneral);//this.jTableDatosDiarioGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDiarioGeneral = new JButtonMe();
			this.jButtonCerrarOrderByDiarioGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDiarioGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDiarioGeneral.setToolTipText("Cancelar"+" "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDiarioGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiarioGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDiarioGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDiarioGeneral.add(this.jButtonCerrarOrderByDiarioGeneral, this.gridBagConstraintsDiarioGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDiarioGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByDiarioGeneral= new JScrollPane(jPanelOrderByDiarioGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDiarioGeneral = new GridBagConstraints();
			this.gridBagConstraintsDiarioGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsDiarioGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsDiarioGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDiarioGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDiarioGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDiarioGeneral);
			
			this.jInternalFrameOrderByDiarioGeneral.getContentPane().add(this.jScrollPanelOrderByDiarioGeneral, this.gridBagConstraintsDiarioGeneral);			
		
		} else {
			this.jButtonAbrirOrderByDiarioGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//3730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.diariogeneralSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDiarioGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosDiarioGeneral.getRowHeight();//DiarioGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiarioGeneral.isSelected()) {
					iHeightTable=DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDiarioGeneral.isSelected()) {
					iHeightTable=DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DiarioGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDiarioGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiarioGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDiarioGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDiarioGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiarioGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDiarioGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		this.redimensionarTablaTotales();
		
		/*
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDiarioGeneral!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
		*/
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDiarioGeneral!=null && this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDiarioGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDiarioGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDiarioGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDiarioGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiarioGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDiarioGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
	
	public void redimensionarTablaTotales() {
		//TOTALES
		int iHeightTableTotales=0;		
		int iNumFilasTotales=this.arrDatoGeneralTotales.size();
		int iTamanioFilaTablaTotales=0;
		
		if(this.jInternalFrameTotalesDiarioGeneral!=null) {
			iTamanioFilaTablaTotales=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getRowHeight();
			
			if(iNumFilasTotales>0) {			
				iHeightTableTotales=iNumFilasTotales * iTamanioFilaTablaTotales;
			} else {
				iHeightTableTotales=iTamanioFilaTablaTotales;
			}
			
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTableCalculado/4
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));
			this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,iHeightTableTotales));//iWidthTable
			
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));//iHeightTableTotales,iWidthTableScroll
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
			this.jInternalFrameTotalesDiarioGeneral.getjScrollPanelDatosTotales().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_TOTAL,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_TOTAL));
		}
	}
	
	public void redimensionarTablaDatosConTamanio(int iTamanioFilaTabla) throws Exception {
		int iSizeTabla=0;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			//iSizeTabla=diariogeneralLogic.getDiarioGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariogenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DiarioGeneral> TraerDiarioGeneralBeans(List<DiarioGeneral> diariogenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(DiarioGeneral diariogeneral:diariogenerals) {
					
				if(!(DiarioGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DiarioGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					diariogeneral.setsDetalleGeneralEntityReporte(DiarioGeneralConstantesFunciones.getDiarioGeneralDescripcion(diariogeneral));
										
						
					
						
					
				} else  {
							
					//diariogeneral.setsDetalleGeneralEntityReporte(diariogeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//diariogeneralbeans.add(diariogeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return diariogenerals;
    }
	//PARA REPORTES FIN
}
