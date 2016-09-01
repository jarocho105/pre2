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
import com.bydan.erp.inventario.util.ProductoCuentaContableConstantesFunciones;

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
public class ProductoCuentaContableJInternalFrame extends ProductoCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoCuentaContable;
	
	protected JMenuBar jmenuBarProductoCuentaContable;
	
	protected JMenu jmenuProductoCuentaContable;
	protected JMenu jmenuDatosProductoCuentaContable;
	protected JMenu jmenuArchivoProductoCuentaContable;
	protected JMenu jmenuAccionesProductoCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoCuentaContable;	
	protected GridBagConstraints gridBagConstraintsProductoCuentaContable;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoCuentaContableDetalleFormJInternalFrame jInternalFrameDetalleFormProductoCuentaContable;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoCuentaContable;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoCuentaContable;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableinventario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledescuento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledevolucion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public ProductoCuentaContableSessionBean productocuentacontableSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableinventarioSessionBean;
	public CuentaContableSessionBean cuentacontablecostoSessionBean;
	public CuentaContableSessionBean cuentacontableventaSessionBean;
	public CuentaContableSessionBean cuentacontabledescuentoSessionBean;
	public CuentaContableSessionBean cuentacontabledevolucionSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoCuentaContable> productocuentacontables;		
	public List<ProductoCuentaContable> productocuentacontablesEliminados;	
	public List<ProductoCuentaContable> productocuentacontablesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoCuentaContable;		
	protected JButton jButtonAbrirOrderByProductoCuentaContable;
	
	
	//protected JPanel jPanelOrderByProductoCuentaContable;
	//public JScrollPane jScrollPanelOrderByProductoCuentaContable;	
	//protected JButton jButtonCerrarOrderByProductoCuentaContable;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoCuentaContableLogic productocuentacontableLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionProductoCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralProductoCuentaContable;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoCuentaContableOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoCuentaContable;
	//public JScrollPane jScrollPanelImportacionProductoCuentaContable;
	
	
	
	protected JPanel jPanelAccionesProductoCuentaContable;
	
    protected JPanel jPanelPaginacionProductoCuentaContable;
    protected JPanel jPanelParametrosReportesProductoCuentaContable;
	protected JPanel jPanelParametrosReportesAccionesProductoCuentaContable;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoCuentaContable;
	protected JPanel jPanelParametrosAuxiliar2ProductoCuentaContable;
	protected JPanel jPanelParametrosAuxiliar3ProductoCuentaContable;
	protected JPanel jPanelParametrosAuxiliar4ProductoCuentaContable;
	//protected JPanel jPanelParametrosAuxiliar5ProductoCuentaContable;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoCuentaContable;
	//protected JPanel jPanelImportacionProductoCuentaContable;
	
	
	public JTable jTableDatosProductoCuentaContable;
	
	
	
	//public JTable jTableDatosProductoCuentaContableOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoCuentaContable;
	protected JButton jButtonDuplicarProductoCuentaContable;
	protected JButton jButtonCopiarProductoCuentaContable;
	protected JButton jButtonVerFormProductoCuentaContable;
	protected JButton jButtonNuevoRelacionesProductoCuentaContable;
	protected JButton jButtonModificarProductoCuentaContable;
	
    protected JButton jButtonGuardarCambiosTablaProductoCuentaContable;
	protected JButton jButtonCerrarProductoCuentaContable;
	
	
	protected JButton jButtonRecargarInformacionProductoCuentaContable;
	protected JButton jButtonProcesarInformacionProductoCuentaContable;
	
	
	protected JButton jButtonAnterioresProductoCuentaContable;
	protected JButton jButtonSiguientesProductoCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosProductoCuentaContable;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoCuentaContable;
	//protected JButton jButtonCerrarReporteDinamicoProductoCuentaContable;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoCuentaContable;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoCuentaContable;
	//protected JButton jButtonGenerarImportacionProductoCuentaContable;
	//protected JButton jButtonCerrarImportacionProductoCuentaContable;
	//protected JFileChooser jFileChooserImportacionProductoCuentaContable;
	//protected File fileImportacionProductoCuentaContable;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoCuentaContable;
	protected JButton jButtonDuplicarToolBarProductoCuentaContable;
	protected JButton jButtonNuevoRelacionesToolBarProductoCuentaContable;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoCuentaContable;
	protected JButton jButtonCopiarToolBarProductoCuentaContable;
	protected JButton jButtonVerFormToolBarProductoCuentaContable;
	public JButton jButtonGuardarCambiosTablaToolBarProductoCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoCuentaContable;
	protected JButton jButtonCerrarToolBarProductoCuentaContable;
	
	protected JButton jButtonRecargarInformacionToolBarProductoCuentaContable;
	protected JButton jButtonProcesarInformacionToolBarProductoCuentaContable;
	protected JButton jButtonAnterioresToolBarProductoCuentaContable;
	protected JButton jButtonSiguientesToolBarProductoCuentaContable;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoCuentaContable;
	protected JButton jButtonAbrirOrderByToolBarProductoCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoCuentaContable;
	protected JMenuItem jMenuItemDuplicarProductoCuentaContable;
	protected JMenuItem jMenuItemNuevoRelacionesProductoCuentaContable;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoCuentaContable;
	protected JMenuItem jMenuItemCopiarProductoCuentaContable;
	protected JMenuItem jMenuItemVerFormProductoCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoCuentaContable;
	protected JMenuItem jMenuItemCerrarProductoCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarProductoCuentaContable;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoCuentaContable;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoCuentaContable;
	protected JMenuItem jMenuItemProcesarInformacionProductoCuentaContable;
	protected JMenuItem jMenuItemAnterioresProductoCuentaContable;
	protected JMenuItem jMenuItemSiguientesProductoCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoCuentaContable;
	protected JMenuItem jMenuItemAbrirOrderByProductoCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarProductoCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoCuentaContable;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoCuentaContable;
	protected JCheckBox jCheckBoxSeleccionadosProductoCuentaContable;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoCuentaContable;
	protected JCheckBox jCheckBoxConGraficoReporteProductoCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoCuentaContable;
	protected JTextField jTextFieldValorCampoGeneralProductoCuentaContable;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoCuentaContable;
	//public JList<Reporte> jListColumnasSelectReporteProductoCuentaContable;
	//public JScrollPane jScrollColumnasSelectReporteProductoCuentaContable;
	
	//public JLabel jLabelRelacionesSelectReporteProductoCuentaContable;
	//public JList<Reporte> jListRelacionesSelectReporteProductoCuentaContable;
	//public JScrollPane jScrollRelacionesSelectReporteProductoCuentaContable;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoCuentaContable;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoCuentaContable;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoCuentaContable;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoCuentaContable;
	
		
	//public JLabel jLabelArchivoImportacionProductoCuentaContable;	
	//public JLabel jLabelPathArchivoImportacionProductoCuentaContable;
	//protected JTextField jTextFieldPathArchivoImportacionProductoCuentaContable;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoCuentaContable;
	
	//public JLabel jLabelColumnaCategoriaValorProductoCuentaContable;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoCuentaContable;
	
	//public JLabel jLabelColumnasValoresGraficoProductoCuentaContable;
	//public JList<Reporte> jListColumnasValoresGraficoProductoCuentaContable;
	//public JScrollPane jScrollColumnasValoresGraficoProductoCuentaContable;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoCuentaContable;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoCuentaContable;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoCuentaContable;
	public JPanel jPanelFK_IdBodegaProductoCuentaContable;
	public JButton jButtonFK_IdBodegaProductoCuentaContable;
	public JPanel jPanelFK_IdCentroCostoProductoCuentaContable;
	public JButton jButtonFK_IdCentroCostoProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableCostoProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableCostoProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableCreditoProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableCreditoProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableDebitoProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableDebitoProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableDescuentoProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableDescuentoProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableDevolucionProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableDevolucionProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableInventarioProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableInventarioProductoCuentaContable;
	public JPanel jPanelFK_IdCuentaContableVentaProductoCuentaContable;
	public JButton jButtonFK_IdCuentaContableVentaProductoCuentaContable;
	public JPanel jPanelFK_IdProductoProductoCuentaContable;
	public JButton jButtonFK_IdProductoProductoCuentaContable;
	
	public JPanel jPanelid_bodegaFK_IdBodegaProductoCuentaContable;
	public JLabel jLabelid_bodegaFK_IdBodegaProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable;
	public JButton jButtonid_bodegaFK_IdBodegaProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_bodegaFK_IdBodegaProductoCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_centro_costoFK_IdCentroCostoProductoCuentaContable;
	public JLabel jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable;
	public JButton jButtonid_centro_costoFK_IdCentroCostoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoFK_IdCentroCostoProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable;
	public JLabel jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable;
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContableArbol= new JButtonMe();

	
	public JPanel jPanelid_productoFK_IdProductoProductoCuentaContable;
	public JLabel jLabelid_productoFK_IdProductoProductoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoFK_IdProductoProductoCuentaContable;
	public JButton jButtonid_productoFK_IdProductoProductoCuentaContable= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_productoFK_IdProductoProductoCuentaContableBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdProductoid_productoProductoCuentaContable;
	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
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
	public ProductoCuentaContableJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoCuentaContableJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoCuentaContable)	{
		this.jButtonRecargarInformacionProductoCuentaContable = jButtonRecargarInformacionProductoCuentaContable;
	}
	
	public JButton getjButtonProcesarInformacionProductoCuentaContable() {
		return this.jButtonProcesarInformacionProductoCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoCuentaContable)	{
		this.jButtonProcesarInformacionProductoCuentaContable = jButtonProcesarInformacionProductoCuentaContable;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoCuentaContable() {
		return this.jButtonRecargarInformacionProductoCuentaContable;
	}
	
	
	public List<ProductoCuentaContable> getproductocuentacontables() {
		return this.productocuentacontables;
	}

	public void setproductocuentacontables(List<ProductoCuentaContable> productocuentacontables) {
		this.productocuentacontables = productocuentacontables;
	}
	
	public List<ProductoCuentaContable> getproductocuentacontablesAux() {
		return this.productocuentacontablesAux;
	}

	public void setproductocuentacontablesAux(List<ProductoCuentaContable> productocuentacontablesAux) {
		this.productocuentacontablesAux = productocuentacontablesAux;
	}
	
	public List<ProductoCuentaContable> getproductocuentacontablesEliminados() {
		return this.productocuentacontablesEliminados;
	}

	public void setProductoCuentaContablesEliminados(List<ProductoCuentaContable> productocuentacontablesEliminados) {
		this.productocuentacontablesEliminados = productocuentacontablesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoCuentaContable() {
		return jComboBoxTiposSeleccionarProductoCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoCuentaContable(
			JComboBox jComboBoxTiposSeleccionarProductoCuentaContable) {
		this.jComboBoxTiposSeleccionarProductoCuentaContable = jComboBoxTiposSeleccionarProductoCuentaContable;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoCuentaContable() {
		return jTextFieldValorCampoGeneralProductoCuentaContable;
	}

	public void setjTextFieldValorCampoGeneralProductoCuentaContable(
			JTextField jTextFieldValorCampoGeneralProductoCuentaContable) {
		this.jTextFieldValorCampoGeneralProductoCuentaContable = jTextFieldValorCampoGeneralProductoCuentaContable;
	}

	public void setBorderResaltarValorCampoGeneralProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoCuentaContable .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoCuentaContable() {
		return this.jCheckBoxSeleccionarTodosProductoCuentaContable;
	}

	public void setjCheckBoxSeleccionarTodosProductoCuentaContable(
			JCheckBox jCheckBoxSeleccionarTodosProductoCuentaContable) {
		this.jCheckBoxSeleccionarTodosProductoCuentaContable = jCheckBoxSeleccionarTodosProductoCuentaContable;
	}

	public void setBorderResaltarSeleccionarTodosProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoCuentaContable() {
		return this.jCheckBoxSeleccionadosProductoCuentaContable;
	}

	public void setjCheckBoxSeleccionadosProductoCuentaContable(
			JCheckBox jCheckBoxSeleccionadosProductoCuentaContable) {
		this.jCheckBoxSeleccionadosProductoCuentaContable = jCheckBoxSeleccionadosProductoCuentaContable;
	}
	
	public void setBorderResaltarSeleccionadosProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoCuentaContable() {
		return this.jComboBoxTiposArchivosReportesProductoCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoCuentaContable(
			JComboBox jComboBoxTiposArchivosReportesProductoCuentaContable) {
		this.jComboBoxTiposArchivosReportesProductoCuentaContable = jComboBoxTiposArchivosReportesProductoCuentaContable;
	}

	public void setBorderResaltarTiposArchivosReportesProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoCuentaContable() {
		return this.jComboBoxTiposReportesProductoCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoCuentaContable(
			JComboBox jComboBoxTiposReportesProductoCuentaContable) {
		this.jComboBoxTiposReportesProductoCuentaContable = jComboBoxTiposReportesProductoCuentaContable;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoCuentaContable() {
	//	return jComboBoxTiposReportesDinamicoProductoCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoCuentaContable(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoCuentaContable) {
	//	this.jComboBoxTiposReportesDinamicoProductoCuentaContable = jComboBoxTiposReportesDinamicoProductoCuentaContable;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoCuentaContable() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoCuentaContable(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable = jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable;
	//}
	
	public void setBorderResaltarTiposReportesProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoCuentaContable() {
		return this.jComboBoxTiposGraficosReportesProductoCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoCuentaContable(
			JComboBox jComboBoxTiposGraficosReportesProductoCuentaContable) {
		this.jComboBoxTiposGraficosReportesProductoCuentaContable = jComboBoxTiposGraficosReportesProductoCuentaContable;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoCuentaContable() {
		return this.jComboBoxTiposPaginacionProductoCuentaContable;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoCuentaContable(
			JComboBox jComboBoxTiposPaginacionProductoCuentaContable) {
		this.jComboBoxTiposPaginacionProductoCuentaContable = jComboBoxTiposPaginacionProductoCuentaContable;
	}
	
	public void setBorderResaltarTiposPaginacionProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoCuentaContable() {
		return this.jComboBoxTiposRelacionesProductoCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoCuentaContable() {
		return this.jComboBoxTiposAccionesProductoCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoCuentaContable(
			JComboBox jComboBoxTiposRelacionesProductoCuentaContable) {
		this.jComboBoxTiposRelacionesProductoCuentaContable = jComboBoxTiposRelacionesProductoCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoCuentaContable(
			JComboBox jComboBoxTiposAccionesProductoCuentaContable) {
		this.jComboBoxTiposAccionesProductoCuentaContable = jComboBoxTiposAccionesProductoCuentaContable;
	}
	
	public void setBorderResaltarTiposRelacionesProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoCuentaContable() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoCuentaContable .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoCuentaContable() {
	//	return jCheckBoxConGraficoDinamicoProductoCuentaContable;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoCuentaContable(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoCuentaContable) {
	//	this.jCheckBoxConGraficoDinamicoProductoCuentaContable = jCheckBoxConGraficoDinamicoProductoCuentaContable;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoCuentaContable() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoCuentaContable.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoCuentaContable .setBorder(borderResaltar);		
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
		this.productocuentacontableSessionBean=new ProductoCuentaContableSessionBean();
		
		this.productocuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productocuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productocuentacontableSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoCuentaContable= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"nuevo","nuevo","Nuevo"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"duplicar","duplicar","Duplicar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"copiar","copiar","Copiar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"ver_form","ver_form","Ver"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"recargar","recargar","Recargar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoCuentaContable,this.jTtoolBarProductoCuentaContable,
							"cerrar","cerrar","Salir"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoCuentaContable=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoCuentaContable;
			
				this.jButtonProcesarInformacionToolBarProductoCuentaContable=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoCuentaContable;
				
		//protected JButton jButtonModificarToolBarProductoCuentaContable;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoCuentaContable=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoCuentaContable=new JMenuMe("General");
		this.jmenuArchivoProductoCuentaContable=new JMenuMe("Archivo");
		this.jmenuAccionesProductoCuentaContable=new JMenuMe("Acciones");
		this.jmenuDatosProductoCuentaContable=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoCuentaContable= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoCuentaContable.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoCuentaContable,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoCuentaContable= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoCuentaContable.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoCuentaContable,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoCuentaContable= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoCuentaContable.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoCuentaContable,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoCuentaContable= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoCuentaContable.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoCuentaContable,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoCuentaContable= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoCuentaContable.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoCuentaContable,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoCuentaContable= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoCuentaContable.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoCuentaContable,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoCuentaContable= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoCuentaContable.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoCuentaContable,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoCuentaContable= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoCuentaContable.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoCuentaContable,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoCuentaContable= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoCuentaContable.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoCuentaContable,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoCuentaContable= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoCuentaContable.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoCuentaContable,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoCuentaContable= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoCuentaContable.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoCuentaContable,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoCuentaContable.add(this.jMenuItemCerrarProductoCuentaContable);
			
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemNuevoProductoCuentaContable);
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemNuevoGuardarCambiosProductoCuentaContable);
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemNuevoRelacionesProductoCuentaContable);
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemGuardarCambiosTablaProductoCuentaContable);		
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemDuplicarProductoCuentaContable);		
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemCopiarProductoCuentaContable);		
			this.jmenuAccionesProductoCuentaContable.add(this.jMenuItemVerFormProductoCuentaContable);		
			
			this.jmenuDatosProductoCuentaContable.add(this.jMenuItemRecargarInformacionProductoCuentaContable);				
			this.jmenuDatosProductoCuentaContable.add(this.jMenuItemAnterioresProductoCuentaContable);				
			this.jmenuDatosProductoCuentaContable.add(this.jMenuItemSiguientesProductoCuentaContable);				
			this.jmenuDatosProductoCuentaContable.add(this.jMenuItemAbrirOrderByProductoCuentaContable);				
			this.jmenuDatosProductoCuentaContable.add(this.jMenuItemMostrarOcultarProductoCuentaContable);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoCuentaContable.add(this.jMenuItemGuardarCambiosProductoCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoCuentaContable.add(this.jmenuArchivoProductoCuentaContable);		
			this.jmenuBarProductoCuentaContable.add(this.jmenuAccionesProductoCuentaContable);		
			this.jmenuBarProductoCuentaContable.add(this.jmenuDatosProductoCuentaContable);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoCuentaContable);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoCuentaContable() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdBodegaProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdBodegaProductoCuentaContable.setToolTipText("Buscar Por Bodega ");
		this.jButtonFK_IdBodegaProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdBodegaProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdBodegaProductoCuentaContable.setToolTipText("Buscar Por Bodega ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdBodegaProductoCuentaContable,"buscar_button","Buscar Por Bodega ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdBodegaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable = new JLabelMe();
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable.setText("Bodega :");
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable.setToolTipText("Bodega");
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_bodegaFK_IdBodegaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaFK_IdBodegaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCentroCostoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCentroCostoProductoCuentaContable.setToolTipText("Buscar Por Centro Costo ");
		this.jButtonFK_IdCentroCostoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCentroCostoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCentroCostoProductoCuentaContable.setToolTipText("Buscar Por Centro Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCentroCostoProductoCuentaContable,"buscar_button","Buscar Por Centro Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCentroCostoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable = new JLabelMe();
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable.setText("Centro Costo :");
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable.setToolTipText("Centro Costo");
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCostoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCostoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Costo ");
		this.jButtonFK_IdCuentaContableCostoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableCostoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableCostoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Costo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCostoProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Costo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCostoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setText("Cuenta Contable Costo :");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setToolTipText("Cuenta Contable Costo");
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableCreditoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDebitoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Debito ");
		this.jButtonFK_IdCuentaContableDebitoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setText("Cuenta Contable Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setToolTipText("Cuenta Contable Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDescuentoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDescuentoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Descuento ");
		this.jButtonFK_IdCuentaContableDescuentoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableDescuentoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableDescuentoProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Descuento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDescuentoProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Descuento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDescuentoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setText("Cuenta Contable Descuento :");
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setToolTipText("Cuenta Contable Descuento");
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDevolucionProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDevolucionProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Devolucion ");
		this.jButtonFK_IdCuentaContableDevolucionProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableDevolucionProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableDevolucionProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Devolucion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDevolucionProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Devolucion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDevolucionProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setText("Cuenta Contable Devolucion :");
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setToolTipText("Cuenta Contable Devolucion");
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableInventarioProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableInventarioProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Inventario ");
		this.jButtonFK_IdCuentaContableInventarioProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableInventarioProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableInventarioProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Inventario ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableInventarioProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Inventario ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableInventarioProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setText("Cuenta Contable Inventario :");
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setToolTipText("Cuenta Contable Inventario");
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableVentaProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableVentaProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Venta ");
		this.jButtonFK_IdCuentaContableVentaProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdCuentaContableVentaProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdCuentaContableVentaProductoCuentaContable.setToolTipText("Buscar Por Cuenta Contable Venta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableVentaProductoCuentaContable,"buscar_button","Buscar Por Cuenta Contable Venta ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableVentaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable = new JLabelMe();
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setText("Cuenta Contable Venta :");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setToolTipText("Cuenta Contable Venta");
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdProductoProductoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoProductoCuentaContable.setToolTipText("Buscar Por Producto ");
		this.jButtonFK_IdProductoProductoCuentaContable= new JButtonMe();
		this.jButtonFK_IdProductoProductoCuentaContable.setText("Buscar");
		this.jButtonFK_IdProductoProductoCuentaContable.setToolTipText("Buscar Por Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoProductoCuentaContable,"buscar_button","Buscar Por Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_productoFK_IdProductoProductoCuentaContable = new JLabelMe();
		jLabelid_productoFK_IdProductoProductoCuentaContable.setText("Producto :");
		jLabelid_productoFK_IdProductoProductoCuentaContable.setToolTipText("Producto");
		jLabelid_productoFK_IdProductoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_productoFK_IdProductoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_productoFK_IdProductoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_productoFK_IdProductoProductoCuentaContable= new JComboBoxMe();
		jComboBoxid_productoFK_IdProductoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoFK_IdProductoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoFK_IdProductoProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable= new JButtonMe();
		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable.setFocusable(false);


		this.jTabbedPaneBusquedasProductoCuentaContable=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoCuentaContable.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProductoCuentaContable.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProductoCuentaContable.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoCuentaContable = new ProductoCuentaContableDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Cuenta Contable DATOS");
			this.jInternalFrameDetalleFormProductoCuentaContable = new ProductoCuentaContableDetalleFormJInternalFrame(jDesktopPane,this.productocuentacontableSessionBean.getConGuardarRelaciones(),this.productocuentacontableSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoCuentaContable = null;//new ProductoCuentaContableDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoCuentaContable= new GridBagLayout();
		
		
		this.jTableDatosProductoCuentaContable = new JTableMe();      
		
		String sToolTipProductoCuentaContable="";
		sToolTipProductoCuentaContable=ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoCuentaContable+="(Inventario.ProductoCuentaContable)";
		}
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoCuentaContable+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoCuentaContable.setToolTipText(sToolTipProductoCuentaContable);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoCuentaContable);
		this.jTableDatosProductoCuentaContable.setAutoCreateRowSorter(true);
		this.jTableDatosProductoCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoCuentaContable.setRowSelectionAllowed(true);
		this.jTableDatosProductoCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoCuentaContable,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoCuentaContable = new JButtonMe();
		this.jButtonDuplicarProductoCuentaContable = new JButtonMe();
		this.jButtonCopiarProductoCuentaContable = new JButtonMe();
		this.jButtonVerFormProductoCuentaContable = new JButtonMe();
		this.jButtonNuevoRelacionesProductoCuentaContable = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoCuentaContable = new JButtonMe();
		this.jButtonCerrarProductoCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosProductoCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoCuentaContable = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Cuenta Contable";
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesProductoCuentaContable.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoCuentaContable=new ReporteDinamicoJInternalFrame(ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoCuentaContable();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoCuentaContable=new ImportacionJInternalFrame(ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoCuentaContable();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoCuentaContable = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoCuentaContable.setText("Orden");
		this.jButtonAbrirOrderByProductoCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoCuentaContable,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCuentaContable,false,this);
			
			//this.cargarOrderByProductoCuentaContable(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCuentaContable,true,this);
			
			//this.cargarOrderByProductoCuentaContable(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoCuentaContable.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosProductoCuentaContable.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosProductoCuentaContable.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosProductoCuentaContable.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoCuentaContable.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoCuentaContable.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoCuentaContable.setText("Nuevo");
		this.jButtonDuplicarProductoCuentaContable.setText("Duplicar");
		this.jButtonCopiarProductoCuentaContable.setText("Copiar");
		this.jButtonVerFormProductoCuentaContable.setText("Ver");
		this.jButtonNuevoRelacionesProductoCuentaContable.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoCuentaContable.setText("Guardar");
		this.jButtonCerrarProductoCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoCuentaContable,"nuevo_button","Nuevo",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoCuentaContable,"duplicar_button","Duplicar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoCuentaContable,"copiar_button","Copiar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoCuentaContable,"ver_form","Ver",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoCuentaContable,"nuevorelaciones_button","Nuevo Rel",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoCuentaContable,"guardarcambiostabla_button","Guardar",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoCuentaContable,"cerrar_button","Salir",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoCuentaContable.setToolTipText("Nuevo"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoCuentaContable.setToolTipText("Duplicar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoCuentaContable.setToolTipText("Copiar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoCuentaContable.setToolTipText("Ver"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoCuentaContable.setToolTipText("Nuevo Rel"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoCuentaContable.setToolTipText("Guardar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoCuentaContable.setToolTipText("Salir"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoCuentaContable";
		inputMap = this.jButtonNuevoProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoCuentaContable"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoCuentaContable";
		inputMap = this.jButtonDuplicarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoCuentaContable"));
		
		//COPIAR
		sMapKey = "CopiarProductoCuentaContable";
		inputMap = this.jButtonCopiarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoCuentaContable"));
		
		//VEr FORM
		sMapKey = "VerFormProductoCuentaContable";
		inputMap = this.jButtonVerFormProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoCuentaContable"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoCuentaContable";
		inputMap = this.jButtonNuevoRelacionesProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoCuentaContable"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoCuentaContable";
		inputMap = this.jButtonModificarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoCuentaContable"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoCuentaContable";
		inputMap = this.jButtonCerrarProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoCuentaContable"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoCuentaContable.setName("jPanelParametrosReportesProductoCuentaContable"); 
		
		this.jPanelParametrosReportesAccionesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoCuentaContable.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoCuentaContable.setName("jPanelParametrosReportesAccionesProductoCuentaContable"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoCuentaContable = new JButtonMe();
		this.jButtonRecargarInformacionProductoCuentaContable.setText("Recargar");
		this.jButtonRecargarInformacionProductoCuentaContable.setToolTipText("Recargar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoCuentaContable,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoCuentaContable = new JButtonMe();
		this.jButtonProcesarInformacionProductoCuentaContable.setText("Procesar");
		this.jButtonProcesarInformacionProductoCuentaContable.setToolTipText("Procesar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoCuentaContable.setVisible(false);
			
		this.jButtonProcesarInformacionProductoCuentaContable.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoCuentaContable.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoCuentaContable.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCuentaContable.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoCuentaContable.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCuentaContable.setText("TIPO");       
		this.jComboBoxTiposReportesProductoCuentaContable.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoCuentaContable.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoCuentaContable.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoCuentaContable.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoCuentaContable.setText("Accion");
		this.jComboBoxTiposRelacionesProductoCuentaContable.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesProductoCuentaContable.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoCuentaContable.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoCuentaContable.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoCuentaContable=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoCuentaContable.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoCuentaContable.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoCuentaContable.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoCuentaContable = new JLabelMe();
		
		this.jLabelAccionesProductoCuentaContable.setText("Acciones");		
		this.jLabelAccionesProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoCuentaContable.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoCuentaContable.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoCuentaContable.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoCuentaContable.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoCuentaContable = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoCuentaContable.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoCuentaContable.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoCuentaContable = new JButtonMe();
		//this.jButtonAnterioresProductoCuentaContable.setText("<<");
        this.jButtonAnterioresProductoCuentaContable.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoCuentaContable,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoCuentaContable = new JButtonMe();
		//this.jButtonSiguientesProductoCuentaContable.setText(">>");
        this.jButtonSiguientesProductoCuentaContable.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoCuentaContable,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoCuentaContable = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoCuentaContable.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoCuentaContable.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoCuentaContable,"nuevoguardarcambios_button","Nue",this.productocuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoCuentaContable";
		inputMap = this.jButtonNuevoGuardarCambiosProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoCuentaContable"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoCuentaContable";
		inputMap = this.jButtonRecargarInformacionProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoCuentaContable"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoCuentaContable";
		inputMap = this.jButtonSiguientesProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoCuentaContable"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoCuentaContable";
		inputMap = this.jButtonAnterioresProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoCuentaContable"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoCuentaContable();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoCuentaContable.setMinimumSize(new Dimension(this.getWidth(),ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoCuentaContable.setMaximumSize(new Dimension(this.getWidth(),ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoCuentaContable.setPreferredSize(new Dimension(this.getWidth(),ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoCuentaContableBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoCuentaContable = new GridBagLayout();

			this.jPanelPaginacionProductoCuentaContable.setLayout(gridaBagLayoutPaginacionProductoCuentaContable);						
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 0;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonAnterioresProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					
						
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoCuentaContable.gridy = 0;
			
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonNuevoGuardarCambiosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
						
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoCuentaContable.gridy = 0;
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonSiguientesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 1;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonNuevoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
						
			
			
			if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoCuentaContable.gridy = 1;
				this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoCuentaContable.add(this.jButtonGuardarCambiosTablaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			}
			
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 1;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonDuplicarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 1;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonCopiarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 1;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonVerFormProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 1;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoCuentaContable.add(this.jButtonCerrarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
		
		
		this.jButtonRecargarInformacionProductoCuentaContable.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoCuentaContable.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoCuentaContable.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoCuentaContable.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoCuentaContable.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoCuentaContable.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoCuentaContable.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoCuentaContable.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoCuentaContable.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoCuentaContable.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoCuentaContable.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoCuentaContable.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoCuentaContable.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoCuentaContable.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoCuentaContable.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoCuentaContable.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoCuentaContable.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoCuentaContable.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoCuentaContable = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoCuentaContable = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoCuentaContable = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoCuentaContable.setLayout(gridaBagParametrosReportesProductoCuentaContable);
			this.jPanelParametrosReportesAccionesProductoCuentaContable.setLayout(gridaBagParametrosReportesAccionesProductoCuentaContable);
			
			
			this.jPanelParametrosAuxiliar1ProductoCuentaContable.setLayout(gridaBagParametrosAuxiliar1ProductoCuentaContable);
			this.jPanelParametrosAuxiliar2ProductoCuentaContable.setLayout(gridaBagParametrosAuxiliar2ProductoCuentaContable);
			this.jPanelParametrosAuxiliar3ProductoCuentaContable.setLayout(gridaBagParametrosAuxiliar3ProductoCuentaContable);
			this.jPanelParametrosAuxiliar4ProductoCuentaContable.setLayout(gridaBagParametrosAuxiliar4ProductoCuentaContable);
			//this.jPanelParametrosAuxiliar5ProductoCuentaContable.setLayout(gridaBagParametrosAuxiliar2ProductoCuentaContable);			
			
			
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jButtonRecargarInformacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCuentaContable.add(this.jComboBoxTiposPaginacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCuentaContable.add(this.jCheckBoxConAltoMaximoTablaProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoCuentaContable.add(this.jComboBoxTiposArchivosReportesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jPanelParametrosAuxiliar1ProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoCuentaContable.add(this.jComboBoxTiposReportesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jPanelParametrosAuxiliar4ProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jComboBoxTiposReportesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jCheckBoxGenerarReporteProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jPanelParametrosAuxiliar2ProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jLabelAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoCuentaContable.add(this.jButtonAbrirOrderByProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jComboBoxTiposSeleccionarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			
			
			/*
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jCheckBoxSeleccionarTodosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoCuentaContable.add(this.jCheckBoxSeleccionarTodosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);															
				
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoCuentaContable.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoCuentaContable.add(this.jCheckBoxSeleccionadosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jPanelParametrosAuxiliar3ProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jComboBoxTiposAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
	
				
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoCuentaContable.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoCuentaContable.add(this.jTextFieldValorCampoGeneralProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoCuentaContable = new GridBagLayout();

			this.jScrollPanelDatosProductoCuentaContable.setLayout(gridaBagLayoutDatosProductoCuentaContable);
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = 0;
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;
			
			this.jScrollPanelDatosProductoCuentaContable.add(this.jTableDatosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoCuentaContable.setViewportView(this.jTableDatosProductoCuentaContable);
		this.jTableDatosProductoCuentaContable.setFillsViewportHeight(true);
		this.jTableDatosProductoCuentaContable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoCuentaContable= new GridBagLayout();
		this.jPanelAccionesProductoCuentaContable.setLayout(gridaBagLayoutAccionesProductoCuentaContable);
		
		
		/*	
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = 0;
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
			
		this.jPanelAccionesProductoCuentaContable.add(this.jButtonNuevoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdBodegaProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdBodegaProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdBodegaProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdBodegaProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdBodegaProductoCuentaContable.setLayout(gridaBagLayoutFK_IdBodegaProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdBodegaProductoCuentaContable.add(jLabelid_bodegaFK_IdBodegaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdBodegaProductoCuentaContable.add(jComboBoxid_bodegaFK_IdBodegaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdBodegaProductoCuentaContable.add(jButtonFK_IdBodegaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("1.-Por Bodega ", jPanelFK_IdBodegaProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCentroCostoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCentroCostoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCentroCostoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCentroCostoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCentroCostoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCentroCostoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCentroCostoProductoCuentaContable.add(jLabelid_centro_costoFK_IdCentroCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCentroCostoProductoCuentaContable.add(jComboBoxid_centro_costoFK_IdCentroCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCentroCostoProductoCuentaContable.add(jButtonFK_IdCentroCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("2.-Por Centro Costo ", jPanelFK_IdCentroCostoProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCostoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableCostoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableCostoProductoCuentaContable.add(jLabelid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableCostoProductoCuentaContable.add(jComboBoxid_cuenta_contable_costoFK_IdCuentaContableCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableCostoProductoCuentaContable.add(jButtonFK_IdCuentaContableCostoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("3.-Por Cuenta Contable Costo ", jPanelFK_IdCuentaContableCostoProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableCreditoProductoCuentaContable.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableCreditoProductoCuentaContable.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableCreditoProductoCuentaContable.add(jButtonFK_IdCuentaContableCreditoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("4.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableDebitoProductoCuentaContable.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableDebitoProductoCuentaContable.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableDebitoProductoCuentaContable.add(jButtonFK_IdCuentaContableDebitoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("5.-Por Cuenta Contable Debito ", jPanelFK_IdCuentaContableDebitoProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDescuentoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableDescuentoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableDescuentoProductoCuentaContable.add(jLabelid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableDescuentoProductoCuentaContable.add(jComboBoxid_cuenta_contable_descuentoFK_IdCuentaContableDescuentoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableDescuentoProductoCuentaContable.add(jButtonFK_IdCuentaContableDescuentoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("6.-Por Cuenta Contable Descuento ", jPanelFK_IdCuentaContableDescuentoProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDevolucionProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableDevolucionProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableDevolucionProductoCuentaContable.add(jLabelid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableDevolucionProductoCuentaContable.add(jComboBoxid_cuenta_contable_devolucionFK_IdCuentaContableDevolucionProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableDevolucionProductoCuentaContable.add(jButtonFK_IdCuentaContableDevolucionProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("7.-Por Cuenta Contable Devolucion ", jPanelFK_IdCuentaContableDevolucionProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableInventarioProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableInventarioProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableInventarioProductoCuentaContable.add(jLabelid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableInventarioProductoCuentaContable.add(jComboBoxid_cuenta_contable_inventarioFK_IdCuentaContableInventarioProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableInventarioProductoCuentaContable.add(jButtonFK_IdCuentaContableInventarioProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("8.-Por Cuenta Contable Inventario ", jPanelFK_IdCuentaContableInventarioProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableVentaProductoCuentaContable.setLayout(gridaBagLayoutFK_IdCuentaContableVentaProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdCuentaContableVentaProductoCuentaContable.add(jLabelid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdCuentaContableVentaProductoCuentaContable.add(jComboBoxid_cuenta_contable_ventaFK_IdCuentaContableVentaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdCuentaContableVentaProductoCuentaContable.add(jButtonFK_IdCuentaContableVentaProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("9.-Por Cuenta Contable Venta ", jPanelFK_IdCuentaContableVentaProductoCuentaContable);
		jTabbedPaneBusquedasProductoCuentaContable.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdProductoProductoCuentaContable= new GridBagLayout();
		gridaBagLayoutFK_IdProductoProductoCuentaContable.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoCuentaContable.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoProductoCuentaContable.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoProductoCuentaContable.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoProductoCuentaContable.setLayout(gridaBagLayoutFK_IdProductoProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdProductoProductoCuentaContable.add(jLabelid_productoFK_IdProductoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 1;
		jPanelFK_IdProductoProductoCuentaContable.add(jComboBoxid_productoFK_IdProductoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);


		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoCuentaContable.gridy = 0;
		gridBagConstraintsProductoCuentaContable.gridx = 0;
		jPanelFK_IdProductoProductoCuentaContable.add(this.jButtonBuscarFK_IdProductoid_productoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoCuentaContable.gridy = 1;
		gridBagConstraintsProductoCuentaContable.gridx =1;
		jPanelFK_IdProductoProductoCuentaContable.add(jButtonFK_IdProductoProductoCuentaContable, gridBagConstraintsProductoCuentaContable);

		jTabbedPaneBusquedasProductoCuentaContable.addTab("10.-Por Producto ", jPanelFK_IdProductoProductoCuentaContable);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoCuentaContable);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;		
			//this.gridBagConstraintsProductoCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoCuentaContable.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;		
		//this.gridBagConstraintsProductoCuentaContable.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoCuentaContable.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoCuentaContable);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoCuentaContable.gridx = 0;		
			this.gridBagConstraintsProductoCuentaContable.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoCuentaContable.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);								
		
		
		/*
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		*/		
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoCuentaContable.gridx =0;
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
				
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoCuentaContable= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoCuentaContable = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoCuentaContable.setLayout(gridaBagLayoutBusquedasParametrosProductoCuentaContable);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
			
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoCuentaContable;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoCuentaContable() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoCuentaContable.setName("jPanelReporteDinamicoProductoCuentaContable"); 
		
		this.jPanelReporteDinamicoProductoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoCuentaContable.setLayout(gridaBagLayoutReporteDinamicoProductoCuentaContable);
		
		
		this.jInternalFrameReporteDinamicoProductoCuentaContable= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoCuentaContable.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoCuentaContable.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoCuentaContable.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoCuentaContable.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoCuentaContable = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoCuentaContable.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jLabelColumnasSelectReporteProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoCuentaContable = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoCuentaContable=new JScrollPane(this.jListColumnasSelectReporteProductoCuentaContable);
			
			this.jScrollColumnasSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoCuentaContable.add(this.jListColumnasSelectReporteProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jScrollColumnasSelectReporteProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoCuentaContable = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoCuentaContable.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoCuentaContable = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoCuentaContable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoCuentaContable.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoCuentaContable=new JScrollPane(this.jListRelacionesSelectReporteProductoCuentaContable);
			
			this.jScrollRelacionesSelectReporteProductoCuentaContable.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoCuentaContable.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoCuentaContable.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoCuentaContable = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoCuentaContable = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoCuentaContable = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoCuentaContable.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jLabelGenerarExcelReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoCuentaContable = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoCuentaContable.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoCuentaContable,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoCuentaContable.setToolTipText("Generar EXCEL"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoCuentaContable.add(this.jButtonGenerarExcelReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jComboBoxTiposReportesDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jLabelTiposArchivoReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jComboBoxTiposArchivosReportesDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoCuentaContable = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoCuentaContable.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoCuentaContable,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoCuentaContable.setToolTipText("Generar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jButtonGenerarReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoCuentaContable = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoCuentaContable.setToolTipText("Cancelar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoCuentaContable.add(this.jButtonCerrarReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoCuentaContable = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoCuentaContable= new JScrollPane(jPanelReporteDinamicoProductoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoCuentaContable.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoCuentaContable.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoCuentaContable.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoCuentaContable.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoCuentaContable);
		this.jInternalFrameReporteDinamicoProductoCuentaContable.getContentPane().add(this.jScrollPanelReporteDinamicoProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoCuentaContable() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoCuentaContable = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoCuentaContable.setName("jPanelImportacionProductoCuentaContable"); 
		
		this.jPanelImportacionProductoCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoCuentaContable.setLayout(gridaBagLayoutImportacionProductoCuentaContable);
		
		
		this.jInternalFrameImportacionProductoCuentaContable= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoCuentaContable= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoCuentaContable = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoCuentaContable= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoCuentaContable.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionProductoCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionProductoCuentaContable.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoCuentaContable.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoCuentaContable.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoCuentaContable.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoCuentaContable.setResizable(true);
	    this.jInternalFrameImportacionProductoCuentaContable.setClosable(true);
	    this.jInternalFrameImportacionProductoCuentaContable.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoCuentaContable.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoCuentaContable.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoCuentaContable.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoCuentaContable = new JLabelMe();

		this.jLabelArchivoImportacionProductoCuentaContable.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoCuentaContable.add(this.jLabelArchivoImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoCuentaContable = new JFileChooser();		
		this.jFileChooserImportacionProductoCuentaContable.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoCuentaContable = new JButtonMe();
		this.jButtonAbrirImportacionProductoCuentaContable.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoCuentaContable,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoCuentaContable.setToolTipText("Generar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCuentaContable.add(this.jButtonAbrirImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoCuentaContable = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoCuentaContable.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoCuentaContable.add(this.jLabelPathArchivoImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoCuentaContable=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoCuentaContable.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoCuentaContable.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoCuentaContable.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCuentaContable.add(this.jTextFieldPathArchivoImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoCuentaContable = new JButtonMe();
		this.jButtonGenerarImportacionProductoCuentaContable.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoCuentaContable,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoCuentaContable.setToolTipText("Generar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCuentaContable.add(this.jButtonGenerarImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoCuentaContable = new JButtonMe();
		this.jButtonCerrarImportacionProductoCuentaContable.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoCuentaContable,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoCuentaContable.setToolTipText("Cancelar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoCuentaContable.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoCuentaContable.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoCuentaContable.add(this.jButtonCerrarImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoCuentaContable = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoCuentaContable= new JScrollPane(jPanelImportacionProductoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsProductoCuentaContable.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoCuentaContable.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoCuentaContable.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoCuentaContable);
		this.jInternalFrameImportacionProductoCuentaContable.getContentPane().add(this.jScrollPanelImportacionProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoCuentaContable(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoCuentaContable = new JButtonMe();
			this.jButtonAbrirOrderByProductoCuentaContable.setText("Orden");
			this.jButtonAbrirOrderByProductoCuentaContable.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoCuentaContable,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoCuentaContable";
			inputMap = this.jButtonAbrirOrderByProductoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoCuentaContable"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoCuentaContable = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoCuentaContable.setName("jPanelOrderByProductoCuentaContable"); 
			
			this.jPanelOrderByProductoCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoCuentaContable.setLayout(gridaBagLayoutOrderByProductoCuentaContable);
			
			
			this.jTableDatosProductoCuentaContableOrderBy = new JTableMe();        
			this.jTableDatosProductoCuentaContableOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoCuentaContableOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoCuentaContableOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoCuentaContableOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoCuentaContableOrderBy.setViewportView(this.jTableDatosProductoCuentaContableOrderBy);
			this.jTableDatosProductoCuentaContableOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoCuentaContableOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoCuentaContable= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoCuentaContable= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoCuentaContable = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoCuentaContable= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoCuentaContable.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoCuentaContable.setTitle("Orden");
			this.jInternalFrameOrderByProductoCuentaContable.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoCuentaContable.setResizable(true);
			this.jInternalFrameOrderByProductoCuentaContable.setClosable(true);
			this.jInternalFrameOrderByProductoCuentaContable.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoCuentaContable.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoCuentaContable.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoCuentaContable.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Cuenta Contables"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoCuentaContable.ipady =150;
				
			this.jPanelOrderByProductoCuentaContable.add(jScrollPanelDatosProductoCuentaContableOrderBy, this.gridBagConstraintsProductoCuentaContable);//this.jTableDatosProductoCuentaContableTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoCuentaContable = new JButtonMe();
			this.jButtonCerrarOrderByProductoCuentaContable.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoCuentaContable,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoCuentaContable.setToolTipText("Cancelar"+" "+ProductoCuentaContableConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoCuentaContable.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoCuentaContable.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoCuentaContable.add(this.jButtonCerrarOrderByProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoCuentaContable = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoCuentaContable= new JScrollPane(jPanelOrderByProductoCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsProductoCuentaContable.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoCuentaContable.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoCuentaContable.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoCuentaContable.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoCuentaContable.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoCuentaContable);
			
			this.jInternalFrameOrderByProductoCuentaContable.getContentPane().add(this.jScrollPanelOrderByProductoCuentaContable, this.gridBagConstraintsProductoCuentaContable);			
		
		} else {
			this.jButtonAbrirOrderByProductoCuentaContable = new JButtonMe();
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
		int iWidthTableCalculado=0;//2530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productocuentacontableSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoCuentaContable.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoCuentaContable.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoCuentaContable.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoCuentaContable.getRowHeight();//ProductoCuentaContableConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.isSelected()) {
					iHeightTable=ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoCuentaContable.isSelected()) {
					iHeightTable=ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoCuentaContableConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoCuentaContable.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoCuentaContable.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoCuentaContable.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoCuentaContable!=null && this.jInternalFrameOrderByProductoCuentaContable.getjTableDatosOrderBy()!=null) {
			//if(!this.productocuentacontableSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoCuentaContable.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoCuentaContable.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoCuentaContable.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoCuentaContable.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoCuentaContable.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoCuentaContable.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoCuentaContable.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoCuentaContable.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoCuentaContable.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoCuentaContable.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productocuentacontableLogic.getProductoCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productocuentacontables.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoCuentaContable> TraerProductoCuentaContableBeans(List<ProductoCuentaContable> productocuentacontables,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoCuentaContable productocuentacontable:productocuentacontables) {
					
				if(!(ProductoCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productocuentacontable.setsDetalleGeneralEntityReporte(ProductoCuentaContableConstantesFunciones.getProductoCuentaContableDescripcion(productocuentacontable));
										
						
					
						
					
				} else  {
							
					//productocuentacontable.setsDetalleGeneralEntityReporte(productocuentacontable.getsDetalleGeneralEntityReporte());
										
				}
				
				//productocuentacontablebeans.add(productocuentacontablebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productocuentacontables;
    }
	//PARA REPORTES FIN
}
