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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.BodegaProductoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class BodegaProductoJInternalFrame extends BodegaProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarBodegaProducto;
	
	protected JMenuBar jmenuBarBodegaProducto;
	
	protected JMenu jmenuBodegaProducto;
	protected JMenu jmenuDatosBodegaProducto;
	protected JMenu jmenuArchivoBodegaProducto;
	protected JMenu jmenuAccionesBodegaProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBodegaProducto;	
	protected GridBagConstraints gridBagConstraintsBodegaProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public BodegaProductoDetalleFormJInternalFrame jInternalFrameDetalleFormBodegaProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoBodegaProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionBodegaProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EstadoBodegaProductoBeanSwingJInternalFrame estadobodegaproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadobodegaproducto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostoventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableproduccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableproduccion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingresodebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingresodebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableingresocreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableingresocredito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableresultadodebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableresultadodebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableresultadocreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableresultadocredito="";
	
	public BodegaProductoSessionBean bodegaproductoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EstadoBodegaProductoSessionBean estadobodegaproductoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoventaSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontableproduccionSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontableingresodebitoSessionBean;
	public CuentaContableSessionBean cuentacontableingresocreditoSessionBean;
	public CuentaContableSessionBean cuentacontableresultadodebitoSessionBean;
	public CuentaContableSessionBean cuentacontableresultadocreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<BodegaProducto> bodegaproductos;		
	public List<BodegaProducto> bodegaproductosEliminados;	
	public List<BodegaProducto> bodegaproductosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByBodegaProducto;		
	protected JButton jButtonAbrirOrderByBodegaProducto;
	
	
	//protected JPanel jPanelOrderByBodegaProducto;
	//public JScrollPane jScrollPanelOrderByBodegaProducto;	
	//protected JButton jButtonCerrarOrderByBodegaProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public BodegaProductoLogic bodegaproductoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosBodegaProducto;
	public JScrollPane jScrollPanelDatosEdicionBodegaProducto;
	public JScrollPane jScrollPanelDatosGeneralBodegaProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosBodegaProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoBodegaProducto;
	//public JScrollPane jScrollPanelImportacionBodegaProducto;
	
	
	
	protected JPanel jPanelAccionesBodegaProducto;
	
    protected JPanel jPanelPaginacionBodegaProducto;
    protected JPanel jPanelParametrosReportesBodegaProducto;
	protected JPanel jPanelParametrosReportesAccionesBodegaProducto;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralBodegaProducto;
	protected Integer iXPanelCamposIniciogeneralBodegaProducto=0;
	protected Integer iYPanelCamposIniciogeneralBodegaProducto=0;

	protected JPanel jPanelCamposIniciodatoBodegaProducto;
	protected Integer iXPanelCamposIniciodatoBodegaProducto=0;
	protected Integer iYPanelCamposIniciodatoBodegaProducto=0;

	protected JPanel jPanelCamposInicioestadisticaBodegaProducto;
	protected Integer iXPanelCamposInicioestadisticaBodegaProducto=0;
	protected Integer iYPanelCamposInicioestadisticaBodegaProducto=0;

	protected JPanel jPanelCamposIniciocuenta_contableBodegaProducto;
	protected Integer iXPanelCamposIniciocuenta_contableBodegaProducto=0;
	protected Integer iYPanelCamposIniciocuenta_contableBodegaProducto=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1BodegaProducto;
	protected JPanel jPanelParametrosAuxiliar2BodegaProducto;
	protected JPanel jPanelParametrosAuxiliar3BodegaProducto;
	protected JPanel jPanelParametrosAuxiliar4BodegaProducto;
	//protected JPanel jPanelParametrosAuxiliar5BodegaProducto;
	
	
	
	//protected JPanel jPanelReporteDinamicoBodegaProducto;
	//protected JPanel jPanelImportacionBodegaProducto;
	
	
	public JTable jTableDatosBodegaProducto;
	
	
	
	//public JTable jTableDatosBodegaProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoBodegaProducto;
	protected JButton jButtonDuplicarBodegaProducto;
	protected JButton jButtonCopiarBodegaProducto;
	protected JButton jButtonVerFormBodegaProducto;
	protected JButton jButtonNuevoRelacionesBodegaProducto;
	protected JButton jButtonModificarBodegaProducto;
	
    protected JButton jButtonGuardarCambiosTablaBodegaProducto;
	protected JButton jButtonCerrarBodegaProducto;
	
	
	protected JButton jButtonRecargarInformacionBodegaProducto;
	protected JButton jButtonProcesarInformacionBodegaProducto;
	
	
	protected JButton jButtonAnterioresBodegaProducto;
	protected JButton jButtonSiguientesBodegaProducto;
	protected JButton jButtonNuevoGuardarCambiosBodegaProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoBodegaProducto;
	//protected JButton jButtonCerrarReporteDinamicoBodegaProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoBodegaProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionBodegaProducto;
	//protected JButton jButtonGenerarImportacionBodegaProducto;
	//protected JButton jButtonCerrarImportacionBodegaProducto;
	//protected JFileChooser jFileChooserImportacionBodegaProducto;
	//protected File fileImportacionBodegaProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBodegaProducto;
	protected JButton jButtonDuplicarToolBarBodegaProducto;
	protected JButton jButtonNuevoRelacionesToolBarBodegaProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarBodegaProducto;
	protected JButton jButtonCopiarToolBarBodegaProducto;
	protected JButton jButtonVerFormToolBarBodegaProducto;
	public JButton jButtonGuardarCambiosTablaToolBarBodegaProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarBodegaProducto;
	protected JButton jButtonCerrarToolBarBodegaProducto;
	
	protected JButton jButtonRecargarInformacionToolBarBodegaProducto;
	protected JButton jButtonProcesarInformacionToolBarBodegaProducto;
	protected JButton jButtonAnterioresToolBarBodegaProducto;
	protected JButton jButtonSiguientesToolBarBodegaProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarBodegaProducto;
	protected JButton jButtonAbrirOrderByToolBarBodegaProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBodegaProducto;
	protected JMenuItem jMenuItemDuplicarBodegaProducto;
	protected JMenuItem jMenuItemNuevoRelacionesBodegaProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosBodegaProducto;
	protected JMenuItem jMenuItemCopiarBodegaProducto;
	protected JMenuItem jMenuItemVerFormBodegaProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaBodegaProducto;
	protected JMenuItem jMenuItemCerrarBodegaProducto;
	protected JMenuItem jMenuItemDetalleCerrarBodegaProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByBodegaProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarBodegaProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionBodegaProducto;
	protected JMenuItem jMenuItemProcesarInformacionBodegaProducto;
	protected JMenuItem jMenuItemAnterioresBodegaProducto;
	protected JMenuItem jMenuItemSiguientesBodegaProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBodegaProducto;
	protected JMenuItem jMenuItemAbrirOrderByBodegaProducto;
	protected JMenuItem jMenuItemMostrarOcultarBodegaProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBodegaProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosBodegaProducto;
	protected JCheckBox jCheckBoxSeleccionadosBodegaProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaBodegaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesBodegaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoBodegaProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoBodegaProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBodegaProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarBodegaProducto;
	protected JTextField jTextFieldValorCampoGeneralBodegaProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteBodegaProducto;
	//public JList<Reporte> jListColumnasSelectReporteBodegaProducto;
	//public JScrollPane jScrollColumnasSelectReporteBodegaProducto;
	
	//public JLabel jLabelRelacionesSelectReporteBodegaProducto;
	//public JList<Reporte> jListRelacionesSelectReporteBodegaProducto;
	//public JScrollPane jScrollRelacionesSelectReporteBodegaProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoBodegaProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoBodegaProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoBodegaProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoBodegaProducto;
	
		
	//public JLabel jLabelArchivoImportacionBodegaProducto;	
	//public JLabel jLabelPathArchivoImportacionBodegaProducto;
	//protected JTextField jTextFieldPathArchivoImportacionBodegaProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoBodegaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoBodegaProducto;
	
	//public JLabel jLabelColumnaCategoriaValorBodegaProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorBodegaProducto;
	
	//public JLabel jLabelColumnasValoresGraficoBodegaProducto;
	//public JList<Reporte> jListColumnasValoresGraficoBodegaProducto;
	//public JScrollPane jScrollColumnasValoresGraficoBodegaProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoBodegaProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoBodegaProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasBodegaProducto;
	public JPanel jPanelFK_IdBodegaBodegaProducto;
	public JButton jButtonFK_IdBodegaBodegaProducto;
	public JPanel jPanelFK_IdCentroCostoBodegaProducto;
	public JButton jButtonFK_IdCentroCostoBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableCostoVentaBodegaProducto;
	public JButton jButtonFK_IdCuentaContableCostoVentaBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto;
	public JButton jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto;
	public JButton jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableProduccionBodegaProducto;
	public JButton jButtonFK_IdCuentaContableProduccionBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto;
	public JButton jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto;
	public JButton jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto;
	public JPanel jPanelFK_IdCuentaContableVentaBodegaProducto;
	public JButton jButtonFK_IdCuentaContableVentaBodegaProducto;
	public JPanel jPanelFK_IdProductoBodegaProducto;
	public JButton jButtonFK_IdProductoBodegaProducto;
	public JPanel jPanelFK_IdUnidadBodegaProducto;
	public JButton jButtonFK_IdUnidadBodegaProducto;
	
	public JPanel jPanelid_bodegaFK_IdBodegaBodegaProducto;
	public JLabel jLabelid_bodegaFK_IdBodegaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaBodegaProducto;
	public JButton jButtonid_bodegaFK_IdBodegaBodegaProducto= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaBodegaProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoBodegaProducto;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto;
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaProducto= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto;
	public JLabel jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto;
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto;
	public JButton jButtonid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto;
	public JButton jButtonid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto;
	public JLabel jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto;
	public JButton jButtonid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto;
	public JButton jButtonid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto;
	public JLabel jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto;
	public JButton jButtonid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto;
	public JLabel jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto;
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoBodegaProducto;
	public JLabel jLabelid_productoFK_IdProductoBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoBodegaProducto;
	public JButton jButtonid_productoFK_IdProductoBodegaProducto= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoBodegaProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoBodegaProducto;
	
	public JPanel jPanelid_unidadFK_IdUnidadBodegaProducto;
	public JLabel jLabelid_unidadFK_IdUnidadBodegaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadBodegaProducto;
	public JButton jButtonid_unidadFK_IdUnidadBodegaProducto= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadBodegaProductoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadBodegaProductoBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1408;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public BodegaProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BodegaProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionBodegaProducto)	{
		this.jButtonRecargarInformacionBodegaProducto = jButtonRecargarInformacionBodegaProducto;
	}
	
	public JButton getjButtonProcesarInformacionBodegaProducto() {
		return this.jButtonProcesarInformacionBodegaProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBodegaProducto)	{
		this.jButtonProcesarInformacionBodegaProducto = jButtonProcesarInformacionBodegaProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionBodegaProducto() {
		return this.jButtonRecargarInformacionBodegaProducto;
	}
	
	
	public List<BodegaProducto> getbodegaproductos() {
		return this.bodegaproductos;
	}

	public void setbodegaproductos(List<BodegaProducto> bodegaproductos) {
		this.bodegaproductos = bodegaproductos;
	}
	
	public List<BodegaProducto> getbodegaproductosAux() {
		return this.bodegaproductosAux;
	}

	public void setbodegaproductosAux(List<BodegaProducto> bodegaproductosAux) {
		this.bodegaproductosAux = bodegaproductosAux;
	}
	
	public List<BodegaProducto> getbodegaproductosEliminados() {
		return this.bodegaproductosEliminados;
	}

	public void setBodegaProductosEliminados(List<BodegaProducto> bodegaproductosEliminados) {
		this.bodegaproductosEliminados = bodegaproductosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarBodegaProducto() {
		return jComboBoxTiposSeleccionarBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarBodegaProducto(
			JComboBox jComboBoxTiposSeleccionarBodegaProducto) {
		this.jComboBoxTiposSeleccionarBodegaProducto = jComboBoxTiposSeleccionarBodegaProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarBodegaProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralBodegaProducto() {
		return jTextFieldValorCampoGeneralBodegaProducto;
	}

	public void setjTextFieldValorCampoGeneralBodegaProducto(
			JTextField jTextFieldValorCampoGeneralBodegaProducto) {
		this.jTextFieldValorCampoGeneralBodegaProducto = jTextFieldValorCampoGeneralBodegaProducto;
	}

	public void setBorderResaltarValorCampoGeneralBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralBodegaProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosBodegaProducto() {
		return this.jCheckBoxSeleccionarTodosBodegaProducto;
	}

	public void setjCheckBoxSeleccionarTodosBodegaProducto(
			JCheckBox jCheckBoxSeleccionarTodosBodegaProducto) {
		this.jCheckBoxSeleccionarTodosBodegaProducto = jCheckBoxSeleccionarTodosBodegaProducto;
	}

	public void setBorderResaltarSeleccionarTodosBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosBodegaProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosBodegaProducto() {
		return this.jCheckBoxSeleccionadosBodegaProducto;
	}

	public void setjCheckBoxSeleccionadosBodegaProducto(
			JCheckBox jCheckBoxSeleccionadosBodegaProducto) {
		this.jCheckBoxSeleccionadosBodegaProducto = jCheckBoxSeleccionadosBodegaProducto;
	}
	
	public void setBorderResaltarSeleccionadosBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosBodegaProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesBodegaProducto() {
		return this.jComboBoxTiposArchivosReportesBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesBodegaProducto(
			JComboBox jComboBoxTiposArchivosReportesBodegaProducto) {
		this.jComboBoxTiposArchivosReportesBodegaProducto = jComboBoxTiposArchivosReportesBodegaProducto;
	}

	public void setBorderResaltarTiposArchivosReportesBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesBodegaProducto() {
		return this.jComboBoxTiposReportesBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesBodegaProducto(
			JComboBox jComboBoxTiposReportesBodegaProducto) {
		this.jComboBoxTiposReportesBodegaProducto = jComboBoxTiposReportesBodegaProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoBodegaProducto() {
	//	return jComboBoxTiposReportesDinamicoBodegaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoBodegaProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoBodegaProducto) {
	//	this.jComboBoxTiposReportesDinamicoBodegaProducto = jComboBoxTiposReportesDinamicoBodegaProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoBodegaProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoBodegaProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoBodegaProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoBodegaProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto = jComboBoxTiposArchivosReportesDinamicoBodegaProducto;
	//}
	
	public void setBorderResaltarTiposReportesBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesBodegaProducto() {
		return this.jComboBoxTiposGraficosReportesBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesBodegaProducto(
			JComboBox jComboBoxTiposGraficosReportesBodegaProducto) {
		this.jComboBoxTiposGraficosReportesBodegaProducto = jComboBoxTiposGraficosReportesBodegaProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionBodegaProducto() {
		return this.jComboBoxTiposPaginacionBodegaProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionBodegaProducto(
			JComboBox jComboBoxTiposPaginacionBodegaProducto) {
		this.jComboBoxTiposPaginacionBodegaProducto = jComboBoxTiposPaginacionBodegaProducto;
	}
	
	public void setBorderResaltarTiposPaginacionBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionBodegaProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesBodegaProducto() {
		return this.jComboBoxTiposRelacionesBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBodegaProducto() {
		return this.jComboBoxTiposAccionesBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBodegaProducto(
			JComboBox jComboBoxTiposRelacionesBodegaProducto) {
		this.jComboBoxTiposRelacionesBodegaProducto = jComboBoxTiposRelacionesBodegaProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBodegaProducto(
			JComboBox jComboBoxTiposAccionesBodegaProducto) {
		this.jComboBoxTiposAccionesBodegaProducto = jComboBoxTiposAccionesBodegaProducto;
	}
	
	public void setBorderResaltarTiposRelacionesBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesBodegaProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesBodegaProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesBodegaProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoBodegaProducto() {
	//	return jCheckBoxConGraficoDinamicoBodegaProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoBodegaProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoBodegaProducto) {
	//	this.jCheckBoxConGraficoDinamicoBodegaProducto = jCheckBoxConGraficoDinamicoBodegaProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoBodegaProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarBodegaProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoBodegaProducto .setBorder(borderResaltar);		
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
		this.bodegaproductoSessionBean=new BodegaProductoSessionBean();
		
		this.bodegaproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegaproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bodegaproductoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BodegaProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BodegaProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bodega Producto MANTENIMIENTO"));
		
		
		if(iWidth > 5850) {
			iWidth=5850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
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
		
		BodegaProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("BodegaProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarBodegaProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"nuevo","nuevo","Nuevo"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"duplicar","duplicar","Duplicar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"copiar","copiar","Copiar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"ver_form","ver_form","Ver"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"recargar","recargar","Recargar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarBodegaProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarBodegaProducto,this.jTtoolBarBodegaProducto,
							"cerrar","cerrar","Salir"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarBodegaProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarBodegaProducto;
			
				this.jButtonProcesarInformacionToolBarBodegaProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarBodegaProducto;
				
		//protected JButton jButtonModificarToolBarBodegaProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarBodegaProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuBodegaProducto=new JMenuMe("General");
		this.jmenuArchivoBodegaProducto=new JMenuMe("Archivo");
		this.jmenuAccionesBodegaProducto=new JMenuMe("Acciones");
		this.jmenuDatosBodegaProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBodegaProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBodegaProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBodegaProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarBodegaProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarBodegaProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarBodegaProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesBodegaProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesBodegaProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesBodegaProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosBodegaProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBodegaProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBodegaProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarBodegaProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarBodegaProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarBodegaProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormBodegaProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormBodegaProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormBodegaProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaBodegaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaBodegaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaBodegaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBodegaProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBodegaProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBodegaProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionBodegaProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionBodegaProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionBodegaProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionBodegaProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionBodegaProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionBodegaProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresBodegaProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresBodegaProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresBodegaProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesBodegaProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesBodegaProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesBodegaProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByBodegaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByBodegaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByBodegaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByBodegaProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByBodegaProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByBodegaProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBodegaProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBodegaProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBodegaProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosBodegaProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosBodegaProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosBodegaProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoBodegaProducto.add(this.jMenuItemCerrarBodegaProducto);
			
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemNuevoBodegaProducto);
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemNuevoGuardarCambiosBodegaProducto);
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemNuevoRelacionesBodegaProducto);
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemGuardarCambiosTablaBodegaProducto);		
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemDuplicarBodegaProducto);		
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemCopiarBodegaProducto);		
			this.jmenuAccionesBodegaProducto.add(this.jMenuItemVerFormBodegaProducto);		
			
			this.jmenuDatosBodegaProducto.add(this.jMenuItemRecargarInformacionBodegaProducto);				
			this.jmenuDatosBodegaProducto.add(this.jMenuItemAnterioresBodegaProducto);				
			this.jmenuDatosBodegaProducto.add(this.jMenuItemSiguientesBodegaProducto);				
			this.jmenuDatosBodegaProducto.add(this.jMenuItemAbrirOrderByBodegaProducto);				
			this.jmenuDatosBodegaProducto.add(this.jMenuItemMostrarOcultarBodegaProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesBodegaProducto.add(this.jMenuItemGuardarCambiosBodegaProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarBodegaProducto.add(this.jmenuArchivoBodegaProducto);		
			this.jmenuBarBodegaProducto.add(this.jmenuAccionesBodegaProducto);		
			this.jmenuBarBodegaProducto.add(this.jmenuDatosBodegaProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarBodegaProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasBodegaProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaBodegaProducto.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaBodegaProducto= new JButtonMe();
		this.jButtonFK_IdBodegaBodegaProducto.setText("Buscar");
		this.jButtonFK_IdBodegaBodegaProducto.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaBodegaProducto,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaBodegaProducto = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaBodegaProducto.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaBodegaProducto.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaBodegaProducto= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoBodegaProducto.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCentroCostoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCentroCostoBodegaProducto.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoBodegaProducto,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCostoVentaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoVentaBodegaProducto.setToolTipText("Buscar Por Cuenta C. Costo Venta ");
		this.jButtonFK_IdCuentaContableCostoVentaBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoVentaBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoVentaBodegaProducto.setToolTipText("Buscar Por Cuenta C. Costo Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoVentaBodegaProducto,"buscar_button","Buscar Por Cuenta C. Costo Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoVentaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setText("Cuenta C. Costo Venta :");
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setToolTipText("Cuenta C. Costo Venta");
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Ingreso Credito ");
		this.jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Ingreso Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto,"buscar_button","Buscar Por Cuenta C. Ingreso Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setText("Cuenta C. Ingreso Credito :");
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setToolTipText("Cuenta C. Ingreso Credito");
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Ingreso Debito ");
		this.jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Ingreso Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto,"buscar_button","Buscar Por Cuenta C. Ingreso Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setText("Cuenta C. Ingreso Debito :");
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setToolTipText("Cuenta C. Ingreso Debito");
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableProduccionBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableProduccionBodegaProducto.setToolTipText("Buscar Por Cuenta C. Produccion ");
		this.jButtonFK_IdCuentaContableProduccionBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableProduccionBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableProduccionBodegaProducto.setToolTipText("Buscar Por Cuenta C. Produccion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableProduccionBodegaProducto,"buscar_button","Buscar Por Cuenta C. Produccion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableProduccionBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setText("Cuenta C. Produccion :");
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setToolTipText("Cuenta C. Produccion");
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Resultado Credito ");
		this.jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Resultado Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto,"buscar_button","Buscar Por Cuenta C. Resultado Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setText("Cuenta C. Resultado Credito :");
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setToolTipText("Cuenta C. Resultado Credito");
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Resultado Debito ");
		this.jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto.setToolTipText("Buscar Por Cuenta C. Resultado Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto,"buscar_button","Buscar Por Cuenta C. Resultado Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setText("Cuenta C. Resultado Debito :");
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setToolTipText("Cuenta C. Resultado Debito");
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableVentaBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableVentaBodegaProducto.setToolTipText("Buscar Por Cuenta C. Venta ");
		this.jButtonFK_IdCuentaContableVentaBodegaProducto= new JButtonMe();
		this.jButtonFK_IdCuentaContableVentaBodegaProducto.setText("Buscar");
		this.jButtonFK_IdCuentaContableVentaBodegaProducto.setToolTipText("Buscar Por Cuenta C. Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableVentaBodegaProducto,"buscar_button","Buscar Por Cuenta C. Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableVentaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto = new JLabelMe();
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setText("Cuenta C. Venta :");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setToolTipText("Cuenta C. Venta");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoBodegaProducto.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoBodegaProducto= new JButtonMe();
		this.jButtonFK_IdProductoBodegaProducto.setText("Buscar");
		this.jButtonFK_IdProductoBodegaProducto.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoBodegaProducto,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoBodegaProducto = new JLabelMe();
		jLabelid_productoFK_IdProductoBodegaProducto.setText("Producto :");
		jLabelid_productoFK_IdProductoBodegaProducto.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoBodegaProducto= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoBodegaProducto.setFocusable(false);

		this.jPanelFK_IdUnidadBodegaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadBodegaProducto.setToolTipText("Buscar Por Unidad ");
		this.jButtonFK_IdUnidadBodegaProducto= new JButtonMe();
		this.jButtonFK_IdUnidadBodegaProducto.setText("Buscar");
		this.jButtonFK_IdUnidadBodegaProducto.setToolTipText("Buscar Por Unidad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadBodegaProducto,"buscar_button","Buscar Por Unidad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadBodegaProducto = new JLabelMe();
		jLabelid_unidadFK_IdUnidadBodegaProducto.setText("Unidad :");
		jLabelid_unidadFK_IdUnidadBodegaProducto.setToolTipText("Unidad");
		jLabelid_unidadFK_IdUnidadBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadBodegaProducto= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasBodegaProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasBodegaProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasBodegaProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasBodegaProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasBodegaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleBodegaProducto = new BodegaProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Bodega Producto DATOS");
			this.jInternalFrameDetalleFormBodegaProducto = new BodegaProductoDetalleFormJInternalFrame(jDesktopPane,this.bodegaproductoSessionBean.getConGuardarRelaciones(),this.bodegaproductoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormBodegaProducto = null;//new BodegaProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBodegaProducto= new GridBagLayout();
		
		
		this.jTableDatosBodegaProducto = new JTableMe();      
		
		String sToolTipBodegaProducto="";
		sToolTipBodegaProducto=BodegaProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBodegaProducto+="(Inventario.BodegaProducto)";
		}
		
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipBodegaProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosBodegaProducto.setToolTipText(sToolTipBodegaProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosBodegaProducto);
		this.jTableDatosBodegaProducto.setAutoCreateRowSorter(true);
		this.jTableDatosBodegaProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosBodegaProducto.setRowSelectionAllowed(true);
		this.jTableDatosBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosBodegaProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoBodegaProducto = new JButtonMe();
		this.jButtonDuplicarBodegaProducto = new JButtonMe();
		this.jButtonCopiarBodegaProducto = new JButtonMe();
		this.jButtonVerFormBodegaProducto = new JButtonMe();
		this.jButtonNuevoRelacionesBodegaProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaBodegaProducto = new JButtonMe();
		this.jButtonCerrarBodegaProducto = new JButtonMe();
		
		this.jScrollPanelDatosBodegaProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralBodegaProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioestadisticaBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Bodega Producto";
		
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosBodegaProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBodegaProducto.setToolTipText("Acciones");
        this.jPanelAccionesBodegaProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralBodegaProducto.setName("jPanelCamposFingeneralBodegaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));
		this.jPanelCamposIniciodatoBodegaProducto.setName("jPanelCamposFindatoBodegaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatoBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioestadisticaBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadistica"));
		this.jPanelCamposInicioestadisticaBodegaProducto.setName("jPanelCamposFinestadisticaBodegaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioestadisticaBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableBodegaProducto.setName("jPanelCamposFincuenta_contableBodegaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoBodegaProducto=new ReporteDinamicoJInternalFrame(BodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoBodegaProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionBodegaProducto=new ImportacionJInternalFrame(BodegaProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionBodegaProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByBodegaProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByBodegaProducto.setText("Orden");
		this.jButtonAbrirOrderByBodegaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodegaProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaProducto,false,this);
			
			//this.cargarOrderByBodegaProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByBodegaProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaProducto,true,this);
			
			//this.cargarOrderByBodegaProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosBodegaProducto.setMinimumSize(new Dimension(400,50));//5830
		this.jTableDatosBodegaProducto.setMaximumSize(new Dimension(400,50));//5830
		this.jTableDatosBodegaProducto.setPreferredSize(new Dimension(400,50));//5830
		
		this.jScrollPanelDatosBodegaProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodegaProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosBodegaProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoBodegaProducto.setText("Nuevo");
		this.jButtonDuplicarBodegaProducto.setText("Duplicar");
		this.jButtonCopiarBodegaProducto.setText("Copiar");
		this.jButtonVerFormBodegaProducto.setText("Ver");
		this.jButtonNuevoRelacionesBodegaProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaBodegaProducto.setText("Guardar");
		this.jButtonCerrarBodegaProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBodegaProducto,"nuevo_button","Nuevo",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarBodegaProducto,"duplicar_button","Duplicar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarBodegaProducto,"copiar_button","Copiar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormBodegaProducto,"ver_form","Ver",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesBodegaProducto,"nuevorelaciones_button","Nuevo Rel",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBodegaProducto,"guardarcambiostabla_button","Guardar",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBodegaProducto,"cerrar_button","Salir",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoBodegaProducto.setToolTipText("Nuevo"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarBodegaProducto.setToolTipText("Duplicar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarBodegaProducto.setToolTipText("Copiar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormBodegaProducto.setToolTipText("Ver"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesBodegaProducto.setToolTipText("Nuevo Rel"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaBodegaProducto.setToolTipText("Guardar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBodegaProducto.setToolTipText("Salir"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBodegaProducto";
		inputMap = this.jButtonNuevoBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBodegaProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarBodegaProducto";
		inputMap = this.jButtonDuplicarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarBodegaProducto"));
		
		//COPIAR
		sMapKey = "CopiarBodegaProducto";
		inputMap = this.jButtonCopiarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarBodegaProducto"));
		
		//VEr FORM
		sMapKey = "VerFormBodegaProducto";
		inputMap = this.jButtonVerFormBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormBodegaProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormBodegaProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesBodegaProducto";
		inputMap = this.jButtonNuevoRelacionesBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesBodegaProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarBodegaProducto";
		inputMap = this.jButtonModificarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarBodegaProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarBodegaProducto";
		inputMap = this.jButtonCerrarBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBodegaProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBodegaProducto";
		inputMap = this.jButtonGuardarCambiosTablaBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBodegaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1BodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2BodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3BodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4BodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5BodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesBodegaProducto.setName("jPanelParametrosReportesBodegaProducto"); 
		
		this.jPanelParametrosReportesAccionesBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesBodegaProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesBodegaProducto.setName("jPanelParametrosReportesAccionesBodegaProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionBodegaProducto = new JButtonMe();
		this.jButtonRecargarInformacionBodegaProducto.setText("Recargar");
		this.jButtonRecargarInformacionBodegaProducto.setToolTipText("Recargar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionBodegaProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionBodegaProducto = new JButtonMe();
		this.jButtonProcesarInformacionBodegaProducto.setText("Procesar");
		this.jButtonProcesarInformacionBodegaProducto.setToolTipText("Procesar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionBodegaProducto.setVisible(false);
			
		this.jButtonProcesarInformacionBodegaProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodegaProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionBodegaProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesBodegaProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposReportesBodegaProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesBodegaProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesBodegaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionBodegaProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionBodegaProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesBodegaProducto.setText("Accion");
		this.jComboBoxTiposRelacionesBodegaProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBodegaProducto.setText("Accion");
		this.jComboBoxTiposAccionesBodegaProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarBodegaProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarBodegaProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarBodegaProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralBodegaProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralBodegaProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodegaProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralBodegaProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesBodegaProducto = new JLabelMe();
		
		this.jLabelAccionesBodegaProducto.setText("Acciones");		
		this.jLabelAccionesBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosBodegaProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosBodegaProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosBodegaProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosBodegaProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosBodegaProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaBodegaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaBodegaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaBodegaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteBodegaProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteBodegaProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresBodegaProducto = new JButtonMe();
		//this.jButtonAnterioresBodegaProducto.setText("<<");
        this.jButtonAnterioresBodegaProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresBodegaProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesBodegaProducto = new JButtonMe();
		//this.jButtonSiguientesBodegaProducto.setText(">>");
        this.jButtonSiguientesBodegaProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesBodegaProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosBodegaProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosBodegaProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosBodegaProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosBodegaProducto,"nuevoguardarcambios_button","Nue",this.bodegaproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosBodegaProducto";
		inputMap = this.jButtonNuevoGuardarCambiosBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosBodegaProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionBodegaProducto";
		inputMap = this.jButtonRecargarInformacionBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionBodegaProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesBodegaProducto";
		inputMap = this.jButtonSiguientesBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesBodegaProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresBodegaProducto";
		inputMap = this.jButtonAnterioresBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresBodegaProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasBodegaProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesBodegaProducto.setMinimumSize(new Dimension(this.getWidth(),BodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodegaProducto.setMaximumSize(new Dimension(this.getWidth(),BodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesBodegaProducto.setPreferredSize(new Dimension(this.getWidth(),BodegaProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(BodegaProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionBodegaProducto = new GridBagLayout();

			this.jPanelPaginacionBodegaProducto.setLayout(gridaBagLayoutPaginacionBodegaProducto);						
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 0;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionBodegaProducto.add(this.jButtonAnterioresBodegaProducto, this.gridBagConstraintsBodegaProducto);
					
						
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodegaProducto.gridy = 0;
			
			this.jPanelPaginacionBodegaProducto.add(this.jButtonNuevoGuardarCambiosBodegaProducto, this.gridBagConstraintsBodegaProducto);
						
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsBodegaProducto.gridy = 0;
			this.jPanelPaginacionBodegaProducto.add(this.jButtonSiguientesBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 1;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaProducto.add(this.jButtonNuevoBodegaProducto, this.gridBagConstraintsBodegaProducto);
						
			
			
			if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsBodegaProducto.gridy = 1;
				this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionBodegaProducto.add(this.jButtonGuardarCambiosTablaBodegaProducto, this.gridBagConstraintsBodegaProducto);
			}
			
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 1;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaProducto.add(this.jButtonDuplicarBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 1;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaProducto.add(this.jButtonCopiarBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 1;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionBodegaProducto.add(this.jButtonVerFormBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 1;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionBodegaProducto.add(this.jButtonCerrarBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		
		this.jButtonRecargarInformacionBodegaProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodegaProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionBodegaProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesBodegaProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodegaProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesBodegaProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesBodegaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodegaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesBodegaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionBodegaProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodegaProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionBodegaProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarBodegaProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodegaProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarBodegaProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaBodegaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodegaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaBodegaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteBodegaProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodegaProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteBodegaProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosBodegaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodegaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosBodegaProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosBodegaProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodegaProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosBodegaProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesBodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesBodegaProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1BodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2BodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3BodegaProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4BodegaProducto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesBodegaProducto.setLayout(gridaBagParametrosReportesBodegaProducto);
			this.jPanelParametrosReportesAccionesBodegaProducto.setLayout(gridaBagParametrosReportesAccionesBodegaProducto);
			
			
			this.jPanelParametrosAuxiliar1BodegaProducto.setLayout(gridaBagParametrosAuxiliar1BodegaProducto);
			this.jPanelParametrosAuxiliar2BodegaProducto.setLayout(gridaBagParametrosAuxiliar2BodegaProducto);
			this.jPanelParametrosAuxiliar3BodegaProducto.setLayout(gridaBagParametrosAuxiliar3BodegaProducto);
			this.jPanelParametrosAuxiliar4BodegaProducto.setLayout(gridaBagParametrosAuxiliar4BodegaProducto);
			//this.jPanelParametrosAuxiliar5BodegaProducto.setLayout(gridaBagParametrosAuxiliar2BodegaProducto);			
			
			
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaProducto.add(this.jButtonRecargarInformacionBodegaProducto, this.gridBagConstraintsBodegaProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaProducto.add(this.jComboBoxTiposPaginacionBodegaProducto, this.gridBagConstraintsBodegaProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaProducto.add(this.jCheckBoxConAltoMaximoTablaBodegaProducto, this.gridBagConstraintsBodegaProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1BodegaProducto.add(this.jComboBoxTiposArchivosReportesBodegaProducto, this.gridBagConstraintsBodegaProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaProducto.add(this.jPanelParametrosAuxiliar1BodegaProducto, this.gridBagConstraintsBodegaProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4BodegaProducto.add(this.jComboBoxTiposReportesBodegaProducto, this.gridBagConstraintsBodegaProducto);																		
			
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4BodegaProducto.add(this.jComboBoxTiposGraficosReportesBodegaProducto, this.gridBagConstraintsBodegaProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaProducto.add(this.jPanelParametrosAuxiliar4BodegaProducto, this.gridBagConstraintsBodegaProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaProducto.add(this.jComboBoxTiposReportesBodegaProducto, this.gridBagConstraintsBodegaProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaProducto.add(this.jCheckBoxGenerarReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaProducto.add(this.jPanelParametrosAuxiliar2BodegaProducto, this.gridBagConstraintsBodegaProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaProducto.add(this.jLabelAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
				this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesBodegaProducto.add(this.jButtonAbrirOrderByBodegaProducto, this.gridBagConstraintsBodegaProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaProducto.add(this.jComboBoxTiposSeleccionarBodegaProducto, this.gridBagConstraintsBodegaProducto);			
			
			
			/*
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaProducto.add(this.jCheckBoxSeleccionarTodosBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesBodegaProducto.add(this.jCheckBoxConGraficoReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BodegaProducto.add(this.jCheckBoxSeleccionarTodosBodegaProducto, this.gridBagConstraintsBodegaProducto);															
				
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BodegaProducto.add(this.jCheckBoxSeleccionadosBodegaProducto, this.gridBagConstraintsBodegaProducto);															
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsBodegaProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3BodegaProducto.add(this.jCheckBoxConGraficoReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesBodegaProducto.add(this.jPanelParametrosAuxiliar3BodegaProducto, this.gridBagConstraintsBodegaProducto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaProducto.add(this.jComboBoxTiposAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);
	
				
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsBodegaProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesBodegaProducto.add(this.jTextFieldValorCampoGeneralBodegaProducto, this.gridBagConstraintsBodegaProducto);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralBodegaProducto.setLayout(gridaBagLayoutCamposIniciogeneralBodegaProducto);

		GridBagLayout gridaBagLayoutCamposIniciodatoBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciodatoBodegaProducto.setLayout(gridaBagLayoutCamposIniciodatoBodegaProducto);

		GridBagLayout gridaBagLayoutCamposInicioestadisticaBodegaProducto= new GridBagLayout();
		this.jPanelCamposInicioestadisticaBodegaProducto.setLayout(gridaBagLayoutCamposInicioestadisticaBodegaProducto);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableBodegaProducto= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableBodegaProducto.setLayout(gridaBagLayoutCamposIniciocuenta_contableBodegaProducto);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosBodegaProducto = new GridBagLayout();

			this.jScrollPanelDatosBodegaProducto.setLayout(gridaBagLayoutDatosBodegaProducto);
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = 0;
			this.gridBagConstraintsBodegaProducto.gridx = 0;
			
			this.jScrollPanelDatosBodegaProducto.add(this.jTableDatosBodegaProducto, this.gridBagConstraintsBodegaProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosBodegaProducto.setViewportView(this.jTableDatosBodegaProducto);
		this.jTableDatosBodegaProducto.setFillsViewportHeight(true);
		this.jTableDatosBodegaProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesBodegaProducto= new GridBagLayout();
		this.jPanelAccionesBodegaProducto.setLayout(gridaBagLayoutAccionesBodegaProducto);
		
		
		/*	
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = 0;
		this.gridBagConstraintsBodegaProducto.gridx = 0;
			
		this.jPanelAccionesBodegaProducto.add(this.jButtonNuevoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaBodegaProducto.setLayout(gridaBagLayoutFK_IdBodegaBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdBodegaBodegaProducto.add(jLabelid_bodegaFK_IdBodegaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdBodegaBodegaProducto.add(jComboBoxid_bodegaFK_IdBodegaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdBodegaBodegaProducto.add(jButtonFK_IdBodegaBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("1.-Por Bodega ", jPanelFK_IdBodegaBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoBodegaProducto.setLayout(gridaBagLayoutFK_IdCentroCostoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCentroCostoBodegaProducto.add(jLabelid_centro_costoFK_IdCentroCostoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCentroCostoBodegaProducto.add(jComboBoxid_centro_costoFK_IdCentroCostoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCentroCostoBodegaProducto.add(jButtonFK_IdCentroCostoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoVentaBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableCostoVentaBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableCostoVentaBodegaProducto.add(jLabelid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableCostoVentaBodegaProducto.add(jComboBoxid_cuenta_contable_costo_ventaFK_IdCuentaContableCostoVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableCostoVentaBodegaProducto.add(jButtonFK_IdCuentaContableCostoVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("3.-Por Cuenta C. Costo Venta ", jPanelFK_IdCuentaContableCostoVentaBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableIngresoCreditoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto.add(jLabelid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto.add(jComboBoxid_cuenta_contable_ingreso_creditoFK_IdCuentaContableIngresoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto.add(jButtonFK_IdCuentaContableIngresoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("4.-Por Cuenta C. Ingreso Credito ", jPanelFK_IdCuentaContableIngresoCreditoBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableIngresoDebitoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto.add(jLabelid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto.add(jComboBoxid_cuenta_contable_ingreso_debitoFK_IdCuentaContableIngresoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto.add(jButtonFK_IdCuentaContableIngresoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("5.-Por Cuenta C. Ingreso Debito ", jPanelFK_IdCuentaContableIngresoDebitoBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableProduccionBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableProduccionBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableProduccionBodegaProducto.add(jLabelid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableProduccionBodegaProducto.add(jComboBoxid_cuenta_contable_produccionFK_IdCuentaContableProduccionBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableProduccionBodegaProducto.add(jButtonFK_IdCuentaContableProduccionBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("6.-Por Cuenta C. Produccion ", jPanelFK_IdCuentaContableProduccionBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableResultadoCreditoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto.add(jLabelid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto.add(jComboBoxid_cuenta_contable_resultado_creditoFK_IdCuentaContableResultadoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto.add(jButtonFK_IdCuentaContableResultadoCreditoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("7.-Por Cuenta C. Resultado Credito ", jPanelFK_IdCuentaContableResultadoCreditoBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableResultadoDebitoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto.add(jLabelid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto.add(jComboBoxid_cuenta_contable_resultado_debitoFK_IdCuentaContableResultadoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto.add(jButtonFK_IdCuentaContableResultadoDebitoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("8.-Por Cuenta C. Resultado Debito ", jPanelFK_IdCuentaContableResultadoDebitoBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableVentaBodegaProducto.setLayout(gridaBagLayoutFK_IdCuentaContableVentaBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdCuentaContableVentaBodegaProducto.add(jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdCuentaContableVentaBodegaProducto.add(jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdCuentaContableVentaBodegaProducto.add(jButtonFK_IdCuentaContableVentaBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("9.-Por Cuenta C. Venta ", jPanelFK_IdCuentaContableVentaBodegaProducto);
		jTabbedPaneBusquedasBodegaProducto.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdProductoBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoBodegaProducto.setLayout(gridaBagLayoutFK_IdProductoBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdProductoBodegaProducto.add(jLabelid_productoFK_IdProductoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdProductoBodegaProducto.add(jComboBoxid_productoFK_IdProductoBodegaProducto, gridBagConstraintsBodegaProducto);


		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdProductoBodegaProducto.add(this.jButtonBuscarFK_IdProductoid_productoBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdProductoBodegaProducto.add(jButtonFK_IdProductoBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("10.-Por Producto ", jPanelFK_IdProductoBodegaProducto);

		GridBagLayout gridaBagLayoutFK_IdUnidadBodegaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadBodegaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadBodegaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadBodegaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadBodegaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadBodegaProducto.setLayout(gridaBagLayoutFK_IdUnidadBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 0;
		jPanelFK_IdUnidadBodegaProducto.add(jLabelid_unidadFK_IdUnidadBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 0;
		gridBagConstraintsBodegaProducto.gridx = 1;
		jPanelFK_IdUnidadBodegaProducto.add(jComboBoxid_unidadFK_IdUnidadBodegaProducto, gridBagConstraintsBodegaProducto);

		gridBagConstraintsBodegaProducto = new GridBagConstraints();
		gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsBodegaProducto.gridy = 1;
		gridBagConstraintsBodegaProducto.gridx =1;
		jPanelFK_IdUnidadBodegaProducto.add(jButtonFK_IdUnidadBodegaProducto, gridBagConstraintsBodegaProducto);

		jTabbedPaneBusquedasBodegaProducto.addTab("11.-Por Unidad ", jPanelFK_IdUnidadBodegaProducto);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBodegaProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBodegaProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();						
			this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodegaProducto.gridx = 0;		
			//this.gridBagConstraintsBodegaProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBodegaProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarBodegaProducto, this.gridBagConstraintsBodegaProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsBodegaProducto.gridx = 0;		
		//this.gridBagConstraintsBodegaProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsBodegaProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsBodegaProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBodegaProducto.gridx = 0;		
			this.gridBagConstraintsBodegaProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsBodegaProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasBodegaProducto, this.gridBagConstraintsBodegaProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesBodegaProducto, this.gridBagConstraintsBodegaProducto);								
		
		
		/*
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);
		*/		
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBodegaProducto.gridx =0;
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBodegaProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBodegaProducto, this.gridBagConstraintsBodegaProducto);
				
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionBodegaProducto, this.gridBagConstraintsBodegaProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(BodegaProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosBodegaProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBodegaProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosBodegaProducto.setLayout(gridaBagLayoutBusquedasParametrosBodegaProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralBodegaProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBodegaProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBodegaProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBodegaProducto, this.gridBagConstraintsBodegaProducto);
			
			
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
			
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBodegaProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBodegaProducto, this.gridBagConstraintsBodegaProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralBodegaProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoBodegaProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoBodegaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoBodegaProducto.setName("jPanelReporteDinamicoBodegaProducto"); 
		
		this.jPanelReporteDinamicoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoBodegaProducto.setLayout(gridaBagLayoutReporteDinamicoBodegaProducto);
		
		
		this.jInternalFrameReporteDinamicoBodegaProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoBodegaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodegaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoBodegaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoBodegaProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoBodegaProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoBodegaProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoBodegaProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteBodegaProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteBodegaProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelColumnasSelectReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteBodegaProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteBodegaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteBodegaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodegaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteBodegaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteBodegaProducto=new JScrollPane(this.jListColumnasSelectReporteBodegaProducto);
			
			this.jScrollColumnasSelectReporteBodegaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodegaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteBodegaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoBodegaProducto.add(this.jListColumnasSelectReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
		this.jPanelReporteDinamicoBodegaProducto.add(this.jScrollColumnasSelectReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteBodegaProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteBodegaProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteBodegaProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteBodegaProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteBodegaProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodegaProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteBodegaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteBodegaProducto=new JScrollPane(this.jListRelacionesSelectReporteBodegaProducto);
			
			this.jScrollRelacionesSelectReporteBodegaProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodegaProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteBodegaProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoBodegaProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoBodegaProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoBodegaProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoBodegaProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoBodegaProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoBodegaProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoBodegaProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelConGraficoDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoBodegaProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoBodegaProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoBodegaProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoBodegaProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBodegaProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoBodegaProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jCheckBoxConGraficoDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoBodegaProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoBodegaProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelColumnaCategoriaGraficoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoBodegaProducto.add(this.jComboBoxColumnaCategoriaGraficoBodegaProducto, this.gridBagConstraintsBodegaProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorBodegaProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorBodegaProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelColumnaCategoriaValorBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorBodegaProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorBodegaProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorBodegaProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorBodegaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBodegaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorBodegaProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoBodegaProducto.add(this.jComboBoxColumnaCategoriaValorBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoBodegaProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoBodegaProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelColumnasValoresGraficoBodegaProducto, this.gridBagConstraintsBodegaProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoBodegaProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoBodegaProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoBodegaProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoBodegaProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBodegaProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoBodegaProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoBodegaProducto=new JScrollPane(this.jListColumnasValoresGraficoBodegaProducto);
			
			this.jScrollColumnasValoresGraficoBodegaProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBodegaProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoBodegaProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoBodegaProducto.add(this.jListColumnasSelectReporteBodegaProducto, this.gridBagConstraintsBodegaProducto);
		this.jPanelReporteDinamicoBodegaProducto.add(this.jScrollColumnasValoresGraficoBodegaProducto, this.gridBagConstraintsBodegaProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoBodegaProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoBodegaProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelTiposGraficosReportesDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoBodegaProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jComboBoxTiposGraficosReportesDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoBodegaProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoBodegaProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelGenerarExcelReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoBodegaProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoBodegaProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoBodegaProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoBodegaProducto.setToolTipText("Generar EXCEL"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		//this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoBodegaProducto.add(this.jButtonGenerarExcelReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaProducto.add(this.jComboBoxTiposReportesDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoBodegaProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoBodegaProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoBodegaProducto.add(this.jLabelTiposArchivoReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaProducto.add(this.jComboBoxTiposArchivosReportesDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoBodegaProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoBodegaProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoBodegaProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoBodegaProducto.setToolTipText("Generar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaProducto.add(this.jButtonGenerarReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoBodegaProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoBodegaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoBodegaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoBodegaProducto.setToolTipText("Cancelar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoBodegaProducto.add(this.jButtonCerrarReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalBodegaProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoBodegaProducto= new JScrollPane(jPanelReporteDinamicoBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoBodegaProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodegaProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoBodegaProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsBodegaProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoBodegaProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalBodegaProducto);
		this.jInternalFrameReporteDinamicoBodegaProducto.getContentPane().add(this.jScrollPanelReporteDinamicoBodegaProducto, this.gridBagConstraintsBodegaProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionBodegaProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionBodegaProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionBodegaProducto.setName("jPanelImportacionBodegaProducto"); 
		
		this.jPanelImportacionBodegaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodegaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionBodegaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionBodegaProducto.setLayout(gridaBagLayoutImportacionBodegaProducto);
		
		
		this.jInternalFrameImportacionBodegaProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionBodegaProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionBodegaProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteBodegaProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodegaProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionBodegaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodegaProducto.setResizable(true);
	    this.jInternalFrameImportacionBodegaProducto.setClosable(true);
	    this.jInternalFrameImportacionBodegaProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionBodegaProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionBodegaProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionBodegaProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionBodegaProducto.setResizable(true);
	    this.jInternalFrameImportacionBodegaProducto.setClosable(true);
	    this.jInternalFrameImportacionBodegaProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionBodegaProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodegaProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionBodegaProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionBodegaProducto = new JLabelMe();

		this.jLabelArchivoImportacionBodegaProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodegaProducto.add(this.jLabelArchivoImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionBodegaProducto = new JFileChooser();		
		this.jFileChooserImportacionBodegaProducto.setToolTipText("ESCOGER ARCHIVO"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionBodegaProducto = new JButtonMe();
		this.jButtonAbrirImportacionBodegaProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionBodegaProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionBodegaProducto.setToolTipText("Generar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaProducto.add(this.jButtonAbrirImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionBodegaProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionBodegaProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionBodegaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodegaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionBodegaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionBodegaProducto.add(this.jLabelPathArchivoImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionBodegaProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionBodegaProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodegaProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionBodegaProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaProducto.add(this.jTextFieldPathArchivoImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionBodegaProducto = new JButtonMe();
		this.jButtonGenerarImportacionBodegaProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionBodegaProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionBodegaProducto.setToolTipText("Generar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaProducto.add(this.jButtonGenerarImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionBodegaProducto = new JButtonMe();
		this.jButtonCerrarImportacionBodegaProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionBodegaProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionBodegaProducto.setToolTipText("Cancelar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBodegaProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsBodegaProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionBodegaProducto.add(this.jButtonCerrarImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalBodegaProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionBodegaProducto= new JScrollPane(jPanelImportacionBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
		this.gridBagConstraintsBodegaProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsBodegaProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionBodegaProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalBodegaProducto);
		this.jInternalFrameImportacionBodegaProducto.getContentPane().add(this.jScrollPanelImportacionBodegaProducto, this.gridBagConstraintsBodegaProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByBodegaProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByBodegaProducto = new JButtonMe();
			this.jButtonAbrirOrderByBodegaProducto.setText("Orden");
			this.jButtonAbrirOrderByBodegaProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByBodegaProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByBodegaProducto";
			inputMap = this.jButtonAbrirOrderByBodegaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByBodegaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByBodegaProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByBodegaProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByBodegaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByBodegaProducto.setName("jPanelOrderByBodegaProducto"); 
			
			this.jPanelOrderByBodegaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodegaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByBodegaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByBodegaProducto.setLayout(gridaBagLayoutOrderByBodegaProducto);
			
			
			this.jTableDatosBodegaProductoOrderBy = new JTableMe();        
			this.jTableDatosBodegaProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosBodegaProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosBodegaProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosBodegaProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosBodegaProductoOrderBy.setViewportView(this.jTableDatosBodegaProductoOrderBy);
			this.jTableDatosBodegaProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosBodegaProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByBodegaProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByBodegaProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByBodegaProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteBodegaProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByBodegaProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByBodegaProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByBodegaProducto.setTitle("Orden");
			this.jInternalFrameOrderByBodegaProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByBodegaProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByBodegaProducto.setResizable(true);
			this.jInternalFrameOrderByBodegaProducto.setClosable(true);
			this.jInternalFrameOrderByBodegaProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByBodegaProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodegaProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByBodegaProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByBodegaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bodega Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsBodegaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsBodegaProducto.ipady =150;
				
			this.jPanelOrderByBodegaProducto.add(jScrollPanelDatosBodegaProductoOrderBy, this.gridBagConstraintsBodegaProducto);//this.jTableDatosBodegaProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByBodegaProducto = new JButtonMe();
			this.jButtonCerrarOrderByBodegaProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByBodegaProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByBodegaProducto.setToolTipText("Cancelar"+" "+BodegaProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByBodegaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBodegaProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsBodegaProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByBodegaProducto.add(this.jButtonCerrarOrderByBodegaProducto, this.gridBagConstraintsBodegaProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalBodegaProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByBodegaProducto= new JScrollPane(jPanelOrderByBodegaProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsBodegaProducto = new GridBagConstraints();
			this.gridBagConstraintsBodegaProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsBodegaProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsBodegaProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByBodegaProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByBodegaProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalBodegaProducto);
			
			this.jInternalFrameOrderByBodegaProducto.getContentPane().add(this.jScrollPanelOrderByBodegaProducto, this.gridBagConstraintsBodegaProducto);			
		
		} else {
			this.jButtonAbrirOrderByBodegaProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//11730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=5830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=5900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.bodegaproductoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosBodegaProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosBodegaProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosBodegaProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosBodegaProducto.getRowHeight();//BodegaProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > BodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodegaProducto.isSelected()) {
					iHeightTable=BodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > BodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaBodegaProducto.isSelected()) {
					iHeightTable=BodegaProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < BodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=BodegaProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosBodegaProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodegaProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosBodegaProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosBodegaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodegaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosBodegaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByBodegaProducto!=null && this.jInternalFrameOrderByBodegaProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.bodegaproductoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByBodegaProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByBodegaProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByBodegaProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByBodegaProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByBodegaProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByBodegaProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByBodegaProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosBodegaProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodegaProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosBodegaProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=bodegaproductoLogic.getBodegaProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bodegaproductos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<BodegaProducto> TraerBodegaProductoBeans(List<BodegaProducto> bodegaproductos,ArrayList<Classe> classes)throws Exception {
		try {
			for(BodegaProducto bodegaproducto:bodegaproductos) {
					
				if(!(BodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || BodegaProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					bodegaproducto.setsDetalleGeneralEntityReporte(BodegaProductoConstantesFunciones.getBodegaProductoDescripcion(bodegaproducto));
										
					bodegaproducto.setcon_iva_descripcion(BodegaProductoConstantesFunciones.getcon_ivaDescripcion(bodegaproducto));bodegaproducto.setcon_impuesto_descripcion(BodegaProductoConstantesFunciones.getcon_impuestoDescripcion(bodegaproducto));bodegaproducto.setcon_ice_descripcion(BodegaProductoConstantesFunciones.getcon_iceDescripcion(bodegaproducto));bodegaproducto.setesta_activo_descripcion(BodegaProductoConstantesFunciones.getesta_activoDescripcion(bodegaproducto));bodegaproducto.setcon_balanza_descripcion(BodegaProductoConstantesFunciones.getcon_balanzaDescripcion(bodegaproducto));	
					
						
					
				} else  {
							
					//bodegaproducto.setsDetalleGeneralEntityReporte(bodegaproducto.getsDetalleGeneralEntityReporte());
										
				}
				
				//bodegaproductobeans.add(bodegaproductobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return bodegaproductos;
    }
	//PARA REPORTES FIN
}
