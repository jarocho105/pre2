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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.ProductoConstantesFunciones;

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
public class ProductoJInternalFrame extends ProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarProducto;
	
	protected JMenuBar jmenuBarProducto;
	
	protected JMenu jmenuProducto;
	protected JMenu jmenuDatosProducto;
	protected JMenu jmenuArchivoProducto;
	protected JMenu jmenuAccionesProducto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProducto;	
	protected GridBagConstraints gridBagConstraintsProducto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ProductoDetalleFormJInternalFrame jInternalFrameDetalleFormProducto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoProducto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionProducto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";

	protected TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicio="";

	protected TipoProductoServicioInvenBeanSwingJInternalFrame tipoproductoservicioinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproductoservicioinven="";

	protected TipoCosteoBeanSwingJInternalFrame tipocosteoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosteo="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected UnidadBeanSwingJInternalFrame unidadpesoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidadpeso="";

	protected ArancelBeanSwingJInternalFrame arancelBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_arancel="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected ClienteBeanSwingJInternalFrame clienteproveedordefectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteproveedordefecto="";

	protected TipoProductoBeanSwingJInternalFrame tipoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproducto="";

	protected ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorproducto="";

	protected ClaseProductoBeanSwingJInternalFrame claseproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_claseproducto="";

	protected EfectoProductoBeanSwingJInternalFrame efectoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_efectoproducto="";

	protected MarcaProductoBeanSwingJInternalFrame marcaproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_marcaproducto="";

	protected ModeloProductoBeanSwingJInternalFrame modeloproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modeloproducto="";

	protected MaterialProductoBeanSwingJInternalFrame materialproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_materialproducto="";

	protected SegmentoProductoBeanSwingJInternalFrame segmentoproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_segmentoproducto="";

	protected TallaProductoBeanSwingJInternalFrame tallaproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tallaproducto="";
	
	public ProductoSessionBean productoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	public TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean;
	public TipoCosteoSessionBean tipocosteoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public UnidadSessionBean unidadpesoSessionBean;
	public ArancelSessionBean arancelSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public ClienteSessionBean clienteproveedordefectoSessionBean;
	public TipoProductoSessionBean tipoproductoSessionBean;
	public ColorProductoSessionBean colorproductoSessionBean;
	public ClaseProductoSessionBean claseproductoSessionBean;
	public EfectoProductoSessionBean efectoproductoSessionBean;
	public MarcaProductoSessionBean marcaproductoSessionBean;
	public ModeloProductoSessionBean modeloproductoSessionBean;
	public MaterialProductoSessionBean materialproductoSessionBean;
	public SegmentoProductoSessionBean segmentoproductoSessionBean;
	public TallaProductoSessionBean tallaproductoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Producto> productos;		
	public List<Producto> productosEliminados;	
	public List<Producto> productosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByProducto;		
	protected JButton jButtonAbrirOrderByProducto;
	
	
	//protected JPanel jPanelOrderByProducto;
	//public JScrollPane jScrollPanelOrderByProducto;	
	//protected JButton jButtonCerrarOrderByProducto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ProductoLogic productoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosProducto;
	public JScrollPane jScrollPanelDatosEdicionProducto;
	public JScrollPane jScrollPanelDatosGeneralProducto;
    
	
	
	//public JScrollPane jScrollPanelDatosProductoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoProducto;
	//public JScrollPane jScrollPanelImportacionProducto;
	
	
	
	protected JPanel jPanelAccionesProducto;
	
    protected JPanel jPanelPaginacionProducto;
    protected JPanel jPanelParametrosReportesProducto;
	protected JPanel jPanelParametrosReportesAccionesProducto;
	
	
	
	
	
	

	protected JPanel jPanelCamposIniciogeneralProducto;
	protected Integer iXPanelCamposIniciogeneralProducto=0;
	protected Integer iYPanelCamposIniciogeneralProducto=0;

	protected JPanel jPanelCamposIniciodatoProducto;
	protected Integer iXPanelCamposIniciodatoProducto=0;
	protected Integer iYPanelCamposIniciodatoProducto=0;

	protected JPanel jPanelCamposIniciocaracteristicaProducto;
	protected Integer iXPanelCamposIniciocaracteristicaProducto=0;
	protected Integer iYPanelCamposIniciocaracteristicaProducto=0;;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Producto;
	protected JPanel jPanelParametrosAuxiliar2Producto;
	protected JPanel jPanelParametrosAuxiliar3Producto;
	protected JPanel jPanelParametrosAuxiliar4Producto;
	//protected JPanel jPanelParametrosAuxiliar5Producto;
	
	
	
	//protected JPanel jPanelReporteDinamicoProducto;
	//protected JPanel jPanelImportacionProducto;
	
	
	public JTable jTableDatosProducto;
	
	
	
	//public JTable jTableDatosProductoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoProducto;
	protected JButton jButtonDuplicarProducto;
	protected JButton jButtonCopiarProducto;
	protected JButton jButtonVerFormProducto;
	protected JButton jButtonNuevoRelacionesProducto;
	protected JButton jButtonModificarProducto;
	
    protected JButton jButtonGuardarCambiosTablaProducto;
	protected JButton jButtonCerrarProducto;
	
	
	protected JButton jButtonRecargarInformacionProducto;
	protected JButton jButtonProcesarInformacionProducto;
	
	
	protected JButton jButtonAnterioresProducto;
	protected JButton jButtonSiguientesProducto;
	protected JButton jButtonNuevoGuardarCambiosProducto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoProducto;
	//protected JButton jButtonCerrarReporteDinamicoProducto;
	//protected JButton jButtonGenerarExcelReporteDinamicoProducto;	
	
	
	
	//protected JButton jButtonAbrirImportacionProducto;
	//protected JButton jButtonGenerarImportacionProducto;
	//protected JButton jButtonCerrarImportacionProducto;
	//protected JFileChooser jFileChooserImportacionProducto;
	//protected File fileImportacionProducto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProducto;
	protected JButton jButtonDuplicarToolBarProducto;
	protected JButton jButtonNuevoRelacionesToolBarProducto;
	
	
	public JButton jButtonGuardarCambiosToolBarProducto;
	protected JButton jButtonCopiarToolBarProducto;
	protected JButton jButtonVerFormToolBarProducto;
	public JButton jButtonGuardarCambiosTablaToolBarProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarProducto;
	protected JButton jButtonCerrarToolBarProducto;
	
	protected JButton jButtonRecargarInformacionToolBarProducto;
	protected JButton jButtonProcesarInformacionToolBarProducto;
	protected JButton jButtonAnterioresToolBarProducto;
	protected JButton jButtonSiguientesToolBarProducto;
	protected JButton jButtonNuevoGuardarCambiosToolBarProducto;
	protected JButton jButtonAbrirOrderByToolBarProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProducto;
	protected JMenuItem jMenuItemDuplicarProducto;
	protected JMenuItem jMenuItemNuevoRelacionesProducto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosProducto;
	protected JMenuItem jMenuItemCopiarProducto;
	protected JMenuItem jMenuItemVerFormProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaProducto;
	protected JMenuItem jMenuItemCerrarProducto;
	protected JMenuItem jMenuItemDetalleCerrarProducto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarProducto;
	
	protected JMenuItem jMenuItemRecargarInformacionProducto;
	protected JMenuItem jMenuItemProcesarInformacionProducto;
	protected JMenuItem jMenuItemAnterioresProducto;
	protected JMenuItem jMenuItemSiguientesProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProducto;
	protected JMenuItem jMenuItemAbrirOrderByProducto;
	protected JMenuItem jMenuItemMostrarOcultarProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProducto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosProducto;
	protected JCheckBox jCheckBoxSeleccionadosProducto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaProducto;
	protected JCheckBox jCheckBoxConGraficoReporteProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoProducto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoProducto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarProducto;
	protected JTextField jTextFieldValorCampoGeneralProducto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteProducto;
	//public JList<Reporte> jListColumnasSelectReporteProducto;
	//public JScrollPane jScrollColumnasSelectReporteProducto;
	
	//public JLabel jLabelRelacionesSelectReporteProducto;
	//public JList<Reporte> jListRelacionesSelectReporteProducto;
	//public JScrollPane jScrollRelacionesSelectReporteProducto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoProducto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoProducto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoProducto;
	//public JLabel jLabelTiposArchivoReporteDinamicoProducto;
	
		
	//public JLabel jLabelArchivoImportacionProducto;	
	//public JLabel jLabelPathArchivoImportacionProducto;
	//protected JTextField jTextFieldPathArchivoImportacionProducto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoProducto;
	
	//public JLabel jLabelColumnaCategoriaValorProducto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorProducto;
	
	//public JLabel jLabelColumnasValoresGraficoProducto;
	//public JList<Reporte> jListColumnasValoresGraficoProducto;
	//public JScrollPane jScrollColumnasValoresGraficoProducto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoProducto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoProducto;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasProducto;
	public JPanel jPanelBusquedaPorCodigoProducto;
	public JButton jButtonBusquedaPorCodigoProducto;
	public JPanel jPanelBusquedaPorNombreProducto;
	public JButton jButtonBusquedaPorNombreProducto;
	public JPanel jPanelFK_IdClaseProductoProducto;
	public JButton jButtonFK_IdClaseProductoProducto;
	public JPanel jPanelFK_IdClienteProducto;
	public JButton jButtonFK_IdClienteProducto;
	public JPanel jPanelFK_IdClienteProveedorDefectoProducto;
	public JButton jButtonFK_IdClienteProveedorDefectoProducto;
	public JPanel jPanelFK_IdLineaProducto;
	public JButton jButtonFK_IdLineaProducto;
	public JPanel jPanelFK_IdMarcaProductoProducto;
	public JButton jButtonFK_IdMarcaProductoProducto;
	public JPanel jPanelFK_IdModeloProductoProducto;
	public JButton jButtonFK_IdModeloProductoProducto;
	public JPanel jPanelFK_IdTipoProductoProducto;
	public JButton jButtonFK_IdTipoProductoProducto;
	public JPanel jPanelFK_IdTipoProductoServicioProducto;
	public JButton jButtonFK_IdTipoProductoServicioProducto;
	public JPanel jPanelFK_IdTipoProductoServicioInvenProducto;
	public JButton jButtonFK_IdTipoProductoServicioInvenProducto;
	
	public JPanel jPanelcodigoBusquedaPorCodigoProducto;
	public JLabel jLabelcodigoBusquedaPorCodigoProducto;
	public JTextField jTextFieldcodigoBusquedaPorCodigoProducto;
	public JButton jButtoncodigoBusquedaPorCodigoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreProducto;
	public JLabel jLabelnombreBusquedaPorNombreProducto;
	public JTextArea jTextAreanombreBusquedaPorNombreProducto;
	public JButton jButtonnombreBusquedaPorNombreProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clase_productoFK_IdClaseProductoProducto;
	public JLabel jLabelid_clase_productoFK_IdClaseProductoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clase_productoFK_IdClaseProductoProducto;
	public JButton jButtonid_clase_productoFK_IdClaseProductoProducto= new JButtonMe();
	public JButton jButtonid_clase_productoFK_IdClaseProductoProductoUpdate= new JButtonMe();
	public JButton jButtonid_clase_productoFK_IdClaseProductoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteFK_IdClienteProducto;
	public JLabel jLabelid_clienteFK_IdClienteProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteProducto;
	public JButton jButtonid_clienteFK_IdClienteProducto= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProductoUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteProducto;
	
	public JPanel jPanelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto;
	public JLabel jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto;
	public JButton jButtonid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto= new JButtonMe();
	public JButton jButtonid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProductoUpdate= new JButtonMe();
	public JButton jButtonid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProductoBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto;
	
	public JPanel jPanelid_lineaFK_IdLineaProducto;
	public JLabel jLabelid_lineaFK_IdLineaProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaFK_IdLineaProducto;
	public JButton jButtonid_lineaFK_IdLineaProducto= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoUpdate= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoBusqueda= new JButtonMe();
	public JButton jButtonid_lineaFK_IdLineaProductoArbol= new JButtonMe();

	
	public JPanel jPanelid_marca_productoFK_IdMarcaProductoProducto;
	public JLabel jLabelid_marca_productoFK_IdMarcaProductoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_marca_productoFK_IdMarcaProductoProducto;
	public JButton jButtonid_marca_productoFK_IdMarcaProductoProducto= new JButtonMe();
	public JButton jButtonid_marca_productoFK_IdMarcaProductoProductoUpdate= new JButtonMe();
	public JButton jButtonid_marca_productoFK_IdMarcaProductoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_modelo_productoFK_IdModeloProductoProducto;
	public JLabel jLabelid_modelo_productoFK_IdModeloProductoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_modelo_productoFK_IdModeloProductoProducto;
	public JButton jButtonid_modelo_productoFK_IdModeloProductoProducto= new JButtonMe();
	public JButton jButtonid_modelo_productoFK_IdModeloProductoProductoUpdate= new JButtonMe();
	public JButton jButtonid_modelo_productoFK_IdModeloProductoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_productoFK_IdTipoProductoProducto;
	public JLabel jLabelid_tipo_productoFK_IdTipoProductoProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_productoFK_IdTipoProductoProducto;
	public JButton jButtonid_tipo_productoFK_IdTipoProductoProducto= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_productoFK_IdTipoProductoProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto;
	public JLabel jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto;
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioProducto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicioFK_IdTipoProductoServicioProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto;
	public JLabel jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto;
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProductoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProductoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=2002;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ProductoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionProducto)	{
		this.jButtonRecargarInformacionProducto = jButtonRecargarInformacionProducto;
	}
	
	public JButton getjButtonProcesarInformacionProducto() {
		return this.jButtonProcesarInformacionProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProducto)	{
		this.jButtonProcesarInformacionProducto = jButtonProcesarInformacionProducto;
	}
	
	
	public JButton getjButtonRecargarInformacionProducto() {
		return this.jButtonRecargarInformacionProducto;
	}
	
	
	public List<Producto> getproductos() {
		return this.productos;
	}

	public void setproductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public List<Producto> getproductosAux() {
		return this.productosAux;
	}

	public void setproductosAux(List<Producto> productosAux) {
		this.productosAux = productosAux;
	}
	
	public List<Producto> getproductosEliminados() {
		return this.productosEliminados;
	}

	public void setProductosEliminados(List<Producto> productosEliminados) {
		this.productosEliminados = productosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarProducto() {
		return jComboBoxTiposSeleccionarProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarProducto(
			JComboBox jComboBoxTiposSeleccionarProducto) {
		this.jComboBoxTiposSeleccionarProducto = jComboBoxTiposSeleccionarProducto;
	}
	
	public void setBorderResaltarTiposSeleccionarProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarProducto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralProducto() {
		return jTextFieldValorCampoGeneralProducto;
	}

	public void setjTextFieldValorCampoGeneralProducto(
			JTextField jTextFieldValorCampoGeneralProducto) {
		this.jTextFieldValorCampoGeneralProducto = jTextFieldValorCampoGeneralProducto;
	}

	public void setBorderResaltarValorCampoGeneralProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralProducto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosProducto() {
		return this.jCheckBoxSeleccionarTodosProducto;
	}

	public void setjCheckBoxSeleccionarTodosProducto(
			JCheckBox jCheckBoxSeleccionarTodosProducto) {
		this.jCheckBoxSeleccionarTodosProducto = jCheckBoxSeleccionarTodosProducto;
	}

	public void setBorderResaltarSeleccionarTodosProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosProducto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosProducto() {
		return this.jCheckBoxSeleccionadosProducto;
	}

	public void setjCheckBoxSeleccionadosProducto(
			JCheckBox jCheckBoxSeleccionadosProducto) {
		this.jCheckBoxSeleccionadosProducto = jCheckBoxSeleccionadosProducto;
	}
	
	public void setBorderResaltarSeleccionadosProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosProducto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesProducto() {
		return this.jComboBoxTiposArchivosReportesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesProducto(
			JComboBox jComboBoxTiposArchivosReportesProducto) {
		this.jComboBoxTiposArchivosReportesProducto = jComboBoxTiposArchivosReportesProducto;
	}

	public void setBorderResaltarTiposArchivosReportesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesProducto() {
		return this.jComboBoxTiposReportesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesProducto(
			JComboBox jComboBoxTiposReportesProducto) {
		this.jComboBoxTiposReportesProducto = jComboBoxTiposReportesProducto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoProducto() {
	//	return jComboBoxTiposReportesDinamicoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoProducto(
	//		JComboBox jComboBoxTiposReportesDinamicoProducto) {
	//	this.jComboBoxTiposReportesDinamicoProducto = jComboBoxTiposReportesDinamicoProducto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoProducto() {
	//	return jComboBoxTiposArchivosReportesDinamicoProducto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoProducto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoProducto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoProducto = jComboBoxTiposArchivosReportesDinamicoProducto;
	//}
	
	public void setBorderResaltarTiposReportesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesProducto() {
		return this.jComboBoxTiposGraficosReportesProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesProducto(
			JComboBox jComboBoxTiposGraficosReportesProducto) {
		this.jComboBoxTiposGraficosReportesProducto = jComboBoxTiposGraficosReportesProducto;
	}
	
	public void setBorderResaltarTiposGraficosReportesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionProducto() {
		return this.jComboBoxTiposPaginacionProducto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionProducto(
			JComboBox jComboBoxTiposPaginacionProducto) {
		this.jComboBoxTiposPaginacionProducto = jComboBoxTiposPaginacionProducto;
	}
	
	public void setBorderResaltarTiposPaginacionProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionProducto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesProducto() {
		return this.jComboBoxTiposRelacionesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProducto() {
		return this.jComboBoxTiposAccionesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProducto(
			JComboBox jComboBoxTiposRelacionesProducto) {
		this.jComboBoxTiposRelacionesProducto = jComboBoxTiposRelacionesProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProducto(
			JComboBox jComboBoxTiposAccionesProducto) {
		this.jComboBoxTiposAccionesProducto = jComboBoxTiposAccionesProducto;
	}
	
	public void setBorderResaltarTiposRelacionesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesProducto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesProducto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarProducto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesProducto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoProducto() {
	//	return jCheckBoxConGraficoDinamicoProducto;
	//}

	//public void setjCheckBoxConGraficoDinamicoProducto(
	//		JCheckBox jCheckBoxConGraficoDinamicoProducto) {
	//	this.jCheckBoxConGraficoDinamicoProducto = jCheckBoxConGraficoDinamicoProducto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoProducto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarProducto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoProducto .setBorder(borderResaltar);		
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
		this.productoSessionBean=new ProductoSessionBean();
		
		this.productoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Producto MANTENIMIENTO"));
		
		
		if(iWidth > 6750) {
			iWidth=6750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {
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
		
		ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Producto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarProducto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarProducto,this.jTtoolBarProducto,
							"nuevo","nuevo","Nuevo"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarProducto,this.jTtoolBarProducto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarProducto,this.jTtoolBarProducto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarProducto,this.jTtoolBarProducto,
							"duplicar","duplicar","Duplicar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarProducto,this.jTtoolBarProducto,
							"copiar","copiar","Copiar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarProducto,this.jTtoolBarProducto,
							"ver_form","ver_form","Ver"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProducto,this.jTtoolBarProducto,
							"recargar","recargar","Recargar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProducto,this.jTtoolBarProducto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarProducto,this.jTtoolBarProducto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarProducto,this.jTtoolBarProducto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarProducto,this.jTtoolBarProducto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarProducto,this.jTtoolBarProducto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarProducto,this.jTtoolBarProducto,
							"cerrar","cerrar","Salir"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarProducto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarProducto;
			
				this.jButtonProcesarInformacionToolBarProducto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarProducto;
				
		//protected JButton jButtonModificarToolBarProducto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarProducto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuProducto=new JMenuMe("General");
		this.jmenuArchivoProducto=new JMenuMe("Archivo");
		this.jmenuAccionesProducto=new JMenuMe("Acciones");
		this.jmenuDatosProducto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarProducto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarProducto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarProducto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesProducto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesProducto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesProducto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarProducto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarProducto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarProducto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormProducto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormProducto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormProducto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaProducto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaProducto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaProducto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionProducto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionProducto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionProducto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionProducto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionProducto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionProducto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresProducto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresProducto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresProducto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesProducto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesProducto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesProducto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByProducto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByProducto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByProducto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosProducto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosProducto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosProducto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoProducto.add(this.jMenuItemCerrarProducto);
			
			this.jmenuAccionesProducto.add(this.jMenuItemNuevoProducto);
			this.jmenuAccionesProducto.add(this.jMenuItemNuevoGuardarCambiosProducto);
			this.jmenuAccionesProducto.add(this.jMenuItemNuevoRelacionesProducto);
			this.jmenuAccionesProducto.add(this.jMenuItemGuardarCambiosTablaProducto);		
			this.jmenuAccionesProducto.add(this.jMenuItemDuplicarProducto);		
			this.jmenuAccionesProducto.add(this.jMenuItemCopiarProducto);		
			this.jmenuAccionesProducto.add(this.jMenuItemVerFormProducto);		
			
			this.jmenuDatosProducto.add(this.jMenuItemRecargarInformacionProducto);				
			this.jmenuDatosProducto.add(this.jMenuItemAnterioresProducto);				
			this.jmenuDatosProducto.add(this.jMenuItemSiguientesProducto);				
			this.jmenuDatosProducto.add(this.jMenuItemAbrirOrderByProducto);				
			this.jmenuDatosProducto.add(this.jMenuItemMostrarOcultarProducto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesProducto.add(this.jMenuItemGuardarCambiosProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarProducto.add(this.jmenuArchivoProducto);		
			this.jmenuBarProducto.add(this.jmenuAccionesProducto);		
			this.jmenuBarProducto.add(this.jmenuDatosProducto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarProducto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasProducto() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoProducto.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoProducto= new JButtonMe();
		this.jButtonBusquedaPorCodigoProducto.setText("Buscar");
		this.jButtonBusquedaPorCodigoProducto.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoProducto,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoProducto = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoProducto.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoProducto.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoProducto= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreProducto.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreProducto= new JButtonMe();
		this.jButtonBusquedaPorNombreProducto.setText("Buscar");
		this.jButtonBusquedaPorNombreProducto.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreProducto,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreProducto = new JLabelMe();
		jLabelnombreBusquedaPorNombreProducto.setText("Nombre :");
		jLabelnombreBusquedaPorNombreProducto.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreProducto= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClaseProductoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClaseProductoProducto.setToolTipText("Buscar Por Clase Producto ");
		this.jButtonFK_IdClaseProductoProducto= new JButtonMe();
		this.jButtonFK_IdClaseProductoProducto.setText("Buscar");
		this.jButtonFK_IdClaseProductoProducto.setToolTipText("Buscar Por Clase Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClaseProductoProducto,"buscar_button","Buscar Por Clase Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClaseProductoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clase_productoFK_IdClaseProductoProducto = new JLabelMe();
		jLabelid_clase_productoFK_IdClaseProductoProducto.setText("Clase Producto :");
		jLabelid_clase_productoFK_IdClaseProductoProducto.setToolTipText("Clase Producto");
		jLabelid_clase_productoFK_IdClaseProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clase_productoFK_IdClaseProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clase_productoFK_IdClaseProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clase_productoFK_IdClaseProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clase_productoFK_IdClaseProductoProducto= new JComboBoxMe();
		jComboBoxid_clase_productoFK_IdClaseProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoFK_IdClaseProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clase_productoFK_IdClaseProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clase_productoFK_IdClaseProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdClienteProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProducto.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteProducto= new JButtonMe();
		this.jButtonFK_IdClienteProducto.setText("Buscar");
		this.jButtonFK_IdClienteProducto.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProducto,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteProducto = new JLabelMe();
		jLabelid_clienteFK_IdClienteProducto.setText("Cliente :");
		jLabelid_clienteFK_IdClienteProducto.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteProducto= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteProducto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteProducto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteProducto.setFocusable(false);

		this.jPanelFK_IdClienteProveedorDefectoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteProveedorDefectoProducto.setToolTipText("Buscar Por Cliente Proveedor Defecto ");
		this.jButtonFK_IdClienteProveedorDefectoProducto= new JButtonMe();
		this.jButtonFK_IdClienteProveedorDefectoProducto.setText("Buscar");
		this.jButtonFK_IdClienteProveedorDefectoProducto.setToolTipText("Buscar Por Cliente Proveedor Defecto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteProveedorDefectoProducto,"buscar_button","Buscar Por Cliente Proveedor Defecto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteProveedorDefectoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto = new JLabelMe();
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setText("Cliente Proveedor Defecto :");
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setToolTipText("Cliente Proveedor Defecto");
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto= new JComboBoxMe();
		jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto= new JButtonMe();
		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto.setFocusable(false);

		this.jPanelFK_IdLineaProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdLineaProducto.setToolTipText("Buscar Por Linea ");
		this.jButtonFK_IdLineaProducto= new JButtonMe();
		this.jButtonFK_IdLineaProducto.setText("Buscar");
		this.jButtonFK_IdLineaProducto.setToolTipText("Buscar Por Linea ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdLineaProducto,"buscar_button","Buscar Por Linea ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdLineaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_lineaFK_IdLineaProducto = new JLabelMe();
		jLabelid_lineaFK_IdLineaProducto.setText("Linea :");
		jLabelid_lineaFK_IdLineaProducto.setToolTipText("Linea");
		jLabelid_lineaFK_IdLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_lineaFK_IdLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_lineaFK_IdLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_lineaFK_IdLineaProducto= new JComboBoxMe();
		jComboBoxid_lineaFK_IdLineaProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaFK_IdLineaProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaFK_IdLineaProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdMarcaProductoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdMarcaProductoProducto.setToolTipText("Buscar Por Marca Producto ");
		this.jButtonFK_IdMarcaProductoProducto= new JButtonMe();
		this.jButtonFK_IdMarcaProductoProducto.setText("Buscar");
		this.jButtonFK_IdMarcaProductoProducto.setToolTipText("Buscar Por Marca Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdMarcaProductoProducto,"buscar_button","Buscar Por Marca Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdMarcaProductoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_marca_productoFK_IdMarcaProductoProducto = new JLabelMe();
		jLabelid_marca_productoFK_IdMarcaProductoProducto.setText("Marca Producto :");
		jLabelid_marca_productoFK_IdMarcaProductoProducto.setToolTipText("Marca Producto");
		jLabelid_marca_productoFK_IdMarcaProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_marca_productoFK_IdMarcaProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_marca_productoFK_IdMarcaProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_marca_productoFK_IdMarcaProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_marca_productoFK_IdMarcaProductoProducto= new JComboBoxMe();
		jComboBoxid_marca_productoFK_IdMarcaProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoFK_IdMarcaProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_marca_productoFK_IdMarcaProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_marca_productoFK_IdMarcaProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModeloProductoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModeloProductoProducto.setToolTipText("Buscar Por Modelo Producto ");
		this.jButtonFK_IdModeloProductoProducto= new JButtonMe();
		this.jButtonFK_IdModeloProductoProducto.setText("Buscar");
		this.jButtonFK_IdModeloProductoProducto.setToolTipText("Buscar Por Modelo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModeloProductoProducto,"buscar_button","Buscar Por Modelo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModeloProductoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_modelo_productoFK_IdModeloProductoProducto = new JLabelMe();
		jLabelid_modelo_productoFK_IdModeloProductoProducto.setText("Modelo Producto :");
		jLabelid_modelo_productoFK_IdModeloProductoProducto.setToolTipText("Modelo Producto");
		jLabelid_modelo_productoFK_IdModeloProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_modelo_productoFK_IdModeloProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_modelo_productoFK_IdModeloProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_modelo_productoFK_IdModeloProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_modelo_productoFK_IdModeloProductoProducto= new JComboBoxMe();
		jComboBoxid_modelo_productoFK_IdModeloProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoFK_IdModeloProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_modelo_productoFK_IdModeloProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_modelo_productoFK_IdModeloProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoProducto.setToolTipText("Buscar Por Tipo Producto ");
		this.jButtonFK_IdTipoProductoProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoProducto.setToolTipText("Buscar Por Tipo Producto ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoProducto,"buscar_button","Buscar Por Tipo Producto ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_productoFK_IdTipoProductoProducto = new JLabelMe();
		jLabelid_tipo_productoFK_IdTipoProductoProducto.setText("Tipo Producto :");
		jLabelid_tipo_productoFK_IdTipoProductoProducto.setToolTipText("Tipo Producto");
		jLabelid_tipo_productoFK_IdTipoProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_productoFK_IdTipoProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_productoFK_IdTipoProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_productoFK_IdTipoProductoProducto= new JComboBoxMe();
		jComboBoxid_tipo_productoFK_IdTipoProductoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_productoFK_IdTipoProductoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_productoFK_IdTipoProductoProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoServicioProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoServicioProducto.setToolTipText("Buscar Por Tipo Producto Servicio ");
		this.jButtonFK_IdTipoProductoServicioProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoServicioProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoServicioProducto.setToolTipText("Buscar Por Tipo Producto Servicio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoServicioProducto,"buscar_button","Buscar Por Tipo Producto Servicio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoServicioProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto = new JLabelMe();
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setText("Tipo Producto Servicio :");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setToolTipText("Tipo Producto Servicio");
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoProductoServicioInvenProducto=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoProductoServicioInvenProducto.setToolTipText("Buscar Por Tipo Producto Servicio. ");
		this.jButtonFK_IdTipoProductoServicioInvenProducto= new JButtonMe();
		this.jButtonFK_IdTipoProductoServicioInvenProducto.setText("Buscar");
		this.jButtonFK_IdTipoProductoServicioInvenProducto.setToolTipText("Buscar Por Tipo Producto Servicio. ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoProductoServicioInvenProducto,"buscar_button","Buscar Por Tipo Producto Servicio. ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoProductoServicioInvenProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto = new JLabelMe();
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setText("Tipo Producto Servicio. :");
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setToolTipText("Tipo Producto Servicio.");
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto= new JComboBoxMe();
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasProducto=new JTabbedPane();


		this.jTabbedPaneBusquedasProducto.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProducto.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));
		this.jTabbedPaneBusquedasProducto.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,45)));

		//this.jTabbedPaneBusquedasProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasProducto,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleProducto = new ProductoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Producto DATOS");
			this.jInternalFrameDetalleFormProducto = new ProductoDetalleFormJInternalFrame(jDesktopPane,this.productoSessionBean.getConGuardarRelaciones(),this.productoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormProducto = null;//new ProductoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProducto= new GridBagLayout();
		
		
		this.jTableDatosProducto = new JTableMe();      
		
		String sToolTipProducto="";
		sToolTipProducto=ProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProducto+="(Inventario.Producto)";
		}
		
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProducto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosProducto.setToolTipText(sToolTipProducto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosProducto);
		this.jTableDatosProducto.setAutoCreateRowSorter(true);
		this.jTableDatosProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosProducto.setRowSelectionAllowed(true);
		this.jTableDatosProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosProducto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoProducto = new JButtonMe();
		this.jButtonDuplicarProducto = new JButtonMe();
		this.jButtonCopiarProducto = new JButtonMe();
		this.jButtonVerFormProducto = new JButtonMe();
		this.jButtonNuevoRelacionesProducto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaProducto = new JButtonMe();
		this.jButtonCerrarProducto = new JButtonMe();
		
		this.jScrollPanelDatosProducto = new JScrollPane();   
        this.jScrollPanelDatosGeneralProducto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocaracteristicaProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		//}
		
		this.sPath=" <---> Acceso: Producto";
		
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProducto.setToolTipText("Acciones");
        this.jPanelAccionesProducto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralProducto.setName("jPanelCamposFingeneralProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato"));
		this.jPanelCamposIniciodatoProducto.setName("jPanelCamposFindatoProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatoProducto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocaracteristicaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristica"));
		this.jPanelCamposIniciocaracteristicaProducto.setName("jPanelCamposFincaracteristicaProducto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocaracteristicaProducto, STIPO_TAMANIO_GENERAL,false,false,this);;
		
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
				
		if(!this.conCargarMinimo) {
			
			//REPORTE DINAMICO
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameReporteDinamicoProducto=new ReporteDinamicoJInternalFrame(ProductoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoProducto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionProducto=new ImportacionJInternalFrame(ProductoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionProducto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByProducto = new JButtonMe();
		
		this.jButtonAbrirOrderByProducto.setText("Orden");
		this.jButtonAbrirOrderByProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProducto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProducto,false,this);
			
			//this.cargarOrderByProducto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProducto,true,this);
			
			//this.cargarOrderByProducto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosProducto.setMinimumSize(new Dimension(400,50));//6730
		this.jTableDatosProducto.setMaximumSize(new Dimension(400,50));//6730
		this.jTableDatosProducto.setPreferredSize(new Dimension(400,50));//6730
		
		this.jScrollPanelDatosProducto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosProducto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosProducto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoProducto.setText("Nuevo");
		this.jButtonDuplicarProducto.setText("Duplicar");
		this.jButtonCopiarProducto.setText("Copiar");
		this.jButtonVerFormProducto.setText("Ver");
		this.jButtonNuevoRelacionesProducto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaProducto.setText("Guardar");
		this.jButtonCerrarProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProducto,"nuevo_button","Nuevo",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarProducto,"duplicar_button","Duplicar",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarProducto,"copiar_button","Copiar",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormProducto,"ver_form","Ver",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesProducto,"nuevorelaciones_button","Nuevo Rel",this.productoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProducto,"guardarcambiostabla_button","Guardar",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProducto,"cerrar_button","Salir",this.productoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoProducto.setToolTipText("Nuevo"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarProducto.setToolTipText("Duplicar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarProducto.setToolTipText("Copiar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormProducto.setToolTipText("Ver"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesProducto.setToolTipText("Nuevo Rel"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaProducto.setToolTipText("Guardar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProducto.setToolTipText("Salir"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProducto";
		inputMap = this.jButtonNuevoProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProducto"));
		
		//DUPLICAR
		sMapKey = "DuplicarProducto";
		inputMap = this.jButtonDuplicarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarProducto"));
		
		//COPIAR
		sMapKey = "CopiarProducto";
		inputMap = this.jButtonCopiarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarProducto"));
		
		//VEr FORM
		sMapKey = "VerFormProducto";
		inputMap = this.jButtonVerFormProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormProducto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesProducto";
		inputMap = this.jButtonNuevoRelacionesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesProducto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarProducto";
		inputMap = this.jButtonModificarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarProducto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarProducto";
		inputMap = this.jButtonCerrarProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProducto";
		inputMap = this.jButtonGuardarCambiosTablaProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProducto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Producto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Producto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Producto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Producto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Producto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesProducto.setName("jPanelParametrosReportesProducto"); 
		
		this.jPanelParametrosReportesAccionesProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesProducto.setName("jPanelParametrosReportesAccionesProducto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesProducto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionProducto = new JButtonMe();
		this.jButtonRecargarInformacionProducto.setText("Recargar");
		this.jButtonRecargarInformacionProducto.setToolTipText("Recargar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionProducto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionProducto = new JButtonMe();
		this.jButtonProcesarInformacionProducto.setText("Procesar");
		this.jButtonProcesarInformacionProducto.setToolTipText("Procesar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionProducto.setVisible(false);
			
		this.jButtonProcesarInformacionProducto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProducto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionProducto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProducto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesProducto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProducto.setText("TIPO");       
		this.jComboBoxTiposReportesProducto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesProducto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesProducto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionProducto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionProducto.setText("Paginacion");
		this.jComboBoxTiposPaginacionProducto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesProducto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesProducto.setText("Accion");
		this.jComboBoxTiposRelacionesProducto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProducto.setText("Accion");
		this.jComboBoxTiposAccionesProducto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarProducto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarProducto.setText("Accion");
		this.jComboBoxTiposSeleccionarProducto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralProducto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralProducto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProducto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralProducto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesProducto = new JLabelMe();
		
		this.jLabelAccionesProducto.setText("Acciones");		
		this.jLabelAccionesProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosProducto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosProducto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosProducto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosProducto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosProducto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosProducto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaProducto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaProducto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaProducto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteProducto.setText("Graf.");
		this.jCheckBoxConGraficoReporteProducto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresProducto = new JButtonMe();
		//this.jButtonAnterioresProducto.setText("<<");
        this.jButtonAnterioresProducto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresProducto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesProducto = new JButtonMe();
		//this.jButtonSiguientesProducto.setText(">>");
        this.jButtonSiguientesProducto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesProducto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosProducto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosProducto.setText("Nue");
        this.jButtonNuevoGuardarCambiosProducto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosProducto,"nuevoguardarcambios_button","Nue",this.productoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosProducto";
		inputMap = this.jButtonNuevoGuardarCambiosProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosProducto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionProducto";
		inputMap = this.jButtonRecargarInformacionProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionProducto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesProducto";
		inputMap = this.jButtonSiguientesProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesProducto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresProducto";
		inputMap = this.jButtonAnterioresProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresProducto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasProducto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesProducto.setMinimumSize(new Dimension(this.getWidth(),ProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProducto.setMaximumSize(new Dimension(this.getWidth(),ProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesProducto.setPreferredSize(new Dimension(this.getWidth(),ProductoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ProductoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionProducto = new GridBagLayout();

			this.jPanelPaginacionProducto.setLayout(gridaBagLayoutPaginacionProducto);						
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 0;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionProducto.add(this.jButtonAnterioresProducto, this.gridBagConstraintsProducto);
					
						
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProducto.gridy = 0;
			
			this.jPanelPaginacionProducto.add(this.jButtonNuevoGuardarCambiosProducto, this.gridBagConstraintsProducto);
						
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsProducto.gridy = 0;
			this.jPanelPaginacionProducto.add(this.jButtonSiguientesProducto, this.gridBagConstraintsProducto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 1;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProducto.add(this.jButtonNuevoProducto, this.gridBagConstraintsProducto);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsProducto = new GridBagConstraints();
				this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProducto.gridy = 1;
				this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionProducto.add(this.jButtonNuevoRelacionesProducto, this.gridBagConstraintsProducto);
			}
			
			
			if(!this.productoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsProducto = new GridBagConstraints();
				this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsProducto.gridy = 1;
				this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionProducto.add(this.jButtonGuardarCambiosTablaProducto, this.gridBagConstraintsProducto);
			}
			
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 1;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProducto.add(this.jButtonDuplicarProducto, this.gridBagConstraintsProducto);
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 1;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProducto.add(this.jButtonCopiarProducto, this.gridBagConstraintsProducto);
		
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 1;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionProducto.add(this.jButtonVerFormProducto, this.gridBagConstraintsProducto);
		
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 1;
			this.gridBagConstraintsProducto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionProducto.add(this.jButtonCerrarProducto, this.gridBagConstraintsProducto);
		
		
		
		this.jButtonRecargarInformacionProducto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProducto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionProducto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesProducto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProducto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesProducto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionProducto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProducto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionProducto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaProducto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProducto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaProducto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteProducto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProducto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteProducto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteProducto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosProducto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosProducto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProducto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosProducto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesProducto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesProducto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Producto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Producto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Producto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Producto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesProducto.setLayout(gridaBagParametrosReportesProducto);
			this.jPanelParametrosReportesAccionesProducto.setLayout(gridaBagParametrosReportesAccionesProducto);
			
			
			this.jPanelParametrosAuxiliar1Producto.setLayout(gridaBagParametrosAuxiliar1Producto);
			this.jPanelParametrosAuxiliar2Producto.setLayout(gridaBagParametrosAuxiliar2Producto);
			this.jPanelParametrosAuxiliar3Producto.setLayout(gridaBagParametrosAuxiliar3Producto);
			this.jPanelParametrosAuxiliar4Producto.setLayout(gridaBagParametrosAuxiliar4Producto);
			//this.jPanelParametrosAuxiliar5Producto.setLayout(gridaBagParametrosAuxiliar2Producto);			
			
			
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProducto.add(this.jButtonRecargarInformacionProducto, this.gridBagConstraintsProducto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Producto.add(this.jComboBoxTiposPaginacionProducto, this.gridBagConstraintsProducto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Producto.add(this.jCheckBoxConAltoMaximoTablaProducto, this.gridBagConstraintsProducto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Producto.add(this.jComboBoxTiposArchivosReportesProducto, this.gridBagConstraintsProducto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProducto.add(this.jPanelParametrosAuxiliar1Producto, this.gridBagConstraintsProducto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Producto.add(this.jComboBoxTiposReportesProducto, this.gridBagConstraintsProducto);																		
			
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Producto.add(this.jComboBoxTiposGraficosReportesProducto, this.gridBagConstraintsProducto);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProducto.add(this.jPanelParametrosAuxiliar4Producto, this.gridBagConstraintsProducto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProducto.add(this.jComboBoxTiposReportesProducto, this.gridBagConstraintsProducto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProducto.add(this.jCheckBoxGenerarReporteProducto, this.gridBagConstraintsProducto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProducto.add(this.jPanelParametrosAuxiliar2Producto, this.gridBagConstraintsProducto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProducto.add(this.jLabelAccionesProducto, this.gridBagConstraintsProducto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsProducto = new GridBagConstraints();
				this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesProducto.add(this.jButtonAbrirOrderByProducto, this.gridBagConstraintsProducto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProducto.add(this.jComboBoxTiposSeleccionarProducto, this.gridBagConstraintsProducto);			
			
			
			/*
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProducto.add(this.jCheckBoxSeleccionarTodosProducto, this.gridBagConstraintsProducto);
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesProducto.add(this.jCheckBoxConGraficoReporteProducto, this.gridBagConstraintsProducto);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Producto.add(this.jCheckBoxSeleccionarTodosProducto, this.gridBagConstraintsProducto);															
				
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Producto.add(this.jCheckBoxSeleccionadosProducto, this.gridBagConstraintsProducto);															
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsProducto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Producto.add(this.jCheckBoxConGraficoReporteProducto, this.gridBagConstraintsProducto);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesProducto.add(this.jPanelParametrosAuxiliar3Producto, this.gridBagConstraintsProducto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProducto.add(this.jComboBoxTiposRelacionesProducto, this.gridBagConstraintsProducto);
				
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProducto.add(this.jComboBoxTiposAccionesProducto, this.gridBagConstraintsProducto);
	
				
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsProducto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesProducto.add(this.jTextFieldValorCampoGeneralProducto, this.gridBagConstraintsProducto);			
			
			
		
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralProducto= new GridBagLayout();
		this.jPanelCamposIniciogeneralProducto.setLayout(gridaBagLayoutCamposIniciogeneralProducto);

		GridBagLayout gridaBagLayoutCamposIniciodatoProducto= new GridBagLayout();
		this.jPanelCamposIniciodatoProducto.setLayout(gridaBagLayoutCamposIniciodatoProducto);

		GridBagLayout gridaBagLayoutCamposIniciocaracteristicaProducto= new GridBagLayout();
		this.jPanelCamposIniciocaracteristicaProducto.setLayout(gridaBagLayoutCamposIniciocaracteristicaProducto);;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosProducto = new GridBagLayout();

			this.jScrollPanelDatosProducto.setLayout(gridaBagLayoutDatosProducto);
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = 0;
			this.gridBagConstraintsProducto.gridx = 0;
			
			this.jScrollPanelDatosProducto.add(this.jTableDatosProducto, this.gridBagConstraintsProducto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosProducto.setViewportView(this.jTableDatosProducto);
		this.jTableDatosProducto.setFillsViewportHeight(true);
		this.jTableDatosProducto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesProducto= new GridBagLayout();
		this.jPanelAccionesProducto.setLayout(gridaBagLayoutAccionesProducto);
		
		
		/*	
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = 0;
		this.gridBagConstraintsProducto.gridx = 0;
			
		this.jPanelAccionesProducto.add(this.jButtonNuevoProducto, this.gridBagConstraintsProducto);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoProducto.setLayout(gridaBagLayoutBusquedaPorCodigoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelBusquedaPorCodigoProducto.add(jLabelcodigoBusquedaPorCodigoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelBusquedaPorCodigoProducto.add(jTextFieldcodigoBusquedaPorCodigoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelBusquedaPorCodigoProducto.add(jButtonBusquedaPorCodigoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreProducto= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreProducto.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreProducto.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreProducto.setLayout(gridaBagLayoutBusquedaPorNombreProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelBusquedaPorNombreProducto.add(jLabelnombreBusquedaPorNombreProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelBusquedaPorNombreProducto.add(jTextAreanombreBusquedaPorNombreProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelBusquedaPorNombreProducto.add(jButtonBusquedaPorNombreProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdClaseProductoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdClaseProductoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClaseProductoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClaseProductoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClaseProductoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClaseProductoProducto.setLayout(gridaBagLayoutFK_IdClaseProductoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdClaseProductoProducto.add(jLabelid_clase_productoFK_IdClaseProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdClaseProductoProducto.add(jComboBoxid_clase_productoFK_IdClaseProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdClaseProductoProducto.add(jButtonFK_IdClaseProductoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("3.-Por Clase Producto ", jPanelFK_IdClaseProductoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdClienteProducto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProducto.setLayout(gridaBagLayoutFK_IdClienteProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdClienteProducto.add(jLabelid_clienteFK_IdClienteProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdClienteProducto.add(jComboBoxid_clienteFK_IdClienteProducto, gridBagConstraintsProducto);


		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdClienteProducto.add(this.jButtonBuscarFK_IdClienteid_clienteProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdClienteProducto.add(jButtonFK_IdClienteProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("4.-Por Cliente ", jPanelFK_IdClienteProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdClienteProveedorDefectoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdClienteProveedorDefectoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorDefectoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteProveedorDefectoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteProveedorDefectoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteProveedorDefectoProducto.setLayout(gridaBagLayoutFK_IdClienteProveedorDefectoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdClienteProveedorDefectoProducto.add(jLabelid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdClienteProveedorDefectoProducto.add(jComboBoxid_cliente_proveedor_defectoFK_IdClienteProveedorDefectoProducto, gridBagConstraintsProducto);


		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.EAST;
		gridBagConstraintsProducto.fill = GridBagConstraints.NONE;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdClienteProveedorDefectoProducto.add(this.jButtonBuscarFK_IdClienteProveedorDefectoid_cliente_proveedor_defectoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdClienteProveedorDefectoProducto.add(jButtonFK_IdClienteProveedorDefectoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("5.-Por Cliente Proveedor Defecto ", jPanelFK_IdClienteProveedorDefectoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(4, KeyEvent.VK_5);

		GridBagLayout gridaBagLayoutFK_IdLineaProducto= new GridBagLayout();
		gridaBagLayoutFK_IdLineaProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdLineaProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdLineaProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdLineaProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdLineaProducto.setLayout(gridaBagLayoutFK_IdLineaProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdLineaProducto.add(jLabelid_lineaFK_IdLineaProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdLineaProducto.add(jComboBoxid_lineaFK_IdLineaProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdLineaProducto.add(jButtonFK_IdLineaProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("6.-Por Linea ", jPanelFK_IdLineaProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(5, KeyEvent.VK_6);

		GridBagLayout gridaBagLayoutFK_IdMarcaProductoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdMarcaProductoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdMarcaProductoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdMarcaProductoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdMarcaProductoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdMarcaProductoProducto.setLayout(gridaBagLayoutFK_IdMarcaProductoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdMarcaProductoProducto.add(jLabelid_marca_productoFK_IdMarcaProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdMarcaProductoProducto.add(jComboBoxid_marca_productoFK_IdMarcaProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdMarcaProductoProducto.add(jButtonFK_IdMarcaProductoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("7.-Por Marca Producto ", jPanelFK_IdMarcaProductoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(6, KeyEvent.VK_7);

		GridBagLayout gridaBagLayoutFK_IdModeloProductoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdModeloProductoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModeloProductoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModeloProductoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModeloProductoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModeloProductoProducto.setLayout(gridaBagLayoutFK_IdModeloProductoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdModeloProductoProducto.add(jLabelid_modelo_productoFK_IdModeloProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdModeloProductoProducto.add(jComboBoxid_modelo_productoFK_IdModeloProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdModeloProductoProducto.add(jButtonFK_IdModeloProductoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("8.-Por Modelo Producto ", jPanelFK_IdModeloProductoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(7, KeyEvent.VK_8);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoProducto.setLayout(gridaBagLayoutFK_IdTipoProductoProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdTipoProductoProducto.add(jLabelid_tipo_productoFK_IdTipoProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdTipoProductoProducto.add(jComboBoxid_tipo_productoFK_IdTipoProductoProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdTipoProductoProducto.add(jButtonFK_IdTipoProductoProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("9.-Por Tipo Producto ", jPanelFK_IdTipoProductoProducto);
		jTabbedPaneBusquedasProducto.setMnemonicAt(8, KeyEvent.VK_9);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoServicioProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoServicioProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoServicioProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoServicioProducto.setLayout(gridaBagLayoutFK_IdTipoProductoServicioProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdTipoProductoServicioProducto.add(jLabelid_tipo_producto_servicioFK_IdTipoProductoServicioProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdTipoProductoServicioProducto.add(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdTipoProductoServicioProducto.add(jButtonFK_IdTipoProductoServicioProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("10.-Por Tipo Producto Servicio ", jPanelFK_IdTipoProductoServicioProducto);

		GridBagLayout gridaBagLayoutFK_IdTipoProductoServicioInvenProducto= new GridBagLayout();
		gridaBagLayoutFK_IdTipoProductoServicioInvenProducto.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioInvenProducto.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoProductoServicioInvenProducto.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoProductoServicioInvenProducto.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoProductoServicioInvenProducto.setLayout(gridaBagLayoutFK_IdTipoProductoServicioInvenProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 0;
		jPanelFK_IdTipoProductoServicioInvenProducto.add(jLabelid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 0;
		gridBagConstraintsProducto.gridx = 1;
		jPanelFK_IdTipoProductoServicioInvenProducto.add(jComboBoxid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInvenProducto, gridBagConstraintsProducto);

		gridBagConstraintsProducto = new GridBagConstraints();
		gridBagConstraintsProducto.anchor = GridBagConstraints.WEST;
		gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsProducto.gridy = 1;
		gridBagConstraintsProducto.gridx =1;
		jPanelFK_IdTipoProductoServicioInvenProducto.add(jButtonFK_IdTipoProductoServicioInvenProducto, gridBagConstraintsProducto);

		jTabbedPaneBusquedasProducto.addTab("11.-Por Tipo Producto Servicio. ", jPanelFK_IdTipoProductoServicioInvenProducto);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProducto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProducto = new GridBagConstraints();						
			this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProducto.gridx = 0;		
			//this.gridBagConstraintsProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProducto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarProducto, this.gridBagConstraintsProducto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsProducto.gridx = 0;		
		//this.gridBagConstraintsProducto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsProducto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsProducto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProducto.gridx = 0;		
			this.gridBagConstraintsProducto.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsProducto.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasProducto, this.gridBagConstraintsProducto);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesProducto, this.gridBagConstraintsProducto);								
		
		
		/*
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesProducto, this.gridBagConstraintsProducto);
		*/		
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProducto.gridx =0;
		this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProducto, this.gridBagConstraintsProducto);
				
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionProducto, this.gridBagConstraintsProducto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ProductoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosProducto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProducto = new GridBagLayout();
			this.jPanelBusquedasParametrosProducto.setLayout(gridaBagLayoutBusquedasParametrosProducto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			
			
			
			
			
			
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
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProducto, this.gridBagConstraintsProducto);
			
			
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProducto, this.gridBagConstraintsProducto);
		
			
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProducto, this.gridBagConstraintsProducto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralProducto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoProducto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoProducto.setName("jPanelReporteDinamicoProducto"); 
		
		this.jPanelReporteDinamicoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoProducto.setLayout(gridaBagLayoutReporteDinamicoProducto);
		
		
		this.jInternalFrameReporteDinamicoProducto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoProducto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoProducto.setResizable(true);
	    this.jInternalFrameReporteDinamicoProducto.setClosable(true);
	    this.jInternalFrameReporteDinamicoProducto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteProducto = new JLabelMe();

		this.jLabelColumnasSelectReporteProducto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProducto.add(this.jLabelColumnasSelectReporteProducto, this.gridBagConstraintsProducto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteProducto = new JList<Reporte>();
		this.jListColumnasSelectReporteProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteProducto=new JScrollPane(this.jListColumnasSelectReporteProducto);
			
			this.jScrollColumnasSelectReporteProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProducto.add(this.jListColumnasSelectReporteProducto, this.gridBagConstraintsProducto);
		this.jPanelReporteDinamicoProducto.add(this.jScrollColumnasSelectReporteProducto, this.gridBagConstraintsProducto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteProducto = new JLabelMe();

		this.jLabelRelacionesSelectReporteProducto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProducto.add(this.jLabelRelacionesSelectReporteProducto, this.gridBagConstraintsProducto);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteProducto = new JList<Reporte>();
		this.jListRelacionesSelectReporteProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteProducto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteProducto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProducto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteProducto=new JScrollPane(this.jListRelacionesSelectReporteProducto);
			
			this.jScrollRelacionesSelectReporteProducto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProducto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteProducto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoProducto.add(this.jListRelacionesSelectReporteProducto, this.gridBagConstraintsProducto);
		this.jPanelReporteDinamicoProducto.add(this.jScrollRelacionesSelectReporteProducto, this.gridBagConstraintsProducto);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoProducto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoProducto = new JComboBoxMe();
		this.jListColumnasValoresGraficoProducto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoProducto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoProducto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoProducto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoProducto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoProducto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProducto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoProducto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoProducto = new JLabelMe();

		this.jLabelConGraficoDinamicoProducto.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProducto.add(this.jLabelConGraficoDinamicoProducto, this.gridBagConstraintsProducto);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoProducto = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoProducto.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoProducto.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoProducto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProducto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoProducto.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jCheckBoxConGraficoDinamicoProducto, this.gridBagConstraintsProducto);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoProducto = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoProducto.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoProducto.add(this.jLabelColumnaCategoriaGraficoProducto, this.gridBagConstraintsProducto);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoProducto.add(this.jComboBoxColumnaCategoriaGraficoProducto, this.gridBagConstraintsProducto);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorProducto = new JLabelMe();

		this.jLabelColumnaCategoriaValorProducto.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jLabelColumnaCategoriaValorProducto, this.gridBagConstraintsProducto);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorProducto.setText("Accion");
        this.jComboBoxColumnaCategoriaValorProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoProducto.add(this.jComboBoxColumnaCategoriaValorProducto, this.gridBagConstraintsProducto);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoProducto = new JLabelMe();

		this.jLabelColumnasValoresGraficoProducto.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jLabelColumnasValoresGraficoProducto, this.gridBagConstraintsProducto);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoProducto = new JList<Reporte>();
		this.jListColumnasValoresGraficoProducto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoProducto.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoProducto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProducto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoProducto.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoProducto=new JScrollPane(this.jListColumnasValoresGraficoProducto);
			
			this.jScrollColumnasValoresGraficoProducto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProducto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoProducto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoProducto.add(this.jListColumnasSelectReporteProducto, this.gridBagConstraintsProducto);
		this.jPanelReporteDinamicoProducto.add(this.jScrollColumnasValoresGraficoProducto, this.gridBagConstraintsProducto);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoProducto = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoProducto.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jLabelTiposGraficosReportesDinamicoProducto, this.gridBagConstraintsProducto);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoProducto = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoProducto.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoProducto.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoProducto.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jComboBoxTiposGraficosReportesDinamicoProducto, this.gridBagConstraintsProducto);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoProducto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoProducto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jLabelGenerarExcelReporteDinamicoProducto, this.gridBagConstraintsProducto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoProducto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoProducto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoProducto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoProducto.setToolTipText("Generar EXCEL"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsProducto = new GridBagConstraints();
		//this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoProducto.add(this.jButtonGenerarExcelReporteDinamicoProducto, this.gridBagConstraintsProducto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProducto.add(this.jComboBoxTiposReportesDinamicoProducto, this.gridBagConstraintsProducto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoProducto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoProducto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoProducto.add(this.jLabelTiposArchivoReporteDinamicoProducto, this.gridBagConstraintsProducto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProducto.add(this.jComboBoxTiposArchivosReportesDinamicoProducto, this.gridBagConstraintsProducto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoProducto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoProducto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoProducto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoProducto.setToolTipText("Generar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProducto.add(this.jButtonGenerarReporteDinamicoProducto, this.gridBagConstraintsProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoProducto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoProducto.setToolTipText("Cancelar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsProducto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoProducto.add(this.jButtonCerrarReporteDinamicoProducto, this.gridBagConstraintsProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalProducto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoProducto= new JScrollPane(jPanelReporteDinamicoProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoProducto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProducto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoProducto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsProducto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoProducto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalProducto);
		this.jInternalFrameReporteDinamicoProducto.getContentPane().add(this.jScrollPanelReporteDinamicoProducto, this.gridBagConstraintsProducto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionProducto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionProducto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionProducto.setName("jPanelImportacionProducto"); 
		
		this.jPanelImportacionProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionProducto.setLayout(gridaBagLayoutImportacionProducto);
		
		
		this.jInternalFrameImportacionProducto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionProducto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionProducto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteProducto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProducto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProducto.setResizable(true);
	    this.jInternalFrameImportacionProducto.setClosable(true);
	    this.jInternalFrameImportacionProducto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionProducto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionProducto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionProducto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionProducto.setResizable(true);
	    this.jInternalFrameImportacionProducto.setClosable(true);
	    this.jInternalFrameImportacionProducto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionProducto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProducto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionProducto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionProducto = new JLabelMe();

		this.jLabelArchivoImportacionProducto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProducto.add(this.jLabelArchivoImportacionProducto, this.gridBagConstraintsProducto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionProducto = new JFileChooser();		
		this.jFileChooserImportacionProducto.setToolTipText("ESCOGER ARCHIVO"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionProducto = new JButtonMe();
		this.jButtonAbrirImportacionProducto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionProducto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionProducto.setToolTipText("Generar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProducto.add(this.jButtonAbrirImportacionProducto, this.gridBagConstraintsProducto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionProducto = new JLabelMe();

		this.jLabelPathArchivoImportacionProducto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;		
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionProducto.add(this.jLabelPathArchivoImportacionProducto, this.gridBagConstraintsProducto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionProducto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionProducto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProducto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionProducto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProducto.add(this.jTextFieldPathArchivoImportacionProducto, this.gridBagConstraintsProducto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionProducto = new JButtonMe();
		this.jButtonGenerarImportacionProducto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionProducto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionProducto.setToolTipText("Generar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProducto.add(this.jButtonGenerarImportacionProducto, this.gridBagConstraintsProducto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionProducto = new JButtonMe();
		this.jButtonCerrarImportacionProducto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionProducto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionProducto.setToolTipText("Cancelar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProducto.gridy = iPosYImportacion;
		this.gridBagConstraintsProducto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionProducto.add(this.jButtonCerrarImportacionProducto, this.gridBagConstraintsProducto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalProducto = new GridBagLayout();
		
		this.jScrollPanelImportacionProducto= new JScrollPane(jPanelImportacionProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsProducto = new GridBagConstraints();
		this.gridBagConstraintsProducto.gridy =iPosYImportacion;
		this.gridBagConstraintsProducto.gridx =iPosXImportacion;
		this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionProducto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalProducto);
		this.jInternalFrameImportacionProducto.getContentPane().add(this.jScrollPanelImportacionProducto, this.gridBagConstraintsProducto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByProducto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByProducto = new JButtonMe();
			this.jButtonAbrirOrderByProducto.setText("Orden");
			this.jButtonAbrirOrderByProducto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByProducto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByProducto";
			inputMap = this.jButtonAbrirOrderByProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByProducto"));
		
		
			GridBagLayout gridaBagLayoutOrderByProducto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByProducto.setName("jPanelOrderByProducto"); 
			
			this.jPanelOrderByProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByProducto.setLayout(gridaBagLayoutOrderByProducto);
			
			
			this.jTableDatosProductoOrderBy = new JTableMe();        
			this.jTableDatosProductoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosProductoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosProductoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosProductoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosProductoOrderBy.setViewportView(this.jTableDatosProductoOrderBy);
			this.jTableDatosProductoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosProductoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByProducto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByProducto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByProducto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteProducto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByProducto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByProducto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByProducto.setTitle("Orden");
			this.jInternalFrameOrderByProducto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByProducto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByProducto.setResizable(true);
			this.jInternalFrameOrderByProducto.setClosable(true);
			this.jInternalFrameOrderByProducto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByProducto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProducto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByProducto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Productos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsProducto.ipady =150;
				
			this.jPanelOrderByProducto.add(jScrollPanelDatosProductoOrderBy, this.gridBagConstraintsProducto);//this.jTableDatosProductoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByProducto = new JButtonMe();
			this.jButtonCerrarOrderByProducto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByProducto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByProducto.setToolTipText("Cancelar"+" "+ProductoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProducto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsProducto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByProducto.add(this.jButtonCerrarOrderByProducto, this.gridBagConstraintsProducto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalProducto = new GridBagLayout();
			
			this.jScrollPanelOrderByProducto= new JScrollPane(jPanelOrderByProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsProducto = new GridBagConstraints();
			this.gridBagConstraintsProducto.gridy =iPosYOrderBy;
			this.gridBagConstraintsProducto.gridx =iPosXOrderBy;
			this.gridBagConstraintsProducto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByProducto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByProducto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalProducto);
			
			this.jInternalFrameOrderByProducto.getContentPane().add(this.jScrollPanelOrderByProducto, this.gridBagConstraintsProducto);			
		
		} else {
			this.jButtonAbrirOrderByProducto = new JButtonMe();
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
		int iWidthTableCalculado=0;//15630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=6730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=6800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=2100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.productoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosProducto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosProducto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosProducto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosProducto.getRowHeight();//ProductoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.productoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProducto.isSelected()) {
					iHeightTable=ProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaProducto.isSelected()) {
					iHeightTable=ProductoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ProductoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosProducto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProducto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosProducto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByProducto!=null && this.jInternalFrameOrderByProducto.getjTableDatosOrderBy()!=null) {
			//if(!this.productoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByProducto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByProducto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByProducto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByProducto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByProducto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByProducto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByProducto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosProducto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProducto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosProducto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=productoLogic.getProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Producto> TraerProductoBeans(List<Producto> productos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Producto producto:productos) {
					
				if(!(ProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ProductoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					producto.setsDetalleGeneralEntityReporte(ProductoConstantesFunciones.getProductoDescripcion(producto));
										
					producto.setesta_activo_descripcion(ProductoConstantesFunciones.getesta_activoDescripcion(producto));producto.setcon_stock_negativo_descripcion(ProductoConstantesFunciones.getcon_stock_negativoDescripcion(producto));producto.setcon_precio_minimo_descripcion(ProductoConstantesFunciones.getcon_precio_minimoDescripcion(producto));producto.setcon_lote_descripcion(ProductoConstantesFunciones.getcon_loteDescripcion(producto));producto.setcon_confirmacion_descripcion(ProductoConstantesFunciones.getcon_confirmacionDescripcion(producto));producto.setcon_presupuesto_descripcion(ProductoConstantesFunciones.getcon_presupuestoDescripcion(producto));producto.setcon_importacion_descripcion(ProductoConstantesFunciones.getcon_importacionDescripcion(producto));producto.setcon_final_descripcion(ProductoConstantesFunciones.getcon_finalDescripcion(producto));producto.setcon_consep_descripcion(ProductoConstantesFunciones.getcon_consepDescripcion(producto));producto.setcon_serie_descripcion(ProductoConstantesFunciones.getcon_serieDescripcion(producto));producto.setcon_balanza_descripcion(ProductoConstantesFunciones.getcon_balanzaDescripcion(producto));	
					
					

					if(producto.getProveedorProductos()!=null && Funciones.existeClass(classes,ProveedorProducto.class)) {
						try{producto.setproveedorproductosDescripcionReporte(new JRBeanCollectionDataSource(ProveedorProductoJInternalFrame.TraerProveedorProductoBeans(producto.getProveedorProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getPrecios()!=null && Funciones.existeClass(classes,Precio.class)) {
						try{producto.setpreciosDescripcionReporte(new JRBeanCollectionDataSource(PrecioJInternalFrame.TraerPrecioBeans(producto.getPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getDetalleImpuestoInvens()!=null && Funciones.existeClass(classes,DetalleImpuestoInven.class)) {
						try{producto.setdetalleimpuestoinvensDescripcionReporte(new JRBeanCollectionDataSource(DetalleImpuestoInvenJInternalFrame.TraerDetalleImpuestoInvenBeans(producto.getDetalleImpuestoInvens(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getPresupuestoVentass()!=null && Funciones.existeClass(classes,PresupuestoVentas.class)) {
						try{producto.setpresupuestoventassDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasJInternalFrame.TraerPresupuestoVentasBeans(producto.getPresupuestoVentass(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getPoliticaProductos()!=null && Funciones.existeClass(classes,PoliticaProducto.class)) {
						try{producto.setpoliticaproductosDescripcionReporte(new JRBeanCollectionDataSource(PoliticaProductoJInternalFrame.TraerPoliticaProductoBeans(producto.getPoliticaProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getSerieProductos()!=null && Funciones.existeClass(classes,SerieProducto.class)) {
						try{producto.setserieproductosDescripcionReporte(new JRBeanCollectionDataSource(SerieProductoJInternalFrame.TraerSerieProductoBeans(producto.getSerieProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getUbicacionProdus()!=null && Funciones.existeClass(classes,UbicacionProdu.class)) {
						try{producto.setubicacionprodusDescripcionReporte(new JRBeanCollectionDataSource(UbicacionProduJInternalFrame.TraerUbicacionProduBeans(producto.getUbicacionProdus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getParametroProductos()!=null && Funciones.existeClass(classes,ParametroProducto.class)) {
						try{producto.setparametroproductosDescripcionReporte(new JRBeanCollectionDataSource(ParametroProductoJInternalFrame.TraerParametroProductoBeans(producto.getParametroProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoUnidads()!=null && Funciones.existeClass(classes,ProductoUnidad.class)) {
						try{producto.setproductounidadsDescripcionReporte(new JRBeanCollectionDataSource(ProductoUnidadJInternalFrame.TraerProductoUnidadBeans(producto.getProductoUnidads(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getIngredienteRelacions()!=null && Funciones.existeClass(classes,Ingrediente.class)) {
						try{producto.setingredienteRelacionsDescripcionReporte(new JRBeanCollectionDataSource(IngredienteJInternalFrame.TraerIngredienteBeans(producto.getIngredienteRelacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoCaracs()!=null && Funciones.existeClass(classes,ProductoCarac.class)) {
						try{producto.setproductocaracsDescripcionReporte(new JRBeanCollectionDataSource(ProductoCaracJInternalFrame.TraerProductoCaracBeans(producto.getProductoCaracs(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getServicioClientes()!=null && Funciones.existeClass(classes,ServicioCliente.class)) {
						try{producto.setservicioclientesDescripcionReporte(new JRBeanCollectionDataSource(ServicioClienteJInternalFrame.TraerServicioClienteBeans(producto.getServicioClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoPromocionRelacions()!=null && Funciones.existeClass(classes,ProductoPromocion.class)) {
						try{producto.setproductopromocionRelacionsDescripcionReporte(new JRBeanCollectionDataSource(ProductoPromocionJInternalFrame.TraerProductoPromocionBeans(producto.getProductoPromocionRelacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoEspecis()!=null && Funciones.existeClass(classes,ProductoEspeci.class)) {
						try{producto.setproductoespecisDescripcionReporte(new JRBeanCollectionDataSource(ProductoEspeciJInternalFrame.TraerProductoEspeciBeans(producto.getProductoEspecis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoReemplas()!=null && Funciones.existeClass(classes,ProductoReempla.class)) {
						try{producto.setproductoreemplasDescripcionReporte(new JRBeanCollectionDataSource(ProductoReemplaJInternalFrame.TraerProductoReemplaBeans(producto.getProductoReemplas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoEstadisticas()!=null && Funciones.existeClass(classes,ProductoEstadistica.class)) {
						try{producto.setproductoestadisticasDescripcionReporte(new JRBeanCollectionDataSource(ProductoEstadisticaJInternalFrame.TraerProductoEstadisticaBeans(producto.getProductoEstadisticas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getPoliticaFactus()!=null && Funciones.existeClass(classes,PoliticaFactu.class)) {
						try{producto.setpoliticafactusDescripcionReporte(new JRBeanCollectionDataSource(PoliticaFactuJInternalFrame.TraerPoliticaFactuBeans(producto.getPoliticaFactus(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getProductoCuentaContables()!=null && Funciones.existeClass(classes,ProductoCuentaContable.class)) {
						try{producto.setproductocuentacontablesDescripcionReporte(new JRBeanCollectionDataSource(ProductoCuentaContableJInternalFrame.TraerProductoCuentaContableBeans(producto.getProductoCuentaContables(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getBodegaProductos()!=null && Funciones.existeClass(classes,BodegaProducto.class)) {
						try{producto.setbodegaproductosDescripcionReporte(new JRBeanCollectionDataSource(BodegaProductoJInternalFrame.TraerBodegaProductoBeans(producto.getBodegaProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getPresupuestoProductos()!=null && Funciones.existeClass(classes,PresupuestoProducto.class)) {
						try{producto.setpresupuestoproductosDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoProductoJInternalFrame.TraerPresupuestoProductoBeans(producto.getPresupuestoProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(producto.getSaldoMesProductos()!=null && Funciones.existeClass(classes,SaldoMesProducto.class)) {
						try{producto.setsaldomesproductosDescripcionReporte(new JRBeanCollectionDataSource(SaldoMesProductoJInternalFrame.TraerSaldoMesProductoBeans(producto.getSaldoMesProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//producto.setsDetalleGeneralEntityReporte(producto.getsDetalleGeneralEntityReporte());
										
				}
				
				//productobeans.add(productobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return productos;
    }
	//PARA REPORTES FIN
}
