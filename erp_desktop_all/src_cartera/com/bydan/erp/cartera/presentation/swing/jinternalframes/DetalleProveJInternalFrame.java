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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

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
import com.bydan.erp.cartera.util.DetalleProveConstantesFunciones;

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
public class DetalleProveJInternalFrame extends DetalleProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleProve;
	
	protected JMenuBar jmenuBarDetalleProve;
	
	protected JMenu jmenuDetalleProve;
	protected JMenu jmenuDatosDetalleProve;
	protected JMenu jmenuArchivoDetalleProve;
	protected JMenu jmenuAccionesDetalleProve;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleProve;	
	protected GridBagConstraints gridBagConstraintsDetalleProve;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleProveDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleProve;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleProve;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleProve;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

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

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetalleProveSessionBean detalleproveSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleProve> detalleproves;		
	public List<DetalleProve> detalleprovesEliminados;	
	public List<DetalleProve> detalleprovesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleProve;		
	protected JButton jButtonAbrirOrderByDetalleProve;
	
	
	//protected JPanel jPanelOrderByDetalleProve;
	//public JScrollPane jScrollPanelOrderByDetalleProve;	
	//protected JButton jButtonCerrarOrderByDetalleProve;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleProveLogic detalleproveLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleProve;
	public JScrollPane jScrollPanelDatosEdicionDetalleProve;
	public JScrollPane jScrollPanelDatosGeneralDetalleProve;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleProveOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleProve;
	//public JScrollPane jScrollPanelImportacionDetalleProve;
	
	
	
	protected JPanel jPanelAccionesDetalleProve;
	
    protected JPanel jPanelPaginacionDetalleProve;
    protected JPanel jPanelParametrosReportesDetalleProve;
	protected JPanel jPanelParametrosReportesAccionesDetalleProve;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleProve;
	protected JPanel jPanelParametrosAuxiliar2DetalleProve;
	protected JPanel jPanelParametrosAuxiliar3DetalleProve;
	protected JPanel jPanelParametrosAuxiliar4DetalleProve;
	//protected JPanel jPanelParametrosAuxiliar5DetalleProve;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleProve;
	//protected JPanel jPanelImportacionDetalleProve;
	
	
	public JTable jTableDatosDetalleProve;
	
	
	
	//public JTable jTableDatosDetalleProveOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleProve;
	protected JButton jButtonDuplicarDetalleProve;
	protected JButton jButtonCopiarDetalleProve;
	protected JButton jButtonVerFormDetalleProve;
	protected JButton jButtonNuevoRelacionesDetalleProve;
	protected JButton jButtonModificarDetalleProve;
	
    protected JButton jButtonGuardarCambiosTablaDetalleProve;
	protected JButton jButtonCerrarDetalleProve;
	
	
	protected JButton jButtonRecargarInformacionDetalleProve;
	protected JButton jButtonProcesarInformacionDetalleProve;
	
	
	protected JButton jButtonAnterioresDetalleProve;
	protected JButton jButtonSiguientesDetalleProve;
	protected JButton jButtonNuevoGuardarCambiosDetalleProve;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleProve;
	//protected JButton jButtonCerrarReporteDinamicoDetalleProve;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleProve;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleProve;
	//protected JButton jButtonGenerarImportacionDetalleProve;
	//protected JButton jButtonCerrarImportacionDetalleProve;
	//protected JFileChooser jFileChooserImportacionDetalleProve;
	//protected File fileImportacionDetalleProve;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleProve;
	protected JButton jButtonDuplicarToolBarDetalleProve;
	protected JButton jButtonNuevoRelacionesToolBarDetalleProve;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleProve;
	protected JButton jButtonCopiarToolBarDetalleProve;
	protected JButton jButtonVerFormToolBarDetalleProve;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleProve;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleProve;
	protected JButton jButtonCerrarToolBarDetalleProve;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleProve;
	protected JButton jButtonProcesarInformacionToolBarDetalleProve;
	protected JButton jButtonAnterioresToolBarDetalleProve;
	protected JButton jButtonSiguientesToolBarDetalleProve;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleProve;
	protected JButton jButtonAbrirOrderByToolBarDetalleProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleProve;
	protected JMenuItem jMenuItemDuplicarDetalleProve;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleProve;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleProve;
	protected JMenuItem jMenuItemCopiarDetalleProve;
	protected JMenuItem jMenuItemVerFormDetalleProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleProve;
	protected JMenuItem jMenuItemCerrarDetalleProve;
	protected JMenuItem jMenuItemDetalleCerrarDetalleProve;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleProve;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleProve;
	protected JMenuItem jMenuItemProcesarInformacionDetalleProve;
	protected JMenuItem jMenuItemAnterioresDetalleProve;
	protected JMenuItem jMenuItemSiguientesDetalleProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleProve;
	protected JMenuItem jMenuItemAbrirOrderByDetalleProve;
	protected JMenuItem jMenuItemMostrarOcultarDetalleProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleProve;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleProve;
	protected JCheckBox jCheckBoxSeleccionadosDetalleProve;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleProve;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleProve;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleProve;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleProve;
	protected JTextField jTextFieldValorCampoGeneralDetalleProve;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleProve;
	//public JList<Reporte> jListColumnasSelectReporteDetalleProve;
	//public JScrollPane jScrollColumnasSelectReporteDetalleProve;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleProve;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleProve;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleProve;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleProve;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleProve;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleProve;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleProve;
	
		
	//public JLabel jLabelArchivoImportacionDetalleProve;	
	//public JLabel jLabelPathArchivoImportacionDetalleProve;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleProve;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleProve;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleProve;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleProve;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleProve;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleProve;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleProve;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleProve;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleProve;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleProve;
	public JPanel jPanelFK_IdAsientoContableDetalleProve;
	public JButton jButtonFK_IdAsientoContableDetalleProve;
	public JPanel jPanelFK_IdClienteDetalleProve;
	public JButton jButtonFK_IdClienteDetalleProve;
	public JPanel jPanelFK_IdDetalleProveDetalleProve;
	public JButton jButtonFK_IdDetalleProveDetalleProve;
	public JPanel jPanelFK_IdEstadoDetalleClienteDetalleProve;
	public JButton jButtonFK_IdEstadoDetalleClienteDetalleProve;
	public JPanel jPanelFK_IdFacturaDetalleProve;
	public JButton jButtonFK_IdFacturaDetalleProve;
	public JPanel jPanelFK_IdOrdenCompraDetalleProve;
	public JButton jButtonFK_IdOrdenCompraDetalleProve;
	public JPanel jPanelFK_IdTipoTransaccionModuloDetalleProve;
	public JButton jButtonFK_IdTipoTransaccionModuloDetalleProve;
	public JPanel jPanelFK_IdTransaccionDetalleProve;
	public JButton jButtonFK_IdTransaccionDetalleProve;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleProve;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleProve= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleProve;
	public JLabel jLabelid_clienteFK_IdClienteDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleProve;
	public JButton jButtonid_clienteFK_IdClienteDetalleProve= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleProve;
	
	public JPanel jPanelid_sucursal_movimientoFK_IdDetalleProveDetalleProve;
	public JLabel jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve;
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleProveDetalleProve= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleProveDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoFK_IdDetalleProveDetalleProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve;
	public JLabel jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve;
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaDetalleProve;
	public JLabel jLabelid_facturaFK_IdFacturaDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetalleProve;
	public JButton jButtonid_facturaFK_IdFacturaDetalleProve= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleProveBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetalleProve;
	
	public JPanel jPanelid_orden_compraFK_IdOrdenCompraDetalleProve;
	public JLabel jLabelid_orden_compraFK_IdOrdenCompraDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve;
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleProve= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleProveBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraFK_IdOrdenCompraDetalleProveArbol= new JButtonMe();

	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionDetalleProve;
	public JLabel jLabelid_transaccionFK_IdTransaccionDetalleProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionDetalleProve;
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleProve= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleProveUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleProveBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=1342;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleProveJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleProveJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleProve)	{
		this.jButtonRecargarInformacionDetalleProve = jButtonRecargarInformacionDetalleProve;
	}
	
	public JButton getjButtonProcesarInformacionDetalleProve() {
		return this.jButtonProcesarInformacionDetalleProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleProve)	{
		this.jButtonProcesarInformacionDetalleProve = jButtonProcesarInformacionDetalleProve;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleProve() {
		return this.jButtonRecargarInformacionDetalleProve;
	}
	
	
	public List<DetalleProve> getdetalleproves() {
		return this.detalleproves;
	}

	public void setdetalleproves(List<DetalleProve> detalleproves) {
		this.detalleproves = detalleproves;
	}
	
	public List<DetalleProve> getdetalleprovesAux() {
		return this.detalleprovesAux;
	}

	public void setdetalleprovesAux(List<DetalleProve> detalleprovesAux) {
		this.detalleprovesAux = detalleprovesAux;
	}
	
	public List<DetalleProve> getdetalleprovesEliminados() {
		return this.detalleprovesEliminados;
	}

	public void setDetalleProvesEliminados(List<DetalleProve> detalleprovesEliminados) {
		this.detalleprovesEliminados = detalleprovesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleProve() {
		return jComboBoxTiposSeleccionarDetalleProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleProve(
			JComboBox jComboBoxTiposSeleccionarDetalleProve) {
		this.jComboBoxTiposSeleccionarDetalleProve = jComboBoxTiposSeleccionarDetalleProve;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleProve .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleProve() {
		return jTextFieldValorCampoGeneralDetalleProve;
	}

	public void setjTextFieldValorCampoGeneralDetalleProve(
			JTextField jTextFieldValorCampoGeneralDetalleProve) {
		this.jTextFieldValorCampoGeneralDetalleProve = jTextFieldValorCampoGeneralDetalleProve;
	}

	public void setBorderResaltarValorCampoGeneralDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleProve .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleProve() {
		return this.jCheckBoxSeleccionarTodosDetalleProve;
	}

	public void setjCheckBoxSeleccionarTodosDetalleProve(
			JCheckBox jCheckBoxSeleccionarTodosDetalleProve) {
		this.jCheckBoxSeleccionarTodosDetalleProve = jCheckBoxSeleccionarTodosDetalleProve;
	}

	public void setBorderResaltarSeleccionarTodosDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleProve .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleProve() {
		return this.jCheckBoxSeleccionadosDetalleProve;
	}

	public void setjCheckBoxSeleccionadosDetalleProve(
			JCheckBox jCheckBoxSeleccionadosDetalleProve) {
		this.jCheckBoxSeleccionadosDetalleProve = jCheckBoxSeleccionadosDetalleProve;
	}
	
	public void setBorderResaltarSeleccionadosDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleProve .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleProve() {
		return this.jComboBoxTiposArchivosReportesDetalleProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleProve(
			JComboBox jComboBoxTiposArchivosReportesDetalleProve) {
		this.jComboBoxTiposArchivosReportesDetalleProve = jComboBoxTiposArchivosReportesDetalleProve;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleProve() {
		return this.jComboBoxTiposReportesDetalleProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleProve(
			JComboBox jComboBoxTiposReportesDetalleProve) {
		this.jComboBoxTiposReportesDetalleProve = jComboBoxTiposReportesDetalleProve;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleProve() {
	//	return jComboBoxTiposReportesDinamicoDetalleProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleProve(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleProve) {
	//	this.jComboBoxTiposReportesDinamicoDetalleProve = jComboBoxTiposReportesDinamicoDetalleProve;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleProve() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleProve;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleProve(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleProve) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleProve = jComboBoxTiposArchivosReportesDinamicoDetalleProve;
	//}
	
	public void setBorderResaltarTiposReportesDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleProve() {
		return this.jComboBoxTiposGraficosReportesDetalleProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleProve(
			JComboBox jComboBoxTiposGraficosReportesDetalleProve) {
		this.jComboBoxTiposGraficosReportesDetalleProve = jComboBoxTiposGraficosReportesDetalleProve;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleProve() {
		return this.jComboBoxTiposPaginacionDetalleProve;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleProve(
			JComboBox jComboBoxTiposPaginacionDetalleProve) {
		this.jComboBoxTiposPaginacionDetalleProve = jComboBoxTiposPaginacionDetalleProve;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleProve .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleProve() {
		return this.jComboBoxTiposRelacionesDetalleProve;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleProve() {
		return this.jComboBoxTiposAccionesDetalleProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleProve(
			JComboBox jComboBoxTiposRelacionesDetalleProve) {
		this.jComboBoxTiposRelacionesDetalleProve = jComboBoxTiposRelacionesDetalleProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleProve(
			JComboBox jComboBoxTiposAccionesDetalleProve) {
		this.jComboBoxTiposAccionesDetalleProve = jComboBoxTiposAccionesDetalleProve;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleProve .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleProve() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleProve.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleProve .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleProve() {
	//	return jCheckBoxConGraficoDinamicoDetalleProve;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleProve(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleProve) {
	//	this.jCheckBoxConGraficoDinamicoDetalleProve = jCheckBoxConGraficoDinamicoDetalleProve;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleProve() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleProve.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleProve .setBorder(borderResaltar);		
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
		this.detalleproveSessionBean=new DetalleProveSessionBean();
		
		this.detalleproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleproveSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Prove MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProve= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"nuevo","nuevo","Nuevo"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"duplicar","duplicar","Duplicar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"copiar","copiar","Copiar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"ver_form","ver_form","Ver"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"recargar","recargar","Recargar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleProve,this.jTtoolBarDetalleProve,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleProve,this.jTtoolBarDetalleProve,
							"cerrar","cerrar","Salir"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleProve=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleProve;
			
				this.jButtonProcesarInformacionToolBarDetalleProve=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleProve;
				
		//protected JButton jButtonModificarToolBarDetalleProve;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleProve=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleProve=new JMenuMe("General");
		this.jmenuArchivoDetalleProve=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleProve=new JMenuMe("Acciones");
		this.jmenuDatosDetalleProve=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleProve= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleProve.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleProve,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleProve= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleProve.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleProve,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleProve= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleProve.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleProve,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleProve= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleProve.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleProve,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleProve= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleProve.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleProve,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleProve= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleProve.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleProve,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleProve= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleProve.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleProve,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleProve= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleProve.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleProve,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleProve= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleProve.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleProve,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleProve= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleProve.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleProve,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleProve= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleProve.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleProve,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleProve.add(this.jMenuItemCerrarDetalleProve);
			
			this.jmenuAccionesDetalleProve.add(this.jMenuItemNuevoDetalleProve);
			this.jmenuAccionesDetalleProve.add(this.jMenuItemNuevoGuardarCambiosDetalleProve);
			this.jmenuAccionesDetalleProve.add(this.jMenuItemNuevoRelacionesDetalleProve);
			this.jmenuAccionesDetalleProve.add(this.jMenuItemGuardarCambiosTablaDetalleProve);		
			this.jmenuAccionesDetalleProve.add(this.jMenuItemDuplicarDetalleProve);		
			this.jmenuAccionesDetalleProve.add(this.jMenuItemCopiarDetalleProve);		
			this.jmenuAccionesDetalleProve.add(this.jMenuItemVerFormDetalleProve);		
			
			this.jmenuDatosDetalleProve.add(this.jMenuItemRecargarInformacionDetalleProve);				
			this.jmenuDatosDetalleProve.add(this.jMenuItemAnterioresDetalleProve);				
			this.jmenuDatosDetalleProve.add(this.jMenuItemSiguientesDetalleProve);				
			this.jmenuDatosDetalleProve.add(this.jMenuItemAbrirOrderByDetalleProve);				
			this.jmenuDatosDetalleProve.add(this.jMenuItemMostrarOcultarDetalleProve);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleProve.add(this.jMenuItemGuardarCambiosDetalleProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProve.add(this.jmenuArchivoDetalleProve);		
			this.jmenuBarDetalleProve.add(this.jmenuAccionesDetalleProve);		
			this.jmenuBarDetalleProve.add(this.jmenuDatosDetalleProve);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleProve);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleProve() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleProve.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetalleProve= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleProve.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleProve.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleProve,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve.setFocusable(false);

		this.jPanelFK_IdClienteDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleProve.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDetalleProve= new JButtonMe();
		this.jButtonFK_IdClienteDetalleProve.setText("Buscar");
		this.jButtonFK_IdClienteDetalleProve.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleProve,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleProve = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleProve.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDetalleProve.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleProve= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleProve.setFocusable(false);

		this.jPanelFK_IdDetalleProveDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleProveDetalleProve.setToolTipText("Buscar Por Sucursal Movimiento ");
		this.jButtonFK_IdDetalleProveDetalleProve= new JButtonMe();
		this.jButtonFK_IdDetalleProveDetalleProve.setText("Buscar");
		this.jButtonFK_IdDetalleProveDetalleProve.setToolTipText("Buscar Por Sucursal Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleProveDetalleProve,"buscar_button","Buscar Por Sucursal Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleProveDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve = new JLabelMe();
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setText("Sucursal Movimiento :");
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setToolTipText("Sucursal Movimiento");
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve= new JComboBoxMe();
		jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoDetalleClienteDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleClienteDetalleProve.setToolTipText("Buscar Por Estado Detalle Cliente ");
		this.jButtonFK_IdEstadoDetalleClienteDetalleProve= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleClienteDetalleProve.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleClienteDetalleProve.setToolTipText("Buscar Por Estado Detalle Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleClienteDetalleProve,"buscar_button","Buscar Por Estado Detalle Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleClienteDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve = new JLabelMe();
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setText("Estado Detalle Cliente :");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setToolTipText("Estado Detalle Cliente");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetalleProve.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetalleProve= new JButtonMe();
		this.jButtonFK_IdFacturaDetalleProve.setText("Buscar");
		this.jButtonFK_IdFacturaDetalleProve.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetalleProve,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetalleProve = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetalleProve.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetalleProve.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetalleProve= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve.setFocusable(false);

		this.jPanelFK_IdOrdenCompraDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenCompraDetalleProve.setToolTipText("Buscar Por Orden Compra ");
		this.jButtonFK_IdOrdenCompraDetalleProve= new JButtonMe();
		this.jButtonFK_IdOrdenCompraDetalleProve.setText("Buscar");
		this.jButtonFK_IdOrdenCompraDetalleProve.setToolTipText("Buscar Por Orden Compra ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenCompraDetalleProve,"buscar_button","Buscar Por Orden Compra ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenCompraDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve = new JLabelMe();
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve.setText("Orden Compra :");
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve.setToolTipText("Orden Compra");
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_orden_compraFK_IdOrdenCompraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraFK_IdOrdenCompraDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve= new JComboBoxMe();
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoTransaccionModuloDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloDetalleProve.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloDetalleProve= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloDetalleProve.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloDetalleProve.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloDetalleProve,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDetalleProve=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDetalleProve.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionDetalleProve= new JButtonMe();
		this.jButtonFK_IdTransaccionDetalleProve.setText("Buscar");
		this.jButtonFK_IdTransaccionDetalleProve.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDetalleProve,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionDetalleProve = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionDetalleProve.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionDetalleProve.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionDetalleProve= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleProve=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleProve.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleProve.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleProve.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleProve = new DetalleProveDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Prove DATOS");
			this.jInternalFrameDetalleFormDetalleProve = new DetalleProveDetalleFormJInternalFrame(jDesktopPane,this.detalleproveSessionBean.getConGuardarRelaciones(),this.detalleproveSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleProve = null;//new DetalleProveDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleProve= new GridBagLayout();
		
		
		this.jTableDatosDetalleProve = new JTableMe();      
		
		String sToolTipDetalleProve="";
		sToolTipDetalleProve=DetalleProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleProve+="(Cartera.DetalleProve)";
		}
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleProve+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleProve.setToolTipText(sToolTipDetalleProve);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleProve);
		this.jTableDatosDetalleProve.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleProve.setRowSelectionAllowed(true);
		this.jTableDatosDetalleProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleProve,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleProve = new JButtonMe();
		this.jButtonDuplicarDetalleProve = new JButtonMe();
		this.jButtonCopiarDetalleProve = new JButtonMe();
		this.jButtonVerFormDetalleProve = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleProve = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleProve = new JButtonMe();
		this.jButtonCerrarDetalleProve = new JButtonMe();
		
		this.jScrollPanelDatosDetalleProve = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleProve = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Prove";
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleProve.setToolTipText("Acciones");
        this.jPanelAccionesDetalleProve.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleProve=new ReporteDinamicoJInternalFrame(DetalleProveConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleProve();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleProve=new ImportacionJInternalFrame(DetalleProveConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleProve();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleProve = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleProve.setText("Orden");
		this.jButtonAbrirOrderByDetalleProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleProve,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleProve,false,this);
			
			//this.cargarOrderByDetalleProve(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleProve,true,this);
			
			//this.cargarOrderByDetalleProve(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleProve.setMinimumSize(new Dimension(400,50));//2330
		this.jTableDatosDetalleProve.setMaximumSize(new Dimension(400,50));//2330
		this.jTableDatosDetalleProve.setPreferredSize(new Dimension(400,50));//2330
		
		this.jScrollPanelDatosDetalleProve.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleProve.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleProve.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleProve.setText("Nuevo");
		this.jButtonDuplicarDetalleProve.setText("Duplicar");
		this.jButtonCopiarDetalleProve.setText("Copiar");
		this.jButtonVerFormDetalleProve.setText("Ver");
		this.jButtonNuevoRelacionesDetalleProve.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleProve.setText("Guardar");
		this.jButtonCerrarDetalleProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleProve,"nuevo_button","Nuevo",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleProve,"duplicar_button","Duplicar",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleProve,"copiar_button","Copiar",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleProve,"ver_form","Ver",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleProve,"nuevorelaciones_button","Nuevo Rel",this.detalleproveSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleProve,"guardarcambiostabla_button","Guardar",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleProve,"cerrar_button","Salir",this.detalleproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleProve.setToolTipText("Nuevo"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleProve.setToolTipText("Duplicar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleProve.setToolTipText("Copiar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleProve.setToolTipText("Ver"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleProve.setToolTipText("Nuevo Rel"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleProve.setToolTipText("Guardar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleProve.setToolTipText("Salir"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleProve";
		inputMap = this.jButtonNuevoDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleProve"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleProve";
		inputMap = this.jButtonDuplicarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleProve"));
		
		//COPIAR
		sMapKey = "CopiarDetalleProve";
		inputMap = this.jButtonCopiarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleProve"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleProve";
		inputMap = this.jButtonVerFormDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleProve"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleProve";
		inputMap = this.jButtonNuevoRelacionesDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleProve"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleProve";
		inputMap = this.jButtonModificarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleProve"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleProve";
		inputMap = this.jButtonCerrarDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleProve";
		inputMap = this.jButtonGuardarCambiosTablaDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleProve"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleProve.setName("jPanelParametrosReportesDetalleProve"); 
		
		this.jPanelParametrosReportesAccionesDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleProve.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleProve.setName("jPanelParametrosReportesAccionesDetalleProve"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleProve, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleProve = new JButtonMe();
		this.jButtonRecargarInformacionDetalleProve.setText("Recargar");
		this.jButtonRecargarInformacionDetalleProve.setToolTipText("Recargar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleProve,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleProve = new JButtonMe();
		this.jButtonProcesarInformacionDetalleProve.setText("Procesar");
		this.jButtonProcesarInformacionDetalleProve.setToolTipText("Procesar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleProve.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleProve.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleProve.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleProve.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProve.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleProve.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProve.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleProve.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleProve.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleProve.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleProve.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleProve.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleProve.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleProve.setText("Accion");
		this.jComboBoxTiposAccionesDetalleProve.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleProve = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleProve.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleProve.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleProve=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleProve.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleProve.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleProve.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleProve = new JLabelMe();
		
		this.jLabelAccionesDetalleProve.setText("Acciones");		
		this.jLabelAccionesDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleProve = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleProve.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleProve.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleProve = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleProve.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleProve.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleProve = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleProve.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleProve.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleProve.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleProve.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleProve = new JButtonMe();
		//this.jButtonAnterioresDetalleProve.setText("<<");
        this.jButtonAnterioresDetalleProve.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleProve,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleProve = new JButtonMe();
		//this.jButtonSiguientesDetalleProve.setText(">>");
        this.jButtonSiguientesDetalleProve.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleProve,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleProve = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleProve.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleProve.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleProve,"nuevoguardarcambios_button","Nue",this.detalleproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleProve";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleProve"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleProve";
		inputMap = this.jButtonRecargarInformacionDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleProve"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleProve";
		inputMap = this.jButtonSiguientesDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleProve"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleProve";
		inputMap = this.jButtonAnterioresDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleProve"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleProve();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleProve.setMinimumSize(new Dimension(this.getWidth(),DetalleProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleProve.setMaximumSize(new Dimension(this.getWidth(),DetalleProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProveBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleProve.setPreferredSize(new Dimension(this.getWidth(),DetalleProveBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleProveBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleProve = new GridBagLayout();

			this.jPanelPaginacionDetalleProve.setLayout(gridaBagLayoutPaginacionDetalleProve);						
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 0;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleProve.add(this.jButtonAnterioresDetalleProve, this.gridBagConstraintsDetalleProve);
					
						
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleProve.gridy = 0;
			
			this.jPanelPaginacionDetalleProve.add(this.jButtonNuevoGuardarCambiosDetalleProve, this.gridBagConstraintsDetalleProve);
						
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleProve.gridy = 0;
			this.jPanelPaginacionDetalleProve.add(this.jButtonSiguientesDetalleProve, this.gridBagConstraintsDetalleProve);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 1;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProve.add(this.jButtonNuevoDetalleProve, this.gridBagConstraintsDetalleProve);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleProve.gridy = 1;
				this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetalleProve.add(this.jButtonNuevoRelacionesDetalleProve, this.gridBagConstraintsDetalleProve);
			}
			
			
			if(!this.detalleproveSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleProve.gridy = 1;
				this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleProve.add(this.jButtonGuardarCambiosTablaDetalleProve, this.gridBagConstraintsDetalleProve);
			}
			
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 1;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProve.add(this.jButtonDuplicarDetalleProve, this.gridBagConstraintsDetalleProve);
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 1;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProve.add(this.jButtonCopiarDetalleProve, this.gridBagConstraintsDetalleProve);
		
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 1;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleProve.add(this.jButtonVerFormDetalleProve, this.gridBagConstraintsDetalleProve);
		
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 1;
			this.gridBagConstraintsDetalleProve.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleProve.add(this.jButtonCerrarDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		
		this.jButtonRecargarInformacionDetalleProve.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleProve.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleProve.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleProve.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleProve.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleProve.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleProve.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleProve.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleProve.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleProve.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleProve.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleProve.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleProve.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleProve.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleProve.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleProve.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleProve.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleProve.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleProve.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleProve = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleProve = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleProve = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleProve.setLayout(gridaBagParametrosReportesDetalleProve);
			this.jPanelParametrosReportesAccionesDetalleProve.setLayout(gridaBagParametrosReportesAccionesDetalleProve);
			
			
			this.jPanelParametrosAuxiliar1DetalleProve.setLayout(gridaBagParametrosAuxiliar1DetalleProve);
			this.jPanelParametrosAuxiliar2DetalleProve.setLayout(gridaBagParametrosAuxiliar2DetalleProve);
			this.jPanelParametrosAuxiliar3DetalleProve.setLayout(gridaBagParametrosAuxiliar3DetalleProve);
			this.jPanelParametrosAuxiliar4DetalleProve.setLayout(gridaBagParametrosAuxiliar4DetalleProve);
			//this.jPanelParametrosAuxiliar5DetalleProve.setLayout(gridaBagParametrosAuxiliar2DetalleProve);			
			
			
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProve.add(this.jButtonRecargarInformacionDetalleProve, this.gridBagConstraintsDetalleProve);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProve.add(this.jComboBoxTiposPaginacionDetalleProve, this.gridBagConstraintsDetalleProve);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProve.add(this.jCheckBoxConAltoMaximoTablaDetalleProve, this.gridBagConstraintsDetalleProve);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleProve.add(this.jComboBoxTiposArchivosReportesDetalleProve, this.gridBagConstraintsDetalleProve);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProve.add(this.jPanelParametrosAuxiliar1DetalleProve, this.gridBagConstraintsDetalleProve);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleProve.add(this.jComboBoxTiposReportesDetalleProve, this.gridBagConstraintsDetalleProve);																		
			
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleProve.add(this.jComboBoxTiposGraficosReportesDetalleProve, this.gridBagConstraintsDetalleProve);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProve.add(this.jPanelParametrosAuxiliar4DetalleProve, this.gridBagConstraintsDetalleProve);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProve.add(this.jComboBoxTiposReportesDetalleProve, this.gridBagConstraintsDetalleProve);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProve.add(this.jCheckBoxGenerarReporteDetalleProve, this.gridBagConstraintsDetalleProve);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProve.add(this.jPanelParametrosAuxiliar2DetalleProve, this.gridBagConstraintsDetalleProve);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProve.add(this.jLabelAccionesDetalleProve, this.gridBagConstraintsDetalleProve);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleProve.add(this.jButtonAbrirOrderByDetalleProve, this.gridBagConstraintsDetalleProve);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProve.add(this.jComboBoxTiposSeleccionarDetalleProve, this.gridBagConstraintsDetalleProve);			
			
			
			/*
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProve.add(this.jCheckBoxSeleccionarTodosDetalleProve, this.gridBagConstraintsDetalleProve);
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleProve.add(this.jCheckBoxConGraficoReporteDetalleProve, this.gridBagConstraintsDetalleProve);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProve.add(this.jCheckBoxSeleccionarTodosDetalleProve, this.gridBagConstraintsDetalleProve);															
				
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProve.add(this.jCheckBoxSeleccionadosDetalleProve, this.gridBagConstraintsDetalleProve);															
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleProve.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleProve.add(this.jCheckBoxConGraficoReporteDetalleProve, this.gridBagConstraintsDetalleProve);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleProve.add(this.jPanelParametrosAuxiliar3DetalleProve, this.gridBagConstraintsDetalleProve);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProve.add(this.jComboBoxTiposRelacionesDetalleProve, this.gridBagConstraintsDetalleProve);
				
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProve.add(this.jComboBoxTiposAccionesDetalleProve, this.gridBagConstraintsDetalleProve);
	
				
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleProve.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleProve.add(this.jTextFieldValorCampoGeneralDetalleProve, this.gridBagConstraintsDetalleProve);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleProve = new GridBagLayout();

			this.jScrollPanelDatosDetalleProve.setLayout(gridaBagLayoutDatosDetalleProve);
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = 0;
			this.gridBagConstraintsDetalleProve.gridx = 0;
			
			this.jScrollPanelDatosDetalleProve.add(this.jTableDatosDetalleProve, this.gridBagConstraintsDetalleProve);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleProve.setViewportView(this.jTableDatosDetalleProve);
		this.jTableDatosDetalleProve.setFillsViewportHeight(true);
		this.jTableDatosDetalleProve.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleProve= new GridBagLayout();
		this.jPanelAccionesDetalleProve.setLayout(gridaBagLayoutAccionesDetalleProve);
		
		
		/*	
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = 0;
		this.gridBagConstraintsDetalleProve.gridx = 0;
			
		this.jPanelAccionesDetalleProve.add(this.jButtonNuevoDetalleProve, this.gridBagConstraintsDetalleProve);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleProve.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdAsientoContableDetalleProve.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdAsientoContableDetalleProve.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleProve, gridBagConstraintsDetalleProve);


		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdAsientoContableDetalleProve.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdAsientoContableDetalleProve.add(jButtonFK_IdAsientoContableDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleProve.setLayout(gridaBagLayoutFK_IdClienteDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdClienteDetalleProve.add(jLabelid_clienteFK_IdClienteDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdClienteDetalleProve.add(jComboBoxid_clienteFK_IdClienteDetalleProve, gridBagConstraintsDetalleProve);


		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdClienteDetalleProve.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdClienteDetalleProve.add(jButtonFK_IdClienteDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("2.-Por Cliente ", jPanelFK_IdClienteDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDetalleProveDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleProveDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleProveDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleProveDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleProveDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleProveDetalleProve.setLayout(gridaBagLayoutFK_IdDetalleProveDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdDetalleProveDetalleProve.add(jLabelid_sucursal_movimientoFK_IdDetalleProveDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdDetalleProveDetalleProve.add(jComboBoxid_sucursal_movimientoFK_IdDetalleProveDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdDetalleProveDetalleProve.add(jButtonFK_IdDetalleProveDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("3.-Por Sucursal Movimiento ", jPanelFK_IdDetalleProveDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleClienteDetalleProve.setLayout(gridaBagLayoutFK_IdEstadoDetalleClienteDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdEstadoDetalleClienteDetalleProve.add(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdEstadoDetalleClienteDetalleProve.add(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdEstadoDetalleClienteDetalleProve.add(jButtonFK_IdEstadoDetalleClienteDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("4.-Por Estado Detalle Cliente ", jPanelFK_IdEstadoDetalleClienteDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetalleProve.setLayout(gridaBagLayoutFK_IdFacturaDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdFacturaDetalleProve.add(jLabelid_facturaFK_IdFacturaDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdFacturaDetalleProve.add(jComboBoxid_facturaFK_IdFacturaDetalleProve, gridBagConstraintsDetalleProve);


		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdFacturaDetalleProve.add(this.jButtonBuscarFK_IdFacturaid_facturaDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdFacturaDetalleProve.add(jButtonFK_IdFacturaDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("5.-Por Factura ", jPanelFK_IdFacturaDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdOrdenCompraDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenCompraDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenCompraDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenCompraDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenCompraDetalleProve.setLayout(gridaBagLayoutFK_IdOrdenCompraDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdOrdenCompraDetalleProve.add(jLabelid_orden_compraFK_IdOrdenCompraDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdOrdenCompraDetalleProve.add(jComboBoxid_orden_compraFK_IdOrdenCompraDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdOrdenCompraDetalleProve.add(jButtonFK_IdOrdenCompraDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("6.-Por Orden Compra ", jPanelFK_IdOrdenCompraDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloDetalleProve.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloDetalleProve.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloDetalleProve.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdTipoTransaccionModuloDetalleProve.add(jButtonFK_IdTipoTransaccionModuloDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("7.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTransaccionDetalleProve= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionDetalleProve.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleProve.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleProve.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionDetalleProve.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionDetalleProve.setLayout(gridaBagLayoutFK_IdTransaccionDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 0;
		jPanelFK_IdTransaccionDetalleProve.add(jLabelid_transaccionFK_IdTransaccionDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 0;
		gridBagConstraintsDetalleProve.gridx = 1;
		jPanelFK_IdTransaccionDetalleProve.add(jComboBoxid_transaccionFK_IdTransaccionDetalleProve, gridBagConstraintsDetalleProve);

		gridBagConstraintsDetalleProve = new GridBagConstraints();
		gridBagConstraintsDetalleProve.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleProve.gridy = 1;
		gridBagConstraintsDetalleProve.gridx =1;
		jPanelFK_IdTransaccionDetalleProve.add(jButtonFK_IdTransaccionDetalleProve, gridBagConstraintsDetalleProve);

		jTabbedPaneBusquedasDetalleProve.addTab("8.-Por Transaccion ", jPanelFK_IdTransaccionDetalleProve);
		jTabbedPaneBusquedasDetalleProve.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleProve);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();						
			this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProve.gridx = 0;		
			//this.gridBagConstraintsDetalleProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleProve.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleProve, this.gridBagConstraintsDetalleProve);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleProve.gridx = 0;		
		//this.gridBagConstraintsDetalleProve.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleProve.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleProve);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleProve.gridx = 0;		
			this.gridBagConstraintsDetalleProve.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleProve.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleProve, this.gridBagConstraintsDetalleProve);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleProve, this.gridBagConstraintsDetalleProve);								
		
		
		/*
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleProve, this.gridBagConstraintsDetalleProve);
		*/		
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleProve.gridx =0;
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleProve, this.gridBagConstraintsDetalleProve);
				
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleProve, this.gridBagConstraintsDetalleProve);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetalleProveJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleProve= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleProve = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleProve.setLayout(gridaBagLayoutBusquedasParametrosDetalleProve);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleProve, this.gridBagConstraintsDetalleProve);
			
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleProve, this.gridBagConstraintsDetalleProve);
		
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleProve, this.gridBagConstraintsDetalleProve);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleProve;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleProve() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleProve = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleProve.setName("jPanelReporteDinamicoDetalleProve"); 
		
		this.jPanelReporteDinamicoDetalleProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleProve.setLayout(gridaBagLayoutReporteDinamicoDetalleProve);
		
		
		this.jInternalFrameReporteDinamicoDetalleProve= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleProve.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleProve.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleProve.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleProve.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleProve.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleProve.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleProve.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleProve.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleProve = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleProve.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelColumnasSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleProve = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleProve=new JScrollPane(this.jListColumnasSelectReporteDetalleProve);
			
			this.jScrollColumnasSelectReporteDetalleProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleProve.add(this.jListColumnasSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		this.jPanelReporteDinamicoDetalleProve.add(this.jScrollColumnasSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleProve = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleProve.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelRelacionesSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleProve = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleProve.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleProve.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleProve.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleProve=new JScrollPane(this.jListRelacionesSelectReporteDetalleProve);
			
			this.jScrollRelacionesSelectReporteDetalleProve.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleProve.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleProve.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleProve.add(this.jListRelacionesSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		this.jPanelReporteDinamicoDetalleProve.add(this.jScrollRelacionesSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetalleProve = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleProve = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleProve = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleProve = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleProve.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProve = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProve.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProve.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProve.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleProve.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleProve = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleProve.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelConGraficoDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleProve = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleProve.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleProve.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleProve.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleProve.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleProve.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jCheckBoxConGraficoDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleProve = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleProve.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelColumnaCategoriaGraficoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleProve.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleProve.add(this.jComboBoxColumnaCategoriaGraficoDetalleProve, this.gridBagConstraintsDetalleProve);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleProve = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleProve.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelColumnaCategoriaValorDetalleProve, this.gridBagConstraintsDetalleProve);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleProve.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleProve.add(this.jComboBoxColumnaCategoriaValorDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleProve = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleProve.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelColumnasValoresGraficoDetalleProve, this.gridBagConstraintsDetalleProve);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleProve = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleProve.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleProve.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleProve.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleProve.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleProve.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleProve=new JScrollPane(this.jListColumnasValoresGraficoDetalleProve);
			
			this.jScrollColumnasValoresGraficoDetalleProve.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleProve.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleProve.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleProve.add(this.jListColumnasSelectReporteDetalleProve, this.gridBagConstraintsDetalleProve);
		this.jPanelReporteDinamicoDetalleProve.add(this.jScrollColumnasValoresGraficoDetalleProve, this.gridBagConstraintsDetalleProve);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleProve = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleProve.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelTiposGraficosReportesDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleProve = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleProve.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProve.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleProve.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleProve = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleProve.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelGenerarExcelReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleProve = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleProve.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleProve,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleProve.setToolTipText("Generar EXCEL"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleProve.add(this.jButtonGenerarExcelReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProve.add(this.jComboBoxTiposReportesDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleProve = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleProve.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleProve.add(this.jLabelTiposArchivoReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProve.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleProve = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleProve.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleProve,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleProve.setToolTipText("Generar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProve.add(this.jButtonGenerarReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleProve = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleProve.setToolTipText("Cancelar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProve.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleProve.add(this.jButtonCerrarReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleProve = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleProve= new JScrollPane(jPanelReporteDinamicoDetalleProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleProve.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleProve.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleProve.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleProve.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleProve.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleProve);
		this.jInternalFrameReporteDinamicoDetalleProve.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleProve, this.gridBagConstraintsDetalleProve);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleProve() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleProve = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleProve.setName("jPanelImportacionDetalleProve"); 
		
		this.jPanelImportacionDetalleProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleProve.setLayout(gridaBagLayoutImportacionDetalleProve);
		
		
		this.jInternalFrameImportacionDetalleProve= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleProve= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleProve = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleProve= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleProve.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleProve.setResizable(true);
	    this.jInternalFrameImportacionDetalleProve.setClosable(true);
	    this.jInternalFrameImportacionDetalleProve.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleProve.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleProve.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleProve.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleProve.setResizable(true);
	    this.jInternalFrameImportacionDetalleProve.setClosable(true);
	    this.jInternalFrameImportacionDetalleProve.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleProve.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleProve.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleProve.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleProve = new JLabelMe();

		this.jLabelArchivoImportacionDetalleProve.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleProve.add(this.jLabelArchivoImportacionDetalleProve, this.gridBagConstraintsDetalleProve);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleProve = new JFileChooser();		
		this.jFileChooserImportacionDetalleProve.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleProve = new JButtonMe();
		this.jButtonAbrirImportacionDetalleProve.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleProve,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleProve.setToolTipText("Generar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProve.add(this.jButtonAbrirImportacionDetalleProve, this.gridBagConstraintsDetalleProve);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleProve = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleProve.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleProve.add(this.jLabelPathArchivoImportacionDetalleProve, this.gridBagConstraintsDetalleProve);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleProve=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleProve.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleProve.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleProve.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProve.add(this.jTextFieldPathArchivoImportacionDetalleProve, this.gridBagConstraintsDetalleProve);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleProve = new JButtonMe();
		this.jButtonGenerarImportacionDetalleProve.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleProve,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleProve.setToolTipText("Generar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProve.add(this.jButtonGenerarImportacionDetalleProve, this.gridBagConstraintsDetalleProve);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleProve = new JButtonMe();
		this.jButtonCerrarImportacionDetalleProve.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleProve,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleProve.setToolTipText("Cancelar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleProve.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleProve.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleProve.add(this.jButtonCerrarImportacionDetalleProve, this.gridBagConstraintsDetalleProve);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleProve = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleProve= new JScrollPane(jPanelImportacionDetalleProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleProve.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleProve.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleProve.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleProve);
		this.jInternalFrameImportacionDetalleProve.getContentPane().add(this.jScrollPanelImportacionDetalleProve, this.gridBagConstraintsDetalleProve);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleProve(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleProve = new JButtonMe();
			this.jButtonAbrirOrderByDetalleProve.setText("Orden");
			this.jButtonAbrirOrderByDetalleProve.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleProve,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleProve";
			inputMap = this.jButtonAbrirOrderByDetalleProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleProve"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleProve = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleProve.setName("jPanelOrderByDetalleProve"); 
			
			this.jPanelOrderByDetalleProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleProve.setLayout(gridaBagLayoutOrderByDetalleProve);
			
			
			this.jTableDatosDetalleProveOrderBy = new JTableMe();        
			this.jTableDatosDetalleProveOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleProveOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleProveOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleProveOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleProveOrderBy.setViewportView(this.jTableDatosDetalleProveOrderBy);
			this.jTableDatosDetalleProveOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleProveOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleProve= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleProve= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleProve = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleProve= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleProve.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleProve.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleProve.setTitle("Orden");
			this.jInternalFrameOrderByDetalleProve.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleProve.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleProve.setResizable(true);
			this.jInternalFrameOrderByDetalleProve.setClosable(true);
			this.jInternalFrameOrderByDetalleProve.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleProve.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleProve.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleProve.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Proves"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleProve.ipady =150;
				
			this.jPanelOrderByDetalleProve.add(jScrollPanelDatosDetalleProveOrderBy, this.gridBagConstraintsDetalleProve);//this.jTableDatosDetalleProveTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleProve = new JButtonMe();
			this.jButtonCerrarOrderByDetalleProve.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleProve,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleProve.setToolTipText("Cancelar"+" "+DetalleProveConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleProve.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleProve.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleProve.add(this.jButtonCerrarOrderByDetalleProve, this.gridBagConstraintsDetalleProve);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleProve = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleProve= new JScrollPane(jPanelOrderByDetalleProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleProve.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleProve.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleProve.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleProve.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleProve.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleProve);
			
			this.jInternalFrameOrderByDetalleProve.getContentPane().add(this.jScrollPanelOrderByDetalleProve, this.gridBagConstraintsDetalleProve);			
		
		} else {
			this.jButtonAbrirOrderByDetalleProve = new JButtonMe();
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
		int iWidthTableCalculado=0;//5530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=2330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=3000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleproveSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleProve.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleProve.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleProve.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleProve.getRowHeight();//DetalleProveConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleProve.isSelected()) {
					iHeightTable=DetalleProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleProve.isSelected()) {
					iHeightTable=DetalleProveConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleProveConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleProve.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleProve.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleProve.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleProve!=null && this.jInternalFrameOrderByDetalleProve.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleproveSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleProve.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleProve.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleProve.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleProve.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleProve.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleProve.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleProve.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleProve.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleProve.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleProve.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleproveLogic.getDetalleProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleproves.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleProve> TraerDetalleProveBeans(List<DetalleProve> detalleproves,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleProve detalleprove:detalleproves) {
					
				if(!(DetalleProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleProveConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detalleprove.setsDetalleGeneralEntityReporte(DetalleProveConstantesFunciones.getDetalleProveDescripcion(detalleprove));
										
						
					
					

					if(detalleprove.getPagoAutos()!=null && Funciones.existeClass(classes,PagoAuto.class)) {
						try{detalleprove.setpagoautosDescripcionReporte(new JRBeanCollectionDataSource(PagoAutoJInternalFrame.TraerPagoAutoBeans(detalleprove.getPagoAutos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(detalleprove.getAutoriPagos()!=null && Funciones.existeClass(classes,AutoriPago.class)) {
						try{detalleprove.setautoripagosDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoJInternalFrame.TraerAutoriPagoBeans(detalleprove.getAutoriPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detalleprove.setsDetalleGeneralEntityReporte(detalleprove.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleprovebeans.add(detalleprovebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleproves;
    }
	//PARA REPORTES FIN
}
