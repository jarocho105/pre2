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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.CuentaPorCobrarConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class CuentaPorCobrarJInternalFrame extends CuentaPorCobrarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCuentaPorCobrar;
	
	protected JMenuBar jmenuBarCuentaPorCobrar;
	
	protected JMenu jmenuCuentaPorCobrar;
	protected JMenu jmenuDatosCuentaPorCobrar;
	protected JMenu jmenuArchivoCuentaPorCobrar;
	protected JMenu jmenuAccionesCuentaPorCobrar;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaPorCobrar;	
	protected GridBagConstraints gridBagConstraintsCuentaPorCobrar;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CuentaPorCobrarDetalleFormJInternalFrame jInternalFrameDetalleFormCuentaPorCobrar;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCuentaPorCobrar;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCuentaPorCobrar;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";
	
	public CuentaPorCobrarSessionBean cuentaporcobrarSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public FacturaSessionBean facturaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CuentaPorCobrar> cuentaporcobrars;		
	public List<CuentaPorCobrar> cuentaporcobrarsEliminados;	
	public List<CuentaPorCobrar> cuentaporcobrarsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCuentaPorCobrar;		
	protected JButton jButtonAbrirOrderByCuentaPorCobrar;
	
	
	//protected JPanel jPanelOrderByCuentaPorCobrar;
	//public JScrollPane jScrollPanelOrderByCuentaPorCobrar;	
	//protected JButton jButtonCerrarOrderByCuentaPorCobrar;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CuentaPorCobrarLogic cuentaporcobrarLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCuentaPorCobrar;
	public JScrollPane jScrollPanelDatosEdicionCuentaPorCobrar;
	public JScrollPane jScrollPanelDatosGeneralCuentaPorCobrar;
    
	
	
	//public JScrollPane jScrollPanelDatosCuentaPorCobrarOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCuentaPorCobrar;
	//public JScrollPane jScrollPanelImportacionCuentaPorCobrar;
	
	
	
	protected JPanel jPanelAccionesCuentaPorCobrar;
	
    protected JPanel jPanelPaginacionCuentaPorCobrar;
    protected JPanel jPanelParametrosReportesCuentaPorCobrar;
	protected JPanel jPanelParametrosReportesAccionesCuentaPorCobrar;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CuentaPorCobrar;
	protected JPanel jPanelParametrosAuxiliar2CuentaPorCobrar;
	protected JPanel jPanelParametrosAuxiliar3CuentaPorCobrar;
	protected JPanel jPanelParametrosAuxiliar4CuentaPorCobrar;
	//protected JPanel jPanelParametrosAuxiliar5CuentaPorCobrar;
	
	
	
	//protected JPanel jPanelReporteDinamicoCuentaPorCobrar;
	//protected JPanel jPanelImportacionCuentaPorCobrar;
	
	
	public JTable jTableDatosCuentaPorCobrar;
	
	
	
	//public JTable jTableDatosCuentaPorCobrarOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCuentaPorCobrar;
	protected JButton jButtonDuplicarCuentaPorCobrar;
	protected JButton jButtonCopiarCuentaPorCobrar;
	protected JButton jButtonVerFormCuentaPorCobrar;
	protected JButton jButtonNuevoRelacionesCuentaPorCobrar;
	protected JButton jButtonModificarCuentaPorCobrar;
	
    protected JButton jButtonGuardarCambiosTablaCuentaPorCobrar;
	protected JButton jButtonCerrarCuentaPorCobrar;
	
	
	protected JButton jButtonRecargarInformacionCuentaPorCobrar;
	protected JButton jButtonProcesarInformacionCuentaPorCobrar;
	
	
	protected JButton jButtonAnterioresCuentaPorCobrar;
	protected JButton jButtonSiguientesCuentaPorCobrar;
	protected JButton jButtonNuevoGuardarCambiosCuentaPorCobrar;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCuentaPorCobrar;
	//protected JButton jButtonCerrarReporteDinamicoCuentaPorCobrar;
	//protected JButton jButtonGenerarExcelReporteDinamicoCuentaPorCobrar;	
	
	
	
	//protected JButton jButtonAbrirImportacionCuentaPorCobrar;
	//protected JButton jButtonGenerarImportacionCuentaPorCobrar;
	//protected JButton jButtonCerrarImportacionCuentaPorCobrar;
	//protected JFileChooser jFileChooserImportacionCuentaPorCobrar;
	//protected File fileImportacionCuentaPorCobrar;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaPorCobrar;
	protected JButton jButtonDuplicarToolBarCuentaPorCobrar;
	protected JButton jButtonNuevoRelacionesToolBarCuentaPorCobrar;
	
	
	public JButton jButtonGuardarCambiosToolBarCuentaPorCobrar;
	protected JButton jButtonCopiarToolBarCuentaPorCobrar;
	protected JButton jButtonVerFormToolBarCuentaPorCobrar;
	public JButton jButtonGuardarCambiosTablaToolBarCuentaPorCobrar;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaPorCobrar;
	protected JButton jButtonCerrarToolBarCuentaPorCobrar;
	
	protected JButton jButtonRecargarInformacionToolBarCuentaPorCobrar;
	protected JButton jButtonProcesarInformacionToolBarCuentaPorCobrar;
	protected JButton jButtonAnterioresToolBarCuentaPorCobrar;
	protected JButton jButtonSiguientesToolBarCuentaPorCobrar;
	protected JButton jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar;
	protected JButton jButtonAbrirOrderByToolBarCuentaPorCobrar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaPorCobrar;
	protected JMenuItem jMenuItemDuplicarCuentaPorCobrar;
	protected JMenuItem jMenuItemNuevoRelacionesCuentaPorCobrar;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCuentaPorCobrar;
	protected JMenuItem jMenuItemCopiarCuentaPorCobrar;
	protected JMenuItem jMenuItemVerFormCuentaPorCobrar;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaPorCobrar;
	protected JMenuItem jMenuItemCerrarCuentaPorCobrar;
	protected JMenuItem jMenuItemDetalleCerrarCuentaPorCobrar;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCuentaPorCobrar;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaPorCobrar;
	
	protected JMenuItem jMenuItemRecargarInformacionCuentaPorCobrar;
	protected JMenuItem jMenuItemProcesarInformacionCuentaPorCobrar;
	protected JMenuItem jMenuItemAnterioresCuentaPorCobrar;
	protected JMenuItem jMenuItemSiguientesCuentaPorCobrar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaPorCobrar;
	protected JMenuItem jMenuItemAbrirOrderByCuentaPorCobrar;
	protected JMenuItem jMenuItemMostrarOcultarCuentaPorCobrar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaPorCobrar;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCuentaPorCobrar;
	protected JCheckBox jCheckBoxSeleccionadosCuentaPorCobrar;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCuentaPorCobrar;
	protected JCheckBox jCheckBoxConGraficoReporteCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCuentaPorCobrar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCuentaPorCobrar;
	protected JTextField jTextFieldValorCampoGeneralCuentaPorCobrar;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCuentaPorCobrar;
	//public JList<Reporte> jListColumnasSelectReporteCuentaPorCobrar;
	//public JScrollPane jScrollColumnasSelectReporteCuentaPorCobrar;
	
	//public JLabel jLabelRelacionesSelectReporteCuentaPorCobrar;
	//public JList<Reporte> jListRelacionesSelectReporteCuentaPorCobrar;
	//public JScrollPane jScrollRelacionesSelectReporteCuentaPorCobrar;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCuentaPorCobrar;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCuentaPorCobrar;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCuentaPorCobrar;
	//public JLabel jLabelTiposArchivoReporteDinamicoCuentaPorCobrar;
	
		
	//public JLabel jLabelArchivoImportacionCuentaPorCobrar;	
	//public JLabel jLabelPathArchivoImportacionCuentaPorCobrar;
	//protected JTextField jTextFieldPathArchivoImportacionCuentaPorCobrar;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCuentaPorCobrar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCuentaPorCobrar;
	
	//public JLabel jLabelColumnaCategoriaValorCuentaPorCobrar;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCuentaPorCobrar;
	
	//public JLabel jLabelColumnasValoresGraficoCuentaPorCobrar;
	//public JList<Reporte> jListColumnasValoresGraficoCuentaPorCobrar;
	//public JScrollPane jScrollColumnasValoresGraficoCuentaPorCobrar;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCuentaPorCobrar;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCuentaPorCobrar;
	public JPanel jPanelFK_IdAsientoContableCuentaPorCobrar;
	public JButton jButtonFK_IdAsientoContableCuentaPorCobrar;
	public JPanel jPanelFK_IdClienteCuentaPorCobrar;
	public JButton jButtonFK_IdClienteCuentaPorCobrar;
	public JPanel jPanelFK_IdFacturaCuentaPorCobrar;
	public JButton jButtonFK_IdFacturaCuentaPorCobrar;
	public JPanel jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar;
	public JButton jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar;
	public JPanel jPanelFK_IdTransaccionCuentaPorCobrar;
	public JButton jButtonFK_IdTransaccionCuentaPorCobrar;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCuentaPorCobrarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar;
	
	public JPanel jPanelid_clienteFK_IdClienteCuentaPorCobrar;
	public JLabel jLabelid_clienteFK_IdClienteCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCuentaPorCobrar;
	public JButton jButtonid_clienteFK_IdClienteCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCuentaPorCobrarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar;
	
	public JPanel jPanelid_facturaFK_IdFacturaCuentaPorCobrar;
	public JLabel jLabelid_facturaFK_IdFacturaCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar;
	public JButton jButtonid_facturaFK_IdFacturaCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaCuentaPorCobrarBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar;
	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionCuentaPorCobrar;
	public JLabel jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar;
	public JButton jButtonid_transaccionFK_IdTransaccionCuentaPorCobrar= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionCuentaPorCobrarUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionCuentaPorCobrarBusqueda= new JButtonMe();

	
	
	
	
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
	public CuentaPorCobrarJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaPorCobrarJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCuentaPorCobrar)	{
		this.jButtonRecargarInformacionCuentaPorCobrar = jButtonRecargarInformacionCuentaPorCobrar;
	}
	
	public JButton getjButtonProcesarInformacionCuentaPorCobrar() {
		return this.jButtonProcesarInformacionCuentaPorCobrar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaPorCobrar)	{
		this.jButtonProcesarInformacionCuentaPorCobrar = jButtonProcesarInformacionCuentaPorCobrar;
	}
	
	
	public JButton getjButtonRecargarInformacionCuentaPorCobrar() {
		return this.jButtonRecargarInformacionCuentaPorCobrar;
	}
	
	
	public List<CuentaPorCobrar> getcuentaporcobrars() {
		return this.cuentaporcobrars;
	}

	public void setcuentaporcobrars(List<CuentaPorCobrar> cuentaporcobrars) {
		this.cuentaporcobrars = cuentaporcobrars;
	}
	
	public List<CuentaPorCobrar> getcuentaporcobrarsAux() {
		return this.cuentaporcobrarsAux;
	}

	public void setcuentaporcobrarsAux(List<CuentaPorCobrar> cuentaporcobrarsAux) {
		this.cuentaporcobrarsAux = cuentaporcobrarsAux;
	}
	
	public List<CuentaPorCobrar> getcuentaporcobrarsEliminados() {
		return this.cuentaporcobrarsEliminados;
	}

	public void setCuentaPorCobrarsEliminados(List<CuentaPorCobrar> cuentaporcobrarsEliminados) {
		this.cuentaporcobrarsEliminados = cuentaporcobrarsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCuentaPorCobrar() {
		return jComboBoxTiposSeleccionarCuentaPorCobrar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCuentaPorCobrar(
			JComboBox jComboBoxTiposSeleccionarCuentaPorCobrar) {
		this.jComboBoxTiposSeleccionarCuentaPorCobrar = jComboBoxTiposSeleccionarCuentaPorCobrar;
	}
	
	public void setBorderResaltarTiposSeleccionarCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCuentaPorCobrar() {
		return jTextFieldValorCampoGeneralCuentaPorCobrar;
	}

	public void setjTextFieldValorCampoGeneralCuentaPorCobrar(
			JTextField jTextFieldValorCampoGeneralCuentaPorCobrar) {
		this.jTextFieldValorCampoGeneralCuentaPorCobrar = jTextFieldValorCampoGeneralCuentaPorCobrar;
	}

	public void setBorderResaltarValorCampoGeneralCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCuentaPorCobrar .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCuentaPorCobrar() {
		return this.jCheckBoxSeleccionarTodosCuentaPorCobrar;
	}

	public void setjCheckBoxSeleccionarTodosCuentaPorCobrar(
			JCheckBox jCheckBoxSeleccionarTodosCuentaPorCobrar) {
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar = jCheckBoxSeleccionarTodosCuentaPorCobrar;
	}

	public void setBorderResaltarSeleccionarTodosCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCuentaPorCobrar() {
		return this.jCheckBoxSeleccionadosCuentaPorCobrar;
	}

	public void setjCheckBoxSeleccionadosCuentaPorCobrar(
			JCheckBox jCheckBoxSeleccionadosCuentaPorCobrar) {
		this.jCheckBoxSeleccionadosCuentaPorCobrar = jCheckBoxSeleccionadosCuentaPorCobrar;
	}
	
	public void setBorderResaltarSeleccionadosCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCuentaPorCobrar() {
		return this.jComboBoxTiposArchivosReportesCuentaPorCobrar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCuentaPorCobrar(
			JComboBox jComboBoxTiposArchivosReportesCuentaPorCobrar) {
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar = jComboBoxTiposArchivosReportesCuentaPorCobrar;
	}

	public void setBorderResaltarTiposArchivosReportesCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCuentaPorCobrar() {
		return this.jComboBoxTiposReportesCuentaPorCobrar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCuentaPorCobrar(
			JComboBox jComboBoxTiposReportesCuentaPorCobrar) {
		this.jComboBoxTiposReportesCuentaPorCobrar = jComboBoxTiposReportesCuentaPorCobrar;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCuentaPorCobrar() {
	//	return jComboBoxTiposReportesDinamicoCuentaPorCobrar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCuentaPorCobrar(
	//		JComboBox jComboBoxTiposReportesDinamicoCuentaPorCobrar) {
	//	this.jComboBoxTiposReportesDinamicoCuentaPorCobrar = jComboBoxTiposReportesDinamicoCuentaPorCobrar;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar() {
	//	return jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar = jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar;
	//}
	
	public void setBorderResaltarTiposReportesCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCuentaPorCobrar() {
		return this.jComboBoxTiposGraficosReportesCuentaPorCobrar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCuentaPorCobrar(
			JComboBox jComboBoxTiposGraficosReportesCuentaPorCobrar) {
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar = jComboBoxTiposGraficosReportesCuentaPorCobrar;
	}
	
	public void setBorderResaltarTiposGraficosReportesCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCuentaPorCobrar() {
		return this.jComboBoxTiposPaginacionCuentaPorCobrar;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCuentaPorCobrar(
			JComboBox jComboBoxTiposPaginacionCuentaPorCobrar) {
		this.jComboBoxTiposPaginacionCuentaPorCobrar = jComboBoxTiposPaginacionCuentaPorCobrar;
	}
	
	public void setBorderResaltarTiposPaginacionCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCuentaPorCobrar() {
		return this.jComboBoxTiposRelacionesCuentaPorCobrar;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaPorCobrar() {
		return this.jComboBoxTiposAccionesCuentaPorCobrar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaPorCobrar(
			JComboBox jComboBoxTiposRelacionesCuentaPorCobrar) {
		this.jComboBoxTiposRelacionesCuentaPorCobrar = jComboBoxTiposRelacionesCuentaPorCobrar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaPorCobrar(
			JComboBox jComboBoxTiposAccionesCuentaPorCobrar) {
		this.jComboBoxTiposAccionesCuentaPorCobrar = jComboBoxTiposAccionesCuentaPorCobrar;
	}
	
	public void setBorderResaltarTiposRelacionesCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCuentaPorCobrar() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCuentaPorCobrar .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCuentaPorCobrar() {
	//	return jCheckBoxConGraficoDinamicoCuentaPorCobrar;
	//}

	//public void setjCheckBoxConGraficoDinamicoCuentaPorCobrar(
	//		JCheckBox jCheckBoxConGraficoDinamicoCuentaPorCobrar) {
	//	this.jCheckBoxConGraficoDinamicoCuentaPorCobrar = jCheckBoxConGraficoDinamicoCuentaPorCobrar;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCuentaPorCobrar() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCuentaPorCobrar.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCuentaPorCobrar .setBorder(borderResaltar);		
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
		this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		
		this.cuentaporcobrarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentaporcobrarSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaPorCobrarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Por Cobrar MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
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
		
		CuentaPorCobrarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CuentaPorCobrar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCuentaPorCobrar= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"nuevo","nuevo","Nuevo"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"duplicar","duplicar","Duplicar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"copiar","copiar","Copiar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"ver_form","ver_form","Ver"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"recargar","recargar","Recargar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCuentaPorCobrar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCuentaPorCobrar,this.jTtoolBarCuentaPorCobrar,
							"cerrar","cerrar","Salir"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCuentaPorCobrar=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCuentaPorCobrar;
			
				this.jButtonProcesarInformacionToolBarCuentaPorCobrar=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCuentaPorCobrar;
				
		//protected JButton jButtonModificarToolBarCuentaPorCobrar;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCuentaPorCobrar=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCuentaPorCobrar=new JMenuMe("General");
		this.jmenuArchivoCuentaPorCobrar=new JMenuMe("Archivo");
		this.jmenuAccionesCuentaPorCobrar=new JMenuMe("Acciones");
		this.jmenuDatosCuentaPorCobrar=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaPorCobrar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaPorCobrar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaPorCobrar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCuentaPorCobrar= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCuentaPorCobrar.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCuentaPorCobrar,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCuentaPorCobrar= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCuentaPorCobrar.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCuentaPorCobrar,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCuentaPorCobrar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaPorCobrar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaPorCobrar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCuentaPorCobrar= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCuentaPorCobrar.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCuentaPorCobrar,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCuentaPorCobrar= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCuentaPorCobrar.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCuentaPorCobrar,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCuentaPorCobrar= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCuentaPorCobrar.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCuentaPorCobrar,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaPorCobrar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaPorCobrar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaPorCobrar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCuentaPorCobrar= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCuentaPorCobrar.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCuentaPorCobrar,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCuentaPorCobrar= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCuentaPorCobrar.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCuentaPorCobrar,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCuentaPorCobrar= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCuentaPorCobrar.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCuentaPorCobrar,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCuentaPorCobrar= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCuentaPorCobrar.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCuentaPorCobrar,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCuentaPorCobrar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCuentaPorCobrar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCuentaPorCobrar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaPorCobrar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaPorCobrar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaPorCobrar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaPorCobrar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaPorCobrar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaPorCobrar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCuentaPorCobrar.add(this.jMenuItemCerrarCuentaPorCobrar);
			
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemNuevoCuentaPorCobrar);
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemNuevoGuardarCambiosCuentaPorCobrar);
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemNuevoRelacionesCuentaPorCobrar);
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemGuardarCambiosTablaCuentaPorCobrar);		
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemDuplicarCuentaPorCobrar);		
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemCopiarCuentaPorCobrar);		
			this.jmenuAccionesCuentaPorCobrar.add(this.jMenuItemVerFormCuentaPorCobrar);		
			
			this.jmenuDatosCuentaPorCobrar.add(this.jMenuItemRecargarInformacionCuentaPorCobrar);				
			this.jmenuDatosCuentaPorCobrar.add(this.jMenuItemAnterioresCuentaPorCobrar);				
			this.jmenuDatosCuentaPorCobrar.add(this.jMenuItemSiguientesCuentaPorCobrar);				
			this.jmenuDatosCuentaPorCobrar.add(this.jMenuItemAbrirOrderByCuentaPorCobrar);				
			this.jmenuDatosCuentaPorCobrar.add(this.jMenuItemMostrarOcultarCuentaPorCobrar);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCuentaPorCobrar.add(this.jMenuItemGuardarCambiosCuentaPorCobrar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCuentaPorCobrar.add(this.jmenuArchivoCuentaPorCobrar);		
			this.jmenuBarCuentaPorCobrar.add(this.jmenuAccionesCuentaPorCobrar);		
			this.jmenuBarCuentaPorCobrar.add(this.jmenuDatosCuentaPorCobrar);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCuentaPorCobrar);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCuentaPorCobrar() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableCuentaPorCobrar.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableCuentaPorCobrar= new JButtonMe();
		this.jButtonFK_IdAsientoContableCuentaPorCobrar.setText("Buscar");
		this.jButtonFK_IdAsientoContableCuentaPorCobrar.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableCuentaPorCobrar,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar.setFocusable(false);

		this.jPanelFK_IdClienteCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCuentaPorCobrar.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteCuentaPorCobrar= new JButtonMe();
		this.jButtonFK_IdClienteCuentaPorCobrar.setText("Buscar");
		this.jButtonFK_IdClienteCuentaPorCobrar.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCuentaPorCobrar,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCuentaPorCobrar = new JLabelMe();
		jLabelid_clienteFK_IdClienteCuentaPorCobrar.setText("Cliente :");
		jLabelid_clienteFK_IdClienteCuentaPorCobrar.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar.setFocusable(false);

		this.jPanelFK_IdFacturaCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaCuentaPorCobrar.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaCuentaPorCobrar= new JButtonMe();
		this.jButtonFK_IdFacturaCuentaPorCobrar.setText("Buscar");
		this.jButtonFK_IdFacturaCuentaPorCobrar.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaCuentaPorCobrar,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar = new JLabelMe();
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar.setText("Factura :");
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar.setFocusable(false);

		this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaPorCobrar=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaPorCobrar.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionCuentaPorCobrar= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaPorCobrar.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaPorCobrar.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaPorCobrar,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCuentaPorCobrar=new JTabbedPane();


		this.jTabbedPaneBusquedasCuentaPorCobrar.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaPorCobrar.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasCuentaPorCobrar.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCuentaPorCobrar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCuentaPorCobrar = new CuentaPorCobrarDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Cuenta Por Cobrar DATOS");
			this.jInternalFrameDetalleFormCuentaPorCobrar = new CuentaPorCobrarDetalleFormJInternalFrame(jDesktopPane,this.cuentaporcobrarSessionBean.getConGuardarRelaciones(),this.cuentaporcobrarSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCuentaPorCobrar = null;//new CuentaPorCobrarDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaPorCobrar= new GridBagLayout();
		
		
		this.jTableDatosCuentaPorCobrar = new JTableMe();      
		
		String sToolTipCuentaPorCobrar="";
		sToolTipCuentaPorCobrar=CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaPorCobrar+="(Cartera.CuentaPorCobrar)";
		}
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaPorCobrar+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCuentaPorCobrar.setToolTipText(sToolTipCuentaPorCobrar);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCuentaPorCobrar);
		this.jTableDatosCuentaPorCobrar.setAutoCreateRowSorter(true);
		this.jTableDatosCuentaPorCobrar.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCuentaPorCobrar.setRowSelectionAllowed(true);
		this.jTableDatosCuentaPorCobrar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCuentaPorCobrar,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCuentaPorCobrar = new JButtonMe();
		this.jButtonDuplicarCuentaPorCobrar = new JButtonMe();
		this.jButtonCopiarCuentaPorCobrar = new JButtonMe();
		this.jButtonVerFormCuentaPorCobrar = new JButtonMe();
		this.jButtonNuevoRelacionesCuentaPorCobrar = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar = new JButtonMe();
		this.jButtonCerrarCuentaPorCobrar = new JButtonMe();
		
		this.jScrollPanelDatosCuentaPorCobrar = new JScrollPane();   
        this.jScrollPanelDatosGeneralCuentaPorCobrar = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Por Cobrar";
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaPorCobrar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaPorCobrar.setToolTipText("Acciones");
        this.jPanelAccionesCuentaPorCobrar.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCuentaPorCobrar=new ReporteDinamicoJInternalFrame(CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCuentaPorCobrar();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCuentaPorCobrar=new ImportacionJInternalFrame(CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCuentaPorCobrar();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCuentaPorCobrar = new JButtonMe();
		
		this.jButtonAbrirOrderByCuentaPorCobrar.setText("Orden");
		this.jButtonAbrirOrderByCuentaPorCobrar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaPorCobrar,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaPorCobrar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaPorCobrar,false,this);
			
			//this.cargarOrderByCuentaPorCobrar(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCuentaPorCobrar=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaPorCobrar,true,this);
			
			//this.cargarOrderByCuentaPorCobrar(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCuentaPorCobrar.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosCuentaPorCobrar.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosCuentaPorCobrar.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosCuentaPorCobrar.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaPorCobrar.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCuentaPorCobrar.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCuentaPorCobrar.setText("Nuevo");
		this.jButtonDuplicarCuentaPorCobrar.setText("Duplicar");
		this.jButtonCopiarCuentaPorCobrar.setText("Copiar");
		this.jButtonVerFormCuentaPorCobrar.setText("Ver");
		this.jButtonNuevoRelacionesCuentaPorCobrar.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.setText("Guardar");
		this.jButtonCerrarCuentaPorCobrar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaPorCobrar,"nuevo_button","Nuevo",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCuentaPorCobrar,"duplicar_button","Duplicar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCuentaPorCobrar,"copiar_button","Copiar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCuentaPorCobrar,"ver_form","Ver",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCuentaPorCobrar,"nuevorelaciones_button","Nuevo Rel",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaPorCobrar,"guardarcambiostabla_button","Guardar",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaPorCobrar,"cerrar_button","Salir",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCuentaPorCobrar.setToolTipText("Nuevo"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCuentaPorCobrar.setToolTipText("Duplicar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCuentaPorCobrar.setToolTipText("Copiar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCuentaPorCobrar.setToolTipText("Ver"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCuentaPorCobrar.setToolTipText("Nuevo Rel"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.setToolTipText("Guardar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaPorCobrar.setToolTipText("Salir"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaPorCobrar";
		inputMap = this.jButtonNuevoCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaPorCobrar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaPorCobrar"));
		
		//DUPLICAR
		sMapKey = "DuplicarCuentaPorCobrar";
		inputMap = this.jButtonDuplicarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCuentaPorCobrar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCuentaPorCobrar"));
		
		//COPIAR
		sMapKey = "CopiarCuentaPorCobrar";
		inputMap = this.jButtonCopiarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCuentaPorCobrar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCuentaPorCobrar"));
		
		//VEr FORM
		sMapKey = "VerFormCuentaPorCobrar";
		inputMap = this.jButtonVerFormCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCuentaPorCobrar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCuentaPorCobrar"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCuentaPorCobrar";
		inputMap = this.jButtonNuevoRelacionesCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCuentaPorCobrar"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCuentaPorCobrar";
		inputMap = this.jButtonModificarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCuentaPorCobrar"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCuentaPorCobrar";
		inputMap = this.jButtonCerrarCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaPorCobrar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaPorCobrar";
		inputMap = this.jButtonGuardarCambiosTablaCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaPorCobrar"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCuentaPorCobrar.setName("jPanelParametrosReportesCuentaPorCobrar"); 
		
		this.jPanelParametrosReportesAccionesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCuentaPorCobrar.setName("jPanelParametrosReportesAccionesCuentaPorCobrar"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCuentaPorCobrar = new JButtonMe();
		this.jButtonRecargarInformacionCuentaPorCobrar.setText("Recargar");
		this.jButtonRecargarInformacionCuentaPorCobrar.setToolTipText("Recargar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCuentaPorCobrar,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCuentaPorCobrar = new JButtonMe();
		this.jButtonProcesarInformacionCuentaPorCobrar.setText("Procesar");
		this.jButtonProcesarInformacionCuentaPorCobrar.setToolTipText("Procesar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCuentaPorCobrar.setVisible(false);
			
		this.jButtonProcesarInformacionCuentaPorCobrar.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaPorCobrar.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCuentaPorCobrar.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setText("TIPO");       
		this.jComboBoxTiposReportesCuentaPorCobrar.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCuentaPorCobrar.setText("Paginacion");
		this.jComboBoxTiposPaginacionCuentaPorCobrar.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCuentaPorCobrar.setText("Accion");
		this.jComboBoxTiposRelacionesCuentaPorCobrar.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaPorCobrar.setText("Accion");
		this.jComboBoxTiposAccionesCuentaPorCobrar.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCuentaPorCobrar.setText("Accion");
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCuentaPorCobrar=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCuentaPorCobrar.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaPorCobrar.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCuentaPorCobrar.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCuentaPorCobrar = new JLabelMe();
		
		this.jLabelAccionesCuentaPorCobrar.setText("Acciones");		
		this.jLabelAccionesCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCuentaPorCobrar = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCuentaPorCobrar.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCuentaPorCobrar.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCuentaPorCobrar.setText("Graf.");
		this.jCheckBoxConGraficoReporteCuentaPorCobrar.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCuentaPorCobrar = new JButtonMe();
		//this.jButtonAnterioresCuentaPorCobrar.setText("<<");
        this.jButtonAnterioresCuentaPorCobrar.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCuentaPorCobrar,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCuentaPorCobrar = new JButtonMe();
		//this.jButtonSiguientesCuentaPorCobrar.setText(">>");
        this.jButtonSiguientesCuentaPorCobrar.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCuentaPorCobrar,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCuentaPorCobrar = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCuentaPorCobrar.setText("Nue");
        this.jButtonNuevoGuardarCambiosCuentaPorCobrar.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCuentaPorCobrar,"nuevoguardarcambios_button","Nue",this.cuentaporcobrarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCuentaPorCobrar";
		inputMap = this.jButtonNuevoGuardarCambiosCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCuentaPorCobrar"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCuentaPorCobrar";
		inputMap = this.jButtonRecargarInformacionCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCuentaPorCobrar"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCuentaPorCobrar";
		inputMap = this.jButtonSiguientesCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCuentaPorCobrar"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCuentaPorCobrar";
		inputMap = this.jButtonAnterioresCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCuentaPorCobrar"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCuentaPorCobrar();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCuentaPorCobrar.setMinimumSize(new Dimension(this.getWidth(),CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaPorCobrar.setMaximumSize(new Dimension(this.getWidth(),CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCuentaPorCobrar.setPreferredSize(new Dimension(this.getWidth(),CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CuentaPorCobrarBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCuentaPorCobrar = new GridBagLayout();

			this.jPanelPaginacionCuentaPorCobrar.setLayout(gridaBagLayoutPaginacionCuentaPorCobrar);						
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonAnterioresCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					
						
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
			
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonNuevoGuardarCambiosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
						
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonSiguientesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonNuevoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
						
			
			
			if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
				this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
				this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonGuardarCambiosTablaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			}
			
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonDuplicarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonCopiarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonVerFormCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 1;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCuentaPorCobrar.add(this.jButtonCerrarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		
		this.jButtonRecargarInformacionCuentaPorCobrar.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaPorCobrar.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCuentaPorCobrar.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCuentaPorCobrar.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCuentaPorCobrar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaPorCobrar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCuentaPorCobrar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCuentaPorCobrar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCuentaPorCobrar.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaPorCobrar.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCuentaPorCobrar.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCuentaPorCobrar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaPorCobrar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCuentaPorCobrar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCuentaPorCobrar.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaPorCobrar.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCuentaPorCobrar.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCuentaPorCobrar.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCuentaPorCobrar.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaPorCobrar.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCuentaPorCobrar.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCuentaPorCobrar = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCuentaPorCobrar = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CuentaPorCobrar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CuentaPorCobrar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CuentaPorCobrar = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CuentaPorCobrar = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCuentaPorCobrar.setLayout(gridaBagParametrosReportesCuentaPorCobrar);
			this.jPanelParametrosReportesAccionesCuentaPorCobrar.setLayout(gridaBagParametrosReportesAccionesCuentaPorCobrar);
			
			
			this.jPanelParametrosAuxiliar1CuentaPorCobrar.setLayout(gridaBagParametrosAuxiliar1CuentaPorCobrar);
			this.jPanelParametrosAuxiliar2CuentaPorCobrar.setLayout(gridaBagParametrosAuxiliar2CuentaPorCobrar);
			this.jPanelParametrosAuxiliar3CuentaPorCobrar.setLayout(gridaBagParametrosAuxiliar3CuentaPorCobrar);
			this.jPanelParametrosAuxiliar4CuentaPorCobrar.setLayout(gridaBagParametrosAuxiliar4CuentaPorCobrar);
			//this.jPanelParametrosAuxiliar5CuentaPorCobrar.setLayout(gridaBagParametrosAuxiliar2CuentaPorCobrar);			
			
			
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jButtonRecargarInformacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaPorCobrar.add(this.jComboBoxTiposPaginacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaPorCobrar.add(this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CuentaPorCobrar.add(this.jComboBoxTiposArchivosReportesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jPanelParametrosAuxiliar1CuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CuentaPorCobrar.add(this.jComboBoxTiposReportesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);																		
			
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4CuentaPorCobrar.add(this.jComboBoxTiposGraficosReportesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jPanelParametrosAuxiliar4CuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jComboBoxTiposReportesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jCheckBoxGenerarReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jPanelParametrosAuxiliar2CuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jLabelAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
				this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCuentaPorCobrar.add(this.jButtonAbrirOrderByCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jComboBoxTiposSeleccionarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			
			
			/*
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jCheckBoxSeleccionarTodosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jCheckBoxConGraficoReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaPorCobrar.add(this.jCheckBoxSeleccionarTodosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);															
				
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaPorCobrar.add(this.jCheckBoxSeleccionadosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);															
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CuentaPorCobrar.add(this.jCheckBoxConGraficoReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jPanelParametrosAuxiliar3CuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jComboBoxTiposAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
	
				
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCuentaPorCobrar.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCuentaPorCobrar.add(this.jTextFieldValorCampoGeneralCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCuentaPorCobrar = new GridBagLayout();

			this.jScrollPanelDatosCuentaPorCobrar.setLayout(gridaBagLayoutDatosCuentaPorCobrar);
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
			
			this.jScrollPanelDatosCuentaPorCobrar.add(this.jTableDatosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCuentaPorCobrar.setViewportView(this.jTableDatosCuentaPorCobrar);
		this.jTableDatosCuentaPorCobrar.setFillsViewportHeight(true);
		this.jTableDatosCuentaPorCobrar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCuentaPorCobrar= new GridBagLayout();
		this.jPanelAccionesCuentaPorCobrar.setLayout(gridaBagLayoutAccionesCuentaPorCobrar);
		
		
		/*	
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = 0;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
			
		this.jPanelAccionesCuentaPorCobrar.add(this.jButtonNuevoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableCuentaPorCobrar.setLayout(gridaBagLayoutFK_IdAsientoContableCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdAsientoContableCuentaPorCobrar.add(jLabelid_asiento_contableFK_IdAsientoContableCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 1;
		jPanelFK_IdAsientoContableCuentaPorCobrar.add(jComboBoxid_asiento_contableFK_IdAsientoContableCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);


		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdAsientoContableCuentaPorCobrar.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 1;
		gridBagConstraintsCuentaPorCobrar.gridx =1;
		jPanelFK_IdAsientoContableCuentaPorCobrar.add(jButtonFK_IdAsientoContableCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		jTabbedPaneBusquedasCuentaPorCobrar.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableCuentaPorCobrar);
		jTabbedPaneBusquedasCuentaPorCobrar.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteCuentaPorCobrar= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCuentaPorCobrar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCuentaPorCobrar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCuentaPorCobrar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCuentaPorCobrar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCuentaPorCobrar.setLayout(gridaBagLayoutFK_IdClienteCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdClienteCuentaPorCobrar.add(jLabelid_clienteFK_IdClienteCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 1;
		jPanelFK_IdClienteCuentaPorCobrar.add(jComboBoxid_clienteFK_IdClienteCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);


		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdClienteCuentaPorCobrar.add(this.jButtonBuscarFK_IdClienteid_clienteCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 1;
		gridBagConstraintsCuentaPorCobrar.gridx =1;
		jPanelFK_IdClienteCuentaPorCobrar.add(jButtonFK_IdClienteCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		jTabbedPaneBusquedasCuentaPorCobrar.addTab("2.-Por Cliente ", jPanelFK_IdClienteCuentaPorCobrar);
		jTabbedPaneBusquedasCuentaPorCobrar.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdFacturaCuentaPorCobrar= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaCuentaPorCobrar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaCuentaPorCobrar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaCuentaPorCobrar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaCuentaPorCobrar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaCuentaPorCobrar.setLayout(gridaBagLayoutFK_IdFacturaCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdFacturaCuentaPorCobrar.add(jLabelid_facturaFK_IdFacturaCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 1;
		jPanelFK_IdFacturaCuentaPorCobrar.add(jComboBoxid_facturaFK_IdFacturaCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);


		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.NONE;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdFacturaCuentaPorCobrar.add(this.jButtonBuscarFK_IdFacturaid_facturaCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 1;
		gridBagConstraintsCuentaPorCobrar.gridx =1;
		jPanelFK_IdFacturaCuentaPorCobrar.add(jButtonFK_IdFacturaCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		jTabbedPaneBusquedasCuentaPorCobrar.addTab("3.-Por Factura ", jPanelFK_IdFacturaCuentaPorCobrar);
		jTabbedPaneBusquedasCuentaPorCobrar.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 1;
		gridBagConstraintsCuentaPorCobrar.gridx =1;
		jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar.add(jButtonFK_IdTipoTransaccionModuloCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		jTabbedPaneBusquedasCuentaPorCobrar.addTab("4.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloCuentaPorCobrar);
		jTabbedPaneBusquedasCuentaPorCobrar.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTransaccionCuentaPorCobrar= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionCuentaPorCobrar.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaPorCobrar.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionCuentaPorCobrar.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionCuentaPorCobrar.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionCuentaPorCobrar.setLayout(gridaBagLayoutFK_IdTransaccionCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 0;
		jPanelFK_IdTransaccionCuentaPorCobrar.add(jLabelid_transaccionFK_IdTransaccionCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 0;
		gridBagConstraintsCuentaPorCobrar.gridx = 1;
		jPanelFK_IdTransaccionCuentaPorCobrar.add(jComboBoxid_transaccionFK_IdTransaccionCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCuentaPorCobrar.gridy = 1;
		gridBagConstraintsCuentaPorCobrar.gridx =1;
		jPanelFK_IdTransaccionCuentaPorCobrar.add(jButtonFK_IdTransaccionCuentaPorCobrar, gridBagConstraintsCuentaPorCobrar);

		jTabbedPaneBusquedasCuentaPorCobrar.addTab("5.-Por Transaccion ", jPanelFK_IdTransaccionCuentaPorCobrar);
		jTabbedPaneBusquedasCuentaPorCobrar.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaPorCobrar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaPorCobrar);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();						
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;		
			//this.gridBagConstraintsCuentaPorCobrar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaPorCobrar.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;		
		//this.gridBagConstraintsCuentaPorCobrar.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCuentaPorCobrar.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCuentaPorCobrar);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaPorCobrar.gridx = 0;		
			this.gridBagConstraintsCuentaPorCobrar.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCuentaPorCobrar.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);								
		
		
		/*
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		*/		
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaPorCobrar.gridx =0;
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaPorCobrar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
				
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CuentaPorCobrarJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCuentaPorCobrar= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaPorCobrar = new GridBagLayout();
			this.jPanelBusquedasParametrosCuentaPorCobrar.setLayout(gridaBagLayoutBusquedasParametrosCuentaPorCobrar);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCuentaPorCobrar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaPorCobrar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
			
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaPorCobrar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCuentaPorCobrar;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCuentaPorCobrar() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCuentaPorCobrar = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCuentaPorCobrar.setName("jPanelReporteDinamicoCuentaPorCobrar"); 
		
		this.jPanelReporteDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCuentaPorCobrar.setLayout(gridaBagLayoutReporteDinamicoCuentaPorCobrar);
		
		
		this.jInternalFrameReporteDinamicoCuentaPorCobrar= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCuentaPorCobrar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaPorCobrar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCuentaPorCobrar.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCuentaPorCobrar.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCuentaPorCobrar.setResizable(true);
	    this.jInternalFrameReporteDinamicoCuentaPorCobrar.setClosable(true);
	    this.jInternalFrameReporteDinamicoCuentaPorCobrar.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCuentaPorCobrar = new JLabelMe();

		this.jLabelColumnasSelectReporteCuentaPorCobrar.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelColumnasSelectReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCuentaPorCobrar = new JList<Reporte>();
		this.jListColumnasSelectReporteCuentaPorCobrar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCuentaPorCobrar=new JScrollPane(this.jListColumnasSelectReporteCuentaPorCobrar);
			
			this.jScrollColumnasSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jListColumnasSelectReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jScrollColumnasSelectReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCuentaPorCobrar = new JLabelMe();

		this.jLabelRelacionesSelectReporteCuentaPorCobrar.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCuentaPorCobrar = new JList<Reporte>();
		this.jListRelacionesSelectReporteCuentaPorCobrar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCuentaPorCobrar=new JScrollPane(this.jListRelacionesSelectReporteCuentaPorCobrar);
			
			this.jScrollRelacionesSelectReporteCuentaPorCobrar.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaPorCobrar.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCuentaPorCobrar.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCuentaPorCobrar = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar = new JComboBoxMe();
		this.jListColumnasValoresGraficoCuentaPorCobrar = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCuentaPorCobrar = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCuentaPorCobrar.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCuentaPorCobrar = new JLabelMe();

		this.jLabelConGraficoDinamicoCuentaPorCobrar.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelConGraficoDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCuentaPorCobrar = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCuentaPorCobrar.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCuentaPorCobrar.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jCheckBoxConGraficoDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCuentaPorCobrar = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCuentaPorCobrar.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelColumnaCategoriaGraficoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCuentaPorCobrar = new JLabelMe();

		this.jLabelColumnaCategoriaValorCuentaPorCobrar.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelColumnaCategoriaValorCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCuentaPorCobrar.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCuentaPorCobrar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jComboBoxColumnaCategoriaValorCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCuentaPorCobrar = new JLabelMe();

		this.jLabelColumnasValoresGraficoCuentaPorCobrar.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelColumnasValoresGraficoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCuentaPorCobrar = new JList<Reporte>();
		this.jListColumnasValoresGraficoCuentaPorCobrar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCuentaPorCobrar.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCuentaPorCobrar.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuentaPorCobrar.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCuentaPorCobrar.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCuentaPorCobrar=new JScrollPane(this.jListColumnasValoresGraficoCuentaPorCobrar);
			
			this.jScrollColumnasValoresGraficoCuentaPorCobrar.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuentaPorCobrar.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCuentaPorCobrar.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jListColumnasSelectReporteCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jScrollColumnasValoresGraficoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelTiposGraficosReportesDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCuentaPorCobrar.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jComboBoxTiposGraficosReportesDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelGenerarExcelReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar.setToolTipText("Generar EXCEL"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		//this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jButtonGenerarExcelReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jComboBoxTiposReportesDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jLabelTiposArchivoReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jComboBoxTiposArchivosReportesDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCuentaPorCobrar = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCuentaPorCobrar.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCuentaPorCobrar,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCuentaPorCobrar.setToolTipText("Generar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jButtonGenerarReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCuentaPorCobrar = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCuentaPorCobrar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCuentaPorCobrar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCuentaPorCobrar.setToolTipText("Cancelar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCuentaPorCobrar.add(this.jButtonCerrarReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCuentaPorCobrar = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCuentaPorCobrar= new JScrollPane(jPanelReporteDinamicoCuentaPorCobrar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCuentaPorCobrar.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaPorCobrar.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCuentaPorCobrar.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCuentaPorCobrar);
		this.jInternalFrameReporteDinamicoCuentaPorCobrar.getContentPane().add(this.jScrollPanelReporteDinamicoCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCuentaPorCobrar() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCuentaPorCobrar = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCuentaPorCobrar.setName("jPanelImportacionCuentaPorCobrar"); 
		
		this.jPanelImportacionCuentaPorCobrar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaPorCobrar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCuentaPorCobrar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCuentaPorCobrar.setLayout(gridaBagLayoutImportacionCuentaPorCobrar);
		
		
		this.jInternalFrameImportacionCuentaPorCobrar= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCuentaPorCobrar= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCuentaPorCobrar = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCuentaPorCobrar= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCuentaPorCobrar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaPorCobrar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaPorCobrar.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCuentaPorCobrar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaPorCobrar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaPorCobrar.setResizable(true);
	    this.jInternalFrameImportacionCuentaPorCobrar.setClosable(true);
	    this.jInternalFrameImportacionCuentaPorCobrar.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCuentaPorCobrar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCuentaPorCobrar.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCuentaPorCobrar.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCuentaPorCobrar.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCuentaPorCobrar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCuentaPorCobrar.setResizable(true);
	    this.jInternalFrameImportacionCuentaPorCobrar.setClosable(true);
	    this.jInternalFrameImportacionCuentaPorCobrar.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCuentaPorCobrar.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaPorCobrar.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCuentaPorCobrar.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCuentaPorCobrar = new JLabelMe();

		this.jLabelArchivoImportacionCuentaPorCobrar.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaPorCobrar.add(this.jLabelArchivoImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCuentaPorCobrar = new JFileChooser();		
		this.jFileChooserImportacionCuentaPorCobrar.setToolTipText("ESCOGER ARCHIVO"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCuentaPorCobrar = new JButtonMe();
		this.jButtonAbrirImportacionCuentaPorCobrar.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCuentaPorCobrar,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCuentaPorCobrar.setToolTipText("Generar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaPorCobrar.add(this.jButtonAbrirImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCuentaPorCobrar = new JLabelMe();

		this.jLabelPathArchivoImportacionCuentaPorCobrar.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCuentaPorCobrar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaPorCobrar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCuentaPorCobrar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;		
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCuentaPorCobrar.add(this.jLabelPathArchivoImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCuentaPorCobrar=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCuentaPorCobrar.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaPorCobrar.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCuentaPorCobrar.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaPorCobrar.add(this.jTextFieldPathArchivoImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCuentaPorCobrar = new JButtonMe();
		this.jButtonGenerarImportacionCuentaPorCobrar.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCuentaPorCobrar,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCuentaPorCobrar.setToolTipText("Generar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaPorCobrar.add(this.jButtonGenerarImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCuentaPorCobrar = new JButtonMe();
		this.jButtonCerrarImportacionCuentaPorCobrar.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCuentaPorCobrar,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCuentaPorCobrar.setToolTipText("Cancelar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYImportacion;
		this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCuentaPorCobrar.add(this.jButtonCerrarImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCuentaPorCobrar = new GridBagLayout();
		
		this.jScrollPanelImportacionCuentaPorCobrar= new JScrollPane(jPanelImportacionCuentaPorCobrar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
		this.gridBagConstraintsCuentaPorCobrar.gridy =iPosYImportacion;
		this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXImportacion;
		this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCuentaPorCobrar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCuentaPorCobrar.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCuentaPorCobrar);
		this.jInternalFrameImportacionCuentaPorCobrar.getContentPane().add(this.jScrollPanelImportacionCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCuentaPorCobrar(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCuentaPorCobrar = new JButtonMe();
			this.jButtonAbrirOrderByCuentaPorCobrar.setText("Orden");
			this.jButtonAbrirOrderByCuentaPorCobrar.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCuentaPorCobrar,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCuentaPorCobrar";
			inputMap = this.jButtonAbrirOrderByCuentaPorCobrar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCuentaPorCobrar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCuentaPorCobrar"));
		
		
			GridBagLayout gridaBagLayoutOrderByCuentaPorCobrar = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCuentaPorCobrar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCuentaPorCobrar.setName("jPanelOrderByCuentaPorCobrar"); 
			
			this.jPanelOrderByCuentaPorCobrar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaPorCobrar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCuentaPorCobrar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCuentaPorCobrar.setLayout(gridaBagLayoutOrderByCuentaPorCobrar);
			
			
			this.jTableDatosCuentaPorCobrarOrderBy = new JTableMe();        
			this.jTableDatosCuentaPorCobrarOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCuentaPorCobrarOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCuentaPorCobrarOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCuentaPorCobrarOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCuentaPorCobrarOrderBy.setViewportView(this.jTableDatosCuentaPorCobrarOrderBy);
			this.jTableDatosCuentaPorCobrarOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCuentaPorCobrarOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCuentaPorCobrar= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCuentaPorCobrar= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCuentaPorCobrar = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCuentaPorCobrar= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCuentaPorCobrar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCuentaPorCobrar.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCuentaPorCobrar.setTitle("Orden");
			this.jInternalFrameOrderByCuentaPorCobrar.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCuentaPorCobrar.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCuentaPorCobrar.setResizable(true);
			this.jInternalFrameOrderByCuentaPorCobrar.setClosable(true);
			this.jInternalFrameOrderByCuentaPorCobrar.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCuentaPorCobrar.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaPorCobrar.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCuentaPorCobrar.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCuentaPorCobrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Por Cobrares"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCuentaPorCobrar.ipady =150;
				
			this.jPanelOrderByCuentaPorCobrar.add(jScrollPanelDatosCuentaPorCobrarOrderBy, this.gridBagConstraintsCuentaPorCobrar);//this.jTableDatosCuentaPorCobrarTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCuentaPorCobrar = new JButtonMe();
			this.jButtonCerrarOrderByCuentaPorCobrar.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCuentaPorCobrar,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCuentaPorCobrar.setToolTipText("Cancelar"+" "+CuentaPorCobrarConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCuentaPorCobrar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaPorCobrar.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCuentaPorCobrar.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCuentaPorCobrar.add(this.jButtonCerrarOrderByCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCuentaPorCobrar = new GridBagLayout();
			
			this.jScrollPanelOrderByCuentaPorCobrar= new JScrollPane(jPanelOrderByCuentaPorCobrar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCuentaPorCobrar = new GridBagConstraints();
			this.gridBagConstraintsCuentaPorCobrar.gridy =iPosYOrderBy;
			this.gridBagConstraintsCuentaPorCobrar.gridx =iPosXOrderBy;
			this.gridBagConstraintsCuentaPorCobrar.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCuentaPorCobrar.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCuentaPorCobrar.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCuentaPorCobrar);
			
			this.jInternalFrameOrderByCuentaPorCobrar.getContentPane().add(this.jScrollPanelOrderByCuentaPorCobrar, this.gridBagConstraintsCuentaPorCobrar);			
		
		} else {
			this.jButtonAbrirOrderByCuentaPorCobrar = new JButtonMe();
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
		int iWidthTableCalculado=0;//3030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.cuentaporcobrarSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCuentaPorCobrar.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCuentaPorCobrar.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCuentaPorCobrar.getRowHeight();//CuentaPorCobrarConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.isSelected()) {
					iHeightTable=CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCuentaPorCobrar.isSelected()) {
					iHeightTable=CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CuentaPorCobrarConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCuentaPorCobrar.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaPorCobrar.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCuentaPorCobrar.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCuentaPorCobrar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaPorCobrar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCuentaPorCobrar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCuentaPorCobrar!=null && this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy()!=null) {
			//if(!this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCuentaPorCobrar.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCuentaPorCobrar.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCuentaPorCobrar.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCuentaPorCobrar.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCuentaPorCobrar.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaPorCobrar.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCuentaPorCobrar.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=cuentaporcobrarLogic.getCuentaPorCobrars().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaporcobrars.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CuentaPorCobrar> TraerCuentaPorCobrarBeans(List<CuentaPorCobrar> cuentaporcobrars,ArrayList<Classe> classes)throws Exception {
		try {
			for(CuentaPorCobrar cuentaporcobrar:cuentaporcobrars) {
					
				if(!(CuentaPorCobrarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CuentaPorCobrarConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					cuentaporcobrar.setsDetalleGeneralEntityReporte(CuentaPorCobrarConstantesFunciones.getCuentaPorCobrarDescripcion(cuentaporcobrar));
										
						
					
						
					
				} else  {
							
					//cuentaporcobrar.setsDetalleGeneralEntityReporte(cuentaporcobrar.getsDetalleGeneralEntityReporte());
										
				}
				
				//cuentaporcobrarbeans.add(cuentaporcobrarbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return cuentaporcobrars;
    }
	//PARA REPORTES FIN
}
