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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
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
import com.bydan.erp.facturacion.util.FacturaConstantesFunciones;

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
public class FacturaJInternalFrame extends FacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFactura;
	
	protected JMenuBar jmenuBarFactura;
	
	protected JMenu jmenuFactura;
	protected JMenu jmenuDatosFactura;
	protected JMenu jmenuArchivoFactura;
	protected JMenu jmenuAccionesFactura;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFactura;	
	protected GridBagConstraints gridBagConstraintsFactura;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FacturaDetalleFormJInternalFrame jInternalFrameDetalleFormFactura;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFactura;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFactura;	
	
	
	
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

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame estadofisicofacturaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofisicofacturaempresa="";
	
	public FacturaSessionBean facturaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public PedidoSessionBean pedidoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Factura> facturas;		
	public List<Factura> facturasEliminados;	
	public List<Factura> facturasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFactura;		
	protected JButton jButtonAbrirOrderByFactura;
	
	
	//protected JPanel jPanelOrderByFactura;
	//public JScrollPane jScrollPanelOrderByFactura;	
	//protected JButton jButtonCerrarOrderByFactura;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FacturaLogic facturaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFactura;
	public JScrollPane jScrollPanelDatosEdicionFactura;
	public JScrollPane jScrollPanelDatosGeneralFactura;
    
	
	
	//public JScrollPane jScrollPanelDatosFacturaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFactura;
	//public JScrollPane jScrollPanelImportacionFactura;
	
	
	
	protected JPanel jPanelAccionesFactura;
	
    protected JPanel jPanelPaginacionFactura;
    protected JPanel jPanelParametrosReportesFactura;
	protected JPanel jPanelParametrosReportesAccionesFactura;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalFactura;
	protected Integer iXPanelCamposFintotalFactura=0;
	protected Integer iYPanelCamposFintotalFactura=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Factura;
	protected JPanel jPanelParametrosAuxiliar2Factura;
	protected JPanel jPanelParametrosAuxiliar3Factura;
	protected JPanel jPanelParametrosAuxiliar4Factura;
	//protected JPanel jPanelParametrosAuxiliar5Factura;
	
	
	
	//protected JPanel jPanelReporteDinamicoFactura;
	//protected JPanel jPanelImportacionFactura;
	
	
	public JTable jTableDatosFactura;
	
	
	
	//public JTable jTableDatosFacturaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFactura;
	protected JButton jButtonDuplicarFactura;
	protected JButton jButtonCopiarFactura;
	protected JButton jButtonVerFormFactura;
	protected JButton jButtonNuevoRelacionesFactura;
	protected JButton jButtonModificarFactura;
	
    protected JButton jButtonGuardarCambiosTablaFactura;
	protected JButton jButtonCerrarFactura;
	
	
	protected JButton jButtonRecargarInformacionFactura;
	protected JButton jButtonProcesarInformacionFactura;
	
	
	protected JButton jButtonAnterioresFactura;
	protected JButton jButtonSiguientesFactura;
	protected JButton jButtonNuevoGuardarCambiosFactura;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFactura;
	//protected JButton jButtonCerrarReporteDinamicoFactura;
	//protected JButton jButtonGenerarExcelReporteDinamicoFactura;	
	
	
	
	//protected JButton jButtonAbrirImportacionFactura;
	//protected JButton jButtonGenerarImportacionFactura;
	//protected JButton jButtonCerrarImportacionFactura;
	//protected JFileChooser jFileChooserImportacionFactura;
	//protected File fileImportacionFactura;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFactura;
	protected JButton jButtonDuplicarToolBarFactura;
	protected JButton jButtonNuevoRelacionesToolBarFactura;
	
	
	public JButton jButtonGuardarCambiosToolBarFactura;
	protected JButton jButtonCopiarToolBarFactura;
	protected JButton jButtonVerFormToolBarFactura;
	public JButton jButtonGuardarCambiosTablaToolBarFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarFactura;
	protected JButton jButtonCerrarToolBarFactura;
	
	protected JButton jButtonRecargarInformacionToolBarFactura;
	protected JButton jButtonProcesarInformacionToolBarFactura;
	protected JButton jButtonAnterioresToolBarFactura;
	protected JButton jButtonSiguientesToolBarFactura;
	protected JButton jButtonNuevoGuardarCambiosToolBarFactura;
	protected JButton jButtonAbrirOrderByToolBarFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFactura;
	protected JMenuItem jMenuItemDuplicarFactura;
	protected JMenuItem jMenuItemNuevoRelacionesFactura;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFactura;
	protected JMenuItem jMenuItemCopiarFactura;
	protected JMenuItem jMenuItemVerFormFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaFactura;
	protected JMenuItem jMenuItemCerrarFactura;
	protected JMenuItem jMenuItemDetalleCerrarFactura;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarFactura;
	
	protected JMenuItem jMenuItemRecargarInformacionFactura;
	protected JMenuItem jMenuItemProcesarInformacionFactura;
	protected JMenuItem jMenuItemAnterioresFactura;
	protected JMenuItem jMenuItemSiguientesFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFactura;
	protected JMenuItem jMenuItemAbrirOrderByFactura;
	protected JMenuItem jMenuItemMostrarOcultarFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFactura;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFactura;
	protected JCheckBox jCheckBoxSeleccionadosFactura;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFactura;
	protected JCheckBox jCheckBoxConGraficoReporteFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFactura;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFactura;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFactura;
	protected JTextField jTextFieldValorCampoGeneralFactura;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFactura;
	//public JList<Reporte> jListColumnasSelectReporteFactura;
	//public JScrollPane jScrollColumnasSelectReporteFactura;
	
	//public JLabel jLabelRelacionesSelectReporteFactura;
	//public JList<Reporte> jListRelacionesSelectReporteFactura;
	//public JScrollPane jScrollRelacionesSelectReporteFactura;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFactura;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFactura;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFactura;
	//public JLabel jLabelTiposArchivoReporteDinamicoFactura;
	
		
	//public JLabel jLabelArchivoImportacionFactura;	
	//public JLabel jLabelPathArchivoImportacionFactura;
	//protected JTextField jTextFieldPathArchivoImportacionFactura;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFactura;
	
	//public JLabel jLabelColumnaCategoriaValorFactura;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFactura;
	
	//public JLabel jLabelColumnasValoresGraficoFactura;
	//public JList<Reporte> jListColumnasValoresGraficoFactura;
	//public JScrollPane jScrollColumnasValoresGraficoFactura;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFactura;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFactura;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFactura;
	public JPanel jPanelBusquedaPorNumeroPreImpresoFactura;
	public JButton jButtonBusquedaPorNumeroPreImpresoFactura;
	public JPanel jPanelFK_IdClienteFactura;
	public JButton jButtonFK_IdClienteFactura;
	public JPanel jPanelFK_IdEstadoFisicoFacturaEmpresaFactura;
	public JButton jButtonFK_IdEstadoFisicoFacturaEmpresaFactura;
	public JPanel jPanelFK_IdPedidoFactura;
	public JButton jButtonFK_IdPedidoFactura;
	public JPanel jPanelFK_IdResponsableFactura;
	public JButton jButtonFK_IdResponsableFactura;
	public JPanel jPanelFK_IdSubClienteFactura;
	public JButton jButtonFK_IdSubClienteFactura;
	public JPanel jPanelFK_IdTransportistaFactura;
	public JButton jButtonFK_IdTransportistaFactura;
	public JPanel jPanelFK_IdVendedorFactura;
	public JButton jButtonFK_IdVendedorFactura;
	
	public JPanel jPanelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura;
	public JLabel jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura;
	public JTextField jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura;
	public JButton jButtonnumero_pre_impresoBusquedaPorNumeroPreImpresoFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteFactura;
	public JLabel jLabelid_clienteFK_IdClienteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteFactura;
	public JButton jButtonid_clienteFK_IdClienteFactura= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteFacturaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteFactura;
	
	public JPanel jPanelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura;
	public JLabel jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura;
	public JButton jButtonid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura= new JButtonMe();
	public JButton jButtonid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedidoFK_IdPedidoFactura;
	public JLabel jLabelid_pedidoFK_IdPedidoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoFK_IdPedidoFactura;
	public JButton jButtonid_pedidoFK_IdPedidoFactura= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_pedidoFK_IdPedidoFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_responsableFK_IdResponsableFactura;
	public JLabel jLabelid_responsableFK_IdResponsableFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFK_IdResponsableFactura;
	public JButton jButtonid_responsableFK_IdResponsableFactura= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableFacturaUpdate= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClienteFactura;
	public JLabel jLabelid_sub_clienteFK_IdSubClienteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClienteFactura;
	public JButton jButtonid_sub_clienteFK_IdSubClienteFactura= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaFactura;
	public JLabel jLabelid_transportistaFK_IdTransportistaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaFactura;
	public JButton jButtonid_transportistaFK_IdTransportistaFactura= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorFactura;
	public JLabel jLabelid_vendedorFK_IdVendedorFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorFactura;
	public JButton jButtonid_vendedorFK_IdVendedorFactura= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorFacturaArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorFactura;
	
	
	
	
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
		
	//public int iWidthFormulario=1415;//(screenSize.width-screenSize.width/2)+(250*3);
	//public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public FacturaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFactura)	{
		this.jButtonRecargarInformacionFactura = jButtonRecargarInformacionFactura;
	}
	
	public JButton getjButtonProcesarInformacionFactura() {
		return this.jButtonProcesarInformacionFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFactura)	{
		this.jButtonProcesarInformacionFactura = jButtonProcesarInformacionFactura;
	}
	
	
	public JButton getjButtonRecargarInformacionFactura() {
		return this.jButtonRecargarInformacionFactura;
	}
	
	
	public List<Factura> getfacturas() {
		return this.facturas;
	}

	public void setfacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	public List<Factura> getfacturasAux() {
		return this.facturasAux;
	}

	public void setfacturasAux(List<Factura> facturasAux) {
		this.facturasAux = facturasAux;
	}
	
	public List<Factura> getfacturasEliminados() {
		return this.facturasEliminados;
	}

	public void setFacturasEliminados(List<Factura> facturasEliminados) {
		this.facturasEliminados = facturasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFactura() {
		return jComboBoxTiposSeleccionarFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFactura(
			JComboBox jComboBoxTiposSeleccionarFactura) {
		this.jComboBoxTiposSeleccionarFactura = jComboBoxTiposSeleccionarFactura;
	}
	
	public void setBorderResaltarTiposSeleccionarFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFactura .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFactura() {
		return jTextFieldValorCampoGeneralFactura;
	}

	public void setjTextFieldValorCampoGeneralFactura(
			JTextField jTextFieldValorCampoGeneralFactura) {
		this.jTextFieldValorCampoGeneralFactura = jTextFieldValorCampoGeneralFactura;
	}

	public void setBorderResaltarValorCampoGeneralFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFactura .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFactura() {
		return this.jCheckBoxSeleccionarTodosFactura;
	}

	public void setjCheckBoxSeleccionarTodosFactura(
			JCheckBox jCheckBoxSeleccionarTodosFactura) {
		this.jCheckBoxSeleccionarTodosFactura = jCheckBoxSeleccionarTodosFactura;
	}

	public void setBorderResaltarSeleccionarTodosFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFactura .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFactura() {
		return this.jCheckBoxSeleccionadosFactura;
	}

	public void setjCheckBoxSeleccionadosFactura(
			JCheckBox jCheckBoxSeleccionadosFactura) {
		this.jCheckBoxSeleccionadosFactura = jCheckBoxSeleccionadosFactura;
	}
	
	public void setBorderResaltarSeleccionadosFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFactura .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFactura() {
		return this.jComboBoxTiposArchivosReportesFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFactura(
			JComboBox jComboBoxTiposArchivosReportesFactura) {
		this.jComboBoxTiposArchivosReportesFactura = jComboBoxTiposArchivosReportesFactura;
	}

	public void setBorderResaltarTiposArchivosReportesFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFactura() {
		return this.jComboBoxTiposReportesFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFactura(
			JComboBox jComboBoxTiposReportesFactura) {
		this.jComboBoxTiposReportesFactura = jComboBoxTiposReportesFactura;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFactura() {
	//	return jComboBoxTiposReportesDinamicoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFactura(
	//		JComboBox jComboBoxTiposReportesDinamicoFactura) {
	//	this.jComboBoxTiposReportesDinamicoFactura = jComboBoxTiposReportesDinamicoFactura;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFactura() {
	//	return jComboBoxTiposArchivosReportesDinamicoFactura;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFactura(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFactura) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFactura = jComboBoxTiposArchivosReportesDinamicoFactura;
	//}
	
	public void setBorderResaltarTiposReportesFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFactura() {
		return this.jComboBoxTiposGraficosReportesFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFactura(
			JComboBox jComboBoxTiposGraficosReportesFactura) {
		this.jComboBoxTiposGraficosReportesFactura = jComboBoxTiposGraficosReportesFactura;
	}
	
	public void setBorderResaltarTiposGraficosReportesFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFactura() {
		return this.jComboBoxTiposPaginacionFactura;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFactura(
			JComboBox jComboBoxTiposPaginacionFactura) {
		this.jComboBoxTiposPaginacionFactura = jComboBoxTiposPaginacionFactura;
	}
	
	public void setBorderResaltarTiposPaginacionFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFactura .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFactura() {
		return this.jComboBoxTiposRelacionesFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFactura() {
		return this.jComboBoxTiposAccionesFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFactura(
			JComboBox jComboBoxTiposRelacionesFactura) {
		this.jComboBoxTiposRelacionesFactura = jComboBoxTiposRelacionesFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFactura(
			JComboBox jComboBoxTiposAccionesFactura) {
		this.jComboBoxTiposAccionesFactura = jComboBoxTiposAccionesFactura;
	}
	
	public void setBorderResaltarTiposRelacionesFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFactura .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFactura() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFactura.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFactura .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFactura() {
	//	return jCheckBoxConGraficoDinamicoFactura;
	//}

	//public void setjCheckBoxConGraficoDinamicoFactura(
	//		JCheckBox jCheckBoxConGraficoDinamicoFactura) {
	//	this.jCheckBoxConGraficoDinamicoFactura = jCheckBoxConGraficoDinamicoFactura;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFactura() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFactura.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFactura .setBorder(borderResaltar);		
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
		this.facturaSessionBean=new FacturaSessionBean();
		
		this.facturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura MANTENIMIENTO"));
		
		
		if(iWidth > 4750) {
			iWidth=4750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
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
		
		FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFactura= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFactura,this.jTtoolBarFactura,
							"nuevo","nuevo","Nuevo"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFactura,this.jTtoolBarFactura,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFactura,this.jTtoolBarFactura,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFactura,this.jTtoolBarFactura,
							"duplicar","duplicar","Duplicar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFactura,this.jTtoolBarFactura,
							"copiar","copiar","Copiar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFactura,this.jTtoolBarFactura,
							"ver_form","ver_form","Ver"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactura,this.jTtoolBarFactura,
							"recargar","recargar","Recargar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactura,this.jTtoolBarFactura,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFactura,this.jTtoolBarFactura,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFactura,this.jTtoolBarFactura,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFactura,this.jTtoolBarFactura,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFactura,this.jTtoolBarFactura,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFactura,this.jTtoolBarFactura,
							"cerrar","cerrar","Salir"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFactura=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFactura;
			
				this.jButtonProcesarInformacionToolBarFactura=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFactura;
				
		//protected JButton jButtonModificarToolBarFactura;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFactura=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFactura=new JMenuMe("General");
		this.jmenuArchivoFactura=new JMenuMe("Archivo");
		this.jmenuAccionesFactura=new JMenuMe("Acciones");
		this.jmenuDatosFactura=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFactura= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFactura.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFactura,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFactura= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFactura.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFactura,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFactura= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFactura.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFactura,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFactura= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFactura.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFactura,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFactura= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFactura.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFactura,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFactura= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFactura.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFactura,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFactura= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFactura.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFactura,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFactura= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFactura.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFactura,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFactura= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFactura.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFactura,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFactura= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFactura.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFactura,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFactura= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFactura.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFactura,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFactura.add(this.jMenuItemCerrarFactura);
			
			this.jmenuAccionesFactura.add(this.jMenuItemNuevoFactura);
			this.jmenuAccionesFactura.add(this.jMenuItemNuevoGuardarCambiosFactura);
			this.jmenuAccionesFactura.add(this.jMenuItemNuevoRelacionesFactura);
			this.jmenuAccionesFactura.add(this.jMenuItemGuardarCambiosTablaFactura);		
			this.jmenuAccionesFactura.add(this.jMenuItemDuplicarFactura);		
			this.jmenuAccionesFactura.add(this.jMenuItemCopiarFactura);		
			this.jmenuAccionesFactura.add(this.jMenuItemVerFormFactura);		
			
			this.jmenuDatosFactura.add(this.jMenuItemRecargarInformacionFactura);				
			this.jmenuDatosFactura.add(this.jMenuItemAnterioresFactura);				
			this.jmenuDatosFactura.add(this.jMenuItemSiguientesFactura);				
			this.jmenuDatosFactura.add(this.jMenuItemAbrirOrderByFactura);				
			this.jmenuDatosFactura.add(this.jMenuItemMostrarOcultarFactura);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFactura.add(this.jMenuItemGuardarCambiosFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFactura.add(this.jmenuArchivoFactura);		
			this.jmenuBarFactura.add(this.jmenuAccionesFactura);		
			this.jmenuBarFactura.add(this.jmenuDatosFactura);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFactura);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFactura() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNumeroPreImpresoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNumeroPreImpresoFactura.setToolTipText("Buscar Por Numero Pre Impreso ");
		this.jButtonBusquedaPorNumeroPreImpresoFactura= new JButtonMe();
		this.jButtonBusquedaPorNumeroPreImpresoFactura.setText("Buscar");
		this.jButtonBusquedaPorNumeroPreImpresoFactura.setToolTipText("Buscar Por Numero Pre Impreso ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNumeroPreImpresoFactura,"buscar_button","Buscar Por Numero Pre Impreso ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNumeroPreImpresoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura = new JLabelMe();
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setText("Numero Pre Impreso :");
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setToolTipText("Numero Pre Impreso");
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura= new JTextFieldMe();
		jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteFactura.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteFactura= new JButtonMe();
		this.jButtonFK_IdClienteFactura.setText("Buscar");
		this.jButtonFK_IdClienteFactura.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteFactura,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteFactura = new JLabelMe();
		jLabelid_clienteFK_IdClienteFactura.setText("Cliente :");
		jLabelid_clienteFK_IdClienteFactura.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteFactura= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteFactura= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteFactura.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteFactura.setFocusable(false);

		this.jPanelFK_IdEstadoFisicoFacturaEmpresaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoFisicoFacturaEmpresaFactura.setToolTipText("Buscar Por Estado Fisico ");
		this.jButtonFK_IdEstadoFisicoFacturaEmpresaFactura= new JButtonMe();
		this.jButtonFK_IdEstadoFisicoFacturaEmpresaFactura.setText("Buscar");
		this.jButtonFK_IdEstadoFisicoFacturaEmpresaFactura.setToolTipText("Buscar Por Estado Fisico ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoFisicoFacturaEmpresaFactura,"buscar_button","Buscar Por Estado Fisico ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoFisicoFacturaEmpresaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura = new JLabelMe();
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setText("Estado Fisico :");
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setToolTipText("Estado Fisico");
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura= new JComboBoxMe();
		jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPedidoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPedidoFactura.setToolTipText("Buscar Por Idpedido ");
		this.jButtonFK_IdPedidoFactura= new JButtonMe();
		this.jButtonFK_IdPedidoFactura.setText("Buscar");
		this.jButtonFK_IdPedidoFactura.setToolTipText("Buscar Por Idpedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPedidoFactura,"buscar_button","Buscar Por Idpedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPedidoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_pedidoFK_IdPedidoFactura = new JLabelMe();
		jLabelid_pedidoFK_IdPedidoFactura.setText("Idpedido :");
		jLabelid_pedidoFK_IdPedidoFactura.setToolTipText("Idpedido");
		jLabelid_pedidoFK_IdPedidoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_pedidoFK_IdPedidoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoFK_IdPedidoFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_pedidoFK_IdPedidoFactura= new JComboBoxMe();
		jComboBoxid_pedidoFK_IdPedidoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFK_IdPedidoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoFK_IdPedidoFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdResponsableFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsableFactura.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsableFactura= new JButtonMe();
		this.jButtonFK_IdResponsableFactura.setText("Buscar");
		this.jButtonFK_IdResponsableFactura.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsableFactura,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsableFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsableFK_IdResponsableFactura = new JLabelMe();
		jLabelid_responsableFK_IdResponsableFactura.setText("Responsable :");
		jLabelid_responsableFK_IdResponsableFactura.setToolTipText("Responsable");
		jLabelid_responsableFK_IdResponsableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFK_IdResponsableFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsableFK_IdResponsableFactura= new JComboBoxMe();
		jComboBoxid_responsableFK_IdResponsableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFK_IdResponsableFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClienteFactura.setToolTipText("Buscar Por Contacto ");
		this.jButtonFK_IdSubClienteFactura= new JButtonMe();
		this.jButtonFK_IdSubClienteFactura.setText("Buscar");
		this.jButtonFK_IdSubClienteFactura.setToolTipText("Buscar Por Contacto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClienteFactura,"buscar_button","Buscar Por Contacto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClienteFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClienteFactura = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClienteFactura.setText("Contacto :");
		jLabelid_sub_clienteFK_IdSubClienteFactura.setToolTipText("Contacto");
		jLabelid_sub_clienteFK_IdSubClienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClienteFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClienteFactura= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClienteFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaFactura.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaFactura= new JButtonMe();
		this.jButtonFK_IdTransportistaFactura.setText("Buscar");
		this.jButtonFK_IdTransportistaFactura.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaFactura,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaFactura = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaFactura.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaFactura.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaFactura= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorFactura.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorFactura= new JButtonMe();
		this.jButtonFK_IdVendedorFactura.setText("Buscar");
		this.jButtonFK_IdVendedorFactura.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorFactura,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorFactura = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorFactura.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorFactura.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorFactura,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorFactura= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorFactura,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorFactura= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorFactura.setFocusable(false);


		this.jTabbedPaneBusquedasFactura=new JTabbedPane();


		this.jTabbedPaneBusquedasFactura.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFactura.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFactura.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFactura,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFactura = new FacturaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Factura DATOS");
			this.jInternalFrameDetalleFormFactura = new FacturaDetalleFormJInternalFrame(jDesktopPane,this.facturaSessionBean.getConGuardarRelaciones(),this.facturaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFactura = null;//new FacturaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFactura= new GridBagLayout();
		
		
		this.jTableDatosFactura = new JTableMe();      
		
		String sToolTipFactura="";
		sToolTipFactura=FacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFactura+="(Facturacion.Factura)";
		}
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFactura+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFactura.setToolTipText(sToolTipFactura);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFactura);
		this.jTableDatosFactura.setAutoCreateRowSorter(true);
		this.jTableDatosFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFactura.setRowSelectionAllowed(true);
		this.jTableDatosFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFactura,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFactura = new JButtonMe();
		this.jButtonDuplicarFactura = new JButtonMe();
		this.jButtonCopiarFactura = new JButtonMe();
		this.jButtonVerFormFactura = new JButtonMe();
		this.jButtonNuevoRelacionesFactura = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFactura = new JButtonMe();
		this.jButtonCerrarFactura = new JButtonMe();
		
		this.jScrollPanelDatosFactura = new JScrollPane();   
        this.jScrollPanelDatosGeneralFactura = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Factura";
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFactura.setToolTipText("Acciones");
        this.jPanelAccionesFactura.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalFactura.setName("jPanelCamposFintotalFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalFactura, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoFactura=new ReporteDinamicoJInternalFrame(FacturaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFactura();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFactura=new ImportacionJInternalFrame(FacturaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFactura();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFactura = new JButtonMe();
		
		this.jButtonAbrirOrderByFactura.setText("Orden");
		this.jButtonAbrirOrderByFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFactura,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactura,false,this);
			
			//this.cargarOrderByFactura(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactura,true,this);
			
			//this.cargarOrderByFactura(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFactura.setMinimumSize(new Dimension(400,50));//4730
		this.jTableDatosFactura.setMaximumSize(new Dimension(400,50));//4730
		this.jTableDatosFactura.setPreferredSize(new Dimension(400,50));//4730
		
		this.jScrollPanelDatosFactura.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFactura.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFactura.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFactura.setText("Nuevo");
		this.jButtonDuplicarFactura.setText("Duplicar");
		this.jButtonCopiarFactura.setText("Copiar");
		this.jButtonVerFormFactura.setText("Ver");
		this.jButtonNuevoRelacionesFactura.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFactura.setText("Guardar");
		this.jButtonCerrarFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFactura,"nuevo_button","Nuevo",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFactura,"duplicar_button","Duplicar",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFactura,"copiar_button","Copiar",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFactura,"ver_form","Ver",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFactura,"nuevorelaciones_button","Nuevo Rel",this.facturaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFactura,"guardarcambiostabla_button","Guardar",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFactura,"cerrar_button","Salir",this.facturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFactura.setToolTipText("Nuevo"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFactura.setToolTipText("Duplicar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFactura.setToolTipText("Copiar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFactura.setToolTipText("Ver"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFactura.setToolTipText("Nuevo Rel"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFactura.setToolTipText("Guardar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFactura.setToolTipText("Salir"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFactura";
		inputMap = this.jButtonNuevoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFactura"));
		
		//DUPLICAR
		sMapKey = "DuplicarFactura";
		inputMap = this.jButtonDuplicarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFactura"));
		
		//COPIAR
		sMapKey = "CopiarFactura";
		inputMap = this.jButtonCopiarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFactura"));
		
		//VEr FORM
		sMapKey = "VerFormFactura";
		inputMap = this.jButtonVerFormFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFactura"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFactura";
		inputMap = this.jButtonNuevoRelacionesFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFactura"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFactura";
		inputMap = this.jButtonModificarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFactura"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFactura";
		inputMap = this.jButtonCerrarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFactura";
		inputMap = this.jButtonGuardarCambiosTablaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFactura"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Factura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Factura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Factura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Factura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Factura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFactura.setName("jPanelParametrosReportesFactura"); 
		
		this.jPanelParametrosReportesAccionesFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFactura.setName("jPanelParametrosReportesAccionesFactura"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFactura, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFactura, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFactura = new JButtonMe();
		this.jButtonRecargarInformacionFactura.setText("Recargar");
		this.jButtonRecargarInformacionFactura.setToolTipText("Recargar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFactura,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFactura = new JButtonMe();
		this.jButtonProcesarInformacionFactura.setText("Procesar");
		this.jButtonProcesarInformacionFactura.setToolTipText("Procesar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFactura.setVisible(false);
			
		this.jButtonProcesarInformacionFactura.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFactura.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFactura.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactura.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFactura.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactura.setText("TIPO");       
		this.jComboBoxTiposReportesFactura.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFactura = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFactura.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFactura = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFactura.setText("Paginacion");
		this.jComboBoxTiposPaginacionFactura.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFactura = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFactura.setText("Accion");
		this.jComboBoxTiposRelacionesFactura.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFactura.setText("Accion");
		this.jComboBoxTiposAccionesFactura.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFactura = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFactura.setText("Accion");
		this.jComboBoxTiposSeleccionarFactura.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFactura=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFactura.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFactura.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFactura.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFactura = new JLabelMe();
		
		this.jLabelAccionesFactura.setText("Acciones");		
		this.jLabelAccionesFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFactura = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFactura.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFactura.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFactura = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFactura.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFactura.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFactura = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFactura.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFactura.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFactura.setText("Graf.");
		this.jCheckBoxConGraficoReporteFactura.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFactura = new JButtonMe();
		//this.jButtonAnterioresFactura.setText("<<");
        this.jButtonAnterioresFactura.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFactura,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFactura = new JButtonMe();
		//this.jButtonSiguientesFactura.setText(">>");
        this.jButtonSiguientesFactura.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFactura,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFactura = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFactura.setText("Nue");
        this.jButtonNuevoGuardarCambiosFactura.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFactura,"nuevoguardarcambios_button","Nue",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFactura";
		inputMap = this.jButtonNuevoGuardarCambiosFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFactura"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFactura";
		inputMap = this.jButtonRecargarInformacionFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFactura"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFactura";
		inputMap = this.jButtonSiguientesFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFactura"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFactura";
		inputMap = this.jButtonAnterioresFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFactura"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFactura();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFactura.setMinimumSize(new Dimension(this.getWidth(),FacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFactura.setMaximumSize(new Dimension(this.getWidth(),FacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFactura.setPreferredSize(new Dimension(this.getWidth(),FacturaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FacturaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFactura = new GridBagLayout();

			this.jPanelPaginacionFactura.setLayout(gridaBagLayoutPaginacionFactura);						
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = 0;
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFactura.add(this.jButtonAnterioresFactura, this.gridBagConstraintsFactura);
					
						
			this.gridBagConstraintsFactura = new GridBagConstraints();//
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsFactura.gridy = 0;//
			
			this.jPanelPaginacionFactura.add(this.jButtonNuevoGuardarCambiosFactura, this.gridBagConstraintsFactura);//
						
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFactura.gridy = 0;
			this.jPanelPaginacionFactura.add(this.jButtonSiguientesFactura, this.gridBagConstraintsFactura);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFactura = new GridBagConstraints();//
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFactura.gridy = 1;//
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFactura.add(this.jButtonNuevoFactura, this.gridBagConstraintsFactura);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFactura = new GridBagConstraints();
				this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFactura.gridy = 1;
				this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFactura.add(this.jButtonNuevoRelacionesFactura, this.gridBagConstraintsFactura);
			}
			
			
			if(!this.facturaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFactura = new GridBagConstraints();//
				this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsFactura.gridy = 1;//
				this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionFactura.add(this.jButtonGuardarCambiosTablaFactura, this.gridBagConstraintsFactura);//
			}
			
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();//
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFactura.gridy = 1;//
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFactura.add(this.jButtonDuplicarFactura, this.gridBagConstraintsFactura);//
			
			this.gridBagConstraintsFactura = new GridBagConstraints();//
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFactura.gridy = 1;//
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFactura.add(this.jButtonCopiarFactura, this.gridBagConstraintsFactura);//
		
			this.gridBagConstraintsFactura = new GridBagConstraints();//
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsFactura.gridy = 1;//
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionFactura.add(this.jButtonVerFormFactura, this.gridBagConstraintsFactura);//
		
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = 1;
			this.gridBagConstraintsFactura.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFactura.add(this.jButtonCerrarFactura, this.gridBagConstraintsFactura);
		
		
		
		this.jButtonRecargarInformacionFactura.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFactura.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFactura.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFactura.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFactura.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFactura.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFactura.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFactura.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFactura.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFactura.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFactura.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFactura.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFactura.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFactura.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFactura.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFactura, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFactura.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFactura.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFactura.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFactura.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFactura = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFactura = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Factura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Factura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Factura = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Factura = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFactura.setLayout(gridaBagParametrosReportesFactura);
			this.jPanelParametrosReportesAccionesFactura.setLayout(gridaBagParametrosReportesAccionesFactura);
			
			
			this.jPanelParametrosAuxiliar1Factura.setLayout(gridaBagParametrosAuxiliar1Factura);
			this.jPanelParametrosAuxiliar2Factura.setLayout(gridaBagParametrosAuxiliar2Factura);
			this.jPanelParametrosAuxiliar3Factura.setLayout(gridaBagParametrosAuxiliar3Factura);
			this.jPanelParametrosAuxiliar4Factura.setLayout(gridaBagParametrosAuxiliar4Factura);
			//this.jPanelParametrosAuxiliar5Factura.setLayout(gridaBagParametrosAuxiliar2Factura);			
			
			
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactura.add(this.jButtonRecargarInformacionFactura, this.gridBagConstraintsFactura);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Factura.add(this.jComboBoxTiposPaginacionFactura, this.gridBagConstraintsFactura);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Factura.add(this.jCheckBoxConAltoMaximoTablaFactura, this.gridBagConstraintsFactura);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Factura.add(this.jComboBoxTiposArchivosReportesFactura, this.gridBagConstraintsFactura);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactura.add(this.jPanelParametrosAuxiliar1Factura, this.gridBagConstraintsFactura);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Factura.add(this.jComboBoxTiposReportesFactura, this.gridBagConstraintsFactura);																		
			
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Factura.add(this.jComboBoxTiposGraficosReportesFactura, this.gridBagConstraintsFactura);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactura.add(this.jPanelParametrosAuxiliar4Factura, this.gridBagConstraintsFactura);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactura.add(this.jComboBoxTiposReportesFactura, this.gridBagConstraintsFactura);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactura.add(this.jCheckBoxGenerarReporteFactura, this.gridBagConstraintsFactura);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactura.add(this.jPanelParametrosAuxiliar2Factura, this.gridBagConstraintsFactura);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactura.add(this.jLabelAccionesFactura, this.gridBagConstraintsFactura);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFactura = new GridBagConstraints();
				this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFactura.add(this.jButtonAbrirOrderByFactura, this.gridBagConstraintsFactura);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactura.add(this.jComboBoxTiposSeleccionarFactura, this.gridBagConstraintsFactura);			
			
			
			/*
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactura.add(this.jCheckBoxSeleccionarTodosFactura, this.gridBagConstraintsFactura);
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFactura.add(this.jCheckBoxConGraficoReporteFactura, this.gridBagConstraintsFactura);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Factura.add(this.jCheckBoxSeleccionarTodosFactura, this.gridBagConstraintsFactura);															
				
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Factura.add(this.jCheckBoxSeleccionadosFactura, this.gridBagConstraintsFactura);															
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFactura.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Factura.add(this.jCheckBoxConGraficoReporteFactura, this.gridBagConstraintsFactura);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFactura.add(this.jPanelParametrosAuxiliar3Factura, this.gridBagConstraintsFactura);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactura.add(this.jComboBoxTiposRelacionesFactura, this.gridBagConstraintsFactura);
				
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactura.add(this.jComboBoxTiposAccionesFactura, this.gridBagConstraintsFactura);
	
				
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFactura.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFactura.add(this.jTextFieldValorCampoGeneralFactura, this.gridBagConstraintsFactura);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalFactura= new GridBagLayout();
		this.jPanelCamposFintotalFactura.setLayout(gridaBagLayoutCamposFintotalFactura);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFactura = new GridBagLayout();

			this.jScrollPanelDatosFactura.setLayout(gridaBagLayoutDatosFactura);
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = 0;
			this.gridBagConstraintsFactura.gridx = 0;
			
			this.jScrollPanelDatosFactura.add(this.jTableDatosFactura, this.gridBagConstraintsFactura);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFactura.setViewportView(this.jTableDatosFactura);
		this.jTableDatosFactura.setFillsViewportHeight(true);
		this.jTableDatosFactura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFactura= new GridBagLayout();
		this.jPanelAccionesFactura.setLayout(gridaBagLayoutAccionesFactura);
		
		
		/*	
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 0;
			
		this.jPanelAccionesFactura.add(this.jButtonNuevoFactura, this.gridBagConstraintsFactura);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNumeroPreImpresoFactura= new GridBagLayout();
		gridaBagLayoutBusquedaPorNumeroPreImpresoFactura.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPreImpresoFactura.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNumeroPreImpresoFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNumeroPreImpresoFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNumeroPreImpresoFactura.setLayout(gridaBagLayoutBusquedaPorNumeroPreImpresoFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelBusquedaPorNumeroPreImpresoFactura.add(jLabelnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelBusquedaPorNumeroPreImpresoFactura.add(jTextFieldnumero_pre_impresoBusquedaPorNumeroPreImpresoFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelBusquedaPorNumeroPreImpresoFactura.add(jButtonBusquedaPorNumeroPreImpresoFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("1.-Por Numero Pre Impreso ", jPanelBusquedaPorNumeroPreImpresoFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteFactura= new GridBagLayout();
		gridaBagLayoutFK_IdClienteFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteFactura.setLayout(gridaBagLayoutFK_IdClienteFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdClienteFactura.add(jLabelid_clienteFK_IdClienteFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdClienteFactura.add(jComboBoxid_clienteFK_IdClienteFactura, gridBagConstraintsFactura);


		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdClienteFactura.add(this.jButtonBuscarFK_IdClienteid_clienteFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdClienteFactura.add(jButtonFK_IdClienteFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("2.-Por Cliente ", jPanelFK_IdClienteFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoFisicoFacturaEmpresaFactura.setLayout(gridaBagLayoutFK_IdEstadoFisicoFacturaEmpresaFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdEstadoFisicoFacturaEmpresaFactura.add(jLabelid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdEstadoFisicoFacturaEmpresaFactura.add(jComboBoxid_estado_fisico_factura_empresaFK_IdEstadoFisicoFacturaEmpresaFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdEstadoFisicoFacturaEmpresaFactura.add(jButtonFK_IdEstadoFisicoFacturaEmpresaFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("3.-Por Estado Fisico ", jPanelFK_IdEstadoFisicoFacturaEmpresaFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdPedidoFactura= new GridBagLayout();
		gridaBagLayoutFK_IdPedidoFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPedidoFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPedidoFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPedidoFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPedidoFactura.setLayout(gridaBagLayoutFK_IdPedidoFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdPedidoFactura.add(jLabelid_pedidoFK_IdPedidoFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdPedidoFactura.add(jComboBoxid_pedidoFK_IdPedidoFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdPedidoFactura.add(jButtonFK_IdPedidoFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("4.-Por Idpedido ", jPanelFK_IdPedidoFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdResponsableFactura= new GridBagLayout();
		gridaBagLayoutFK_IdResponsableFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsableFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsableFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsableFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsableFactura.setLayout(gridaBagLayoutFK_IdResponsableFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdResponsableFactura.add(jLabelid_responsableFK_IdResponsableFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdResponsableFactura.add(jComboBoxid_responsableFK_IdResponsableFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdResponsableFactura.add(jButtonFK_IdResponsableFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("5.-Por Responsable ", jPanelFK_IdResponsableFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdSubClienteFactura= new GridBagLayout();
		gridaBagLayoutFK_IdSubClienteFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClienteFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClienteFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClienteFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClienteFactura.setLayout(gridaBagLayoutFK_IdSubClienteFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdSubClienteFactura.add(jLabelid_sub_clienteFK_IdSubClienteFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdSubClienteFactura.add(jComboBoxid_sub_clienteFK_IdSubClienteFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdSubClienteFactura.add(jButtonFK_IdSubClienteFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("6.-Por Contacto ", jPanelFK_IdSubClienteFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTransportistaFactura= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaFactura.setLayout(gridaBagLayoutFK_IdTransportistaFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdTransportistaFactura.add(jLabelid_transportistaFK_IdTransportistaFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdTransportistaFactura.add(jComboBoxid_transportistaFK_IdTransportistaFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdTransportistaFactura.add(jButtonFK_IdTransportistaFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("7.-Por Transportista ", jPanelFK_IdTransportistaFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdVendedorFactura= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorFactura.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorFactura.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorFactura.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorFactura.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorFactura.setLayout(gridaBagLayoutFK_IdVendedorFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdVendedorFactura.add(jLabelid_vendedorFK_IdVendedorFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 1;
		jPanelFK_IdVendedorFactura.add(jComboBoxid_vendedorFK_IdVendedorFactura, gridBagConstraintsFactura);


		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.EAST;
		gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
		gridBagConstraintsFactura.gridy = 0;
		gridBagConstraintsFactura.gridx = 0;
		jPanelFK_IdVendedorFactura.add(this.jButtonBuscarFK_IdVendedorid_vendedorFactura, gridBagConstraintsFactura);

		gridBagConstraintsFactura = new GridBagConstraints();
		gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
		gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsFactura.gridy = 1;
		gridBagConstraintsFactura.gridx =1;
		jPanelFK_IdVendedorFactura.add(jButtonFK_IdVendedorFactura, gridBagConstraintsFactura);

		jTabbedPaneBusquedasFactura.addTab("8.-Por Vendedor ", jPanelFK_IdVendedorFactura);
		jTabbedPaneBusquedasFactura.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFactura);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFactura = new GridBagConstraints();						
			this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFactura.gridx = 0;		
			//this.gridBagConstraintsFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFactura.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFactura, this.gridBagConstraintsFactura);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFactura.gridx = 0;		
		//this.gridBagConstraintsFactura.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFactura.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFactura);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFactura.gridx = 0;		
			this.gridBagConstraintsFactura.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsFactura.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasFactura, this.gridBagConstraintsFactura);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFactura, this.gridBagConstraintsFactura);								
		
		
		/*
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFactura, this.gridBagConstraintsFactura);
		*/		
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFactura.gridx =0;
		this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFactura, this.gridBagConstraintsFactura);
				
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFactura, this.gridBagConstraintsFactura);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FacturaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFactura= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFactura = new GridBagLayout();
			this.jPanelBusquedasParametrosFactura.setLayout(gridaBagLayoutBusquedasParametrosFactura);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFactura, this.gridBagConstraintsFactura);
			
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFactura, this.gridBagConstraintsFactura);
		
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFactura, this.gridBagConstraintsFactura);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFactura;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFactura() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFactura.setName("jPanelReporteDinamicoFactura"); 
		
		this.jPanelReporteDinamicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFactura.setLayout(gridaBagLayoutReporteDinamicoFactura);
		
		
		this.jInternalFrameReporteDinamicoFactura= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFactura.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFactura.setResizable(true);
	    this.jInternalFrameReporteDinamicoFactura.setClosable(true);
	    this.jInternalFrameReporteDinamicoFactura.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFactura = new JLabelMe();

		this.jLabelColumnasSelectReporteFactura.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactura.add(this.jLabelColumnasSelectReporteFactura, this.gridBagConstraintsFactura);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFactura = new JList<Reporte>();
		this.jListColumnasSelectReporteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFactura=new JScrollPane(this.jListColumnasSelectReporteFactura);
			
			this.jScrollColumnasSelectReporteFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFactura.add(this.jListColumnasSelectReporteFactura, this.gridBagConstraintsFactura);
		this.jPanelReporteDinamicoFactura.add(this.jScrollColumnasSelectReporteFactura, this.gridBagConstraintsFactura);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFactura = new JLabelMe();

		this.jLabelRelacionesSelectReporteFactura.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactura.add(this.jLabelRelacionesSelectReporteFactura, this.gridBagConstraintsFactura);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFactura = new JList<Reporte>();
		this.jListRelacionesSelectReporteFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFactura.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFactura.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFactura.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFactura=new JScrollPane(this.jListRelacionesSelectReporteFactura);
			
			this.jScrollRelacionesSelectReporteFactura.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFactura.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFactura.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFactura.add(this.jListRelacionesSelectReporteFactura, this.gridBagConstraintsFactura);
		this.jPanelReporteDinamicoFactura.add(this.jScrollRelacionesSelectReporteFactura, this.gridBagConstraintsFactura);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFactura = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFactura = new JComboBoxMe();
		this.jListColumnasValoresGraficoFactura = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFactura = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFactura.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFactura = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFactura.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFactura.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFactura.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFactura.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoFactura = new JLabelMe();

		this.jLabelConGraficoDinamicoFactura.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactura.add(this.jLabelConGraficoDinamicoFactura, this.gridBagConstraintsFactura);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoFactura = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoFactura.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoFactura.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoFactura.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFactura.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoFactura.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jCheckBoxConGraficoDinamicoFactura, this.gridBagConstraintsFactura);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoFactura = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoFactura.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFactura.add(this.jLabelColumnaCategoriaGraficoFactura, this.gridBagConstraintsFactura);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoFactura.add(this.jComboBoxColumnaCategoriaGraficoFactura, this.gridBagConstraintsFactura);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorFactura = new JLabelMe();

		this.jLabelColumnaCategoriaValorFactura.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jLabelColumnaCategoriaValorFactura, this.gridBagConstraintsFactura);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorFactura.setText("Accion");
        this.jComboBoxColumnaCategoriaValorFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoFactura.add(this.jComboBoxColumnaCategoriaValorFactura, this.gridBagConstraintsFactura);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoFactura = new JLabelMe();

		this.jLabelColumnasValoresGraficoFactura.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jLabelColumnasValoresGraficoFactura, this.gridBagConstraintsFactura);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoFactura = new JList<Reporte>();
		this.jListColumnasValoresGraficoFactura.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoFactura.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoFactura.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFactura.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoFactura.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoFactura=new JScrollPane(this.jListColumnasValoresGraficoFactura);
			
			this.jScrollColumnasValoresGraficoFactura.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFactura.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoFactura.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoFactura.add(this.jListColumnasSelectReporteFactura, this.gridBagConstraintsFactura);
		this.jPanelReporteDinamicoFactura.add(this.jScrollColumnasValoresGraficoFactura, this.gridBagConstraintsFactura);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoFactura = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoFactura.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jLabelTiposGraficosReportesDinamicoFactura, this.gridBagConstraintsFactura);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoFactura = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoFactura.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoFactura.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoFactura.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jComboBoxTiposGraficosReportesDinamicoFactura, this.gridBagConstraintsFactura);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFactura = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFactura.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jLabelGenerarExcelReporteDinamicoFactura, this.gridBagConstraintsFactura);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFactura = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFactura.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFactura,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFactura.setToolTipText("Generar EXCEL"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFactura.add(this.jButtonGenerarExcelReporteDinamicoFactura, this.gridBagConstraintsFactura);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactura.add(this.jComboBoxTiposReportesDinamicoFactura, this.gridBagConstraintsFactura);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFactura = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFactura.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFactura.add(this.jLabelTiposArchivoReporteDinamicoFactura, this.gridBagConstraintsFactura);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactura.add(this.jComboBoxTiposArchivosReportesDinamicoFactura, this.gridBagConstraintsFactura);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFactura = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFactura.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFactura,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFactura.setToolTipText("Generar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactura.add(this.jButtonGenerarReporteDinamicoFactura, this.gridBagConstraintsFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFactura = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFactura.setToolTipText("Cancelar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFactura.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFactura.add(this.jButtonCerrarReporteDinamicoFactura, this.gridBagConstraintsFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFactura = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFactura= new JScrollPane(jPanelReporteDinamicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFactura.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFactura.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFactura.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFactura.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFactura.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFactura);
		this.jInternalFrameReporteDinamicoFactura.getContentPane().add(this.jScrollPanelReporteDinamicoFactura, this.gridBagConstraintsFactura);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFactura() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFactura = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFactura.setName("jPanelImportacionFactura"); 
		
		this.jPanelImportacionFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFactura.setLayout(gridaBagLayoutImportacionFactura);
		
		
		this.jInternalFrameImportacionFactura= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFactura= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFactura = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFactura= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFactura.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFactura.setResizable(true);
	    this.jInternalFrameImportacionFactura.setClosable(true);
	    this.jInternalFrameImportacionFactura.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFactura.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFactura.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFactura.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFactura.setResizable(true);
	    this.jInternalFrameImportacionFactura.setClosable(true);
	    this.jInternalFrameImportacionFactura.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFactura.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFactura.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFactura.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFactura = new JLabelMe();

		this.jLabelArchivoImportacionFactura.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFactura.add(this.jLabelArchivoImportacionFactura, this.gridBagConstraintsFactura);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFactura = new JFileChooser();		
		this.jFileChooserImportacionFactura.setToolTipText("ESCOGER ARCHIVO"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFactura = new JButtonMe();
		this.jButtonAbrirImportacionFactura.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFactura,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFactura.setToolTipText("Generar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactura.add(this.jButtonAbrirImportacionFactura, this.gridBagConstraintsFactura);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFactura = new JLabelMe();

		this.jLabelPathArchivoImportacionFactura.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;		
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFactura.add(this.jLabelPathArchivoImportacionFactura, this.gridBagConstraintsFactura);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFactura=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFactura.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFactura.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFactura.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactura.add(this.jTextFieldPathArchivoImportacionFactura, this.gridBagConstraintsFactura);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFactura = new JButtonMe();
		this.jButtonGenerarImportacionFactura.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFactura,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFactura.setToolTipText("Generar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactura.add(this.jButtonGenerarImportacionFactura, this.gridBagConstraintsFactura);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFactura = new JButtonMe();
		this.jButtonCerrarImportacionFactura.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFactura,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFactura.setToolTipText("Cancelar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = iPosYImportacion;
		this.gridBagConstraintsFactura.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFactura.add(this.jButtonCerrarImportacionFactura, this.gridBagConstraintsFactura);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFactura = new GridBagLayout();
		
		this.jScrollPanelImportacionFactura= new JScrollPane(jPanelImportacionFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iPosYImportacion;
		this.gridBagConstraintsFactura.gridx =iPosXImportacion;
		this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFactura.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFactura);
		this.jInternalFrameImportacionFactura.getContentPane().add(this.jScrollPanelImportacionFactura, this.gridBagConstraintsFactura);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFactura(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFactura = new JButtonMe();
			this.jButtonAbrirOrderByFactura.setText("Orden");
			this.jButtonAbrirOrderByFactura.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFactura,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFactura";
			inputMap = this.jButtonAbrirOrderByFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFactura"));
		
		
			GridBagLayout gridaBagLayoutOrderByFactura = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFactura.setName("jPanelOrderByFactura"); 
			
			this.jPanelOrderByFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFactura.setLayout(gridaBagLayoutOrderByFactura);
			
			
			this.jTableDatosFacturaOrderBy = new JTableMe();        
			this.jTableDatosFacturaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFacturaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFacturaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFacturaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFacturaOrderBy.setViewportView(this.jTableDatosFacturaOrderBy);
			this.jTableDatosFacturaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFacturaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFactura= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFactura= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFactura = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFactura= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFactura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFactura.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFactura.setTitle("Orden");
			this.jInternalFrameOrderByFactura.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFactura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFactura.setResizable(true);
			this.jInternalFrameOrderByFactura.setClosable(true);
			this.jInternalFrameOrderByFactura.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFactura.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFactura.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFactura.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFactura.ipady =150;
				
			this.jPanelOrderByFactura.add(jScrollPanelDatosFacturaOrderBy, this.gridBagConstraintsFactura);//this.jTableDatosFacturaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFactura = new JButtonMe();
			this.jButtonCerrarOrderByFactura.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFactura,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFactura.setToolTipText("Cancelar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFactura.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFactura.add(this.jButtonCerrarOrderByFactura, this.gridBagConstraintsFactura);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFactura = new GridBagLayout();
			
			this.jScrollPanelOrderByFactura= new JScrollPane(jPanelOrderByFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy =iPosYOrderBy;
			this.gridBagConstraintsFactura.gridx =iPosXOrderBy;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFactura.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFactura.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFactura);
			
			this.jInternalFrameOrderByFactura.getContentPane().add(this.jScrollPanelOrderByFactura, this.gridBagConstraintsFactura);			
		
		} else {
			this.jButtonAbrirOrderByFactura = new JButtonMe();
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
		int iWidthTableCalculado=0;//11930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=4730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=7000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.facturaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFactura.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFactura.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFactura.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFactura.getRowHeight();//FacturaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFactura.isSelected()) {
					iHeightTable=FacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFactura.isSelected()) {
					iHeightTable=FacturaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FacturaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFactura.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFactura.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFactura.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFactura!=null && this.jInternalFrameOrderByFactura.getjTableDatosOrderBy()!=null) {
			//if(!this.facturaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFactura.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFactura.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFactura.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFactura.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFactura.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFactura.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFactura.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFactura.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFactura.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFactura.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=facturaLogic.getFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=facturas.size();
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
	public static List<Factura> TraerFacturaBeans(List<Factura> facturas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Factura factura:facturas) {
					
				if(!(FacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FacturaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					factura.setsDetalleGeneralEntityReporte(FacturaConstantesFunciones.getFacturaDescripcion(factura));
										
					factura.setes_cliente_descripcion(FacturaConstantesFunciones.getes_clienteDescripcion(factura));	
					
					

					if(factura.getDetaFormaPagos()!=null && Funciones.existeClass(classes,DetaFormaPago.class)) {
						try{factura.setdetaformapagosDescripcionReporte(new JRBeanCollectionDataSource(DetaFormaPagoJInternalFrame.TraerDetaFormaPagoBeans(factura.getDetaFormaPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(factura.getDetalleFacturas()!=null && Funciones.existeClass(classes,DetalleFactura.class)) {
						try{factura.setdetallefacturasDescripcionReporte(new JRBeanCollectionDataSource(DetalleFacturaJInternalFrame.TraerDetalleFacturaBeans(factura.getDetalleFacturas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//factura.setsDetalleGeneralEntityReporte(factura.getsDetalleGeneralEntityReporte());
										
				}
				
				//facturabeans.add(facturabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return facturas;
    }
	//PARA REPORTES FIN
}
