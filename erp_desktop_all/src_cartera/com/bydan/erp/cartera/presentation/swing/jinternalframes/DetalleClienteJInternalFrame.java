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
import com.bydan.erp.cartera.util.DetalleClienteConstantesFunciones;

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
public class DetalleClienteJInternalFrame extends DetalleClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarDetalleCliente;
	
	protected JMenuBar jmenuBarDetalleCliente;
	
	protected JMenu jmenuDetalleCliente;
	protected JMenu jmenuDatosDetalleCliente;
	protected JMenu jmenuArchivoDetalleCliente;
	protected JMenu jmenuAccionesDetalleCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCliente;	
	protected GridBagConstraints gridBagConstraintsDetalleCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public DetalleClienteDetalleFormJInternalFrame jInternalFrameDetalleFormDetalleCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoDetalleCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionDetalleCliente;	
	
	
	
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

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";
	
	public DetalleClienteSessionBean detalleclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<DetalleCliente> detalleclientes;		
	public List<DetalleCliente> detalleclientesEliminados;	
	public List<DetalleCliente> detalleclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByDetalleCliente;		
	protected JButton jButtonAbrirOrderByDetalleCliente;
	
	
	//protected JPanel jPanelOrderByDetalleCliente;
	//public JScrollPane jScrollPanelOrderByDetalleCliente;	
	//protected JButton jButtonCerrarOrderByDetalleCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public DetalleClienteLogic detalleclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosDetalleCliente;
	public JScrollPane jScrollPanelDatosEdicionDetalleCliente;
	public JScrollPane jScrollPanelDatosGeneralDetalleCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosDetalleClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoDetalleCliente;
	//public JScrollPane jScrollPanelImportacionDetalleCliente;
	
	
	
	protected JPanel jPanelAccionesDetalleCliente;
	
    protected JPanel jPanelPaginacionDetalleCliente;
    protected JPanel jPanelParametrosReportesDetalleCliente;
	protected JPanel jPanelParametrosReportesAccionesDetalleCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1DetalleCliente;
	protected JPanel jPanelParametrosAuxiliar2DetalleCliente;
	protected JPanel jPanelParametrosAuxiliar3DetalleCliente;
	protected JPanel jPanelParametrosAuxiliar4DetalleCliente;
	//protected JPanel jPanelParametrosAuxiliar5DetalleCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoDetalleCliente;
	//protected JPanel jPanelImportacionDetalleCliente;
	
	
	public JTable jTableDatosDetalleCliente;
	
	
	
	//public JTable jTableDatosDetalleClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoDetalleCliente;
	protected JButton jButtonDuplicarDetalleCliente;
	protected JButton jButtonCopiarDetalleCliente;
	protected JButton jButtonVerFormDetalleCliente;
	protected JButton jButtonNuevoRelacionesDetalleCliente;
	protected JButton jButtonModificarDetalleCliente;
	
    protected JButton jButtonGuardarCambiosTablaDetalleCliente;
	protected JButton jButtonCerrarDetalleCliente;
	
	
	protected JButton jButtonRecargarInformacionDetalleCliente;
	protected JButton jButtonProcesarInformacionDetalleCliente;
	
	
	protected JButton jButtonAnterioresDetalleCliente;
	protected JButton jButtonSiguientesDetalleCliente;
	protected JButton jButtonNuevoGuardarCambiosDetalleCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoDetalleCliente;
	//protected JButton jButtonCerrarReporteDinamicoDetalleCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoDetalleCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionDetalleCliente;
	//protected JButton jButtonGenerarImportacionDetalleCliente;
	//protected JButton jButtonCerrarImportacionDetalleCliente;
	//protected JFileChooser jFileChooserImportacionDetalleCliente;
	//protected File fileImportacionDetalleCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCliente;
	protected JButton jButtonDuplicarToolBarDetalleCliente;
	protected JButton jButtonNuevoRelacionesToolBarDetalleCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarDetalleCliente;
	protected JButton jButtonCopiarToolBarDetalleCliente;
	protected JButton jButtonVerFormToolBarDetalleCliente;
	public JButton jButtonGuardarCambiosTablaToolBarDetalleCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCliente;
	protected JButton jButtonCerrarToolBarDetalleCliente;
	
	protected JButton jButtonRecargarInformacionToolBarDetalleCliente;
	protected JButton jButtonProcesarInformacionToolBarDetalleCliente;
	protected JButton jButtonAnterioresToolBarDetalleCliente;
	protected JButton jButtonSiguientesToolBarDetalleCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarDetalleCliente;
	protected JButton jButtonAbrirOrderByToolBarDetalleCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCliente;
	protected JMenuItem jMenuItemDuplicarDetalleCliente;
	protected JMenuItem jMenuItemNuevoRelacionesDetalleCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosDetalleCliente;
	protected JMenuItem jMenuItemCopiarDetalleCliente;
	protected JMenuItem jMenuItemVerFormDetalleCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCliente;
	protected JMenuItem jMenuItemCerrarDetalleCliente;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByDetalleCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionDetalleCliente;
	protected JMenuItem jMenuItemProcesarInformacionDetalleCliente;
	protected JMenuItem jMenuItemAnterioresDetalleCliente;
	protected JMenuItem jMenuItemSiguientesDetalleCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCliente;
	protected JMenuItem jMenuItemAbrirOrderByDetalleCliente;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosDetalleCliente;
	protected JCheckBox jCheckBoxSeleccionadosDetalleCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaDetalleCliente;
	protected JCheckBox jCheckBoxConGraficoReporteDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesDetalleCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoDetalleCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarDetalleCliente;
	protected JTextField jTextFieldValorCampoGeneralDetalleCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteDetalleCliente;
	//public JList<Reporte> jListColumnasSelectReporteDetalleCliente;
	//public JScrollPane jScrollColumnasSelectReporteDetalleCliente;
	
	//public JLabel jLabelRelacionesSelectReporteDetalleCliente;
	//public JList<Reporte> jListRelacionesSelectReporteDetalleCliente;
	//public JScrollPane jScrollRelacionesSelectReporteDetalleCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoDetalleCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoDetalleCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoDetalleCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoDetalleCliente;
	
		
	//public JLabel jLabelArchivoImportacionDetalleCliente;	
	//public JLabel jLabelPathArchivoImportacionDetalleCliente;
	//protected JTextField jTextFieldPathArchivoImportacionDetalleCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoDetalleCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoDetalleCliente;
	
	//public JLabel jLabelColumnaCategoriaValorDetalleCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorDetalleCliente;
	
	//public JLabel jLabelColumnasValoresGraficoDetalleCliente;
	//public JList<Reporte> jListColumnasValoresGraficoDetalleCliente;
	//public JScrollPane jScrollColumnasValoresGraficoDetalleCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoDetalleCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoDetalleCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasDetalleCliente;
	public JPanel jPanelBusquedaPorFechaEmisionDetalleCliente;
	public JButton jButtonBusquedaPorFechaEmisionDetalleCliente;
	public JPanel jPanelBusquedaPorFechaVenceDetalleCliente;
	public JButton jButtonBusquedaPorFechaVenceDetalleCliente;
	public JPanel jPanelFK_IdAsientoContableDetalleCliente;
	public JButton jButtonFK_IdAsientoContableDetalleCliente;
	public JPanel jPanelFK_IdClienteDetalleCliente;
	public JButton jButtonFK_IdClienteDetalleCliente;
	public JPanel jPanelFK_IdEstadoDetalleClienteDetalleCliente;
	public JButton jButtonFK_IdEstadoDetalleClienteDetalleCliente;
	public JPanel jPanelFK_IdFacturaDetalleCliente;
	public JButton jButtonFK_IdFacturaDetalleCliente;
	public JPanel jPanelFK_IdTipoTransaccionModuloDetalleCliente;
	public JButton jButtonFK_IdTipoTransaccionModuloDetalleCliente;
	public JPanel jPanelFK_IdTransaccionDetalleCliente;
	public JButton jButtonFK_IdTransaccionDetalleCliente;
	
	public JPanel jPanelfecha_emisionBusquedaPorFechaEmisionDetalleCliente;
	public JLabel jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente;

	public JDateChooser jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente;
	public JButton jButtonfecha_emisionBusquedaPorFechaEmisionDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente;
	public JLabel jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente;

	public JDateChooser jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente;
	public JButton jButtonfecha_emisionBusquedaPorFechaEmisionFinalDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_venceBusquedaPorFechaVenceDetalleCliente;
	public JLabel jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente;

	public JDateChooser jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente;
	public JButton jButtonfecha_venceBusquedaPorFechaVenceDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente;
	public JLabel jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente;
	//public JFormattedTextField jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente;

	public JDateChooser jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente;
	public JButton jButtonfecha_venceBusquedaPorFechaVenceFinalDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableDetalleCliente;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleCliente= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableDetalleClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteDetalleCliente;
	public JLabel jLabelid_clienteFK_IdClienteDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteDetalleCliente;
	public JButton jButtonid_clienteFK_IdClienteDetalleCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteDetalleClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteDetalleCliente;
	
	public JPanel jPanelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente;
	public JLabel jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente;
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaDetalleCliente;
	public JLabel jLabelid_facturaFK_IdFacturaDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaDetalleCliente;
	public JButton jButtonid_facturaFK_IdFacturaDetalleCliente= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaDetalleClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaDetalleCliente;
	
	public JPanel jPanelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente;
	public JLabel jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente;
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccionFK_IdTransaccionDetalleCliente;
	public JLabel jLabelid_transaccionFK_IdTransaccionDetalleCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionDetalleCliente;
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleCliente= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleClienteUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionDetalleClienteBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public DetalleClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionDetalleCliente)	{
		this.jButtonRecargarInformacionDetalleCliente = jButtonRecargarInformacionDetalleCliente;
	}
	
	public JButton getjButtonProcesarInformacionDetalleCliente() {
		return this.jButtonProcesarInformacionDetalleCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCliente)	{
		this.jButtonProcesarInformacionDetalleCliente = jButtonProcesarInformacionDetalleCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionDetalleCliente() {
		return this.jButtonRecargarInformacionDetalleCliente;
	}
	
	
	public List<DetalleCliente> getdetalleclientes() {
		return this.detalleclientes;
	}

	public void setdetalleclientes(List<DetalleCliente> detalleclientes) {
		this.detalleclientes = detalleclientes;
	}
	
	public List<DetalleCliente> getdetalleclientesAux() {
		return this.detalleclientesAux;
	}

	public void setdetalleclientesAux(List<DetalleCliente> detalleclientesAux) {
		this.detalleclientesAux = detalleclientesAux;
	}
	
	public List<DetalleCliente> getdetalleclientesEliminados() {
		return this.detalleclientesEliminados;
	}

	public void setDetalleClientesEliminados(List<DetalleCliente> detalleclientesEliminados) {
		this.detalleclientesEliminados = detalleclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarDetalleCliente() {
		return jComboBoxTiposSeleccionarDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarDetalleCliente(
			JComboBox jComboBoxTiposSeleccionarDetalleCliente) {
		this.jComboBoxTiposSeleccionarDetalleCliente = jComboBoxTiposSeleccionarDetalleCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarDetalleCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralDetalleCliente() {
		return jTextFieldValorCampoGeneralDetalleCliente;
	}

	public void setjTextFieldValorCampoGeneralDetalleCliente(
			JTextField jTextFieldValorCampoGeneralDetalleCliente) {
		this.jTextFieldValorCampoGeneralDetalleCliente = jTextFieldValorCampoGeneralDetalleCliente;
	}

	public void setBorderResaltarValorCampoGeneralDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralDetalleCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosDetalleCliente() {
		return this.jCheckBoxSeleccionarTodosDetalleCliente;
	}

	public void setjCheckBoxSeleccionarTodosDetalleCliente(
			JCheckBox jCheckBoxSeleccionarTodosDetalleCliente) {
		this.jCheckBoxSeleccionarTodosDetalleCliente = jCheckBoxSeleccionarTodosDetalleCliente;
	}

	public void setBorderResaltarSeleccionarTodosDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosDetalleCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosDetalleCliente() {
		return this.jCheckBoxSeleccionadosDetalleCliente;
	}

	public void setjCheckBoxSeleccionadosDetalleCliente(
			JCheckBox jCheckBoxSeleccionadosDetalleCliente) {
		this.jCheckBoxSeleccionadosDetalleCliente = jCheckBoxSeleccionadosDetalleCliente;
	}
	
	public void setBorderResaltarSeleccionadosDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosDetalleCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesDetalleCliente() {
		return this.jComboBoxTiposArchivosReportesDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesDetalleCliente(
			JComboBox jComboBoxTiposArchivosReportesDetalleCliente) {
		this.jComboBoxTiposArchivosReportesDetalleCliente = jComboBoxTiposArchivosReportesDetalleCliente;
	}

	public void setBorderResaltarTiposArchivosReportesDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesDetalleCliente() {
		return this.jComboBoxTiposReportesDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesDetalleCliente(
			JComboBox jComboBoxTiposReportesDetalleCliente) {
		this.jComboBoxTiposReportesDetalleCliente = jComboBoxTiposReportesDetalleCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoDetalleCliente() {
	//	return jComboBoxTiposReportesDinamicoDetalleCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoDetalleCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoDetalleCliente) {
	//	this.jComboBoxTiposReportesDinamicoDetalleCliente = jComboBoxTiposReportesDinamicoDetalleCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoDetalleCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoDetalleCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoDetalleCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoDetalleCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente = jComboBoxTiposArchivosReportesDinamicoDetalleCliente;
	//}
	
	public void setBorderResaltarTiposReportesDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesDetalleCliente() {
		return this.jComboBoxTiposGraficosReportesDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesDetalleCliente(
			JComboBox jComboBoxTiposGraficosReportesDetalleCliente) {
		this.jComboBoxTiposGraficosReportesDetalleCliente = jComboBoxTiposGraficosReportesDetalleCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionDetalleCliente() {
		return this.jComboBoxTiposPaginacionDetalleCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionDetalleCliente(
			JComboBox jComboBoxTiposPaginacionDetalleCliente) {
		this.jComboBoxTiposPaginacionDetalleCliente = jComboBoxTiposPaginacionDetalleCliente;
	}
	
	public void setBorderResaltarTiposPaginacionDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionDetalleCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesDetalleCliente() {
		return this.jComboBoxTiposRelacionesDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCliente() {
		return this.jComboBoxTiposAccionesDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCliente(
			JComboBox jComboBoxTiposRelacionesDetalleCliente) {
		this.jComboBoxTiposRelacionesDetalleCliente = jComboBoxTiposRelacionesDetalleCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCliente(
			JComboBox jComboBoxTiposAccionesDetalleCliente) {
		this.jComboBoxTiposAccionesDetalleCliente = jComboBoxTiposAccionesDetalleCliente;
	}
	
	public void setBorderResaltarTiposRelacionesDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesDetalleCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesDetalleCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesDetalleCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoDetalleCliente() {
	//	return jCheckBoxConGraficoDinamicoDetalleCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoDetalleCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoDetalleCliente) {
	//	this.jCheckBoxConGraficoDinamicoDetalleCliente = jCheckBoxConGraficoDinamicoDetalleCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoDetalleCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarDetalleCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoDetalleCliente .setBorder(borderResaltar);		
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
		this.detalleclienteSessionBean=new DetalleClienteSessionBean();
		
		this.detalleclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		DetalleClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("DetalleCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"nuevo","nuevo","Nuevo"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"duplicar","duplicar","Duplicar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"copiar","copiar","Copiar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"ver_form","ver_form","Ver"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"recargar","recargar","Recargar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarDetalleCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarDetalleCliente,this.jTtoolBarDetalleCliente,
							"cerrar","cerrar","Salir"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarDetalleCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarDetalleCliente;
			
				this.jButtonProcesarInformacionToolBarDetalleCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarDetalleCliente;
				
		//protected JButton jButtonModificarToolBarDetalleCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarDetalleCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuDetalleCliente=new JMenuMe("General");
		this.jmenuArchivoDetalleCliente=new JMenuMe("Archivo");
		this.jmenuAccionesDetalleCliente=new JMenuMe("Acciones");
		this.jmenuDatosDetalleCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarDetalleCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarDetalleCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarDetalleCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesDetalleCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesDetalleCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesDetalleCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosDetalleCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarDetalleCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarDetalleCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarDetalleCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormDetalleCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormDetalleCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormDetalleCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaDetalleCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaDetalleCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaDetalleCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionDetalleCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionDetalleCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionDetalleCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionDetalleCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionDetalleCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionDetalleCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresDetalleCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresDetalleCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresDetalleCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesDetalleCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesDetalleCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesDetalleCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByDetalleCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByDetalleCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByDetalleCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByDetalleCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByDetalleCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByDetalleCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosDetalleCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosDetalleCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosDetalleCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoDetalleCliente.add(this.jMenuItemCerrarDetalleCliente);
			
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemNuevoDetalleCliente);
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemNuevoGuardarCambiosDetalleCliente);
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemNuevoRelacionesDetalleCliente);
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemGuardarCambiosTablaDetalleCliente);		
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemDuplicarDetalleCliente);		
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemCopiarDetalleCliente);		
			this.jmenuAccionesDetalleCliente.add(this.jMenuItemVerFormDetalleCliente);		
			
			this.jmenuDatosDetalleCliente.add(this.jMenuItemRecargarInformacionDetalleCliente);				
			this.jmenuDatosDetalleCliente.add(this.jMenuItemAnterioresDetalleCliente);				
			this.jmenuDatosDetalleCliente.add(this.jMenuItemSiguientesDetalleCliente);				
			this.jmenuDatosDetalleCliente.add(this.jMenuItemAbrirOrderByDetalleCliente);				
			this.jmenuDatosDetalleCliente.add(this.jMenuItemMostrarOcultarDetalleCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesDetalleCliente.add(this.jMenuItemGuardarCambiosDetalleCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCliente.add(this.jmenuArchivoDetalleCliente);		
			this.jmenuBarDetalleCliente.add(this.jmenuAccionesDetalleCliente);		
			this.jmenuBarDetalleCliente.add(this.jmenuDatosDetalleCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarDetalleCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasDetalleCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorFechaEmisionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaEmisionDetalleCliente.setToolTipText("Buscar Por Fecha Emision ");
		this.jButtonBusquedaPorFechaEmisionDetalleCliente= new JButtonMe();
		this.jButtonBusquedaPorFechaEmisionDetalleCliente.setText("Buscar");
		this.jButtonBusquedaPorFechaEmisionDetalleCliente.setToolTipText("Buscar Por Fecha Emision ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaEmisionDetalleCliente,"buscar_button","Buscar Por Fecha Emision ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaEmisionDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente = new JLabelMe();
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setText("Fecha Emision :");
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setToolTipText("Fecha Emision");
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente= new JDateChooser();
		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setDate(new Date());
		jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente = new JLabelMe();
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setText("Fecha Emision Final :");
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setToolTipText("Fecha Emision");
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente= new JDateChooser();
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setDate(new Date());
		jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaVenceDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaVenceDetalleCliente.setToolTipText("Buscar Por Fecha Vence ");
		this.jButtonBusquedaPorFechaVenceDetalleCliente= new JButtonMe();
		this.jButtonBusquedaPorFechaVenceDetalleCliente.setText("Buscar");
		this.jButtonBusquedaPorFechaVenceDetalleCliente.setToolTipText("Buscar Por Fecha Vence ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaVenceDetalleCliente,"buscar_button","Buscar Por Fecha Vence ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaVenceDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente = new JLabelMe();
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente.setText("Fecha Vence :");
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente.setToolTipText("Fecha Vence");
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente= new JDateChooser();
		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setDate(new Date());
		jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente = new JLabelMe();
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setText("Fecha Vence Final :");
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setToolTipText("Fecha Vence");
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente= new JDateChooser();
		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setDate(new Date());
		jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelFK_IdAsientoContableDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableDetalleCliente.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableDetalleCliente= new JButtonMe();
		this.jButtonFK_IdAsientoContableDetalleCliente.setText("Buscar");
		this.jButtonFK_IdAsientoContableDetalleCliente.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableDetalleCliente,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente.setFocusable(false);

		this.jPanelFK_IdClienteDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteDetalleCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteDetalleCliente= new JButtonMe();
		this.jButtonFK_IdClienteDetalleCliente.setText("Buscar");
		this.jButtonFK_IdClienteDetalleCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteDetalleCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteDetalleCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteDetalleCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteDetalleCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteDetalleCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente.setFocusable(false);

		this.jPanelFK_IdEstadoDetalleClienteDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoDetalleClienteDetalleCliente.setToolTipText("Buscar Por Estado Detalle Cliente ");
		this.jButtonFK_IdEstadoDetalleClienteDetalleCliente= new JButtonMe();
		this.jButtonFK_IdEstadoDetalleClienteDetalleCliente.setText("Buscar");
		this.jButtonFK_IdEstadoDetalleClienteDetalleCliente.setToolTipText("Buscar Por Estado Detalle Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoDetalleClienteDetalleCliente,"buscar_button","Buscar Por Estado Detalle Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoDetalleClienteDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente = new JLabelMe();
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setText("Estado Detalle Cliente :");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setToolTipText("Estado Detalle Cliente");
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaDetalleCliente.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaDetalleCliente= new JButtonMe();
		this.jButtonFK_IdFacturaDetalleCliente.setText("Buscar");
		this.jButtonFK_IdFacturaDetalleCliente.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaDetalleCliente,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaDetalleCliente = new JLabelMe();
		jLabelid_facturaFK_IdFacturaDetalleCliente.setText("Factura :");
		jLabelid_facturaFK_IdFacturaDetalleCliente.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaDetalleCliente= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente.setFocusable(false);

		this.jPanelFK_IdTipoTransaccionModuloDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoTransaccionModuloDetalleCliente.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		this.jButtonFK_IdTipoTransaccionModuloDetalleCliente= new JButtonMe();
		this.jButtonFK_IdTipoTransaccionModuloDetalleCliente.setText("Buscar");
		this.jButtonFK_IdTipoTransaccionModuloDetalleCliente.setToolTipText("Buscar Por Tipo Transaccion Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoTransaccionModuloDetalleCliente,"buscar_button","Buscar Por Tipo Transaccion Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoTransaccionModuloDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente = new JLabelMe();
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setText("Tipo Transaccion Modulo :");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setToolTipText("Tipo Transaccion Modulo");
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionDetalleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionDetalleCliente.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionDetalleCliente= new JButtonMe();
		this.jButtonFK_IdTransaccionDetalleCliente.setText("Buscar");
		this.jButtonFK_IdTransaccionDetalleCliente.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionDetalleCliente,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionDetalleCliente = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionDetalleCliente.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionDetalleCliente.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionDetalleCliente= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasDetalleCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasDetalleCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasDetalleCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasDetalleCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleDetalleCliente = new DetalleClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Detalle Cliente DATOS");
			this.jInternalFrameDetalleFormDetalleCliente = new DetalleClienteDetalleFormJInternalFrame(jDesktopPane,this.detalleclienteSessionBean.getConGuardarRelaciones(),this.detalleclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormDetalleCliente = null;//new DetalleClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCliente= new GridBagLayout();
		
		
		this.jTableDatosDetalleCliente = new JTableMe();      
		
		String sToolTipDetalleCliente="";
		sToolTipDetalleCliente=DetalleClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCliente+="(Cartera.DetalleCliente)";
		}
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosDetalleCliente.setToolTipText(sToolTipDetalleCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosDetalleCliente);
		this.jTableDatosDetalleCliente.setAutoCreateRowSorter(true);
		this.jTableDatosDetalleCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosDetalleCliente.setRowSelectionAllowed(true);
		this.jTableDatosDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosDetalleCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoDetalleCliente = new JButtonMe();
		this.jButtonDuplicarDetalleCliente = new JButtonMe();
		this.jButtonCopiarDetalleCliente = new JButtonMe();
		this.jButtonVerFormDetalleCliente = new JButtonMe();
		this.jButtonNuevoRelacionesDetalleCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaDetalleCliente = new JButtonMe();
		this.jButtonCerrarDetalleCliente = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralDetalleCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cliente";
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCliente.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoDetalleCliente=new ReporteDinamicoJInternalFrame(DetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoDetalleCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionDetalleCliente=new ImportacionJInternalFrame(DetalleClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionDetalleCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByDetalleCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByDetalleCliente.setText("Orden");
		this.jButtonAbrirOrderByDetalleCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCliente,false,this);
			
			//this.cargarOrderByDetalleCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByDetalleCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCliente,true,this);
			
			//this.cargarOrderByDetalleCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosDetalleCliente.setMinimumSize(new Dimension(400,50));//1530
		this.jTableDatosDetalleCliente.setMaximumSize(new Dimension(400,50));//1530
		this.jTableDatosDetalleCliente.setPreferredSize(new Dimension(400,50));//1530
		
		this.jScrollPanelDatosDetalleCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosDetalleCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoDetalleCliente.setText("Nuevo");
		this.jButtonDuplicarDetalleCliente.setText("Duplicar");
		this.jButtonCopiarDetalleCliente.setText("Copiar");
		this.jButtonVerFormDetalleCliente.setText("Ver");
		this.jButtonNuevoRelacionesDetalleCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaDetalleCliente.setText("Guardar");
		this.jButtonCerrarDetalleCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCliente,"nuevo_button","Nuevo",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarDetalleCliente,"duplicar_button","Duplicar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarDetalleCliente,"copiar_button","Copiar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormDetalleCliente,"ver_form","Ver",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesDetalleCliente,"nuevorelaciones_button","Nuevo Rel",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCliente,"guardarcambiostabla_button","Guardar",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCliente,"cerrar_button","Salir",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoDetalleCliente.setToolTipText("Nuevo"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarDetalleCliente.setToolTipText("Duplicar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarDetalleCliente.setToolTipText("Copiar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormDetalleCliente.setToolTipText("Ver"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesDetalleCliente.setToolTipText("Nuevo Rel"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaDetalleCliente.setToolTipText("Guardar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCliente.setToolTipText("Salir"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCliente";
		inputMap = this.jButtonNuevoDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarDetalleCliente";
		inputMap = this.jButtonDuplicarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarDetalleCliente"));
		
		//COPIAR
		sMapKey = "CopiarDetalleCliente";
		inputMap = this.jButtonCopiarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarDetalleCliente"));
		
		//VEr FORM
		sMapKey = "VerFormDetalleCliente";
		inputMap = this.jButtonVerFormDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormDetalleCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormDetalleCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesDetalleCliente";
		inputMap = this.jButtonNuevoRelacionesDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesDetalleCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarDetalleCliente";
		inputMap = this.jButtonModificarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarDetalleCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarDetalleCliente";
		inputMap = this.jButtonCerrarDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCliente";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1DetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2DetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3DetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4DetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5DetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesDetalleCliente.setName("jPanelParametrosReportesDetalleCliente"); 
		
		this.jPanelParametrosReportesAccionesDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesDetalleCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesDetalleCliente.setName("jPanelParametrosReportesAccionesDetalleCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionDetalleCliente = new JButtonMe();
		this.jButtonRecargarInformacionDetalleCliente.setText("Recargar");
		this.jButtonRecargarInformacionDetalleCliente.setToolTipText("Recargar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionDetalleCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionDetalleCliente = new JButtonMe();
		this.jButtonProcesarInformacionDetalleCliente.setText("Procesar");
		this.jButtonProcesarInformacionDetalleCliente.setToolTipText("Procesar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionDetalleCliente.setVisible(false);
			
		this.jButtonProcesarInformacionDetalleCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionDetalleCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesDetalleCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposReportesDetalleCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesDetalleCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesDetalleCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionDetalleCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionDetalleCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesDetalleCliente.setText("Accion");
		this.jComboBoxTiposRelacionesDetalleCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCliente.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarDetalleCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarDetalleCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarDetalleCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralDetalleCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralDetalleCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralDetalleCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesDetalleCliente = new JLabelMe();
		
		this.jLabelAccionesDetalleCliente.setText("Acciones");		
		this.jLabelAccionesDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosDetalleCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosDetalleCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosDetalleCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosDetalleCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosDetalleCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaDetalleCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaDetalleCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaDetalleCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteDetalleCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteDetalleCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresDetalleCliente = new JButtonMe();
		//this.jButtonAnterioresDetalleCliente.setText("<<");
        this.jButtonAnterioresDetalleCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresDetalleCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesDetalleCliente = new JButtonMe();
		//this.jButtonSiguientesDetalleCliente.setText(">>");
        this.jButtonSiguientesDetalleCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesDetalleCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosDetalleCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosDetalleCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosDetalleCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosDetalleCliente,"nuevoguardarcambios_button","Nue",this.detalleclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosDetalleCliente";
		inputMap = this.jButtonNuevoGuardarCambiosDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosDetalleCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionDetalleCliente";
		inputMap = this.jButtonRecargarInformacionDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionDetalleCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesDetalleCliente";
		inputMap = this.jButtonSiguientesDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesDetalleCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresDetalleCliente";
		inputMap = this.jButtonAnterioresDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresDetalleCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasDetalleCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesDetalleCliente.setMinimumSize(new Dimension(this.getWidth(),DetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCliente.setMaximumSize(new Dimension(this.getWidth(),DetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesDetalleCliente.setPreferredSize(new Dimension(this.getWidth(),DetalleClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(DetalleClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionDetalleCliente = new GridBagLayout();

			this.jPanelPaginacionDetalleCliente.setLayout(gridaBagLayoutPaginacionDetalleCliente);						
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 0;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionDetalleCliente.add(this.jButtonAnterioresDetalleCliente, this.gridBagConstraintsDetalleCliente);
					
						
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCliente.gridy = 0;
			
			this.jPanelPaginacionDetalleCliente.add(this.jButtonNuevoGuardarCambiosDetalleCliente, this.gridBagConstraintsDetalleCliente);
						
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsDetalleCliente.gridy = 0;
			this.jPanelPaginacionDetalleCliente.add(this.jButtonSiguientesDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 1;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCliente.add(this.jButtonNuevoDetalleCliente, this.gridBagConstraintsDetalleCliente);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCliente.gridy = 1;
				this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionDetalleCliente.add(this.jButtonNuevoRelacionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
			}
			
			
			if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsDetalleCliente.gridy = 1;
				this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionDetalleCliente.add(this.jButtonGuardarCambiosTablaDetalleCliente, this.gridBagConstraintsDetalleCliente);
			}
			
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 1;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCliente.add(this.jButtonDuplicarDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 1;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCliente.add(this.jButtonCopiarDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 1;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionDetalleCliente.add(this.jButtonVerFormDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 1;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionDetalleCliente.add(this.jButtonCerrarDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		
		this.jButtonRecargarInformacionDetalleCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionDetalleCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesDetalleCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesDetalleCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesDetalleCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesDetalleCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionDetalleCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionDetalleCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarDetalleCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarDetalleCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaDetalleCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaDetalleCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteDetalleCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteDetalleCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosDetalleCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosDetalleCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosDetalleCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosDetalleCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesDetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesDetalleCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1DetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2DetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3DetalleCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4DetalleCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesDetalleCliente.setLayout(gridaBagParametrosReportesDetalleCliente);
			this.jPanelParametrosReportesAccionesDetalleCliente.setLayout(gridaBagParametrosReportesAccionesDetalleCliente);
			
			
			this.jPanelParametrosAuxiliar1DetalleCliente.setLayout(gridaBagParametrosAuxiliar1DetalleCliente);
			this.jPanelParametrosAuxiliar2DetalleCliente.setLayout(gridaBagParametrosAuxiliar2DetalleCliente);
			this.jPanelParametrosAuxiliar3DetalleCliente.setLayout(gridaBagParametrosAuxiliar3DetalleCliente);
			this.jPanelParametrosAuxiliar4DetalleCliente.setLayout(gridaBagParametrosAuxiliar4DetalleCliente);
			//this.jPanelParametrosAuxiliar5DetalleCliente.setLayout(gridaBagParametrosAuxiliar2DetalleCliente);			
			
			
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCliente.add(this.jButtonRecargarInformacionDetalleCliente, this.gridBagConstraintsDetalleCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCliente.add(this.jComboBoxTiposPaginacionDetalleCliente, this.gridBagConstraintsDetalleCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCliente.add(this.jCheckBoxConAltoMaximoTablaDetalleCliente, this.gridBagConstraintsDetalleCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1DetalleCliente.add(this.jComboBoxTiposArchivosReportesDetalleCliente, this.gridBagConstraintsDetalleCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCliente.add(this.jPanelParametrosAuxiliar1DetalleCliente, this.gridBagConstraintsDetalleCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4DetalleCliente.add(this.jComboBoxTiposReportesDetalleCliente, this.gridBagConstraintsDetalleCliente);																		
			
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4DetalleCliente.add(this.jComboBoxTiposGraficosReportesDetalleCliente, this.gridBagConstraintsDetalleCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCliente.add(this.jPanelParametrosAuxiliar4DetalleCliente, this.gridBagConstraintsDetalleCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCliente.add(this.jComboBoxTiposReportesDetalleCliente, this.gridBagConstraintsDetalleCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCliente.add(this.jCheckBoxGenerarReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCliente.add(this.jPanelParametrosAuxiliar2DetalleCliente, this.gridBagConstraintsDetalleCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCliente.add(this.jLabelAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
				this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesDetalleCliente.add(this.jButtonAbrirOrderByDetalleCliente, this.gridBagConstraintsDetalleCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCliente.add(this.jComboBoxTiposSeleccionarDetalleCliente, this.gridBagConstraintsDetalleCliente);			
			
			
			/*
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCliente.add(this.jCheckBoxSeleccionarTodosDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesDetalleCliente.add(this.jCheckBoxConGraficoReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCliente.add(this.jCheckBoxSeleccionarTodosDetalleCliente, this.gridBagConstraintsDetalleCliente);															
				
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCliente.add(this.jCheckBoxSeleccionadosDetalleCliente, this.gridBagConstraintsDetalleCliente);															
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsDetalleCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3DetalleCliente.add(this.jCheckBoxConGraficoReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesDetalleCliente.add(this.jPanelParametrosAuxiliar3DetalleCliente, this.gridBagConstraintsDetalleCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCliente.add(this.jComboBoxTiposRelacionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
				
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCliente.add(this.jComboBoxTiposAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
	
				
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsDetalleCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesDetalleCliente.add(this.jTextFieldValorCampoGeneralDetalleCliente, this.gridBagConstraintsDetalleCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosDetalleCliente = new GridBagLayout();

			this.jScrollPanelDatosDetalleCliente.setLayout(gridaBagLayoutDatosDetalleCliente);
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = 0;
			this.gridBagConstraintsDetalleCliente.gridx = 0;
			
			this.jScrollPanelDatosDetalleCliente.add(this.jTableDatosDetalleCliente, this.gridBagConstraintsDetalleCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosDetalleCliente.setViewportView(this.jTableDatosDetalleCliente);
		this.jTableDatosDetalleCliente.setFillsViewportHeight(true);
		this.jTableDatosDetalleCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDetalleCliente= new GridBagLayout();
		this.jPanelAccionesDetalleCliente.setLayout(gridaBagLayoutAccionesDetalleCliente);
		
		
		/*	
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = 0;
		this.gridBagConstraintsDetalleCliente.gridx = 0;
			
		this.jPanelAccionesDetalleCliente.add(this.jButtonNuevoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaEmisionDetalleCliente.setLayout(gridaBagLayoutBusquedaPorFechaEmisionDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelBusquedaPorFechaEmisionDetalleCliente.add(jLabelfecha_emisionBusquedaPorFechaEmisionDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelBusquedaPorFechaEmisionDetalleCliente.add(jDateChooserfecha_emisionBusquedaPorFechaEmisionDetalleCliente, gridBagConstraintsDetalleCliente);


		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelBusquedaPorFechaEmisionDetalleCliente.add(jLabelfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelBusquedaPorFechaEmisionDetalleCliente.add(jDateChooserfecha_emisionBusquedaPorFechaEmisionFinalDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 2;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelBusquedaPorFechaEmisionDetalleCliente.add(jButtonBusquedaPorFechaEmisionDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("1.-Por Fecha Emision Por Fecha Emision Final", jPanelBusquedaPorFechaEmisionDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaVenceDetalleCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaVenceDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaVenceDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaVenceDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaVenceDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaVenceDetalleCliente.setLayout(gridaBagLayoutBusquedaPorFechaVenceDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelBusquedaPorFechaVenceDetalleCliente.add(jLabelfecha_venceBusquedaPorFechaVenceDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelBusquedaPorFechaVenceDetalleCliente.add(jDateChooserfecha_venceBusquedaPorFechaVenceDetalleCliente, gridBagConstraintsDetalleCliente);


		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelBusquedaPorFechaVenceDetalleCliente.add(jLabelfecha_venceBusquedaPorFechaVenceFinalDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelBusquedaPorFechaVenceDetalleCliente.add(jDateChooserfecha_venceBusquedaPorFechaVenceFinalDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 2;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelBusquedaPorFechaVenceDetalleCliente.add(jButtonBusquedaPorFechaVenceDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("2.-Por Fecha Vence Por Fecha Vence Final", jPanelBusquedaPorFechaVenceDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdAsientoContableDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableDetalleCliente.setLayout(gridaBagLayoutFK_IdAsientoContableDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdAsientoContableDetalleCliente.add(jLabelid_asiento_contableFK_IdAsientoContableDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdAsientoContableDetalleCliente.add(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleCliente, gridBagConstraintsDetalleCliente);


		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdAsientoContableDetalleCliente.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdAsientoContableDetalleCliente.add(jButtonFK_IdAsientoContableDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("3.-Por Asiento Contable ", jPanelFK_IdAsientoContableDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdClienteDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteDetalleCliente.setLayout(gridaBagLayoutFK_IdClienteDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdClienteDetalleCliente.add(jLabelid_clienteFK_IdClienteDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdClienteDetalleCliente.add(jComboBoxid_clienteFK_IdClienteDetalleCliente, gridBagConstraintsDetalleCliente);


		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdClienteDetalleCliente.add(this.jButtonBuscarFK_IdClienteid_clienteDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdClienteDetalleCliente.add(jButtonFK_IdClienteDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("4.-Por Cliente ", jPanelFK_IdClienteDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoDetalleClienteDetalleCliente.setLayout(gridaBagLayoutFK_IdEstadoDetalleClienteDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdEstadoDetalleClienteDetalleCliente.add(jLabelid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdEstadoDetalleClienteDetalleCliente.add(jComboBoxid_estado_detalle_clienteFK_IdEstadoDetalleClienteDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdEstadoDetalleClienteDetalleCliente.add(jButtonFK_IdEstadoDetalleClienteDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("5.-Por Estado Detalle Cliente ", jPanelFK_IdEstadoDetalleClienteDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdFacturaDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaDetalleCliente.setLayout(gridaBagLayoutFK_IdFacturaDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdFacturaDetalleCliente.add(jLabelid_facturaFK_IdFacturaDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdFacturaDetalleCliente.add(jComboBoxid_facturaFK_IdFacturaDetalleCliente, gridBagConstraintsDetalleCliente);


		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdFacturaDetalleCliente.add(this.jButtonBuscarFK_IdFacturaid_facturaDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdFacturaDetalleCliente.add(jButtonFK_IdFacturaDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("6.-Por Factura ", jPanelFK_IdFacturaDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoTransaccionModuloDetalleCliente.setLayout(gridaBagLayoutFK_IdTipoTransaccionModuloDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdTipoTransaccionModuloDetalleCliente.add(jLabelid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdTipoTransaccionModuloDetalleCliente.add(jComboBoxid_tipo_transaccion_moduloFK_IdTipoTransaccionModuloDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdTipoTransaccionModuloDetalleCliente.add(jButtonFK_IdTipoTransaccionModuloDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("7.-Por Tipo Transaccion Modulo ", jPanelFK_IdTipoTransaccionModuloDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdTransaccionDetalleCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionDetalleCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionDetalleCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionDetalleCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionDetalleCliente.setLayout(gridaBagLayoutFK_IdTransaccionDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 0;
		jPanelFK_IdTransaccionDetalleCliente.add(jLabelid_transaccionFK_IdTransaccionDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 0;
		gridBagConstraintsDetalleCliente.gridx = 1;
		jPanelFK_IdTransaccionDetalleCliente.add(jComboBoxid_transaccionFK_IdTransaccionDetalleCliente, gridBagConstraintsDetalleCliente);

		gridBagConstraintsDetalleCliente = new GridBagConstraints();
		gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsDetalleCliente.gridy = 1;
		gridBagConstraintsDetalleCliente.gridx =1;
		jPanelFK_IdTransaccionDetalleCliente.add(jButtonFK_IdTransaccionDetalleCliente, gridBagConstraintsDetalleCliente);

		jTabbedPaneBusquedasDetalleCliente.addTab("8.-Por Transaccion ", jPanelFK_IdTransaccionDetalleCliente);
		jTabbedPaneBusquedasDetalleCliente.setMnemonicAt(7, KeyEvent.VK_8);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCliente.gridx = 0;		
			//this.gridBagConstraintsDetalleCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarDetalleCliente, this.gridBagConstraintsDetalleCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsDetalleCliente.gridx = 0;		
		//this.gridBagConstraintsDetalleCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsDetalleCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsDetalleCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCliente.gridx = 0;		
			this.gridBagConstraintsDetalleCliente.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsDetalleCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasDetalleCliente, this.gridBagConstraintsDetalleCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesDetalleCliente, this.gridBagConstraintsDetalleCliente);								
		
		
		/*
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
		*/		
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCliente.gridx =0;
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCliente, this.gridBagConstraintsDetalleCliente);
				
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionDetalleCliente, this.gridBagConstraintsDetalleCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(DetalleClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosDetalleCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosDetalleCliente.setLayout(gridaBagLayoutBusquedasParametrosDetalleCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralDetalleCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCliente, this.gridBagConstraintsDetalleCliente);
			
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCliente, this.gridBagConstraintsDetalleCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralDetalleCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoDetalleCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoDetalleCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoDetalleCliente.setName("jPanelReporteDinamicoDetalleCliente"); 
		
		this.jPanelReporteDinamicoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoDetalleCliente.setLayout(gridaBagLayoutReporteDinamicoDetalleCliente);
		
		
		this.jInternalFrameReporteDinamicoDetalleCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoDetalleCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoDetalleCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoDetalleCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoDetalleCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoDetalleCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoDetalleCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteDetalleCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteDetalleCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelColumnasSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteDetalleCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteDetalleCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteDetalleCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteDetalleCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteDetalleCliente=new JScrollPane(this.jListColumnasSelectReporteDetalleCliente);
			
			this.jScrollColumnasSelectReporteDetalleCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteDetalleCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCliente.add(this.jListColumnasSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		this.jPanelReporteDinamicoDetalleCliente.add(this.jScrollColumnasSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteDetalleCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteDetalleCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelRelacionesSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteDetalleCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteDetalleCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteDetalleCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteDetalleCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteDetalleCliente=new JScrollPane(this.jListRelacionesSelectReporteDetalleCliente);
			
			this.jScrollRelacionesSelectReporteDetalleCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteDetalleCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoDetalleCliente.add(this.jListRelacionesSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		this.jPanelReporteDinamicoDetalleCliente.add(this.jScrollRelacionesSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoDetalleCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoDetalleCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoDetalleCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoDetalleCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoDetalleCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoDetalleCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoDetalleCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelConGraficoDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoDetalleCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoDetalleCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoDetalleCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoDetalleCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoDetalleCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jCheckBoxConGraficoDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoDetalleCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoDetalleCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelColumnaCategoriaGraficoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoDetalleCliente.add(this.jComboBoxColumnaCategoriaGraficoDetalleCliente, this.gridBagConstraintsDetalleCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorDetalleCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorDetalleCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelColumnaCategoriaValorDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorDetalleCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorDetalleCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorDetalleCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorDetalleCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorDetalleCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoDetalleCliente.add(this.jComboBoxColumnaCategoriaValorDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoDetalleCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoDetalleCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelColumnasValoresGraficoDetalleCliente, this.gridBagConstraintsDetalleCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoDetalleCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoDetalleCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoDetalleCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoDetalleCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoDetalleCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoDetalleCliente=new JScrollPane(this.jListColumnasValoresGraficoDetalleCliente);
			
			this.jScrollColumnasValoresGraficoDetalleCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoDetalleCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoDetalleCliente.add(this.jListColumnasSelectReporteDetalleCliente, this.gridBagConstraintsDetalleCliente);
		this.jPanelReporteDinamicoDetalleCliente.add(this.jScrollColumnasValoresGraficoDetalleCliente, this.gridBagConstraintsDetalleCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoDetalleCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoDetalleCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelTiposGraficosReportesDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoDetalleCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jComboBoxTiposGraficosReportesDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoDetalleCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoDetalleCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelGenerarExcelReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoDetalleCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoDetalleCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoDetalleCliente.setToolTipText("Generar EXCEL"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoDetalleCliente.add(this.jButtonGenerarExcelReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCliente.add(this.jComboBoxTiposReportesDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoDetalleCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoDetalleCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoDetalleCliente.add(this.jLabelTiposArchivoReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCliente.add(this.jComboBoxTiposArchivosReportesDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoDetalleCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoDetalleCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoDetalleCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoDetalleCliente.setToolTipText("Generar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCliente.add(this.jButtonGenerarReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoDetalleCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoDetalleCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoDetalleCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoDetalleCliente.setToolTipText("Cancelar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoDetalleCliente.add(this.jButtonCerrarReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalDetalleCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoDetalleCliente= new JScrollPane(jPanelReporteDinamicoDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoDetalleCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoDetalleCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsDetalleCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoDetalleCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalDetalleCliente);
		this.jInternalFrameReporteDinamicoDetalleCliente.getContentPane().add(this.jScrollPanelReporteDinamicoDetalleCliente, this.gridBagConstraintsDetalleCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionDetalleCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionDetalleCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionDetalleCliente.setName("jPanelImportacionDetalleCliente"); 
		
		this.jPanelImportacionDetalleCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionDetalleCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionDetalleCliente.setLayout(gridaBagLayoutImportacionDetalleCliente);
		
		
		this.jInternalFrameImportacionDetalleCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionDetalleCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionDetalleCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteDetalleCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionDetalleCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCliente.setResizable(true);
	    this.jInternalFrameImportacionDetalleCliente.setClosable(true);
	    this.jInternalFrameImportacionDetalleCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionDetalleCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionDetalleCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionDetalleCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionDetalleCliente.setResizable(true);
	    this.jInternalFrameImportacionDetalleCliente.setClosable(true);
	    this.jInternalFrameImportacionDetalleCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionDetalleCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionDetalleCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionDetalleCliente = new JLabelMe();

		this.jLabelArchivoImportacionDetalleCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCliente.add(this.jLabelArchivoImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionDetalleCliente = new JFileChooser();		
		this.jFileChooserImportacionDetalleCliente.setToolTipText("ESCOGER ARCHIVO"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionDetalleCliente = new JButtonMe();
		this.jButtonAbrirImportacionDetalleCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionDetalleCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionDetalleCliente.setToolTipText("Generar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCliente.add(this.jButtonAbrirImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionDetalleCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionDetalleCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionDetalleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionDetalleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionDetalleCliente.add(this.jLabelPathArchivoImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionDetalleCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionDetalleCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionDetalleCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCliente.add(this.jTextFieldPathArchivoImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionDetalleCliente = new JButtonMe();
		this.jButtonGenerarImportacionDetalleCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionDetalleCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionDetalleCliente.setToolTipText("Generar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCliente.add(this.jButtonGenerarImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionDetalleCliente = new JButtonMe();
		this.jButtonCerrarImportacionDetalleCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionDetalleCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionDetalleCliente.setToolTipText("Cancelar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsDetalleCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionDetalleCliente.add(this.jButtonCerrarImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalDetalleCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionDetalleCliente= new JScrollPane(jPanelImportacionDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
		this.gridBagConstraintsDetalleCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsDetalleCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionDetalleCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalDetalleCliente);
		this.jInternalFrameImportacionDetalleCliente.getContentPane().add(this.jScrollPanelImportacionDetalleCliente, this.gridBagConstraintsDetalleCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByDetalleCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByDetalleCliente = new JButtonMe();
			this.jButtonAbrirOrderByDetalleCliente.setText("Orden");
			this.jButtonAbrirOrderByDetalleCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByDetalleCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByDetalleCliente";
			inputMap = this.jButtonAbrirOrderByDetalleCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByDetalleCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByDetalleCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByDetalleCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByDetalleCliente.setName("jPanelOrderByDetalleCliente"); 
			
			this.jPanelOrderByDetalleCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByDetalleCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByDetalleCliente.setLayout(gridaBagLayoutOrderByDetalleCliente);
			
			
			this.jTableDatosDetalleClienteOrderBy = new JTableMe();        
			this.jTableDatosDetalleClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosDetalleClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosDetalleClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosDetalleClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosDetalleClienteOrderBy.setViewportView(this.jTableDatosDetalleClienteOrderBy);
			this.jTableDatosDetalleClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosDetalleClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByDetalleCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByDetalleCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByDetalleCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteDetalleCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByDetalleCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByDetalleCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByDetalleCliente.setTitle("Orden");
			this.jInternalFrameOrderByDetalleCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByDetalleCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByDetalleCliente.setResizable(true);
			this.jInternalFrameOrderByDetalleCliente.setClosable(true);
			this.jInternalFrameOrderByDetalleCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByDetalleCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByDetalleCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByDetalleCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsDetalleCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsDetalleCliente.ipady =150;
				
			this.jPanelOrderByDetalleCliente.add(jScrollPanelDatosDetalleClienteOrderBy, this.gridBagConstraintsDetalleCliente);//this.jTableDatosDetalleClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByDetalleCliente = new JButtonMe();
			this.jButtonCerrarOrderByDetalleCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByDetalleCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByDetalleCliente.setToolTipText("Cancelar"+" "+DetalleClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsDetalleCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByDetalleCliente.add(this.jButtonCerrarOrderByDetalleCliente, this.gridBagConstraintsDetalleCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalDetalleCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByDetalleCliente= new JScrollPane(jPanelOrderByDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsDetalleCliente = new GridBagConstraints();
			this.gridBagConstraintsDetalleCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsDetalleCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsDetalleCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByDetalleCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByDetalleCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalDetalleCliente);
			
			this.jInternalFrameOrderByDetalleCliente.getContentPane().add(this.jScrollPanelOrderByDetalleCliente, this.gridBagConstraintsDetalleCliente);			
		
		} else {
			this.jButtonAbrirOrderByDetalleCliente = new JButtonMe();
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
		iWidthTableCalculado+=1530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.detalleclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosDetalleCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosDetalleCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosDetalleCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosDetalleCliente.getRowHeight();//DetalleClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > DetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCliente.isSelected()) {
					iHeightTable=DetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > DetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaDetalleCliente.isSelected()) {
					iHeightTable=DetalleClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < DetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=DetalleClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosDetalleCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosDetalleCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosDetalleCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosDetalleCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByDetalleCliente!=null && this.jInternalFrameOrderByDetalleCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.detalleclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByDetalleCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByDetalleCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByDetalleCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByDetalleCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByDetalleCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByDetalleCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByDetalleCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosDetalleCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosDetalleCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=detalleclienteLogic.getDetalleClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<DetalleCliente> TraerDetalleClienteBeans(List<DetalleCliente> detalleclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(DetalleCliente detallecliente:detalleclientes) {
					
				if(!(DetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || DetalleClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					detallecliente.setsDetalleGeneralEntityReporte(DetalleClienteConstantesFunciones.getDetalleClienteDescripcion(detallecliente));
										
						
					
					

					if(detallecliente.getDetalleRecaps()!=null && Funciones.existeClass(classes,DetalleRecap.class)) {
						try{detallecliente.setdetallerecapsDescripcionReporte(new JRBeanCollectionDataSource(DetalleRecapJInternalFrame.TraerDetalleRecapBeans(detallecliente.getDetalleRecaps(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//detallecliente.setsDetalleGeneralEntityReporte(detallecliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//detalleclientebeans.add(detalleclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return detalleclientes;
    }
	//PARA REPORTES FIN
}
