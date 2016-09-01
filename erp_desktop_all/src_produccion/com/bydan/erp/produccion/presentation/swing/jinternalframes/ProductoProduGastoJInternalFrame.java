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
import com.bydan.erp.produccion.util.ProductoProduGastoConstantesFunciones;

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
public class ProductoProduGastoJInternalFrame extends ProductoProduGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProductoProduGasto;
	
	protected JMenuBar jmenuBarProductoProduGasto;
	
	protected JMenu jmenuProductoProduGasto;
	protected JMenu jmenuDatosProductoProduGasto;
	protected JMenu jmenuArchivoProductoProduGasto;
	protected JMenu jmenuAccionesProductoProduGasto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoProduGasto;	
	protected GridBagConstraints gridBagConstraintsProductoProduGasto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoProduGastoDetalleFormJInternalFrame jInternalFrameDetalleFormProductoProduGasto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProductoProduGasto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProductoProduGasto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productodefiprodu="";

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
	
	public ProductoProduGastoSessionBean productoprodugastoSessionBean;
		
	
	
	public ProductoDefiProduSessionBean productodefiproduSessionBean;
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public ClienteSessionBean clienteproveedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public UnidadSessionBean unidadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ProductoProduGasto> productoprodugastos;		
	public List<ProductoProduGasto> productoprodugastosEliminados;	
	public List<ProductoProduGasto> productoprodugastosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProductoProduGasto;		
	protected JButton jButtonAbrirOrderByProductoProduGasto;
	
	
	//protected JPanel jPanelOrderByProductoProduGasto;
	//public JScrollPane jScrollPanelOrderByProductoProduGasto;	
	//protected JButton jButtonCerrarOrderByProductoProduGasto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoProduGastoLogic productoprodugastoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProductoProduGasto;
	public JScrollPane jScrollPanelDatosEdicionProductoProduGasto;
	public JScrollPane jScrollPanelDatosGeneralProductoProduGasto;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoProduGastoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProductoProduGasto;
	//public JScrollPane jScrollPanelImportacionProductoProduGasto;
	
	
	
	protected JPanel jPanelAccionesProductoProduGasto;
	
    protected JPanel jPanelPaginacionProductoProduGasto;
    protected JPanel jPanelParametrosReportesProductoProduGasto;
	protected JPanel jPanelParametrosReportesAccionesProductoProduGasto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ProductoProduGasto;
	protected JPanel jPanelParametrosAuxiliar2ProductoProduGasto;
	protected JPanel jPanelParametrosAuxiliar3ProductoProduGasto;
	protected JPanel jPanelParametrosAuxiliar4ProductoProduGasto;
	//protected JPanel jPanelParametrosAuxiliar5ProductoProduGasto;
	
	
	
	//protected JPanel jPanelReporteDinamicoProductoProduGasto;
	//protected JPanel jPanelImportacionProductoProduGasto;
	
	
	public JTable jTableDatosProductoProduGasto;
	
	
	
	//public JTable jTableDatosProductoProduGastoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProductoProduGasto;
	protected JButton jButtonDuplicarProductoProduGasto;
	protected JButton jButtonCopiarProductoProduGasto;
	protected JButton jButtonVerFormProductoProduGasto;
	protected JButton jButtonNuevoRelacionesProductoProduGasto;
	protected JButton jButtonModificarProductoProduGasto;
	
    protected JButton jButtonGuardarCambiosTablaProductoProduGasto;
	protected JButton jButtonCerrarProductoProduGasto;
	
	
	protected JButton jButtonRecargarInformacionProductoProduGasto;
	protected JButton jButtonProcesarInformacionProductoProduGasto;
	
	
	protected JButton jButtonAnterioresProductoProduGasto;
	protected JButton jButtonSiguientesProductoProduGasto;
	protected JButton jButtonNuevoGuardarCambiosProductoProduGasto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProductoProduGasto;
	//protected JButton jButtonCerrarReporteDinamicoProductoProduGasto;
	//protected JButton jButtonGenerarExcelReporteDinamicoProductoProduGasto;	
	
	
	
	//protected JButton jButtonAbrirImportacionProductoProduGasto;
	//protected JButton jButtonGenerarImportacionProductoProduGasto;
	//protected JButton jButtonCerrarImportacionProductoProduGasto;
	//protected JFileChooser jFileChooserImportacionProductoProduGasto;
	//protected File fileImportacionProductoProduGasto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoProduGasto;
	protected JButton jButtonDuplicarToolBarProductoProduGasto;
	protected JButton jButtonNuevoRelacionesToolBarProductoProduGasto;
	
	
	public JButton jButtonGuardarCambiosToolBarProductoProduGasto;
	protected JButton jButtonCopiarToolBarProductoProduGasto;
	protected JButton jButtonVerFormToolBarProductoProduGasto;
	public JButton jButtonGuardarCambiosTablaToolBarProductoProduGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoProduGasto;
	protected JButton jButtonCerrarToolBarProductoProduGasto;
	
	protected JButton jButtonRecargarInformacionToolBarProductoProduGasto;
	protected JButton jButtonProcesarInformacionToolBarProductoProduGasto;
	protected JButton jButtonAnterioresToolBarProductoProduGasto;
	protected JButton jButtonSiguientesToolBarProductoProduGasto;
	protected JButton jButtonNuevoGuardarCambiosToolBarProductoProduGasto;
	protected JButton jButtonAbrirOrderByToolBarProductoProduGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoProduGasto;
	protected JMenuItem jMenuItemDuplicarProductoProduGasto;
	protected JMenuItem jMenuItemNuevoRelacionesProductoProduGasto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProductoProduGasto;
	protected JMenuItem jMenuItemCopiarProductoProduGasto;
	protected JMenuItem jMenuItemVerFormProductoProduGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoProduGasto;
	protected JMenuItem jMenuItemCerrarProductoProduGasto;
	protected JMenuItem jMenuItemDetalleCerrarProductoProduGasto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProductoProduGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoProduGasto;
	
	protected JMenuItem jMenuItemRecargarInformacionProductoProduGasto;
	protected JMenuItem jMenuItemProcesarInformacionProductoProduGasto;
	protected JMenuItem jMenuItemAnterioresProductoProduGasto;
	protected JMenuItem jMenuItemSiguientesProductoProduGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoProduGasto;
	protected JMenuItem jMenuItemAbrirOrderByProductoProduGasto;
	protected JMenuItem jMenuItemMostrarOcultarProductoProduGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoProduGasto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProductoProduGasto;
	protected JCheckBox jCheckBoxSeleccionadosProductoProduGasto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProductoProduGasto;
	protected JCheckBox jCheckBoxConGraficoReporteProductoProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProductoProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProductoProduGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduGasto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProductoProduGasto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProductoProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProductoProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoProduGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProductoProduGasto;
	protected JTextField jTextFieldValorCampoGeneralProductoProduGasto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProductoProduGasto;
	//public JList<Reporte> jListColumnasSelectReporteProductoProduGasto;
	//public JScrollPane jScrollColumnasSelectReporteProductoProduGasto;
	
	//public JLabel jLabelRelacionesSelectReporteProductoProduGasto;
	//public JList<Reporte> jListRelacionesSelectReporteProductoProduGasto;
	//public JScrollPane jScrollRelacionesSelectReporteProductoProduGasto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProductoProduGasto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProductoProduGasto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProductoProduGasto;
	//public JLabel jLabelTiposArchivoReporteDinamicoProductoProduGasto;
	
		
	//public JLabel jLabelArchivoImportacionProductoProduGasto;	
	//public JLabel jLabelPathArchivoImportacionProductoProduGasto;
	//protected JTextField jTextFieldPathArchivoImportacionProductoProduGasto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProductoProduGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProductoProduGasto;
	
	//public JLabel jLabelColumnaCategoriaValorProductoProduGasto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProductoProduGasto;
	
	//public JLabel jLabelColumnasValoresGraficoProductoProduGasto;
	//public JList<Reporte> jListColumnasValoresGraficoProductoProduGasto;
	//public JScrollPane jScrollColumnasValoresGraficoProductoProduGasto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProductoProduGasto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProductoProduGasto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProductoProduGasto;
	public JPanel jPanelFK_IdClienteProveedorProductoProduGasto;
	public JButton jButtonFK_IdClienteProveedorProductoProduGasto;
	public JPanel jPanelFK_IdCuentaContableCreditoProductoProduGasto;
	public JButton jButtonFK_IdCuentaContableCreditoProductoProduGasto;
	public JPanel jPanelFK_IdCuentaContableDebitoProductoProduGasto;
	public JButton jButtonFK_IdCuentaContableDebitoProductoProduGasto;
	public JPanel jPanelFK_IdFacturaProductoProduGasto;
	public JButton jButtonFK_IdFacturaProductoProduGasto;
	public JPanel jPanelFK_IdProductoDefiProduProductoProduGasto;
	public JButton jButtonFK_IdProductoDefiProduProductoProduGasto;
	public JPanel jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto;
	public JButton jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto;
	public JPanel jPanelFK_IdUnidadProductoProduGasto;
	public JButton jButtonFK_IdUnidadProductoProduGasto;
	
	public JPanel jPanelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto;
	public JLabel jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto;
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedorFK_IdClienteProveedorProductoProduGastoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto;
	
	public JPanel jPanelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto;
	public JLabel jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto;
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGastoArbol= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto;
	public JLabel jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto;
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGastoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGastoArbol= new JButtonMe();

	
	public JPanel jPanelid_facturaFK_IdFacturaProductoProduGasto;
	public JLabel jLabelid_facturaFK_IdFacturaProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFK_IdFacturaProductoProduGasto;
	public JButton jButtonid_facturaFK_IdFacturaProductoProduGasto= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_facturaFK_IdFacturaProductoProduGastoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto;
	
	public JPanel jPanelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto;
	public JLabel jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto;
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_producto_defi_produFK_IdProductoDefiProduProductoProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto;
	public JLabel jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto;
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_unidadFK_IdUnidadProductoProduGasto;
	public JLabel jLabelid_unidadFK_IdUnidadProductoProduGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadFK_IdUnidadProductoProduGasto;
	public JButton jButtonid_unidadFK_IdUnidadProductoProduGasto= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduGastoUpdate= new JButtonMe();
	public JButton jButtonid_unidadFK_IdUnidadProductoProduGastoBusqueda= new JButtonMe();

	
	
	
	
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
	public ProductoProduGastoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoProduGastoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProductoProduGasto)	{
		this.jButtonRecargarInformacionProductoProduGasto = jButtonRecargarInformacionProductoProduGasto;
	}
	
	public JButton getjButtonProcesarInformacionProductoProduGasto() {
		return this.jButtonProcesarInformacionProductoProduGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoProduGasto)	{
		this.jButtonProcesarInformacionProductoProduGasto = jButtonProcesarInformacionProductoProduGasto;
	}
	
	
	public JButton getjButtonRecargarInformacionProductoProduGasto() {
		return this.jButtonRecargarInformacionProductoProduGasto;
	}
	
	
	public List<ProductoProduGasto> getproductoprodugastos() {
		return this.productoprodugastos;
	}

	public void setproductoprodugastos(List<ProductoProduGasto> productoprodugastos) {
		this.productoprodugastos = productoprodugastos;
	}
	
	public List<ProductoProduGasto> getproductoprodugastosAux() {
		return this.productoprodugastosAux;
	}

	public void setproductoprodugastosAux(List<ProductoProduGasto> productoprodugastosAux) {
		this.productoprodugastosAux = productoprodugastosAux;
	}
	
	public List<ProductoProduGasto> getproductoprodugastosEliminados() {
		return this.productoprodugastosEliminados;
	}

	public void setProductoProduGastosEliminados(List<ProductoProduGasto> productoprodugastosEliminados) {
		this.productoprodugastosEliminados = productoprodugastosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProductoProduGasto() {
		return jComboBoxTiposSeleccionarProductoProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProductoProduGasto(
			JComboBox jComboBoxTiposSeleccionarProductoProduGasto) {
		this.jComboBoxTiposSeleccionarProductoProduGasto = jComboBoxTiposSeleccionarProductoProduGasto;
	}
	
	public void setBorderResaltarTiposSeleccionarProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProductoProduGasto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProductoProduGasto() {
		return jTextFieldValorCampoGeneralProductoProduGasto;
	}

	public void setjTextFieldValorCampoGeneralProductoProduGasto(
			JTextField jTextFieldValorCampoGeneralProductoProduGasto) {
		this.jTextFieldValorCampoGeneralProductoProduGasto = jTextFieldValorCampoGeneralProductoProduGasto;
	}

	public void setBorderResaltarValorCampoGeneralProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProductoProduGasto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProductoProduGasto() {
		return this.jCheckBoxSeleccionarTodosProductoProduGasto;
	}

	public void setjCheckBoxSeleccionarTodosProductoProduGasto(
			JCheckBox jCheckBoxSeleccionarTodosProductoProduGasto) {
		this.jCheckBoxSeleccionarTodosProductoProduGasto = jCheckBoxSeleccionarTodosProductoProduGasto;
	}

	public void setBorderResaltarSeleccionarTodosProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProductoProduGasto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProductoProduGasto() {
		return this.jCheckBoxSeleccionadosProductoProduGasto;
	}

	public void setjCheckBoxSeleccionadosProductoProduGasto(
			JCheckBox jCheckBoxSeleccionadosProductoProduGasto) {
		this.jCheckBoxSeleccionadosProductoProduGasto = jCheckBoxSeleccionadosProductoProduGasto;
	}
	
	public void setBorderResaltarSeleccionadosProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProductoProduGasto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProductoProduGasto() {
		return this.jComboBoxTiposArchivosReportesProductoProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProductoProduGasto(
			JComboBox jComboBoxTiposArchivosReportesProductoProduGasto) {
		this.jComboBoxTiposArchivosReportesProductoProduGasto = jComboBoxTiposArchivosReportesProductoProduGasto;
	}

	public void setBorderResaltarTiposArchivosReportesProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProductoProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProductoProduGasto() {
		return this.jComboBoxTiposReportesProductoProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProductoProduGasto(
			JComboBox jComboBoxTiposReportesProductoProduGasto) {
		this.jComboBoxTiposReportesProductoProduGasto = jComboBoxTiposReportesProductoProduGasto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProductoProduGasto() {
	//	return jComboBoxTiposReportesDinamicoProductoProduGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProductoProduGasto(
	//		JComboBox jComboBoxTiposReportesDinamicoProductoProduGasto) {
	//	this.jComboBoxTiposReportesDinamicoProductoProduGasto = jComboBoxTiposReportesDinamicoProductoProduGasto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProductoProduGasto() {
	//	return jComboBoxTiposArchivosReportesDinamicoProductoProduGasto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProductoProduGasto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProductoProduGasto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto = jComboBoxTiposArchivosReportesDinamicoProductoProduGasto;
	//}
	
	public void setBorderResaltarTiposReportesProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProductoProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProductoProduGasto() {
		return this.jComboBoxTiposGraficosReportesProductoProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProductoProduGasto(
			JComboBox jComboBoxTiposGraficosReportesProductoProduGasto) {
		this.jComboBoxTiposGraficosReportesProductoProduGasto = jComboBoxTiposGraficosReportesProductoProduGasto;
	}
	
	public void setBorderResaltarTiposGraficosReportesProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProductoProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProductoProduGasto() {
		return this.jComboBoxTiposPaginacionProductoProduGasto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProductoProduGasto(
			JComboBox jComboBoxTiposPaginacionProductoProduGasto) {
		this.jComboBoxTiposPaginacionProductoProduGasto = jComboBoxTiposPaginacionProductoProduGasto;
	}
	
	public void setBorderResaltarTiposPaginacionProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProductoProduGasto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProductoProduGasto() {
		return this.jComboBoxTiposRelacionesProductoProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoProduGasto() {
		return this.jComboBoxTiposAccionesProductoProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoProduGasto(
			JComboBox jComboBoxTiposRelacionesProductoProduGasto) {
		this.jComboBoxTiposRelacionesProductoProduGasto = jComboBoxTiposRelacionesProductoProduGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoProduGasto(
			JComboBox jComboBoxTiposAccionesProductoProduGasto) {
		this.jComboBoxTiposAccionesProductoProduGasto = jComboBoxTiposAccionesProductoProduGasto;
	}
	
	public void setBorderResaltarTiposRelacionesProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProductoProduGasto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProductoProduGasto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProductoProduGasto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProductoProduGasto() {
	//	return jCheckBoxConGraficoDinamicoProductoProduGasto;
	//}

	//public void setjCheckBoxConGraficoDinamicoProductoProduGasto(
	//		JCheckBox jCheckBoxConGraficoDinamicoProductoProduGasto) {
	//	this.jCheckBoxConGraficoDinamicoProductoProduGasto = jCheckBoxConGraficoDinamicoProductoProduGasto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProductoProduGasto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProductoProduGasto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProductoProduGasto .setBorder(borderResaltar);		
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
		this.productoprodugastoSessionBean=new ProductoProduGastoSessionBean();
		
		this.productoprodugastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoprodugastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoprodugastoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoProduGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoProduGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto Gasto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoProduGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ProductoProduGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProductoProduGasto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"nuevo","nuevo","Nuevo"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"duplicar","duplicar","Duplicar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"copiar","copiar","Copiar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"ver_form","ver_form","Ver"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"recargar","recargar","Recargar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProductoProduGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProductoProduGasto,this.jTtoolBarProductoProduGasto,
							"cerrar","cerrar","Salir"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProductoProduGasto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProductoProduGasto;
			
				this.jButtonProcesarInformacionToolBarProductoProduGasto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProductoProduGasto;
				
		//protected JButton jButtonModificarToolBarProductoProduGasto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProductoProduGasto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProductoProduGasto=new JMenuMe("General");
		this.jmenuArchivoProductoProduGasto=new JMenuMe("Archivo");
		this.jmenuAccionesProductoProduGasto=new JMenuMe("Acciones");
		this.jmenuDatosProductoProduGasto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoProduGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoProduGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoProduGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProductoProduGasto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProductoProduGasto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProductoProduGasto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProductoProduGasto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProductoProduGasto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProductoProduGasto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProductoProduGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoProduGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoProduGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProductoProduGasto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProductoProduGasto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProductoProduGasto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProductoProduGasto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProductoProduGasto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProductoProduGasto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProductoProduGasto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProductoProduGasto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProductoProduGasto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoProduGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoProduGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoProduGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProductoProduGasto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProductoProduGasto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProductoProduGasto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProductoProduGasto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProductoProduGasto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProductoProduGasto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProductoProduGasto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProductoProduGasto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProductoProduGasto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProductoProduGasto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProductoProduGasto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProductoProduGasto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProductoProduGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProductoProduGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProductoProduGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProductoProduGasto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProductoProduGasto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProductoProduGasto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoProduGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoProduGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoProduGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProductoProduGasto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProductoProduGasto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProductoProduGasto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProductoProduGasto.add(this.jMenuItemCerrarProductoProduGasto);
			
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemNuevoProductoProduGasto);
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemNuevoGuardarCambiosProductoProduGasto);
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemNuevoRelacionesProductoProduGasto);
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemGuardarCambiosTablaProductoProduGasto);		
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemDuplicarProductoProduGasto);		
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemCopiarProductoProduGasto);		
			this.jmenuAccionesProductoProduGasto.add(this.jMenuItemVerFormProductoProduGasto);		
			
			this.jmenuDatosProductoProduGasto.add(this.jMenuItemRecargarInformacionProductoProduGasto);				
			this.jmenuDatosProductoProduGasto.add(this.jMenuItemAnterioresProductoProduGasto);				
			this.jmenuDatosProductoProduGasto.add(this.jMenuItemSiguientesProductoProduGasto);				
			this.jmenuDatosProductoProduGasto.add(this.jMenuItemAbrirOrderByProductoProduGasto);				
			this.jmenuDatosProductoProduGasto.add(this.jMenuItemMostrarOcultarProductoProduGasto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProductoProduGasto.add(this.jMenuItemGuardarCambiosProductoProduGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProductoProduGasto.add(this.jmenuArchivoProductoProduGasto);		
			this.jmenuBarProductoProduGasto.add(this.jmenuAccionesProductoProduGasto);		
			this.jmenuBarProductoProduGasto.add(this.jmenuDatosProductoProduGasto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProductoProduGasto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProductoProduGasto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteProveedorProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorProductoProduGasto.setToolTipText("Buscar Por Cliente Proveedor ");
		this.jButtonFK_IdClienteProveedorProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdClienteProveedorProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdClienteProveedorProductoProduGasto.setToolTipText("Buscar Por Cliente Proveedor ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorProductoProduGasto,"buscar_button","Buscar Por Cliente Proveedor ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto = new JLabelMe();
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setText("Cliente Proveedor :");
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setToolTipText("Cliente Proveedor");
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto.setFocusable(false);

		this.jPanelFK_IdCuentaContableCreditoProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableCreditoProductoProduGasto.setToolTipText("Buscar Por Cuenta Contable Credito ");
		this.jButtonFK_IdCuentaContableCreditoProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdCuentaContableCreditoProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdCuentaContableCreditoProductoProduGasto.setToolTipText("Buscar Por Cuenta Contable Credito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableCreditoProductoProduGasto,"buscar_button","Buscar Por Cuenta Contable Credito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableCreditoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto = new JLabelMe();
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setText("Cuenta Contable Credito :");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setToolTipText("Cuenta Contable Credito");
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdCuentaContableDebitoProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdCuentaContableDebitoProductoProduGasto.setToolTipText("Buscar Por Cuenta Contable Debito ");
		this.jButtonFK_IdCuentaContableDebitoProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdCuentaContableDebitoProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdCuentaContableDebitoProductoProduGasto.setToolTipText("Buscar Por Cuenta Contable Debito ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdCuentaContableDebitoProductoProduGasto,"buscar_button","Buscar Por Cuenta Contable Debito ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdCuentaContableDebitoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto = new JLabelMe();
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setText("Cuenta Contable Debito :");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setToolTipText("Cuenta Contable Debito");
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdFacturaProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdFacturaProductoProduGasto.setToolTipText("Buscar Por Factura ");
		this.jButtonFK_IdFacturaProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdFacturaProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdFacturaProductoProduGasto.setToolTipText("Buscar Por Factura ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdFacturaProductoProduGasto,"buscar_button","Buscar Por Factura ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdFacturaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_facturaFK_IdFacturaProductoProduGasto = new JLabelMe();
		jLabelid_facturaFK_IdFacturaProductoProduGasto.setText("Factura :");
		jLabelid_facturaFK_IdFacturaProductoProduGasto.setToolTipText("Factura");
		jLabelid_facturaFK_IdFacturaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_facturaFK_IdFacturaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFK_IdFacturaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_facturaFK_IdFacturaProductoProduGasto= new JComboBoxMe();
		jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFK_IdFacturaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFK_IdFacturaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto= new JButtonMe();
		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto.setFocusable(false);

		this.jPanelFK_IdProductoDefiProduProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdProductoDefiProduProductoProduGasto.setToolTipText("Buscar Por Producto Defi Produ ");
		this.jButtonFK_IdProductoDefiProduProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdProductoDefiProduProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdProductoDefiProduProductoProduGasto.setToolTipText("Buscar Por Producto Defi Produ ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdProductoDefiProduProductoProduGasto,"buscar_button","Buscar Por Producto Defi Produ ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdProductoDefiProduProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto = new JLabelMe();
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setText("Producto Defi Produ :");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setToolTipText("Producto Defi Produ");
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto= new JComboBoxMe();
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto.setToolTipText("Buscar Por Tipo Gasto Produ Empresa ");
		this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto.setToolTipText("Buscar Por Tipo Gasto Produ Empresa ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto,"buscar_button","Buscar Por Tipo Gasto Produ Empresa ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto = new JLabelMe();
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setText("Tipo Gasto Produ Empresa :");
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setToolTipText("Tipo Gasto Produ Empresa");
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto= new JComboBoxMe();
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdUnidadProductoProduGasto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdUnidadProductoProduGasto.setToolTipText("Buscar Por Unad ");
		this.jButtonFK_IdUnidadProductoProduGasto= new JButtonMe();
		this.jButtonFK_IdUnidadProductoProduGasto.setText("Buscar");
		this.jButtonFK_IdUnidadProductoProduGasto.setToolTipText("Buscar Por Unad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdUnidadProductoProduGasto,"buscar_button","Buscar Por Unad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdUnidadProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_unidadFK_IdUnidadProductoProduGasto = new JLabelMe();
		jLabelid_unidadFK_IdUnidadProductoProduGasto.setText("Unad :");
		jLabelid_unidadFK_IdUnidadProductoProduGasto.setToolTipText("Unad");
		jLabelid_unidadFK_IdUnidadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_unidadFK_IdUnidadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_unidadFK_IdUnidadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_unidadFK_IdUnidadProductoProduGasto= new JComboBoxMe();
		jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadFK_IdUnidadProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadFK_IdUnidadProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProductoProduGasto=new JTabbedPane();


		this.jTabbedPaneBusquedasProductoProduGasto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduGasto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasProductoProduGasto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProductoProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProductoProduGasto = new ProductoProduGastoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto Gasto Produccion DATOS");
			this.jInternalFrameDetalleFormProductoProduGasto = new ProductoProduGastoDetalleFormJInternalFrame(jDesktopPane,this.productoprodugastoSessionBean.getConGuardarRelaciones(),this.productoprodugastoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProductoProduGasto = null;//new ProductoProduGastoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoProduGasto= new GridBagLayout();
		
		
		this.jTableDatosProductoProduGasto = new JTableMe();      
		
		String sToolTipProductoProduGasto="";
		sToolTipProductoProduGasto=ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoProduGasto+="(Produccion.ProductoProduGasto)";
		}
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoProduGasto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProductoProduGasto.setToolTipText(sToolTipProductoProduGasto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProductoProduGasto);
		this.jTableDatosProductoProduGasto.setAutoCreateRowSorter(true);
		this.jTableDatosProductoProduGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProductoProduGasto.setRowSelectionAllowed(true);
		this.jTableDatosProductoProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProductoProduGasto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProductoProduGasto = new JButtonMe();
		this.jButtonDuplicarProductoProduGasto = new JButtonMe();
		this.jButtonCopiarProductoProduGasto = new JButtonMe();
		this.jButtonVerFormProductoProduGasto = new JButtonMe();
		this.jButtonNuevoRelacionesProductoProduGasto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProductoProduGasto = new JButtonMe();
		this.jButtonCerrarProductoProduGasto = new JButtonMe();
		
		this.jScrollPanelDatosProductoProduGasto = new JScrollPane();   
        this.jScrollPanelDatosGeneralProductoProduGasto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Producto Gasto Produccion";
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoProduGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoProduGasto.setToolTipText("Acciones");
        this.jPanelAccionesProductoProduGasto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoProductoProduGasto=new ReporteDinamicoJInternalFrame(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProductoProduGasto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProductoProduGasto=new ImportacionJInternalFrame(ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProductoProduGasto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProductoProduGasto = new JButtonMe();
		
		this.jButtonAbrirOrderByProductoProduGasto.setText("Orden");
		this.jButtonAbrirOrderByProductoProduGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduGasto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduGasto,false,this);
			
			//this.cargarOrderByProductoProduGasto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProductoProduGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProduGasto,true,this);
			
			//this.cargarOrderByProductoProduGasto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProductoProduGasto.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosProductoProduGasto.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosProductoProduGasto.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosProductoProduGasto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduGasto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProductoProduGasto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProductoProduGasto.setText("Nuevo");
		this.jButtonDuplicarProductoProduGasto.setText("Duplicar");
		this.jButtonCopiarProductoProduGasto.setText("Copiar");
		this.jButtonVerFormProductoProduGasto.setText("Ver");
		this.jButtonNuevoRelacionesProductoProduGasto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.setText("Guardar");
		this.jButtonCerrarProductoProduGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoProduGasto,"nuevo_button","Nuevo",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProductoProduGasto,"duplicar_button","Duplicar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProductoProduGasto,"copiar_button","Copiar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProductoProduGasto,"ver_form","Ver",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProductoProduGasto,"nuevorelaciones_button","Nuevo Rel",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoProduGasto,"guardarcambiostabla_button","Guardar",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoProduGasto,"cerrar_button","Salir",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProductoProduGasto.setToolTipText("Nuevo"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProductoProduGasto.setToolTipText("Duplicar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProductoProduGasto.setToolTipText("Copiar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProductoProduGasto.setToolTipText("Ver"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProductoProduGasto.setToolTipText("Nuevo Rel"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.setToolTipText("Guardar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoProduGasto.setToolTipText("Salir"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoProduGasto";
		inputMap = this.jButtonNuevoProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoProduGasto"));
		
		//DUPLICAR
		sMapKey = "DuplicarProductoProduGasto";
		inputMap = this.jButtonDuplicarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProductoProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProductoProduGasto"));
		
		//COPIAR
		sMapKey = "CopiarProductoProduGasto";
		inputMap = this.jButtonCopiarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProductoProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProductoProduGasto"));
		
		//VEr FORM
		sMapKey = "VerFormProductoProduGasto";
		inputMap = this.jButtonVerFormProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProductoProduGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProductoProduGasto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProductoProduGasto";
		inputMap = this.jButtonNuevoRelacionesProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProductoProduGasto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProductoProduGasto";
		inputMap = this.jButtonModificarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProductoProduGasto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProductoProduGasto";
		inputMap = this.jButtonCerrarProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoProduGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoProduGasto";
		inputMap = this.jButtonGuardarCambiosTablaProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoProduGasto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProductoProduGasto.setName("jPanelParametrosReportesProductoProduGasto"); 
		
		this.jPanelParametrosReportesAccionesProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProductoProduGasto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProductoProduGasto.setName("jPanelParametrosReportesAccionesProductoProduGasto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProductoProduGasto = new JButtonMe();
		this.jButtonRecargarInformacionProductoProduGasto.setText("Recargar");
		this.jButtonRecargarInformacionProductoProduGasto.setToolTipText("Recargar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProductoProduGasto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProductoProduGasto = new JButtonMe();
		this.jButtonProcesarInformacionProductoProduGasto.setText("Procesar");
		this.jButtonProcesarInformacionProductoProduGasto.setToolTipText("Procesar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProductoProduGasto.setVisible(false);
			
		this.jButtonProcesarInformacionProductoProduGasto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduGasto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProductoProduGasto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduGasto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProductoProduGasto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduGasto.setText("TIPO");       
		this.jComboBoxTiposReportesProductoProduGasto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProductoProduGasto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProductoProduGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProductoProduGasto.setText("Paginacion");
		this.jComboBoxTiposPaginacionProductoProduGasto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProductoProduGasto.setText("Accion");
		this.jComboBoxTiposRelacionesProductoProduGasto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoProduGasto.setText("Accion");
		this.jComboBoxTiposAccionesProductoProduGasto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProductoProduGasto.setText("Accion");
		this.jComboBoxTiposSeleccionarProductoProduGasto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProductoProduGasto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProductoProduGasto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduGasto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProductoProduGasto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProductoProduGasto = new JLabelMe();
		
		this.jLabelAccionesProductoProduGasto.setText("Acciones");		
		this.jLabelAccionesProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProductoProduGasto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProductoProduGasto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProductoProduGasto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProductoProduGasto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProductoProduGasto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProductoProduGasto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProductoProduGasto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProductoProduGasto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProductoProduGasto.setText("Graf.");
		this.jCheckBoxConGraficoReporteProductoProduGasto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProductoProduGasto = new JButtonMe();
		//this.jButtonAnterioresProductoProduGasto.setText("<<");
        this.jButtonAnterioresProductoProduGasto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProductoProduGasto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProductoProduGasto = new JButtonMe();
		//this.jButtonSiguientesProductoProduGasto.setText(">>");
        this.jButtonSiguientesProductoProduGasto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProductoProduGasto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProductoProduGasto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProductoProduGasto.setText("Nue");
        this.jButtonNuevoGuardarCambiosProductoProduGasto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProductoProduGasto,"nuevoguardarcambios_button","Nue",this.productoprodugastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProductoProduGasto";
		inputMap = this.jButtonNuevoGuardarCambiosProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProductoProduGasto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProductoProduGasto";
		inputMap = this.jButtonRecargarInformacionProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProductoProduGasto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProductoProduGasto";
		inputMap = this.jButtonSiguientesProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProductoProduGasto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProductoProduGasto";
		inputMap = this.jButtonAnterioresProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProductoProduGasto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProductoProduGasto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProductoProduGasto.setMinimumSize(new Dimension(this.getWidth(),ProductoProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduGasto.setMaximumSize(new Dimension(this.getWidth(),ProductoProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProductoProduGasto.setPreferredSize(new Dimension(this.getWidth(),ProductoProduGastoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoProduGastoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProductoProduGasto = new GridBagLayout();

			this.jPanelPaginacionProductoProduGasto.setLayout(gridaBagLayoutPaginacionProductoProduGasto);						
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 0;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonAnterioresProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					
						
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduGasto.gridy = 0;
			
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonNuevoGuardarCambiosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
						
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProductoProduGasto.gridy = 0;
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonSiguientesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 1;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonNuevoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
						
			
			
			if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProductoProduGasto.gridy = 1;
				this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProductoProduGasto.add(this.jButtonGuardarCambiosTablaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			}
			
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 1;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonDuplicarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 1;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonCopiarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 1;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonVerFormProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 1;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProductoProduGasto.add(this.jButtonCerrarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		
		this.jButtonRecargarInformacionProductoProduGasto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduGasto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProductoProduGasto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProductoProduGasto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduGasto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProductoProduGasto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProductoProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProductoProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProductoProduGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProductoProduGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProductoProduGasto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduGasto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProductoProduGasto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProductoProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProductoProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProductoProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProductoProduGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProductoProduGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProductoProduGasto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduGasto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProductoProduGasto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProductoProduGasto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduGasto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProductoProduGasto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProductoProduGasto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduGasto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProductoProduGasto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProductoProduGasto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduGasto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProductoProduGasto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProductoProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProductoProduGasto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ProductoProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ProductoProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ProductoProduGasto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ProductoProduGasto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProductoProduGasto.setLayout(gridaBagParametrosReportesProductoProduGasto);
			this.jPanelParametrosReportesAccionesProductoProduGasto.setLayout(gridaBagParametrosReportesAccionesProductoProduGasto);
			
			
			this.jPanelParametrosAuxiliar1ProductoProduGasto.setLayout(gridaBagParametrosAuxiliar1ProductoProduGasto);
			this.jPanelParametrosAuxiliar2ProductoProduGasto.setLayout(gridaBagParametrosAuxiliar2ProductoProduGasto);
			this.jPanelParametrosAuxiliar3ProductoProduGasto.setLayout(gridaBagParametrosAuxiliar3ProductoProduGasto);
			this.jPanelParametrosAuxiliar4ProductoProduGasto.setLayout(gridaBagParametrosAuxiliar4ProductoProduGasto);
			//this.jPanelParametrosAuxiliar5ProductoProduGasto.setLayout(gridaBagParametrosAuxiliar2ProductoProduGasto);			
			
			
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduGasto.add(this.jButtonRecargarInformacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduGasto.add(this.jComboBoxTiposPaginacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduGasto.add(this.jCheckBoxConAltoMaximoTablaProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ProductoProduGasto.add(this.jComboBoxTiposArchivosReportesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduGasto.add(this.jPanelParametrosAuxiliar1ProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ProductoProduGasto.add(this.jComboBoxTiposReportesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);																		
			
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ProductoProduGasto.add(this.jComboBoxTiposGraficosReportesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduGasto.add(this.jPanelParametrosAuxiliar4ProductoProduGasto, this.gridBagConstraintsProductoProduGasto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduGasto.add(this.jComboBoxTiposReportesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduGasto.add(this.jCheckBoxGenerarReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduGasto.add(this.jPanelParametrosAuxiliar2ProductoProduGasto, this.gridBagConstraintsProductoProduGasto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduGasto.add(this.jLabelAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
				this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProductoProduGasto.add(this.jButtonAbrirOrderByProductoProduGasto, this.gridBagConstraintsProductoProduGasto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduGasto.add(this.jComboBoxTiposSeleccionarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			
			
			/*
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduGasto.add(this.jCheckBoxSeleccionarTodosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProductoProduGasto.add(this.jCheckBoxConGraficoReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduGasto.add(this.jCheckBoxSeleccionarTodosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);															
				
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduGasto.add(this.jCheckBoxSeleccionadosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);															
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProductoProduGasto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ProductoProduGasto.add(this.jCheckBoxConGraficoReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProductoProduGasto.add(this.jPanelParametrosAuxiliar3ProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduGasto.add(this.jComboBoxTiposAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
	
				
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProductoProduGasto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProductoProduGasto.add(this.jTextFieldValorCampoGeneralProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProductoProduGasto = new GridBagLayout();

			this.jScrollPanelDatosProductoProduGasto.setLayout(gridaBagLayoutDatosProductoProduGasto);
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = 0;
			this.gridBagConstraintsProductoProduGasto.gridx = 0;
			
			this.jScrollPanelDatosProductoProduGasto.add(this.jTableDatosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProductoProduGasto.setViewportView(this.jTableDatosProductoProduGasto);
		this.jTableDatosProductoProduGasto.setFillsViewportHeight(true);
		this.jTableDatosProductoProduGasto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProductoProduGasto= new GridBagLayout();
		this.jPanelAccionesProductoProduGasto.setLayout(gridaBagLayoutAccionesProductoProduGasto);
		
		
		/*	
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = 0;
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
			
		this.jPanelAccionesProductoProduGasto.add(this.jButtonNuevoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteProveedorProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorProductoProduGasto.setLayout(gridaBagLayoutFK_IdClienteProveedorProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdClienteProveedorProductoProduGasto.add(jLabelid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdClienteProveedorProductoProduGasto.add(jComboBoxid_cliente_proveedorFK_IdClienteProveedorProductoProduGasto, gridBagConstraintsProductoProduGasto);


		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdClienteProveedorProductoProduGasto.add(this.jButtonBuscarFK_IdClienteProveedorid_cliente_proveedorProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdClienteProveedorProductoProduGasto.add(jButtonFK_IdClienteProveedorProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("1.-Por Cliente Proveedor ", jPanelFK_IdClienteProveedorProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableCreditoProductoProduGasto.setLayout(gridaBagLayoutFK_IdCuentaContableCreditoProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdCuentaContableCreditoProductoProduGasto.add(jLabelid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdCuentaContableCreditoProductoProduGasto.add(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdCuentaContableCreditoProductoProduGasto.add(jButtonFK_IdCuentaContableCreditoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("2.-Por Cuenta Contable Credito ", jPanelFK_IdCuentaContableCreditoProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdCuentaContableDebitoProductoProduGasto.setLayout(gridaBagLayoutFK_IdCuentaContableDebitoProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdCuentaContableDebitoProductoProduGasto.add(jLabelid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdCuentaContableDebitoProductoProduGasto.add(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdCuentaContableDebitoProductoProduGasto.add(jButtonFK_IdCuentaContableDebitoProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("3.-Por Cuenta Contable Debito ", jPanelFK_IdCuentaContableDebitoProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdFacturaProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdFacturaProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdFacturaProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdFacturaProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdFacturaProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdFacturaProductoProduGasto.setLayout(gridaBagLayoutFK_IdFacturaProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdFacturaProductoProduGasto.add(jLabelid_facturaFK_IdFacturaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdFacturaProductoProduGasto.add(jComboBoxid_facturaFK_IdFacturaProductoProduGasto, gridBagConstraintsProductoProduGasto);


		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdFacturaProductoProduGasto.add(this.jButtonBuscarFK_IdFacturaid_facturaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdFacturaProductoProduGasto.add(jButtonFK_IdFacturaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("4.-Por Factura ", jPanelFK_IdFacturaProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdProductoDefiProduProductoProduGasto.setLayout(gridaBagLayoutFK_IdProductoDefiProduProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdProductoDefiProduProductoProduGasto.add(jLabelid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdProductoDefiProduProductoProduGasto.add(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdProductoDefiProduProductoProduGasto.add(jButtonFK_IdProductoDefiProduProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("5.-Por Producto Defi Produ ", jPanelFK_IdProductoDefiProduProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto.setLayout(gridaBagLayoutFK_IdTipoGastoProduEmpresaProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto.add(jLabelid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto.add(jComboBoxid_tipo_gasto_produ_empresaFK_IdTipoGastoProduEmpresaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto.add(jButtonFK_IdTipoGastoProduEmpresaProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("6.-Por Tipo Gasto Produ Empresa ", jPanelFK_IdTipoGastoProduEmpresaProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdUnidadProductoProduGasto= new GridBagLayout();
		gridaBagLayoutFK_IdUnidadProductoProduGasto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduGasto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdUnidadProductoProduGasto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdUnidadProductoProduGasto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdUnidadProductoProduGasto.setLayout(gridaBagLayoutFK_IdUnidadProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 0;
		jPanelFK_IdUnidadProductoProduGasto.add(jLabelid_unidadFK_IdUnidadProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 0;
		gridBagConstraintsProductoProduGasto.gridx = 1;
		jPanelFK_IdUnidadProductoProduGasto.add(jComboBoxid_unidadFK_IdUnidadProductoProduGasto, gridBagConstraintsProductoProduGasto);

		gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProductoProduGasto.gridy = 1;
		gridBagConstraintsProductoProduGasto.gridx =1;
		jPanelFK_IdUnidadProductoProduGasto.add(jButtonFK_IdUnidadProductoProduGasto, gridBagConstraintsProductoProduGasto);

		jTabbedPaneBusquedasProductoProduGasto.addTab("7.-Por Unad ", jPanelFK_IdUnidadProductoProduGasto);
		jTabbedPaneBusquedasProductoProduGasto.setMnemonicAt(6, KeyEvent.VK_7);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoProduGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoProduGasto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();						
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduGasto.gridx = 0;		
			//this.gridBagConstraintsProductoProduGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoProduGasto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProductoProduGasto, this.gridBagConstraintsProductoProduGasto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProductoProduGasto.gridx = 0;		
		//this.gridBagConstraintsProductoProduGasto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProductoProduGasto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProductoProduGasto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoProduGasto.gridx = 0;		
			this.gridBagConstraintsProductoProduGasto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProductoProduGasto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProductoProduGasto, this.gridBagConstraintsProductoProduGasto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);								
		
		
		/*
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		*/		
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoProduGasto.gridx =0;
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoProduGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
				
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ProductoProduGastoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProductoProduGasto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoProduGasto = new GridBagLayout();
			this.jPanelBusquedasParametrosProductoProduGasto.setLayout(gridaBagLayoutBusquedasParametrosProductoProduGasto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProductoProduGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoProduGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoProduGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
			
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoProduGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProductoProduGasto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProductoProduGasto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProductoProduGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProductoProduGasto.setName("jPanelReporteDinamicoProductoProduGasto"); 
		
		this.jPanelReporteDinamicoProductoProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProductoProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProductoProduGasto.setLayout(gridaBagLayoutReporteDinamicoProductoProduGasto);
		
		
		this.jInternalFrameReporteDinamicoProductoProduGasto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProductoProduGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProductoProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProductoProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProductoProduGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProductoProduGasto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProductoProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProductoProduGasto.setResizable(true);
	    this.jInternalFrameReporteDinamicoProductoProduGasto.setClosable(true);
	    this.jInternalFrameReporteDinamicoProductoProduGasto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProductoProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProductoProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProductoProduGasto = new JLabelMe();

		this.jLabelColumnasSelectReporteProductoProduGasto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelColumnasSelectReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProductoProduGasto = new JList<Reporte>();
		this.jListColumnasSelectReporteProductoProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProductoProduGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProductoProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProductoProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProductoProduGasto=new JScrollPane(this.jListColumnasSelectReporteProductoProduGasto);
			
			this.jScrollColumnasSelectReporteProductoProduGasto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduGasto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProductoProduGasto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProductoProduGasto.add(this.jListColumnasSelectReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jScrollColumnasSelectReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProductoProduGasto = new JLabelMe();

		this.jLabelRelacionesSelectReporteProductoProduGasto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProductoProduGasto = new JList<Reporte>();
		this.jListRelacionesSelectReporteProductoProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProductoProduGasto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProductoProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProductoProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProductoProduGasto=new JScrollPane(this.jListRelacionesSelectReporteProductoProduGasto);
			
			this.jScrollRelacionesSelectReporteProductoProduGasto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduGasto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProductoProduGasto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoProductoProduGasto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProductoProduGasto = new JComboBoxMe();
		this.jListColumnasValoresGraficoProductoProduGasto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProductoProduGasto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProductoProduGasto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProductoProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProductoProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProductoProduGasto = new JLabelMe();

		this.jLabelConGraficoDinamicoProductoProduGasto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelConGraficoDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProductoProduGasto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProductoProduGasto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProductoProduGasto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProductoProduGasto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduGasto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProductoProduGasto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jCheckBoxConGraficoDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProductoProduGasto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProductoProduGasto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelColumnaCategoriaGraficoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jComboBoxColumnaCategoriaGraficoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProductoProduGasto = new JLabelMe();

		this.jLabelColumnaCategoriaValorProductoProduGasto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelColumnaCategoriaValorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProductoProduGasto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProductoProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProductoProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProductoProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jComboBoxColumnaCategoriaValorProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProductoProduGasto = new JLabelMe();

		this.jLabelColumnasValoresGraficoProductoProduGasto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelColumnasValoresGraficoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProductoProduGasto = new JList<Reporte>();
		this.jListColumnasValoresGraficoProductoProduGasto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProductoProduGasto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProductoProduGasto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduGasto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProductoProduGasto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProductoProduGasto=new JScrollPane(this.jListColumnasValoresGraficoProductoProduGasto);
			
			this.jScrollColumnasValoresGraficoProductoProduGasto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduGasto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProductoProduGasto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProductoProduGasto.add(this.jListColumnasSelectReporteProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jScrollColumnasValoresGraficoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProductoProduGasto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProductoProduGasto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelTiposGraficosReportesDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProductoProduGasto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jComboBoxTiposGraficosReportesDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProductoProduGasto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProductoProduGasto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelGenerarExcelReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProductoProduGasto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProductoProduGasto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProductoProduGasto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProductoProduGasto.setToolTipText("Generar EXCEL"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		//this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProductoProduGasto.add(this.jButtonGenerarExcelReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jComboBoxTiposReportesDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProductoProduGasto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProductoProduGasto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jLabelTiposArchivoReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jComboBoxTiposArchivosReportesDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProductoProduGasto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProductoProduGasto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProductoProduGasto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProductoProduGasto.setToolTipText("Generar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jButtonGenerarReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProductoProduGasto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProductoProduGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProductoProduGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProductoProduGasto.setToolTipText("Cancelar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProductoProduGasto.add(this.jButtonCerrarReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProductoProduGasto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProductoProduGasto= new JScrollPane(jPanelReporteDinamicoProductoProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProductoProduGasto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduGasto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProductoProduGasto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProductoProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProductoProduGasto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProductoProduGasto);
		this.jInternalFrameReporteDinamicoProductoProduGasto.getContentPane().add(this.jScrollPanelReporteDinamicoProductoProduGasto, this.gridBagConstraintsProductoProduGasto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProductoProduGasto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProductoProduGasto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProductoProduGasto.setName("jPanelImportacionProductoProduGasto"); 
		
		this.jPanelImportacionProductoProduGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProductoProduGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProductoProduGasto.setLayout(gridaBagLayoutImportacionProductoProduGasto);
		
		
		this.jInternalFrameImportacionProductoProduGasto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProductoProduGasto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProductoProduGasto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProductoProduGasto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProductoProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduGasto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProductoProduGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduGasto.setResizable(true);
	    this.jInternalFrameImportacionProductoProduGasto.setClosable(true);
	    this.jInternalFrameImportacionProductoProduGasto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProductoProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProductoProduGasto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProductoProduGasto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProductoProduGasto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProductoProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProductoProduGasto.setResizable(true);
	    this.jInternalFrameImportacionProductoProduGasto.setClosable(true);
	    this.jInternalFrameImportacionProductoProduGasto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProductoProduGasto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduGasto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProductoProduGasto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProductoProduGasto = new JLabelMe();

		this.jLabelArchivoImportacionProductoProduGasto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduGasto.add(this.jLabelArchivoImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProductoProduGasto = new JFileChooser();		
		this.jFileChooserImportacionProductoProduGasto.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProductoProduGasto = new JButtonMe();
		this.jButtonAbrirImportacionProductoProduGasto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProductoProduGasto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProductoProduGasto.setToolTipText("Generar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduGasto.add(this.jButtonAbrirImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProductoProduGasto = new JLabelMe();

		this.jLabelPathArchivoImportacionProductoProduGasto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProductoProduGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProductoProduGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProductoProduGasto.add(this.jLabelPathArchivoImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProductoProduGasto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProductoProduGasto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduGasto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProductoProduGasto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduGasto.add(this.jTextFieldPathArchivoImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProductoProduGasto = new JButtonMe();
		this.jButtonGenerarImportacionProductoProduGasto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProductoProduGasto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProductoProduGasto.setToolTipText("Generar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduGasto.add(this.jButtonGenerarImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProductoProduGasto = new JButtonMe();
		this.jButtonCerrarImportacionProductoProduGasto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProductoProduGasto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProductoProduGasto.setToolTipText("Cancelar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoProduGasto.gridy = iPosYImportacion;
		this.gridBagConstraintsProductoProduGasto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProductoProduGasto.add(this.jButtonCerrarImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProductoProduGasto = new GridBagLayout();
		
		this.jScrollPanelImportacionProductoProduGasto= new JScrollPane(jPanelImportacionProductoProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
		this.gridBagConstraintsProductoProduGasto.gridy =iPosYImportacion;
		this.gridBagConstraintsProductoProduGasto.gridx =iPosXImportacion;
		this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProductoProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProductoProduGasto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProductoProduGasto);
		this.jInternalFrameImportacionProductoProduGasto.getContentPane().add(this.jScrollPanelImportacionProductoProduGasto, this.gridBagConstraintsProductoProduGasto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProductoProduGasto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProductoProduGasto = new JButtonMe();
			this.jButtonAbrirOrderByProductoProduGasto.setText("Orden");
			this.jButtonAbrirOrderByProductoProduGasto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProductoProduGasto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProductoProduGasto";
			inputMap = this.jButtonAbrirOrderByProductoProduGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProductoProduGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProductoProduGasto"));
		
		
			GridBagLayout gridaBagLayoutOrderByProductoProduGasto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProductoProduGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProductoProduGasto.setName("jPanelOrderByProductoProduGasto"); 
			
			this.jPanelOrderByProductoProduGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProductoProduGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProductoProduGasto.setLayout(gridaBagLayoutOrderByProductoProduGasto);
			
			
			this.jTableDatosProductoProduGastoOrderBy = new JTableMe();        
			this.jTableDatosProductoProduGastoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoProduGastoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoProduGastoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoProduGastoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoProduGastoOrderBy.setViewportView(this.jTableDatosProductoProduGastoOrderBy);
			this.jTableDatosProductoProduGastoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoProduGastoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProductoProduGasto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProductoProduGasto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProductoProduGasto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProductoProduGasto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProductoProduGasto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProductoProduGasto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProductoProduGasto.setTitle("Orden");
			this.jInternalFrameOrderByProductoProduGasto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProductoProduGasto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProductoProduGasto.setResizable(true);
			this.jInternalFrameOrderByProductoProduGasto.setClosable(true);
			this.jInternalFrameOrderByProductoProduGasto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProductoProduGasto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduGasto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProductoProduGasto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProductoProduGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Producto Gasto Producciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProductoProduGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProductoProduGasto.ipady =150;
				
			this.jPanelOrderByProductoProduGasto.add(jScrollPanelDatosProductoProduGastoOrderBy, this.gridBagConstraintsProductoProduGasto);//this.jTableDatosProductoProduGastoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProductoProduGasto = new JButtonMe();
			this.jButtonCerrarOrderByProductoProduGasto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProductoProduGasto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProductoProduGasto.setToolTipText("Cancelar"+" "+ProductoProduGastoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProductoProduGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoProduGasto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProductoProduGasto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProductoProduGasto.add(this.jButtonCerrarOrderByProductoProduGasto, this.gridBagConstraintsProductoProduGasto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProductoProduGasto = new GridBagLayout();
			
			this.jScrollPanelOrderByProductoProduGasto= new JScrollPane(jPanelOrderByProductoProduGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProductoProduGasto = new GridBagConstraints();
			this.gridBagConstraintsProductoProduGasto.gridy =iPosYOrderBy;
			this.gridBagConstraintsProductoProduGasto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProductoProduGasto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProductoProduGasto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProductoProduGasto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProductoProduGasto);
			
			this.jInternalFrameOrderByProductoProduGasto.getContentPane().add(this.jScrollPanelOrderByProductoProduGasto, this.gridBagConstraintsProductoProduGasto);			
		
		} else {
			this.jButtonAbrirOrderByProductoProduGasto = new JButtonMe();
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
			&& this.productoprodugastoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProductoProduGasto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProductoProduGasto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProductoProduGasto.getRowHeight();//ProductoProduGastoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduGasto.isSelected()) {
					iHeightTable=ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProductoProduGasto.isSelected()) {
					iHeightTable=ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoProduGastoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProductoProduGasto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduGasto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProductoProduGasto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProductoProduGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProductoProduGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProductoProduGasto!=null && this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy()!=null) {
			//if(!this.productoprodugastoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProductoProduGasto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProductoProduGasto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProductoProduGasto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProductoProduGasto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProductoProduGasto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduGasto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProductoProduGasto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoprodugastoLogic.getProductoProduGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodugastos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ProductoProduGasto> TraerProductoProduGastoBeans(List<ProductoProduGasto> productoprodugastos,ArrayList<Classe> classes)throws Exception {
		try {
			for(ProductoProduGasto productoprodugasto:productoprodugastos) {
					
				if(!(ProductoProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoProduGastoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					productoprodugasto.setsDetalleGeneralEntityReporte(ProductoProduGastoConstantesFunciones.getProductoProduGastoDescripcion(productoprodugasto));
										
						
					
						
					
				} else  {
							
					//productoprodugasto.setsDetalleGeneralEntityReporte(productoprodugasto.getsDetalleGeneralEntityReporte());
										
				}
				
				//productoprodugastobeans.add(productoprodugastobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productoprodugastos;
    }
	//PARA REPORTES FIN
}
