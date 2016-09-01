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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.CobrarClientesHonomasticosConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class CobrarClientesHonomasticosJInternalFrame extends CobrarClientesHonomasticosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCobrarClientesHonomasticos;
	
	protected JMenuBar jmenuBarCobrarClientesHonomasticos;
	
	protected JMenu jmenuCobrarClientesHonomasticos;
	protected JMenu jmenuDatosCobrarClientesHonomasticos;
	protected JMenu jmenuArchivoCobrarClientesHonomasticos;
	protected JMenu jmenuAccionesCobrarClientesHonomasticos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarClientesHonomasticos;	
	protected GridBagConstraints gridBagConstraintsCobrarClientesHonomasticos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CobrarClientesHonomasticosDetalleFormJInternalFrame jInternalFrameDetalleFormCobrarClientesHonomasticos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCobrarClientesHonomasticos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCobrarClientesHonomasticos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public CobrarClientesHonomasticosSessionBean cobrarclienteshonomasticosSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss;		
	public List<CobrarClientesHonomasticos> cobrarclienteshonomasticossEliminados;	
	public List<CobrarClientesHonomasticos> cobrarclienteshonomasticossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCobrarClientesHonomasticos;		
	protected JButton jButtonAbrirOrderByCobrarClientesHonomasticos;
	
	
	//protected JPanel jPanelOrderByCobrarClientesHonomasticos;
	//public JScrollPane jScrollPanelOrderByCobrarClientesHonomasticos;	
	//protected JButton jButtonCerrarOrderByCobrarClientesHonomasticos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CobrarClientesHonomasticosLogic cobrarclienteshonomasticosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCobrarClientesHonomasticos;
	public JScrollPane jScrollPanelDatosEdicionCobrarClientesHonomasticos;
	public JScrollPane jScrollPanelDatosGeneralCobrarClientesHonomasticos;
    
	
	
	//public JScrollPane jScrollPanelDatosCobrarClientesHonomasticosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCobrarClientesHonomasticos;
	//public JScrollPane jScrollPanelImportacionCobrarClientesHonomasticos;
	
	
	
	protected JPanel jPanelAccionesCobrarClientesHonomasticos;
	
    protected JPanel jPanelPaginacionCobrarClientesHonomasticos;
    protected JPanel jPanelParametrosReportesCobrarClientesHonomasticos;
	protected JPanel jPanelParametrosReportesAccionesCobrarClientesHonomasticos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CobrarClientesHonomasticos;
	protected JPanel jPanelParametrosAuxiliar2CobrarClientesHonomasticos;
	protected JPanel jPanelParametrosAuxiliar3CobrarClientesHonomasticos;
	protected JPanel jPanelParametrosAuxiliar4CobrarClientesHonomasticos;
	//protected JPanel jPanelParametrosAuxiliar5CobrarClientesHonomasticos;
	
	
	
	//protected JPanel jPanelReporteDinamicoCobrarClientesHonomasticos;
	//protected JPanel jPanelImportacionCobrarClientesHonomasticos;
	
	
	public JTable jTableDatosCobrarClientesHonomasticos;
	
	
	
	//public JTable jTableDatosCobrarClientesHonomasticosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCobrarClientesHonomasticos;
	protected JButton jButtonDuplicarCobrarClientesHonomasticos;
	protected JButton jButtonCopiarCobrarClientesHonomasticos;
	protected JButton jButtonVerFormCobrarClientesHonomasticos;
	protected JButton jButtonNuevoRelacionesCobrarClientesHonomasticos;
	protected JButton jButtonModificarCobrarClientesHonomasticos;
	
    protected JButton jButtonGuardarCambiosTablaCobrarClientesHonomasticos;
	protected JButton jButtonCerrarCobrarClientesHonomasticos;
	
	
	protected JButton jButtonRecargarInformacionCobrarClientesHonomasticos;
	protected JButton jButtonProcesarInformacionCobrarClientesHonomasticos;
	
	
	protected JButton jButtonAnterioresCobrarClientesHonomasticos;
	protected JButton jButtonSiguientesCobrarClientesHonomasticos;
	protected JButton jButtonNuevoGuardarCambiosCobrarClientesHonomasticos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCobrarClientesHonomasticos;
	//protected JButton jButtonCerrarReporteDinamicoCobrarClientesHonomasticos;
	//protected JButton jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos;	
	
	
	
	//protected JButton jButtonAbrirImportacionCobrarClientesHonomasticos;
	//protected JButton jButtonGenerarImportacionCobrarClientesHonomasticos;
	//protected JButton jButtonCerrarImportacionCobrarClientesHonomasticos;
	//protected JFileChooser jFileChooserImportacionCobrarClientesHonomasticos;
	//protected File fileImportacionCobrarClientesHonomasticos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarClientesHonomasticos;
	protected JButton jButtonDuplicarToolBarCobrarClientesHonomasticos;
	protected JButton jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos;
	
	
	public JButton jButtonGuardarCambiosToolBarCobrarClientesHonomasticos;
	protected JButton jButtonCopiarToolBarCobrarClientesHonomasticos;
	protected JButton jButtonVerFormToolBarCobrarClientesHonomasticos;
	public JButton jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarClientesHonomasticos;
	protected JButton jButtonCerrarToolBarCobrarClientesHonomasticos;
	
	protected JButton jButtonRecargarInformacionToolBarCobrarClientesHonomasticos;
	protected JButton jButtonProcesarInformacionToolBarCobrarClientesHonomasticos;
	protected JButton jButtonAnterioresToolBarCobrarClientesHonomasticos;
	protected JButton jButtonSiguientesToolBarCobrarClientesHonomasticos;
	protected JButton jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos;
	protected JButton jButtonAbrirOrderByToolBarCobrarClientesHonomasticos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDuplicarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemNuevoRelacionesCobrarClientesHonomasticos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemCopiarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemVerFormCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemCerrarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDetalleCerrarCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos;
	
	protected JMenuItem jMenuItemRecargarInformacionCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemProcesarInformacionCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemAnterioresCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemSiguientesCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemAbrirOrderByCobrarClientesHonomasticos;
	protected JMenuItem jMenuItemMostrarOcultarCobrarClientesHonomasticos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarClientesHonomasticos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCobrarClientesHonomasticos;
	protected JCheckBox jCheckBoxSeleccionadosCobrarClientesHonomasticos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos;
	protected JCheckBox jCheckBoxConGraficoReporteCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCobrarClientesHonomasticos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCobrarClientesHonomasticos;
	protected JTextField jTextFieldValorCampoGeneralCobrarClientesHonomasticos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCobrarClientesHonomasticos;
	//public JList<Reporte> jListColumnasSelectReporteCobrarClientesHonomasticos;
	//public JScrollPane jScrollColumnasSelectReporteCobrarClientesHonomasticos;
	
	//public JLabel jLabelRelacionesSelectReporteCobrarClientesHonomasticos;
	//public JList<Reporte> jListRelacionesSelectReporteCobrarClientesHonomasticos;
	//public JScrollPane jScrollRelacionesSelectReporteCobrarClientesHonomasticos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCobrarClientesHonomasticos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos;
	//public JLabel jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos;
	
		
	//public JLabel jLabelArchivoImportacionCobrarClientesHonomasticos;	
	//public JLabel jLabelPathArchivoImportacionCobrarClientesHonomasticos;
	//protected JTextField jTextFieldPathArchivoImportacionCobrarClientesHonomasticos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCobrarClientesHonomasticos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCobrarClientesHonomasticos;
	
	//public JLabel jLabelColumnaCategoriaValorCobrarClientesHonomasticos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCobrarClientesHonomasticos;
	
	//public JLabel jLabelColumnasValoresGraficoCobrarClientesHonomasticos;
	//public JList<Reporte> jListColumnasValoresGraficoCobrarClientesHonomasticos;
	//public JScrollPane jScrollColumnasValoresGraficoCobrarClientesHonomasticos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCobrarClientesHonomasticos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCobrarClientesHonomasticos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCobrarClientesHonomasticos;
	public JPanel jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	
	public JPanel jPanelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JLabel jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JLabel jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JLabel jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JLabel jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosUpdate= new JButtonMe();
	public JButton jButtonid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JLabel jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	//public JFormattedTextField jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;

	public JDateChooser jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos;
	public JButton jButtonfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticosBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CobrarClientesHonomasticosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarClientesHonomasticosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCobrarClientesHonomasticos)	{
		this.jButtonRecargarInformacionCobrarClientesHonomasticos = jButtonRecargarInformacionCobrarClientesHonomasticos;
	}
	
	public JButton getjButtonProcesarInformacionCobrarClientesHonomasticos() {
		return this.jButtonProcesarInformacionCobrarClientesHonomasticos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarClientesHonomasticos)	{
		this.jButtonProcesarInformacionCobrarClientesHonomasticos = jButtonProcesarInformacionCobrarClientesHonomasticos;
	}
	
	
	public JButton getjButtonRecargarInformacionCobrarClientesHonomasticos() {
		return this.jButtonRecargarInformacionCobrarClientesHonomasticos;
	}
	
	
	public List<CobrarClientesHonomasticos> getcobrarclienteshonomasticoss() {
		return this.cobrarclienteshonomasticoss;
	}

	public void setcobrarclienteshonomasticoss(List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss) {
		this.cobrarclienteshonomasticoss = cobrarclienteshonomasticoss;
	}
	
	public List<CobrarClientesHonomasticos> getcobrarclienteshonomasticossAux() {
		return this.cobrarclienteshonomasticossAux;
	}

	public void setcobrarclienteshonomasticossAux(List<CobrarClientesHonomasticos> cobrarclienteshonomasticossAux) {
		this.cobrarclienteshonomasticossAux = cobrarclienteshonomasticossAux;
	}
	
	public List<CobrarClientesHonomasticos> getcobrarclienteshonomasticossEliminados() {
		return this.cobrarclienteshonomasticossEliminados;
	}

	public void setCobrarClientesHonomasticossEliminados(List<CobrarClientesHonomasticos> cobrarclienteshonomasticossEliminados) {
		this.cobrarclienteshonomasticossEliminados = cobrarclienteshonomasticossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCobrarClientesHonomasticos() {
		return jComboBoxTiposSeleccionarCobrarClientesHonomasticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposSeleccionarCobrarClientesHonomasticos) {
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos = jComboBoxTiposSeleccionarCobrarClientesHonomasticos;
	}
	
	public void setBorderResaltarTiposSeleccionarCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCobrarClientesHonomasticos() {
		return jTextFieldValorCampoGeneralCobrarClientesHonomasticos;
	}

	public void setjTextFieldValorCampoGeneralCobrarClientesHonomasticos(
			JTextField jTextFieldValorCampoGeneralCobrarClientesHonomasticos) {
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos = jTextFieldValorCampoGeneralCobrarClientesHonomasticos;
	}

	public void setBorderResaltarValorCampoGeneralCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCobrarClientesHonomasticos() {
		return this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos;
	}

	public void setjCheckBoxSeleccionarTodosCobrarClientesHonomasticos(
			JCheckBox jCheckBoxSeleccionarTodosCobrarClientesHonomasticos) {
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos = jCheckBoxSeleccionarTodosCobrarClientesHonomasticos;
	}

	public void setBorderResaltarSeleccionarTodosCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCobrarClientesHonomasticos() {
		return this.jCheckBoxSeleccionadosCobrarClientesHonomasticos;
	}

	public void setjCheckBoxSeleccionadosCobrarClientesHonomasticos(
			JCheckBox jCheckBoxSeleccionadosCobrarClientesHonomasticos) {
		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos = jCheckBoxSeleccionadosCobrarClientesHonomasticos;
	}
	
	public void setBorderResaltarSeleccionadosCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposArchivosReportesCobrarClientesHonomasticos) {
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos = jComboBoxTiposArchivosReportesCobrarClientesHonomasticos;
	}

	public void setBorderResaltarTiposArchivosReportesCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposReportesCobrarClientesHonomasticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposReportesCobrarClientesHonomasticos) {
		this.jComboBoxTiposReportesCobrarClientesHonomasticos = jComboBoxTiposReportesCobrarClientesHonomasticos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCobrarClientesHonomasticos() {
	//	return jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCobrarClientesHonomasticos(
	//		JComboBox jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos) {
	//	this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos = jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos() {
	//	return jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos = jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos;
	//}
	
	public void setBorderResaltarTiposReportesCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposGraficosReportesCobrarClientesHonomasticos) {
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos = jComboBoxTiposGraficosReportesCobrarClientesHonomasticos;
	}
	
	public void setBorderResaltarTiposGraficosReportesCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCobrarClientesHonomasticos() {
		return this.jComboBoxTiposPaginacionCobrarClientesHonomasticos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposPaginacionCobrarClientesHonomasticos) {
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos = jComboBoxTiposPaginacionCobrarClientesHonomasticos;
	}
	
	public void setBorderResaltarTiposPaginacionCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposRelacionesCobrarClientesHonomasticos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarClientesHonomasticos() {
		return this.jComboBoxTiposAccionesCobrarClientesHonomasticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposRelacionesCobrarClientesHonomasticos) {
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos = jComboBoxTiposRelacionesCobrarClientesHonomasticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarClientesHonomasticos(
			JComboBox jComboBoxTiposAccionesCobrarClientesHonomasticos) {
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos = jComboBoxTiposAccionesCobrarClientesHonomasticos;
	}
	
	public void setBorderResaltarTiposRelacionesCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCobrarClientesHonomasticos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCobrarClientesHonomasticos() {
	//	return jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos;
	//}

	//public void setjCheckBoxConGraficoDinamicoCobrarClientesHonomasticos(
	//		JCheckBox jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos) {
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos = jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCobrarClientesHonomasticos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCobrarClientesHonomasticos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos .setBorder(borderResaltar);		
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
		this.cobrarclienteshonomasticosSessionBean=new CobrarClientesHonomasticosSessionBean();
		
		this.cobrarclienteshonomasticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclienteshonomasticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarClientesHonomasticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarClientesHonomasticosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Clientes Honomasticos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
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
		
		CobrarClientesHonomasticosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CobrarClientesHonomasticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCobrarClientesHonomasticos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"nuevo","nuevo","Nuevo"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"duplicar","duplicar","Duplicar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"copiar","copiar","Copiar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"ver_form","ver_form","Ver"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"recargar","recargar","Buscar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCobrarClientesHonomasticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCobrarClientesHonomasticos,this.jTtoolBarCobrarClientesHonomasticos,
							"cerrar","cerrar","Salir"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCobrarClientesHonomasticos;
			
				this.jButtonProcesarInformacionToolBarCobrarClientesHonomasticos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCobrarClientesHonomasticos;
				
		//protected JButton jButtonModificarToolBarCobrarClientesHonomasticos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCobrarClientesHonomasticos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCobrarClientesHonomasticos=new JMenuMe("General");
		this.jmenuArchivoCobrarClientesHonomasticos=new JMenuMe("Archivo");
		this.jmenuAccionesCobrarClientesHonomasticos=new JMenuMe("Acciones");
		this.jmenuDatosCobrarClientesHonomasticos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarClientesHonomasticos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarClientesHonomasticos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarClientesHonomasticos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCobrarClientesHonomasticos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCobrarClientesHonomasticos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCobrarClientesHonomasticos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarClientesHonomasticos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCobrarClientesHonomasticos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCobrarClientesHonomasticos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCobrarClientesHonomasticos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCobrarClientesHonomasticos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCobrarClientesHonomasticos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCobrarClientesHonomasticos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarClientesHonomasticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarClientesHonomasticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarClientesHonomasticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCobrarClientesHonomasticos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCobrarClientesHonomasticos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCobrarClientesHonomasticos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCobrarClientesHonomasticos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCobrarClientesHonomasticos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCobrarClientesHonomasticos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCobrarClientesHonomasticos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCobrarClientesHonomasticos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCobrarClientesHonomasticos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCobrarClientesHonomasticos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCobrarClientesHonomasticos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCobrarClientesHonomasticos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCobrarClientesHonomasticos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCobrarClientesHonomasticos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCobrarClientesHonomasticos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarClientesHonomasticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarClientesHonomasticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarClientesHonomasticos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCobrarClientesHonomasticos.add(this.jMenuItemCerrarCobrarClientesHonomasticos);
			
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemNuevoCobrarClientesHonomasticos);
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemNuevoGuardarCambiosCobrarClientesHonomasticos);
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemNuevoRelacionesCobrarClientesHonomasticos);
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemGuardarCambiosTablaCobrarClientesHonomasticos);		
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemDuplicarCobrarClientesHonomasticos);		
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemCopiarCobrarClientesHonomasticos);		
			this.jmenuAccionesCobrarClientesHonomasticos.add(this.jMenuItemVerFormCobrarClientesHonomasticos);		
			
			this.jmenuDatosCobrarClientesHonomasticos.add(this.jMenuItemRecargarInformacionCobrarClientesHonomasticos);				
			this.jmenuDatosCobrarClientesHonomasticos.add(this.jMenuItemAnterioresCobrarClientesHonomasticos);				
			this.jmenuDatosCobrarClientesHonomasticos.add(this.jMenuItemSiguientesCobrarClientesHonomasticos);				
			this.jmenuDatosCobrarClientesHonomasticos.add(this.jMenuItemAbrirOrderByCobrarClientesHonomasticos);				
			this.jmenuDatosCobrarClientesHonomasticos.add(this.jMenuItemMostrarOcultarCobrarClientesHonomasticos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCobrarClientesHonomasticos.add(this.jMenuItemGuardarCambiosCobrarClientesHonomasticos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCobrarClientesHonomasticos.add(this.jmenuArchivoCobrarClientesHonomasticos);		
			this.jmenuBarCobrarClientesHonomasticos.add(this.jmenuAccionesCobrarClientesHonomasticos);		
			this.jmenuBarCobrarClientesHonomasticos.add(this.jmenuDatosCobrarClientesHonomasticos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCobrarClientesHonomasticos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCobrarClientesHonomasticos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Buscar Por Pais Por Region Por Provincia Por Ciudad Por Fecha Nacimiento ");
		this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JButtonMe();
		this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Buscar Por Pais Por Region Por Provincia Por Ciudad Por Fecha Nacimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,"buscar_button","Buscar Por Pais Por Region Por Provincia Por Ciudad Por Fecha Nacimiento ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos = new JLabelMe();
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Pais :");
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Pais");
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos = new JLabelMe();
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Region :");
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Region");
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos = new JLabelMe();
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Provincia :");
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Provincia");
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos = new JLabelMe();
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Ciudad :");
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Ciudad");
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JComboBoxMe();
		jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos = new JLabelMe();
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText("Fecha Nacimiento :");
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setToolTipText("Fecha Nacimiento");
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new JDateChooser();
		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setDate(new Date());
		jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasCobrarClientesHonomasticos=new JTabbedPane();


		this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));
		this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,100)));

		//this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCobrarClientesHonomasticos = new CobrarClientesHonomasticosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cobrar Clientes Honomasticos DATOS");
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos = new CobrarClientesHonomasticosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones(),this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCobrarClientesHonomasticos = null;//new CobrarClientesHonomasticosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarClientesHonomasticos= new GridBagLayout();
		
		
		this.jTableDatosCobrarClientesHonomasticos = new JTableMe();      
		
		String sToolTipCobrarClientesHonomasticos="";
		sToolTipCobrarClientesHonomasticos=CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarClientesHonomasticos+="(Cartera.CobrarClientesHonomasticos)";
		}
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarClientesHonomasticos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCobrarClientesHonomasticos.setToolTipText(sToolTipCobrarClientesHonomasticos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCobrarClientesHonomasticos);
		this.jTableDatosCobrarClientesHonomasticos.setAutoCreateRowSorter(true);
		this.jTableDatosCobrarClientesHonomasticos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCobrarClientesHonomasticos.setRowSelectionAllowed(true);
		this.jTableDatosCobrarClientesHonomasticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCobrarClientesHonomasticos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonDuplicarCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonCopiarCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonVerFormCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonCerrarCobrarClientesHonomasticos = new JButtonMe();
		
		this.jScrollPanelDatosCobrarClientesHonomasticos = new JScrollPane();   
        this.jScrollPanelDatosGeneralCobrarClientesHonomasticos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Clientes Honomasticos";
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarClientesHonomasticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarClientesHonomasticos.setToolTipText("Acciones");
        this.jPanelAccionesCobrarClientesHonomasticos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos=new ReporteDinamicoJInternalFrame(CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCobrarClientesHonomasticos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCobrarClientesHonomasticos=new ImportacionJInternalFrame(CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCobrarClientesHonomasticos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCobrarClientesHonomasticos = new JButtonMe();
		
		this.jButtonAbrirOrderByCobrarClientesHonomasticos.setText("Orden");
		this.jButtonAbrirOrderByCobrarClientesHonomasticos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesHonomasticos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesHonomasticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesHonomasticos,false,this);
			
			//this.cargarOrderByCobrarClientesHonomasticos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCobrarClientesHonomasticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesHonomasticos,true,this);
			
			//this.cargarOrderByCobrarClientesHonomasticos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCobrarClientesHonomasticos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosCobrarClientesHonomasticos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosCobrarClientesHonomasticos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosCobrarClientesHonomasticos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesHonomasticos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCobrarClientesHonomasticos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCobrarClientesHonomasticos.setText("Nuevo");
		this.jButtonDuplicarCobrarClientesHonomasticos.setText("Duplicar");
		this.jButtonCopiarCobrarClientesHonomasticos.setText("Copiar");
		this.jButtonVerFormCobrarClientesHonomasticos.setText("Ver");
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setText("Guardar");
		this.jButtonCerrarCobrarClientesHonomasticos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarClientesHonomasticos,"nuevo_button","Nuevo",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCobrarClientesHonomasticos,"duplicar_button","Duplicar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCobrarClientesHonomasticos,"copiar_button","Copiar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCobrarClientesHonomasticos,"ver_form","Ver",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCobrarClientesHonomasticos,"nuevorelaciones_button","Nuevo Rel",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos,"guardarcambiostabla_button","Guardar",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarClientesHonomasticos,"cerrar_button","Salir",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCobrarClientesHonomasticos.setToolTipText("Nuevo"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCobrarClientesHonomasticos.setToolTipText("Duplicar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCobrarClientesHonomasticos.setToolTipText("Copiar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCobrarClientesHonomasticos.setToolTipText("Ver"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.setToolTipText("Nuevo Rel"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.setToolTipText("Guardar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarClientesHonomasticos.setToolTipText("Salir"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarClientesHonomasticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarClientesHonomasticos"));
		
		//DUPLICAR
		sMapKey = "DuplicarCobrarClientesHonomasticos";
		inputMap = this.jButtonDuplicarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCobrarClientesHonomasticos"));
		
		//COPIAR
		sMapKey = "CopiarCobrarClientesHonomasticos";
		inputMap = this.jButtonCopiarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCobrarClientesHonomasticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCobrarClientesHonomasticos"));
		
		//VEr FORM
		sMapKey = "VerFormCobrarClientesHonomasticos";
		inputMap = this.jButtonVerFormCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCobrarClientesHonomasticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCobrarClientesHonomasticos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCobrarClientesHonomasticos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCobrarClientesHonomasticos";
		inputMap = this.jButtonModificarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCobrarClientesHonomasticos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCobrarClientesHonomasticos";
		inputMap = this.jButtonCerrarCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarClientesHonomasticos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarClientesHonomasticos";
		inputMap = this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarClientesHonomasticos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCobrarClientesHonomasticos.setName("jPanelParametrosReportesCobrarClientesHonomasticos"); 
		
		this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos.setName("jPanelParametrosReportesAccionesCobrarClientesHonomasticos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setText("Buscar");
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setToolTipText("Buscar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCobrarClientesHonomasticos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setVisible(false);
		
		
		this.jButtonProcesarInformacionCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setText("Procesar");
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setToolTipText("Procesar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setVisible(false);
			
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setText("TIPO");       
		this.jComboBoxTiposReportesCobrarClientesHonomasticos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setText("Paginacion");
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.setText("Accion");
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setText("Accion");
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setText("Accion");
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCobrarClientesHonomasticos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCobrarClientesHonomasticos = new JLabelMe();
		
		this.jLabelAccionesCobrarClientesHonomasticos.setText("Acciones");		
		this.jLabelAccionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setText("Graf.");
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCobrarClientesHonomasticos = new JButtonMe();
		//this.jButtonAnterioresCobrarClientesHonomasticos.setText("<<");
        this.jButtonAnterioresCobrarClientesHonomasticos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCobrarClientesHonomasticos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCobrarClientesHonomasticos = new JButtonMe();
		//this.jButtonSiguientesCobrarClientesHonomasticos.setText(">>");
        this.jButtonSiguientesCobrarClientesHonomasticos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCobrarClientesHonomasticos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.setText("Nue");
        this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos,"nuevoguardarcambios_button","Nue",this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCobrarClientesHonomasticos";
		inputMap = this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCobrarClientesHonomasticos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCobrarClientesHonomasticos";
		inputMap = this.jButtonRecargarInformacionCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCobrarClientesHonomasticos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCobrarClientesHonomasticos";
		inputMap = this.jButtonSiguientesCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCobrarClientesHonomasticos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCobrarClientesHonomasticos";
		inputMap = this.jButtonAnterioresCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCobrarClientesHonomasticos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCobrarClientesHonomasticos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(this.getWidth(),CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(this.getWidth(),CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(this.getWidth(),CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CobrarClientesHonomasticosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCobrarClientesHonomasticos = new GridBagLayout();

			this.jPanelPaginacionCobrarClientesHonomasticos.setLayout(gridaBagLayoutPaginacionCobrarClientesHonomasticos);						
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonAnterioresCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					
						
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
			
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonNuevoGuardarCambiosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
						
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonSiguientesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonNuevoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
						
			
			
			if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
				this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonGuardarCambiosTablaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			}
			
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonDuplicarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonCopiarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonVerFormCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCobrarClientesHonomasticos.add(this.jButtonCerrarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
		
		
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCobrarClientesHonomasticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesHonomasticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCobrarClientesHonomasticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCobrarClientesHonomasticos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCobrarClientesHonomasticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCobrarClientesHonomasticos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CobrarClientesHonomasticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CobrarClientesHonomasticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CobrarClientesHonomasticos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CobrarClientesHonomasticos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCobrarClientesHonomasticos.setLayout(gridaBagParametrosReportesCobrarClientesHonomasticos);
			this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos.setLayout(gridaBagParametrosReportesAccionesCobrarClientesHonomasticos);
			
			
			this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos.setLayout(gridaBagParametrosAuxiliar1CobrarClientesHonomasticos);
			this.jPanelParametrosAuxiliar2CobrarClientesHonomasticos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesHonomasticos);
			this.jPanelParametrosAuxiliar3CobrarClientesHonomasticos.setLayout(gridaBagParametrosAuxiliar3CobrarClientesHonomasticos);
			this.jPanelParametrosAuxiliar4CobrarClientesHonomasticos.setLayout(gridaBagParametrosAuxiliar4CobrarClientesHonomasticos);
			//this.jPanelParametrosAuxiliar5CobrarClientesHonomasticos.setLayout(gridaBagParametrosAuxiliar2CobrarClientesHonomasticos);			
			
			
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jButtonRecargarInformacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos.add(this.jComboBoxTiposPaginacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos.add(this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos.add(this.jComboBoxTiposArchivosReportesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jPanelParametrosAuxiliar1CobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CobrarClientesHonomasticos.add(this.jComboBoxTiposReportesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jPanelParametrosAuxiliar4CobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jComboBoxTiposReportesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jCheckBoxGenerarReporteCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jPanelParametrosAuxiliar2CobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jLabelAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
				this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jButtonAbrirOrderByCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jComboBoxTiposSeleccionarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
			
			
			/*
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesHonomasticos.add(this.jCheckBoxSeleccionarTodosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);															
				
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CobrarClientesHonomasticos.add(this.jCheckBoxSeleccionadosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jPanelParametrosAuxiliar3CobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCobrarClientesHonomasticos.add(this.jComboBoxTiposAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCobrarClientesHonomasticos = new GridBagLayout();

			this.jScrollPanelDatosCobrarClientesHonomasticos.setLayout(gridaBagLayoutDatosCobrarClientesHonomasticos);
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
			
			this.jScrollPanelDatosCobrarClientesHonomasticos.add(this.jTableDatosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCobrarClientesHonomasticos.setViewportView(this.jTableDatosCobrarClientesHonomasticos);
		this.jTableDatosCobrarClientesHonomasticos.setFillsViewportHeight(true);
		this.jTableDatosCobrarClientesHonomasticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCobrarClientesHonomasticos= new GridBagLayout();
		this.jPanelAccionesCobrarClientesHonomasticos.setLayout(gridaBagLayoutAccionesCobrarClientesHonomasticos);
		
		
		/*	
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
			
		this.jPanelAccionesCobrarClientesHonomasticos.add(this.jButtonNuevoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos= new GridBagLayout();
		gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.setLayout(gridaBagLayoutBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jLabelid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 0;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jComboBoxid_paisBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);


		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jLabelid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 1;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jComboBoxid_regionBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);


		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 2;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jLabelid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 2;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jComboBoxid_provinciaBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);


		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 3;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jLabelid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 3;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jComboBoxid_ciudadBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);


		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 4;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jLabelfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 4;
		gridBagConstraintsCobrarClientesHonomasticos.gridx = 1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jDateChooserfecha_nacimientoBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCobrarClientesHonomasticos.gridy = 5;
		gridBagConstraintsCobrarClientesHonomasticos.gridx =1;
		jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos.add(jButtonBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos, gridBagConstraintsCobrarClientesHonomasticos);

		jTabbedPaneBusquedasCobrarClientesHonomasticos.addTab("1.-Por Pais Por Region Por Provincia Por Ciudad Por Fecha Nacimiento ", jPanelBusquedaCobrarClientesHonomasticosCobrarClientesHonomasticos);
		jTabbedPaneBusquedasCobrarClientesHonomasticos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarClientesHonomasticos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarClientesHonomasticos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();						
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;		
			//this.gridBagConstraintsCobrarClientesHonomasticos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;		
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;		
			this.gridBagConstraintsCobrarClientesHonomasticos.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCobrarClientesHonomasticos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);								
		
		
		/*
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/		
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =0;
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarClientesHonomasticos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
				
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CobrarClientesHonomasticosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCobrarClientesHonomasticos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarClientesHonomasticos = new GridBagLayout();
			this.jPanelBusquedasParametrosCobrarClientesHonomasticos.setLayout(gridaBagLayoutBusquedasParametrosCobrarClientesHonomasticos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
			
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCobrarClientesHonomasticos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCobrarClientesHonomasticos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCobrarClientesHonomasticos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setName("jPanelReporteDinamicoCobrarClientesHonomasticos"); 
		
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.setLayout(gridaBagLayoutReporteDinamicoCobrarClientesHonomasticos);
		
		
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesHonomasticos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setResizable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setClosable(true);
	    this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelColumnasSelectReporteCobrarClientesHonomasticos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jLabelColumnasSelectReporteCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCobrarClientesHonomasticos = new JList<Reporte>();
		this.jListColumnasSelectReporteCobrarClientesHonomasticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCobrarClientesHonomasticos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCobrarClientesHonomasticos=new JScrollPane(this.jListColumnasSelectReporteCobrarClientesHonomasticos);
			
			this.jScrollColumnasSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jListColumnasSelectReporteCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jScrollColumnasSelectReporteCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelRelacionesSelectReporteCobrarClientesHonomasticos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCobrarClientesHonomasticos = new JList<Reporte>();
		this.jListRelacionesSelectReporteCobrarClientesHonomasticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCobrarClientesHonomasticos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCobrarClientesHonomasticos=new JScrollPane(this.jListRelacionesSelectReporteCobrarClientesHonomasticos);
			
			this.jScrollRelacionesSelectReporteCobrarClientesHonomasticos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesHonomasticos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCobrarClientesHonomasticos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCobrarClientesHonomasticos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCobrarClientesHonomasticos = new JComboBoxMe();
		this.jListColumnasValoresGraficoCobrarClientesHonomasticos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jLabelGenerarExcelReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos.setToolTipText("Generar EXCEL"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		//this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jButtonGenerarExcelReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jComboBoxTiposReportesDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jLabelTiposArchivoReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jComboBoxTiposArchivosReportesDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos.setToolTipText("Generar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jButtonGenerarReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos.setToolTipText("Cancelar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCobrarClientesHonomasticos.add(this.jButtonCerrarReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCobrarClientesHonomasticos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos= new JScrollPane(jPanelReporteDinamicoCobrarClientesHonomasticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCobrarClientesHonomasticos);
		this.jInternalFrameReporteDinamicoCobrarClientesHonomasticos.getContentPane().add(this.jScrollPanelReporteDinamicoCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCobrarClientesHonomasticos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCobrarClientesHonomasticos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCobrarClientesHonomasticos.setName("jPanelImportacionCobrarClientesHonomasticos"); 
		
		this.jPanelImportacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCobrarClientesHonomasticos.setLayout(gridaBagLayoutImportacionCobrarClientesHonomasticos);
		
		
		this.jInternalFrameImportacionCobrarClientesHonomasticos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCobrarClientesHonomasticos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCobrarClientesHonomasticos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCobrarClientesHonomasticos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setResizable(true);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setClosable(true);
	    this.jInternalFrameImportacionCobrarClientesHonomasticos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelArchivoImportacionCobrarClientesHonomasticos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jLabelArchivoImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCobrarClientesHonomasticos = new JFileChooser();		
		this.jFileChooserImportacionCobrarClientesHonomasticos.setToolTipText("ESCOGER ARCHIVO"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonAbrirImportacionCobrarClientesHonomasticos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCobrarClientesHonomasticos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCobrarClientesHonomasticos.setToolTipText("Generar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jButtonAbrirImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCobrarClientesHonomasticos = new JLabelMe();

		this.jLabelPathArchivoImportacionCobrarClientesHonomasticos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;		
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jLabelPathArchivoImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCobrarClientesHonomasticos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCobrarClientesHonomasticos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesHonomasticos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCobrarClientesHonomasticos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jTextFieldPathArchivoImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonGenerarImportacionCobrarClientesHonomasticos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCobrarClientesHonomasticos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCobrarClientesHonomasticos.setToolTipText("Generar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jButtonGenerarImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCobrarClientesHonomasticos = new JButtonMe();
		this.jButtonCerrarImportacionCobrarClientesHonomasticos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCobrarClientesHonomasticos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCobrarClientesHonomasticos.setToolTipText("Cancelar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCobrarClientesHonomasticos.add(this.jButtonCerrarImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCobrarClientesHonomasticos = new GridBagLayout();
		
		this.jScrollPanelImportacionCobrarClientesHonomasticos= new JScrollPane(jPanelImportacionCobrarClientesHonomasticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
		this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iPosYImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXImportacion;
		this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCobrarClientesHonomasticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCobrarClientesHonomasticos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCobrarClientesHonomasticos);
		this.jInternalFrameImportacionCobrarClientesHonomasticos.getContentPane().add(this.jScrollPanelImportacionCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCobrarClientesHonomasticos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCobrarClientesHonomasticos = new JButtonMe();
			this.jButtonAbrirOrderByCobrarClientesHonomasticos.setText("Orden");
			this.jButtonAbrirOrderByCobrarClientesHonomasticos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCobrarClientesHonomasticos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCobrarClientesHonomasticos";
			inputMap = this.jButtonAbrirOrderByCobrarClientesHonomasticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCobrarClientesHonomasticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCobrarClientesHonomasticos"));
		
		
			GridBagLayout gridaBagLayoutOrderByCobrarClientesHonomasticos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCobrarClientesHonomasticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCobrarClientesHonomasticos.setName("jPanelOrderByCobrarClientesHonomasticos"); 
			
			this.jPanelOrderByCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCobrarClientesHonomasticos.setLayout(gridaBagLayoutOrderByCobrarClientesHonomasticos);
			
			
			this.jTableDatosCobrarClientesHonomasticosOrderBy = new JTableMe();        
			this.jTableDatosCobrarClientesHonomasticosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCobrarClientesHonomasticosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCobrarClientesHonomasticosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCobrarClientesHonomasticosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCobrarClientesHonomasticosOrderBy.setViewportView(this.jTableDatosCobrarClientesHonomasticosOrderBy);
			this.jTableDatosCobrarClientesHonomasticosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCobrarClientesHonomasticosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCobrarClientesHonomasticos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCobrarClientesHonomasticos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCobrarClientesHonomasticos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCobrarClientesHonomasticos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setTitle("Orden");
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setResizable(true);
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setClosable(true);
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCobrarClientesHonomasticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Clientes Honomasticoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCobrarClientesHonomasticos.ipady =150;
				
			this.jPanelOrderByCobrarClientesHonomasticos.add(jScrollPanelDatosCobrarClientesHonomasticosOrderBy, this.gridBagConstraintsCobrarClientesHonomasticos);//this.jTableDatosCobrarClientesHonomasticosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCobrarClientesHonomasticos = new JButtonMe();
			this.jButtonCerrarOrderByCobrarClientesHonomasticos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCobrarClientesHonomasticos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCobrarClientesHonomasticos.setToolTipText("Cancelar"+" "+CobrarClientesHonomasticosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCobrarClientesHonomasticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCobrarClientesHonomasticos.add(this.jButtonCerrarOrderByCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCobrarClientesHonomasticos = new GridBagLayout();
			
			this.jScrollPanelOrderByCobrarClientesHonomasticos= new JScrollPane(jPanelOrderByCobrarClientesHonomasticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCobrarClientesHonomasticos = new GridBagConstraints();
			this.gridBagConstraintsCobrarClientesHonomasticos.gridy =iPosYOrderBy;
			this.gridBagConstraintsCobrarClientesHonomasticos.gridx =iPosXOrderBy;
			this.gridBagConstraintsCobrarClientesHonomasticos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCobrarClientesHonomasticos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCobrarClientesHonomasticos);
			
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getContentPane().add(this.jScrollPanelOrderByCobrarClientesHonomasticos, this.gridBagConstraintsCobrarClientesHonomasticos);			
		
		} else {
			this.jButtonAbrirOrderByCobrarClientesHonomasticos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.cobrarclienteshonomasticosSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCobrarClientesHonomasticos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosCobrarClientesHonomasticos.getRowHeight();//CobrarClientesHonomasticosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.isSelected()) {
					iHeightTable=CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCobrarClientesHonomasticos.isSelected()) {
					iHeightTable=CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CobrarClientesHonomasticosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCobrarClientesHonomasticos!=null && this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy()!=null) {
			//if(!this.cobrarclienteshonomasticosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCobrarClientesHonomasticos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCobrarClientesHonomasticos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesHonomasticos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCobrarClientesHonomasticos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=cobrarclienteshonomasticosLogic.getCobrarClientesHonomasticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclienteshonomasticoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CobrarClientesHonomasticos> TraerCobrarClientesHonomasticosBeans(List<CobrarClientesHonomasticos> cobrarclienteshonomasticoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(CobrarClientesHonomasticos cobrarclienteshonomasticos:cobrarclienteshonomasticoss) {
					
				if(!(CobrarClientesHonomasticosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CobrarClientesHonomasticosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cobrarclienteshonomasticos.setsDetalleGeneralEntityReporte(CobrarClientesHonomasticosConstantesFunciones.getCobrarClientesHonomasticosDescripcion(cobrarclienteshonomasticos));
										
						
					
						
					
				} else  {
							
					//cobrarclienteshonomasticos.setsDetalleGeneralEntityReporte(cobrarclienteshonomasticos.getsDetalleGeneralEntityReporte());
										
				}
				
				//cobrarclienteshonomasticosbeans.add(cobrarclienteshonomasticosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cobrarclienteshonomasticoss;
    }
	//PARA REPORTES FIN
}
