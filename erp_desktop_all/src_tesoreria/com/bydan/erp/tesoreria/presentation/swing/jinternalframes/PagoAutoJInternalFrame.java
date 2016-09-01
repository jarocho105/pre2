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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.PagoAutoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class PagoAutoJInternalFrame extends PagoAutoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarPagoAuto;
	
	protected JMenuBar jmenuBarPagoAuto;
	
	protected JMenu jmenuPagoAuto;
	protected JMenu jmenuDatosPagoAuto;
	protected JMenu jmenuArchivoPagoAuto;
	protected JMenu jmenuAccionesPagoAuto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagoAuto;	
	protected GridBagConstraints gridBagConstraintsPagoAuto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public PagoAutoDetalleFormJInternalFrame jInternalFrameDetalleFormPagoAuto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoPagoAuto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionPagoAuto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleprove="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected EstadoPagoAutoBeanSwingJInternalFrame estadopagoautoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopagoauto="";
	
	public PagoAutoSessionBean pagoautoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public DetalleProveSessionBean detalleproveSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public EstadoPagoAutoSessionBean estadopagoautoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<PagoAuto> pagoautos;		
	public List<PagoAuto> pagoautosEliminados;	
	public List<PagoAuto> pagoautosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByPagoAuto;		
	protected JButton jButtonAbrirOrderByPagoAuto;
	
	
	//protected JPanel jPanelOrderByPagoAuto;
	//public JScrollPane jScrollPanelOrderByPagoAuto;	
	//protected JButton jButtonCerrarOrderByPagoAuto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public PagoAutoLogic pagoautoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosPagoAuto;
	public JScrollPane jScrollPanelDatosEdicionPagoAuto;
	public JScrollPane jScrollPanelDatosGeneralPagoAuto;
    
	
	
	//public JScrollPane jScrollPanelDatosPagoAutoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoPagoAuto;
	//public JScrollPane jScrollPanelImportacionPagoAuto;
	
	
	
	protected JPanel jPanelAccionesPagoAuto;
	
    protected JPanel jPanelPaginacionPagoAuto;
    protected JPanel jPanelParametrosReportesPagoAuto;
	protected JPanel jPanelParametrosReportesAccionesPagoAuto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1PagoAuto;
	protected JPanel jPanelParametrosAuxiliar2PagoAuto;
	protected JPanel jPanelParametrosAuxiliar3PagoAuto;
	protected JPanel jPanelParametrosAuxiliar4PagoAuto;
	//protected JPanel jPanelParametrosAuxiliar5PagoAuto;
	
	
	
	//protected JPanel jPanelReporteDinamicoPagoAuto;
	//protected JPanel jPanelImportacionPagoAuto;
	
	
	public JTable jTableDatosPagoAuto;
	
	
	
	//public JTable jTableDatosPagoAutoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoPagoAuto;
	protected JButton jButtonDuplicarPagoAuto;
	protected JButton jButtonCopiarPagoAuto;
	protected JButton jButtonVerFormPagoAuto;
	protected JButton jButtonNuevoRelacionesPagoAuto;
	protected JButton jButtonModificarPagoAuto;
	
    protected JButton jButtonGuardarCambiosTablaPagoAuto;
	protected JButton jButtonCerrarPagoAuto;
	
	
	protected JButton jButtonRecargarInformacionPagoAuto;
	protected JButton jButtonProcesarInformacionPagoAuto;
	
	
	protected JButton jButtonAnterioresPagoAuto;
	protected JButton jButtonSiguientesPagoAuto;
	protected JButton jButtonNuevoGuardarCambiosPagoAuto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoPagoAuto;
	//protected JButton jButtonCerrarReporteDinamicoPagoAuto;
	//protected JButton jButtonGenerarExcelReporteDinamicoPagoAuto;	
	
	
	
	//protected JButton jButtonAbrirImportacionPagoAuto;
	//protected JButton jButtonGenerarImportacionPagoAuto;
	//protected JButton jButtonCerrarImportacionPagoAuto;
	//protected JFileChooser jFileChooserImportacionPagoAuto;
	//protected File fileImportacionPagoAuto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagoAuto;
	protected JButton jButtonDuplicarToolBarPagoAuto;
	protected JButton jButtonNuevoRelacionesToolBarPagoAuto;
	
	
	public JButton jButtonGuardarCambiosToolBarPagoAuto;
	protected JButton jButtonCopiarToolBarPagoAuto;
	protected JButton jButtonVerFormToolBarPagoAuto;
	public JButton jButtonGuardarCambiosTablaToolBarPagoAuto;
	protected JButton jButtonMostrarOcultarTablaToolBarPagoAuto;
	protected JButton jButtonCerrarToolBarPagoAuto;
	
	protected JButton jButtonRecargarInformacionToolBarPagoAuto;
	protected JButton jButtonProcesarInformacionToolBarPagoAuto;
	protected JButton jButtonAnterioresToolBarPagoAuto;
	protected JButton jButtonSiguientesToolBarPagoAuto;
	protected JButton jButtonNuevoGuardarCambiosToolBarPagoAuto;
	protected JButton jButtonAbrirOrderByToolBarPagoAuto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagoAuto;
	protected JMenuItem jMenuItemDuplicarPagoAuto;
	protected JMenuItem jMenuItemNuevoRelacionesPagoAuto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosPagoAuto;
	protected JMenuItem jMenuItemCopiarPagoAuto;
	protected JMenuItem jMenuItemVerFormPagoAuto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagoAuto;
	protected JMenuItem jMenuItemCerrarPagoAuto;
	protected JMenuItem jMenuItemDetalleCerrarPagoAuto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByPagoAuto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagoAuto;
	
	protected JMenuItem jMenuItemRecargarInformacionPagoAuto;
	protected JMenuItem jMenuItemProcesarInformacionPagoAuto;
	protected JMenuItem jMenuItemAnterioresPagoAuto;
	protected JMenuItem jMenuItemSiguientesPagoAuto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagoAuto;
	protected JMenuItem jMenuItemAbrirOrderByPagoAuto;
	protected JMenuItem jMenuItemMostrarOcultarPagoAuto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagoAuto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosPagoAuto;
	protected JCheckBox jCheckBoxSeleccionadosPagoAuto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaPagoAuto;
	protected JCheckBox jCheckBoxConGraficoReportePagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesPagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesPagoAuto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoPagoAuto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoPagoAuto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarPagoAuto;
	protected JTextField jTextFieldValorCampoGeneralPagoAuto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReportePagoAuto;
	//public JList<Reporte> jListColumnasSelectReportePagoAuto;
	//public JScrollPane jScrollColumnasSelectReportePagoAuto;
	
	//public JLabel jLabelRelacionesSelectReportePagoAuto;
	//public JList<Reporte> jListRelacionesSelectReportePagoAuto;
	//public JScrollPane jScrollRelacionesSelectReportePagoAuto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoPagoAuto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoPagoAuto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoPagoAuto;
	//public JLabel jLabelTiposArchivoReporteDinamicoPagoAuto;
	
		
	//public JLabel jLabelArchivoImportacionPagoAuto;	
	//public JLabel jLabelPathArchivoImportacionPagoAuto;
	//protected JTextField jTextFieldPathArchivoImportacionPagoAuto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoPagoAuto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoPagoAuto;
	
	//public JLabel jLabelColumnaCategoriaValorPagoAuto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorPagoAuto;
	
	//public JLabel jLabelColumnasValoresGraficoPagoAuto;
	//public JList<Reporte> jListColumnasValoresGraficoPagoAuto;
	//public JScrollPane jScrollColumnasValoresGraficoPagoAuto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoPagoAuto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoPagoAuto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasPagoAuto;
	public JPanel jPanelFK_IdAsientoContablePagoAuto;
	public JButton jButtonFK_IdAsientoContablePagoAuto;
	public JPanel jPanelFK_IdCentroActividadPagoAuto;
	public JButton jButtonFK_IdCentroActividadPagoAuto;
	public JPanel jPanelFK_IdCentroCostoPagoAuto;
	public JButton jButtonFK_IdCentroCostoPagoAuto;
	public JPanel jPanelFK_IdClientePagoAuto;
	public JButton jButtonFK_IdClientePagoAuto;
	public JPanel jPanelFK_IdCuentaBancoPagoAuto;
	public JButton jButtonFK_IdCuentaBancoPagoAuto;
	public JPanel jPanelFK_IdDetalleProvePagoAuto;
	public JButton jButtonFK_IdDetalleProvePagoAuto;
	public JPanel jPanelFK_IdEstadoPagoAutoPagoAuto;
	public JButton jButtonFK_IdEstadoPagoAutoPagoAuto;
	public JPanel jPanelFK_IdFacturaPagoAuto;
	public JButton jButtonFK_IdFacturaPagoAuto;
	public JPanel jPanelFK_IdTransaccionPagoAuto;
	public JButton jButtonFK_IdTransaccionPagoAuto;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContablePagoAuto;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContablePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto;
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePagoAuto= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContablePagoAutoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto;
	
	public JPanel jPanelid_centro_actividadFK_IdCentroActividadPagoAuto;
	public JLabel jLabelid_centro_actividadFK_IdCentroActividadPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto;
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPagoAuto= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadPagoAutoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoPagoAuto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoPagoAuto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPagoAutoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoPagoAutoArbol= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClientePagoAuto;
	public JLabel jLabelid_clienteFK_IdClientePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClientePagoAuto;
	public JButton jButtonid_clienteFK_IdClientePagoAuto= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClientePagoAutoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clientePagoAuto;
	
	public JPanel jPanelid_cuenta_bancoFK_IdCuentaBancoPagoAuto;
	public JLabel jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto;
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoPagoAuto= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoPagoAutoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_proveFK_IdDetalleProvePagoAuto;
	public JLabel jLabelid_detalle_proveFK_IdDetalleProvePagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto;
	public JButton jButtonid_detalle_proveFK_IdDetalleProvePagoAuto= new JButtonMe();
	public JButton jButtonid_detalle_proveFK_IdDetalleProvePagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_proveFK_IdDetalleProvePagoAutoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto;
	public JLabel jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto;
	public JButton jButtonid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto= new JButtonMe();
	public JButton jButtonid_estado_pago_autoFK_IdEstadoPagoAutoPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_estado_pago_autoFK_IdEstadoPagoAutoPagoAutoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaPagoAuto;
	public JLabel jLabelid_facturaFK_IdFacturaPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaPagoAuto;
	public JButton jButtonid_facturaFK_IdFacturaPagoAuto= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaPagoAutoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaPagoAuto;
	
	public JPanel jPanelid_transaccionFK_IdTransaccionPagoAuto;
	public JLabel jLabelid_transaccionFK_IdTransaccionPagoAuto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionPagoAuto;
	public JButton jButtonid_transaccionFK_IdTransaccionPagoAuto= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionPagoAutoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionPagoAutoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public PagoAutoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagoAutoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionPagoAuto)	{
		this.jButtonRecargarInformacionPagoAuto = jButtonRecargarInformacionPagoAuto;
	}
	
	public JButton getjButtonProcesarInformacionPagoAuto() {
		return this.jButtonProcesarInformacionPagoAuto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagoAuto)	{
		this.jButtonProcesarInformacionPagoAuto = jButtonProcesarInformacionPagoAuto;
	}
	
	
	public JButton getjButtonRecargarInformacionPagoAuto() {
		return this.jButtonRecargarInformacionPagoAuto;
	}
	
	
	public List<PagoAuto> getpagoautos() {
		return this.pagoautos;
	}

	public void setpagoautos(List<PagoAuto> pagoautos) {
		this.pagoautos = pagoautos;
	}
	
	public List<PagoAuto> getpagoautosAux() {
		return this.pagoautosAux;
	}

	public void setpagoautosAux(List<PagoAuto> pagoautosAux) {
		this.pagoautosAux = pagoautosAux;
	}
	
	public List<PagoAuto> getpagoautosEliminados() {
		return this.pagoautosEliminados;
	}

	public void setPagoAutosEliminados(List<PagoAuto> pagoautosEliminados) {
		this.pagoautosEliminados = pagoautosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarPagoAuto() {
		return jComboBoxTiposSeleccionarPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarPagoAuto(
			JComboBox jComboBoxTiposSeleccionarPagoAuto) {
		this.jComboBoxTiposSeleccionarPagoAuto = jComboBoxTiposSeleccionarPagoAuto;
	}
	
	public void setBorderResaltarTiposSeleccionarPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarPagoAuto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralPagoAuto() {
		return jTextFieldValorCampoGeneralPagoAuto;
	}

	public void setjTextFieldValorCampoGeneralPagoAuto(
			JTextField jTextFieldValorCampoGeneralPagoAuto) {
		this.jTextFieldValorCampoGeneralPagoAuto = jTextFieldValorCampoGeneralPagoAuto;
	}

	public void setBorderResaltarValorCampoGeneralPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralPagoAuto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosPagoAuto() {
		return this.jCheckBoxSeleccionarTodosPagoAuto;
	}

	public void setjCheckBoxSeleccionarTodosPagoAuto(
			JCheckBox jCheckBoxSeleccionarTodosPagoAuto) {
		this.jCheckBoxSeleccionarTodosPagoAuto = jCheckBoxSeleccionarTodosPagoAuto;
	}

	public void setBorderResaltarSeleccionarTodosPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosPagoAuto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosPagoAuto() {
		return this.jCheckBoxSeleccionadosPagoAuto;
	}

	public void setjCheckBoxSeleccionadosPagoAuto(
			JCheckBox jCheckBoxSeleccionadosPagoAuto) {
		this.jCheckBoxSeleccionadosPagoAuto = jCheckBoxSeleccionadosPagoAuto;
	}
	
	public void setBorderResaltarSeleccionadosPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosPagoAuto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesPagoAuto() {
		return this.jComboBoxTiposArchivosReportesPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesPagoAuto(
			JComboBox jComboBoxTiposArchivosReportesPagoAuto) {
		this.jComboBoxTiposArchivosReportesPagoAuto = jComboBoxTiposArchivosReportesPagoAuto;
	}

	public void setBorderResaltarTiposArchivosReportesPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesPagoAuto() {
		return this.jComboBoxTiposReportesPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesPagoAuto(
			JComboBox jComboBoxTiposReportesPagoAuto) {
		this.jComboBoxTiposReportesPagoAuto = jComboBoxTiposReportesPagoAuto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoPagoAuto() {
	//	return jComboBoxTiposReportesDinamicoPagoAuto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoPagoAuto(
	//		JComboBox jComboBoxTiposReportesDinamicoPagoAuto) {
	//	this.jComboBoxTiposReportesDinamicoPagoAuto = jComboBoxTiposReportesDinamicoPagoAuto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoPagoAuto() {
	//	return jComboBoxTiposArchivosReportesDinamicoPagoAuto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoPagoAuto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoPagoAuto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoPagoAuto = jComboBoxTiposArchivosReportesDinamicoPagoAuto;
	//}
	
	public void setBorderResaltarTiposReportesPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesPagoAuto() {
		return this.jComboBoxTiposGraficosReportesPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesPagoAuto(
			JComboBox jComboBoxTiposGraficosReportesPagoAuto) {
		this.jComboBoxTiposGraficosReportesPagoAuto = jComboBoxTiposGraficosReportesPagoAuto;
	}
	
	public void setBorderResaltarTiposGraficosReportesPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionPagoAuto() {
		return this.jComboBoxTiposPaginacionPagoAuto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionPagoAuto(
			JComboBox jComboBoxTiposPaginacionPagoAuto) {
		this.jComboBoxTiposPaginacionPagoAuto = jComboBoxTiposPaginacionPagoAuto;
	}
	
	public void setBorderResaltarTiposPaginacionPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionPagoAuto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesPagoAuto() {
		return this.jComboBoxTiposRelacionesPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagoAuto() {
		return this.jComboBoxTiposAccionesPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagoAuto(
			JComboBox jComboBoxTiposRelacionesPagoAuto) {
		this.jComboBoxTiposRelacionesPagoAuto = jComboBoxTiposRelacionesPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagoAuto(
			JComboBox jComboBoxTiposAccionesPagoAuto) {
		this.jComboBoxTiposAccionesPagoAuto = jComboBoxTiposAccionesPagoAuto;
	}
	
	public void setBorderResaltarTiposRelacionesPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesPagoAuto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesPagoAuto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarPagoAuto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesPagoAuto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoPagoAuto() {
	//	return jCheckBoxConGraficoDinamicoPagoAuto;
	//}

	//public void setjCheckBoxConGraficoDinamicoPagoAuto(
	//		JCheckBox jCheckBoxConGraficoDinamicoPagoAuto) {
	//	this.jCheckBoxConGraficoDinamicoPagoAuto = jCheckBoxConGraficoDinamicoPagoAuto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoPagoAuto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarPagoAuto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoPagoAuto .setBorder(borderResaltar);		
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
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		
		this.pagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagoautoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagoAutoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pago Auto MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
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
		
		PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("PagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarPagoAuto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"nuevo","nuevo","Nuevo"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"duplicar","duplicar","Duplicar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"copiar","copiar","Copiar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"ver_form","ver_form","Ver"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"recargar","recargar","Recargar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarPagoAuto,this.jTtoolBarPagoAuto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarPagoAuto,this.jTtoolBarPagoAuto,
							"cerrar","cerrar","Salir"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarPagoAuto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarPagoAuto;
			
				this.jButtonProcesarInformacionToolBarPagoAuto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarPagoAuto;
				
		//protected JButton jButtonModificarToolBarPagoAuto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarPagoAuto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuPagoAuto=new JMenuMe("General");
		this.jmenuArchivoPagoAuto=new JMenuMe("Archivo");
		this.jmenuAccionesPagoAuto=new JMenuMe("Acciones");
		this.jmenuDatosPagoAuto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagoAuto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagoAuto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagoAuto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarPagoAuto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarPagoAuto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarPagoAuto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesPagoAuto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesPagoAuto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesPagoAuto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosPagoAuto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagoAuto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagoAuto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarPagoAuto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarPagoAuto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarPagoAuto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormPagoAuto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormPagoAuto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormPagoAuto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaPagoAuto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaPagoAuto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaPagoAuto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionPagoAuto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionPagoAuto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionPagoAuto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionPagoAuto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionPagoAuto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionPagoAuto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresPagoAuto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresPagoAuto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresPagoAuto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesPagoAuto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesPagoAuto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesPagoAuto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByPagoAuto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByPagoAuto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByPagoAuto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByPagoAuto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByPagoAuto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByPagoAuto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosPagoAuto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosPagoAuto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosPagoAuto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoPagoAuto.add(this.jMenuItemCerrarPagoAuto);
			
			this.jmenuAccionesPagoAuto.add(this.jMenuItemNuevoPagoAuto);
			this.jmenuAccionesPagoAuto.add(this.jMenuItemNuevoGuardarCambiosPagoAuto);
			this.jmenuAccionesPagoAuto.add(this.jMenuItemNuevoRelacionesPagoAuto);
			this.jmenuAccionesPagoAuto.add(this.jMenuItemGuardarCambiosTablaPagoAuto);		
			this.jmenuAccionesPagoAuto.add(this.jMenuItemDuplicarPagoAuto);		
			this.jmenuAccionesPagoAuto.add(this.jMenuItemCopiarPagoAuto);		
			this.jmenuAccionesPagoAuto.add(this.jMenuItemVerFormPagoAuto);		
			
			this.jmenuDatosPagoAuto.add(this.jMenuItemRecargarInformacionPagoAuto);				
			this.jmenuDatosPagoAuto.add(this.jMenuItemAnterioresPagoAuto);				
			this.jmenuDatosPagoAuto.add(this.jMenuItemSiguientesPagoAuto);				
			this.jmenuDatosPagoAuto.add(this.jMenuItemAbrirOrderByPagoAuto);				
			this.jmenuDatosPagoAuto.add(this.jMenuItemMostrarOcultarPagoAuto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesPagoAuto.add(this.jMenuItemGuardarCambiosPagoAuto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarPagoAuto.add(this.jmenuArchivoPagoAuto);		
			this.jmenuBarPagoAuto.add(this.jmenuAccionesPagoAuto);		
			this.jmenuBarPagoAuto.add(this.jmenuDatosPagoAuto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarPagoAuto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasPagoAuto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContablePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContablePagoAuto.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContablePagoAuto= new JButtonMe();
		this.jButtonFK_IdAsientoContablePagoAuto.setText("Buscar");
		this.jButtonFK_IdAsientoContablePagoAuto.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContablePagoAuto,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContablePagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContablePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContablePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto.setFocusable(false);

		this.jPanelFK_IdCentroActividadPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroActividadPagoAuto.setToolTipText("Buscar Por Centro Activad ");
		this.jButtonFK_IdCentroActividadPagoAuto= new JButtonMe();
		this.jButtonFK_IdCentroActividadPagoAuto.setText("Buscar");
		this.jButtonFK_IdCentroActividadPagoAuto.setToolTipText("Buscar Por Centro Activad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroActividadPagoAuto,"buscar_button","Buscar Por Centro Activad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroActividadPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto = new JLabelMe();
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto.setText("Centro Activad :");
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto.setToolTipText("Centro Activad");
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadFK_IdCentroActividadPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto= new JComboBoxMe();
		jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoPagoAuto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoPagoAuto= new JButtonMe();
		this.jButtonFK_IdCentroCostoPagoAuto.setText("Buscar");
		this.jButtonFK_IdCentroCostoPagoAuto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoPagoAuto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClientePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClientePagoAuto.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClientePagoAuto= new JButtonMe();
		this.jButtonFK_IdClientePagoAuto.setText("Buscar");
		this.jButtonFK_IdClientePagoAuto.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClientePagoAuto,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClientePagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClientePagoAuto = new JLabelMe();
		jLabelid_clienteFK_IdClientePagoAuto.setText("Cliente :");
		jLabelid_clienteFK_IdClientePagoAuto.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClientePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClientePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClientePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClientePagoAuto= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClientePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClientePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClientePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clientePagoAuto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clientePagoAuto.setFocusable(false);

		this.jPanelFK_IdCuentaBancoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaBancoPagoAuto.setToolTipText("Buscar Por Cuenta Banco ");
		this.jButtonFK_IdCuentaBancoPagoAuto= new JButtonMe();
		this.jButtonFK_IdCuentaBancoPagoAuto.setText("Buscar");
		this.jButtonFK_IdCuentaBancoPagoAuto.setToolTipText("Buscar Por Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaBancoPagoAuto,"buscar_button","Buscar Por Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaBancoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto = new JLabelMe();
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setText("Cuenta Banco :");
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setToolTipText("Cuenta Banco");
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto= new JComboBoxMe();
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleProvePagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleProvePagoAuto.setToolTipText("Buscar Por Detalle Prove ");
		this.jButtonFK_IdDetalleProvePagoAuto= new JButtonMe();
		this.jButtonFK_IdDetalleProvePagoAuto.setText("Buscar");
		this.jButtonFK_IdDetalleProvePagoAuto.setToolTipText("Buscar Por Detalle Prove ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleProvePagoAuto,"buscar_button","Buscar Por Detalle Prove ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleProvePagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto = new JLabelMe();
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto.setText("Detalle Prove :");
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto.setToolTipText("Detalle Prove");
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_detalle_proveFK_IdDetalleProvePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_proveFK_IdDetalleProvePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto= new JComboBoxMe();
		jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdEstadoPagoAutoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdEstadoPagoAutoPagoAuto.setToolTipText("Buscar Por Estado Pago Auto ");
		this.jButtonFK_IdEstadoPagoAutoPagoAuto= new JButtonMe();
		this.jButtonFK_IdEstadoPagoAutoPagoAuto.setText("Buscar");
		this.jButtonFK_IdEstadoPagoAutoPagoAuto.setToolTipText("Buscar Por Estado Pago Auto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdEstadoPagoAutoPagoAuto,"buscar_button","Buscar Por Estado Pago Auto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdEstadoPagoAutoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto = new JLabelMe();
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setText("Estado Pago Auto :");
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setToolTipText("Estado Pago Auto");
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto= new JComboBoxMe();
		jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaPagoAuto.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaPagoAuto= new JButtonMe();
		this.jButtonFK_IdFacturaPagoAuto.setText("Buscar");
		this.jButtonFK_IdFacturaPagoAuto.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaPagoAuto,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaPagoAuto = new JLabelMe();
		jLabelid_facturaFK_IdFacturaPagoAuto.setText("Factura :");
		jLabelid_facturaFK_IdFacturaPagoAuto.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaPagoAuto= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto.setFocusable(false);

		this.jPanelFK_IdTransaccionPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionPagoAuto.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionPagoAuto= new JButtonMe();
		this.jButtonFK_IdTransaccionPagoAuto.setText("Buscar");
		this.jButtonFK_IdTransaccionPagoAuto.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionPagoAuto,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionPagoAuto = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionPagoAuto.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionPagoAuto.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionPagoAuto= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasPagoAuto=new JTabbedPane();


		this.jTabbedPaneBusquedasPagoAuto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPagoAuto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasPagoAuto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasPagoAuto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetallePagoAuto = new PagoAutoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Pago Auto DATOS");
			this.jInternalFrameDetalleFormPagoAuto = new PagoAutoDetalleFormJInternalFrame(jDesktopPane,this.pagoautoSessionBean.getConGuardarRelaciones(),this.pagoautoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormPagoAuto = null;//new PagoAutoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagoAuto= new GridBagLayout();
		
		
		this.jTableDatosPagoAuto = new JTableMe();      
		
		String sToolTipPagoAuto="";
		sToolTipPagoAuto=PagoAutoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagoAuto+="(Tesoreria.PagoAuto)";
		}
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagoAuto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosPagoAuto.setToolTipText(sToolTipPagoAuto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosPagoAuto);
		this.jTableDatosPagoAuto.setAutoCreateRowSorter(true);
		this.jTableDatosPagoAuto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosPagoAuto.setRowSelectionAllowed(true);
		this.jTableDatosPagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosPagoAuto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoPagoAuto = new JButtonMe();
		this.jButtonDuplicarPagoAuto = new JButtonMe();
		this.jButtonCopiarPagoAuto = new JButtonMe();
		this.jButtonVerFormPagoAuto = new JButtonMe();
		this.jButtonNuevoRelacionesPagoAuto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaPagoAuto = new JButtonMe();
		this.jButtonCerrarPagoAuto = new JButtonMe();
		
		this.jScrollPanelDatosPagoAuto = new JScrollPane();   
        this.jScrollPanelDatosGeneralPagoAuto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Pago Auto";
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos" + this.sPath));
		} else {
			this.jScrollPanelDatosPagoAuto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesPagoAuto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoPagoAuto=new ReporteDinamicoJInternalFrame(PagoAutoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoPagoAuto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionPagoAuto=new ImportacionJInternalFrame(PagoAutoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionPagoAuto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByPagoAuto = new JButtonMe();
		
		this.jButtonAbrirOrderByPagoAuto.setText("Orden");
		this.jButtonAbrirOrderByPagoAuto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagoAuto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagoAuto,false,this);
			
			//this.cargarOrderByPagoAuto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagoAuto,true,this);
			
			//this.cargarOrderByPagoAuto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosPagoAuto.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosPagoAuto.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosPagoAuto.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosPagoAuto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagoAuto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosPagoAuto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoPagoAuto.setText("Nuevo");
		this.jButtonDuplicarPagoAuto.setText("Duplicar");
		this.jButtonCopiarPagoAuto.setText("Copiar");
		this.jButtonVerFormPagoAuto.setText("Ver");
		this.jButtonNuevoRelacionesPagoAuto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaPagoAuto.setText("Guardar");
		this.jButtonCerrarPagoAuto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagoAuto,"nuevo_button","Nuevo",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarPagoAuto,"duplicar_button","Duplicar",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarPagoAuto,"copiar_button","Copiar",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormPagoAuto,"ver_form","Ver",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesPagoAuto,"nuevorelaciones_button","Nuevo Rel",this.pagoautoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagoAuto,"guardarcambiostabla_button","Guardar",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagoAuto,"cerrar_button","Salir",this.pagoautoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoPagoAuto.setToolTipText("Nuevo"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarPagoAuto.setToolTipText("Duplicar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarPagoAuto.setToolTipText("Copiar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormPagoAuto.setToolTipText("Ver"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesPagoAuto.setToolTipText("Nuevo Rel"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaPagoAuto.setToolTipText("Guardar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagoAuto.setToolTipText("Salir"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagoAuto";
		inputMap = this.jButtonNuevoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagoAuto"));
		
		//DUPLICAR
		sMapKey = "DuplicarPagoAuto";
		inputMap = this.jButtonDuplicarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarPagoAuto"));
		
		//COPIAR
		sMapKey = "CopiarPagoAuto";
		inputMap = this.jButtonCopiarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarPagoAuto"));
		
		//VEr FORM
		sMapKey = "VerFormPagoAuto";
		inputMap = this.jButtonVerFormPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormPagoAuto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesPagoAuto";
		inputMap = this.jButtonNuevoRelacionesPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesPagoAuto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarPagoAuto";
		inputMap = this.jButtonModificarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarPagoAuto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarPagoAuto";
		inputMap = this.jButtonCerrarPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagoAuto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagoAuto";
		inputMap = this.jButtonGuardarCambiosTablaPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagoAuto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1PagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2PagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3PagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4PagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5PagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesPagoAuto.setName("jPanelParametrosReportesPagoAuto"); 
		
		this.jPanelParametrosReportesAccionesPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesPagoAuto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesPagoAuto.setName("jPanelParametrosReportesAccionesPagoAuto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionPagoAuto = new JButtonMe();
		this.jButtonRecargarInformacionPagoAuto.setText("Recargar");
		this.jButtonRecargarInformacionPagoAuto.setToolTipText("Recargar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionPagoAuto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionPagoAuto = new JButtonMe();
		this.jButtonProcesarInformacionPagoAuto.setText("Procesar");
		this.jButtonProcesarInformacionPagoAuto.setToolTipText("Procesar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionPagoAuto.setVisible(false);
			
		this.jButtonProcesarInformacionPagoAuto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagoAuto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionPagoAuto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagoAuto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesPagoAuto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagoAuto.setText("TIPO");       
		this.jComboBoxTiposReportesPagoAuto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesPagoAuto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesPagoAuto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionPagoAuto.setText("Paginacion");
		this.jComboBoxTiposPaginacionPagoAuto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesPagoAuto.setText("Accion");
		this.jComboBoxTiposRelacionesPagoAuto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagoAuto.setText("Accion");
		this.jComboBoxTiposAccionesPagoAuto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarPagoAuto.setText("Accion");
		this.jComboBoxTiposSeleccionarPagoAuto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralPagoAuto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralPagoAuto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagoAuto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralPagoAuto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesPagoAuto = new JLabelMe();
		
		this.jLabelAccionesPagoAuto.setText("Acciones");		
		this.jLabelAccionesPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosPagoAuto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosPagoAuto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosPagoAuto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosPagoAuto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosPagoAuto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosPagoAuto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaPagoAuto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaPagoAuto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaPagoAuto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReportePagoAuto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReportePagoAuto.setText("Graf.");
		this.jCheckBoxConGraficoReportePagoAuto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresPagoAuto = new JButtonMe();
		//this.jButtonAnterioresPagoAuto.setText("<<");
        this.jButtonAnterioresPagoAuto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresPagoAuto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesPagoAuto = new JButtonMe();
		//this.jButtonSiguientesPagoAuto.setText(">>");
        this.jButtonSiguientesPagoAuto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesPagoAuto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosPagoAuto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosPagoAuto.setText("Nue");
        this.jButtonNuevoGuardarCambiosPagoAuto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosPagoAuto,"nuevoguardarcambios_button","Nue",this.pagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosPagoAuto";
		inputMap = this.jButtonNuevoGuardarCambiosPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosPagoAuto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionPagoAuto";
		inputMap = this.jButtonRecargarInformacionPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionPagoAuto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesPagoAuto";
		inputMap = this.jButtonSiguientesPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesPagoAuto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresPagoAuto";
		inputMap = this.jButtonAnterioresPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresPagoAuto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasPagoAuto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesPagoAuto.setMinimumSize(new Dimension(this.getWidth(),PagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagoAuto.setMaximumSize(new Dimension(this.getWidth(),PagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesPagoAuto.setPreferredSize(new Dimension(this.getWidth(),PagoAutoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(PagoAutoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionPagoAuto = new GridBagLayout();

			this.jPanelPaginacionPagoAuto.setLayout(gridaBagLayoutPaginacionPagoAuto);						
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 0;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionPagoAuto.add(this.jButtonAnterioresPagoAuto, this.gridBagConstraintsPagoAuto);
					
						
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagoAuto.gridy = 0;
			
			this.jPanelPaginacionPagoAuto.add(this.jButtonNuevoGuardarCambiosPagoAuto, this.gridBagConstraintsPagoAuto);
						
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsPagoAuto.gridy = 0;
			this.jPanelPaginacionPagoAuto.add(this.jButtonSiguientesPagoAuto, this.gridBagConstraintsPagoAuto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 1;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagoAuto.add(this.jButtonNuevoPagoAuto, this.gridBagConstraintsPagoAuto);
						
			
			
			if(!this.pagoautoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsPagoAuto.gridy = 1;
				this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionPagoAuto.add(this.jButtonGuardarCambiosTablaPagoAuto, this.gridBagConstraintsPagoAuto);
			}
			
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 1;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagoAuto.add(this.jButtonDuplicarPagoAuto, this.gridBagConstraintsPagoAuto);
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 1;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagoAuto.add(this.jButtonCopiarPagoAuto, this.gridBagConstraintsPagoAuto);
		
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 1;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionPagoAuto.add(this.jButtonVerFormPagoAuto, this.gridBagConstraintsPagoAuto);
		
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 1;
			this.gridBagConstraintsPagoAuto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionPagoAuto.add(this.jButtonCerrarPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		
		this.jButtonRecargarInformacionPagoAuto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagoAuto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionPagoAuto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesPagoAuto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagoAuto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesPagoAuto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesPagoAuto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagoAuto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesPagoAuto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionPagoAuto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagoAuto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionPagoAuto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaPagoAuto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagoAuto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaPagoAuto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReportePagoAuto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagoAuto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReportePagoAuto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReportePagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosPagoAuto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagoAuto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosPagoAuto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosPagoAuto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagoAuto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosPagoAuto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesPagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesPagoAuto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1PagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2PagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3PagoAuto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4PagoAuto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesPagoAuto.setLayout(gridaBagParametrosReportesPagoAuto);
			this.jPanelParametrosReportesAccionesPagoAuto.setLayout(gridaBagParametrosReportesAccionesPagoAuto);
			
			
			this.jPanelParametrosAuxiliar1PagoAuto.setLayout(gridaBagParametrosAuxiliar1PagoAuto);
			this.jPanelParametrosAuxiliar2PagoAuto.setLayout(gridaBagParametrosAuxiliar2PagoAuto);
			this.jPanelParametrosAuxiliar3PagoAuto.setLayout(gridaBagParametrosAuxiliar3PagoAuto);
			this.jPanelParametrosAuxiliar4PagoAuto.setLayout(gridaBagParametrosAuxiliar4PagoAuto);
			//this.jPanelParametrosAuxiliar5PagoAuto.setLayout(gridaBagParametrosAuxiliar2PagoAuto);			
			
			
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagoAuto.add(this.jButtonRecargarInformacionPagoAuto, this.gridBagConstraintsPagoAuto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagoAuto.add(this.jComboBoxTiposPaginacionPagoAuto, this.gridBagConstraintsPagoAuto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagoAuto.add(this.jCheckBoxConAltoMaximoTablaPagoAuto, this.gridBagConstraintsPagoAuto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1PagoAuto.add(this.jComboBoxTiposArchivosReportesPagoAuto, this.gridBagConstraintsPagoAuto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagoAuto.add(this.jPanelParametrosAuxiliar1PagoAuto, this.gridBagConstraintsPagoAuto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4PagoAuto.add(this.jComboBoxTiposReportesPagoAuto, this.gridBagConstraintsPagoAuto);																		
			
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4PagoAuto.add(this.jComboBoxTiposGraficosReportesPagoAuto, this.gridBagConstraintsPagoAuto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagoAuto.add(this.jPanelParametrosAuxiliar4PagoAuto, this.gridBagConstraintsPagoAuto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagoAuto.add(this.jComboBoxTiposReportesPagoAuto, this.gridBagConstraintsPagoAuto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagoAuto.add(this.jCheckBoxGenerarReportePagoAuto, this.gridBagConstraintsPagoAuto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagoAuto.add(this.jPanelParametrosAuxiliar2PagoAuto, this.gridBagConstraintsPagoAuto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagoAuto.add(this.jLabelAccionesPagoAuto, this.gridBagConstraintsPagoAuto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesPagoAuto.add(this.jButtonAbrirOrderByPagoAuto, this.gridBagConstraintsPagoAuto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagoAuto.add(this.jComboBoxTiposSeleccionarPagoAuto, this.gridBagConstraintsPagoAuto);			
			
			
			/*
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagoAuto.add(this.jCheckBoxSeleccionarTodosPagoAuto, this.gridBagConstraintsPagoAuto);
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesPagoAuto.add(this.jCheckBoxConGraficoReportePagoAuto, this.gridBagConstraintsPagoAuto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagoAuto.add(this.jCheckBoxSeleccionarTodosPagoAuto, this.gridBagConstraintsPagoAuto);															
				
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagoAuto.add(this.jCheckBoxSeleccionadosPagoAuto, this.gridBagConstraintsPagoAuto);															
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsPagoAuto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3PagoAuto.add(this.jCheckBoxConGraficoReportePagoAuto, this.gridBagConstraintsPagoAuto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesPagoAuto.add(this.jPanelParametrosAuxiliar3PagoAuto, this.gridBagConstraintsPagoAuto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagoAuto.add(this.jComboBoxTiposAccionesPagoAuto, this.gridBagConstraintsPagoAuto);
	
				
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsPagoAuto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesPagoAuto.add(this.jTextFieldValorCampoGeneralPagoAuto, this.gridBagConstraintsPagoAuto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosPagoAuto = new GridBagLayout();

			this.jScrollPanelDatosPagoAuto.setLayout(gridaBagLayoutDatosPagoAuto);
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = 0;
			this.gridBagConstraintsPagoAuto.gridx = 0;
			
			this.jScrollPanelDatosPagoAuto.add(this.jTableDatosPagoAuto, this.gridBagConstraintsPagoAuto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosPagoAuto.setViewportView(this.jTableDatosPagoAuto);
		this.jTableDatosPagoAuto.setFillsViewportHeight(true);
		this.jTableDatosPagoAuto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagoAuto= new GridBagLayout();
		this.jPanelAccionesPagoAuto.setLayout(gridaBagLayoutAccionesPagoAuto);
		
		
		/*	
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = 0;
		this.gridBagConstraintsPagoAuto.gridx = 0;
			
		this.jPanelAccionesPagoAuto.add(this.jButtonNuevoPagoAuto, this.gridBagConstraintsPagoAuto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContablePagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContablePagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContablePagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContablePagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContablePagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContablePagoAuto.setLayout(gridaBagLayoutFK_IdAsientoContablePagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdAsientoContablePagoAuto.add(jLabelid_asiento_contableFK_IdAsientoContablePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdAsientoContablePagoAuto.add(jComboBoxid_asiento_contableFK_IdAsientoContablePagoAuto, gridBagConstraintsPagoAuto);


		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdAsientoContablePagoAuto.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contablePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdAsientoContablePagoAuto.add(jButtonFK_IdAsientoContablePagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContablePagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroActividadPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroActividadPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroActividadPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroActividadPagoAuto.setLayout(gridaBagLayoutFK_IdCentroActividadPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdCentroActividadPagoAuto.add(jLabelid_centro_actividadFK_IdCentroActividadPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdCentroActividadPagoAuto.add(jComboBoxid_centro_actividadFK_IdCentroActividadPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdCentroActividadPagoAuto.add(jButtonFK_IdCentroActividadPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("2.-Por Centro Activad ", jPanelFK_IdCentroActividadPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoPagoAuto.setLayout(gridaBagLayoutFK_IdCentroCostoPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdCentroCostoPagoAuto.add(jLabelid_centro_costoFK_IdCentroCostoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdCentroCostoPagoAuto.add(jComboBoxid_centro_costoFK_IdCentroCostoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdCentroCostoPagoAuto.add(jButtonFK_IdCentroCostoPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("3.-Por Centro Costo ", jPanelFK_IdCentroCostoPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdClientePagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdClientePagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClientePagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClientePagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClientePagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClientePagoAuto.setLayout(gridaBagLayoutFK_IdClientePagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdClientePagoAuto.add(jLabelid_clienteFK_IdClientePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdClientePagoAuto.add(jComboBoxid_clienteFK_IdClientePagoAuto, gridBagConstraintsPagoAuto);


		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdClientePagoAuto.add(this.jButtonBuscarFK_IdClienteid_clientePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdClientePagoAuto.add(jButtonFK_IdClientePagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("4.-Por Cliente ", jPanelFK_IdClientePagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaBancoPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaBancoPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaBancoPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaBancoPagoAuto.setLayout(gridaBagLayoutFK_IdCuentaBancoPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdCuentaBancoPagoAuto.add(jLabelid_cuenta_bancoFK_IdCuentaBancoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdCuentaBancoPagoAuto.add(jComboBoxid_cuenta_bancoFK_IdCuentaBancoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdCuentaBancoPagoAuto.add(jButtonFK_IdCuentaBancoPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("5.-Por Cuenta Banco ", jPanelFK_IdCuentaBancoPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdDetalleProvePagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleProvePagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleProvePagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleProvePagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleProvePagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleProvePagoAuto.setLayout(gridaBagLayoutFK_IdDetalleProvePagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdDetalleProvePagoAuto.add(jLabelid_detalle_proveFK_IdDetalleProvePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdDetalleProvePagoAuto.add(jComboBoxid_detalle_proveFK_IdDetalleProvePagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdDetalleProvePagoAuto.add(jButtonFK_IdDetalleProvePagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("6.-Por Detalle Prove ", jPanelFK_IdDetalleProvePagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdEstadoPagoAutoPagoAuto.setLayout(gridaBagLayoutFK_IdEstadoPagoAutoPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdEstadoPagoAutoPagoAuto.add(jLabelid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdEstadoPagoAutoPagoAuto.add(jComboBoxid_estado_pago_autoFK_IdEstadoPagoAutoPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdEstadoPagoAutoPagoAuto.add(jButtonFK_IdEstadoPagoAutoPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("7.-Por Estado Pago Auto ", jPanelFK_IdEstadoPagoAutoPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdFacturaPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaPagoAuto.setLayout(gridaBagLayoutFK_IdFacturaPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdFacturaPagoAuto.add(jLabelid_facturaFK_IdFacturaPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdFacturaPagoAuto.add(jComboBoxid_facturaFK_IdFacturaPagoAuto, gridBagConstraintsPagoAuto);


		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.NONE;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdFacturaPagoAuto.add(this.jButtonBuscarFK_IdFacturaid_facturaPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdFacturaPagoAuto.add(jButtonFK_IdFacturaPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("8.-Por Factura ", jPanelFK_IdFacturaPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTransaccionPagoAuto= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionPagoAuto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionPagoAuto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionPagoAuto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionPagoAuto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionPagoAuto.setLayout(gridaBagLayoutFK_IdTransaccionPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 0;
		jPanelFK_IdTransaccionPagoAuto.add(jLabelid_transaccionFK_IdTransaccionPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 0;
		gridBagConstraintsPagoAuto.gridx = 1;
		jPanelFK_IdTransaccionPagoAuto.add(jComboBoxid_transaccionFK_IdTransaccionPagoAuto, gridBagConstraintsPagoAuto);

		gridBagConstraintsPagoAuto = new GridBagConstraints();
		gridBagConstraintsPagoAuto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsPagoAuto.gridy = 1;
		gridBagConstraintsPagoAuto.gridx =1;
		jPanelFK_IdTransaccionPagoAuto.add(jButtonFK_IdTransaccionPagoAuto, gridBagConstraintsPagoAuto);

		jTabbedPaneBusquedasPagoAuto.addTab("9.-Por Transaccion ", jPanelFK_IdTransaccionPagoAuto);
		jTabbedPaneBusquedasPagoAuto.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagoAuto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagoAuto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagoautoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();						
			this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagoAuto.gridx = 0;		
			//this.gridBagConstraintsPagoAuto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagoAuto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarPagoAuto, this.gridBagConstraintsPagoAuto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsPagoAuto.gridx = 0;		
		//this.gridBagConstraintsPagoAuto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsPagoAuto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsPagoAuto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagoAuto.gridx = 0;		
			this.gridBagConstraintsPagoAuto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsPagoAuto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasPagoAuto, this.gridBagConstraintsPagoAuto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesPagoAuto, this.gridBagConstraintsPagoAuto);								
		
		
		/*
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesPagoAuto, this.gridBagConstraintsPagoAuto);
		*/		
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagoAuto.gridx =0;
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagoAuto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagoAuto, this.gridBagConstraintsPagoAuto);
				
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionPagoAuto, this.gridBagConstraintsPagoAuto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(PagoAutoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosPagoAuto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagoAuto = new GridBagLayout();
			this.jPanelBusquedasParametrosPagoAuto.setLayout(gridaBagLayoutBusquedasParametrosPagoAuto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralPagoAuto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagoAuto, this.gridBagConstraintsPagoAuto);
			
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagoAuto, this.gridBagConstraintsPagoAuto);
		
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagoAuto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagoAuto, this.gridBagConstraintsPagoAuto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralPagoAuto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoPagoAuto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoPagoAuto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoPagoAuto.setName("jPanelReporteDinamicoPagoAuto"); 
		
		this.jPanelReporteDinamicoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoPagoAuto.setLayout(gridaBagLayoutReporteDinamicoPagoAuto);
		
		
		this.jInternalFrameReporteDinamicoPagoAuto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoPagoAuto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagoAuto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoPagoAuto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoPagoAuto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoPagoAuto.setResizable(true);
	    this.jInternalFrameReporteDinamicoPagoAuto.setClosable(true);
	    this.jInternalFrameReporteDinamicoPagoAuto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReportePagoAuto = new JLabelMe();

		this.jLabelColumnasSelectReportePagoAuto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReportePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReportePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelColumnasSelectReportePagoAuto, this.gridBagConstraintsPagoAuto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReportePagoAuto = new JList<Reporte>();
		this.jListColumnasSelectReportePagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReportePagoAuto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReportePagoAuto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagoAuto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReportePagoAuto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReportePagoAuto=new JScrollPane(this.jListColumnasSelectReportePagoAuto);
			
			this.jScrollColumnasSelectReportePagoAuto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagoAuto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReportePagoAuto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReportePagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoPagoAuto.add(this.jListColumnasSelectReportePagoAuto, this.gridBagConstraintsPagoAuto);
		this.jPanelReporteDinamicoPagoAuto.add(this.jScrollColumnasSelectReportePagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReportePagoAuto = new JLabelMe();

		this.jLabelRelacionesSelectReportePagoAuto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReportePagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReportePagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReportePagoAuto = new JList<Reporte>();
		this.jListRelacionesSelectReportePagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReportePagoAuto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReportePagoAuto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagoAuto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReportePagoAuto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReportePagoAuto=new JScrollPane(this.jListRelacionesSelectReportePagoAuto);
			
			this.jScrollRelacionesSelectReportePagoAuto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagoAuto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReportePagoAuto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReportePagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoPagoAuto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoPagoAuto = new JComboBoxMe();
		this.jListColumnasValoresGraficoPagoAuto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoPagoAuto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoPagoAuto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoPagoAuto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoPagoAuto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoPagoAuto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagoAuto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoPagoAuto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoPagoAuto = new JLabelMe();

		this.jLabelConGraficoDinamicoPagoAuto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelConGraficoDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoPagoAuto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoPagoAuto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoPagoAuto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagoAuto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoPagoAuto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jCheckBoxConGraficoDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoPagoAuto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoPagoAuto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelColumnaCategoriaGraficoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoPagoAuto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagoAuto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoPagoAuto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoPagoAuto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagoAuto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoPagoAuto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoPagoAuto.add(this.jComboBoxColumnaCategoriaGraficoPagoAuto, this.gridBagConstraintsPagoAuto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorPagoAuto = new JLabelMe();

		this.jLabelColumnaCategoriaValorPagoAuto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelColumnaCategoriaValorPagoAuto, this.gridBagConstraintsPagoAuto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorPagoAuto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorPagoAuto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorPagoAuto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorPagoAuto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagoAuto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorPagoAuto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoPagoAuto.add(this.jComboBoxColumnaCategoriaValorPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoPagoAuto = new JLabelMe();

		this.jLabelColumnasValoresGraficoPagoAuto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelColumnasValoresGraficoPagoAuto, this.gridBagConstraintsPagoAuto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoPagoAuto = new JList<Reporte>();
		this.jListColumnasValoresGraficoPagoAuto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoPagoAuto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoPagoAuto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagoAuto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoPagoAuto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoPagoAuto=new JScrollPane(this.jListColumnasValoresGraficoPagoAuto);
			
			this.jScrollColumnasValoresGraficoPagoAuto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagoAuto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoPagoAuto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoPagoAuto.add(this.jListColumnasSelectReportePagoAuto, this.gridBagConstraintsPagoAuto);
		this.jPanelReporteDinamicoPagoAuto.add(this.jScrollColumnasValoresGraficoPagoAuto, this.gridBagConstraintsPagoAuto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoPagoAuto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoPagoAuto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelTiposGraficosReportesDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoPagoAuto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoPagoAuto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoPagoAuto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoPagoAuto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagoAuto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoPagoAuto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jComboBoxTiposGraficosReportesDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoPagoAuto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoPagoAuto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelGenerarExcelReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoPagoAuto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoPagoAuto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoPagoAuto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoPagoAuto.setToolTipText("Generar EXCEL"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoPagoAuto.add(this.jButtonGenerarExcelReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagoAuto.add(this.jComboBoxTiposReportesDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoPagoAuto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoPagoAuto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoPagoAuto.add(this.jLabelTiposArchivoReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagoAuto.add(this.jComboBoxTiposArchivosReportesDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoPagoAuto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoPagoAuto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoPagoAuto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoPagoAuto.setToolTipText("Generar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagoAuto.add(this.jButtonGenerarReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoPagoAuto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoPagoAuto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoPagoAuto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoPagoAuto.setToolTipText("Cancelar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsPagoAuto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoPagoAuto.add(this.jButtonCerrarReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalPagoAuto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoPagoAuto= new JScrollPane(jPanelReporteDinamicoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoPagoAuto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagoAuto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoPagoAuto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsPagoAuto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoPagoAuto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalPagoAuto);
		this.jInternalFrameReporteDinamicoPagoAuto.getContentPane().add(this.jScrollPanelReporteDinamicoPagoAuto, this.gridBagConstraintsPagoAuto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionPagoAuto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionPagoAuto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionPagoAuto.setName("jPanelImportacionPagoAuto"); 
		
		this.jPanelImportacionPagoAuto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagoAuto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionPagoAuto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionPagoAuto.setLayout(gridaBagLayoutImportacionPagoAuto);
		
		
		this.jInternalFrameImportacionPagoAuto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionPagoAuto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionPagoAuto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReportePagoAuto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagoAuto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionPagoAuto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagoAuto.setResizable(true);
	    this.jInternalFrameImportacionPagoAuto.setClosable(true);
	    this.jInternalFrameImportacionPagoAuto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionPagoAuto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionPagoAuto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionPagoAuto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionPagoAuto.setResizable(true);
	    this.jInternalFrameImportacionPagoAuto.setClosable(true);
	    this.jInternalFrameImportacionPagoAuto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionPagoAuto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagoAuto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionPagoAuto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionPagoAuto = new JLabelMe();

		this.jLabelArchivoImportacionPagoAuto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagoAuto.add(this.jLabelArchivoImportacionPagoAuto, this.gridBagConstraintsPagoAuto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionPagoAuto = new JFileChooser();		
		this.jFileChooserImportacionPagoAuto.setToolTipText("ESCOGER ARCHIVO"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionPagoAuto = new JButtonMe();
		this.jButtonAbrirImportacionPagoAuto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionPagoAuto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionPagoAuto.setToolTipText("Generar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagoAuto.add(this.jButtonAbrirImportacionPagoAuto, this.gridBagConstraintsPagoAuto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionPagoAuto = new JLabelMe();

		this.jLabelPathArchivoImportacionPagoAuto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;		
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionPagoAuto.add(this.jLabelPathArchivoImportacionPagoAuto, this.gridBagConstraintsPagoAuto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionPagoAuto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionPagoAuto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagoAuto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionPagoAuto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagoAuto.add(this.jTextFieldPathArchivoImportacionPagoAuto, this.gridBagConstraintsPagoAuto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionPagoAuto = new JButtonMe();
		this.jButtonGenerarImportacionPagoAuto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionPagoAuto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionPagoAuto.setToolTipText("Generar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagoAuto.add(this.jButtonGenerarImportacionPagoAuto, this.gridBagConstraintsPagoAuto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionPagoAuto = new JButtonMe();
		this.jButtonCerrarImportacionPagoAuto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionPagoAuto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionPagoAuto.setToolTipText("Cancelar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagoAuto.gridy = iPosYImportacion;
		this.gridBagConstraintsPagoAuto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionPagoAuto.add(this.jButtonCerrarImportacionPagoAuto, this.gridBagConstraintsPagoAuto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalPagoAuto = new GridBagLayout();
		
		this.jScrollPanelImportacionPagoAuto= new JScrollPane(jPanelImportacionPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsPagoAuto.gridy =iPosYImportacion;
		this.gridBagConstraintsPagoAuto.gridx =iPosXImportacion;
		this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionPagoAuto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalPagoAuto);
		this.jInternalFrameImportacionPagoAuto.getContentPane().add(this.jScrollPanelImportacionPagoAuto, this.gridBagConstraintsPagoAuto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByPagoAuto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByPagoAuto = new JButtonMe();
			this.jButtonAbrirOrderByPagoAuto.setText("Orden");
			this.jButtonAbrirOrderByPagoAuto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByPagoAuto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByPagoAuto";
			inputMap = this.jButtonAbrirOrderByPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByPagoAuto"));
		
		
			GridBagLayout gridaBagLayoutOrderByPagoAuto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByPagoAuto.setName("jPanelOrderByPagoAuto"); 
			
			this.jPanelOrderByPagoAuto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagoAuto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByPagoAuto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByPagoAuto.setLayout(gridaBagLayoutOrderByPagoAuto);
			
			
			this.jTableDatosPagoAutoOrderBy = new JTableMe();        
			this.jTableDatosPagoAutoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosPagoAutoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosPagoAutoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosPagoAutoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosPagoAutoOrderBy.setViewportView(this.jTableDatosPagoAutoOrderBy);
			this.jTableDatosPagoAutoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosPagoAutoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByPagoAuto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByPagoAuto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByPagoAuto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReportePagoAuto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByPagoAuto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByPagoAuto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByPagoAuto.setTitle("Orden");
			this.jInternalFrameOrderByPagoAuto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByPagoAuto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByPagoAuto.setResizable(true);
			this.jInternalFrameOrderByPagoAuto.setClosable(true);
			this.jInternalFrameOrderByPagoAuto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByPagoAuto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagoAuto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByPagoAuto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pago Autos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsPagoAuto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsPagoAuto.ipady =150;
				
			this.jPanelOrderByPagoAuto.add(jScrollPanelDatosPagoAutoOrderBy, this.gridBagConstraintsPagoAuto);//this.jTableDatosPagoAutoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByPagoAuto = new JButtonMe();
			this.jButtonCerrarOrderByPagoAuto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByPagoAuto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByPagoAuto.setToolTipText("Cancelar"+" "+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagoAuto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsPagoAuto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByPagoAuto.add(this.jButtonCerrarOrderByPagoAuto, this.gridBagConstraintsPagoAuto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalPagoAuto = new GridBagLayout();
			
			this.jScrollPanelOrderByPagoAuto= new JScrollPane(jPanelOrderByPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsPagoAuto.gridy =iPosYOrderBy;
			this.gridBagConstraintsPagoAuto.gridx =iPosXOrderBy;
			this.gridBagConstraintsPagoAuto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByPagoAuto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByPagoAuto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalPagoAuto);
			
			this.jInternalFrameOrderByPagoAuto.getContentPane().add(this.jScrollPanelOrderByPagoAuto, this.gridBagConstraintsPagoAuto);			
		
		} else {
			this.jButtonAbrirOrderByPagoAuto = new JButtonMe();
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
		int iWidthTableCalculado=0;//4030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=2100;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.pagoautoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosPagoAuto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosPagoAuto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosPagoAuto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosPagoAuto.getRowHeight();//PagoAutoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > PagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagoAuto.isSelected()) {
					iHeightTable=PagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > PagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaPagoAuto.isSelected()) {
					iHeightTable=PagoAutoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < PagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=PagoAutoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosPagoAuto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagoAuto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosPagoAuto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosPagoAuto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagoAuto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosPagoAuto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByPagoAuto!=null && this.jInternalFrameOrderByPagoAuto.getjTableDatosOrderBy()!=null) {
			//if(!this.pagoautoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByPagoAuto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByPagoAuto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByPagoAuto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByPagoAuto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByPagoAuto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByPagoAuto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByPagoAuto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosPagoAuto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagoAuto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosPagoAuto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=pagoautoLogic.getPagoAutos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagoautos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<PagoAuto> TraerPagoAutoBeans(List<PagoAuto> pagoautos,ArrayList<Classe> classes)throws Exception {
		try {
			for(PagoAuto pagoauto:pagoautos) {
					
				if(!(PagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || PagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					pagoauto.setsDetalleGeneralEntityReporte(PagoAutoConstantesFunciones.getPagoAutoDescripcion(pagoauto));
										
					pagoauto.setesta_autorizado_descripcion(PagoAutoConstantesFunciones.getesta_autorizadoDescripcion(pagoauto));	
					
						
					
				} else  {
							
					//pagoauto.setsDetalleGeneralEntityReporte(pagoauto.getsDetalleGeneralEntityReporte());
										
				}
				
				//pagoautobeans.add(pagoautobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return pagoautos;
    }
	//PARA REPORTES FIN
}
