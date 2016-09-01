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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.PedidoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class PedidoPuntoVentaJInternalFrame extends PedidoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoPuntoVenta;
	
	protected JMenuBar jmenuBarPedidoPuntoVenta;
	
	protected JMenu jmenuPedidoPuntoVenta;
	protected JMenu jmenuDatosPedidoPuntoVenta;
	protected JMenu jmenuArchivoPedidoPuntoVenta;
	protected JMenu jmenuAccionesPedidoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsPedidoPuntoVenta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoPuntoVentaDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoPuntoVenta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoPuntoVenta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoPuntoVenta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected EstadoPedidoPuntoVentaBeanSwingJInternalFrame estadopedidopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidopuntoventa="";
	
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public EstadoPedidoPuntoVentaSessionBean estadopedidopuntoventaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoPuntoVenta> pedidopuntoventas;		
	public List<PedidoPuntoVenta> pedidopuntoventasEliminados;	
	public List<PedidoPuntoVenta> pedidopuntoventasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoPuntoVenta;		
	protected JButton jButtonAbrirOrderByPedidoPuntoVenta;
	
	
	//protected JPanel jPanelOrderByPedidoPuntoVenta;
	//public JScrollPane jScrollPanelOrderByPedidoPuntoVenta;	
	//protected JButton jButtonCerrarOrderByPedidoPuntoVenta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoPuntoVentaLogic pedidopuntoventaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionPedidoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralPedidoPuntoVenta;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoPuntoVentaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoPuntoVenta;
	//public JScrollPane jScrollPanelImportacionPedidoPuntoVenta;
	
	
	
	protected JPanel jPanelAccionesPedidoPuntoVenta;
	
    protected JPanel jPanelPaginacionPedidoPuntoVenta;
    protected JPanel jPanelParametrosReportesPedidoPuntoVenta;
	protected JPanel jPanelParametrosReportesAccionesPedidoPuntoVenta;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalPedidoPuntoVenta;
	protected Integer iXPanelCamposFintotalPedidoPuntoVenta=0;
	protected Integer iYPanelCamposFintotalPedidoPuntoVenta=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar2PedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar3PedidoPuntoVenta;
	protected JPanel jPanelParametrosAuxiliar4PedidoPuntoVenta;
	//protected JPanel jPanelParametrosAuxiliar5PedidoPuntoVenta;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoPuntoVenta;
	//protected JPanel jPanelImportacionPedidoPuntoVenta;
	
	
	public JTable jTableDatosPedidoPuntoVenta;
	
	
	
	//public JTable jTableDatosPedidoPuntoVentaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoPuntoVenta;
	protected JButton jButtonDuplicarPedidoPuntoVenta;
	protected JButton jButtonCopiarPedidoPuntoVenta;
	protected JButton jButtonVerFormPedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesPedidoPuntoVenta;
	protected JButton jButtonModificarPedidoPuntoVenta;
	
    protected JButton jButtonGuardarCambiosTablaPedidoPuntoVenta;
	protected JButton jButtonCerrarPedidoPuntoVenta;
	
	
	protected JButton jButtonRecargarInformacionPedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionPedidoPuntoVenta;
	
	
	protected JButton jButtonAnterioresPedidoPuntoVenta;
	protected JButton jButtonSiguientesPedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosPedidoPuntoVenta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoPuntoVenta;
	//protected JButton jButtonCerrarReporteDinamicoPedidoPuntoVenta;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoPuntoVenta;
	//protected JButton jButtonGenerarImportacionPedidoPuntoVenta;
	//protected JButton jButtonCerrarImportacionPedidoPuntoVenta;
	//protected JFileChooser jFileChooserImportacionPedidoPuntoVenta;
	//protected File fileImportacionPedidoPuntoVenta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoPuntoVenta;
	protected JButton jButtonDuplicarToolBarPedidoPuntoVenta;
	protected JButton jButtonNuevoRelacionesToolBarPedidoPuntoVenta;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoPuntoVenta;
	protected JButton jButtonCopiarToolBarPedidoPuntoVenta;
	protected JButton jButtonVerFormToolBarPedidoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoPuntoVenta;
	protected JButton jButtonCerrarToolBarPedidoPuntoVenta;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoPuntoVenta;
	protected JButton jButtonProcesarInformacionToolBarPedidoPuntoVenta;
	protected JButton jButtonAnterioresToolBarPedidoPuntoVenta;
	protected JButton jButtonSiguientesToolBarPedidoPuntoVenta;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoPuntoVenta;
	protected JButton jButtonAbrirOrderByToolBarPedidoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoPuntoVenta;
	protected JMenuItem jMenuItemDuplicarPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoPuntoVenta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoPuntoVenta;
	protected JMenuItem jMenuItemCopiarPedidoPuntoVenta;
	protected JMenuItem jMenuItemVerFormPedidoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoPuntoVenta;
	protected JMenuItem jMenuItemCerrarPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoPuntoVenta;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoPuntoVenta;
	protected JMenuItem jMenuItemProcesarInformacionPedidoPuntoVenta;
	protected JMenuItem jMenuItemAnterioresPedidoPuntoVenta;
	protected JMenuItem jMenuItemSiguientesPedidoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoPuntoVenta;
	protected JMenuItem jMenuItemAbrirOrderByPedidoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarPedidoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoPuntoVenta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoPuntoVenta;
	protected JCheckBox jCheckBoxSeleccionadosPedidoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoPuntoVenta;
	protected JCheckBox jCheckBoxConGraficoReportePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoPuntoVenta;
	protected JTextField jTextFieldValorCampoGeneralPedidoPuntoVenta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoPuntoVenta;
	//public JList<Reporte> jListColumnasSelectReportePedidoPuntoVenta;
	//public JScrollPane jScrollColumnasSelectReportePedidoPuntoVenta;
	
	//public JLabel jLabelRelacionesSelectReportePedidoPuntoVenta;
	//public JList<Reporte> jListRelacionesSelectReportePedidoPuntoVenta;
	//public JScrollPane jScrollRelacionesSelectReportePedidoPuntoVenta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoPuntoVenta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoPuntoVenta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta;
	
		
	//public JLabel jLabelArchivoImportacionPedidoPuntoVenta;	
	//public JLabel jLabelPathArchivoImportacionPedidoPuntoVenta;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoPuntoVenta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoPuntoVenta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoPuntoVenta;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoPuntoVenta;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoPuntoVenta;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoPuntoVenta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoPuntoVenta;
	public JPanel jPanelFK_IdCajaPedidoPuntoVenta;
	public JButton jButtonFK_IdCajaPedidoPuntoVenta;
	public JPanel jPanelFK_IdClientePedidoPuntoVenta;
	public JButton jButtonFK_IdClientePedidoPuntoVenta;
	public JPanel jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta;
	public JButton jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta;
	public JPanel jPanelFK_IdMesaPedidoPuntoVenta;
	public JButton jButtonFK_IdMesaPedidoPuntoVenta;
	public JPanel jPanelFK_IdTipoPrecioPedidoPuntoVenta;
	public JButton jButtonFK_IdTipoPrecioPedidoPuntoVenta;
	public JPanel jPanelFK_IdVendedorPedidoPuntoVenta;
	public JButton jButtonFK_IdVendedorPedidoPuntoVenta;
	
	public JPanel jPanelid_cajaFK_IdCajaPedidoPuntoVenta;
	public JLabel jLabelid_cajaFK_IdCajaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta;
	public JButton jButtonid_cajaFK_IdCajaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaFK_IdCajaPedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClientePedidoPuntoVenta;
	public JLabel jLabelid_clienteFK_IdClientePedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedidoPuntoVenta;
	public JButton jButtonid_clienteFK_IdClientePedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoPuntoVentaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta;
	
	public JPanel jPanelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta;
	public JLabel jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta;
	public JButton jButtonid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_mesaFK_IdMesaPedidoPuntoVenta;
	public JLabel jLabelid_mesaFK_IdMesaPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta;
	public JButton jButtonid_mesaFK_IdMesaPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaFK_IdMesaPedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorPedidoPuntoVenta;
	public JLabel jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta;
	public JButton jButtonid_vendedorFK_IdVendedorPedidoPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoPuntoVentaArbol= new JButtonMe();

	
	
	
	
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
	public PedidoPuntoVentaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoPuntoVentaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoPuntoVenta)	{
		this.jButtonRecargarInformacionPedidoPuntoVenta = jButtonRecargarInformacionPedidoPuntoVenta;
	}
	
	public JButton getjButtonProcesarInformacionPedidoPuntoVenta() {
		return this.jButtonProcesarInformacionPedidoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoPuntoVenta)	{
		this.jButtonProcesarInformacionPedidoPuntoVenta = jButtonProcesarInformacionPedidoPuntoVenta;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoPuntoVenta() {
		return this.jButtonRecargarInformacionPedidoPuntoVenta;
	}
	
	
	public List<PedidoPuntoVenta> getpedidopuntoventas() {
		return this.pedidopuntoventas;
	}

	public void setpedidopuntoventas(List<PedidoPuntoVenta> pedidopuntoventas) {
		this.pedidopuntoventas = pedidopuntoventas;
	}
	
	public List<PedidoPuntoVenta> getpedidopuntoventasAux() {
		return this.pedidopuntoventasAux;
	}

	public void setpedidopuntoventasAux(List<PedidoPuntoVenta> pedidopuntoventasAux) {
		this.pedidopuntoventasAux = pedidopuntoventasAux;
	}
	
	public List<PedidoPuntoVenta> getpedidopuntoventasEliminados() {
		return this.pedidopuntoventasEliminados;
	}

	public void setPedidoPuntoVentasEliminados(List<PedidoPuntoVenta> pedidopuntoventasEliminados) {
		this.pedidopuntoventasEliminados = pedidopuntoventasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoPuntoVenta() {
		return jComboBoxTiposSeleccionarPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoPuntoVenta(
			JComboBox jComboBoxTiposSeleccionarPedidoPuntoVenta) {
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta = jComboBoxTiposSeleccionarPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoPuntoVenta() {
		return jTextFieldValorCampoGeneralPedidoPuntoVenta;
	}

	public void setjTextFieldValorCampoGeneralPedidoPuntoVenta(
			JTextField jTextFieldValorCampoGeneralPedidoPuntoVenta) {
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta = jTextFieldValorCampoGeneralPedidoPuntoVenta;
	}

	public void setBorderResaltarValorCampoGeneralPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoPuntoVenta() {
		return this.jCheckBoxSeleccionarTodosPedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionarTodosPedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionarTodosPedidoPuntoVenta) {
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta = jCheckBoxSeleccionarTodosPedidoPuntoVenta;
	}

	public void setBorderResaltarSeleccionarTodosPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoPuntoVenta() {
		return this.jCheckBoxSeleccionadosPedidoPuntoVenta;
	}

	public void setjCheckBoxSeleccionadosPedidoPuntoVenta(
			JCheckBox jCheckBoxSeleccionadosPedidoPuntoVenta) {
		this.jCheckBoxSeleccionadosPedidoPuntoVenta = jCheckBoxSeleccionadosPedidoPuntoVenta;
	}
	
	public void setBorderResaltarSeleccionadosPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoPuntoVenta() {
		return this.jComboBoxTiposArchivosReportesPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoPuntoVenta(
			JComboBox jComboBoxTiposArchivosReportesPedidoPuntoVenta) {
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta = jComboBoxTiposArchivosReportesPedidoPuntoVenta;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoPuntoVenta() {
		return this.jComboBoxTiposReportesPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoPuntoVenta(
			JComboBox jComboBoxTiposReportesPedidoPuntoVenta) {
		this.jComboBoxTiposReportesPedidoPuntoVenta = jComboBoxTiposReportesPedidoPuntoVenta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoPuntoVenta() {
	//	return jComboBoxTiposReportesDinamicoPedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoPuntoVenta(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoPuntoVenta) {
	//	this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta = jComboBoxTiposReportesDinamicoPedidoPuntoVenta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta = jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta;
	//}
	
	public void setBorderResaltarTiposReportesPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoPuntoVenta() {
		return this.jComboBoxTiposGraficosReportesPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoPuntoVenta(
			JComboBox jComboBoxTiposGraficosReportesPedidoPuntoVenta) {
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta = jComboBoxTiposGraficosReportesPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoPuntoVenta() {
		return this.jComboBoxTiposPaginacionPedidoPuntoVenta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoPuntoVenta(
			JComboBox jComboBoxTiposPaginacionPedidoPuntoVenta) {
		this.jComboBoxTiposPaginacionPedidoPuntoVenta = jComboBoxTiposPaginacionPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoPuntoVenta() {
		return this.jComboBoxTiposRelacionesPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoPuntoVenta() {
		return this.jComboBoxTiposAccionesPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesPedidoPuntoVenta) {
		this.jComboBoxTiposRelacionesPedidoPuntoVenta = jComboBoxTiposRelacionesPedidoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoPuntoVenta(
			JComboBox jComboBoxTiposAccionesPedidoPuntoVenta) {
		this.jComboBoxTiposAccionesPedidoPuntoVenta = jComboBoxTiposAccionesPedidoPuntoVenta;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoPuntoVenta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoPuntoVenta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoPuntoVenta() {
	//	return jCheckBoxConGraficoDinamicoPedidoPuntoVenta;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoPuntoVenta(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoPuntoVenta) {
	//	this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta = jCheckBoxConGraficoDinamicoPedidoPuntoVenta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoPuntoVenta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoPuntoVenta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta .setBorder(borderResaltar);		
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
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidopuntoventaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 2150) {
			iWidth=2150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoPuntoVenta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"nuevo","nuevo","Nuevo"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"duplicar","duplicar","Duplicar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"copiar","copiar","Copiar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"ver_form","ver_form","Ver"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"recargar","recargar","Recargar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoPuntoVenta,this.jTtoolBarPedidoPuntoVenta,
							"cerrar","cerrar","Salir"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoPuntoVenta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoPuntoVenta;
			
				this.jButtonProcesarInformacionToolBarPedidoPuntoVenta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoPuntoVenta;
				
		//protected JButton jButtonModificarToolBarPedidoPuntoVenta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoPuntoVenta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoPuntoVenta=new JMenuMe("General");
		this.jmenuArchivoPedidoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDatosPedidoPuntoVenta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoPuntoVenta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoPuntoVenta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoPuntoVenta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoPuntoVenta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoPuntoVenta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoPuntoVenta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoPuntoVenta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoPuntoVenta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoPuntoVenta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoPuntoVenta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoPuntoVenta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoPuntoVenta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoPuntoVenta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoPuntoVenta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoPuntoVenta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoPuntoVenta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoPuntoVenta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoPuntoVenta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoPuntoVenta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoPuntoVenta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoPuntoVenta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoPuntoVenta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoPuntoVenta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoPuntoVenta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoPuntoVenta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoPuntoVenta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoPuntoVenta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoPuntoVenta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoPuntoVenta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoPuntoVenta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoPuntoVenta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoPuntoVenta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoPuntoVenta.add(this.jMenuItemCerrarPedidoPuntoVenta);
			
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemNuevoPedidoPuntoVenta);
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemNuevoGuardarCambiosPedidoPuntoVenta);
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemNuevoRelacionesPedidoPuntoVenta);
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosTablaPedidoPuntoVenta);		
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemDuplicarPedidoPuntoVenta);		
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemCopiarPedidoPuntoVenta);		
			this.jmenuAccionesPedidoPuntoVenta.add(this.jMenuItemVerFormPedidoPuntoVenta);		
			
			this.jmenuDatosPedidoPuntoVenta.add(this.jMenuItemRecargarInformacionPedidoPuntoVenta);				
			this.jmenuDatosPedidoPuntoVenta.add(this.jMenuItemAnterioresPedidoPuntoVenta);				
			this.jmenuDatosPedidoPuntoVenta.add(this.jMenuItemSiguientesPedidoPuntoVenta);				
			this.jmenuDatosPedidoPuntoVenta.add(this.jMenuItemAbrirOrderByPedidoPuntoVenta);				
			this.jmenuDatosPedidoPuntoVenta.add(this.jMenuItemMostrarOcultarPedidoPuntoVenta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoPuntoVenta.add(this.jMenuItemGuardarCambiosPedidoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoPuntoVenta.add(this.jmenuArchivoPedidoPuntoVenta);		
			this.jmenuBarPedidoPuntoVenta.add(this.jmenuAccionesPedidoPuntoVenta);		
			this.jmenuBarPedidoPuntoVenta.add(this.jmenuDatosPedidoPuntoVenta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoPuntoVenta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoPuntoVenta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCajaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCajaPedidoPuntoVenta.setToolTipText("Buscar Por Caja ");
		this.jButtonFK_IdCajaPedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdCajaPedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdCajaPedidoPuntoVenta.setToolTipText("Buscar Por Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCajaPedidoPuntoVenta,"buscar_button","Buscar Por Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCajaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta = new JLabelMe();
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta.setText("Caja :");
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta.setToolTipText("Caja");
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cajaFK_IdCajaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFK_IdCajaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClientePedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedidoPuntoVenta.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdClientePedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdClientePedidoPuntoVenta.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedidoPuntoVenta,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedidoPuntoVenta = new JLabelMe();
		jLabelid_clienteFK_IdClientePedidoPuntoVenta.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedidoPuntoVenta.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta = new JLabelMe();
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setText("Estado :");
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setToolTipText("Estado");
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMesaPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMesaPedidoPuntoVenta.setToolTipText("Buscar Por Mesa ");
		this.jButtonFK_IdMesaPedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdMesaPedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdMesaPedidoPuntoVenta.setToolTipText("Buscar Por Mesa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMesaPedidoPuntoVenta,"buscar_button","Buscar Por Mesa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMesaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta = new JLabelMe();
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta.setText("Mesa :");
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta.setToolTipText("Mesa");
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_mesaFK_IdMesaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_mesaFK_IdMesaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioPedidoPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioPedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdTipoPrecioPedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdTipoPrecioPedidoPuntoVenta.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioPedidoPuntoVenta,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorPedidoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorPedidoPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorPedidoPuntoVenta= new JButtonMe();
		this.jButtonFK_IdVendedorPedidoPuntoVenta.setText("Buscar");
		this.jButtonFK_IdVendedorPedidoPuntoVenta.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorPedidoPuntoVenta,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedidoPuntoVenta=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPedidoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidoPuntoVenta = new PedidoPuntoVentaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Punto Venta DATOS");
			this.jInternalFrameDetalleFormPedidoPuntoVenta = new PedidoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.pedidopuntoventaSessionBean.getConGuardarRelaciones(),this.pedidopuntoventaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoPuntoVenta = null;//new PedidoPuntoVentaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoPuntoVenta= new GridBagLayout();
		
		
		this.jTableDatosPedidoPuntoVenta = new JTableMe();      
		
		String sToolTipPedidoPuntoVenta="";
		sToolTipPedidoPuntoVenta=PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoPuntoVenta+="(PuntoVenta.PedidoPuntoVenta)";
		}
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoPuntoVenta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoPuntoVenta.setToolTipText(sToolTipPedidoPuntoVenta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoPuntoVenta);
		this.jTableDatosPedidoPuntoVenta.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoPuntoVenta.setRowSelectionAllowed(true);
		this.jTableDatosPedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoPuntoVenta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoPuntoVenta = new JButtonMe();
		this.jButtonDuplicarPedidoPuntoVenta = new JButtonMe();
		this.jButtonCopiarPedidoPuntoVenta = new JButtonMe();
		this.jButtonVerFormPedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoPuntoVenta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarPedidoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosPedidoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoPuntoVenta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Pedido Punto Venta";
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesPedidoPuntoVenta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedidoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedidoPuntoVenta.setName("jPanelCamposFintotalPedidoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoPedidoPuntoVenta=new ReporteDinamicoJInternalFrame(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoPuntoVenta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoPuntoVenta=new ImportacionJInternalFrame(PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoPuntoVenta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoPuntoVenta = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoPuntoVenta.setText("Orden");
		this.jButtonAbrirOrderByPedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoPuntoVenta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoPuntoVenta,false,this);
			
			//this.cargarOrderByPedidoPuntoVenta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoPuntoVenta,true,this);
			
			//this.cargarOrderByPedidoPuntoVenta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoPuntoVenta.setMinimumSize(new Dimension(400,50));//2130
		this.jTableDatosPedidoPuntoVenta.setMaximumSize(new Dimension(400,50));//2130
		this.jTableDatosPedidoPuntoVenta.setPreferredSize(new Dimension(400,50));//2130
		
		this.jScrollPanelDatosPedidoPuntoVenta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoPuntoVenta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoPuntoVenta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoPuntoVenta.setText("Nuevo");
		this.jButtonDuplicarPedidoPuntoVenta.setText("Duplicar");
		this.jButtonCopiarPedidoPuntoVenta.setText("Copiar");
		this.jButtonVerFormPedidoPuntoVenta.setText("Ver");
		this.jButtonNuevoRelacionesPedidoPuntoVenta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.setText("Guardar");
		this.jButtonCerrarPedidoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoPuntoVenta,"nuevo_button","Nuevo",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoPuntoVenta,"duplicar_button","Duplicar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoPuntoVenta,"copiar_button","Copiar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoPuntoVenta,"ver_form","Ver",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoPuntoVenta,"nuevorelaciones_button","Nuevo Rel",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoPuntoVenta,"guardarcambiostabla_button","Guardar",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoPuntoVenta,"cerrar_button","Salir",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoPuntoVenta.setToolTipText("Nuevo"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoPuntoVenta.setToolTipText("Duplicar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoPuntoVenta.setToolTipText("Copiar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoPuntoVenta.setToolTipText("Ver"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoPuntoVenta.setToolTipText("Nuevo Rel"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.setToolTipText("Guardar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoPuntoVenta.setToolTipText("Salir"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoPuntoVenta";
		inputMap = this.jButtonNuevoPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoPuntoVenta"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoPuntoVenta";
		inputMap = this.jButtonDuplicarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoPuntoVenta"));
		
		//COPIAR
		sMapKey = "CopiarPedidoPuntoVenta";
		inputMap = this.jButtonCopiarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoPuntoVenta"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoPuntoVenta";
		inputMap = this.jButtonVerFormPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoPuntoVenta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoPuntoVenta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoPuntoVenta";
		inputMap = this.jButtonModificarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoPuntoVenta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoPuntoVenta";
		inputMap = this.jButtonCerrarPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoPuntoVenta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoPuntoVenta.setName("jPanelParametrosReportesPedidoPuntoVenta"); 
		
		this.jPanelParametrosReportesAccionesPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoPuntoVenta.setName("jPanelParametrosReportesAccionesPedidoPuntoVenta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoPuntoVenta = new JButtonMe();
		this.jButtonRecargarInformacionPedidoPuntoVenta.setText("Recargar");
		this.jButtonRecargarInformacionPedidoPuntoVenta.setToolTipText("Recargar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoPuntoVenta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoPuntoVenta = new JButtonMe();
		this.jButtonProcesarInformacionPedidoPuntoVenta.setText("Procesar");
		this.jButtonProcesarInformacionPedidoPuntoVenta.setToolTipText("Procesar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoPuntoVenta.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoPuntoVenta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoPuntoVenta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoPuntoVenta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoPuntoVenta.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoPuntoVenta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoPuntoVenta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoPuntoVenta.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoPuntoVenta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesPedidoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoPuntoVenta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoPuntoVenta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoPuntoVenta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoPuntoVenta = new JButtonMe();
		//this.jButtonAnterioresPedidoPuntoVenta.setText("<<");
        this.jButtonAnterioresPedidoPuntoVenta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoPuntoVenta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoPuntoVenta = new JButtonMe();
		//this.jButtonSiguientesPedidoPuntoVenta.setText(">>");
        this.jButtonSiguientesPedidoPuntoVenta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoPuntoVenta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoPuntoVenta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoPuntoVenta.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoPuntoVenta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoPuntoVenta,"nuevoguardarcambios_button","Nue",this.pedidopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoPuntoVenta";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoPuntoVenta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoPuntoVenta";
		inputMap = this.jButtonRecargarInformacionPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoPuntoVenta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoPuntoVenta";
		inputMap = this.jButtonSiguientesPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoPuntoVenta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoPuntoVenta";
		inputMap = this.jButtonAnterioresPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoPuntoVenta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoPuntoVenta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoPuntoVenta.setMinimumSize(new Dimension(this.getWidth(),PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoPuntoVenta.setMaximumSize(new Dimension(this.getWidth(),PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoPuntoVenta.setPreferredSize(new Dimension(this.getWidth(),PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoPuntoVentaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoPuntoVenta = new GridBagLayout();

			this.jPanelPaginacionPedidoPuntoVenta.setLayout(gridaBagLayoutPaginacionPedidoPuntoVenta);						
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonAnterioresPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					
						
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;//
			
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonNuevoGuardarCambiosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
						
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonSiguientesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonNuevoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;
				this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonNuevoRelacionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			}
			
			
			if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
				this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;//
				this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonGuardarCambiosTablaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
			}
			
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonDuplicarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonCopiarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
		
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();//
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;//
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonVerFormPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);//
		
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 1;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoPuntoVenta.add(this.jButtonCerrarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		
		this.jButtonRecargarInformacionPedidoPuntoVenta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoPuntoVenta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoPuntoVenta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoPuntoVenta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoPuntoVenta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoPuntoVenta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoPuntoVenta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoPuntoVenta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoPuntoVenta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoPuntoVenta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoPuntoVenta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoPuntoVenta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoPuntoVenta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoPuntoVenta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoPuntoVenta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoPuntoVenta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoPuntoVenta.setLayout(gridaBagParametrosReportesPedidoPuntoVenta);
			this.jPanelParametrosReportesAccionesPedidoPuntoVenta.setLayout(gridaBagParametrosReportesAccionesPedidoPuntoVenta);
			
			
			this.jPanelParametrosAuxiliar1PedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar1PedidoPuntoVenta);
			this.jPanelParametrosAuxiliar2PedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2PedidoPuntoVenta);
			this.jPanelParametrosAuxiliar3PedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar3PedidoPuntoVenta);
			this.jPanelParametrosAuxiliar4PedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar4PedidoPuntoVenta);
			//this.jPanelParametrosAuxiliar5PedidoPuntoVenta.setLayout(gridaBagParametrosAuxiliar2PedidoPuntoVenta);			
			
			
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jButtonRecargarInformacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoPuntoVenta.add(this.jComboBoxTiposPaginacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoPuntoVenta.add(this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar1PedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoPuntoVenta.add(this.jComboBoxTiposReportesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);																		
			
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PedidoPuntoVenta.add(this.jComboBoxTiposGraficosReportesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar4PedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jComboBoxTiposReportesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jCheckBoxGenerarReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar2PedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jLabelAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jButtonAbrirOrderByPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jComboBoxTiposSeleccionarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			
			
			/*
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jCheckBoxConGraficoReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoPuntoVenta.add(this.jCheckBoxSeleccionarTodosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);															
				
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoPuntoVenta.add(this.jCheckBoxSeleccionadosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);															
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoPuntoVenta.add(this.jCheckBoxConGraficoReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jPanelParametrosAuxiliar3PedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jComboBoxTiposRelacionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
				
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jComboBoxTiposAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
	
				
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoPuntoVenta.add(this.jTextFieldValorCampoGeneralPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedidoPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalPedidoPuntoVenta.setLayout(gridaBagLayoutCamposFintotalPedidoPuntoVenta);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoPuntoVenta = new GridBagLayout();

			this.jScrollPanelDatosPedidoPuntoVenta.setLayout(gridaBagLayoutDatosPedidoPuntoVenta);
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
			
			this.jScrollPanelDatosPedidoPuntoVenta.add(this.jTableDatosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoPuntoVenta.setViewportView(this.jTableDatosPedidoPuntoVenta);
		this.jTableDatosPedidoPuntoVenta.setFillsViewportHeight(true);
		this.jTableDatosPedidoPuntoVenta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesPedidoPuntoVenta.setLayout(gridaBagLayoutAccionesPedidoPuntoVenta);
		
		
		/*	
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
			
		this.jPanelAccionesPedidoPuntoVenta.add(this.jButtonNuevoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCajaPedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdCajaPedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCajaPedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCajaPedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCajaPedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCajaPedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdCajaPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdCajaPedidoPuntoVenta.add(jLabelid_cajaFK_IdCajaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdCajaPedidoPuntoVenta.add(jComboBoxid_cajaFK_IdCajaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdCajaPedidoPuntoVenta.add(jButtonFK_IdCajaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("1.-Por Caja ", jPanelFK_IdCajaPedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClientePedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdClientePedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdClientePedidoPuntoVenta.add(jLabelid_clienteFK_IdClientePedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdClientePedidoPuntoVenta.add(jComboBoxid_clienteFK_IdClientePedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);


		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdClientePedidoPuntoVenta.add(this.jButtonBuscarFK_IdClienteid_clientePedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdClientePedidoPuntoVenta.add(jButtonFK_IdClientePedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("2.-Por Cliente ", jPanelFK_IdClientePedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.add(jLabelid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.add(jComboBoxid_estado_pedido_punto_ventaFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta.add(jButtonFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("3.-Por Estado ", jPanelFK_IdEstadoPedidoPuntoVentaPedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdMesaPedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdMesaPedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMesaPedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMesaPedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMesaPedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMesaPedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdMesaPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdMesaPedidoPuntoVenta.add(jLabelid_mesaFK_IdMesaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdMesaPedidoPuntoVenta.add(jComboBoxid_mesaFK_IdMesaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdMesaPedidoPuntoVenta.add(jButtonFK_IdMesaPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("4.-Por Mesa ", jPanelFK_IdMesaPedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioPedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdTipoPrecioPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdTipoPrecioPedidoPuntoVenta.add(jLabelid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdTipoPrecioPedidoPuntoVenta.add(jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdTipoPrecioPedidoPuntoVenta.add(jButtonFK_IdTipoPrecioPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("5.-Por Tipo Precio ", jPanelFK_IdTipoPrecioPedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdVendedorPedidoPuntoVenta= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorPedidoPuntoVenta.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedidoPuntoVenta.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedidoPuntoVenta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorPedidoPuntoVenta.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorPedidoPuntoVenta.setLayout(gridaBagLayoutFK_IdVendedorPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		jPanelFK_IdVendedorPedidoPuntoVenta.add(jLabelid_vendedorFK_IdVendedorPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 0;
		gridBagConstraintsPedidoPuntoVenta.gridx = 1;
		jPanelFK_IdVendedorPedidoPuntoVenta.add(jComboBoxid_vendedorFK_IdVendedorPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoPuntoVenta.gridy = 1;
		gridBagConstraintsPedidoPuntoVenta.gridx =1;
		jPanelFK_IdVendedorPedidoPuntoVenta.add(jButtonFK_IdVendedorPedidoPuntoVenta, gridBagConstraintsPedidoPuntoVenta);

		jTabbedPaneBusquedasPedidoPuntoVenta.addTab("6.-Por Vendedor ", jPanelFK_IdVendedorPedidoPuntoVenta);
		jTabbedPaneBusquedasPedidoPuntoVenta.setMnemonicAt(5, KeyEvent.VK_6);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoPuntoVenta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoPuntoVenta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;		
		//this.gridBagConstraintsPedidoPuntoVenta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoPuntoVenta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoPuntoVenta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;		
			this.gridBagConstraintsPedidoPuntoVenta.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoPuntoVenta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);								
		
		
		/*
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		*/		
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoPuntoVenta.gridx =0;
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
				
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoPuntoVenta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoPuntoVenta = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoPuntoVenta.setLayout(gridaBagLayoutBusquedasParametrosPedidoPuntoVenta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
			
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoPuntoVenta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoPuntoVenta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoPuntoVenta.setName("jPanelReporteDinamicoPedidoPuntoVenta"); 
		
		this.jPanelReporteDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoPuntoVenta.setLayout(gridaBagLayoutReporteDinamicoPedidoPuntoVenta);
		
		
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoPuntoVenta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelColumnasSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoPuntoVenta = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoPuntoVenta=new JScrollPane(this.jListColumnasSelectReportePedidoPuntoVenta);
			
			this.jScrollColumnasSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jListColumnasSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jScrollColumnasSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoPuntoVenta = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoPuntoVenta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelRelacionesSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoPuntoVenta = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoPuntoVenta=new JScrollPane(this.jListRelacionesSelectReportePedidoPuntoVenta);
			
			this.jScrollRelacionesSelectReportePedidoPuntoVenta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoPuntoVenta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoPuntoVenta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jListRelacionesSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jScrollRelacionesSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoPuntoVenta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedidoPuntoVenta = new JLabelMe();

		this.jLabelConGraficoDinamicoPedidoPuntoVenta.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelConGraficoDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jCheckBoxConGraficoDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelColumnaCategoriaGraficoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedidoPuntoVenta.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelColumnaCategoriaValorPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jComboBoxColumnaCategoriaValorPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedidoPuntoVenta = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedidoPuntoVenta.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelColumnasValoresGraficoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedidoPuntoVenta = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedidoPuntoVenta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedidoPuntoVenta.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedidoPuntoVenta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoPuntoVenta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoPuntoVenta.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedidoPuntoVenta=new JScrollPane(this.jListColumnasValoresGraficoPedidoPuntoVenta);
			
			this.jScrollColumnasValoresGraficoPedidoPuntoVenta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoPuntoVenta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoPuntoVenta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jListColumnasSelectReportePedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jScrollColumnasValoresGraficoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelTiposGraficosReportesDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoPuntoVenta.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jComboBoxTiposGraficosReportesDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelGenerarExcelReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta.setToolTipText("Generar EXCEL"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jButtonGenerarExcelReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jComboBoxTiposReportesDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jLabelTiposArchivoReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoPuntoVenta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoPuntoVenta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoPuntoVenta.setToolTipText("Generar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jButtonGenerarReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoPuntoVenta.setToolTipText("Cancelar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoPuntoVenta.add(this.jButtonCerrarReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta= new JScrollPane(jPanelReporteDinamicoPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoPuntoVenta);
		this.jInternalFrameReporteDinamicoPedidoPuntoVenta.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoPuntoVenta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoPuntoVenta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoPuntoVenta.setName("jPanelImportacionPedidoPuntoVenta"); 
		
		this.jPanelImportacionPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoPuntoVenta.setLayout(gridaBagLayoutImportacionPedidoPuntoVenta);
		
		
		this.jInternalFrameImportacionPedidoPuntoVenta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoPuntoVenta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoPuntoVenta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoPuntoVenta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoPuntoVenta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoPuntoVenta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoPuntoVenta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoPuntoVenta.setResizable(true);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setClosable(true);
	    this.jInternalFrameImportacionPedidoPuntoVenta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoPuntoVenta = new JLabelMe();

		this.jLabelArchivoImportacionPedidoPuntoVenta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoPuntoVenta.add(this.jLabelArchivoImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoPuntoVenta = new JFileChooser();		
		this.jFileChooserImportacionPedidoPuntoVenta.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoPuntoVenta = new JButtonMe();
		this.jButtonAbrirImportacionPedidoPuntoVenta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoPuntoVenta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoPuntoVenta.setToolTipText("Generar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoPuntoVenta.add(this.jButtonAbrirImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoPuntoVenta = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoPuntoVenta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoPuntoVenta.add(this.jLabelPathArchivoImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoPuntoVenta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoPuntoVenta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoPuntoVenta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoPuntoVenta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoPuntoVenta.add(this.jTextFieldPathArchivoImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoPuntoVenta = new JButtonMe();
		this.jButtonGenerarImportacionPedidoPuntoVenta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoPuntoVenta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoPuntoVenta.setToolTipText("Generar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoPuntoVenta.add(this.jButtonGenerarImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoPuntoVenta = new JButtonMe();
		this.jButtonCerrarImportacionPedidoPuntoVenta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoPuntoVenta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoPuntoVenta.setToolTipText("Cancelar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoPuntoVenta.add(this.jButtonCerrarImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoPuntoVenta = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoPuntoVenta= new JScrollPane(jPanelImportacionPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsPedidoPuntoVenta.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoPuntoVenta);
		this.jInternalFrameImportacionPedidoPuntoVenta.getContentPane().add(this.jScrollPanelImportacionPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoPuntoVenta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoPuntoVenta = new JButtonMe();
			this.jButtonAbrirOrderByPedidoPuntoVenta.setText("Orden");
			this.jButtonAbrirOrderByPedidoPuntoVenta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoPuntoVenta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoPuntoVenta";
			inputMap = this.jButtonAbrirOrderByPedidoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoPuntoVenta"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoPuntoVenta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoPuntoVenta.setName("jPanelOrderByPedidoPuntoVenta"); 
			
			this.jPanelOrderByPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoPuntoVenta.setLayout(gridaBagLayoutOrderByPedidoPuntoVenta);
			
			
			this.jTableDatosPedidoPuntoVentaOrderBy = new JTableMe();        
			this.jTableDatosPedidoPuntoVentaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoPuntoVentaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoPuntoVentaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoPuntoVentaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoPuntoVentaOrderBy.setViewportView(this.jTableDatosPedidoPuntoVentaOrderBy);
			this.jTableDatosPedidoPuntoVentaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoPuntoVentaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoPuntoVenta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoPuntoVenta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoPuntoVenta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoPuntoVenta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoPuntoVenta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoPuntoVenta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoPuntoVenta.setTitle("Orden");
			this.jInternalFrameOrderByPedidoPuntoVenta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoPuntoVenta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoPuntoVenta.setResizable(true);
			this.jInternalFrameOrderByPedidoPuntoVenta.setClosable(true);
			this.jInternalFrameOrderByPedidoPuntoVenta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Punto Ventas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoPuntoVenta.ipady =150;
				
			this.jPanelOrderByPedidoPuntoVenta.add(jScrollPanelDatosPedidoPuntoVentaOrderBy, this.gridBagConstraintsPedidoPuntoVenta);//this.jTableDatosPedidoPuntoVentaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoPuntoVenta = new JButtonMe();
			this.jButtonCerrarOrderByPedidoPuntoVenta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoPuntoVenta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoPuntoVenta.setToolTipText("Cancelar"+" "+PedidoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoPuntoVenta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoPuntoVenta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoPuntoVenta.add(this.jButtonCerrarOrderByPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoPuntoVenta = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoPuntoVenta= new JScrollPane(jPanelOrderByPedidoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsPedidoPuntoVenta.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoPuntoVenta.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoPuntoVenta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoPuntoVenta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoPuntoVenta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoPuntoVenta);
			
			this.jInternalFrameOrderByPedidoPuntoVenta.getContentPane().add(this.jScrollPanelOrderByPedidoPuntoVenta, this.gridBagConstraintsPedidoPuntoVenta);			
		
		} else {
			this.jButtonAbrirOrderByPedidoPuntoVenta = new JButtonMe();
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
		int iWidthTableCalculado=0;//4530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidopuntoventaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidoPuntoVenta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoPuntoVenta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoPuntoVenta.getRowHeight();//PedidoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.isSelected()) {
					iHeightTable=PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoPuntoVenta.isSelected()) {
					iHeightTable=PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoPuntoVentaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoPuntoVenta!=null && this.jInternalFrameOrderByPedidoPuntoVenta.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoPuntoVenta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoPuntoVenta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoPuntoVenta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoPuntoVenta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoPuntoVenta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoPuntoVenta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoPuntoVenta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoPuntoVenta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidopuntoventaLogic.getPedidoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidopuntoventas.size();
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
	public static List<PedidoPuntoVenta> TraerPedidoPuntoVentaBeans(List<PedidoPuntoVenta> pedidopuntoventas,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoPuntoVenta pedidopuntoventa:pedidopuntoventas) {
					
				if(!(PedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidopuntoventa.setsDetalleGeneralEntityReporte(PedidoPuntoVentaConstantesFunciones.getPedidoPuntoVentaDescripcion(pedidopuntoventa));
										
						
					
					

					if(pedidopuntoventa.getDetallePedidoPuntoVentas()!=null && Funciones.existeClass(classes,DetallePedidoPuntoVenta.class)) {
						try{pedidopuntoventa.setdetallepedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoPuntoVentaJInternalFrame.TraerDetallePedidoPuntoVentaBeans(pedidopuntoventa.getDetallePedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedidopuntoventa.setsDetalleGeneralEntityReporte(pedidopuntoventa.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidopuntoventabeans.add(pedidopuntoventabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidopuntoventas;
    }
	//PARA REPORTES FIN
}
