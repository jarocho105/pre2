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
import com.bydan.erp.facturacion.util.PedidoExporConstantesFunciones;

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
public class PedidoExporJInternalFrame extends PedidoExporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPedidoExpor;
	
	protected JMenuBar jmenuBarPedidoExpor;
	
	protected JMenu jmenuPedidoExpor;
	protected JMenu jmenuDatosPedidoExpor;
	protected JMenu jmenuArchivoPedidoExpor;
	protected JMenu jmenuAccionesPedidoExpor;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPedidoExpor;	
	protected GridBagConstraints gridBagConstraintsPedidoExpor;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PedidoExporDetalleFormJInternalFrame jInternalFrameDetalleFormPedidoExpor;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPedidoExpor;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPedidoExpor;	
	
	
	
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

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoexporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoexpor="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public PedidoExporSessionBean pedidoexporSessionBean;
		
	
	
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
	public PaisSessionBean paisSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public ConsignatarioSessionBean consignatarioSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public EstadoPedidoSessionBean estadopedidoexporSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PedidoExpor> pedidoexpors;		
	public List<PedidoExpor> pedidoexporsEliminados;	
	public List<PedidoExpor> pedidoexporsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPedidoExpor;		
	protected JButton jButtonAbrirOrderByPedidoExpor;
	
	
	//protected JPanel jPanelOrderByPedidoExpor;
	//public JScrollPane jScrollPanelOrderByPedidoExpor;	
	//protected JButton jButtonCerrarOrderByPedidoExpor;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PedidoExporLogic pedidoexporLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPedidoExpor;
	public JScrollPane jScrollPanelDatosEdicionPedidoExpor;
	public JScrollPane jScrollPanelDatosGeneralPedidoExpor;
    
	
	
	//public JScrollPane jScrollPanelDatosPedidoExporOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPedidoExpor;
	//public JScrollPane jScrollPanelImportacionPedidoExpor;
	
	
	
	protected JPanel jPanelAccionesPedidoExpor;
	
    protected JPanel jPanelPaginacionPedidoExpor;
    protected JPanel jPanelParametrosReportesPedidoExpor;
	protected JPanel jPanelParametrosReportesAccionesPedidoExpor;
	
	
	
	
	
	

	protected JPanel jPanelCamposFintotalPedidoExpor;
	protected Integer iXPanelCamposFintotalPedidoExpor=0;
	protected Integer iYPanelCamposFintotalPedidoExpor=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PedidoExpor;
	protected JPanel jPanelParametrosAuxiliar2PedidoExpor;
	protected JPanel jPanelParametrosAuxiliar3PedidoExpor;
	protected JPanel jPanelParametrosAuxiliar4PedidoExpor;
	//protected JPanel jPanelParametrosAuxiliar5PedidoExpor;
	
	
	
	//protected JPanel jPanelReporteDinamicoPedidoExpor;
	//protected JPanel jPanelImportacionPedidoExpor;
	
	
	public JTable jTableDatosPedidoExpor;
	
	
	
	//public JTable jTableDatosPedidoExporOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPedidoExpor;
	protected JButton jButtonDuplicarPedidoExpor;
	protected JButton jButtonCopiarPedidoExpor;
	protected JButton jButtonVerFormPedidoExpor;
	protected JButton jButtonNuevoRelacionesPedidoExpor;
	protected JButton jButtonModificarPedidoExpor;
	
    protected JButton jButtonGuardarCambiosTablaPedidoExpor;
	protected JButton jButtonCerrarPedidoExpor;
	
	
	protected JButton jButtonRecargarInformacionPedidoExpor;
	protected JButton jButtonProcesarInformacionPedidoExpor;
	
	
	protected JButton jButtonAnterioresPedidoExpor;
	protected JButton jButtonSiguientesPedidoExpor;
	protected JButton jButtonNuevoGuardarCambiosPedidoExpor;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPedidoExpor;
	//protected JButton jButtonCerrarReporteDinamicoPedidoExpor;
	//protected JButton jButtonGenerarExcelReporteDinamicoPedidoExpor;	
	
	
	
	//protected JButton jButtonAbrirImportacionPedidoExpor;
	//protected JButton jButtonGenerarImportacionPedidoExpor;
	//protected JButton jButtonCerrarImportacionPedidoExpor;
	//protected JFileChooser jFileChooserImportacionPedidoExpor;
	//protected File fileImportacionPedidoExpor;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPedidoExpor;
	protected JButton jButtonDuplicarToolBarPedidoExpor;
	protected JButton jButtonNuevoRelacionesToolBarPedidoExpor;
	
	
	public JButton jButtonGuardarCambiosToolBarPedidoExpor;
	protected JButton jButtonCopiarToolBarPedidoExpor;
	protected JButton jButtonVerFormToolBarPedidoExpor;
	public JButton jButtonGuardarCambiosTablaToolBarPedidoExpor;
	protected JButton jButtonMostrarOcultarTablaToolBarPedidoExpor;
	protected JButton jButtonCerrarToolBarPedidoExpor;
	
	protected JButton jButtonRecargarInformacionToolBarPedidoExpor;
	protected JButton jButtonProcesarInformacionToolBarPedidoExpor;
	protected JButton jButtonAnterioresToolBarPedidoExpor;
	protected JButton jButtonSiguientesToolBarPedidoExpor;
	protected JButton jButtonNuevoGuardarCambiosToolBarPedidoExpor;
	protected JButton jButtonAbrirOrderByToolBarPedidoExpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPedidoExpor;
	protected JMenuItem jMenuItemDuplicarPedidoExpor;
	protected JMenuItem jMenuItemNuevoRelacionesPedidoExpor;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPedidoExpor;
	protected JMenuItem jMenuItemCopiarPedidoExpor;
	protected JMenuItem jMenuItemVerFormPedidoExpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaPedidoExpor;
	protected JMenuItem jMenuItemCerrarPedidoExpor;
	protected JMenuItem jMenuItemDetalleCerrarPedidoExpor;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPedidoExpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarPedidoExpor;
	
	protected JMenuItem jMenuItemRecargarInformacionPedidoExpor;
	protected JMenuItem jMenuItemProcesarInformacionPedidoExpor;
	protected JMenuItem jMenuItemAnterioresPedidoExpor;
	protected JMenuItem jMenuItemSiguientesPedidoExpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPedidoExpor;
	protected JMenuItem jMenuItemAbrirOrderByPedidoExpor;
	protected JMenuItem jMenuItemMostrarOcultarPedidoExpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPedidoExpor;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPedidoExpor;
	protected JCheckBox jCheckBoxSeleccionadosPedidoExpor;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPedidoExpor;
	protected JCheckBox jCheckBoxConGraficoReportePedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPedidoExpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoExpor;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPedidoExpor;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPedidoExpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPedidoExpor;
	protected JTextField jTextFieldValorCampoGeneralPedidoExpor;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePedidoExpor;
	//public JList<Reporte> jListColumnasSelectReportePedidoExpor;
	//public JScrollPane jScrollColumnasSelectReportePedidoExpor;
	
	//public JLabel jLabelRelacionesSelectReportePedidoExpor;
	//public JList<Reporte> jListRelacionesSelectReportePedidoExpor;
	//public JScrollPane jScrollRelacionesSelectReportePedidoExpor;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPedidoExpor;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPedidoExpor;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPedidoExpor;
	//public JLabel jLabelTiposArchivoReporteDinamicoPedidoExpor;
	
		
	//public JLabel jLabelArchivoImportacionPedidoExpor;	
	//public JLabel jLabelPathArchivoImportacionPedidoExpor;
	//protected JTextField jTextFieldPathArchivoImportacionPedidoExpor;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPedidoExpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPedidoExpor;
	
	//public JLabel jLabelColumnaCategoriaValorPedidoExpor;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPedidoExpor;
	
	//public JLabel jLabelColumnasValoresGraficoPedidoExpor;
	//public JList<Reporte> jListColumnasValoresGraficoPedidoExpor;
	//public JScrollPane jScrollColumnasValoresGraficoPedidoExpor;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPedidoExpor;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPedidoExpor;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPedidoExpor;
	public JPanel jPanelFK_IdCentroCostoPedidoExpor;
	public JButton jButtonFK_IdCentroCostoPedidoExpor;
	public JPanel jPanelFK_IdClientePedidoExpor;
	public JButton jButtonFK_IdClientePedidoExpor;
	public JPanel jPanelFK_IdConsignatarioPedidoExpor;
	public JButton jButtonFK_IdConsignatarioPedidoExpor;
	public JPanel jPanelFK_IdConsultorPedidoExpor;
	public JButton jButtonFK_IdConsultorPedidoExpor;
	public JPanel jPanelFK_IdEmpleadoPedidoExpor;
	public JButton jButtonFK_IdEmpleadoPedidoExpor;
	public JPanel jPanelFK_IdEstadoPedidoExporPedidoExpor;
	public JButton jButtonFK_IdEstadoPedidoExporPedidoExpor;
	public JPanel jPanelFK_IdFormatoPedidoExpor;
	public JButton jButtonFK_IdFormatoPedidoExpor;
	public JPanel jPanelFK_IdPaisPedidoExpor;
	public JButton jButtonFK_IdPaisPedidoExpor;
	public JPanel jPanelFK_IdResponsablePedidoExpor;
	public JButton jButtonFK_IdResponsablePedidoExpor;
	public JPanel jPanelFK_IdSubClientePedidoExpor;
	public JButton jButtonFK_IdSubClientePedidoExpor;
	public JPanel jPanelFK_IdTipoCambioPedidoExpor;
	public JButton jButtonFK_IdTipoCambioPedidoExpor;
	public JPanel jPanelFK_IdTipoPrecioPedidoExpor;
	public JButton jButtonFK_IdTipoPrecioPedidoExpor;
	public JPanel jPanelFK_IdTransportePedidoExpor;
	public JButton jButtonFK_IdTransportePedidoExpor;
	public JPanel jPanelFK_IdTransportistaPedidoExpor;
	public JButton jButtonFK_IdTransportistaPedidoExpor;
	public JPanel jPanelFK_IdVendedorPedidoExpor;
	public JButton jButtonFK_IdVendedorPedidoExpor;
	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoPedidoExpor;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor;
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoExpor= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoExporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPedidoExporArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor;
	
	public JPanel jPanelid_clienteFK_IdClientePedidoExpor;
	public JLabel jLabelid_clienteFK_IdClientePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePedidoExpor;
	public JButton jButtonid_clienteFK_IdClientePedidoExpor= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePedidoExporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePedidoExpor;
	
	public JPanel jPanelid_consignatarioFK_IdConsignatarioPedidoExpor;
	public JLabel jLabelid_consignatarioFK_IdConsignatarioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor;
	public JButton jButtonid_consignatarioFK_IdConsignatarioPedidoExpor= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioFK_IdConsignatarioPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_consultorFK_IdConsultorPedidoExpor;
	public JLabel jLabelid_consultorFK_IdConsultorPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorFK_IdConsultorPedidoExpor;
	public JButton jButtonid_consultorFK_IdConsultorPedidoExpor= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_consultorFK_IdConsultorPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoFK_IdEmpleadoPedidoExpor;
	public JLabel jLabelid_empleadoFK_IdEmpleadoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor;
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoExpor= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFK_IdEmpleadoPedidoExporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor;
	
	public JPanel jPanelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor;
	public JLabel jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor;
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoExporPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedidoFK_IdEstadoPedidoExporPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_formatoFK_IdFormatoPedidoExpor;
	public JLabel jLabelid_formatoFK_IdFormatoPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFK_IdFormatoPedidoExpor;
	public JButton jButtonid_formatoFK_IdFormatoPedidoExpor= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_formatoFK_IdFormatoPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisPedidoExpor;
	public JLabel jLabelid_paisFK_IdPaisPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisPedidoExpor;
	public JButton jButtonid_paisFK_IdPaisPedidoExpor= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_responsableFK_IdResponsablePedidoExpor;
	public JLabel jLabelid_responsableFK_IdResponsablePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFK_IdResponsablePedidoExpor;
	public JButton jButtonid_responsableFK_IdResponsablePedidoExpor= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsablePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_responsableFK_IdResponsablePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sub_clienteFK_IdSubClientePedidoExpor;
	public JLabel jLabelid_sub_clienteFK_IdSubClientePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor;
	public JButton jButtonid_sub_clienteFK_IdSubClientePedidoExpor= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClientePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFK_IdSubClientePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_cambioFK_IdTipoCambioPedidoExpor;
	public JLabel jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor;
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedidoExpor= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFK_IdTipoCambioPedidoExporBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor;
	
	public JPanel jPanelid_tipo_precioFK_IdTipoPrecioPedidoExpor;
	public JLabel jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor;
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoExpor= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFK_IdTipoPrecioPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transporteFK_IdTransportePedidoExpor;
	public JLabel jLabelid_transporteFK_IdTransportePedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFK_IdTransportePedidoExpor;
	public JButton jButtonid_transporteFK_IdTransportePedidoExpor= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_transporteFK_IdTransportePedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transportistaFK_IdTransportistaPedidoExpor;
	public JLabel jLabelid_transportistaFK_IdTransportistaPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFK_IdTransportistaPedidoExpor;
	public JButton jButtonid_transportistaFK_IdTransportistaPedidoExpor= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFK_IdTransportistaPedidoExporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_vendedorFK_IdVendedorPedidoExpor;
	public JLabel jLabelid_vendedorFK_IdVendedorPedidoExpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFK_IdVendedorPedidoExpor;
	public JButton jButtonid_vendedorFK_IdVendedorPedidoExpor= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoExporUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoExporBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFK_IdVendedorPedidoExporArbol= new JButtonMe();

	public JButton jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor;
	
	
	
	
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
	public PedidoExporJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PedidoExporJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPedidoExpor)	{
		this.jButtonRecargarInformacionPedidoExpor = jButtonRecargarInformacionPedidoExpor;
	}
	
	public JButton getjButtonProcesarInformacionPedidoExpor() {
		return this.jButtonProcesarInformacionPedidoExpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPedidoExpor)	{
		this.jButtonProcesarInformacionPedidoExpor = jButtonProcesarInformacionPedidoExpor;
	}
	
	
	public JButton getjButtonRecargarInformacionPedidoExpor() {
		return this.jButtonRecargarInformacionPedidoExpor;
	}
	
	
	public List<PedidoExpor> getpedidoexpors() {
		return this.pedidoexpors;
	}

	public void setpedidoexpors(List<PedidoExpor> pedidoexpors) {
		this.pedidoexpors = pedidoexpors;
	}
	
	public List<PedidoExpor> getpedidoexporsAux() {
		return this.pedidoexporsAux;
	}

	public void setpedidoexporsAux(List<PedidoExpor> pedidoexporsAux) {
		this.pedidoexporsAux = pedidoexporsAux;
	}
	
	public List<PedidoExpor> getpedidoexporsEliminados() {
		return this.pedidoexporsEliminados;
	}

	public void setPedidoExporsEliminados(List<PedidoExpor> pedidoexporsEliminados) {
		this.pedidoexporsEliminados = pedidoexporsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPedidoExpor() {
		return jComboBoxTiposSeleccionarPedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPedidoExpor(
			JComboBox jComboBoxTiposSeleccionarPedidoExpor) {
		this.jComboBoxTiposSeleccionarPedidoExpor = jComboBoxTiposSeleccionarPedidoExpor;
	}
	
	public void setBorderResaltarTiposSeleccionarPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPedidoExpor .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPedidoExpor() {
		return jTextFieldValorCampoGeneralPedidoExpor;
	}

	public void setjTextFieldValorCampoGeneralPedidoExpor(
			JTextField jTextFieldValorCampoGeneralPedidoExpor) {
		this.jTextFieldValorCampoGeneralPedidoExpor = jTextFieldValorCampoGeneralPedidoExpor;
	}

	public void setBorderResaltarValorCampoGeneralPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPedidoExpor .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPedidoExpor() {
		return this.jCheckBoxSeleccionarTodosPedidoExpor;
	}

	public void setjCheckBoxSeleccionarTodosPedidoExpor(
			JCheckBox jCheckBoxSeleccionarTodosPedidoExpor) {
		this.jCheckBoxSeleccionarTodosPedidoExpor = jCheckBoxSeleccionarTodosPedidoExpor;
	}

	public void setBorderResaltarSeleccionarTodosPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPedidoExpor .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPedidoExpor() {
		return this.jCheckBoxSeleccionadosPedidoExpor;
	}

	public void setjCheckBoxSeleccionadosPedidoExpor(
			JCheckBox jCheckBoxSeleccionadosPedidoExpor) {
		this.jCheckBoxSeleccionadosPedidoExpor = jCheckBoxSeleccionadosPedidoExpor;
	}
	
	public void setBorderResaltarSeleccionadosPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPedidoExpor .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPedidoExpor() {
		return this.jComboBoxTiposArchivosReportesPedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPedidoExpor(
			JComboBox jComboBoxTiposArchivosReportesPedidoExpor) {
		this.jComboBoxTiposArchivosReportesPedidoExpor = jComboBoxTiposArchivosReportesPedidoExpor;
	}

	public void setBorderResaltarTiposArchivosReportesPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPedidoExpor() {
		return this.jComboBoxTiposReportesPedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPedidoExpor(
			JComboBox jComboBoxTiposReportesPedidoExpor) {
		this.jComboBoxTiposReportesPedidoExpor = jComboBoxTiposReportesPedidoExpor;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPedidoExpor() {
	//	return jComboBoxTiposReportesDinamicoPedidoExpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPedidoExpor(
	//		JComboBox jComboBoxTiposReportesDinamicoPedidoExpor) {
	//	this.jComboBoxTiposReportesDinamicoPedidoExpor = jComboBoxTiposReportesDinamicoPedidoExpor;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPedidoExpor() {
	//	return jComboBoxTiposArchivosReportesDinamicoPedidoExpor;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPedidoExpor(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPedidoExpor) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor = jComboBoxTiposArchivosReportesDinamicoPedidoExpor;
	//}
	
	public void setBorderResaltarTiposReportesPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPedidoExpor() {
		return this.jComboBoxTiposGraficosReportesPedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPedidoExpor(
			JComboBox jComboBoxTiposGraficosReportesPedidoExpor) {
		this.jComboBoxTiposGraficosReportesPedidoExpor = jComboBoxTiposGraficosReportesPedidoExpor;
	}
	
	public void setBorderResaltarTiposGraficosReportesPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPedidoExpor() {
		return this.jComboBoxTiposPaginacionPedidoExpor;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPedidoExpor(
			JComboBox jComboBoxTiposPaginacionPedidoExpor) {
		this.jComboBoxTiposPaginacionPedidoExpor = jComboBoxTiposPaginacionPedidoExpor;
	}
	
	public void setBorderResaltarTiposPaginacionPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPedidoExpor .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPedidoExpor() {
		return this.jComboBoxTiposRelacionesPedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPedidoExpor() {
		return this.jComboBoxTiposAccionesPedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPedidoExpor(
			JComboBox jComboBoxTiposRelacionesPedidoExpor) {
		this.jComboBoxTiposRelacionesPedidoExpor = jComboBoxTiposRelacionesPedidoExpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPedidoExpor(
			JComboBox jComboBoxTiposAccionesPedidoExpor) {
		this.jComboBoxTiposAccionesPedidoExpor = jComboBoxTiposAccionesPedidoExpor;
	}
	
	public void setBorderResaltarTiposRelacionesPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPedidoExpor .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPedidoExpor() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPedidoExpor .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPedidoExpor() {
	//	return jCheckBoxConGraficoDinamicoPedidoExpor;
	//}

	//public void setjCheckBoxConGraficoDinamicoPedidoExpor(
	//		JCheckBox jCheckBoxConGraficoDinamicoPedidoExpor) {
	//	this.jCheckBoxConGraficoDinamicoPedidoExpor = jCheckBoxConGraficoDinamicoPedidoExpor;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPedidoExpor() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPedidoExpor.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPedidoExpor .setBorder(borderResaltar);		
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
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		
		this.pedidoexporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pedidoexporSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PedidoExporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pedido Exportacion MANTENIMIENTO"));
		
		
		if(iWidth > 4350) {
			iWidth=4350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
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
		
		PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PedidoExpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPedidoExpor= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"nuevo","nuevo","Nuevo"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"duplicar","duplicar","Duplicar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"copiar","copiar","Copiar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"ver_form","ver_form","Ver"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"recargar","recargar","Recargar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPedidoExpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPedidoExpor,this.jTtoolBarPedidoExpor,
							"cerrar","cerrar","Salir"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPedidoExpor=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPedidoExpor;
			
				this.jButtonProcesarInformacionToolBarPedidoExpor=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPedidoExpor;
				
		//protected JButton jButtonModificarToolBarPedidoExpor;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPedidoExpor=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPedidoExpor=new JMenuMe("General");
		this.jmenuArchivoPedidoExpor=new JMenuMe("Archivo");
		this.jmenuAccionesPedidoExpor=new JMenuMe("Acciones");
		this.jmenuDatosPedidoExpor=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPedidoExpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPedidoExpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPedidoExpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPedidoExpor= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPedidoExpor.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPedidoExpor,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPedidoExpor= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPedidoExpor.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPedidoExpor,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPedidoExpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPedidoExpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPedidoExpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPedidoExpor= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPedidoExpor.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPedidoExpor,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPedidoExpor= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPedidoExpor.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPedidoExpor,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPedidoExpor= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPedidoExpor.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPedidoExpor,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPedidoExpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPedidoExpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPedidoExpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPedidoExpor= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPedidoExpor.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPedidoExpor,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPedidoExpor= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPedidoExpor.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPedidoExpor,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPedidoExpor= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPedidoExpor.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPedidoExpor,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPedidoExpor= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPedidoExpor.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPedidoExpor,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPedidoExpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPedidoExpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPedidoExpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPedidoExpor= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPedidoExpor.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPedidoExpor,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPedidoExpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPedidoExpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPedidoExpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPedidoExpor= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPedidoExpor.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPedidoExpor,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPedidoExpor.add(this.jMenuItemCerrarPedidoExpor);
			
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemNuevoPedidoExpor);
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemNuevoGuardarCambiosPedidoExpor);
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemNuevoRelacionesPedidoExpor);
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemGuardarCambiosTablaPedidoExpor);		
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemDuplicarPedidoExpor);		
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemCopiarPedidoExpor);		
			this.jmenuAccionesPedidoExpor.add(this.jMenuItemVerFormPedidoExpor);		
			
			this.jmenuDatosPedidoExpor.add(this.jMenuItemRecargarInformacionPedidoExpor);				
			this.jmenuDatosPedidoExpor.add(this.jMenuItemAnterioresPedidoExpor);				
			this.jmenuDatosPedidoExpor.add(this.jMenuItemSiguientesPedidoExpor);				
			this.jmenuDatosPedidoExpor.add(this.jMenuItemAbrirOrderByPedidoExpor);				
			this.jmenuDatosPedidoExpor.add(this.jMenuItemMostrarOcultarPedidoExpor);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPedidoExpor.add(this.jMenuItemGuardarCambiosPedidoExpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPedidoExpor.add(this.jmenuArchivoPedidoExpor);		
			this.jmenuBarPedidoExpor.add(this.jmenuAccionesPedidoExpor);		
			this.jmenuBarPedidoExpor.add(this.jmenuDatosPedidoExpor);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPedidoExpor);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPedidoExpor() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdCentroCostoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoPedidoExpor.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoPedidoExpor= new JButtonMe();
		this.jButtonFK_IdCentroCostoPedidoExpor.setText("Buscar");
		this.jButtonFK_IdCentroCostoPedidoExpor.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoPedidoExpor,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor.setFocusable(false);

		this.jPanelFK_IdClientePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePedidoExpor.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePedidoExpor= new JButtonMe();
		this.jButtonFK_IdClientePedidoExpor.setText("Buscar");
		this.jButtonFK_IdClientePedidoExpor.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePedidoExpor,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePedidoExpor = new JLabelMe();
		jLabelid_clienteFK_IdClientePedidoExpor.setText("Cliente :");
		jLabelid_clienteFK_IdClientePedidoExpor.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePedidoExpor= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePedidoExpor.setFocusable(false);

		this.jPanelFK_IdConsignatarioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsignatarioPedidoExpor.setToolTipText("Buscar Por Consignatario ");
		this.jButtonFK_IdConsignatarioPedidoExpor= new JButtonMe();
		this.jButtonFK_IdConsignatarioPedidoExpor.setText("Buscar");
		this.jButtonFK_IdConsignatarioPedidoExpor.setToolTipText("Buscar Por Consignatario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsignatarioPedidoExpor,"buscar_button","Buscar Por Consignatario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsignatarioPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor = new JLabelMe();
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor.setText("Consignatario :");
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor.setToolTipText("Consignatario");
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consignatarioFK_IdConsignatarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioFK_IdConsignatarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor= new JComboBoxMe();
		jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdConsultorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdConsultorPedidoExpor.setToolTipText("Buscar Por Consultor ");
		this.jButtonFK_IdConsultorPedidoExpor= new JButtonMe();
		this.jButtonFK_IdConsultorPedidoExpor.setText("Buscar");
		this.jButtonFK_IdConsultorPedidoExpor.setToolTipText("Buscar Por Consultor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdConsultorPedidoExpor,"buscar_button","Buscar Por Consultor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdConsultorPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_consultorFK_IdConsultorPedidoExpor = new JLabelMe();
		jLabelid_consultorFK_IdConsultorPedidoExpor.setText("Consultor :");
		jLabelid_consultorFK_IdConsultorPedidoExpor.setToolTipText("Consultor");
		jLabelid_consultorFK_IdConsultorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_consultorFK_IdConsultorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_consultorFK_IdConsultorPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_consultorFK_IdConsultorPedidoExpor= new JComboBoxMe();
		jComboBoxid_consultorFK_IdConsultorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorFK_IdConsultorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorFK_IdConsultorPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEmpleadoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEmpleadoPedidoExpor.setToolTipText("Buscar Por Empleado ");
		this.jButtonFK_IdEmpleadoPedidoExpor= new JButtonMe();
		this.jButtonFK_IdEmpleadoPedidoExpor.setText("Buscar");
		this.jButtonFK_IdEmpleadoPedidoExpor.setToolTipText("Buscar Por Empleado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEmpleadoPedidoExpor,"buscar_button","Buscar Por Empleado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEmpleadoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor = new JLabelMe();
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor.setText("Empleado :");
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor.setToolTipText("Empleado");
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_empleadoFK_IdEmpleadoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFK_IdEmpleadoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor= new JComboBoxMe();
		jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor.setFocusable(false);

		this.jPanelFK_IdEstadoPedidoExporPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPedidoExporPedidoExpor.setToolTipText("Buscar Por Estado ");
		this.jButtonFK_IdEstadoPedidoExporPedidoExpor= new JButtonMe();
		this.jButtonFK_IdEstadoPedidoExporPedidoExpor.setText("Buscar");
		this.jButtonFK_IdEstadoPedidoExporPedidoExpor.setToolTipText("Buscar Por Estado ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPedidoExporPedidoExpor,"buscar_button","Buscar Por Estado ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPedidoExporPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor = new JLabelMe();
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setText("Estado :");
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setToolTipText("Estado");
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor= new JComboBoxMe();
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFormatoPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFormatoPedidoExpor.setToolTipText("Buscar Por Formato ");
		this.jButtonFK_IdFormatoPedidoExpor= new JButtonMe();
		this.jButtonFK_IdFormatoPedidoExpor.setText("Buscar");
		this.jButtonFK_IdFormatoPedidoExpor.setToolTipText("Buscar Por Formato ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFormatoPedidoExpor,"buscar_button","Buscar Por Formato ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFormatoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_formatoFK_IdFormatoPedidoExpor = new JLabelMe();
		jLabelid_formatoFK_IdFormatoPedidoExpor.setText("Formato :");
		jLabelid_formatoFK_IdFormatoPedidoExpor.setToolTipText("Formato");
		jLabelid_formatoFK_IdFormatoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_formatoFK_IdFormatoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFK_IdFormatoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_formatoFK_IdFormatoPedidoExpor= new JComboBoxMe();
		jComboBoxid_formatoFK_IdFormatoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFK_IdFormatoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFK_IdFormatoPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisPedidoExpor.setToolTipText("Buscar Por Origen ");
		this.jButtonFK_IdPaisPedidoExpor= new JButtonMe();
		this.jButtonFK_IdPaisPedidoExpor.setText("Buscar");
		this.jButtonFK_IdPaisPedidoExpor.setToolTipText("Buscar Por Origen ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisPedidoExpor,"buscar_button","Buscar Por Origen ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisPedidoExpor = new JLabelMe();
		jLabelid_paisFK_IdPaisPedidoExpor.setText("Origen :");
		jLabelid_paisFK_IdPaisPedidoExpor.setToolTipText("Origen");
		jLabelid_paisFK_IdPaisPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisPedidoExpor= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdResponsablePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdResponsablePedidoExpor.setToolTipText("Buscar Por Responsable ");
		this.jButtonFK_IdResponsablePedidoExpor= new JButtonMe();
		this.jButtonFK_IdResponsablePedidoExpor.setText("Buscar");
		this.jButtonFK_IdResponsablePedidoExpor.setToolTipText("Buscar Por Responsable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdResponsablePedidoExpor,"buscar_button","Buscar Por Responsable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdResponsablePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_responsableFK_IdResponsablePedidoExpor = new JLabelMe();
		jLabelid_responsableFK_IdResponsablePedidoExpor.setText("Responsable :");
		jLabelid_responsableFK_IdResponsablePedidoExpor.setToolTipText("Responsable");
		jLabelid_responsableFK_IdResponsablePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsablePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_responsableFK_IdResponsablePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFK_IdResponsablePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_responsableFK_IdResponsablePedidoExpor= new JComboBoxMe();
		jComboBoxid_responsableFK_IdResponsablePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsablePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFK_IdResponsablePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFK_IdResponsablePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdSubClientePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdSubClientePedidoExpor.setToolTipText("Buscar Por Contacto ");
		this.jButtonFK_IdSubClientePedidoExpor= new JButtonMe();
		this.jButtonFK_IdSubClientePedidoExpor.setText("Buscar");
		this.jButtonFK_IdSubClientePedidoExpor.setToolTipText("Buscar Por Contacto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdSubClientePedidoExpor,"buscar_button","Buscar Por Contacto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdSubClientePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor = new JLabelMe();
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor.setText("Contacto :");
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor.setToolTipText("Contacto");
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_sub_clienteFK_IdSubClientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFK_IdSubClientePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor= new JComboBoxMe();
		jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoCambioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoCambioPedidoExpor.setToolTipText("Buscar Por Tipo Cambio ");
		this.jButtonFK_IdTipoCambioPedidoExpor= new JButtonMe();
		this.jButtonFK_IdTipoCambioPedidoExpor.setText("Buscar");
		this.jButtonFK_IdTipoCambioPedidoExpor.setToolTipText("Buscar Por Tipo Cambio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoCambioPedidoExpor,"buscar_button","Buscar Por Tipo Cambio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoCambioPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor = new JLabelMe();
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor.setText("Tipo Cambio :");
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor.setToolTipText("Tipo Cambio");
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor= new JComboBoxMe();
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor.setFocusable(false);

		this.jPanelFK_IdTipoPrecioPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPrecioPedidoExpor.setToolTipText("Buscar Por Tipo Precio ");
		this.jButtonFK_IdTipoPrecioPedidoExpor= new JButtonMe();
		this.jButtonFK_IdTipoPrecioPedidoExpor.setText("Buscar");
		this.jButtonFK_IdTipoPrecioPedidoExpor.setToolTipText("Buscar Por Tipo Precio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPrecioPedidoExpor,"buscar_button","Buscar Por Tipo Precio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPrecioPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor = new JLabelMe();
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor.setText("Tipo Precio :");
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor.setToolTipText("Tipo Precio");
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor= new JComboBoxMe();
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportePedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportePedidoExpor.setToolTipText("Buscar Por Transporte ");
		this.jButtonFK_IdTransportePedidoExpor= new JButtonMe();
		this.jButtonFK_IdTransportePedidoExpor.setText("Buscar");
		this.jButtonFK_IdTransportePedidoExpor.setToolTipText("Buscar Por Transporte ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportePedidoExpor,"buscar_button","Buscar Por Transporte ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transporteFK_IdTransportePedidoExpor = new JLabelMe();
		jLabelid_transporteFK_IdTransportePedidoExpor.setText("Transporte :");
		jLabelid_transporteFK_IdTransportePedidoExpor.setToolTipText("Transporte");
		jLabelid_transporteFK_IdTransportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transporteFK_IdTransportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFK_IdTransportePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transporteFK_IdTransportePedidoExpor= new JComboBoxMe();
		jComboBoxid_transporteFK_IdTransportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFK_IdTransportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFK_IdTransportePedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransportistaPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransportistaPedidoExpor.setToolTipText("Buscar Por Transportista ");
		this.jButtonFK_IdTransportistaPedidoExpor= new JButtonMe();
		this.jButtonFK_IdTransportistaPedidoExpor.setText("Buscar");
		this.jButtonFK_IdTransportistaPedidoExpor.setToolTipText("Buscar Por Transportista ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransportistaPedidoExpor,"buscar_button","Buscar Por Transportista ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransportistaPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transportistaFK_IdTransportistaPedidoExpor = new JLabelMe();
		jLabelid_transportistaFK_IdTransportistaPedidoExpor.setText("Transportista :");
		jLabelid_transportistaFK_IdTransportistaPedidoExpor.setToolTipText("Transportista");
		jLabelid_transportistaFK_IdTransportistaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transportistaFK_IdTransportistaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFK_IdTransportistaPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transportistaFK_IdTransportistaPedidoExpor= new JComboBoxMe();
		jComboBoxid_transportistaFK_IdTransportistaPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFK_IdTransportistaPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFK_IdTransportistaPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdVendedorPedidoExpor=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdVendedorPedidoExpor.setToolTipText("Buscar Por Vendedor ");
		this.jButtonFK_IdVendedorPedidoExpor= new JButtonMe();
		this.jButtonFK_IdVendedorPedidoExpor.setText("Buscar");
		this.jButtonFK_IdVendedorPedidoExpor.setToolTipText("Buscar Por Vendedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdVendedorPedidoExpor,"buscar_button","Buscar Por Vendedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdVendedorPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_vendedorFK_IdVendedorPedidoExpor = new JLabelMe();
		jLabelid_vendedorFK_IdVendedorPedidoExpor.setText("Vendedor :");
		jLabelid_vendedorFK_IdVendedorPedidoExpor.setToolTipText("Vendedor");
		jLabelid_vendedorFK_IdVendedorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_vendedorFK_IdVendedorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFK_IdVendedorPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_vendedorFK_IdVendedorPedidoExpor= new JComboBoxMe();
		jComboBoxid_vendedorFK_IdVendedorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFK_IdVendedorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFK_IdVendedorPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor= new JButtonMe();
		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor.setFocusable(false);


		this.jTabbedPaneBusquedasPedidoExpor=new JTabbedPane();


		this.jTabbedPaneBusquedasPedidoExpor.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedidoExpor.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasPedidoExpor.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePedidoExpor = new PedidoExporDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pedido Exportacion DATOS");
			this.jInternalFrameDetalleFormPedidoExpor = new PedidoExporDetalleFormJInternalFrame(jDesktopPane,this.pedidoexporSessionBean.getConGuardarRelaciones(),this.pedidoexporSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPedidoExpor = null;//new PedidoExporDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPedidoExpor= new GridBagLayout();
		
		
		this.jTableDatosPedidoExpor = new JTableMe();      
		
		String sToolTipPedidoExpor="";
		sToolTipPedidoExpor=PedidoExporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPedidoExpor+="(Facturacion.PedidoExpor)";
		}
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
			sToolTipPedidoExpor+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPedidoExpor.setToolTipText(sToolTipPedidoExpor);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPedidoExpor);
		this.jTableDatosPedidoExpor.setAutoCreateRowSorter(true);
		this.jTableDatosPedidoExpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPedidoExpor.setRowSelectionAllowed(true);
		this.jTableDatosPedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPedidoExpor,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPedidoExpor = new JButtonMe();
		this.jButtonDuplicarPedidoExpor = new JButtonMe();
		this.jButtonCopiarPedidoExpor = new JButtonMe();
		this.jButtonVerFormPedidoExpor = new JButtonMe();
		this.jButtonNuevoRelacionesPedidoExpor = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPedidoExpor = new JButtonMe();
		this.jButtonCerrarPedidoExpor = new JButtonMe();
		
		this.jScrollPanelDatosPedidoExpor = new JScrollPane();   
        this.jScrollPanelDatosGeneralPedidoExpor = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Pedido Exportacion";
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions" + this.sPath));
		} else {
			this.jScrollPanelDatosPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPedidoExpor.setToolTipText("Acciones");
        this.jPanelAccionesPedidoExpor.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalPedidoExpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalPedidoExpor.setName("jPanelCamposFintotalPedidoExpor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoPedidoExpor=new ReporteDinamicoJInternalFrame(PedidoExporConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPedidoExpor();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPedidoExpor=new ImportacionJInternalFrame(PedidoExporConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPedidoExpor();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPedidoExpor = new JButtonMe();
		
		this.jButtonAbrirOrderByPedidoExpor.setText("Orden");
		this.jButtonAbrirOrderByPedidoExpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoExpor,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoExpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoExpor,false,this);
			
			//this.cargarOrderByPedidoExpor(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPedidoExpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoExpor,true,this);
			
			//this.cargarOrderByPedidoExpor(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPedidoExpor.setMinimumSize(new Dimension(400,50));//4330
		this.jTableDatosPedidoExpor.setMaximumSize(new Dimension(400,50));//4330
		this.jTableDatosPedidoExpor.setPreferredSize(new Dimension(400,50));//4330
		
		this.jScrollPanelDatosPedidoExpor.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoExpor.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPedidoExpor.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPedidoExpor.setText("Nuevo");
		this.jButtonDuplicarPedidoExpor.setText("Duplicar");
		this.jButtonCopiarPedidoExpor.setText("Copiar");
		this.jButtonVerFormPedidoExpor.setText("Ver");
		this.jButtonNuevoRelacionesPedidoExpor.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPedidoExpor.setText("Guardar");
		this.jButtonCerrarPedidoExpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPedidoExpor,"nuevo_button","Nuevo",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPedidoExpor,"duplicar_button","Duplicar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPedidoExpor,"copiar_button","Copiar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPedidoExpor,"ver_form","Ver",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPedidoExpor,"nuevorelaciones_button","Nuevo Rel",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPedidoExpor,"guardarcambiostabla_button","Guardar",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPedidoExpor,"cerrar_button","Salir",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPedidoExpor.setToolTipText("Nuevo"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPedidoExpor.setToolTipText("Duplicar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPedidoExpor.setToolTipText("Copiar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPedidoExpor.setToolTipText("Ver"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPedidoExpor.setToolTipText("Nuevo Rel"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPedidoExpor.setToolTipText("Guardar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPedidoExpor.setToolTipText("Salir"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPedidoExpor";
		inputMap = this.jButtonNuevoPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPedidoExpor"));
		
		//DUPLICAR
		sMapKey = "DuplicarPedidoExpor";
		inputMap = this.jButtonDuplicarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPedidoExpor"));
		
		//COPIAR
		sMapKey = "CopiarPedidoExpor";
		inputMap = this.jButtonCopiarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPedidoExpor"));
		
		//VEr FORM
		sMapKey = "VerFormPedidoExpor";
		inputMap = this.jButtonVerFormPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPedidoExpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPedidoExpor"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPedidoExpor";
		inputMap = this.jButtonNuevoRelacionesPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPedidoExpor"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPedidoExpor";
		inputMap = this.jButtonModificarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPedidoExpor"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPedidoExpor";
		inputMap = this.jButtonCerrarPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPedidoExpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPedidoExpor";
		inputMap = this.jButtonGuardarCambiosTablaPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPedidoExpor"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPedidoExpor.setName("jPanelParametrosReportesPedidoExpor"); 
		
		this.jPanelParametrosReportesAccionesPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPedidoExpor.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPedidoExpor.setName("jPanelParametrosReportesAccionesPedidoExpor"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPedidoExpor = new JButtonMe();
		this.jButtonRecargarInformacionPedidoExpor.setText("Recargar");
		this.jButtonRecargarInformacionPedidoExpor.setToolTipText("Recargar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPedidoExpor,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPedidoExpor = new JButtonMe();
		this.jButtonProcesarInformacionPedidoExpor.setText("Procesar");
		this.jButtonProcesarInformacionPedidoExpor.setToolTipText("Procesar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPedidoExpor.setVisible(false);
			
		this.jButtonProcesarInformacionPedidoExpor.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoExpor.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPedidoExpor.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoExpor.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPedidoExpor.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoExpor.setText("TIPO");       
		this.jComboBoxTiposReportesPedidoExpor.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPedidoExpor.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPedidoExpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPedidoExpor.setText("Paginacion");
		this.jComboBoxTiposPaginacionPedidoExpor.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPedidoExpor.setText("Accion");
		this.jComboBoxTiposRelacionesPedidoExpor.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPedidoExpor.setText("Accion");
		this.jComboBoxTiposAccionesPedidoExpor.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPedidoExpor = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPedidoExpor.setText("Accion");
		this.jComboBoxTiposSeleccionarPedidoExpor.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPedidoExpor=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPedidoExpor.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoExpor.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPedidoExpor.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPedidoExpor = new JLabelMe();
		
		this.jLabelAccionesPedidoExpor.setText("Acciones");		
		this.jLabelAccionesPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPedidoExpor = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPedidoExpor.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPedidoExpor.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPedidoExpor = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPedidoExpor.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPedidoExpor.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPedidoExpor = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPedidoExpor.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPedidoExpor.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePedidoExpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePedidoExpor.setText("Graf.");
		this.jCheckBoxConGraficoReportePedidoExpor.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPedidoExpor = new JButtonMe();
		//this.jButtonAnterioresPedidoExpor.setText("<<");
        this.jButtonAnterioresPedidoExpor.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPedidoExpor,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPedidoExpor = new JButtonMe();
		//this.jButtonSiguientesPedidoExpor.setText(">>");
        this.jButtonSiguientesPedidoExpor.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPedidoExpor,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPedidoExpor = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPedidoExpor.setText("Nue");
        this.jButtonNuevoGuardarCambiosPedidoExpor.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPedidoExpor,"nuevoguardarcambios_button","Nue",this.pedidoexporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPedidoExpor";
		inputMap = this.jButtonNuevoGuardarCambiosPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPedidoExpor"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPedidoExpor";
		inputMap = this.jButtonRecargarInformacionPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPedidoExpor"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPedidoExpor";
		inputMap = this.jButtonSiguientesPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPedidoExpor"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPedidoExpor";
		inputMap = this.jButtonAnterioresPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPedidoExpor"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPedidoExpor();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPedidoExpor.setMinimumSize(new Dimension(this.getWidth(),PedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoExpor.setMaximumSize(new Dimension(this.getWidth(),PedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPedidoExpor.setPreferredSize(new Dimension(this.getWidth(),PedidoExporBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PedidoExporBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPedidoExpor = new GridBagLayout();

			this.jPanelPaginacionPedidoExpor.setLayout(gridaBagLayoutPaginacionPedidoExpor);						
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = 0;
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPedidoExpor.add(this.jButtonAnterioresPedidoExpor, this.gridBagConstraintsPedidoExpor);
					
						
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsPedidoExpor.gridy = 0;//
			
			this.jPanelPaginacionPedidoExpor.add(this.jButtonNuevoGuardarCambiosPedidoExpor, this.gridBagConstraintsPedidoExpor);//
						
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPedidoExpor.gridy = 0;
			this.jPanelPaginacionPedidoExpor.add(this.jButtonSiguientesPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoExpor.gridy = 1;//
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoExpor.add(this.jButtonNuevoPedidoExpor, this.gridBagConstraintsPedidoExpor);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
				this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPedidoExpor.gridy = 1;
				this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionPedidoExpor.add(this.jButtonNuevoRelacionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
			}
			
			
			if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
				this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsPedidoExpor.gridy = 1;//
				this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionPedidoExpor.add(this.jButtonGuardarCambiosTablaPedidoExpor, this.gridBagConstraintsPedidoExpor);//
			}
			
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoExpor.gridy = 1;//
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoExpor.add(this.jButtonDuplicarPedidoExpor, this.gridBagConstraintsPedidoExpor);//
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoExpor.gridy = 1;//
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoExpor.add(this.jButtonCopiarPedidoExpor, this.gridBagConstraintsPedidoExpor);//
		
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();//
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsPedidoExpor.gridy = 1;//
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionPedidoExpor.add(this.jButtonVerFormPedidoExpor, this.gridBagConstraintsPedidoExpor);//
		
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = 1;
			this.gridBagConstraintsPedidoExpor.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPedidoExpor.add(this.jButtonCerrarPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		
		this.jButtonRecargarInformacionPedidoExpor.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoExpor.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPedidoExpor.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPedidoExpor.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoExpor.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPedidoExpor.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPedidoExpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoExpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPedidoExpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPedidoExpor.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoExpor.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPedidoExpor.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPedidoExpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoExpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPedidoExpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPedidoExpor.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoExpor.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPedidoExpor.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePedidoExpor.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoExpor.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePedidoExpor.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPedidoExpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoExpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPedidoExpor.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPedidoExpor.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoExpor.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPedidoExpor.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPedidoExpor = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PedidoExpor = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PedidoExpor = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPedidoExpor.setLayout(gridaBagParametrosReportesPedidoExpor);
			this.jPanelParametrosReportesAccionesPedidoExpor.setLayout(gridaBagParametrosReportesAccionesPedidoExpor);
			
			
			this.jPanelParametrosAuxiliar1PedidoExpor.setLayout(gridaBagParametrosAuxiliar1PedidoExpor);
			this.jPanelParametrosAuxiliar2PedidoExpor.setLayout(gridaBagParametrosAuxiliar2PedidoExpor);
			this.jPanelParametrosAuxiliar3PedidoExpor.setLayout(gridaBagParametrosAuxiliar3PedidoExpor);
			this.jPanelParametrosAuxiliar4PedidoExpor.setLayout(gridaBagParametrosAuxiliar4PedidoExpor);
			//this.jPanelParametrosAuxiliar5PedidoExpor.setLayout(gridaBagParametrosAuxiliar2PedidoExpor);			
			
			
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoExpor.add(this.jButtonRecargarInformacionPedidoExpor, this.gridBagConstraintsPedidoExpor);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoExpor.add(this.jComboBoxTiposPaginacionPedidoExpor, this.gridBagConstraintsPedidoExpor);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoExpor.add(this.jCheckBoxConAltoMaximoTablaPedidoExpor, this.gridBagConstraintsPedidoExpor);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PedidoExpor.add(this.jComboBoxTiposArchivosReportesPedidoExpor, this.gridBagConstraintsPedidoExpor);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoExpor.add(this.jPanelParametrosAuxiliar1PedidoExpor, this.gridBagConstraintsPedidoExpor);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PedidoExpor.add(this.jComboBoxTiposReportesPedidoExpor, this.gridBagConstraintsPedidoExpor);																		
			
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PedidoExpor.add(this.jComboBoxTiposGraficosReportesPedidoExpor, this.gridBagConstraintsPedidoExpor);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoExpor.add(this.jPanelParametrosAuxiliar4PedidoExpor, this.gridBagConstraintsPedidoExpor);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoExpor.add(this.jComboBoxTiposReportesPedidoExpor, this.gridBagConstraintsPedidoExpor);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoExpor.add(this.jCheckBoxGenerarReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoExpor.add(this.jPanelParametrosAuxiliar2PedidoExpor, this.gridBagConstraintsPedidoExpor);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoExpor.add(this.jLabelAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
				this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPedidoExpor.add(this.jButtonAbrirOrderByPedidoExpor, this.gridBagConstraintsPedidoExpor);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoExpor.add(this.jComboBoxTiposSeleccionarPedidoExpor, this.gridBagConstraintsPedidoExpor);			
			
			
			/*
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoExpor.add(this.jCheckBoxSeleccionarTodosPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPedidoExpor.add(this.jCheckBoxConGraficoReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoExpor.add(this.jCheckBoxSeleccionarTodosPedidoExpor, this.gridBagConstraintsPedidoExpor);															
				
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoExpor.add(this.jCheckBoxSeleccionadosPedidoExpor, this.gridBagConstraintsPedidoExpor);															
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPedidoExpor.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PedidoExpor.add(this.jCheckBoxConGraficoReportePedidoExpor, this.gridBagConstraintsPedidoExpor);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPedidoExpor.add(this.jPanelParametrosAuxiliar3PedidoExpor, this.gridBagConstraintsPedidoExpor);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoExpor.add(this.jComboBoxTiposRelacionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
				
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoExpor.add(this.jComboBoxTiposAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
	
				
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPedidoExpor.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPedidoExpor.add(this.jTextFieldValorCampoGeneralPedidoExpor, this.gridBagConstraintsPedidoExpor);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposFintotalPedidoExpor= new GridBagLayout();
		this.jPanelCamposFintotalPedidoExpor.setLayout(gridaBagLayoutCamposFintotalPedidoExpor);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPedidoExpor = new GridBagLayout();

			this.jScrollPanelDatosPedidoExpor.setLayout(gridaBagLayoutDatosPedidoExpor);
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = 0;
			this.gridBagConstraintsPedidoExpor.gridx = 0;
			
			this.jScrollPanelDatosPedidoExpor.add(this.jTableDatosPedidoExpor, this.gridBagConstraintsPedidoExpor);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPedidoExpor.setViewportView(this.jTableDatosPedidoExpor);
		this.jTableDatosPedidoExpor.setFillsViewportHeight(true);
		this.jTableDatosPedidoExpor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPedidoExpor= new GridBagLayout();
		this.jPanelAccionesPedidoExpor.setLayout(gridaBagLayoutAccionesPedidoExpor);
		
		
		/*	
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = 0;
		this.gridBagConstraintsPedidoExpor.gridx = 0;
			
		this.jPanelAccionesPedidoExpor.add(this.jButtonNuevoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdCentroCostoPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoPedidoExpor.setLayout(gridaBagLayoutFK_IdCentroCostoPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdCentroCostoPedidoExpor.add(jLabelid_centro_costoFK_IdCentroCostoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdCentroCostoPedidoExpor.add(jComboBoxid_centro_costoFK_IdCentroCostoPedidoExpor, gridBagConstraintsPedidoExpor);


		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdCentroCostoPedidoExpor.add(this.jButtonBuscarFK_IdCentroCostoid_centro_costoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdCentroCostoPedidoExpor.add(jButtonFK_IdCentroCostoPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("1.-Por Centro Costo ", jPanelFK_IdCentroCostoPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdClientePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdClientePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePedidoExpor.setLayout(gridaBagLayoutFK_IdClientePedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdClientePedidoExpor.add(jLabelid_clienteFK_IdClientePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdClientePedidoExpor.add(jComboBoxid_clienteFK_IdClientePedidoExpor, gridBagConstraintsPedidoExpor);


		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdClientePedidoExpor.add(this.jButtonBuscarFK_IdClienteid_clientePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdClientePedidoExpor.add(jButtonFK_IdClientePedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("2.-Por Cliente ", jPanelFK_IdClientePedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdConsignatarioPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdConsignatarioPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsignatarioPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsignatarioPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsignatarioPedidoExpor.setLayout(gridaBagLayoutFK_IdConsignatarioPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdConsignatarioPedidoExpor.add(jLabelid_consignatarioFK_IdConsignatarioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdConsignatarioPedidoExpor.add(jComboBoxid_consignatarioFK_IdConsignatarioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdConsignatarioPedidoExpor.add(jButtonFK_IdConsignatarioPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("3.-Por Consignatario ", jPanelFK_IdConsignatarioPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdConsultorPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdConsultorPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdConsultorPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdConsultorPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdConsultorPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdConsultorPedidoExpor.setLayout(gridaBagLayoutFK_IdConsultorPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdConsultorPedidoExpor.add(jLabelid_consultorFK_IdConsultorPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdConsultorPedidoExpor.add(jComboBoxid_consultorFK_IdConsultorPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdConsultorPedidoExpor.add(jButtonFK_IdConsultorPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("4.-Por Consultor ", jPanelFK_IdConsultorPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEmpleadoPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdEmpleadoPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEmpleadoPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEmpleadoPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEmpleadoPedidoExpor.setLayout(gridaBagLayoutFK_IdEmpleadoPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdEmpleadoPedidoExpor.add(jLabelid_empleadoFK_IdEmpleadoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdEmpleadoPedidoExpor.add(jComboBoxid_empleadoFK_IdEmpleadoPedidoExpor, gridBagConstraintsPedidoExpor);


		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdEmpleadoPedidoExpor.add(this.jButtonBuscarFK_IdEmpleadoid_empleadoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdEmpleadoPedidoExpor.add(jButtonFK_IdEmpleadoPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("5.-Por Empleado ", jPanelFK_IdEmpleadoPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPedidoExporPedidoExpor.setLayout(gridaBagLayoutFK_IdEstadoPedidoExporPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdEstadoPedidoExporPedidoExpor.add(jLabelid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdEstadoPedidoExporPedidoExpor.add(jComboBoxid_estado_pedidoFK_IdEstadoPedidoExporPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdEstadoPedidoExporPedidoExpor.add(jButtonFK_IdEstadoPedidoExporPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("6.-Por Estado ", jPanelFK_IdEstadoPedidoExporPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdFormatoPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdFormatoPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFormatoPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFormatoPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFormatoPedidoExpor.setLayout(gridaBagLayoutFK_IdFormatoPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdFormatoPedidoExpor.add(jLabelid_formatoFK_IdFormatoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdFormatoPedidoExpor.add(jComboBoxid_formatoFK_IdFormatoPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdFormatoPedidoExpor.add(jButtonFK_IdFormatoPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("7.-Por Formato ", jPanelFK_IdFormatoPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdPaisPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdPaisPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisPedidoExpor.setLayout(gridaBagLayoutFK_IdPaisPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdPaisPedidoExpor.add(jLabelid_paisFK_IdPaisPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdPaisPedidoExpor.add(jComboBoxid_paisFK_IdPaisPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdPaisPedidoExpor.add(jButtonFK_IdPaisPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("8.-Por Origen ", jPanelFK_IdPaisPedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdResponsablePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdResponsablePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdResponsablePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdResponsablePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdResponsablePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdResponsablePedidoExpor.setLayout(gridaBagLayoutFK_IdResponsablePedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdResponsablePedidoExpor.add(jLabelid_responsableFK_IdResponsablePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdResponsablePedidoExpor.add(jComboBoxid_responsableFK_IdResponsablePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdResponsablePedidoExpor.add(jButtonFK_IdResponsablePedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("9.-Por Responsable ", jPanelFK_IdResponsablePedidoExpor);
		jTabbedPaneBusquedasPedidoExpor.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdSubClientePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdSubClientePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdSubClientePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdSubClientePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdSubClientePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdSubClientePedidoExpor.setLayout(gridaBagLayoutFK_IdSubClientePedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdSubClientePedidoExpor.add(jLabelid_sub_clienteFK_IdSubClientePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdSubClientePedidoExpor.add(jComboBoxid_sub_clienteFK_IdSubClientePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdSubClientePedidoExpor.add(jButtonFK_IdSubClientePedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("10.-Por Contacto ", jPanelFK_IdSubClientePedidoExpor);

		GridBagLayout gridaBagLayoutFK_IdTipoCambioPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoCambioPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoCambioPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoCambioPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoCambioPedidoExpor.setLayout(gridaBagLayoutFK_IdTipoCambioPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdTipoCambioPedidoExpor.add(jLabelid_tipo_cambioFK_IdTipoCambioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdTipoCambioPedidoExpor.add(jComboBoxid_tipo_cambioFK_IdTipoCambioPedidoExpor, gridBagConstraintsPedidoExpor);


		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdTipoCambioPedidoExpor.add(this.jButtonBuscarFK_IdTipoCambioid_tipo_cambioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdTipoCambioPedidoExpor.add(jButtonFK_IdTipoCambioPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("11.-Por Tipo Cambio ", jPanelFK_IdTipoCambioPedidoExpor);

		GridBagLayout gridaBagLayoutFK_IdTipoPrecioPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPrecioPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPrecioPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPrecioPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPrecioPedidoExpor.setLayout(gridaBagLayoutFK_IdTipoPrecioPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdTipoPrecioPedidoExpor.add(jLabelid_tipo_precioFK_IdTipoPrecioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdTipoPrecioPedidoExpor.add(jComboBoxid_tipo_precioFK_IdTipoPrecioPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdTipoPrecioPedidoExpor.add(jButtonFK_IdTipoPrecioPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("12.-Por Tipo Precio ", jPanelFK_IdTipoPrecioPedidoExpor);

		GridBagLayout gridaBagLayoutFK_IdTransportePedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdTransportePedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportePedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportePedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportePedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportePedidoExpor.setLayout(gridaBagLayoutFK_IdTransportePedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdTransportePedidoExpor.add(jLabelid_transporteFK_IdTransportePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdTransportePedidoExpor.add(jComboBoxid_transporteFK_IdTransportePedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdTransportePedidoExpor.add(jButtonFK_IdTransportePedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("13.-Por Transporte ", jPanelFK_IdTransportePedidoExpor);

		GridBagLayout gridaBagLayoutFK_IdTransportistaPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdTransportistaPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransportistaPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransportistaPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransportistaPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransportistaPedidoExpor.setLayout(gridaBagLayoutFK_IdTransportistaPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdTransportistaPedidoExpor.add(jLabelid_transportistaFK_IdTransportistaPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdTransportistaPedidoExpor.add(jComboBoxid_transportistaFK_IdTransportistaPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdTransportistaPedidoExpor.add(jButtonFK_IdTransportistaPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("14.-Por Transportista ", jPanelFK_IdTransportistaPedidoExpor);

		GridBagLayout gridaBagLayoutFK_IdVendedorPedidoExpor= new GridBagLayout();
		gridaBagLayoutFK_IdVendedorPedidoExpor.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedidoExpor.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdVendedorPedidoExpor.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdVendedorPedidoExpor.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdVendedorPedidoExpor.setLayout(gridaBagLayoutFK_IdVendedorPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdVendedorPedidoExpor.add(jLabelid_vendedorFK_IdVendedorPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 1;
		jPanelFK_IdVendedorPedidoExpor.add(jComboBoxid_vendedorFK_IdVendedorPedidoExpor, gridBagConstraintsPedidoExpor);


		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.NONE;
		gridBagConstraintsPedidoExpor.gridy = 0;
		gridBagConstraintsPedidoExpor.gridx = 0;
		jPanelFK_IdVendedorPedidoExpor.add(this.jButtonBuscarFK_IdVendedorid_vendedorPedidoExpor, gridBagConstraintsPedidoExpor);

		gridBagConstraintsPedidoExpor = new GridBagConstraints();
		gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPedidoExpor.gridy = 1;
		gridBagConstraintsPedidoExpor.gridx =1;
		jPanelFK_IdVendedorPedidoExpor.add(jButtonFK_IdVendedorPedidoExpor, gridBagConstraintsPedidoExpor);

		jTabbedPaneBusquedasPedidoExpor.addTab("15.-Por Vendedor ", jPanelFK_IdVendedorPedidoExpor);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPedidoExpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPedidoExpor);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pedidoexporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();						
			this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoExpor.gridx = 0;		
			//this.gridBagConstraintsPedidoExpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPedidoExpor.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPedidoExpor, this.gridBagConstraintsPedidoExpor);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPedidoExpor.gridx = 0;		
		//this.gridBagConstraintsPedidoExpor.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPedidoExpor.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPedidoExpor);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPedidoExpor.gridx = 0;		
			this.gridBagConstraintsPedidoExpor.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPedidoExpor.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPedidoExpor, this.gridBagConstraintsPedidoExpor);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPedidoExpor, this.gridBagConstraintsPedidoExpor);								
		
		
		/*
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
		*/		
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPedidoExpor.gridx =0;
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPedidoExpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPedidoExpor, this.gridBagConstraintsPedidoExpor);
				
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPedidoExpor, this.gridBagConstraintsPedidoExpor);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(PedidoExporJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPedidoExpor= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPedidoExpor = new GridBagLayout();
			this.jPanelBusquedasParametrosPedidoExpor.setLayout(gridaBagLayoutBusquedasParametrosPedidoExpor);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPedidoExpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPedidoExpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoExpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPedidoExpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsPedidoExpor.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPedidoExpor, this.gridBagConstraintsPedidoExpor);
			
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPedidoExpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPedidoExpor, this.gridBagConstraintsPedidoExpor);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPedidoExpor;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPedidoExpor() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPedidoExpor = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPedidoExpor.setName("jPanelReporteDinamicoPedidoExpor"); 
		
		this.jPanelReporteDinamicoPedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPedidoExpor.setLayout(gridaBagLayoutReporteDinamicoPedidoExpor);
		
		
		this.jInternalFrameReporteDinamicoPedidoExpor= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPedidoExpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoExpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPedidoExpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPedidoExpor.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPedidoExpor.setResizable(true);
	    this.jInternalFrameReporteDinamicoPedidoExpor.setClosable(true);
	    this.jInternalFrameReporteDinamicoPedidoExpor.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePedidoExpor = new JLabelMe();

		this.jLabelColumnasSelectReportePedidoExpor.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelColumnasSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePedidoExpor = new JList<Reporte>();
		this.jListColumnasSelectReportePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePedidoExpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePedidoExpor=new JScrollPane(this.jListColumnasSelectReportePedidoExpor);
			
			this.jScrollColumnasSelectReportePedidoExpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoExpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePedidoExpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoExpor.add(this.jListColumnasSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		this.jPanelReporteDinamicoPedidoExpor.add(this.jScrollColumnasSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePedidoExpor = new JLabelMe();

		this.jLabelRelacionesSelectReportePedidoExpor.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelRelacionesSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePedidoExpor = new JList<Reporte>();
		this.jListRelacionesSelectReportePedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePedidoExpor.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePedidoExpor=new JScrollPane(this.jListRelacionesSelectReportePedidoExpor);
			
			this.jScrollRelacionesSelectReportePedidoExpor.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoExpor.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePedidoExpor.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPedidoExpor.add(this.jListRelacionesSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		this.jPanelReporteDinamicoPedidoExpor.add(this.jScrollRelacionesSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoPedidoExpor = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPedidoExpor = new JComboBoxMe();
		this.jListColumnasValoresGraficoPedidoExpor = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPedidoExpor = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPedidoExpor.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPedidoExpor = new JLabelMe();

		this.jLabelConGraficoDinamicoPedidoExpor.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelConGraficoDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPedidoExpor = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPedidoExpor.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPedidoExpor.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPedidoExpor.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoExpor.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPedidoExpor.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jCheckBoxConGraficoDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPedidoExpor = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPedidoExpor.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelColumnaCategoriaGraficoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPedidoExpor.add(this.jComboBoxColumnaCategoriaGraficoPedidoExpor, this.gridBagConstraintsPedidoExpor);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPedidoExpor = new JLabelMe();

		this.jLabelColumnaCategoriaValorPedidoExpor.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelColumnaCategoriaValorPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPedidoExpor.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPedidoExpor.add(this.jComboBoxColumnaCategoriaValorPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPedidoExpor = new JLabelMe();

		this.jLabelColumnasValoresGraficoPedidoExpor.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelColumnasValoresGraficoPedidoExpor, this.gridBagConstraintsPedidoExpor);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPedidoExpor = new JList<Reporte>();
		this.jListColumnasValoresGraficoPedidoExpor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPedidoExpor.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPedidoExpor.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoExpor.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPedidoExpor.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPedidoExpor=new JScrollPane(this.jListColumnasValoresGraficoPedidoExpor);
			
			this.jScrollColumnasValoresGraficoPedidoExpor.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoExpor.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPedidoExpor.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPedidoExpor.add(this.jListColumnasSelectReportePedidoExpor, this.gridBagConstraintsPedidoExpor);
		this.jPanelReporteDinamicoPedidoExpor.add(this.jScrollColumnasValoresGraficoPedidoExpor, this.gridBagConstraintsPedidoExpor);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPedidoExpor = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPedidoExpor.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelTiposGraficosReportesDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPedidoExpor.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jComboBoxTiposGraficosReportesDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPedidoExpor = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPedidoExpor.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelGenerarExcelReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPedidoExpor = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPedidoExpor.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPedidoExpor,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPedidoExpor.setToolTipText("Generar EXCEL"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		//this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPedidoExpor.add(this.jButtonGenerarExcelReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoExpor.add(this.jComboBoxTiposReportesDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPedidoExpor = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPedidoExpor.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPedidoExpor.add(this.jLabelTiposArchivoReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoExpor.add(this.jComboBoxTiposArchivosReportesDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPedidoExpor = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPedidoExpor.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPedidoExpor,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPedidoExpor.setToolTipText("Generar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoExpor.add(this.jButtonGenerarReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPedidoExpor = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPedidoExpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPedidoExpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPedidoExpor.setToolTipText("Cancelar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPedidoExpor.add(this.jButtonCerrarReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPedidoExpor = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPedidoExpor= new JScrollPane(jPanelReporteDinamicoPedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPedidoExpor.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoExpor.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPedidoExpor.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPedidoExpor.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPedidoExpor.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPedidoExpor);
		this.jInternalFrameReporteDinamicoPedidoExpor.getContentPane().add(this.jScrollPanelReporteDinamicoPedidoExpor, this.gridBagConstraintsPedidoExpor);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPedidoExpor() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPedidoExpor = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPedidoExpor.setName("jPanelImportacionPedidoExpor"); 
		
		this.jPanelImportacionPedidoExpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoExpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPedidoExpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPedidoExpor.setLayout(gridaBagLayoutImportacionPedidoExpor);
		
		
		this.jInternalFrameImportacionPedidoExpor= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPedidoExpor= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPedidoExpor = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePedidoExpor= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoExpor.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPedidoExpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoExpor.setResizable(true);
	    this.jInternalFrameImportacionPedidoExpor.setClosable(true);
	    this.jInternalFrameImportacionPedidoExpor.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPedidoExpor.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPedidoExpor.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPedidoExpor.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPedidoExpor.setResizable(true);
	    this.jInternalFrameImportacionPedidoExpor.setClosable(true);
	    this.jInternalFrameImportacionPedidoExpor.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPedidoExpor.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoExpor.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPedidoExpor.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPedidoExpor = new JLabelMe();

		this.jLabelArchivoImportacionPedidoExpor.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoExpor.add(this.jLabelArchivoImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPedidoExpor = new JFileChooser();		
		this.jFileChooserImportacionPedidoExpor.setToolTipText("ESCOGER ARCHIVO"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPedidoExpor = new JButtonMe();
		this.jButtonAbrirImportacionPedidoExpor.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPedidoExpor,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPedidoExpor.setToolTipText("Generar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoExpor.add(this.jButtonAbrirImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPedidoExpor = new JLabelMe();

		this.jLabelPathArchivoImportacionPedidoExpor.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPedidoExpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoExpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPedidoExpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;		
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPedidoExpor.add(this.jLabelPathArchivoImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPedidoExpor=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPedidoExpor.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoExpor.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPedidoExpor.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoExpor.add(this.jTextFieldPathArchivoImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPedidoExpor = new JButtonMe();
		this.jButtonGenerarImportacionPedidoExpor.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPedidoExpor,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPedidoExpor.setToolTipText("Generar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoExpor.add(this.jButtonGenerarImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPedidoExpor = new JButtonMe();
		this.jButtonCerrarImportacionPedidoExpor.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPedidoExpor,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPedidoExpor.setToolTipText("Cancelar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPedidoExpor.gridy = iPosYImportacion;
		this.gridBagConstraintsPedidoExpor.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPedidoExpor.add(this.jButtonCerrarImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPedidoExpor = new GridBagLayout();
		
		this.jScrollPanelImportacionPedidoExpor= new JScrollPane(jPanelImportacionPedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
		this.gridBagConstraintsPedidoExpor.gridy =iPosYImportacion;
		this.gridBagConstraintsPedidoExpor.gridx =iPosXImportacion;
		this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPedidoExpor.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPedidoExpor);
		this.jInternalFrameImportacionPedidoExpor.getContentPane().add(this.jScrollPanelImportacionPedidoExpor, this.gridBagConstraintsPedidoExpor);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPedidoExpor(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPedidoExpor = new JButtonMe();
			this.jButtonAbrirOrderByPedidoExpor.setText("Orden");
			this.jButtonAbrirOrderByPedidoExpor.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPedidoExpor,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPedidoExpor";
			inputMap = this.jButtonAbrirOrderByPedidoExpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPedidoExpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPedidoExpor"));
		
		
			GridBagLayout gridaBagLayoutOrderByPedidoExpor = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPedidoExpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPedidoExpor.setName("jPanelOrderByPedidoExpor"); 
			
			this.jPanelOrderByPedidoExpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoExpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPedidoExpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPedidoExpor.setLayout(gridaBagLayoutOrderByPedidoExpor);
			
			
			this.jTableDatosPedidoExporOrderBy = new JTableMe();        
			this.jTableDatosPedidoExporOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPedidoExporOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPedidoExporOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPedidoExporOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPedidoExporOrderBy.setViewportView(this.jTableDatosPedidoExporOrderBy);
			this.jTableDatosPedidoExporOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPedidoExporOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPedidoExpor= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPedidoExpor= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPedidoExpor = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePedidoExpor= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPedidoExpor.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPedidoExpor.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPedidoExpor.setTitle("Orden");
			this.jInternalFrameOrderByPedidoExpor.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPedidoExpor.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPedidoExpor.setResizable(true);
			this.jInternalFrameOrderByPedidoExpor.setClosable(true);
			this.jInternalFrameOrderByPedidoExpor.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPedidoExpor.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoExpor.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPedidoExpor.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPedidoExpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pedido Exportacions"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPedidoExpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPedidoExpor.ipady =150;
				
			this.jPanelOrderByPedidoExpor.add(jScrollPanelDatosPedidoExporOrderBy, this.gridBagConstraintsPedidoExpor);//this.jTableDatosPedidoExporTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPedidoExpor = new JButtonMe();
			this.jButtonCerrarOrderByPedidoExpor.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPedidoExpor,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPedidoExpor.setToolTipText("Cancelar"+" "+PedidoExporConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPedidoExpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPedidoExpor.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPedidoExpor.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPedidoExpor.add(this.jButtonCerrarOrderByPedidoExpor, this.gridBagConstraintsPedidoExpor);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPedidoExpor = new GridBagLayout();
			
			this.jScrollPanelOrderByPedidoExpor= new JScrollPane(jPanelOrderByPedidoExpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPedidoExpor = new GridBagConstraints();
			this.gridBagConstraintsPedidoExpor.gridy =iPosYOrderBy;
			this.gridBagConstraintsPedidoExpor.gridx =iPosXOrderBy;
			this.gridBagConstraintsPedidoExpor.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPedidoExpor.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPedidoExpor.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPedidoExpor);
			
			this.jInternalFrameOrderByPedidoExpor.getContentPane().add(this.jScrollPanelOrderByPedidoExpor, this.gridBagConstraintsPedidoExpor);			
		
		} else {
			this.jButtonAbrirOrderByPedidoExpor = new JButtonMe();
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
		int iWidthTableCalculado=0;//10530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=4330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=6100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pedidoexporSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPedidoExpor.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPedidoExpor.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPedidoExpor.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPedidoExpor.getRowHeight();//PedidoExporConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoExpor.isSelected()) {
					iHeightTable=PedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPedidoExpor.isSelected()) {
					iHeightTable=PedidoExporConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PedidoExporConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPedidoExpor.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoExpor.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPedidoExpor.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPedidoExpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoExpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPedidoExpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPedidoExpor!=null && this.jInternalFrameOrderByPedidoExpor.getjTableDatosOrderBy()!=null) {
			//if(!this.pedidoexporSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPedidoExpor.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPedidoExpor.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPedidoExpor.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPedidoExpor.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPedidoExpor.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPedidoExpor.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPedidoExpor.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPedidoExpor.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoExpor.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPedidoExpor.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pedidoexporLogic.getPedidoExpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoexpors.size();
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
	public static List<PedidoExpor> TraerPedidoExporBeans(List<PedidoExpor> pedidoexpors,ArrayList<Classe> classes)throws Exception {
		try {
			for(PedidoExpor pedidoexpor:pedidoexpors) {
					
				if(!(PedidoExporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PedidoExporConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pedidoexpor.setsDetalleGeneralEntityReporte(PedidoExporConstantesFunciones.getPedidoExporDescripcion(pedidoexpor));
										
						
					
					

					if(pedidoexpor.getDetallePedidoExpors()!=null && Funciones.existeClass(classes,DetallePedidoExpor.class)) {
						try{pedidoexpor.setdetallepedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoExporJInternalFrame.TraerDetallePedidoExporBeans(pedidoexpor.getDetallePedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//pedidoexpor.setsDetalleGeneralEntityReporte(pedidoexpor.getsDetalleGeneralEntityReporte());
										
				}
				
				//pedidoexporbeans.add(pedidoexporbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pedidoexpors;
    }
	//PARA REPORTES FIN
}
