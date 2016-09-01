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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PedidoCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class PedidoCompraJInternalFrame extends PedidoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoCompra;
	
	protected JMenuBar jmenuBarPedidoCompra;
	
	protected JMenu jmenuPedidoCompra;
	protected JMenu jmenuDatosPedidoCompra;
	protected JMenu jmenuArchivoPedidoCompra;
	protected JMenu jmenuAccionesPedidoCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoCompra;	
	protected GridBagConstraints gridBagConstraintsPedidoCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoCompraDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoCompra;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EstadoPedidoCompraBeanSwingJInternalFrame estadopedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocompra="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public PedidoCompraSessionBean pedidocompraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EstadoPedidoCompraSessionBean estadopedidocompraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoCompra> pedidocompras;		
	public List<PedidoCompra> pedidocomprasEliminados;	
	public List<PedidoCompra> pedidocomprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoCompra;		
	protected JButton jButtonAbrirOrderByPedidoCompra;
	
	
	//protected JPanel jPanelOrderByPedidoCompra;
	//public JScrollPane jScrollPanelOrderByPedidoCompra;	
	//protected JButton jButtonCerrarOrderByPedidoCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoCompraLogic pedidocompraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoCompra;
	public JScrollPane jScrollPanelDatosEdicionPedidoCompra;
	public JScrollPane jScrollPanelDatosGeneralPedidoCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoCompra;
	//public JScrollPane jScrollPanelImportacionPedidoCompra;
	
	
	
	protected JPanel jPanelAccionesPedidoCompra;
	
    protected JPanel jPanelPaginacionPedidoCompra;
    protected JPanel jPanelParametrosReportesPedidoCompra;
	protected JPanel jPanelParametrosReportesAccionesPedidoCompra;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoCompra;
	protected JPanel jPanelParametrosAuxiliar2PedidoCompra;
	protected JPanel jPanelParametrosAuxiliar3PedidoCompra;
	protected JPanel jPanelParametrosAuxiliar4PedidoCompra;
	//protected JPanel jPanelParametrosAuxiliar5PedidoCompra;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoCompra;
	//protected JPanel jPanelImportacionPedidoCompra;
	
	
	public JTable jTableDatosPedidoCompra;
	
	
	
	//public JTable jTableDatosPedidoCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoCompra;
	protected JButton jButtonDuplicarPedidoCompra;
	protected JButton jButtonCopiarPedidoCompra;
	protected JButton jButtonVerFormPedidoCompra;
	protected JButton jButtonNuevoRelacionesPedidoCompra;
	protected JButton jButtonModificarPedidoCompra;
	
    protected JButton jButtonGuardarCambiosTablaPedidoCompra;
	protected JButton jButtonCerrarPedidoCompra;
	
	
	protected JButton jButtonRecargarInformacionPedidoCompra;
	protected JButton jButtonProcesarInformacionPedidoCompra;
	
	
	protected JButton jButtonAnterioresPedidoCompra;
	protected JButton jButtonSiguientesPedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosPedidoCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoCompra;
	//protected JButton jButtonCerrarReporteDinamicoPedidoCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoCompra;
	//protected JButton jButtonGenerarImportacionPedidoCompra;
	//protected JButton jButtonCerrarImportacionPedidoCompra;
	//protected JFileChooser jFileChooserImportacionPedidoCompra;
	//protected File fileImportacionPedidoCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoCompra;
	protected JButton jButtonDuplicarToolBarPedidoCompra;
	protected JButton jButtonNuevoRelacionesToolBarPedidoCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoCompra;
	protected JButton jButtonCopiarToolBarPedidoCompra;
	protected JButton jButtonVerFormToolBarPedidoCompra;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoCompra;
	protected JButton jButtonCerrarToolBarPedidoCompra;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoCompra;
	protected JButton jButtonProcesarInformacionToolBarPedidoCompra;
	protected JButton jButtonAnterioresToolBarPedidoCompra;
	protected JButton jButtonSiguientesToolBarPedidoCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoCompra;
	protected JButton jButtonAbrirOrderByToolBarPedidoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoCompra;
	protected JMenuItem jMenuItemDuplicarPedidoCompra;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoCompra;
	protected JMenuItem jMenuItemCopiarPedidoCompra;
	protected JMenuItem jMenuItemVerFormPedidoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoCompra;
	protected JMenuItem jMenuItemCerrarPedidoCompra;
	protected JMenuItem jMenuItemDetalleCerrarPedidoCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoCompra;
	protected JMenuItem jMenuItemProcesarInformacionPedidoCompra;
	protected JMenuItem jMenuItemAnterioresPedidoCompra;
	protected JMenuItem jMenuItemSiguientesPedidoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoCompra;
	protected JMenuItem jMenuItemAbrirOrderByPedidoCompra;
	protected JMenuItem jMenuItemMostrarOcultarPedidoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoCompra;
	protected JCheckBox jCheckBoxSeleccionadosPedidoCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoCompra;
	protected JCheckBox jCheckBoxConGraficoReportePedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoCompra;
	protected JTextField jTextFieldValorCampoGeneralPedidoCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoCompra;
	//public JList<Reporte> jListColumnasSelectReportePedidoCompra;
	//public JScrollPane jScrollColumnasSelectReportePedidoCompra;
	
	//public JLabel jLabelRelacionesSelectReportePedidoCompra;
	//public JList<Reporte> jListRelacionesSelectReportePedidoCompra;
	//public JScrollPane jScrollRelacionesSelectReportePedidoCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoCompra;
	
		
	//public JLabel jLabelArchivoImportacionPedidoCompra;	
	//public JLabel jLabelPathArchivoImportacionPedidoCompra;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoCompra;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoCompra;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoCompra;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoCompra;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoCompra;
	public JPanel jPanelFK_IdClientePedidoCompra;
	public JButton jButtonFK_IdClientePedidoCompra;
	public JPanel jPanelFK_IdEmpleadoPedidoCompra;
	public JButton jButtonFK_IdEmpleadoPedidoCompra;
	public JPanel jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra;
	public JButton jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra;
	
	public JPanel jPanelid_clienteFK_IdClientePedidoCompra;
	public JLabel jLabelid_clienteFK_IdClientePedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedidoCompra;
	public JButton jButtonid_clienteFK_IdClientePedidoCompra= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedidoCompra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPedidoCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra;
	
	public JPanel jPanelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra;
	public JLabel jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra;
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompraBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=579;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidoCompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoCompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoCompra)	{
		this.jButtonRecargarInformacionPedidoCompra = jButtonRecargarInformacionPedidoCompra;
	}
	
	public JButton getjButtonProcesarInformacionPedidoCompra() {
		return this.jButtonProcesarInformacionPedidoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoCompra)	{
		this.jButtonProcesarInformacionPedidoCompra = jButtonProcesarInformacionPedidoCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoCompra() {
		return this.jButtonRecargarInformacionPedidoCompra;
	}
	
	
	public List<PedidoCompra> getpedidocompras() {
		return this.pedidocompras;
	}

	public void setpedidocompras(List<PedidoCompra> pedidocompras) {
		this.pedidocompras = pedidocompras;
	}
	
	public List<PedidoCompra> getpedidocomprasAux() {
		return this.pedidocomprasAux;
	}

	public void setpedidocomprasAux(List<PedidoCompra> pedidocomprasAux) {
		this.pedidocomprasAux = pedidocomprasAux;
	}
	
	public List<PedidoCompra> getpedidocomprasEliminados() {
		return this.pedidocomprasEliminados;
	}

	public void setPedidoComprasEliminados(List<PedidoCompra> pedidocomprasEliminados) {
		this.pedidocomprasEliminados = pedidocomprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoCompra() {
		return jComboBoxTiposSeleccionarPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoCompra(
			JComboBox jComboBoxTiposSeleccionarPedidoCompra) {
		this.jComboBoxTiposSeleccionarPedidoCompra = jComboBoxTiposSeleccionarPedidoCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoCompra() {
		return jTextFieldValorCampoGeneralPedidoCompra;
	}

	public void setjTextFieldValorCampoGeneralPedidoCompra(
			JTextField jTextFieldValorCampoGeneralPedidoCompra) {
		this.jTextFieldValorCampoGeneralPedidoCompra = jTextFieldValorCampoGeneralPedidoCompra;
	}

	public void setBorderResaltarValorCampoGeneralPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoCompra() {
		return this.jCheckBoxSeleccionarTodosPedidoCompra;
	}

	public void setjCheckBoxSeleccionarTodosPedidoCompra(
			JCheckBox jCheckBoxSeleccionarTodosPedidoCompra) {
		this.jCheckBoxSeleccionarTodosPedidoCompra = jCheckBoxSeleccionarTodosPedidoCompra;
	}

	public void setBorderResaltarSeleccionarTodosPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoCompra() {
		return this.jCheckBoxSeleccionadosPedidoCompra;
	}

	public void setjCheckBoxSeleccionadosPedidoCompra(
			JCheckBox jCheckBoxSeleccionadosPedidoCompra) {
		this.jCheckBoxSeleccionadosPedidoCompra = jCheckBoxSeleccionadosPedidoCompra;
	}
	
	public void setBorderResaltarSeleccionadosPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoCompra() {
		return this.jComboBoxTiposArchivosReportesPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoCompra(
			JComboBox jComboBoxTiposArchivosReportesPedidoCompra) {
		this.jComboBoxTiposArchivosReportesPedidoCompra = jComboBoxTiposArchivosReportesPedidoCompra;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoCompra() {
		return this.jComboBoxTiposReportesPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoCompra(
			JComboBox jComboBoxTiposReportesPedidoCompra) {
		this.jComboBoxTiposReportesPedidoCompra = jComboBoxTiposReportesPedidoCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoCompra() {
	//	return jComboBoxTiposReportesDinamicoPedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoCompra) {
	//	this.jComboBoxTiposReportesDinamicoPedidoCompra = jComboBoxTiposReportesDinamicoPedidoCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra = jComboBoxTiposArchivosReportesDinamicoPedidoCompra;
	//}
	
	public void setBorderResaltarTiposReportesPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoCompra() {
		return this.jComboBoxTiposGraficosReportesPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoCompra(
			JComboBox jComboBoxTiposGraficosReportesPedidoCompra) {
		this.jComboBoxTiposGraficosReportesPedidoCompra = jComboBoxTiposGraficosReportesPedidoCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoCompra() {
		return this.jComboBoxTiposPaginacionPedidoCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoCompra(
			JComboBox jComboBoxTiposPaginacionPedidoCompra) {
		this.jComboBoxTiposPaginacionPedidoCompra = jComboBoxTiposPaginacionPedidoCompra;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoCompra() {
		return this.jComboBoxTiposRelacionesPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoCompra() {
		return this.jComboBoxTiposAccionesPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoCompra(
			JComboBox jComboBoxTiposRelacionesPedidoCompra) {
		this.jComboBoxTiposRelacionesPedidoCompra = jComboBoxTiposRelacionesPedidoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoCompra(
			JComboBox jComboBoxTiposAccionesPedidoCompra) {
		this.jComboBoxTiposAccionesPedidoCompra = jComboBoxTiposAccionesPedidoCompra;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoCompra() {
	//	return jCheckBoxConGraficoDinamicoPedidoCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoCompra) {
	//	this.jCheckBoxConGraficoDinamicoPedidoCompra = jCheckBoxConGraficoDinamicoPedidoCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoCompra .setBorder(borderResaltar);		
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
		this.pedidocompraSessionBean=new PedidoCompraSessionBean();
		
		this.pedidocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidocompraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"nuevo","nuevo","Nuevo"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"duplicar","duplicar","Duplicar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"copiar","copiar","Copiar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"ver_form","ver_form","Ver"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"recargar","recargar","Recargar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoCompra,this.jTtoolBarPedidoCompra,
							"cerrar","cerrar","Salir"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoCompra;
			
				this.jButtonProcesarInformacionToolBarPedidoCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoCompra;
				
		//protected JButton jButtonModificarToolBarPedidoCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoCompra=new JMenuMe("General");
		this.jmenuArchivoPedidoCompra=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoCompra=new JMenuMe("Acciones");
		this.jmenuDatosPedidoCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoCompra.add(this.jMenuItemCerrarPedidoCompra);
			
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemNuevoPedidoCompra);
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemNuevoGuardarCambiosPedidoCompra);
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemNuevoRelacionesPedidoCompra);
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemGuardarCambiosTablaPedidoCompra);		
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemDuplicarPedidoCompra);		
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemCopiarPedidoCompra);		
			this.jmenuAccionesPedidoCompra.add(this.jMenuItemVerFormPedidoCompra);		
			
			this.jmenuDatosPedidoCompra.add(this.jMenuItemRecargarInformacionPedidoCompra);				
			this.jmenuDatosPedidoCompra.add(this.jMenuItemAnterioresPedidoCompra);				
			this.jmenuDatosPedidoCompra.add(this.jMenuItemSiguientesPedidoCompra);				
			this.jmenuDatosPedidoCompra.add(this.jMenuItemAbrirOrderByPedidoCompra);				
			this.jmenuDatosPedidoCompra.add(this.jMenuItemMostrarOcultarPedidoCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoCompra.add(this.jMenuItemGuardarCambiosPedidoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoCompra.add(this.jmenuArchivoPedidoCompra);		
			this.jmenuBarPedidoCompra.add(this.jmenuAccionesPedidoCompra);		
			this.jmenuBarPedidoCompra.add(this.jmenuDatosPedidoCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClientePedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedidoCompra.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedidoCompra= new JButtonMe();
		this.jButtonFK_IdClientePedidoCompra.setText("Buscar");
		this.jButtonFK_IdClientePedidoCompra.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedidoCompra,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedidoCompra = new JLabelMe();
		jLabelid_clienteFK_IdClientePedidoCompra.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedidoCompra.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedidoCompra= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoCompra.setFocusable(false);

		this.jPanelFK_IdEmpleadoPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPedidoCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPedidoCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoPedidoCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoPedidoCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPedidoCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra = new JLabelMe();
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setText("Estado :");
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setToolTipText("Estado");
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedidoCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetallePedidoCompra = new PedidoCompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Compra DATOS");
			this.jInternalFrameDetalleFormPedidoCompra = new PedidoCompraDetalleFormJInternalFrame(jDesktopPane,this.pedidocompraSessionBean.getConGuardarRelaciones(),this.pedidocompraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoCompra = null;//new PedidoCompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoCompra= new GridBagLayout();
		
		
		this.jTableDatosPedidoCompra = new JTableMe();      
		
		String sToolTipPedidoCompra="";
		sToolTipPedidoCompra=PedidoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoCompra+="(Inventario.PedidoCompra)";
		}
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoCompra.setToolTipText(sToolTipPedidoCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoCompra);
		this.jTableDatosPedidoCompra.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoCompra.setRowSelectionAllowed(true);
		this.jTableDatosPedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoCompra = new JButtonMe();
		this.jButtonDuplicarPedidoCompra = new JButtonMe();
		this.jButtonCopiarPedidoCompra = new JButtonMe();
		this.jButtonVerFormPedidoCompra = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoCompra = new JButtonMe();
		this.jButtonCerrarPedidoCompra = new JButtonMe();
		
		this.jScrollPanelDatosPedidoCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pedido Compra";
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoCompra.setToolTipText("Acciones");
        this.jPanelAccionesPedidoCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPedidoCompra=new ReporteDinamicoJInternalFrame(PedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoCompra=new ImportacionJInternalFrame(PedidoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoCompra.setText("Orden");
		this.jButtonAbrirOrderByPedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoCompra,false,this);
			
			//this.cargarOrderByPedidoCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoCompra,true,this);
			
			//this.cargarOrderByPedidoCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoCompra.setMinimumSize(new Dimension(400,50));//1730
		this.jTableDatosPedidoCompra.setMaximumSize(new Dimension(400,50));//1730
		this.jTableDatosPedidoCompra.setPreferredSize(new Dimension(400,50));//1730
		
		this.jScrollPanelDatosPedidoCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoCompra.setText("Nuevo");
		this.jButtonDuplicarPedidoCompra.setText("Duplicar");
		this.jButtonCopiarPedidoCompra.setText("Copiar");
		this.jButtonVerFormPedidoCompra.setText("Ver");
		this.jButtonNuevoRelacionesPedidoCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoCompra.setText("Guardar");
		this.jButtonCerrarPedidoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoCompra,"nuevo_button","Nuevo",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoCompra,"duplicar_button","Duplicar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoCompra,"copiar_button","Copiar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoCompra,"ver_form","Ver",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoCompra,"nuevorelaciones_button","Nuevo Rel",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoCompra,"guardarcambiostabla_button","Guardar",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoCompra,"cerrar_button","Salir",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoCompra.setToolTipText("Nuevo"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoCompra.setToolTipText("Duplicar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoCompra.setToolTipText("Copiar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoCompra.setToolTipText("Ver"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoCompra.setToolTipText("Nuevo Rel"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoCompra.setToolTipText("Guardar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoCompra.setToolTipText("Salir"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoCompra";
		inputMap = this.jButtonNuevoPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoCompra";
		inputMap = this.jButtonDuplicarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoCompra"));
		
		//COPIAR
		sMapKey = "CopiarPedidoCompra";
		inputMap = this.jButtonCopiarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoCompra"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoCompra";
		inputMap = this.jButtonVerFormPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoCompra";
		inputMap = this.jButtonNuevoRelacionesPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoCompra";
		inputMap = this.jButtonModificarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoCompra";
		inputMap = this.jButtonCerrarPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoCompra";
		inputMap = this.jButtonGuardarCambiosTablaPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoCompra.setName("jPanelParametrosReportesPedidoCompra"); 
		
		this.jPanelParametrosReportesAccionesPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoCompra.setName("jPanelParametrosReportesAccionesPedidoCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoCompra = new JButtonMe();
		this.jButtonRecargarInformacionPedidoCompra.setText("Recargar");
		this.jButtonRecargarInformacionPedidoCompra.setToolTipText("Recargar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoCompra = new JButtonMe();
		this.jButtonProcesarInformacionPedidoCompra.setText("Procesar");
		this.jButtonProcesarInformacionPedidoCompra.setToolTipText("Procesar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoCompra.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoCompra.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoCompra.setText("Accion");
		this.jComboBoxTiposAccionesPedidoCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoCompra = new JLabelMe();
		
		this.jLabelAccionesPedidoCompra.setText("Acciones");		
		this.jLabelAccionesPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoCompra.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoCompra = new JButtonMe();
		//this.jButtonAnterioresPedidoCompra.setText("<<");
        this.jButtonAnterioresPedidoCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoCompra = new JButtonMe();
		//this.jButtonSiguientesPedidoCompra.setText(">>");
        this.jButtonSiguientesPedidoCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoCompra,"nuevoguardarcambios_button","Nue",this.pedidocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoCompra";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoCompra";
		inputMap = this.jButtonRecargarInformacionPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoCompra";
		inputMap = this.jButtonSiguientesPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoCompra";
		inputMap = this.jButtonAnterioresPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoCompra.setMinimumSize(new Dimension(this.getWidth(),PedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoCompra.setMaximumSize(new Dimension(this.getWidth(),PedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoCompra.setPreferredSize(new Dimension(this.getWidth(),PedidoCompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoCompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoCompra = new GridBagLayout();

			this.jPanelPaginacionPedidoCompra.setLayout(gridaBagLayoutPaginacionPedidoCompra);						
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = 0;
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoCompra.add(this.jButtonAnterioresPedidoCompra, this.gridBagConstraintsPedidoCompra);
					
						
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPedidoCompra.gridy = 0;//
			
			this.jPanelPaginacionPedidoCompra.add(this.jButtonNuevoGuardarCambiosPedidoCompra, this.gridBagConstraintsPedidoCompra);//
						
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoCompra.gridy = 0;
			this.jPanelPaginacionPedidoCompra.add(this.jButtonSiguientesPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompra.gridy = 1;//
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompra.add(this.jButtonNuevoPedidoCompra, this.gridBagConstraintsPedidoCompra);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoCompra.gridy = 1;
				this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedidoCompra.add(this.jButtonNuevoRelacionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
			}
			
			
			if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
				this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPedidoCompra.gridy = 1;//
				this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPedidoCompra.add(this.jButtonGuardarCambiosTablaPedidoCompra, this.gridBagConstraintsPedidoCompra);//
			}
			
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompra.gridy = 1;//
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompra.add(this.jButtonDuplicarPedidoCompra, this.gridBagConstraintsPedidoCompra);//
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompra.gridy = 1;//
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompra.add(this.jButtonCopiarPedidoCompra, this.gridBagConstraintsPedidoCompra);//
		
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();//
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoCompra.gridy = 1;//
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoCompra.add(this.jButtonVerFormPedidoCompra, this.gridBagConstraintsPedidoCompra);//
		
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = 1;
			this.gridBagConstraintsPedidoCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoCompra.add(this.jButtonCerrarPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		
		this.jButtonRecargarInformacionPedidoCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoCompra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoCompra.setLayout(gridaBagParametrosReportesPedidoCompra);
			this.jPanelParametrosReportesAccionesPedidoCompra.setLayout(gridaBagParametrosReportesAccionesPedidoCompra);
			
			
			this.jPanelParametrosAuxiliar1PedidoCompra.setLayout(gridaBagParametrosAuxiliar1PedidoCompra);
			this.jPanelParametrosAuxiliar2PedidoCompra.setLayout(gridaBagParametrosAuxiliar2PedidoCompra);
			this.jPanelParametrosAuxiliar3PedidoCompra.setLayout(gridaBagParametrosAuxiliar3PedidoCompra);
			this.jPanelParametrosAuxiliar4PedidoCompra.setLayout(gridaBagParametrosAuxiliar4PedidoCompra);
			//this.jPanelParametrosAuxiliar5PedidoCompra.setLayout(gridaBagParametrosAuxiliar2PedidoCompra);			
			
			
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompra.add(this.jButtonRecargarInformacionPedidoCompra, this.gridBagConstraintsPedidoCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompra.add(this.jComboBoxTiposPaginacionPedidoCompra, this.gridBagConstraintsPedidoCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompra.add(this.jCheckBoxConAltoMaximoTablaPedidoCompra, this.gridBagConstraintsPedidoCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoCompra.add(this.jComboBoxTiposArchivosReportesPedidoCompra, this.gridBagConstraintsPedidoCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompra.add(this.jPanelParametrosAuxiliar1PedidoCompra, this.gridBagConstraintsPedidoCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoCompra.add(this.jComboBoxTiposReportesPedidoCompra, this.gridBagConstraintsPedidoCompra);																		
			
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PedidoCompra.add(this.jComboBoxTiposGraficosReportesPedidoCompra, this.gridBagConstraintsPedidoCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompra.add(this.jPanelParametrosAuxiliar4PedidoCompra, this.gridBagConstraintsPedidoCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompra.add(this.jComboBoxTiposReportesPedidoCompra, this.gridBagConstraintsPedidoCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompra.add(this.jCheckBoxGenerarReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompra.add(this.jPanelParametrosAuxiliar2PedidoCompra, this.gridBagConstraintsPedidoCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompra.add(this.jLabelAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
				this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoCompra.add(this.jButtonAbrirOrderByPedidoCompra, this.gridBagConstraintsPedidoCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompra.add(this.jComboBoxTiposSeleccionarPedidoCompra, this.gridBagConstraintsPedidoCompra);			
			
			
			/*
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompra.add(this.jCheckBoxSeleccionarTodosPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoCompra.add(this.jCheckBoxConGraficoReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompra.add(this.jCheckBoxSeleccionarTodosPedidoCompra, this.gridBagConstraintsPedidoCompra);															
				
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompra.add(this.jCheckBoxSeleccionadosPedidoCompra, this.gridBagConstraintsPedidoCompra);															
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoCompra.add(this.jCheckBoxConGraficoReportePedidoCompra, this.gridBagConstraintsPedidoCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoCompra.add(this.jPanelParametrosAuxiliar3PedidoCompra, this.gridBagConstraintsPedidoCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompra.add(this.jComboBoxTiposRelacionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
				
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompra.add(this.jComboBoxTiposAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
	
				
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoCompra.add(this.jTextFieldValorCampoGeneralPedidoCompra, this.gridBagConstraintsPedidoCompra);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoCompra = new GridBagLayout();

			this.jScrollPanelDatosPedidoCompra.setLayout(gridaBagLayoutDatosPedidoCompra);
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = 0;
			this.gridBagConstraintsPedidoCompra.gridx = 0;
			
			this.jScrollPanelDatosPedidoCompra.add(this.jTableDatosPedidoCompra, this.gridBagConstraintsPedidoCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoCompra.setViewportView(this.jTableDatosPedidoCompra);
		this.jTableDatosPedidoCompra.setFillsViewportHeight(true);
		this.jTableDatosPedidoCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoCompra= new GridBagLayout();
		this.jPanelAccionesPedidoCompra.setLayout(gridaBagLayoutAccionesPedidoCompra);
		
		
		/*	
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = 0;
		this.gridBagConstraintsPedidoCompra.gridx = 0;
			
		this.jPanelAccionesPedidoCompra.add(this.jButtonNuevoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClientePedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedidoCompra.setLayout(gridaBagLayoutFK_IdClientePedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 0;
		jPanelFK_IdClientePedidoCompra.add(jLabelid_clienteFK_IdClientePedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 1;
		jPanelFK_IdClientePedidoCompra.add(jComboBoxid_clienteFK_IdClientePedidoCompra, gridBagConstraintsPedidoCompra);


		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 0;
		jPanelFK_IdClientePedidoCompra.add(this.jButtonBuscarFK_IdClienteid_clientePedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 1;
		gridBagConstraintsPedidoCompra.gridx =1;
		jPanelFK_IdClientePedidoCompra.add(jButtonFK_IdClientePedidoCompra, gridBagConstraintsPedidoCompra);

		jTabbedPaneBusquedasPedidoCompra.addTab("1.-Por Cliente ", jPanelFK_IdClientePedidoCompra);
		jTabbedPaneBusquedasPedidoCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPedidoCompra.setLayout(gridaBagLayoutFK_IdEmpleadoPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 0;
		jPanelFK_IdEmpleadoPedidoCompra.add(jLabelid_empleadoFK_IdEmpleadoPedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 1;
		jPanelFK_IdEmpleadoPedidoCompra.add(jComboBoxid_empleadoFK_IdEmpleadoPedidoCompra, gridBagConstraintsPedidoCompra);


		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 0;
		jPanelFK_IdEmpleadoPedidoCompra.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 1;
		gridBagConstraintsPedidoCompra.gridx =1;
		jPanelFK_IdEmpleadoPedidoCompra.add(jButtonFK_IdEmpleadoPedidoCompra, gridBagConstraintsPedidoCompra);

		jTabbedPaneBusquedasPedidoCompra.addTab("2.-Por Empleado ", jPanelFK_IdEmpleadoPedidoCompra);
		jTabbedPaneBusquedasPedidoCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.setLayout(gridaBagLayoutFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 0;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.add(jLabelid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 0;
		gridBagConstraintsPedidoCompra.gridx = 1;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.add(jComboBoxid_estado_pedido_compraFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra, gridBagConstraintsPedidoCompra);

		gridBagConstraintsPedidoCompra = new GridBagConstraints();
		gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoCompra.gridy = 1;
		gridBagConstraintsPedidoCompra.gridx =1;
		jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra.add(jButtonFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra, gridBagConstraintsPedidoCompra);

		jTabbedPaneBusquedasPedidoCompra.addTab("3.-Por Estado ", jPanelFK_IdEstadoPedidoCompraEstadoPedoCompraPedidoCompra);
		jTabbedPaneBusquedasPedidoCompra.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();						
			this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompra.gridx = 0;		
			//this.gridBagConstraintsPedidoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoCompra, this.gridBagConstraintsPedidoCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompra.gridx = 0;		
		//this.gridBagConstraintsPedidoCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoCompra.gridx = 0;		
			this.gridBagConstraintsPedidoCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoCompra, this.gridBagConstraintsPedidoCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoCompra, this.gridBagConstraintsPedidoCompra);								
		
		
		/*
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
		*/		
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoCompra.gridx =0;
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoCompra, this.gridBagConstraintsPedidoCompra);
				
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoCompra, this.gridBagConstraintsPedidoCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoCompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoCompra.setLayout(gridaBagLayoutBusquedasParametrosPedidoCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoCompra.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoCompra, this.gridBagConstraintsPedidoCompra);
			
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoCompra, this.gridBagConstraintsPedidoCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoCompra.setName("jPanelReporteDinamicoPedidoCompra"); 
		
		this.jPanelReporteDinamicoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoCompra.setLayout(gridaBagLayoutReporteDinamicoPedidoCompra);
		
		
		this.jInternalFrameReporteDinamicoPedidoCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoCompra = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelColumnasSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoCompra = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoCompra=new JScrollPane(this.jListColumnasSelectReportePedidoCompra);
			
			this.jScrollColumnasSelectReportePedidoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoCompra.add(this.jListColumnasSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		this.jPanelReporteDinamicoPedidoCompra.add(this.jScrollColumnasSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoCompra = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelRelacionesSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoCompra = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoCompra=new JScrollPane(this.jListRelacionesSelectReportePedidoCompra);
			
			this.jScrollRelacionesSelectReportePedidoCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoCompra.add(this.jListRelacionesSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		this.jPanelReporteDinamicoPedidoCompra.add(this.jScrollRelacionesSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedidoCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedidoCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoPedidoCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelConGraficoDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedidoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedidoCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedidoCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedidoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jCheckBoxConGraficoDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedidoCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedidoCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelColumnaCategoriaGraficoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedidoCompra.add(this.jComboBoxColumnaCategoriaGraficoPedidoCompra, this.gridBagConstraintsPedidoCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedidoCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedidoCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelColumnaCategoriaValorPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedidoCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedidoCompra.add(this.jComboBoxColumnaCategoriaValorPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedidoCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedidoCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelColumnasValoresGraficoPedidoCompra, this.gridBagConstraintsPedidoCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedidoCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedidoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedidoCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedidoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedidoCompra=new JScrollPane(this.jListColumnasValoresGraficoPedidoCompra);
			
			this.jScrollColumnasValoresGraficoPedidoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedidoCompra.add(this.jListColumnasSelectReportePedidoCompra, this.gridBagConstraintsPedidoCompra);
		this.jPanelReporteDinamicoPedidoCompra.add(this.jScrollColumnasValoresGraficoPedidoCompra, this.gridBagConstraintsPedidoCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedidoCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedidoCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelTiposGraficosReportesDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jComboBoxTiposGraficosReportesDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelGenerarExcelReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoCompra.setToolTipText("Generar EXCEL"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		//this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoCompra.add(this.jButtonGenerarExcelReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompra.add(this.jComboBoxTiposReportesDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoCompra.add(this.jLabelTiposArchivoReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompra.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoCompra.setToolTipText("Generar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompra.add(this.jButtonGenerarReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoCompra.setToolTipText("Cancelar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoCompra.add(this.jButtonCerrarReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoCompra= new JScrollPane(jPanelReporteDinamicoPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoCompra);
		this.jInternalFrameReporteDinamicoPedidoCompra.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoCompra, this.gridBagConstraintsPedidoCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoCompra.setName("jPanelImportacionPedidoCompra"); 
		
		this.jPanelImportacionPedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoCompra.setLayout(gridaBagLayoutImportacionPedidoCompra);
		
		
		this.jInternalFrameImportacionPedidoCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionPedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionPedidoCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoCompra.setResizable(true);
	    this.jInternalFrameImportacionPedidoCompra.setClosable(true);
	    this.jInternalFrameImportacionPedidoCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoCompra = new JLabelMe();

		this.jLabelArchivoImportacionPedidoCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoCompra.add(this.jLabelArchivoImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoCompra = new JFileChooser();		
		this.jFileChooserImportacionPedidoCompra.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoCompra = new JButtonMe();
		this.jButtonAbrirImportacionPedidoCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoCompra.setToolTipText("Generar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompra.add(this.jButtonAbrirImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoCompra.add(this.jLabelPathArchivoImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompra.add(this.jTextFieldPathArchivoImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoCompra = new JButtonMe();
		this.jButtonGenerarImportacionPedidoCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoCompra.setToolTipText("Generar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompra.add(this.jButtonGenerarImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoCompra = new JButtonMe();
		this.jButtonCerrarImportacionPedidoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoCompra.setToolTipText("Cancelar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoCompra.add(this.jButtonCerrarImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoCompra= new JScrollPane(jPanelImportacionPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
		this.gridBagConstraintsPedidoCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoCompra);
		this.jInternalFrameImportacionPedidoCompra.getContentPane().add(this.jScrollPanelImportacionPedidoCompra, this.gridBagConstraintsPedidoCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoCompra = new JButtonMe();
			this.jButtonAbrirOrderByPedidoCompra.setText("Orden");
			this.jButtonAbrirOrderByPedidoCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoCompra";
			inputMap = this.jButtonAbrirOrderByPedidoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoCompra.setName("jPanelOrderByPedidoCompra"); 
			
			this.jPanelOrderByPedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoCompra.setLayout(gridaBagLayoutOrderByPedidoCompra);
			
			
			this.jTableDatosPedidoCompraOrderBy = new JTableMe();        
			this.jTableDatosPedidoCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoCompraOrderBy.setViewportView(this.jTableDatosPedidoCompraOrderBy);
			this.jTableDatosPedidoCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoCompra.setTitle("Orden");
			this.jInternalFrameOrderByPedidoCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoCompra.setResizable(true);
			this.jInternalFrameOrderByPedidoCompra.setClosable(true);
			this.jInternalFrameOrderByPedidoCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoCompra.ipady =150;
				
			this.jPanelOrderByPedidoCompra.add(jScrollPanelDatosPedidoCompraOrderBy, this.gridBagConstraintsPedidoCompra);//this.jTableDatosPedidoCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoCompra = new JButtonMe();
			this.jButtonCerrarOrderByPedidoCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoCompra.setToolTipText("Cancelar"+" "+PedidoCompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoCompra.add(this.jButtonCerrarOrderByPedidoCompra, this.gridBagConstraintsPedidoCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoCompra= new JScrollPane(jPanelOrderByPedidoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoCompra = new GridBagConstraints();
			this.gridBagConstraintsPedidoCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoCompra);
			
			this.jInternalFrameOrderByPedidoCompra.getContentPane().add(this.jScrollPanelOrderByPedidoCompra, this.gridBagConstraintsPedidoCompra);			
		
		} else {
			this.jButtonAbrirOrderByPedidoCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//4430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidocompraSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosPedidoCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoCompra.getRowHeight();//PedidoCompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoCompra.isSelected()) {
					iHeightTable=PedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoCompra.isSelected()) {
					iHeightTable=PedidoCompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoCompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoCompra!=null && this.jInternalFrameOrderByPedidoCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidocompraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidocompraLogic.getPedidoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidocompras.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<PedidoCompra> TraerPedidoCompraBeans(List<PedidoCompra> pedidocompras,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoCompra pedidocompra:pedidocompras) {
					
				if(!(PedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidocompra.setsDetalleGeneralEntityReporte(PedidoCompraConstantesFunciones.getPedidoCompraDescripcion(pedidocompra));
										
						
					
					

					if(pedidocompra.getDetallePedidoCompras()!=null && Funciones.existeClass(classes,DetallePedidoCompra.class)) {
						try{pedidocompra.setdetallepedidocomprasDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoCompraJInternalFrame.TraerDetallePedidoCompraBeans(pedidocompra.getDetallePedidoCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedidocompra.setsDetalleGeneralEntityReporte(pedidocompra.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidocomprabeans.add(pedidocomprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidocompras;
    }
	//PARA REPORTES FIN
}
