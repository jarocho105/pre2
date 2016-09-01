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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduGastoConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class ProductoOrdenDetaProduGastoJInternalFrame extends ProductoOrdenDetaProduGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoOrdenDetaProduGasto;
	
	protected JMenuBar jmenuBarProductoOrdenDetaProduGasto;
	
	protected JMenu jmenuProductoOrdenDetaProduGasto;
	protected JMenu jmenuDatosProductoOrdenDetaProduGasto;
	protected JMenu jmenuArchivoProductoOrdenDetaProduGasto;
	protected JMenu jmenuAccionesProductoOrdenDetaProduGasto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduGasto;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduGasto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoOrdenDetaProduGastoDetalleFormJInternalFrame jInternalFrameDetalleFormProductoOrdenDetaProduGasto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoOrdenDetaProduGasto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoGastoProduEmpresaBeanSwingJInternalFrame tipogastoproduempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogastoproduempresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected ClienteBeanSwingJInternalFrame clienteproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduGastoSessionBean productoordendetaprodugastoSessionBean;
		
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos;		
	public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosEliminados;	
	public List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoOrdenDetaProduGasto;		
	protected JButton jButtonAbrirOrderByProductoOrdenDetaProduGasto;
	
	
	//protected JPanel jPanelOrderByProductoOrdenDetaProduGasto;
	//public JScrollPane jScrollPanelOrderByProductoOrdenDetaProduGasto;	
	//protected JButton jButtonCerrarOrderByProductoOrdenDetaProduGasto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoOrdenDetaProduGastoLogic productoordendetaprodugastoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduGasto;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduGasto;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduGasto;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrdenDetaProduGastoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto;
	//public JScrollPane jScrollPanelImportacionProductoOrdenDetaProduGasto;
	
	
	
	protected JPanel jPanelAccionesProductoOrdenDetaProduGasto;
	
    protected JPanel jPanelPaginacionProductoOrdenDetaProduGasto;
    protected JPanel jPanelParametrosReportesProductoOrdenDetaProduGasto;
	protected JPanel jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto;
	protected JPanel jPanelParametrosAuxiliar2ProductoOrdenDetaProduGasto;
	protected JPanel jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto;
	protected JPanel jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto;
	//protected JPanel jPanelParametrosAuxiliar5ProductoOrdenDetaProduGasto;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoOrdenDetaProduGasto;
	//protected JPanel jPanelImportacionProductoOrdenDetaProduGasto;
	
	
	public JTable jTableDatosProductoOrdenDetaProduGasto;
	
	
	
	//public JTable jTableDatosProductoOrdenDetaProduGastoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoOrdenDetaProduGasto;
	protected JButton jButtonDuplicarProductoOrdenDetaProduGasto;
	protected JButton jButtonCopiarProductoOrdenDetaProduGasto;
	protected JButton jButtonVerFormProductoOrdenDetaProduGasto;
	protected JButton jButtonNuevoRelacionesProductoOrdenDetaProduGasto;
	protected JButton jButtonModificarProductoOrdenDetaProduGasto;
	
    protected JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto;
	protected JButton jButtonCerrarProductoOrdenDetaProduGasto;
	
	
	protected JButton jButtonRecargarInformacionProductoOrdenDetaProduGasto;
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	
	
	protected JButton jButtonAnterioresProductoOrdenDetaProduGasto;
	protected JButton jButtonSiguientesProductoOrdenDetaProduGasto;
	protected JButton jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto;
	//protected JButton jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoOrdenDetaProduGasto;
	//protected JButton jButtonGenerarImportacionProductoOrdenDetaProduGasto;
	//protected JButton jButtonCerrarImportacionProductoOrdenDetaProduGasto;
	//protected JFileChooser jFileChooserImportacionProductoOrdenDetaProduGasto;
	//protected File fileImportacionProductoOrdenDetaProduGasto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonDuplicarToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonCopiarToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonVerFormToolBarProductoOrdenDetaProduGasto;
	public JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduGasto;
	
	protected JButton jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonAnterioresToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonSiguientesToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto;
	protected JButton jButtonAbrirOrderByToolBarProductoOrdenDetaProduGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDuplicarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemCopiarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemVerFormProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemAnterioresProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemSiguientesProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemAbrirOrderByProductoOrdenDetaProduGasto;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduGasto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto;
	protected JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduGasto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto;
	protected JCheckBox jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoOrdenDetaProduGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto;
	protected JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoOrdenDetaProduGasto;
	//public JList<Reporte> jListColumnasSelectReporteProductoOrdenDetaProduGasto;
	//public JScrollPane jScrollColumnasSelectReporteProductoOrdenDetaProduGasto;
	
	//public JLabel jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto;
	//public JList<Reporte> jListRelacionesSelectReporteProductoOrdenDetaProduGasto;
	//public JScrollPane jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoOrdenDetaProduGasto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto;
	
		
	//public JLabel jLabelArchivoImportacionProductoOrdenDetaProduGasto;	
	//public JLabel jLabelPathArchivoImportacionProductoOrdenDetaProduGasto;
	//protected JTextField jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto;
	
	//public JLabel jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto;
	
	//public JLabel jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto;
	//public JList<Reporte> jListColumnasValoresGraficoProductoOrdenDetaProduGasto;
	//public JScrollPane jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdFacturaProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdFacturaProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto;
	public JPanel jPanelFK_IdUnidadProductoOrdenDetaProduGasto;
	public JButton jButtonFK_IdUnidadProductoOrdenDetaProduGasto;
	
	public JPanel jPanelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto;
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto;
	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGastoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGastoArbol= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto;
	public JLabel jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto;
	public JButton jButtonid_facturaFK_IdFacturaProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto;
	
	public JPanel jPanelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto;
	public JLabel jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto;
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto;
	public JLabel jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto;
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto;
	public JLabel jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto;
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduGasto= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoOrdenDetaProduGastoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoOrdenDetaProduGastoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduGastoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoOrdenDetaProduGasto)	{
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto = jButtonRecargarInformacionProductoOrdenDetaProduGasto;
	}
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduGasto() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduGasto)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto = jButtonProcesarInformacionProductoOrdenDetaProduGasto;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoOrdenDetaProduGasto() {
		return this.jButtonRecargarInformacionProductoOrdenDetaProduGasto;
	}
	
	
	public List<ProductoOrdenDetaProduGasto> getproductoordendetaprodugastos() {
		return this.productoordendetaprodugastos;
	}

	public void setproductoordendetaprodugastos(List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos) {
		this.productoordendetaprodugastos = productoordendetaprodugastos;
	}
	
	public List<ProductoOrdenDetaProduGasto> getproductoordendetaprodugastosAux() {
		return this.productoordendetaprodugastosAux;
	}

	public void setproductoordendetaprodugastosAux(List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosAux) {
		this.productoordendetaprodugastosAux = productoordendetaprodugastosAux;
	}
	
	public List<ProductoOrdenDetaProduGasto> getproductoordendetaprodugastosEliminados() {
		return this.productoordendetaprodugastosEliminados;
	}

	public void setProductoOrdenDetaProduGastosEliminados(List<ProductoOrdenDetaProduGasto> productoordendetaprodugastosEliminados) {
		this.productoordendetaprodugastosEliminados = productoordendetaprodugastosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoOrdenDetaProduGasto() {
		return jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto = jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoOrdenDetaProduGasto() {
		return jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto;
	}

	public void setjTextFieldValorCampoGeneralProductoOrdenDetaProduGasto(
			JTextField jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto) {
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto = jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto;
	}

	public void setBorderResaltarValorCampoGeneralProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto() {
		return this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto;
	}

	public void setjCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto(
			JCheckBox jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto) {
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto = jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto;
	}

	public void setBorderResaltarSeleccionarTodosProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoOrdenDetaProduGasto() {
		return this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto;
	}

	public void setjCheckBoxSeleccionadosProductoOrdenDetaProduGasto(
			JCheckBox jCheckBoxSeleccionadosProductoOrdenDetaProduGasto) {
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto = jCheckBoxSeleccionadosProductoOrdenDetaProduGasto;
	}
	
	public void setBorderResaltarSeleccionadosProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto = jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto;
	}

	public void setBorderResaltarTiposArchivosReportesProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposReportesProductoOrdenDetaProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposReportesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto = jComboBoxTiposReportesProductoOrdenDetaProduGasto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto() {
	//	return jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto) {
	//	this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto = jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto = jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto;
	//}
	
	public void setBorderResaltarTiposReportesProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto = jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposPaginacionProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto = jComboBoxTiposPaginacionProductoOrdenDetaProduGasto;
	}
	
	public void setBorderResaltarTiposPaginacionProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduGasto() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto = jComboBoxTiposRelacionesProductoOrdenDetaProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduGasto(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduGasto) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto = jComboBoxTiposAccionesProductoOrdenDetaProduGasto;
	}
	
	public void setBorderResaltarTiposRelacionesProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoOrdenDetaProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto() {
	//	return jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto) {
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto = jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoOrdenDetaProduGasto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoOrdenDetaProduGasto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto .setBorder(borderResaltar);		
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
		this.productoordendetaprodugastoSessionBean=new ProductoOrdenDetaProduGastoSessionBean();
		
		this.productoordendetaprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden  Gasto MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoOrdenDetaProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoOrdenDetaProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoOrdenDetaProduGasto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"nuevo","nuevo","Nuevo"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"duplicar","duplicar","Duplicar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"copiar","copiar","Copiar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"ver_form","ver_form","Ver"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"recargar","recargar","Recargar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoOrdenDetaProduGasto,this.jTtoolBarProductoOrdenDetaProduGasto,
							"cerrar","cerrar","Salir"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoOrdenDetaProduGasto;
			
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduGasto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduGasto;
				
		//protected JButton jButtonModificarToolBarProductoOrdenDetaProduGasto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoOrdenDetaProduGasto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoOrdenDetaProduGasto=new JMenuMe("General");
		this.jmenuArchivoProductoOrdenDetaProduGasto=new JMenuMe("Archivo");
		this.jmenuAccionesProductoOrdenDetaProduGasto=new JMenuMe("Acciones");
		this.jmenuDatosProductoOrdenDetaProduGasto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoOrdenDetaProduGasto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoOrdenDetaProduGasto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoOrdenDetaProduGasto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoOrdenDetaProduGasto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoOrdenDetaProduGasto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoOrdenDetaProduGasto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoOrdenDetaProduGasto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoOrdenDetaProduGasto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoOrdenDetaProduGasto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduGasto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoOrdenDetaProduGasto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoOrdenDetaProduGasto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoOrdenDetaProduGasto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoOrdenDetaProduGasto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoOrdenDetaProduGasto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoOrdenDetaProduGasto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoOrdenDetaProduGasto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoOrdenDetaProduGasto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoOrdenDetaProduGasto.add(this.jMenuItemCerrarProductoOrdenDetaProduGasto);
			
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemNuevoProductoOrdenDetaProduGasto);
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduGasto);
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemNuevoRelacionesProductoOrdenDetaProduGasto);
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProduGasto);		
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemDuplicarProductoOrdenDetaProduGasto);		
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemCopiarProductoOrdenDetaProduGasto);		
			this.jmenuAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemVerFormProductoOrdenDetaProduGasto);		
			
			this.jmenuDatosProductoOrdenDetaProduGasto.add(this.jMenuItemRecargarInformacionProductoOrdenDetaProduGasto);				
			this.jmenuDatosProductoOrdenDetaProduGasto.add(this.jMenuItemAnterioresProductoOrdenDetaProduGasto);				
			this.jmenuDatosProductoOrdenDetaProduGasto.add(this.jMenuItemSiguientesProductoOrdenDetaProduGasto);				
			this.jmenuDatosProductoOrdenDetaProduGasto.add(this.jMenuItemAbrirOrderByProductoOrdenDetaProduGasto);				
			this.jmenuDatosProductoOrdenDetaProduGasto.add(this.jMenuItemMostrarOcultarProductoOrdenDetaProduGasto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoOrdenDetaProduGasto.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoOrdenDetaProduGasto.add(this.jmenuArchivoProductoOrdenDetaProduGasto);		
			this.jmenuBarProductoOrdenDetaProduGasto.add(this.jmenuAccionesProductoOrdenDetaProduGasto);		
			this.jmenuBarProductoOrdenDetaProduGasto.add(this.jmenuDatosProductoOrdenDetaProduGasto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoOrdenDetaProduGasto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoOrdenDetaProduGasto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cliente Proveedor ");
		this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cliente Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Cliente Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setText("Cliente Proveedor :");
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setToolTipText("Cliente Proveedor");
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cuenta Contable Debito ");
		this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Cuenta Contable Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Cuenta Contable Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setText("Cuenta Contable Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setToolTipText("Cuenta Contable Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setText("Factura :");
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto.setFocusable(false);

		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Orden Deta Produ ");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Orden Deta Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Orden Deta Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setText("Orden Deta Produ :");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setToolTipText("Orden Deta Produ");
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Tipo Gasto Produ Empresa ");
		this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Tipo Gasto Produ Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Tipo Gasto Produ Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setText("Tipo Gasto Produ Empresa :");
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setToolTipText("Tipo Gasto Produ Empresa");
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto= new JButtonMe();
		this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto.setText("Buscar");
		this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoOrdenDetaProduGasto = new ProductoOrdenDetaProduGastoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Orden  Gasto DATOS");
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto = new ProductoOrdenDetaProduGastoDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones(),this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoOrdenDetaProduGasto = null;//new ProductoOrdenDetaProduGastoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduGasto= new GridBagLayout();
		
		
		this.jTableDatosProductoOrdenDetaProduGasto = new JTableMe();      
		
		String sToolTipProductoOrdenDetaProduGasto="";
		sToolTipProductoOrdenDetaProduGasto=ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduGasto+="(Produccion.ProductoOrdenDetaProduGasto)";
		}
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduGasto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoOrdenDetaProduGasto.setToolTipText(sToolTipProductoOrdenDetaProduGasto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoOrdenDetaProduGasto);
		this.jTableDatosProductoOrdenDetaProduGasto.setAutoCreateRowSorter(true);
		this.jTableDatosProductoOrdenDetaProduGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoOrdenDetaProduGasto.setRowSelectionAllowed(true);
		this.jTableDatosProductoOrdenDetaProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonDuplicarProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonCopiarProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonVerFormProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduGasto = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduGasto = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Orden  Gasto";
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduGasto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoOrdenDetaProduGasto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoOrdenDetaProduGasto=new ImportacionJInternalFrame(ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoOrdenDetaProduGasto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduGasto = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setText("Orden");
		this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,false,this);
			
			//this.cargarOrderByProductoOrdenDetaProduGasto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoOrdenDetaProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,true,this);
			
			//this.cargarOrderByProductoOrdenDetaProduGasto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoOrdenDetaProduGasto.setText("Nuevo");
		this.jButtonDuplicarProductoOrdenDetaProduGasto.setText("Duplicar");
		this.jButtonCopiarProductoOrdenDetaProduGasto.setText("Copiar");
		this.jButtonVerFormProductoOrdenDetaProduGasto.setText("Ver");
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduGasto,"nuevo_button","Nuevo",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoOrdenDetaProduGasto,"duplicar_button","Duplicar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoOrdenDetaProduGasto,"copiar_button","Copiar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoOrdenDetaProduGasto,"ver_form","Ver",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto,"nuevorelaciones_button","Nuevo Rel",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto,"guardarcambiostabla_button","Guardar",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduGasto,"cerrar_button","Salir",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoOrdenDetaProduGasto.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoOrdenDetaProduGasto.setToolTipText("Duplicar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoOrdenDetaProduGasto.setToolTipText("Copiar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoOrdenDetaProduGasto.setToolTipText("Ver"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.setToolTipText("Nuevo Rel"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduGasto.setToolTipText("Salir"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduGasto"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonDuplicarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoOrdenDetaProduGasto"));
		
		//COPIAR
		sMapKey = "CopiarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCopiarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoOrdenDetaProduGasto"));
		
		//VEr FORM
		sMapKey = "VerFormProductoOrdenDetaProduGasto";
		inputMap = this.jButtonVerFormProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoOrdenDetaProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoOrdenDetaProduGasto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoOrdenDetaProduGasto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonModificarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoOrdenDetaProduGasto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduGasto";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduGasto";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduGasto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setName("jPanelParametrosReportesProductoOrdenDetaProduGasto"); 
		
		this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto.setName("jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.setText("Recargar");
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.setToolTipText("Recargar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoOrdenDetaProduGasto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setText("Procesar");
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setToolTipText("Procesar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setVisible(false);
			
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setText("TIPO");       
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.setText("Accion");
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoOrdenDetaProduGasto = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduGasto.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoOrdenDetaProduGasto = new JButtonMe();
		//this.jButtonAnterioresProductoOrdenDetaProduGasto.setText("<<");
        this.jButtonAnterioresProductoOrdenDetaProduGasto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoOrdenDetaProduGasto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoOrdenDetaProduGasto = new JButtonMe();
		//this.jButtonSiguientesProductoOrdenDetaProduGasto.setText(">>");
        this.jButtonSiguientesProductoOrdenDetaProduGasto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoOrdenDetaProduGasto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto,"nuevoguardarcambios_button","Nue",this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoOrdenDetaProduGasto";
		inputMap = this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoOrdenDetaProduGasto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoOrdenDetaProduGasto";
		inputMap = this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoOrdenDetaProduGasto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoOrdenDetaProduGasto";
		inputMap = this.jButtonSiguientesProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoOrdenDetaProduGasto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoOrdenDetaProduGasto";
		inputMap = this.jButtonAnterioresProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoOrdenDetaProduGasto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoOrdenDetaProduGasto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(this.getWidth(),ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoOrdenDetaProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoOrdenDetaProduGasto = new GridBagLayout();

			this.jPanelPaginacionProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutPaginacionProductoOrdenDetaProduGasto);						
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonAnterioresProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					
						
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
			
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonNuevoGuardarCambiosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
						
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonSiguientesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonNuevoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
						
			
			
			if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			}
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonDuplicarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonCopiarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonVerFormProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoOrdenDetaProduGasto.add(this.jButtonCerrarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoOrdenDetaProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoOrdenDetaProduGasto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoOrdenDetaProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoOrdenDetaProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoOrdenDetaProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoOrdenDetaProduGasto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosReportesProductoOrdenDetaProduGasto);
			this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosReportesAccionesProductoOrdenDetaProduGasto);
			
			
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosAuxiliar1ProductoOrdenDetaProduGasto);
			this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduGasto);
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosAuxiliar3ProductoOrdenDetaProduGasto);
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosAuxiliar4ProductoOrdenDetaProduGasto);
			//this.jPanelParametrosAuxiliar5ProductoOrdenDetaProduGasto.setLayout(gridaBagParametrosAuxiliar2ProductoOrdenDetaProduGasto);			
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jButtonRecargarInformacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto.add(this.jComboBoxTiposPaginacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto.add(this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto.add(this.jComboBoxTiposArchivosReportesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jPanelParametrosAuxiliar1ProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto.add(this.jComboBoxTiposReportesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);																		
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto.add(this.jComboBoxTiposGraficosReportesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jPanelParametrosAuxiliar4ProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jComboBoxTiposReportesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jCheckBoxGenerarReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jPanelParametrosAuxiliar2ProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jLabelAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jButtonAbrirOrderByProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jComboBoxTiposSeleccionarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			
			
			/*
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto.add(this.jCheckBoxSeleccionarTodosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);															
				
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto.add(this.jCheckBoxSeleccionadosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);															
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto.add(this.jCheckBoxConGraficoReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jPanelParametrosAuxiliar3ProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jComboBoxTiposAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	
				
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoOrdenDetaProduGasto.add(this.jTextFieldValorCampoGeneralProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoOrdenDetaProduGasto = new GridBagLayout();

			this.jScrollPanelDatosProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutDatosProductoOrdenDetaProduGasto);
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
			
			this.jScrollPanelDatosProductoOrdenDetaProduGasto.add(this.jTableDatosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setViewportView(this.jTableDatosProductoOrdenDetaProduGasto);
		this.jTableDatosProductoOrdenDetaProduGasto.setFillsViewportHeight(true);
		this.jTableDatosProductoOrdenDetaProduGasto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduGasto= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduGasto);
		
		
		/*	
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
			
		this.jPanelAccionesProductoOrdenDetaProduGasto.add(this.jButtonNuevoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdClienteProveedorProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.add(jLabelid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.add(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);


		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.add(this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto.add(jButtonFK_IdClienteProveedorProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("1.-Por Cliente Proveedor ", jPanelFK_IdClienteProveedorProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto.add(jButtonFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("2.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto.add(jButtonFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("3.-Por Cuenta Contable Debito ", jPanelFK_IdCuentaContableDebitoProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdFacturaProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdFacturaProductoOrdenDetaProduGasto.add(jLabelid_facturaFK_IdFacturaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdFacturaProductoOrdenDetaProduGasto.add(jComboBoxid_facturaFK_IdFacturaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);


		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdFacturaProductoOrdenDetaProduGasto.add(this.jButtonBuscarFK_IdFacturaid_facturaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdFacturaProductoOrdenDetaProduGasto.add(jButtonFK_IdFacturaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("4.-Por Factura ", jPanelFK_IdFacturaProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.add(jLabelid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.add(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto.add(jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("5.-Por Orden Deta Produ ", jPanelFK_IdOrdenDetaProduProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.add(jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.add(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto.add(jButtonFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("6.-Por Tipo Gasto Produ Empresa ", jPanelFK_IdTipoGastoProduEmpresaProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutFK_IdUnidadProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		jPanelFK_IdUnidadProductoOrdenDetaProduGasto.add(jLabelid_unidadFK_IdUnidadProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 0;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 1;
		jPanelFK_IdUnidadProductoOrdenDetaProduGasto.add(jComboBoxid_unidadFK_IdUnidadProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridy = 1;
		gridBagConstraintsProductoOrdenDetaProduGasto.gridx =1;
		jPanelFK_IdUnidadProductoOrdenDetaProduGasto.add(jButtonFK_IdUnidadProductoOrdenDetaProduGasto, gridBagConstraintsProductoOrdenDetaProduGasto);

		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.addTab("7.-Por Unad ", jPanelFK_IdUnidadProductoOrdenDetaProduGasto);
		jTabbedPaneBusquedasProductoOrdenDetaProduGasto.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduGasto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;		
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;		
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);								
		
		
		/*
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/		
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
				
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoOrdenDetaProduGastoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoOrdenDetaProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduGasto = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduGasto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}
			
			
			Boolean tieneColumnasOcultas=false;
			
			
			
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
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoOrdenDetaProduGasto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoOrdenDetaProduGasto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoOrdenDetaProduGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setName("jPanelReporteDinamicoProductoOrdenDetaProduGasto"); 
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutReporteDinamicoProductoOrdenDetaProduGasto);
		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelColumnasSelectReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoOrdenDetaProduGasto = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoOrdenDetaProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto=new JScrollPane(this.jListColumnasSelectReporteProductoOrdenDetaProduGasto);
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jListColumnasSelectReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto=new JScrollPane(this.jListRelacionesSelectReporteProductoOrdenDetaProduGasto);
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelConGraficoDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jCheckBoxConGraficoDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelColumnaCategoriaGraficoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelColumnaCategoriaValorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jComboBoxColumnaCategoriaValorProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelColumnasValoresGraficoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto=new JScrollPane(this.jListColumnasValoresGraficoProductoOrdenDetaProduGasto);
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jListColumnasSelectReporteProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jScrollColumnasValoresGraficoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoOrdenDetaProduGasto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jComboBoxTiposGraficosReportesDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto.setToolTipText("Generar EXCEL"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jComboBoxTiposReportesDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jLabelTiposArchivoReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jComboBoxTiposArchivosReportesDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto.setToolTipText("Generar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jButtonGenerarReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoOrdenDetaProduGasto.add(this.jButtonCerrarReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduGasto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto= new JScrollPane(jPanelReporteDinamicoProductoOrdenDetaProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoOrdenDetaProduGasto);
		this.jInternalFrameReporteDinamicoProductoOrdenDetaProduGasto.getContentPane().add(this.jScrollPanelReporteDinamicoProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoOrdenDetaProduGasto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoOrdenDetaProduGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoOrdenDetaProduGasto.setName("jPanelImportacionProductoOrdenDetaProduGasto"); 
		
		this.jPanelImportacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutImportacionProductoOrdenDetaProduGasto);
		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoOrdenDetaProduGasto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setResizable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setClosable(true);
	    this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelArchivoImportacionProductoOrdenDetaProduGasto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jLabelArchivoImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoOrdenDetaProduGasto = new JFileChooser();		
		this.jFileChooserImportacionProductoOrdenDetaProduGasto.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonAbrirImportacionProductoOrdenDetaProduGasto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoOrdenDetaProduGasto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoOrdenDetaProduGasto.setToolTipText("Generar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jButtonAbrirImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jLabelPathArchivoImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jTextFieldPathArchivoImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonGenerarImportacionProductoOrdenDetaProduGasto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoOrdenDetaProduGasto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoOrdenDetaProduGasto.setToolTipText("Generar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jButtonGenerarImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoOrdenDetaProduGasto = new JButtonMe();
		this.jButtonCerrarImportacionProductoOrdenDetaProduGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoOrdenDetaProduGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoOrdenDetaProduGasto.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoOrdenDetaProduGasto.add(this.jButtonCerrarImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduGasto = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoOrdenDetaProduGasto= new JScrollPane(jPanelImportacionProductoOrdenDetaProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoOrdenDetaProduGasto);
		this.jInternalFrameImportacionProductoOrdenDetaProduGasto.getContentPane().add(this.jScrollPanelImportacionProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoOrdenDetaProduGasto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto = new JButtonMe();
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setText("Orden");
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoOrdenDetaProduGasto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoOrdenDetaProduGasto";
			inputMap = this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoOrdenDetaProduGasto"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoOrdenDetaProduGasto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoOrdenDetaProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoOrdenDetaProduGasto.setName("jPanelOrderByProductoOrdenDetaProduGasto"); 
			
			this.jPanelOrderByProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoOrdenDetaProduGasto.setLayout(gridaBagLayoutOrderByProductoOrdenDetaProduGasto);
			
			
			this.jTableDatosProductoOrdenDetaProduGastoOrderBy = new JTableMe();        
			this.jTableDatosProductoOrdenDetaProduGastoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrdenDetaProduGastoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrdenDetaProduGastoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrdenDetaProduGastoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrdenDetaProduGastoOrderBy.setViewportView(this.jTableDatosProductoOrdenDetaProduGastoOrderBy);
			this.jTableDatosProductoOrdenDetaProduGastoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrdenDetaProduGastoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoOrdenDetaProduGasto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setTitle("Orden");
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setResizable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setClosable(true);
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden  Gastoes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoOrdenDetaProduGasto.ipady =150;
				
			this.jPanelOrderByProductoOrdenDetaProduGasto.add(jScrollPanelDatosProductoOrdenDetaProduGastoOrderBy, this.gridBagConstraintsProductoOrdenDetaProduGasto);//this.jTableDatosProductoOrdenDetaProduGastoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoOrdenDetaProduGasto = new JButtonMe();
			this.jButtonCerrarOrderByProductoOrdenDetaProduGasto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoOrdenDetaProduGasto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoOrdenDetaProduGasto.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduGastoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoOrdenDetaProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoOrdenDetaProduGasto.add(this.jButtonCerrarOrderByProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduGasto = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoOrdenDetaProduGasto= new JScrollPane(jPanelOrderByProductoOrdenDetaProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoOrdenDetaProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoOrdenDetaProduGasto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoOrdenDetaProduGasto);
			
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getContentPane().add(this.jScrollPanelOrderByProductoOrdenDetaProduGasto, this.gridBagConstraintsProductoOrdenDetaProduGasto);			
		
		} else {
			this.jButtonAbrirOrderByProductoOrdenDetaProduGasto = new JButtonMe();
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
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoordendetaprodugastoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoOrdenDetaProduGasto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoOrdenDetaProduGasto.getRowHeight();//ProductoOrdenDetaProduGastoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoOrdenDetaProduGasto.isSelected()) {
					iHeightTable=ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoOrdenDetaProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoOrdenDetaProduGasto!=null && this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy()!=null) {
			//if(!this.productoordendetaprodugastoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoOrdenDetaProduGasto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoOrdenDetaProduGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoordendetaprodugastoLogic.getProductoOrdenDetaProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodugastos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoOrdenDetaProduGasto> TraerProductoOrdenDetaProduGastoBeans(List<ProductoOrdenDetaProduGasto> productoordendetaprodugastos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoOrdenDetaProduGasto productoordendetaprodugasto:productoordendetaprodugastos) {
					
				if(!(ProductoOrdenDetaProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoOrdenDetaProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoordendetaprodugasto.setsDetalleGeneralEntityReporte(ProductoOrdenDetaProduGastoConstantesFunciones.getProductoOrdenDetaProduGastoDescripcion(productoordendetaprodugasto));
										
						
					
						
					
				} else  {
							
					//productoordendetaprodugasto.setsDetalleGeneralEntityReporte(productoordendetaprodugasto.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoordendetaprodugastobeans.add(productoordendetaprodugastobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoordendetaprodugastos;
    }
	//PARA REPORTES FIN
}
