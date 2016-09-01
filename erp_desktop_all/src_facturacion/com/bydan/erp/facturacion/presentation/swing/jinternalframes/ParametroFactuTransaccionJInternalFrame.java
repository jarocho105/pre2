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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
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
import com.bydan.erp.facturacion.util.ParametroFactuTransaccionConstantesFunciones;

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
public class ParametroFactuTransaccionJInternalFrame extends ParametroFactuTransaccionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarParametroFactuTransaccion;
	
	protected JMenuBar jmenuBarParametroFactuTransaccion;
	
	protected JMenu jmenuParametroFactuTransaccion;
	protected JMenu jmenuDatosParametroFactuTransaccion;
	protected JMenu jmenuArchivoParametroFactuTransaccion;
	protected JMenu jmenuAccionesParametroFactuTransaccion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuTransaccion;	
	protected GridBagConstraints gridBagConstraintsParametroFactuTransaccion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ParametroFactuTransaccionDetalleFormJInternalFrame jInternalFrameDetalleFormParametroFactuTransaccion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoParametroFactuTransaccion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionParametroFactuTransaccion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvenfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvenfactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvennotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvennotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioninvennotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioninvennotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentacofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentacofactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentaconotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentaconotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentaconotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentaconotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentacotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentacotarjeta="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentapafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentapafactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentapanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentapanotacredito="";
	
	public ParametroFactuTransaccionSessionBean parametrofactutransaccionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TransaccionSessionBean transaccioninvenfacturaSessionBean;
	public TransaccionSessionBean transaccioninvennotacreditoSessionBean;
	public TransaccionSessionBean transaccioninvennotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentacofacturaSessionBean;
	public TransaccionSessionBean transaccioncuentaconotacreditoSessionBean;
	public TransaccionSessionBean transaccioncuentaconotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentacotarjetaSessionBean;
	public TransaccionSessionBean transaccioncuentapafacturaSessionBean;
	public TransaccionSessionBean transaccioncuentapanotacreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ParametroFactuTransaccion> parametrofactutransaccions;		
	public List<ParametroFactuTransaccion> parametrofactutransaccionsEliminados;	
	public List<ParametroFactuTransaccion> parametrofactutransaccionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByParametroFactuTransaccion;		
	protected JButton jButtonAbrirOrderByParametroFactuTransaccion;
	
	
	//protected JPanel jPanelOrderByParametroFactuTransaccion;
	//public JScrollPane jScrollPanelOrderByParametroFactuTransaccion;	
	//protected JButton jButtonCerrarOrderByParametroFactuTransaccion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ParametroFactuTransaccionLogic parametrofactutransaccionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosParametroFactuTransaccion;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuTransaccion;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuTransaccion;
    
	
	
	//public JScrollPane jScrollPanelDatosParametroFactuTransaccionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoParametroFactuTransaccion;
	//public JScrollPane jScrollPanelImportacionParametroFactuTransaccion;
	
	
	
	protected JPanel jPanelAccionesParametroFactuTransaccion;
	
    protected JPanel jPanelPaginacionParametroFactuTransaccion;
    protected JPanel jPanelParametrosReportesParametroFactuTransaccion;
	protected JPanel jPanelParametrosReportesAccionesParametroFactuTransaccion;
	
	
	
	
	
	

	protected JPanel jPanelCamposInicioinventarioParametroFactuTransaccion;
	protected Integer iXPanelCamposInicioinventarioParametroFactuTransaccion=0;
	protected Integer iYPanelCamposInicioinventarioParametroFactuTransaccion=0;

	protected JPanel jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion;
	protected Integer iXPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;
	protected Integer iYPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion=0;

	protected JPanel jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion;
	protected Integer iXPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;
	protected Integer iYPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ParametroFactuTransaccion;
	protected JPanel jPanelParametrosAuxiliar2ParametroFactuTransaccion;
	protected JPanel jPanelParametrosAuxiliar3ParametroFactuTransaccion;
	protected JPanel jPanelParametrosAuxiliar4ParametroFactuTransaccion;
	//protected JPanel jPanelParametrosAuxiliar5ParametroFactuTransaccion;
	
	
	
	//protected JPanel jPanelReporteDinamicoParametroFactuTransaccion;
	//protected JPanel jPanelImportacionParametroFactuTransaccion;
	
	
	public JTable jTableDatosParametroFactuTransaccion;
	
	
	
	//public JTable jTableDatosParametroFactuTransaccionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoParametroFactuTransaccion;
	protected JButton jButtonDuplicarParametroFactuTransaccion;
	protected JButton jButtonCopiarParametroFactuTransaccion;
	protected JButton jButtonVerFormParametroFactuTransaccion;
	protected JButton jButtonNuevoRelacionesParametroFactuTransaccion;
	protected JButton jButtonModificarParametroFactuTransaccion;
	
    protected JButton jButtonGuardarCambiosTablaParametroFactuTransaccion;
	protected JButton jButtonCerrarParametroFactuTransaccion;
	
	
	protected JButton jButtonRecargarInformacionParametroFactuTransaccion;
	protected JButton jButtonProcesarInformacionParametroFactuTransaccion;
	
	
	protected JButton jButtonAnterioresParametroFactuTransaccion;
	protected JButton jButtonSiguientesParametroFactuTransaccion;
	protected JButton jButtonNuevoGuardarCambiosParametroFactuTransaccion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoParametroFactuTransaccion;
	//protected JButton jButtonCerrarReporteDinamicoParametroFactuTransaccion;
	//protected JButton jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion;	
	
	
	
	//protected JButton jButtonAbrirImportacionParametroFactuTransaccion;
	//protected JButton jButtonGenerarImportacionParametroFactuTransaccion;
	//protected JButton jButtonCerrarImportacionParametroFactuTransaccion;
	//protected JFileChooser jFileChooserImportacionParametroFactuTransaccion;
	//protected File fileImportacionParametroFactuTransaccion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuTransaccion;
	protected JButton jButtonDuplicarToolBarParametroFactuTransaccion;
	protected JButton jButtonNuevoRelacionesToolBarParametroFactuTransaccion;
	
	
	public JButton jButtonGuardarCambiosToolBarParametroFactuTransaccion;
	protected JButton jButtonCopiarToolBarParametroFactuTransaccion;
	protected JButton jButtonVerFormToolBarParametroFactuTransaccion;
	public JButton jButtonGuardarCambiosTablaToolBarParametroFactuTransaccion;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuTransaccion;
	protected JButton jButtonCerrarToolBarParametroFactuTransaccion;
	
	protected JButton jButtonRecargarInformacionToolBarParametroFactuTransaccion;
	protected JButton jButtonProcesarInformacionToolBarParametroFactuTransaccion;
	protected JButton jButtonAnterioresToolBarParametroFactuTransaccion;
	protected JButton jButtonSiguientesToolBarParametroFactuTransaccion;
	protected JButton jButtonNuevoGuardarCambiosToolBarParametroFactuTransaccion;
	protected JButton jButtonAbrirOrderByToolBarParametroFactuTransaccion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuTransaccion;
	protected JMenuItem jMenuItemDuplicarParametroFactuTransaccion;
	protected JMenuItem jMenuItemNuevoRelacionesParametroFactuTransaccion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosParametroFactuTransaccion;
	protected JMenuItem jMenuItemCopiarParametroFactuTransaccion;
	protected JMenuItem jMenuItemVerFormParametroFactuTransaccion;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuTransaccion;
	protected JMenuItem jMenuItemCerrarParametroFactuTransaccion;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuTransaccion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByParametroFactuTransaccion;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuTransaccion;
	
	protected JMenuItem jMenuItemRecargarInformacionParametroFactuTransaccion;
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuTransaccion;
	protected JMenuItem jMenuItemAnterioresParametroFactuTransaccion;
	protected JMenuItem jMenuItemSiguientesParametroFactuTransaccion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuTransaccion;
	protected JMenuItem jMenuItemAbrirOrderByParametroFactuTransaccion;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuTransaccion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuTransaccion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosParametroFactuTransaccion;
	protected JCheckBox jCheckBoxSeleccionadosParametroFactuTransaccion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaParametroFactuTransaccion;
	protected JCheckBox jCheckBoxConGraficoReporteParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesParametroFactuTransaccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarParametroFactuTransaccion;
	protected JTextField jTextFieldValorCampoGeneralParametroFactuTransaccion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteParametroFactuTransaccion;
	//public JList<Reporte> jListColumnasSelectReporteParametroFactuTransaccion;
	//public JScrollPane jScrollColumnasSelectReporteParametroFactuTransaccion;
	
	//public JLabel jLabelRelacionesSelectReporteParametroFactuTransaccion;
	//public JList<Reporte> jListRelacionesSelectReporteParametroFactuTransaccion;
	//public JScrollPane jScrollRelacionesSelectReporteParametroFactuTransaccion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoParametroFactuTransaccion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoParametroFactuTransaccion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion;
	//public JLabel jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion;
	
		
	//public JLabel jLabelArchivoImportacionParametroFactuTransaccion;	
	//public JLabel jLabelPathArchivoImportacionParametroFactuTransaccion;
	//protected JTextField jTextFieldPathArchivoImportacionParametroFactuTransaccion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoParametroFactuTransaccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoParametroFactuTransaccion;
	
	//public JLabel jLabelColumnaCategoriaValorParametroFactuTransaccion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorParametroFactuTransaccion;
	
	//public JLabel jLabelColumnasValoresGraficoParametroFactuTransaccion;
	//public JList<Reporte> jListColumnasValoresGraficoParametroFactuTransaccion;
	//public JScrollPane jScrollColumnasValoresGraficoParametroFactuTransaccion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoParametroFactuTransaccion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoParametroFactuTransaccion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionInvenFacturaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion;
	public JPanel jPanelFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion;
	public JButton jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion;
	
	public JPanel jPanelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion;
	public JLabel jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion;
	public JButton jButtonid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccionUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccionBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ParametroFactuTransaccionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuTransaccionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionParametroFactuTransaccion)	{
		this.jButtonRecargarInformacionParametroFactuTransaccion = jButtonRecargarInformacionParametroFactuTransaccion;
	}
	
	public JButton getjButtonProcesarInformacionParametroFactuTransaccion() {
		return this.jButtonProcesarInformacionParametroFactuTransaccion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuTransaccion)	{
		this.jButtonProcesarInformacionParametroFactuTransaccion = jButtonProcesarInformacionParametroFactuTransaccion;
	}
	
	
	public JButton getjButtonRecargarInformacionParametroFactuTransaccion() {
		return this.jButtonRecargarInformacionParametroFactuTransaccion;
	}
	
	
	public List<ParametroFactuTransaccion> getparametrofactutransaccions() {
		return this.parametrofactutransaccions;
	}

	public void setparametrofactutransaccions(List<ParametroFactuTransaccion> parametrofactutransaccions) {
		this.parametrofactutransaccions = parametrofactutransaccions;
	}
	
	public List<ParametroFactuTransaccion> getparametrofactutransaccionsAux() {
		return this.parametrofactutransaccionsAux;
	}

	public void setparametrofactutransaccionsAux(List<ParametroFactuTransaccion> parametrofactutransaccionsAux) {
		this.parametrofactutransaccionsAux = parametrofactutransaccionsAux;
	}
	
	public List<ParametroFactuTransaccion> getparametrofactutransaccionsEliminados() {
		return this.parametrofactutransaccionsEliminados;
	}

	public void setParametroFactuTransaccionsEliminados(List<ParametroFactuTransaccion> parametrofactutransaccionsEliminados) {
		this.parametrofactutransaccionsEliminados = parametrofactutransaccionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarParametroFactuTransaccion() {
		return jComboBoxTiposSeleccionarParametroFactuTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarParametroFactuTransaccion(
			JComboBox jComboBoxTiposSeleccionarParametroFactuTransaccion) {
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion = jComboBoxTiposSeleccionarParametroFactuTransaccion;
	}
	
	public void setBorderResaltarTiposSeleccionarParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralParametroFactuTransaccion() {
		return jTextFieldValorCampoGeneralParametroFactuTransaccion;
	}

	public void setjTextFieldValorCampoGeneralParametroFactuTransaccion(
			JTextField jTextFieldValorCampoGeneralParametroFactuTransaccion) {
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion = jTextFieldValorCampoGeneralParametroFactuTransaccion;
	}

	public void setBorderResaltarValorCampoGeneralParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosParametroFactuTransaccion() {
		return this.jCheckBoxSeleccionarTodosParametroFactuTransaccion;
	}

	public void setjCheckBoxSeleccionarTodosParametroFactuTransaccion(
			JCheckBox jCheckBoxSeleccionarTodosParametroFactuTransaccion) {
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion = jCheckBoxSeleccionarTodosParametroFactuTransaccion;
	}

	public void setBorderResaltarSeleccionarTodosParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosParametroFactuTransaccion() {
		return this.jCheckBoxSeleccionadosParametroFactuTransaccion;
	}

	public void setjCheckBoxSeleccionadosParametroFactuTransaccion(
			JCheckBox jCheckBoxSeleccionadosParametroFactuTransaccion) {
		this.jCheckBoxSeleccionadosParametroFactuTransaccion = jCheckBoxSeleccionadosParametroFactuTransaccion;
	}
	
	public void setBorderResaltarSeleccionadosParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesParametroFactuTransaccion() {
		return this.jComboBoxTiposArchivosReportesParametroFactuTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesParametroFactuTransaccion(
			JComboBox jComboBoxTiposArchivosReportesParametroFactuTransaccion) {
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion = jComboBoxTiposArchivosReportesParametroFactuTransaccion;
	}

	public void setBorderResaltarTiposArchivosReportesParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesParametroFactuTransaccion() {
		return this.jComboBoxTiposReportesParametroFactuTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesParametroFactuTransaccion(
			JComboBox jComboBoxTiposReportesParametroFactuTransaccion) {
		this.jComboBoxTiposReportesParametroFactuTransaccion = jComboBoxTiposReportesParametroFactuTransaccion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoParametroFactuTransaccion() {
	//	return jComboBoxTiposReportesDinamicoParametroFactuTransaccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoParametroFactuTransaccion(
	//		JComboBox jComboBoxTiposReportesDinamicoParametroFactuTransaccion) {
	//	this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion = jComboBoxTiposReportesDinamicoParametroFactuTransaccion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion() {
	//	return jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion = jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion;
	//}
	
	public void setBorderResaltarTiposReportesParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesParametroFactuTransaccion() {
		return this.jComboBoxTiposGraficosReportesParametroFactuTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesParametroFactuTransaccion(
			JComboBox jComboBoxTiposGraficosReportesParametroFactuTransaccion) {
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion = jComboBoxTiposGraficosReportesParametroFactuTransaccion;
	}
	
	public void setBorderResaltarTiposGraficosReportesParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionParametroFactuTransaccion() {
		return this.jComboBoxTiposPaginacionParametroFactuTransaccion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionParametroFactuTransaccion(
			JComboBox jComboBoxTiposPaginacionParametroFactuTransaccion) {
		this.jComboBoxTiposPaginacionParametroFactuTransaccion = jComboBoxTiposPaginacionParametroFactuTransaccion;
	}
	
	public void setBorderResaltarTiposPaginacionParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesParametroFactuTransaccion() {
		return this.jComboBoxTiposRelacionesParametroFactuTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuTransaccion() {
		return this.jComboBoxTiposAccionesParametroFactuTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuTransaccion(
			JComboBox jComboBoxTiposRelacionesParametroFactuTransaccion) {
		this.jComboBoxTiposRelacionesParametroFactuTransaccion = jComboBoxTiposRelacionesParametroFactuTransaccion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuTransaccion(
			JComboBox jComboBoxTiposAccionesParametroFactuTransaccion) {
		this.jComboBoxTiposAccionesParametroFactuTransaccion = jComboBoxTiposAccionesParametroFactuTransaccion;
	}
	
	public void setBorderResaltarTiposRelacionesParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesParametroFactuTransaccion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesParametroFactuTransaccion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoParametroFactuTransaccion() {
	//	return jCheckBoxConGraficoDinamicoParametroFactuTransaccion;
	//}

	//public void setjCheckBoxConGraficoDinamicoParametroFactuTransaccion(
	//		JCheckBox jCheckBoxConGraficoDinamicoParametroFactuTransaccion) {
	//	this.jCheckBoxConGraficoDinamicoParametroFactuTransaccion = jCheckBoxConGraficoDinamicoParametroFactuTransaccion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoParametroFactuTransaccion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarParametroFactuTransaccion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoParametroFactuTransaccion .setBorder(borderResaltar);		
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
		this.parametrofactutransaccionSessionBean=new ParametroFactuTransaccionSessionBean();
		
		this.parametrofactutransaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactutransaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuTransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuTransaccionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Transaccion  MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
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
		
		ParametroFactuTransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ParametroFactuTransaccion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarParametroFactuTransaccion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"nuevo","nuevo","Nuevo"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"duplicar","duplicar","Duplicar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"copiar","copiar","Copiar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"ver_form","ver_form","Ver"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"recargar","recargar","Recargar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarParametroFactuTransaccion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarParametroFactuTransaccion,this.jTtoolBarParametroFactuTransaccion,
							"cerrar","cerrar","Salir"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarParametroFactuTransaccion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarParametroFactuTransaccion;
			
				this.jButtonProcesarInformacionToolBarParametroFactuTransaccion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarParametroFactuTransaccion;
				
		//protected JButton jButtonModificarToolBarParametroFactuTransaccion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarParametroFactuTransaccion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuParametroFactuTransaccion=new JMenuMe("General");
		this.jmenuArchivoParametroFactuTransaccion=new JMenuMe("Archivo");
		this.jmenuAccionesParametroFactuTransaccion=new JMenuMe("Acciones");
		this.jmenuDatosParametroFactuTransaccion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuTransaccion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuTransaccion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuTransaccion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarParametroFactuTransaccion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarParametroFactuTransaccion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarParametroFactuTransaccion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesParametroFactuTransaccion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesParametroFactuTransaccion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesParametroFactuTransaccion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosParametroFactuTransaccion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuTransaccion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuTransaccion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarParametroFactuTransaccion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarParametroFactuTransaccion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarParametroFactuTransaccion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormParametroFactuTransaccion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormParametroFactuTransaccion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormParametroFactuTransaccion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaParametroFactuTransaccion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaParametroFactuTransaccion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaParametroFactuTransaccion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuTransaccion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuTransaccion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuTransaccion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionParametroFactuTransaccion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionParametroFactuTransaccion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionParametroFactuTransaccion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionParametroFactuTransaccion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionParametroFactuTransaccion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionParametroFactuTransaccion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresParametroFactuTransaccion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresParametroFactuTransaccion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresParametroFactuTransaccion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesParametroFactuTransaccion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesParametroFactuTransaccion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesParametroFactuTransaccion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByParametroFactuTransaccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByParametroFactuTransaccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByParametroFactuTransaccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByParametroFactuTransaccion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByParametroFactuTransaccion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByParametroFactuTransaccion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosParametroFactuTransaccion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosParametroFactuTransaccion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosParametroFactuTransaccion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoParametroFactuTransaccion.add(this.jMenuItemCerrarParametroFactuTransaccion);
			
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemNuevoParametroFactuTransaccion);
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemNuevoGuardarCambiosParametroFactuTransaccion);
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemNuevoRelacionesParametroFactuTransaccion);
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemGuardarCambiosTablaParametroFactuTransaccion);		
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemDuplicarParametroFactuTransaccion);		
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemCopiarParametroFactuTransaccion);		
			this.jmenuAccionesParametroFactuTransaccion.add(this.jMenuItemVerFormParametroFactuTransaccion);		
			
			this.jmenuDatosParametroFactuTransaccion.add(this.jMenuItemRecargarInformacionParametroFactuTransaccion);				
			this.jmenuDatosParametroFactuTransaccion.add(this.jMenuItemAnterioresParametroFactuTransaccion);				
			this.jmenuDatosParametroFactuTransaccion.add(this.jMenuItemSiguientesParametroFactuTransaccion);				
			this.jmenuDatosParametroFactuTransaccion.add(this.jMenuItemAbrirOrderByParametroFactuTransaccion);				
			this.jmenuDatosParametroFactuTransaccion.add(this.jMenuItemMostrarOcultarParametroFactuTransaccion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesParametroFactuTransaccion.add(this.jMenuItemGuardarCambiosParametroFactuTransaccion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarParametroFactuTransaccion.add(this.jmenuArchivoParametroFactuTransaccion);		
			this.jmenuBarParametroFactuTransaccion.add(this.jmenuAccionesParametroFactuTransaccion);		
			this.jmenuBarParametroFactuTransaccion.add(this.jmenuDatosParametroFactuTransaccion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarParametroFactuTransaccion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasParametroFactuTransaccion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion ");
		this.jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion,"buscar_button","Buscar Por Facturacion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setText("Facturacion :");
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setToolTipText("Facturacion");
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_facturaFK_IdTransaccionCuentaCoFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito ");
		this.jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion,"buscar_button","Buscar Por Nota De Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setText("Nota De Credito :");
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setToolTipText("Nota De Credito");
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_nota_creditoFK_IdTransaccionCuentaCoNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Venta ");
		this.jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion,"buscar_button","Buscar Por Nota De Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setText("Nota De Venta :");
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setToolTipText("Nota De Venta");
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_nota_ventaFK_IdTransaccionCuentaCoNotaVentaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setToolTipText("Buscar Por Tarjeta De Credito ");
		this.jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setToolTipText("Buscar Por Tarjeta De Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion,"buscar_button","Buscar Por Tarjeta De Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setText("Tarjeta De Credito :");
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setToolTipText("Tarjeta De Credito");
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_co_tarjetaFK_IdTransaccionCuentaCoTarjetaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion_ ");
		this.jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion_ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion,"buscar_button","Buscar Por Facturacion_ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setText("Facturacion_ :");
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setToolTipText("Facturacion_");
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_pa_facturaFK_IdTransaccionCuentaPaFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito_ ");
		this.jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito_ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion,"buscar_button","Buscar Por Nota De Credito_ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setText("Nota De Credito_ :");
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setToolTipText("Nota De Credito_");
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_pa_nota_creditoFK_IdTransaccionCuentaPaNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionInvenFacturaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion. ");
		this.jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setToolTipText("Buscar Por Facturacion. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion,"buscar_button","Buscar Por Facturacion. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionInvenFacturaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setText("Facturacion. :");
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setToolTipText("Facturacion.");
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_facturaFK_IdTransaccionInvenFacturaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito. ");
		this.jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Credito. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion,"buscar_button","Buscar Por Nota De Credito. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setText("Nota De Credito. :");
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setToolTipText("Nota De Credito.");
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_nota_creditoFK_IdTransaccionInvenNotaCreditoParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Venta. ");
		this.jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion= new JButtonMe();
		this.jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setText("Buscar");
		this.jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setToolTipText("Buscar Por Nota De Venta. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion,"buscar_button","Buscar Por Nota De Venta. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion = new JLabelMe();
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setText("Nota De Venta. :");
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setToolTipText("Nota De Venta.");
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion= new JComboBoxMe();
		jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_inven_nota_ventaFK_IdTransaccionInvenNotaVentaParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasParametroFactuTransaccion=new JTabbedPane();


		this.jTabbedPaneBusquedasParametroFactuTransaccion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactuTransaccion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasParametroFactuTransaccion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasParametroFactuTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleParametroFactuTransaccion = new ParametroFactuTransaccionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Parametro Transaccion  DATOS");
			this.jInternalFrameDetalleFormParametroFactuTransaccion = new ParametroFactuTransaccionDetalleFormJInternalFrame(jDesktopPane,this.parametrofactutransaccionSessionBean.getConGuardarRelaciones(),this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormParametroFactuTransaccion = null;//new ParametroFactuTransaccionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuTransaccion= new GridBagLayout();
		
		
		this.jTableDatosParametroFactuTransaccion = new JTableMe();      
		
		String sToolTipParametroFactuTransaccion="";
		sToolTipParametroFactuTransaccion=ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuTransaccion+="(Facturacion.ParametroFactuTransaccion)";
		}
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuTransaccion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosParametroFactuTransaccion.setToolTipText(sToolTipParametroFactuTransaccion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosParametroFactuTransaccion);
		this.jTableDatosParametroFactuTransaccion.setAutoCreateRowSorter(true);
		this.jTableDatosParametroFactuTransaccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosParametroFactuTransaccion.setRowSelectionAllowed(true);
		this.jTableDatosParametroFactuTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosParametroFactuTransaccion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoParametroFactuTransaccion = new JButtonMe();
		this.jButtonDuplicarParametroFactuTransaccion = new JButtonMe();
		this.jButtonCopiarParametroFactuTransaccion = new JButtonMe();
		this.jButtonVerFormParametroFactuTransaccion = new JButtonMe();
		this.jButtonNuevoRelacionesParametroFactuTransaccion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion = new JButtonMe();
		this.jButtonCerrarParametroFactuTransaccion = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuTransaccion = new JScrollPane();   
        this.jScrollPanelDatosGeneralParametroFactuTransaccion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioinventarioParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Parametro Transaccion ";
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuTransaccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuTransaccion.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuTransaccion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Inventario"));
		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setName("jPanelCamposFininventarioParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioinventarioParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Cobrar"));
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setName("jPanelCamposFincuentas_por_cobrarParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Por Pagar"));
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setName("jPanelCamposFincuentas_por_pagarParametroFactuTransaccion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoParametroFactuTransaccion=new ReporteDinamicoJInternalFrame(ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoParametroFactuTransaccion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionParametroFactuTransaccion=new ImportacionJInternalFrame(ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionParametroFactuTransaccion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByParametroFactuTransaccion = new JButtonMe();
		
		this.jButtonAbrirOrderByParametroFactuTransaccion.setText("Orden");
		this.jButtonAbrirOrderByParametroFactuTransaccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuTransaccion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuTransaccion,false,this);
			
			//this.cargarOrderByParametroFactuTransaccion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByParametroFactuTransaccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFactuTransaccion,true,this);
			
			//this.cargarOrderByParametroFactuTransaccion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosParametroFactuTransaccion.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroFactuTransaccion.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosParametroFactuTransaccion.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosParametroFactuTransaccion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuTransaccion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosParametroFactuTransaccion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoParametroFactuTransaccion.setText("Nuevo");
		this.jButtonDuplicarParametroFactuTransaccion.setText("Duplicar");
		this.jButtonCopiarParametroFactuTransaccion.setText("Copiar");
		this.jButtonVerFormParametroFactuTransaccion.setText("Ver");
		this.jButtonNuevoRelacionesParametroFactuTransaccion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.setText("Guardar");
		this.jButtonCerrarParametroFactuTransaccion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuTransaccion,"nuevo_button","Nuevo",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarParametroFactuTransaccion,"duplicar_button","Duplicar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarParametroFactuTransaccion,"copiar_button","Copiar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormParametroFactuTransaccion,"ver_form","Ver",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesParametroFactuTransaccion,"nuevorelaciones_button","Nuevo Rel",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuTransaccion,"guardarcambiostabla_button","Guardar",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuTransaccion,"cerrar_button","Salir",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoParametroFactuTransaccion.setToolTipText("Nuevo"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarParametroFactuTransaccion.setToolTipText("Duplicar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarParametroFactuTransaccion.setToolTipText("Copiar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormParametroFactuTransaccion.setToolTipText("Ver"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesParametroFactuTransaccion.setToolTipText("Nuevo Rel"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.setToolTipText("Guardar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuTransaccion.setToolTipText("Salir"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuTransaccion";
		inputMap = this.jButtonNuevoParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuTransaccion"));
		
		//DUPLICAR
		sMapKey = "DuplicarParametroFactuTransaccion";
		inputMap = this.jButtonDuplicarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarParametroFactuTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarParametroFactuTransaccion"));
		
		//COPIAR
		sMapKey = "CopiarParametroFactuTransaccion";
		inputMap = this.jButtonCopiarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarParametroFactuTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarParametroFactuTransaccion"));
		
		//VEr FORM
		sMapKey = "VerFormParametroFactuTransaccion";
		inputMap = this.jButtonVerFormParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormParametroFactuTransaccion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormParametroFactuTransaccion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesParametroFactuTransaccion";
		inputMap = this.jButtonNuevoRelacionesParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesParametroFactuTransaccion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarParametroFactuTransaccion";
		inputMap = this.jButtonModificarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarParametroFactuTransaccion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuTransaccion";
		inputMap = this.jButtonCerrarParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuTransaccion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuTransaccion";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuTransaccion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesParametroFactuTransaccion.setName("jPanelParametrosReportesParametroFactuTransaccion"); 
		
		this.jPanelParametrosReportesAccionesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesParametroFactuTransaccion.setName("jPanelParametrosReportesAccionesParametroFactuTransaccion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionParametroFactuTransaccion = new JButtonMe();
		this.jButtonRecargarInformacionParametroFactuTransaccion.setText("Recargar");
		this.jButtonRecargarInformacionParametroFactuTransaccion.setToolTipText("Recargar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionParametroFactuTransaccion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionParametroFactuTransaccion = new JButtonMe();
		this.jButtonProcesarInformacionParametroFactuTransaccion.setText("Procesar");
		this.jButtonProcesarInformacionParametroFactuTransaccion.setToolTipText("Procesar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionParametroFactuTransaccion.setVisible(false);
			
		this.jButtonProcesarInformacionParametroFactuTransaccion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuTransaccion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionParametroFactuTransaccion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setText("TIPO");       
		this.jComboBoxTiposReportesParametroFactuTransaccion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionParametroFactuTransaccion.setText("Paginacion");
		this.jComboBoxTiposPaginacionParametroFactuTransaccion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesParametroFactuTransaccion.setText("Accion");
		this.jComboBoxTiposRelacionesParametroFactuTransaccion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuTransaccion.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarParametroFactuTransaccion.setText("Accion");
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralParametroFactuTransaccion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesParametroFactuTransaccion = new JLabelMe();
		
		this.jLabelAccionesParametroFactuTransaccion.setText("Acciones");		
		this.jLabelAccionesParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosParametroFactuTransaccion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosParametroFactuTransaccion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosParametroFactuTransaccion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion.setText("Graf.");
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresParametroFactuTransaccion = new JButtonMe();
		//this.jButtonAnterioresParametroFactuTransaccion.setText("<<");
        this.jButtonAnterioresParametroFactuTransaccion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresParametroFactuTransaccion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesParametroFactuTransaccion = new JButtonMe();
		//this.jButtonSiguientesParametroFactuTransaccion.setText(">>");
        this.jButtonSiguientesParametroFactuTransaccion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesParametroFactuTransaccion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosParametroFactuTransaccion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosParametroFactuTransaccion.setText("Nue");
        this.jButtonNuevoGuardarCambiosParametroFactuTransaccion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosParametroFactuTransaccion,"nuevoguardarcambios_button","Nue",this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosParametroFactuTransaccion";
		inputMap = this.jButtonNuevoGuardarCambiosParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosParametroFactuTransaccion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionParametroFactuTransaccion";
		inputMap = this.jButtonRecargarInformacionParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionParametroFactuTransaccion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesParametroFactuTransaccion";
		inputMap = this.jButtonSiguientesParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesParametroFactuTransaccion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresParametroFactuTransaccion";
		inputMap = this.jButtonAnterioresParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresParametroFactuTransaccion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasParametroFactuTransaccion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesParametroFactuTransaccion.setMinimumSize(new Dimension(this.getWidth(),ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuTransaccion.setMaximumSize(new Dimension(this.getWidth(),ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesParametroFactuTransaccion.setPreferredSize(new Dimension(this.getWidth(),ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ParametroFactuTransaccionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionParametroFactuTransaccion = new GridBagLayout();

			this.jPanelPaginacionParametroFactuTransaccion.setLayout(gridaBagLayoutPaginacionParametroFactuTransaccion);						
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonAnterioresParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					
						
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
			
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonNuevoGuardarCambiosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
						
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonSiguientesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonNuevoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
						
			
			
			if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
				this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonGuardarCambiosTablaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			}
			
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonDuplicarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonCopiarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonVerFormParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 1;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionParametroFactuTransaccion.add(this.jButtonCerrarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
		
		
		this.jButtonRecargarInformacionParametroFactuTransaccion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuTransaccion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionParametroFactuTransaccion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesParametroFactuTransaccion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesParametroFactuTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesParametroFactuTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesParametroFactuTransaccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionParametroFactuTransaccion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuTransaccion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionParametroFactuTransaccion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesParametroFactuTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesParametroFactuTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarParametroFactuTransaccion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteParametroFactuTransaccion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosParametroFactuTransaccion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuTransaccion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosParametroFactuTransaccion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosParametroFactuTransaccion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuTransaccion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosParametroFactuTransaccion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesParametroFactuTransaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesParametroFactuTransaccion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ParametroFactuTransaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ParametroFactuTransaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ParametroFactuTransaccion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ParametroFactuTransaccion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesParametroFactuTransaccion.setLayout(gridaBagParametrosReportesParametroFactuTransaccion);
			this.jPanelParametrosReportesAccionesParametroFactuTransaccion.setLayout(gridaBagParametrosReportesAccionesParametroFactuTransaccion);
			
			
			this.jPanelParametrosAuxiliar1ParametroFactuTransaccion.setLayout(gridaBagParametrosAuxiliar1ParametroFactuTransaccion);
			this.jPanelParametrosAuxiliar2ParametroFactuTransaccion.setLayout(gridaBagParametrosAuxiliar2ParametroFactuTransaccion);
			this.jPanelParametrosAuxiliar3ParametroFactuTransaccion.setLayout(gridaBagParametrosAuxiliar3ParametroFactuTransaccion);
			this.jPanelParametrosAuxiliar4ParametroFactuTransaccion.setLayout(gridaBagParametrosAuxiliar4ParametroFactuTransaccion);
			//this.jPanelParametrosAuxiliar5ParametroFactuTransaccion.setLayout(gridaBagParametrosAuxiliar2ParametroFactuTransaccion);			
			
			
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jButtonRecargarInformacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuTransaccion.add(this.jComboBoxTiposPaginacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuTransaccion.add(this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ParametroFactuTransaccion.add(this.jComboBoxTiposArchivosReportesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jPanelParametrosAuxiliar1ParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ParametroFactuTransaccion.add(this.jComboBoxTiposReportesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jPanelParametrosAuxiliar4ParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jComboBoxTiposReportesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jCheckBoxGenerarReporteParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jPanelParametrosAuxiliar2ParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jLabelAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jButtonAbrirOrderByParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jComboBoxTiposSeleccionarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			
			
			/*
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jCheckBoxSeleccionarTodosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuTransaccion.add(this.jCheckBoxSeleccionarTodosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);															
				
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ParametroFactuTransaccion.add(this.jCheckBoxSeleccionadosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jPanelParametrosAuxiliar3ParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jComboBoxTiposAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
	
				
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesParametroFactuTransaccion.add(this.jTextFieldValorCampoGeneralParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposInicioinventarioParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposInicioinventarioParametroFactuTransaccion.setLayout(gridaBagLayoutCamposInicioinventarioParametroFactuTransaccion);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_cobrarParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_cobrarParametroFactuTransaccion.setLayout(gridaBagLayoutCamposIniciocuentas_por_cobrarParametroFactuTransaccion);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_por_pagarParametroFactuTransaccion= new GridBagLayout();
		this.jPanelCamposIniciocuentas_por_pagarParametroFactuTransaccion.setLayout(gridaBagLayoutCamposIniciocuentas_por_pagarParametroFactuTransaccion);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosParametroFactuTransaccion = new GridBagLayout();

			this.jScrollPanelDatosParametroFactuTransaccion.setLayout(gridaBagLayoutDatosParametroFactuTransaccion);
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
			
			this.jScrollPanelDatosParametroFactuTransaccion.add(this.jTableDatosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosParametroFactuTransaccion.setViewportView(this.jTableDatosParametroFactuTransaccion);
		this.jTableDatosParametroFactuTransaccion.setFillsViewportHeight(true);
		this.jTableDatosParametroFactuTransaccion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuTransaccion= new GridBagLayout();
		this.jPanelAccionesParametroFactuTransaccion.setLayout(gridaBagLayoutAccionesParametroFactuTransaccion);
		
		
		/*	
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = 0;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
			
		this.jPanelAccionesParametroFactuTransaccion.add(this.jButtonNuevoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuTransaccion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuTransaccion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;		
			//this.gridBagConstraintsParametroFactuTransaccion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuTransaccion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;		
		//this.gridBagConstraintsParametroFactuTransaccion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsParametroFactuTransaccion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsParametroFactuTransaccion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);								
		
		
		/*
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		*/		
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuTransaccion.gridx =0;
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuTransaccion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
				
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ParametroFactuTransaccionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosParametroFactuTransaccion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuTransaccion = new GridBagLayout();
			this.jPanelBusquedasParametrosParametroFactuTransaccion.setLayout(gridaBagLayoutBusquedasParametrosParametroFactuTransaccion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralParametroFactuTransaccion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
			
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralParametroFactuTransaccion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoParametroFactuTransaccion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoParametroFactuTransaccion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoParametroFactuTransaccion.setName("jPanelReporteDinamicoParametroFactuTransaccion"); 
		
		this.jPanelReporteDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoParametroFactuTransaccion.setLayout(gridaBagLayoutReporteDinamicoParametroFactuTransaccion);
		
		
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuTransaccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setResizable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setClosable(true);
	    this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteParametroFactuTransaccion = new JLabelMe();

		this.jLabelColumnasSelectReporteParametroFactuTransaccion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jLabelColumnasSelectReporteParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteParametroFactuTransaccion = new JList<Reporte>();
		this.jListColumnasSelectReporteParametroFactuTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteParametroFactuTransaccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteParametroFactuTransaccion=new JScrollPane(this.jListColumnasSelectReporteParametroFactuTransaccion);
			
			this.jScrollColumnasSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jListColumnasSelectReporteParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jScrollColumnasSelectReporteParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteParametroFactuTransaccion = new JLabelMe();

		this.jLabelRelacionesSelectReporteParametroFactuTransaccion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteParametroFactuTransaccion = new JList<Reporte>();
		this.jListRelacionesSelectReporteParametroFactuTransaccion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteParametroFactuTransaccion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteParametroFactuTransaccion=new JScrollPane(this.jListRelacionesSelectReporteParametroFactuTransaccion);
			
			this.jScrollRelacionesSelectReporteParametroFactuTransaccion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuTransaccion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteParametroFactuTransaccion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoParametroFactuTransaccion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoParametroFactuTransaccion = new JComboBoxMe();
		this.jListColumnasValoresGraficoParametroFactuTransaccion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jLabelGenerarExcelReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion.setToolTipText("Generar EXCEL"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jButtonGenerarExcelReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jComboBoxTiposReportesDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jLabelTiposArchivoReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jComboBoxTiposArchivosReportesDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoParametroFactuTransaccion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoParametroFactuTransaccion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoParametroFactuTransaccion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoParametroFactuTransaccion.setToolTipText("Generar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jButtonGenerarReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoParametroFactuTransaccion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoParametroFactuTransaccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoParametroFactuTransaccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoParametroFactuTransaccion.setToolTipText("Cancelar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoParametroFactuTransaccion.add(this.jButtonCerrarReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalParametroFactuTransaccion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion= new JScrollPane(jPanelReporteDinamicoParametroFactuTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalParametroFactuTransaccion);
		this.jInternalFrameReporteDinamicoParametroFactuTransaccion.getContentPane().add(this.jScrollPanelReporteDinamicoParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionParametroFactuTransaccion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionParametroFactuTransaccion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionParametroFactuTransaccion.setName("jPanelImportacionParametroFactuTransaccion"); 
		
		this.jPanelImportacionParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionParametroFactuTransaccion.setLayout(gridaBagLayoutImportacionParametroFactuTransaccion);
		
		
		this.jInternalFrameImportacionParametroFactuTransaccion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionParametroFactuTransaccion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionParametroFactuTransaccion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteParametroFactuTransaccion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionParametroFactuTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuTransaccion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionParametroFactuTransaccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuTransaccion.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionParametroFactuTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionParametroFactuTransaccion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionParametroFactuTransaccion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionParametroFactuTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionParametroFactuTransaccion.setResizable(true);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setClosable(true);
	    this.jInternalFrameImportacionParametroFactuTransaccion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionParametroFactuTransaccion = new JLabelMe();

		this.jLabelArchivoImportacionParametroFactuTransaccion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuTransaccion.add(this.jLabelArchivoImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionParametroFactuTransaccion = new JFileChooser();		
		this.jFileChooserImportacionParametroFactuTransaccion.setToolTipText("ESCOGER ARCHIVO"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionParametroFactuTransaccion = new JButtonMe();
		this.jButtonAbrirImportacionParametroFactuTransaccion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionParametroFactuTransaccion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionParametroFactuTransaccion.setToolTipText("Generar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuTransaccion.add(this.jButtonAbrirImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionParametroFactuTransaccion = new JLabelMe();

		this.jLabelPathArchivoImportacionParametroFactuTransaccion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionParametroFactuTransaccion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuTransaccion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionParametroFactuTransaccion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;		
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionParametroFactuTransaccion.add(this.jLabelPathArchivoImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionParametroFactuTransaccion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionParametroFactuTransaccion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuTransaccion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionParametroFactuTransaccion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuTransaccion.add(this.jTextFieldPathArchivoImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionParametroFactuTransaccion = new JButtonMe();
		this.jButtonGenerarImportacionParametroFactuTransaccion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionParametroFactuTransaccion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionParametroFactuTransaccion.setToolTipText("Generar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuTransaccion.add(this.jButtonGenerarImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionParametroFactuTransaccion = new JButtonMe();
		this.jButtonCerrarImportacionParametroFactuTransaccion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionParametroFactuTransaccion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionParametroFactuTransaccion.setToolTipText("Cancelar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionParametroFactuTransaccion.add(this.jButtonCerrarImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalParametroFactuTransaccion = new GridBagLayout();
		
		this.jScrollPanelImportacionParametroFactuTransaccion= new JScrollPane(jPanelImportacionParametroFactuTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuTransaccion.gridy =iPosYImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXImportacion;
		this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionParametroFactuTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionParametroFactuTransaccion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalParametroFactuTransaccion);
		this.jInternalFrameImportacionParametroFactuTransaccion.getContentPane().add(this.jScrollPanelImportacionParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByParametroFactuTransaccion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByParametroFactuTransaccion = new JButtonMe();
			this.jButtonAbrirOrderByParametroFactuTransaccion.setText("Orden");
			this.jButtonAbrirOrderByParametroFactuTransaccion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByParametroFactuTransaccion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByParametroFactuTransaccion";
			inputMap = this.jButtonAbrirOrderByParametroFactuTransaccion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByParametroFactuTransaccion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByParametroFactuTransaccion"));
		
		
			GridBagLayout gridaBagLayoutOrderByParametroFactuTransaccion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByParametroFactuTransaccion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByParametroFactuTransaccion.setName("jPanelOrderByParametroFactuTransaccion"); 
			
			this.jPanelOrderByParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByParametroFactuTransaccion.setLayout(gridaBagLayoutOrderByParametroFactuTransaccion);
			
			
			this.jTableDatosParametroFactuTransaccionOrderBy = new JTableMe();        
			this.jTableDatosParametroFactuTransaccionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosParametroFactuTransaccionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosParametroFactuTransaccionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosParametroFactuTransaccionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosParametroFactuTransaccionOrderBy.setViewportView(this.jTableDatosParametroFactuTransaccionOrderBy);
			this.jTableDatosParametroFactuTransaccionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosParametroFactuTransaccionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByParametroFactuTransaccion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByParametroFactuTransaccion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByParametroFactuTransaccion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteParametroFactuTransaccion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByParametroFactuTransaccion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByParametroFactuTransaccion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByParametroFactuTransaccion.setTitle("Orden");
			this.jInternalFrameOrderByParametroFactuTransaccion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByParametroFactuTransaccion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByParametroFactuTransaccion.setResizable(true);
			this.jInternalFrameOrderByParametroFactuTransaccion.setClosable(true);
			this.jInternalFrameOrderByParametroFactuTransaccion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByParametroFactuTransaccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Transaccion s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsParametroFactuTransaccion.ipady =150;
				
			this.jPanelOrderByParametroFactuTransaccion.add(jScrollPanelDatosParametroFactuTransaccionOrderBy, this.gridBagConstraintsParametroFactuTransaccion);//this.jTableDatosParametroFactuTransaccionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByParametroFactuTransaccion = new JButtonMe();
			this.jButtonCerrarOrderByParametroFactuTransaccion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByParametroFactuTransaccion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByParametroFactuTransaccion.setToolTipText("Cancelar"+" "+ParametroFactuTransaccionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByParametroFactuTransaccion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuTransaccion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsParametroFactuTransaccion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByParametroFactuTransaccion.add(this.jButtonCerrarOrderByParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalParametroFactuTransaccion = new GridBagLayout();
			
			this.jScrollPanelOrderByParametroFactuTransaccion= new JScrollPane(jPanelOrderByParametroFactuTransaccion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsParametroFactuTransaccion = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuTransaccion.gridy =iPosYOrderBy;
			this.gridBagConstraintsParametroFactuTransaccion.gridx =iPosXOrderBy;
			this.gridBagConstraintsParametroFactuTransaccion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByParametroFactuTransaccion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByParametroFactuTransaccion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalParametroFactuTransaccion);
			
			this.jInternalFrameOrderByParametroFactuTransaccion.getContentPane().add(this.jScrollPanelOrderByParametroFactuTransaccion, this.gridBagConstraintsParametroFactuTransaccion);			
		
		} else {
			this.jButtonAbrirOrderByParametroFactuTransaccion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.parametrofactutransaccionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosParametroFactuTransaccion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosParametroFactuTransaccion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosParametroFactuTransaccion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosParametroFactuTransaccion.getRowHeight();//ParametroFactuTransaccionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.isSelected()) {
					iHeightTable=ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaParametroFactuTransaccion.isSelected()) {
					iHeightTable=ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ParametroFactuTransaccionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByParametroFactuTransaccion!=null && this.jInternalFrameOrderByParametroFactuTransaccion.getjTableDatosOrderBy()!=null) {
			//if(!this.parametrofactutransaccionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByParametroFactuTransaccion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByParametroFactuTransaccion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByParametroFactuTransaccion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByParametroFactuTransaccion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByParametroFactuTransaccion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByParametroFactuTransaccion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByParametroFactuTransaccion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosParametroFactuTransaccion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuTransaccion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosParametroFactuTransaccion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=parametrofactutransaccionLogic.getParametroFactuTransaccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofactutransaccions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ParametroFactuTransaccion> TraerParametroFactuTransaccionBeans(List<ParametroFactuTransaccion> parametrofactutransaccions,ArrayList<Classe> classes)throws Exception {
		try {
			for(ParametroFactuTransaccion parametrofactutransaccion:parametrofactutransaccions) {
					
				if(!(ParametroFactuTransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ParametroFactuTransaccionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					parametrofactutransaccion.setsDetalleGeneralEntityReporte(ParametroFactuTransaccionConstantesFunciones.getParametroFactuTransaccionDescripcion(parametrofactutransaccion));
										
						
					
						
					
				} else  {
							
					//parametrofactutransaccion.setsDetalleGeneralEntityReporte(parametrofactutransaccion.getsDetalleGeneralEntityReporte());
										
				}
				
				//parametrofactutransaccionbeans.add(parametrofactutransaccionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return parametrofactutransaccions;
    }
	//PARA REPORTES FIN
}
