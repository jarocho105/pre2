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
import com.bydan.erp.tesoreria.util.AutoriPagoConstantesFunciones;

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
public class AutoriPagoJInternalFrame extends AutoriPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutoriPago;
	
	protected JMenuBar jmenuBarAutoriPago;
	
	protected JMenu jmenuAutoriPago;
	protected JMenu jmenuDatosAutoriPago;
	protected JMenu jmenuArchivoAutoriPago;
	protected JMenu jmenuAccionesAutoriPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriPago;	
	protected GridBagConstraints gridBagConstraintsAutoriPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutoriPagoDetalleFormJInternalFrame jInternalFrameDetalleFormAutoriPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutoriPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutoriPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected DetalleProveBeanSwingJInternalFrame detalleproveBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleprove="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public AutoriPagoSessionBean autoripagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public DetalleProveSessionBean detalleproveSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutoriPago> autoripagos;		
	public List<AutoriPago> autoripagosEliminados;	
	public List<AutoriPago> autoripagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutoriPago;		
	protected JButton jButtonAbrirOrderByAutoriPago;
	
	
	//protected JPanel jPanelOrderByAutoriPago;
	//public JScrollPane jScrollPanelOrderByAutoriPago;	
	//protected JButton jButtonCerrarOrderByAutoriPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutoriPagoLogic autoripagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutoriPago;
	public JScrollPane jScrollPanelDatosEdicionAutoriPago;
	public JScrollPane jScrollPanelDatosGeneralAutoriPago;
    
	
	
	//public JScrollPane jScrollPanelDatosAutoriPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutoriPago;
	//public JScrollPane jScrollPanelImportacionAutoriPago;
	
	
	
	protected JPanel jPanelAccionesAutoriPago;
	
    protected JPanel jPanelPaginacionAutoriPago;
    protected JPanel jPanelParametrosReportesAutoriPago;
	protected JPanel jPanelParametrosReportesAccionesAutoriPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutoriPago;
	protected JPanel jPanelParametrosAuxiliar2AutoriPago;
	protected JPanel jPanelParametrosAuxiliar3AutoriPago;
	protected JPanel jPanelParametrosAuxiliar4AutoriPago;
	//protected JPanel jPanelParametrosAuxiliar5AutoriPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutoriPago;
	//protected JPanel jPanelImportacionAutoriPago;
	
	
	public JTable jTableDatosAutoriPago;
	
	
	
	//public JTable jTableDatosAutoriPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutoriPago;
	protected JButton jButtonDuplicarAutoriPago;
	protected JButton jButtonCopiarAutoriPago;
	protected JButton jButtonVerFormAutoriPago;
	protected JButton jButtonNuevoRelacionesAutoriPago;
	protected JButton jButtonModificarAutoriPago;
	
    protected JButton jButtonGuardarCambiosTablaAutoriPago;
	protected JButton jButtonCerrarAutoriPago;
	
	
	protected JButton jButtonRecargarInformacionAutoriPago;
	protected JButton jButtonProcesarInformacionAutoriPago;
	
	
	protected JButton jButtonAnterioresAutoriPago;
	protected JButton jButtonSiguientesAutoriPago;
	protected JButton jButtonNuevoGuardarCambiosAutoriPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutoriPago;
	//protected JButton jButtonCerrarReporteDinamicoAutoriPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutoriPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutoriPago;
	//protected JButton jButtonGenerarImportacionAutoriPago;
	//protected JButton jButtonCerrarImportacionAutoriPago;
	//protected JFileChooser jFileChooserImportacionAutoriPago;
	//protected File fileImportacionAutoriPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriPago;
	protected JButton jButtonDuplicarToolBarAutoriPago;
	protected JButton jButtonNuevoRelacionesToolBarAutoriPago;
	
	
	public JButton jButtonGuardarCambiosToolBarAutoriPago;
	protected JButton jButtonCopiarToolBarAutoriPago;
	protected JButton jButtonVerFormToolBarAutoriPago;
	public JButton jButtonGuardarCambiosTablaToolBarAutoriPago;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriPago;
	protected JButton jButtonCerrarToolBarAutoriPago;
	
	protected JButton jButtonRecargarInformacionToolBarAutoriPago;
	protected JButton jButtonProcesarInformacionToolBarAutoriPago;
	protected JButton jButtonAnterioresToolBarAutoriPago;
	protected JButton jButtonSiguientesToolBarAutoriPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutoriPago;
	protected JButton jButtonAbrirOrderByToolBarAutoriPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriPago;
	protected JMenuItem jMenuItemDuplicarAutoriPago;
	protected JMenuItem jMenuItemNuevoRelacionesAutoriPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutoriPago;
	protected JMenuItem jMenuItemCopiarAutoriPago;
	protected JMenuItem jMenuItemVerFormAutoriPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriPago;
	protected JMenuItem jMenuItemCerrarAutoriPago;
	protected JMenuItem jMenuItemDetalleCerrarAutoriPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutoriPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriPago;
	
	protected JMenuItem jMenuItemRecargarInformacionAutoriPago;
	protected JMenuItem jMenuItemProcesarInformacionAutoriPago;
	protected JMenuItem jMenuItemAnterioresAutoriPago;
	protected JMenuItem jMenuItemSiguientesAutoriPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriPago;
	protected JMenuItem jMenuItemAbrirOrderByAutoriPago;
	protected JMenuItem jMenuItemMostrarOcultarAutoriPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutoriPago;
	protected JCheckBox jCheckBoxSeleccionadosAutoriPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutoriPago;
	protected JCheckBox jCheckBoxConGraficoReporteAutoriPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutoriPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutoriPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutoriPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutoriPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutoriPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutoriPago;
	protected JTextField jTextFieldValorCampoGeneralAutoriPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutoriPago;
	//public JList<Reporte> jListColumnasSelectReporteAutoriPago;
	//public JScrollPane jScrollColumnasSelectReporteAutoriPago;
	
	//public JLabel jLabelRelacionesSelectReporteAutoriPago;
	//public JList<Reporte> jListRelacionesSelectReporteAutoriPago;
	//public JScrollPane jScrollRelacionesSelectReporteAutoriPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutoriPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutoriPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutoriPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutoriPago;
	
		
	//public JLabel jLabelArchivoImportacionAutoriPago;	
	//public JLabel jLabelPathArchivoImportacionAutoriPago;
	//protected JTextField jTextFieldPathArchivoImportacionAutoriPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutoriPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutoriPago;
	
	//public JLabel jLabelColumnaCategoriaValorAutoriPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutoriPago;
	
	//public JLabel jLabelColumnasValoresGraficoAutoriPago;
	//public JList<Reporte> jListColumnasValoresGraficoAutoriPago;
	//public JScrollPane jScrollColumnasValoresGraficoAutoriPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutoriPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutoriPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutoriPago;
	public JPanel jPanelFK_IdAsientoContableAutoriPago;
	public JButton jButtonFK_IdAsientoContableAutoriPago;
	public JPanel jPanelFK_IdBancoAutoriPago;
	public JButton jButtonFK_IdBancoAutoriPago;
	public JPanel jPanelFK_IdCentroActividadAutoriPago;
	public JButton jButtonFK_IdCentroActividadAutoriPago;
	public JPanel jPanelFK_IdCentroCostoAutoriPago;
	public JButton jButtonFK_IdCentroCostoAutoriPago;
	public JPanel jPanelFK_IdClienteAutoriPago;
	public JButton jButtonFK_IdClienteAutoriPago;
	public JPanel jPanelFK_IdCuentaBancoAutoriPago;
	public JButton jButtonFK_IdCuentaBancoAutoriPago;
	public JPanel jPanelFK_IdDetalleProveAutoriPago;
	public JButton jButtonFK_IdDetalleProveAutoriPago;
	public JPanel jPanelFK_IdFacturaAutoriPago;
	public JButton jButtonFK_IdFacturaAutoriPago;
	public JPanel jPanelFK_IdTransaccionAutoriPago;
	public JButton jButtonFK_IdTransaccionAutoriPago;
	
	public JPanel jPanelid_asiento_contableFK_IdAsientoContableAutoriPago;
	public JLabel jLabelid_asiento_contableFK_IdAsientoContableAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago;
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPago= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFK_IdAsientoContableAutoriPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago;
	
	public JPanel jPanelid_bancoFK_IdBancoAutoriPago;
	public JLabel jLabelid_bancoFK_IdBancoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFK_IdBancoAutoriPago;
	public JButton jButtonid_bancoFK_IdBancoAutoriPago= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_bancoFK_IdBancoAutoriPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_actividadFK_IdCentroActividadAutoriPago;
	public JLabel jLabelid_centro_actividadFK_IdCentroActividadAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago;
	public JButton jButtonid_centro_actividadFK_IdCentroActividadAutoriPago= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadFK_IdCentroActividadAutoriPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoAutoriPago;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago;
	public JButton jButtonid_centro_costoFK_IdCentroCostoAutoriPago= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAutoriPagoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoAutoriPagoArbol= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteAutoriPago;
	public JLabel jLabelid_clienteFK_IdClienteAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteAutoriPago;
	public JButton jButtonid_clienteFK_IdClienteAutoriPago= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteAutoriPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteAutoriPago;
	
	public JPanel jPanelid_cuenta_bancoFK_IdCuentaBancoAutoriPago;
	public JLabel jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago;
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPago= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoFK_IdCuentaBancoAutoriPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_detalle_proveFK_IdDetalleProveAutoriPago;
	public JLabel jLabelid_detalle_proveFK_IdDetalleProveAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago;
	public JButton jButtonid_detalle_proveFK_IdDetalleProveAutoriPago= new JButtonMe();
	public JButton jButtonid_detalle_proveFK_IdDetalleProveAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_proveFK_IdDetalleProveAutoriPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaAutoriPago;
	public JLabel jLabelid_facturaFK_IdFacturaAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaAutoriPago;
	public JButton jButtonid_facturaFK_IdFacturaAutoriPago= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaAutoriPagoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaAutoriPago;
	
	public JPanel jPanelid_transaccionFK_IdTransaccionAutoriPago;
	public JLabel jLabelid_transaccionFK_IdTransaccionAutoriPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFK_IdTransaccionAutoriPago;
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPago= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPagoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFK_IdTransaccionAutoriPagoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AutoriPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutoriPago)	{
		this.jButtonRecargarInformacionAutoriPago = jButtonRecargarInformacionAutoriPago;
	}
	
	public JButton getjButtonProcesarInformacionAutoriPago() {
		return this.jButtonProcesarInformacionAutoriPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriPago)	{
		this.jButtonProcesarInformacionAutoriPago = jButtonProcesarInformacionAutoriPago;
	}
	
	
	public JButton getjButtonRecargarInformacionAutoriPago() {
		return this.jButtonRecargarInformacionAutoriPago;
	}
	
	
	public List<AutoriPago> getautoripagos() {
		return this.autoripagos;
	}

	public void setautoripagos(List<AutoriPago> autoripagos) {
		this.autoripagos = autoripagos;
	}
	
	public List<AutoriPago> getautoripagosAux() {
		return this.autoripagosAux;
	}

	public void setautoripagosAux(List<AutoriPago> autoripagosAux) {
		this.autoripagosAux = autoripagosAux;
	}
	
	public List<AutoriPago> getautoripagosEliminados() {
		return this.autoripagosEliminados;
	}

	public void setAutoriPagosEliminados(List<AutoriPago> autoripagosEliminados) {
		this.autoripagosEliminados = autoripagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutoriPago() {
		return jComboBoxTiposSeleccionarAutoriPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutoriPago(
			JComboBox jComboBoxTiposSeleccionarAutoriPago) {
		this.jComboBoxTiposSeleccionarAutoriPago = jComboBoxTiposSeleccionarAutoriPago;
	}
	
	public void setBorderResaltarTiposSeleccionarAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutoriPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutoriPago() {
		return jTextFieldValorCampoGeneralAutoriPago;
	}

	public void setjTextFieldValorCampoGeneralAutoriPago(
			JTextField jTextFieldValorCampoGeneralAutoriPago) {
		this.jTextFieldValorCampoGeneralAutoriPago = jTextFieldValorCampoGeneralAutoriPago;
	}

	public void setBorderResaltarValorCampoGeneralAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutoriPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutoriPago() {
		return this.jCheckBoxSeleccionarTodosAutoriPago;
	}

	public void setjCheckBoxSeleccionarTodosAutoriPago(
			JCheckBox jCheckBoxSeleccionarTodosAutoriPago) {
		this.jCheckBoxSeleccionarTodosAutoriPago = jCheckBoxSeleccionarTodosAutoriPago;
	}

	public void setBorderResaltarSeleccionarTodosAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutoriPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutoriPago() {
		return this.jCheckBoxSeleccionadosAutoriPago;
	}

	public void setjCheckBoxSeleccionadosAutoriPago(
			JCheckBox jCheckBoxSeleccionadosAutoriPago) {
		this.jCheckBoxSeleccionadosAutoriPago = jCheckBoxSeleccionadosAutoriPago;
	}
	
	public void setBorderResaltarSeleccionadosAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutoriPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutoriPago() {
		return this.jComboBoxTiposArchivosReportesAutoriPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutoriPago(
			JComboBox jComboBoxTiposArchivosReportesAutoriPago) {
		this.jComboBoxTiposArchivosReportesAutoriPago = jComboBoxTiposArchivosReportesAutoriPago;
	}

	public void setBorderResaltarTiposArchivosReportesAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutoriPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutoriPago() {
		return this.jComboBoxTiposReportesAutoriPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutoriPago(
			JComboBox jComboBoxTiposReportesAutoriPago) {
		this.jComboBoxTiposReportesAutoriPago = jComboBoxTiposReportesAutoriPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutoriPago() {
	//	return jComboBoxTiposReportesDinamicoAutoriPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutoriPago(
	//		JComboBox jComboBoxTiposReportesDinamicoAutoriPago) {
	//	this.jComboBoxTiposReportesDinamicoAutoriPago = jComboBoxTiposReportesDinamicoAutoriPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutoriPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutoriPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutoriPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutoriPago = jComboBoxTiposArchivosReportesDinamicoAutoriPago;
	//}
	
	public void setBorderResaltarTiposReportesAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutoriPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutoriPago() {
		return this.jComboBoxTiposGraficosReportesAutoriPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutoriPago(
			JComboBox jComboBoxTiposGraficosReportesAutoriPago) {
		this.jComboBoxTiposGraficosReportesAutoriPago = jComboBoxTiposGraficosReportesAutoriPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutoriPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutoriPago() {
		return this.jComboBoxTiposPaginacionAutoriPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutoriPago(
			JComboBox jComboBoxTiposPaginacionAutoriPago) {
		this.jComboBoxTiposPaginacionAutoriPago = jComboBoxTiposPaginacionAutoriPago;
	}
	
	public void setBorderResaltarTiposPaginacionAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutoriPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutoriPago() {
		return this.jComboBoxTiposRelacionesAutoriPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriPago() {
		return this.jComboBoxTiposAccionesAutoriPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriPago(
			JComboBox jComboBoxTiposRelacionesAutoriPago) {
		this.jComboBoxTiposRelacionesAutoriPago = jComboBoxTiposRelacionesAutoriPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriPago(
			JComboBox jComboBoxTiposAccionesAutoriPago) {
		this.jComboBoxTiposAccionesAutoriPago = jComboBoxTiposAccionesAutoriPago;
	}
	
	public void setBorderResaltarTiposRelacionesAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutoriPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutoriPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutoriPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutoriPago() {
	//	return jCheckBoxConGraficoDinamicoAutoriPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutoriPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutoriPago) {
	//	this.jCheckBoxConGraficoDinamicoAutoriPago = jCheckBoxConGraficoDinamicoAutoriPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutoriPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutoriPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutoriPago .setBorder(borderResaltar);		
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
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		
		this.autoripagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoripagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoripagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Pago MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
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
		
		AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutoriPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutoriPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"nuevo","nuevo","Nuevo"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"duplicar","duplicar","Duplicar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"copiar","copiar","Copiar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"ver_form","ver_form","Ver"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"recargar","recargar","Recargar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutoriPago,this.jTtoolBarAutoriPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutoriPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutoriPago,this.jTtoolBarAutoriPago,
							"cerrar","cerrar","Salir"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutoriPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutoriPago;
			
				this.jButtonProcesarInformacionToolBarAutoriPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutoriPago;
				
		//protected JButton jButtonModificarToolBarAutoriPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutoriPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutoriPago=new JMenuMe("General");
		this.jmenuArchivoAutoriPago=new JMenuMe("Archivo");
		this.jmenuAccionesAutoriPago=new JMenuMe("Acciones");
		this.jmenuDatosAutoriPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutoriPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutoriPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutoriPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutoriPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutoriPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutoriPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutoriPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutoriPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutoriPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutoriPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutoriPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutoriPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutoriPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutoriPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutoriPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutoriPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutoriPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutoriPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutoriPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutoriPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutoriPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutoriPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutoriPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutoriPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutoriPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutoriPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutoriPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutoriPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutoriPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutoriPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutoriPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutoriPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutoriPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutoriPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutoriPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutoriPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutoriPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutoriPago.add(this.jMenuItemCerrarAutoriPago);
			
			this.jmenuAccionesAutoriPago.add(this.jMenuItemNuevoAutoriPago);
			this.jmenuAccionesAutoriPago.add(this.jMenuItemNuevoGuardarCambiosAutoriPago);
			this.jmenuAccionesAutoriPago.add(this.jMenuItemNuevoRelacionesAutoriPago);
			this.jmenuAccionesAutoriPago.add(this.jMenuItemGuardarCambiosTablaAutoriPago);		
			this.jmenuAccionesAutoriPago.add(this.jMenuItemDuplicarAutoriPago);		
			this.jmenuAccionesAutoriPago.add(this.jMenuItemCopiarAutoriPago);		
			this.jmenuAccionesAutoriPago.add(this.jMenuItemVerFormAutoriPago);		
			
			this.jmenuDatosAutoriPago.add(this.jMenuItemRecargarInformacionAutoriPago);				
			this.jmenuDatosAutoriPago.add(this.jMenuItemAnterioresAutoriPago);				
			this.jmenuDatosAutoriPago.add(this.jMenuItemSiguientesAutoriPago);				
			this.jmenuDatosAutoriPago.add(this.jMenuItemAbrirOrderByAutoriPago);				
			this.jmenuDatosAutoriPago.add(this.jMenuItemMostrarOcultarAutoriPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutoriPago.add(this.jMenuItemGuardarCambiosAutoriPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutoriPago.add(this.jmenuArchivoAutoriPago);		
			this.jmenuBarAutoriPago.add(this.jmenuAccionesAutoriPago);		
			this.jmenuBarAutoriPago.add(this.jmenuDatosAutoriPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutoriPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutoriPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdAsientoContableAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdAsientoContableAutoriPago.setToolTipText("Buscar Por Asiento Contable ");
		this.jButtonFK_IdAsientoContableAutoriPago= new JButtonMe();
		this.jButtonFK_IdAsientoContableAutoriPago.setText("Buscar");
		this.jButtonFK_IdAsientoContableAutoriPago.setToolTipText("Buscar Por Asiento Contable ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdAsientoContableAutoriPago,"buscar_button","Buscar Por Asiento Contable ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdAsientoContableAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago = new JLabelMe();
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago.setText("Asiento Contable :");
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago.setToolTipText("Asiento Contable");
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_asiento_contableFK_IdAsientoContableAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFK_IdAsientoContableAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago= new JComboBoxMe();
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago= new JButtonMe();
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago.setFocusable(false);

		this.jPanelFK_IdBancoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBancoAutoriPago.setToolTipText("Buscar Por Banco ");
		this.jButtonFK_IdBancoAutoriPago= new JButtonMe();
		this.jButtonFK_IdBancoAutoriPago.setText("Buscar");
		this.jButtonFK_IdBancoAutoriPago.setToolTipText("Buscar Por Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBancoAutoriPago,"buscar_button","Buscar Por Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBancoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bancoFK_IdBancoAutoriPago = new JLabelMe();
		jLabelid_bancoFK_IdBancoAutoriPago.setText("Banco :");
		jLabelid_bancoFK_IdBancoAutoriPago.setToolTipText("Banco");
		jLabelid_bancoFK_IdBancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bancoFK_IdBancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFK_IdBancoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bancoFK_IdBancoAutoriPago= new JComboBoxMe();
		jComboBoxid_bancoFK_IdBancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFK_IdBancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFK_IdBancoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroActividadAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroActividadAutoriPago.setToolTipText("Buscar Por Centro Activad ");
		this.jButtonFK_IdCentroActividadAutoriPago= new JButtonMe();
		this.jButtonFK_IdCentroActividadAutoriPago.setText("Buscar");
		this.jButtonFK_IdCentroActividadAutoriPago.setToolTipText("Buscar Por Centro Activad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroActividadAutoriPago,"buscar_button","Buscar Por Centro Activad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroActividadAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago = new JLabelMe();
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago.setText("Centro Activad :");
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago.setToolTipText("Centro Activad");
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_actividadFK_IdCentroActividadAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadFK_IdCentroActividadAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago= new JComboBoxMe();
		jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoAutoriPago.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoAutoriPago= new JButtonMe();
		this.jButtonFK_IdCentroCostoAutoriPago.setText("Buscar");
		this.jButtonFK_IdCentroCostoAutoriPago.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoAutoriPago,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteAutoriPago.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteAutoriPago= new JButtonMe();
		this.jButtonFK_IdClienteAutoriPago.setText("Buscar");
		this.jButtonFK_IdClienteAutoriPago.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteAutoriPago,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteAutoriPago = new JLabelMe();
		jLabelid_clienteFK_IdClienteAutoriPago.setText("Cliente :");
		jLabelid_clienteFK_IdClienteAutoriPago.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteAutoriPago= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteAutoriPago.setFocusable(false);

		this.jPanelFK_IdCuentaBancoAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaBancoAutoriPago.setToolTipText("Buscar Por Cuenta Banco ");
		this.jButtonFK_IdCuentaBancoAutoriPago= new JButtonMe();
		this.jButtonFK_IdCuentaBancoAutoriPago.setText("Buscar");
		this.jButtonFK_IdCuentaBancoAutoriPago.setToolTipText("Buscar Por Cuenta Banco ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaBancoAutoriPago,"buscar_button","Buscar Por Cuenta Banco ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaBancoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago = new JLabelMe();
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setText("Cuenta Banco :");
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setToolTipText("Cuenta Banco");
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago= new JComboBoxMe();
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDetalleProveAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDetalleProveAutoriPago.setToolTipText("Buscar Por Detalle Prove ");
		this.jButtonFK_IdDetalleProveAutoriPago= new JButtonMe();
		this.jButtonFK_IdDetalleProveAutoriPago.setText("Buscar");
		this.jButtonFK_IdDetalleProveAutoriPago.setToolTipText("Buscar Por Detalle Prove ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDetalleProveAutoriPago,"buscar_button","Buscar Por Detalle Prove ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDetalleProveAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago = new JLabelMe();
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago.setText("Detalle Prove :");
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago.setToolTipText("Detalle Prove");
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_detalle_proveFK_IdDetalleProveAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_proveFK_IdDetalleProveAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago= new JComboBoxMe();
		jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaAutoriPago.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaAutoriPago= new JButtonMe();
		this.jButtonFK_IdFacturaAutoriPago.setText("Buscar");
		this.jButtonFK_IdFacturaAutoriPago.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaAutoriPago,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaAutoriPago = new JLabelMe();
		jLabelid_facturaFK_IdFacturaAutoriPago.setText("Factura :");
		jLabelid_facturaFK_IdFacturaAutoriPago.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaAutoriPago= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago.setFocusable(false);

		this.jPanelFK_IdTransaccionAutoriPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionAutoriPago.setToolTipText("Buscar Por Transaccion ");
		this.jButtonFK_IdTransaccionAutoriPago= new JButtonMe();
		this.jButtonFK_IdTransaccionAutoriPago.setText("Buscar");
		this.jButtonFK_IdTransaccionAutoriPago.setToolTipText("Buscar Por Transaccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionAutoriPago,"buscar_button","Buscar Por Transaccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccionFK_IdTransaccionAutoriPago = new JLabelMe();
		jLabelid_transaccionFK_IdTransaccionAutoriPago.setText("Transaccion :");
		jLabelid_transaccionFK_IdTransaccionAutoriPago.setToolTipText("Transaccion");
		jLabelid_transaccionFK_IdTransaccionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccionFK_IdTransaccionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFK_IdTransaccionAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccionFK_IdTransaccionAutoriPago= new JComboBoxMe();
		jComboBoxid_transaccionFK_IdTransaccionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFK_IdTransaccionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFK_IdTransaccionAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasAutoriPago=new JTabbedPane();


		this.jTabbedPaneBusquedasAutoriPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutoriPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutoriPago = new AutoriPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autori Pago DATOS");
			this.jInternalFrameDetalleFormAutoriPago = new AutoriPagoDetalleFormJInternalFrame(jDesktopPane,this.autoripagoSessionBean.getConGuardarRelaciones(),this.autoripagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutoriPago = null;//new AutoriPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriPago= new GridBagLayout();
		
		
		this.jTableDatosAutoriPago = new JTableMe();      
		
		String sToolTipAutoriPago="";
		sToolTipAutoriPago=AutoriPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriPago+="(Tesoreria.AutoriPago)";
		}
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutoriPago.setToolTipText(sToolTipAutoriPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutoriPago);
		this.jTableDatosAutoriPago.setAutoCreateRowSorter(true);
		this.jTableDatosAutoriPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutoriPago.setRowSelectionAllowed(true);
		this.jTableDatosAutoriPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutoriPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutoriPago = new JButtonMe();
		this.jButtonDuplicarAutoriPago = new JButtonMe();
		this.jButtonCopiarAutoriPago = new JButtonMe();
		this.jButtonVerFormAutoriPago = new JButtonMe();
		this.jButtonNuevoRelacionesAutoriPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutoriPago = new JButtonMe();
		this.jButtonCerrarAutoriPago = new JButtonMe();
		
		this.jScrollPanelDatosAutoriPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutoriPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Pago";
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriPago.setToolTipText("Acciones");
        this.jPanelAccionesAutoriPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutoriPago=new ReporteDinamicoJInternalFrame(AutoriPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutoriPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutoriPago=new ImportacionJInternalFrame(AutoriPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutoriPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutoriPago = new JButtonMe();
		
		this.jButtonAbrirOrderByAutoriPago.setText("Orden");
		this.jButtonAbrirOrderByAutoriPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriPago,false,this);
			
			//this.cargarOrderByAutoriPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriPago,true,this);
			
			//this.cargarOrderByAutoriPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutoriPago.setMinimumSize(new Dimension(400,50));//1930
		this.jTableDatosAutoriPago.setMaximumSize(new Dimension(400,50));//1930
		this.jTableDatosAutoriPago.setPreferredSize(new Dimension(400,50));//1930
		
		this.jScrollPanelDatosAutoriPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutoriPago.setText("Nuevo");
		this.jButtonDuplicarAutoriPago.setText("Duplicar");
		this.jButtonCopiarAutoriPago.setText("Copiar");
		this.jButtonVerFormAutoriPago.setText("Ver");
		this.jButtonNuevoRelacionesAutoriPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutoriPago.setText("Guardar");
		this.jButtonCerrarAutoriPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriPago,"nuevo_button","Nuevo",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutoriPago,"duplicar_button","Duplicar",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutoriPago,"copiar_button","Copiar",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutoriPago,"ver_form","Ver",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutoriPago,"nuevorelaciones_button","Nuevo Rel",this.autoripagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriPago,"guardarcambiostabla_button","Guardar",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriPago,"cerrar_button","Salir",this.autoripagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutoriPago.setToolTipText("Nuevo"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutoriPago.setToolTipText("Duplicar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutoriPago.setToolTipText("Copiar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutoriPago.setToolTipText("Ver"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutoriPago.setToolTipText("Nuevo Rel"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutoriPago.setToolTipText("Guardar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriPago.setToolTipText("Salir"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriPago";
		inputMap = this.jButtonNuevoAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutoriPago";
		inputMap = this.jButtonDuplicarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutoriPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutoriPago"));
		
		//COPIAR
		sMapKey = "CopiarAutoriPago";
		inputMap = this.jButtonCopiarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutoriPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutoriPago"));
		
		//VEr FORM
		sMapKey = "VerFormAutoriPago";
		inputMap = this.jButtonVerFormAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutoriPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutoriPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutoriPago";
		inputMap = this.jButtonNuevoRelacionesAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutoriPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutoriPago";
		inputMap = this.jButtonModificarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutoriPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutoriPago";
		inputMap = this.jButtonCerrarAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriPago";
		inputMap = this.jButtonGuardarCambiosTablaAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutoriPago.setName("jPanelParametrosReportesAutoriPago"); 
		
		this.jPanelParametrosReportesAccionesAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutoriPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutoriPago.setName("jPanelParametrosReportesAccionesAutoriPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutoriPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutoriPago = new JButtonMe();
		this.jButtonRecargarInformacionAutoriPago.setText("Recargar");
		this.jButtonRecargarInformacionAutoriPago.setToolTipText("Recargar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutoriPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAutoriPago = new JButtonMe();
		this.jButtonProcesarInformacionAutoriPago.setText("Procesar");
		this.jButtonProcesarInformacionAutoriPago.setToolTipText("Procesar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutoriPago.setVisible(false);
			
		this.jButtonProcesarInformacionAutoriPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutoriPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPago.setText("TIPO");       
		this.jComboBoxTiposReportesAutoriPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutoriPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutoriPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutoriPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutoriPago.setText("Accion");
		this.jComboBoxTiposRelacionesAutoriPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriPago.setText("Accion");
		this.jComboBoxTiposAccionesAutoriPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutoriPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutoriPago.setText("Accion");
		this.jComboBoxTiposSeleccionarAutoriPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutoriPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutoriPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutoriPago = new JLabelMe();
		
		this.jLabelAccionesAutoriPago.setText("Acciones");		
		this.jLabelAccionesAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutoriPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutoriPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutoriPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutoriPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutoriPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutoriPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutoriPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutoriPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutoriPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutoriPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutoriPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutoriPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutoriPago = new JButtonMe();
		//this.jButtonAnterioresAutoriPago.setText("<<");
        this.jButtonAnterioresAutoriPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutoriPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutoriPago = new JButtonMe();
		//this.jButtonSiguientesAutoriPago.setText(">>");
        this.jButtonSiguientesAutoriPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutoriPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutoriPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutoriPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutoriPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutoriPago,"nuevoguardarcambios_button","Nue",this.autoripagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutoriPago";
		inputMap = this.jButtonNuevoGuardarCambiosAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutoriPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutoriPago";
		inputMap = this.jButtonRecargarInformacionAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutoriPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutoriPago";
		inputMap = this.jButtonSiguientesAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutoriPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutoriPago";
		inputMap = this.jButtonAnterioresAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutoriPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutoriPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutoriPago.setMinimumSize(new Dimension(this.getWidth(),AutoriPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriPago.setMaximumSize(new Dimension(this.getWidth(),AutoriPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriPago.setPreferredSize(new Dimension(this.getWidth(),AutoriPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutoriPago = new GridBagLayout();

			this.jPanelPaginacionAutoriPago.setLayout(gridaBagLayoutPaginacionAutoriPago);						
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 0;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutoriPago.add(this.jButtonAnterioresAutoriPago, this.gridBagConstraintsAutoriPago);
					
						
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriPago.gridy = 0;
			
			this.jPanelPaginacionAutoriPago.add(this.jButtonNuevoGuardarCambiosAutoriPago, this.gridBagConstraintsAutoriPago);
						
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriPago.gridy = 0;
			this.jPanelPaginacionAutoriPago.add(this.jButtonSiguientesAutoriPago, this.gridBagConstraintsAutoriPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 1;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPago.add(this.jButtonNuevoAutoriPago, this.gridBagConstraintsAutoriPago);
						
			
			
			if(!this.autoripagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutoriPago = new GridBagConstraints();
				this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutoriPago.gridy = 1;
				this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAutoriPago.add(this.jButtonGuardarCambiosTablaAutoriPago, this.gridBagConstraintsAutoriPago);
			}
			
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 1;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPago.add(this.jButtonDuplicarAutoriPago, this.gridBagConstraintsAutoriPago);
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 1;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPago.add(this.jButtonCopiarAutoriPago, this.gridBagConstraintsAutoriPago);
		
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 1;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriPago.add(this.jButtonVerFormAutoriPago, this.gridBagConstraintsAutoriPago);
		
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 1;
			this.gridBagConstraintsAutoriPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutoriPago.add(this.jButtonCerrarAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		
		this.jButtonRecargarInformacionAutoriPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutoriPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutoriPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutoriPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutoriPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutoriPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutoriPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutoriPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutoriPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutoriPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutoriPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutoriPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutoriPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutoriPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutoriPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutoriPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutoriPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutoriPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutoriPago.setLayout(gridaBagParametrosReportesAutoriPago);
			this.jPanelParametrosReportesAccionesAutoriPago.setLayout(gridaBagParametrosReportesAccionesAutoriPago);
			
			
			this.jPanelParametrosAuxiliar1AutoriPago.setLayout(gridaBagParametrosAuxiliar1AutoriPago);
			this.jPanelParametrosAuxiliar2AutoriPago.setLayout(gridaBagParametrosAuxiliar2AutoriPago);
			this.jPanelParametrosAuxiliar3AutoriPago.setLayout(gridaBagParametrosAuxiliar3AutoriPago);
			this.jPanelParametrosAuxiliar4AutoriPago.setLayout(gridaBagParametrosAuxiliar4AutoriPago);
			//this.jPanelParametrosAuxiliar5AutoriPago.setLayout(gridaBagParametrosAuxiliar2AutoriPago);			
			
			
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPago.add(this.jButtonRecargarInformacionAutoriPago, this.gridBagConstraintsAutoriPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPago.add(this.jComboBoxTiposPaginacionAutoriPago, this.gridBagConstraintsAutoriPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPago.add(this.jCheckBoxConAltoMaximoTablaAutoriPago, this.gridBagConstraintsAutoriPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriPago.add(this.jComboBoxTiposArchivosReportesAutoriPago, this.gridBagConstraintsAutoriPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPago.add(this.jPanelParametrosAuxiliar1AutoriPago, this.gridBagConstraintsAutoriPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutoriPago.add(this.jComboBoxTiposReportesAutoriPago, this.gridBagConstraintsAutoriPago);																		
			
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4AutoriPago.add(this.jComboBoxTiposGraficosReportesAutoriPago, this.gridBagConstraintsAutoriPago);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPago.add(this.jPanelParametrosAuxiliar4AutoriPago, this.gridBagConstraintsAutoriPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPago.add(this.jComboBoxTiposReportesAutoriPago, this.gridBagConstraintsAutoriPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPago.add(this.jCheckBoxGenerarReporteAutoriPago, this.gridBagConstraintsAutoriPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPago.add(this.jPanelParametrosAuxiliar2AutoriPago, this.gridBagConstraintsAutoriPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPago.add(this.jLabelAccionesAutoriPago, this.gridBagConstraintsAutoriPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutoriPago = new GridBagConstraints();
				this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutoriPago.add(this.jButtonAbrirOrderByAutoriPago, this.gridBagConstraintsAutoriPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPago.add(this.jComboBoxTiposSeleccionarAutoriPago, this.gridBagConstraintsAutoriPago);			
			
			
			/*
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPago.add(this.jCheckBoxSeleccionarTodosAutoriPago, this.gridBagConstraintsAutoriPago);
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriPago.add(this.jCheckBoxConGraficoReporteAutoriPago, this.gridBagConstraintsAutoriPago);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPago.add(this.jCheckBoxSeleccionarTodosAutoriPago, this.gridBagConstraintsAutoriPago);															
				
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPago.add(this.jCheckBoxSeleccionadosAutoriPago, this.gridBagConstraintsAutoriPago);															
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriPago.add(this.jCheckBoxConGraficoReporteAutoriPago, this.gridBagConstraintsAutoriPago);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriPago.add(this.jPanelParametrosAuxiliar3AutoriPago, this.gridBagConstraintsAutoriPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPago.add(this.jComboBoxTiposAccionesAutoriPago, this.gridBagConstraintsAutoriPago);
	
				
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriPago.add(this.jTextFieldValorCampoGeneralAutoriPago, this.gridBagConstraintsAutoriPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutoriPago = new GridBagLayout();

			this.jScrollPanelDatosAutoriPago.setLayout(gridaBagLayoutDatosAutoriPago);
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = 0;
			this.gridBagConstraintsAutoriPago.gridx = 0;
			
			this.jScrollPanelDatosAutoriPago.add(this.jTableDatosAutoriPago, this.gridBagConstraintsAutoriPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutoriPago.setViewportView(this.jTableDatosAutoriPago);
		this.jTableDatosAutoriPago.setFillsViewportHeight(true);
		this.jTableDatosAutoriPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutoriPago= new GridBagLayout();
		this.jPanelAccionesAutoriPago.setLayout(gridaBagLayoutAccionesAutoriPago);
		
		
		/*	
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = 0;
		this.gridBagConstraintsAutoriPago.gridx = 0;
			
		this.jPanelAccionesAutoriPago.add(this.jButtonNuevoAutoriPago, this.gridBagConstraintsAutoriPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdAsientoContableAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdAsientoContableAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdAsientoContableAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdAsientoContableAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdAsientoContableAutoriPago.setLayout(gridaBagLayoutFK_IdAsientoContableAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdAsientoContableAutoriPago.add(jLabelid_asiento_contableFK_IdAsientoContableAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdAsientoContableAutoriPago.add(jComboBoxid_asiento_contableFK_IdAsientoContableAutoriPago, gridBagConstraintsAutoriPago);


		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdAsientoContableAutoriPago.add(this.jButtonBuscarFK_IdAsientoContableid_asiento_contableAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdAsientoContableAutoriPago.add(jButtonFK_IdAsientoContableAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("1.-Por Asiento Contable ", jPanelFK_IdAsientoContableAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdBancoAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdBancoAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBancoAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBancoAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBancoAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBancoAutoriPago.setLayout(gridaBagLayoutFK_IdBancoAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdBancoAutoriPago.add(jLabelid_bancoFK_IdBancoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdBancoAutoriPago.add(jComboBoxid_bancoFK_IdBancoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdBancoAutoriPago.add(jButtonFK_IdBancoAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("2.-Por Banco ", jPanelFK_IdBancoAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCentroActividadAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdCentroActividadAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroActividadAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroActividadAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroActividadAutoriPago.setLayout(gridaBagLayoutFK_IdCentroActividadAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdCentroActividadAutoriPago.add(jLabelid_centro_actividadFK_IdCentroActividadAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdCentroActividadAutoriPago.add(jComboBoxid_centro_actividadFK_IdCentroActividadAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdCentroActividadAutoriPago.add(jButtonFK_IdCentroActividadAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("3.-Por Centro Activad ", jPanelFK_IdCentroActividadAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoAutoriPago.setLayout(gridaBagLayoutFK_IdCentroCostoAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdCentroCostoAutoriPago.add(jLabelid_centro_costoFK_IdCentroCostoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdCentroCostoAutoriPago.add(jComboBoxid_centro_costoFK_IdCentroCostoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdCentroCostoAutoriPago.add(jButtonFK_IdCentroCostoAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("4.-Por Centro Costo ", jPanelFK_IdCentroCostoAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdClienteAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdClienteAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteAutoriPago.setLayout(gridaBagLayoutFK_IdClienteAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdClienteAutoriPago.add(jLabelid_clienteFK_IdClienteAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdClienteAutoriPago.add(jComboBoxid_clienteFK_IdClienteAutoriPago, gridBagConstraintsAutoriPago);


		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdClienteAutoriPago.add(this.jButtonBuscarFK_IdClienteid_clienteAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdClienteAutoriPago.add(jButtonFK_IdClienteAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("5.-Por Cliente ", jPanelFK_IdClienteAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdCuentaBancoAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaBancoAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaBancoAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaBancoAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaBancoAutoriPago.setLayout(gridaBagLayoutFK_IdCuentaBancoAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdCuentaBancoAutoriPago.add(jLabelid_cuenta_bancoFK_IdCuentaBancoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdCuentaBancoAutoriPago.add(jComboBoxid_cuenta_bancoFK_IdCuentaBancoAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdCuentaBancoAutoriPago.add(jButtonFK_IdCuentaBancoAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("6.-Por Cuenta Banco ", jPanelFK_IdCuentaBancoAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdDetalleProveAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdDetalleProveAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDetalleProveAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDetalleProveAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDetalleProveAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDetalleProveAutoriPago.setLayout(gridaBagLayoutFK_IdDetalleProveAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdDetalleProveAutoriPago.add(jLabelid_detalle_proveFK_IdDetalleProveAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdDetalleProveAutoriPago.add(jComboBoxid_detalle_proveFK_IdDetalleProveAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdDetalleProveAutoriPago.add(jButtonFK_IdDetalleProveAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("7.-Por Detalle Prove ", jPanelFK_IdDetalleProveAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdFacturaAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaAutoriPago.setLayout(gridaBagLayoutFK_IdFacturaAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdFacturaAutoriPago.add(jLabelid_facturaFK_IdFacturaAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdFacturaAutoriPago.add(jComboBoxid_facturaFK_IdFacturaAutoriPago, gridBagConstraintsAutoriPago);


		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.EAST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.NONE;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdFacturaAutoriPago.add(this.jButtonBuscarFK_IdFacturaid_facturaAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdFacturaAutoriPago.add(jButtonFK_IdFacturaAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("8.-Por Factura ", jPanelFK_IdFacturaAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTransaccionAutoriPago= new GridBagLayout();
		gridaBagLayoutFK_IdTransaccionAutoriPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAutoriPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTransaccionAutoriPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTransaccionAutoriPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTransaccionAutoriPago.setLayout(gridaBagLayoutFK_IdTransaccionAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 0;
		jPanelFK_IdTransaccionAutoriPago.add(jLabelid_transaccionFK_IdTransaccionAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 0;
		gridBagConstraintsAutoriPago.gridx = 1;
		jPanelFK_IdTransaccionAutoriPago.add(jComboBoxid_transaccionFK_IdTransaccionAutoriPago, gridBagConstraintsAutoriPago);

		gridBagConstraintsAutoriPago = new GridBagConstraints();
		gridBagConstraintsAutoriPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsAutoriPago.gridy = 1;
		gridBagConstraintsAutoriPago.gridx =1;
		jPanelFK_IdTransaccionAutoriPago.add(jButtonFK_IdTransaccionAutoriPago, gridBagConstraintsAutoriPago);

		jTabbedPaneBusquedasAutoriPago.addTab("9.-Por Transaccion ", jPanelFK_IdTransaccionAutoriPago);
		jTabbedPaneBusquedasAutoriPago.setMnemonicAt(8, KeyEvent.VK_9);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoripagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();						
			this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPago.gridx = 0;		
			//this.gridBagConstraintsAutoriPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutoriPago, this.gridBagConstraintsAutoriPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutoriPago.gridx = 0;		
		//this.gridBagConstraintsAutoriPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutoriPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutoriPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriPago.gridx = 0;		
			this.gridBagConstraintsAutoriPago.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsAutoriPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasAutoriPago, this.gridBagConstraintsAutoriPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutoriPago, this.gridBagConstraintsAutoriPago);								
		
		
		/*
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutoriPago, this.gridBagConstraintsAutoriPago);
		*/		
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriPago.gridx =0;
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriPago, this.gridBagConstraintsAutoriPago);
				
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutoriPago, this.gridBagConstraintsAutoriPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AutoriPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutoriPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriPago = new GridBagLayout();
			this.jPanelBusquedasParametrosAutoriPago.setLayout(gridaBagLayoutBusquedasParametrosAutoriPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutoriPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriPago, this.gridBagConstraintsAutoriPago);
			
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriPago, this.gridBagConstraintsAutoriPago);
		
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriPago, this.gridBagConstraintsAutoriPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutoriPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutoriPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutoriPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutoriPago.setName("jPanelReporteDinamicoAutoriPago"); 
		
		this.jPanelReporteDinamicoAutoriPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutoriPago.setLayout(gridaBagLayoutReporteDinamicoAutoriPago);
		
		
		this.jInternalFrameReporteDinamicoAutoriPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutoriPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutoriPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutoriPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutoriPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutoriPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutoriPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutoriPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutoriPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutoriPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutoriPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutoriPago = new JLabelMe();

		this.jLabelColumnasSelectReporteAutoriPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelColumnasSelectReporteAutoriPago, this.gridBagConstraintsAutoriPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutoriPago = new JList<Reporte>();
		this.jListColumnasSelectReporteAutoriPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutoriPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutoriPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutoriPago=new JScrollPane(this.jListColumnasSelectReporteAutoriPago);
			
			this.jScrollColumnasSelectReporteAutoriPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriPago.add(this.jListColumnasSelectReporteAutoriPago, this.gridBagConstraintsAutoriPago);
		this.jPanelReporteDinamicoAutoriPago.add(this.jScrollColumnasSelectReporteAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutoriPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutoriPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutoriPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutoriPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutoriPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutoriPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutoriPago=new JScrollPane(this.jListRelacionesSelectReporteAutoriPago);
			
			this.jScrollRelacionesSelectReporteAutoriPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAutoriPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutoriPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutoriPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutoriPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutoriPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutoriPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoAutoriPago = new JLabelMe();

		this.jLabelConGraficoDinamicoAutoriPago.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelConGraficoDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoAutoriPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoAutoriPago.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoAutoriPago.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoAutoriPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAutoriPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoAutoriPago.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jCheckBoxConGraficoDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoAutoriPago = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoAutoriPago.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelColumnaCategoriaGraficoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoAutoriPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAutoriPago.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoAutoriPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoAutoriPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAutoriPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoAutoriPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoAutoriPago.add(this.jComboBoxColumnaCategoriaGraficoAutoriPago, this.gridBagConstraintsAutoriPago);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorAutoriPago = new JLabelMe();

		this.jLabelColumnaCategoriaValorAutoriPago.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelColumnaCategoriaValorAutoriPago, this.gridBagConstraintsAutoriPago);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorAutoriPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorAutoriPago.setText("Accion");
        this.jComboBoxColumnaCategoriaValorAutoriPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorAutoriPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAutoriPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorAutoriPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoAutoriPago.add(this.jComboBoxColumnaCategoriaValorAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoAutoriPago = new JLabelMe();

		this.jLabelColumnasValoresGraficoAutoriPago.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelColumnasValoresGraficoAutoriPago, this.gridBagConstraintsAutoriPago);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoAutoriPago = new JList<Reporte>();
		this.jListColumnasValoresGraficoAutoriPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoAutoriPago.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoAutoriPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAutoriPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoAutoriPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoAutoriPago=new JScrollPane(this.jListColumnasValoresGraficoAutoriPago);
			
			this.jScrollColumnasValoresGraficoAutoriPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAutoriPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoAutoriPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoAutoriPago.add(this.jListColumnasSelectReporteAutoriPago, this.gridBagConstraintsAutoriPago);
		this.jPanelReporteDinamicoAutoriPago.add(this.jScrollColumnasValoresGraficoAutoriPago, this.gridBagConstraintsAutoriPago);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoAutoriPago = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoAutoriPago.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelTiposGraficosReportesDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoAutoriPago = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoAutoriPago.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPago.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoAutoriPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoAutoriPago.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jComboBoxTiposGraficosReportesDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutoriPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutoriPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelGenerarExcelReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutoriPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutoriPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutoriPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutoriPago.setToolTipText("Generar EXCEL"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		//this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutoriPago.add(this.jButtonGenerarExcelReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPago.add(this.jComboBoxTiposReportesDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutoriPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutoriPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriPago.add(this.jLabelTiposArchivoReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPago.add(this.jComboBoxTiposArchivosReportesDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutoriPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutoriPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutoriPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutoriPago.setToolTipText("Generar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPago.add(this.jButtonGenerarReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutoriPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutoriPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutoriPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutoriPago.setToolTipText("Cancelar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriPago.add(this.jButtonCerrarReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutoriPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutoriPago= new JScrollPane(jPanelReporteDinamicoAutoriPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutoriPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutoriPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutoriPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutoriPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutoriPago);
		this.jInternalFrameReporteDinamicoAutoriPago.getContentPane().add(this.jScrollPanelReporteDinamicoAutoriPago, this.gridBagConstraintsAutoriPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutoriPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutoriPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutoriPago.setName("jPanelImportacionAutoriPago"); 
		
		this.jPanelImportacionAutoriPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutoriPago.setLayout(gridaBagLayoutImportacionAutoriPago);
		
		
		this.jInternalFrameImportacionAutoriPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutoriPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutoriPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutoriPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutoriPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriPago.setResizable(true);
	    this.jInternalFrameImportacionAutoriPago.setClosable(true);
	    this.jInternalFrameImportacionAutoriPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutoriPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutoriPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriPago.setResizable(true);
	    this.jInternalFrameImportacionAutoriPago.setClosable(true);
	    this.jInternalFrameImportacionAutoriPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutoriPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutoriPago = new JLabelMe();

		this.jLabelArchivoImportacionAutoriPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriPago.add(this.jLabelArchivoImportacionAutoriPago, this.gridBagConstraintsAutoriPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutoriPago = new JFileChooser();		
		this.jFileChooserImportacionAutoriPago.setToolTipText("ESCOGER ARCHIVO"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutoriPago = new JButtonMe();
		this.jButtonAbrirImportacionAutoriPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutoriPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutoriPago.setToolTipText("Generar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPago.add(this.jButtonAbrirImportacionAutoriPago, this.gridBagConstraintsAutoriPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutoriPago = new JLabelMe();

		this.jLabelPathArchivoImportacionAutoriPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutoriPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriPago.add(this.jLabelPathArchivoImportacionAutoriPago, this.gridBagConstraintsAutoriPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutoriPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutoriPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPago.add(this.jTextFieldPathArchivoImportacionAutoriPago, this.gridBagConstraintsAutoriPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutoriPago = new JButtonMe();
		this.jButtonGenerarImportacionAutoriPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutoriPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutoriPago.setToolTipText("Generar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPago.add(this.jButtonGenerarImportacionAutoriPago, this.gridBagConstraintsAutoriPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutoriPago = new JButtonMe();
		this.jButtonCerrarImportacionAutoriPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutoriPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutoriPago.setToolTipText("Cancelar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriPago.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriPago.add(this.jButtonCerrarImportacionAutoriPago, this.gridBagConstraintsAutoriPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutoriPago = new GridBagLayout();
		
		this.jScrollPanelImportacionAutoriPago= new JScrollPane(jPanelImportacionAutoriPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutoriPago = new GridBagConstraints();
		this.gridBagConstraintsAutoriPago.gridy =iPosYImportacion;
		this.gridBagConstraintsAutoriPago.gridx =iPosXImportacion;
		this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutoriPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutoriPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutoriPago);
		this.jInternalFrameImportacionAutoriPago.getContentPane().add(this.jScrollPanelImportacionAutoriPago, this.gridBagConstraintsAutoriPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutoriPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutoriPago = new JButtonMe();
			this.jButtonAbrirOrderByAutoriPago.setText("Orden");
			this.jButtonAbrirOrderByAutoriPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutoriPago";
			inputMap = this.jButtonAbrirOrderByAutoriPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutoriPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutoriPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutoriPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutoriPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutoriPago.setName("jPanelOrderByAutoriPago"); 
			
			this.jPanelOrderByAutoriPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutoriPago.setLayout(gridaBagLayoutOrderByAutoriPago);
			
			
			this.jTableDatosAutoriPagoOrderBy = new JTableMe();        
			this.jTableDatosAutoriPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutoriPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutoriPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutoriPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutoriPagoOrderBy.setViewportView(this.jTableDatosAutoriPagoOrderBy);
			this.jTableDatosAutoriPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutoriPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutoriPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutoriPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutoriPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutoriPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutoriPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutoriPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutoriPago.setTitle("Orden");
			this.jInternalFrameOrderByAutoriPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutoriPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutoriPago.setResizable(true);
			this.jInternalFrameOrderByAutoriPago.setClosable(true);
			this.jInternalFrameOrderByAutoriPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutoriPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutoriPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutoriPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutoriPago.ipady =150;
				
			this.jPanelOrderByAutoriPago.add(jScrollPanelDatosAutoriPagoOrderBy, this.gridBagConstraintsAutoriPago);//this.jTableDatosAutoriPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutoriPago = new JButtonMe();
			this.jButtonCerrarOrderByAutoriPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutoriPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutoriPago.setToolTipText("Cancelar"+" "+AutoriPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutoriPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutoriPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutoriPago.add(this.jButtonCerrarOrderByAutoriPago, this.gridBagConstraintsAutoriPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutoriPago = new GridBagLayout();
			
			this.jScrollPanelOrderByAutoriPago= new JScrollPane(jPanelOrderByAutoriPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutoriPago = new GridBagConstraints();
			this.gridBagConstraintsAutoriPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutoriPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutoriPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutoriPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutoriPago);
			
			this.jInternalFrameOrderByAutoriPago.getContentPane().add(this.jScrollPanelOrderByAutoriPago, this.gridBagConstraintsAutoriPago);			
		
		} else {
			this.jButtonAbrirOrderByAutoriPago = new JButtonMe();
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
			&& this.autoripagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAutoriPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutoriPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutoriPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAutoriPago.getRowHeight();//AutoriPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutoriPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriPago.isSelected()) {
					iHeightTable=AutoriPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutoriPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriPago.isSelected()) {
					iHeightTable=AutoriPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutoriPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutoriPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutoriPago!=null && this.jInternalFrameOrderByAutoriPago.getjTableDatosOrderBy()!=null) {
			//if(!this.autoripagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutoriPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutoriPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutoriPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutoriPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutoriPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutoriPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutoriPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutoriPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=autoripagoLogic.getAutoriPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoripagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AutoriPago> TraerAutoriPagoBeans(List<AutoriPago> autoripagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutoriPago autoripago:autoripagos) {
					
				if(!(AutoriPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutoriPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autoripago.setsDetalleGeneralEntityReporte(AutoriPagoConstantesFunciones.getAutoriPagoDescripcion(autoripago));
										
						
					
						
					
				} else  {
							
					//autoripago.setsDetalleGeneralEntityReporte(autoripago.getsDetalleGeneralEntityReporte());
										
				}
				
				//autoripagobeans.add(autoripagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autoripagos;
    }
	//PARA REPORTES FIN
}
