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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoIessAportesConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoIessAportesJInternalFrame extends ProcesoIessAportesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoIessAportes;
	
	protected JMenuBar jmenuBarProcesoIessAportes;
	
	protected JMenu jmenuProcesoIessAportes;
	protected JMenu jmenuDatosProcesoIessAportes;
	protected JMenu jmenuArchivoProcesoIessAportes;
	protected JMenu jmenuAccionesProcesoIessAportes;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessAportes;	
	protected GridBagConstraints gridBagConstraintsProcesoIessAportes;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoIessAportesDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoIessAportes;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoIessAportes;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoIessAportes;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoafiliacion="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";
	
	public ProcesoIessAportesSessionBean procesoiessaportesSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoIessAportes> procesoiessaportess;		
	public List<ProcesoIessAportes> procesoiessaportessEliminados;	
	public List<ProcesoIessAportes> procesoiessaportessAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoIessAportes;		
	protected JButton jButtonAbrirOrderByProcesoIessAportes;
	
	
	//protected JPanel jPanelOrderByProcesoIessAportes;
	//public JScrollPane jScrollPanelOrderByProcesoIessAportes;	
	//protected JButton jButtonCerrarOrderByProcesoIessAportes;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoIessAportesLogic procesoiessaportesLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoIessAportes;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessAportes;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessAportes;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoIessAportesOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoIessAportes;
	//public JScrollPane jScrollPanelImportacionProcesoIessAportes;
	
	
	
	protected JPanel jPanelAccionesProcesoIessAportes;
	
    protected JPanel jPanelPaginacionProcesoIessAportes;
    protected JPanel jPanelParametrosReportesProcesoIessAportes;
	protected JPanel jPanelParametrosReportesAccionesProcesoIessAportes;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoIessAportes;
	protected JPanel jPanelParametrosAuxiliar2ProcesoIessAportes;
	protected JPanel jPanelParametrosAuxiliar3ProcesoIessAportes;
	protected JPanel jPanelParametrosAuxiliar4ProcesoIessAportes;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoIessAportes;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoIessAportes;
	//protected JPanel jPanelImportacionProcesoIessAportes;
	
	
	public JTable jTableDatosProcesoIessAportes;
	
	
	
	//public JTable jTableDatosProcesoIessAportesOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoIessAportes;
	protected JButton jButtonDuplicarProcesoIessAportes;
	protected JButton jButtonCopiarProcesoIessAportes;
	protected JButton jButtonVerFormProcesoIessAportes;
	protected JButton jButtonNuevoRelacionesProcesoIessAportes;
	protected JButton jButtonModificarProcesoIessAportes;
	
    protected JButton jButtonGuardarCambiosTablaProcesoIessAportes;
	protected JButton jButtonCerrarProcesoIessAportes;
	
	
	protected JButton jButtonRecargarInformacionProcesoIessAportes;
	protected JButton jButtonProcesarInformacionProcesoIessAportes;
	
	
	protected JButton jButtonAnterioresProcesoIessAportes;
	protected JButton jButtonSiguientesProcesoIessAportes;
	protected JButton jButtonNuevoGuardarCambiosProcesoIessAportes;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoIessAportes;
	//protected JButton jButtonCerrarReporteDinamicoProcesoIessAportes;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoIessAportes;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoIessAportes;
	//protected JButton jButtonGenerarImportacionProcesoIessAportes;
	//protected JButton jButtonCerrarImportacionProcesoIessAportes;
	//protected JFileChooser jFileChooserImportacionProcesoIessAportes;
	//protected File fileImportacionProcesoIessAportes;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessAportes;
	protected JButton jButtonDuplicarToolBarProcesoIessAportes;
	protected JButton jButtonNuevoRelacionesToolBarProcesoIessAportes;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoIessAportes;
	protected JButton jButtonCopiarToolBarProcesoIessAportes;
	protected JButton jButtonVerFormToolBarProcesoIessAportes;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoIessAportes;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessAportes;
	protected JButton jButtonCerrarToolBarProcesoIessAportes;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoIessAportes;
	protected JButton jButtonProcesarInformacionToolBarProcesoIessAportes;
	protected JButton jButtonAnterioresToolBarProcesoIessAportes;
	protected JButton jButtonSiguientesToolBarProcesoIessAportes;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoIessAportes;
	protected JButton jButtonAbrirOrderByToolBarProcesoIessAportes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessAportes;
	protected JMenuItem jMenuItemDuplicarProcesoIessAportes;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoIessAportes;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoIessAportes;
	protected JMenuItem jMenuItemCopiarProcesoIessAportes;
	protected JMenuItem jMenuItemVerFormProcesoIessAportes;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessAportes;
	protected JMenuItem jMenuItemCerrarProcesoIessAportes;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessAportes;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoIessAportes;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessAportes;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoIessAportes;
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessAportes;
	protected JMenuItem jMenuItemAnterioresProcesoIessAportes;
	protected JMenuItem jMenuItemSiguientesProcesoIessAportes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessAportes;
	protected JMenuItem jMenuItemAbrirOrderByProcesoIessAportes;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessAportes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessAportes;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoIessAportes;
	protected JCheckBox jCheckBoxSeleccionadosProcesoIessAportes;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoIessAportes;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoIessAportes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoIessAportes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoIessAportes;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoIessAportes;
	protected JTextField jTextFieldValorCampoGeneralProcesoIessAportes;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoIessAportes;
	//public JList<Reporte> jListColumnasSelectReporteProcesoIessAportes;
	//public JScrollPane jScrollColumnasSelectReporteProcesoIessAportes;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoIessAportes;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoIessAportes;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoIessAportes;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoIessAportes;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoIessAportes;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoIessAportes;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoIessAportes;
	
		
	//public JLabel jLabelArchivoImportacionProcesoIessAportes;	
	//public JLabel jLabelPathArchivoImportacionProcesoIessAportes;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoIessAportes;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoIessAportes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoIessAportes;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoIessAportes;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoIessAportes;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoIessAportes;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoIessAportes;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoIessAportes;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoIessAportes;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoIessAportes;
	public JPanel jPanelBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonBusquedaProcesoIessAportesProcesoIessAportes;
	
	public JPanel jPanelid_anioBusquedaProcesoIessAportesProcesoIessAportes;
	public JLabel jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonid_anioBusquedaProcesoIessAportesProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessAportesProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessAportesProcesoIessAportesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaProcesoIessAportesProcesoIessAportes;
	public JLabel jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonid_mesBusquedaProcesoIessAportesProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoIessAportesProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoIessAportesProcesoIessAportesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes;
	public JLabel jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes;
	public JLabel jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportesUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportesBusqueda= new JButtonMe();

	
	public JPanel jPanelporcentajeBusquedaProcesoIessAportesProcesoIessAportes;
	public JLabel jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes;
	public JTextField jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes;
	public JButton jButtonporcentajeBusquedaProcesoIessAportesProcesoIessAportesBusqueda= new JButtonMe();

	
	
	
	
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
	public ProcesoIessAportesJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessAportesJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoIessAportes)	{
		this.jButtonRecargarInformacionProcesoIessAportes = jButtonRecargarInformacionProcesoIessAportes;
	}
	
	public JButton getjButtonProcesarInformacionProcesoIessAportes() {
		return this.jButtonProcesarInformacionProcesoIessAportes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessAportes)	{
		this.jButtonProcesarInformacionProcesoIessAportes = jButtonProcesarInformacionProcesoIessAportes;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoIessAportes() {
		return this.jButtonRecargarInformacionProcesoIessAportes;
	}
	
	
	public List<ProcesoIessAportes> getprocesoiessaportess() {
		return this.procesoiessaportess;
	}

	public void setprocesoiessaportess(List<ProcesoIessAportes> procesoiessaportess) {
		this.procesoiessaportess = procesoiessaportess;
	}
	
	public List<ProcesoIessAportes> getprocesoiessaportessAux() {
		return this.procesoiessaportessAux;
	}

	public void setprocesoiessaportessAux(List<ProcesoIessAportes> procesoiessaportessAux) {
		this.procesoiessaportessAux = procesoiessaportessAux;
	}
	
	public List<ProcesoIessAportes> getprocesoiessaportessEliminados() {
		return this.procesoiessaportessEliminados;
	}

	public void setProcesoIessAportessEliminados(List<ProcesoIessAportes> procesoiessaportessEliminados) {
		this.procesoiessaportessEliminados = procesoiessaportessEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoIessAportes() {
		return jComboBoxTiposSeleccionarProcesoIessAportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoIessAportes(
			JComboBox jComboBoxTiposSeleccionarProcesoIessAportes) {
		this.jComboBoxTiposSeleccionarProcesoIessAportes = jComboBoxTiposSeleccionarProcesoIessAportes;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoIessAportes() {
		return jTextFieldValorCampoGeneralProcesoIessAportes;
	}

	public void setjTextFieldValorCampoGeneralProcesoIessAportes(
			JTextField jTextFieldValorCampoGeneralProcesoIessAportes) {
		this.jTextFieldValorCampoGeneralProcesoIessAportes = jTextFieldValorCampoGeneralProcesoIessAportes;
	}

	public void setBorderResaltarValorCampoGeneralProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoIessAportes .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoIessAportes() {
		return this.jCheckBoxSeleccionarTodosProcesoIessAportes;
	}

	public void setjCheckBoxSeleccionarTodosProcesoIessAportes(
			JCheckBox jCheckBoxSeleccionarTodosProcesoIessAportes) {
		this.jCheckBoxSeleccionarTodosProcesoIessAportes = jCheckBoxSeleccionarTodosProcesoIessAportes;
	}

	public void setBorderResaltarSeleccionarTodosProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoIessAportes() {
		return this.jCheckBoxSeleccionadosProcesoIessAportes;
	}

	public void setjCheckBoxSeleccionadosProcesoIessAportes(
			JCheckBox jCheckBoxSeleccionadosProcesoIessAportes) {
		this.jCheckBoxSeleccionadosProcesoIessAportes = jCheckBoxSeleccionadosProcesoIessAportes;
	}
	
	public void setBorderResaltarSeleccionadosProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoIessAportes() {
		return this.jComboBoxTiposArchivosReportesProcesoIessAportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoIessAportes(
			JComboBox jComboBoxTiposArchivosReportesProcesoIessAportes) {
		this.jComboBoxTiposArchivosReportesProcesoIessAportes = jComboBoxTiposArchivosReportesProcesoIessAportes;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoIessAportes() {
		return this.jComboBoxTiposReportesProcesoIessAportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoIessAportes(
			JComboBox jComboBoxTiposReportesProcesoIessAportes) {
		this.jComboBoxTiposReportesProcesoIessAportes = jComboBoxTiposReportesProcesoIessAportes;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoIessAportes() {
	//	return jComboBoxTiposReportesDinamicoProcesoIessAportes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoIessAportes(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoIessAportes) {
	//	this.jComboBoxTiposReportesDinamicoProcesoIessAportes = jComboBoxTiposReportesDinamicoProcesoIessAportes;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoIessAportes() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoIessAportes(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes = jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes;
	//}
	
	public void setBorderResaltarTiposReportesProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoIessAportes() {
		return this.jComboBoxTiposGraficosReportesProcesoIessAportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoIessAportes(
			JComboBox jComboBoxTiposGraficosReportesProcesoIessAportes) {
		this.jComboBoxTiposGraficosReportesProcesoIessAportes = jComboBoxTiposGraficosReportesProcesoIessAportes;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoIessAportes() {
		return this.jComboBoxTiposPaginacionProcesoIessAportes;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoIessAportes(
			JComboBox jComboBoxTiposPaginacionProcesoIessAportes) {
		this.jComboBoxTiposPaginacionProcesoIessAportes = jComboBoxTiposPaginacionProcesoIessAportes;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoIessAportes() {
		return this.jComboBoxTiposRelacionesProcesoIessAportes;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessAportes() {
		return this.jComboBoxTiposAccionesProcesoIessAportes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessAportes(
			JComboBox jComboBoxTiposRelacionesProcesoIessAportes) {
		this.jComboBoxTiposRelacionesProcesoIessAportes = jComboBoxTiposRelacionesProcesoIessAportes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessAportes(
			JComboBox jComboBoxTiposAccionesProcesoIessAportes) {
		this.jComboBoxTiposAccionesProcesoIessAportes = jComboBoxTiposAccionesProcesoIessAportes;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoIessAportes() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoIessAportes .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoIessAportes() {
	//	return jCheckBoxConGraficoDinamicoProcesoIessAportes;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoIessAportes(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoIessAportes) {
	//	this.jCheckBoxConGraficoDinamicoProcesoIessAportes = jCheckBoxConGraficoDinamicoProcesoIessAportes;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoIessAportes() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoIessAportes.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoIessAportes .setBorder(borderResaltar);		
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
		this.procesoiessaportesSessionBean=new ProcesoIessAportesSessionBean();
		
		this.procesoiessaportesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessaportesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessaportesSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessAportesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessAportesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Aportes MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoIessAportesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoIessAportes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoIessAportes= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"nuevo","nuevo","Nuevo"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"duplicar","duplicar","Duplicar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"copiar","copiar","Copiar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"ver_form","ver_form","Ver"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"recargar","recargar","Procesar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoIessAportes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoIessAportes,this.jTtoolBarProcesoIessAportes,
							"cerrar","cerrar","Salir"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoIessAportes=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoIessAportes;
			
				this.jButtonProcesarInformacionToolBarProcesoIessAportes=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoIessAportes;
				
		//protected JButton jButtonModificarToolBarProcesoIessAportes;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoIessAportes=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoIessAportes=new JMenuMe("General");
		this.jmenuArchivoProcesoIessAportes=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoIessAportes=new JMenuMe("Acciones");
		this.jmenuDatosProcesoIessAportes=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessAportes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessAportes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessAportes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoIessAportes= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoIessAportes.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoIessAportes,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoIessAportes= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoIessAportes.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoIessAportes,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoIessAportes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessAportes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessAportes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoIessAportes= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoIessAportes.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoIessAportes,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoIessAportes= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoIessAportes.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoIessAportes,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoIessAportes= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoIessAportes.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoIessAportes,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessAportes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessAportes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessAportes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoIessAportes= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoIessAportes.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoIessAportes,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoIessAportes= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoIessAportes.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoIessAportes,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoIessAportes= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoIessAportes.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoIessAportes,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoIessAportes= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoIessAportes.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoIessAportes,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoIessAportes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoIessAportes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoIessAportes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessAportes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessAportes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessAportes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoIessAportes= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoIessAportes.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoIessAportes,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessAportes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessAportes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessAportes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoIessAportes= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoIessAportes.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoIessAportes,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoIessAportes.add(this.jMenuItemCerrarProcesoIessAportes);
			
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemNuevoProcesoIessAportes);
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemNuevoGuardarCambiosProcesoIessAportes);
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemNuevoRelacionesProcesoIessAportes);
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemGuardarCambiosTablaProcesoIessAportes);		
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemDuplicarProcesoIessAportes);		
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemCopiarProcesoIessAportes);		
			this.jmenuAccionesProcesoIessAportes.add(this.jMenuItemVerFormProcesoIessAportes);		
			
			this.jmenuDatosProcesoIessAportes.add(this.jMenuItemRecargarInformacionProcesoIessAportes);				
			this.jmenuDatosProcesoIessAportes.add(this.jMenuItemAnterioresProcesoIessAportes);				
			this.jmenuDatosProcesoIessAportes.add(this.jMenuItemSiguientesProcesoIessAportes);				
			this.jmenuDatosProcesoIessAportes.add(this.jMenuItemAbrirOrderByProcesoIessAportes);				
			this.jmenuDatosProcesoIessAportes.add(this.jMenuItemMostrarOcultarProcesoIessAportes);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoIessAportes.add(this.jMenuItemGuardarCambiosProcesoIessAportes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoIessAportes.add(this.jmenuArchivoProcesoIessAportes);		
			this.jmenuBarProcesoIessAportes.add(this.jmenuAccionesProcesoIessAportes);		
			this.jmenuBarProcesoIessAportes.add(this.jmenuDatosProcesoIessAportes);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoIessAportes);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoIessAportes() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoIessAportesProcesoIessAportes=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Procesar Proceso Iess Aportes");
		this.jButtonBusquedaProcesoIessAportesProcesoIessAportes= new JButtonMe();
		this.jButtonBusquedaProcesoIessAportesProcesoIessAportes.setText("Procesar");
		this.jButtonBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Procesar Proceso Iess Aportes");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoIessAportesProcesoIessAportes,"buscar_button","Procesar Proceso Iess Aportes");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoIessAportesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes = new JLabelMe();
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes.setText("Anio :");
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes = new JLabelMe();
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes.setText("Mes :");
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes = new JLabelMe();
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setText("Tipo Afiliacion :");
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Tipo Afiliacion");
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes = new JLabelMe();
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setText("Numero Patronal :");
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes= new JComboBoxMe();
		jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes = new JLabelMe();
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setText("Porcentaje :");
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setToolTipText("Porcentaje");
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes= new JTextFieldMe();
		jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

	FuncionesSwing.setBoldTextField(jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);
		jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes.setText("0.0");




		this.jTabbedPaneBusquedasProcesoIessAportes=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoIessAportes.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProcesoIessAportes.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasProcesoIessAportes.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Iess Aportes"));
		this.jTabbedPaneBusquedasProcesoIessAportes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoIessAportes = new ProcesoIessAportesDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Iess Aportes DATOS");
			this.jInternalFrameDetalleFormProcesoIessAportes = new ProcesoIessAportesDetalleFormJInternalFrame(jDesktopPane,this.procesoiessaportesSessionBean.getConGuardarRelaciones(),this.procesoiessaportesSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoIessAportes = null;//new ProcesoIessAportesDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessAportes= new GridBagLayout();
		
		
		this.jTableDatosProcesoIessAportes = new JTableMe();      
		
		String sToolTipProcesoIessAportes="";
		sToolTipProcesoIessAportes=ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessAportes+="(Nomina.ProcesoIessAportes)";
		}
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessAportes+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoIessAportes.setToolTipText(sToolTipProcesoIessAportes);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoIessAportes);
		this.jTableDatosProcesoIessAportes.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoIessAportes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoIessAportes.setRowSelectionAllowed(true);
		this.jTableDatosProcesoIessAportes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoIessAportes,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoIessAportes = new JButtonMe();
		this.jButtonDuplicarProcesoIessAportes = new JButtonMe();
		this.jButtonCopiarProcesoIessAportes = new JButtonMe();
		this.jButtonVerFormProcesoIessAportes = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoIessAportes = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes = new JButtonMe();
		this.jButtonCerrarProcesoIessAportes = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessAportes = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoIessAportes = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Aportes";
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessAportes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessAportes.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessAportes.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoIessAportes=new ReporteDinamicoJInternalFrame(ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoIessAportes();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoIessAportes=new ImportacionJInternalFrame(ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoIessAportes();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoIessAportes = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoIessAportes.setText("Orden");
		this.jButtonAbrirOrderByProcesoIessAportes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessAportes,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessAportes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessAportes,false,this);
			
			//this.cargarOrderByProcesoIessAportes(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessAportes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessAportes,true,this);
			
			//this.cargarOrderByProcesoIessAportes(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoIessAportes.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoIessAportes.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosProcesoIessAportes.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosProcesoIessAportes.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessAportes.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessAportes.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoIessAportes.setText("Nuevo");
		this.jButtonDuplicarProcesoIessAportes.setText("Duplicar");
		this.jButtonCopiarProcesoIessAportes.setText("Copiar");
		this.jButtonVerFormProcesoIessAportes.setText("Ver");
		this.jButtonNuevoRelacionesProcesoIessAportes.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.setText("Guardar");
		this.jButtonCerrarProcesoIessAportes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessAportes,"nuevo_button","Nuevo",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoIessAportes,"duplicar_button","Duplicar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoIessAportes,"copiar_button","Copiar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoIessAportes,"ver_form","Ver",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoIessAportes,"nuevorelaciones_button","Nuevo Rel",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessAportes,"guardarcambiostabla_button","Guardar",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessAportes,"cerrar_button","Salir",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoIessAportes.setToolTipText("Nuevo"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoIessAportes.setToolTipText("Duplicar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoIessAportes.setToolTipText("Copiar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoIessAportes.setToolTipText("Ver"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoIessAportes.setToolTipText("Nuevo Rel"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.setToolTipText("Guardar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessAportes.setToolTipText("Salir"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessAportes";
		inputMap = this.jButtonNuevoProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessAportes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessAportes"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoIessAportes";
		inputMap = this.jButtonDuplicarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoIessAportes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoIessAportes"));
		
		//COPIAR
		sMapKey = "CopiarProcesoIessAportes";
		inputMap = this.jButtonCopiarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoIessAportes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoIessAportes"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoIessAportes";
		inputMap = this.jButtonVerFormProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoIessAportes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoIessAportes"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoIessAportes";
		inputMap = this.jButtonNuevoRelacionesProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoIessAportes"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoIessAportes";
		inputMap = this.jButtonModificarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoIessAportes"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessAportes";
		inputMap = this.jButtonCerrarProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessAportes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessAportes";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessAportes"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoIessAportes.setName("jPanelParametrosReportesProcesoIessAportes"); 
		
		this.jPanelParametrosReportesAccionesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoIessAportes.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoIessAportes.setName("jPanelParametrosReportesAccionesProcesoIessAportes"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoIessAportes = new JButtonMe();
		this.jButtonRecargarInformacionProcesoIessAportes.setText("Procesar");
		this.jButtonRecargarInformacionProcesoIessAportes.setToolTipText("Procesar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoIessAportes,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoIessAportes.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoIessAportes = new JButtonMe();
		this.jButtonProcesarInformacionProcesoIessAportes.setText("Procesar");
		this.jButtonProcesarInformacionProcesoIessAportes.setToolTipText("Procesar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoIessAportes.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoIessAportes.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessAportes.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessAportes.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessAportes.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoIessAportes.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessAportes.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoIessAportes.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessAportes.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoIessAportes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoIessAportes.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoIessAportes.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoIessAportes.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoIessAportes.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessAportes.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessAportes.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoIessAportes.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoIessAportes.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoIessAportes=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoIessAportes.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessAportes.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessAportes.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoIessAportes = new JLabelMe();
		
		this.jLabelAccionesProcesoIessAportes.setText("Acciones");		
		this.jLabelAccionesProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoIessAportes = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoIessAportes.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoIessAportes.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoIessAportes = new JButtonMe();
		//this.jButtonAnterioresProcesoIessAportes.setText("<<");
        this.jButtonAnterioresProcesoIessAportes.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoIessAportes,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoIessAportes = new JButtonMe();
		//this.jButtonSiguientesProcesoIessAportes.setText(">>");
        this.jButtonSiguientesProcesoIessAportes.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoIessAportes,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoIessAportes = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoIessAportes.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoIessAportes,"nuevoguardarcambios_button","Nue",this.procesoiessaportesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoIessAportes";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoIessAportes"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoIessAportes";
		inputMap = this.jButtonRecargarInformacionProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoIessAportes"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoIessAportes";
		inputMap = this.jButtonSiguientesProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoIessAportes"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoIessAportes";
		inputMap = this.jButtonAnterioresProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoIessAportes"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoIessAportes();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoIessAportes.setMinimumSize(new Dimension(this.getWidth(),ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessAportes.setMaximumSize(new Dimension(this.getWidth(),ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessAportes.setPreferredSize(new Dimension(this.getWidth(),ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessAportesBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoIessAportes = new GridBagLayout();

			this.jPanelPaginacionProcesoIessAportes.setLayout(gridaBagLayoutPaginacionProcesoIessAportes);						
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 0;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonAnterioresProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					
						
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessAportes.gridy = 0;
			
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonNuevoGuardarCambiosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
						
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessAportes.gridy = 0;
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonSiguientesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonNuevoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
						
			
			
			if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoIessAportes.gridy = 1;
				this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoIessAportes.add(this.jButtonGuardarCambiosTablaProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			}
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonProcesarInformacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonDuplicarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonCopiarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonVerFormProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 1;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoIessAportes.add(this.jButtonCerrarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		
		this.jButtonRecargarInformacionProcesoIessAportes.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessAportes.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessAportes.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoIessAportes.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessAportes.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessAportes.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoIessAportes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessAportes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessAportes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoIessAportes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessAportes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessAportes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoIessAportes.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessAportes.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessAportes.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoIessAportes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessAportes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessAportes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoIessAportes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessAportes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessAportes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoIessAportes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessAportes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessAportes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessAportes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessAportes.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoIessAportes.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessAportes.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessAportes.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoIessAportes = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoIessAportes = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoIessAportes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoIessAportes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoIessAportes = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoIessAportes = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoIessAportes.setLayout(gridaBagParametrosReportesProcesoIessAportes);
			this.jPanelParametrosReportesAccionesProcesoIessAportes.setLayout(gridaBagParametrosReportesAccionesProcesoIessAportes);
			
			
			this.jPanelParametrosAuxiliar1ProcesoIessAportes.setLayout(gridaBagParametrosAuxiliar1ProcesoIessAportes);
			this.jPanelParametrosAuxiliar2ProcesoIessAportes.setLayout(gridaBagParametrosAuxiliar2ProcesoIessAportes);
			this.jPanelParametrosAuxiliar3ProcesoIessAportes.setLayout(gridaBagParametrosAuxiliar3ProcesoIessAportes);
			this.jPanelParametrosAuxiliar4ProcesoIessAportes.setLayout(gridaBagParametrosAuxiliar4ProcesoIessAportes);
			//this.jPanelParametrosAuxiliar5ProcesoIessAportes.setLayout(gridaBagParametrosAuxiliar2ProcesoIessAportes);			
			
			
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jButtonRecargarInformacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessAportes.add(this.jComboBoxTiposPaginacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessAportes.add(this.jCheckBoxConAltoMaximoTablaProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessAportes.add(this.jComboBoxTiposArchivosReportesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jPanelParametrosAuxiliar1ProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoIessAportes.add(this.jComboBoxTiposReportesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);																		
			
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProcesoIessAportes.add(this.jComboBoxTiposGraficosReportesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jPanelParametrosAuxiliar4ProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jComboBoxTiposReportesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jCheckBoxGenerarReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jPanelParametrosAuxiliar2ProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jLabelAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jComboBoxTiposSeleccionarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
			
			
			/*
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jCheckBoxSeleccionarTodosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jCheckBoxConGraficoReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessAportes.add(this.jCheckBoxSeleccionarTodosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);															
				
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessAportes.add(this.jCheckBoxSeleccionadosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);															
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessAportes.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessAportes.add(this.jCheckBoxConGraficoReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jPanelParametrosAuxiliar3ProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessAportes.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessAportes.add(this.jComboBoxTiposAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoIessAportes = new GridBagLayout();

			this.jScrollPanelDatosProcesoIessAportes.setLayout(gridaBagLayoutDatosProcesoIessAportes);
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = 0;
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;
			
			this.jScrollPanelDatosProcesoIessAportes.add(this.jTableDatosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoIessAportes.setViewportView(this.jTableDatosProcesoIessAportes);
		this.jTableDatosProcesoIessAportes.setFillsViewportHeight(true);
		this.jTableDatosProcesoIessAportes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessAportes= new GridBagLayout();
		this.jPanelAccionesProcesoIessAportes.setLayout(gridaBagLayoutAccionesProcesoIessAportes);
		
		
		/*	
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = 0;
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
			
		this.jPanelAccionesProcesoIessAportes.add(this.jButtonNuevoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.setLayout(gridaBagLayoutBusquedaProcesoIessAportesProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 0;
		gridBagConstraintsProcesoIessAportes.gridx = 0;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jLabelid_anioBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 0;
		gridBagConstraintsProcesoIessAportes.gridx = 1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jComboBoxid_anioBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);


		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 1;
		gridBagConstraintsProcesoIessAportes.gridx = 0;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jLabelid_mesBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 1;
		gridBagConstraintsProcesoIessAportes.gridx = 1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jComboBoxid_mesBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);


		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 2;
		gridBagConstraintsProcesoIessAportes.gridx = 0;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jLabelid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 2;
		gridBagConstraintsProcesoIessAportes.gridx = 1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jComboBoxid_tipo_afiliacionBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);


		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 3;
		gridBagConstraintsProcesoIessAportes.gridx = 0;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jLabelid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 3;
		gridBagConstraintsProcesoIessAportes.gridx = 1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jComboBoxid_numero_patronalBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);


		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 4;
		gridBagConstraintsProcesoIessAportes.gridx = 0;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jLabelporcentajeBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 4;
		gridBagConstraintsProcesoIessAportes.gridx = 1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jTextFieldporcentajeBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessAportes.gridy = 5;
		gridBagConstraintsProcesoIessAportes.gridx =1;
		jPanelBusquedaProcesoIessAportesProcesoIessAportes.add(jButtonBusquedaProcesoIessAportesProcesoIessAportes, gridBagConstraintsProcesoIessAportes);

		jTabbedPaneBusquedasProcesoIessAportes.addTab("1.-Por Anio Por Mes Por Tipo Afiliacion Por Numero Patronal Por Porcentaje ", jPanelBusquedaProcesoIessAportesProcesoIessAportes);
		jTabbedPaneBusquedasProcesoIessAportes.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessAportes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessAportes);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;		
			//this.gridBagConstraintsProcesoIessAportes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessAportes.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;		
		//this.gridBagConstraintsProcesoIessAportes.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoIessAportes.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoIessAportes);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessAportes.gridx = 0;		
			this.gridBagConstraintsProcesoIessAportes.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoIessAportes.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);								
		
		
		/*
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		*/		
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessAportes.gridx =0;
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessAportes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
				
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoIessAportesJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoIessAportes= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessAportes = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoIessAportes.setLayout(gridaBagLayoutBusquedasParametrosProcesoIessAportes);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoIessAportes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessAportes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessAportes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessAportes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
			
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessAportes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoIessAportes.setVisible(false);
		this.jButtonAnterioresProcesoIessAportes.setVisible(false);
		this.jButtonSiguientesProcesoIessAportes.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoIessAportes.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoIessAportes.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoIessAportes.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoIessAportes.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoIessAportes.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposReportesProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposAccionesProcesoIessAportes.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessAportes.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoIessAportes.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoIessAportes.setVisible(false);
		
		this.jPanelParametrosReportesProcesoIessAportes.setVisible(false);
		
		
		this.jTtoolBarProcesoIessAportes.setVisible(false);
			
		this.jMenuItemAnterioresProcesoIessAportes.setVisible(false);
		this.jMenuItemSiguientesProcesoIessAportes.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoIessAportes.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoIessAportes.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoIessAportes.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoIessAportes.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoIessAportes.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoIessAportes.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessAportes.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoIessAportes.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessAportes.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoIessAportes.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoIessAportes;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoIessAportes() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoIessAportes = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoIessAportes.setName("jPanelReporteDinamicoProcesoIessAportes"); 
		
		this.jPanelReporteDinamicoProcesoIessAportes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessAportes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessAportes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoIessAportes.setLayout(gridaBagLayoutReporteDinamicoProcesoIessAportes);
		
		
		this.jInternalFrameReporteDinamicoProcesoIessAportes= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoIessAportes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessAportes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoIessAportes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoIessAportes.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoIessAportes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoIessAportes.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoIessAportes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoIessAportes.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessAportes.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessAportes.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoIessAportes.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessAportes.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessAportes.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoIessAportes = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoIessAportes.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelColumnasSelectReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoIessAportes = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoIessAportes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoIessAportes.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoIessAportes=new JScrollPane(this.jListColumnasSelectReporteProcesoIessAportes);
			
			this.jScrollColumnasSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoIessAportes.add(this.jListColumnasSelectReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jScrollColumnasSelectReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoIessAportes = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoIessAportes.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoIessAportes = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoIessAportes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoIessAportes.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoIessAportes=new JScrollPane(this.jListRelacionesSelectReporteProcesoIessAportes);
			
			this.jScrollRelacionesSelectReporteProcesoIessAportes.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessAportes.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessAportes.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoIessAportes = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoIessAportes = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoIessAportes = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoIessAportes.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoIessAportes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessAportes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessAportes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProcesoIessAportes = new JLabelMe();

		this.jLabelConGraficoDinamicoProcesoIessAportes.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelConGraficoDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProcesoIessAportes = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProcesoIessAportes.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProcesoIessAportes.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProcesoIessAportes.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoIessAportes.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProcesoIessAportes.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jCheckBoxConGraficoDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProcesoIessAportes = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProcesoIessAportes.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelColumnaCategoriaGraficoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProcesoIessAportes = new JLabelMe();

		this.jLabelColumnaCategoriaValorProcesoIessAportes.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelColumnaCategoriaValorProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProcesoIessAportes.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProcesoIessAportes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProcesoIessAportes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoIessAportes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProcesoIessAportes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jComboBoxColumnaCategoriaValorProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProcesoIessAportes = new JLabelMe();

		this.jLabelColumnasValoresGraficoProcesoIessAportes.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelColumnasValoresGraficoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProcesoIessAportes = new JList<Reporte>();
		this.jListColumnasValoresGraficoProcesoIessAportes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProcesoIessAportes.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProcesoIessAportes.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoIessAportes.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProcesoIessAportes.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProcesoIessAportes=new JScrollPane(this.jListColumnasValoresGraficoProcesoIessAportes);
			
			this.jScrollColumnasValoresGraficoProcesoIessAportes.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoIessAportes.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProcesoIessAportes.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProcesoIessAportes.add(this.jListColumnasSelectReporteProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jScrollColumnasValoresGraficoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelTiposGraficosReportesDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProcesoIessAportes.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jComboBoxTiposGraficosReportesDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelGenerarExcelReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes.setToolTipText("Generar EXCEL"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoIessAportes.add(this.jButtonGenerarExcelReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jComboBoxTiposReportesDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jLabelTiposArchivoReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoIessAportes = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoIessAportes.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoIessAportes,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoIessAportes.setToolTipText("Generar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jButtonGenerarReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoIessAportes = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoIessAportes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoIessAportes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoIessAportes.setToolTipText("Cancelar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessAportes.add(this.jButtonCerrarReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoIessAportes = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoIessAportes= new JScrollPane(jPanelReporteDinamicoProcesoIessAportes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoIessAportes.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessAportes.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessAportes.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoIessAportes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoIessAportes.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoIessAportes);
		this.jInternalFrameReporteDinamicoProcesoIessAportes.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoIessAportes() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoIessAportes = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoIessAportes.setName("jPanelImportacionProcesoIessAportes"); 
		
		this.jPanelImportacionProcesoIessAportes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessAportes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessAportes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoIessAportes.setLayout(gridaBagLayoutImportacionProcesoIessAportes);
		
		
		this.jInternalFrameImportacionProcesoIessAportes= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoIessAportes= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoIessAportes = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessAportes= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoIessAportes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessAportes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessAportes.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoIessAportes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessAportes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessAportes.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessAportes.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessAportes.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoIessAportes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessAportes.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessAportes.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoIessAportes.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessAportes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessAportes.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessAportes.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessAportes.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoIessAportes.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessAportes.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessAportes.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoIessAportes = new JLabelMe();

		this.jLabelArchivoImportacionProcesoIessAportes.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessAportes.add(this.jLabelArchivoImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoIessAportes = new JFileChooser();		
		this.jFileChooserImportacionProcesoIessAportes.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoIessAportes = new JButtonMe();
		this.jButtonAbrirImportacionProcesoIessAportes.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoIessAportes,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoIessAportes.setToolTipText("Generar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessAportes.add(this.jButtonAbrirImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoIessAportes = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoIessAportes.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoIessAportes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessAportes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessAportes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessAportes.add(this.jLabelPathArchivoImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoIessAportes=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoIessAportes.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessAportes.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessAportes.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessAportes.add(this.jTextFieldPathArchivoImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoIessAportes = new JButtonMe();
		this.jButtonGenerarImportacionProcesoIessAportes.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoIessAportes,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoIessAportes.setToolTipText("Generar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessAportes.add(this.jButtonGenerarImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoIessAportes = new JButtonMe();
		this.jButtonCerrarImportacionProcesoIessAportes.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoIessAportes,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoIessAportes.setToolTipText("Cancelar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessAportes.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessAportes.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessAportes.add(this.jButtonCerrarImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoIessAportes = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoIessAportes= new JScrollPane(jPanelImportacionProcesoIessAportes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessAportes.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoIessAportes.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoIessAportes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoIessAportes.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoIessAportes);
		this.jInternalFrameImportacionProcesoIessAportes.getContentPane().add(this.jScrollPanelImportacionProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoIessAportes(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoIessAportes = new JButtonMe();
			this.jButtonAbrirOrderByProcesoIessAportes.setText("Orden");
			this.jButtonAbrirOrderByProcesoIessAportes.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessAportes,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoIessAportes";
			inputMap = this.jButtonAbrirOrderByProcesoIessAportes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoIessAportes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoIessAportes"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoIessAportes = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoIessAportes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoIessAportes.setName("jPanelOrderByProcesoIessAportes"); 
			
			this.jPanelOrderByProcesoIessAportes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessAportes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessAportes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoIessAportes.setLayout(gridaBagLayoutOrderByProcesoIessAportes);
			
			
			this.jTableDatosProcesoIessAportesOrderBy = new JTableMe();        
			this.jTableDatosProcesoIessAportesOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoIessAportesOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoIessAportesOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoIessAportesOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoIessAportesOrderBy.setViewportView(this.jTableDatosProcesoIessAportesOrderBy);
			this.jTableDatosProcesoIessAportesOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoIessAportesOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoIessAportes= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoIessAportes= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoIessAportes = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoIessAportes= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoIessAportes.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoIessAportes.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoIessAportes.setTitle("Orden");
			this.jInternalFrameOrderByProcesoIessAportes.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoIessAportes.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoIessAportes.setResizable(true);
			this.jInternalFrameOrderByProcesoIessAportes.setClosable(true);
			this.jInternalFrameOrderByProcesoIessAportes.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoIessAportes.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessAportes.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessAportes.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoIessAportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Aporteses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessAportes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoIessAportes.ipady =150;
				
			this.jPanelOrderByProcesoIessAportes.add(jScrollPanelDatosProcesoIessAportesOrderBy, this.gridBagConstraintsProcesoIessAportes);//this.jTableDatosProcesoIessAportesTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoIessAportes = new JButtonMe();
			this.jButtonCerrarOrderByProcesoIessAportes.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoIessAportes,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoIessAportes.setToolTipText("Cancelar"+" "+ProcesoIessAportesConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoIessAportes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessAportes.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessAportes.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoIessAportes.add(this.jButtonCerrarOrderByProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoIessAportes = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoIessAportes= new JScrollPane(jPanelOrderByProcesoIessAportes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoIessAportes = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessAportes.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoIessAportes.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessAportes.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoIessAportes.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoIessAportes.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoIessAportes);
			
			this.jInternalFrameOrderByProcesoIessAportes.getContentPane().add(this.jScrollPanelOrderByProcesoIessAportes, this.gridBagConstraintsProcesoIessAportes);			
		
		} else {
			this.jButtonAbrirOrderByProcesoIessAportes = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoiessaportesSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoIessAportes.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoIessAportes.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoIessAportes.getRowHeight();//ProcesoIessAportesConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.isSelected()) {
					iHeightTable=ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessAportes.isSelected()) {
					iHeightTable=ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessAportesConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoIessAportes.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessAportes.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessAportes.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoIessAportes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessAportes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessAportes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoIessAportes!=null && this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoiessaportesSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoIessAportes.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoIessAportes.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoIessAportes.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoIessAportes.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoIessAportes.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessAportes.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessAportes.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoiessaportesLogic.getProcesoIessAportess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessaportess.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoIessAportes> TraerProcesoIessAportesBeans(List<ProcesoIessAportes> procesoiessaportess,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoIessAportes procesoiessaportes:procesoiessaportess) {
					
				if(!(ProcesoIessAportesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoIessAportesConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoiessaportes.setsDetalleGeneralEntityReporte(ProcesoIessAportesConstantesFunciones.getProcesoIessAportesDescripcion(procesoiessaportes));
										
						
					
						
					
				} else  {
							
					//procesoiessaportes.setsDetalleGeneralEntityReporte(procesoiessaportes.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoiessaportesbeans.add(procesoiessaportesbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoiessaportess;
    }
	//PARA REPORTES FIN
}
