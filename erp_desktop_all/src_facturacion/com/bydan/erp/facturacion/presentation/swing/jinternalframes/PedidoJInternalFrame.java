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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.facturacion.util.PedidoConstantesFunciones;

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
public class PedidoJInternalFrame extends PedidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedido;
	
	protected JMenuBar jmenuBarPedido;
	
	protected JMenu jmenuPedido;
	protected JMenu jmenuDatosPedido;
	protected JMenu jmenuArchivoPedido;
	protected JMenu jmenuAccionesPedido;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedido;	
	protected GridBagConstraints gridBagConstraintsPedido;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoDetalleFormJInternalFrame jInternalFrameDetalleFormPedido;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedido;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedido;	
	
	
	
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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";
	
	public PedidoSessionBean pedidoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ZonaSessionBean zonaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Pedido> pedidos;		
	public List<Pedido> pedidosEliminados;	
	public List<Pedido> pedidosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedido;		
	protected JButton jButtonAbrirOrderByPedido;
	
	
	//protected JPanel jPanelOrderByPedido;
	//public JScrollPane jScrollPanelOrderByPedido;	
	//protected JButton jButtonCerrarOrderByPedido;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoLogic pedidoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedido;
	public JScrollPane jScrollPanelDatosEdicionPedido;
	public JScrollPane jScrollPanelDatosGeneralPedido;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedido;
	//public JScrollPane jScrollPanelImportacionPedido;
	
	
	
	protected JPanel jPanelAccionesPedido;
	
    protected JPanel jPanelPaginacionPedido;
    protected JPanel jPanelParametrosReportesPedido;
	protected JPanel jPanelParametrosReportesAccionesPedido;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalPedido;
	protected Integer iXPanelCamposFintotalPedido=0;
	protected Integer iYPanelCamposFintotalPedido=0;

	protected JPanel jPanelCamposIniciogeneralPedido;
	protected Integer iXPanelCamposIniciogeneralPedido=0;
	protected Integer iYPanelCamposIniciogeneralPedido=0;

	protected JPanel jPanelCamposInicioresumenPedido;
	protected Integer iXPanelCamposInicioresumenPedido=0;
	protected Integer iYPanelCamposInicioresumenPedido=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Pedido;
	protected JPanel jPanelParametrosAuxiliar2Pedido;
	protected JPanel jPanelParametrosAuxiliar3Pedido;
	protected JPanel jPanelParametrosAuxiliar4Pedido;
	//protected JPanel jPanelParametrosAuxiliar5Pedido;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedido;
	//protected JPanel jPanelImportacionPedido;
	
	
	public JTable jTableDatosPedido;
	
	
	
	//public JTable jTableDatosPedidoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedido;
	protected JButton jButtonDuplicarPedido;
	protected JButton jButtonCopiarPedido;
	protected JButton jButtonVerFormPedido;
	protected JButton jButtonNuevoRelacionesPedido;
	protected JButton jButtonModificarPedido;
	
    protected JButton jButtonGuardarCambiosTablaPedido;
	protected JButton jButtonCerrarPedido;
	
	
	protected JButton jButtonRecargarInformacionPedido;
	protected JButton jButtonProcesarInformacionPedido;
	
	
	protected JButton jButtonAnterioresPedido;
	protected JButton jButtonSiguientesPedido;
	protected JButton jButtonNuevoGuardarCambiosPedido;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedido;
	//protected JButton jButtonCerrarReporteDinamicoPedido;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedido;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedido;
	//protected JButton jButtonGenerarImportacionPedido;
	//protected JButton jButtonCerrarImportacionPedido;
	//protected JFileChooser jFileChooserImportacionPedido;
	//protected File fileImportacionPedido;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedido;
	protected JButton jButtonDuplicarToolBarPedido;
	protected JButton jButtonNuevoRelacionesToolBarPedido;
	
	
	public JButton jButtonGuardarCambiosToolBarPedido;
	protected JButton jButtonCopiarToolBarPedido;
	protected JButton jButtonVerFormToolBarPedido;
	public JButton jButtonGuardarCambiosTablaToolBarPedido;
	protected JButton jButtonMostrarOcultarTablaToolBarPedido;
	protected JButton jButtonCerrarToolBarPedido;
	
	protected JButton jButtonRecargarInformacionToolBarPedido;
	protected JButton jButtonProcesarInformacionToolBarPedido;
	protected JButton jButtonAnterioresToolBarPedido;
	protected JButton jButtonSiguientesToolBarPedido;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedido;
	protected JButton jButtonAbrirOrderByToolBarPedido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedido;
	protected JMenuItem jMenuItemDuplicarPedido;
	protected JMenuItem jMenuItemNuevoRelacionesPedido;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedido;
	protected JMenuItem jMenuItemCopiarPedido;
	protected JMenuItem jMenuItemVerFormPedido;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedido;
	protected JMenuItem jMenuItemCerrarPedido;
	protected JMenuItem jMenuItemDetalleCerrarPedido;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedido;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedido;
	
	protected JMenuItem jMenuItemRecargarInformacionPedido;
	protected JMenuItem jMenuItemProcesarInformacionPedido;
	protected JMenuItem jMenuItemAnterioresPedido;
	protected JMenuItem jMenuItemSiguientesPedido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedido;
	protected JMenuItem jMenuItemAbrirOrderByPedido;
	protected JMenuItem jMenuItemMostrarOcultarPedido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedido;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedido;
	protected JCheckBox jCheckBoxSeleccionadosPedido;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedido;
	protected JCheckBox jCheckBoxConGraficoReportePedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedido;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedido;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedido;
	protected JTextField jTextFieldValorCampoGeneralPedido;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedido;
	//public JList<Reporte> jListColumnasSelectReportePedido;
	//public JScrollPane jScrollColumnasSelectReportePedido;
	
	//public JLabel jLabelRelacionesSelectReportePedido;
	//public JList<Reporte> jListRelacionesSelectReportePedido;
	//public JScrollPane jScrollRelacionesSelectReportePedido;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedido;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedido;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedido;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedido;
	
		
	//public JLabel jLabelArchivoImportacionPedido;	
	//public JLabel jLabelPathArchivoImportacionPedido;
	//protected JTextField jTextFieldPathArchivoImportacionPedido;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedido;
	
	//public JLabel jLabelColumnaCategoriaValorPedido;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedido;
	
	//public JLabel jLabelColumnasValoresGraficoPedido;
	//public JList<Reporte> jListColumnasValoresGraficoPedido;
	//public JScrollPane jScrollColumnasValoresGraficoPedido;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedido;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedido;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedido;
	public JPanel jPanelFK_IdCentroCostoPedido;
	public JButton jButtonFK_IdCentroCostoPedido;
	public JPanel jPanelFK_IdClientePedido;
	public JButton jButtonFK_IdClientePedido;
	public JPanel jPanelFK_IdConsultorPedido;
	public JButton jButtonFK_IdConsultorPedido;
	public JPanel jPanelFK_IdEmpleadoPedido;
	public JButton jButtonFK_IdEmpleadoPedido;
	public JPanel jPanelFK_IdEstadoPedidoPedido;
	public JButton jButtonFK_IdEstadoPedidoPedido;
	public JPanel jPanelFK_IdFormatoPedido;
	public JButton jButtonFK_IdFormatoPedido;
	public JPanel jPanelFK_IdResponsablePedido;
	public JButton jButtonFK_IdResponsablePedido;
	public JPanel jPanelFK_IdRutaTransportePedido;
	public JButton jButtonFK_IdRutaTransportePedido;
	public JPanel jPanelFK_IdSubClientePedido;
	public JButton jButtonFK_IdSubClientePedido;
	public JPanel jPanelFK_IdTipoCambioPedido;
	public JButton jButtonFK_IdTipoCambioPedido;
	public JPanel jPanelFK_IdTipoLlamadaPedido;
	public JButton jButtonFK_IdTipoLlamadaPedido;
	public JPanel jPanelFK_IdTipoPrecioPedido;
	public JButton jButtonFK_IdTipoPrecioPedido;
	public JPanel jPanelFK_IdTransportePedido;
	public JButton jButtonFK_IdTransportePedido;
	public JPanel jPanelFK_IdTransportistaPedido;
	public JButton jButtonFK_IdTransportistaPedido;
	public JPanel jPanelFK_IdVendedorPedido;
	public JButton jButtonFK_IdVendedorPedido;
	public JPanel jPanelFK_IdZonaPedido;
	public JButton jButtonFK_IdZonaPedido;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoPedido;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoPedido;
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedido= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoPedido;
	
	public JPanel jPanelid_clienteFK_IdClientePedido;
	public JLabel jLabelid_clienteFK_IdClientePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedido;
	public JButton jButtonid_clienteFK_IdClientePedido= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedido;
	
	public JPanel jPanelid_consultorFK_IdConsultorPedido;
	public JLabel jLabelid_consultorFK_IdConsultorPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorFK_IdConsultorPedido;
	public JButton jButtonid_consultorFK_IdConsultorPedido= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorPedidoUpdate= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPedido;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPedido;
	public JButton jButtonid_empleadoFK_IdEmpleadoPedido= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPedido;
	
	public JPanel jPanelid_estado_pedidoFK_IdEstadoPedidoPedido;
	public JLabel jLabelid_estado_pedidoFK_IdEstadoPedidoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido;
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoPedido= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoPedido;
	public JLabel jLabelid_formatoFK_IdFormatoPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoPedido;
	public JButton jButtonid_formatoFK_IdFormatoPedido= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_responsableFK_IdResponsablePedido;
	public JLabel jLabelid_responsableFK_IdResponsablePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFK_IdResponsablePedido;
	public JButton jButtonid_responsableFK_IdResponsablePedido= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsablePedidoUpdate= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsablePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_ruta_transporteFK_IdRutaTransportePedido;
	public JLabel jLabelid_ruta_transporteFK_IdRutaTransportePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transporteFK_IdRutaTransportePedido;
	public JButton jButtonid_ruta_transporteFK_IdRutaTransportePedido= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransportePedidoUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transporteFK_IdRutaTransportePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClientePedido;
	public JLabel jLabelid_sub_clienteFK_IdSubClientePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClientePedido;
	public JButton jButtonid_sub_clienteFK_IdSubClientePedido= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClientePedidoUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClientePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioPedido;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioPedido;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedido= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedidoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido;
	
	public JPanel jPanelid_tipo_llamadaFK_IdTipoLlamadaPedido;
	public JLabel jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido;
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaPedido= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFK_IdTipoLlamadaPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioPedido;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioPedido;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedido= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransportePedido;
	public JLabel jLabelid_transporteFK_IdTransportePedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransportePedido;
	public JButton jButtonid_transporteFK_IdTransportePedido= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePedidoUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaPedido;
	public JLabel jLabelid_transportistaFK_IdTransportistaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaPedido;
	public JButton jButtonid_transportistaFK_IdTransportistaPedido= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaPedidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorPedido;
	public JLabel jLabelid_vendedorFK_IdVendedorPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorPedido;
	public JButton jButtonid_vendedorFK_IdVendedorPedido= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorPedido;
	
	public JPanel jPanelid_zonaFK_IdZonaPedido;
	public JLabel jLabelid_zonaFK_IdZonaPedido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaPedido;
	public JButton jButtonid_zonaFK_IdZonaPedido= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPedidoUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaPedidoBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=803;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PedidoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedido)	{
		this.jButtonRecargarInformacionPedido = jButtonRecargarInformacionPedido;
	}
	
	public JButton getjButtonProcesarInformacionPedido() {
		return this.jButtonProcesarInformacionPedido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedido)	{
		this.jButtonProcesarInformacionPedido = jButtonProcesarInformacionPedido;
	}
	
	
	public JButton getjButtonRecargarInformacionPedido() {
		return this.jButtonRecargarInformacionPedido;
	}
	
	
	public List<Pedido> getpedidos() {
		return this.pedidos;
	}

	public void setpedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public List<Pedido> getpedidosAux() {
		return this.pedidosAux;
	}

	public void setpedidosAux(List<Pedido> pedidosAux) {
		this.pedidosAux = pedidosAux;
	}
	
	public List<Pedido> getpedidosEliminados() {
		return this.pedidosEliminados;
	}

	public void setPedidosEliminados(List<Pedido> pedidosEliminados) {
		this.pedidosEliminados = pedidosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedido() {
		return jComboBoxTiposSeleccionarPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedido(
			JComboBox jComboBoxTiposSeleccionarPedido) {
		this.jComboBoxTiposSeleccionarPedido = jComboBoxTiposSeleccionarPedido;
	}
	
	public void setBorderResaltarTiposSeleccionarPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedido .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedido() {
		return jTextFieldValorCampoGeneralPedido;
	}

	public void setjTextFieldValorCampoGeneralPedido(
			JTextField jTextFieldValorCampoGeneralPedido) {
		this.jTextFieldValorCampoGeneralPedido = jTextFieldValorCampoGeneralPedido;
	}

	public void setBorderResaltarValorCampoGeneralPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedido .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedido() {
		return this.jCheckBoxSeleccionarTodosPedido;
	}

	public void setjCheckBoxSeleccionarTodosPedido(
			JCheckBox jCheckBoxSeleccionarTodosPedido) {
		this.jCheckBoxSeleccionarTodosPedido = jCheckBoxSeleccionarTodosPedido;
	}

	public void setBorderResaltarSeleccionarTodosPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedido .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedido() {
		return this.jCheckBoxSeleccionadosPedido;
	}

	public void setjCheckBoxSeleccionadosPedido(
			JCheckBox jCheckBoxSeleccionadosPedido) {
		this.jCheckBoxSeleccionadosPedido = jCheckBoxSeleccionadosPedido;
	}
	
	public void setBorderResaltarSeleccionadosPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedido .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedido() {
		return this.jComboBoxTiposArchivosReportesPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedido(
			JComboBox jComboBoxTiposArchivosReportesPedido) {
		this.jComboBoxTiposArchivosReportesPedido = jComboBoxTiposArchivosReportesPedido;
	}

	public void setBorderResaltarTiposArchivosReportesPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedido() {
		return this.jComboBoxTiposReportesPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedido(
			JComboBox jComboBoxTiposReportesPedido) {
		this.jComboBoxTiposReportesPedido = jComboBoxTiposReportesPedido;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedido() {
	//	return jComboBoxTiposReportesDinamicoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedido(
	//		JComboBox jComboBoxTiposReportesDinamicoPedido) {
	//	this.jComboBoxTiposReportesDinamicoPedido = jComboBoxTiposReportesDinamicoPedido;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedido() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedido;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedido(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedido) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedido = jComboBoxTiposArchivosReportesDinamicoPedido;
	//}
	
	public void setBorderResaltarTiposReportesPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedido() {
		return this.jComboBoxTiposGraficosReportesPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedido(
			JComboBox jComboBoxTiposGraficosReportesPedido) {
		this.jComboBoxTiposGraficosReportesPedido = jComboBoxTiposGraficosReportesPedido;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedido() {
		return this.jComboBoxTiposPaginacionPedido;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedido(
			JComboBox jComboBoxTiposPaginacionPedido) {
		this.jComboBoxTiposPaginacionPedido = jComboBoxTiposPaginacionPedido;
	}
	
	public void setBorderResaltarTiposPaginacionPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedido .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedido() {
		return this.jComboBoxTiposRelacionesPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedido() {
		return this.jComboBoxTiposAccionesPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedido(
			JComboBox jComboBoxTiposRelacionesPedido) {
		this.jComboBoxTiposRelacionesPedido = jComboBoxTiposRelacionesPedido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedido(
			JComboBox jComboBoxTiposAccionesPedido) {
		this.jComboBoxTiposAccionesPedido = jComboBoxTiposAccionesPedido;
	}
	
	public void setBorderResaltarTiposRelacionesPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedido .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedido() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedido.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedido .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedido() {
	//	return jCheckBoxConGraficoDinamicoPedido;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedido(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedido) {
	//	this.jCheckBoxConGraficoDinamicoPedido = jCheckBoxConGraficoDinamicoPedido;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedido() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedido.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedido .setBorder(borderResaltar);		
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
		this.pedidoSessionBean=new PedidoSessionBean();
		
		this.pedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido MANTENIMIENTO"));
		
		
		if(iWidth > 5050) {
			iWidth=5050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Pedido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedido= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedido,this.jTtoolBarPedido,
							"nuevo","nuevo","Nuevo"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedido,this.jTtoolBarPedido,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedido,this.jTtoolBarPedido,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedido,this.jTtoolBarPedido,
							"duplicar","duplicar","Duplicar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedido,this.jTtoolBarPedido,
							"copiar","copiar","Copiar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedido,this.jTtoolBarPedido,
							"ver_form","ver_form","Ver"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedido,this.jTtoolBarPedido,
							"recargar","recargar","Recargar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedido,this.jTtoolBarPedido,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedido,this.jTtoolBarPedido,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedido,this.jTtoolBarPedido,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedido,this.jTtoolBarPedido,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedido,this.jTtoolBarPedido,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedido,this.jTtoolBarPedido,
							"cerrar","cerrar","Salir"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedido=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedido;
			
				this.jButtonProcesarInformacionToolBarPedido=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedido;
				
		//protected JButton jButtonModificarToolBarPedido;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedido=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedido=new JMenuMe("General");
		this.jmenuArchivoPedido=new JMenuMe("Archivo");
		this.jmenuAccionesPedido=new JMenuMe("Acciones");
		this.jmenuDatosPedido=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedido= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedido.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedido,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedido= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedido.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedido,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedido= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedido.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedido,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedido= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedido.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedido,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedido= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedido.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedido,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedido= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedido.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedido,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedido= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedido.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedido,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedido= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedido.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedido,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedido= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedido.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedido,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedido= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedido.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedido,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedido= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedido.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedido,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedido.add(this.jMenuItemCerrarPedido);
			
			this.jmenuAccionesPedido.add(this.jMenuItemNuevoPedido);
			this.jmenuAccionesPedido.add(this.jMenuItemNuevoGuardarCambiosPedido);
			this.jmenuAccionesPedido.add(this.jMenuItemNuevoRelacionesPedido);
			this.jmenuAccionesPedido.add(this.jMenuItemGuardarCambiosTablaPedido);		
			this.jmenuAccionesPedido.add(this.jMenuItemDuplicarPedido);		
			this.jmenuAccionesPedido.add(this.jMenuItemCopiarPedido);		
			this.jmenuAccionesPedido.add(this.jMenuItemVerFormPedido);		
			
			this.jmenuDatosPedido.add(this.jMenuItemRecargarInformacionPedido);				
			this.jmenuDatosPedido.add(this.jMenuItemAnterioresPedido);				
			this.jmenuDatosPedido.add(this.jMenuItemSiguientesPedido);				
			this.jmenuDatosPedido.add(this.jMenuItemAbrirOrderByPedido);				
			this.jmenuDatosPedido.add(this.jMenuItemMostrarOcultarPedido);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedido.add(this.jMenuItemGuardarCambiosPedido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedido.add(this.jmenuArchivoPedido);		
			this.jmenuBarPedido.add(this.jmenuAccionesPedido);		
			this.jmenuBarPedido.add(this.jmenuDatosPedido);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedido);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedido() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoPedido.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoPedido= new JButtonMe();
		this.jButtonFK_IdCentroCostoPedido.setText("Buscar");
		this.jButtonFK_IdCentroCostoPedido.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoPedido,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoPedido = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoPedido.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoPedido.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoPedido= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido.setFocusable(false);

		this.jPanelFK_IdClientePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedido.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedido= new JButtonMe();
		this.jButtonFK_IdClientePedido.setText("Buscar");
		this.jButtonFK_IdClientePedido.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedido,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedido = new JLabelMe();
		jLabelid_clienteFK_IdClientePedido.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedido.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedido= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedido= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedido.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedido.setFocusable(false);

		this.jPanelFK_IdConsultorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsultorPedido.setToolTipText("Buscar Por Consultor ");
		this.jButtonFK_IdConsultorPedido= new JButtonMe();
		this.jButtonFK_IdConsultorPedido.setText("Buscar");
		this.jButtonFK_IdConsultorPedido.setToolTipText("Buscar Por Consultor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsultorPedido,"buscar_button","Buscar Por Consultor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsultorPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consultorFK_IdConsultorPedido = new JLabelMe();
		jLabelid_consultorFK_IdConsultorPedido.setText("Consultor :");
		jLabelid_consultorFK_IdConsultorPedido.setToolTipText("Consultor");
		jLabelid_consultorFK_IdConsultorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consultorFK_IdConsultorPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consultorFK_IdConsultorPedido= new JComboBoxMe();
		jComboBoxid_consultorFK_IdConsultorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorFK_IdConsultorPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPedido.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPedido= new JButtonMe();
		this.jButtonFK_IdEmpleadoPedido.setText("Buscar");
		this.jButtonFK_IdEmpleadoPedido.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPedido,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPedido = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPedido.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPedido.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPedido= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoPedido.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoPedidoPedido= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoPedido.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoPedido.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoPedido,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido = new JLabelMe();
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido.setText("Estado :");
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido.setToolTipText("Estado");
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoFK_IdEstadoPedidoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido= new JComboBoxMe();
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedido.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoPedido= new JButtonMe();
		this.jButtonFK_IdFormatoPedido.setText("Buscar");
		this.jButtonFK_IdFormatoPedido.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedido,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoPedido = new JLabelMe();
		jLabelid_formatoFK_IdFormatoPedido.setText("Formato :");
		jLabelid_formatoFK_IdFormatoPedido.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoPedido= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdResponsablePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsablePedido.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsablePedido= new JButtonMe();
		this.jButtonFK_IdResponsablePedido.setText("Buscar");
		this.jButtonFK_IdResponsablePedido.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsablePedido,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsablePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsableFK_IdResponsablePedido = new JLabelMe();
		jLabelid_responsableFK_IdResponsablePedido.setText("Responsable :");
		jLabelid_responsableFK_IdResponsablePedido.setToolTipText("Responsable");
		jLabelid_responsableFK_IdResponsablePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsablePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsablePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFK_IdResponsablePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsableFK_IdResponsablePedido= new JComboBoxMe();
		jComboBoxid_responsableFK_IdResponsablePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsablePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsablePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFK_IdResponsablePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdRutaTransportePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdRutaTransportePedido.setToolTipText("Buscar Por Ruta ");
		this.jButtonFK_IdRutaTransportePedido= new JButtonMe();
		this.jButtonFK_IdRutaTransportePedido.setText("Buscar");
		this.jButtonFK_IdRutaTransportePedido.setToolTipText("Buscar Por Ruta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdRutaTransportePedido,"buscar_button","Buscar Por Ruta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdRutaTransportePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_ruta_transporteFK_IdRutaTransportePedido = new JLabelMe();
		jLabelid_ruta_transporteFK_IdRutaTransportePedido.setText("Ruta :");
		jLabelid_ruta_transporteFK_IdRutaTransportePedido.setToolTipText("Ruta");
		jLabelid_ruta_transporteFK_IdRutaTransportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ruta_transporteFK_IdRutaTransportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_ruta_transporteFK_IdRutaTransportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transporteFK_IdRutaTransportePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_ruta_transporteFK_IdRutaTransportePedido= new JComboBoxMe();
		jComboBoxid_ruta_transporteFK_IdRutaTransportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteFK_IdRutaTransportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transporteFK_IdRutaTransportePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClientePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClientePedido.setToolTipText("Buscar Por Contacto ");
		this.jButtonFK_IdSubClientePedido= new JButtonMe();
		this.jButtonFK_IdSubClientePedido.setText("Buscar");
		this.jButtonFK_IdSubClientePedido.setToolTipText("Buscar Por Contacto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClientePedido,"buscar_button","Buscar Por Contacto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClientePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClientePedido = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClientePedido.setText("Contacto :");
		jLabelid_sub_clienteFK_IdSubClientePedido.setToolTipText("Contacto");
		jLabelid_sub_clienteFK_IdSubClientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClientePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClientePedido= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClientePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClientePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClientePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClientePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioPedido.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioPedido= new JButtonMe();
		this.jButtonFK_IdTipoCambioPedido.setText("Buscar");
		this.jButtonFK_IdTipoCambioPedido.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioPedido,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioPedido = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioPedido.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioPedido.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioPedido= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido.setFocusable(false);

		this.jPanelFK_IdTipoLlamadaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoLlamadaPedido.setToolTipText("Buscar Por Llamada ");
		this.jButtonFK_IdTipoLlamadaPedido= new JButtonMe();
		this.jButtonFK_IdTipoLlamadaPedido.setText("Buscar");
		this.jButtonFK_IdTipoLlamadaPedido.setToolTipText("Buscar Por Llamada ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoLlamadaPedido,"buscar_button","Buscar Por Llamada ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoLlamadaPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido = new JLabelMe();
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido.setText("Llamada :");
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido.setToolTipText("Llamada");
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido= new JComboBoxMe();
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPrecioPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioPedido.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioPedido= new JButtonMe();
		this.jButtonFK_IdTipoPrecioPedido.setText("Buscar");
		this.jButtonFK_IdTipoPrecioPedido.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioPedido,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioPedido = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioPedido.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioPedido.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioPedido= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportePedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportePedido.setToolTipText("Buscar Por Forma Envio ");
		this.jButtonFK_IdTransportePedido= new JButtonMe();
		this.jButtonFK_IdTransportePedido.setText("Buscar");
		this.jButtonFK_IdTransportePedido.setToolTipText("Buscar Por Forma Envio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportePedido,"buscar_button","Buscar Por Forma Envio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportePedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransportePedido = new JLabelMe();
		jLabelid_transporteFK_IdTransportePedido.setText("Forma Envio :");
		jLabelid_transporteFK_IdTransportePedido.setToolTipText("Forma Envio");
		jLabelid_transporteFK_IdTransportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransportePedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransportePedido= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransportePedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaPedido.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaPedido= new JButtonMe();
		this.jButtonFK_IdTransportistaPedido.setText("Buscar");
		this.jButtonFK_IdTransportistaPedido.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaPedido,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaPedido = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaPedido.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaPedido.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaPedido= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorPedido.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorPedido= new JButtonMe();
		this.jButtonFK_IdVendedorPedido.setText("Buscar");
		this.jButtonFK_IdVendedorPedido.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorPedido,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorPedido = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorPedido.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorPedido.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorPedido= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorPedido,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorPedido= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorPedido.setFocusable(false);

		this.jPanelFK_IdZonaPedido=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaPedido.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaPedido= new JButtonMe();
		this.jButtonFK_IdZonaPedido.setText("Buscar");
		this.jButtonFK_IdZonaPedido.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaPedido,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaPedido = new JLabelMe();
		jLabelid_zonaFK_IdZonaPedido.setText("Zona :");
		jLabelid_zonaFK_IdZonaPedido.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaPedido,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaPedido= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaPedido,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPedido=new JTabbedPane();


		this.jTabbedPaneBusquedasPedido.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedido.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedido.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedido,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedido = new PedidoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido DATOS");
			this.jInternalFrameDetalleFormPedido = new PedidoDetalleFormJInternalFrame(jDesktopPane,this.pedidoSessionBean.getConGuardarRelaciones(),this.pedidoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedido = null;//new PedidoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedido= new GridBagLayout();
		
		
		this.jTableDatosPedido = new JTableMe();      
		
		String sToolTipPedido="";
		sToolTipPedido=PedidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedido+="(Facturacion.Pedido)";
		}
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedido+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedido.setToolTipText(sToolTipPedido);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedido);
		this.jTableDatosPedido.setAutoCreateRowSorter(true);
		this.jTableDatosPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedido.setRowSelectionAllowed(true);
		this.jTableDatosPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedido,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedido = new JButtonMe();
		this.jButtonDuplicarPedido = new JButtonMe();
		this.jButtonCopiarPedido = new JButtonMe();
		this.jButtonVerFormPedido = new JButtonMe();
		this.jButtonNuevoRelacionesPedido = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedido = new JButtonMe();
		this.jButtonCerrarPedido = new JButtonMe();
		
		this.jScrollPanelDatosPedido = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedido = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioresumenPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Pedido";
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos" + this.sPath));
		} else {
			this.jScrollPanelDatosPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedido.setToolTipText("Acciones");
        this.jPanelAccionesPedido.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedido, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedido.setName("jPanelCamposFintotalPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralPedido.setName("jPanelCamposFingeneralPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralPedido, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposInicioresumenPedido.setName("jPanelCamposFinresumenPedido");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioresumenPedido, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoPedido=new ReporteDinamicoJInternalFrame(PedidoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedido();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedido=new ImportacionJInternalFrame(PedidoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedido();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedido = new JButtonMe();
		
		this.jButtonAbrirOrderByPedido.setText("Orden");
		this.jButtonAbrirOrderByPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedido,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedido,false,this);
			
			//this.cargarOrderByPedido(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedido,true,this);
			
			//this.cargarOrderByPedido(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedido.setMinimumSize(new Dimension(400,50));//5030
		this.jTableDatosPedido.setMaximumSize(new Dimension(400,50));//5030
		this.jTableDatosPedido.setPreferredSize(new Dimension(400,50));//5030
		
		this.jScrollPanelDatosPedido.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedido.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedido.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedido.setText("Nuevo");
		this.jButtonDuplicarPedido.setText("Duplicar");
		this.jButtonCopiarPedido.setText("Copiar");
		this.jButtonVerFormPedido.setText("Ver");
		this.jButtonNuevoRelacionesPedido.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedido.setText("Guardar");
		this.jButtonCerrarPedido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedido,"nuevo_button","Nuevo",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedido,"duplicar_button","Duplicar",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedido,"copiar_button","Copiar",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedido,"ver_form","Ver",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedido,"nuevorelaciones_button","Nuevo Rel",this.pedidoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedido,"guardarcambiostabla_button","Guardar",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedido,"cerrar_button","Salir",this.pedidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedido.setToolTipText("Nuevo"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedido.setToolTipText("Duplicar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedido.setToolTipText("Copiar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedido.setToolTipText("Ver"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedido.setToolTipText("Nuevo Rel"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedido.setToolTipText("Guardar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedido.setToolTipText("Salir"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedido";
		inputMap = this.jButtonNuevoPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedido"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedido";
		inputMap = this.jButtonDuplicarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedido"));
		
		//COPIAR
		sMapKey = "CopiarPedido";
		inputMap = this.jButtonCopiarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedido"));
		
		//VEr FORM
		sMapKey = "VerFormPedido";
		inputMap = this.jButtonVerFormPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedido"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedido";
		inputMap = this.jButtonNuevoRelacionesPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedido"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedido";
		inputMap = this.jButtonModificarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedido"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedido";
		inputMap = this.jButtonCerrarPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedido";
		inputMap = this.jButtonGuardarCambiosTablaPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedido"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Pedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Pedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Pedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Pedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Pedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedido.setName("jPanelParametrosReportesPedido"); 
		
		this.jPanelParametrosReportesAccionesPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedido.setName("jPanelParametrosReportesAccionesPedido"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedido, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedido, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedido = new JButtonMe();
		this.jButtonRecargarInformacionPedido.setText("Recargar");
		this.jButtonRecargarInformacionPedido.setToolTipText("Recargar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedido,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedido = new JButtonMe();
		this.jButtonProcesarInformacionPedido.setText("Procesar");
		this.jButtonProcesarInformacionPedido.setToolTipText("Procesar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedido.setVisible(false);
			
		this.jButtonProcesarInformacionPedido.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedido.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedido.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedido.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedido.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedido.setText("TIPO");       
		this.jComboBoxTiposReportesPedido.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedido = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedido.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedido = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedido.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedido.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedido = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedido.setText("Accion");
		this.jComboBoxTiposRelacionesPedido.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedido.setText("Accion");
		this.jComboBoxTiposAccionesPedido.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedido = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedido.setText("Accion");
		this.jComboBoxTiposSeleccionarPedido.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedido=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedido.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedido.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedido.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedido = new JLabelMe();
		
		this.jLabelAccionesPedido.setText("Acciones");		
		this.jLabelAccionesPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedido = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedido.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedido.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedido = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedido.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedido.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedido = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedido.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedido.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedido.setText("Graf.");
		this.jCheckBoxConGraficoReportePedido.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedido = new JButtonMe();
		//this.jButtonAnterioresPedido.setText("<<");
        this.jButtonAnterioresPedido.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedido,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedido = new JButtonMe();
		//this.jButtonSiguientesPedido.setText(">>");
        this.jButtonSiguientesPedido.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedido,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedido = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedido.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedido.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedido,"nuevoguardarcambios_button","Nue",this.pedidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedido";
		inputMap = this.jButtonNuevoGuardarCambiosPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedido"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedido";
		inputMap = this.jButtonRecargarInformacionPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedido"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedido";
		inputMap = this.jButtonSiguientesPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedido"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedido";
		inputMap = this.jButtonAnterioresPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedido"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedido();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedido.setMinimumSize(new Dimension(this.getWidth(),PedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedido.setMaximumSize(new Dimension(this.getWidth(),PedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedido.setPreferredSize(new Dimension(this.getWidth(),PedidoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedido = new GridBagLayout();

			this.jPanelPaginacionPedido.setLayout(gridaBagLayoutPaginacionPedido);						
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = 0;
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedido.add(this.jButtonAnterioresPedido, this.gridBagConstraintsPedido);
					
						
			this.gridBagConstraintsPedido = new GridBagConstraints();//
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPedido.gridy = 0;//
			
			this.jPanelPaginacionPedido.add(this.jButtonNuevoGuardarCambiosPedido, this.gridBagConstraintsPedido);//
						
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedido.gridy = 0;
			this.jPanelPaginacionPedido.add(this.jButtonSiguientesPedido, this.gridBagConstraintsPedido);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedido = new GridBagConstraints();//
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedido.gridy = 1;//
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedido.add(this.jButtonNuevoPedido, this.gridBagConstraintsPedido);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedido = new GridBagConstraints();
				this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedido.gridy = 1;
				this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedido.add(this.jButtonNuevoRelacionesPedido, this.gridBagConstraintsPedido);
			}
			
			
			if(!this.pedidoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedido = new GridBagConstraints();//
				this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPedido.gridy = 1;//
				this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPedido.add(this.jButtonGuardarCambiosTablaPedido, this.gridBagConstraintsPedido);//
			}
			
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();//
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedido.gridy = 1;//
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedido.add(this.jButtonDuplicarPedido, this.gridBagConstraintsPedido);//
			
			this.gridBagConstraintsPedido = new GridBagConstraints();//
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedido.gridy = 1;//
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedido.add(this.jButtonCopiarPedido, this.gridBagConstraintsPedido);//
		
			this.gridBagConstraintsPedido = new GridBagConstraints();//
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedido.gridy = 1;//
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedido.add(this.jButtonVerFormPedido, this.gridBagConstraintsPedido);//
		
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = 1;
			this.gridBagConstraintsPedido.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedido.add(this.jButtonCerrarPedido, this.gridBagConstraintsPedido);
		
		
		
		this.jButtonRecargarInformacionPedido.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedido.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedido.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedido.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedido.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedido.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedido.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedido.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedido.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedido.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedido.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedido.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedido.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedido.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedido.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedido, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedido.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedido.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedido.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedido.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedido = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Pedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Pedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Pedido = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Pedido = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedido.setLayout(gridaBagParametrosReportesPedido);
			this.jPanelParametrosReportesAccionesPedido.setLayout(gridaBagParametrosReportesAccionesPedido);
			
			
			this.jPanelParametrosAuxiliar1Pedido.setLayout(gridaBagParametrosAuxiliar1Pedido);
			this.jPanelParametrosAuxiliar2Pedido.setLayout(gridaBagParametrosAuxiliar2Pedido);
			this.jPanelParametrosAuxiliar3Pedido.setLayout(gridaBagParametrosAuxiliar3Pedido);
			this.jPanelParametrosAuxiliar4Pedido.setLayout(gridaBagParametrosAuxiliar4Pedido);
			//this.jPanelParametrosAuxiliar5Pedido.setLayout(gridaBagParametrosAuxiliar2Pedido);			
			
			
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedido.add(this.jButtonRecargarInformacionPedido, this.gridBagConstraintsPedido);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedido.add(this.jComboBoxTiposPaginacionPedido, this.gridBagConstraintsPedido);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedido.add(this.jCheckBoxConAltoMaximoTablaPedido, this.gridBagConstraintsPedido);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Pedido.add(this.jComboBoxTiposArchivosReportesPedido, this.gridBagConstraintsPedido);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedido.add(this.jPanelParametrosAuxiliar1Pedido, this.gridBagConstraintsPedido);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Pedido.add(this.jComboBoxTiposReportesPedido, this.gridBagConstraintsPedido);																		
			
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Pedido.add(this.jComboBoxTiposGraficosReportesPedido, this.gridBagConstraintsPedido);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedido.add(this.jPanelParametrosAuxiliar4Pedido, this.gridBagConstraintsPedido);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedido.add(this.jComboBoxTiposReportesPedido, this.gridBagConstraintsPedido);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedido.add(this.jCheckBoxGenerarReportePedido, this.gridBagConstraintsPedido);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedido.add(this.jPanelParametrosAuxiliar2Pedido, this.gridBagConstraintsPedido);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedido.add(this.jLabelAccionesPedido, this.gridBagConstraintsPedido);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedido = new GridBagConstraints();
				this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedido.add(this.jButtonAbrirOrderByPedido, this.gridBagConstraintsPedido);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedido.add(this.jComboBoxTiposSeleccionarPedido, this.gridBagConstraintsPedido);			
			
			
			/*
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedido.add(this.jCheckBoxSeleccionarTodosPedido, this.gridBagConstraintsPedido);
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedido.add(this.jCheckBoxConGraficoReportePedido, this.gridBagConstraintsPedido);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedido.add(this.jCheckBoxSeleccionarTodosPedido, this.gridBagConstraintsPedido);															
				
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedido.add(this.jCheckBoxSeleccionadosPedido, this.gridBagConstraintsPedido);															
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedido.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Pedido.add(this.jCheckBoxConGraficoReportePedido, this.gridBagConstraintsPedido);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedido.add(this.jPanelParametrosAuxiliar3Pedido, this.gridBagConstraintsPedido);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedido.add(this.jComboBoxTiposRelacionesPedido, this.gridBagConstraintsPedido);
				
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedido.add(this.jComboBoxTiposAccionesPedido, this.gridBagConstraintsPedido);
	
				
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedido.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedido.add(this.jTextFieldValorCampoGeneralPedido, this.gridBagConstraintsPedido);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedido= new GridBagLayout();
		this.jPanelCamposFintotalPedido.setLayout(gridaBagLayoutCamposFintotalPedido);

		GridBagLayout gridaBagLayoutCamposIniciogeneralPedido= new GridBagLayout();
		this.jPanelCamposIniciogeneralPedido.setLayout(gridaBagLayoutCamposIniciogeneralPedido);

		GridBagLayout gridaBagLayoutCamposInicioresumenPedido= new GridBagLayout();
		this.jPanelCamposInicioresumenPedido.setLayout(gridaBagLayoutCamposInicioresumenPedido);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedido = new GridBagLayout();

			this.jScrollPanelDatosPedido.setLayout(gridaBagLayoutDatosPedido);
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = 0;
			this.gridBagConstraintsPedido.gridx = 0;
			
			this.jScrollPanelDatosPedido.add(this.jTableDatosPedido, this.gridBagConstraintsPedido);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedido.setViewportView(this.jTableDatosPedido);
		this.jTableDatosPedido.setFillsViewportHeight(true);
		this.jTableDatosPedido.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedido= new GridBagLayout();
		this.jPanelAccionesPedido.setLayout(gridaBagLayoutAccionesPedido);
		
		
		/*	
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = 0;
		this.gridBagConstraintsPedido.gridx = 0;
			
		this.jPanelAccionesPedido.add(this.jButtonNuevoPedido, this.gridBagConstraintsPedido);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoPedido.setLayout(gridaBagLayoutFK_IdCentroCostoPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdCentroCostoPedido.add(jLabelid_centro_costoFK_IdCentroCostoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdCentroCostoPedido.add(jComboBoxid_centro_costoFK_IdCentroCostoPedido, gridBagConstraintsPedido);


		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdCentroCostoPedido.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdCentroCostoPedido.add(jButtonFK_IdCentroCostoPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoPedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClientePedido= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedido.setLayout(gridaBagLayoutFK_IdClientePedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdClientePedido.add(jLabelid_clienteFK_IdClientePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdClientePedido.add(jComboBoxid_clienteFK_IdClientePedido, gridBagConstraintsPedido);


		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdClientePedido.add(this.jButtonBuscarFK_IdClienteid_clientePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdClientePedido.add(jButtonFK_IdClientePedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("2.-Por Cliente ", jPanelFK_IdClientePedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdConsultorPedido= new GridBagLayout();
		gridaBagLayoutFK_IdConsultorPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsultorPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsultorPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsultorPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsultorPedido.setLayout(gridaBagLayoutFK_IdConsultorPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdConsultorPedido.add(jLabelid_consultorFK_IdConsultorPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdConsultorPedido.add(jComboBoxid_consultorFK_IdConsultorPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdConsultorPedido.add(jButtonFK_IdConsultorPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("3.-Por Consultor ", jPanelFK_IdConsultorPedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPedido.setLayout(gridaBagLayoutFK_IdEmpleadoPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdEmpleadoPedido.add(jLabelid_empleadoFK_IdEmpleadoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdEmpleadoPedido.add(jComboBoxid_empleadoFK_IdEmpleadoPedido, gridBagConstraintsPedido);


		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdEmpleadoPedido.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdEmpleadoPedido.add(jButtonFK_IdEmpleadoPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoPedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoPedido.setLayout(gridaBagLayoutFK_IdEstadoPedidoPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdEstadoPedidoPedido.add(jLabelid_estado_pedidoFK_IdEstadoPedidoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdEstadoPedidoPedido.add(jComboBoxid_estado_pedidoFK_IdEstadoPedidoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdEstadoPedidoPedido.add(jButtonFK_IdEstadoPedidoPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("5.-Por Estado ", jPanelFK_IdEstadoPedidoPedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoPedido= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPedido.setLayout(gridaBagLayoutFK_IdFormatoPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdFormatoPedido.add(jLabelid_formatoFK_IdFormatoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdFormatoPedido.add(jComboBoxid_formatoFK_IdFormatoPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdFormatoPedido.add(jButtonFK_IdFormatoPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("6.-Por Formato ", jPanelFK_IdFormatoPedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdResponsablePedido= new GridBagLayout();
		gridaBagLayoutFK_IdResponsablePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsablePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsablePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsablePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsablePedido.setLayout(gridaBagLayoutFK_IdResponsablePedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdResponsablePedido.add(jLabelid_responsableFK_IdResponsablePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdResponsablePedido.add(jComboBoxid_responsableFK_IdResponsablePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdResponsablePedido.add(jButtonFK_IdResponsablePedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("7.-Por Responsable ", jPanelFK_IdResponsablePedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdRutaTransportePedido= new GridBagLayout();
		gridaBagLayoutFK_IdRutaTransportePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdRutaTransportePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdRutaTransportePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdRutaTransportePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdRutaTransportePedido.setLayout(gridaBagLayoutFK_IdRutaTransportePedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdRutaTransportePedido.add(jLabelid_ruta_transporteFK_IdRutaTransportePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdRutaTransportePedido.add(jComboBoxid_ruta_transporteFK_IdRutaTransportePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdRutaTransportePedido.add(jButtonFK_IdRutaTransportePedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("8.-Por Ruta ", jPanelFK_IdRutaTransportePedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdSubClientePedido= new GridBagLayout();
		gridaBagLayoutFK_IdSubClientePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClientePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClientePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClientePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClientePedido.setLayout(gridaBagLayoutFK_IdSubClientePedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdSubClientePedido.add(jLabelid_sub_clienteFK_IdSubClientePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdSubClientePedido.add(jComboBoxid_sub_clienteFK_IdSubClientePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdSubClientePedido.add(jButtonFK_IdSubClientePedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("9.-Por Contacto ", jPanelFK_IdSubClientePedido);
		jTabbedPaneBusquedasPedido.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioPedido= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioPedido.setLayout(gridaBagLayoutFK_IdTipoCambioPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTipoCambioPedido.add(jLabelid_tipo_cambioFK_IdTipoCambioPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdTipoCambioPedido.add(jComboBoxid_tipo_cambioFK_IdTipoCambioPedido, gridBagConstraintsPedido);


		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTipoCambioPedido.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdTipoCambioPedido.add(jButtonFK_IdTipoCambioPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("10.-Por Tipo Cambio ", jPanelFK_IdTipoCambioPedido);

		GridBagLayout gridaBagLayoutFK_IdTipoLlamadaPedido= new GridBagLayout();
		gridaBagLayoutFK_IdTipoLlamadaPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoLlamadaPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoLlamadaPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoLlamadaPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoLlamadaPedido.setLayout(gridaBagLayoutFK_IdTipoLlamadaPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTipoLlamadaPedido.add(jLabelid_tipo_llamadaFK_IdTipoLlamadaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdTipoLlamadaPedido.add(jComboBoxid_tipo_llamadaFK_IdTipoLlamadaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdTipoLlamadaPedido.add(jButtonFK_IdTipoLlamadaPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("11.-Por Llamada ", jPanelFK_IdTipoLlamadaPedido);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioPedido= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioPedido.setLayout(gridaBagLayoutFK_IdTipoPrecioPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTipoPrecioPedido.add(jLabelid_tipo_precioFK_IdTipoPrecioPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdTipoPrecioPedido.add(jComboBoxid_tipo_precioFK_IdTipoPrecioPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdTipoPrecioPedido.add(jButtonFK_IdTipoPrecioPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("12.-Por Tipo Precio ", jPanelFK_IdTipoPrecioPedido);

		GridBagLayout gridaBagLayoutFK_IdTransportePedido= new GridBagLayout();
		gridaBagLayoutFK_IdTransportePedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportePedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportePedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportePedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportePedido.setLayout(gridaBagLayoutFK_IdTransportePedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTransportePedido.add(jLabelid_transporteFK_IdTransportePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdTransportePedido.add(jComboBoxid_transporteFK_IdTransportePedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdTransportePedido.add(jButtonFK_IdTransportePedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("13.-Por Forma Envio ", jPanelFK_IdTransportePedido);

		GridBagLayout gridaBagLayoutFK_IdTransportistaPedido= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaPedido.setLayout(gridaBagLayoutFK_IdTransportistaPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdTransportistaPedido.add(jLabelid_transportistaFK_IdTransportistaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdTransportistaPedido.add(jComboBoxid_transportistaFK_IdTransportistaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdTransportistaPedido.add(jButtonFK_IdTransportistaPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("14.-Por Transportista ", jPanelFK_IdTransportistaPedido);

		GridBagLayout gridaBagLayoutFK_IdVendedorPedido= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorPedido.setLayout(gridaBagLayoutFK_IdVendedorPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdVendedorPedido.add(jLabelid_vendedorFK_IdVendedorPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdVendedorPedido.add(jComboBoxid_vendedorFK_IdVendedorPedido, gridBagConstraintsPedido);


		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedido.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdVendedorPedido.add(this.jButtonBuscarFK_IdVendedorid_vendedorPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdVendedorPedido.add(jButtonFK_IdVendedorPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("15.-Por Vendedor ", jPanelFK_IdVendedorPedido);

		GridBagLayout gridaBagLayoutFK_IdZonaPedido= new GridBagLayout();
		gridaBagLayoutFK_IdZonaPedido.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaPedido.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaPedido.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaPedido.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaPedido.setLayout(gridaBagLayoutFK_IdZonaPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 0;
		jPanelFK_IdZonaPedido.add(jLabelid_zonaFK_IdZonaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 0;
		gridBagConstraintsPedido.gridx = 1;
		jPanelFK_IdZonaPedido.add(jComboBoxid_zonaFK_IdZonaPedido, gridBagConstraintsPedido);

		gridBagConstraintsPedido = new GridBagConstraints();
		gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedido.gridy = 1;
		gridBagConstraintsPedido.gridx =1;
		jPanelFK_IdZonaPedido.add(jButtonFK_IdZonaPedido, gridBagConstraintsPedido);

		jTabbedPaneBusquedasPedido.addTab("16.-Por Zona ", jPanelFK_IdZonaPedido);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedido);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedido = new GridBagConstraints();						
			this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedido.gridx = 0;		
			//this.gridBagConstraintsPedido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedido.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedido, this.gridBagConstraintsPedido);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedido.gridx = 0;		
		//this.gridBagConstraintsPedido.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedido.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedido);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedido.gridx = 0;		
			this.gridBagConstraintsPedido.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedido.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedido, this.gridBagConstraintsPedido);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedido, this.gridBagConstraintsPedido);								
		
		
		/*
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedido, this.gridBagConstraintsPedido);
		*/		
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedido.gridx =0;
		this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedido, this.gridBagConstraintsPedido);
				
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedido, this.gridBagConstraintsPedido);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedido= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedido = new GridBagLayout();
			this.jPanelBusquedasParametrosPedido.setLayout(gridaBagLayoutBusquedasParametrosPedido);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedido.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedido, this.gridBagConstraintsPedido);
			
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedido, this.gridBagConstraintsPedido);
		
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedido, this.gridBagConstraintsPedido);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedido;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedido() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedido.setName("jPanelReporteDinamicoPedido"); 
		
		this.jPanelReporteDinamicoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedido.setLayout(gridaBagLayoutReporteDinamicoPedido);
		
		
		this.jInternalFrameReporteDinamicoPedido= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedido.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedido.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedido.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedido.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedido = new JLabelMe();

		this.jLabelColumnasSelectReportePedido.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedido.add(this.jLabelColumnasSelectReportePedido, this.gridBagConstraintsPedido);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedido = new JList<Reporte>();
		this.jListColumnasSelectReportePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedido=new JScrollPane(this.jListColumnasSelectReportePedido);
			
			this.jScrollColumnasSelectReportePedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedido.add(this.jListColumnasSelectReportePedido, this.gridBagConstraintsPedido);
		this.jPanelReporteDinamicoPedido.add(this.jScrollColumnasSelectReportePedido, this.gridBagConstraintsPedido);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedido = new JLabelMe();

		this.jLabelRelacionesSelectReportePedido.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedido.add(this.jLabelRelacionesSelectReportePedido, this.gridBagConstraintsPedido);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedido = new JList<Reporte>();
		this.jListRelacionesSelectReportePedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedido.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedido.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedido.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedido=new JScrollPane(this.jListRelacionesSelectReportePedido);
			
			this.jScrollRelacionesSelectReportePedido.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedido.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedido.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedido.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedido.add(this.jListRelacionesSelectReportePedido, this.gridBagConstraintsPedido);
		this.jPanelReporteDinamicoPedido.add(this.jScrollRelacionesSelectReportePedido, this.gridBagConstraintsPedido);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedido = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedido = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedido = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedido = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedido.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedido = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedido.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedido.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedido.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedido.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedido = new JLabelMe();

		this.jLabelConGraficoDinamicoPedido.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedido.add(this.jLabelConGraficoDinamicoPedido, this.gridBagConstraintsPedido);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedido = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedido.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedido.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedido.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedido.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedido.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jCheckBoxConGraficoDinamicoPedido, this.gridBagConstraintsPedido);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedido = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedido.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedido.add(this.jLabelColumnaCategoriaGraficoPedido, this.gridBagConstraintsPedido);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedido.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedido.add(this.jComboBoxColumnaCategoriaGraficoPedido, this.gridBagConstraintsPedido);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedido = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedido.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jLabelColumnaCategoriaValorPedido, this.gridBagConstraintsPedido);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedido.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedido.add(this.jComboBoxColumnaCategoriaValorPedido, this.gridBagConstraintsPedido);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedido = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedido.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jLabelColumnasValoresGraficoPedido, this.gridBagConstraintsPedido);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedido = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedido.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedido.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedido.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedido.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedido.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedido=new JScrollPane(this.jListColumnasValoresGraficoPedido);
			
			this.jScrollColumnasValoresGraficoPedido.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedido.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedido.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedido.add(this.jListColumnasSelectReportePedido, this.gridBagConstraintsPedido);
		this.jPanelReporteDinamicoPedido.add(this.jScrollColumnasValoresGraficoPedido, this.gridBagConstraintsPedido);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedido = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedido.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jLabelTiposGraficosReportesDinamicoPedido, this.gridBagConstraintsPedido);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedido = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedido.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedido.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedido.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jComboBoxTiposGraficosReportesDinamicoPedido, this.gridBagConstraintsPedido);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedido = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedido.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jLabelGenerarExcelReporteDinamicoPedido, this.gridBagConstraintsPedido);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedido = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedido.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedido,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedido.setToolTipText("Generar EXCEL"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedido = new GridBagConstraints();
		//this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedido.add(this.jButtonGenerarExcelReporteDinamicoPedido, this.gridBagConstraintsPedido);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedido.add(this.jComboBoxTiposReportesDinamicoPedido, this.gridBagConstraintsPedido);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedido = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedido.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedido.add(this.jLabelTiposArchivoReporteDinamicoPedido, this.gridBagConstraintsPedido);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedido.add(this.jComboBoxTiposArchivosReportesDinamicoPedido, this.gridBagConstraintsPedido);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedido = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedido.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedido,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedido.setToolTipText("Generar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedido.add(this.jButtonGenerarReporteDinamicoPedido, this.gridBagConstraintsPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedido = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedido.setToolTipText("Cancelar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedido.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedido.add(this.jButtonCerrarReporteDinamicoPedido, this.gridBagConstraintsPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedido = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedido= new JScrollPane(jPanelReporteDinamicoPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedido.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedido.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedido.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedido.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedido.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedido);
		this.jInternalFrameReporteDinamicoPedido.getContentPane().add(this.jScrollPanelReporteDinamicoPedido, this.gridBagConstraintsPedido);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedido() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedido = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedido.setName("jPanelImportacionPedido"); 
		
		this.jPanelImportacionPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedido.setLayout(gridaBagLayoutImportacionPedido);
		
		
		this.jInternalFrameImportacionPedido= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedido= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedido = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedido= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedido.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedido.setResizable(true);
	    this.jInternalFrameImportacionPedido.setClosable(true);
	    this.jInternalFrameImportacionPedido.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedido.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedido.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedido.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedido.setResizable(true);
	    this.jInternalFrameImportacionPedido.setClosable(true);
	    this.jInternalFrameImportacionPedido.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedido.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedido.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedido.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedido = new JLabelMe();

		this.jLabelArchivoImportacionPedido.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedido.add(this.jLabelArchivoImportacionPedido, this.gridBagConstraintsPedido);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedido = new JFileChooser();		
		this.jFileChooserImportacionPedido.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedido = new JButtonMe();
		this.jButtonAbrirImportacionPedido.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedido,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedido.setToolTipText("Generar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedido.add(this.jButtonAbrirImportacionPedido, this.gridBagConstraintsPedido);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedido = new JLabelMe();

		this.jLabelPathArchivoImportacionPedido.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedido.add(this.jLabelPathArchivoImportacionPedido, this.gridBagConstraintsPedido);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedido=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedido.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedido.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedido.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedido.add(this.jTextFieldPathArchivoImportacionPedido, this.gridBagConstraintsPedido);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedido = new JButtonMe();
		this.jButtonGenerarImportacionPedido.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedido,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedido.setToolTipText("Generar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedido.add(this.jButtonGenerarImportacionPedido, this.gridBagConstraintsPedido);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedido = new JButtonMe();
		this.jButtonCerrarImportacionPedido.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedido,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedido.setToolTipText("Cancelar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedido.gridy = iPosYImportacion;
		this.gridBagConstraintsPedido.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedido.add(this.jButtonCerrarImportacionPedido, this.gridBagConstraintsPedido);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedido = new GridBagLayout();
		
		this.jScrollPanelImportacionPedido= new JScrollPane(jPanelImportacionPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedido = new GridBagConstraints();
		this.gridBagConstraintsPedido.gridy =iPosYImportacion;
		this.gridBagConstraintsPedido.gridx =iPosXImportacion;
		this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedido.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedido);
		this.jInternalFrameImportacionPedido.getContentPane().add(this.jScrollPanelImportacionPedido, this.gridBagConstraintsPedido);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedido(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedido = new JButtonMe();
			this.jButtonAbrirOrderByPedido.setText("Orden");
			this.jButtonAbrirOrderByPedido.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedido,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedido";
			inputMap = this.jButtonAbrirOrderByPedido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedido"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedido = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedido.setName("jPanelOrderByPedido"); 
			
			this.jPanelOrderByPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedido.setLayout(gridaBagLayoutOrderByPedido);
			
			
			this.jTableDatosPedidoOrderBy = new JTableMe();        
			this.jTableDatosPedidoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoOrderBy.setViewportView(this.jTableDatosPedidoOrderBy);
			this.jTableDatosPedidoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedido= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedido= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedido = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedido= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedido.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedido.setTitle("Orden");
			this.jInternalFrameOrderByPedido.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedido.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedido.setResizable(true);
			this.jInternalFrameOrderByPedido.setClosable(true);
			this.jInternalFrameOrderByPedido.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedido.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedido.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedido.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedidos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedido.ipady =150;
				
			this.jPanelOrderByPedido.add(jScrollPanelDatosPedidoOrderBy, this.gridBagConstraintsPedido);//this.jTableDatosPedidoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedido = new JButtonMe();
			this.jButtonCerrarOrderByPedido.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedido,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedido.setToolTipText("Cancelar"+" "+PedidoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedido.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedido.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedido.add(this.jButtonCerrarOrderByPedido, this.gridBagConstraintsPedido);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedido = new GridBagLayout();
			
			this.jScrollPanelOrderByPedido= new JScrollPane(jPanelOrderByPedido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedido = new GridBagConstraints();
			this.gridBagConstraintsPedido.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedido.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedido.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedido.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedido.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedido);
			
			this.jInternalFrameOrderByPedido.getContentPane().add(this.jScrollPanelOrderByPedido, this.gridBagConstraintsPedido);			
		
		} else {
			this.jButtonAbrirOrderByPedido = new JButtonMe();
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
		int iWidthTableCalculado=0;//11530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=5030;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=6400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedido.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedido.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedido.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedido.getRowHeight();//PedidoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedido.isSelected()) {
					iHeightTable=PedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedido.isSelected()) {
					iHeightTable=PedidoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedido.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedido.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedido.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedido!=null && this.jInternalFrameOrderByPedido.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedido.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedido.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedido.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedido.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedido.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedido.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedido.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedido.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedido.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedido.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidoLogic.getPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidos.size();
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
	public static List<Pedido> TraerPedidoBeans(List<Pedido> pedidos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Pedido pedido:pedidos) {
					
				if(!(PedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedido.setsDetalleGeneralEntityReporte(PedidoConstantesFunciones.getPedidoDescripcion(pedido));
										
						
					
					

					if(pedido.getDetallePedidos()!=null && Funciones.existeClass(classes,DetallePedido.class)) {
						try{pedido.setdetallepedidosDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoJInternalFrame.TraerDetallePedidoBeans(pedido.getDetallePedidos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedido.setsDetalleGeneralEntityReporte(pedido.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidobeans.add(pedidobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidos;
    }
	//PARA REPORTES FIN
}
