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
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorCuentasConstantesFunciones;

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
public class RetencionesPorPagarPorCuentasJInternalFrame extends RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarRetencionesPorPagarPorCuentas;
	
	protected JMenuBar jmenuBarRetencionesPorPagarPorCuentas;
	
	protected JMenu jmenuRetencionesPorPagarPorCuentas;
	protected JMenu jmenuDatosRetencionesPorPagarPorCuentas;
	protected JMenu jmenuArchivoRetencionesPorPagarPorCuentas;
	protected JMenu jmenuAccionesRetencionesPorPagarPorCuentas;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencionesPorPagarPorCuentas;	
	protected GridBagConstraints gridBagConstraintsRetencionesPorPagarPorCuentas;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RetencionesPorPagarPorCuentasDetalleFormJInternalFrame jInternalFrameDetalleFormRetencionesPorPagarPorCuentas;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRetencionesPorPagarPorCuentas;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";
	
	public RetencionesPorPagarPorCuentasSessionBean retencionesporpagarporcuentasSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass;		
	public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassEliminados;	
	public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByRetencionesPorPagarPorCuentas;		
	protected JButton jButtonAbrirOrderByRetencionesPorPagarPorCuentas;
	
	
	//protected JPanel jPanelOrderByRetencionesPorPagarPorCuentas;
	//public JScrollPane jScrollPanelOrderByRetencionesPorPagarPorCuentas;	
	//protected JButton jButtonCerrarOrderByRetencionesPorPagarPorCuentas;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public RetencionesPorPagarPorCuentasLogic retencionesporpagarporcuentasLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRetencionesPorPagarPorCuentas;
	public JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas;
	public JScrollPane jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas;
    
	
	
	//public JScrollPane jScrollPanelDatosRetencionesPorPagarPorCuentasOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas;
	//public JScrollPane jScrollPanelImportacionRetencionesPorPagarPorCuentas;
	
	
	
	protected JPanel jPanelAccionesRetencionesPorPagarPorCuentas;
	
    protected JPanel jPanelPaginacionRetencionesPorPagarPorCuentas;
    protected JPanel jPanelParametrosReportesRetencionesPorPagarPorCuentas;
	protected JPanel jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas;
	protected JPanel jPanelParametrosAuxiliar2RetencionesPorPagarPorCuentas;
	protected JPanel jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas;
	protected JPanel jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas;
	//protected JPanel jPanelParametrosAuxiliar5RetencionesPorPagarPorCuentas;
	
	
	
	//protected JPanel jPanelReporteDinamicoRetencionesPorPagarPorCuentas;
	//protected JPanel jPanelImportacionRetencionesPorPagarPorCuentas;
	
	
	public JTable jTableDatosRetencionesPorPagarPorCuentas;
	
	
	
	//public JTable jTableDatosRetencionesPorPagarPorCuentasOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRetencionesPorPagarPorCuentas;
	protected JButton jButtonDuplicarRetencionesPorPagarPorCuentas;
	protected JButton jButtonCopiarRetencionesPorPagarPorCuentas;
	protected JButton jButtonVerFormRetencionesPorPagarPorCuentas;
	protected JButton jButtonNuevoRelacionesRetencionesPorPagarPorCuentas;
	protected JButton jButtonModificarRetencionesPorPagarPorCuentas;
	
    protected JButton jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas;
	protected JButton jButtonCerrarRetencionesPorPagarPorCuentas;
	
	
	protected JButton jButtonRecargarInformacionRetencionesPorPagarPorCuentas;
	protected JButton jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	
	
	protected JButton jButtonAnterioresRetencionesPorPagarPorCuentas;
	protected JButton jButtonSiguientesRetencionesPorPagarPorCuentas;
	protected JButton jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas;
	//protected JButton jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas;
	//protected JButton jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas;	
	
	
	
	//protected JButton jButtonAbrirImportacionRetencionesPorPagarPorCuentas;
	//protected JButton jButtonGenerarImportacionRetencionesPorPagarPorCuentas;
	//protected JButton jButtonCerrarImportacionRetencionesPorPagarPorCuentas;
	//protected JFileChooser jFileChooserImportacionRetencionesPorPagarPorCuentas;
	//protected File fileImportacionRetencionesPorPagarPorCuentas;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonDuplicarToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas;
	
	
	public JButton jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonCopiarToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonVerFormToolBarRetencionesPorPagarPorCuentas;
	public JButton jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonCerrarToolBarRetencionesPorPagarPorCuentas;
	
	protected JButton jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonAnterioresToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonSiguientesToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas;
	protected JButton jButtonAbrirOrderByToolBarRetencionesPorPagarPorCuentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDuplicarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemCopiarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemVerFormRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemCerrarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas;
	
	protected JMenuItem jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemProcesarInformacionRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemAnterioresRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemSiguientesRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas;
	protected JMenuItem jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRetencionesPorPagarPorCuentas;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas;
	protected JCheckBox jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas;
	protected JCheckBox jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRetencionesPorPagarPorCuentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas;
	protected JTextField jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas;
	//public JList<Reporte> jListColumnasSelectReporteRetencionesPorPagarPorCuentas;
	//public JScrollPane jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas;
	
	//public JLabel jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas;
	//public JList<Reporte> jListRelacionesSelectReporteRetencionesPorPagarPorCuentas;
	//public JScrollPane jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas;
	//public JLabel jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas;
	
		
	//public JLabel jLabelArchivoImportacionRetencionesPorPagarPorCuentas;	
	//public JLabel jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas;
	//protected JTextField jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas;
	
	//public JLabel jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas;
	
	//public JLabel jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas;
	//public JList<Reporte> jListColumnasValoresGraficoRetencionesPorPagarPorCuentas;
	//public JScrollPane jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorCuentas;
	public JPanel jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JButton jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	
	public JPanel jPanelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JLabel jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JButton jButtonid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JButtonMe();
	public JButton jButtonid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	public JPanel jPaneles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JLabel jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JCheckBox jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas;
	public JButton jButtones_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RetencionesPorPagarPorCuentasJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionesPorPagarPorCuentasJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRetencionesPorPagarPorCuentas)	{
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas = jButtonRecargarInformacionRetencionesPorPagarPorCuentas;
	}
	
	public JButton getjButtonProcesarInformacionRetencionesPorPagarPorCuentas() {
		return this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencionesPorPagarPorCuentas)	{
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas = jButtonProcesarInformacionRetencionesPorPagarPorCuentas;
	}
	
	
	public JButton getjButtonRecargarInformacionRetencionesPorPagarPorCuentas() {
		return this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas;
	}
	
	
	public List<RetencionesPorPagarPorCuentas> getretencionesporpagarporcuentass() {
		return this.retencionesporpagarporcuentass;
	}

	public void setretencionesporpagarporcuentass(List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass) {
		this.retencionesporpagarporcuentass = retencionesporpagarporcuentass;
	}
	
	public List<RetencionesPorPagarPorCuentas> getretencionesporpagarporcuentassAux() {
		return this.retencionesporpagarporcuentassAux;
	}

	public void setretencionesporpagarporcuentassAux(List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassAux) {
		this.retencionesporpagarporcuentassAux = retencionesporpagarporcuentassAux;
	}
	
	public List<RetencionesPorPagarPorCuentas> getretencionesporpagarporcuentassEliminados() {
		return this.retencionesporpagarporcuentassEliminados;
	}

	public void setRetencionesPorPagarPorCuentassEliminados(List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassEliminados) {
		this.retencionesporpagarporcuentassEliminados = retencionesporpagarporcuentassEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas() {
		return jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas = jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas;
	}
	
	public void setBorderResaltarTiposSeleccionarRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas() {
		return jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas;
	}

	public void setjTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas(
			JTextField jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas) {
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas = jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas;
	}

	public void setBorderResaltarValorCampoGeneralRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas() {
		return this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas;
	}

	public void setjCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas(
			JCheckBox jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas) {
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas = jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas;
	}

	public void setBorderResaltarSeleccionarTodosRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRetencionesPorPagarPorCuentas() {
		return this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas;
	}

	public void setjCheckBoxSeleccionadosRetencionesPorPagarPorCuentas(
			JCheckBox jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas) {
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas = jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas;
	}
	
	public void setBorderResaltarSeleccionadosRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas = jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas;
	}

	public void setBorderResaltarTiposArchivosReportesRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposReportesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas = jComboBoxTiposReportesRetencionesPorPagarPorCuentas;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas() {
	//	return jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas(
	//		JComboBox jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas) {
	//	this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas = jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas() {
	//	return jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas = jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas;
	//}
	
	public void setBorderResaltarTiposReportesRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas = jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas;
	}
	
	public void setBorderResaltarTiposGraficosReportesRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas = jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas;
	}
	
	public void setBorderResaltarTiposPaginacionRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencionesPorPagarPorCuentas() {
		return this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas = jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencionesPorPagarPorCuentas(
			JComboBox jComboBoxTiposAccionesRetencionesPorPagarPorCuentas) {
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas = jComboBoxTiposAccionesRetencionesPorPagarPorCuentas;
	}
	
	public void setBorderResaltarTiposRelacionesRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRetencionesPorPagarPorCuentas() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas() {
	//	return jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas;
	//}

	//public void setjCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas(
	//		JCheckBox jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas) {
	//	this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas = jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRetencionesPorPagarPorCuentas() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas .setBorder(borderResaltar);		
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
		this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
		
		this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporcuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionesPorPagarPorCuentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionesPorPagarPorCuentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retenciones Por Pagar Por Cuentas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
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
		
		RetencionesPorPagarPorCuentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("RetencionesPorPagarPorCuentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarRetencionesPorPagarPorCuentas= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"nuevo","nuevo","Nuevo"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"duplicar","duplicar","Duplicar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"copiar","copiar","Copiar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"ver_form","ver_form","Ver"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"recargar","recargar","Buscar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorCuentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,
							"cerrar","cerrar","Salir"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas;
			
				this.jButtonProcesarInformacionToolBarRetencionesPorPagarPorCuentas=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRetencionesPorPagarPorCuentas;
				
		//protected JButton jButtonModificarToolBarRetencionesPorPagarPorCuentas;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarRetencionesPorPagarPorCuentas=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRetencionesPorPagarPorCuentas=new JMenuMe("General");
		this.jmenuArchivoRetencionesPorPagarPorCuentas=new JMenuMe("Archivo");
		this.jmenuAccionesRetencionesPorPagarPorCuentas=new JMenuMe("Acciones");
		this.jmenuDatosRetencionesPorPagarPorCuentas=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencionesPorPagarPorCuentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRetencionesPorPagarPorCuentas= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRetencionesPorPagarPorCuentas.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRetencionesPorPagarPorCuentas,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRetencionesPorPagarPorCuentas= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRetencionesPorPagarPorCuentas.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRetencionesPorPagarPorCuentas,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRetencionesPorPagarPorCuentas= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRetencionesPorPagarPorCuentas.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRetencionesPorPagarPorCuentas,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencionesPorPagarPorCuentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRetencionesPorPagarPorCuentas= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRetencionesPorPagarPorCuentas.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRetencionesPorPagarPorCuentas,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRetencionesPorPagarPorCuentas= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRetencionesPorPagarPorCuentas.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRetencionesPorPagarPorCuentas,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRetencionesPorPagarPorCuentas= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRetencionesPorPagarPorCuentas.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRetencionesPorPagarPorCuentas,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRetencionesPorPagarPorCuentas.add(this.jMenuItemCerrarRetencionesPorPagarPorCuentas);
			
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemNuevoRetencionesPorPagarPorCuentas);
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas);
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas);
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas);		
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemDuplicarRetencionesPorPagarPorCuentas);		
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemCopiarRetencionesPorPagarPorCuentas);		
			this.jmenuAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemVerFormRetencionesPorPagarPorCuentas);		
			
			this.jmenuDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas);				
			this.jmenuDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemAnterioresRetencionesPorPagarPorCuentas);				
			this.jmenuDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemSiguientesRetencionesPorPagarPorCuentas);				
			this.jmenuDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas);				
			this.jmenuDatosRetencionesPorPagarPorCuentas.add(this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRetencionesPorPagarPorCuentas.add(this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRetencionesPorPagarPorCuentas.add(this.jmenuArchivoRetencionesPorPagarPorCuentas);		
			this.jmenuBarRetencionesPorPagarPorCuentas.add(this.jmenuAccionesRetencionesPorPagarPorCuentas);		
			this.jmenuBarRetencionesPorPagarPorCuentas.add(this.jmenuDatosRetencionesPorPagarPorCuentas);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRetencionesPorPagarPorCuentas);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasRetencionesPorPagarPorCuentas() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Tipo Retencion Por Es Debito ");
		this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JButtonMe();
		this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Buscar Por Ejercicio Por Periodo Por Tipo Retencion Por Es Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,"buscar_button","Buscar Por Ejercicio Por Periodo Por Tipo Retencion Por Es Debito ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas = new JLabelMe();
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setText("Ejercicio :");
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Ejercicio");
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas = new JLabelMe();
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setText("Periodo :");
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Periodo");
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas = new JLabelMe();
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setText("Tipo Retencion :");
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JComboBoxMe();
		jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas = new JLabelMe();
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setText("Es Debito :");
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setToolTipText("Es Debito");
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new JCheckBoxMe();
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas=new JTabbedPane();


		this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,75)));

		//this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleRetencionesPorPagarPorCuentas = new RetencionesPorPagarPorCuentasDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retenciones Por Pagar Por Cuentas DATOS");
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas = new RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(jDesktopPane,this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones(),this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas = null;//new RetencionesPorPagarPorCuentasDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRetencionesPorPagarPorCuentas= new GridBagLayout();
		
		
		this.jTableDatosRetencionesPorPagarPorCuentas = new JTableMe();      
		
		String sToolTipRetencionesPorPagarPorCuentas="";
		sToolTipRetencionesPorPagarPorCuentas=RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencionesPorPagarPorCuentas+="(Contabilidad.RetencionesPorPagarPorCuentas)";
		}
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencionesPorPagarPorCuentas+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRetencionesPorPagarPorCuentas.setToolTipText(sToolTipRetencionesPorPagarPorCuentas);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRetencionesPorPagarPorCuentas);
		this.jTableDatosRetencionesPorPagarPorCuentas.setAutoCreateRowSorter(true);
		this.jTableDatosRetencionesPorPagarPorCuentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionAllowed(true);
		this.jTableDatosRetencionesPorPagarPorCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRetencionesPorPagarPorCuentas,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonDuplicarRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonCopiarRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonVerFormRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonCerrarRetencionesPorPagarPorCuentas = new JButtonMe();
		
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas = new JScrollPane();   
        this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Retenciones Por Pagar Por Cuentas";
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencionesPorPagarPorCuentas.setToolTipText("Acciones");
        this.jPanelAccionesRetencionesPorPagarPorCuentas.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas=new ReporteDinamicoJInternalFrame(RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRetencionesPorPagarPorCuentas();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRetencionesPorPagarPorCuentas=new ImportacionJInternalFrame(RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRetencionesPorPagarPorCuentas();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas = new JButtonMe();
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setText("Orden");
		this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionesPorPagarPorCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,false,this);
			
			//this.cargarOrderByRetencionesPorPagarPorCuentas(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencionesPorPagarPorCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,true,this);
			
			//this.cargarOrderByRetencionesPorPagarPorCuentas(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(400,50));//1630
		this.jTableDatosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(400,50));//1630
		this.jTableDatosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(400,50));//1630
		
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRetencionesPorPagarPorCuentas.setText("Nuevo");
		this.jButtonDuplicarRetencionesPorPagarPorCuentas.setText("Duplicar");
		this.jButtonCopiarRetencionesPorPagarPorCuentas.setText("Copiar");
		this.jButtonVerFormRetencionesPorPagarPorCuentas.setText("Ver");
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setText("Guardar");
		this.jButtonCerrarRetencionesPorPagarPorCuentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencionesPorPagarPorCuentas,"nuevo_button","Nuevo",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRetencionesPorPagarPorCuentas,"duplicar_button","Duplicar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRetencionesPorPagarPorCuentas,"copiar_button","Copiar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRetencionesPorPagarPorCuentas,"ver_form","Ver",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas,"nuevorelaciones_button","Nuevo Rel",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas,"guardarcambiostabla_button","Guardar",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencionesPorPagarPorCuentas,"cerrar_button","Salir",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas.setToolTipText("Nuevo"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRetencionesPorPagarPorCuentas.setToolTipText("Duplicar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRetencionesPorPagarPorCuentas.setToolTipText("Copiar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRetencionesPorPagarPorCuentas.setToolTipText("Ver"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.setToolTipText("Nuevo Rel"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setToolTipText("Guardar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencionesPorPagarPorCuentas.setToolTipText("Salir"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencionesPorPagarPorCuentas"));
		
		//DUPLICAR
		sMapKey = "DuplicarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonDuplicarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRetencionesPorPagarPorCuentas"));
		
		//COPIAR
		sMapKey = "CopiarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCopiarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRetencionesPorPagarPorCuentas"));
		
		//VEr FORM
		sMapKey = "VerFormRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonVerFormRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRetencionesPorPagarPorCuentas"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRetencionesPorPagarPorCuentas"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonModificarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRetencionesPorPagarPorCuentas"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencionesPorPagarPorCuentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencionesPorPagarPorCuentas"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2RetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5RetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setName("jPanelParametrosReportesRetencionesPorPagarPorCuentas"); 
		
		this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas.setName("jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setText("Buscar");
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setToolTipText("Buscar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setVisible(false);
		
		
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setText("Procesar");
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setToolTipText("Procesar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setVisible(false);
			
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setText("TIPO");       
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setText("Paginacion");
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.setText("Accion");
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setText("Accion");
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setText("Accion");
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesRetencionesPorPagarPorCuentas = new JLabelMe();
		
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setText("Acciones");		
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setText("Graf.");
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresRetencionesPorPagarPorCuentas = new JButtonMe();
		//this.jButtonAnterioresRetencionesPorPagarPorCuentas.setText("<<");
        this.jButtonAnterioresRetencionesPorPagarPorCuentas.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRetencionesPorPagarPorCuentas,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRetencionesPorPagarPorCuentas = new JButtonMe();
		//this.jButtonSiguientesRetencionesPorPagarPorCuentas.setText(">>");
        this.jButtonSiguientesRetencionesPorPagarPorCuentas.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRetencionesPorPagarPorCuentas,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.setText("Nue");
        this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas,"nuevoguardarcambios_button","Nue",this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRetencionesPorPagarPorCuentas"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRetencionesPorPagarPorCuentas"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonSiguientesRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRetencionesPorPagarPorCuentas"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonAnterioresRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRetencionesPorPagarPorCuentas"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasRetencionesPorPagarPorCuentas();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(this.getWidth(),RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(this.getWidth(),RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(this.getWidth(),RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionesPorPagarPorCuentasBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRetencionesPorPagarPorCuentas = new GridBagLayout();

			this.jPanelPaginacionRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutPaginacionRetencionesPorPagarPorCuentas);						
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonAnterioresRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					
						
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
			
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
						
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonSiguientesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonNuevoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
						
			
			
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			}
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonDuplicarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonCopiarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonVerFormRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.add(this.jButtonCerrarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRetencionesPorPagarPorCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRetencionesPorPagarPorCuentas = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1RetencionesPorPagarPorCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2RetencionesPorPagarPorCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3RetencionesPorPagarPorCuentas = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4RetencionesPorPagarPorCuentas = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosReportesRetencionesPorPagarPorCuentas);
			this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosReportesAccionesRetencionesPorPagarPorCuentas);
			
			
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosAuxiliar1RetencionesPorPagarPorCuentas);
			this.jPanelParametrosAuxiliar2RetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosAuxiliar2RetencionesPorPagarPorCuentas);
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosAuxiliar3RetencionesPorPagarPorCuentas);
			this.jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosAuxiliar4RetencionesPorPagarPorCuentas);
			//this.jPanelParametrosAuxiliar5RetencionesPorPagarPorCuentas.setLayout(gridaBagParametrosAuxiliar2RetencionesPorPagarPorCuentas);			
			
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas.add(this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas.add(this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas.add(this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jPanelParametrosAuxiliar1RetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas.add(this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);																		
			
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas.add(this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jPanelParametrosAuxiliar4RetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jCheckBoxGenerarReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jPanelParametrosAuxiliar2RetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jLabelAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
			
			
			/*
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas.add(this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);															
				
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas.add(this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);															
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas.add(this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jPanelParametrosAuxiliar3RetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRetencionesPorPagarPorCuentas = new GridBagLayout();

			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutDatosRetencionesPorPagarPorCuentas);
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
			
			this.jScrollPanelDatosRetencionesPorPagarPorCuentas.add(this.jTableDatosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setViewportView(this.jTableDatosRetencionesPorPagarPorCuentas);
		this.jTableDatosRetencionesPorPagarPorCuentas.setFillsViewportHeight(true);
		this.jTableDatosRetencionesPorPagarPorCuentas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRetencionesPorPagarPorCuentas= new GridBagLayout();
		this.jPanelAccionesRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutAccionesRetencionesPorPagarPorCuentas);
		
		
		/*	
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
			
		this.jPanelAccionesRetencionesPorPagarPorCuentas.add(this.jButtonNuevoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas= new GridBagLayout();
		gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jLabelid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 0;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);


		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jLabelid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 1;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);


		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 2;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jLabelid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 2;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);


		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 3;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jLabeles_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 3;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 1;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = 4;
		gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =1;
		jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.add(jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas, gridBagConstraintsRetencionesPorPagarPorCuentas);

		jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.addTab("1.-Por Ejercicio Por Periodo Por Tipo Retencion Por Es Debito ", jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
		jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencionesPorPagarPorCuentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencionesPorPagarPorCuentas);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();						
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;		
			//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;		
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;		
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);								
		
		
		/*
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/		
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =0;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
				
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRetencionesPorPagarPorCuentas= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorCuentas = new GridBagLayout();
			this.jPanelBusquedasParametrosRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutBusquedasParametrosRetencionesPorPagarPorCuentas);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
			
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRetencionesPorPagarPorCuentas;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRetencionesPorPagarPorCuentas() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRetencionesPorPagarPorCuentas = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setName("jPanelReporteDinamicoRetencionesPorPagarPorCuentas"); 
		
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutReporteDinamicoRetencionesPorPagarPorCuentas);
		
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setResizable(true);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setClosable(true);
	    this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelColumnasSelectReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas = new JList<Reporte>();
		this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas=new JScrollPane(this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas);
			
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas = new JList<Reporte>();
		this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas=new JScrollPane(this.jListRelacionesSelectReporteRetencionesPorPagarPorCuentas);
			
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas = new JComboBoxMe();
		this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelConGraficoDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jCheckBoxConGraficoDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelColumnaCategoriaGraficoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelColumnaCategoriaValorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jComboBoxColumnaCategoriaValorRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelColumnasValoresGraficoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas = new JList<Reporte>();
		this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas=new JScrollPane(this.jListColumnasValoresGraficoRetencionesPorPagarPorCuentas);
			
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jListColumnasSelectReporteRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jScrollColumnasValoresGraficoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencionesPorPagarPorCuentas.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposGraficosReportesDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Generar EXCEL"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposReportesDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jLabelTiposArchivoReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jComboBoxTiposArchivosReportesDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Generar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencionesPorPagarPorCuentas.add(this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRetencionesPorPagarPorCuentas = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas= new JScrollPane(jPanelReporteDinamicoRetencionesPorPagarPorCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRetencionesPorPagarPorCuentas);
		this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getContentPane().add(this.jScrollPanelReporteDinamicoRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRetencionesPorPagarPorCuentas() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRetencionesPorPagarPorCuentas = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setName("jPanelImportacionRetencionesPorPagarPorCuentas"); 
		
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutImportacionRetencionesPorPagarPorCuentas);
		
		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRetencionesPorPagarPorCuentas= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setResizable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setClosable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setResizable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setClosable(true);
	    this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jLabelArchivoImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRetencionesPorPagarPorCuentas = new JFileChooser();		
		this.jFileChooserImportacionRetencionesPorPagarPorCuentas.setToolTipText("ESCOGER ARCHIVO"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas.setToolTipText("Generar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas = new JLabelMe();

		this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jLabelPathArchivoImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jTextFieldPathArchivoImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas.setToolTipText("Generar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas = new JButtonMe();
		this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencionesPorPagarPorCuentas.add(this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRetencionesPorPagarPorCuentas = new GridBagLayout();
		
		this.jScrollPanelImportacionRetencionesPorPagarPorCuentas= new JScrollPane(jPanelImportacionRetencionesPorPagarPorCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iPosYImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXImportacion;
		this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRetencionesPorPagarPorCuentas);
		this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getContentPane().add(this.jScrollPanelImportacionRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRetencionesPorPagarPorCuentas(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas = new JButtonMe();
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setText("Orden");
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRetencionesPorPagarPorCuentas";
			inputMap = this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRetencionesPorPagarPorCuentas"));
		
		
			GridBagLayout gridaBagLayoutOrderByRetencionesPorPagarPorCuentas = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRetencionesPorPagarPorCuentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setName("jPanelOrderByRetencionesPorPagarPorCuentas"); 
			
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRetencionesPorPagarPorCuentas.setLayout(gridaBagLayoutOrderByRetencionesPorPagarPorCuentas);
			
			
			this.jTableDatosRetencionesPorPagarPorCuentasOrderBy = new JTableMe();        
			this.jTableDatosRetencionesPorPagarPorCuentasOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRetencionesPorPagarPorCuentasOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRetencionesPorPagarPorCuentasOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRetencionesPorPagarPorCuentasOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRetencionesPorPagarPorCuentasOrderBy.setViewportView(this.jTableDatosRetencionesPorPagarPorCuentasOrderBy);
			this.jTableDatosRetencionesPorPagarPorCuentasOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRetencionesPorPagarPorCuentasOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRetencionesPorPagarPorCuentas= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setTitle("Orden");
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setResizable(true);
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setClosable(true);
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones Por Pagar Por Cuentases"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRetencionesPorPagarPorCuentas.ipady =150;
				
			this.jPanelOrderByRetencionesPorPagarPorCuentas.add(jScrollPanelDatosRetencionesPorPagarPorCuentasOrderBy, this.gridBagConstraintsRetencionesPorPagarPorCuentas);//this.jTableDatosRetencionesPorPagarPorCuentasTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas = new JButtonMe();
			this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas.setToolTipText("Cancelar"+" "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRetencionesPorPagarPorCuentas.add(this.jButtonCerrarOrderByRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRetencionesPorPagarPorCuentas = new GridBagLayout();
			
			this.jScrollPanelOrderByRetencionesPorPagarPorCuentas= new JScrollPane(jPanelOrderByRetencionesPorPagarPorCuentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRetencionesPorPagarPorCuentas = new GridBagConstraints();
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridy =iPosYOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencionesPorPagarPorCuentas.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRetencionesPorPagarPorCuentas);
			
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getContentPane().add(this.jScrollPanelOrderByRetencionesPorPagarPorCuentas, this.gridBagConstraintsRetencionesPorPagarPorCuentas);			
		
		} else {
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas = new JButtonMe();
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
		iWidthTableCalculado+=1630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosRetencionesPorPagarPorCuentas.getRowHeight();//RetencionesPorPagarPorCuentasConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.isSelected()) {
					iHeightTable=RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaRetencionesPorPagarPorCuentas.isSelected()) {
					iHeightTable=RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionesPorPagarPorCuentasConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas!=null && this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy()!=null) {
			//if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporcuentass.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<RetencionesPorPagarPorCuentas> TraerRetencionesPorPagarPorCuentasBeans(List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass,ArrayList<Classe> classes)throws Exception {
		try {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentass) {
					
				if(!(RetencionesPorPagarPorCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RetencionesPorPagarPorCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					retencionesporpagarporcuentas.setsDetalleGeneralEntityReporte(RetencionesPorPagarPorCuentasConstantesFunciones.getRetencionesPorPagarPorCuentasDescripcion(retencionesporpagarporcuentas));
										
					retencionesporpagarporcuentas.setes_debito_dato_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getes_debito_datoDescripcion(retencionesporpagarporcuentas));	
					
						
					
				} else  {
							
					//retencionesporpagarporcuentas.setsDetalleGeneralEntityReporte(retencionesporpagarporcuentas.getsDetalleGeneralEntityReporte());
										
				}
				
				//retencionesporpagarporcuentasbeans.add(retencionesporpagarporcuentasbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return retencionesporpagarporcuentass;
    }
	//PARA REPORTES FIN
}
