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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.RetencionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class RetencionJInternalFrame extends RetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	/*
	public JToolBar jTtoolBarRetencion;
	
	protected JMenuBar jmenuBarRetencion;
	
	protected JMenu jmenuRetencion;
	protected JMenu jmenuDatosRetencion;
	protected JMenu jmenuArchivoRetencion;
	protected JMenu jmenuAccionesRetencion;
	
	*/
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRetencion;	
	protected GridBagConstraints gridBagConstraintsRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public RetencionDetalleFormJInternalFrame jInternalFrameDetalleFormRetencion;		
	
	/*
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionRetencion;	
	*/
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencion="";

	protected EstadoRetencionBeanSwingJInternalFrame estadoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoretencion="";
	
	public RetencionSessionBean retencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public CuentaContableSessionBean cuentacontableretencionSessionBean;
	public EstadoRetencionSessionBean estadoretencionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Retencion> retencions;		
	public List<Retencion> retencionsEliminados;	
	public List<Retencion> retencionsAux;
	
	
	/*	
	protected OrderByJInternalFrame jInternalFrameOrderByRetencion;		
	protected JButton jButtonAbrirOrderByRetencion;
	
	
	//protected JPanel jPanelOrderByRetencion;
	//public JScrollPane jScrollPanelOrderByRetencion;	
	//protected JButton jButtonCerrarOrderByRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	*/
	
	public RetencionLogic retencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosRetencion;
	public JScrollPane jScrollPanelDatosEdicionRetencion;
	public JScrollPane jScrollPanelDatosGeneralRetencion;
    
	
	/*
	//public JScrollPane jScrollPanelDatosRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoRetencion;
	//public JScrollPane jScrollPanelImportacionRetencion;
	*/
	
	
	protected JPanel jPanelAccionesRetencion;
	
    protected JPanel jPanelPaginacionRetencion;
    protected JPanel jPanelParametrosReportesRetencion;
	protected JPanel jPanelParametrosReportesAccionesRetencion;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralRetencion;
	protected Integer iXPanelCamposIniciogeneralRetencion=0;
	protected Integer iYPanelCamposIniciogeneralRetencion=0;

	protected JPanel jPanelCamposIniciobeneficiarioRetencion;
	protected Integer iXPanelCamposIniciobeneficiarioRetencion=0;
	protected Integer iYPanelCamposIniciobeneficiarioRetencion=0;;
	
	
	/*
	protected JPanel jPanelParametrosAuxiliar1Retencion;
	protected JPanel jPanelParametrosAuxiliar2Retencion;
	protected JPanel jPanelParametrosAuxiliar3Retencion;
	protected JPanel jPanelParametrosAuxiliar4Retencion;
	//protected JPanel jPanelParametrosAuxiliar5Retencion;
	*/
	
	/*
	//protected JPanel jPanelReporteDinamicoRetencion;
	//protected JPanel jPanelImportacionRetencion;
	*/
	
	public JTable jTableDatosRetencion;
	
	
	/*
	//public JTable jTableDatosRetencionOrderBy;
	*/
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoRetencion;
	protected JButton jButtonDuplicarRetencion;
	protected JButton jButtonCopiarRetencion;
	protected JButton jButtonVerFormRetencion;
	protected JButton jButtonNuevoRelacionesRetencion;
	protected JButton jButtonModificarRetencion;
	
    protected JButton jButtonGuardarCambiosTablaRetencion;
	protected JButton jButtonCerrarRetencion;
	
	/*
	protected JButton jButtonRecargarInformacionRetencion;
	protected JButton jButtonProcesarInformacionRetencion;
	*/
	
	protected JButton jButtonAnterioresRetencion;
	protected JButton jButtonSiguientesRetencion;
	protected JButton jButtonNuevoGuardarCambiosRetencion;
	
	/*
	
	//protected JButton jButtonGenerarReporteDinamicoRetencion;
	//protected JButton jButtonCerrarReporteDinamicoRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionRetencion;
	//protected JButton jButtonGenerarImportacionRetencion;
	//protected JButton jButtonCerrarImportacionRetencion;
	//protected JFileChooser jFileChooserImportacionRetencion;
	//protected File fileImportacionRetencion;
	
	
	*/
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarRetencion;
	protected JButton jButtonDuplicarToolBarRetencion;
	protected JButton jButtonNuevoRelacionesToolBarRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarRetencion;
	protected JButton jButtonCopiarToolBarRetencion;
	protected JButton jButtonVerFormToolBarRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarRetencion;
	protected JButton jButtonCerrarToolBarRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarRetencion;
	protected JButton jButtonProcesarInformacionToolBarRetencion;
	protected JButton jButtonAnterioresToolBarRetencion;
	protected JButton jButtonSiguientesToolBarRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarRetencion;
	protected JButton jButtonAbrirOrderByToolBarRetencion;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoRetencion;
	protected JMenuItem jMenuItemDuplicarRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosRetencion;
	protected JMenuItem jMenuItemCopiarRetencion;
	protected JMenuItem jMenuItemVerFormRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRetencion;
	protected JMenuItem jMenuItemCerrarRetencion;
	protected JMenuItem jMenuItemDetalleCerrarRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionRetencion;
	protected JMenuItem jMenuItemProcesarInformacionRetencion;
	protected JMenuItem jMenuItemAnterioresRetencion;
	protected JMenuItem jMenuItemSiguientesRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRetencion;
	protected JMenuItem jMenuItemAbrirOrderByRetencion;
	protected JMenuItem jMenuItemMostrarOcultarRetencion;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosRetencion;
	protected JCheckBox jCheckBoxSeleccionadosRetencion;
	
	/*
	protected JCheckBox jCheckBoxConAltoMaximoTablaRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarRetencion;
	protected JTextField jTextFieldValorCampoGeneralRetencion;
	*/
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	/*
	
	//public JLabel jLabelColumnasSelectReporteRetencion;
	//public JList<Reporte> jListColumnasSelectReporteRetencion;
	//public JScrollPane jScrollColumnasSelectReporteRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoRetencion;
	
		
	//public JLabel jLabelArchivoImportacionRetencion;	
	//public JLabel jLabelPathArchivoImportacionRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoRetencion;	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	/*
	
	public JTabbedPane jTabbedPaneBusquedasRetencion;
	public JPanel jPanelFK_IdAsientoContableRetencion;
	public JButton jButtonFK_IdAsientoContableRetencion;
	public JPanel jPanelFK_IdClienteRetencion;
	public JButton jButtonFK_IdClienteRetencion;
	public JPanel jPanelFK_IdCuentaContableRetencionRetencion;
	public JButton jButtonFK_IdCuentaContableRetencionRetencion;
	public JPanel jPanelFK_IdEstadoRetencionRetencion;
	public JButton jButtonFK_IdEstadoRetencionRetencion;
	public JPanel jPanelFK_IdFacturaRetencion;
	public JButton jButtonFK_IdFacturaRetencion;
	public JPanel jPanelFK_IdTipoRetencionRetencion;
	public JButton jButtonFK_IdTipoRetencionRetencion;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableRetencion;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableRetencion;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRetencion= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRetencionUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion;
	
	public JPanel jPanelid_clienteFK_IdClienteRetencion;
	public JLabel jLabelid_clienteFK_IdClienteRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteRetencion;
	public JButton jButtonid_clienteFK_IdClienteRetencion= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRetencionUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteRetencion;
	
	public JPanel jPanelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion;
	public JLabel jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion;
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion;
	
	public JPanel jPanelid_estado_retencionFK_IdEstadoRetencionRetencion;
	public JLabel jLabelid_estado_retencionFK_IdEstadoRetencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion;
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionRetencion= new JButtonMe();
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_estado_retencionFK_IdEstadoRetencionRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaRetencion;
	public JLabel jLabelid_facturaFK_IdFacturaRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaRetencion;
	public JButton jButtonid_facturaFK_IdFacturaRetencion= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaRetencionUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaRetencionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaRetencion;
	
	public JPanel jPanelid_tipo_retencionFK_IdTipoRetencionRetencion;
	public JLabel jLabelid_tipo_retencionFK_IdTipoRetencionRetencion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion;
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencion= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionFK_IdTipoRetencionRetencionBusqueda= new JButtonMe();

	
	*/
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public RetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionRetencion)	{
		this.jButtonRecargarInformacionRetencion = jButtonRecargarInformacionRetencion;
	}
	
	public JButton getjButtonProcesarInformacionRetencion() {
		return this.jButtonProcesarInformacionRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRetencion)	{
		this.jButtonProcesarInformacionRetencion = jButtonProcesarInformacionRetencion;
	}
	*/
	
	public JButton getjButtonRecargarInformacionRetencion() {
		return new JButton();
	}
	
	
	public List<Retencion> getretencions() {
		return this.retencions;
	}

	public void setretencions(List<Retencion> retencions) {
		this.retencions = retencions;
	}
	
	public List<Retencion> getretencionsAux() {
		return this.retencionsAux;
	}

	public void setretencionsAux(List<Retencion> retencionsAux) {
		this.retencionsAux = retencionsAux;
	}
	
	public List<Retencion> getretencionsEliminados() {
		return this.retencionsEliminados;
	}

	public void setRetencionsEliminados(List<Retencion> retencionsEliminados) {
		this.retencionsEliminados = retencionsEliminados;
	}
	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarRetencion() {
		return jComboBoxTiposSeleccionarRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarRetencion(
			JComboBox jComboBoxTiposSeleccionarRetencion) {
		this.jComboBoxTiposSeleccionarRetencion = jComboBoxTiposSeleccionarRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralRetencion() {
		return jTextFieldValorCampoGeneralRetencion;
	}

	public void setjTextFieldValorCampoGeneralRetencion(
			JTextField jTextFieldValorCampoGeneralRetencion) {
		this.jTextFieldValorCampoGeneralRetencion = jTextFieldValorCampoGeneralRetencion;
	}

	public void setBorderResaltarValorCampoGeneralRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralRetencion .setBorder(borderResaltar);		
	}		
	*/
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosRetencion() {
		return this.jCheckBoxSeleccionarTodosRetencion;
	}

	public void setjCheckBoxSeleccionarTodosRetencion(
			JCheckBox jCheckBoxSeleccionarTodosRetencion) {
		this.jCheckBoxSeleccionarTodosRetencion = jCheckBoxSeleccionarTodosRetencion;
	}

	public void setBorderResaltarSeleccionarTodosRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionarTodosRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosRetencion() {
		return this.jCheckBoxSeleccionadosRetencion;
	}

	public void setjCheckBoxSeleccionadosRetencion(
			JCheckBox jCheckBoxSeleccionadosRetencion) {
		this.jCheckBoxSeleccionadosRetencion = jCheckBoxSeleccionadosRetencion;
	}
	
	public void setBorderResaltarSeleccionadosRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		/*
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		*/
		this.jCheckBoxSeleccionadosRetencion .setBorder(borderResaltar);		
	}
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesRetencion() {
		return this.jComboBoxTiposArchivosReportesRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesRetencion(
			JComboBox jComboBoxTiposArchivosReportesRetencion) {
		this.jComboBoxTiposArchivosReportesRetencion = jComboBoxTiposArchivosReportesRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesRetencion() {
		return this.jComboBoxTiposReportesRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesRetencion(
			JComboBox jComboBoxTiposReportesRetencion) {
		this.jComboBoxTiposReportesRetencion = jComboBoxTiposReportesRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoRetencion() {
	//	return jComboBoxTiposReportesDinamicoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoRetencion) {
	//	this.jComboBoxTiposReportesDinamicoRetencion = jComboBoxTiposReportesDinamicoRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoRetencion = jComboBoxTiposArchivosReportesDinamicoRetencion;
	//}
	
	public void setBorderResaltarTiposReportesRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesRetencion() {
		return this.jComboBoxTiposGraficosReportesRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesRetencion(
			JComboBox jComboBoxTiposGraficosReportesRetencion) {
		this.jComboBoxTiposGraficosReportesRetencion = jComboBoxTiposGraficosReportesRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionRetencion() {
		return this.jComboBoxTiposPaginacionRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionRetencion(
			JComboBox jComboBoxTiposPaginacionRetencion) {
		this.jComboBoxTiposPaginacionRetencion = jComboBoxTiposPaginacionRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesRetencion() {
		return this.jComboBoxTiposRelacionesRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRetencion() {
		return this.jComboBoxTiposAccionesRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRetencion(
			JComboBox jComboBoxTiposRelacionesRetencion) {
		this.jComboBoxTiposRelacionesRetencion = jComboBoxTiposRelacionesRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRetencion(
			JComboBox jComboBoxTiposAccionesRetencion) {
		this.jComboBoxTiposAccionesRetencion = jComboBoxTiposAccionesRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoRetencion() {
	//	return jCheckBoxConGraficoDinamicoRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoRetencion) {
	//	this.jCheckBoxConGraficoDinamicoRetencion = jCheckBoxConGraficoDinamicoRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoRetencion .setBorder(borderResaltar);		
	//}
	
	
	
	*/		
	
	
	
	
	/*
	public JDesktopPane getJDesktopPane() {
		return jDesktopPane;
	}

	public void setJDesktopPane(JDesktopPane desktopPane) {
		jDesktopPane = desktopPane;
	}
	*/
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.retencionSessionBean=new RetencionSessionBean();
		
		this.retencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.retencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=RetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=RetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
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
		
		RetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Retencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarRetencion,this.jTtoolBarRetencion,
							"nuevo","nuevo","Nuevo"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarRetencion,this.jTtoolBarRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarRetencion,this.jTtoolBarRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarRetencion,this.jTtoolBarRetencion,
							"duplicar","duplicar","Duplicar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarRetencion,this.jTtoolBarRetencion,
							"copiar","copiar","Copiar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarRetencion,this.jTtoolBarRetencion,
							"ver_form","ver_form","Ver"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencion,this.jTtoolBarRetencion,
							"recargar","recargar","Recargar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencion,this.jTtoolBarRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarRetencion,this.jTtoolBarRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarRetencion,this.jTtoolBarRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarRetencion,this.jTtoolBarRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarRetencion,this.jTtoolBarRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarRetencion,this.jTtoolBarRetencion,
							"cerrar","cerrar","Salir"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarRetencion;
			
				this.jButtonProcesarInformacionToolBarRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarRetencion;
				
		//protected JButton jButtonModificarToolBarRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	*/
	
	/*
	public void cargarMenus() {		
		this.jmenuBarRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuRetencion=new JMenuMe("General");
		this.jmenuArchivoRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesRetencion=new JMenuMe("Acciones");
		this.jmenuDatosRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoRetencion.add(this.jMenuItemCerrarRetencion);
			
			this.jmenuAccionesRetencion.add(this.jMenuItemNuevoRetencion);
			this.jmenuAccionesRetencion.add(this.jMenuItemNuevoGuardarCambiosRetencion);
			this.jmenuAccionesRetencion.add(this.jMenuItemNuevoRelacionesRetencion);
			this.jmenuAccionesRetencion.add(this.jMenuItemGuardarCambiosTablaRetencion);		
			this.jmenuAccionesRetencion.add(this.jMenuItemDuplicarRetencion);		
			this.jmenuAccionesRetencion.add(this.jMenuItemCopiarRetencion);		
			this.jmenuAccionesRetencion.add(this.jMenuItemVerFormRetencion);		
			
			this.jmenuDatosRetencion.add(this.jMenuItemRecargarInformacionRetencion);				
			this.jmenuDatosRetencion.add(this.jMenuItemAnterioresRetencion);				
			this.jmenuDatosRetencion.add(this.jMenuItemSiguientesRetencion);				
			this.jmenuDatosRetencion.add(this.jMenuItemAbrirOrderByRetencion);				
			this.jmenuDatosRetencion.add(this.jMenuItemMostrarOcultarRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesRetencion.add(this.jMenuItemGuardarCambiosRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarRetencion.add(this.jmenuArchivoRetencion);		
			this.jmenuBarRetencion.add(this.jmenuAccionesRetencion);		
			this.jmenuBarRetencion.add(this.jmenuDatosRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	*/
	
	
	
	/*
	public void inicializarElementosBusquedasRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableRetencion.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableRetencion= new JButtonMe();
		this.jButtonFK_IdAsientoContableRetencion.setText("Buscar");
		this.jButtonFK_IdAsientoContableRetencion.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableRetencion,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableRetencion = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableRetencion.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableRetencion.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableRetencion= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion.setFocusable(false);

		this.jPanelFK_IdClienteRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteRetencion.setToolTipText("Buscar Por Proveedor ");
		this.jButtonFK_IdClienteRetencion= new JButtonMe();
		this.jButtonFK_IdClienteRetencion.setText("Buscar");
		this.jButtonFK_IdClienteRetencion.setToolTipText("Buscar Por Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteRetencion,"buscar_button","Buscar Por Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteRetencion = new JLabelMe();
		jLabelid_clienteFK_IdClienteRetencion.setText("Proveedor :");
		jLabelid_clienteFK_IdClienteRetencion.setToolTipText("Proveedor");
		jLabelid_clienteFK_IdClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteRetencion= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteRetencion.setFocusable(false);

		this.jPanelFK_IdCuentaContableRetencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableRetencionRetencion.setToolTipText("Buscar Por Cuenta Retencion ");
		this.jButtonFK_IdCuentaContableRetencionRetencion= new JButtonMe();
		this.jButtonFK_IdCuentaContableRetencionRetencion.setText("Buscar");
		this.jButtonFK_IdCuentaContableRetencionRetencion.setToolTipText("Buscar Por Cuenta Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableRetencionRetencion,"buscar_button","Buscar Por Cuenta Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableRetencionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion = new JLabelMe();
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setText("Cuenta Retencion :");
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setToolTipText("Cuenta Retencion");
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion.setFocusable(false);

		this.jPanelFK_IdEstadoRetencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoRetencionRetencion.setToolTipText("Buscar Por Estado Retencion ");
		this.jButtonFK_IdEstadoRetencionRetencion= new JButtonMe();
		this.jButtonFK_IdEstadoRetencionRetencion.setText("Buscar");
		this.jButtonFK_IdEstadoRetencionRetencion.setToolTipText("Buscar Por Estado Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoRetencionRetencion,"buscar_button","Buscar Por Estado Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoRetencionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion = new JLabelMe();
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion.setText("Estado Retencion :");
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion.setToolTipText("Estado Retencion");
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_retencionFK_IdEstadoRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_retencionFK_IdEstadoRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion= new JComboBoxMe();
		jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaRetencion.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaRetencion= new JButtonMe();
		this.jButtonFK_IdFacturaRetencion.setText("Buscar");
		this.jButtonFK_IdFacturaRetencion.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaRetencion,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaRetencion = new JLabelMe();
		jLabelid_facturaFK_IdFacturaRetencion.setText("Factura :");
		jLabelid_facturaFK_IdFacturaRetencion.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaRetencion= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaRetencion= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaRetencion.setFocusable(false);

		this.jPanelFK_IdTipoRetencionRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoRetencionRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		this.jButtonFK_IdTipoRetencionRetencion= new JButtonMe();
		this.jButtonFK_IdTipoRetencionRetencion.setText("Buscar");
		this.jButtonFK_IdTipoRetencionRetencion.setToolTipText("Buscar Por Tipo Retencion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoRetencionRetencion,"buscar_button","Buscar Por Tipo Retencion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoRetencionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion = new JLabelMe();
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion.setText("Tipo Retencion :");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion.setToolTipText("Tipo Retencion");
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_retencionFK_IdTipoRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionFK_IdTipoRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion= new JComboBoxMe();
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		//INDICES BUSQUEDA_FIN		
	}
	*/
	
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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleRetencion = new RetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Retencion DATOS");
			this.jInternalFrameDetalleFormRetencion = new RetencionDetalleFormJInternalFrame(jDesktopPane,this.retencionSessionBean.getConGuardarRelaciones(),this.retencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormRetencion = null;//new RetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutRetencion= new GridBagLayout();
		
		
		this.jTableDatosRetencion = new JTableMe();      
		
		String sToolTipRetencion="";
		sToolTipRetencion=RetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRetencion+="(Facturacion.Retencion)";
		}
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosRetencion.setToolTipText(sToolTipRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosRetencion);
		this.jTableDatosRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosRetencion.setRowSelectionAllowed(true);
		this.jTableDatosRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoRetencion = new JButtonMe();
		this.jButtonDuplicarRetencion = new JButtonMe();
		this.jButtonCopiarRetencion = new JButtonMe();
		this.jButtonVerFormRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaRetencion = new JButtonMe();
		this.jButtonCerrarRetencion = new JButtonMe();
		
		this.jScrollPanelDatosRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobeneficiarioRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Retencion";
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRetencion.setToolTipText("Acciones");
        this.jPanelAccionesRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralRetencion.setName("jPanelCamposFingeneralRetencion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralRetencion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobeneficiarioRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Beneficiario"));
		this.jPanelCamposIniciobeneficiarioRetencion.setName("jPanelCamposFinbeneficiarioRetencion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobeneficiarioRetencion, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			/*
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoRetencion=new ReporteDinamicoJInternalFrame(RetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionRetencion=new ImportacionJInternalFrame(RetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionRetencion();
			
			*/		
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		/*
		this.jButtonAbrirOrderByRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByRetencion.setText("Orden");
		this.jButtonAbrirOrderByRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencion,false,this);
			
			//this.cargarOrderByRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencion,true,this);
			
			//this.cargarOrderByRetencion(true);
		}				
		*/
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosRetencion.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosRetencion.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosRetencion.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoRetencion.setText("Nuevo");
		this.jButtonDuplicarRetencion.setText("Duplicar");
		this.jButtonCopiarRetencion.setText("Copiar");
		this.jButtonVerFormRetencion.setText("Ver");
		this.jButtonNuevoRelacionesRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaRetencion.setText("Guardar");
		this.jButtonCerrarRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRetencion,"nuevo_button","Nuevo",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarRetencion,"duplicar_button","Duplicar",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarRetencion,"copiar_button","Copiar",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormRetencion,"ver_form","Ver",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesRetencion,"nuevorelaciones_button","Nuevo Rel",this.retencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRetencion,"guardarcambiostabla_button","Guardar",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRetencion,"cerrar_button","Salir",this.retencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoRetencion.setToolTipText("Nuevo"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarRetencion.setToolTipText("Duplicar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarRetencion.setToolTipText("Copiar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormRetencion.setToolTipText("Ver"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesRetencion.setToolTipText("Nuevo Rel"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaRetencion.setToolTipText("Guardar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRetencion.setToolTipText("Salir"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRetencion";
		inputMap = this.jButtonNuevoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarRetencion";
		inputMap = this.jButtonDuplicarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarRetencion"));
		
		//COPIAR
		sMapKey = "CopiarRetencion";
		inputMap = this.jButtonCopiarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormRetencion";
		inputMap = this.jButtonVerFormRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesRetencion";
		inputMap = this.jButtonNuevoRelacionesRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarRetencion";
		inputMap = this.jButtonModificarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarRetencion";
		inputMap = this.jButtonCerrarRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRetencion";
		inputMap = this.jButtonGuardarCambiosTablaRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		/*
		this.jPanelParametrosAuxiliar1Retencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Retencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Retencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Retencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Retencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		*/
		
		this.jPanelParametrosReportesRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesRetencion.setName("jPanelParametrosReportesRetencion"); 
		
		this.jPanelParametrosReportesAccionesRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesRetencion.setName("jPanelParametrosReportesAccionesRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		/*
		this.jButtonRecargarInformacionRetencion = new JButtonMe();
		this.jButtonRecargarInformacionRetencion.setText("Recargar");
		this.jButtonRecargarInformacionRetencion.setToolTipText("Recargar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionRetencion,"recargar_button","Recargar");		
		*/
		
		
		/*
		this.jButtonProcesarInformacionRetencion = new JButtonMe();
		this.jButtonProcesarInformacionRetencion.setText("Procesar");
		this.jButtonProcesarInformacionRetencion.setToolTipText("Procesar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionRetencion.setPreferredSize(new Dimension(185,25));		
		*/
		
		
		
		
		
		/*	
		this.jComboBoxTiposArchivosReportesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRetencion.setText("Accion");
		this.jComboBoxTiposAccionesRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		*/

	
		this.jLabelAccionesRetencion = new JLabelMe();
		
		this.jLabelAccionesRetencion.setText("Acciones");		
		this.jLabelAccionesRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		/*
		this.jCheckBoxConAltoMaximoTablaRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteRetencion.setToolTipText("Con Grafico");						
		*/
		
        this.jButtonAnterioresRetencion = new JButtonMe();
		//this.jButtonAnterioresRetencion.setText("<<");
        this.jButtonAnterioresRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesRetencion = new JButtonMe();
		//this.jButtonSiguientesRetencion.setText(">>");
        this.jButtonSiguientesRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosRetencion,"nuevoguardarcambios_button","Nue",this.retencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosRetencion"));
		
		//RECARGAR		
		/*
		sMapKey = "RecargarInformacionRetencion";
		inputMap = this.jButtonRecargarInformacionRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionRetencion"));		
		*/
		
		//SIGUIENTES		
		sMapKey = "SiguientesRetencion";
		inputMap = this.jButtonSiguientesRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresRetencion";
		inputMap = this.jButtonAnterioresRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			/*
			this.inicializarElementosBusquedasRetencion();			
			*/
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesRetencion.setMinimumSize(new Dimension(this.getWidth(),RetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencion.setMaximumSize(new Dimension(this.getWidth(),RetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesRetencion.setPreferredSize(new Dimension(this.getWidth(),RetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(RetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionRetencion = new GridBagLayout();

			this.jPanelPaginacionRetencion.setLayout(gridaBagLayoutPaginacionRetencion);						
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 0;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionRetencion.add(this.jButtonAnterioresRetencion, this.gridBagConstraintsRetencion);
					
						
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencion.gridy = 0;
			
			this.jPanelPaginacionRetencion.add(this.jButtonNuevoGuardarCambiosRetencion, this.gridBagConstraintsRetencion);
						
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsRetencion.gridy = 0;
			this.jPanelPaginacionRetencion.add(this.jButtonSiguientesRetencion, this.gridBagConstraintsRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 1;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencion.add(this.jButtonNuevoRetencion, this.gridBagConstraintsRetencion);
						
			
			
			if(!this.retencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsRetencion = new GridBagConstraints();
				this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsRetencion.gridy = 1;
				this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionRetencion.add(this.jButtonGuardarCambiosTablaRetencion, this.gridBagConstraintsRetencion);
			}
			
			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 1;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencion.add(this.jButtonDuplicarRetencion, this.gridBagConstraintsRetencion);
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 1;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencion.add(this.jButtonCopiarRetencion, this.gridBagConstraintsRetencion);
		
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 1;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionRetencion.add(this.jButtonVerFormRetencion, this.gridBagConstraintsRetencion);
		
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 1;
			this.gridBagConstraintsRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionRetencion.add(this.jButtonCerrarRetencion, this.gridBagConstraintsRetencion);
		
		
		/*
		this.jButtonRecargarInformacionRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		
				
		/*
		this.jComboBoxTiposArchivosReportesRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		*/
		
		
		this.jCheckBoxSeleccionarTodosRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Retencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Retencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Retencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Retencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesRetencion.setLayout(gridaBagParametrosReportesRetencion);
			this.jPanelParametrosReportesAccionesRetencion.setLayout(gridaBagParametrosReportesAccionesRetencion);
			
			/*
			this.jPanelParametrosAuxiliar1Retencion.setLayout(gridaBagParametrosAuxiliar1Retencion);
			this.jPanelParametrosAuxiliar2Retencion.setLayout(gridaBagParametrosAuxiliar2Retencion);
			this.jPanelParametrosAuxiliar3Retencion.setLayout(gridaBagParametrosAuxiliar3Retencion);
			this.jPanelParametrosAuxiliar4Retencion.setLayout(gridaBagParametrosAuxiliar4Retencion);
			//this.jPanelParametrosAuxiliar5Retencion.setLayout(gridaBagParametrosAuxiliar2Retencion);			
			*/
			
			
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencion.add(this.jButtonRecargarInformacionRetencion, this.gridBagConstraintsRetencion);			
			*/
			

			
			/*
			//PAGINACION
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Retencion.add(this.jComboBoxTiposPaginacionRetencion, this.gridBagConstraintsRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Retencion.add(this.jCheckBoxConAltoMaximoTablaRetencion, this.gridBagConstraintsRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Retencion.add(this.jComboBoxTiposArchivosReportesRetencion, this.gridBagConstraintsRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencion.add(this.jPanelParametrosAuxiliar1Retencion, this.gridBagConstraintsRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Retencion.add(this.jComboBoxTiposReportesRetencion, this.gridBagConstraintsRetencion);																		
			*/
			
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Retencion.add(this.jComboBoxTiposGraficosReportesRetencion, this.gridBagConstraintsRetencion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencion.add(this.jPanelParametrosAuxiliar4Retencion, this.gridBagConstraintsRetencion);						
			*/
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencion.add(this.jComboBoxTiposReportesRetencion, this.gridBagConstraintsRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencion.add(this.jCheckBoxGenerarReporteRetencion, this.gridBagConstraintsRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencion.add(this.jPanelParametrosAuxiliar2Retencion, this.gridBagConstraintsRetencion);						
			*/
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencion.add(this.jLabelAccionesRetencion, this.gridBagConstraintsRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				/*
				this.gridBagConstraintsRetencion = new GridBagConstraints();
				this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesRetencion.add(this.jButtonAbrirOrderByRetencion, this.gridBagConstraintsRetencion);						
				*/				
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencion.add(this.jComboBoxTiposSeleccionarRetencion, this.gridBagConstraintsRetencion);			
			*/
			
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencion.add(this.jCheckBoxSeleccionarTodosRetencion, this.gridBagConstraintsRetencion);
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesRetencion.add(this.jCheckBoxConGraficoReporteRetencion, this.gridBagConstraintsRetencion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			/*
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Retencion.add(this.jCheckBoxSeleccionarTodosRetencion, this.gridBagConstraintsRetencion);															
				
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Retencion.add(this.jCheckBoxSeleccionadosRetencion, this.gridBagConstraintsRetencion);															
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Retencion.add(this.jCheckBoxConGraficoReporteRetencion, this.gridBagConstraintsRetencion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesRetencion.add(this.jPanelParametrosAuxiliar3Retencion, this.gridBagConstraintsRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencion.add(this.jComboBoxTiposAccionesRetencion, this.gridBagConstraintsRetencion);
	
				
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesRetencion.add(this.jTextFieldValorCampoGeneralRetencion, this.gridBagConstraintsRetencion);			
			
			*/
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralRetencion= new GridBagLayout();
		this.jPanelCamposIniciogeneralRetencion.setLayout(gridaBagLayoutCamposIniciogeneralRetencion);

		GridBagLayout gridaBagLayoutCamposIniciobeneficiarioRetencion= new GridBagLayout();
		this.jPanelCamposIniciobeneficiarioRetencion.setLayout(gridaBagLayoutCamposIniciobeneficiarioRetencion);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosRetencion = new GridBagLayout();

			this.jScrollPanelDatosRetencion.setLayout(gridaBagLayoutDatosRetencion);
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = 0;
			this.gridBagConstraintsRetencion.gridx = 0;
			
			this.jScrollPanelDatosRetencion.add(this.jTableDatosRetencion, this.gridBagConstraintsRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosRetencion.setViewportView(this.jTableDatosRetencion);
		this.jTableDatosRetencion.setFillsViewportHeight(true);
		this.jTableDatosRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesRetencion= new GridBagLayout();
		this.jPanelAccionesRetencion.setLayout(gridaBagLayoutAccionesRetencion);
		
		
		/*	
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = 0;
		this.gridBagConstraintsRetencion.gridx = 0;
			
		this.jPanelAccionesRetencion.add(this.jButtonNuevoRetencion, this.gridBagConstraintsRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			/*
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableRetencion.setLayout(gridaBagLayoutFK_IdAsientoContableRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdAsientoContableRetencion.add(jLabelid_asiento_contableFK_IdAsientoContableRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdAsientoContableRetencion.add(jComboBoxid_asiento_contableFK_IdAsientoContableRetencion, gridBagConstraintsRetencion);


		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdAsientoContableRetencion.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdAsientoContableRetencion.add(jButtonFK_IdAsientoContableRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdClienteRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteRetencion.setLayout(gridaBagLayoutFK_IdClienteRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdClienteRetencion.add(jLabelid_clienteFK_IdClienteRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdClienteRetencion.add(jComboBoxid_clienteFK_IdClienteRetencion, gridBagConstraintsRetencion);


		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdClienteRetencion.add(this.jButtonBuscarFK_IdClienteid_clienteRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdClienteRetencion.add(jButtonFK_IdClienteRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("2.-Por Proveedor ", jPanelFK_IdClienteRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableRetencionRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableRetencionRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencionRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableRetencionRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableRetencionRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableRetencionRetencion.setLayout(gridaBagLayoutFK_IdCuentaContableRetencionRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdCuentaContableRetencionRetencion.add(jLabelid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdCuentaContableRetencionRetencion.add(jComboBoxid_cuenta_contable_retencionFK_IdCuentaContableRetencionRetencion, gridBagConstraintsRetencion);


		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdCuentaContableRetencionRetencion.add(this.jButtonBuscarFK_IdCuentaContableRetencionid_cuenta_contable_retencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdCuentaContableRetencionRetencion.add(jButtonFK_IdCuentaContableRetencionRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("3.-Por Cuenta Retencion ", jPanelFK_IdCuentaContableRetencionRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoRetencionRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoRetencionRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoRetencionRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoRetencionRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoRetencionRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoRetencionRetencion.setLayout(gridaBagLayoutFK_IdEstadoRetencionRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdEstadoRetencionRetencion.add(jLabelid_estado_retencionFK_IdEstadoRetencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdEstadoRetencionRetencion.add(jComboBoxid_estado_retencionFK_IdEstadoRetencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdEstadoRetencionRetencion.add(jButtonFK_IdEstadoRetencionRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("4.-Por Estado Retencion ", jPanelFK_IdEstadoRetencionRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFacturaRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaRetencion.setLayout(gridaBagLayoutFK_IdFacturaRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdFacturaRetencion.add(jLabelid_facturaFK_IdFacturaRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdFacturaRetencion.add(jComboBoxid_facturaFK_IdFacturaRetencion, gridBagConstraintsRetencion);


		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.NONE;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdFacturaRetencion.add(this.jButtonBuscarFK_IdFacturaid_facturaRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdFacturaRetencion.add(jButtonFK_IdFacturaRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("5.-Por Factura ", jPanelFK_IdFacturaRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoRetencionRetencion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoRetencionRetencion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoRetencionRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoRetencionRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoRetencionRetencion.setLayout(gridaBagLayoutFK_IdTipoRetencionRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 0;
		jPanelFK_IdTipoRetencionRetencion.add(jLabelid_tipo_retencionFK_IdTipoRetencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 0;
		gridBagConstraintsRetencion.gridx = 1;
		jPanelFK_IdTipoRetencionRetencion.add(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencion, gridBagConstraintsRetencion);

		gridBagConstraintsRetencion = new GridBagConstraints();
		gridBagConstraintsRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsRetencion.gridy = 1;
		gridBagConstraintsRetencion.gridx =1;
		jPanelFK_IdTipoRetencionRetencion.add(jButtonFK_IdTipoRetencionRetencion, gridBagConstraintsRetencion);

		jTabbedPaneBusquedasRetencion.addTab("6.-Por Tipo Retencion ", jPanelFK_IdTipoRetencionRetencion);
		jTabbedPaneBusquedasRetencion.setMnemonicAt(5, KeyEvent.VK_6);

			*/		
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.retencionSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsRetencion = new GridBagConstraints();						
			this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencion.gridx = 0;		
			//this.gridBagConstraintsRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarRetencion, this.gridBagConstraintsRetencion);												
			*/
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsRetencion.gridx = 0;		
		//this.gridBagConstraintsRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRetencion.gridx = 0;		
			this.gridBagConstraintsRetencion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				/*
				this.jContentPane.add(this.jTabbedPaneBusquedasRetencion, this.gridBagConstraintsRetencion);				
				*/
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
		
		/*
		this.jContentPane.add(this.jPanelParametrosReportesRetencion, this.gridBagConstraintsRetencion);								
		*/
		
		/*
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesRetencion, this.gridBagConstraintsRetencion);
		*/		
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRetencion.gridx =0;
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRetencion, this.gridBagConstraintsRetencion);
				
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionRetencion, this.gridBagConstraintsRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(RetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosRetencion.setLayout(gridaBagLayoutBusquedasParametrosRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRetencion, this.gridBagConstraintsRetencion);
			
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRetencion, this.gridBagConstraintsRetencion);
		
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRetencion, this.gridBagConstraintsRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoRetencion.setName("jPanelReporteDinamicoRetencion"); 
		
		this.jPanelReporteDinamicoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoRetencion.setLayout(gridaBagLayoutReporteDinamicoRetencion);
		
		
		this.jInternalFrameReporteDinamicoRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencion.add(this.jLabelColumnasSelectReporteRetencion, this.gridBagConstraintsRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteRetencion=new JScrollPane(this.jListColumnasSelectReporteRetencion);
			
			this.jScrollColumnasSelectReporteRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoRetencion.add(this.jListColumnasSelectReporteRetencion, this.gridBagConstraintsRetencion);
		this.jPanelReporteDinamicoRetencion.add(this.jScrollColumnasSelectReporteRetencion, this.gridBagConstraintsRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteRetencion=new JScrollPane(this.jListRelacionesSelectReporteRetencion);
			
			this.jScrollRelacionesSelectReporteRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoRetencion = new JLabelMe();

		this.jLabelConGraficoDinamicoRetencion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencion.add(this.jLabelConGraficoDinamicoRetencion, this.gridBagConstraintsRetencion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoRetencion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoRetencion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoRetencion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jCheckBoxConGraficoDinamicoRetencion, this.gridBagConstraintsRetencion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoRetencion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoRetencion.add(this.jLabelColumnaCategoriaGraficoRetencion, this.gridBagConstraintsRetencion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoRetencion.add(this.jComboBoxColumnaCategoriaGraficoRetencion, this.gridBagConstraintsRetencion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaValorRetencion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jLabelColumnaCategoriaValorRetencion, this.gridBagConstraintsRetencion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoRetencion.add(this.jComboBoxColumnaCategoriaValorRetencion, this.gridBagConstraintsRetencion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoRetencion = new JLabelMe();

		this.jLabelColumnasValoresGraficoRetencion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jLabelColumnasValoresGraficoRetencion, this.gridBagConstraintsRetencion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoRetencion = new JList<Reporte>();
		this.jListColumnasValoresGraficoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoRetencion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoRetencion=new JScrollPane(this.jListColumnasValoresGraficoRetencion);
			
			this.jScrollColumnasValoresGraficoRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoRetencion.add(this.jListColumnasSelectReporteRetencion, this.gridBagConstraintsRetencion);
		this.jPanelReporteDinamicoRetencion.add(this.jScrollColumnasValoresGraficoRetencion, this.gridBagConstraintsRetencion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoRetencion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoRetencion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jLabelTiposGraficosReportesDinamicoRetencion, this.gridBagConstraintsRetencion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoRetencion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jComboBoxTiposGraficosReportesDinamicoRetencion, this.gridBagConstraintsRetencion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jLabelGenerarExcelReporteDinamicoRetencion, this.gridBagConstraintsRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoRetencion.setToolTipText("Generar EXCEL"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsRetencion = new GridBagConstraints();
		//this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoRetencion.add(this.jButtonGenerarExcelReporteDinamicoRetencion, this.gridBagConstraintsRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencion.add(this.jComboBoxTiposReportesDinamicoRetencion, this.gridBagConstraintsRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoRetencion.add(this.jLabelTiposArchivoReporteDinamicoRetencion, this.gridBagConstraintsRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoRetencion, this.gridBagConstraintsRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoRetencion.setToolTipText("Generar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencion.add(this.jButtonGenerarReporteDinamicoRetencion, this.gridBagConstraintsRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoRetencion.setToolTipText("Cancelar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoRetencion.add(this.jButtonCerrarReporteDinamicoRetencion, this.gridBagConstraintsRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoRetencion= new JScrollPane(jPanelReporteDinamicoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalRetencion);
		this.jInternalFrameReporteDinamicoRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoRetencion, this.gridBagConstraintsRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionRetencion.setName("jPanelImportacionRetencion"); 
		
		this.jPanelImportacionRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionRetencion.setLayout(gridaBagLayoutImportacionRetencion);
		
		
		this.jInternalFrameImportacionRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencion.setResizable(true);
	    this.jInternalFrameImportacionRetencion.setClosable(true);
	    this.jInternalFrameImportacionRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionRetencion.setResizable(true);
	    this.jInternalFrameImportacionRetencion.setClosable(true);
	    this.jInternalFrameImportacionRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionRetencion = new JLabelMe();

		this.jLabelArchivoImportacionRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencion.add(this.jLabelArchivoImportacionRetencion, this.gridBagConstraintsRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionRetencion = new JFileChooser();		
		this.jFileChooserImportacionRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionRetencion = new JButtonMe();
		this.jButtonAbrirImportacionRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionRetencion.setToolTipText("Generar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencion.add(this.jButtonAbrirImportacionRetencion, this.gridBagConstraintsRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionRetencion.add(this.jLabelPathArchivoImportacionRetencion, this.gridBagConstraintsRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencion.add(this.jTextFieldPathArchivoImportacionRetencion, this.gridBagConstraintsRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionRetencion = new JButtonMe();
		this.jButtonGenerarImportacionRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionRetencion.setToolTipText("Generar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencion.add(this.jButtonGenerarImportacionRetencion, this.gridBagConstraintsRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionRetencion = new JButtonMe();
		this.jButtonCerrarImportacionRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionRetencion.setToolTipText("Cancelar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionRetencion.add(this.jButtonCerrarImportacionRetencion, this.gridBagConstraintsRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionRetencion= new JScrollPane(jPanelImportacionRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsRetencion = new GridBagConstraints();
		this.gridBagConstraintsRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalRetencion);
		this.jInternalFrameImportacionRetencion.getContentPane().add(this.jScrollPanelImportacionRetencion, this.gridBagConstraintsRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByRetencion = new JButtonMe();
			this.jButtonAbrirOrderByRetencion.setText("Orden");
			this.jButtonAbrirOrderByRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByRetencion";
			inputMap = this.jButtonAbrirOrderByRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByRetencion.setName("jPanelOrderByRetencion"); 
			
			this.jPanelOrderByRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByRetencion.setLayout(gridaBagLayoutOrderByRetencion);
			
			
			this.jTableDatosRetencionOrderBy = new JTableMe();        
			this.jTableDatosRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosRetencionOrderBy.setViewportView(this.jTableDatosRetencionOrderBy);
			this.jTableDatosRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByRetencion.setTitle("Orden");
			this.jInternalFrameOrderByRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByRetencion.setResizable(true);
			this.jInternalFrameOrderByRetencion.setClosable(true);
			this.jInternalFrameOrderByRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsRetencion.ipady =150;
				
			this.jPanelOrderByRetencion.add(jScrollPanelDatosRetencionOrderBy, this.gridBagConstraintsRetencion);//this.jTableDatosRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByRetencion = new JButtonMe();
			this.jButtonCerrarOrderByRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByRetencion.setToolTipText("Cancelar"+" "+RetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByRetencion.add(this.jButtonCerrarOrderByRetencion, this.gridBagConstraintsRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByRetencion= new JScrollPane(jPanelOrderByRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsRetencion = new GridBagConstraints();
			this.gridBagConstraintsRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalRetencion);
			
			this.jInternalFrameOrderByRetencion.getContentPane().add(this.jScrollPanelOrderByRetencion, this.gridBagConstraintsRetencion);			
		
		} else {
			this.jButtonAbrirOrderByRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//5130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.retencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosRetencion.getRowHeight();//RetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.retencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > RetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaRetencion.isSelected()) {
					iHeightTable=RetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < RetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > RetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				/*
				if(!this.jCheckBoxConAltoMaximoTablaRetencion.isSelected()) {
					iHeightTable=RetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				*/
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				/*}*/
			} else {
				if(iHeightTable < RetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=RetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
		/*								
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByRetencion!=null && this.jInternalFrameOrderByRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.retencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		*/

		//ORDER BY
		
		//this.jScrollPanelDatosRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=retencionLogic.getRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Retencion> TraerRetencionBeans(List<Retencion> retencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Retencion retencion:retencions) {
					
				if(!(RetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || RetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					retencion.setsDetalleGeneralEntityReporte(RetencionConstantesFunciones.getRetencionDescripcion(retencion));
										
						
					
						
					
				} else  {
							
					//retencion.setsDetalleGeneralEntityReporte(retencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//retencionbeans.add(retencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return retencions;
    }
	//PARA REPORTES FIN
}
