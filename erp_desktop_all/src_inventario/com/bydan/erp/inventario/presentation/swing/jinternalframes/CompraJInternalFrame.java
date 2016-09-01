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
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
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
import com.bydan.erp.inventario.util.CompraConstantesFunciones;

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
public class CompraJInternalFrame extends CompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCompra;
	
	protected JMenuBar jmenuBarCompra;
	
	protected JMenu jmenuCompra;
	protected JMenu jmenuDatosCompra;
	protected JMenu jmenuArchivoCompra;
	protected JMenu jmenuAccionesCompra;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCompra;	
	protected GridBagConstraints gridBagConstraintsCompra;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CompraDetalleFormJInternalFrame jInternalFrameDetalleFormCompra;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCompra;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCompra;	
	
	
	
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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoInventarioBeanSwingJInternalFrame estadoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoinventario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompra="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public CompraSessionBean compraSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoInventarioSessionBean estadoinventarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public PedidoCompraSessionBean pedidocompraSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Compra> compras;		
	public List<Compra> comprasEliminados;	
	public List<Compra> comprasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCompra;		
	protected JButton jButtonAbrirOrderByCompra;
	
	
	//protected JPanel jPanelOrderByCompra;
	//public JScrollPane jScrollPanelOrderByCompra;	
	//protected JButton jButtonCerrarOrderByCompra;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CompraLogic compraLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCompra;
	public JScrollPane jScrollPanelDatosEdicionCompra;
	public JScrollPane jScrollPanelDatosGeneralCompra;
    
	
	
	//public JScrollPane jScrollPanelDatosCompraOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCompra;
	//public JScrollPane jScrollPanelImportacionCompra;
	
	
	
	protected JPanel jPanelAccionesCompra;
	
    protected JPanel jPanelPaginacionCompra;
    protected JPanel jPanelParametrosReportesCompra;
	protected JPanel jPanelParametrosReportesAccionesCompra;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalCompra;
	protected Integer iXPanelCamposFintotalCompra=0;
	protected Integer iYPanelCamposFintotalCompra=0;

	protected JPanel jPanelCamposIniciogeneralCompra;
	protected Integer iXPanelCamposIniciogeneralCompra=0;
	protected Integer iYPanelCamposIniciogeneralCompra=0;

	protected JPanel jPanelCamposIniciocoaCompra;
	protected Integer iXPanelCamposIniciocoaCompra=0;
	protected Integer iYPanelCamposIniciocoaCompra=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Compra;
	protected JPanel jPanelParametrosAuxiliar2Compra;
	protected JPanel jPanelParametrosAuxiliar3Compra;
	protected JPanel jPanelParametrosAuxiliar4Compra;
	//protected JPanel jPanelParametrosAuxiliar5Compra;
	
	
	
	//protected JPanel jPanelReporteDinamicoCompra;
	//protected JPanel jPanelImportacionCompra;
	
	
	public JTable jTableDatosCompra;
	
	
	
	//public JTable jTableDatosCompraOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCompra;
	protected JButton jButtonDuplicarCompra;
	protected JButton jButtonCopiarCompra;
	protected JButton jButtonVerFormCompra;
	protected JButton jButtonNuevoRelacionesCompra;
	protected JButton jButtonModificarCompra;
	
    protected JButton jButtonGuardarCambiosTablaCompra;
	protected JButton jButtonCerrarCompra;
	
	
	protected JButton jButtonRecargarInformacionCompra;
	protected JButton jButtonProcesarInformacionCompra;
	
	
	protected JButton jButtonAnterioresCompra;
	protected JButton jButtonSiguientesCompra;
	protected JButton jButtonNuevoGuardarCambiosCompra;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCompra;
	//protected JButton jButtonCerrarReporteDinamicoCompra;
	//protected JButton jButtonGenerarExcelReporteDinamicoCompra;	
	
	
	
	//protected JButton jButtonAbrirImportacionCompra;
	//protected JButton jButtonGenerarImportacionCompra;
	//protected JButton jButtonCerrarImportacionCompra;
	//protected JFileChooser jFileChooserImportacionCompra;
	//protected File fileImportacionCompra;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCompra;
	protected JButton jButtonDuplicarToolBarCompra;
	protected JButton jButtonNuevoRelacionesToolBarCompra;
	
	
	public JButton jButtonGuardarCambiosToolBarCompra;
	protected JButton jButtonCopiarToolBarCompra;
	protected JButton jButtonVerFormToolBarCompra;
	public JButton jButtonGuardarCambiosTablaToolBarCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarCompra;
	protected JButton jButtonCerrarToolBarCompra;
	
	protected JButton jButtonRecargarInformacionToolBarCompra;
	protected JButton jButtonProcesarInformacionToolBarCompra;
	protected JButton jButtonAnterioresToolBarCompra;
	protected JButton jButtonSiguientesToolBarCompra;
	protected JButton jButtonNuevoGuardarCambiosToolBarCompra;
	protected JButton jButtonAbrirOrderByToolBarCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCompra;
	protected JMenuItem jMenuItemDuplicarCompra;
	protected JMenuItem jMenuItemNuevoRelacionesCompra;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCompra;
	protected JMenuItem jMenuItemCopiarCompra;
	protected JMenuItem jMenuItemVerFormCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaCompra;
	protected JMenuItem jMenuItemCerrarCompra;
	protected JMenuItem jMenuItemDetalleCerrarCompra;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarCompra;
	
	protected JMenuItem jMenuItemRecargarInformacionCompra;
	protected JMenuItem jMenuItemProcesarInformacionCompra;
	protected JMenuItem jMenuItemAnterioresCompra;
	protected JMenuItem jMenuItemSiguientesCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCompra;
	protected JMenuItem jMenuItemAbrirOrderByCompra;
	protected JMenuItem jMenuItemMostrarOcultarCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCompra;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCompra;
	protected JCheckBox jCheckBoxSeleccionadosCompra;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCompra;
	protected JCheckBox jCheckBoxConGraficoReporteCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCompra;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCompra;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCompra;
	protected JTextField jTextFieldValorCampoGeneralCompra;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCompra;
	//public JList<Reporte> jListColumnasSelectReporteCompra;
	//public JScrollPane jScrollColumnasSelectReporteCompra;
	
	//public JLabel jLabelRelacionesSelectReporteCompra;
	//public JList<Reporte> jListRelacionesSelectReporteCompra;
	//public JScrollPane jScrollRelacionesSelectReporteCompra;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCompra;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCompra;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCompra;
	//public JLabel jLabelTiposArchivoReporteDinamicoCompra;
	
		
	//public JLabel jLabelArchivoImportacionCompra;	
	//public JLabel jLabelPathArchivoImportacionCompra;
	//protected JTextField jTextFieldPathArchivoImportacionCompra;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCompra;
	
	//public JLabel jLabelColumnaCategoriaValorCompra;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCompra;
	
	//public JLabel jLabelColumnasValoresGraficoCompra;
	//public JList<Reporte> jListColumnasValoresGraficoCompra;
	//public JScrollPane jScrollColumnasValoresGraficoCompra;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCompra;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCompra;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCompra;
	public JPanel jPanelFK_IdAsientoContableCompra;
	public JButton jButtonFK_IdAsientoContableCompra;
	public JPanel jPanelFK_IdClienteCompra;
	public JButton jButtonFK_IdClienteCompra;
	public JPanel jPanelFK_IdEmpleadoCompra;
	public JButton jButtonFK_IdEmpleadoCompra;
	public JPanel jPanelFK_IdEstadoInventarioCompra;
	public JButton jButtonFK_IdEstadoInventarioCompra;
	public JPanel jPanelFK_IdOrdenCompraCompra;
	public JButton jButtonFK_IdOrdenCompraCompra;
	public JPanel jPanelFK_IdPedidoCompraCompra;
	public JButton jButtonFK_IdPedidoCompraCompra;
	public JPanel jPanelFK_IdTipoTransaccionModuloCompra;
	public JButton jButtonFK_IdTipoTransaccionModuloCompra;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableCompra;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableCompra;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra;
	
	public JPanel jPanelid_clienteFK_IdClienteCompra;
	public JLabel jLabelid_clienteFK_IdClienteCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteCompra;
	public JButton jButtonid_clienteFK_IdClienteCompra= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteCompra;
	
	public JPanel jPanelid_empleadoFK_IdEmpleadoCompra;
	public JLabel jLabelid_empleadoFK_IdEmpleadoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoCompra;
	public JButton jButtonid_empleadoFK_IdEmpleadoCompra= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoCompra;
	
	public JPanel jPanelid_estado_inventarioFK_IdEstadoInventarioCompra;
	public JLabel jLabelid_estado_inventarioFK_IdEstadoInventarioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra;
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioCompra= new JButtonMe();
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_inventarioFK_IdEstadoInventarioCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_compraFK_IdOrdenCompraCompra;
	public JLabel jLabelid_orden_compraFK_IdOrdenCompraCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraFK_IdOrdenCompraCompra;
	public JButton jButtonid_orden_compraFK_IdOrdenCompraCompra= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraCompraArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra;
	
	public JPanel jPanelid_pedido_compraFK_IdPedidoCompraCompra;
	public JLabel jLabelid_pedido_compraFK_IdPedidoCompraCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compraFK_IdPedidoCompraCompra;
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraCompra= new JButtonMe();
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraCompraUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compraFK_IdPedidoCompraCompraBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra;
	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompraBusqueda= new JButtonMe();

	
	
	
	
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
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	//public int iHeightFormulario=755;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CompraJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCompra)	{
		this.jButtonRecargarInformacionCompra = jButtonRecargarInformacionCompra;
	}
	
	public JButton getjButtonProcesarInformacionCompra() {
		return this.jButtonProcesarInformacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCompra)	{
		this.jButtonProcesarInformacionCompra = jButtonProcesarInformacionCompra;
	}
	
	
	public JButton getjButtonRecargarInformacionCompra() {
		return this.jButtonRecargarInformacionCompra;
	}
	
	
	public List<Compra> getcompras() {
		return this.compras;
	}

	public void setcompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	public List<Compra> getcomprasAux() {
		return this.comprasAux;
	}

	public void setcomprasAux(List<Compra> comprasAux) {
		this.comprasAux = comprasAux;
	}
	
	public List<Compra> getcomprasEliminados() {
		return this.comprasEliminados;
	}

	public void setComprasEliminados(List<Compra> comprasEliminados) {
		this.comprasEliminados = comprasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCompra() {
		return jComboBoxTiposSeleccionarCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCompra(
			JComboBox jComboBoxTiposSeleccionarCompra) {
		this.jComboBoxTiposSeleccionarCompra = jComboBoxTiposSeleccionarCompra;
	}
	
	public void setBorderResaltarTiposSeleccionarCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCompra .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCompra() {
		return jTextFieldValorCampoGeneralCompra;
	}

	public void setjTextFieldValorCampoGeneralCompra(
			JTextField jTextFieldValorCampoGeneralCompra) {
		this.jTextFieldValorCampoGeneralCompra = jTextFieldValorCampoGeneralCompra;
	}

	public void setBorderResaltarValorCampoGeneralCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCompra .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCompra() {
		return this.jCheckBoxSeleccionarTodosCompra;
	}

	public void setjCheckBoxSeleccionarTodosCompra(
			JCheckBox jCheckBoxSeleccionarTodosCompra) {
		this.jCheckBoxSeleccionarTodosCompra = jCheckBoxSeleccionarTodosCompra;
	}

	public void setBorderResaltarSeleccionarTodosCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCompra .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCompra() {
		return this.jCheckBoxSeleccionadosCompra;
	}

	public void setjCheckBoxSeleccionadosCompra(
			JCheckBox jCheckBoxSeleccionadosCompra) {
		this.jCheckBoxSeleccionadosCompra = jCheckBoxSeleccionadosCompra;
	}
	
	public void setBorderResaltarSeleccionadosCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCompra .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCompra() {
		return this.jComboBoxTiposArchivosReportesCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCompra(
			JComboBox jComboBoxTiposArchivosReportesCompra) {
		this.jComboBoxTiposArchivosReportesCompra = jComboBoxTiposArchivosReportesCompra;
	}

	public void setBorderResaltarTiposArchivosReportesCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCompra() {
		return this.jComboBoxTiposReportesCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCompra(
			JComboBox jComboBoxTiposReportesCompra) {
		this.jComboBoxTiposReportesCompra = jComboBoxTiposReportesCompra;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCompra() {
	//	return jComboBoxTiposReportesDinamicoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCompra(
	//		JComboBox jComboBoxTiposReportesDinamicoCompra) {
	//	this.jComboBoxTiposReportesDinamicoCompra = jComboBoxTiposReportesDinamicoCompra;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCompra() {
	//	return jComboBoxTiposArchivosReportesDinamicoCompra;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCompra(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCompra) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCompra = jComboBoxTiposArchivosReportesDinamicoCompra;
	//}
	
	public void setBorderResaltarTiposReportesCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCompra() {
		return this.jComboBoxTiposGraficosReportesCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCompra(
			JComboBox jComboBoxTiposGraficosReportesCompra) {
		this.jComboBoxTiposGraficosReportesCompra = jComboBoxTiposGraficosReportesCompra;
	}
	
	public void setBorderResaltarTiposGraficosReportesCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCompra() {
		return this.jComboBoxTiposPaginacionCompra;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCompra(
			JComboBox jComboBoxTiposPaginacionCompra) {
		this.jComboBoxTiposPaginacionCompra = jComboBoxTiposPaginacionCompra;
	}
	
	public void setBorderResaltarTiposPaginacionCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCompra .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCompra() {
		return this.jComboBoxTiposRelacionesCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCompra() {
		return this.jComboBoxTiposAccionesCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCompra(
			JComboBox jComboBoxTiposRelacionesCompra) {
		this.jComboBoxTiposRelacionesCompra = jComboBoxTiposRelacionesCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCompra(
			JComboBox jComboBoxTiposAccionesCompra) {
		this.jComboBoxTiposAccionesCompra = jComboBoxTiposAccionesCompra;
	}
	
	public void setBorderResaltarTiposRelacionesCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCompra .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCompra() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCompra.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCompra .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCompra() {
	//	return jCheckBoxConGraficoDinamicoCompra;
	//}

	//public void setjCheckBoxConGraficoDinamicoCompra(
	//		JCheckBox jCheckBoxConGraficoDinamicoCompra) {
	//	this.jCheckBoxConGraficoDinamicoCompra = jCheckBoxConGraficoDinamicoCompra;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCompra() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCompra.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCompra .setBorder(borderResaltar);		
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
		this.compraSessionBean=new CompraSessionBean();
		
		this.compraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.compraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.compraSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Compra MANTENIMIENTO"));
		
		
		if(iWidth > 3350) {
			iWidth=3350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
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
		
		CompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCompra= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCompra,this.jTtoolBarCompra,
							"nuevo","nuevo","Nuevo"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCompra,this.jTtoolBarCompra,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCompra,this.jTtoolBarCompra,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCompra,this.jTtoolBarCompra,
							"duplicar","duplicar","Duplicar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCompra,this.jTtoolBarCompra,
							"copiar","copiar","Copiar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCompra,this.jTtoolBarCompra,
							"ver_form","ver_form","Ver"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompra,this.jTtoolBarCompra,
							"recargar","recargar","Recargar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompra,this.jTtoolBarCompra,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCompra,this.jTtoolBarCompra,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCompra,this.jTtoolBarCompra,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCompra,this.jTtoolBarCompra,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCompra,this.jTtoolBarCompra,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCompra,this.jTtoolBarCompra,
							"cerrar","cerrar","Salir"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCompra=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCompra;
			
				this.jButtonProcesarInformacionToolBarCompra=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCompra;
				
		//protected JButton jButtonModificarToolBarCompra;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCompra=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCompra=new JMenuMe("General");
		this.jmenuArchivoCompra=new JMenuMe("Archivo");
		this.jmenuAccionesCompra=new JMenuMe("Acciones");
		this.jmenuDatosCompra=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCompra= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCompra.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCompra,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCompra= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCompra.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCompra,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCompra= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCompra.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCompra,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCompra= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCompra.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCompra,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCompra= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCompra.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCompra,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCompra= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCompra.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCompra,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCompra= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCompra.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCompra,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCompra= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCompra.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCompra,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCompra= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCompra.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCompra,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCompra= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCompra.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCompra,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCompra= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCompra.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCompra,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCompra.add(this.jMenuItemCerrarCompra);
			
			this.jmenuAccionesCompra.add(this.jMenuItemNuevoCompra);
			this.jmenuAccionesCompra.add(this.jMenuItemNuevoGuardarCambiosCompra);
			this.jmenuAccionesCompra.add(this.jMenuItemNuevoRelacionesCompra);
			this.jmenuAccionesCompra.add(this.jMenuItemGuardarCambiosTablaCompra);		
			this.jmenuAccionesCompra.add(this.jMenuItemDuplicarCompra);		
			this.jmenuAccionesCompra.add(this.jMenuItemCopiarCompra);		
			this.jmenuAccionesCompra.add(this.jMenuItemVerFormCompra);		
			
			this.jmenuDatosCompra.add(this.jMenuItemRecargarInformacionCompra);				
			this.jmenuDatosCompra.add(this.jMenuItemAnterioresCompra);				
			this.jmenuDatosCompra.add(this.jMenuItemSiguientesCompra);				
			this.jmenuDatosCompra.add(this.jMenuItemAbrirOrderByCompra);				
			this.jmenuDatosCompra.add(this.jMenuItemMostrarOcultarCompra);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCompra.add(this.jMenuItemGuardarCambiosCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCompra.add(this.jmenuArchivoCompra);		
			this.jmenuBarCompra.add(this.jmenuAccionesCompra);		
			this.jmenuBarCompra.add(this.jmenuDatosCompra);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCompra);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCompra() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableCompra.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableCompra= new JButtonMe();
		this.jButtonFK_IdAsientoContableCompra.setText("Buscar");
		this.jButtonFK_IdAsientoContableCompra.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableCompra,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableCompra = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableCompra.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableCompra.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra.setFocusable(false);

		this.jPanelFK_IdClienteCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteCompra.setToolTipText("Buscar Por Proveedor ");
		this.jButtonFK_IdClienteCompra= new JButtonMe();
		this.jButtonFK_IdClienteCompra.setText("Buscar");
		this.jButtonFK_IdClienteCompra.setToolTipText("Buscar Por Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteCompra,"buscar_button","Buscar Por Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteCompra = new JLabelMe();
		jLabelid_clienteFK_IdClienteCompra.setText("Proveedor :");
		jLabelid_clienteFK_IdClienteCompra.setToolTipText("Proveedor");
		jLabelid_clienteFK_IdClienteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteCompra= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteCompra= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteCompra.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteCompra.setFocusable(false);

		this.jPanelFK_IdEmpleadoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoCompra.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoCompra= new JButtonMe();
		this.jButtonFK_IdEmpleadoCompra.setText("Buscar");
		this.jButtonFK_IdEmpleadoCompra.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoCompra,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoCompra = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoCompra.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoCompra.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoCompra= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra.setFocusable(false);

		this.jPanelFK_IdEstadoInventarioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoInventarioCompra.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoInventarioCompra= new JButtonMe();
		this.jButtonFK_IdEstadoInventarioCompra.setText("Buscar");
		this.jButtonFK_IdEstadoInventarioCompra.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoInventarioCompra,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoInventarioCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra = new JLabelMe();
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra.setText("Estado :");
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra.setToolTipText("Estado");
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_inventarioFK_IdEstadoInventarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_inventarioFK_IdEstadoInventarioCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra= new JComboBoxMe();
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdOrdenCompraCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenCompraCompra.setToolTipText("Buscar Por Orden Compra ");
		this.jButtonFK_IdOrdenCompraCompra= new JButtonMe();
		this.jButtonFK_IdOrdenCompraCompra.setText("Buscar");
		this.jButtonFK_IdOrdenCompraCompra.setToolTipText("Buscar Por Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenCompraCompra,"buscar_button","Buscar Por Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenCompraCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_compraFK_IdOrdenCompraCompra = new JLabelMe();
		jLabelid_orden_compraFK_IdOrdenCompraCompra.setText("Orden Compra :");
		jLabelid_orden_compraFK_IdOrdenCompraCompra.setToolTipText("Orden Compra");
		jLabelid_orden_compraFK_IdOrdenCompraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraFK_IdOrdenCompraCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_compraFK_IdOrdenCompraCompra= new JComboBoxMe();
		jComboBoxid_orden_compraFK_IdOrdenCompraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraFK_IdOrdenCompraCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra= new JButtonMe();
		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setText("Buscar");
		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra.setFocusable(false);

		this.jPanelFK_IdPedidoCompraCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoCompraCompra.setToolTipText("Buscar Por Pedido Compra ");
		this.jButtonFK_IdPedidoCompraCompra= new JButtonMe();
		this.jButtonFK_IdPedidoCompraCompra.setText("Buscar");
		this.jButtonFK_IdPedidoCompraCompra.setToolTipText("Buscar Por Pedido Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoCompraCompra,"buscar_button","Buscar Por Pedido Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoCompraCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedido_compraFK_IdPedidoCompraCompra = new JLabelMe();
		jLabelid_pedido_compraFK_IdPedidoCompraCompra.setText("Pedido Compra :");
		jLabelid_pedido_compraFK_IdPedidoCompraCompra.setToolTipText("Pedido Compra");
		jLabelid_pedido_compraFK_IdPedidoCompraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_compraFK_IdPedidoCompraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedido_compraFK_IdPedidoCompraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compraFK_IdPedidoCompraCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedido_compraFK_IdPedidoCompraCompra= new JComboBoxMe();
		jComboBoxid_pedido_compraFK_IdPedidoCompraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraFK_IdPedidoCompraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraFK_IdPedidoCompraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compraFK_IdPedidoCompraCompra,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra= new JButtonMe();
		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setText("Buscar");
		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra.setFocusable(false);

		this.jPanelFK_IdTipoTransaccionModuloCompra=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloCompra.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloCompra= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloCompra.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloCompra.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloCompra,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCompra=new JTabbedPane();


		this.jTabbedPaneBusquedasCompra.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCompra.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCompra.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCompra,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCompra = new CompraDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Compra DATOS");
			this.jInternalFrameDetalleFormCompra = new CompraDetalleFormJInternalFrame(jDesktopPane,this.compraSessionBean.getConGuardarRelaciones(),this.compraSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCompra = null;//new CompraDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCompra= new GridBagLayout();
		
		
		this.jTableDatosCompra = new JTableMe();      
		
		String sToolTipCompra="";
		sToolTipCompra=CompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCompra+="(Inventario.Compra)";
		}
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCompra+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCompra.setToolTipText(sToolTipCompra);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCompra);
		this.jTableDatosCompra.setAutoCreateRowSorter(true);
		this.jTableDatosCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCompra.setRowSelectionAllowed(true);
		this.jTableDatosCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCompra,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCompra = new JButtonMe();
		this.jButtonDuplicarCompra = new JButtonMe();
		this.jButtonCopiarCompra = new JButtonMe();
		this.jButtonVerFormCompra = new JButtonMe();
		this.jButtonNuevoRelacionesCompra = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCompra = new JButtonMe();
		this.jButtonCerrarCompra = new JButtonMe();
		
		this.jScrollPanelDatosCompra = new JScrollPane();   
        this.jScrollPanelDatosGeneralCompra = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocoaCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Compra";
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCompra.setToolTipText("Acciones");
        this.jPanelAccionesCompra.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalCompra.setName("jPanelCamposFintotalCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralCompra.setName("jPanelCamposFingeneralCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciocoaCompra.setName("jPanelCamposFincoaCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocoaCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoCompra=new ReporteDinamicoJInternalFrame(CompraConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCompra();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCompra=new ImportacionJInternalFrame(CompraConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCompra();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCompra = new JButtonMe();
		
		this.jButtonAbrirOrderByCompra.setText("Orden");
		this.jButtonAbrirOrderByCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCompra,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompra,false,this);
			
			//this.cargarOrderByCompra(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCompra,true,this);
			
			//this.cargarOrderByCompra(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCompra.setMinimumSize(new Dimension(400,50));//3330
		this.jTableDatosCompra.setMaximumSize(new Dimension(400,50));//3330
		this.jTableDatosCompra.setPreferredSize(new Dimension(400,50));//3330
		
		this.jScrollPanelDatosCompra.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCompra.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCompra.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCompra.setText("Nuevo");
		this.jButtonDuplicarCompra.setText("Duplicar");
		this.jButtonCopiarCompra.setText("Copiar");
		this.jButtonVerFormCompra.setText("Ver");
		this.jButtonNuevoRelacionesCompra.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCompra.setText("Guardar");
		this.jButtonCerrarCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCompra,"nuevo_button","Nuevo",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCompra,"duplicar_button","Duplicar",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCompra,"copiar_button","Copiar",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCompra,"ver_form","Ver",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCompra,"nuevorelaciones_button","Nuevo Rel",this.compraSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCompra,"guardarcambiostabla_button","Guardar",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCompra,"cerrar_button","Salir",this.compraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCompra.setToolTipText("Nuevo"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCompra.setToolTipText("Duplicar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCompra.setToolTipText("Copiar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCompra.setToolTipText("Ver"+" "+CompraConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCompra.setToolTipText("Nuevo Rel"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCompra.setToolTipText("Guardar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCompra.setToolTipText("Salir"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCompra";
		inputMap = this.jButtonNuevoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCompra"));
		
		//DUPLICAR
		sMapKey = "DuplicarCompra";
		inputMap = this.jButtonDuplicarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCompra"));
		
		//COPIAR
		sMapKey = "CopiarCompra";
		inputMap = this.jButtonCopiarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCompra"));
		
		//VEr FORM
		sMapKey = "VerFormCompra";
		inputMap = this.jButtonVerFormCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCompra"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCompra";
		inputMap = this.jButtonNuevoRelacionesCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCompra"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCompra";
		inputMap = this.jButtonModificarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCompra"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCompra";
		inputMap = this.jButtonCerrarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCompra";
		inputMap = this.jButtonGuardarCambiosTablaCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCompra"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Compra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Compra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Compra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Compra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Compra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCompra.setName("jPanelParametrosReportesCompra"); 
		
		this.jPanelParametrosReportesAccionesCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCompra.setName("jPanelParametrosReportesAccionesCompra"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCompra, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCompra, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCompra = new JButtonMe();
		this.jButtonRecargarInformacionCompra.setText("Recargar");
		this.jButtonRecargarInformacionCompra.setToolTipText("Recargar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCompra,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCompra = new JButtonMe();
		this.jButtonProcesarInformacionCompra.setText("Procesar");
		this.jButtonProcesarInformacionCompra.setToolTipText("Procesar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCompra.setVisible(false);
			
		this.jButtonProcesarInformacionCompra.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCompra.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCompra.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompra.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCompra.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompra.setText("TIPO");       
		this.jComboBoxTiposReportesCompra.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCompra = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCompra.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCompra = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCompra.setText("Paginacion");
		this.jComboBoxTiposPaginacionCompra.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCompra = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCompra.setText("Accion");
		this.jComboBoxTiposRelacionesCompra.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCompra.setText("Accion");
		this.jComboBoxTiposAccionesCompra.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCompra = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCompra.setText("Accion");
		this.jComboBoxTiposSeleccionarCompra.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCompra=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCompra.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCompra.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCompra.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCompra = new JLabelMe();
		
		this.jLabelAccionesCompra.setText("Acciones");		
		this.jLabelAccionesCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCompra = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCompra.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCompra.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCompra = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCompra.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCompra.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCompra = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCompra.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCompra.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCompra.setText("Graf.");
		this.jCheckBoxConGraficoReporteCompra.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCompra = new JButtonMe();
		//this.jButtonAnterioresCompra.setText("<<");
        this.jButtonAnterioresCompra.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCompra,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCompra = new JButtonMe();
		//this.jButtonSiguientesCompra.setText(">>");
        this.jButtonSiguientesCompra.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCompra,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCompra = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCompra.setText("Nue");
        this.jButtonNuevoGuardarCambiosCompra.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCompra,"nuevoguardarcambios_button","Nue",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCompra";
		inputMap = this.jButtonNuevoGuardarCambiosCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCompra"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCompra";
		inputMap = this.jButtonRecargarInformacionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCompra"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCompra";
		inputMap = this.jButtonSiguientesCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCompra"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCompra";
		inputMap = this.jButtonAnterioresCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCompra"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCompra();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCompra.setMinimumSize(new Dimension(this.getWidth(),CompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCompra.setMaximumSize(new Dimension(this.getWidth(),CompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompraBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCompra.setPreferredSize(new Dimension(this.getWidth(),CompraBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CompraBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCompra = new GridBagLayout();

			this.jPanelPaginacionCompra.setLayout(gridaBagLayoutPaginacionCompra);						
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = 0;
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCompra.add(this.jButtonAnterioresCompra, this.gridBagConstraintsCompra);
					
						
			this.gridBagConstraintsCompra = new GridBagConstraints();//
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsCompra.gridy = 0;//
			
			this.jPanelPaginacionCompra.add(this.jButtonNuevoGuardarCambiosCompra, this.gridBagConstraintsCompra);//
						
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCompra.gridy = 0;
			this.jPanelPaginacionCompra.add(this.jButtonSiguientesCompra, this.gridBagConstraintsCompra);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCompra = new GridBagConstraints();//
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsCompra.gridy = 1;//
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionCompra.add(this.jButtonNuevoCompra, this.gridBagConstraintsCompra);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCompra = new GridBagConstraints();
				this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCompra.gridy = 1;
				this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCompra.add(this.jButtonNuevoRelacionesCompra, this.gridBagConstraintsCompra);
			}
			
			
			if(!this.compraSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCompra = new GridBagConstraints();//
				this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsCompra.gridy = 1;//
				this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionCompra.add(this.jButtonGuardarCambiosTablaCompra, this.gridBagConstraintsCompra);//
			}
			
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();//
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsCompra.gridy = 1;//
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionCompra.add(this.jButtonDuplicarCompra, this.gridBagConstraintsCompra);//
			
			this.gridBagConstraintsCompra = new GridBagConstraints();//
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsCompra.gridy = 1;//
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionCompra.add(this.jButtonCopiarCompra, this.gridBagConstraintsCompra);//
		
			this.gridBagConstraintsCompra = new GridBagConstraints();//
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsCompra.gridy = 1;//
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionCompra.add(this.jButtonVerFormCompra, this.gridBagConstraintsCompra);//
		
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = 1;
			this.gridBagConstraintsCompra.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCompra.add(this.jButtonCerrarCompra, this.gridBagConstraintsCompra);
		
		
		
		this.jButtonRecargarInformacionCompra.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCompra.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCompra.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCompra.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCompra.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCompra.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCompra.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCompra.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCompra.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCompra.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCompra.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCompra.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCompra.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCompra.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCompra.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCompra, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCompra.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCompra.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCompra.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCompra.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCompra = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCompra = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Compra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Compra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Compra = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Compra = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCompra.setLayout(gridaBagParametrosReportesCompra);
			this.jPanelParametrosReportesAccionesCompra.setLayout(gridaBagParametrosReportesAccionesCompra);
			
			
			this.jPanelParametrosAuxiliar1Compra.setLayout(gridaBagParametrosAuxiliar1Compra);
			this.jPanelParametrosAuxiliar2Compra.setLayout(gridaBagParametrosAuxiliar2Compra);
			this.jPanelParametrosAuxiliar3Compra.setLayout(gridaBagParametrosAuxiliar3Compra);
			this.jPanelParametrosAuxiliar4Compra.setLayout(gridaBagParametrosAuxiliar4Compra);
			//this.jPanelParametrosAuxiliar5Compra.setLayout(gridaBagParametrosAuxiliar2Compra);			
			
			
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompra.add(this.jButtonRecargarInformacionCompra, this.gridBagConstraintsCompra);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Compra.add(this.jComboBoxTiposPaginacionCompra, this.gridBagConstraintsCompra);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Compra.add(this.jCheckBoxConAltoMaximoTablaCompra, this.gridBagConstraintsCompra);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Compra.add(this.jComboBoxTiposArchivosReportesCompra, this.gridBagConstraintsCompra);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompra.add(this.jPanelParametrosAuxiliar1Compra, this.gridBagConstraintsCompra);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Compra.add(this.jComboBoxTiposReportesCompra, this.gridBagConstraintsCompra);																		
			
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Compra.add(this.jComboBoxTiposGraficosReportesCompra, this.gridBagConstraintsCompra);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompra.add(this.jPanelParametrosAuxiliar4Compra, this.gridBagConstraintsCompra);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompra.add(this.jComboBoxTiposReportesCompra, this.gridBagConstraintsCompra);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompra.add(this.jCheckBoxGenerarReporteCompra, this.gridBagConstraintsCompra);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompra.add(this.jPanelParametrosAuxiliar2Compra, this.gridBagConstraintsCompra);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompra.add(this.jLabelAccionesCompra, this.gridBagConstraintsCompra);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCompra = new GridBagConstraints();
				this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCompra.add(this.jButtonAbrirOrderByCompra, this.gridBagConstraintsCompra);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompra.add(this.jComboBoxTiposSeleccionarCompra, this.gridBagConstraintsCompra);			
			
			
			/*
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompra.add(this.jCheckBoxSeleccionarTodosCompra, this.gridBagConstraintsCompra);
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCompra.add(this.jCheckBoxConGraficoReporteCompra, this.gridBagConstraintsCompra);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Compra.add(this.jCheckBoxSeleccionarTodosCompra, this.gridBagConstraintsCompra);															
				
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Compra.add(this.jCheckBoxSeleccionadosCompra, this.gridBagConstraintsCompra);															
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCompra.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Compra.add(this.jCheckBoxConGraficoReporteCompra, this.gridBagConstraintsCompra);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCompra.add(this.jPanelParametrosAuxiliar3Compra, this.gridBagConstraintsCompra);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompra.add(this.jComboBoxTiposRelacionesCompra, this.gridBagConstraintsCompra);
				
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompra.add(this.jComboBoxTiposAccionesCompra, this.gridBagConstraintsCompra);
	
				
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCompra.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCompra.add(this.jTextFieldValorCampoGeneralCompra, this.gridBagConstraintsCompra);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalCompra= new GridBagLayout();
		this.jPanelCamposFintotalCompra.setLayout(gridaBagLayoutCamposFintotalCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneralCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralCompra.setLayout(gridaBagLayoutCamposIniciogeneralCompra);

		GridBagLayout gridaBagLayoutCamposIniciocoaCompra= new GridBagLayout();
		this.jPanelCamposIniciocoaCompra.setLayout(gridaBagLayoutCamposIniciocoaCompra);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCompra = new GridBagLayout();

			this.jScrollPanelDatosCompra.setLayout(gridaBagLayoutDatosCompra);
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = 0;
			this.gridBagConstraintsCompra.gridx = 0;
			
			this.jScrollPanelDatosCompra.add(this.jTableDatosCompra, this.gridBagConstraintsCompra);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCompra.setViewportView(this.jTableDatosCompra);
		this.jTableDatosCompra.setFillsViewportHeight(true);
		this.jTableDatosCompra.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCompra= new GridBagLayout();
		this.jPanelAccionesCompra.setLayout(gridaBagLayoutAccionesCompra);
		
		
		/*	
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 0;
			
		this.jPanelAccionesCompra.add(this.jButtonNuevoCompra, this.gridBagConstraintsCompra);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableCompra= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableCompra.setLayout(gridaBagLayoutFK_IdAsientoContableCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdAsientoContableCompra.add(jLabelid_asiento_contableFK_IdAsientoContableCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdAsientoContableCompra.add(jComboBoxid_asiento_contableFK_IdAsientoContableCompra, gridBagConstraintsCompra);


		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdAsientoContableCompra.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdAsientoContableCompra.add(jButtonFK_IdAsientoContableCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteCompra= new GridBagLayout();
		gridaBagLayoutFK_IdClienteCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteCompra.setLayout(gridaBagLayoutFK_IdClienteCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdClienteCompra.add(jLabelid_clienteFK_IdClienteCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdClienteCompra.add(jComboBoxid_clienteFK_IdClienteCompra, gridBagConstraintsCompra);


		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdClienteCompra.add(this.jButtonBuscarFK_IdClienteid_clienteCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdClienteCompra.add(jButtonFK_IdClienteCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("2.-Por Proveedor ", jPanelFK_IdClienteCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoCompra.setLayout(gridaBagLayoutFK_IdEmpleadoCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdEmpleadoCompra.add(jLabelid_empleadoFK_IdEmpleadoCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdEmpleadoCompra.add(jComboBoxid_empleadoFK_IdEmpleadoCompra, gridBagConstraintsCompra);


		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdEmpleadoCompra.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdEmpleadoCompra.add(jButtonFK_IdEmpleadoCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("3.-Por Empleado ", jPanelFK_IdEmpleadoCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoInventarioCompra= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoInventarioCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoInventarioCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoInventarioCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoInventarioCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoInventarioCompra.setLayout(gridaBagLayoutFK_IdEstadoInventarioCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdEstadoInventarioCompra.add(jLabelid_estado_inventarioFK_IdEstadoInventarioCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdEstadoInventarioCompra.add(jComboBoxid_estado_inventarioFK_IdEstadoInventarioCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdEstadoInventarioCompra.add(jButtonFK_IdEstadoInventarioCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("4.-Por Estado ", jPanelFK_IdEstadoInventarioCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdOrdenCompraCompra= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenCompraCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenCompraCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenCompraCompra.setLayout(gridaBagLayoutFK_IdOrdenCompraCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdOrdenCompraCompra.add(jLabelid_orden_compraFK_IdOrdenCompraCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdOrdenCompraCompra.add(jComboBoxid_orden_compraFK_IdOrdenCompraCompra, gridBagConstraintsCompra);


		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdOrdenCompraCompra.add(this.jButtonBuscarFK_IdOrdenCompraid_orden_compraCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdOrdenCompraCompra.add(jButtonFK_IdOrdenCompraCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("5.-Por Orden Compra ", jPanelFK_IdOrdenCompraCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdPedidoCompraCompra= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoCompraCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoCompraCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoCompraCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoCompraCompra.setLayout(gridaBagLayoutFK_IdPedidoCompraCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdPedidoCompraCompra.add(jLabelid_pedido_compraFK_IdPedidoCompraCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdPedidoCompraCompra.add(jComboBoxid_pedido_compraFK_IdPedidoCompraCompra, gridBagConstraintsCompra);


		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.EAST;
		gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdPedidoCompraCompra.add(this.jButtonBuscarFK_IdPedidoCompraid_pedido_compraCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdPedidoCompraCompra.add(jButtonFK_IdPedidoCompraCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("6.-Por Pedido Compra ", jPanelFK_IdPedidoCompraCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloCompra= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloCompra.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloCompra.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloCompra.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloCompra.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloCompra.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloCompra.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 0;
		gridBagConstraintsCompra.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloCompra.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloCompra, gridBagConstraintsCompra);

		gridBagConstraintsCompra = new GridBagConstraints();
		gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCompra.gridy = 1;
		gridBagConstraintsCompra.gridx =1;
		jPanelFK_IdTipoTransaccionModuloCompra.add(jButtonFK_IdTipoTransaccionModuloCompra, gridBagConstraintsCompra);

		jTabbedPaneBusquedasCompra.addTab("7.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloCompra);
		jTabbedPaneBusquedasCompra.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCompra);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.compraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCompra = new GridBagConstraints();						
			this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompra.gridx = 0;		
			//this.gridBagConstraintsCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCompra.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCompra, this.gridBagConstraintsCompra);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCompra.gridx = 0;		
		//this.gridBagConstraintsCompra.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCompra.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCompra);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompra.gridx = 0;		
			this.gridBagConstraintsCompra.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCompra.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCompra, this.gridBagConstraintsCompra);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCompra, this.gridBagConstraintsCompra);								
		
		
		/*
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCompra, this.gridBagConstraintsCompra);
		*/		
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCompra.gridx =0;
		this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCompra, this.gridBagConstraintsCompra);
				
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCompra, this.gridBagConstraintsCompra);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CompraJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCompra= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCompra = new GridBagLayout();
			this.jPanelBusquedasParametrosCompra.setLayout(gridaBagLayoutBusquedasParametrosCompra);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCompra, this.gridBagConstraintsCompra);
			
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCompra, this.gridBagConstraintsCompra);
		
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCompra, this.gridBagConstraintsCompra);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCompra;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCompra() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCompra.setName("jPanelReporteDinamicoCompra"); 
		
		this.jPanelReporteDinamicoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCompra.setLayout(gridaBagLayoutReporteDinamicoCompra);
		
		
		this.jInternalFrameReporteDinamicoCompra= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCompra.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCompra.setResizable(true);
	    this.jInternalFrameReporteDinamicoCompra.setClosable(true);
	    this.jInternalFrameReporteDinamicoCompra.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCompra = new JLabelMe();

		this.jLabelColumnasSelectReporteCompra.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompra.add(this.jLabelColumnasSelectReporteCompra, this.gridBagConstraintsCompra);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCompra = new JList<Reporte>();
		this.jListColumnasSelectReporteCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCompra=new JScrollPane(this.jListColumnasSelectReporteCompra);
			
			this.jScrollColumnasSelectReporteCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCompra.add(this.jListColumnasSelectReporteCompra, this.gridBagConstraintsCompra);
		this.jPanelReporteDinamicoCompra.add(this.jScrollColumnasSelectReporteCompra, this.gridBagConstraintsCompra);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCompra = new JLabelMe();

		this.jLabelRelacionesSelectReporteCompra.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompra.add(this.jLabelRelacionesSelectReporteCompra, this.gridBagConstraintsCompra);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCompra = new JList<Reporte>();
		this.jListRelacionesSelectReporteCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCompra.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCompra.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCompra.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCompra=new JScrollPane(this.jListRelacionesSelectReporteCompra);
			
			this.jScrollRelacionesSelectReporteCompra.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCompra.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCompra.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCompra.add(this.jListRelacionesSelectReporteCompra, this.gridBagConstraintsCompra);
		this.jPanelReporteDinamicoCompra.add(this.jScrollRelacionesSelectReporteCompra, this.gridBagConstraintsCompra);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCompra = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCompra = new JComboBoxMe();
		this.jListColumnasValoresGraficoCompra = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCompra = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCompra.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCompra = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCompra.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCompra.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCompra.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCompra.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoCompra = new JLabelMe();

		this.jLabelConGraficoDinamicoCompra.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompra.add(this.jLabelConGraficoDinamicoCompra, this.gridBagConstraintsCompra);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoCompra = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoCompra.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoCompra.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoCompra.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCompra.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoCompra.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jCheckBoxConGraficoDinamicoCompra, this.gridBagConstraintsCompra);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoCompra = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoCompra.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCompra.add(this.jLabelColumnaCategoriaGraficoCompra, this.gridBagConstraintsCompra);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoCompra.add(this.jComboBoxColumnaCategoriaGraficoCompra, this.gridBagConstraintsCompra);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorCompra = new JLabelMe();

		this.jLabelColumnaCategoriaValorCompra.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jLabelColumnaCategoriaValorCompra, this.gridBagConstraintsCompra);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorCompra.setText("Accion");
        this.jComboBoxColumnaCategoriaValorCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoCompra.add(this.jComboBoxColumnaCategoriaValorCompra, this.gridBagConstraintsCompra);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoCompra = new JLabelMe();

		this.jLabelColumnasValoresGraficoCompra.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jLabelColumnasValoresGraficoCompra, this.gridBagConstraintsCompra);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoCompra = new JList<Reporte>();
		this.jListColumnasValoresGraficoCompra.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoCompra.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoCompra.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCompra.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoCompra.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoCompra=new JScrollPane(this.jListColumnasValoresGraficoCompra);
			
			this.jScrollColumnasValoresGraficoCompra.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCompra.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoCompra.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoCompra.add(this.jListColumnasSelectReporteCompra, this.gridBagConstraintsCompra);
		this.jPanelReporteDinamicoCompra.add(this.jScrollColumnasValoresGraficoCompra, this.gridBagConstraintsCompra);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoCompra = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoCompra.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jLabelTiposGraficosReportesDinamicoCompra, this.gridBagConstraintsCompra);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoCompra = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoCompra.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoCompra.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoCompra.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jComboBoxTiposGraficosReportesDinamicoCompra, this.gridBagConstraintsCompra);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCompra = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCompra.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jLabelGenerarExcelReporteDinamicoCompra, this.gridBagConstraintsCompra);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCompra = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCompra.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCompra,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCompra.setToolTipText("Generar EXCEL"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCompra.add(this.jButtonGenerarExcelReporteDinamicoCompra, this.gridBagConstraintsCompra);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompra.add(this.jComboBoxTiposReportesDinamicoCompra, this.gridBagConstraintsCompra);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCompra = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCompra.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCompra.add(this.jLabelTiposArchivoReporteDinamicoCompra, this.gridBagConstraintsCompra);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompra.add(this.jComboBoxTiposArchivosReportesDinamicoCompra, this.gridBagConstraintsCompra);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCompra = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCompra.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCompra,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCompra.setToolTipText("Generar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompra.add(this.jButtonGenerarReporteDinamicoCompra, this.gridBagConstraintsCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCompra = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCompra.setToolTipText("Cancelar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCompra.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCompra.add(this.jButtonCerrarReporteDinamicoCompra, this.gridBagConstraintsCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCompra = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCompra= new JScrollPane(jPanelReporteDinamicoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCompra.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCompra.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCompra.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCompra.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCompra.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCompra);
		this.jInternalFrameReporteDinamicoCompra.getContentPane().add(this.jScrollPanelReporteDinamicoCompra, this.gridBagConstraintsCompra);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCompra() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCompra = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCompra.setName("jPanelImportacionCompra"); 
		
		this.jPanelImportacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCompra.setLayout(gridaBagLayoutImportacionCompra);
		
		
		this.jInternalFrameImportacionCompra= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCompra= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCompra = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCompra= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCompra.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCompra.setResizable(true);
	    this.jInternalFrameImportacionCompra.setClosable(true);
	    this.jInternalFrameImportacionCompra.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCompra.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCompra.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCompra.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCompra.setResizable(true);
	    this.jInternalFrameImportacionCompra.setClosable(true);
	    this.jInternalFrameImportacionCompra.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCompra.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCompra.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCompra.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCompra = new JLabelMe();

		this.jLabelArchivoImportacionCompra.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCompra.add(this.jLabelArchivoImportacionCompra, this.gridBagConstraintsCompra);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCompra = new JFileChooser();		
		this.jFileChooserImportacionCompra.setToolTipText("ESCOGER ARCHIVO"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCompra = new JButtonMe();
		this.jButtonAbrirImportacionCompra.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCompra,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCompra.setToolTipText("Generar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompra.add(this.jButtonAbrirImportacionCompra, this.gridBagConstraintsCompra);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCompra = new JLabelMe();

		this.jLabelPathArchivoImportacionCompra.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;		
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCompra.add(this.jLabelPathArchivoImportacionCompra, this.gridBagConstraintsCompra);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCompra=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCompra.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCompra.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCompra.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompra.add(this.jTextFieldPathArchivoImportacionCompra, this.gridBagConstraintsCompra);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCompra = new JButtonMe();
		this.jButtonGenerarImportacionCompra.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCompra,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCompra.setToolTipText("Generar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompra.add(this.jButtonGenerarImportacionCompra, this.gridBagConstraintsCompra);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCompra = new JButtonMe();
		this.jButtonCerrarImportacionCompra.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCompra,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCompra.setToolTipText("Cancelar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = iPosYImportacion;
		this.gridBagConstraintsCompra.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCompra.add(this.jButtonCerrarImportacionCompra, this.gridBagConstraintsCompra);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCompra = new GridBagLayout();
		
		this.jScrollPanelImportacionCompra= new JScrollPane(jPanelImportacionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iPosYImportacion;
		this.gridBagConstraintsCompra.gridx =iPosXImportacion;
		this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCompra.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCompra);
		this.jInternalFrameImportacionCompra.getContentPane().add(this.jScrollPanelImportacionCompra, this.gridBagConstraintsCompra);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCompra(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCompra = new JButtonMe();
			this.jButtonAbrirOrderByCompra.setText("Orden");
			this.jButtonAbrirOrderByCompra.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCompra,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCompra";
			inputMap = this.jButtonAbrirOrderByCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCompra"));
		
		
			GridBagLayout gridaBagLayoutOrderByCompra = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCompra.setName("jPanelOrderByCompra"); 
			
			this.jPanelOrderByCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCompra.setLayout(gridaBagLayoutOrderByCompra);
			
			
			this.jTableDatosCompraOrderBy = new JTableMe();        
			this.jTableDatosCompraOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCompraOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCompraOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCompraOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCompraOrderBy.setViewportView(this.jTableDatosCompraOrderBy);
			this.jTableDatosCompraOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCompraOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCompra= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCompra= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCompra = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCompra= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCompra.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCompra.setTitle("Orden");
			this.jInternalFrameOrderByCompra.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCompra.setResizable(true);
			this.jInternalFrameOrderByCompra.setClosable(true);
			this.jInternalFrameOrderByCompra.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCompra.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCompra.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCompra.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCompra.ipady =150;
				
			this.jPanelOrderByCompra.add(jScrollPanelDatosCompraOrderBy, this.gridBagConstraintsCompra);//this.jTableDatosCompraTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCompra = new JButtonMe();
			this.jButtonCerrarOrderByCompra.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCompra,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCompra.setToolTipText("Cancelar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCompra.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCompra.add(this.jButtonCerrarOrderByCompra, this.gridBagConstraintsCompra);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCompra = new GridBagLayout();
			
			this.jScrollPanelOrderByCompra= new JScrollPane(jPanelOrderByCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy =iPosYOrderBy;
			this.gridBagConstraintsCompra.gridx =iPosXOrderBy;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCompra.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCompra.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCompra);
			
			this.jInternalFrameOrderByCompra.getContentPane().add(this.jScrollPanelOrderByCompra, this.gridBagConstraintsCompra);			
		
		} else {
			this.jButtonAbrirOrderByCompra = new JButtonMe();
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
		int iWidthTableCalculado=0;//8430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.compraSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCompra.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCompra.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCompra.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCompra.getRowHeight();//CompraConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCompra.isSelected()) {
					iHeightTable=CompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCompra.isSelected()) {
					iHeightTable=CompraConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CompraConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCompra.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCompra.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCompra.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCompra!=null && this.jInternalFrameOrderByCompra.getjTableDatosOrderBy()!=null) {
			//if(!this.compraSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCompra.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCompra.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCompra.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCompra.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCompra.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCompra.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCompra.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCompra.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCompra.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCompra.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=compraLogic.getCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=compras.size();
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
	public static List<Compra> TraerCompraBeans(List<Compra> compras,ArrayList<Classe> classes)throws Exception {
		try {
			for(Compra compra:compras) {
					
				if(!(CompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CompraConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					compra.setsDetalleGeneralEntityReporte(CompraConstantesFunciones.getCompraDescripcion(compra));
										
						
					
					

					if(compra.getRetencionInvens()!=null && Funciones.existeClass(classes,RetencionInven.class)) {
						try{compra.setretencioninvensDescripcionReporte(new JRBeanCollectionDataSource(RetencionInvenJInternalFrame.TraerRetencionInvenBeans(compra.getRetencionInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(compra.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{compra.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(compra.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(compra.getFormaPagoInvens()!=null && Funciones.existeClass(classes,FormaPagoInven.class)) {
						try{compra.setformapagoinvensDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoInvenJInternalFrame.TraerFormaPagoInvenBeans(compra.getFormaPagoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(compra.getDetalleCompras()!=null && Funciones.existeClass(classes,DetalleCompra.class)) {
						try{compra.setdetallecomprasDescripcionReporte(new JRBeanCollectionDataSource(DetalleCompraJInternalFrame.TraerDetalleCompraBeans(compra.getDetalleCompras(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//compra.setsDetalleGeneralEntityReporte(compra.getsDetalleGeneralEntityReporte());
										
				}
				
				//comprabeans.add(comprabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return compras;
    }
	//PARA REPORTES FIN
}
