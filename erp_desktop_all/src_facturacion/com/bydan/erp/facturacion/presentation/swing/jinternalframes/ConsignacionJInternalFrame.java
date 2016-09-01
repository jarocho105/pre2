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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;

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
import com.bydan.erp.facturacion.util.ConsignacionConstantesFunciones;

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
public class ConsignacionJInternalFrame extends ConsignacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConsignacion;
	
	protected JMenuBar jmenuBarConsignacion;
	
	protected JMenu jmenuConsignacion;
	protected JMenu jmenuDatosConsignacion;
	protected JMenu jmenuArchivoConsignacion;
	protected JMenu jmenuAccionesConsignacion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsignacion;	
	protected GridBagConstraints gridBagConstraintsConsignacion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConsignacionDetalleFormJInternalFrame jInternalFrameDetalleFormConsignacion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConsignacion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConsignacion;	
	
	
	
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

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedido="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";
	
	public ConsignacionSessionBean consignacionSessionBean;
		
	
	
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
	public ConsignatarioSessionBean consignatarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public EstadoPedidoSessionBean estadopedidoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TransporteSessionBean transporteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Consignacion> consignacions;		
	public List<Consignacion> consignacionsEliminados;	
	public List<Consignacion> consignacionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConsignacion;		
	protected JButton jButtonAbrirOrderByConsignacion;
	
	
	//protected JPanel jPanelOrderByConsignacion;
	//public JScrollPane jScrollPanelOrderByConsignacion;	
	//protected JButton jButtonCerrarOrderByConsignacion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConsignacionLogic consignacionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConsignacion;
	public JScrollPane jScrollPanelDatosEdicionConsignacion;
	public JScrollPane jScrollPanelDatosGeneralConsignacion;
    
	
	
	//public JScrollPane jScrollPanelDatosConsignacionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConsignacion;
	//public JScrollPane jScrollPanelImportacionConsignacion;
	
	
	
	protected JPanel jPanelAccionesConsignacion;
	
    protected JPanel jPanelPaginacionConsignacion;
    protected JPanel jPanelParametrosReportesConsignacion;
	protected JPanel jPanelParametrosReportesAccionesConsignacion;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalConsignacion;
	protected Integer iXPanelCamposFintotalConsignacion=0;
	protected Integer iYPanelCamposFintotalConsignacion=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Consignacion;
	protected JPanel jPanelParametrosAuxiliar2Consignacion;
	protected JPanel jPanelParametrosAuxiliar3Consignacion;
	protected JPanel jPanelParametrosAuxiliar4Consignacion;
	//protected JPanel jPanelParametrosAuxiliar5Consignacion;
	
	
	
	//protected JPanel jPanelReporteDinamicoConsignacion;
	//protected JPanel jPanelImportacionConsignacion;
	
	
	public JTable jTableDatosConsignacion;
	
	
	
	//public JTable jTableDatosConsignacionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConsignacion;
	protected JButton jButtonDuplicarConsignacion;
	protected JButton jButtonCopiarConsignacion;
	protected JButton jButtonVerFormConsignacion;
	protected JButton jButtonNuevoRelacionesConsignacion;
	protected JButton jButtonModificarConsignacion;
	
    protected JButton jButtonGuardarCambiosTablaConsignacion;
	protected JButton jButtonCerrarConsignacion;
	
	
	protected JButton jButtonRecargarInformacionConsignacion;
	protected JButton jButtonProcesarInformacionConsignacion;
	
	
	protected JButton jButtonAnterioresConsignacion;
	protected JButton jButtonSiguientesConsignacion;
	protected JButton jButtonNuevoGuardarCambiosConsignacion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConsignacion;
	//protected JButton jButtonCerrarReporteDinamicoConsignacion;
	//protected JButton jButtonGenerarExcelReporteDinamicoConsignacion;	
	
	
	
	//protected JButton jButtonAbrirImportacionConsignacion;
	//protected JButton jButtonGenerarImportacionConsignacion;
	//protected JButton jButtonCerrarImportacionConsignacion;
	//protected JFileChooser jFileChooserImportacionConsignacion;
	//protected File fileImportacionConsignacion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsignacion;
	protected JButton jButtonDuplicarToolBarConsignacion;
	protected JButton jButtonNuevoRelacionesToolBarConsignacion;
	
	
	public JButton jButtonGuardarCambiosToolBarConsignacion;
	protected JButton jButtonCopiarToolBarConsignacion;
	protected JButton jButtonVerFormToolBarConsignacion;
	public JButton jButtonGuardarCambiosTablaToolBarConsignacion;
	protected JButton jButtonMostrarOcultarTablaToolBarConsignacion;
	protected JButton jButtonCerrarToolBarConsignacion;
	
	protected JButton jButtonRecargarInformacionToolBarConsignacion;
	protected JButton jButtonProcesarInformacionToolBarConsignacion;
	protected JButton jButtonAnterioresToolBarConsignacion;
	protected JButton jButtonSiguientesToolBarConsignacion;
	protected JButton jButtonNuevoGuardarCambiosToolBarConsignacion;
	protected JButton jButtonAbrirOrderByToolBarConsignacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsignacion;
	protected JMenuItem jMenuItemDuplicarConsignacion;
	protected JMenuItem jMenuItemNuevoRelacionesConsignacion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConsignacion;
	protected JMenuItem jMenuItemCopiarConsignacion;
	protected JMenuItem jMenuItemVerFormConsignacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsignacion;
	protected JMenuItem jMenuItemCerrarConsignacion;
	protected JMenuItem jMenuItemDetalleCerrarConsignacion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConsignacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsignacion;
	
	protected JMenuItem jMenuItemRecargarInformacionConsignacion;
	protected JMenuItem jMenuItemProcesarInformacionConsignacion;
	protected JMenuItem jMenuItemAnterioresConsignacion;
	protected JMenuItem jMenuItemSiguientesConsignacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsignacion;
	protected JMenuItem jMenuItemAbrirOrderByConsignacion;
	protected JMenuItem jMenuItemMostrarOcultarConsignacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsignacion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConsignacion;
	protected JCheckBox jCheckBoxSeleccionadosConsignacion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConsignacion;
	protected JCheckBox jCheckBoxConGraficoReporteConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConsignacion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConsignacion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsignacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConsignacion;
	protected JTextField jTextFieldValorCampoGeneralConsignacion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConsignacion;
	//public JList<Reporte> jListColumnasSelectReporteConsignacion;
	//public JScrollPane jScrollColumnasSelectReporteConsignacion;
	
	//public JLabel jLabelRelacionesSelectReporteConsignacion;
	//public JList<Reporte> jListRelacionesSelectReporteConsignacion;
	//public JScrollPane jScrollRelacionesSelectReporteConsignacion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConsignacion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConsignacion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConsignacion;
	//public JLabel jLabelTiposArchivoReporteDinamicoConsignacion;
	
		
	//public JLabel jLabelArchivoImportacionConsignacion;	
	//public JLabel jLabelPathArchivoImportacionConsignacion;
	//protected JTextField jTextFieldPathArchivoImportacionConsignacion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConsignacion;
	
	//public JLabel jLabelColumnaCategoriaValorConsignacion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConsignacion;
	
	//public JLabel jLabelColumnasValoresGraficoConsignacion;
	//public JList<Reporte> jListColumnasValoresGraficoConsignacion;
	//public JScrollPane jScrollColumnasValoresGraficoConsignacion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConsignacion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConsignacion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConsignacion;
	public JPanel jPanelFK_IdCentroCostoConsignacion;
	public JButton jButtonFK_IdCentroCostoConsignacion;
	public JPanel jPanelFK_IdClienteConsignacion;
	public JButton jButtonFK_IdClienteConsignacion;
	public JPanel jPanelFK_IdConsignatarioConsignacion;
	public JButton jButtonFK_IdConsignatarioConsignacion;
	public JPanel jPanelFK_IdEmpleadoConsignacion;
	public JButton jButtonFK_IdEmpleadoConsignacion;
	public JPanel jPanelFK_IdEstadoPedidoConsignacion;
	public JButton jButtonFK_IdEstadoPedidoConsignacion;
	public JPanel jPanelFK_IdFormatoConsignacion;
	public JButton jButtonFK_IdFormatoConsignacion;
	public JPanel jPanelFK_IdResponsableConsignacion;
	public JButton jButtonFK_IdResponsableConsignacion;
	public JPanel jPanelFK_IdSubClienteConsignacion;
	public JButton jButtonFK_IdSubClienteConsignacion;
	public JPanel jPanelFK_IdTipoCambioConsignacion;
	public JButton jButtonFK_IdTipoCambioConsignacion;
	public JPanel jPanelFK_IdTipoPrecioConsignacion;
	public JButton jButtonFK_IdTipoPrecioConsignacion;
	public JPanel jPanelFK_IdTransporteConsignacion;
	public JButton jButtonFK_IdTransporteConsignacion;
	public JPanel jPanelFK_IdTransportistaConsignacion;
	public JButton jButtonFK_IdTransportistaConsignacion;
	public JPanel jPanelFK_IdVendedorConsignacion;
	public JButton jButtonFK_IdVendedorConsignacion;
	public JPanel jPanelFK_IdZonaConsignacion;
	public JButton jButtonFK_IdZonaConsignacion;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoConsignacion;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoConsignacion;
	public JButton jButtonid_centro_costoFK_IdCentroCostoConsignacion= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoConsignacionBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoConsignacionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion;
	
	public JPanel jPanelid_clienteFK_IdClienteConsignacion;
	public JLabel jLabelid_clienteFK_IdClienteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteConsignacion;
	public JButton jButtonid_clienteFK_IdClienteConsignacion= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteConsignacionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteConsignacion;
	
	public JPanel jPanelid_consignatarioFK_IdConsignatarioConsignacion;
	public JLabel jLabelid_consignatarioFK_IdConsignatarioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioFK_IdConsignatarioConsignacion;
	public JButton jButtonid_consignatarioFK_IdConsignatarioConsignacion= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoConsignacion;
	public JLabel jLabelid_empleadoFK_IdEmpleadoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoConsignacion;
	public JButton jButtonid_empleadoFK_IdEmpleadoConsignacion= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoConsignacionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion;
	
	public JPanel jPanelid_estado_pedidoFK_IdEstadoPedidoConsignacion;
	public JLabel jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion;
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoConsignacion= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoConsignacion;
	public JLabel jLabelid_formatoFK_IdFormatoConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoConsignacion;
	public JButton jButtonid_formatoFK_IdFormatoConsignacion= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_responsableFK_IdResponsableConsignacion;
	public JLabel jLabelid_responsableFK_IdResponsableConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFK_IdResponsableConsignacion;
	public JButton jButtonid_responsableFK_IdResponsableConsignacion= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsableConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClienteConsignacion;
	public JLabel jLabelid_sub_clienteFK_IdSubClienteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClienteConsignacion;
	public JButton jButtonid_sub_clienteFK_IdSubClienteConsignacion= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClienteConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioConsignacion;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioConsignacion= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioConsignacionBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion;
	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioConsignacion;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioConsignacion= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransporteConsignacion;
	public JLabel jLabelid_transporteFK_IdTransporteConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransporteConsignacion;
	public JButton jButtonid_transporteFK_IdTransporteConsignacion= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransporteConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaConsignacion;
	public JLabel jLabelid_transportistaFK_IdTransportistaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaConsignacion;
	public JButton jButtonid_transportistaFK_IdTransportistaConsignacion= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaConsignacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorConsignacion;
	public JLabel jLabelid_vendedorFK_IdVendedorConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorConsignacion;
	public JButton jButtonid_vendedorFK_IdVendedorConsignacion= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorConsignacionBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorConsignacionArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorConsignacion;
	
	public JPanel jPanelid_zonaFK_IdZonaConsignacion;
	public JLabel jLabelid_zonaFK_IdZonaConsignacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaFK_IdZonaConsignacion;
	public JButton jButtonid_zonaFK_IdZonaConsignacion= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaConsignacionUpdate= new JButtonMe();
	public JButton jButtonid_zonaFK_IdZonaConsignacionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ConsignacionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignacionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConsignacion)	{
		this.jButtonRecargarInformacionConsignacion = jButtonRecargarInformacionConsignacion;
	}
	
	public JButton getjButtonProcesarInformacionConsignacion() {
		return this.jButtonProcesarInformacionConsignacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsignacion)	{
		this.jButtonProcesarInformacionConsignacion = jButtonProcesarInformacionConsignacion;
	}
	
	
	public JButton getjButtonRecargarInformacionConsignacion() {
		return this.jButtonRecargarInformacionConsignacion;
	}
	
	
	public List<Consignacion> getconsignacions() {
		return this.consignacions;
	}

	public void setconsignacions(List<Consignacion> consignacions) {
		this.consignacions = consignacions;
	}
	
	public List<Consignacion> getconsignacionsAux() {
		return this.consignacionsAux;
	}

	public void setconsignacionsAux(List<Consignacion> consignacionsAux) {
		this.consignacionsAux = consignacionsAux;
	}
	
	public List<Consignacion> getconsignacionsEliminados() {
		return this.consignacionsEliminados;
	}

	public void setConsignacionsEliminados(List<Consignacion> consignacionsEliminados) {
		this.consignacionsEliminados = consignacionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConsignacion() {
		return jComboBoxTiposSeleccionarConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConsignacion(
			JComboBox jComboBoxTiposSeleccionarConsignacion) {
		this.jComboBoxTiposSeleccionarConsignacion = jComboBoxTiposSeleccionarConsignacion;
	}
	
	public void setBorderResaltarTiposSeleccionarConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConsignacion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConsignacion() {
		return jTextFieldValorCampoGeneralConsignacion;
	}

	public void setjTextFieldValorCampoGeneralConsignacion(
			JTextField jTextFieldValorCampoGeneralConsignacion) {
		this.jTextFieldValorCampoGeneralConsignacion = jTextFieldValorCampoGeneralConsignacion;
	}

	public void setBorderResaltarValorCampoGeneralConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConsignacion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConsignacion() {
		return this.jCheckBoxSeleccionarTodosConsignacion;
	}

	public void setjCheckBoxSeleccionarTodosConsignacion(
			JCheckBox jCheckBoxSeleccionarTodosConsignacion) {
		this.jCheckBoxSeleccionarTodosConsignacion = jCheckBoxSeleccionarTodosConsignacion;
	}

	public void setBorderResaltarSeleccionarTodosConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConsignacion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConsignacion() {
		return this.jCheckBoxSeleccionadosConsignacion;
	}

	public void setjCheckBoxSeleccionadosConsignacion(
			JCheckBox jCheckBoxSeleccionadosConsignacion) {
		this.jCheckBoxSeleccionadosConsignacion = jCheckBoxSeleccionadosConsignacion;
	}
	
	public void setBorderResaltarSeleccionadosConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConsignacion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConsignacion() {
		return this.jComboBoxTiposArchivosReportesConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConsignacion(
			JComboBox jComboBoxTiposArchivosReportesConsignacion) {
		this.jComboBoxTiposArchivosReportesConsignacion = jComboBoxTiposArchivosReportesConsignacion;
	}

	public void setBorderResaltarTiposArchivosReportesConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConsignacion() {
		return this.jComboBoxTiposReportesConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConsignacion(
			JComboBox jComboBoxTiposReportesConsignacion) {
		this.jComboBoxTiposReportesConsignacion = jComboBoxTiposReportesConsignacion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConsignacion() {
	//	return jComboBoxTiposReportesDinamicoConsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConsignacion(
	//		JComboBox jComboBoxTiposReportesDinamicoConsignacion) {
	//	this.jComboBoxTiposReportesDinamicoConsignacion = jComboBoxTiposReportesDinamicoConsignacion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConsignacion() {
	//	return jComboBoxTiposArchivosReportesDinamicoConsignacion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConsignacion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConsignacion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConsignacion = jComboBoxTiposArchivosReportesDinamicoConsignacion;
	//}
	
	public void setBorderResaltarTiposReportesConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConsignacion() {
		return this.jComboBoxTiposGraficosReportesConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConsignacion(
			JComboBox jComboBoxTiposGraficosReportesConsignacion) {
		this.jComboBoxTiposGraficosReportesConsignacion = jComboBoxTiposGraficosReportesConsignacion;
	}
	
	public void setBorderResaltarTiposGraficosReportesConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConsignacion() {
		return this.jComboBoxTiposPaginacionConsignacion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConsignacion(
			JComboBox jComboBoxTiposPaginacionConsignacion) {
		this.jComboBoxTiposPaginacionConsignacion = jComboBoxTiposPaginacionConsignacion;
	}
	
	public void setBorderResaltarTiposPaginacionConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConsignacion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConsignacion() {
		return this.jComboBoxTiposRelacionesConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsignacion() {
		return this.jComboBoxTiposAccionesConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsignacion(
			JComboBox jComboBoxTiposRelacionesConsignacion) {
		this.jComboBoxTiposRelacionesConsignacion = jComboBoxTiposRelacionesConsignacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsignacion(
			JComboBox jComboBoxTiposAccionesConsignacion) {
		this.jComboBoxTiposAccionesConsignacion = jComboBoxTiposAccionesConsignacion;
	}
	
	public void setBorderResaltarTiposRelacionesConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConsignacion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConsignacion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConsignacion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConsignacion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConsignacion() {
	//	return jCheckBoxConGraficoDinamicoConsignacion;
	//}

	//public void setjCheckBoxConGraficoDinamicoConsignacion(
	//		JCheckBox jCheckBoxConGraficoDinamicoConsignacion) {
	//	this.jCheckBoxConGraficoDinamicoConsignacion = jCheckBoxConGraficoDinamicoConsignacion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConsignacion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConsignacion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConsignacion .setBorder(borderResaltar);		
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
		this.consignacionSessionBean=new ConsignacionSessionBean();
		
		this.consignacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consignacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consignacionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsignacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consignacion MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
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
		
		ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Consignacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConsignacion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConsignacion,this.jTtoolBarConsignacion,
							"nuevo","nuevo","Nuevo"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConsignacion,this.jTtoolBarConsignacion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConsignacion,this.jTtoolBarConsignacion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConsignacion,this.jTtoolBarConsignacion,
							"duplicar","duplicar","Duplicar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConsignacion,this.jTtoolBarConsignacion,
							"copiar","copiar","Copiar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConsignacion,this.jTtoolBarConsignacion,
							"ver_form","ver_form","Ver"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignacion,this.jTtoolBarConsignacion,
							"recargar","recargar","Recargar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignacion,this.jTtoolBarConsignacion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConsignacion,this.jTtoolBarConsignacion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConsignacion,this.jTtoolBarConsignacion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConsignacion,this.jTtoolBarConsignacion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConsignacion,this.jTtoolBarConsignacion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConsignacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConsignacion,this.jTtoolBarConsignacion,
							"cerrar","cerrar","Salir"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConsignacion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConsignacion;
			
				this.jButtonProcesarInformacionToolBarConsignacion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConsignacion;
				
		//protected JButton jButtonModificarToolBarConsignacion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConsignacion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConsignacion=new JMenuMe("General");
		this.jmenuArchivoConsignacion=new JMenuMe("Archivo");
		this.jmenuAccionesConsignacion=new JMenuMe("Acciones");
		this.jmenuDatosConsignacion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsignacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsignacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsignacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConsignacion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConsignacion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConsignacion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConsignacion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConsignacion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConsignacion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConsignacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsignacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsignacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConsignacion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConsignacion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConsignacion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConsignacion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConsignacion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConsignacion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConsignacion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConsignacion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConsignacion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsignacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsignacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsignacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConsignacion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConsignacion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConsignacion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConsignacion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConsignacion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConsignacion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConsignacion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConsignacion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConsignacion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConsignacion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConsignacion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConsignacion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConsignacion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConsignacion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConsignacion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsignacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsignacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsignacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConsignacion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConsignacion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConsignacion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConsignacion.add(this.jMenuItemCerrarConsignacion);
			
			this.jmenuAccionesConsignacion.add(this.jMenuItemNuevoConsignacion);
			this.jmenuAccionesConsignacion.add(this.jMenuItemNuevoGuardarCambiosConsignacion);
			this.jmenuAccionesConsignacion.add(this.jMenuItemNuevoRelacionesConsignacion);
			this.jmenuAccionesConsignacion.add(this.jMenuItemGuardarCambiosTablaConsignacion);		
			this.jmenuAccionesConsignacion.add(this.jMenuItemDuplicarConsignacion);		
			this.jmenuAccionesConsignacion.add(this.jMenuItemCopiarConsignacion);		
			this.jmenuAccionesConsignacion.add(this.jMenuItemVerFormConsignacion);		
			
			this.jmenuDatosConsignacion.add(this.jMenuItemRecargarInformacionConsignacion);				
			this.jmenuDatosConsignacion.add(this.jMenuItemAnterioresConsignacion);				
			this.jmenuDatosConsignacion.add(this.jMenuItemSiguientesConsignacion);				
			this.jmenuDatosConsignacion.add(this.jMenuItemAbrirOrderByConsignacion);				
			this.jmenuDatosConsignacion.add(this.jMenuItemMostrarOcultarConsignacion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConsignacion.add(this.jMenuItemGuardarCambiosConsignacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConsignacion.add(this.jmenuArchivoConsignacion);		
			this.jmenuBarConsignacion.add(this.jmenuAccionesConsignacion);		
			this.jmenuBarConsignacion.add(this.jmenuDatosConsignacion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConsignacion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConsignacion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoConsignacion.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoConsignacion= new JButtonMe();
		this.jButtonFK_IdCentroCostoConsignacion.setText("Buscar");
		this.jButtonFK_IdCentroCostoConsignacion.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoConsignacion,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoConsignacion = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoConsignacion.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoConsignacion.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoConsignacion= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion.setFocusable(false);

		this.jPanelFK_IdClienteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteConsignacion.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteConsignacion= new JButtonMe();
		this.jButtonFK_IdClienteConsignacion.setText("Buscar");
		this.jButtonFK_IdClienteConsignacion.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteConsignacion,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteConsignacion = new JLabelMe();
		jLabelid_clienteFK_IdClienteConsignacion.setText("Cliente :");
		jLabelid_clienteFK_IdClienteConsignacion.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteConsignacion= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteConsignacion.setFocusable(false);

		this.jPanelFK_IdConsignatarioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsignatarioConsignacion.setToolTipText("Buscar Por Consignatario ");
		this.jButtonFK_IdConsignatarioConsignacion= new JButtonMe();
		this.jButtonFK_IdConsignatarioConsignacion.setText("Buscar");
		this.jButtonFK_IdConsignatarioConsignacion.setToolTipText("Buscar Por Consignatario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsignatarioConsignacion,"buscar_button","Buscar Por Consignatario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsignatarioConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consignatarioFK_IdConsignatarioConsignacion = new JLabelMe();
		jLabelid_consignatarioFK_IdConsignatarioConsignacion.setText("Consignatario :");
		jLabelid_consignatarioFK_IdConsignatarioConsignacion.setToolTipText("Consignatario");
		jLabelid_consignatarioFK_IdConsignatarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioFK_IdConsignatarioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consignatarioFK_IdConsignatarioConsignacion= new JComboBoxMe();
		jComboBoxid_consignatarioFK_IdConsignatarioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioFK_IdConsignatarioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoConsignacion.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoConsignacion= new JButtonMe();
		this.jButtonFK_IdEmpleadoConsignacion.setText("Buscar");
		this.jButtonFK_IdEmpleadoConsignacion.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoConsignacion,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoConsignacion = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoConsignacion.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoConsignacion.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoConsignacion= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoConsignacion.setToolTipText("Buscar Por Estado Pedido ");
		this.jButtonFK_IdEstadoPedidoConsignacion= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoConsignacion.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoConsignacion.setToolTipText("Buscar Por Estado Pedido ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoConsignacion,"buscar_button","Buscar Por Estado Pedido ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion = new JLabelMe();
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion.setText("Estado Pedido :");
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion.setToolTipText("Estado Pedido");
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion= new JComboBoxMe();
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoConsignacion.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoConsignacion= new JButtonMe();
		this.jButtonFK_IdFormatoConsignacion.setText("Buscar");
		this.jButtonFK_IdFormatoConsignacion.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoConsignacion,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoConsignacion = new JLabelMe();
		jLabelid_formatoFK_IdFormatoConsignacion.setText("Formato :");
		jLabelid_formatoFK_IdFormatoConsignacion.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoConsignacion= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdResponsableConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsableConsignacion.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsableConsignacion= new JButtonMe();
		this.jButtonFK_IdResponsableConsignacion.setText("Buscar");
		this.jButtonFK_IdResponsableConsignacion.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsableConsignacion,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsableConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsableFK_IdResponsableConsignacion = new JLabelMe();
		jLabelid_responsableFK_IdResponsableConsignacion.setText("Responsable :");
		jLabelid_responsableFK_IdResponsableConsignacion.setToolTipText("Responsable");
		jLabelid_responsableFK_IdResponsableConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsableConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFK_IdResponsableConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsableFK_IdResponsableConsignacion= new JComboBoxMe();
		jComboBoxid_responsableFK_IdResponsableConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsableConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFK_IdResponsableConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClienteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClienteConsignacion.setToolTipText("Buscar Por Sub Cliente ");
		this.jButtonFK_IdSubClienteConsignacion= new JButtonMe();
		this.jButtonFK_IdSubClienteConsignacion.setText("Buscar");
		this.jButtonFK_IdSubClienteConsignacion.setToolTipText("Buscar Por Sub Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClienteConsignacion,"buscar_button","Buscar Por Sub Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClienteConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClienteConsignacion = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClienteConsignacion.setText("Sub Cliente :");
		jLabelid_sub_clienteFK_IdSubClienteConsignacion.setToolTipText("Sub Cliente");
		jLabelid_sub_clienteFK_IdSubClienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClienteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClienteConsignacion= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClienteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClienteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClienteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioConsignacion.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioConsignacion= new JButtonMe();
		this.jButtonFK_IdTipoCambioConsignacion.setText("Buscar");
		this.jButtonFK_IdTipoCambioConsignacion.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioConsignacion,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion.setFocusable(false);

		this.jPanelFK_IdTipoPrecioConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioConsignacion.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioConsignacion= new JButtonMe();
		this.jButtonFK_IdTipoPrecioConsignacion.setText("Buscar");
		this.jButtonFK_IdTipoPrecioConsignacion.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioConsignacion,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransporteConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransporteConsignacion.setToolTipText("Buscar Por Transporte ");
		this.jButtonFK_IdTransporteConsignacion= new JButtonMe();
		this.jButtonFK_IdTransporteConsignacion.setText("Buscar");
		this.jButtonFK_IdTransporteConsignacion.setToolTipText("Buscar Por Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransporteConsignacion,"buscar_button","Buscar Por Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransporteConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransporteConsignacion = new JLabelMe();
		jLabelid_transporteFK_IdTransporteConsignacion.setText("Transporte :");
		jLabelid_transporteFK_IdTransporteConsignacion.setToolTipText("Transporte");
		jLabelid_transporteFK_IdTransporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransporteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransporteConsignacion= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransporteConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaConsignacion.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaConsignacion= new JButtonMe();
		this.jButtonFK_IdTransportistaConsignacion.setText("Buscar");
		this.jButtonFK_IdTransportistaConsignacion.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaConsignacion,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaConsignacion = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaConsignacion.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaConsignacion.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaConsignacion= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorConsignacion.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorConsignacion= new JButtonMe();
		this.jButtonFK_IdVendedorConsignacion.setText("Buscar");
		this.jButtonFK_IdVendedorConsignacion.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorConsignacion,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorConsignacion = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorConsignacion.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorConsignacion.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorConsignacion= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion.setFocusable(false);

		this.jPanelFK_IdZonaConsignacion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdZonaConsignacion.setToolTipText("Buscar Por Zona ");
		this.jButtonFK_IdZonaConsignacion= new JButtonMe();
		this.jButtonFK_IdZonaConsignacion.setText("Buscar");
		this.jButtonFK_IdZonaConsignacion.setToolTipText("Buscar Por Zona ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdZonaConsignacion,"buscar_button","Buscar Por Zona ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdZonaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_zonaFK_IdZonaConsignacion = new JLabelMe();
		jLabelid_zonaFK_IdZonaConsignacion.setText("Zona :");
		jLabelid_zonaFK_IdZonaConsignacion.setToolTipText("Zona");
		jLabelid_zonaFK_IdZonaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_zonaFK_IdZonaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_zonaFK_IdZonaConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_zonaFK_IdZonaConsignacion= new JComboBoxMe();
		jComboBoxid_zonaFK_IdZonaConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaFK_IdZonaConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaFK_IdZonaConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConsignacion=new JTabbedPane();


		this.jTabbedPaneBusquedasConsignacion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasConsignacion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasConsignacion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConsignacion = new ConsignacionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Consignacion DATOS");
			this.jInternalFrameDetalleFormConsignacion = new ConsignacionDetalleFormJInternalFrame(jDesktopPane,this.consignacionSessionBean.getConGuardarRelaciones(),this.consignacionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConsignacion = null;//new ConsignacionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsignacion= new GridBagLayout();
		
		
		this.jTableDatosConsignacion = new JTableMe();      
		
		String sToolTipConsignacion="";
		sToolTipConsignacion=ConsignacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsignacion+="(Facturacion.Consignacion)";
		}
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsignacion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConsignacion.setToolTipText(sToolTipConsignacion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConsignacion);
		this.jTableDatosConsignacion.setAutoCreateRowSorter(true);
		this.jTableDatosConsignacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConsignacion.setRowSelectionAllowed(true);
		this.jTableDatosConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConsignacion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConsignacion = new JButtonMe();
		this.jButtonDuplicarConsignacion = new JButtonMe();
		this.jButtonCopiarConsignacion = new JButtonMe();
		this.jButtonVerFormConsignacion = new JButtonMe();
		this.jButtonNuevoRelacionesConsignacion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConsignacion = new JButtonMe();
		this.jButtonCerrarConsignacion = new JButtonMe();
		
		this.jScrollPanelDatosConsignacion = new JScrollPane();   
        this.jScrollPanelDatosGeneralConsignacion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Consignacion";
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions" + this.sPath));
		} else {
			this.jScrollPanelDatosConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsignacion.setToolTipText("Acciones");
        this.jPanelAccionesConsignacion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalConsignacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalConsignacion.setName("jPanelCamposFintotalConsignacion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoConsignacion=new ReporteDinamicoJInternalFrame(ConsignacionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConsignacion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConsignacion=new ImportacionJInternalFrame(ConsignacionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConsignacion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConsignacion = new JButtonMe();
		
		this.jButtonAbrirOrderByConsignacion.setText("Orden");
		this.jButtonAbrirOrderByConsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsignacion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignacion,false,this);
			
			//this.cargarOrderByConsignacion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConsignacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsignacion,true,this);
			
			//this.cargarOrderByConsignacion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConsignacion.setMinimumSize(new Dimension(400,50));//3130
		this.jTableDatosConsignacion.setMaximumSize(new Dimension(400,50));//3130
		this.jTableDatosConsignacion.setPreferredSize(new Dimension(400,50));//3130
		
		this.jScrollPanelDatosConsignacion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsignacion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConsignacion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConsignacion.setText("Nuevo");
		this.jButtonDuplicarConsignacion.setText("Duplicar");
		this.jButtonCopiarConsignacion.setText("Copiar");
		this.jButtonVerFormConsignacion.setText("Ver");
		this.jButtonNuevoRelacionesConsignacion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConsignacion.setText("Guardar");
		this.jButtonCerrarConsignacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsignacion,"nuevo_button","Nuevo",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConsignacion,"duplicar_button","Duplicar",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConsignacion,"copiar_button","Copiar",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConsignacion,"ver_form","Ver",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConsignacion,"nuevorelaciones_button","Nuevo Rel",this.consignacionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsignacion,"guardarcambiostabla_button","Guardar",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsignacion,"cerrar_button","Salir",this.consignacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConsignacion.setToolTipText("Nuevo"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConsignacion.setToolTipText("Duplicar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConsignacion.setToolTipText("Copiar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConsignacion.setToolTipText("Ver"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConsignacion.setToolTipText("Nuevo Rel"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConsignacion.setToolTipText("Guardar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsignacion.setToolTipText("Salir"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsignacion";
		inputMap = this.jButtonNuevoConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsignacion"));
		
		//DUPLICAR
		sMapKey = "DuplicarConsignacion";
		inputMap = this.jButtonDuplicarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConsignacion"));
		
		//COPIAR
		sMapKey = "CopiarConsignacion";
		inputMap = this.jButtonCopiarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConsignacion"));
		
		//VEr FORM
		sMapKey = "VerFormConsignacion";
		inputMap = this.jButtonVerFormConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConsignacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConsignacion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConsignacion";
		inputMap = this.jButtonNuevoRelacionesConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConsignacion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConsignacion";
		inputMap = this.jButtonModificarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConsignacion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConsignacion";
		inputMap = this.jButtonCerrarConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsignacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsignacion";
		inputMap = this.jButtonGuardarCambiosTablaConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsignacion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Consignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Consignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Consignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Consignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Consignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConsignacion.setName("jPanelParametrosReportesConsignacion"); 
		
		this.jPanelParametrosReportesAccionesConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConsignacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConsignacion.setName("jPanelParametrosReportesAccionesConsignacion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConsignacion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConsignacion = new JButtonMe();
		this.jButtonRecargarInformacionConsignacion.setText("Recargar");
		this.jButtonRecargarInformacionConsignacion.setToolTipText("Recargar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConsignacion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConsignacion = new JButtonMe();
		this.jButtonProcesarInformacionConsignacion.setText("Procesar");
		this.jButtonProcesarInformacionConsignacion.setToolTipText("Procesar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConsignacion.setVisible(false);
			
		this.jButtonProcesarInformacionConsignacion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsignacion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConsignacion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignacion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConsignacion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignacion.setText("TIPO");       
		this.jComboBoxTiposReportesConsignacion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConsignacion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConsignacion.setText("Paginacion");
		this.jComboBoxTiposPaginacionConsignacion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConsignacion.setText("Accion");
		this.jComboBoxTiposRelacionesConsignacion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsignacion.setText("Accion");
		this.jComboBoxTiposAccionesConsignacion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConsignacion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConsignacion.setText("Accion");
		this.jComboBoxTiposSeleccionarConsignacion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConsignacion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConsignacion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsignacion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConsignacion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConsignacion = new JLabelMe();
		
		this.jLabelAccionesConsignacion.setText("Acciones");		
		this.jLabelAccionesConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConsignacion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConsignacion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConsignacion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConsignacion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConsignacion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConsignacion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConsignacion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConsignacion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConsignacion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConsignacion.setText("Graf.");
		this.jCheckBoxConGraficoReporteConsignacion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConsignacion = new JButtonMe();
		//this.jButtonAnterioresConsignacion.setText("<<");
        this.jButtonAnterioresConsignacion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConsignacion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConsignacion = new JButtonMe();
		//this.jButtonSiguientesConsignacion.setText(">>");
        this.jButtonSiguientesConsignacion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConsignacion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConsignacion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConsignacion.setText("Nue");
        this.jButtonNuevoGuardarCambiosConsignacion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConsignacion,"nuevoguardarcambios_button","Nue",this.consignacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConsignacion";
		inputMap = this.jButtonNuevoGuardarCambiosConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConsignacion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConsignacion";
		inputMap = this.jButtonRecargarInformacionConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConsignacion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConsignacion";
		inputMap = this.jButtonSiguientesConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConsignacion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConsignacion";
		inputMap = this.jButtonAnterioresConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConsignacion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConsignacion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConsignacion.setMinimumSize(new Dimension(this.getWidth(),ConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsignacion.setMaximumSize(new Dimension(this.getWidth(),ConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConsignacion.setPreferredSize(new Dimension(this.getWidth(),ConsignacionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConsignacionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConsignacion = new GridBagLayout();

			this.jPanelPaginacionConsignacion.setLayout(gridaBagLayoutPaginacionConsignacion);						
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = 0;
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConsignacion.add(this.jButtonAnterioresConsignacion, this.gridBagConstraintsConsignacion);
					
						
			this.gridBagConstraintsConsignacion = new GridBagConstraints();//
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsConsignacion.gridy = 0;//
			
			this.jPanelPaginacionConsignacion.add(this.jButtonNuevoGuardarCambiosConsignacion, this.gridBagConstraintsConsignacion);//
						
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConsignacion.gridy = 0;
			this.jPanelPaginacionConsignacion.add(this.jButtonSiguientesConsignacion, this.gridBagConstraintsConsignacion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();//
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsConsignacion.gridy = 1;//
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionConsignacion.add(this.jButtonNuevoConsignacion, this.gridBagConstraintsConsignacion);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsConsignacion = new GridBagConstraints();
				this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConsignacion.gridy = 1;
				this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionConsignacion.add(this.jButtonNuevoRelacionesConsignacion, this.gridBagConstraintsConsignacion);
			}
			
			
			if(!this.consignacionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConsignacion = new GridBagConstraints();//
				this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsConsignacion.gridy = 1;//
				this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionConsignacion.add(this.jButtonGuardarCambiosTablaConsignacion, this.gridBagConstraintsConsignacion);//
			}
			
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();//
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsConsignacion.gridy = 1;//
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionConsignacion.add(this.jButtonDuplicarConsignacion, this.gridBagConstraintsConsignacion);//
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();//
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsConsignacion.gridy = 1;//
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionConsignacion.add(this.jButtonCopiarConsignacion, this.gridBagConstraintsConsignacion);//
		
			this.gridBagConstraintsConsignacion = new GridBagConstraints();//
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsConsignacion.gridy = 1;//
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionConsignacion.add(this.jButtonVerFormConsignacion, this.gridBagConstraintsConsignacion);//
		
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = 1;
			this.gridBagConstraintsConsignacion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConsignacion.add(this.jButtonCerrarConsignacion, this.gridBagConstraintsConsignacion);
		
		
		
		this.jButtonRecargarInformacionConsignacion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsignacion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConsignacion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConsignacion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsignacion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConsignacion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConsignacion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsignacion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConsignacion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConsignacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsignacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConsignacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConsignacion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsignacion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConsignacion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConsignacion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsignacion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConsignacion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConsignacion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConsignacion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsignacion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConsignacion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConsignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConsignacion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Consignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Consignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Consignacion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Consignacion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConsignacion.setLayout(gridaBagParametrosReportesConsignacion);
			this.jPanelParametrosReportesAccionesConsignacion.setLayout(gridaBagParametrosReportesAccionesConsignacion);
			
			
			this.jPanelParametrosAuxiliar1Consignacion.setLayout(gridaBagParametrosAuxiliar1Consignacion);
			this.jPanelParametrosAuxiliar2Consignacion.setLayout(gridaBagParametrosAuxiliar2Consignacion);
			this.jPanelParametrosAuxiliar3Consignacion.setLayout(gridaBagParametrosAuxiliar3Consignacion);
			this.jPanelParametrosAuxiliar4Consignacion.setLayout(gridaBagParametrosAuxiliar4Consignacion);
			//this.jPanelParametrosAuxiliar5Consignacion.setLayout(gridaBagParametrosAuxiliar2Consignacion);			
			
			
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignacion.add(this.jButtonRecargarInformacionConsignacion, this.gridBagConstraintsConsignacion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignacion.add(this.jComboBoxTiposPaginacionConsignacion, this.gridBagConstraintsConsignacion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignacion.add(this.jCheckBoxConAltoMaximoTablaConsignacion, this.gridBagConstraintsConsignacion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Consignacion.add(this.jComboBoxTiposArchivosReportesConsignacion, this.gridBagConstraintsConsignacion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignacion.add(this.jPanelParametrosAuxiliar1Consignacion, this.gridBagConstraintsConsignacion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Consignacion.add(this.jComboBoxTiposReportesConsignacion, this.gridBagConstraintsConsignacion);																		
			
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Consignacion.add(this.jComboBoxTiposGraficosReportesConsignacion, this.gridBagConstraintsConsignacion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignacion.add(this.jPanelParametrosAuxiliar4Consignacion, this.gridBagConstraintsConsignacion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignacion.add(this.jComboBoxTiposReportesConsignacion, this.gridBagConstraintsConsignacion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignacion.add(this.jCheckBoxGenerarReporteConsignacion, this.gridBagConstraintsConsignacion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignacion.add(this.jPanelParametrosAuxiliar2Consignacion, this.gridBagConstraintsConsignacion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignacion.add(this.jLabelAccionesConsignacion, this.gridBagConstraintsConsignacion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConsignacion = new GridBagConstraints();
				this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConsignacion.add(this.jButtonAbrirOrderByConsignacion, this.gridBagConstraintsConsignacion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignacion.add(this.jComboBoxTiposSeleccionarConsignacion, this.gridBagConstraintsConsignacion);			
			
			
			/*
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignacion.add(this.jCheckBoxSeleccionarTodosConsignacion, this.gridBagConstraintsConsignacion);
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConsignacion.add(this.jCheckBoxConGraficoReporteConsignacion, this.gridBagConstraintsConsignacion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consignacion.add(this.jCheckBoxSeleccionarTodosConsignacion, this.gridBagConstraintsConsignacion);															
				
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consignacion.add(this.jCheckBoxSeleccionadosConsignacion, this.gridBagConstraintsConsignacion);															
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConsignacion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Consignacion.add(this.jCheckBoxConGraficoReporteConsignacion, this.gridBagConstraintsConsignacion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConsignacion.add(this.jPanelParametrosAuxiliar3Consignacion, this.gridBagConstraintsConsignacion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignacion.add(this.jComboBoxTiposRelacionesConsignacion, this.gridBagConstraintsConsignacion);
				
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignacion.add(this.jComboBoxTiposAccionesConsignacion, this.gridBagConstraintsConsignacion);
	
				
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConsignacion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConsignacion.add(this.jTextFieldValorCampoGeneralConsignacion, this.gridBagConstraintsConsignacion);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalConsignacion= new GridBagLayout();
		this.jPanelCamposFintotalConsignacion.setLayout(gridaBagLayoutCamposFintotalConsignacion);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConsignacion = new GridBagLayout();

			this.jScrollPanelDatosConsignacion.setLayout(gridaBagLayoutDatosConsignacion);
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = 0;
			this.gridBagConstraintsConsignacion.gridx = 0;
			
			this.jScrollPanelDatosConsignacion.add(this.jTableDatosConsignacion, this.gridBagConstraintsConsignacion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConsignacion.setViewportView(this.jTableDatosConsignacion);
		this.jTableDatosConsignacion.setFillsViewportHeight(true);
		this.jTableDatosConsignacion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConsignacion= new GridBagLayout();
		this.jPanelAccionesConsignacion.setLayout(gridaBagLayoutAccionesConsignacion);
		
		
		/*	
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = 0;
		this.gridBagConstraintsConsignacion.gridx = 0;
			
		this.jPanelAccionesConsignacion.add(this.jButtonNuevoConsignacion, this.gridBagConstraintsConsignacion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoConsignacion.setLayout(gridaBagLayoutFK_IdCentroCostoConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdCentroCostoConsignacion.add(jLabelid_centro_costoFK_IdCentroCostoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdCentroCostoConsignacion.add(jComboBoxid_centro_costoFK_IdCentroCostoConsignacion, gridBagConstraintsConsignacion);


		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdCentroCostoConsignacion.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdCentroCostoConsignacion.add(jButtonFK_IdCentroCostoConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClienteConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdClienteConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteConsignacion.setLayout(gridaBagLayoutFK_IdClienteConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdClienteConsignacion.add(jLabelid_clienteFK_IdClienteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdClienteConsignacion.add(jComboBoxid_clienteFK_IdClienteConsignacion, gridBagConstraintsConsignacion);


		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdClienteConsignacion.add(this.jButtonBuscarFK_IdClienteid_clienteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdClienteConsignacion.add(jButtonFK_IdClienteConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("2.-Por Cliente ", jPanelFK_IdClienteConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdConsignatarioConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdConsignatarioConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsignatarioConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsignatarioConsignacion.setLayout(gridaBagLayoutFK_IdConsignatarioConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdConsignatarioConsignacion.add(jLabelid_consignatarioFK_IdConsignatarioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdConsignatarioConsignacion.add(jComboBoxid_consignatarioFK_IdConsignatarioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdConsignatarioConsignacion.add(jButtonFK_IdConsignatarioConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("3.-Por Consignatario ", jPanelFK_IdConsignatarioConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoConsignacion.setLayout(gridaBagLayoutFK_IdEmpleadoConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdEmpleadoConsignacion.add(jLabelid_empleadoFK_IdEmpleadoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdEmpleadoConsignacion.add(jComboBoxid_empleadoFK_IdEmpleadoConsignacion, gridBagConstraintsConsignacion);


		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdEmpleadoConsignacion.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdEmpleadoConsignacion.add(jButtonFK_IdEmpleadoConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("4.-Por Empleado ", jPanelFK_IdEmpleadoConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoConsignacion.setLayout(gridaBagLayoutFK_IdEstadoPedidoConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdEstadoPedidoConsignacion.add(jLabelid_estado_pedidoFK_IdEstadoPedidoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdEstadoPedidoConsignacion.add(jComboBoxid_estado_pedidoFK_IdEstadoPedidoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdEstadoPedidoConsignacion.add(jButtonFK_IdEstadoPedidoConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("5.-Por Estado Pedido ", jPanelFK_IdEstadoPedidoConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFormatoConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoConsignacion.setLayout(gridaBagLayoutFK_IdFormatoConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdFormatoConsignacion.add(jLabelid_formatoFK_IdFormatoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdFormatoConsignacion.add(jComboBoxid_formatoFK_IdFormatoConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdFormatoConsignacion.add(jButtonFK_IdFormatoConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("6.-Por Formato ", jPanelFK_IdFormatoConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdResponsableConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdResponsableConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsableConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsableConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsableConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsableConsignacion.setLayout(gridaBagLayoutFK_IdResponsableConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdResponsableConsignacion.add(jLabelid_responsableFK_IdResponsableConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdResponsableConsignacion.add(jComboBoxid_responsableFK_IdResponsableConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdResponsableConsignacion.add(jButtonFK_IdResponsableConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("7.-Por Responsable ", jPanelFK_IdResponsableConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdSubClienteConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdSubClienteConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClienteConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClienteConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClienteConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClienteConsignacion.setLayout(gridaBagLayoutFK_IdSubClienteConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdSubClienteConsignacion.add(jLabelid_sub_clienteFK_IdSubClienteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdSubClienteConsignacion.add(jComboBoxid_sub_clienteFK_IdSubClienteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdSubClienteConsignacion.add(jButtonFK_IdSubClienteConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("8.-Por Sub Cliente ", jPanelFK_IdSubClienteConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioConsignacion.setLayout(gridaBagLayoutFK_IdTipoCambioConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdTipoCambioConsignacion.add(jLabelid_tipo_cambioFK_IdTipoCambioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdTipoCambioConsignacion.add(jComboBoxid_tipo_cambioFK_IdTipoCambioConsignacion, gridBagConstraintsConsignacion);


		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdTipoCambioConsignacion.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdTipoCambioConsignacion.add(jButtonFK_IdTipoCambioConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("9.-Por Tipo Cambio ", jPanelFK_IdTipoCambioConsignacion);
		jTabbedPaneBusquedasConsignacion.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioConsignacion.setLayout(gridaBagLayoutFK_IdTipoPrecioConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdTipoPrecioConsignacion.add(jLabelid_tipo_precioFK_IdTipoPrecioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdTipoPrecioConsignacion.add(jComboBoxid_tipo_precioFK_IdTipoPrecioConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdTipoPrecioConsignacion.add(jButtonFK_IdTipoPrecioConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("10.-Por Tipo Precio ", jPanelFK_IdTipoPrecioConsignacion);

		GridBagLayout gridaBagLayoutFK_IdTransporteConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdTransporteConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransporteConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransporteConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransporteConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransporteConsignacion.setLayout(gridaBagLayoutFK_IdTransporteConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdTransporteConsignacion.add(jLabelid_transporteFK_IdTransporteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdTransporteConsignacion.add(jComboBoxid_transporteFK_IdTransporteConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdTransporteConsignacion.add(jButtonFK_IdTransporteConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("11.-Por Transporte ", jPanelFK_IdTransporteConsignacion);

		GridBagLayout gridaBagLayoutFK_IdTransportistaConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaConsignacion.setLayout(gridaBagLayoutFK_IdTransportistaConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdTransportistaConsignacion.add(jLabelid_transportistaFK_IdTransportistaConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdTransportistaConsignacion.add(jComboBoxid_transportistaFK_IdTransportistaConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdTransportistaConsignacion.add(jButtonFK_IdTransportistaConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("12.-Por Transportista ", jPanelFK_IdTransportistaConsignacion);

		GridBagLayout gridaBagLayoutFK_IdVendedorConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorConsignacion.setLayout(gridaBagLayoutFK_IdVendedorConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdVendedorConsignacion.add(jLabelid_vendedorFK_IdVendedorConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdVendedorConsignacion.add(jComboBoxid_vendedorFK_IdVendedorConsignacion, gridBagConstraintsConsignacion);


		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.EAST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.NONE;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdVendedorConsignacion.add(this.jButtonBuscarFK_IdVendedorid_vendedorConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdVendedorConsignacion.add(jButtonFK_IdVendedorConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("13.-Por Vendedor ", jPanelFK_IdVendedorConsignacion);

		GridBagLayout gridaBagLayoutFK_IdZonaConsignacion= new GridBagLayout();
		gridaBagLayoutFK_IdZonaConsignacion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdZonaConsignacion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdZonaConsignacion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdZonaConsignacion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdZonaConsignacion.setLayout(gridaBagLayoutFK_IdZonaConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 0;
		jPanelFK_IdZonaConsignacion.add(jLabelid_zonaFK_IdZonaConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 0;
		gridBagConstraintsConsignacion.gridx = 1;
		jPanelFK_IdZonaConsignacion.add(jComboBoxid_zonaFK_IdZonaConsignacion, gridBagConstraintsConsignacion);

		gridBagConstraintsConsignacion = new GridBagConstraints();
		gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConsignacion.gridy = 1;
		gridBagConstraintsConsignacion.gridx =1;
		jPanelFK_IdZonaConsignacion.add(jButtonFK_IdZonaConsignacion, gridBagConstraintsConsignacion);

		jTabbedPaneBusquedasConsignacion.addTab("14.-Por Zona ", jPanelFK_IdZonaConsignacion);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsignacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsignacion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consignacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsignacion = new GridBagConstraints();						
			this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignacion.gridx = 0;		
			//this.gridBagConstraintsConsignacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsignacion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConsignacion, this.gridBagConstraintsConsignacion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConsignacion.gridx = 0;		
		//this.gridBagConstraintsConsignacion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConsignacion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConsignacion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignacion.gridx = 0;		
			this.gridBagConstraintsConsignacion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConsignacion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConsignacion, this.gridBagConstraintsConsignacion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConsignacion, this.gridBagConstraintsConsignacion);								
		
		
		/*
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConsignacion, this.gridBagConstraintsConsignacion);
		*/		
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsignacion.gridx =0;
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsignacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsignacion, this.gridBagConstraintsConsignacion);
				
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConsignacion, this.gridBagConstraintsConsignacion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ConsignacionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConsignacion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsignacion = new GridBagLayout();
			this.jPanelBusquedasParametrosConsignacion.setLayout(gridaBagLayoutBusquedasParametrosConsignacion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConsignacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsignacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsConsignacion.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsignacion, this.gridBagConstraintsConsignacion);
			
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsignacion, this.gridBagConstraintsConsignacion);
		
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsignacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsignacion, this.gridBagConstraintsConsignacion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConsignacion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConsignacion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConsignacion.setName("jPanelReporteDinamicoConsignacion"); 
		
		this.jPanelReporteDinamicoConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConsignacion.setLayout(gridaBagLayoutReporteDinamicoConsignacion);
		
		
		this.jInternalFrameReporteDinamicoConsignacion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConsignacion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConsignacion.setResizable(true);
	    this.jInternalFrameReporteDinamicoConsignacion.setClosable(true);
	    this.jInternalFrameReporteDinamicoConsignacion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConsignacion = new JLabelMe();

		this.jLabelColumnasSelectReporteConsignacion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelColumnasSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConsignacion = new JList<Reporte>();
		this.jListColumnasSelectReporteConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConsignacion=new JScrollPane(this.jListColumnasSelectReporteConsignacion);
			
			this.jScrollColumnasSelectReporteConsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsignacion.add(this.jListColumnasSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		this.jPanelReporteDinamicoConsignacion.add(this.jScrollColumnasSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConsignacion = new JLabelMe();

		this.jLabelRelacionesSelectReporteConsignacion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelRelacionesSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConsignacion = new JList<Reporte>();
		this.jListRelacionesSelectReporteConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConsignacion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConsignacion=new JScrollPane(this.jListRelacionesSelectReporteConsignacion);
			
			this.jScrollRelacionesSelectReporteConsignacion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsignacion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConsignacion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConsignacion.add(this.jListRelacionesSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		this.jPanelReporteDinamicoConsignacion.add(this.jScrollRelacionesSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoConsignacion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConsignacion = new JComboBoxMe();
		this.jListColumnasValoresGraficoConsignacion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConsignacion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConsignacion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConsignacion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConsignacion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConsignacion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsignacion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConsignacion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConsignacion = new JLabelMe();

		this.jLabelConGraficoDinamicoConsignacion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelConGraficoDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConsignacion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConsignacion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConsignacion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConsignacion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsignacion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConsignacion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jCheckBoxConGraficoDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConsignacion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelColumnaCategoriaGraficoConsignacion, this.gridBagConstraintsConsignacion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConsignacion.add(this.jComboBoxColumnaCategoriaGraficoConsignacion, this.gridBagConstraintsConsignacion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConsignacion = new JLabelMe();

		this.jLabelColumnaCategoriaValorConsignacion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelColumnaCategoriaValorConsignacion, this.gridBagConstraintsConsignacion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConsignacion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConsignacion.add(this.jComboBoxColumnaCategoriaValorConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConsignacion = new JLabelMe();

		this.jLabelColumnasValoresGraficoConsignacion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelColumnasValoresGraficoConsignacion, this.gridBagConstraintsConsignacion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConsignacion = new JList<Reporte>();
		this.jListColumnasValoresGraficoConsignacion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConsignacion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConsignacion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsignacion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConsignacion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConsignacion=new JScrollPane(this.jListColumnasValoresGraficoConsignacion);
			
			this.jScrollColumnasValoresGraficoConsignacion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsignacion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConsignacion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConsignacion.add(this.jListColumnasSelectReporteConsignacion, this.gridBagConstraintsConsignacion);
		this.jPanelReporteDinamicoConsignacion.add(this.jScrollColumnasValoresGraficoConsignacion, this.gridBagConstraintsConsignacion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConsignacion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConsignacion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelTiposGraficosReportesDinamicoConsignacion, this.gridBagConstraintsConsignacion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConsignacion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConsignacion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConsignacion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConsignacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsignacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConsignacion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jComboBoxTiposGraficosReportesDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConsignacion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConsignacion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelGenerarExcelReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConsignacion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConsignacion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConsignacion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConsignacion.setToolTipText("Generar EXCEL"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConsignacion = new GridBagConstraints();
		//this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConsignacion.add(this.jButtonGenerarExcelReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignacion.add(this.jComboBoxTiposReportesDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConsignacion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConsignacion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConsignacion.add(this.jLabelTiposArchivoReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignacion.add(this.jComboBoxTiposArchivosReportesDinamicoConsignacion, this.gridBagConstraintsConsignacion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConsignacion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConsignacion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConsignacion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConsignacion.setToolTipText("Generar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignacion.add(this.jButtonGenerarReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConsignacion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConsignacion.setToolTipText("Cancelar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConsignacion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConsignacion.add(this.jButtonCerrarReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConsignacion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConsignacion= new JScrollPane(jPanelReporteDinamicoConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConsignacion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsignacion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConsignacion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConsignacion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConsignacion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConsignacion);
		this.jInternalFrameReporteDinamicoConsignacion.getContentPane().add(this.jScrollPanelReporteDinamicoConsignacion, this.gridBagConstraintsConsignacion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConsignacion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConsignacion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConsignacion.setName("jPanelImportacionConsignacion"); 
		
		this.jPanelImportacionConsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConsignacion.setLayout(gridaBagLayoutImportacionConsignacion);
		
		
		this.jInternalFrameImportacionConsignacion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConsignacion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConsignacion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConsignacion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsignacion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsignacion.setResizable(true);
	    this.jInternalFrameImportacionConsignacion.setClosable(true);
	    this.jInternalFrameImportacionConsignacion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConsignacion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConsignacion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConsignacion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConsignacion.setResizable(true);
	    this.jInternalFrameImportacionConsignacion.setClosable(true);
	    this.jInternalFrameImportacionConsignacion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConsignacion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsignacion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConsignacion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConsignacion = new JLabelMe();

		this.jLabelArchivoImportacionConsignacion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsignacion.add(this.jLabelArchivoImportacionConsignacion, this.gridBagConstraintsConsignacion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConsignacion = new JFileChooser();		
		this.jFileChooserImportacionConsignacion.setToolTipText("ESCOGER ARCHIVO"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConsignacion = new JButtonMe();
		this.jButtonAbrirImportacionConsignacion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConsignacion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConsignacion.setToolTipText("Generar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignacion.add(this.jButtonAbrirImportacionConsignacion, this.gridBagConstraintsConsignacion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConsignacion = new JLabelMe();

		this.jLabelPathArchivoImportacionConsignacion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConsignacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsignacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConsignacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;		
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConsignacion.add(this.jLabelPathArchivoImportacionConsignacion, this.gridBagConstraintsConsignacion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConsignacion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConsignacion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsignacion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConsignacion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignacion.add(this.jTextFieldPathArchivoImportacionConsignacion, this.gridBagConstraintsConsignacion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConsignacion = new JButtonMe();
		this.jButtonGenerarImportacionConsignacion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConsignacion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConsignacion.setToolTipText("Generar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignacion.add(this.jButtonGenerarImportacionConsignacion, this.gridBagConstraintsConsignacion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConsignacion = new JButtonMe();
		this.jButtonCerrarImportacionConsignacion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConsignacion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConsignacion.setToolTipText("Cancelar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignacion.gridy = iPosYImportacion;
		this.gridBagConstraintsConsignacion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConsignacion.add(this.jButtonCerrarImportacionConsignacion, this.gridBagConstraintsConsignacion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConsignacion = new GridBagLayout();
		
		this.jScrollPanelImportacionConsignacion= new JScrollPane(jPanelImportacionConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConsignacion = new GridBagConstraints();
		this.gridBagConstraintsConsignacion.gridy =iPosYImportacion;
		this.gridBagConstraintsConsignacion.gridx =iPosXImportacion;
		this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConsignacion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConsignacion);
		this.jInternalFrameImportacionConsignacion.getContentPane().add(this.jScrollPanelImportacionConsignacion, this.gridBagConstraintsConsignacion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConsignacion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConsignacion = new JButtonMe();
			this.jButtonAbrirOrderByConsignacion.setText("Orden");
			this.jButtonAbrirOrderByConsignacion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConsignacion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConsignacion";
			inputMap = this.jButtonAbrirOrderByConsignacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConsignacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConsignacion"));
		
		
			GridBagLayout gridaBagLayoutOrderByConsignacion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConsignacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConsignacion.setName("jPanelOrderByConsignacion"); 
			
			this.jPanelOrderByConsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConsignacion.setLayout(gridaBagLayoutOrderByConsignacion);
			
			
			this.jTableDatosConsignacionOrderBy = new JTableMe();        
			this.jTableDatosConsignacionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConsignacionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConsignacionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConsignacionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConsignacionOrderBy.setViewportView(this.jTableDatosConsignacionOrderBy);
			this.jTableDatosConsignacionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConsignacionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConsignacion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConsignacion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConsignacion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConsignacion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConsignacion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConsignacion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConsignacion.setTitle("Orden");
			this.jInternalFrameOrderByConsignacion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConsignacion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConsignacion.setResizable(true);
			this.jInternalFrameOrderByConsignacion.setClosable(true);
			this.jInternalFrameOrderByConsignacion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConsignacion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsignacion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConsignacion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConsignacion.ipady =150;
				
			this.jPanelOrderByConsignacion.add(jScrollPanelDatosConsignacionOrderBy, this.gridBagConstraintsConsignacion);//this.jTableDatosConsignacionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConsignacion = new JButtonMe();
			this.jButtonCerrarOrderByConsignacion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConsignacion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConsignacion.setToolTipText("Cancelar"+" "+ConsignacionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConsignacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignacion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConsignacion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConsignacion.add(this.jButtonCerrarOrderByConsignacion, this.gridBagConstraintsConsignacion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConsignacion = new GridBagLayout();
			
			this.jScrollPanelOrderByConsignacion= new JScrollPane(jPanelOrderByConsignacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConsignacion = new GridBagConstraints();
			this.gridBagConstraintsConsignacion.gridy =iPosYOrderBy;
			this.gridBagConstraintsConsignacion.gridx =iPosXOrderBy;
			this.gridBagConstraintsConsignacion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConsignacion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConsignacion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConsignacion);
			
			this.jInternalFrameOrderByConsignacion.getContentPane().add(this.jScrollPanelOrderByConsignacion, this.gridBagConstraintsConsignacion);			
		
		} else {
			this.jButtonAbrirOrderByConsignacion = new JButtonMe();
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
		int iWidthTableCalculado=0;//8330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=3130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.consignacionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConsignacion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConsignacion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConsignacion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConsignacion.getRowHeight();//ConsignacionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsignacion.isSelected()) {
					iHeightTable=ConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConsignacion.isSelected()) {
					iHeightTable=ConsignacionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConsignacionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConsignacion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsignacion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConsignacion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConsignacion!=null && this.jInternalFrameOrderByConsignacion.getjTableDatosOrderBy()!=null) {
			//if(!this.consignacionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConsignacion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConsignacion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConsignacion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConsignacion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConsignacion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConsignacion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConsignacion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConsignacion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsignacion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConsignacion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=consignacionLogic.getConsignacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consignacions.size();
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
	public static List<Consignacion> TraerConsignacionBeans(List<Consignacion> consignacions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Consignacion consignacion:consignacions) {
					
				if(!(ConsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConsignacionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					consignacion.setsDetalleGeneralEntityReporte(ConsignacionConstantesFunciones.getConsignacionDescripcion(consignacion));
										
						
					
					

					if(consignacion.getDetalleConsignacions()!=null && Funciones.existeClass(classes,DetalleConsignacion.class)) {
						try{consignacion.setdetalleconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(DetalleConsignacionJInternalFrame.TraerDetalleConsignacionBeans(consignacion.getDetalleConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//consignacion.setsDetalleGeneralEntityReporte(consignacion.getsDetalleGeneralEntityReporte());
										
				}
				
				//consignacionbeans.add(consignacionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return consignacions;
    }
	//PARA REPORTES FIN
}
