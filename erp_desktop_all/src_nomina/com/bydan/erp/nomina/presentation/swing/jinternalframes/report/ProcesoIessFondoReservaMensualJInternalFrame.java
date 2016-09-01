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
import com.bydan.erp.nomina.util.report.ProcesoIessFondoReservaMensualConstantesFunciones;

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
public class ProcesoIessFondoReservaMensualJInternalFrame extends ProcesoIessFondoReservaMensualBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProcesoIessFondoReservaMensual;
	
	protected JMenuBar jmenuBarProcesoIessFondoReservaMensual;
	
	protected JMenu jmenuProcesoIessFondoReservaMensual;
	protected JMenu jmenuDatosProcesoIessFondoReservaMensual;
	protected JMenu jmenuArchivoProcesoIessFondoReservaMensual;
	protected JMenu jmenuAccionesProcesoIessFondoReservaMensual;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoIessFondoReservaMensual;	
	protected GridBagConstraints gridBagConstraintsProcesoIessFondoReservaMensual;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProcesoIessFondoReservaMensualDetalleFormJInternalFrame jInternalFrameDetalleFormProcesoIessFondoReservaMensual;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProcesoIessFondoReservaMensual;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoProcesoNominaBeanSwingJInternalFrame tipoprocesonominaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesonomina="";
	
	public ProcesoIessFondoReservaMensualSessionBean procesoiessfondoreservamensualSessionBean;
		
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoProcesoNominaSessionBean tipoprocesonominaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals;		
	public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsEliminados;	
	public List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProcesoIessFondoReservaMensual;		
	protected JButton jButtonAbrirOrderByProcesoIessFondoReservaMensual;
	
	
	//protected JPanel jPanelOrderByProcesoIessFondoReservaMensual;
	//public JScrollPane jScrollPanelOrderByProcesoIessFondoReservaMensual;	
	//protected JButton jButtonCerrarOrderByProcesoIessFondoReservaMensual;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProcesoIessFondoReservaMensualLogic procesoiessfondoreservamensualLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProcesoIessFondoReservaMensual;
	public JScrollPane jScrollPanelDatosEdicionProcesoIessFondoReservaMensual;
	public JScrollPane jScrollPanelDatosGeneralProcesoIessFondoReservaMensual;
    
	
	
	//public JScrollPane jScrollPanelDatosProcesoIessFondoReservaMensualOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual;
	//public JScrollPane jScrollPanelImportacionProcesoIessFondoReservaMensual;
	
	
	
	protected JPanel jPanelAccionesProcesoIessFondoReservaMensual;
	
    protected JPanel jPanelPaginacionProcesoIessFondoReservaMensual;
    protected JPanel jPanelParametrosReportesProcesoIessFondoReservaMensual;
	protected JPanel jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual;
	protected JPanel jPanelParametrosAuxiliar2ProcesoIessFondoReservaMensual;
	protected JPanel jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual;
	protected JPanel jPanelParametrosAuxiliar4ProcesoIessFondoReservaMensual;
	//protected JPanel jPanelParametrosAuxiliar5ProcesoIessFondoReservaMensual;
	
	
	
	//protected JPanel jPanelReporteDinamicoProcesoIessFondoReservaMensual;
	//protected JPanel jPanelImportacionProcesoIessFondoReservaMensual;
	
	
	public JTable jTableDatosProcesoIessFondoReservaMensual;
	
	
	
	//public JTable jTableDatosProcesoIessFondoReservaMensualOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProcesoIessFondoReservaMensual;
	protected JButton jButtonDuplicarProcesoIessFondoReservaMensual;
	protected JButton jButtonCopiarProcesoIessFondoReservaMensual;
	protected JButton jButtonVerFormProcesoIessFondoReservaMensual;
	protected JButton jButtonNuevoRelacionesProcesoIessFondoReservaMensual;
	protected JButton jButtonModificarProcesoIessFondoReservaMensual;
	
    protected JButton jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual;
	protected JButton jButtonCerrarProcesoIessFondoReservaMensual;
	
	
	protected JButton jButtonRecargarInformacionProcesoIessFondoReservaMensual;
	protected JButton jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	
	
	protected JButton jButtonAnterioresProcesoIessFondoReservaMensual;
	protected JButton jButtonSiguientesProcesoIessFondoReservaMensual;
	protected JButton jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual;
	//protected JButton jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual;
	//protected JButton jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual;	
	
	
	
	//protected JButton jButtonAbrirImportacionProcesoIessFondoReservaMensual;
	//protected JButton jButtonGenerarImportacionProcesoIessFondoReservaMensual;
	//protected JButton jButtonCerrarImportacionProcesoIessFondoReservaMensual;
	//protected JFileChooser jFileChooserImportacionProcesoIessFondoReservaMensual;
	//protected File fileImportacionProcesoIessFondoReservaMensual;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonDuplicarToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual;
	
	
	public JButton jButtonGuardarCambiosToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonCopiarToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonVerFormToolBarProcesoIessFondoReservaMensual;
	public JButton jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonCerrarToolBarProcesoIessFondoReservaMensual;
	
	protected JButton jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonAnterioresToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonSiguientesToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual;
	protected JButton jButtonAbrirOrderByToolBarProcesoIessFondoReservaMensual;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDuplicarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemCopiarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemVerFormProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemCerrarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDetalleCerrarProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual;
	
	protected JMenuItem jMenuItemRecargarInformacionProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemProcesarInformacionProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemAnterioresProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemSiguientesProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemAbrirOrderByProcesoIessFondoReservaMensual;
	protected JMenuItem jMenuItemMostrarOcultarProcesoIessFondoReservaMensual;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoIessFondoReservaMensual;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual;
	protected JCheckBox jCheckBoxSeleccionadosProcesoIessFondoReservaMensual;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual;
	protected JCheckBox jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProcesoIessFondoReservaMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual;
	protected JTextField jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProcesoIessFondoReservaMensual;
	//public JList<Reporte> jListColumnasSelectReporteProcesoIessFondoReservaMensual;
	//public JScrollPane jScrollColumnasSelectReporteProcesoIessFondoReservaMensual;
	
	//public JLabel jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual;
	//public JList<Reporte> jListRelacionesSelectReporteProcesoIessFondoReservaMensual;
	//public JScrollPane jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProcesoIessFondoReservaMensual;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual;
	//public JLabel jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual;
	
		
	//public JLabel jLabelArchivoImportacionProcesoIessFondoReservaMensual;	
	//public JLabel jLabelPathArchivoImportacionProcesoIessFondoReservaMensual;
	//protected JTextField jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProcesoIessFondoReservaMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProcesoIessFondoReservaMensual;
	
	//public JLabel jLabelColumnaCategoriaValorProcesoIessFondoReservaMensual;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProcesoIessFondoReservaMensual;
	
	//public JLabel jLabelColumnasValoresGraficoProcesoIessFondoReservaMensual;
	//public JList<Reporte> jListColumnasValoresGraficoProcesoIessFondoReservaMensual;
	//public JScrollPane jScrollColumnasValoresGraficoProcesoIessFondoReservaMensual;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProcesoIessFondoReservaMensual;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProcesoIessFondoReservaMensual;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProcesoIessFondoReservaMensual;
	public JPanel jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JButton jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	
	public JPanel jPanelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JLabel jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JLabel jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JButton jButtonid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JLabel jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JLabel jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual;
	public JButton jButtonid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JButtonMe();
	public JButton jButtonid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensualBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProcesoIessFondoReservaMensualJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoIessFondoReservaMensualJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProcesoIessFondoReservaMensual)	{
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual = jButtonRecargarInformacionProcesoIessFondoReservaMensual;
	}
	
	public JButton getjButtonProcesarInformacionProcesoIessFondoReservaMensual() {
		return this.jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoIessFondoReservaMensual)	{
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual = jButtonProcesarInformacionProcesoIessFondoReservaMensual;
	}
	
	
	public JButton getjButtonRecargarInformacionProcesoIessFondoReservaMensual() {
		return this.jButtonRecargarInformacionProcesoIessFondoReservaMensual;
	}
	
	
	public List<ProcesoIessFondoReservaMensual> getprocesoiessfondoreservamensuals() {
		return this.procesoiessfondoreservamensuals;
	}

	public void setprocesoiessfondoreservamensuals(List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals) {
		this.procesoiessfondoreservamensuals = procesoiessfondoreservamensuals;
	}
	
	public List<ProcesoIessFondoReservaMensual> getprocesoiessfondoreservamensualsAux() {
		return this.procesoiessfondoreservamensualsAux;
	}

	public void setprocesoiessfondoreservamensualsAux(List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsAux) {
		this.procesoiessfondoreservamensualsAux = procesoiessfondoreservamensualsAux;
	}
	
	public List<ProcesoIessFondoReservaMensual> getprocesoiessfondoreservamensualsEliminados() {
		return this.procesoiessfondoreservamensualsEliminados;
	}

	public void setProcesoIessFondoReservaMensualsEliminados(List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensualsEliminados) {
		this.procesoiessfondoreservamensualsEliminados = procesoiessfondoreservamensualsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProcesoIessFondoReservaMensual() {
		return jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual = jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual;
	}
	
	public void setBorderResaltarTiposSeleccionarProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProcesoIessFondoReservaMensual() {
		return jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual;
	}

	public void setjTextFieldValorCampoGeneralProcesoIessFondoReservaMensual(
			JTextField jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual) {
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual = jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual;
	}

	public void setBorderResaltarValorCampoGeneralProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual() {
		return this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual;
	}

	public void setjCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual(
			JCheckBox jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual) {
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual = jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual;
	}

	public void setBorderResaltarSeleccionarTodosProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProcesoIessFondoReservaMensual() {
		return this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual;
	}

	public void setjCheckBoxSeleccionadosProcesoIessFondoReservaMensual(
			JCheckBox jCheckBoxSeleccionadosProcesoIessFondoReservaMensual) {
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual = jCheckBoxSeleccionadosProcesoIessFondoReservaMensual;
	}
	
	public void setBorderResaltarSeleccionadosProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual = jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual;
	}

	public void setBorderResaltarTiposArchivosReportesProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposReportesProcesoIessFondoReservaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposReportesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual = jComboBoxTiposReportesProcesoIessFondoReservaMensual;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual() {
	//	return jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual(
	//		JComboBox jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual) {
	//	this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual = jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual() {
	//	return jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual = jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual;
	//}
	
	public void setBorderResaltarTiposReportesProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual = jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual;
	}
	
	public void setBorderResaltarTiposGraficosReportesProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposPaginacionProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual = jComboBoxTiposPaginacionProcesoIessFondoReservaMensual;
	}
	
	public void setBorderResaltarTiposPaginacionProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoIessFondoReservaMensual() {
		return this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposRelacionesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual = jComboBoxTiposRelacionesProcesoIessFondoReservaMensual;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoIessFondoReservaMensual(
			JComboBox jComboBoxTiposAccionesProcesoIessFondoReservaMensual) {
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual = jComboBoxTiposAccionesProcesoIessFondoReservaMensual;
	}
	
	public void setBorderResaltarTiposRelacionesProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProcesoIessFondoReservaMensual() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual() {
	//	return jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual;
	//}

	//public void setjCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual(
	//		JCheckBox jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual) {
	//	this.jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual = jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProcesoIessFondoReservaMensual() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProcesoIessFondoReservaMensual.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual .setBorder(borderResaltar);		
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
		this.procesoiessfondoreservamensualSessionBean=new ProcesoIessFondoReservaMensualSessionBean();
		
		this.procesoiessfondoreservamensualSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoiessfondoreservamensualSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoIessFondoReservaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoIessFondoReservaMensualJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Iess Fondo Reserva Mensual MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
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
		
		ProcesoIessFondoReservaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProcesoIessFondoReservaMensual No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProcesoIessFondoReservaMensual= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"nuevo","nuevo","Nuevo"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"duplicar","duplicar","Duplicar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"copiar","copiar","Copiar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"ver_form","ver_form","Ver"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"recargar","recargar","Procesar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Procesar",false);
		
		
		
		this.jButtonAnterioresToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProcesoIessFondoReservaMensual=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProcesoIessFondoReservaMensual,this.jTtoolBarProcesoIessFondoReservaMensual,
							"cerrar","cerrar","Salir"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProcesoIessFondoReservaMensual;
			
				this.jButtonProcesarInformacionToolBarProcesoIessFondoReservaMensual=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProcesoIessFondoReservaMensual;
				
		//protected JButton jButtonModificarToolBarProcesoIessFondoReservaMensual;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProcesoIessFondoReservaMensual=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProcesoIessFondoReservaMensual=new JMenuMe("General");
		this.jmenuArchivoProcesoIessFondoReservaMensual=new JMenuMe("Archivo");
		this.jmenuAccionesProcesoIessFondoReservaMensual=new JMenuMe("Acciones");
		this.jmenuDatosProcesoIessFondoReservaMensual=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoIessFondoReservaMensual= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoIessFondoReservaMensual.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoIessFondoReservaMensual,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProcesoIessFondoReservaMensual= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProcesoIessFondoReservaMensual.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProcesoIessFondoReservaMensual,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProcesoIessFondoReservaMensual= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProcesoIessFondoReservaMensual.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProcesoIessFondoReservaMensual,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProcesoIessFondoReservaMensual= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProcesoIessFondoReservaMensual.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProcesoIessFondoReservaMensual,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoIessFondoReservaMensual= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoIessFondoReservaMensual.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoIessFondoReservaMensual,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProcesoIessFondoReservaMensual= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProcesoIessFondoReservaMensual.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProcesoIessFondoReservaMensual,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProcesoIessFondoReservaMensual= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProcesoIessFondoReservaMensual.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProcesoIessFondoReservaMensual,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProcesoIessFondoReservaMensual= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProcesoIessFondoReservaMensual.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProcesoIessFondoReservaMensual,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProcesoIessFondoReservaMensual.add(this.jMenuItemCerrarProcesoIessFondoReservaMensual);
			
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemNuevoProcesoIessFondoReservaMensual);
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual);
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemNuevoRelacionesProcesoIessFondoReservaMensual);
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemGuardarCambiosTablaProcesoIessFondoReservaMensual);		
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemDuplicarProcesoIessFondoReservaMensual);		
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemCopiarProcesoIessFondoReservaMensual);		
			this.jmenuAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemVerFormProcesoIessFondoReservaMensual);		
			
			this.jmenuDatosProcesoIessFondoReservaMensual.add(this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual);				
			this.jmenuDatosProcesoIessFondoReservaMensual.add(this.jMenuItemAnterioresProcesoIessFondoReservaMensual);				
			this.jmenuDatosProcesoIessFondoReservaMensual.add(this.jMenuItemSiguientesProcesoIessFondoReservaMensual);				
			this.jmenuDatosProcesoIessFondoReservaMensual.add(this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual);				
			this.jmenuDatosProcesoIessFondoReservaMensual.add(this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProcesoIessFondoReservaMensual.add(this.jMenuItemGuardarCambiosProcesoIessFondoReservaMensual);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProcesoIessFondoReservaMensual.add(this.jmenuArchivoProcesoIessFondoReservaMensual);		
			this.jmenuBarProcesoIessFondoReservaMensual.add(this.jmenuAccionesProcesoIessFondoReservaMensual);		
			this.jmenuBarProcesoIessFondoReservaMensual.add(this.jmenuDatosProcesoIessFondoReservaMensual);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProcesoIessFondoReservaMensual);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProcesoIessFondoReservaMensual() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Procesar Proceso Iess Fondo Reserva Mensual");
		this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JButtonMe();
		this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Procesar Proceso Iess Fondo Reserva Mensual");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,"buscar_button","Procesar Proceso Iess Fondo Reserva Mensual");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual = new JLabelMe();
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setText("Anio :");
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Anio");
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual = new JLabelMe();
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setText("Mes :");
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Mes");
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual = new JLabelMe();
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setText("Numero Patronal :");
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Numero Patronal");
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual = new JLabelMe();
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setText("Tipo Proceso Nomina :");
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setToolTipText("Tipo Proceso Nomina");
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new JComboBoxMe();
		jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual=new JTabbedPane();


		this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Proceso Iess Fondo Reserva Mensual"));
		this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProcesoIessFondoReservaMensual = new ProcesoIessFondoReservaMensualDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Proceso Iess Fondo Reserva Mensual DATOS");
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual = new ProcesoIessFondoReservaMensualDetalleFormJInternalFrame(jDesktopPane,this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones(),this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProcesoIessFondoReservaMensual = null;//new ProcesoIessFondoReservaMensualDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoIessFondoReservaMensual= new GridBagLayout();
		
		
		this.jTableDatosProcesoIessFondoReservaMensual = new JTableMe();      
		
		String sToolTipProcesoIessFondoReservaMensual="";
		sToolTipProcesoIessFondoReservaMensual=ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoIessFondoReservaMensual+="(Nomina.ProcesoIessFondoReservaMensual)";
		}
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoIessFondoReservaMensual+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProcesoIessFondoReservaMensual.setToolTipText(sToolTipProcesoIessFondoReservaMensual);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProcesoIessFondoReservaMensual);
		this.jTableDatosProcesoIessFondoReservaMensual.setAutoCreateRowSorter(true);
		this.jTableDatosProcesoIessFondoReservaMensual.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProcesoIessFondoReservaMensual.setRowSelectionAllowed(true);
		this.jTableDatosProcesoIessFondoReservaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProcesoIessFondoReservaMensual,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonDuplicarProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonCopiarProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonVerFormProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonCerrarProcesoIessFondoReservaMensual = new JButtonMe();
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual = new JScrollPane();   
        this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Iess Fondo Reserva Mensual";
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoIessFondoReservaMensual.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoIessFondoReservaMensual.setToolTipText("Acciones");
        this.jPanelAccionesProcesoIessFondoReservaMensual.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual=new ReporteDinamicoJInternalFrame(ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProcesoIessFondoReservaMensual();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProcesoIessFondoReservaMensual=new ImportacionJInternalFrame(ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProcesoIessFondoReservaMensual();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProcesoIessFondoReservaMensual = new JButtonMe();
		
		this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setText("Orden");
		this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessFondoReservaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,false,this);
			
			//this.cargarOrderByProcesoIessFondoReservaMensual(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProcesoIessFondoReservaMensual=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,true,this);
			
			//this.cargarOrderByProcesoIessFondoReservaMensual(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProcesoIessFondoReservaMensual.setText("Nuevo");
		this.jButtonDuplicarProcesoIessFondoReservaMensual.setText("Duplicar");
		this.jButtonCopiarProcesoIessFondoReservaMensual.setText("Copiar");
		this.jButtonVerFormProcesoIessFondoReservaMensual.setText("Ver");
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setText("Guardar");
		this.jButtonCerrarProcesoIessFondoReservaMensual.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoIessFondoReservaMensual,"nuevo_button","Nuevo",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProcesoIessFondoReservaMensual,"duplicar_button","Duplicar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProcesoIessFondoReservaMensual,"copiar_button","Copiar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProcesoIessFondoReservaMensual,"ver_form","Ver",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual,"nuevorelaciones_button","Nuevo Rel",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual,"guardarcambiostabla_button","Guardar",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoIessFondoReservaMensual,"cerrar_button","Salir",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProcesoIessFondoReservaMensual.setToolTipText("Nuevo"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProcesoIessFondoReservaMensual.setToolTipText("Duplicar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProcesoIessFondoReservaMensual.setToolTipText("Copiar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProcesoIessFondoReservaMensual.setToolTipText("Ver"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.setToolTipText("Nuevo Rel"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.setToolTipText("Guardar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoIessFondoReservaMensual.setToolTipText("Salir"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoIessFondoReservaMensual"));
		
		//DUPLICAR
		sMapKey = "DuplicarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonDuplicarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProcesoIessFondoReservaMensual"));
		
		//COPIAR
		sMapKey = "CopiarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCopiarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProcesoIessFondoReservaMensual"));
		
		//VEr FORM
		sMapKey = "VerFormProcesoIessFondoReservaMensual";
		inputMap = this.jButtonVerFormProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProcesoIessFondoReservaMensual.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProcesoIessFondoReservaMensual"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProcesoIessFondoReservaMensual"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonModificarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProcesoIessFondoReservaMensual"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProcesoIessFondoReservaMensual";
		inputMap = this.jButtonCerrarProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoIessFondoReservaMensual"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoIessFondoReservaMensual";
		inputMap = this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoIessFondoReservaMensual"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setName("jPanelParametrosReportesProcesoIessFondoReservaMensual"); 
		
		this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual.setName("jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setToolTipText("Procesar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProcesoIessFondoReservaMensual,"recargar_button","Procesar");		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setVisible(false);
		
		
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setText("Procesar");
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setToolTipText("Procesar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setVisible(false);
			
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setText("TIPO");       
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setText("Paginacion");
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setText("Accion");
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setText("Accion");
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setText("Accion");
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProcesoIessFondoReservaMensual = new JLabelMe();
		
		this.jLabelAccionesProcesoIessFondoReservaMensual.setText("Acciones");		
		this.jLabelAccionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setText("Graf.");
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProcesoIessFondoReservaMensual = new JButtonMe();
		//this.jButtonAnterioresProcesoIessFondoReservaMensual.setText("<<");
        this.jButtonAnterioresProcesoIessFondoReservaMensual.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProcesoIessFondoReservaMensual,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProcesoIessFondoReservaMensual = new JButtonMe();
		//this.jButtonSiguientesProcesoIessFondoReservaMensual.setText(">>");
        this.jButtonSiguientesProcesoIessFondoReservaMensual.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProcesoIessFondoReservaMensual,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.setText("Nue");
        this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual,"nuevoguardarcambios_button","Nue",this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProcesoIessFondoReservaMensual";
		inputMap = this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProcesoIessFondoReservaMensual"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProcesoIessFondoReservaMensual";
		inputMap = this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProcesoIessFondoReservaMensual"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProcesoIessFondoReservaMensual";
		inputMap = this.jButtonSiguientesProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProcesoIessFondoReservaMensual"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProcesoIessFondoReservaMensual";
		inputMap = this.jButtonAnterioresProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProcesoIessFondoReservaMensual"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProcesoIessFondoReservaMensual();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(this.getWidth(),ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProcesoIessFondoReservaMensualBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProcesoIessFondoReservaMensual = new GridBagLayout();

			this.jPanelPaginacionProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutPaginacionProcesoIessFondoReservaMensual);						
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonAnterioresProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					
						
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
			
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
						
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonSiguientesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonNuevoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
						
			
			
			if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
				this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
				this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonGuardarCambiosTablaProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			}
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonProcesarInformacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonDuplicarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonCopiarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonVerFormProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProcesoIessFondoReservaMensual.add(this.jButtonCerrarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProcesoIessFondoReservaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProcesoIessFondoReservaMensual = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProcesoIessFondoReservaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProcesoIessFondoReservaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProcesoIessFondoReservaMensual = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProcesoIessFondoReservaMensual = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosReportesProcesoIessFondoReservaMensual);
			this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosReportesAccionesProcesoIessFondoReservaMensual);
			
			
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosAuxiliar1ProcesoIessFondoReservaMensual);
			this.jPanelParametrosAuxiliar2ProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosAuxiliar2ProcesoIessFondoReservaMensual);
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosAuxiliar3ProcesoIessFondoReservaMensual);
			this.jPanelParametrosAuxiliar4ProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosAuxiliar4ProcesoIessFondoReservaMensual);
			//this.jPanelParametrosAuxiliar5ProcesoIessFondoReservaMensual.setLayout(gridaBagParametrosAuxiliar2ProcesoIessFondoReservaMensual);			
			
			
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jButtonRecargarInformacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual.add(this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual.add(this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual.add(this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jPanelParametrosAuxiliar1ProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProcesoIessFondoReservaMensual.add(this.jComboBoxTiposReportesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jPanelParametrosAuxiliar4ProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jComboBoxTiposReportesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jCheckBoxGenerarReporteProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jPanelParametrosAuxiliar2ProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jLabelAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			*/
			
			//DEJA UN ESPACIO CUANDO ES MODULO, UNO A UNO FK O PROCESO
			 iGridxParametrosReportes++;
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
			
			
			/*
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual.add(this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);															
				
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual.add(this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jPanelParametrosAuxiliar3ProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProcesoIessFondoReservaMensual.add(this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProcesoIessFondoReservaMensual = new GridBagLayout();

			this.jScrollPanelDatosProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutDatosProcesoIessFondoReservaMensual);
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
			
			this.jScrollPanelDatosProcesoIessFondoReservaMensual.add(this.jTableDatosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setViewportView(this.jTableDatosProcesoIessFondoReservaMensual);
		this.jTableDatosProcesoIessFondoReservaMensual.setFillsViewportHeight(true);
		this.jTableDatosProcesoIessFondoReservaMensual.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProcesoIessFondoReservaMensual= new GridBagLayout();
		this.jPanelAccionesProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutAccionesProcesoIessFondoReservaMensual);
		
		
		/*	
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
			
		this.jPanelAccionesProcesoIessFondoReservaMensual.add(this.jButtonNuevoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual= new GridBagLayout();
		gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jLabelid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 0;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jComboBoxid_anioBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);


		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jLabelid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 1;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jComboBoxid_mesBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);


		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 2;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jLabelid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 2;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jComboBoxid_numero_patronalBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);


		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 3;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jLabelid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 3;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 1;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jComboBoxid_tipo_proceso_nominaBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridy = 4;
		gridBagConstraintsProcesoIessFondoReservaMensual.gridx =1;
		jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual.add(jButtonBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual, gridBagConstraintsProcesoIessFondoReservaMensual);

		jTabbedPaneBusquedasProcesoIessFondoReservaMensual.addTab("1.-Por Anio Por Mes Por Numero Patronal Por Tipo Proceso Nomina ", jPanelBusquedaProcesoIessFondoReservaMensualProcesoIessFondoReservaMensual);
		jTabbedPaneBusquedasProcesoIessFondoReservaMensual.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoIessFondoReservaMensual = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoIessFondoReservaMensual);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();						
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;		
			//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;		
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;		
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);								
		
		
		/*
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/		
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =0;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
				
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProcesoIessFondoReservaMensualJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProcesoIessFondoReservaMensual= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoIessFondoReservaMensual = new GridBagLayout();
			this.jPanelBusquedasParametrosProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutBusquedasParametrosProcesoIessFondoReservaMensual);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
			
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		*/
		
			
     	//pack();
		
		//OCULTAR PORQUE POSIBLEMENTE ES PROCESO
		//this.jPanelPaginacionProcesoIessFondoReservaMensual.setVisible(false);
		this.jButtonAnterioresProcesoIessFondoReservaMensual.setVisible(false);
		this.jButtonSiguientesProcesoIessFondoReservaMensual.setVisible(false);
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.setVisible(false);
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setVisible(false);		
		
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setVisible(false);
		
		    	
		this.jCheckBoxSeleccionarTodosProcesoIessFondoReservaMensual.setVisible(false);
		this.jCheckBoxSeleccionadosProcesoIessFondoReservaMensual.setVisible(false);
		this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.setVisible(false);
		this.jCheckBoxConGraficoReporteProcesoIessFondoReservaMensual.setVisible(false);
    	this.jComboBoxTiposArchivosReportesProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposReportesProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposGraficosReportesProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposPaginacionProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposRelacionesProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposAccionesProcesoIessFondoReservaMensual.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoIessFondoReservaMensual.setVisible(false);
		this.jComboBoxTiposSeleccionarProcesoIessFondoReservaMensual.setVisible(false);		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.setVisible(false);
		
		this.jPanelParametrosReportesProcesoIessFondoReservaMensual.setVisible(false);
		
		
		this.jTtoolBarProcesoIessFondoReservaMensual.setVisible(false);
			
		this.jMenuItemAnterioresProcesoIessFondoReservaMensual.setVisible(false);
		this.jMenuItemSiguientesProcesoIessFondoReservaMensual.setVisible(false);
		this.jMenuItemAbrirOrderByProcesoIessFondoReservaMensual.setVisible(false);
		this.jMenuItemMostrarOcultarProcesoIessFondoReservaMensual.setVisible(false);
		this.jMenuItemDetalleAbrirOrderByProcesoIessFondoReservaMensual.setVisible(false);
		
		
		
		
		
		
		this.jButtonRecargarInformacionProcesoIessFondoReservaMensual.setVisible(false);		
		
		
		this.jTextFieldValorCampoGeneralProcesoIessFondoReservaMensual.setVisible(false);
		
		this.jButtonNuevoGuardarCambiosProcesoIessFondoReservaMensual.setVisible(false);
		this.jButtonNuevoGuardarCambiosToolBarProcesoIessFondoReservaMensual.setVisible(false);
		this.jButtonRecargarInformacionToolBarProcesoIessFondoReservaMensual.setVisible(false);
		
		
		this.jMenuItemNuevoGuardarCambiosProcesoIessFondoReservaMensual.setVisible(false);
		this.jMenuItemRecargarInformacionProcesoIessFondoReservaMensual.setVisible(false);		
		
		
		return this.jScrollPanelDatosGeneralProcesoIessFondoReservaMensual;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProcesoIessFondoReservaMensual() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProcesoIessFondoReservaMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setName("jPanelReporteDinamicoProcesoIessFondoReservaMensual"); 
		
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutReporteDinamicoProcesoIessFondoReservaMensual);
		
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setResizable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setClosable(true);
	    this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jLabelColumnasSelectReporteProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProcesoIessFondoReservaMensual = new JList<Reporte>();
		this.jListColumnasSelectReporteProcesoIessFondoReservaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProcesoIessFondoReservaMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual=new JScrollPane(this.jListColumnasSelectReporteProcesoIessFondoReservaMensual);
			
			this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jListColumnasSelectReporteProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual = new JList<Reporte>();
		this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual=new JScrollPane(this.jListRelacionesSelectReporteProcesoIessFondoReservaMensual);
			
			this.jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProcesoIessFondoReservaMensual = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProcesoIessFondoReservaMensual = new JComboBoxMe();
		this.jListColumnasValoresGraficoProcesoIessFondoReservaMensual = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jLabelGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual.setToolTipText("Generar EXCEL"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jButtonGenerarExcelReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jComboBoxTiposReportesDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jLabelTiposArchivoReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jComboBoxTiposArchivosReportesDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual.setToolTipText("Generar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jButtonGenerarReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProcesoIessFondoReservaMensual.add(this.jButtonCerrarReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProcesoIessFondoReservaMensual = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual= new JScrollPane(jPanelReporteDinamicoProcesoIessFondoReservaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProcesoIessFondoReservaMensual);
		this.jInternalFrameReporteDinamicoProcesoIessFondoReservaMensual.getContentPane().add(this.jScrollPanelReporteDinamicoProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProcesoIessFondoReservaMensual() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProcesoIessFondoReservaMensual = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProcesoIessFondoReservaMensual.setName("jPanelImportacionProcesoIessFondoReservaMensual"); 
		
		this.jPanelImportacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutImportacionProcesoIessFondoReservaMensual);
		
		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProcesoIessFondoReservaMensual= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setResizable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setClosable(true);
	    this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelArchivoImportacionProcesoIessFondoReservaMensual.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jLabelArchivoImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProcesoIessFondoReservaMensual = new JFileChooser();		
		this.jFileChooserImportacionProcesoIessFondoReservaMensual.setToolTipText("ESCOGER ARCHIVO"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonAbrirImportacionProcesoIessFondoReservaMensual.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProcesoIessFondoReservaMensual,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProcesoIessFondoReservaMensual.setToolTipText("Generar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jButtonAbrirImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual = new JLabelMe();

		this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;		
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jLabelPathArchivoImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jTextFieldPathArchivoImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonGenerarImportacionProcesoIessFondoReservaMensual.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProcesoIessFondoReservaMensual,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProcesoIessFondoReservaMensual.setToolTipText("Generar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jButtonGenerarImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProcesoIessFondoReservaMensual = new JButtonMe();
		this.jButtonCerrarImportacionProcesoIessFondoReservaMensual.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProcesoIessFondoReservaMensual,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProcesoIessFondoReservaMensual.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProcesoIessFondoReservaMensual.add(this.jButtonCerrarImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProcesoIessFondoReservaMensual = new GridBagLayout();
		
		this.jScrollPanelImportacionProcesoIessFondoReservaMensual= new JScrollPane(jPanelImportacionProcesoIessFondoReservaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iPosYImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXImportacion;
		this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProcesoIessFondoReservaMensual);
		this.jInternalFrameImportacionProcesoIessFondoReservaMensual.getContentPane().add(this.jScrollPanelImportacionProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProcesoIessFondoReservaMensual(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual = new JButtonMe();
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setText("Orden");
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProcesoIessFondoReservaMensual,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProcesoIessFondoReservaMensual";
			inputMap = this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProcesoIessFondoReservaMensual"));
		
		
			GridBagLayout gridaBagLayoutOrderByProcesoIessFondoReservaMensual = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProcesoIessFondoReservaMensual = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProcesoIessFondoReservaMensual.setName("jPanelOrderByProcesoIessFondoReservaMensual"); 
			
			this.jPanelOrderByProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProcesoIessFondoReservaMensual.setLayout(gridaBagLayoutOrderByProcesoIessFondoReservaMensual);
			
			
			this.jTableDatosProcesoIessFondoReservaMensualOrderBy = new JTableMe();        
			this.jTableDatosProcesoIessFondoReservaMensualOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProcesoIessFondoReservaMensualOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProcesoIessFondoReservaMensualOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProcesoIessFondoReservaMensualOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProcesoIessFondoReservaMensualOrderBy.setViewportView(this.jTableDatosProcesoIessFondoReservaMensualOrderBy);
			this.jTableDatosProcesoIessFondoReservaMensualOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProcesoIessFondoReservaMensualOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProcesoIessFondoReservaMensual= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setTitle("Orden");
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setResizable(true);
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setClosable(true);
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Iess Fondo Reserva Mensuales"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProcesoIessFondoReservaMensual.ipady =150;
				
			this.jPanelOrderByProcesoIessFondoReservaMensual.add(jScrollPanelDatosProcesoIessFondoReservaMensualOrderBy, this.gridBagConstraintsProcesoIessFondoReservaMensual);//this.jTableDatosProcesoIessFondoReservaMensualTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProcesoIessFondoReservaMensual = new JButtonMe();
			this.jButtonCerrarOrderByProcesoIessFondoReservaMensual.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProcesoIessFondoReservaMensual,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProcesoIessFondoReservaMensual.setToolTipText("Cancelar"+" "+ProcesoIessFondoReservaMensualConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProcesoIessFondoReservaMensual, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProcesoIessFondoReservaMensual.add(this.jButtonCerrarOrderByProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProcesoIessFondoReservaMensual = new GridBagLayout();
			
			this.jScrollPanelOrderByProcesoIessFondoReservaMensual= new JScrollPane(jPanelOrderByProcesoIessFondoReservaMensual,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProcesoIessFondoReservaMensual = new GridBagConstraints();
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridy =iPosYOrderBy;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.gridx =iPosXOrderBy;
			this.gridBagConstraintsProcesoIessFondoReservaMensual.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProcesoIessFondoReservaMensual);
			
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getContentPane().add(this.jScrollPanelOrderByProcesoIessFondoReservaMensual, this.gridBagConstraintsProcesoIessFondoReservaMensual);			
		
		} else {
			this.jButtonAbrirOrderByProcesoIessFondoReservaMensual = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.procesoiessfondoreservamensualSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProcesoIessFondoReservaMensual.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosProcesoIessFondoReservaMensual.getRowHeight();//ProcesoIessFondoReservaMensualConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.isSelected()) {
					iHeightTable=ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProcesoIessFondoReservaMensual.isSelected()) {
					iHeightTable=ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProcesoIessFondoReservaMensualConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProcesoIessFondoReservaMensual!=null && this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy()!=null) {
			//if(!this.procesoiessfondoreservamensualSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProcesoIessFondoReservaMensual.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessFondoReservaMensual.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProcesoIessFondoReservaMensual.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=procesoiessfondoreservamensualLogic.getProcesoIessFondoReservaMensuals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoiessfondoreservamensuals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProcesoIessFondoReservaMensual> TraerProcesoIessFondoReservaMensualBeans(List<ProcesoIessFondoReservaMensual> procesoiessfondoreservamensuals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProcesoIessFondoReservaMensual procesoiessfondoreservamensual:procesoiessfondoreservamensuals) {
					
				if(!(ProcesoIessFondoReservaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProcesoIessFondoReservaMensualConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					procesoiessfondoreservamensual.setsDetalleGeneralEntityReporte(ProcesoIessFondoReservaMensualConstantesFunciones.getProcesoIessFondoReservaMensualDescripcion(procesoiessfondoreservamensual));
										
						
					
						
					
				} else  {
							
					//procesoiessfondoreservamensual.setsDetalleGeneralEntityReporte(procesoiessfondoreservamensual.getsDetalleGeneralEntityReporte());
										
				}
				
				//procesoiessfondoreservamensualbeans.add(procesoiessfondoreservamensualbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return procesoiessfondoreservamensuals;
    }
	//PARA REPORTES FIN
}
